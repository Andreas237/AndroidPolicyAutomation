// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.animation.*;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModelStore;
import android.content.Context;
import android.content.res.*;
import android.os.*;
import android.support.v4.util.*;
import android.support.v4.view.ViewCompat;
import android.util.*;
import android.view.*;
import android.view.animation.*;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package android.support.v4.app:
//			FragmentManager, Fragment, FragmentHostCallback, BackStackRecord, 
//			FragmentTransition, FragmentManagerNonConfig, SuperNotCalledException, FragmentContainer, 
//			FragmentManagerState, FragmentState, BackStackState, FragmentTransaction, 
//			OneShotPreDrawListener

final class FragmentManagerImpl extends FragmentManager
	implements android.view.LayoutInflater.Factory2
{
	private static class AnimateOnHWLayerIfNeededListener extends AnimationListenerWrapper
	{

		public void onAnimationEnd(Animation animation)
		{
			if(!ViewCompat.isAttachedToWindow(mView) && android.os.Build.VERSION.SDK_INT < 24)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field View mView>
		//*   2    4:invokestatic    #28  <Method boolean ViewCompat.isAttachedToWindow(View)>
		//*   3    7:ifne            33
		//*   4   10:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
		//*   5   13:bipush          24
		//*   6   15:icmplt          21
		//*   7   18:goto            33
				mView.setLayerType(0, ((android.graphics.Paint) (null)));
		//    8   21:aload_0         
		//    9   22:getfield        #18  <Field View mView>
		//   10   25:iconst_0        
		//   11   26:aconst_null     
		//   12   27:invokevirtual   #40  <Method void View.setLayerType(int, android.graphics.Paint)>
			else
		//*  13   30:goto            49
				mView.post(new Runnable() {

					public void run()
					{
						mView.setLayerType(0, ((android.graphics.Paint) (null)));
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field FragmentManagerImpl$AnimateOnHWLayerIfNeededListener this$0>
					//    2    4:getfield        #29  <Field View FragmentManagerImpl$AnimateOnHWLayerIfNeededListener.mView>
					//    3    7:iconst_0        
					//    4    8:aconst_null     
					//    5    9:invokevirtual   #35  <Method void View.setLayerType(int, android.graphics.Paint)>
					//    6   12:return          
					}

					final AnimateOnHWLayerIfNeededListener this$0;

			
			{
				this$0 = AnimateOnHWLayerIfNeededListener.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field FragmentManagerImpl$AnimateOnHWLayerIfNeededListener this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
				}
);
		//   14   33:aload_0         
		//   15   34:getfield        #18  <Field View mView>
		//   16   37:new             #9   <Class FragmentManagerImpl$AnimateOnHWLayerIfNeededListener$1>
		//   17   40:dup             
		//   18   41:aload_0         
		//   19   42:invokespecial   #43  <Method void FragmentManagerImpl$AnimateOnHWLayerIfNeededListener$1(FragmentManagerImpl$AnimateOnHWLayerIfNeededListener)>
		//   20   45:invokevirtual   #47  <Method boolean View.post(Runnable)>
		//   21   48:pop             
			super.onAnimationEnd(animation);
		//   22   49:aload_0         
		//   23   50:aload_1         
		//   24   51:invokespecial   #49  <Method void FragmentManagerImpl$AnimationListenerWrapper.onAnimationEnd(Animation)>
		//   25   54:return          
		}

		View mView;

		AnimateOnHWLayerIfNeededListener(View view, android.view.animation.Animation.AnimationListener animationlistener)
		{
			super(animationlistener);
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:invokespecial   #16  <Method void FragmentManagerImpl$AnimationListenerWrapper(android.view.animation.Animation$AnimationListener)>
			mView = view;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:putfield        #18  <Field View mView>
		//    6   10:return          
		}
	}

	private static class AnimationListenerWrapper
		implements android.view.animation.Animation.AnimationListener
	{

		public void onAnimationEnd(Animation animation)
		{
			android.view.animation.Animation.AnimationListener animationlistener = mWrapped;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field android.view.animation.Animation$AnimationListener mWrapped>
		//    2    4:astore_2        
			if(animationlistener != null)
		//*   3    5:aload_2         
		//*   4    6:ifnull          16
				animationlistener.onAnimationEnd(animation);
		//    5    9:aload_2         
		//    6   10:aload_1         
		//    7   11:invokeinterface #24  <Method void android.view.animation.Animation$AnimationListener.onAnimationEnd(Animation)>
		//    8   16:return          
		}

		public void onAnimationRepeat(Animation animation)
		{
			android.view.animation.Animation.AnimationListener animationlistener = mWrapped;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field android.view.animation.Animation$AnimationListener mWrapped>
		//    2    4:astore_2        
			if(animationlistener != null)
		//*   3    5:aload_2         
		//*   4    6:ifnull          16
				animationlistener.onAnimationRepeat(animation);
		//    5    9:aload_2         
		//    6   10:aload_1         
		//    7   11:invokeinterface #28  <Method void android.view.animation.Animation$AnimationListener.onAnimationRepeat(Animation)>
		//    8   16:return          
		}

		public void onAnimationStart(Animation animation)
		{
			android.view.animation.Animation.AnimationListener animationlistener = mWrapped;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field android.view.animation.Animation$AnimationListener mWrapped>
		//    2    4:astore_2        
			if(animationlistener != null)
		//*   3    5:aload_2         
		//*   4    6:ifnull          16
				animationlistener.onAnimationStart(animation);
		//    5    9:aload_2         
		//    6   10:aload_1         
		//    7   11:invokeinterface #31  <Method void android.view.animation.Animation$AnimationListener.onAnimationStart(Animation)>
		//    8   16:return          
		}

		private final android.view.animation.Animation.AnimationListener mWrapped;

		AnimationListenerWrapper(android.view.animation.Animation.AnimationListener animationlistener)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			mWrapped = animationlistener;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field android.view.animation.Animation$AnimationListener mWrapped>
		//    5    9:return          
		}
	}

	private static class AnimationOrAnimator
	{

		public final Animation animation;
		public final Animator animator;

		AnimationOrAnimator(Animator animator1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			animation = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #18  <Field Animation animation>
			animator = animator1;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #20  <Field Animator animator>
			if(animator1 != null)
		//*   8   14:aload_1         
		//*   9   15:ifnull          19
				return;
		//   10   18:return          
			else
				throw new IllegalStateException("Animator cannot be null");
		//   11   19:new             #22  <Class IllegalStateException>
		//   12   22:dup             
		//   13   23:ldc1            #24  <String "Animator cannot be null">
		//   14   25:invokespecial   #27  <Method void IllegalStateException(String)>
		//   15   28:athrow          
		}

		AnimationOrAnimator(Animation animation1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			animation = animation1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field Animation animation>
			animator = null;
		//    5    9:aload_0         
		//    6   10:aconst_null     
		//    7   11:putfield        #20  <Field Animator animator>
			if(animation1 != null)
		//*   8   14:aload_1         
		//*   9   15:ifnull          19
				return;
		//   10   18:return          
			else
				throw new IllegalStateException("Animation cannot be null");
		//   11   19:new             #22  <Class IllegalStateException>
		//   12   22:dup             
		//   13   23:ldc1            #31  <String "Animation cannot be null">
		//   14   25:invokespecial   #27  <Method void IllegalStateException(String)>
		//   15   28:athrow          
		}
	}

	private static class AnimatorOnHWLayerIfNeededListener extends AnimatorListenerAdapter
	{

		public void onAnimationEnd(Animator animator)
		{
			mView.setLayerType(0, ((android.graphics.Paint) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field View mView>
		//    2    4:iconst_0        
		//    3    5:aconst_null     
		//    4    6:invokevirtual   #25  <Method void View.setLayerType(int, android.graphics.Paint)>
			animator.removeListener(((android.animation.Animator.AnimatorListener) (this)));
		//    5    9:aload_1         
		//    6   10:aload_0         
		//    7   11:invokevirtual   #31  <Method void Animator.removeListener(android.animation.Animator$AnimatorListener)>
		//    8   14:return          
		}

		public void onAnimationStart(Animator animator)
		{
			mView.setLayerType(2, ((android.graphics.Paint) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field View mView>
		//    2    4:iconst_2        
		//    3    5:aconst_null     
		//    4    6:invokevirtual   #25  <Method void View.setLayerType(int, android.graphics.Paint)>
		//    5    9:return          
		}

		View mView;

		AnimatorOnHWLayerIfNeededListener(View view)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void AnimatorListenerAdapter()>
			mView = view;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field View mView>
		//    5    9:return          
		}
	}

	private static class EndViewTransitionAnimator extends AnimationSet
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

		EndViewTransitionAnimator(Animation animation, ViewGroup viewgroup, View view)
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

	private static final class FragmentLifecycleCallbacksHolder
	{

		final FragmentManager.FragmentLifecycleCallbacks mCallback;
		final boolean mRecursive;

		FragmentLifecycleCallbacksHolder(FragmentManager.FragmentLifecycleCallbacks fragmentlifecyclecallbacks, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			mCallback = fragmentlifecyclecallbacks;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field FragmentManager$FragmentLifecycleCallbacks mCallback>
			mRecursive = flag;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #20  <Field boolean mRecursive>
		//    8   14:return          
		}
	}

	static class FragmentTag
	{

		public static final int Fragment[] = {
			0x1010003, 0x10100d0, 0x10100d1
		};

		static 
		{
		//    0    0:iconst_3        
		//    1    1:newarray        int[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:ldc1            #12  <Int 0x1010003>
		//    5    7:iastore         
		//    6    8:dup             
		//    7    9:iconst_1        
		//    8   10:ldc1            #13  <Int 0x10100d0>
		//    9   12:iastore         
		//   10   13:dup             
		//   11   14:iconst_2        
		//   12   15:ldc1            #14  <Int 0x10100d1>
		//   13   17:iastore         
		//   14   18:putstatic       #16  <Field int[] Fragment>
		//*  15   21:return          
		}
	}

	static interface OpGenerator
	{

		public abstract boolean generateOps(ArrayList arraylist, ArrayList arraylist1);
	}

	private class PopBackStackState
		implements OpGenerator
	{

		public boolean generateOps(ArrayList arraylist, ArrayList arraylist1)
		{
			if(mPrimaryNav != null && mId < 0 && mName == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #20  <Field FragmentManagerImpl this$0>
		//*   2    4:getfield        #36  <Field Fragment FragmentManagerImpl.mPrimaryNav>
		//*   3    7:ifnull          48
		//*   4   10:aload_0         
		//*   5   11:getfield        #27  <Field int mId>
		//*   6   14:ifge            48
		//*   7   17:aload_0         
		//*   8   18:getfield        #25  <Field String mName>
		//*   9   21:ifnonnull       48
			{
				FragmentManager fragmentmanager = mPrimaryNav.peekChildFragmentManager();
		//   10   24:aload_0         
		//   11   25:getfield        #20  <Field FragmentManagerImpl this$0>
		//   12   28:getfield        #36  <Field Fragment FragmentManagerImpl.mPrimaryNav>
		//   13   31:invokevirtual   #42  <Method FragmentManager Fragment.peekChildFragmentManager()>
		//   14   34:astore_3        
				if(fragmentmanager != null && fragmentmanager.popBackStackImmediate())
		//*  15   35:aload_3         
		//*  16   36:ifnull          48
		//*  17   39:aload_3         
		//*  18   40:invokevirtual   #48  <Method boolean FragmentManager.popBackStackImmediate()>
		//*  19   43:ifeq            48
					return false;
		//   20   46:iconst_0        
		//   21   47:ireturn         
			}
			return popBackStackState(arraylist, arraylist1, mName, mId, mFlags);
		//   22   48:aload_0         
		//   23   49:getfield        #20  <Field FragmentManagerImpl this$0>
		//   24   52:aload_1         
		//   25   53:aload_2         
		//   26   54:aload_0         
		//   27   55:getfield        #25  <Field String mName>
		//   28   58:aload_0         
		//   29   59:getfield        #27  <Field int mId>
		//   30   62:aload_0         
		//   31   63:getfield        #29  <Field int mFlags>
		//   32   66:invokevirtual   #52  <Method boolean FragmentManagerImpl.popBackStackState(ArrayList, ArrayList, String, int, int)>
		//   33   69:ireturn         
		}

		final int mFlags;
		final int mId;
		final String mName;
		final FragmentManagerImpl this$0;

		PopBackStackState(String s, int i, int j)
		{
			this$0 = FragmentManagerImpl.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #20  <Field FragmentManagerImpl this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #23  <Method void Object()>
			mName = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field String mName>
			mId = i;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #27  <Field int mId>
			mFlags = j;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #29  <Field int mFlags>
		//   14   25:return          
		}
	}

	static class StartEnterTransitionListener
		implements Fragment.OnStartEnterTransitionListener
	{

		public void cancelTransaction()
		{
			mRecord.mManager.completeExecute(mRecord, mIsBack, false, false);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field BackStackRecord mRecord>
		//    2    4:getfield        #32  <Field FragmentManagerImpl BackStackRecord.mManager>
		//    3    7:aload_0         
		//    4    8:getfield        #24  <Field BackStackRecord mRecord>
		//    5   11:aload_0         
		//    6   12:getfield        #22  <Field boolean mIsBack>
		//    7   15:iconst_0        
		//    8   16:iconst_0        
		//    9   17:invokevirtual   #36  <Method void FragmentManagerImpl.completeExecute(BackStackRecord, boolean, boolean, boolean)>
		//   10   20:return          
		}

		public void completeTransaction()
		{
			int i = mNumPostponed;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field int mNumPostponed>
		//    2    4:istore_1        
			int j = 0;
		//    3    5:iconst_0        
		//    4    6:istore_2        
			if(i > 0)
		//*   5    7:iload_1         
		//*   6    8:ifle            16
				i = 1;
		//    7   11:iconst_1        
		//    8   12:istore_1        
			else
		//*   9   13:goto            18
				i = 0;
		//   10   16:iconst_0        
		//   11   17:istore_1        
			FragmentManagerImpl fragmentmanagerimpl = mRecord.mManager;
		//   12   18:aload_0         
		//   13   19:getfield        #24  <Field BackStackRecord mRecord>
		//   14   22:getfield        #32  <Field FragmentManagerImpl BackStackRecord.mManager>
		//   15   25:astore          4
			for(int k = fragmentmanagerimpl.mAdded.size(); j < k; j++)
		//*  16   27:aload           4
		//*  17   29:getfield        #43  <Field ArrayList FragmentManagerImpl.mAdded>
		//*  18   32:invokevirtual   #49  <Method int ArrayList.size()>
		//*  19   35:istore_3        
		//*  20   36:iload_2         
		//*  21   37:iload_3         
		//*  22   38:icmpge          85
			{
				Fragment fragment = (Fragment)fragmentmanagerimpl.mAdded.get(j);
		//   23   41:aload           4
		//   24   43:getfield        #43  <Field ArrayList FragmentManagerImpl.mAdded>
		//   25   46:iload_2         
		//   26   47:invokevirtual   #53  <Method Object ArrayList.get(int)>
		//   27   50:checkcast       #55  <Class Fragment>
		//   28   53:astore          5
				fragment.setOnStartEnterTransitionListener(((Fragment.OnStartEnterTransitionListener) (null)));
		//   29   55:aload           5
		//   30   57:aconst_null     
		//   31   58:invokevirtual   #59  <Method void Fragment.setOnStartEnterTransitionListener(Fragment$OnStartEnterTransitionListener)>
				if(i && fragment.isPostponed())
		//*  32   61:iload_1         
		//*  33   62:ifeq            78
		//*  34   65:aload           5
		//*  35   67:invokevirtual   #63  <Method boolean Fragment.isPostponed()>
		//*  36   70:ifeq            78
					fragment.startPostponedEnterTransition();
		//   37   73:aload           5
		//   38   75:invokevirtual   #66  <Method void Fragment.startPostponedEnterTransition()>
			}

		//   39   78:iload_2         
		//   40   79:iconst_1        
		//   41   80:iadd            
		//   42   81:istore_2        
		//*  43   82:goto            36
			mRecord.mManager.completeExecute(mRecord, mIsBack, i ^ true, true);
		//   44   85:aload_0         
		//   45   86:getfield        #24  <Field BackStackRecord mRecord>
		//   46   89:getfield        #32  <Field FragmentManagerImpl BackStackRecord.mManager>
		//   47   92:aload_0         
		//   48   93:getfield        #24  <Field BackStackRecord mRecord>
		//   49   96:aload_0         
		//   50   97:getfield        #22  <Field boolean mIsBack>
		//   51  100:iload_1         
		//   52  101:iconst_1        
		//   53  102:ixor            
		//   54  103:iconst_1        
		//   55  104:invokevirtual   #36  <Method void FragmentManagerImpl.completeExecute(BackStackRecord, boolean, boolean, boolean)>
		//   56  107:return          
		}

		public boolean isReady()
		{
			return mNumPostponed == 0;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field int mNumPostponed>
		//    2    4:ifne            9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		public void onStartEnterTransition()
		{
			mNumPostponed = mNumPostponed - 1;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #39  <Field int mNumPostponed>
		//    3    5:iconst_1        
		//    4    6:isub            
		//    5    7:putfield        #39  <Field int mNumPostponed>
			if(mNumPostponed != 0)
		//*   6   10:aload_0         
		//*   7   11:getfield        #39  <Field int mNumPostponed>
		//*   8   14:ifeq            18
			{
				return;
		//    9   17:return          
			} else
			{
				mRecord.mManager.scheduleCommit();
		//   10   18:aload_0         
		//   11   19:getfield        #24  <Field BackStackRecord mRecord>
		//   12   22:getfield        #32  <Field FragmentManagerImpl BackStackRecord.mManager>
		//   13   25:invokevirtual   #71  <Method void FragmentManagerImpl.scheduleCommit()>
				return;
		//   14   28:return          
			}
		}

		public void startListening()
		{
			mNumPostponed = mNumPostponed + 1;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #39  <Field int mNumPostponed>
		//    3    5:iconst_1        
		//    4    6:iadd            
		//    5    7:putfield        #39  <Field int mNumPostponed>
		//    6   10:return          
		}

		final boolean mIsBack;
		private int mNumPostponed;
		final BackStackRecord mRecord;

		StartEnterTransitionListener(BackStackRecord backstackrecord, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			mIsBack = flag;
		//    2    4:aload_0         
		//    3    5:iload_2         
		//    4    6:putfield        #22  <Field boolean mIsBack>
			mRecord = backstackrecord;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #24  <Field BackStackRecord mRecord>
		//    8   14:return          
		}
	}


	FragmentManagerImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #134 <Method void FragmentManager()>
		mNextFragmentIndex = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #136 <Field int mNextFragmentIndex>
	//    5    9:aload_0         
	//    6   10:new             #138 <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #139 <Method void ArrayList()>
	//    9   17:putfield        #141 <Field ArrayList mAdded>
	//   10   20:aload_0         
	//   11   21:new             #143 <Class CopyOnWriteArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #144 <Method void CopyOnWriteArrayList()>
	//   14   28:putfield        #146 <Field CopyOnWriteArrayList mLifecycleCallbacks>
		mCurState = 0;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #148 <Field int mCurState>
		mStateBundle = null;
	//   18   36:aload_0         
	//   19   37:aconst_null     
	//   20   38:putfield        #150 <Field Bundle mStateBundle>
		mStateArray = null;
	//   21   41:aload_0         
	//   22   42:aconst_null     
	//   23   43:putfield        #152 <Field SparseArray mStateArray>
		mExecCommit = new Runnable() {

			public void run()
			{
				execPendingActions();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field FragmentManagerImpl this$0>
			//    2    4:invokevirtual   #23  <Method boolean FragmentManagerImpl.execPendingActions()>
			//    3    7:pop             
			//    4    8:return          
			}

			final FragmentManagerImpl this$0;

			
			{
				this$0 = FragmentManagerImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field FragmentManagerImpl this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   24   46:aload_0         
	//   25   47:new             #8   <Class FragmentManagerImpl$1>
	//   26   50:dup             
	//   27   51:aload_0         
	//   28   52:invokespecial   #155 <Method void FragmentManagerImpl$1(FragmentManagerImpl)>
	//   29   55:putfield        #157 <Field Runnable mExecCommit>
	//   30   58:return          
	}

	private void addAddedFragments(ArraySet arrayset)
	{
		int i = mCurState;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field int mCurState>
	//    2    4:istore_2        
		if(i < 1)
	//*   3    5:iload_2         
	//*   4    6:iconst_1        
	//*   5    7:icmpge          11
			return;
	//    6   10:return          
		int k = Math.min(i, 3);
	//    7   11:iload_2         
	//    8   12:iconst_3        
	//    9   13:invokestatic    #165 <Method int Math.min(int, int)>
	//   10   16:istore_3        
		int l = mAdded.size();
	//   11   17:aload_0         
	//   12   18:getfield        #141 <Field ArrayList mAdded>
	//   13   21:invokevirtual   #169 <Method int ArrayList.size()>
	//   14   24:istore          4
		for(int j = 0; j < l; j++)
	//*  15   26:iconst_0        
	//*  16   27:istore_2        
	//*  17   28:iload_2         
	//*  18   29:iload           4
	//*  19   31:icmpge          112
		{
			Fragment fragment = (Fragment)mAdded.get(j);
	//   20   34:aload_0         
	//   21   35:getfield        #141 <Field ArrayList mAdded>
	//   22   38:iload_2         
	//   23   39:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//   24   42:checkcast       #175 <Class Fragment>
	//   25   45:astore          5
			if(fragment.mState >= k)
				continue;
	//   26   47:aload           5
	//   27   49:getfield        #178 <Field int Fragment.mState>
	//   28   52:iload_3         
	//   29   53:icmpge          105
			moveToState(fragment, k, fragment.getNextAnim(), fragment.getNextTransition(), false);
	//   30   56:aload_0         
	//   31   57:aload           5
	//   32   59:iload_3         
	//   33   60:aload           5
	//   34   62:invokevirtual   #181 <Method int Fragment.getNextAnim()>
	//   35   65:aload           5
	//   36   67:invokevirtual   #184 <Method int Fragment.getNextTransition()>
	//   37   70:iconst_0        
	//   38   71:invokevirtual   #188 <Method void moveToState(Fragment, int, int, int, boolean)>
			if(fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded)
	//*  39   74:aload           5
	//*  40   76:getfield        #192 <Field View Fragment.mView>
	//*  41   79:ifnull          105
	//*  42   82:aload           5
	//*  43   84:getfield        #195 <Field boolean Fragment.mHidden>
	//*  44   87:ifne            105
	//*  45   90:aload           5
	//*  46   92:getfield        #198 <Field boolean Fragment.mIsNewlyAdded>
	//*  47   95:ifeq            105
				arrayset.add(((Object) (fragment)));
	//   48   98:aload_1         
	//   49   99:aload           5
	//   50  101:invokevirtual   #204 <Method boolean ArraySet.add(Object)>
	//   51  104:pop             
		}

	//   52  105:iload_2         
	//   53  106:iconst_1        
	//   54  107:iadd            
	//   55  108:istore_2        
	//*  56  109:goto            28
	//   57  112:return          
	}

	private void animateRemoveFragment(final Fragment fragment, AnimationOrAnimator animationoranimator, int i)
	{
		final View viewToAnimate = fragment.mView;
	//    0    0:aload_1         
	//    1    1:getfield        #192 <Field View Fragment.mView>
	//    2    4:astore          4
		final ViewGroup container = fragment.mContainer;
	//    3    6:aload_1         
	//    4    7:getfield        #212 <Field ViewGroup Fragment.mContainer>
	//    5   10:astore          5
		container.startViewTransition(viewToAnimate);
	//    6   12:aload           5
	//    7   14:aload           4
	//    8   16:invokevirtual   #218 <Method void ViewGroup.startViewTransition(View)>
		fragment.setStateAfterAnimating(i);
	//    9   19:aload_1         
	//   10   20:iload_3         
	//   11   21:invokevirtual   #222 <Method void Fragment.setStateAfterAnimating(int)>
		if(animationoranimator.animation != null)
	//*  12   24:aload_2         
	//*  13   25:getfield        #226 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//*  14   28:ifnull          93
		{
			EndViewTransitionAnimator endviewtransitionanimator = new EndViewTransitionAnimator(animationoranimator.animation, container, viewToAnimate);
	//   15   31:new             #32  <Class FragmentManagerImpl$EndViewTransitionAnimator>
	//   16   34:dup             
	//   17   35:aload_2         
	//   18   36:getfield        #226 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   19   39:aload           5
	//   20   41:aload           4
	//   21   43:invokespecial   #229 <Method void FragmentManagerImpl$EndViewTransitionAnimator(Animation, ViewGroup, View)>
	//   22   46:astore          6
			fragment.setAnimatingAway(fragment.mView);
	//   23   48:aload_1         
	//   24   49:aload_1         
	//   25   50:getfield        #192 <Field View Fragment.mView>
	//   26   53:invokevirtual   #232 <Method void Fragment.setAnimatingAway(View)>
			((Animation) (endviewtransitionanimator)).setAnimationListener(((android.view.animation.Animation.AnimationListener) (new AnimationListenerWrapper(fragment) {

				public void onAnimationEnd(Animation animation)
				{
					super.onAnimationEnd(animation);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:invokespecial   #33  <Method void FragmentManagerImpl$AnimationListenerWrapper.onAnimationEnd(Animation)>
					container.post(new Runnable() {

						public void run()
						{
							if(fragment.getAnimatingAway() != null)
						//*   0    0:aload_0         
						//*   1    1:getfield        #17  <Field FragmentManagerImpl$2 this$1>
						//*   2    4:getfield        #26  <Field Fragment FragmentManagerImpl$2.val$fragment>
						//*   3    7:invokevirtual   #32  <Method View Fragment.getAnimatingAway()>
						//*   4   10:ifnull          54
							{
								fragment.setAnimatingAway(((View) (null)));
						//    5   13:aload_0         
						//    6   14:getfield        #17  <Field FragmentManagerImpl$2 this$1>
						//    7   17:getfield        #26  <Field Fragment FragmentManagerImpl$2.val$fragment>
						//    8   20:aconst_null     
						//    9   21:invokevirtual   #36  <Method void Fragment.setAnimatingAway(View)>
								moveToState(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
						//   10   24:aload_0         
						//   11   25:getfield        #17  <Field FragmentManagerImpl$2 this$1>
						//   12   28:getfield        #40  <Field FragmentManagerImpl FragmentManagerImpl$2.this$0>
						//   13   31:aload_0         
						//   14   32:getfield        #17  <Field FragmentManagerImpl$2 this$1>
						//   15   35:getfield        #26  <Field Fragment FragmentManagerImpl$2.val$fragment>
						//   16   38:aload_0         
						//   17   39:getfield        #17  <Field FragmentManagerImpl$2 this$1>
						//   18   42:getfield        #26  <Field Fragment FragmentManagerImpl$2.val$fragment>
						//   19   45:invokevirtual   #44  <Method int Fragment.getStateAfterAnimating()>
						//   20   48:iconst_0        
						//   21   49:iconst_0        
						//   22   50:iconst_0        
						//   23   51:invokevirtual   #50  <Method void FragmentManagerImpl.moveToState(Fragment, int, int, int, boolean)>
							}
						//   24   54:return          
						}

						final _cls2 this$1;

			
			{
				this$1 = _cls2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field FragmentManagerImpl$2 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
					}
);
				//    3    5:aload_0         
				//    4    6:getfield        #23  <Field ViewGroup val$container>
				//    5    9:new             #11  <Class FragmentManagerImpl$2$1>
				//    6   12:dup             
				//    7   13:aload_0         
				//    8   14:invokespecial   #36  <Method void FragmentManagerImpl$2$1(FragmentManagerImpl$2)>
				//    9   17:invokevirtual   #42  <Method boolean ViewGroup.post(Runnable)>
				//   10   20:pop             
				//   11   21:return          
				}

				final FragmentManagerImpl this$0;
				final ViewGroup val$container;
				final Fragment val$fragment;

			
			{
				this$0 = FragmentManagerImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field FragmentManagerImpl this$0>
				container = viewgroup;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #23  <Field ViewGroup val$container>
				fragment = fragment1;
			//    6   10:aload_0         
			//    7   11:aload           4
			//    8   13:putfield        #25  <Field Fragment val$fragment>
				super(final_animationlistener);
			//    9   16:aload_0         
			//   10   17:aload_2         
			//   11   18:invokespecial   #28  <Method void FragmentManagerImpl$AnimationListenerWrapper(android.view.animation.Animation$AnimationListener)>
			//   12   21:return          
			}
			}
)));
	//   27   56:aload           6
	//   28   58:new             #10  <Class FragmentManagerImpl$2>
	//   29   61:dup             
	//   30   62:aload_0         
	//   31   63:aload           6
	//   32   65:invokestatic    #236 <Method android.view.animation.Animation$AnimationListener getAnimationListener(Animation)>
	//   33   68:aload           5
	//   34   70:aload_1         
	//   35   71:invokespecial   #239 <Method void FragmentManagerImpl$2(FragmentManagerImpl, android.view.animation.Animation$AnimationListener, ViewGroup, Fragment)>
	//   36   74:invokevirtual   #245 <Method void Animation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
			setHWLayerAnimListenerIfAlpha(viewToAnimate, animationoranimator);
	//   37   77:aload           4
	//   38   79:aload_2         
	//   39   80:invokestatic    #249 <Method void setHWLayerAnimListenerIfAlpha(View, FragmentManagerImpl$AnimationOrAnimator)>
			fragment.mView.startAnimation(((Animation) (endviewtransitionanimator)));
	//   40   83:aload_1         
	//   41   84:getfield        #192 <Field View Fragment.mView>
	//   42   87:aload           6
	//   43   89:invokevirtual   #255 <Method void View.startAnimation(Animation)>
			return;
	//   44   92:return          
		} else
		{
			Animator animator = animationoranimator.animator;
	//   45   93:aload_2         
	//   46   94:getfield        #259 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   47   97:astore          6
			fragment.setAnimator(animationoranimator.animator);
	//   48   99:aload_1         
	//   49  100:aload_2         
	//   50  101:getfield        #259 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   51  104:invokevirtual   #263 <Method void Fragment.setAnimator(Animator)>
			animator.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

				public void onAnimationEnd(Animator animator1)
				{
					container.endViewTransition(viewToAnimate);
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field ViewGroup val$container>
				//    2    4:aload_0         
				//    3    5:getfield        #25  <Field View val$viewToAnimate>
				//    4    8:invokevirtual   #39  <Method void ViewGroup.endViewTransition(View)>
					animator1 = fragment.getAnimator();
				//    5   11:aload_0         
				//    6   12:getfield        #27  <Field Fragment val$fragment>
				//    7   15:invokevirtual   #45  <Method Animator Fragment.getAnimator()>
				//    8   18:astore_1        
					fragment.setAnimator(((Animator) (null)));
				//    9   19:aload_0         
				//   10   20:getfield        #27  <Field Fragment val$fragment>
				//   11   23:aconst_null     
				//   12   24:invokevirtual   #48  <Method void Fragment.setAnimator(Animator)>
					if(animator1 != null && container.indexOfChild(viewToAnimate) < 0)
				//*  13   27:aload_1         
				//*  14   28:ifnull          67
				//*  15   31:aload_0         
				//*  16   32:getfield        #23  <Field ViewGroup val$container>
				//*  17   35:aload_0         
				//*  18   36:getfield        #25  <Field View val$viewToAnimate>
				//*  19   39:invokevirtual   #52  <Method int ViewGroup.indexOfChild(View)>
				//*  20   42:ifge            67
					{
						animator1 = ((Animator) (FragmentManagerImpl.this));
				//   21   45:aload_0         
				//   22   46:getfield        #21  <Field FragmentManagerImpl this$0>
				//   23   49:astore_1        
						Fragment fragment1 = fragment;
				//   24   50:aload_0         
				//   25   51:getfield        #27  <Field Fragment val$fragment>
				//   26   54:astore_2        
						((FragmentManagerImpl) (animator1)).moveToState(fragment1, fragment1.getStateAfterAnimating(), 0, 0, false);
				//   27   55:aload_1         
				//   28   56:aload_2         
				//   29   57:aload_2         
				//   30   58:invokevirtual   #56  <Method int Fragment.getStateAfterAnimating()>
				//   31   61:iconst_0        
				//   32   62:iconst_0        
				//   33   63:iconst_0        
				//   34   64:invokevirtual   #60  <Method void FragmentManagerImpl.moveToState(Fragment, int, int, int, boolean)>
					}
				//   35   67:return          
				}

				final FragmentManagerImpl this$0;
				final ViewGroup val$container;
				final Fragment val$fragment;
				final View val$viewToAnimate;

			
			{
				this$0 = FragmentManagerImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field FragmentManagerImpl this$0>
				container = viewgroup;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field ViewGroup val$container>
				viewToAnimate = view;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field View val$viewToAnimate>
				fragment = fragment1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #27  <Field Fragment val$fragment>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #30  <Method void AnimatorListenerAdapter()>
			//   14   25:return          
			}
			}
)));
	//   52  107:aload           6
	//   53  109:new             #14  <Class FragmentManagerImpl$3>
	//   54  112:dup             
	//   55  113:aload_0         
	//   56  114:aload           5
	//   57  116:aload           4
	//   58  118:aload_1         
	//   59  119:invokespecial   #266 <Method void FragmentManagerImpl$3(FragmentManagerImpl, ViewGroup, View, Fragment)>
	//   60  122:invokevirtual   #272 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
			animator.setTarget(((Object) (fragment.mView)));
	//   61  125:aload           6
	//   62  127:aload_1         
	//   63  128:getfield        #192 <Field View Fragment.mView>
	//   64  131:invokevirtual   #276 <Method void Animator.setTarget(Object)>
			setHWLayerAnimListenerIfAlpha(fragment.mView, animationoranimator);
	//   65  134:aload_1         
	//   66  135:getfield        #192 <Field View Fragment.mView>
	//   67  138:aload_2         
	//   68  139:invokestatic    #249 <Method void setHWLayerAnimListenerIfAlpha(View, FragmentManagerImpl$AnimationOrAnimator)>
			animator.start();
	//   69  142:aload           6
	//   70  144:invokevirtual   #279 <Method void Animator.start()>
			return;
	//   71  147:return          
		}
	}

	private void burpActive()
	{
		SparseArray sparsearray = mActive;
	//    0    0:aload_0         
	//    1    1:getfield        #283 <Field SparseArray mActive>
	//    2    4:astore_2        
		if(sparsearray != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          52
		{
			for(int i = sparsearray.size() - 1; i >= 0; i--)
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #286 <Method int SparseArray.size()>
	//*   7   13:iconst_1        
	//*   8   14:isub            
	//*   9   15:istore_1        
	//*  10   16:iload_1         
	//*  11   17:iflt            52
				if(mActive.valueAt(i) == null)
	//*  12   20:aload_0         
	//*  13   21:getfield        #283 <Field SparseArray mActive>
	//*  14   24:iload_1         
	//*  15   25:invokevirtual   #289 <Method Object SparseArray.valueAt(int)>
	//*  16   28:ifnonnull       45
				{
					SparseArray sparsearray1 = mActive;
	//   17   31:aload_0         
	//   18   32:getfield        #283 <Field SparseArray mActive>
	//   19   35:astore_2        
					sparsearray1.delete(sparsearray1.keyAt(i));
	//   20   36:aload_2         
	//   21   37:aload_2         
	//   22   38:iload_1         
	//   23   39:invokevirtual   #293 <Method int SparseArray.keyAt(int)>
	//   24   42:invokevirtual   #296 <Method void SparseArray.delete(int)>
				}

	//   25   45:iload_1         
	//   26   46:iconst_1        
	//   27   47:isub            
	//   28   48:istore_1        
		}
	//*  29   49:goto            16
	//   30   52:return          
	}

	private void checkStateLoss()
	{
		if(!isStateSaved())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #301 <Method boolean isStateSaved()>
	//*   2    4:ifne            52
		{
			if(mNoTransactionsBecause == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #303 <Field String mNoTransactionsBecause>
	//*   5   11:ifnonnull       15
			{
				return;
	//    6   14:return          
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    7   15:new             #305 <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #306 <Method void StringBuilder()>
	//   10   22:astore_1        
				stringbuilder.append("Can not perform this action inside of ");
	//   11   23:aload_1         
	//   12   24:ldc2            #308 <String "Can not perform this action inside of ">
	//   13   27:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
				stringbuilder.append(mNoTransactionsBecause);
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #303 <Field String mNoTransactionsBecause>
	//   18   36:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
				throw new IllegalStateException(stringbuilder.toString());
	//   20   40:new             #314 <Class IllegalStateException>
	//   21   43:dup             
	//   22   44:aload_1         
	//   23   45:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   24   48:invokespecial   #321 <Method void IllegalStateException(String)>
	//   25   51:athrow          
			}
		} else
		{
			throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
	//   26   52:new             #314 <Class IllegalStateException>
	//   27   55:dup             
	//   28   56:ldc2            #323 <String "Can not perform this action after onSaveInstanceState">
	//   29   59:invokespecial   #321 <Method void IllegalStateException(String)>
	//   30   62:athrow          
		}
	}

	private void cleanupExec()
	{
		mExecutingActions = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #326 <Field boolean mExecutingActions>
		mTmpIsPop.clear();
	//    3    5:aload_0         
	//    4    6:getfield        #328 <Field ArrayList mTmpIsPop>
	//    5    9:invokevirtual   #331 <Method void ArrayList.clear()>
		mTmpRecords.clear();
	//    6   12:aload_0         
	//    7   13:getfield        #333 <Field ArrayList mTmpRecords>
	//    8   16:invokevirtual   #331 <Method void ArrayList.clear()>
	//    9   19:return          
	}

	private void dispatchStateChange(int i)
	{
		mExecutingActions = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #326 <Field boolean mExecutingActions>
		moveToState(i, false);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #337 <Method void moveToState(int, boolean)>
		mExecutingActions = false;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #326 <Field boolean mExecutingActions>
		execPendingActions();
	//   10   16:aload_0         
	//   11   17:invokevirtual   #340 <Method boolean execPendingActions()>
	//   12   20:pop             
		return;
	//   13   21:return          
		Exception exception;
		exception;
	//   14   22:astore_2        
		mExecutingActions = false;
	//   15   23:aload_0         
	//   16   24:iconst_0        
	//   17   25:putfield        #326 <Field boolean mExecutingActions>
		throw exception;
	//   18   28:aload_2         
	//   19   29:athrow          
	}

	private void endAnimatingAwayFragments()
	{
		SparseArray sparsearray = mActive;
	//    0    0:aload_0         
	//    1    1:getfield        #283 <Field SparseArray mActive>
	//    2    4:astore          4
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		int i;
		if(sparsearray == null)
	//*   5    8:aload           4
	//*   6   10:ifnonnull       18
			i = 0;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		else
	//*   9   15:goto            24
			i = sparsearray.size();
	//   10   18:aload           4
	//   11   20:invokevirtual   #286 <Method int SparseArray.size()>
	//   12   23:istore_1        
		for(; j < i; j++)
	//*  13   24:iload_2         
	//*  14   25:iload_1         
	//*  15   26:icmpge          132
		{
			Fragment fragment = (Fragment)mActive.valueAt(j);
	//   16   29:aload_0         
	//   17   30:getfield        #283 <Field SparseArray mActive>
	//   18   33:iload_2         
	//   19   34:invokevirtual   #289 <Method Object SparseArray.valueAt(int)>
	//   20   37:checkcast       #175 <Class Fragment>
	//   21   40:astore          4
			if(fragment == null)
				continue;
	//   22   42:aload           4
	//   23   44:ifnull          125
			if(fragment.getAnimatingAway() != null)
	//*  24   47:aload           4
	//*  25   49:invokevirtual   #345 <Method View Fragment.getAnimatingAway()>
	//*  26   52:ifnull          109
			{
				int k = fragment.getStateAfterAnimating();
	//   27   55:aload           4
	//   28   57:invokevirtual   #348 <Method int Fragment.getStateAfterAnimating()>
	//   29   60:istore_3        
				View view = fragment.getAnimatingAway();
	//   30   61:aload           4
	//   31   63:invokevirtual   #345 <Method View Fragment.getAnimatingAway()>
	//   32   66:astore          5
				Animation animation = view.getAnimation();
	//   33   68:aload           5
	//   34   70:invokevirtual   #352 <Method Animation View.getAnimation()>
	//   35   73:astore          6
				if(animation != null)
	//*  36   75:aload           6
	//*  37   77:ifnull          90
				{
					animation.cancel();
	//   38   80:aload           6
	//   39   82:invokevirtual   #355 <Method void Animation.cancel()>
					view.clearAnimation();
	//   40   85:aload           5
	//   41   87:invokevirtual   #358 <Method void View.clearAnimation()>
				}
				fragment.setAnimatingAway(((View) (null)));
	//   42   90:aload           4
	//   43   92:aconst_null     
	//   44   93:invokevirtual   #232 <Method void Fragment.setAnimatingAway(View)>
				moveToState(fragment, k, 0, 0, false);
	//   45   96:aload_0         
	//   46   97:aload           4
	//   47   99:iload_3         
	//   48  100:iconst_0        
	//   49  101:iconst_0        
	//   50  102:iconst_0        
	//   51  103:invokevirtual   #188 <Method void moveToState(Fragment, int, int, int, boolean)>
				continue;
	//   52  106:goto            125
			}
			if(fragment.getAnimator() != null)
	//*  53  109:aload           4
	//*  54  111:invokevirtual   #362 <Method Animator Fragment.getAnimator()>
	//*  55  114:ifnull          125
				fragment.getAnimator().end();
	//   56  117:aload           4
	//   57  119:invokevirtual   #362 <Method Animator Fragment.getAnimator()>
	//   58  122:invokevirtual   #365 <Method void Animator.end()>
		}

	//   59  125:iload_2         
	//   60  126:iconst_1        
	//   61  127:iadd            
	//   62  128:istore_2        
	//*  63  129:goto            24
	//   64  132:return          
	}

	private void ensureExecReady(boolean flag)
	{
		if(mExecutingActions)
			break MISSING_BLOCK_LABEL_114;
	//    0    0:aload_0         
	//    1    1:getfield        #326 <Field boolean mExecutingActions>
	//    2    4:ifne            114
		if(mHost == null)
			break MISSING_BLOCK_LABEL_103;
	//    3    7:aload_0         
	//    4    8:getfield        #369 <Field FragmentHostCallback mHost>
	//    5   11:ifnull          103
		if(Looper.myLooper() != mHost.getHandler().getLooper())
			break MISSING_BLOCK_LABEL_92;
	//    6   14:invokestatic    #375 <Method Looper Looper.myLooper()>
	//    7   17:aload_0         
	//    8   18:getfield        #369 <Field FragmentHostCallback mHost>
	//    9   21:invokevirtual   #381 <Method Handler FragmentHostCallback.getHandler()>
	//   10   24:invokevirtual   #386 <Method Looper Handler.getLooper()>
	//   11   27:if_acmpne       92
		if(!flag)
	//*  12   30:iload_1         
	//*  13   31:ifne            38
			checkStateLoss();
	//   14   34:aload_0         
	//   15   35:invokespecial   #388 <Method void checkStateLoss()>
		if(mTmpRecords == null)
	//*  16   38:aload_0         
	//*  17   39:getfield        #333 <Field ArrayList mTmpRecords>
	//*  18   42:ifnonnull       67
		{
			mTmpRecords = new ArrayList();
	//   19   45:aload_0         
	//   20   46:new             #138 <Class ArrayList>
	//   21   49:dup             
	//   22   50:invokespecial   #139 <Method void ArrayList()>
	//   23   53:putfield        #333 <Field ArrayList mTmpRecords>
			mTmpIsPop = new ArrayList();
	//   24   56:aload_0         
	//   25   57:new             #138 <Class ArrayList>
	//   26   60:dup             
	//   27   61:invokespecial   #139 <Method void ArrayList()>
	//   28   64:putfield        #328 <Field ArrayList mTmpIsPop>
		}
		mExecutingActions = true;
	//   29   67:aload_0         
	//   30   68:iconst_1        
	//   31   69:putfield        #326 <Field boolean mExecutingActions>
		executePostponedTransaction(((ArrayList) (null)), ((ArrayList) (null)));
	//   32   72:aload_0         
	//   33   73:aconst_null     
	//   34   74:aconst_null     
	//   35   75:invokespecial   #392 <Method void executePostponedTransaction(ArrayList, ArrayList)>
		mExecutingActions = false;
	//   36   78:aload_0         
	//   37   79:iconst_0        
	//   38   80:putfield        #326 <Field boolean mExecutingActions>
		return;
	//   39   83:return          
		Exception exception;
		exception;
	//   40   84:astore_2        
		mExecutingActions = false;
	//   41   85:aload_0         
	//   42   86:iconst_0        
	//   43   87:putfield        #326 <Field boolean mExecutingActions>
		throw exception;
	//   44   90:aload_2         
	//   45   91:athrow          
		throw new IllegalStateException("Must be called from main thread of fragment host");
	//   46   92:new             #314 <Class IllegalStateException>
	//   47   95:dup             
	//   48   96:ldc2            #394 <String "Must be called from main thread of fragment host">
	//   49   99:invokespecial   #321 <Method void IllegalStateException(String)>
	//   50  102:athrow          
		throw new IllegalStateException("Fragment host has been destroyed");
	//   51  103:new             #314 <Class IllegalStateException>
	//   52  106:dup             
	//   53  107:ldc2            #396 <String "Fragment host has been destroyed">
	//   54  110:invokespecial   #321 <Method void IllegalStateException(String)>
	//   55  113:athrow          
		throw new IllegalStateException("FragmentManager is already executing transactions");
	//   56  114:new             #314 <Class IllegalStateException>
	//   57  117:dup             
	//   58  118:ldc2            #398 <String "FragmentManager is already executing transactions">
	//   59  121:invokespecial   #321 <Method void IllegalStateException(String)>
	//   60  124:athrow          
	}

	private static void executeOps(ArrayList arraylist, ArrayList arraylist1, int i, int j)
	{
		for(; i < j; i++)
	//*   0    0:iload_2         
	//*   1    1:iload_3         
	//*   2    2:icmpge          83
		{
			BackStackRecord backstackrecord = (BackStackRecord)arraylist.get(i);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//    6   10:checkcast       #402 <Class BackStackRecord>
	//    7   13:astore          6
			boolean flag1 = ((Boolean)arraylist1.get(i)).booleanValue();
	//    8   15:aload_1         
	//    9   16:iload_2         
	//   10   17:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//   11   20:checkcast       #404 <Class Boolean>
	//   12   23:invokevirtual   #407 <Method boolean Boolean.booleanValue()>
	//   13   26:istore          5
			boolean flag = true;
	//   14   28:iconst_1        
	//   15   29:istore          4
			if(flag1)
	//*  16   31:iload           5
	//*  17   33:ifeq            65
			{
				backstackrecord.bumpBackStackNesting(-1);
	//   18   36:aload           6
	//   19   38:iconst_m1       
	//   20   39:invokevirtual   #410 <Method void BackStackRecord.bumpBackStackNesting(int)>
				if(i != j - 1)
	//*  21   42:iload_2         
	//*  22   43:iload_3         
	//*  23   44:iconst_1        
	//*  24   45:isub            
	//*  25   46:icmpne          52
	//*  26   49:goto            55
					flag = false;
	//   27   52:iconst_0        
	//   28   53:istore          4
				backstackrecord.executePopOps(flag);
	//   29   55:aload           6
	//   30   57:iload           4
	//   31   59:invokevirtual   #413 <Method void BackStackRecord.executePopOps(boolean)>
			} else
	//*  32   62:goto            76
			{
				backstackrecord.bumpBackStackNesting(1);
	//   33   65:aload           6
	//   34   67:iconst_1        
	//   35   68:invokevirtual   #410 <Method void BackStackRecord.bumpBackStackNesting(int)>
				backstackrecord.executeOps();
	//   36   71:aload           6
	//   37   73:invokevirtual   #415 <Method void BackStackRecord.executeOps()>
			}
		}

	//   38   76:iload_2         
	//   39   77:iconst_1        
	//   40   78:iadd            
	//   41   79:istore_2        
	//*  42   80:goto            0
	//   43   83:return          
	}

	private void executeOpsTogether(ArrayList arraylist, ArrayList arraylist1, int i, int j)
	{
		int k = i;
	//    0    0:iload_3         
	//    1    1:istore          5
		boolean flag1 = ((BackStackRecord)arraylist.get(k)).mReorderingAllowed;
	//    2    3:aload_1         
	//    3    4:iload           5
	//    4    6:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//    5    9:checkcast       #402 <Class BackStackRecord>
	//    6   12:getfield        #420 <Field boolean BackStackRecord.mReorderingAllowed>
	//    7   15:istore          9
		Object obj = ((Object) (mTmpAddedFragments));
	//    8   17:aload_0         
	//    9   18:getfield        #422 <Field ArrayList mTmpAddedFragments>
	//   10   21:astore          10
		if(obj == null)
	//*  11   23:aload           10
	//*  12   25:ifnonnull       42
			mTmpAddedFragments = new ArrayList();
	//   13   28:aload_0         
	//   14   29:new             #138 <Class ArrayList>
	//   15   32:dup             
	//   16   33:invokespecial   #139 <Method void ArrayList()>
	//   17   36:putfield        #422 <Field ArrayList mTmpAddedFragments>
		else
	//*  18   39:goto            47
			((ArrayList) (obj)).clear();
	//   19   42:aload           10
	//   20   44:invokevirtual   #331 <Method void ArrayList.clear()>
		mTmpAddedFragments.addAll(((java.util.Collection) (mAdded)));
	//   21   47:aload_0         
	//   22   48:getfield        #422 <Field ArrayList mTmpAddedFragments>
	//   23   51:aload_0         
	//   24   52:getfield        #141 <Field ArrayList mAdded>
	//   25   55:invokevirtual   #426 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   26   58:pop             
		obj = ((Object) (getPrimaryNavigationFragment()));
	//   27   59:aload_0         
	//   28   60:invokevirtual   #430 <Method Fragment getPrimaryNavigationFragment()>
	//   29   63:astore          10
		int l = k;
	//   30   65:iload           5
	//   31   67:istore          7
		boolean flag = false;
	//   32   69:iconst_0        
	//   33   70:istore          6
		for(; l < j; l++)
	//*  34   72:iload           7
	//*  35   74:iload           4
	//*  36   76:icmpge          168
		{
			BackStackRecord backstackrecord1 = (BackStackRecord)arraylist.get(l);
	//   37   79:aload_1         
	//   38   80:iload           7
	//   39   82:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//   40   85:checkcast       #402 <Class BackStackRecord>
	//   41   88:astore          11
			if(!((Boolean)arraylist1.get(l)).booleanValue())
	//*  42   90:aload_2         
	//*  43   91:iload           7
	//*  44   93:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//*  45   96:checkcast       #404 <Class Boolean>
	//*  46   99:invokevirtual   #407 <Method boolean Boolean.booleanValue()>
	//*  47  102:ifne            121
				obj = ((Object) (backstackrecord1.expandOps(mTmpAddedFragments, ((Fragment) (obj)))));
	//   48  105:aload           11
	//   49  107:aload_0         
	//   50  108:getfield        #422 <Field ArrayList mTmpAddedFragments>
	//   51  111:aload           10
	//   52  113:invokevirtual   #434 <Method Fragment BackStackRecord.expandOps(ArrayList, Fragment)>
	//   53  116:astore          10
			else
	//*  54  118:goto            134
				obj = ((Object) (backstackrecord1.trackAddedFragmentsInPop(mTmpAddedFragments, ((Fragment) (obj)))));
	//   55  121:aload           11
	//   56  123:aload_0         
	//   57  124:getfield        #422 <Field ArrayList mTmpAddedFragments>
	//   58  127:aload           10
	//   59  129:invokevirtual   #437 <Method Fragment BackStackRecord.trackAddedFragmentsInPop(ArrayList, Fragment)>
	//   60  132:astore          10
			if(!flag && !backstackrecord1.mAddToBackStack)
	//*  61  134:iload           6
	//*  62  136:ifne            156
	//*  63  139:aload           11
	//*  64  141:getfield        #440 <Field boolean BackStackRecord.mAddToBackStack>
	//*  65  144:ifeq            150
	//*  66  147:goto            156
				flag = false;
	//   67  150:iconst_0        
	//   68  151:istore          6
			else
	//*  69  153:goto            159
				flag = true;
	//   70  156:iconst_1        
	//   71  157:istore          6
		}

	//   72  159:iload           7
	//   73  161:iconst_1        
	//   74  162:iadd            
	//   75  163:istore          7
	//*  76  165:goto            72
		mTmpAddedFragments.clear();
	//   77  168:aload_0         
	//   78  169:getfield        #422 <Field ArrayList mTmpAddedFragments>
	//   79  172:invokevirtual   #331 <Method void ArrayList.clear()>
		if(!flag1)
	//*  80  175:iload           9
	//*  81  177:ifne            190
			FragmentTransition.startTransitions(this, arraylist, arraylist1, i, j, false);
	//   82  180:aload_0         
	//   83  181:aload_1         
	//   84  182:aload_2         
	//   85  183:iload_3         
	//   86  184:iload           4
	//   87  186:iconst_0        
	//   88  187:invokestatic    #446 <Method void FragmentTransition.startTransitions(FragmentManagerImpl, ArrayList, ArrayList, int, int, boolean)>
		executeOps(arraylist, arraylist1, i, j);
	//   89  190:aload_1         
	//   90  191:aload_2         
	//   91  192:iload_3         
	//   92  193:iload           4
	//   93  195:invokestatic    #448 <Method void executeOps(ArrayList, ArrayList, int, int)>
		if(flag1)
	//*  94  198:iload           9
	//*  95  200:ifeq            240
		{
			ArraySet arrayset = new ArraySet();
	//   96  203:new             #200 <Class ArraySet>
	//   97  206:dup             
	//   98  207:invokespecial   #449 <Method void ArraySet()>
	//   99  210:astore          10
			addAddedFragments(arrayset);
	//  100  212:aload_0         
	//  101  213:aload           10
	//  102  215:invokespecial   #451 <Method void addAddedFragments(ArraySet)>
			l = postponePostponableTransactions(arraylist, arraylist1, i, j, arrayset);
	//  103  218:aload_0         
	//  104  219:aload_1         
	//  105  220:aload_2         
	//  106  221:iload_3         
	//  107  222:iload           4
	//  108  224:aload           10
	//  109  226:invokespecial   #455 <Method int postponePostponableTransactions(ArrayList, ArrayList, int, int, ArraySet)>
	//  110  229:istore          7
			makeRemovedFragmentsInvisible(arrayset);
	//  111  231:aload_0         
	//  112  232:aload           10
	//  113  234:invokespecial   #458 <Method void makeRemovedFragmentsInvisible(ArraySet)>
		} else
	//* 114  237:goto            244
		{
			l = j;
	//  115  240:iload           4
	//  116  242:istore          7
		}
		int i1 = k;
	//  117  244:iload           5
	//  118  246:istore          8
		if(l != k)
	//* 119  248:iload           7
	//* 120  250:iload           5
	//* 121  252:icmpeq          287
		{
			i1 = k;
	//  122  255:iload           5
	//  123  257:istore          8
			if(flag1)
	//* 124  259:iload           9
	//* 125  261:ifeq            287
			{
				FragmentTransition.startTransitions(this, arraylist, arraylist1, i, l, true);
	//  126  264:aload_0         
	//  127  265:aload_1         
	//  128  266:aload_2         
	//  129  267:iload_3         
	//  130  268:iload           7
	//  131  270:iconst_1        
	//  132  271:invokestatic    #446 <Method void FragmentTransition.startTransitions(FragmentManagerImpl, ArrayList, ArrayList, int, int, boolean)>
				moveToState(mCurState, true);
	//  133  274:aload_0         
	//  134  275:aload_0         
	//  135  276:getfield        #148 <Field int mCurState>
	//  136  279:iconst_1        
	//  137  280:invokevirtual   #337 <Method void moveToState(int, boolean)>
				i1 = k;
	//  138  283:iload           5
	//  139  285:istore          8
			}
		}
		for(; i1 < j; i1++)
	//* 140  287:iload           8
	//* 141  289:iload           4
	//* 142  291:icmpge          357
		{
			BackStackRecord backstackrecord = (BackStackRecord)arraylist.get(i1);
	//  143  294:aload_1         
	//  144  295:iload           8
	//  145  297:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//  146  300:checkcast       #402 <Class BackStackRecord>
	//  147  303:astore          10
			if(((Boolean)arraylist1.get(i1)).booleanValue() && backstackrecord.mIndex >= 0)
	//* 148  305:aload_2         
	//* 149  306:iload           8
	//* 150  308:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//* 151  311:checkcast       #404 <Class Boolean>
	//* 152  314:invokevirtual   #407 <Method boolean Boolean.booleanValue()>
	//* 153  317:ifeq            343
	//* 154  320:aload           10
	//* 155  322:getfield        #461 <Field int BackStackRecord.mIndex>
	//* 156  325:iflt            343
			{
				freeBackStackIndex(backstackrecord.mIndex);
	//  157  328:aload_0         
	//  158  329:aload           10
	//  159  331:getfield        #461 <Field int BackStackRecord.mIndex>
	//  160  334:invokevirtual   #464 <Method void freeBackStackIndex(int)>
				backstackrecord.mIndex = -1;
	//  161  337:aload           10
	//  162  339:iconst_m1       
	//  163  340:putfield        #461 <Field int BackStackRecord.mIndex>
			}
			backstackrecord.runOnCommitRunnables();
	//  164  343:aload           10
	//  165  345:invokevirtual   #467 <Method void BackStackRecord.runOnCommitRunnables()>
		}

	//  166  348:iload           8
	//  167  350:iconst_1        
	//  168  351:iadd            
	//  169  352:istore          8
	//* 170  354:goto            287
		if(flag)
	//* 171  357:iload           6
	//* 172  359:ifeq            366
			reportBackStackChanged();
	//  173  362:aload_0         
	//  174  363:invokevirtual   #470 <Method void reportBackStackChanged()>
	//  175  366:return          
	}

	private void executePostponedTransaction(ArrayList arraylist, ArrayList arraylist1)
	{
		ArrayList arraylist2 = mPostponedTransactions;
	//    0    0:aload_0         
	//    1    1:getfield        #472 <Field ArrayList mPostponedTransactions>
	//    2    4:astore          7
		int i;
		if(arraylist2 == null)
	//*   3    6:aload           7
	//*   4    8:ifnonnull       16
			i = 0;
	//    5   11:iconst_0        
	//    6   12:istore_3        
		else
	//*   7   13:goto            22
			i = arraylist2.size();
	//    8   16:aload           7
	//    9   18:invokevirtual   #169 <Method int ArrayList.size()>
	//   10   21:istore_3        
		int l = 0;
	//   11   22:iconst_0        
	//   12   23:istore          5
		int k = i;
	//   13   25:iload_3         
	//   14   26:istore          4
		for(int j = l; j < k; k = l)
	//*  15   28:iload           5
	//*  16   30:istore_3        
	//*  17   31:iload_3         
	//*  18   32:iload           4
	//*  19   34:icmpge          238
		{
			int i1;
label0:
			{
				StartEnterTransitionListener startentertransitionlistener = (StartEnterTransitionListener)mPostponedTransactions.get(j);
	//   20   37:aload_0         
	//   21   38:getfield        #472 <Field ArrayList mPostponedTransactions>
	//   22   41:iload_3         
	//   23   42:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//   24   45:checkcast       #47  <Class FragmentManagerImpl$StartEnterTransitionListener>
	//   25   48:astore          7
				if(arraylist != null && !startentertransitionlistener.mIsBack)
	//*  26   50:aload_1         
	//*  27   51:ifnull          109
	//*  28   54:aload           7
	//*  29   56:getfield        #475 <Field boolean FragmentManagerImpl$StartEnterTransitionListener.mIsBack>
	//*  30   59:ifne            109
				{
					l = arraylist.indexOf(((Object) (startentertransitionlistener.mRecord)));
	//   31   62:aload_1         
	//   32   63:aload           7
	//   33   65:getfield        #479 <Field BackStackRecord FragmentManagerImpl$StartEnterTransitionListener.mRecord>
	//   34   68:invokevirtual   #483 <Method int ArrayList.indexOf(Object)>
	//   35   71:istore          5
					if(l != -1 && ((Boolean)arraylist1.get(l)).booleanValue())
	//*  36   73:iload           5
	//*  37   75:iconst_m1       
	//*  38   76:icmpeq          109
	//*  39   79:aload_2         
	//*  40   80:iload           5
	//*  41   82:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//*  42   85:checkcast       #404 <Class Boolean>
	//*  43   88:invokevirtual   #407 <Method boolean Boolean.booleanValue()>
	//*  44   91:ifeq            109
					{
						startentertransitionlistener.cancelTransaction();
	//   45   94:aload           7
	//   46   96:invokevirtual   #486 <Method void FragmentManagerImpl$StartEnterTransitionListener.cancelTransaction()>
						i1 = j;
	//   47   99:iload_3         
	//   48  100:istore          6
						l = k;
	//   49  102:iload           4
	//   50  104:istore          5
						break label0;
	//   51  106:goto            226
					}
				}
				if(!startentertransitionlistener.isReady())
	//*  52  109:aload           7
	//*  53  111:invokevirtual   #489 <Method boolean FragmentManagerImpl$StartEnterTransitionListener.isReady()>
	//*  54  114:ifne            152
				{
					i1 = j;
	//   55  117:iload_3         
	//   56  118:istore          6
					l = k;
	//   57  120:iload           4
	//   58  122:istore          5
					if(arraylist == null)
						break label0;
	//   59  124:aload_1         
	//   60  125:ifnull          226
					i1 = j;
	//   61  128:iload_3         
	//   62  129:istore          6
					l = k;
	//   63  131:iload           4
	//   64  133:istore          5
					if(!startentertransitionlistener.mRecord.interactsWith(arraylist, 0, arraylist.size()))
						break label0;
	//   65  135:aload           7
	//   66  137:getfield        #479 <Field BackStackRecord FragmentManagerImpl$StartEnterTransitionListener.mRecord>
	//   67  140:aload_1         
	//   68  141:iconst_0        
	//   69  142:aload_1         
	//   70  143:invokevirtual   #169 <Method int ArrayList.size()>
	//   71  146:invokevirtual   #493 <Method boolean BackStackRecord.interactsWith(ArrayList, int, int)>
	//   72  149:ifeq            226
				}
				mPostponedTransactions.remove(j);
	//   73  152:aload_0         
	//   74  153:getfield        #472 <Field ArrayList mPostponedTransactions>
	//   75  156:iload_3         
	//   76  157:invokevirtual   #496 <Method Object ArrayList.remove(int)>
	//   77  160:pop             
				i1 = j - 1;
	//   78  161:iload_3         
	//   79  162:iconst_1        
	//   80  163:isub            
	//   81  164:istore          6
				l = k - 1;
	//   82  166:iload           4
	//   83  168:iconst_1        
	//   84  169:isub            
	//   85  170:istore          5
				if(arraylist != null && !startentertransitionlistener.mIsBack)
	//*  86  172:aload_1         
	//*  87  173:ifnull          221
	//*  88  176:aload           7
	//*  89  178:getfield        #475 <Field boolean FragmentManagerImpl$StartEnterTransitionListener.mIsBack>
	//*  90  181:ifne            221
				{
					j = arraylist.indexOf(((Object) (startentertransitionlistener.mRecord)));
	//   91  184:aload_1         
	//   92  185:aload           7
	//   93  187:getfield        #479 <Field BackStackRecord FragmentManagerImpl$StartEnterTransitionListener.mRecord>
	//   94  190:invokevirtual   #483 <Method int ArrayList.indexOf(Object)>
	//   95  193:istore_3        
					if(j != -1 && ((Boolean)arraylist1.get(j)).booleanValue())
	//*  96  194:iload_3         
	//*  97  195:iconst_m1       
	//*  98  196:icmpeq          221
	//*  99  199:aload_2         
	//* 100  200:iload_3         
	//* 101  201:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//* 102  204:checkcast       #404 <Class Boolean>
	//* 103  207:invokevirtual   #407 <Method boolean Boolean.booleanValue()>
	//* 104  210:ifeq            221
					{
						startentertransitionlistener.cancelTransaction();
	//  105  213:aload           7
	//  106  215:invokevirtual   #486 <Method void FragmentManagerImpl$StartEnterTransitionListener.cancelTransaction()>
						break label0;
	//  107  218:goto            226
					}
				}
				startentertransitionlistener.completeTransaction();
	//  108  221:aload           7
	//  109  223:invokevirtual   #499 <Method void FragmentManagerImpl$StartEnterTransitionListener.completeTransaction()>
			}
			j = i1 + 1;
	//  110  226:iload           6
	//  111  228:iconst_1        
	//  112  229:iadd            
	//  113  230:istore_3        
		}

	//  114  231:iload           5
	//  115  233:istore          4
	//* 116  235:goto            31
	//  117  238:return          
	}

	private Fragment findFragmentUnder(Fragment fragment)
	{
		ViewGroup viewgroup = fragment.mContainer;
	//    0    0:aload_1         
	//    1    1:getfield        #212 <Field ViewGroup Fragment.mContainer>
	//    2    4:astore_3        
		View view = fragment.mView;
	//    3    5:aload_1         
	//    4    6:getfield        #192 <Field View Fragment.mView>
	//    5    9:astore          4
		if(viewgroup != null)
	//*   6   11:aload_3         
	//*   7   12:ifnull          75
		{
			if(view == null)
	//*   8   15:aload           4
	//*   9   17:ifnonnull       22
				return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
			for(int i = mAdded.indexOf(((Object) (fragment))) - 1; i >= 0; i--)
	//*  12   22:aload_0         
	//*  13   23:getfield        #141 <Field ArrayList mAdded>
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #483 <Method int ArrayList.indexOf(Object)>
	//*  16   30:iconst_1        
	//*  17   31:isub            
	//*  18   32:istore_2        
	//*  19   33:iload_2         
	//*  20   34:iflt            73
			{
				fragment = (Fragment)mAdded.get(i);
	//   21   37:aload_0         
	//   22   38:getfield        #141 <Field ArrayList mAdded>
	//   23   41:iload_2         
	//   24   42:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//   25   45:checkcast       #175 <Class Fragment>
	//   26   48:astore_1        
				if(fragment.mContainer == viewgroup && fragment.mView != null)
	//*  27   49:aload_1         
	//*  28   50:getfield        #212 <Field ViewGroup Fragment.mContainer>
	//*  29   53:aload_3         
	//*  30   54:if_acmpne       66
	//*  31   57:aload_1         
	//*  32   58:getfield        #192 <Field View Fragment.mView>
	//*  33   61:ifnull          66
					return fragment;
	//   34   64:aload_1         
	//   35   65:areturn         
			}

	//   36   66:iload_2         
	//   37   67:iconst_1        
	//   38   68:isub            
	//   39   69:istore_2        
	//*  40   70:goto            33
			return null;
	//   41   73:aconst_null     
	//   42   74:areturn         
		} else
		{
			return null;
	//   43   75:aconst_null     
	//   44   76:areturn         
		}
	}

	private void forcePostponedTransactions()
	{
		if(mPostponedTransactions != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #472 <Field ArrayList mPostponedTransactions>
	//*   2    4:ifnull          34
			for(; !mPostponedTransactions.isEmpty(); ((StartEnterTransitionListener)mPostponedTransactions.remove(0)).completeTransaction());
	//    3    7:aload_0         
	//    4    8:getfield        #472 <Field ArrayList mPostponedTransactions>
	//    5   11:invokevirtual   #506 <Method boolean ArrayList.isEmpty()>
	//    6   14:ifne            34
	//    7   17:aload_0         
	//    8   18:getfield        #472 <Field ArrayList mPostponedTransactions>
	//    9   21:iconst_0        
	//   10   22:invokevirtual   #496 <Method Object ArrayList.remove(int)>
	//   11   25:checkcast       #47  <Class FragmentManagerImpl$StartEnterTransitionListener>
	//   12   28:invokevirtual   #499 <Method void FragmentManagerImpl$StartEnterTransitionListener.completeTransaction()>
	//*  13   31:goto            7
	//   14   34:return          
	}

	private boolean generateOpsForPendingActions(ArrayList arraylist, ArrayList arraylist1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ArrayList arraylist2 = mPendingActions;
	//    2    2:aload_0         
	//    3    3:getfield        #510 <Field ArrayList mPendingActions>
	//    4    6:astore          6
		int i;
		i = 0;
	//    5    8:iconst_0        
	//    6    9:istore_3        
		if(arraylist2 == null)
			break MISSING_BLOCK_LABEL_102;
	//    7   10:aload           6
	//    8   12:ifnull          102
		if(mPendingActions.size() == 0)
	//*   9   15:aload_0         
	//*  10   16:getfield        #510 <Field ArrayList mPendingActions>
	//*  11   19:invokevirtual   #169 <Method int ArrayList.size()>
	//*  12   22:ifne            28
			break MISSING_BLOCK_LABEL_102;
	//   13   25:goto            102
		int j = mPendingActions.size();
	//   14   28:aload_0         
	//   15   29:getfield        #510 <Field ArrayList mPendingActions>
	//   16   32:invokevirtual   #169 <Method int ArrayList.size()>
	//   17   35:istore          4
		boolean flag = false;
	//   18   37:iconst_0        
	//   19   38:istore          5
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   20   40:iload_3         
	//   21   41:iload           4
	//   22   43:icmpge          76
		flag |= ((OpGenerator)mPendingActions.get(i)).generateOps(arraylist, arraylist1);
	//   23   46:iload           5
	//   24   48:aload_0         
	//   25   49:getfield        #510 <Field ArrayList mPendingActions>
	//   26   52:iload_3         
	//   27   53:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//   28   56:checkcast       #41  <Class FragmentManagerImpl$OpGenerator>
	//   29   59:aload_1         
	//   30   60:aload_2         
	//   31   61:invokeinterface #513 <Method boolean FragmentManagerImpl$OpGenerator.generateOps(ArrayList, ArrayList)>
	//   32   66:ior             
	//   33   67:istore          5
		i++;
	//   34   69:iload_3         
	//   35   70:iconst_1        
	//   36   71:iadd            
	//   37   72:istore_3        
		if(true) goto _L2; else goto _L1
	//   38   73:goto            40
_L1:
		mPendingActions.clear();
	//   39   76:aload_0         
	//   40   77:getfield        #510 <Field ArrayList mPendingActions>
	//   41   80:invokevirtual   #331 <Method void ArrayList.clear()>
		mHost.getHandler().removeCallbacks(mExecCommit);
	//   42   83:aload_0         
	//   43   84:getfield        #369 <Field FragmentHostCallback mHost>
	//   44   87:invokevirtual   #381 <Method Handler FragmentHostCallback.getHandler()>
	//   45   90:aload_0         
	//   46   91:getfield        #157 <Field Runnable mExecCommit>
	//   47   94:invokevirtual   #517 <Method void Handler.removeCallbacks(Runnable)>
		this;
	//   48   97:aload_0         
		JVM INSTR monitorexit ;
	//   49   98:monitorexit     
		return flag;
	//   50   99:iload           5
	//   51  101:ireturn         
		this;
	//   52  102:aload_0         
		JVM INSTR monitorexit ;
	//   53  103:monitorexit     
		return false;
	//   54  104:iconst_0        
	//   55  105:ireturn         
		arraylist;
	//   56  106:astore_1        
		this;
	//   57  107:aload_0         
		JVM INSTR monitorexit ;
	//   58  108:monitorexit     
		throw arraylist;
	//   59  109:aload_1         
	//   60  110:athrow          
	}

	private static android.view.animation.Animation.AnimationListener getAnimationListener(Animation animation)
	{
		if(sAnimationListenerField == null)
	//*   0    0:getstatic       #524 <Field Field sAnimationListenerField>
	//*   1    3:ifnonnull       24
		{
			sAnimationListenerField = ((Class) (android/view/animation/Animation)).getDeclaredField("mListener");
	//    2    6:ldc1            #241 <Class Animation>
	//    3    8:ldc2            #526 <String "mListener">
	//    4   11:invokevirtual   #532 <Method Field Class.getDeclaredField(String)>
	//    5   14:putstatic       #524 <Field Field sAnimationListenerField>
			sAnimationListenerField.setAccessible(true);
	//    6   17:getstatic       #524 <Field Field sAnimationListenerField>
	//    7   20:iconst_1        
	//    8   21:invokevirtual   #537 <Method void Field.setAccessible(boolean)>
		}
		animation = ((Animation) ((android.view.animation.Animation.AnimationListener)sAnimationListenerField.get(((Object) (animation)))));
	//    9   24:getstatic       #524 <Field Field sAnimationListenerField>
	//   10   27:aload_0         
	//   11   28:invokevirtual   #540 <Method Object Field.get(Object)>
	//   12   31:checkcast       #542 <Class android.view.animation.Animation$AnimationListener>
	//   13   34:astore_0        
		return ((android.view.animation.Animation.AnimationListener) (animation));
	//   14   35:aload_0         
	//   15   36:areturn         
		animation;
	//   16   37:astore_0        
		Log.e("FragmentManager", "Cannot access Animation's mListener field", ((Throwable) (animation)));
	//   17   38:ldc2            #544 <String "FragmentManager">
	//   18   41:ldc2            #546 <String "Cannot access Animation's mListener field">
	//   19   44:aload_0         
	//   20   45:invokestatic    #552 <Method int Log.e(String, String, Throwable)>
	//   21   48:pop             
		break MISSING_BLOCK_LABEL_64;
	//   22   49:goto            64
		animation;
	//   23   52:astore_0        
		Log.e("FragmentManager", "No field with the name mListener is found in Animation class", ((Throwable) (animation)));
	//   24   53:ldc2            #544 <String "FragmentManager">
	//   25   56:ldc2            #554 <String "No field with the name mListener is found in Animation class">
	//   26   59:aload_0         
	//   27   60:invokestatic    #552 <Method int Log.e(String, String, Throwable)>
	//   28   63:pop             
		return null;
	//   29   64:aconst_null     
	//   30   65:areturn         
	}

	static AnimationOrAnimator makeFadeAnimation(Context context, float f, float f1)
	{
		context = ((Context) (new AlphaAnimation(f, f1)));
	//    0    0:new             #558 <Class AlphaAnimation>
	//    1    3:dup             
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokespecial   #561 <Method void AlphaAnimation(float, float)>
	//    5    9:astore_0        
		((AlphaAnimation) (context)).setInterpolator(DECELERATE_CUBIC);
	//    6   10:aload_0         
	//    7   11:getstatic       #124 <Field Interpolator DECELERATE_CUBIC>
	//    8   14:invokevirtual   #565 <Method void AlphaAnimation.setInterpolator(Interpolator)>
		((AlphaAnimation) (context)).setDuration(220L);
	//    9   17:aload_0         
	//   10   18:ldc2w           #566 <Long 220L>
	//   11   21:invokevirtual   #571 <Method void AlphaAnimation.setDuration(long)>
		return new AnimationOrAnimator(((Animation) (context)));
	//   12   24:new             #26  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:invokespecial   #573 <Method void FragmentManagerImpl$AnimationOrAnimator(Animation)>
	//   16   32:areturn         
	}

	static AnimationOrAnimator makeOpenCloseAnimation(Context context, float f, float f1, float f2, float f3)
	{
		context = ((Context) (new AnimationSet(false)));
	//    0    0:new             #577 <Class AnimationSet>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #579 <Method void AnimationSet(boolean)>
	//    4    8:astore_0        
		Object obj = ((Object) (new ScaleAnimation(f, f1, f, f1, 1, 0.5F, 1, 0.5F)));
	//    5    9:new             #581 <Class ScaleAnimation>
	//    6   12:dup             
	//    7   13:fload_1         
	//    8   14:fload_2         
	//    9   15:fload_1         
	//   10   16:fload_2         
	//   11   17:iconst_1        
	//   12   18:ldc2            #582 <Float 0.5F>
	//   13   21:iconst_1        
	//   14   22:ldc2            #582 <Float 0.5F>
	//   15   25:invokespecial   #585 <Method void ScaleAnimation(float, float, float, float, int, float, int, float)>
	//   16   28:astore          5
		((ScaleAnimation) (obj)).setInterpolator(DECELERATE_QUINT);
	//   17   30:aload           5
	//   18   32:getstatic       #121 <Field Interpolator DECELERATE_QUINT>
	//   19   35:invokevirtual   #586 <Method void ScaleAnimation.setInterpolator(Interpolator)>
		((ScaleAnimation) (obj)).setDuration(220L);
	//   20   38:aload           5
	//   21   40:ldc2w           #566 <Long 220L>
	//   22   43:invokevirtual   #587 <Method void ScaleAnimation.setDuration(long)>
		((AnimationSet) (context)).addAnimation(((Animation) (obj)));
	//   23   46:aload_0         
	//   24   47:aload           5
	//   25   49:invokevirtual   #590 <Method void AnimationSet.addAnimation(Animation)>
		obj = ((Object) (new AlphaAnimation(f2, f3)));
	//   26   52:new             #558 <Class AlphaAnimation>
	//   27   55:dup             
	//   28   56:fload_3         
	//   29   57:fload           4
	//   30   59:invokespecial   #561 <Method void AlphaAnimation(float, float)>
	//   31   62:astore          5
		((AlphaAnimation) (obj)).setInterpolator(DECELERATE_CUBIC);
	//   32   64:aload           5
	//   33   66:getstatic       #124 <Field Interpolator DECELERATE_CUBIC>
	//   34   69:invokevirtual   #565 <Method void AlphaAnimation.setInterpolator(Interpolator)>
		((AlphaAnimation) (obj)).setDuration(220L);
	//   35   72:aload           5
	//   36   74:ldc2w           #566 <Long 220L>
	//   37   77:invokevirtual   #571 <Method void AlphaAnimation.setDuration(long)>
		((AnimationSet) (context)).addAnimation(((Animation) (obj)));
	//   38   80:aload_0         
	//   39   81:aload           5
	//   40   83:invokevirtual   #590 <Method void AnimationSet.addAnimation(Animation)>
		return new AnimationOrAnimator(((Animation) (context)));
	//   41   86:new             #26  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   42   89:dup             
	//   43   90:aload_0         
	//   44   91:invokespecial   #573 <Method void FragmentManagerImpl$AnimationOrAnimator(Animation)>
	//   45   94:areturn         
	}

	private void makeRemovedFragmentsInvisible(ArraySet arrayset)
	{
		int j = arrayset.size();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #591 <Method int ArraySet.size()>
	//    2    4:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          60
		{
			Fragment fragment = (Fragment)arrayset.valueAt(i);
	//    8   12:aload_1         
	//    9   13:iload_2         
	//   10   14:invokevirtual   #592 <Method Object ArraySet.valueAt(int)>
	//   11   17:checkcast       #175 <Class Fragment>
	//   12   20:astore          4
			if(!fragment.mAdded)
	//*  13   22:aload           4
	//*  14   24:getfield        #594 <Field boolean Fragment.mAdded>
	//*  15   27:ifne            53
			{
				View view = fragment.getView();
	//   16   30:aload           4
	//   17   32:invokevirtual   #597 <Method View Fragment.getView()>
	//   18   35:astore          5
				fragment.mPostponedAlpha = view.getAlpha();
	//   19   37:aload           4
	//   20   39:aload           5
	//   21   41:invokevirtual   #601 <Method float View.getAlpha()>
	//   22   44:putfield        #605 <Field float Fragment.mPostponedAlpha>
				view.setAlpha(0.0F);
	//   23   47:aload           5
	//   24   49:fconst_0        
	//   25   50:invokevirtual   #608 <Method void View.setAlpha(float)>
			}
		}

	//   26   53:iload_2         
	//   27   54:iconst_1        
	//   28   55:iadd            
	//   29   56:istore_2        
	//*  30   57:goto            7
	//   31   60:return          
	}

	static boolean modifiesAlpha(Animator animator)
	{
		if(animator == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(animator instanceof ValueAnimator)
	//*   4    6:aload_0         
	//*   5    7:instanceof      #612 <Class ValueAnimator>
	//*   6   10:ifeq            53
		{
			animator = ((Animator) (((ValueAnimator)animator).getValues()));
	//    7   13:aload_0         
	//    8   14:checkcast       #612 <Class ValueAnimator>
	//    9   17:invokevirtual   #616 <Method PropertyValuesHolder[] ValueAnimator.getValues()>
	//   10   20:astore_0        
			for(int i = 0; i < animator.length; i++)
	//*  11   21:iconst_0        
	//*  12   22:istore_1        
	//*  13   23:iload_1         
	//*  14   24:aload_0         
	//*  15   25:arraylength     
	//*  16   26:icmpge          105
				if("alpha".equals(((Object) (((PropertyValuesHolder) (animator[i])).getPropertyName()))))
	//*  17   29:ldc2            #618 <String "alpha">
	//*  18   32:aload_0         
	//*  19   33:iload_1         
	//*  20   34:aaload          
	//*  21   35:invokevirtual   #623 <Method String PropertyValuesHolder.getPropertyName()>
	//*  22   38:invokevirtual   #628 <Method boolean String.equals(Object)>
	//*  23   41:ifeq            46
					return true;
	//   24   44:iconst_1        
	//   25   45:ireturn         

	//   26   46:iload_1         
	//   27   47:iconst_1        
	//   28   48:iadd            
	//   29   49:istore_1        
		} else
	//*  30   50:goto            23
		if(animator instanceof AnimatorSet)
	//*  31   53:aload_0         
	//*  32   54:instanceof      #630 <Class AnimatorSet>
	//*  33   57:ifeq            105
		{
			animator = ((Animator) (((AnimatorSet)animator).getChildAnimations()));
	//   34   60:aload_0         
	//   35   61:checkcast       #630 <Class AnimatorSet>
	//   36   64:invokevirtual   #634 <Method ArrayList AnimatorSet.getChildAnimations()>
	//   37   67:astore_0        
			for(int j = 0; j < ((List) (animator)).size(); j++)
	//*  38   68:iconst_0        
	//*  39   69:istore_1        
	//*  40   70:iload_1         
	//*  41   71:aload_0         
	//*  42   72:invokeinterface #637 <Method int List.size()>
	//*  43   77:icmpge          105
				if(modifiesAlpha((Animator)((List) (animator)).get(j)))
	//*  44   80:aload_0         
	//*  45   81:iload_1         
	//*  46   82:invokeinterface #638 <Method Object List.get(int)>
	//*  47   87:checkcast       #268 <Class Animator>
	//*  48   90:invokestatic    #640 <Method boolean modifiesAlpha(Animator)>
	//*  49   93:ifeq            98
					return true;
	//   50   96:iconst_1        
	//   51   97:ireturn         

	//   52   98:iload_1         
	//   53   99:iconst_1        
	//   54  100:iadd            
	//   55  101:istore_1        
		}
	//*  56  102:goto            70
		return false;
	//   57  105:iconst_0        
	//   58  106:ireturn         
	}

	static boolean modifiesAlpha(AnimationOrAnimator animationoranimator)
	{
		if(animationoranimator.animation instanceof AlphaAnimation)
	//*   0    0:aload_0         
	//*   1    1:getfield        #226 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//*   2    4:instanceof      #558 <Class AlphaAnimation>
	//*   3    7:ifeq            12
			return true;
	//    4   10:iconst_1        
	//    5   11:ireturn         
		if(animationoranimator.animation instanceof AnimationSet)
	//*   6   12:aload_0         
	//*   7   13:getfield        #226 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//*   8   16:instanceof      #577 <Class AnimationSet>
	//*   9   19:ifeq            69
		{
			animationoranimator = ((AnimationOrAnimator) (((AnimationSet)animationoranimator.animation).getAnimations()));
	//   10   22:aload_0         
	//   11   23:getfield        #226 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   12   26:checkcast       #577 <Class AnimationSet>
	//   13   29:invokevirtual   #645 <Method List AnimationSet.getAnimations()>
	//   14   32:astore_0        
			for(int i = 0; i < ((List) (animationoranimator)).size(); i++)
	//*  15   33:iconst_0        
	//*  16   34:istore_1        
	//*  17   35:iload_1         
	//*  18   36:aload_0         
	//*  19   37:invokeinterface #637 <Method int List.size()>
	//*  20   42:icmpge          67
				if(((List) (animationoranimator)).get(i) instanceof AlphaAnimation)
	//*  21   45:aload_0         
	//*  22   46:iload_1         
	//*  23   47:invokeinterface #638 <Method Object List.get(int)>
	//*  24   52:instanceof      #558 <Class AlphaAnimation>
	//*  25   55:ifeq            60
					return true;
	//   26   58:iconst_1        
	//   27   59:ireturn         

	//   28   60:iload_1         
	//   29   61:iconst_1        
	//   30   62:iadd            
	//   31   63:istore_1        
	//*  32   64:goto            35
			return false;
	//   33   67:iconst_0        
	//   34   68:ireturn         
		} else
		{
			return modifiesAlpha(animationoranimator.animator);
	//   35   69:aload_0         
	//   36   70:getfield        #259 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   37   73:invokestatic    #640 <Method boolean modifiesAlpha(Animator)>
	//   38   76:ireturn         
		}
	}

	private boolean popBackStackImmediate(String s, int i, int j)
	{
		boolean flag;
		execPendingActions();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #340 <Method boolean execPendingActions()>
	//    2    4:pop             
		ensureExecReady(true);
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokespecial   #649 <Method void ensureExecReady(boolean)>
		Object obj = ((Object) (mPrimaryNav));
	//    6   10:aload_0         
	//    7   11:getfield        #651 <Field Fragment mPrimaryNav>
	//    8   14:astore          5
		if(obj != null && i < 0 && s == null)
	//*   9   16:aload           5
	//*  10   18:ifnull          51
	//*  11   21:iload_2         
	//*  12   22:ifge            51
	//*  13   25:aload_1         
	//*  14   26:ifnonnull       51
		{
			obj = ((Object) (((Fragment) (obj)).peekChildFragmentManager()));
	//   15   29:aload           5
	//   16   31:invokevirtual   #655 <Method FragmentManager Fragment.peekChildFragmentManager()>
	//   17   34:astore          5
			if(obj != null && ((FragmentManager) (obj)).popBackStackImmediate())
	//*  18   36:aload           5
	//*  19   38:ifnull          51
	//*  20   41:aload           5
	//*  21   43:invokevirtual   #657 <Method boolean FragmentManager.popBackStackImmediate()>
	//*  22   46:ifeq            51
				return true;
	//   23   49:iconst_1        
	//   24   50:ireturn         
		}
		flag = popBackStackState(mTmpRecords, mTmpIsPop, s, i, j);
	//   25   51:aload_0         
	//   26   52:aload_0         
	//   27   53:getfield        #333 <Field ArrayList mTmpRecords>
	//   28   56:aload_0         
	//   29   57:getfield        #328 <Field ArrayList mTmpIsPop>
	//   30   60:aload_1         
	//   31   61:iload_2         
	//   32   62:iload_3         
	//   33   63:invokevirtual   #661 <Method boolean popBackStackState(ArrayList, ArrayList, String, int, int)>
	//   34   66:istore          4
		if(!flag)
			break MISSING_BLOCK_LABEL_104;
	//   35   68:iload           4
	//   36   70:ifeq            104
		mExecutingActions = true;
	//   37   73:aload_0         
	//   38   74:iconst_1        
	//   39   75:putfield        #326 <Field boolean mExecutingActions>
		removeRedundantOperationsAndExecute(mTmpRecords, mTmpIsPop);
	//   40   78:aload_0         
	//   41   79:aload_0         
	//   42   80:getfield        #333 <Field ArrayList mTmpRecords>
	//   43   83:aload_0         
	//   44   84:getfield        #328 <Field ArrayList mTmpIsPop>
	//   45   87:invokespecial   #664 <Method void removeRedundantOperationsAndExecute(ArrayList, ArrayList)>
		cleanupExec();
	//   46   90:aload_0         
	//   47   91:invokespecial   #666 <Method void cleanupExec()>
		break MISSING_BLOCK_LABEL_104;
	//   48   94:goto            104
		s;
	//   49   97:astore_1        
		cleanupExec();
	//   50   98:aload_0         
	//   51   99:invokespecial   #666 <Method void cleanupExec()>
		throw s;
	//   52  102:aload_1         
	//   53  103:athrow          
		doPendingDeferredStart();
	//   54  104:aload_0         
	//   55  105:invokevirtual   #669 <Method void doPendingDeferredStart()>
		burpActive();
	//   56  108:aload_0         
	//   57  109:invokespecial   #671 <Method void burpActive()>
		return flag;
	//   58  112:iload           4
	//   59  114:ireturn         
	}

	private int postponePostponableTransactions(ArrayList arraylist, ArrayList arraylist1, int i, int j, ArraySet arrayset)
	{
		int k = j - 1;
	//    0    0:iload           4
	//    1    2:iconst_1        
	//    2    3:isub            
	//    3    4:istore          6
		int l;
		int i1;
		for(l = j; k >= i; l = i1)
	//*   4    6:iload           4
	//*   5    8:istore          7
	//*   6   10:iload           6
	//*   7   12:iload_3         
	//*   8   13:icmplt          196
		{
			BackStackRecord backstackrecord = (BackStackRecord)arraylist.get(k);
	//    9   16:aload_1         
	//   10   17:iload           6
	//   11   19:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #402 <Class BackStackRecord>
	//   13   25:astore          11
			boolean flag1 = ((Boolean)arraylist1.get(k)).booleanValue();
	//   14   27:aload_2         
	//   15   28:iload           6
	//   16   30:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//   17   33:checkcast       #404 <Class Boolean>
	//   18   36:invokevirtual   #407 <Method boolean Boolean.booleanValue()>
	//   19   39:istore          10
			boolean flag;
			if(backstackrecord.isPostponed() && !backstackrecord.interactsWith(arraylist, k + 1, j))
	//*  20   41:aload           11
	//*  21   43:invokevirtual   #674 <Method boolean BackStackRecord.isPostponed()>
	//*  22   46:ifeq            70
	//*  23   49:aload           11
	//*  24   51:aload_1         
	//*  25   52:iload           6
	//*  26   54:iconst_1        
	//*  27   55:iadd            
	//*  28   56:iload           4
	//*  29   58:invokevirtual   #493 <Method boolean BackStackRecord.interactsWith(ArrayList, int, int)>
	//*  30   61:ifne            70
				flag = true;
	//   31   64:iconst_1        
	//   32   65:istore          9
			else
	//*  33   67:goto            73
				flag = false;
	//   34   70:iconst_0        
	//   35   71:istore          9
			i1 = l;
	//   36   73:iload           7
	//   37   75:istore          8
			if(flag)
	//*  38   77:iload           9
	//*  39   79:ifeq            183
			{
				if(mPostponedTransactions == null)
	//*  40   82:aload_0         
	//*  41   83:getfield        #472 <Field ArrayList mPostponedTransactions>
	//*  42   86:ifnonnull       100
					mPostponedTransactions = new ArrayList();
	//   43   89:aload_0         
	//   44   90:new             #138 <Class ArrayList>
	//   45   93:dup             
	//   46   94:invokespecial   #139 <Method void ArrayList()>
	//   47   97:putfield        #472 <Field ArrayList mPostponedTransactions>
				StartEnterTransitionListener startentertransitionlistener = new StartEnterTransitionListener(backstackrecord, flag1);
	//   48  100:new             #47  <Class FragmentManagerImpl$StartEnterTransitionListener>
	//   49  103:dup             
	//   50  104:aload           11
	//   51  106:iload           10
	//   52  108:invokespecial   #677 <Method void FragmentManagerImpl$StartEnterTransitionListener(BackStackRecord, boolean)>
	//   53  111:astore          12
				mPostponedTransactions.add(((Object) (startentertransitionlistener)));
	//   54  113:aload_0         
	//   55  114:getfield        #472 <Field ArrayList mPostponedTransactions>
	//   56  117:aload           12
	//   57  119:invokevirtual   #678 <Method boolean ArrayList.add(Object)>
	//   58  122:pop             
				backstackrecord.setOnStartPostponedListener(((Fragment.OnStartEnterTransitionListener) (startentertransitionlistener)));
	//   59  123:aload           11
	//   60  125:aload           12
	//   61  127:invokevirtual   #682 <Method void BackStackRecord.setOnStartPostponedListener(Fragment$OnStartEnterTransitionListener)>
				if(flag1)
	//*  62  130:iload           10
	//*  63  132:ifeq            143
					backstackrecord.executeOps();
	//   64  135:aload           11
	//   65  137:invokevirtual   #415 <Method void BackStackRecord.executeOps()>
				else
	//*  66  140:goto            149
					backstackrecord.executePopOps(false);
	//   67  143:aload           11
	//   68  145:iconst_0        
	//   69  146:invokevirtual   #413 <Method void BackStackRecord.executePopOps(boolean)>
				i1 = l - 1;
	//   70  149:iload           7
	//   71  151:iconst_1        
	//   72  152:isub            
	//   73  153:istore          8
				if(k != i1)
	//*  74  155:iload           6
	//*  75  157:iload           8
	//*  76  159:icmpeq          177
				{
					arraylist.remove(k);
	//   77  162:aload_1         
	//   78  163:iload           6
	//   79  165:invokevirtual   #496 <Method Object ArrayList.remove(int)>
	//   80  168:pop             
					arraylist.add(i1, ((Object) (backstackrecord)));
	//   81  169:aload_1         
	//   82  170:iload           8
	//   83  172:aload           11
	//   84  174:invokevirtual   #685 <Method void ArrayList.add(int, Object)>
				}
				addAddedFragments(arrayset);
	//   85  177:aload_0         
	//   86  178:aload           5
	//   87  180:invokespecial   #451 <Method void addAddedFragments(ArraySet)>
			}
			k--;
	//   88  183:iload           6
	//   89  185:iconst_1        
	//   90  186:isub            
	//   91  187:istore          6
		}

	//   92  189:iload           8
	//   93  191:istore          7
	//*  94  193:goto            10
		return l;
	//   95  196:iload           7
	//   96  198:ireturn         
	}

	private void removeRedundantOperationsAndExecute(ArrayList arraylist, ArrayList arraylist1)
	{
		if(arraylist != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          223
		{
			if(arraylist.isEmpty())
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #506 <Method boolean ArrayList.isEmpty()>
	//*   4    8:ifeq            12
				return;
	//    5   11:return          
			if(arraylist1 != null && arraylist.size() == arraylist1.size())
	//*   6   12:aload_2         
	//*   7   13:ifnull          212
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #169 <Method int ArrayList.size()>
	//*  10   20:aload_2         
	//*  11   21:invokevirtual   #169 <Method int ArrayList.size()>
	//*  12   24:icmpne          212
			{
				executePostponedTransaction(arraylist, arraylist1);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:aload_2         
	//   16   30:invokespecial   #392 <Method void executePostponedTransaction(ArrayList, ArrayList)>
				int i1 = arraylist.size();
	//   17   33:aload_1         
	//   18   34:invokevirtual   #169 <Method int ArrayList.size()>
	//   19   37:istore          7
				int i = 0;
	//   20   39:iconst_0        
	//   21   40:istore_3        
				int j;
				int k;
				for(k = 0; i < i1; k = j)
	//*  22   41:iconst_0        
	//*  23   42:istore          5
	//*  24   44:iload_3         
	//*  25   45:iload           7
	//*  26   47:icmpge          194
				{
					int l = i;
	//   27   50:iload_3         
	//   28   51:istore          6
					j = k;
	//   29   53:iload           5
	//   30   55:istore          4
					if(!((BackStackRecord)arraylist.get(i)).mReorderingAllowed)
	//*  31   57:aload_1         
	//*  32   58:iload_3         
	//*  33   59:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//*  34   62:checkcast       #402 <Class BackStackRecord>
	//*  35   65:getfield        #420 <Field boolean BackStackRecord.mReorderingAllowed>
	//*  36   68:ifne            182
					{
						if(k != i)
	//*  37   71:iload           5
	//*  38   73:iload_3         
	//*  39   74:icmpeq          86
							executeOpsTogether(arraylist, arraylist1, k, i);
	//   40   77:aload_0         
	//   41   78:aload_1         
	//   42   79:aload_2         
	//   43   80:iload           5
	//   44   82:iload_3         
	//   45   83:invokespecial   #688 <Method void executeOpsTogether(ArrayList, ArrayList, int, int)>
						k = i + 1;
	//   46   86:iload_3         
	//   47   87:iconst_1        
	//   48   88:iadd            
	//   49   89:istore          5
						j = k;
	//   50   91:iload           5
	//   51   93:istore          4
						if(((Boolean)arraylist1.get(i)).booleanValue())
	//*  52   95:aload_2         
	//*  53   96:iload_3         
	//*  54   97:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//*  55  100:checkcast       #404 <Class Boolean>
	//*  56  103:invokevirtual   #407 <Method boolean Boolean.booleanValue()>
	//*  57  106:ifeq            167
							do
							{
								j = k;
	//   58  109:iload           5
	//   59  111:istore          4
								if(k >= i1)
									break;
	//   60  113:iload           5
	//   61  115:iload           7
	//   62  117:icmpge          167
								j = k;
	//   63  120:iload           5
	//   64  122:istore          4
								if(!((Boolean)arraylist1.get(k)).booleanValue())
									break;
	//   65  124:aload_2         
	//   66  125:iload           5
	//   67  127:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//   68  130:checkcast       #404 <Class Boolean>
	//   69  133:invokevirtual   #407 <Method boolean Boolean.booleanValue()>
	//   70  136:ifeq            167
								j = k;
	//   71  139:iload           5
	//   72  141:istore          4
								if(((BackStackRecord)arraylist.get(k)).mReorderingAllowed)
									break;
	//   73  143:aload_1         
	//   74  144:iload           5
	//   75  146:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//   76  149:checkcast       #402 <Class BackStackRecord>
	//   77  152:getfield        #420 <Field boolean BackStackRecord.mReorderingAllowed>
	//   78  155:ifne            167
								k++;
	//   79  158:iload           5
	//   80  160:iconst_1        
	//   81  161:iadd            
	//   82  162:istore          5
							} while(true);
	//   83  164:goto            109
						executeOpsTogether(arraylist, arraylist1, i, j);
	//   84  167:aload_0         
	//   85  168:aload_1         
	//   86  169:aload_2         
	//   87  170:iload_3         
	//   88  171:iload           4
	//   89  173:invokespecial   #688 <Method void executeOpsTogether(ArrayList, ArrayList, int, int)>
						l = j - 1;
	//   90  176:iload           4
	//   91  178:iconst_1        
	//   92  179:isub            
	//   93  180:istore          6
					}
					i = l + 1;
	//   94  182:iload           6
	//   95  184:iconst_1        
	//   96  185:iadd            
	//   97  186:istore_3        
				}

	//   98  187:iload           4
	//   99  189:istore          5
	//* 100  191:goto            44
				if(k != i1)
	//* 101  194:iload           5
	//* 102  196:iload           7
	//* 103  198:icmpeq          211
					executeOpsTogether(arraylist, arraylist1, k, i1);
	//  104  201:aload_0         
	//  105  202:aload_1         
	//  106  203:aload_2         
	//  107  204:iload           5
	//  108  206:iload           7
	//  109  208:invokespecial   #688 <Method void executeOpsTogether(ArrayList, ArrayList, int, int)>
				return;
	//  110  211:return          
			} else
			{
				throw new IllegalStateException("Internal error with the back stack records");
	//  111  212:new             #314 <Class IllegalStateException>
	//  112  215:dup             
	//  113  216:ldc2            #690 <String "Internal error with the back stack records">
	//  114  219:invokespecial   #321 <Method void IllegalStateException(String)>
	//  115  222:athrow          
			}
		} else
		{
			return;
	//  116  223:return          
		}
	}

	public static int reverseTransit(int i)
	{
		char c = '\u2002';
	//    0    0:sipush          8194
	//    1    3:istore_1        
		if(i != 4097)
	//*   2    4:iload_0         
	//*   3    5:sipush          4097
	//*   4    8:icmpeq          35
		{
			if(i != 4099)
	//*   5   11:iload_0         
	//*   6   12:sipush          4099
	//*   7   15:icmpeq          31
				return i == 8194 ? 4097 : 0;
	//    8   18:iload_0         
	//    9   19:sipush          8194
	//   10   22:icmpeq          27
	//   11   25:iconst_0        
	//   12   26:ireturn         
	//   13   27:sipush          4097
	//   14   30:ireturn         
			c = '\u1003';
	//   15   31:sipush          4099
	//   16   34:istore_1        
		}
		return ((int) (c));
	//   17   35:iload_1         
	//   18   36:ireturn         
	}

	private static void setHWLayerAnimListenerIfAlpha(View view, AnimationOrAnimator animationoranimator)
	{
		if(view != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          71
		{
			if(animationoranimator == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       9
				return;
	//    4    8:return          
			if(shouldRunOnHWLayer(view, animationoranimator))
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:invokestatic    #695 <Method boolean shouldRunOnHWLayer(View, FragmentManagerImpl$AnimationOrAnimator)>
	//*   8   14:ifeq            70
			{
				if(animationoranimator.animator != null)
	//*   9   17:aload_1         
	//*  10   18:getfield        #259 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//*  11   21:ifnull          40
				{
					animationoranimator.animator.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorOnHWLayerIfNeededListener(view))));
	//   12   24:aload_1         
	//   13   25:getfield        #259 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   14   28:new             #29  <Class FragmentManagerImpl$AnimatorOnHWLayerIfNeededListener>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #697 <Method void FragmentManagerImpl$AnimatorOnHWLayerIfNeededListener(View)>
	//   18   36:invokevirtual   #272 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
					return;
	//   19   39:return          
				}
				android.view.animation.Animation.AnimationListener animationlistener = getAnimationListener(animationoranimator.animation);
	//   20   40:aload_1         
	//   21   41:getfield        #226 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   22   44:invokestatic    #236 <Method android.view.animation.Animation$AnimationListener getAnimationListener(Animation)>
	//   23   47:astore_2        
				view.setLayerType(2, ((android.graphics.Paint) (null)));
	//   24   48:aload_0         
	//   25   49:iconst_2        
	//   26   50:aconst_null     
	//   27   51:invokevirtual   #701 <Method void View.setLayerType(int, android.graphics.Paint)>
				animationoranimator.animation.setAnimationListener(((android.view.animation.Animation.AnimationListener) (new AnimateOnHWLayerIfNeededListener(view, animationlistener))));
	//   28   54:aload_1         
	//   29   55:getfield        #226 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   30   58:new             #18  <Class FragmentManagerImpl$AnimateOnHWLayerIfNeededListener>
	//   31   61:dup             
	//   32   62:aload_0         
	//   33   63:aload_2         
	//   34   64:invokespecial   #704 <Method void FragmentManagerImpl$AnimateOnHWLayerIfNeededListener(View, android.view.animation.Animation$AnimationListener)>
	//   35   67:invokevirtual   #245 <Method void Animation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
			}
			return;
	//   36   70:return          
		} else
		{
			return;
	//   37   71:return          
		}
	}

	private static void setRetaining(FragmentManagerNonConfig fragmentmanagernonconfig)
	{
		if(fragmentmanagernonconfig == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		Object obj = ((Object) (fragmentmanagernonconfig.getFragments()));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #711 <Method List FragmentManagerNonConfig.getFragments()>
	//    5    9:astore_1        
		if(obj != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          46
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*   8   14:aload_1         
	//*   9   15:invokeinterface #715 <Method Iterator List.iterator()>
	//*  10   20:astore_1        
	//*  11   21:aload_1         
	//*  12   22:invokeinterface #720 <Method boolean Iterator.hasNext()>
	//*  13   27:ifeq            46
				((Fragment)((Iterator) (obj)).next()).mRetaining = true;
	//   14   30:aload_1         
	//   15   31:invokeinterface #724 <Method Object Iterator.next()>
	//   16   36:checkcast       #175 <Class Fragment>
	//   17   39:iconst_1        
	//   18   40:putfield        #727 <Field boolean Fragment.mRetaining>

	//*  19   43:goto            21
		fragmentmanagernonconfig = ((FragmentManagerNonConfig) (fragmentmanagernonconfig.getChildNonConfigs()));
	//   20   46:aload_0         
	//   21   47:invokevirtual   #730 <Method List FragmentManagerNonConfig.getChildNonConfigs()>
	//   22   50:astore_0        
		if(fragmentmanagernonconfig != null)
	//*  23   51:aload_0         
	//*  24   52:ifnull          86
			for(fragmentmanagernonconfig = ((FragmentManagerNonConfig) (((List) (fragmentmanagernonconfig)).iterator())); ((Iterator) (fragmentmanagernonconfig)).hasNext(); setRetaining((FragmentManagerNonConfig)((Iterator) (fragmentmanagernonconfig)).next()));
	//   25   55:aload_0         
	//   26   56:invokeinterface #715 <Method Iterator List.iterator()>
	//   27   61:astore_0        
	//   28   62:aload_0         
	//   29   63:invokeinterface #720 <Method boolean Iterator.hasNext()>
	//   30   68:ifeq            86
	//   31   71:aload_0         
	//   32   72:invokeinterface #724 <Method Object Iterator.next()>
	//   33   77:checkcast       #708 <Class FragmentManagerNonConfig>
	//   34   80:invokestatic    #732 <Method void setRetaining(FragmentManagerNonConfig)>
	//*  35   83:goto            62
	//   36   86:return          
	}

	static boolean shouldRunOnHWLayer(View view, AnimationOrAnimator animationoranimator)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(view != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          53
		{
			if(animationoranimator == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       12
				return false;
	//    6   10:iconst_0        
	//    7   11:ireturn         
			boolean flag = flag1;
	//    8   12:iload_3         
	//    9   13:istore_2        
			if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  10   14:getstatic       #737 <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   17:bipush          19
	//*  12   19:icmplt          51
			{
				flag = flag1;
	//   13   22:iload_3         
	//   14   23:istore_2        
				if(view.getLayerType() == 0)
	//*  15   24:aload_0         
	//*  16   25:invokevirtual   #740 <Method int View.getLayerType()>
	//*  17   28:ifne            51
				{
					flag = flag1;
	//   18   31:iload_3         
	//   19   32:istore_2        
					if(ViewCompat.hasOverlappingRendering(view))
	//*  20   33:aload_0         
	//*  21   34:invokestatic    #746 <Method boolean ViewCompat.hasOverlappingRendering(View)>
	//*  22   37:ifeq            51
					{
						flag = flag1;
	//   23   40:iload_3         
	//   24   41:istore_2        
						if(modifiesAlpha(animationoranimator))
	//*  25   42:aload_1         
	//*  26   43:invokestatic    #748 <Method boolean modifiesAlpha(FragmentManagerImpl$AnimationOrAnimator)>
	//*  27   46:ifeq            51
							flag = true;
	//   28   49:iconst_1        
	//   29   50:istore_2        
					}
				}
			}
			return flag;
	//   30   51:iload_2         
	//   31   52:ireturn         
		} else
		{
			return false;
	//   32   53:iconst_0        
	//   33   54:ireturn         
		}
	}

	private void throwException(RuntimeException runtimeexception)
	{
		Log.e("FragmentManager", runtimeexception.getMessage());
	//    0    0:ldc2            #544 <String "FragmentManager">
	//    1    3:aload_1         
	//    2    4:invokevirtual   #757 <Method String RuntimeException.getMessage()>
	//    3    7:invokestatic    #760 <Method int Log.e(String, String)>
	//    4   10:pop             
		Log.e("FragmentManager", "Activity state:");
	//    5   11:ldc2            #544 <String "FragmentManager">
	//    6   14:ldc2            #762 <String "Activity state:">
	//    7   17:invokestatic    #760 <Method int Log.e(String, String)>
	//    8   20:pop             
		Object obj = ((Object) (new PrintWriter(((java.io.Writer) (new LogWriter("FragmentManager"))))));
	//    9   21:new             #764 <Class PrintWriter>
	//   10   24:dup             
	//   11   25:new             #766 <Class LogWriter>
	//   12   28:dup             
	//   13   29:ldc2            #544 <String "FragmentManager">
	//   14   32:invokespecial   #767 <Method void LogWriter(String)>
	//   15   35:invokespecial   #770 <Method void PrintWriter(java.io.Writer)>
	//   16   38:astore_2        
		FragmentHostCallback fragmenthostcallback = mHost;
	//   17   39:aload_0         
	//   18   40:getfield        #369 <Field FragmentHostCallback mHost>
	//   19   43:astore_3        
		if(fragmenthostcallback != null)
	//*  20   44:aload_3         
	//*  21   45:ifnull          79
			try
			{
				fragmenthostcallback.onDump("  ", ((FileDescriptor) (null)), ((PrintWriter) (obj)), new String[0]);
	//   22   48:aload_3         
	//   23   49:ldc2            #772 <String "  ">
	//   24   52:aconst_null     
	//   25   53:aload_2         
	//   26   54:iconst_0        
	//   27   55:anewarray       String[]
	//   28   58:invokevirtual   #776 <Method void FragmentHostCallback.onDump(String, FileDescriptor, PrintWriter, String[])>
			}
	//*  29   61:goto            107
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  30   64:astore_2        
			{
				Log.e("FragmentManager", "Failed dumping state", ((Throwable) (obj)));
	//   31   65:ldc2            #544 <String "FragmentManager">
	//   32   68:ldc2            #778 <String "Failed dumping state">
	//   33   71:aload_2         
	//   34   72:invokestatic    #552 <Method int Log.e(String, String, Throwable)>
	//   35   75:pop             
			}
		else
	//*  36   76:goto            107
			try
			{
				dump("  ", ((FileDescriptor) (null)), ((PrintWriter) (obj)), new String[0]);
	//   37   79:aload_0         
	//   38   80:ldc2            #772 <String "  ">
	//   39   83:aconst_null     
	//   40   84:aload_2         
	//   41   85:iconst_0        
	//   42   86:anewarray       String[]
	//   43   89:invokevirtual   #781 <Method void dump(String, FileDescriptor, PrintWriter, String[])>
			}
	//*  44   92:goto            107
			catch(Exception exception)
	//*  45   95:astore_2        
			{
				Log.e("FragmentManager", "Failed dumping state", ((Throwable) (exception)));
	//   46   96:ldc2            #544 <String "FragmentManager">
	//   47   99:ldc2            #778 <String "Failed dumping state">
	//   48  102:aload_2         
	//   49  103:invokestatic    #552 <Method int Log.e(String, String, Throwable)>
	//   50  106:pop             
			}
		throw runtimeexception;
	//   51  107:aload_1         
	//   52  108:athrow          
	}

	public static int transitToStyleIndex(int i, boolean flag)
	{
		if(i != 4097)
	//*   0    0:iload_0         
	//*   1    1:sipush          4097
	//*   2    4:icmpeq          40
		{
			if(i != 4099)
	//*   3    7:iload_0         
	//*   4    8:sipush          4099
	//*   5   11:icmpeq          31
			{
				if(i != 8194)
	//*   6   14:iload_0         
	//*   7   15:sipush          8194
	//*   8   18:icmpeq          23
					return -1;
	//    9   21:iconst_m1       
	//   10   22:ireturn         
				return !flag ? 4 : 3;
	//   11   23:iload_1         
	//   12   24:ifeq            29
	//   13   27:iconst_3        
	//   14   28:ireturn         
	//   15   29:iconst_4        
	//   16   30:ireturn         
			}
			return !flag ? 6 : 5;
	//   17   31:iload_1         
	//   18   32:ifeq            37
	//   19   35:iconst_5        
	//   20   36:ireturn         
	//   21   37:bipush          6
	//   22   39:ireturn         
		}
		return !flag ? 2 : 1;
	//   23   40:iload_1         
	//   24   41:ifeq            46
	//   25   44:iconst_1        
	//   26   45:ireturn         
	//   27   46:iconst_2        
	//   28   47:ireturn         
	}

	void addBackStackState(BackStackRecord backstackrecord)
	{
		if(mBackStack == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #787 <Field ArrayList mBackStack>
	//*   2    4:ifnonnull       18
			mBackStack = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #138 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #139 <Method void ArrayList()>
	//    7   15:putfield        #787 <Field ArrayList mBackStack>
		mBackStack.add(((Object) (backstackrecord)));
	//    8   18:aload_0         
	//    9   19:getfield        #787 <Field ArrayList mBackStack>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #678 <Method boolean ArrayList.add(Object)>
	//   12   26:pop             
	//   13   27:return          
	}

	public void addFragment(Fragment fragment, boolean flag)
	{
		if(DEBUG)
	//*   0    0:getstatic       #791 <Field boolean DEBUG>
	//*   1    3:ifeq            39
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #305 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #306 <Method void StringBuilder()>
	//    5   13:astore_3        
			stringbuilder.append("add: ");
	//    6   14:aload_3         
	//    7   15:ldc2            #793 <String "add: ">
	//    8   18:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (fragment)));
	//   10   22:aload_3         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   14   28:ldc2            #544 <String "FragmentManager">
	//   15   31:aload_3         
	//   16   32:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   17   35:invokestatic    #799 <Method int Log.v(String, String)>
	//   18   38:pop             
		}
		makeActive(fragment);
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #803 <Method void makeActive(Fragment)>
		if(!fragment.mDetached)
	//*  22   44:aload_1         
	//*  23   45:getfield        #806 <Field boolean Fragment.mDetached>
	//*  24   48:ifne            170
			if(!mAdded.contains(((Object) (fragment))))
	//*  25   51:aload_0         
	//*  26   52:getfield        #141 <Field ArrayList mAdded>
	//*  27   55:aload_1         
	//*  28   56:invokevirtual   #809 <Method boolean ArrayList.contains(Object)>
	//*  29   59:ifne            136
			{
				synchronized(mAdded)
	//*  30   62:aload_0         
	//*  31   63:getfield        #141 <Field ArrayList mAdded>
	//*  32   66:astore_3        
	//*  33   67:aload_3         
	//*  34   68:monitorenter    
				{
					mAdded.add(((Object) (fragment)));
	//   35   69:aload_0         
	//   36   70:getfield        #141 <Field ArrayList mAdded>
	//   37   73:aload_1         
	//   38   74:invokevirtual   #678 <Method boolean ArrayList.add(Object)>
	//   39   77:pop             
				}
	//   40   78:aload_3         
	//   41   79:monitorexit     
				fragment.mAdded = true;
	//   42   80:aload_1         
	//   43   81:iconst_1        
	//   44   82:putfield        #594 <Field boolean Fragment.mAdded>
				fragment.mRemoving = false;
	//   45   85:aload_1         
	//   46   86:iconst_0        
	//   47   87:putfield        #812 <Field boolean Fragment.mRemoving>
				if(fragment.mView == null)
	//*  48   90:aload_1         
	//*  49   91:getfield        #192 <Field View Fragment.mView>
	//*  50   94:ifnonnull       102
					fragment.mHiddenChanged = false;
	//   51   97:aload_1         
	//   52   98:iconst_0        
	//   53   99:putfield        #815 <Field boolean Fragment.mHiddenChanged>
				if(fragment.mHasMenu && fragment.mMenuVisible)
	//*  54  102:aload_1         
	//*  55  103:getfield        #818 <Field boolean Fragment.mHasMenu>
	//*  56  106:ifeq            121
	//*  57  109:aload_1         
	//*  58  110:getfield        #821 <Field boolean Fragment.mMenuVisible>
	//*  59  113:ifeq            121
					mNeedMenuInvalidate = true;
	//   60  116:aload_0         
	//   61  117:iconst_1        
	//   62  118:putfield        #823 <Field boolean mNeedMenuInvalidate>
				if(flag)
	//*  63  121:iload_2         
	//*  64  122:ifeq            170
				{
					moveToState(fragment);
	//   65  125:aload_0         
	//   66  126:aload_1         
	//   67  127:invokevirtual   #825 <Method void moveToState(Fragment)>
					return;
	//   68  130:return          
				}
			} else
	//*  69  131:astore_1        
	//*  70  132:aload_3         
	//*  71  133:monitorexit     
	//*  72  134:aload_1         
	//*  73  135:athrow          
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   74  136:new             #305 <Class StringBuilder>
	//   75  139:dup             
	//   76  140:invokespecial   #306 <Method void StringBuilder()>
	//   77  143:astore_3        
				stringbuilder1.append("Fragment already added: ");
	//   78  144:aload_3         
	//   79  145:ldc2            #827 <String "Fragment already added: ">
	//   80  148:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   81  151:pop             
				stringbuilder1.append(((Object) (fragment)));
	//   82  152:aload_3         
	//   83  153:aload_1         
	//   84  154:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//   85  157:pop             
				throw new IllegalStateException(stringbuilder1.toString());
	//   86  158:new             #314 <Class IllegalStateException>
	//   87  161:dup             
	//   88  162:aload_3         
	//   89  163:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   90  166:invokespecial   #321 <Method void IllegalStateException(String)>
	//   91  169:athrow          
			}
		break MISSING_BLOCK_LABEL_170;
		fragment;
		arraylist;
		JVM INSTR monitorexit ;
		throw fragment;
	//   92  170:return          
	}

	public int allocBackStackIndex(BackStackRecord backstackrecord)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mAvailBackStackIndices == null || mAvailBackStackIndices.size() <= 0)
	//*   2    2:aload_0         
	//*   3    3:getfield        #831 <Field ArrayList mAvailBackStackIndices>
	//*   4    6:ifnull          112
	//*   5    9:aload_0         
	//*   6   10:getfield        #831 <Field ArrayList mAvailBackStackIndices>
	//*   7   13:invokevirtual   #169 <Method int ArrayList.size()>
	//*   8   16:ifgt            22
			break MISSING_BLOCK_LABEL_112;
	//    9   19:goto            112
		int i;
		i = ((Integer)mAvailBackStackIndices.remove(mAvailBackStackIndices.size() - 1)).intValue();
	//   10   22:aload_0         
	//   11   23:getfield        #831 <Field ArrayList mAvailBackStackIndices>
	//   12   26:aload_0         
	//   13   27:getfield        #831 <Field ArrayList mAvailBackStackIndices>
	//   14   30:invokevirtual   #169 <Method int ArrayList.size()>
	//   15   33:iconst_1        
	//   16   34:isub            
	//   17   35:invokevirtual   #496 <Method Object ArrayList.remove(int)>
	//   18   38:checkcast       #833 <Class Integer>
	//   19   41:invokevirtual   #836 <Method int Integer.intValue()>
	//   20   44:istore_2        
		if(DEBUG)
	//*  21   45:getstatic       #791 <Field boolean DEBUG>
	//*  22   48:ifeq            98
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   23   51:new             #305 <Class StringBuilder>
	//   24   54:dup             
	//   25   55:invokespecial   #306 <Method void StringBuilder()>
	//   26   58:astore_3        
			stringbuilder.append("Adding back stack index ");
	//   27   59:aload_3         
	//   28   60:ldc2            #838 <String "Adding back stack index ">
	//   29   63:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   30   66:pop             
			stringbuilder.append(i);
	//   31   67:aload_3         
	//   32   68:iload_2         
	//   33   69:invokevirtual   #841 <Method StringBuilder StringBuilder.append(int)>
	//   34   72:pop             
			stringbuilder.append(" with ");
	//   35   73:aload_3         
	//   36   74:ldc2            #843 <String " with ">
	//   37   77:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   38   80:pop             
			stringbuilder.append(((Object) (backstackrecord)));
	//   39   81:aload_3         
	//   40   82:aload_1         
	//   41   83:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//   42   86:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   43   87:ldc2            #544 <String "FragmentManager">
	//   44   90:aload_3         
	//   45   91:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   46   94:invokestatic    #799 <Method int Log.v(String, String)>
	//   47   97:pop             
		}
		mBackStackIndices.set(i, ((Object) (backstackrecord)));
	//   48   98:aload_0         
	//   49   99:getfield        #845 <Field ArrayList mBackStackIndices>
	//   50  102:iload_2         
	//   51  103:aload_1         
	//   52  104:invokevirtual   #849 <Method Object ArrayList.set(int, Object)>
	//   53  107:pop             
		this;
	//   54  108:aload_0         
		JVM INSTR monitorexit ;
	//   55  109:monitorexit     
		return i;
	//   56  110:iload_2         
	//   57  111:ireturn         
		if(mBackStackIndices == null)
	//*  58  112:aload_0         
	//*  59  113:getfield        #845 <Field ArrayList mBackStackIndices>
	//*  60  116:ifnonnull       130
			mBackStackIndices = new ArrayList();
	//   61  119:aload_0         
	//   62  120:new             #138 <Class ArrayList>
	//   63  123:dup             
	//   64  124:invokespecial   #139 <Method void ArrayList()>
	//   65  127:putfield        #845 <Field ArrayList mBackStackIndices>
		i = mBackStackIndices.size();
	//   66  130:aload_0         
	//   67  131:getfield        #845 <Field ArrayList mBackStackIndices>
	//   68  134:invokevirtual   #169 <Method int ArrayList.size()>
	//   69  137:istore_2        
		if(DEBUG)
	//*  70  138:getstatic       #791 <Field boolean DEBUG>
	//*  71  141:ifeq            191
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   72  144:new             #305 <Class StringBuilder>
	//   73  147:dup             
	//   74  148:invokespecial   #306 <Method void StringBuilder()>
	//   75  151:astore_3        
			stringbuilder1.append("Setting back stack index ");
	//   76  152:aload_3         
	//   77  153:ldc2            #851 <String "Setting back stack index ">
	//   78  156:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   79  159:pop             
			stringbuilder1.append(i);
	//   80  160:aload_3         
	//   81  161:iload_2         
	//   82  162:invokevirtual   #841 <Method StringBuilder StringBuilder.append(int)>
	//   83  165:pop             
			stringbuilder1.append(" to ");
	//   84  166:aload_3         
	//   85  167:ldc2            #853 <String " to ">
	//   86  170:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   87  173:pop             
			stringbuilder1.append(((Object) (backstackrecord)));
	//   88  174:aload_3         
	//   89  175:aload_1         
	//   90  176:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//   91  179:pop             
			Log.v("FragmentManager", stringbuilder1.toString());
	//   92  180:ldc2            #544 <String "FragmentManager">
	//   93  183:aload_3         
	//   94  184:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   95  187:invokestatic    #799 <Method int Log.v(String, String)>
	//   96  190:pop             
		}
		mBackStackIndices.add(((Object) (backstackrecord)));
	//   97  191:aload_0         
	//   98  192:getfield        #845 <Field ArrayList mBackStackIndices>
	//   99  195:aload_1         
	//  100  196:invokevirtual   #678 <Method boolean ArrayList.add(Object)>
	//  101  199:pop             
		this;
	//  102  200:aload_0         
		JVM INSTR monitorexit ;
	//  103  201:monitorexit     
		return i;
	//  104  202:iload_2         
	//  105  203:ireturn         
		backstackrecord;
	//  106  204:astore_1        
		this;
	//  107  205:aload_0         
		JVM INSTR monitorexit ;
	//  108  206:monitorexit     
		throw backstackrecord;
	//  109  207:aload_1         
	//  110  208:athrow          
	}

	public void attachController(FragmentHostCallback fragmenthostcallback, FragmentContainer fragmentcontainer, Fragment fragment)
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #369 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       23
		{
			mHost = fragmenthostcallback;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #369 <Field FragmentHostCallback mHost>
			mContainer = fragmentcontainer;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #857 <Field FragmentContainer mContainer>
			mParent = fragment;
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:putfield        #859 <Field Fragment mParent>
			return;
	//   12   22:return          
		} else
		{
			throw new IllegalStateException("Already attached");
	//   13   23:new             #314 <Class IllegalStateException>
	//   14   26:dup             
	//   15   27:ldc2            #861 <String "Already attached">
	//   16   30:invokespecial   #321 <Method void IllegalStateException(String)>
	//   17   33:athrow          
		}
	}

	public void attachFragment(Fragment fragment)
	{
		if(DEBUG)
	//*   0    0:getstatic       #791 <Field boolean DEBUG>
	//*   1    3:ifeq            39
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #305 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #306 <Method void StringBuilder()>
	//    5   13:astore_2        
			stringbuilder.append("attach: ");
	//    6   14:aload_2         
	//    7   15:ldc2            #864 <String "attach: ">
	//    8   18:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (fragment)));
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   14   28:ldc2            #544 <String "FragmentManager">
	//   15   31:aload_2         
	//   16   32:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   17   35:invokestatic    #799 <Method int Log.v(String, String)>
	//   18   38:pop             
		}
		if(fragment.mDetached)
	//*  19   39:aload_1         
	//*  20   40:getfield        #806 <Field boolean Fragment.mDetached>
	//*  21   43:ifeq            190
		{
			fragment.mDetached = false;
	//   22   46:aload_1         
	//   23   47:iconst_0        
	//   24   48:putfield        #806 <Field boolean Fragment.mDetached>
			if(!fragment.mAdded)
	//*  25   51:aload_1         
	//*  26   52:getfield        #594 <Field boolean Fragment.mAdded>
	//*  27   55:ifne            190
				if(!mAdded.contains(((Object) (fragment))))
	//*  28   58:aload_0         
	//*  29   59:getfield        #141 <Field ArrayList mAdded>
	//*  30   62:aload_1         
	//*  31   63:invokevirtual   #809 <Method boolean ArrayList.contains(Object)>
	//*  32   66:ifne            156
				{
					if(DEBUG)
	//*  33   69:getstatic       #791 <Field boolean DEBUG>
	//*  34   72:ifeq            108
					{
						StringBuilder stringbuilder1 = new StringBuilder();
	//   35   75:new             #305 <Class StringBuilder>
	//   36   78:dup             
	//   37   79:invokespecial   #306 <Method void StringBuilder()>
	//   38   82:astore_2        
						stringbuilder1.append("add from attach: ");
	//   39   83:aload_2         
	//   40   84:ldc2            #866 <String "add from attach: ">
	//   41   87:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   42   90:pop             
						stringbuilder1.append(((Object) (fragment)));
	//   43   91:aload_2         
	//   44   92:aload_1         
	//   45   93:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//   46   96:pop             
						Log.v("FragmentManager", stringbuilder1.toString());
	//   47   97:ldc2            #544 <String "FragmentManager">
	//   48  100:aload_2         
	//   49  101:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   50  104:invokestatic    #799 <Method int Log.v(String, String)>
	//   51  107:pop             
					}
					synchronized(mAdded)
	//*  52  108:aload_0         
	//*  53  109:getfield        #141 <Field ArrayList mAdded>
	//*  54  112:astore_2        
	//*  55  113:aload_2         
	//*  56  114:monitorenter    
					{
						mAdded.add(((Object) (fragment)));
	//   57  115:aload_0         
	//   58  116:getfield        #141 <Field ArrayList mAdded>
	//   59  119:aload_1         
	//   60  120:invokevirtual   #678 <Method boolean ArrayList.add(Object)>
	//   61  123:pop             
					}
	//   62  124:aload_2         
	//   63  125:monitorexit     
					fragment.mAdded = true;
	//   64  126:aload_1         
	//   65  127:iconst_1        
	//   66  128:putfield        #594 <Field boolean Fragment.mAdded>
					if(fragment.mHasMenu && fragment.mMenuVisible)
	//*  67  131:aload_1         
	//*  68  132:getfield        #818 <Field boolean Fragment.mHasMenu>
	//*  69  135:ifeq            190
	//*  70  138:aload_1         
	//*  71  139:getfield        #821 <Field boolean Fragment.mMenuVisible>
	//*  72  142:ifeq            190
					{
						mNeedMenuInvalidate = true;
	//   73  145:aload_0         
	//   74  146:iconst_1        
	//   75  147:putfield        #823 <Field boolean mNeedMenuInvalidate>
						return;
	//   76  150:return          
					}
				} else
	//*  77  151:astore_1        
	//*  78  152:aload_2         
	//*  79  153:monitorexit     
	//*  80  154:aload_1         
	//*  81  155:athrow          
				{
					StringBuilder stringbuilder2 = new StringBuilder();
	//   82  156:new             #305 <Class StringBuilder>
	//   83  159:dup             
	//   84  160:invokespecial   #306 <Method void StringBuilder()>
	//   85  163:astore_2        
					stringbuilder2.append("Fragment already added: ");
	//   86  164:aload_2         
	//   87  165:ldc2            #827 <String "Fragment already added: ">
	//   88  168:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   89  171:pop             
					stringbuilder2.append(((Object) (fragment)));
	//   90  172:aload_2         
	//   91  173:aload_1         
	//   92  174:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//   93  177:pop             
					throw new IllegalStateException(stringbuilder2.toString());
	//   94  178:new             #314 <Class IllegalStateException>
	//   95  181:dup             
	//   96  182:aload_2         
	//   97  183:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   98  186:invokespecial   #321 <Method void IllegalStateException(String)>
	//   99  189:athrow          
				}
		}
		break MISSING_BLOCK_LABEL_190;
		fragment;
		arraylist;
		JVM INSTR monitorexit ;
		throw fragment;
	//  100  190:return          
	}

	public FragmentTransaction beginTransaction()
	{
		return ((FragmentTransaction) (new BackStackRecord(this)));
	//    0    0:new             #402 <Class BackStackRecord>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #869 <Method void BackStackRecord(FragmentManagerImpl)>
	//    4    8:areturn         
	}

	void completeExecute(BackStackRecord backstackrecord, boolean flag, boolean flag1, boolean flag2)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            13
			backstackrecord.executePopOps(flag2);
	//    2    4:aload_1         
	//    3    5:iload           4
	//    4    7:invokevirtual   #413 <Method void BackStackRecord.executePopOps(boolean)>
		else
	//*   5   10:goto            17
			backstackrecord.executeOps();
	//    6   13:aload_1         
	//    7   14:invokevirtual   #415 <Method void BackStackRecord.executeOps()>
		Object obj = ((Object) (new ArrayList(1)));
	//    8   17:new             #138 <Class ArrayList>
	//    9   20:dup             
	//   10   21:iconst_1        
	//   11   22:invokespecial   #873 <Method void ArrayList(int)>
	//   12   25:astore          7
		ArrayList arraylist = new ArrayList(1);
	//   13   27:new             #138 <Class ArrayList>
	//   14   30:dup             
	//   15   31:iconst_1        
	//   16   32:invokespecial   #873 <Method void ArrayList(int)>
	//   17   35:astore          8
		((ArrayList) (obj)).add(((Object) (backstackrecord)));
	//   18   37:aload           7
	//   19   39:aload_1         
	//   20   40:invokevirtual   #678 <Method boolean ArrayList.add(Object)>
	//   21   43:pop             
		arraylist.add(((Object) (Boolean.valueOf(flag))));
	//   22   44:aload           8
	//   23   46:iload_2         
	//   24   47:invokestatic    #877 <Method Boolean Boolean.valueOf(boolean)>
	//   25   50:invokevirtual   #678 <Method boolean ArrayList.add(Object)>
	//   26   53:pop             
		if(flag1)
	//*  27   54:iload_3         
	//*  28   55:ifeq            69
			FragmentTransition.startTransitions(this, ((ArrayList) (obj)), arraylist, 0, 1, true);
	//   29   58:aload_0         
	//   30   59:aload           7
	//   31   61:aload           8
	//   32   63:iconst_0        
	//   33   64:iconst_1        
	//   34   65:iconst_1        
	//   35   66:invokestatic    #446 <Method void FragmentTransition.startTransitions(FragmentManagerImpl, ArrayList, ArrayList, int, int, boolean)>
		if(flag2)
	//*  36   69:iload           4
	//*  37   71:ifeq            83
			moveToState(mCurState, true);
	//   38   74:aload_0         
	//   39   75:aload_0         
	//   40   76:getfield        #148 <Field int mCurState>
	//   41   79:iconst_1        
	//   42   80:invokevirtual   #337 <Method void moveToState(int, boolean)>
		obj = ((Object) (mActive));
	//   43   83:aload_0         
	//   44   84:getfield        #283 <Field SparseArray mActive>
	//   45   87:astore          7
		if(obj != null)
	//*  46   89:aload           7
	//*  47   91:ifnull          218
		{
			int j = ((SparseArray) (obj)).size();
	//   48   94:aload           7
	//   49   96:invokevirtual   #286 <Method int SparseArray.size()>
	//   50   99:istore          6
			for(int i = 0; i < j; i++)
	//*  51  101:iconst_0        
	//*  52  102:istore          5
	//*  53  104:iload           5
	//*  54  106:iload           6
	//*  55  108:icmpge          218
			{
				Fragment fragment = (Fragment)mActive.valueAt(i);
	//   56  111:aload_0         
	//   57  112:getfield        #283 <Field SparseArray mActive>
	//   58  115:iload           5
	//   59  117:invokevirtual   #289 <Method Object SparseArray.valueAt(int)>
	//   60  120:checkcast       #175 <Class Fragment>
	//   61  123:astore          7
				if(fragment == null || fragment.mView == null || !fragment.mIsNewlyAdded || !backstackrecord.interactsWith(fragment.mContainerId))
					continue;
	//   62  125:aload           7
	//   63  127:ifnull          209
	//   64  130:aload           7
	//   65  132:getfield        #192 <Field View Fragment.mView>
	//   66  135:ifnull          209
	//   67  138:aload           7
	//   68  140:getfield        #198 <Field boolean Fragment.mIsNewlyAdded>
	//   69  143:ifeq            209
	//   70  146:aload_1         
	//   71  147:aload           7
	//   72  149:getfield        #880 <Field int Fragment.mContainerId>
	//   73  152:invokevirtual   #883 <Method boolean BackStackRecord.interactsWith(int)>
	//   74  155:ifeq            209
				if(fragment.mPostponedAlpha > 0.0F)
	//*  75  158:aload           7
	//*  76  160:getfield        #605 <Field float Fragment.mPostponedAlpha>
	//*  77  163:fconst_0        
	//*  78  164:fcmpl           
	//*  79  165:ifle            181
					fragment.mView.setAlpha(fragment.mPostponedAlpha);
	//   80  168:aload           7
	//   81  170:getfield        #192 <Field View Fragment.mView>
	//   82  173:aload           7
	//   83  175:getfield        #605 <Field float Fragment.mPostponedAlpha>
	//   84  178:invokevirtual   #608 <Method void View.setAlpha(float)>
				if(flag2)
	//*  85  181:iload           4
	//*  86  183:ifeq            195
				{
					fragment.mPostponedAlpha = 0.0F;
	//   87  186:aload           7
	//   88  188:fconst_0        
	//   89  189:putfield        #605 <Field float Fragment.mPostponedAlpha>
				} else
	//*  90  192:goto            209
				{
					fragment.mPostponedAlpha = -1F;
	//   91  195:aload           7
	//   92  197:ldc2            #884 <Float -1F>
	//   93  200:putfield        #605 <Field float Fragment.mPostponedAlpha>
					fragment.mIsNewlyAdded = false;
	//   94  203:aload           7
	//   95  205:iconst_0        
	//   96  206:putfield        #198 <Field boolean Fragment.mIsNewlyAdded>
				}
			}

	//   97  209:iload           5
	//   98  211:iconst_1        
	//   99  212:iadd            
	//  100  213:istore          5
		}
	//* 101  215:goto            104
	//  102  218:return          
	}

	void completeShowHideFragment(final Fragment fragment)
	{
		if(fragment.mView != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #192 <Field View Fragment.mView>
	//*   2    4:ifnull          211
		{
			AnimationOrAnimator animationoranimator = loadAnimation(fragment, fragment.getNextTransition(), fragment.mHidden ^ true, fragment.getNextTransitionStyle());
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #184 <Method int Fragment.getNextTransition()>
	//    7   13:aload_1         
	//    8   14:getfield        #195 <Field boolean Fragment.mHidden>
	//    9   17:iconst_1        
	//   10   18:ixor            
	//   11   19:aload_1         
	//   12   20:invokevirtual   #888 <Method int Fragment.getNextTransitionStyle()>
	//   13   23:invokevirtual   #892 <Method FragmentManagerImpl$AnimationOrAnimator loadAnimation(Fragment, int, boolean, int)>
	//   14   26:astore_3        
			if(animationoranimator != null && animationoranimator.animator != null)
	//*  15   27:aload_3         
	//*  16   28:ifnull          139
	//*  17   31:aload_3         
	//*  18   32:getfield        #259 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//*  19   35:ifnull          139
			{
				animationoranimator.animator.setTarget(((Object) (fragment.mView)));
	//   20   38:aload_3         
	//   21   39:getfield        #259 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   22   42:aload_1         
	//   23   43:getfield        #192 <Field View Fragment.mView>
	//   24   46:invokevirtual   #276 <Method void Animator.setTarget(Object)>
				if(fragment.mHidden)
	//*  25   49:aload_1         
	//*  26   50:getfield        #195 <Field boolean Fragment.mHidden>
	//*  27   53:ifeq            113
				{
					if(fragment.isHideReplaced())
	//*  28   56:aload_1         
	//*  29   57:invokevirtual   #895 <Method boolean Fragment.isHideReplaced()>
	//*  30   60:ifeq            71
					{
						fragment.setHideReplaced(false);
	//   31   63:aload_1         
	//   32   64:iconst_0        
	//   33   65:invokevirtual   #898 <Method void Fragment.setHideReplaced(boolean)>
					} else
	//*  34   68:goto            121
					{
						final ViewGroup container = fragment.mContainer;
	//   35   71:aload_1         
	//   36   72:getfield        #212 <Field ViewGroup Fragment.mContainer>
	//   37   75:astore          4
						final View animatingView = fragment.mView;
	//   38   77:aload_1         
	//   39   78:getfield        #192 <Field View Fragment.mView>
	//   40   81:astore          5
						container.startViewTransition(animatingView);
	//   41   83:aload           4
	//   42   85:aload           5
	//   43   87:invokevirtual   #218 <Method void ViewGroup.startViewTransition(View)>
						animationoranimator.animator.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

							public void onAnimationEnd(Animator animator)
							{
								container.endViewTransition(animatingView);
							//    0    0:aload_0         
							//    1    1:getfield        #23  <Field ViewGroup val$container>
							//    2    4:aload_0         
							//    3    5:getfield        #25  <Field View val$animatingView>
							//    4    8:invokevirtual   #39  <Method void ViewGroup.endViewTransition(View)>
								animator.removeListener(((android.animation.Animator.AnimatorListener) (this)));
							//    5   11:aload_1         
							//    6   12:aload_0         
							//    7   13:invokevirtual   #45  <Method void Animator.removeListener(android.animation.Animator$AnimatorListener)>
								if(fragment.mView != null)
							//*   8   16:aload_0         
							//*   9   17:getfield        #27  <Field Fragment val$fragment>
							//*  10   20:getfield        #50  <Field View Fragment.mView>
							//*  11   23:ifnull          38
									fragment.mView.setVisibility(8);
							//   12   26:aload_0         
							//   13   27:getfield        #27  <Field Fragment val$fragment>
							//   14   30:getfield        #50  <Field View Fragment.mView>
							//   15   33:bipush          8
							//   16   35:invokevirtual   #56  <Method void View.setVisibility(int)>
							//   17   38:return          
							}

							final FragmentManagerImpl this$0;
							final View val$animatingView;
							final ViewGroup val$container;
							final Fragment val$fragment;

			
			{
				this$0 = FragmentManagerImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field FragmentManagerImpl this$0>
				container = viewgroup;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field ViewGroup val$container>
				animatingView = view;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field View val$animatingView>
				fragment = fragment1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #27  <Field Fragment val$fragment>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #30  <Method void AnimatorListenerAdapter()>
			//   14   25:return          
			}
						}
)));
	//   44   90:aload_3         
	//   45   91:getfield        #259 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   46   94:new             #16  <Class FragmentManagerImpl$4>
	//   47   97:dup             
	//   48   98:aload_0         
	//   49   99:aload           4
	//   50  101:aload           5
	//   51  103:aload_1         
	//   52  104:invokespecial   #899 <Method void FragmentManagerImpl$4(FragmentManagerImpl, ViewGroup, View, Fragment)>
	//   53  107:invokevirtual   #272 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
					}
				} else
	//*  54  110:goto            121
				{
					fragment.mView.setVisibility(0);
	//   55  113:aload_1         
	//   56  114:getfield        #192 <Field View Fragment.mView>
	//   57  117:iconst_0        
	//   58  118:invokevirtual   #902 <Method void View.setVisibility(int)>
				}
				setHWLayerAnimListenerIfAlpha(fragment.mView, animationoranimator);
	//   59  121:aload_1         
	//   60  122:getfield        #192 <Field View Fragment.mView>
	//   61  125:aload_3         
	//   62  126:invokestatic    #249 <Method void setHWLayerAnimListenerIfAlpha(View, FragmentManagerImpl$AnimationOrAnimator)>
				animationoranimator.animator.start();
	//   63  129:aload_3         
	//   64  130:getfield        #259 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   65  133:invokevirtual   #279 <Method void Animator.start()>
			} else
	//*  66  136:goto            211
			{
				if(animationoranimator != null)
	//*  67  139:aload_3         
	//*  68  140:ifnull          169
				{
					setHWLayerAnimListenerIfAlpha(fragment.mView, animationoranimator);
	//   69  143:aload_1         
	//   70  144:getfield        #192 <Field View Fragment.mView>
	//   71  147:aload_3         
	//   72  148:invokestatic    #249 <Method void setHWLayerAnimListenerIfAlpha(View, FragmentManagerImpl$AnimationOrAnimator)>
					fragment.mView.startAnimation(animationoranimator.animation);
	//   73  151:aload_1         
	//   74  152:getfield        #192 <Field View Fragment.mView>
	//   75  155:aload_3         
	//   76  156:getfield        #226 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   77  159:invokevirtual   #255 <Method void View.startAnimation(Animation)>
					animationoranimator.animation.start();
	//   78  162:aload_3         
	//   79  163:getfield        #226 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   80  166:invokevirtual   #903 <Method void Animation.start()>
				}
				byte byte0;
				if(fragment.mHidden && !fragment.isHideReplaced())
	//*  81  169:aload_1         
	//*  82  170:getfield        #195 <Field boolean Fragment.mHidden>
	//*  83  173:ifeq            189
	//*  84  176:aload_1         
	//*  85  177:invokevirtual   #895 <Method boolean Fragment.isHideReplaced()>
	//*  86  180:ifne            189
					byte0 = 8;
	//   87  183:bipush          8
	//   88  185:istore_2        
				else
	//*  89  186:goto            191
					byte0 = 0;
	//   90  189:iconst_0        
	//   91  190:istore_2        
				fragment.mView.setVisibility(((int) (byte0)));
	//   92  191:aload_1         
	//   93  192:getfield        #192 <Field View Fragment.mView>
	//   94  195:iload_2         
	//   95  196:invokevirtual   #902 <Method void View.setVisibility(int)>
				if(fragment.isHideReplaced())
	//*  96  199:aload_1         
	//*  97  200:invokevirtual   #895 <Method boolean Fragment.isHideReplaced()>
	//*  98  203:ifeq            211
					fragment.setHideReplaced(false);
	//   99  206:aload_1         
	//  100  207:iconst_0        
	//  101  208:invokevirtual   #898 <Method void Fragment.setHideReplaced(boolean)>
			}
		}
		if(fragment.mAdded && fragment.mHasMenu && fragment.mMenuVisible)
	//* 102  211:aload_1         
	//* 103  212:getfield        #594 <Field boolean Fragment.mAdded>
	//* 104  215:ifeq            237
	//* 105  218:aload_1         
	//* 106  219:getfield        #818 <Field boolean Fragment.mHasMenu>
	//* 107  222:ifeq            237
	//* 108  225:aload_1         
	//* 109  226:getfield        #821 <Field boolean Fragment.mMenuVisible>
	//* 110  229:ifeq            237
			mNeedMenuInvalidate = true;
	//  111  232:aload_0         
	//  112  233:iconst_1        
	//  113  234:putfield        #823 <Field boolean mNeedMenuInvalidate>
		fragment.mHiddenChanged = false;
	//  114  237:aload_1         
	//  115  238:iconst_0        
	//  116  239:putfield        #815 <Field boolean Fragment.mHiddenChanged>
		fragment.onHiddenChanged(fragment.mHidden);
	//  117  242:aload_1         
	//  118  243:aload_1         
	//  119  244:getfield        #195 <Field boolean Fragment.mHidden>
	//  120  247:invokevirtual   #906 <Method void Fragment.onHiddenChanged(boolean)>
	//  121  250:return          
	}

	public void detachFragment(Fragment fragment)
	{
		if(DEBUG)
	//*   0    0:getstatic       #791 <Field boolean DEBUG>
	//*   1    3:ifeq            39
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #305 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #306 <Method void StringBuilder()>
	//    5   13:astore_2        
			stringbuilder.append("detach: ");
	//    6   14:aload_2         
	//    7   15:ldc2            #909 <String "detach: ">
	//    8   18:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (fragment)));
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   14   28:ldc2            #544 <String "FragmentManager">
	//   15   31:aload_2         
	//   16   32:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   17   35:invokestatic    #799 <Method int Log.v(String, String)>
	//   18   38:pop             
		}
		if(!fragment.mDetached)
	//*  19   39:aload_1         
	//*  20   40:getfield        #806 <Field boolean Fragment.mDetached>
	//*  21   43:ifne            145
		{
			fragment.mDetached = true;
	//   22   46:aload_1         
	//   23   47:iconst_1        
	//   24   48:putfield        #806 <Field boolean Fragment.mDetached>
			if(fragment.mAdded)
	//*  25   51:aload_1         
	//*  26   52:getfield        #594 <Field boolean Fragment.mAdded>
	//*  27   55:ifeq            145
			{
				if(DEBUG)
	//*  28   58:getstatic       #791 <Field boolean DEBUG>
	//*  29   61:ifeq            97
				{
					StringBuilder stringbuilder1 = new StringBuilder();
	//   30   64:new             #305 <Class StringBuilder>
	//   31   67:dup             
	//   32   68:invokespecial   #306 <Method void StringBuilder()>
	//   33   71:astore_2        
					stringbuilder1.append("remove from detach: ");
	//   34   72:aload_2         
	//   35   73:ldc2            #911 <String "remove from detach: ">
	//   36   76:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   37   79:pop             
					stringbuilder1.append(((Object) (fragment)));
	//   38   80:aload_2         
	//   39   81:aload_1         
	//   40   82:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//   41   85:pop             
					Log.v("FragmentManager", stringbuilder1.toString());
	//   42   86:ldc2            #544 <String "FragmentManager">
	//   43   89:aload_2         
	//   44   90:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   45   93:invokestatic    #799 <Method int Log.v(String, String)>
	//   46   96:pop             
				}
				synchronized(mAdded)
	//*  47   97:aload_0         
	//*  48   98:getfield        #141 <Field ArrayList mAdded>
	//*  49  101:astore_2        
	//*  50  102:aload_2         
	//*  51  103:monitorenter    
				{
					mAdded.remove(((Object) (fragment)));
	//   52  104:aload_0         
	//   53  105:getfield        #141 <Field ArrayList mAdded>
	//   54  108:aload_1         
	//   55  109:invokevirtual   #913 <Method boolean ArrayList.remove(Object)>
	//   56  112:pop             
				}
	//   57  113:aload_2         
	//   58  114:monitorexit     
				if(fragment.mHasMenu && fragment.mMenuVisible)
	//*  59  115:aload_1         
	//*  60  116:getfield        #818 <Field boolean Fragment.mHasMenu>
	//*  61  119:ifeq            134
	//*  62  122:aload_1         
	//*  63  123:getfield        #821 <Field boolean Fragment.mMenuVisible>
	//*  64  126:ifeq            134
					mNeedMenuInvalidate = true;
	//   65  129:aload_0         
	//   66  130:iconst_1        
	//   67  131:putfield        #823 <Field boolean mNeedMenuInvalidate>
				fragment.mAdded = false;
	//   68  134:aload_1         
	//   69  135:iconst_0        
	//   70  136:putfield        #594 <Field boolean Fragment.mAdded>
				return;
	//   71  139:return          
			}
		}
		break MISSING_BLOCK_LABEL_145;
		fragment;
	//   72  140:astore_1        
		arraylist;
	//   73  141:aload_2         
		JVM INSTR monitorexit ;
	//   74  142:monitorexit     
		throw fragment;
	//   75  143:aload_1         
	//   76  144:athrow          
	//   77  145:return          
	}

	public void dispatchActivityCreated()
	{
		mStateSaved = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #916 <Field boolean mStateSaved>
		mStopped = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #918 <Field boolean mStopped>
		dispatchStateChange(2);
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:invokespecial   #920 <Method void dispatchStateChange(int)>
	//    9   15:return          
	}

	public void dispatchConfigurationChanged(Configuration configuration)
	{
		for(int i = 0; i < mAdded.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #141 <Field ArrayList mAdded>
	//*   5    7:invokevirtual   #169 <Method int ArrayList.size()>
	//*   6   10:icmpge          41
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #141 <Field ArrayList mAdded>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #175 <Class Fragment>
	//   12   24:astore_3        
			if(fragment != null)
	//*  13   25:aload_3         
	//*  14   26:ifnull          34
				fragment.performConfigurationChanged(configuration);
	//   15   29:aload_3         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #925 <Method void Fragment.performConfigurationChanged(Configuration)>
		}

	//   18   34:iload_2         
	//   19   35:iconst_1        
	//   20   36:iadd            
	//   21   37:istore_2        
	//*  22   38:goto            2
	//   23   41:return          
	}

	public boolean dispatchContextItemSelected(MenuItem menuitem)
	{
		if(mCurState < 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #148 <Field int mCurState>
	//*   2    4:iconst_1        
	//*   3    5:icmpge          10
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		for(int i = 0; i < mAdded.size(); i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:aload_0         
	//*  10   14:getfield        #141 <Field ArrayList mAdded>
	//*  11   17:invokevirtual   #169 <Method int ArrayList.size()>
	//*  12   20:icmpge          56
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//   13   23:aload_0         
	//   14   24:getfield        #141 <Field ArrayList mAdded>
	//   15   27:iload_2         
	//   16   28:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//   17   31:checkcast       #175 <Class Fragment>
	//   18   34:astore_3        
			if(fragment != null && fragment.performContextItemSelected(menuitem))
	//*  19   35:aload_3         
	//*  20   36:ifnull          49
	//*  21   39:aload_3         
	//*  22   40:aload_1         
	//*  23   41:invokevirtual   #930 <Method boolean Fragment.performContextItemSelected(MenuItem)>
	//*  24   44:ifeq            49
				return true;
	//   25   47:iconst_1        
	//   26   48:ireturn         
		}

	//   27   49:iload_2         
	//   28   50:iconst_1        
	//   29   51:iadd            
	//   30   52:istore_2        
	//*  31   53:goto            12
		return false;
	//   32   56:iconst_0        
	//   33   57:ireturn         
	}

	public void dispatchCreate()
	{
		mStateSaved = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #916 <Field boolean mStateSaved>
		mStopped = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #918 <Field boolean mStopped>
		dispatchStateChange(1);
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:invokespecial   #920 <Method void dispatchStateChange(int)>
	//    9   15:return          
	}

	public boolean dispatchCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
	{
		int i = mCurState;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field int mCurState>
	//    2    4:istore_3        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore          4
		if(i < 1)
	//*   5    8:iload_3         
	//*   6    9:iconst_1        
	//*   7   10:icmpge          15
			return false;
	//    8   13:iconst_0        
	//    9   14:ireturn         
		ArrayList arraylist = null;
	//   10   15:aconst_null     
	//   11   16:astore          7
		i = 0;
	//   12   18:iconst_0        
	//   13   19:istore_3        
		boolean flag1;
		boolean flag2;
		for(flag1 = false; i < mAdded.size(); flag1 = flag2)
	//*  14   20:iconst_0        
	//*  15   21:istore          5
	//*  16   23:iload_3         
	//*  17   24:aload_0         
	//*  18   25:getfield        #141 <Field ArrayList mAdded>
	//*  19   28:invokevirtual   #169 <Method int ArrayList.size()>
	//*  20   31:icmpge          122
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//   21   34:aload_0         
	//   22   35:getfield        #141 <Field ArrayList mAdded>
	//   23   38:iload_3         
	//   24   39:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//   25   42:checkcast       #175 <Class Fragment>
	//   26   45:astore          9
			ArrayList arraylist1 = arraylist;
	//   27   47:aload           7
	//   28   49:astore          8
			flag2 = flag1;
	//   29   51:iload           5
	//   30   53:istore          6
			if(fragment != null)
	//*  31   55:aload           9
	//*  32   57:ifnull          107
			{
				arraylist1 = arraylist;
	//   33   60:aload           7
	//   34   62:astore          8
				flag2 = flag1;
	//   35   64:iload           5
	//   36   66:istore          6
				if(fragment.performCreateOptionsMenu(menu, menuinflater))
	//*  37   68:aload           9
	//*  38   70:aload_1         
	//*  39   71:aload_2         
	//*  40   72:invokevirtual   #936 <Method boolean Fragment.performCreateOptionsMenu(Menu, MenuInflater)>
	//*  41   75:ifeq            107
				{
					arraylist1 = arraylist;
	//   42   78:aload           7
	//   43   80:astore          8
					if(arraylist == null)
	//*  44   82:aload           7
	//*  45   84:ifnonnull       96
						arraylist1 = new ArrayList();
	//   46   87:new             #138 <Class ArrayList>
	//   47   90:dup             
	//   48   91:invokespecial   #139 <Method void ArrayList()>
	//   49   94:astore          8
					arraylist1.add(((Object) (fragment)));
	//   50   96:aload           8
	//   51   98:aload           9
	//   52  100:invokevirtual   #678 <Method boolean ArrayList.add(Object)>
	//   53  103:pop             
					flag2 = true;
	//   54  104:iconst_1        
	//   55  105:istore          6
				}
			}
			i++;
	//   56  107:iload_3         
	//   57  108:iconst_1        
	//   58  109:iadd            
	//   59  110:istore_3        
			arraylist = arraylist1;
	//   60  111:aload           8
	//   61  113:astore          7
		}

	//   62  115:iload           6
	//   63  117:istore          5
	//*  64  119:goto            23
		if(mCreatedMenus != null)
	//*  65  122:aload_0         
	//*  66  123:getfield        #938 <Field ArrayList mCreatedMenus>
	//*  67  126:ifnull          180
		{
			for(int j = ((int) (flag)); j < mCreatedMenus.size(); j++)
	//*  68  129:iload           4
	//*  69  131:istore_3        
	//*  70  132:iload_3         
	//*  71  133:aload_0         
	//*  72  134:getfield        #938 <Field ArrayList mCreatedMenus>
	//*  73  137:invokevirtual   #169 <Method int ArrayList.size()>
	//*  74  140:icmpge          180
			{
				menu = ((Menu) ((Fragment)mCreatedMenus.get(j)));
	//   75  143:aload_0         
	//   76  144:getfield        #938 <Field ArrayList mCreatedMenus>
	//   77  147:iload_3         
	//   78  148:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//   79  151:checkcast       #175 <Class Fragment>
	//   80  154:astore_1        
				if(arraylist == null || !arraylist.contains(((Object) (menu))))
	//*  81  155:aload           7
	//*  82  157:ifnull          169
	//*  83  160:aload           7
	//*  84  162:aload_1         
	//*  85  163:invokevirtual   #809 <Method boolean ArrayList.contains(Object)>
	//*  86  166:ifne            173
					((Fragment) (menu)).onDestroyOptionsMenu();
	//   87  169:aload_1         
	//   88  170:invokevirtual   #941 <Method void Fragment.onDestroyOptionsMenu()>
			}

	//   89  173:iload_3         
	//   90  174:iconst_1        
	//   91  175:iadd            
	//   92  176:istore_3        
		}
	//*  93  177:goto            132
		mCreatedMenus = arraylist;
	//   94  180:aload_0         
	//   95  181:aload           7
	//   96  183:putfield        #938 <Field ArrayList mCreatedMenus>
		return flag1;
	//   97  186:iload           5
	//   98  188:ireturn         
	}

	public void dispatchDestroy()
	{
		mDestroyed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #944 <Field boolean mDestroyed>
		execPendingActions();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #340 <Method boolean execPendingActions()>
	//    5    9:pop             
		dispatchStateChange(0);
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:invokespecial   #920 <Method void dispatchStateChange(int)>
		mHost = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #369 <Field FragmentHostCallback mHost>
		mContainer = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #857 <Field FragmentContainer mContainer>
		mParent = null;
	//   15   25:aload_0         
	//   16   26:aconst_null     
	//   17   27:putfield        #859 <Field Fragment mParent>
	//   18   30:return          
	}

	public void dispatchDestroyView()
	{
		dispatchStateChange(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #920 <Method void dispatchStateChange(int)>
	//    3    5:return          
	}

	public void dispatchLowMemory()
	{
		for(int i = 0; i < mAdded.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #141 <Field ArrayList mAdded>
	//*   5    7:invokevirtual   #169 <Method int ArrayList.size()>
	//*   6   10:icmpge          40
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #141 <Field ArrayList mAdded>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #175 <Class Fragment>
	//   12   24:astore_2        
			if(fragment != null)
	//*  13   25:aload_2         
	//*  14   26:ifnull          33
				fragment.performLowMemory();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #949 <Method void Fragment.performLowMemory()>
		}

	//   17   33:iload_1         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:istore_1        
	//*  21   37:goto            2
	//   22   40:return          
	}

	public void dispatchMultiWindowModeChanged(boolean flag)
	{
		for(int i = mAdded.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #141 <Field ArrayList mAdded>
	//*   2    4:invokevirtual   #169 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            42
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    8   14:aload_0         
	//    9   15:getfield        #141 <Field ArrayList mAdded>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #175 <Class Fragment>
	//   13   25:astore_3        
			if(fragment != null)
	//*  14   26:aload_3         
	//*  15   27:ifnull          35
				fragment.performMultiWindowModeChanged(flag);
	//   16   30:aload_3         
	//   17   31:iload_1         
	//   18   32:invokevirtual   #953 <Method void Fragment.performMultiWindowModeChanged(boolean)>
		}

	//   19   35:iload_2         
	//   20   36:iconst_1        
	//   21   37:isub            
	//   22   38:istore_2        
	//*  23   39:goto            10
	//   24   42:return          
	}

	void dispatchOnFragmentActivityCreated(Fragment fragment, Bundle bundle, boolean flag)
	{
		Object obj = ((Object) (mParent));
	//    0    0:aload_0         
	//    1    1:getfield        #859 <Field Fragment mParent>
	//    2    4:astore          4
		if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          37
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5   11:aload           4
	//    6   13:invokevirtual   #958 <Method FragmentManager Fragment.getFragmentManager()>
	//    7   16:astore          4
			if(obj instanceof FragmentManagerImpl)
	//*   8   18:aload           4
	//*   9   20:instanceof      #2   <Class FragmentManagerImpl>
	//*  10   23:ifeq            37
				((FragmentManagerImpl)obj).dispatchOnFragmentActivityCreated(fragment, bundle, true);
	//   11   26:aload           4
	//   12   28:checkcast       #2   <Class FragmentManagerImpl>
	//   13   31:aload_1         
	//   14   32:aload_2         
	//   15   33:iconst_1        
	//   16   34:invokevirtual   #960 <Method void dispatchOnFragmentActivityCreated(Fragment, Bundle, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   17   37:aload_0         
	//   18   38:getfield        #146 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   19   41:invokevirtual   #961 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   20   44:astore          4
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   21   46:aload           4
	//   22   48:invokeinterface #720 <Method boolean Iterator.hasNext()>
	//   23   53:ifeq            94
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   24   56:aload           4
	//   25   58:invokeinterface #724 <Method Object Iterator.next()>
	//   26   63:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   27   66:astore          5
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  28   68:iload_3         
	//*  29   69:ifeq            80
	//*  30   72:aload           5
	//*  31   74:getfield        #964 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  32   77:ifeq            46
				fragmentlifecyclecallbacksholder.mCallback.onFragmentActivityCreated(((FragmentManager) (this)), fragment, bundle);
	//   33   80:aload           5
	//   34   82:getfield        #968 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   35   85:aload_0         
	//   36   86:aload_1         
	//   37   87:aload_2         
	//   38   88:invokevirtual   #974 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentActivityCreated(FragmentManager, Fragment, Bundle)>
		} while(true);
	//   39   91:goto            46
	//   40   94:return          
	}

	void dispatchOnFragmentAttached(Fragment fragment, Context context, boolean flag)
	{
		Object obj = ((Object) (mParent));
	//    0    0:aload_0         
	//    1    1:getfield        #859 <Field Fragment mParent>
	//    2    4:astore          4
		if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          37
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5   11:aload           4
	//    6   13:invokevirtual   #958 <Method FragmentManager Fragment.getFragmentManager()>
	//    7   16:astore          4
			if(obj instanceof FragmentManagerImpl)
	//*   8   18:aload           4
	//*   9   20:instanceof      #2   <Class FragmentManagerImpl>
	//*  10   23:ifeq            37
				((FragmentManagerImpl)obj).dispatchOnFragmentAttached(fragment, context, true);
	//   11   26:aload           4
	//   12   28:checkcast       #2   <Class FragmentManagerImpl>
	//   13   31:aload_1         
	//   14   32:aload_2         
	//   15   33:iconst_1        
	//   16   34:invokevirtual   #978 <Method void dispatchOnFragmentAttached(Fragment, Context, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   17   37:aload_0         
	//   18   38:getfield        #146 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   19   41:invokevirtual   #961 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   20   44:astore          4
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   21   46:aload           4
	//   22   48:invokeinterface #720 <Method boolean Iterator.hasNext()>
	//   23   53:ifeq            94
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   24   56:aload           4
	//   25   58:invokeinterface #724 <Method Object Iterator.next()>
	//   26   63:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   27   66:astore          5
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  28   68:iload_3         
	//*  29   69:ifeq            80
	//*  30   72:aload           5
	//*  31   74:getfield        #964 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  32   77:ifeq            46
				fragmentlifecyclecallbacksholder.mCallback.onFragmentAttached(((FragmentManager) (this)), fragment, context);
	//   33   80:aload           5
	//   34   82:getfield        #968 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   35   85:aload_0         
	//   36   86:aload_1         
	//   37   87:aload_2         
	//   38   88:invokevirtual   #982 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentAttached(FragmentManager, Fragment, Context)>
		} while(true);
	//   39   91:goto            46
	//   40   94:return          
	}

	void dispatchOnFragmentCreated(Fragment fragment, Bundle bundle, boolean flag)
	{
		Object obj = ((Object) (mParent));
	//    0    0:aload_0         
	//    1    1:getfield        #859 <Field Fragment mParent>
	//    2    4:astore          4
		if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          37
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5   11:aload           4
	//    6   13:invokevirtual   #958 <Method FragmentManager Fragment.getFragmentManager()>
	//    7   16:astore          4
			if(obj instanceof FragmentManagerImpl)
	//*   8   18:aload           4
	//*   9   20:instanceof      #2   <Class FragmentManagerImpl>
	//*  10   23:ifeq            37
				((FragmentManagerImpl)obj).dispatchOnFragmentCreated(fragment, bundle, true);
	//   11   26:aload           4
	//   12   28:checkcast       #2   <Class FragmentManagerImpl>
	//   13   31:aload_1         
	//   14   32:aload_2         
	//   15   33:iconst_1        
	//   16   34:invokevirtual   #985 <Method void dispatchOnFragmentCreated(Fragment, Bundle, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   17   37:aload_0         
	//   18   38:getfield        #146 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   19   41:invokevirtual   #961 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   20   44:astore          4
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   21   46:aload           4
	//   22   48:invokeinterface #720 <Method boolean Iterator.hasNext()>
	//   23   53:ifeq            94
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   24   56:aload           4
	//   25   58:invokeinterface #724 <Method Object Iterator.next()>
	//   26   63:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   27   66:astore          5
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  28   68:iload_3         
	//*  29   69:ifeq            80
	//*  30   72:aload           5
	//*  31   74:getfield        #964 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  32   77:ifeq            46
				fragmentlifecyclecallbacksholder.mCallback.onFragmentCreated(((FragmentManager) (this)), fragment, bundle);
	//   33   80:aload           5
	//   34   82:getfield        #968 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   35   85:aload_0         
	//   36   86:aload_1         
	//   37   87:aload_2         
	//   38   88:invokevirtual   #988 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentCreated(FragmentManager, Fragment, Bundle)>
		} while(true);
	//   39   91:goto            46
	//   40   94:return          
	}

	void dispatchOnFragmentDestroyed(Fragment fragment, boolean flag)
	{
		Object obj = ((Object) (mParent));
	//    0    0:aload_0         
	//    1    1:getfield        #859 <Field Fragment mParent>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          30
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5    9:aload_3         
	//    6   10:invokevirtual   #958 <Method FragmentManager Fragment.getFragmentManager()>
	//    7   13:astore_3        
			if(obj instanceof FragmentManagerImpl)
	//*   8   14:aload_3         
	//*   9   15:instanceof      #2   <Class FragmentManagerImpl>
	//*  10   18:ifeq            30
				((FragmentManagerImpl)obj).dispatchOnFragmentDestroyed(fragment, true);
	//   11   21:aload_3         
	//   12   22:checkcast       #2   <Class FragmentManagerImpl>
	//   13   25:aload_1         
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #991 <Method void dispatchOnFragmentDestroyed(Fragment, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   16   30:aload_0         
	//   17   31:getfield        #146 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   34:invokevirtual   #961 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   37:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   20   38:aload_3         
	//   21   39:invokeinterface #720 <Method boolean Iterator.hasNext()>
	//   22   44:ifeq            83
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   23   47:aload_3         
	//   24   48:invokeinterface #724 <Method Object Iterator.next()>
	//   25   53:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   26   56:astore          4
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  27   58:iload_2         
	//*  28   59:ifeq            70
	//*  29   62:aload           4
	//*  30   64:getfield        #964 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  31   67:ifeq            38
				fragmentlifecyclecallbacksholder.mCallback.onFragmentDestroyed(((FragmentManager) (this)), fragment);
	//   32   70:aload           4
	//   33   72:getfield        #968 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   34   75:aload_0         
	//   35   76:aload_1         
	//   36   77:invokevirtual   #995 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentDestroyed(FragmentManager, Fragment)>
		} while(true);
	//   37   80:goto            38
	//   38   83:return          
	}

	void dispatchOnFragmentDetached(Fragment fragment, boolean flag)
	{
		Object obj = ((Object) (mParent));
	//    0    0:aload_0         
	//    1    1:getfield        #859 <Field Fragment mParent>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          30
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5    9:aload_3         
	//    6   10:invokevirtual   #958 <Method FragmentManager Fragment.getFragmentManager()>
	//    7   13:astore_3        
			if(obj instanceof FragmentManagerImpl)
	//*   8   14:aload_3         
	//*   9   15:instanceof      #2   <Class FragmentManagerImpl>
	//*  10   18:ifeq            30
				((FragmentManagerImpl)obj).dispatchOnFragmentDetached(fragment, true);
	//   11   21:aload_3         
	//   12   22:checkcast       #2   <Class FragmentManagerImpl>
	//   13   25:aload_1         
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #998 <Method void dispatchOnFragmentDetached(Fragment, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   16   30:aload_0         
	//   17   31:getfield        #146 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   34:invokevirtual   #961 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   37:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   20   38:aload_3         
	//   21   39:invokeinterface #720 <Method boolean Iterator.hasNext()>
	//   22   44:ifeq            83
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   23   47:aload_3         
	//   24   48:invokeinterface #724 <Method Object Iterator.next()>
	//   25   53:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   26   56:astore          4
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  27   58:iload_2         
	//*  28   59:ifeq            70
	//*  29   62:aload           4
	//*  30   64:getfield        #964 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  31   67:ifeq            38
				fragmentlifecyclecallbacksholder.mCallback.onFragmentDetached(((FragmentManager) (this)), fragment);
	//   32   70:aload           4
	//   33   72:getfield        #968 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   34   75:aload_0         
	//   35   76:aload_1         
	//   36   77:invokevirtual   #1001 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentDetached(FragmentManager, Fragment)>
		} while(true);
	//   37   80:goto            38
	//   38   83:return          
	}

	void dispatchOnFragmentPaused(Fragment fragment, boolean flag)
	{
		Object obj = ((Object) (mParent));
	//    0    0:aload_0         
	//    1    1:getfield        #859 <Field Fragment mParent>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          30
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5    9:aload_3         
	//    6   10:invokevirtual   #958 <Method FragmentManager Fragment.getFragmentManager()>
	//    7   13:astore_3        
			if(obj instanceof FragmentManagerImpl)
	//*   8   14:aload_3         
	//*   9   15:instanceof      #2   <Class FragmentManagerImpl>
	//*  10   18:ifeq            30
				((FragmentManagerImpl)obj).dispatchOnFragmentPaused(fragment, true);
	//   11   21:aload_3         
	//   12   22:checkcast       #2   <Class FragmentManagerImpl>
	//   13   25:aload_1         
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #1004 <Method void dispatchOnFragmentPaused(Fragment, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   16   30:aload_0         
	//   17   31:getfield        #146 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   34:invokevirtual   #961 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   37:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   20   38:aload_3         
	//   21   39:invokeinterface #720 <Method boolean Iterator.hasNext()>
	//   22   44:ifeq            83
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   23   47:aload_3         
	//   24   48:invokeinterface #724 <Method Object Iterator.next()>
	//   25   53:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   26   56:astore          4
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  27   58:iload_2         
	//*  28   59:ifeq            70
	//*  29   62:aload           4
	//*  30   64:getfield        #964 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  31   67:ifeq            38
				fragmentlifecyclecallbacksholder.mCallback.onFragmentPaused(((FragmentManager) (this)), fragment);
	//   32   70:aload           4
	//   33   72:getfield        #968 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   34   75:aload_0         
	//   35   76:aload_1         
	//   36   77:invokevirtual   #1007 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentPaused(FragmentManager, Fragment)>
		} while(true);
	//   37   80:goto            38
	//   38   83:return          
	}

	void dispatchOnFragmentPreAttached(Fragment fragment, Context context, boolean flag)
	{
		Object obj = ((Object) (mParent));
	//    0    0:aload_0         
	//    1    1:getfield        #859 <Field Fragment mParent>
	//    2    4:astore          4
		if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          37
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5   11:aload           4
	//    6   13:invokevirtual   #958 <Method FragmentManager Fragment.getFragmentManager()>
	//    7   16:astore          4
			if(obj instanceof FragmentManagerImpl)
	//*   8   18:aload           4
	//*   9   20:instanceof      #2   <Class FragmentManagerImpl>
	//*  10   23:ifeq            37
				((FragmentManagerImpl)obj).dispatchOnFragmentPreAttached(fragment, context, true);
	//   11   26:aload           4
	//   12   28:checkcast       #2   <Class FragmentManagerImpl>
	//   13   31:aload_1         
	//   14   32:aload_2         
	//   15   33:iconst_1        
	//   16   34:invokevirtual   #1010 <Method void dispatchOnFragmentPreAttached(Fragment, Context, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   17   37:aload_0         
	//   18   38:getfield        #146 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   19   41:invokevirtual   #961 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   20   44:astore          4
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   21   46:aload           4
	//   22   48:invokeinterface #720 <Method boolean Iterator.hasNext()>
	//   23   53:ifeq            94
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   24   56:aload           4
	//   25   58:invokeinterface #724 <Method Object Iterator.next()>
	//   26   63:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   27   66:astore          5
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  28   68:iload_3         
	//*  29   69:ifeq            80
	//*  30   72:aload           5
	//*  31   74:getfield        #964 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  32   77:ifeq            46
				fragmentlifecyclecallbacksholder.mCallback.onFragmentPreAttached(((FragmentManager) (this)), fragment, context);
	//   33   80:aload           5
	//   34   82:getfield        #968 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   35   85:aload_0         
	//   36   86:aload_1         
	//   37   87:aload_2         
	//   38   88:invokevirtual   #1013 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentPreAttached(FragmentManager, Fragment, Context)>
		} while(true);
	//   39   91:goto            46
	//   40   94:return          
	}

	void dispatchOnFragmentPreCreated(Fragment fragment, Bundle bundle, boolean flag)
	{
		Object obj = ((Object) (mParent));
	//    0    0:aload_0         
	//    1    1:getfield        #859 <Field Fragment mParent>
	//    2    4:astore          4
		if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          37
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5   11:aload           4
	//    6   13:invokevirtual   #958 <Method FragmentManager Fragment.getFragmentManager()>
	//    7   16:astore          4
			if(obj instanceof FragmentManagerImpl)
	//*   8   18:aload           4
	//*   9   20:instanceof      #2   <Class FragmentManagerImpl>
	//*  10   23:ifeq            37
				((FragmentManagerImpl)obj).dispatchOnFragmentPreCreated(fragment, bundle, true);
	//   11   26:aload           4
	//   12   28:checkcast       #2   <Class FragmentManagerImpl>
	//   13   31:aload_1         
	//   14   32:aload_2         
	//   15   33:iconst_1        
	//   16   34:invokevirtual   #1016 <Method void dispatchOnFragmentPreCreated(Fragment, Bundle, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   17   37:aload_0         
	//   18   38:getfield        #146 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   19   41:invokevirtual   #961 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   20   44:astore          4
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   21   46:aload           4
	//   22   48:invokeinterface #720 <Method boolean Iterator.hasNext()>
	//   23   53:ifeq            94
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   24   56:aload           4
	//   25   58:invokeinterface #724 <Method Object Iterator.next()>
	//   26   63:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   27   66:astore          5
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  28   68:iload_3         
	//*  29   69:ifeq            80
	//*  30   72:aload           5
	//*  31   74:getfield        #964 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  32   77:ifeq            46
				fragmentlifecyclecallbacksholder.mCallback.onFragmentPreCreated(((FragmentManager) (this)), fragment, bundle);
	//   33   80:aload           5
	//   34   82:getfield        #968 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   35   85:aload_0         
	//   36   86:aload_1         
	//   37   87:aload_2         
	//   38   88:invokevirtual   #1019 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentPreCreated(FragmentManager, Fragment, Bundle)>
		} while(true);
	//   39   91:goto            46
	//   40   94:return          
	}

	void dispatchOnFragmentResumed(Fragment fragment, boolean flag)
	{
		Object obj = ((Object) (mParent));
	//    0    0:aload_0         
	//    1    1:getfield        #859 <Field Fragment mParent>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          30
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5    9:aload_3         
	//    6   10:invokevirtual   #958 <Method FragmentManager Fragment.getFragmentManager()>
	//    7   13:astore_3        
			if(obj instanceof FragmentManagerImpl)
	//*   8   14:aload_3         
	//*   9   15:instanceof      #2   <Class FragmentManagerImpl>
	//*  10   18:ifeq            30
				((FragmentManagerImpl)obj).dispatchOnFragmentResumed(fragment, true);
	//   11   21:aload_3         
	//   12   22:checkcast       #2   <Class FragmentManagerImpl>
	//   13   25:aload_1         
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #1022 <Method void dispatchOnFragmentResumed(Fragment, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   16   30:aload_0         
	//   17   31:getfield        #146 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   34:invokevirtual   #961 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   37:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   20   38:aload_3         
	//   21   39:invokeinterface #720 <Method boolean Iterator.hasNext()>
	//   22   44:ifeq            83
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   23   47:aload_3         
	//   24   48:invokeinterface #724 <Method Object Iterator.next()>
	//   25   53:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   26   56:astore          4
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  27   58:iload_2         
	//*  28   59:ifeq            70
	//*  29   62:aload           4
	//*  30   64:getfield        #964 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  31   67:ifeq            38
				fragmentlifecyclecallbacksholder.mCallback.onFragmentResumed(((FragmentManager) (this)), fragment);
	//   32   70:aload           4
	//   33   72:getfield        #968 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   34   75:aload_0         
	//   35   76:aload_1         
	//   36   77:invokevirtual   #1025 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentResumed(FragmentManager, Fragment)>
		} while(true);
	//   37   80:goto            38
	//   38   83:return          
	}

	void dispatchOnFragmentSaveInstanceState(Fragment fragment, Bundle bundle, boolean flag)
	{
		Object obj = ((Object) (mParent));
	//    0    0:aload_0         
	//    1    1:getfield        #859 <Field Fragment mParent>
	//    2    4:astore          4
		if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          37
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5   11:aload           4
	//    6   13:invokevirtual   #958 <Method FragmentManager Fragment.getFragmentManager()>
	//    7   16:astore          4
			if(obj instanceof FragmentManagerImpl)
	//*   8   18:aload           4
	//*   9   20:instanceof      #2   <Class FragmentManagerImpl>
	//*  10   23:ifeq            37
				((FragmentManagerImpl)obj).dispatchOnFragmentSaveInstanceState(fragment, bundle, true);
	//   11   26:aload           4
	//   12   28:checkcast       #2   <Class FragmentManagerImpl>
	//   13   31:aload_1         
	//   14   32:aload_2         
	//   15   33:iconst_1        
	//   16   34:invokevirtual   #1028 <Method void dispatchOnFragmentSaveInstanceState(Fragment, Bundle, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   17   37:aload_0         
	//   18   38:getfield        #146 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   19   41:invokevirtual   #961 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   20   44:astore          4
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   21   46:aload           4
	//   22   48:invokeinterface #720 <Method boolean Iterator.hasNext()>
	//   23   53:ifeq            94
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   24   56:aload           4
	//   25   58:invokeinterface #724 <Method Object Iterator.next()>
	//   26   63:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   27   66:astore          5
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  28   68:iload_3         
	//*  29   69:ifeq            80
	//*  30   72:aload           5
	//*  31   74:getfield        #964 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  32   77:ifeq            46
				fragmentlifecyclecallbacksholder.mCallback.onFragmentSaveInstanceState(((FragmentManager) (this)), fragment, bundle);
	//   33   80:aload           5
	//   34   82:getfield        #968 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   35   85:aload_0         
	//   36   86:aload_1         
	//   37   87:aload_2         
	//   38   88:invokevirtual   #1031 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentSaveInstanceState(FragmentManager, Fragment, Bundle)>
		} while(true);
	//   39   91:goto            46
	//   40   94:return          
	}

	void dispatchOnFragmentStarted(Fragment fragment, boolean flag)
	{
		Object obj = ((Object) (mParent));
	//    0    0:aload_0         
	//    1    1:getfield        #859 <Field Fragment mParent>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          30
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5    9:aload_3         
	//    6   10:invokevirtual   #958 <Method FragmentManager Fragment.getFragmentManager()>
	//    7   13:astore_3        
			if(obj instanceof FragmentManagerImpl)
	//*   8   14:aload_3         
	//*   9   15:instanceof      #2   <Class FragmentManagerImpl>
	//*  10   18:ifeq            30
				((FragmentManagerImpl)obj).dispatchOnFragmentStarted(fragment, true);
	//   11   21:aload_3         
	//   12   22:checkcast       #2   <Class FragmentManagerImpl>
	//   13   25:aload_1         
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #1034 <Method void dispatchOnFragmentStarted(Fragment, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   16   30:aload_0         
	//   17   31:getfield        #146 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   34:invokevirtual   #961 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   37:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   20   38:aload_3         
	//   21   39:invokeinterface #720 <Method boolean Iterator.hasNext()>
	//   22   44:ifeq            83
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   23   47:aload_3         
	//   24   48:invokeinterface #724 <Method Object Iterator.next()>
	//   25   53:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   26   56:astore          4
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  27   58:iload_2         
	//*  28   59:ifeq            70
	//*  29   62:aload           4
	//*  30   64:getfield        #964 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  31   67:ifeq            38
				fragmentlifecyclecallbacksholder.mCallback.onFragmentStarted(((FragmentManager) (this)), fragment);
	//   32   70:aload           4
	//   33   72:getfield        #968 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   34   75:aload_0         
	//   35   76:aload_1         
	//   36   77:invokevirtual   #1037 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentStarted(FragmentManager, Fragment)>
		} while(true);
	//   37   80:goto            38
	//   38   83:return          
	}

	void dispatchOnFragmentStopped(Fragment fragment, boolean flag)
	{
		Object obj = ((Object) (mParent));
	//    0    0:aload_0         
	//    1    1:getfield        #859 <Field Fragment mParent>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          30
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5    9:aload_3         
	//    6   10:invokevirtual   #958 <Method FragmentManager Fragment.getFragmentManager()>
	//    7   13:astore_3        
			if(obj instanceof FragmentManagerImpl)
	//*   8   14:aload_3         
	//*   9   15:instanceof      #2   <Class FragmentManagerImpl>
	//*  10   18:ifeq            30
				((FragmentManagerImpl)obj).dispatchOnFragmentStopped(fragment, true);
	//   11   21:aload_3         
	//   12   22:checkcast       #2   <Class FragmentManagerImpl>
	//   13   25:aload_1         
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #1040 <Method void dispatchOnFragmentStopped(Fragment, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   16   30:aload_0         
	//   17   31:getfield        #146 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   34:invokevirtual   #961 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   37:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   20   38:aload_3         
	//   21   39:invokeinterface #720 <Method boolean Iterator.hasNext()>
	//   22   44:ifeq            83
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   23   47:aload_3         
	//   24   48:invokeinterface #724 <Method Object Iterator.next()>
	//   25   53:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   26   56:astore          4
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  27   58:iload_2         
	//*  28   59:ifeq            70
	//*  29   62:aload           4
	//*  30   64:getfield        #964 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  31   67:ifeq            38
				fragmentlifecyclecallbacksholder.mCallback.onFragmentStopped(((FragmentManager) (this)), fragment);
	//   32   70:aload           4
	//   33   72:getfield        #968 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   34   75:aload_0         
	//   35   76:aload_1         
	//   36   77:invokevirtual   #1043 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentStopped(FragmentManager, Fragment)>
		} while(true);
	//   37   80:goto            38
	//   38   83:return          
	}

	void dispatchOnFragmentViewCreated(Fragment fragment, View view, Bundle bundle, boolean flag)
	{
		Object obj = ((Object) (mParent));
	//    0    0:aload_0         
	//    1    1:getfield        #859 <Field Fragment mParent>
	//    2    4:astore          5
		if(obj != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          38
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5   11:aload           5
	//    6   13:invokevirtual   #958 <Method FragmentManager Fragment.getFragmentManager()>
	//    7   16:astore          5
			if(obj instanceof FragmentManagerImpl)
	//*   8   18:aload           5
	//*   9   20:instanceof      #2   <Class FragmentManagerImpl>
	//*  10   23:ifeq            38
				((FragmentManagerImpl)obj).dispatchOnFragmentViewCreated(fragment, view, bundle, true);
	//   11   26:aload           5
	//   12   28:checkcast       #2   <Class FragmentManagerImpl>
	//   13   31:aload_1         
	//   14   32:aload_2         
	//   15   33:aload_3         
	//   16   34:iconst_1        
	//   17   35:invokevirtual   #1047 <Method void dispatchOnFragmentViewCreated(Fragment, View, Bundle, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   18   38:aload_0         
	//   19   39:getfield        #146 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   20   42:invokevirtual   #961 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   21   45:astore          5
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   22   47:aload           5
	//   23   49:invokeinterface #720 <Method boolean Iterator.hasNext()>
	//   24   54:ifeq            97
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   25   57:aload           5
	//   26   59:invokeinterface #724 <Method Object Iterator.next()>
	//   27   64:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   28   67:astore          6
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  29   69:iload           4
	//*  30   71:ifeq            82
	//*  31   74:aload           6
	//*  32   76:getfield        #964 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  33   79:ifeq            47
				fragmentlifecyclecallbacksholder.mCallback.onFragmentViewCreated(((FragmentManager) (this)), fragment, view, bundle);
	//   34   82:aload           6
	//   35   84:getfield        #968 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   36   87:aload_0         
	//   37   88:aload_1         
	//   38   89:aload_2         
	//   39   90:aload_3         
	//   40   91:invokevirtual   #1051 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentViewCreated(FragmentManager, Fragment, View, Bundle)>
		} while(true);
	//   41   94:goto            47
	//   42   97:return          
	}

	void dispatchOnFragmentViewDestroyed(Fragment fragment, boolean flag)
	{
		Object obj = ((Object) (mParent));
	//    0    0:aload_0         
	//    1    1:getfield        #859 <Field Fragment mParent>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          30
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5    9:aload_3         
	//    6   10:invokevirtual   #958 <Method FragmentManager Fragment.getFragmentManager()>
	//    7   13:astore_3        
			if(obj instanceof FragmentManagerImpl)
	//*   8   14:aload_3         
	//*   9   15:instanceof      #2   <Class FragmentManagerImpl>
	//*  10   18:ifeq            30
				((FragmentManagerImpl)obj).dispatchOnFragmentViewDestroyed(fragment, true);
	//   11   21:aload_3         
	//   12   22:checkcast       #2   <Class FragmentManagerImpl>
	//   13   25:aload_1         
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #1054 <Method void dispatchOnFragmentViewDestroyed(Fragment, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   16   30:aload_0         
	//   17   31:getfield        #146 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   34:invokevirtual   #961 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   37:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   20   38:aload_3         
	//   21   39:invokeinterface #720 <Method boolean Iterator.hasNext()>
	//   22   44:ifeq            83
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   23   47:aload_3         
	//   24   48:invokeinterface #724 <Method Object Iterator.next()>
	//   25   53:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   26   56:astore          4
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  27   58:iload_2         
	//*  28   59:ifeq            70
	//*  29   62:aload           4
	//*  30   64:getfield        #964 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  31   67:ifeq            38
				fragmentlifecyclecallbacksholder.mCallback.onFragmentViewDestroyed(((FragmentManager) (this)), fragment);
	//   32   70:aload           4
	//   33   72:getfield        #968 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   34   75:aload_0         
	//   35   76:aload_1         
	//   36   77:invokevirtual   #1057 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentViewDestroyed(FragmentManager, Fragment)>
		} while(true);
	//   37   80:goto            38
	//   38   83:return          
	}

	public boolean dispatchOptionsItemSelected(MenuItem menuitem)
	{
		if(mCurState < 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #148 <Field int mCurState>
	//*   2    4:iconst_1        
	//*   3    5:icmpge          10
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		for(int i = 0; i < mAdded.size(); i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:aload_0         
	//*  10   14:getfield        #141 <Field ArrayList mAdded>
	//*  11   17:invokevirtual   #169 <Method int ArrayList.size()>
	//*  12   20:icmpge          56
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//   13   23:aload_0         
	//   14   24:getfield        #141 <Field ArrayList mAdded>
	//   15   27:iload_2         
	//   16   28:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//   17   31:checkcast       #175 <Class Fragment>
	//   18   34:astore_3        
			if(fragment != null && fragment.performOptionsItemSelected(menuitem))
	//*  19   35:aload_3         
	//*  20   36:ifnull          49
	//*  21   39:aload_3         
	//*  22   40:aload_1         
	//*  23   41:invokevirtual   #1061 <Method boolean Fragment.performOptionsItemSelected(MenuItem)>
	//*  24   44:ifeq            49
				return true;
	//   25   47:iconst_1        
	//   26   48:ireturn         
		}

	//   27   49:iload_2         
	//   28   50:iconst_1        
	//   29   51:iadd            
	//   30   52:istore_2        
	//*  31   53:goto            12
		return false;
	//   32   56:iconst_0        
	//   33   57:ireturn         
	}

	public void dispatchOptionsMenuClosed(Menu menu)
	{
		if(mCurState < 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #148 <Field int mCurState>
	//*   2    4:iconst_1        
	//*   3    5:icmpge          9
			return;
	//    4    8:return          
		for(int i = 0; i < mAdded.size(); i++)
	//*   5    9:iconst_0        
	//*   6   10:istore_2        
	//*   7   11:iload_2         
	//*   8   12:aload_0         
	//*   9   13:getfield        #141 <Field ArrayList mAdded>
	//*  10   16:invokevirtual   #169 <Method int ArrayList.size()>
	//*  11   19:icmpge          50
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//   12   22:aload_0         
	//   13   23:getfield        #141 <Field ArrayList mAdded>
	//   14   26:iload_2         
	//   15   27:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//   16   30:checkcast       #175 <Class Fragment>
	//   17   33:astore_3        
			if(fragment != null)
	//*  18   34:aload_3         
	//*  19   35:ifnull          43
				fragment.performOptionsMenuClosed(menu);
	//   20   38:aload_3         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #1066 <Method void Fragment.performOptionsMenuClosed(Menu)>
		}

	//   23   43:iload_2         
	//   24   44:iconst_1        
	//   25   45:iadd            
	//   26   46:istore_2        
	//*  27   47:goto            11
	//   28   50:return          
	}

	public void dispatchPause()
	{
		dispatchStateChange(3);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:invokespecial   #920 <Method void dispatchStateChange(int)>
	//    3    5:return          
	}

	public void dispatchPictureInPictureModeChanged(boolean flag)
	{
		for(int i = mAdded.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #141 <Field ArrayList mAdded>
	//*   2    4:invokevirtual   #169 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            42
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    8   14:aload_0         
	//    9   15:getfield        #141 <Field ArrayList mAdded>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #175 <Class Fragment>
	//   13   25:astore_3        
			if(fragment != null)
	//*  14   26:aload_3         
	//*  15   27:ifnull          35
				fragment.performPictureInPictureModeChanged(flag);
	//   16   30:aload_3         
	//   17   31:iload_1         
	//   18   32:invokevirtual   #1071 <Method void Fragment.performPictureInPictureModeChanged(boolean)>
		}

	//   19   35:iload_2         
	//   20   36:iconst_1        
	//   21   37:isub            
	//   22   38:istore_2        
	//*  23   39:goto            10
	//   24   42:return          
	}

	public boolean dispatchPrepareOptionsMenu(Menu menu)
	{
		int j = mCurState;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field int mCurState>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		if(j < 1)
	//*   5    7:iload_3         
	//*   6    8:iconst_1        
	//*   7    9:icmpge          14
			return false;
	//    8   12:iconst_0        
	//    9   13:ireturn         
		boolean flag;
		boolean flag1;
		for(flag = false; i < mAdded.size(); flag = flag1)
	//*  10   14:iconst_0        
	//*  11   15:istore          4
	//*  12   17:iload_2         
	//*  13   18:aload_0         
	//*  14   19:getfield        #141 <Field ArrayList mAdded>
	//*  15   22:invokevirtual   #169 <Method int ArrayList.size()>
	//*  16   25:icmpge          77
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//   17   28:aload_0         
	//   18   29:getfield        #141 <Field ArrayList mAdded>
	//   19   32:iload_2         
	//   20   33:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//   21   36:checkcast       #175 <Class Fragment>
	//   22   39:astore          6
			flag1 = flag;
	//   23   41:iload           4
	//   24   43:istore          5
			if(fragment != null)
	//*  25   45:aload           6
	//*  26   47:ifnull          66
			{
				flag1 = flag;
	//   27   50:iload           4
	//   28   52:istore          5
				if(fragment.performPrepareOptionsMenu(menu))
	//*  29   54:aload           6
	//*  30   56:aload_1         
	//*  31   57:invokevirtual   #1076 <Method boolean Fragment.performPrepareOptionsMenu(Menu)>
	//*  32   60:ifeq            66
					flag1 = true;
	//   33   63:iconst_1        
	//   34   64:istore          5
			}
			i++;
	//   35   66:iload_2         
	//   36   67:iconst_1        
	//   37   68:iadd            
	//   38   69:istore_2        
		}

	//   39   70:iload           5
	//   40   72:istore          4
	//*  41   74:goto            17
		return flag;
	//   42   77:iload           4
	//   43   79:ireturn         
	}

	public void dispatchResume()
	{
		mStateSaved = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #916 <Field boolean mStateSaved>
		mStopped = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #918 <Field boolean mStopped>
		dispatchStateChange(4);
	//    6   10:aload_0         
	//    7   11:iconst_4        
	//    8   12:invokespecial   #920 <Method void dispatchStateChange(int)>
	//    9   15:return          
	}

	public void dispatchStart()
	{
		mStateSaved = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #916 <Field boolean mStateSaved>
		mStopped = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #918 <Field boolean mStopped>
		dispatchStateChange(3);
	//    6   10:aload_0         
	//    7   11:iconst_3        
	//    8   12:invokespecial   #920 <Method void dispatchStateChange(int)>
	//    9   15:return          
	}

	public void dispatchStop()
	{
		mStopped = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #918 <Field boolean mStopped>
		dispatchStateChange(2);
	//    3    5:aload_0         
	//    4    6:iconst_2        
	//    5    7:invokespecial   #920 <Method void dispatchStateChange(int)>
	//    6   10:return          
	}

	void doPendingDeferredStart()
	{
		if(mHavePendingDeferredStart)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1081 <Field boolean mHavePendingDeferredStart>
	//*   2    4:ifeq            16
		{
			mHavePendingDeferredStart = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #1081 <Field boolean mHavePendingDeferredStart>
			startPendingDeferredFragments();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #1084 <Method void startPendingDeferredFragments()>
		}
	//    8   16:return          
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		boolean flag;
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #305 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #306 <Method void StringBuilder()>
	//    3    7:astore          8
		((StringBuilder) (obj)).append(s);
	//    4    9:aload           8
	//    5   11:aload_1         
	//    6   12:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append("    ");
	//    8   16:aload           8
	//    9   18:ldc2            #1086 <String "    ">
	//   10   21:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   12   25:aload           8
	//   13   27:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   14   30:astore          8
		Object obj1 = ((Object) (mActive));
	//   15   32:aload_0         
	//   16   33:getfield        #283 <Field SparseArray mActive>
	//   17   36:astore          9
		flag = false;
	//   18   38:iconst_0        
	//   19   39:istore          6
		if(obj1 != null)
	//*  20   41:aload           9
	//*  21   43:ifnull          168
		{
			int k1 = ((SparseArray) (obj1)).size();
	//   22   46:aload           9
	//   23   48:invokevirtual   #286 <Method int SparseArray.size()>
	//   24   51:istore          7
			if(k1 > 0)
	//*  25   53:iload           7
	//*  26   55:ifle            168
			{
				printwriter.print(s);
	//   27   58:aload_3         
	//   28   59:aload_1         
	//   29   60:invokevirtual   #1089 <Method void PrintWriter.print(String)>
				printwriter.print("Active Fragments in ");
	//   30   63:aload_3         
	//   31   64:ldc2            #1091 <String "Active Fragments in ">
	//   32   67:invokevirtual   #1089 <Method void PrintWriter.print(String)>
				printwriter.print(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//   33   70:aload_3         
	//   34   71:aload_0         
	//   35   72:invokestatic    #1096 <Method int System.identityHashCode(Object)>
	//   36   75:invokestatic    #1100 <Method String Integer.toHexString(int)>
	//   37   78:invokevirtual   #1089 <Method void PrintWriter.print(String)>
				printwriter.println(":");
	//   38   81:aload_3         
	//   39   82:ldc2            #1102 <String ":">
	//   40   85:invokevirtual   #1105 <Method void PrintWriter.println(String)>
				for(int i = 0; i < k1; i++)
	//*  41   88:iconst_0        
	//*  42   89:istore          5
	//*  43   91:iload           5
	//*  44   93:iload           7
	//*  45   95:icmpge          168
				{
					obj1 = ((Object) ((Fragment)mActive.valueAt(i)));
	//   46   98:aload_0         
	//   47   99:getfield        #283 <Field SparseArray mActive>
	//   48  102:iload           5
	//   49  104:invokevirtual   #289 <Method Object SparseArray.valueAt(int)>
	//   50  107:checkcast       #175 <Class Fragment>
	//   51  110:astore          9
					printwriter.print(s);
	//   52  112:aload_3         
	//   53  113:aload_1         
	//   54  114:invokevirtual   #1089 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//   55  117:aload_3         
	//   56  118:ldc2            #1107 <String "  #">
	//   57  121:invokevirtual   #1089 <Method void PrintWriter.print(String)>
					printwriter.print(i);
	//   58  124:aload_3         
	//   59  125:iload           5
	//   60  127:invokevirtual   #1109 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//   61  130:aload_3         
	//   62  131:ldc2            #1111 <String ": ">
	//   63  134:invokevirtual   #1089 <Method void PrintWriter.print(String)>
					printwriter.println(obj1);
	//   64  137:aload_3         
	//   65  138:aload           9
	//   66  140:invokevirtual   #1113 <Method void PrintWriter.println(Object)>
					if(obj1 != null)
	//*  67  143:aload           9
	//*  68  145:ifnull          159
						((Fragment) (obj1)).dump(((String) (obj)), filedescriptor, printwriter, as);
	//   69  148:aload           9
	//   70  150:aload           8
	//   71  152:aload_2         
	//   72  153:aload_3         
	//   73  154:aload           4
	//   74  156:invokevirtual   #1114 <Method void Fragment.dump(String, FileDescriptor, PrintWriter, String[])>
				}

	//   75  159:iload           5
	//   76  161:iconst_1        
	//   77  162:iadd            
	//   78  163:istore          5
			}
		}
	//*  79  165:goto            91
		int l1 = mAdded.size();
	//   80  168:aload_0         
	//   81  169:getfield        #141 <Field ArrayList mAdded>
	//   82  172:invokevirtual   #169 <Method int ArrayList.size()>
	//   83  175:istore          7
		if(l1 > 0)
	//*  84  177:iload           7
	//*  85  179:ifle            261
		{
			printwriter.print(s);
	//   86  182:aload_3         
	//   87  183:aload_1         
	//   88  184:invokevirtual   #1089 <Method void PrintWriter.print(String)>
			printwriter.println("Added Fragments:");
	//   89  187:aload_3         
	//   90  188:ldc2            #1116 <String "Added Fragments:">
	//   91  191:invokevirtual   #1105 <Method void PrintWriter.println(String)>
			for(int j = 0; j < l1; j++)
	//*  92  194:iconst_0        
	//*  93  195:istore          5
	//*  94  197:iload           5
	//*  95  199:iload           7
	//*  96  201:icmpge          261
			{
				obj1 = ((Object) ((Fragment)mAdded.get(j)));
	//   97  204:aload_0         
	//   98  205:getfield        #141 <Field ArrayList mAdded>
	//   99  208:iload           5
	//  100  210:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//  101  213:checkcast       #175 <Class Fragment>
	//  102  216:astore          9
				printwriter.print(s);
	//  103  218:aload_3         
	//  104  219:aload_1         
	//  105  220:invokevirtual   #1089 <Method void PrintWriter.print(String)>
				printwriter.print("  #");
	//  106  223:aload_3         
	//  107  224:ldc2            #1107 <String "  #">
	//  108  227:invokevirtual   #1089 <Method void PrintWriter.print(String)>
				printwriter.print(j);
	//  109  230:aload_3         
	//  110  231:iload           5
	//  111  233:invokevirtual   #1109 <Method void PrintWriter.print(int)>
				printwriter.print(": ");
	//  112  236:aload_3         
	//  113  237:ldc2            #1111 <String ": ">
	//  114  240:invokevirtual   #1089 <Method void PrintWriter.print(String)>
				printwriter.println(((Fragment) (obj1)).toString());
	//  115  243:aload_3         
	//  116  244:aload           9
	//  117  246:invokevirtual   #1117 <Method String Fragment.toString()>
	//  118  249:invokevirtual   #1105 <Method void PrintWriter.println(String)>
			}

	//  119  252:iload           5
	//  120  254:iconst_1        
	//  121  255:iadd            
	//  122  256:istore          5
		}
	//* 123  258:goto            197
		obj1 = ((Object) (mCreatedMenus));
	//  124  261:aload_0         
	//  125  262:getfield        #938 <Field ArrayList mCreatedMenus>
	//  126  265:astore          9
		if(obj1 != null)
	//* 127  267:aload           9
	//* 128  269:ifnull          363
		{
			int i2 = ((ArrayList) (obj1)).size();
	//  129  272:aload           9
	//  130  274:invokevirtual   #169 <Method int ArrayList.size()>
	//  131  277:istore          7
			if(i2 > 0)
	//* 132  279:iload           7
	//* 133  281:ifle            363
			{
				printwriter.print(s);
	//  134  284:aload_3         
	//  135  285:aload_1         
	//  136  286:invokevirtual   #1089 <Method void PrintWriter.print(String)>
				printwriter.println("Fragments Created Menus:");
	//  137  289:aload_3         
	//  138  290:ldc2            #1119 <String "Fragments Created Menus:">
	//  139  293:invokevirtual   #1105 <Method void PrintWriter.println(String)>
				for(int k = 0; k < i2; k++)
	//* 140  296:iconst_0        
	//* 141  297:istore          5
	//* 142  299:iload           5
	//* 143  301:iload           7
	//* 144  303:icmpge          363
				{
					obj1 = ((Object) ((Fragment)mCreatedMenus.get(k)));
	//  145  306:aload_0         
	//  146  307:getfield        #938 <Field ArrayList mCreatedMenus>
	//  147  310:iload           5
	//  148  312:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//  149  315:checkcast       #175 <Class Fragment>
	//  150  318:astore          9
					printwriter.print(s);
	//  151  320:aload_3         
	//  152  321:aload_1         
	//  153  322:invokevirtual   #1089 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//  154  325:aload_3         
	//  155  326:ldc2            #1107 <String "  #">
	//  156  329:invokevirtual   #1089 <Method void PrintWriter.print(String)>
					printwriter.print(k);
	//  157  332:aload_3         
	//  158  333:iload           5
	//  159  335:invokevirtual   #1109 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//  160  338:aload_3         
	//  161  339:ldc2            #1111 <String ": ">
	//  162  342:invokevirtual   #1089 <Method void PrintWriter.print(String)>
					printwriter.println(((Fragment) (obj1)).toString());
	//  163  345:aload_3         
	//  164  346:aload           9
	//  165  348:invokevirtual   #1117 <Method String Fragment.toString()>
	//  166  351:invokevirtual   #1105 <Method void PrintWriter.println(String)>
				}

	//  167  354:iload           5
	//  168  356:iconst_1        
	//  169  357:iadd            
	//  170  358:istore          5
			}
		}
	//* 171  360:goto            299
		obj1 = ((Object) (mBackStack));
	//  172  363:aload_0         
	//  173  364:getfield        #787 <Field ArrayList mBackStack>
	//  174  367:astore          9
		if(obj1 != null)
	//* 175  369:aload           9
	//* 176  371:ifnull          476
		{
			int j2 = ((ArrayList) (obj1)).size();
	//  177  374:aload           9
	//  178  376:invokevirtual   #169 <Method int ArrayList.size()>
	//  179  379:istore          7
			if(j2 > 0)
	//* 180  381:iload           7
	//* 181  383:ifle            476
			{
				printwriter.print(s);
	//  182  386:aload_3         
	//  183  387:aload_1         
	//  184  388:invokevirtual   #1089 <Method void PrintWriter.print(String)>
				printwriter.println("Back Stack:");
	//  185  391:aload_3         
	//  186  392:ldc2            #1121 <String "Back Stack:">
	//  187  395:invokevirtual   #1105 <Method void PrintWriter.println(String)>
				for(int l = 0; l < j2; l++)
	//* 188  398:iconst_0        
	//* 189  399:istore          5
	//* 190  401:iload           5
	//* 191  403:iload           7
	//* 192  405:icmpge          476
				{
					BackStackRecord backstackrecord = (BackStackRecord)mBackStack.get(l);
	//  193  408:aload_0         
	//  194  409:getfield        #787 <Field ArrayList mBackStack>
	//  195  412:iload           5
	//  196  414:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//  197  417:checkcast       #402 <Class BackStackRecord>
	//  198  420:astore          9
					printwriter.print(s);
	//  199  422:aload_3         
	//  200  423:aload_1         
	//  201  424:invokevirtual   #1089 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//  202  427:aload_3         
	//  203  428:ldc2            #1107 <String "  #">
	//  204  431:invokevirtual   #1089 <Method void PrintWriter.print(String)>
					printwriter.print(l);
	//  205  434:aload_3         
	//  206  435:iload           5
	//  207  437:invokevirtual   #1109 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//  208  440:aload_3         
	//  209  441:ldc2            #1111 <String ": ">
	//  210  444:invokevirtual   #1089 <Method void PrintWriter.print(String)>
					printwriter.println(backstackrecord.toString());
	//  211  447:aload_3         
	//  212  448:aload           9
	//  213  450:invokevirtual   #1122 <Method String BackStackRecord.toString()>
	//  214  453:invokevirtual   #1105 <Method void PrintWriter.println(String)>
					backstackrecord.dump(((String) (obj)), filedescriptor, printwriter, as);
	//  215  456:aload           9
	//  216  458:aload           8
	//  217  460:aload_2         
	//  218  461:aload_3         
	//  219  462:aload           4
	//  220  464:invokevirtual   #1123 <Method void BackStackRecord.dump(String, FileDescriptor, PrintWriter, String[])>
				}

	//  221  467:iload           5
	//  222  469:iconst_1        
	//  223  470:iadd            
	//  224  471:istore          5
			}
		}
	//* 225  473:goto            401
		this;
	//  226  476:aload_0         
		JVM INSTR monitorenter ;
	//  227  477:monitorenter    
		if(mBackStackIndices == null) goto _L2; else goto _L1
	//  228  478:aload_0         
	//  229  479:getfield        #845 <Field ArrayList mBackStackIndices>
	//  230  482:ifnull          573
_L1:
		int k2 = mBackStackIndices.size();
	//  231  485:aload_0         
	//  232  486:getfield        #845 <Field ArrayList mBackStackIndices>
	//  233  489:invokevirtual   #169 <Method int ArrayList.size()>
	//  234  492:istore          7
		if(k2 <= 0) goto _L2; else goto _L3
	//  235  494:iload           7
	//  236  496:ifle            573
_L3:
		printwriter.print(s);
	//  237  499:aload_3         
	//  238  500:aload_1         
	//  239  501:invokevirtual   #1089 <Method void PrintWriter.print(String)>
		printwriter.println("Back Stack Indices:");
	//  240  504:aload_3         
	//  241  505:ldc2            #1125 <String "Back Stack Indices:">
	//  242  508:invokevirtual   #1105 <Method void PrintWriter.println(String)>
		int i1 = 0;
	//  243  511:iconst_0        
	//  244  512:istore          5
_L4:
		if(i1 >= k2)
			break; /* Loop/switch isn't completed */
	//  245  514:iload           5
	//  246  516:iload           7
	//  247  518:icmpge          573
		filedescriptor = ((FileDescriptor) ((BackStackRecord)mBackStackIndices.get(i1)));
	//  248  521:aload_0         
	//  249  522:getfield        #845 <Field ArrayList mBackStackIndices>
	//  250  525:iload           5
	//  251  527:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//  252  530:checkcast       #402 <Class BackStackRecord>
	//  253  533:astore_2        
		printwriter.print(s);
	//  254  534:aload_3         
	//  255  535:aload_1         
	//  256  536:invokevirtual   #1089 <Method void PrintWriter.print(String)>
		printwriter.print("  #");
	//  257  539:aload_3         
	//  258  540:ldc2            #1107 <String "  #">
	//  259  543:invokevirtual   #1089 <Method void PrintWriter.print(String)>
		printwriter.print(i1);
	//  260  546:aload_3         
	//  261  547:iload           5
	//  262  549:invokevirtual   #1109 <Method void PrintWriter.print(int)>
		printwriter.print(": ");
	//  263  552:aload_3         
	//  264  553:ldc2            #1111 <String ": ">
	//  265  556:invokevirtual   #1089 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (filedescriptor)));
	//  266  559:aload_3         
	//  267  560:aload_2         
	//  268  561:invokevirtual   #1113 <Method void PrintWriter.println(Object)>
		i1++;
	//  269  564:iload           5
	//  270  566:iconst_1        
	//  271  567:iadd            
	//  272  568:istore          5
		if(true) goto _L4; else goto _L2
	//  273  570:goto            514
_L2:
		if(mAvailBackStackIndices != null && mAvailBackStackIndices.size() > 0)
	//* 274  573:aload_0         
	//* 275  574:getfield        #831 <Field ArrayList mAvailBackStackIndices>
	//* 276  577:ifnull          616
	//* 277  580:aload_0         
	//* 278  581:getfield        #831 <Field ArrayList mAvailBackStackIndices>
	//* 279  584:invokevirtual   #169 <Method int ArrayList.size()>
	//* 280  587:ifle            616
		{
			printwriter.print(s);
	//  281  590:aload_3         
	//  282  591:aload_1         
	//  283  592:invokevirtual   #1089 <Method void PrintWriter.print(String)>
			printwriter.print("mAvailBackStackIndices: ");
	//  284  595:aload_3         
	//  285  596:ldc2            #1127 <String "mAvailBackStackIndices: ">
	//  286  599:invokevirtual   #1089 <Method void PrintWriter.print(String)>
			printwriter.println(Arrays.toString(mAvailBackStackIndices.toArray()));
	//  287  602:aload_3         
	//  288  603:aload_0         
	//  289  604:getfield        #831 <Field ArrayList mAvailBackStackIndices>
	//  290  607:invokevirtual   #1131 <Method Object[] ArrayList.toArray()>
	//  291  610:invokestatic    #1136 <Method String Arrays.toString(Object[])>
	//  292  613:invokevirtual   #1105 <Method void PrintWriter.println(String)>
		}
		this;
	//  293  616:aload_0         
		JVM INSTR monitorexit ;
	//  294  617:monitorexit     
		filedescriptor = ((FileDescriptor) (mPendingActions));
	//  295  618:aload_0         
	//  296  619:getfield        #510 <Field ArrayList mPendingActions>
	//  297  622:astore_2        
		if(filedescriptor != null)
	//* 298  623:aload_2         
	//* 299  624:ifnull          713
		{
			int l2 = ((ArrayList) (filedescriptor)).size();
	//  300  627:aload_2         
	//  301  628:invokevirtual   #169 <Method int ArrayList.size()>
	//  302  631:istore          7
			if(l2 > 0)
	//* 303  633:iload           7
	//* 304  635:ifle            713
			{
				printwriter.print(s);
	//  305  638:aload_3         
	//  306  639:aload_1         
	//  307  640:invokevirtual   #1089 <Method void PrintWriter.print(String)>
				printwriter.println("Pending Actions:");
	//  308  643:aload_3         
	//  309  644:ldc2            #1138 <String "Pending Actions:">
	//  310  647:invokevirtual   #1105 <Method void PrintWriter.println(String)>
				for(int j1 = ((int) (flag)); j1 < l2; j1++)
	//* 311  650:iload           6
	//* 312  652:istore          5
	//* 313  654:iload           5
	//* 314  656:iload           7
	//* 315  658:icmpge          713
				{
					filedescriptor = ((FileDescriptor) ((OpGenerator)mPendingActions.get(j1)));
	//  316  661:aload_0         
	//  317  662:getfield        #510 <Field ArrayList mPendingActions>
	//  318  665:iload           5
	//  319  667:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//  320  670:checkcast       #41  <Class FragmentManagerImpl$OpGenerator>
	//  321  673:astore_2        
					printwriter.print(s);
	//  322  674:aload_3         
	//  323  675:aload_1         
	//  324  676:invokevirtual   #1089 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//  325  679:aload_3         
	//  326  680:ldc2            #1107 <String "  #">
	//  327  683:invokevirtual   #1089 <Method void PrintWriter.print(String)>
					printwriter.print(j1);
	//  328  686:aload_3         
	//  329  687:iload           5
	//  330  689:invokevirtual   #1109 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//  331  692:aload_3         
	//  332  693:ldc2            #1111 <String ": ">
	//  333  696:invokevirtual   #1089 <Method void PrintWriter.print(String)>
					printwriter.println(((Object) (filedescriptor)));
	//  334  699:aload_3         
	//  335  700:aload_2         
	//  336  701:invokevirtual   #1113 <Method void PrintWriter.println(Object)>
				}

	//  337  704:iload           5
	//  338  706:iconst_1        
	//  339  707:iadd            
	//  340  708:istore          5
			}
		}
	//* 341  710:goto            654
		printwriter.print(s);
	//  342  713:aload_3         
	//  343  714:aload_1         
	//  344  715:invokevirtual   #1089 <Method void PrintWriter.print(String)>
		printwriter.println("FragmentManager misc state:");
	//  345  718:aload_3         
	//  346  719:ldc2            #1140 <String "FragmentManager misc state:">
	//  347  722:invokevirtual   #1105 <Method void PrintWriter.println(String)>
		printwriter.print(s);
	//  348  725:aload_3         
	//  349  726:aload_1         
	//  350  727:invokevirtual   #1089 <Method void PrintWriter.print(String)>
		printwriter.print("  mHost=");
	//  351  730:aload_3         
	//  352  731:ldc2            #1142 <String "  mHost=">
	//  353  734:invokevirtual   #1089 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (mHost)));
	//  354  737:aload_3         
	//  355  738:aload_0         
	//  356  739:getfield        #369 <Field FragmentHostCallback mHost>
	//  357  742:invokevirtual   #1113 <Method void PrintWriter.println(Object)>
		printwriter.print(s);
	//  358  745:aload_3         
	//  359  746:aload_1         
	//  360  747:invokevirtual   #1089 <Method void PrintWriter.print(String)>
		printwriter.print("  mContainer=");
	//  361  750:aload_3         
	//  362  751:ldc2            #1144 <String "  mContainer=">
	//  363  754:invokevirtual   #1089 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (mContainer)));
	//  364  757:aload_3         
	//  365  758:aload_0         
	//  366  759:getfield        #857 <Field FragmentContainer mContainer>
	//  367  762:invokevirtual   #1113 <Method void PrintWriter.println(Object)>
		if(mParent != null)
	//* 368  765:aload_0         
	//* 369  766:getfield        #859 <Field Fragment mParent>
	//* 370  769:ifnull          792
		{
			printwriter.print(s);
	//  371  772:aload_3         
	//  372  773:aload_1         
	//  373  774:invokevirtual   #1089 <Method void PrintWriter.print(String)>
			printwriter.print("  mParent=");
	//  374  777:aload_3         
	//  375  778:ldc2            #1146 <String "  mParent=">
	//  376  781:invokevirtual   #1089 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mParent)));
	//  377  784:aload_3         
	//  378  785:aload_0         
	//  379  786:getfield        #859 <Field Fragment mParent>
	//  380  789:invokevirtual   #1113 <Method void PrintWriter.println(Object)>
		}
		printwriter.print(s);
	//  381  792:aload_3         
	//  382  793:aload_1         
	//  383  794:invokevirtual   #1089 <Method void PrintWriter.print(String)>
		printwriter.print("  mCurState=");
	//  384  797:aload_3         
	//  385  798:ldc2            #1148 <String "  mCurState=">
	//  386  801:invokevirtual   #1089 <Method void PrintWriter.print(String)>
		printwriter.print(mCurState);
	//  387  804:aload_3         
	//  388  805:aload_0         
	//  389  806:getfield        #148 <Field int mCurState>
	//  390  809:invokevirtual   #1109 <Method void PrintWriter.print(int)>
		printwriter.print(" mStateSaved=");
	//  391  812:aload_3         
	//  392  813:ldc2            #1150 <String " mStateSaved=">
	//  393  816:invokevirtual   #1089 <Method void PrintWriter.print(String)>
		printwriter.print(mStateSaved);
	//  394  819:aload_3         
	//  395  820:aload_0         
	//  396  821:getfield        #916 <Field boolean mStateSaved>
	//  397  824:invokevirtual   #1152 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mStopped=");
	//  398  827:aload_3         
	//  399  828:ldc2            #1154 <String " mStopped=">
	//  400  831:invokevirtual   #1089 <Method void PrintWriter.print(String)>
		printwriter.print(mStopped);
	//  401  834:aload_3         
	//  402  835:aload_0         
	//  403  836:getfield        #918 <Field boolean mStopped>
	//  404  839:invokevirtual   #1152 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mDestroyed=");
	//  405  842:aload_3         
	//  406  843:ldc2            #1156 <String " mDestroyed=">
	//  407  846:invokevirtual   #1089 <Method void PrintWriter.print(String)>
		printwriter.println(mDestroyed);
	//  408  849:aload_3         
	//  409  850:aload_0         
	//  410  851:getfield        #944 <Field boolean mDestroyed>
	//  411  854:invokevirtual   #1158 <Method void PrintWriter.println(boolean)>
		if(mNeedMenuInvalidate)
	//* 412  857:aload_0         
	//* 413  858:getfield        #823 <Field boolean mNeedMenuInvalidate>
	//* 414  861:ifeq            884
		{
			printwriter.print(s);
	//  415  864:aload_3         
	//  416  865:aload_1         
	//  417  866:invokevirtual   #1089 <Method void PrintWriter.print(String)>
			printwriter.print("  mNeedMenuInvalidate=");
	//  418  869:aload_3         
	//  419  870:ldc2            #1160 <String "  mNeedMenuInvalidate=">
	//  420  873:invokevirtual   #1089 <Method void PrintWriter.print(String)>
			printwriter.println(mNeedMenuInvalidate);
	//  421  876:aload_3         
	//  422  877:aload_0         
	//  423  878:getfield        #823 <Field boolean mNeedMenuInvalidate>
	//  424  881:invokevirtual   #1158 <Method void PrintWriter.println(boolean)>
		}
		if(mNoTransactionsBecause != null)
	//* 425  884:aload_0         
	//* 426  885:getfield        #303 <Field String mNoTransactionsBecause>
	//* 427  888:ifnull          911
		{
			printwriter.print(s);
	//  428  891:aload_3         
	//  429  892:aload_1         
	//  430  893:invokevirtual   #1089 <Method void PrintWriter.print(String)>
			printwriter.print("  mNoTransactionsBecause=");
	//  431  896:aload_3         
	//  432  897:ldc2            #1162 <String "  mNoTransactionsBecause=">
	//  433  900:invokevirtual   #1089 <Method void PrintWriter.print(String)>
			printwriter.println(mNoTransactionsBecause);
	//  434  903:aload_3         
	//  435  904:aload_0         
	//  436  905:getfield        #303 <Field String mNoTransactionsBecause>
	//  437  908:invokevirtual   #1105 <Method void PrintWriter.println(String)>
		}
		return;
	//  438  911:return          
		s;
	//  439  912:astore_1        
		this;
	//  440  913:aload_0         
		JVM INSTR monitorexit ;
	//  441  914:monitorexit     
		throw s;
	//  442  915:aload_1         
	//  443  916:athrow          
	}

	public void enqueueAction(OpGenerator opgenerator, boolean flag)
	{
		if(!flag)
	//*   0    0:iload_2         
	//*   1    1:ifne            8
			checkStateLoss();
	//    2    4:aload_0         
	//    3    5:invokespecial   #388 <Method void checkStateLoss()>
		this;
	//    4    8:aload_0         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		if(mDestroyed || mHost == null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #944 <Field boolean mDestroyed>
	//*   8   14:ifne            61
	//*   9   17:aload_0         
	//*  10   18:getfield        #369 <Field FragmentHostCallback mHost>
	//*  11   21:ifnonnull       27
			break MISSING_BLOCK_LABEL_61;
	//   12   24:goto            61
		if(mPendingActions == null)
	//*  13   27:aload_0         
	//*  14   28:getfield        #510 <Field ArrayList mPendingActions>
	//*  15   31:ifnonnull       45
			mPendingActions = new ArrayList();
	//   16   34:aload_0         
	//   17   35:new             #138 <Class ArrayList>
	//   18   38:dup             
	//   19   39:invokespecial   #139 <Method void ArrayList()>
	//   20   42:putfield        #510 <Field ArrayList mPendingActions>
		mPendingActions.add(((Object) (opgenerator)));
	//   21   45:aload_0         
	//   22   46:getfield        #510 <Field ArrayList mPendingActions>
	//   23   49:aload_1         
	//   24   50:invokevirtual   #678 <Method boolean ArrayList.add(Object)>
	//   25   53:pop             
		scheduleCommit();
	//   26   54:aload_0         
	//   27   55:invokevirtual   #1167 <Method void scheduleCommit()>
		this;
	//   28   58:aload_0         
		JVM INSTR monitorexit ;
	//   29   59:monitorexit     
		return;
	//   30   60:return          
		if(!flag)
			break MISSING_BLOCK_LABEL_68;
	//   31   61:iload_2         
	//   32   62:ifeq            68
		this;
	//   33   65:aload_0         
		JVM INSTR monitorexit ;
	//   34   66:monitorexit     
		return;
	//   35   67:return          
		throw new IllegalStateException("Activity has been destroyed");
	//   36   68:new             #314 <Class IllegalStateException>
	//   37   71:dup             
	//   38   72:ldc2            #1169 <String "Activity has been destroyed">
	//   39   75:invokespecial   #321 <Method void IllegalStateException(String)>
	//   40   78:athrow          
		opgenerator;
	//   41   79:astore_1        
		this;
	//   42   80:aload_0         
		JVM INSTR monitorexit ;
	//   43   81:monitorexit     
		throw opgenerator;
	//   44   82:aload_1         
	//   45   83:athrow          
	}

	void ensureInflatedFragmentView(Fragment fragment)
	{
		if(fragment.mFromLayout && !fragment.mPerformedCreateView)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1173 <Field boolean Fragment.mFromLayout>
	//*   2    4:ifeq            102
	//*   3    7:aload_1         
	//*   4    8:getfield        #1176 <Field boolean Fragment.mPerformedCreateView>
	//*   5   11:ifne            102
		{
			fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), ((ViewGroup) (null)), fragment.mSavedFragmentState);
	//    6   14:aload_1         
	//    7   15:aload_1         
	//    8   16:aload_1         
	//    9   17:getfield        #1179 <Field Bundle Fragment.mSavedFragmentState>
	//   10   20:invokevirtual   #1183 <Method android.view.LayoutInflater Fragment.performGetLayoutInflater(Bundle)>
	//   11   23:aconst_null     
	//   12   24:aload_1         
	//   13   25:getfield        #1179 <Field Bundle Fragment.mSavedFragmentState>
	//   14   28:invokevirtual   #1187 <Method void Fragment.performCreateView(android.view.LayoutInflater, ViewGroup, Bundle)>
			if(fragment.mView != null)
	//*  15   31:aload_1         
	//*  16   32:getfield        #192 <Field View Fragment.mView>
	//*  17   35:ifnull          97
			{
				fragment.mInnerView = fragment.mView;
	//   18   38:aload_1         
	//   19   39:aload_1         
	//   20   40:getfield        #192 <Field View Fragment.mView>
	//   21   43:putfield        #1190 <Field View Fragment.mInnerView>
				fragment.mView.setSaveFromParentEnabled(false);
	//   22   46:aload_1         
	//   23   47:getfield        #192 <Field View Fragment.mView>
	//   24   50:iconst_0        
	//   25   51:invokevirtual   #1193 <Method void View.setSaveFromParentEnabled(boolean)>
				if(fragment.mHidden)
	//*  26   54:aload_1         
	//*  27   55:getfield        #195 <Field boolean Fragment.mHidden>
	//*  28   58:ifeq            70
					fragment.mView.setVisibility(8);
	//   29   61:aload_1         
	//   30   62:getfield        #192 <Field View Fragment.mView>
	//   31   65:bipush          8
	//   32   67:invokevirtual   #902 <Method void View.setVisibility(int)>
				fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
	//   33   70:aload_1         
	//   34   71:aload_1         
	//   35   72:getfield        #192 <Field View Fragment.mView>
	//   36   75:aload_1         
	//   37   76:getfield        #1179 <Field Bundle Fragment.mSavedFragmentState>
	//   38   79:invokevirtual   #1197 <Method void Fragment.onViewCreated(View, Bundle)>
				dispatchOnFragmentViewCreated(fragment, fragment.mView, fragment.mSavedFragmentState, false);
	//   39   82:aload_0         
	//   40   83:aload_1         
	//   41   84:aload_1         
	//   42   85:getfield        #192 <Field View Fragment.mView>
	//   43   88:aload_1         
	//   44   89:getfield        #1179 <Field Bundle Fragment.mSavedFragmentState>
	//   45   92:iconst_0        
	//   46   93:invokevirtual   #1047 <Method void dispatchOnFragmentViewCreated(Fragment, View, Bundle, boolean)>
				return;
	//   47   96:return          
			}
			fragment.mInnerView = null;
	//   48   97:aload_1         
	//   49   98:aconst_null     
	//   50   99:putfield        #1190 <Field View Fragment.mInnerView>
		}
	//   51  102:return          
	}

	public boolean execPendingActions()
	{
		boolean flag;
		ensureExecReady(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #649 <Method void ensureExecReady(boolean)>
		flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_1        
_L2:
		if(!generateOpsForPendingActions(mTmpRecords, mTmpIsPop))
			break; /* Loop/switch isn't completed */
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #333 <Field ArrayList mTmpRecords>
	//    8   12:aload_0         
	//    9   13:getfield        #328 <Field ArrayList mTmpIsPop>
	//   10   16:invokespecial   #1199 <Method boolean generateOpsForPendingActions(ArrayList, ArrayList)>
	//   11   19:ifeq            55
		mExecutingActions = true;
	//   12   22:aload_0         
	//   13   23:iconst_1        
	//   14   24:putfield        #326 <Field boolean mExecutingActions>
		removeRedundantOperationsAndExecute(mTmpRecords, mTmpIsPop);
	//   15   27:aload_0         
	//   16   28:aload_0         
	//   17   29:getfield        #333 <Field ArrayList mTmpRecords>
	//   18   32:aload_0         
	//   19   33:getfield        #328 <Field ArrayList mTmpIsPop>
	//   20   36:invokespecial   #664 <Method void removeRedundantOperationsAndExecute(ArrayList, ArrayList)>
		cleanupExec();
	//   21   39:aload_0         
	//   22   40:invokespecial   #666 <Method void cleanupExec()>
		flag = true;
	//   23   43:iconst_1        
	//   24   44:istore_1        
		if(true) goto _L2; else goto _L1
	//   25   45:goto            7
		Exception exception;
		exception;
	//   26   48:astore_2        
		cleanupExec();
	//   27   49:aload_0         
	//   28   50:invokespecial   #666 <Method void cleanupExec()>
		throw exception;
	//   29   53:aload_2         
	//   30   54:athrow          
_L1:
		doPendingDeferredStart();
	//   31   55:aload_0         
	//   32   56:invokevirtual   #669 <Method void doPendingDeferredStart()>
		burpActive();
	//   33   59:aload_0         
	//   34   60:invokespecial   #671 <Method void burpActive()>
		return flag;
	//   35   63:iload_1         
	//   36   64:ireturn         
	}

	public void execSingleAction(OpGenerator opgenerator, boolean flag)
	{
		if(flag && (mHost == null || mDestroyed))
	//*   0    0:iload_2         
	//*   1    1:ifeq            19
	//*   2    4:aload_0         
	//*   3    5:getfield        #369 <Field FragmentHostCallback mHost>
	//*   4    8:ifnull          18
	//*   5   11:aload_0         
	//*   6   12:getfield        #944 <Field boolean mDestroyed>
	//*   7   15:ifeq            19
			return;
	//    8   18:return          
		ensureExecReady(flag);
	//    9   19:aload_0         
	//   10   20:iload_2         
	//   11   21:invokespecial   #649 <Method void ensureExecReady(boolean)>
		if(!opgenerator.generateOps(mTmpRecords, mTmpIsPop))
			break MISSING_BLOCK_LABEL_72;
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #333 <Field ArrayList mTmpRecords>
	//   15   29:aload_0         
	//   16   30:getfield        #328 <Field ArrayList mTmpIsPop>
	//   17   33:invokeinterface #513 <Method boolean FragmentManagerImpl$OpGenerator.generateOps(ArrayList, ArrayList)>
	//   18   38:ifeq            72
		mExecutingActions = true;
	//   19   41:aload_0         
	//   20   42:iconst_1        
	//   21   43:putfield        #326 <Field boolean mExecutingActions>
		removeRedundantOperationsAndExecute(mTmpRecords, mTmpIsPop);
	//   22   46:aload_0         
	//   23   47:aload_0         
	//   24   48:getfield        #333 <Field ArrayList mTmpRecords>
	//   25   51:aload_0         
	//   26   52:getfield        #328 <Field ArrayList mTmpIsPop>
	//   27   55:invokespecial   #664 <Method void removeRedundantOperationsAndExecute(ArrayList, ArrayList)>
		cleanupExec();
	//   28   58:aload_0         
	//   29   59:invokespecial   #666 <Method void cleanupExec()>
		break MISSING_BLOCK_LABEL_72;
	//   30   62:goto            72
		opgenerator;
	//   31   65:astore_1        
		cleanupExec();
	//   32   66:aload_0         
	//   33   67:invokespecial   #666 <Method void cleanupExec()>
		throw opgenerator;
	//   34   70:aload_1         
	//   35   71:athrow          
		doPendingDeferredStart();
	//   36   72:aload_0         
	//   37   73:invokevirtual   #669 <Method void doPendingDeferredStart()>
		burpActive();
	//   38   76:aload_0         
	//   39   77:invokespecial   #671 <Method void burpActive()>
		return;
	//   40   80:return          
	}

	public boolean executePendingTransactions()
	{
		boolean flag = execPendingActions();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #340 <Method boolean execPendingActions()>
	//    2    4:istore_1        
		forcePostponedTransactions();
	//    3    5:aload_0         
	//    4    6:invokespecial   #1203 <Method void forcePostponedTransactions()>
		return flag;
	//    5    9:iload_1         
	//    6   10:ireturn         
	}

	public Fragment findFragmentById(int i)
	{
		for(int j = mAdded.size() - 1; j >= 0; j--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #141 <Field ArrayList mAdded>
	//*   2    4:invokevirtual   #169 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            47
		{
			Fragment fragment = (Fragment)mAdded.get(j);
	//    8   14:aload_0         
	//    9   15:getfield        #141 <Field ArrayList mAdded>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #175 <Class Fragment>
	//   13   25:astore_3        
			if(fragment != null && fragment.mFragmentId == i)
	//*  14   26:aload_3         
	//*  15   27:ifnull          40
	//*  16   30:aload_3         
	//*  17   31:getfield        #1208 <Field int Fragment.mFragmentId>
	//*  18   34:iload_1         
	//*  19   35:icmpne          40
				return fragment;
	//   20   38:aload_3         
	//   21   39:areturn         
		}

	//   22   40:iload_2         
	//   23   41:iconst_1        
	//   24   42:isub            
	//   25   43:istore_2        
	//*  26   44:goto            10
		SparseArray sparsearray = mActive;
	//   27   47:aload_0         
	//   28   48:getfield        #283 <Field SparseArray mActive>
	//   29   51:astore_3        
		if(sparsearray != null)
	//*  30   52:aload_3         
	//*  31   53:ifnull          100
		{
			for(int k = sparsearray.size() - 1; k >= 0; k--)
	//*  32   56:aload_3         
	//*  33   57:invokevirtual   #286 <Method int SparseArray.size()>
	//*  34   60:iconst_1        
	//*  35   61:isub            
	//*  36   62:istore_2        
	//*  37   63:iload_2         
	//*  38   64:iflt            100
			{
				Fragment fragment1 = (Fragment)mActive.valueAt(k);
	//   39   67:aload_0         
	//   40   68:getfield        #283 <Field SparseArray mActive>
	//   41   71:iload_2         
	//   42   72:invokevirtual   #289 <Method Object SparseArray.valueAt(int)>
	//   43   75:checkcast       #175 <Class Fragment>
	//   44   78:astore_3        
				if(fragment1 != null && fragment1.mFragmentId == i)
	//*  45   79:aload_3         
	//*  46   80:ifnull          93
	//*  47   83:aload_3         
	//*  48   84:getfield        #1208 <Field int Fragment.mFragmentId>
	//*  49   87:iload_1         
	//*  50   88:icmpne          93
					return fragment1;
	//   51   91:aload_3         
	//   52   92:areturn         
			}

	//   53   93:iload_2         
	//   54   94:iconst_1        
	//   55   95:isub            
	//   56   96:istore_2        
		}
	//*  57   97:goto            63
		return null;
	//   58  100:aconst_null     
	//   59  101:areturn         
	}

	public Fragment findFragmentByTag(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          54
		{
			for(int i = mAdded.size() - 1; i >= 0; i--)
	//*   2    4:aload_0         
	//*   3    5:getfield        #141 <Field ArrayList mAdded>
	//*   4    8:invokevirtual   #169 <Method int ArrayList.size()>
	//*   5   11:iconst_1        
	//*   6   12:isub            
	//*   7   13:istore_2        
	//*   8   14:iload_2         
	//*   9   15:iflt            54
			{
				Fragment fragment = (Fragment)mAdded.get(i);
	//   10   18:aload_0         
	//   11   19:getfield        #141 <Field ArrayList mAdded>
	//   12   22:iload_2         
	//   13   23:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//   14   26:checkcast       #175 <Class Fragment>
	//   15   29:astore_3        
				if(fragment != null && s.equals(((Object) (fragment.mTag))))
	//*  16   30:aload_3         
	//*  17   31:ifnull          47
	//*  18   34:aload_1         
	//*  19   35:aload_3         
	//*  20   36:getfield        #1214 <Field String Fragment.mTag>
	//*  21   39:invokevirtual   #628 <Method boolean String.equals(Object)>
	//*  22   42:ifeq            47
					return fragment;
	//   23   45:aload_3         
	//   24   46:areturn         
			}

	//   25   47:iload_2         
	//   26   48:iconst_1        
	//   27   49:isub            
	//   28   50:istore_2        
		}
	//*  29   51:goto            14
		SparseArray sparsearray = mActive;
	//   30   54:aload_0         
	//   31   55:getfield        #283 <Field SparseArray mActive>
	//   32   58:astore_3        
		if(sparsearray != null && s != null)
	//*  33   59:aload_3         
	//*  34   60:ifnull          114
	//*  35   63:aload_1         
	//*  36   64:ifnull          114
		{
			for(int j = sparsearray.size() - 1; j >= 0; j--)
	//*  37   67:aload_3         
	//*  38   68:invokevirtual   #286 <Method int SparseArray.size()>
	//*  39   71:iconst_1        
	//*  40   72:isub            
	//*  41   73:istore_2        
	//*  42   74:iload_2         
	//*  43   75:iflt            114
			{
				Fragment fragment1 = (Fragment)mActive.valueAt(j);
	//   44   78:aload_0         
	//   45   79:getfield        #283 <Field SparseArray mActive>
	//   46   82:iload_2         
	//   47   83:invokevirtual   #289 <Method Object SparseArray.valueAt(int)>
	//   48   86:checkcast       #175 <Class Fragment>
	//   49   89:astore_3        
				if(fragment1 != null && s.equals(((Object) (fragment1.mTag))))
	//*  50   90:aload_3         
	//*  51   91:ifnull          107
	//*  52   94:aload_1         
	//*  53   95:aload_3         
	//*  54   96:getfield        #1214 <Field String Fragment.mTag>
	//*  55   99:invokevirtual   #628 <Method boolean String.equals(Object)>
	//*  56  102:ifeq            107
					return fragment1;
	//   57  105:aload_3         
	//   58  106:areturn         
			}

	//   59  107:iload_2         
	//   60  108:iconst_1        
	//   61  109:isub            
	//   62  110:istore_2        
		}
	//*  63  111:goto            74
		return null;
	//   64  114:aconst_null     
	//   65  115:areturn         
	}

	public Fragment findFragmentByWho(String s)
	{
		SparseArray sparsearray = mActive;
	//    0    0:aload_0         
	//    1    1:getfield        #283 <Field SparseArray mActive>
	//    2    4:astore_3        
		if(sparsearray != null && s != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          59
	//*   5    9:aload_1         
	//*   6   10:ifnull          59
		{
			for(int i = sparsearray.size() - 1; i >= 0; i--)
	//*   7   13:aload_3         
	//*   8   14:invokevirtual   #286 <Method int SparseArray.size()>
	//*   9   17:iconst_1        
	//*  10   18:isub            
	//*  11   19:istore_2        
	//*  12   20:iload_2         
	//*  13   21:iflt            59
			{
				Fragment fragment = (Fragment)mActive.valueAt(i);
	//   14   24:aload_0         
	//   15   25:getfield        #283 <Field SparseArray mActive>
	//   16   28:iload_2         
	//   17   29:invokevirtual   #289 <Method Object SparseArray.valueAt(int)>
	//   18   32:checkcast       #175 <Class Fragment>
	//   19   35:astore_3        
				if(fragment == null)
					continue;
	//   20   36:aload_3         
	//   21   37:ifnull          52
				fragment = fragment.findFragmentByWho(s);
	//   22   40:aload_3         
	//   23   41:aload_1         
	//   24   42:invokevirtual   #1217 <Method Fragment Fragment.findFragmentByWho(String)>
	//   25   45:astore_3        
				if(fragment != null)
	//*  26   46:aload_3         
	//*  27   47:ifnull          52
					return fragment;
	//   28   50:aload_3         
	//   29   51:areturn         
			}

	//   30   52:iload_2         
	//   31   53:iconst_1        
	//   32   54:isub            
	//   33   55:istore_2        
		}
	//*  34   56:goto            20
		return null;
	//   35   59:aconst_null     
	//   36   60:areturn         
	}

	public void freeBackStackIndex(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mBackStackIndices.set(i, ((Object) (null)));
	//    2    2:aload_0         
	//    3    3:getfield        #845 <Field ArrayList mBackStackIndices>
	//    4    6:iload_1         
	//    5    7:aconst_null     
	//    6    8:invokevirtual   #849 <Method Object ArrayList.set(int, Object)>
	//    7   11:pop             
		if(mAvailBackStackIndices == null)
	//*   8   12:aload_0         
	//*   9   13:getfield        #831 <Field ArrayList mAvailBackStackIndices>
	//*  10   16:ifnonnull       30
			mAvailBackStackIndices = new ArrayList();
	//   11   19:aload_0         
	//   12   20:new             #138 <Class ArrayList>
	//   13   23:dup             
	//   14   24:invokespecial   #139 <Method void ArrayList()>
	//   15   27:putfield        #831 <Field ArrayList mAvailBackStackIndices>
		if(DEBUG)
	//*  16   30:getstatic       #791 <Field boolean DEBUG>
	//*  17   33:ifeq            69
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   18   36:new             #305 <Class StringBuilder>
	//   19   39:dup             
	//   20   40:invokespecial   #306 <Method void StringBuilder()>
	//   21   43:astore_2        
			stringbuilder.append("Freeing back stack index ");
	//   22   44:aload_2         
	//   23   45:ldc2            #1219 <String "Freeing back stack index ">
	//   24   48:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
			stringbuilder.append(i);
	//   26   52:aload_2         
	//   27   53:iload_1         
	//   28   54:invokevirtual   #841 <Method StringBuilder StringBuilder.append(int)>
	//   29   57:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   30   58:ldc2            #544 <String "FragmentManager">
	//   31   61:aload_2         
	//   32   62:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   33   65:invokestatic    #799 <Method int Log.v(String, String)>
	//   34   68:pop             
		}
		mAvailBackStackIndices.add(((Object) (Integer.valueOf(i))));
	//   35   69:aload_0         
	//   36   70:getfield        #831 <Field ArrayList mAvailBackStackIndices>
	//   37   73:iload_1         
	//   38   74:invokestatic    #1222 <Method Integer Integer.valueOf(int)>
	//   39   77:invokevirtual   #678 <Method boolean ArrayList.add(Object)>
	//   40   80:pop             
		this;
	//   41   81:aload_0         
		JVM INSTR monitorexit ;
	//   42   82:monitorexit     
		return;
	//   43   83:return          
		Exception exception;
		exception;
	//   44   84:astore_2        
		this;
	//   45   85:aload_0         
		JVM INSTR monitorexit ;
	//   46   86:monitorexit     
		throw exception;
	//   47   87:aload_2         
	//   48   88:athrow          
	}

	public Fragment getFragment(Bundle bundle, String s)
	{
		int i = bundle.getInt(s, -1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #1230 <Method int Bundle.getInt(String, int)>
	//    4    6:istore_3        
		if(i == -1)
	//*   5    7:iload_3         
	//*   6    8:iconst_m1       
	//*   7    9:icmpne          14
			return null;
	//    8   12:aconst_null     
	//    9   13:areturn         
		bundle = ((Bundle) ((Fragment)mActive.get(i)));
	//   10   14:aload_0         
	//   11   15:getfield        #283 <Field SparseArray mActive>
	//   12   18:iload_3         
	//   13   19:invokevirtual   #1231 <Method Object SparseArray.get(int)>
	//   14   22:checkcast       #175 <Class Fragment>
	//   15   25:astore_1        
		if(bundle == null)
	//*  16   26:aload_1         
	//*  17   27:ifnonnull       87
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   18   30:new             #305 <Class StringBuilder>
	//   19   33:dup             
	//   20   34:invokespecial   #306 <Method void StringBuilder()>
	//   21   37:astore          4
			stringbuilder.append("Fragment no longer exists for key ");
	//   22   39:aload           4
	//   23   41:ldc2            #1233 <String "Fragment no longer exists for key ">
	//   24   44:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
			stringbuilder.append(s);
	//   26   48:aload           4
	//   27   50:aload_2         
	//   28   51:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   29   54:pop             
			stringbuilder.append(": index ");
	//   30   55:aload           4
	//   31   57:ldc2            #1235 <String ": index ">
	//   32   60:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   33   63:pop             
			stringbuilder.append(i);
	//   34   64:aload           4
	//   35   66:iload_3         
	//   36   67:invokevirtual   #841 <Method StringBuilder StringBuilder.append(int)>
	//   37   70:pop             
			throwException(((RuntimeException) (new IllegalStateException(stringbuilder.toString()))));
	//   38   71:aload_0         
	//   39   72:new             #314 <Class IllegalStateException>
	//   40   75:dup             
	//   41   76:aload           4
	//   42   78:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   43   81:invokespecial   #321 <Method void IllegalStateException(String)>
	//   44   84:invokespecial   #1237 <Method void throwException(RuntimeException)>
		}
		return ((Fragment) (bundle));
	//   45   87:aload_1         
	//   46   88:areturn         
	}

	public List getFragments()
	{
		if(mAdded.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #141 <Field ArrayList mAdded>
	//*   2    4:invokevirtual   #506 <Method boolean ArrayList.isEmpty()>
	//*   3    7:ifeq            14
			return Collections.emptyList();
	//    4   10:invokestatic    #1242 <Method List Collections.emptyList()>
	//    5   13:areturn         
		List list;
		synchronized(mAdded)
	//*   6   14:aload_0         
	//*   7   15:getfield        #141 <Field ArrayList mAdded>
	//*   8   18:astore_1        
	//*   9   19:aload_1         
	//*  10   20:monitorenter    
		{
			list = (List)mAdded.clone();
	//   11   21:aload_0         
	//   12   22:getfield        #141 <Field ArrayList mAdded>
	//   13   25:invokevirtual   #1245 <Method Object ArrayList.clone()>
	//   14   28:checkcast       #636 <Class List>
	//   15   31:astore_2        
		}
	//   16   32:aload_1         
	//   17   33:monitorexit     
		return list;
	//   18   34:aload_2         
	//   19   35:areturn         
		exception;
	//   20   36:astore_2        
		arraylist;
	//   21   37:aload_1         
		JVM INSTR monitorexit ;
	//   22   38:monitorexit     
		throw exception;
	//   23   39:aload_2         
	//   24   40:athrow          
	}

	android.view.LayoutInflater.Factory2 getLayoutInflaterFactory()
	{
		return ((android.view.LayoutInflater.Factory2) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public Fragment getPrimaryNavigationFragment()
	{
		return mPrimaryNav;
	//    0    0:aload_0         
	//    1    1:getfield        #651 <Field Fragment mPrimaryNav>
	//    2    4:areturn         
	}

	public void hideFragment(Fragment fragment)
	{
		if(DEBUG)
	//*   0    0:getstatic       #791 <Field boolean DEBUG>
	//*   1    3:ifeq            39
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #305 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #306 <Method void StringBuilder()>
	//    5   13:astore_2        
			stringbuilder.append("hide: ");
	//    6   14:aload_2         
	//    7   15:ldc2            #1251 <String "hide: ">
	//    8   18:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (fragment)));
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   14   28:ldc2            #544 <String "FragmentManager">
	//   15   31:aload_2         
	//   16   32:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   17   35:invokestatic    #799 <Method int Log.v(String, String)>
	//   18   38:pop             
		}
		if(!fragment.mHidden)
	//*  19   39:aload_1         
	//*  20   40:getfield        #195 <Field boolean Fragment.mHidden>
	//*  21   43:ifne            61
		{
			fragment.mHidden = true;
	//   22   46:aload_1         
	//   23   47:iconst_1        
	//   24   48:putfield        #195 <Field boolean Fragment.mHidden>
			fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
	//   25   51:aload_1         
	//   26   52:iconst_1        
	//   27   53:aload_1         
	//   28   54:getfield        #815 <Field boolean Fragment.mHiddenChanged>
	//   29   57:ixor            
	//   30   58:putfield        #815 <Field boolean Fragment.mHiddenChanged>
		}
	//   31   61:return          
	}

	boolean isStateAtLeast(int i)
	{
		return mCurState >= i;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field int mCurState>
	//    2    4:iload_1         
	//    3    5:icmplt          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean isStateSaved()
	{
		return mStateSaved || mStopped;
	//    0    0:aload_0         
	//    1    1:getfield        #916 <Field boolean mStateSaved>
	//    2    4:ifne            19
	//    3    7:aload_0         
	//    4    8:getfield        #918 <Field boolean mStopped>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	AnimationOrAnimator loadAnimation(Fragment fragment, int i, boolean flag, int j)
	{
		int k;
		k = fragment.getNextAnim();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #181 <Method int Fragment.getNextAnim()>
	//    2    4:istore          7
		Animation animation = fragment.onCreateAnimation(i, flag, k);
	//    3    6:aload_1         
	//    4    7:iload_2         
	//    5    8:iload_3         
	//    6    9:iload           7
	//    7   11:invokevirtual   #1258 <Method Animation Fragment.onCreateAnimation(int, boolean, int)>
	//    8   14:astore          9
		if(animation != null)
	//*   9   16:aload           9
	//*  10   18:ifnull          31
			return new AnimationOrAnimator(animation);
	//   11   21:new             #26  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   12   24:dup             
	//   13   25:aload           9
	//   14   27:invokespecial   #573 <Method void FragmentManagerImpl$AnimationOrAnimator(Animation)>
	//   15   30:areturn         
		fragment = ((Fragment) (fragment.onCreateAnimator(i, flag, k)));
	//   16   31:aload_1         
	//   17   32:iload_2         
	//   18   33:iload_3         
	//   19   34:iload           7
	//   20   36:invokevirtual   #1262 <Method Animator Fragment.onCreateAnimator(int, boolean, int)>
	//   21   39:astore_1        
		if(fragment != null)
	//*  22   40:aload_1         
	//*  23   41:ifnull          53
			return new AnimationOrAnimator(((Animator) (fragment)));
	//   24   44:new             #26  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   25   47:dup             
	//   26   48:aload_1         
	//   27   49:invokespecial   #1264 <Method void FragmentManagerImpl$AnimationOrAnimator(Animator)>
	//   28   52:areturn         
		if(k == 0) goto _L2; else goto _L1
	//   29   53:iload           7
	//   30   55:ifeq            197
_L1:
		boolean flag1;
		boolean flag2;
		boolean flag3;
		flag3 = "anim".equals(((Object) (mHost.getContext().getResources().getResourceTypeName(k))));
	//   31   58:ldc2            #1266 <String "anim">
	//   32   61:aload_0         
	//   33   62:getfield        #369 <Field FragmentHostCallback mHost>
	//   34   65:invokevirtual   #1270 <Method Context FragmentHostCallback.getContext()>
	//   35   68:invokevirtual   #1276 <Method Resources Context.getResources()>
	//   36   71:iload           7
	//   37   73:invokevirtual   #1281 <Method String Resources.getResourceTypeName(int)>
	//   38   76:invokevirtual   #628 <Method boolean String.equals(Object)>
	//   39   79:istore          8
		flag2 = false;
	//   40   81:iconst_0        
	//   41   82:istore          6
		flag1 = flag2;
	//   42   84:iload           6
	//   43   86:istore          5
		if(!flag3)
			break MISSING_BLOCK_LABEL_130;
	//   44   88:iload           8
	//   45   90:ifeq            130
		fragment = ((Fragment) (AnimationUtils.loadAnimation(mHost.getContext(), k)));
	//   46   93:aload_0         
	//   47   94:getfield        #369 <Field FragmentHostCallback mHost>
	//   48   97:invokevirtual   #1270 <Method Context FragmentHostCallback.getContext()>
	//   49  100:iload           7
	//   50  102:invokestatic    #1286 <Method Animation AnimationUtils.loadAnimation(Context, int)>
	//   51  105:astore_1        
		if(fragment == null)
			break MISSING_BLOCK_LABEL_121;
	//   52  106:aload_1         
	//   53  107:ifnull          121
		fragment = ((Fragment) (new AnimationOrAnimator(((Animation) (fragment)))));
	//   54  110:new             #26  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   55  113:dup             
	//   56  114:aload_1         
	//   57  115:invokespecial   #573 <Method void FragmentManagerImpl$AnimationOrAnimator(Animation)>
	//   58  118:astore_1        
		return ((AnimationOrAnimator) (fragment));
	//   59  119:aload_1         
	//   60  120:areturn         
		flag1 = true;
	//   61  121:iconst_1        
	//   62  122:istore          5
		break MISSING_BLOCK_LABEL_130;
	//   63  124:goto            130
		fragment;
	//   64  127:astore_1        
		throw fragment;
	//   65  128:aload_1         
	//   66  129:athrow          
_L6:
		if(flag1) goto _L2; else goto _L3
	//   67  130:iload           5
	//   68  132:ifne            197
_L3:
		fragment = ((Fragment) (AnimatorInflater.loadAnimator(mHost.getContext(), k)));
	//   69  135:aload_0         
	//   70  136:getfield        #369 <Field FragmentHostCallback mHost>
	//   71  139:invokevirtual   #1270 <Method Context FragmentHostCallback.getContext()>
	//   72  142:iload           7
	//   73  144:invokestatic    #1292 <Method Animator AnimatorInflater.loadAnimator(Context, int)>
	//   74  147:astore_1        
		if(fragment == null) goto _L2; else goto _L4
	//   75  148:aload_1         
	//   76  149:ifnull          197
_L4:
		fragment = ((Fragment) (new AnimationOrAnimator(((Animator) (fragment)))));
	//   77  152:new             #26  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   78  155:dup             
	//   79  156:aload_1         
	//   80  157:invokespecial   #1264 <Method void FragmentManagerImpl$AnimationOrAnimator(Animator)>
	//   81  160:astore_1        
		return ((AnimationOrAnimator) (fragment));
	//   82  161:aload_1         
	//   83  162:areturn         
		fragment;
	//   84  163:astore_1        
		if(!flag3)
	//*  85  164:iload           8
	//*  86  166:ifne            195
		{
			fragment = ((Fragment) (AnimationUtils.loadAnimation(mHost.getContext(), k)));
	//   87  169:aload_0         
	//   88  170:getfield        #369 <Field FragmentHostCallback mHost>
	//   89  173:invokevirtual   #1270 <Method Context FragmentHostCallback.getContext()>
	//   90  176:iload           7
	//   91  178:invokestatic    #1286 <Method Animation AnimationUtils.loadAnimation(Context, int)>
	//   92  181:astore_1        
			if(fragment != null)
	//*  93  182:aload_1         
	//*  94  183:ifnull          197
				return new AnimationOrAnimator(((Animation) (fragment)));
	//   95  186:new             #26  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   96  189:dup             
	//   97  190:aload_1         
	//   98  191:invokespecial   #573 <Method void FragmentManagerImpl$AnimationOrAnimator(Animation)>
	//   99  194:areturn         
		} else
		{
			throw fragment;
	//  100  195:aload_1         
	//  101  196:athrow          
		}
_L2:
		if(i == 0)
	//* 102  197:iload_2         
	//* 103  198:ifne            203
			return null;
	//  104  201:aconst_null     
	//  105  202:areturn         
		i = transitToStyleIndex(i, flag);
	//  106  203:iload_2         
	//  107  204:iload_3         
	//  108  205:invokestatic    #1294 <Method int transitToStyleIndex(int, boolean)>
	//  109  208:istore_2        
		if(i < 0)
	//* 110  209:iload_2         
	//* 111  210:ifge            215
			return null;
	//  112  213:aconst_null     
	//  113  214:areturn         
		switch(i)
	//* 114  215:iload_2         
		{
	//* 115  216:tableswitch     1 6: default 256
	//	               1 365
	//	               2 348
	//	               3 331
	//	               4 314
	//	               5 301
	//	               6 288
		default:
			i = j;
	//  116  256:iload           4
	//  117  258:istore_2        
			if(j == 0)
	//* 118  259:iload           4
	//* 119  261:ifne            382
			{
				i = j;
	//  120  264:iload           4
	//  121  266:istore_2        
				if(mHost.onHasWindowAnimations())
	//* 122  267:aload_0         
	//* 123  268:getfield        #369 <Field FragmentHostCallback mHost>
	//* 124  271:invokevirtual   #1297 <Method boolean FragmentHostCallback.onHasWindowAnimations()>
	//* 125  274:ifeq            382
					i = mHost.onGetWindowAnimations();
	//  126  277:aload_0         
	//  127  278:getfield        #369 <Field FragmentHostCallback mHost>
	//  128  281:invokevirtual   #1300 <Method int FragmentHostCallback.onGetWindowAnimations()>
	//  129  284:istore_2        
			}
			break;

	//* 130  285:goto            382
		case 6: // '\006'
			return makeFadeAnimation(mHost.getContext(), 1.0F, 0.0F);
	//  131  288:aload_0         
	//  132  289:getfield        #369 <Field FragmentHostCallback mHost>
	//  133  292:invokevirtual   #1270 <Method Context FragmentHostCallback.getContext()>
	//  134  295:fconst_1        
	//  135  296:fconst_0        
	//  136  297:invokestatic    #1302 <Method FragmentManagerImpl$AnimationOrAnimator makeFadeAnimation(Context, float, float)>
	//  137  300:areturn         

		case 5: // '\005'
			return makeFadeAnimation(mHost.getContext(), 0.0F, 1.0F);
	//  138  301:aload_0         
	//  139  302:getfield        #369 <Field FragmentHostCallback mHost>
	//  140  305:invokevirtual   #1270 <Method Context FragmentHostCallback.getContext()>
	//  141  308:fconst_0        
	//  142  309:fconst_1        
	//  143  310:invokestatic    #1302 <Method FragmentManagerImpl$AnimationOrAnimator makeFadeAnimation(Context, float, float)>
	//  144  313:areturn         

		case 4: // '\004'
			return makeOpenCloseAnimation(mHost.getContext(), 1.0F, 1.075F, 1.0F, 0.0F);
	//  145  314:aload_0         
	//  146  315:getfield        #369 <Field FragmentHostCallback mHost>
	//  147  318:invokevirtual   #1270 <Method Context FragmentHostCallback.getContext()>
	//  148  321:fconst_1        
	//  149  322:ldc2            #1303 <Float 1.075F>
	//  150  325:fconst_1        
	//  151  326:fconst_0        
	//  152  327:invokestatic    #1305 <Method FragmentManagerImpl$AnimationOrAnimator makeOpenCloseAnimation(Context, float, float, float, float)>
	//  153  330:areturn         

		case 3: // '\003'
			return makeOpenCloseAnimation(mHost.getContext(), 0.975F, 1.0F, 0.0F, 1.0F);
	//  154  331:aload_0         
	//  155  332:getfield        #369 <Field FragmentHostCallback mHost>
	//  156  335:invokevirtual   #1270 <Method Context FragmentHostCallback.getContext()>
	//  157  338:ldc2            #1306 <Float 0.975F>
	//  158  341:fconst_1        
	//  159  342:fconst_0        
	//  160  343:fconst_1        
	//  161  344:invokestatic    #1305 <Method FragmentManagerImpl$AnimationOrAnimator makeOpenCloseAnimation(Context, float, float, float, float)>
	//  162  347:areturn         

		case 2: // '\002'
			return makeOpenCloseAnimation(mHost.getContext(), 1.0F, 0.975F, 1.0F, 0.0F);
	//  163  348:aload_0         
	//  164  349:getfield        #369 <Field FragmentHostCallback mHost>
	//  165  352:invokevirtual   #1270 <Method Context FragmentHostCallback.getContext()>
	//  166  355:fconst_1        
	//  167  356:ldc2            #1306 <Float 0.975F>
	//  168  359:fconst_1        
	//  169  360:fconst_0        
	//  170  361:invokestatic    #1305 <Method FragmentManagerImpl$AnimationOrAnimator makeOpenCloseAnimation(Context, float, float, float, float)>
	//  171  364:areturn         

		case 1: // '\001'
			return makeOpenCloseAnimation(mHost.getContext(), 1.125F, 1.0F, 0.0F, 1.0F);
	//  172  365:aload_0         
	//  173  366:getfield        #369 <Field FragmentHostCallback mHost>
	//  174  369:invokevirtual   #1270 <Method Context FragmentHostCallback.getContext()>
	//  175  372:ldc2            #1307 <Float 1.125F>
	//  176  375:fconst_1        
	//  177  376:fconst_0        
	//  178  377:fconst_1        
	//  179  378:invokestatic    #1305 <Method FragmentManagerImpl$AnimationOrAnimator makeOpenCloseAnimation(Context, float, float, float, float)>
	//  180  381:areturn         
		}
		if(i == 0)
	//* 181  382:iload_2         
	//* 182  383:ifne            388
			return null;
	//  183  386:aconst_null     
	//  184  387:areturn         
		else
			return null;
	//  185  388:aconst_null     
	//  186  389:areturn         
		fragment;
	//  187  390:astore_1        
		flag1 = flag2;
	//  188  391:iload           6
	//  189  393:istore          5
		if(true) goto _L6; else goto _L5
	//  190  395:goto            130
_L5:
	}

	void makeActive(Fragment fragment)
	{
		if(fragment.mIndex >= 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1308 <Field int Fragment.mIndex>
	//*   2    4:iflt            8
			return;
	//    3    7:return          
		int i = mNextFragmentIndex;
	//    4    8:aload_0         
	//    5    9:getfield        #136 <Field int mNextFragmentIndex>
	//    6   12:istore_2        
		mNextFragmentIndex = i + 1;
	//    7   13:aload_0         
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:iadd            
	//   11   17:putfield        #136 <Field int mNextFragmentIndex>
		fragment.setIndex(i, mParent);
	//   12   20:aload_1         
	//   13   21:iload_2         
	//   14   22:aload_0         
	//   15   23:getfield        #859 <Field Fragment mParent>
	//   16   26:invokevirtual   #1312 <Method void Fragment.setIndex(int, Fragment)>
		if(mActive == null)
	//*  17   29:aload_0         
	//*  18   30:getfield        #283 <Field SparseArray mActive>
	//*  19   33:ifnonnull       47
			mActive = new SparseArray();
	//   20   36:aload_0         
	//   21   37:new             #285 <Class SparseArray>
	//   22   40:dup             
	//   23   41:invokespecial   #1313 <Method void SparseArray()>
	//   24   44:putfield        #283 <Field SparseArray mActive>
		mActive.put(fragment.mIndex, ((Object) (fragment)));
	//   25   47:aload_0         
	//   26   48:getfield        #283 <Field SparseArray mActive>
	//   27   51:aload_1         
	//   28   52:getfield        #1308 <Field int Fragment.mIndex>
	//   29   55:aload_1         
	//   30   56:invokevirtual   #1316 <Method void SparseArray.put(int, Object)>
		if(DEBUG)
	//*  31   59:getstatic       #791 <Field boolean DEBUG>
	//*  32   62:ifeq            98
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   33   65:new             #305 <Class StringBuilder>
	//   34   68:dup             
	//   35   69:invokespecial   #306 <Method void StringBuilder()>
	//   36   72:astore_3        
			stringbuilder.append("Allocated fragment index ");
	//   37   73:aload_3         
	//   38   74:ldc2            #1318 <String "Allocated fragment index ">
	//   39   77:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   40   80:pop             
			stringbuilder.append(((Object) (fragment)));
	//   41   81:aload_3         
	//   42   82:aload_1         
	//   43   83:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//   44   86:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   45   87:ldc2            #544 <String "FragmentManager">
	//   46   90:aload_3         
	//   47   91:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   48   94:invokestatic    #799 <Method int Log.v(String, String)>
	//   49   97:pop             
		}
	//   50   98:return          
	}

	void makeInactive(Fragment fragment)
	{
		if(fragment.mIndex < 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1308 <Field int Fragment.mIndex>
	//*   2    4:ifge            8
			return;
	//    3    7:return          
		if(DEBUG)
	//*   4    8:getstatic       #791 <Field boolean DEBUG>
	//*   5   11:ifeq            47
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   14:new             #305 <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #306 <Method void StringBuilder()>
	//    9   21:astore_2        
			stringbuilder.append("Freeing fragment index ");
	//   10   22:aload_2         
	//   11   23:ldc2            #1321 <String "Freeing fragment index ">
	//   12   26:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:pop             
			stringbuilder.append(((Object) (fragment)));
	//   14   30:aload_2         
	//   15   31:aload_1         
	//   16   32:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//   17   35:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   18   36:ldc2            #544 <String "FragmentManager">
	//   19   39:aload_2         
	//   20   40:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   21   43:invokestatic    #799 <Method int Log.v(String, String)>
	//   22   46:pop             
		}
		mActive.put(fragment.mIndex, ((Object) (null)));
	//   23   47:aload_0         
	//   24   48:getfield        #283 <Field SparseArray mActive>
	//   25   51:aload_1         
	//   26   52:getfield        #1308 <Field int Fragment.mIndex>
	//   27   55:aconst_null     
	//   28   56:invokevirtual   #1316 <Method void SparseArray.put(int, Object)>
		fragment.initState();
	//   29   59:aload_1         
	//   30   60:invokevirtual   #1324 <Method void Fragment.initState()>
	//   31   63:return          
	}

	void moveFragmentToExpectedState(Fragment fragment)
	{
		if(fragment == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		int i = mCurState;
	//    3    5:aload_0         
	//    4    6:getfield        #148 <Field int mCurState>
	//    5    9:istore_2        
		if(fragment.mRemoving)
	//*   6   10:aload_1         
	//*   7   11:getfield        #812 <Field boolean Fragment.mRemoving>
	//*   8   14:ifeq            42
			if(fragment.isInBackStack())
	//*   9   17:aload_1         
	//*  10   18:invokevirtual   #1328 <Method boolean Fragment.isInBackStack()>
	//*  11   21:ifeq            33
				i = Math.min(i, 1);
	//   12   24:iload_2         
	//   13   25:iconst_1        
	//   14   26:invokestatic    #165 <Method int Math.min(int, int)>
	//   15   29:istore_2        
			else
	//*  16   30:goto            42
				i = Math.min(i, 0);
	//   17   33:iload_2         
	//   18   34:iconst_0        
	//   19   35:invokestatic    #165 <Method int Math.min(int, int)>
	//   20   38:istore_2        
	//*  21   39:goto            42
		moveToState(fragment, i, fragment.getNextTransition(), fragment.getNextTransitionStyle(), false);
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:iload_2         
	//   25   45:aload_1         
	//   26   46:invokevirtual   #184 <Method int Fragment.getNextTransition()>
	//   27   49:aload_1         
	//   28   50:invokevirtual   #888 <Method int Fragment.getNextTransitionStyle()>
	//   29   53:iconst_0        
	//   30   54:invokevirtual   #188 <Method void moveToState(Fragment, int, int, int, boolean)>
		if(fragment.mView != null)
	//*  31   57:aload_1         
	//*  32   58:getfield        #192 <Field View Fragment.mView>
	//*  33   61:ifnull          245
		{
			Object obj = ((Object) (findFragmentUnder(fragment)));
	//   34   64:aload_0         
	//   35   65:aload_1         
	//   36   66:invokespecial   #1330 <Method Fragment findFragmentUnder(Fragment)>
	//   37   69:astore          4
			if(obj != null)
	//*  38   71:aload           4
	//*  39   73:ifnull          128
			{
				obj = ((Object) (((Fragment) (obj)).mView));
	//   40   76:aload           4
	//   41   78:getfield        #192 <Field View Fragment.mView>
	//   42   81:astore          4
				ViewGroup viewgroup = fragment.mContainer;
	//   43   83:aload_1         
	//   44   84:getfield        #212 <Field ViewGroup Fragment.mContainer>
	//   45   87:astore          5
				int j = viewgroup.indexOfChild(((View) (obj)));
	//   46   89:aload           5
	//   47   91:aload           4
	//   48   93:invokevirtual   #1334 <Method int ViewGroup.indexOfChild(View)>
	//   49   96:istore_2        
				int k = viewgroup.indexOfChild(fragment.mView);
	//   50   97:aload           5
	//   51   99:aload_1         
	//   52  100:getfield        #192 <Field View Fragment.mView>
	//   53  103:invokevirtual   #1334 <Method int ViewGroup.indexOfChild(View)>
	//   54  106:istore_3        
				if(k < j)
	//*  55  107:iload_3         
	//*  56  108:iload_2         
	//*  57  109:icmpge          128
				{
					viewgroup.removeViewAt(k);
	//   58  112:aload           5
	//   59  114:iload_3         
	//   60  115:invokevirtual   #1337 <Method void ViewGroup.removeViewAt(int)>
					viewgroup.addView(fragment.mView, j);
	//   61  118:aload           5
	//   62  120:aload_1         
	//   63  121:getfield        #192 <Field View Fragment.mView>
	//   64  124:iload_2         
	//   65  125:invokevirtual   #1341 <Method void ViewGroup.addView(View, int)>
				}
			}
			if(fragment.mIsNewlyAdded && fragment.mContainer != null)
	//*  66  128:aload_1         
	//*  67  129:getfield        #198 <Field boolean Fragment.mIsNewlyAdded>
	//*  68  132:ifeq            245
	//*  69  135:aload_1         
	//*  70  136:getfield        #212 <Field ViewGroup Fragment.mContainer>
	//*  71  139:ifnull          245
			{
				if(fragment.mPostponedAlpha > 0.0F)
	//*  72  142:aload_1         
	//*  73  143:getfield        #605 <Field float Fragment.mPostponedAlpha>
	//*  74  146:fconst_0        
	//*  75  147:fcmpl           
	//*  76  148:ifle            162
					fragment.mView.setAlpha(fragment.mPostponedAlpha);
	//   77  151:aload_1         
	//   78  152:getfield        #192 <Field View Fragment.mView>
	//   79  155:aload_1         
	//   80  156:getfield        #605 <Field float Fragment.mPostponedAlpha>
	//   81  159:invokevirtual   #608 <Method void View.setAlpha(float)>
				fragment.mPostponedAlpha = 0.0F;
	//   82  162:aload_1         
	//   83  163:fconst_0        
	//   84  164:putfield        #605 <Field float Fragment.mPostponedAlpha>
				fragment.mIsNewlyAdded = false;
	//   85  167:aload_1         
	//   86  168:iconst_0        
	//   87  169:putfield        #198 <Field boolean Fragment.mIsNewlyAdded>
				AnimationOrAnimator animationoranimator = loadAnimation(fragment, fragment.getNextTransition(), true, fragment.getNextTransitionStyle());
	//   88  172:aload_0         
	//   89  173:aload_1         
	//   90  174:aload_1         
	//   91  175:invokevirtual   #184 <Method int Fragment.getNextTransition()>
	//   92  178:iconst_1        
	//   93  179:aload_1         
	//   94  180:invokevirtual   #888 <Method int Fragment.getNextTransitionStyle()>
	//   95  183:invokevirtual   #892 <Method FragmentManagerImpl$AnimationOrAnimator loadAnimation(Fragment, int, boolean, int)>
	//   96  186:astore          4
				if(animationoranimator != null)
	//*  97  188:aload           4
	//*  98  190:ifnull          245
				{
					setHWLayerAnimListenerIfAlpha(fragment.mView, animationoranimator);
	//   99  193:aload_1         
	//  100  194:getfield        #192 <Field View Fragment.mView>
	//  101  197:aload           4
	//  102  199:invokestatic    #249 <Method void setHWLayerAnimListenerIfAlpha(View, FragmentManagerImpl$AnimationOrAnimator)>
					if(animationoranimator.animation != null)
	//* 103  202:aload           4
	//* 104  204:getfield        #226 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//* 105  207:ifnull          225
					{
						fragment.mView.startAnimation(animationoranimator.animation);
	//  106  210:aload_1         
	//  107  211:getfield        #192 <Field View Fragment.mView>
	//  108  214:aload           4
	//  109  216:getfield        #226 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//  110  219:invokevirtual   #255 <Method void View.startAnimation(Animation)>
					} else
	//* 111  222:goto            245
					{
						animationoranimator.animator.setTarget(((Object) (fragment.mView)));
	//  112  225:aload           4
	//  113  227:getfield        #259 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//  114  230:aload_1         
	//  115  231:getfield        #192 <Field View Fragment.mView>
	//  116  234:invokevirtual   #276 <Method void Animator.setTarget(Object)>
						animationoranimator.animator.start();
	//  117  237:aload           4
	//  118  239:getfield        #259 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//  119  242:invokevirtual   #279 <Method void Animator.start()>
					}
				}
			}
		}
		if(fragment.mHiddenChanged)
	//* 120  245:aload_1         
	//* 121  246:getfield        #815 <Field boolean Fragment.mHiddenChanged>
	//* 122  249:ifeq            257
			completeShowHideFragment(fragment);
	//  123  252:aload_0         
	//  124  253:aload_1         
	//  125  254:invokevirtual   #1343 <Method void completeShowHideFragment(Fragment)>
	//  126  257:return          
	}

	void moveToState(int i, boolean flag)
	{
		if(mHost == null && i != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #369 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       25
	//*   3    7:iload_1         
	//*   4    8:ifne            14
	//*   5   11:goto            25
			throw new IllegalStateException("No activity");
	//    6   14:new             #314 <Class IllegalStateException>
	//    7   17:dup             
	//    8   18:ldc2            #1345 <String "No activity">
	//    9   21:invokespecial   #321 <Method void IllegalStateException(String)>
	//   10   24:athrow          
		if(!flag && i == mCurState)
	//*  11   25:iload_2         
	//*  12   26:ifne            38
	//*  13   29:iload_1         
	//*  14   30:aload_0         
	//*  15   31:getfield        #148 <Field int mCurState>
	//*  16   34:icmpne          38
			return;
	//   17   37:return          
		mCurState = i;
	//   18   38:aload_0         
	//   19   39:iload_1         
	//   20   40:putfield        #148 <Field int mCurState>
		if(mActive != null)
	//*  21   43:aload_0         
	//*  22   44:getfield        #283 <Field SparseArray mActive>
	//*  23   47:ifnull          197
		{
			int j = mAdded.size();
	//   24   50:aload_0         
	//   25   51:getfield        #141 <Field ArrayList mAdded>
	//   26   54:invokevirtual   #169 <Method int ArrayList.size()>
	//   27   57:istore_3        
			for(i = 0; i < j; i++)
	//*  28   58:iconst_0        
	//*  29   59:istore_1        
	//*  30   60:iload_1         
	//*  31   61:iload_3         
	//*  32   62:icmpge          87
				moveFragmentToExpectedState((Fragment)mAdded.get(i));
	//   33   65:aload_0         
	//   34   66:aload_0         
	//   35   67:getfield        #141 <Field ArrayList mAdded>
	//   36   70:iload_1         
	//   37   71:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//   38   74:checkcast       #175 <Class Fragment>
	//   39   77:invokevirtual   #1347 <Method void moveFragmentToExpectedState(Fragment)>

	//   40   80:iload_1         
	//   41   81:iconst_1        
	//   42   82:iadd            
	//   43   83:istore_1        
	//*  44   84:goto            60
			j = mActive.size();
	//   45   87:aload_0         
	//   46   88:getfield        #283 <Field SparseArray mActive>
	//   47   91:invokevirtual   #286 <Method int SparseArray.size()>
	//   48   94:istore_3        
			for(i = 0; i < j; i++)
	//*  49   95:iconst_0        
	//*  50   96:istore_1        
	//*  51   97:iload_1         
	//*  52   98:iload_3         
	//*  53   99:icmpge          157
			{
				Fragment fragment = (Fragment)mActive.valueAt(i);
	//   54  102:aload_0         
	//   55  103:getfield        #283 <Field SparseArray mActive>
	//   56  106:iload_1         
	//   57  107:invokevirtual   #289 <Method Object SparseArray.valueAt(int)>
	//   58  110:checkcast       #175 <Class Fragment>
	//   59  113:astore          4
				if(fragment != null && (fragment.mRemoving || fragment.mDetached) && !fragment.mIsNewlyAdded)
	//*  60  115:aload           4
	//*  61  117:ifnull          150
	//*  62  120:aload           4
	//*  63  122:getfield        #812 <Field boolean Fragment.mRemoving>
	//*  64  125:ifne            136
	//*  65  128:aload           4
	//*  66  130:getfield        #806 <Field boolean Fragment.mDetached>
	//*  67  133:ifeq            150
	//*  68  136:aload           4
	//*  69  138:getfield        #198 <Field boolean Fragment.mIsNewlyAdded>
	//*  70  141:ifne            150
					moveFragmentToExpectedState(fragment);
	//   71  144:aload_0         
	//   72  145:aload           4
	//   73  147:invokevirtual   #1347 <Method void moveFragmentToExpectedState(Fragment)>
			}

	//   74  150:iload_1         
	//   75  151:iconst_1        
	//   76  152:iadd            
	//   77  153:istore_1        
	//*  78  154:goto            97
			startPendingDeferredFragments();
	//   79  157:aload_0         
	//   80  158:invokevirtual   #1084 <Method void startPendingDeferredFragments()>
			if(mNeedMenuInvalidate)
	//*  81  161:aload_0         
	//*  82  162:getfield        #823 <Field boolean mNeedMenuInvalidate>
	//*  83  165:ifeq            197
			{
				FragmentHostCallback fragmenthostcallback = mHost;
	//   84  168:aload_0         
	//   85  169:getfield        #369 <Field FragmentHostCallback mHost>
	//   86  172:astore          4
				if(fragmenthostcallback != null && mCurState == 4)
	//*  87  174:aload           4
	//*  88  176:ifnull          197
	//*  89  179:aload_0         
	//*  90  180:getfield        #148 <Field int mCurState>
	//*  91  183:iconst_4        
	//*  92  184:icmpne          197
				{
					fragmenthostcallback.onSupportInvalidateOptionsMenu();
	//   93  187:aload           4
	//   94  189:invokevirtual   #1350 <Method void FragmentHostCallback.onSupportInvalidateOptionsMenu()>
					mNeedMenuInvalidate = false;
	//   95  192:aload_0         
	//   96  193:iconst_0        
	//   97  194:putfield        #823 <Field boolean mNeedMenuInvalidate>
				}
			}
		}
	//   98  197:return          
	}

	void moveToState(Fragment fragment)
	{
		moveToState(fragment, mCurState, 0, 0, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #148 <Field int mCurState>
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #188 <Method void moveToState(Fragment, int, int, int, boolean)>
	//    8   12:return          
	}

	void moveToState(Fragment fragment, int i, int j, int k, boolean flag)
	{
		android.content.res.Resources.NotFoundException notfoundexception;
		boolean flag3 = fragment.mAdded;
	//    0    0:aload_1         
	//    1    1:getfield        #594 <Field boolean Fragment.mAdded>
	//    2    4:istore          9
		boolean flag1 = true;
	//    3    6:iconst_1        
	//    4    7:istore          7
		boolean flag2 = true;
	//    5    9:iconst_1        
	//    6   10:istore          8
		if(!flag3 || fragment.mDetached)
	//*   7   12:iload           9
	//*   8   14:ifeq            30
	//*   9   17:aload_1         
	//*  10   18:getfield        #806 <Field boolean Fragment.mDetached>
	//*  11   21:ifeq            27
	//*  12   24:goto            30
	//*  13   27:goto            44
		{
			int l = i;
	//   14   30:iload_2         
	//   15   31:istore          6
			i = l;
	//   16   33:iload           6
	//   17   35:istore_2        
			if(l > 1)
	//*  18   36:iload           6
	//*  19   38:iconst_1        
	//*  20   39:icmple          44
				i = 1;
	//   21   42:iconst_1        
	//   22   43:istore_2        
		}
		int i1 = i;
	//   23   44:iload_2         
	//   24   45:istore          6
		if(fragment.mRemoving)
	//*  25   47:aload_1         
	//*  26   48:getfield        #812 <Field boolean Fragment.mRemoving>
	//*  27   51:ifeq            91
		{
			i1 = i;
	//   28   54:iload_2         
	//   29   55:istore          6
			if(i > fragment.mState)
	//*  30   57:iload_2         
	//*  31   58:aload_1         
	//*  32   59:getfield        #178 <Field int Fragment.mState>
	//*  33   62:icmple          91
				if(fragment.mState == 0 && fragment.isInBackStack())
	//*  34   65:aload_1         
	//*  35   66:getfield        #178 <Field int Fragment.mState>
	//*  36   69:ifne            85
	//*  37   72:aload_1         
	//*  38   73:invokevirtual   #1328 <Method boolean Fragment.isInBackStack()>
	//*  39   76:ifeq            85
					i1 = 1;
	//   40   79:iconst_1        
	//   41   80:istore          6
				else
	//*  42   82:goto            91
					i1 = fragment.mState;
	//   43   85:aload_1         
	//   44   86:getfield        #178 <Field int Fragment.mState>
	//   45   89:istore          6
		}
		if(fragment.mDeferStart && fragment.mState < 3 && i1 > 2)
	//*  46   91:aload_1         
	//*  47   92:getfield        #1353 <Field boolean Fragment.mDeferStart>
	//*  48   95:ifeq            117
	//*  49   98:aload_1         
	//*  50   99:getfield        #178 <Field int Fragment.mState>
	//*  51  102:iconst_3        
	//*  52  103:icmpge          117
	//*  53  106:iload           6
	//*  54  108:iconst_2        
	//*  55  109:icmple          117
			i = 2;
	//   56  112:iconst_2        
	//   57  113:istore_2        
		else
	//*  58  114:goto            120
			i = i1;
	//   59  117:iload           6
	//   60  119:istore_2        
		if(fragment.mState <= i)
	//*  61  120:aload_1         
	//*  62  121:getfield        #178 <Field int Fragment.mState>
	//*  63  124:iload_2         
	//*  64  125:icmpgt          1368
		{
			if(fragment.mFromLayout && !fragment.mInLayout)
	//*  65  128:aload_1         
	//*  66  129:getfield        #1173 <Field boolean Fragment.mFromLayout>
	//*  67  132:ifeq            143
	//*  68  135:aload_1         
	//*  69  136:getfield        #1356 <Field boolean Fragment.mInLayout>
	//*  70  139:ifne            143
				return;
	//   71  142:return          
			if(fragment.getAnimatingAway() != null || fragment.getAnimator() != null)
	//*  72  143:aload_1         
	//*  73  144:invokevirtual   #345 <Method View Fragment.getAnimatingAway()>
	//*  74  147:ifnonnull       157
	//*  75  150:aload_1         
	//*  76  151:invokevirtual   #362 <Method Animator Fragment.getAnimator()>
	//*  77  154:ifnull          179
			{
				fragment.setAnimatingAway(((View) (null)));
	//   78  157:aload_1         
	//   79  158:aconst_null     
	//   80  159:invokevirtual   #232 <Method void Fragment.setAnimatingAway(View)>
				fragment.setAnimator(((Animator) (null)));
	//   81  162:aload_1         
	//   82  163:aconst_null     
	//   83  164:invokevirtual   #263 <Method void Fragment.setAnimator(Animator)>
				moveToState(fragment, fragment.getStateAfterAnimating(), 0, 0, true);
	//   84  167:aload_0         
	//   85  168:aload_1         
	//   86  169:aload_1         
	//   87  170:invokevirtual   #348 <Method int Fragment.getStateAfterAnimating()>
	//   88  173:iconst_0        
	//   89  174:iconst_0        
	//   90  175:iconst_1        
	//   91  176:invokevirtual   #188 <Method void moveToState(Fragment, int, int, int, boolean)>
			}
			j = i;
	//   92  179:iload_2         
	//   93  180:istore_3        
			k = i;
	//   94  181:iload_2         
	//   95  182:istore          4
			int j1 = i;
	//   96  184:iload_2         
	//   97  185:istore          6
			switch(fragment.mState)
	//*  98  187:aload_1         
	//*  99  188:getfield        #178 <Field int Fragment.mState>
			{
	//* 100  191:tableswitch     0 3: default 220
	//	               0 223
	//	               1 766
	//	               2 1226
	//	               3 1293
	//* 101  220:goto            1968
			case 0: // '\0'
				j = i;
	//  102  223:iload_2         
	//  103  224:istore_3        
				if(i > 0)
	//* 104  225:iload_2         
	//* 105  226:ifle            766
				{
					if(DEBUG)
	//* 106  229:getstatic       #791 <Field boolean DEBUG>
	//* 107  232:ifeq            272
					{
						StringBuilder stringbuilder = new StringBuilder();
	//  108  235:new             #305 <Class StringBuilder>
	//  109  238:dup             
	//  110  239:invokespecial   #306 <Method void StringBuilder()>
	//  111  242:astore          10
						stringbuilder.append("moveto CREATED: ");
	//  112  244:aload           10
	//  113  246:ldc2            #1358 <String "moveto CREATED: ">
	//  114  249:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  115  252:pop             
						stringbuilder.append(((Object) (fragment)));
	//  116  253:aload           10
	//  117  255:aload_1         
	//  118  256:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//  119  259:pop             
						Log.v("FragmentManager", stringbuilder.toString());
	//  120  260:ldc2            #544 <String "FragmentManager">
	//  121  263:aload           10
	//  122  265:invokevirtual   #318 <Method String StringBuilder.toString()>
	//  123  268:invokestatic    #799 <Method int Log.v(String, String)>
	//  124  271:pop             
					}
					j = i;
	//  125  272:iload_2         
	//  126  273:istore_3        
					if(fragment.mSavedFragmentState != null)
	//* 127  274:aload_1         
	//* 128  275:getfield        #1179 <Field Bundle Fragment.mSavedFragmentState>
	//* 129  278:ifnull          413
					{
						fragment.mSavedFragmentState.setClassLoader(mHost.getContext().getClassLoader());
	//  130  281:aload_1         
	//  131  282:getfield        #1179 <Field Bundle Fragment.mSavedFragmentState>
	//  132  285:aload_0         
	//  133  286:getfield        #369 <Field FragmentHostCallback mHost>
	//  134  289:invokevirtual   #1270 <Method Context FragmentHostCallback.getContext()>
	//  135  292:invokevirtual   #1362 <Method ClassLoader Context.getClassLoader()>
	//  136  295:invokevirtual   #1366 <Method void Bundle.setClassLoader(ClassLoader)>
						fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
	//  137  298:aload_1         
	//  138  299:aload_1         
	//  139  300:getfield        #1179 <Field Bundle Fragment.mSavedFragmentState>
	//  140  303:ldc2            #1368 <String "android:view_state">
	//  141  306:invokevirtual   #1372 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//  142  309:putfield        #1375 <Field SparseArray Fragment.mSavedViewState>
						fragment.mTarget = getFragment(fragment.mSavedFragmentState, "android:target_state");
	//  143  312:aload_1         
	//  144  313:aload_0         
	//  145  314:aload_1         
	//  146  315:getfield        #1179 <Field Bundle Fragment.mSavedFragmentState>
	//  147  318:ldc2            #1377 <String "android:target_state">
	//  148  321:invokevirtual   #1379 <Method Fragment getFragment(Bundle, String)>
	//  149  324:putfield        #1382 <Field Fragment Fragment.mTarget>
						if(fragment.mTarget != null)
	//* 150  327:aload_1         
	//* 151  328:getfield        #1382 <Field Fragment Fragment.mTarget>
	//* 152  331:ifnull          349
							fragment.mTargetRequestCode = fragment.mSavedFragmentState.getInt("android:target_req_state", 0);
	//  153  334:aload_1         
	//  154  335:aload_1         
	//  155  336:getfield        #1179 <Field Bundle Fragment.mSavedFragmentState>
	//  156  339:ldc2            #1384 <String "android:target_req_state">
	//  157  342:iconst_0        
	//  158  343:invokevirtual   #1230 <Method int Bundle.getInt(String, int)>
	//  159  346:putfield        #1387 <Field int Fragment.mTargetRequestCode>
						if(fragment.mSavedUserVisibleHint != null)
	//* 160  349:aload_1         
	//* 161  350:getfield        #1391 <Field Boolean Fragment.mSavedUserVisibleHint>
	//* 162  353:ifnull          375
						{
							fragment.mUserVisibleHint = fragment.mSavedUserVisibleHint.booleanValue();
	//  163  356:aload_1         
	//  164  357:aload_1         
	//  165  358:getfield        #1391 <Field Boolean Fragment.mSavedUserVisibleHint>
	//  166  361:invokevirtual   #407 <Method boolean Boolean.booleanValue()>
	//  167  364:putfield        #1394 <Field boolean Fragment.mUserVisibleHint>
							fragment.mSavedUserVisibleHint = null;
	//  168  367:aload_1         
	//  169  368:aconst_null     
	//  170  369:putfield        #1391 <Field Boolean Fragment.mSavedUserVisibleHint>
						} else
	//* 171  372:goto            390
						{
							fragment.mUserVisibleHint = fragment.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
	//  172  375:aload_1         
	//  173  376:aload_1         
	//  174  377:getfield        #1179 <Field Bundle Fragment.mSavedFragmentState>
	//  175  380:ldc2            #1396 <String "android:user_visible_hint">
	//  176  383:iconst_1        
	//  177  384:invokevirtual   #1400 <Method boolean Bundle.getBoolean(String, boolean)>
	//  178  387:putfield        #1394 <Field boolean Fragment.mUserVisibleHint>
						}
						j = i;
	//  179  390:iload_2         
	//  180  391:istore_3        
						if(!fragment.mUserVisibleHint)
	//* 181  392:aload_1         
	//* 182  393:getfield        #1394 <Field boolean Fragment.mUserVisibleHint>
	//* 183  396:ifne            413
						{
							fragment.mDeferStart = true;
	//  184  399:aload_1         
	//  185  400:iconst_1        
	//  186  401:putfield        #1353 <Field boolean Fragment.mDeferStart>
							j = i;
	//  187  404:iload_2         
	//  188  405:istore_3        
							if(i > 2)
	//* 189  406:iload_2         
	//* 190  407:iconst_2        
	//* 191  408:icmple          413
								j = 2;
	//  192  411:iconst_2        
	//  193  412:istore_3        
						}
					}
					Object obj = ((Object) (mHost));
	//  194  413:aload_0         
	//  195  414:getfield        #369 <Field FragmentHostCallback mHost>
	//  196  417:astore          10
					fragment.mHost = ((FragmentHostCallback) (obj));
	//  197  419:aload_1         
	//  198  420:aload           10
	//  199  422:putfield        #1401 <Field FragmentHostCallback Fragment.mHost>
					Fragment fragment1 = mParent;
	//  200  425:aload_0         
	//  201  426:getfield        #859 <Field Fragment mParent>
	//  202  429:astore          11
					fragment.mParentFragment = fragment1;
	//  203  431:aload_1         
	//  204  432:aload           11
	//  205  434:putfield        #1404 <Field Fragment Fragment.mParentFragment>
					if(fragment1 != null)
	//* 206  437:aload           11
	//* 207  439:ifnull          452
						obj = ((Object) (fragment1.mChildFragmentManager));
	//  208  442:aload           11
	//  209  444:getfield        #1408 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
	//  210  447:astore          10
					else
	//* 211  449:goto            459
						obj = ((Object) (((FragmentHostCallback) (obj)).getFragmentManagerImpl()));
	//  212  452:aload           10
	//  213  454:invokevirtual   #1412 <Method FragmentManagerImpl FragmentHostCallback.getFragmentManagerImpl()>
	//  214  457:astore          10
					fragment.mFragmentManager = ((FragmentManagerImpl) (obj));
	//  215  459:aload_1         
	//  216  460:aload           10
	//  217  462:putfield        #1415 <Field FragmentManagerImpl Fragment.mFragmentManager>
					if(fragment.mTarget != null)
	//* 218  465:aload_1         
	//* 219  466:getfield        #1382 <Field Fragment Fragment.mTarget>
	//* 220  469:ifnull          585
						if(mActive.get(fragment.mTarget.mIndex) == fragment.mTarget)
	//* 221  472:aload_0         
	//* 222  473:getfield        #283 <Field SparseArray mActive>
	//* 223  476:aload_1         
	//* 224  477:getfield        #1382 <Field Fragment Fragment.mTarget>
	//* 225  480:getfield        #1308 <Field int Fragment.mIndex>
	//* 226  483:invokevirtual   #1231 <Method Object SparseArray.get(int)>
	//* 227  486:aload_1         
	//* 228  487:getfield        #1382 <Field Fragment Fragment.mTarget>
	//* 229  490:if_acmpne       519
						{
							if(fragment.mTarget.mState < 1)
	//* 230  493:aload_1         
	//* 231  494:getfield        #1382 <Field Fragment Fragment.mTarget>
	//* 232  497:getfield        #178 <Field int Fragment.mState>
	//* 233  500:iconst_1        
	//* 234  501:icmpge          585
								moveToState(fragment.mTarget, 1, 0, 0, true);
	//  235  504:aload_0         
	//  236  505:aload_1         
	//  237  506:getfield        #1382 <Field Fragment Fragment.mTarget>
	//  238  509:iconst_1        
	//  239  510:iconst_0        
	//  240  511:iconst_0        
	//  241  512:iconst_1        
	//  242  513:invokevirtual   #188 <Method void moveToState(Fragment, int, int, int, boolean)>
						} else
	//* 243  516:goto            585
						{
							StringBuilder stringbuilder1 = new StringBuilder();
	//  244  519:new             #305 <Class StringBuilder>
	//  245  522:dup             
	//  246  523:invokespecial   #306 <Method void StringBuilder()>
	//  247  526:astore          10
							stringbuilder1.append("Fragment ");
	//  248  528:aload           10
	//  249  530:ldc2            #1417 <String "Fragment ">
	//  250  533:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  251  536:pop             
							stringbuilder1.append(((Object) (fragment)));
	//  252  537:aload           10
	//  253  539:aload_1         
	//  254  540:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//  255  543:pop             
							stringbuilder1.append(" declared target fragment ");
	//  256  544:aload           10
	//  257  546:ldc2            #1419 <String " declared target fragment ">
	//  258  549:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  259  552:pop             
							stringbuilder1.append(((Object) (fragment.mTarget)));
	//  260  553:aload           10
	//  261  555:aload_1         
	//  262  556:getfield        #1382 <Field Fragment Fragment.mTarget>
	//  263  559:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//  264  562:pop             
							stringbuilder1.append(" that does not belong to this FragmentManager!");
	//  265  563:aload           10
	//  266  565:ldc2            #1421 <String " that does not belong to this FragmentManager!">
	//  267  568:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  268  571:pop             
							throw new IllegalStateException(stringbuilder1.toString());
	//  269  572:new             #314 <Class IllegalStateException>
	//  270  575:dup             
	//  271  576:aload           10
	//  272  578:invokevirtual   #318 <Method String StringBuilder.toString()>
	//  273  581:invokespecial   #321 <Method void IllegalStateException(String)>
	//  274  584:athrow          
						}
					dispatchOnFragmentPreAttached(fragment, mHost.getContext(), false);
	//  275  585:aload_0         
	//  276  586:aload_1         
	//  277  587:aload_0         
	//  278  588:getfield        #369 <Field FragmentHostCallback mHost>
	//  279  591:invokevirtual   #1270 <Method Context FragmentHostCallback.getContext()>
	//  280  594:iconst_0        
	//  281  595:invokevirtual   #1010 <Method void dispatchOnFragmentPreAttached(Fragment, Context, boolean)>
					fragment.mCalled = false;
	//  282  598:aload_1         
	//  283  599:iconst_0        
	//  284  600:putfield        #1424 <Field boolean Fragment.mCalled>
					fragment.onAttach(mHost.getContext());
	//  285  603:aload_1         
	//  286  604:aload_0         
	//  287  605:getfield        #369 <Field FragmentHostCallback mHost>
	//  288  608:invokevirtual   #1270 <Method Context FragmentHostCallback.getContext()>
	//  289  611:invokevirtual   #1428 <Method void Fragment.onAttach(Context)>
					if(fragment.mCalled)
	//* 290  614:aload_1         
	//* 291  615:getfield        #1424 <Field boolean Fragment.mCalled>
	//* 292  618:ifeq            719
					{
						if(fragment.mParentFragment == null)
	//* 293  621:aload_1         
	//* 294  622:getfield        #1404 <Field Fragment Fragment.mParentFragment>
	//* 295  625:ifnonnull       639
							mHost.onAttachFragment(fragment);
	//  296  628:aload_0         
	//  297  629:getfield        #369 <Field FragmentHostCallback mHost>
	//  298  632:aload_1         
	//  299  633:invokevirtual   #1431 <Method void FragmentHostCallback.onAttachFragment(Fragment)>
						else
	//* 300  636:goto            647
							fragment.mParentFragment.onAttachFragment(fragment);
	//  301  639:aload_1         
	//  302  640:getfield        #1404 <Field Fragment Fragment.mParentFragment>
	//  303  643:aload_1         
	//  304  644:invokevirtual   #1432 <Method void Fragment.onAttachFragment(Fragment)>
						dispatchOnFragmentAttached(fragment, mHost.getContext(), false);
	//  305  647:aload_0         
	//  306  648:aload_1         
	//  307  649:aload_0         
	//  308  650:getfield        #369 <Field FragmentHostCallback mHost>
	//  309  653:invokevirtual   #1270 <Method Context FragmentHostCallback.getContext()>
	//  310  656:iconst_0        
	//  311  657:invokevirtual   #978 <Method void dispatchOnFragmentAttached(Fragment, Context, boolean)>
						if(!fragment.mIsCreated)
	//* 312  660:aload_1         
	//* 313  661:getfield        #1435 <Field boolean Fragment.mIsCreated>
	//* 314  664:ifne            698
						{
							dispatchOnFragmentPreCreated(fragment, fragment.mSavedFragmentState, false);
	//  315  667:aload_0         
	//  316  668:aload_1         
	//  317  669:aload_1         
	//  318  670:getfield        #1179 <Field Bundle Fragment.mSavedFragmentState>
	//  319  673:iconst_0        
	//  320  674:invokevirtual   #1016 <Method void dispatchOnFragmentPreCreated(Fragment, Bundle, boolean)>
							fragment.performCreate(fragment.mSavedFragmentState);
	//  321  677:aload_1         
	//  322  678:aload_1         
	//  323  679:getfield        #1179 <Field Bundle Fragment.mSavedFragmentState>
	//  324  682:invokevirtual   #1439 <Method void Fragment.performCreate(Bundle)>
							dispatchOnFragmentCreated(fragment, fragment.mSavedFragmentState, false);
	//  325  685:aload_0         
	//  326  686:aload_1         
	//  327  687:aload_1         
	//  328  688:getfield        #1179 <Field Bundle Fragment.mSavedFragmentState>
	//  329  691:iconst_0        
	//  330  692:invokevirtual   #985 <Method void dispatchOnFragmentCreated(Fragment, Bundle, boolean)>
						} else
	//* 331  695:goto            711
						{
							fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
	//  332  698:aload_1         
	//  333  699:aload_1         
	//  334  700:getfield        #1179 <Field Bundle Fragment.mSavedFragmentState>
	//  335  703:invokevirtual   #1442 <Method void Fragment.restoreChildFragmentState(Bundle)>
							fragment.mState = 1;
	//  336  706:aload_1         
	//  337  707:iconst_1        
	//  338  708:putfield        #178 <Field int Fragment.mState>
						}
						fragment.mRetaining = false;
	//  339  711:aload_1         
	//  340  712:iconst_0        
	//  341  713:putfield        #727 <Field boolean Fragment.mRetaining>
					} else
	//* 342  716:goto            766
					{
						StringBuilder stringbuilder2 = new StringBuilder();
	//  343  719:new             #305 <Class StringBuilder>
	//  344  722:dup             
	//  345  723:invokespecial   #306 <Method void StringBuilder()>
	//  346  726:astore          10
						stringbuilder2.append("Fragment ");
	//  347  728:aload           10
	//  348  730:ldc2            #1417 <String "Fragment ">
	//  349  733:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  350  736:pop             
						stringbuilder2.append(((Object) (fragment)));
	//  351  737:aload           10
	//  352  739:aload_1         
	//  353  740:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//  354  743:pop             
						stringbuilder2.append(" did not call through to super.onAttach()");
	//  355  744:aload           10
	//  356  746:ldc2            #1444 <String " did not call through to super.onAttach()">
	//  357  749:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  358  752:pop             
						throw new SuperNotCalledException(stringbuilder2.toString());
	//  359  753:new             #1446 <Class SuperNotCalledException>
	//  360  756:dup             
	//  361  757:aload           10
	//  362  759:invokevirtual   #318 <Method String StringBuilder.toString()>
	//  363  762:invokespecial   #1447 <Method void SuperNotCalledException(String)>
	//  364  765:athrow          
					}
				}
				// fall through

			case 1: // '\001'
				ensureInflatedFragmentView(fragment);
	//  365  766:aload_0         
	//  366  767:aload_1         
	//  367  768:invokevirtual   #1449 <Method void ensureInflatedFragmentView(Fragment)>
				k = j;
	//  368  771:iload_3         
	//  369  772:istore          4
				if(j > 1)
	//* 370  774:iload_3         
	//* 371  775:iconst_1        
	//* 372  776:icmple          1226
				{
					if(DEBUG)
	//* 373  779:getstatic       #791 <Field boolean DEBUG>
	//* 374  782:ifeq            822
					{
						StringBuilder stringbuilder3 = new StringBuilder();
	//  375  785:new             #305 <Class StringBuilder>
	//  376  788:dup             
	//  377  789:invokespecial   #306 <Method void StringBuilder()>
	//  378  792:astore          10
						stringbuilder3.append("moveto ACTIVITY_CREATED: ");
	//  379  794:aload           10
	//  380  796:ldc2            #1451 <String "moveto ACTIVITY_CREATED: ">
	//  381  799:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  382  802:pop             
						stringbuilder3.append(((Object) (fragment)));
	//  383  803:aload           10
	//  384  805:aload_1         
	//  385  806:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//  386  809:pop             
						Log.v("FragmentManager", stringbuilder3.toString());
	//  387  810:ldc2            #544 <String "FragmentManager">
	//  388  813:aload           10
	//  389  815:invokevirtual   #318 <Method String StringBuilder.toString()>
	//  390  818:invokestatic    #799 <Method int Log.v(String, String)>
	//  391  821:pop             
					}
					if(!fragment.mFromLayout)
	//* 392  822:aload_1         
	//* 393  823:getfield        #1173 <Field boolean Fragment.mFromLayout>
	//* 394  826:ifne            1185
					{
						Object obj1;
						if(fragment.mContainerId != 0)
	//* 395  829:aload_1         
	//* 396  830:getfield        #880 <Field int Fragment.mContainerId>
	//* 397  833:ifeq            1038
						{
							if(fragment.mContainerId == -1)
	//* 398  836:aload_1         
	//* 399  837:getfield        #880 <Field int Fragment.mContainerId>
	//* 400  840:iconst_m1       
	//* 401  841:icmpne          894
							{
								StringBuilder stringbuilder4 = new StringBuilder();
	//  402  844:new             #305 <Class StringBuilder>
	//  403  847:dup             
	//  404  848:invokespecial   #306 <Method void StringBuilder()>
	//  405  851:astore          10
								stringbuilder4.append("Cannot create fragment ");
	//  406  853:aload           10
	//  407  855:ldc2            #1453 <String "Cannot create fragment ">
	//  408  858:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  409  861:pop             
								stringbuilder4.append(((Object) (fragment)));
	//  410  862:aload           10
	//  411  864:aload_1         
	//  412  865:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//  413  868:pop             
								stringbuilder4.append(" for a container view with no id");
	//  414  869:aload           10
	//  415  871:ldc2            #1455 <String " for a container view with no id">
	//  416  874:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  417  877:pop             
								throwException(((RuntimeException) (new IllegalArgumentException(stringbuilder4.toString()))));
	//  418  878:aload_0         
	//  419  879:new             #1457 <Class IllegalArgumentException>
	//  420  882:dup             
	//  421  883:aload           10
	//  422  885:invokevirtual   #318 <Method String StringBuilder.toString()>
	//  423  888:invokespecial   #1458 <Method void IllegalArgumentException(String)>
	//  424  891:invokespecial   #1237 <Method void throwException(RuntimeException)>
							}
							ViewGroup viewgroup = (ViewGroup)mContainer.onFindViewById(fragment.mContainerId);
	//  425  894:aload_0         
	//  426  895:getfield        #857 <Field FragmentContainer mContainer>
	//  427  898:aload_1         
	//  428  899:getfield        #880 <Field int Fragment.mContainerId>
	//  429  902:invokevirtual   #1464 <Method View FragmentContainer.onFindViewById(int)>
	//  430  905:checkcast       #214 <Class ViewGroup>
	//  431  908:astore          11
							obj1 = ((Object) (viewgroup));
	//  432  910:aload           11
	//  433  912:astore          10
							if(viewgroup == null)
	//* 434  914:aload           11
	//* 435  916:ifnonnull       1041
							{
								obj1 = ((Object) (viewgroup));
	//  436  919:aload           11
	//  437  921:astore          10
								if(!fragment.mRestored)
	//* 438  923:aload_1         
	//* 439  924:getfield        #1467 <Field boolean Fragment.mRestored>
	//* 440  927:ifne            1041
								{
									try
									{
										obj1 = ((Object) (fragment.getResources().getResourceName(fragment.mContainerId)));
	//  441  930:aload_1         
	//  442  931:invokevirtual   #1468 <Method Resources Fragment.getResources()>
	//  443  934:aload_1         
	//  444  935:getfield        #880 <Field int Fragment.mContainerId>
	//  445  938:invokevirtual   #1471 <Method String Resources.getResourceName(int)>
	//  446  941:astore          10
									}
	//* 447  943:goto            951
	//* 448  946:ldc2            #1473 <String "unknown">
	//* 449  949:astore          10
	//* 450  951:new             #305 <Class StringBuilder>
	//* 451  954:dup             
	//* 452  955:invokespecial   #306 <Method void StringBuilder()>
	//* 453  958:astore          12
	//* 454  960:aload           12
	//* 455  962:ldc2            #1475 <String "No view found for id 0x">
	//* 456  965:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//* 457  968:pop             
	//* 458  969:aload           12
	//* 459  971:aload_1         
	//* 460  972:getfield        #880 <Field int Fragment.mContainerId>
	//* 461  975:invokestatic    #1100 <Method String Integer.toHexString(int)>
	//* 462  978:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//* 463  981:pop             
	//* 464  982:aload           12
	//* 465  984:ldc2            #1477 <String " (">
	//* 466  987:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//* 467  990:pop             
	//* 468  991:aload           12
	//* 469  993:aload           10
	//* 470  995:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//* 471  998:pop             
	//* 472  999:aload           12
	//* 473 1001:ldc2            #1479 <String ") for fragment ">
	//* 474 1004:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//* 475 1007:pop             
	//* 476 1008:aload           12
	//* 477 1010:aload_1         
	//* 478 1011:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//* 479 1014:pop             
	//* 480 1015:aload_0         
	//* 481 1016:new             #1457 <Class IllegalArgumentException>
	//* 482 1019:dup             
	//* 483 1020:aload           12
	//* 484 1022:invokevirtual   #318 <Method String StringBuilder.toString()>
	//* 485 1025:invokespecial   #1458 <Method void IllegalArgumentException(String)>
	//* 486 1028:invokespecial   #1237 <Method void throwException(RuntimeException)>
	//* 487 1031:aload           11
	//* 488 1033:astore          10
	//* 489 1035:goto            1041
	//* 490 1038:aconst_null     
	//* 491 1039:astore          10
	//* 492 1041:aload_1         
	//* 493 1042:aload           10
	//* 494 1044:putfield        #212 <Field ViewGroup Fragment.mContainer>
	//* 495 1047:aload_1         
	//* 496 1048:aload_1         
	//* 497 1049:aload_1         
	//* 498 1050:getfield        #1179 <Field Bundle Fragment.mSavedFragmentState>
	//* 499 1053:invokevirtual   #1183 <Method android.view.LayoutInflater Fragment.performGetLayoutInflater(Bundle)>
	//* 500 1056:aload           10
	//* 501 1058:aload_1         
	//* 502 1059:getfield        #1179 <Field Bundle Fragment.mSavedFragmentState>
	//* 503 1062:invokevirtual   #1187 <Method void Fragment.performCreateView(android.view.LayoutInflater, ViewGroup, Bundle)>
	//* 504 1065:aload_1         
	//* 505 1066:getfield        #192 <Field View Fragment.mView>
	//* 506 1069:ifnull          1180
	//* 507 1072:aload_1         
	//* 508 1073:aload_1         
	//* 509 1074:getfield        #192 <Field View Fragment.mView>
	//* 510 1077:putfield        #1190 <Field View Fragment.mInnerView>
	//* 511 1080:aload_1         
	//* 512 1081:getfield        #192 <Field View Fragment.mView>
	//* 513 1084:iconst_0        
	//* 514 1085:invokevirtual   #1193 <Method void View.setSaveFromParentEnabled(boolean)>
	//* 515 1088:aload           10
	//* 516 1090:ifnull          1102
	//* 517 1093:aload           10
	//* 518 1095:aload_1         
	//* 519 1096:getfield        #192 <Field View Fragment.mView>
	//* 520 1099:invokevirtual   #1481 <Method void ViewGroup.addView(View)>
	//* 521 1102:aload_1         
	//* 522 1103:getfield        #195 <Field boolean Fragment.mHidden>
	//* 523 1106:ifeq            1118
	//* 524 1109:aload_1         
	//* 525 1110:getfield        #192 <Field View Fragment.mView>
	//* 526 1113:bipush          8
	//* 527 1115:invokevirtual   #902 <Method void View.setVisibility(int)>
	//* 528 1118:aload_1         
	//* 529 1119:aload_1         
	//* 530 1120:getfield        #192 <Field View Fragment.mView>
	//* 531 1123:aload_1         
	//* 532 1124:getfield        #1179 <Field Bundle Fragment.mSavedFragmentState>
	//* 533 1127:invokevirtual   #1197 <Method void Fragment.onViewCreated(View, Bundle)>
	//* 534 1130:aload_0         
	//* 535 1131:aload_1         
	//* 536 1132:aload_1         
	//* 537 1133:getfield        #192 <Field View Fragment.mView>
	//* 538 1136:aload_1         
	//* 539 1137:getfield        #1179 <Field Bundle Fragment.mSavedFragmentState>
	//* 540 1140:iconst_0        
	//* 541 1141:invokevirtual   #1047 <Method void dispatchOnFragmentViewCreated(Fragment, View, Bundle, boolean)>
	//* 542 1144:aload_1         
	//* 543 1145:getfield        #192 <Field View Fragment.mView>
	//* 544 1148:invokevirtual   #1484 <Method int View.getVisibility()>
	//* 545 1151:ifne            1168
	//* 546 1154:aload_1         
	//* 547 1155:getfield        #212 <Field ViewGroup Fragment.mContainer>
	//* 548 1158:ifnull          1168
	//* 549 1161:iload           8
	//* 550 1163:istore          5
	//* 551 1165:goto            1171
	//* 552 1168:iconst_0        
	//* 553 1169:istore          5
	//* 554 1171:aload_1         
	//* 555 1172:iload           5
	//* 556 1174:putfield        #198 <Field boolean Fragment.mIsNewlyAdded>
	//* 557 1177:goto            1185
	//* 558 1180:aload_1         
	//* 559 1181:aconst_null     
	//* 560 1182:putfield        #1190 <Field View Fragment.mInnerView>
	//* 561 1185:aload_1         
	//* 562 1186:aload_1         
	//* 563 1187:getfield        #1179 <Field Bundle Fragment.mSavedFragmentState>
	//* 564 1190:invokevirtual   #1487 <Method void Fragment.performActivityCreated(Bundle)>
	//* 565 1193:aload_0         
	//* 566 1194:aload_1         
	//* 567 1195:aload_1         
	//* 568 1196:getfield        #1179 <Field Bundle Fragment.mSavedFragmentState>
	//* 569 1199:iconst_0        
	//* 570 1200:invokevirtual   #960 <Method void dispatchOnFragmentActivityCreated(Fragment, Bundle, boolean)>
	//* 571 1203:aload_1         
	//* 572 1204:getfield        #192 <Field View Fragment.mView>
	//* 573 1207:ifnull          1218
	//* 574 1210:aload_1         
	//* 575 1211:aload_1         
	//* 576 1212:getfield        #1179 <Field Bundle Fragment.mSavedFragmentState>
	//* 577 1215:invokevirtual   #1490 <Method void Fragment.restoreViewState(Bundle)>
	//* 578 1218:aload_1         
	//* 579 1219:aconst_null     
	//* 580 1220:putfield        #1179 <Field Bundle Fragment.mSavedFragmentState>
	//* 581 1223:iload_3         
	//* 582 1224:istore          4
	//* 583 1226:iload           4
	//* 584 1228:istore          6
	//* 585 1230:iload           4
	//* 586 1232:iconst_2        
	//* 587 1233:icmple          1293
	//* 588 1236:getstatic       #791 <Field boolean DEBUG>
	//* 589 1239:ifeq            1279
	//* 590 1242:new             #305 <Class StringBuilder>
	//* 591 1245:dup             
	//* 592 1246:invokespecial   #306 <Method void StringBuilder()>
	//* 593 1249:astore          10
	//* 594 1251:aload           10
	//* 595 1253:ldc2            #1492 <String "moveto STARTED: ">
	//* 596 1256:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//* 597 1259:pop             
	//* 598 1260:aload           10
	//* 599 1262:aload_1         
	//* 600 1263:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//* 601 1266:pop             
	//* 602 1267:ldc2            #544 <String "FragmentManager">
	//* 603 1270:aload           10
	//* 604 1272:invokevirtual   #318 <Method String StringBuilder.toString()>
	//* 605 1275:invokestatic    #799 <Method int Log.v(String, String)>
	//* 606 1278:pop             
	//* 607 1279:aload_1         
	//* 608 1280:invokevirtual   #1495 <Method void Fragment.performStart()>
	//* 609 1283:aload_0         
	//* 610 1284:aload_1         
	//* 611 1285:iconst_0        
	//* 612 1286:invokevirtual   #1034 <Method void dispatchOnFragmentStarted(Fragment, boolean)>
	//* 613 1289:iload           4
	//* 614 1291:istore          6
	//* 615 1293:iload           6
	//* 616 1295:iconst_3        
	//* 617 1296:icmple          1362
	//* 618 1299:getstatic       #791 <Field boolean DEBUG>
	//* 619 1302:ifeq            1342
	//* 620 1305:new             #305 <Class StringBuilder>
	//* 621 1308:dup             
	//* 622 1309:invokespecial   #306 <Method void StringBuilder()>
	//* 623 1312:astore          10
	//* 624 1314:aload           10
	//* 625 1316:ldc2            #1497 <String "moveto RESUMED: ">
	//* 626 1319:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//* 627 1322:pop             
	//* 628 1323:aload           10
	//* 629 1325:aload_1         
	//* 630 1326:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//* 631 1329:pop             
	//* 632 1330:ldc2            #544 <String "FragmentManager">
	//* 633 1333:aload           10
	//* 634 1335:invokevirtual   #318 <Method String StringBuilder.toString()>
	//* 635 1338:invokestatic    #799 <Method int Log.v(String, String)>
	//* 636 1341:pop             
	//* 637 1342:aload_1         
	//* 638 1343:invokevirtual   #1500 <Method void Fragment.performResume()>
	//* 639 1346:aload_0         
	//* 640 1347:aload_1         
	//* 641 1348:iconst_0        
	//* 642 1349:invokevirtual   #1022 <Method void dispatchOnFragmentResumed(Fragment, boolean)>
	//* 643 1352:aload_1         
	//* 644 1353:aconst_null     
	//* 645 1354:putfield        #1179 <Field Bundle Fragment.mSavedFragmentState>
	//* 646 1357:aload_1         
	//* 647 1358:aconst_null     
	//* 648 1359:putfield        #1375 <Field SparseArray Fragment.mSavedViewState>
	//* 649 1362:iload           6
	//* 650 1364:istore_2        
	//* 651 1365:goto            1968
	//* 652 1368:aload_1         
	//* 653 1369:getfield        #178 <Field int Fragment.mState>
	//* 654 1372:iload_2         
	//* 655 1373:icmple          1968
	//* 656 1376:aload_1         
	//* 657 1377:getfield        #178 <Field int Fragment.mState>
	//* 658 1380:tableswitch     1 4: default 1412
	//	               1 1763
	//	               2 1531
	//	               3 1473
	//	               4 1415
	//* 659 1412:goto            1968
	//* 660 1415:iload_2         
	//* 661 1416:iconst_4        
	//* 662 1417:icmpge          1473
	//* 663 1420:getstatic       #791 <Field boolean DEBUG>
	//* 664 1423:ifeq            1463
	//* 665 1426:new             #305 <Class StringBuilder>
	//* 666 1429:dup             
	//* 667 1430:invokespecial   #306 <Method void StringBuilder()>
	//* 668 1433:astore          10
	//* 669 1435:aload           10
	//* 670 1437:ldc2            #1502 <String "movefrom RESUMED: ">
	//* 671 1440:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//* 672 1443:pop             
	//* 673 1444:aload           10
	//* 674 1446:aload_1         
	//* 675 1447:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//* 676 1450:pop             
	//* 677 1451:ldc2            #544 <String "FragmentManager">
	//* 678 1454:aload           10
	//* 679 1456:invokevirtual   #318 <Method String StringBuilder.toString()>
	//* 680 1459:invokestatic    #799 <Method int Log.v(String, String)>
	//* 681 1462:pop             
	//* 682 1463:aload_1         
	//* 683 1464:invokevirtual   #1505 <Method void Fragment.performPause()>
	//* 684 1467:aload_0         
	//* 685 1468:aload_1         
	//* 686 1469:iconst_0        
	//* 687 1470:invokevirtual   #1004 <Method void dispatchOnFragmentPaused(Fragment, boolean)>
	//* 688 1473:iload_2         
	//* 689 1474:iconst_3        
	//* 690 1475:icmpge          1531
	//* 691 1478:getstatic       #791 <Field boolean DEBUG>
	//* 692 1481:ifeq            1521
	//* 693 1484:new             #305 <Class StringBuilder>
	//* 694 1487:dup             
	//* 695 1488:invokespecial   #306 <Method void StringBuilder()>
	//* 696 1491:astore          10
	//* 697 1493:aload           10
	//* 698 1495:ldc2            #1507 <String "movefrom STARTED: ">
	//* 699 1498:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//* 700 1501:pop             
	//* 701 1502:aload           10
	//* 702 1504:aload_1         
	//* 703 1505:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//* 704 1508:pop             
	//* 705 1509:ldc2            #544 <String "FragmentManager">
	//* 706 1512:aload           10
	//* 707 1514:invokevirtual   #318 <Method String StringBuilder.toString()>
	//* 708 1517:invokestatic    #799 <Method int Log.v(String, String)>
	//* 709 1520:pop             
	//* 710 1521:aload_1         
	//* 711 1522:invokevirtual   #1510 <Method void Fragment.performStop()>
	//* 712 1525:aload_0         
	//* 713 1526:aload_1         
	//* 714 1527:iconst_0        
	//* 715 1528:invokevirtual   #1040 <Method void dispatchOnFragmentStopped(Fragment, boolean)>
	//* 716 1531:iload_2         
	//* 717 1532:iconst_2        
	//* 718 1533:icmpge          1763
	//* 719 1536:getstatic       #791 <Field boolean DEBUG>
	//* 720 1539:ifeq            1579
	//* 721 1542:new             #305 <Class StringBuilder>
	//* 722 1545:dup             
	//* 723 1546:invokespecial   #306 <Method void StringBuilder()>
	//* 724 1549:astore          10
	//* 725 1551:aload           10
	//* 726 1553:ldc2            #1512 <String "movefrom ACTIVITY_CREATED: ">
	//* 727 1556:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//* 728 1559:pop             
	//* 729 1560:aload           10
	//* 730 1562:aload_1         
	//* 731 1563:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//* 732 1566:pop             
	//* 733 1567:ldc2            #544 <String "FragmentManager">
	//* 734 1570:aload           10
	//* 735 1572:invokevirtual   #318 <Method String StringBuilder.toString()>
	//* 736 1575:invokestatic    #799 <Method int Log.v(String, String)>
	//* 737 1578:pop             
	//* 738 1579:aload_1         
	//* 739 1580:getfield        #192 <Field View Fragment.mView>
	//* 740 1583:ifnull          1609
	//* 741 1586:aload_0         
	//* 742 1587:getfield        #369 <Field FragmentHostCallback mHost>
	//* 743 1590:aload_1         
	//* 744 1591:invokevirtual   #1516 <Method boolean FragmentHostCallback.onShouldSaveFragmentState(Fragment)>
	//* 745 1594:ifeq            1609
	//* 746 1597:aload_1         
	//* 747 1598:getfield        #1375 <Field SparseArray Fragment.mSavedViewState>
	//* 748 1601:ifnonnull       1609
	//* 749 1604:aload_0         
	//* 750 1605:aload_1         
	//* 751 1606:invokevirtual   #1519 <Method void saveFragmentViewState(Fragment)>
	//* 752 1609:aload_1         
	//* 753 1610:invokevirtual   #1522 <Method void Fragment.performDestroyView()>
	//* 754 1613:aload_0         
	//* 755 1614:aload_1         
	//* 756 1615:iconst_0        
	//* 757 1616:invokevirtual   #1054 <Method void dispatchOnFragmentViewDestroyed(Fragment, boolean)>
	//* 758 1619:aload_1         
	//* 759 1620:getfield        #192 <Field View Fragment.mView>
	//* 760 1623:ifnull          1730
	//* 761 1626:aload_1         
	//* 762 1627:getfield        #212 <Field ViewGroup Fragment.mContainer>
	//* 763 1630:ifnull          1730
	//* 764 1633:aload_1         
	//* 765 1634:getfield        #212 <Field ViewGroup Fragment.mContainer>
	//* 766 1637:aload_1         
	//* 767 1638:getfield        #192 <Field View Fragment.mView>
	//* 768 1641:invokevirtual   #1525 <Method void ViewGroup.endViewTransition(View)>
	//* 769 1644:aload_1         
	//* 770 1645:getfield        #192 <Field View Fragment.mView>
	//* 771 1648:invokevirtual   #358 <Method void View.clearAnimation()>
	//* 772 1651:aload_0         
	//* 773 1652:getfield        #148 <Field int mCurState>
	//* 774 1655:ifle            1698
	//* 775 1658:aload_0         
	//* 776 1659:getfield        #944 <Field boolean mDestroyed>
	//* 777 1662:ifne            1698
	//* 778 1665:aload_1         
	//* 779 1666:getfield        #192 <Field View Fragment.mView>
	//* 780 1669:invokevirtual   #1484 <Method int View.getVisibility()>
	//* 781 1672:ifne            1698
	//* 782 1675:aload_1         
	//* 783 1676:getfield        #605 <Field float Fragment.mPostponedAlpha>
	//* 784 1679:fconst_0        
	//* 785 1680:fcmpl           
	//* 786 1681:iflt            1698
	//* 787 1684:aload_0         
	//* 788 1685:aload_1         
	//* 789 1686:iload_3         
	//* 790 1687:iconst_0        
	//* 791 1688:iload           4
	//* 792 1690:invokevirtual   #892 <Method FragmentManagerImpl$AnimationOrAnimator loadAnimation(Fragment, int, boolean, int)>
	//* 793 1693:astore          10
	//* 794 1695:goto            1701
	//* 795 1698:aconst_null     
	//* 796 1699:astore          10
	//* 797 1701:aload_1         
	//* 798 1702:fconst_0        
	//* 799 1703:putfield        #605 <Field float Fragment.mPostponedAlpha>
	//* 800 1706:aload           10
	//* 801 1708:ifnull          1719
	//* 802 1711:aload_0         
	//* 803 1712:aload_1         
	//* 804 1713:aload           10
	//* 805 1715:iload_2         
	//* 806 1716:invokespecial   #1527 <Method void animateRemoveFragment(Fragment, FragmentManagerImpl$AnimationOrAnimator, int)>
	//* 807 1719:aload_1         
	//* 808 1720:getfield        #212 <Field ViewGroup Fragment.mContainer>
	//* 809 1723:aload_1         
	//* 810 1724:getfield        #192 <Field View Fragment.mView>
	//* 811 1727:invokevirtual   #1530 <Method void ViewGroup.removeView(View)>
	//* 812 1730:aload_1         
	//* 813 1731:aconst_null     
	//* 814 1732:putfield        #212 <Field ViewGroup Fragment.mContainer>
	//* 815 1735:aload_1         
	//* 816 1736:aconst_null     
	//* 817 1737:putfield        #192 <Field View Fragment.mView>
	//* 818 1740:aload_1         
	//* 819 1741:aconst_null     
	//* 820 1742:putfield        #1534 <Field android.arch.lifecycle.LifecycleOwner Fragment.mViewLifecycleOwner>
	//* 821 1745:aload_1         
	//* 822 1746:getfield        #1538 <Field MutableLiveData Fragment.mViewLifecycleOwnerLiveData>
	//* 823 1749:aconst_null     
	//* 824 1750:invokevirtual   #1543 <Method void MutableLiveData.setValue(Object)>
	//* 825 1753:aload_1         
	//* 826 1754:aconst_null     
	//* 827 1755:putfield        #1190 <Field View Fragment.mInnerView>
	//* 828 1758:aload_1         
	//* 829 1759:iconst_0        
	//* 830 1760:putfield        #1356 <Field boolean Fragment.mInLayout>
	//* 831 1763:iload_2         
	//* 832 1764:iconst_1        
	//* 833 1765:icmpge          1968
	//* 834 1768:aload_0         
	//* 835 1769:getfield        #944 <Field boolean mDestroyed>
	//* 836 1772:ifeq            1824
	//* 837 1775:aload_1         
	//* 838 1776:invokevirtual   #345 <Method View Fragment.getAnimatingAway()>
	//* 839 1779:ifnull          1801
	//* 840 1782:aload_1         
	//* 841 1783:invokevirtual   #345 <Method View Fragment.getAnimatingAway()>
	//* 842 1786:astore          10
	//* 843 1788:aload_1         
	//* 844 1789:aconst_null     
	//* 845 1790:invokevirtual   #232 <Method void Fragment.setAnimatingAway(View)>
	//* 846 1793:aload           10
	//* 847 1795:invokevirtual   #358 <Method void View.clearAnimation()>
	//* 848 1798:goto            1824
	//* 849 1801:aload_1         
	//* 850 1802:invokevirtual   #362 <Method Animator Fragment.getAnimator()>
	//* 851 1805:ifnull          1824
	//* 852 1808:aload_1         
	//* 853 1809:invokevirtual   #362 <Method Animator Fragment.getAnimator()>
	//* 854 1812:astore          10
	//* 855 1814:aload_1         
	//* 856 1815:aconst_null     
	//* 857 1816:invokevirtual   #263 <Method void Fragment.setAnimator(Animator)>
	//* 858 1819:aload           10
	//* 859 1821:invokevirtual   #1544 <Method void Animator.cancel()>
	//* 860 1824:aload_1         
	//* 861 1825:invokevirtual   #345 <Method View Fragment.getAnimatingAway()>
	//* 862 1828:ifnonnull       1957
	//* 863 1831:aload_1         
	//* 864 1832:invokevirtual   #362 <Method Animator Fragment.getAnimator()>
	//* 865 1835:ifnull          1841
	//* 866 1838:goto            1957
	//* 867 1841:getstatic       #791 <Field boolean DEBUG>
	//* 868 1844:ifeq            1884
	//* 869 1847:new             #305 <Class StringBuilder>
	//* 870 1850:dup             
	//* 871 1851:invokespecial   #306 <Method void StringBuilder()>
	//* 872 1854:astore          10
	//* 873 1856:aload           10
	//* 874 1858:ldc2            #1546 <String "movefrom CREATED: ">
	//* 875 1861:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//* 876 1864:pop             
	//* 877 1865:aload           10
	//* 878 1867:aload_1         
	//* 879 1868:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//* 880 1871:pop             
	//* 881 1872:ldc2            #544 <String "FragmentManager">
	//* 882 1875:aload           10
	//* 883 1877:invokevirtual   #318 <Method String StringBuilder.toString()>
	//* 884 1880:invokestatic    #799 <Method int Log.v(String, String)>
	//* 885 1883:pop             
	//* 886 1884:aload_1         
	//* 887 1885:getfield        #727 <Field boolean Fragment.mRetaining>
	//* 888 1888:ifne            1904
	//* 889 1891:aload_1         
	//* 890 1892:invokevirtual   #1549 <Method void Fragment.performDestroy()>
	//* 891 1895:aload_0         
	//* 892 1896:aload_1         
	//* 893 1897:iconst_0        
	//* 894 1898:invokevirtual   #991 <Method void dispatchOnFragmentDestroyed(Fragment, boolean)>
	//* 895 1901:goto            1909
	//* 896 1904:aload_1         
	//* 897 1905:iconst_0        
	//* 898 1906:putfield        #178 <Field int Fragment.mState>
	//* 899 1909:aload_1         
	//* 900 1910:invokevirtual   #1552 <Method void Fragment.performDetach()>
	//* 901 1913:aload_0         
	//* 902 1914:aload_1         
	//* 903 1915:iconst_0        
	//* 904 1916:invokevirtual   #998 <Method void dispatchOnFragmentDetached(Fragment, boolean)>
	//* 905 1919:iload           5
	//* 906 1921:ifne            1968
	//* 907 1924:aload_1         
	//* 908 1925:getfield        #727 <Field boolean Fragment.mRetaining>
	//* 909 1928:ifne            1939
	//* 910 1931:aload_0         
	//* 911 1932:aload_1         
	//* 912 1933:invokevirtual   #1554 <Method void makeInactive(Fragment)>
	//* 913 1936:goto            1968
	//* 914 1939:aload_1         
	//* 915 1940:aconst_null     
	//* 916 1941:putfield        #1401 <Field FragmentHostCallback Fragment.mHost>
	//* 917 1944:aload_1         
	//* 918 1945:aconst_null     
	//* 919 1946:putfield        #1404 <Field Fragment Fragment.mParentFragment>
	//* 920 1949:aload_1         
	//* 921 1950:aconst_null     
	//* 922 1951:putfield        #1415 <Field FragmentManagerImpl Fragment.mFragmentManager>
	//* 923 1954:goto            1968
	//* 924 1957:aload_1         
	//* 925 1958:iload_2         
	//* 926 1959:invokevirtual   #222 <Method void Fragment.setStateAfterAnimating(int)>
	//* 927 1962:iload           7
	//* 928 1964:istore_2        
	//* 929 1965:goto            1968
	//* 930 1968:aload_1         
	//* 931 1969:getfield        #178 <Field int Fragment.mState>
	//* 932 1972:iload_2         
	//* 933 1973:icmpeq          2062
	//* 934 1976:new             #305 <Class StringBuilder>
	//* 935 1979:dup             
	//* 936 1980:invokespecial   #306 <Method void StringBuilder()>
	//* 937 1983:astore          10
	//* 938 1985:aload           10
	//* 939 1987:ldc2            #1556 <String "moveToState: Fragment state for ">
	//* 940 1990:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//* 941 1993:pop             
	//* 942 1994:aload           10
	//* 943 1996:aload_1         
	//* 944 1997:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//* 945 2000:pop             
	//* 946 2001:aload           10
	//* 947 2003:ldc2            #1558 <String " not updated inline; ">
	//* 948 2006:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//* 949 2009:pop             
	//* 950 2010:aload           10
	//* 951 2012:ldc2            #1560 <String "expected state ">
	//* 952 2015:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//* 953 2018:pop             
	//* 954 2019:aload           10
	//* 955 2021:iload_2         
	//* 956 2022:invokevirtual   #841 <Method StringBuilder StringBuilder.append(int)>
	//* 957 2025:pop             
	//* 958 2026:aload           10
	//* 959 2028:ldc2            #1562 <String " found ">
	//* 960 2031:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//* 961 2034:pop             
	//* 962 2035:aload           10
	//* 963 2037:aload_1         
	//* 964 2038:getfield        #178 <Field int Fragment.mState>
	//* 965 2041:invokevirtual   #841 <Method StringBuilder StringBuilder.append(int)>
	//* 966 2044:pop             
	//* 967 2045:ldc2            #544 <String "FragmentManager">
	//* 968 2048:aload           10
	//* 969 2050:invokevirtual   #318 <Method String StringBuilder.toString()>
	//* 970 2053:invokestatic    #1565 <Method int Log.w(String, String)>
	//* 971 2056:pop             
	//* 972 2057:aload_1         
	//* 973 2058:iload_2         
	//* 974 2059:putfield        #178 <Field int Fragment.mState>
	//* 975 2062:return          
									// Misplaced declaration of an exception variable
									catch(android.content.res.Resources.NotFoundException notfoundexception)
									{
										obj1 = "unknown";
									}
									StringBuilder stringbuilder12 = new StringBuilder();
									stringbuilder12.append("No view found for id 0x");
									stringbuilder12.append(Integer.toHexString(fragment.mContainerId));
									stringbuilder12.append(" (");
									stringbuilder12.append(((String) (obj1)));
									stringbuilder12.append(") for fragment ");
									stringbuilder12.append(((Object) (fragment)));
									throwException(((RuntimeException) (new IllegalArgumentException(stringbuilder12.toString()))));
									obj1 = ((Object) (viewgroup));
								}
							}
						} else
						{
							obj1 = null;
						}
						fragment.mContainer = ((ViewGroup) (obj1));
						fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), ((ViewGroup) (obj1)), fragment.mSavedFragmentState);
						if(fragment.mView != null)
						{
							fragment.mInnerView = fragment.mView;
							fragment.mView.setSaveFromParentEnabled(false);
							if(obj1 != null)
								((ViewGroup) (obj1)).addView(fragment.mView);
							if(fragment.mHidden)
								fragment.mView.setVisibility(8);
							fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
							dispatchOnFragmentViewCreated(fragment, fragment.mView, fragment.mSavedFragmentState, false);
							if(fragment.mView.getVisibility() == 0 && fragment.mContainer != null)
								flag = flag2;
							else
								flag = false;
							fragment.mIsNewlyAdded = flag;
						} else
						{
							fragment.mInnerView = null;
						}
					}
					fragment.performActivityCreated(fragment.mSavedFragmentState);
					dispatchOnFragmentActivityCreated(fragment, fragment.mSavedFragmentState, false);
					if(fragment.mView != null)
						fragment.restoreViewState(fragment.mSavedFragmentState);
					fragment.mSavedFragmentState = null;
					k = j;
				}
				// fall through

			case 2: // '\002'
				j1 = k;
				if(k > 2)
				{
					if(DEBUG)
					{
						StringBuilder stringbuilder5 = new StringBuilder();
						stringbuilder5.append("moveto STARTED: ");
						stringbuilder5.append(((Object) (fragment)));
						Log.v("FragmentManager", stringbuilder5.toString());
					}
					fragment.performStart();
					dispatchOnFragmentStarted(fragment, false);
					j1 = k;
				}
				// fall through

			case 3: // '\003'
				if(j1 > 3)
				{
					if(DEBUG)
					{
						StringBuilder stringbuilder6 = new StringBuilder();
						stringbuilder6.append("moveto RESUMED: ");
						stringbuilder6.append(((Object) (fragment)));
						Log.v("FragmentManager", stringbuilder6.toString());
					}
					fragment.performResume();
					dispatchOnFragmentResumed(fragment, false);
					fragment.mSavedFragmentState = null;
					fragment.mSavedViewState = null;
				}
				i = j1;
				break;
			}
		} else
		if(fragment.mState > i)
			switch(fragment.mState)
			{
			case 4: // '\004'
				if(i < 4)
				{
					if(DEBUG)
					{
						StringBuilder stringbuilder7 = new StringBuilder();
						stringbuilder7.append("movefrom RESUMED: ");
						stringbuilder7.append(((Object) (fragment)));
						Log.v("FragmentManager", stringbuilder7.toString());
					}
					fragment.performPause();
					dispatchOnFragmentPaused(fragment, false);
				}
				// fall through

			case 3: // '\003'
				if(i < 3)
				{
					if(DEBUG)
					{
						StringBuilder stringbuilder8 = new StringBuilder();
						stringbuilder8.append("movefrom STARTED: ");
						stringbuilder8.append(((Object) (fragment)));
						Log.v("FragmentManager", stringbuilder8.toString());
					}
					fragment.performStop();
					dispatchOnFragmentStopped(fragment, false);
				}
				// fall through

			case 2: // '\002'
				if(i < 2)
				{
					if(DEBUG)
					{
						StringBuilder stringbuilder9 = new StringBuilder();
						stringbuilder9.append("movefrom ACTIVITY_CREATED: ");
						stringbuilder9.append(((Object) (fragment)));
						Log.v("FragmentManager", stringbuilder9.toString());
					}
					if(fragment.mView != null && mHost.onShouldSaveFragmentState(fragment) && fragment.mSavedViewState == null)
						saveFragmentViewState(fragment);
					fragment.performDestroyView();
					dispatchOnFragmentViewDestroyed(fragment, false);
					if(fragment.mView != null && fragment.mContainer != null)
					{
						fragment.mContainer.endViewTransition(fragment.mView);
						fragment.mView.clearAnimation();
						AnimationOrAnimator animationoranimator;
						if(mCurState > 0 && !mDestroyed && fragment.mView.getVisibility() == 0 && fragment.mPostponedAlpha >= 0.0F)
							animationoranimator = loadAnimation(fragment, j, false, k);
						else
							animationoranimator = null;
						fragment.mPostponedAlpha = 0.0F;
						if(animationoranimator != null)
							animateRemoveFragment(fragment, animationoranimator, i);
						fragment.mContainer.removeView(fragment.mView);
					}
					fragment.mContainer = null;
					fragment.mView = null;
					fragment.mViewLifecycleOwner = null;
					fragment.mViewLifecycleOwnerLiveData.setValue(((Object) (null)));
					fragment.mInnerView = null;
					fragment.mInLayout = false;
				}
				// fall through

			case 1: // '\001'
				if(i < 1)
				{
					if(mDestroyed)
						if(fragment.getAnimatingAway() != null)
						{
							View view = fragment.getAnimatingAway();
							fragment.setAnimatingAway(((View) (null)));
							view.clearAnimation();
						} else
						if(fragment.getAnimator() != null)
						{
							Animator animator = fragment.getAnimator();
							fragment.setAnimator(((Animator) (null)));
							animator.cancel();
						}
					if(fragment.getAnimatingAway() == null && fragment.getAnimator() == null)
					{
						if(DEBUG)
						{
							StringBuilder stringbuilder10 = new StringBuilder();
							stringbuilder10.append("movefrom CREATED: ");
							stringbuilder10.append(((Object) (fragment)));
							Log.v("FragmentManager", stringbuilder10.toString());
						}
						if(!fragment.mRetaining)
						{
							fragment.performDestroy();
							dispatchOnFragmentDestroyed(fragment, false);
						} else
						{
							fragment.mState = 0;
						}
						fragment.performDetach();
						dispatchOnFragmentDetached(fragment, false);
						if(!flag)
							if(!fragment.mRetaining)
							{
								makeInactive(fragment);
							} else
							{
								fragment.mHost = null;
								fragment.mParentFragment = null;
								fragment.mFragmentManager = null;
							}
					} else
					{
						fragment.setStateAfterAnimating(i);
						i = ((int) (flag1));
					}
				}
				break;
			}
		if(fragment.mState != i)
		{
			StringBuilder stringbuilder11 = new StringBuilder();
			stringbuilder11.append("moveToState: Fragment state for ");
			stringbuilder11.append(((Object) (fragment)));
			stringbuilder11.append(" not updated inline; ");
			stringbuilder11.append("expected state ");
			stringbuilder11.append(i);
			stringbuilder11.append(" found ");
			stringbuilder11.append(fragment.mState);
			Log.w("FragmentManager", stringbuilder11.toString());
			fragment.mState = i;
		}
	//* 976 2063:astore          10
	//* 977 2065:goto            946
	}

	public void noteStateNotSaved()
	{
		mSavedNonConfig = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #1568 <Field FragmentManagerNonConfig mSavedNonConfig>
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		mStateSaved = false;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #916 <Field boolean mStateSaved>
		mStopped = false;
	//    8   12:aload_0         
	//    9   13:iconst_0        
	//   10   14:putfield        #918 <Field boolean mStopped>
		for(int j = mAdded.size(); i < j; i++)
	//*  11   17:aload_0         
	//*  12   18:getfield        #141 <Field ArrayList mAdded>
	//*  13   21:invokevirtual   #169 <Method int ArrayList.size()>
	//*  14   24:istore_2        
	//*  15   25:iload_1         
	//*  16   26:iload_2         
	//*  17   27:icmpge          57
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//   18   30:aload_0         
	//   19   31:getfield        #141 <Field ArrayList mAdded>
	//   20   34:iload_1         
	//   21   35:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//   22   38:checkcast       #175 <Class Fragment>
	//   23   41:astore_3        
			if(fragment != null)
	//*  24   42:aload_3         
	//*  25   43:ifnull          50
				fragment.noteStateNotSaved();
	//   26   46:aload_3         
	//   27   47:invokevirtual   #1570 <Method void Fragment.noteStateNotSaved()>
		}

	//   28   50:iload_1         
	//   29   51:iconst_1        
	//   30   52:iadd            
	//   31   53:istore_1        
	//*  32   54:goto            25
	//   33   57:return          
	}

	public View onCreateView(View view, String s, Context context, AttributeSet attributeset)
	{
		int i;
		int k;
		String s1;
		String s2;
label0:
		{
			if(!"fragment".equals(((Object) (s))))
	//*   0    0:ldc2            #1574 <String "fragment">
	//*   1    3:aload_2         
	//*   2    4:invokevirtual   #628 <Method boolean String.equals(Object)>
	//*   3    7:ifne            12
				return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
			s1 = attributeset.getAttributeValue(((String) (null)), "class");
	//    6   12:aload           4
	//    7   14:aconst_null     
	//    8   15:ldc2            #1576 <String "class">
	//    9   18:invokeinterface #1582 <Method String AttributeSet.getAttributeValue(String, String)>
	//   10   23:astore          8
			s = ((String) (context.obtainStyledAttributes(attributeset, FragmentTag.Fragment)));
	//   11   25:aload_3         
	//   12   26:aload           4
	//   13   28:getstatic       #1586 <Field int[] FragmentManagerImpl$FragmentTag.Fragment>
	//   14   31:invokevirtual   #1590 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   15   34:astore_2        
			i = 0;
	//   16   35:iconst_0        
	//   17   36:istore          5
			if(s1 == null)
	//*  18   38:aload           8
	//*  19   40:ifnonnull       53
				s1 = ((TypedArray) (s)).getString(0);
	//   20   43:aload_2         
	//   21   44:iconst_0        
	//   22   45:invokevirtual   #1595 <Method String TypedArray.getString(int)>
	//   23   48:astore          8
	//*  24   50:goto            53
			k = ((TypedArray) (s)).getResourceId(1, -1);
	//   25   53:aload_2         
	//   26   54:iconst_1        
	//   27   55:iconst_m1       
	//   28   56:invokevirtual   #1598 <Method int TypedArray.getResourceId(int, int)>
	//   29   59:istore          7
			s2 = ((TypedArray) (s)).getString(2);
	//   30   61:aload_2         
	//   31   62:iconst_2        
	//   32   63:invokevirtual   #1595 <Method String TypedArray.getString(int)>
	//   33   66:astore          9
			((TypedArray) (s)).recycle();
	//   34   68:aload_2         
	//   35   69:invokevirtual   #1601 <Method void TypedArray.recycle()>
			if(!Fragment.isSupportFragmentClass(mHost.getContext(), s1))
	//*  36   72:aload_0         
	//*  37   73:getfield        #369 <Field FragmentHostCallback mHost>
	//*  38   76:invokevirtual   #1270 <Method Context FragmentHostCallback.getContext()>
	//*  39   79:aload           8
	//*  40   81:invokestatic    #1605 <Method boolean Fragment.isSupportFragmentClass(Context, String)>
	//*  41   84:ifne            89
				return null;
	//   42   87:aconst_null     
	//   43   88:areturn         
			if(view != null)
	//*  44   89:aload_1         
	//*  45   90:ifnull          99
				i = view.getId();
	//   46   93:aload_1         
	//   47   94:invokevirtual   #1608 <Method int View.getId()>
	//   48   97:istore          5
			if(i == -1 && k == -1 && s2 == null)
	//*  49   99:iload           5
	//*  50  101:iconst_m1       
	//*  51  102:icmpne          166
	//*  52  105:iload           7
	//*  53  107:iconst_m1       
	//*  54  108:icmpne          166
	//*  55  111:aload           9
	//*  56  113:ifnull          119
	//*  57  116:goto            166
			{
				view = ((View) (new StringBuilder()));
	//   58  119:new             #305 <Class StringBuilder>
	//   59  122:dup             
	//   60  123:invokespecial   #306 <Method void StringBuilder()>
	//   61  126:astore_1        
				((StringBuilder) (view)).append(attributeset.getPositionDescription());
	//   62  127:aload_1         
	//   63  128:aload           4
	//   64  130:invokeinterface #1611 <Method String AttributeSet.getPositionDescription()>
	//   65  135:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   66  138:pop             
				((StringBuilder) (view)).append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
	//   67  139:aload_1         
	//   68  140:ldc2            #1613 <String ": Must specify unique android:id, android:tag, or have a parent with an id for ">
	//   69  143:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   70  146:pop             
				((StringBuilder) (view)).append(s1);
	//   71  147:aload_1         
	//   72  148:aload           8
	//   73  150:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   74  153:pop             
				throw new IllegalArgumentException(((StringBuilder) (view)).toString());
	//   75  154:new             #1457 <Class IllegalArgumentException>
	//   76  157:dup             
	//   77  158:aload_1         
	//   78  159:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   79  162:invokespecial   #1458 <Method void IllegalArgumentException(String)>
	//   80  165:athrow          
			}
			if(k != -1)
	//*  81  166:iload           7
	//*  82  168:iconst_m1       
	//*  83  169:icmpeq          182
				s = ((String) (findFragmentById(k)));
	//   84  172:aload_0         
	//   85  173:iload           7
	//   86  175:invokevirtual   #1615 <Method Fragment findFragmentById(int)>
	//   87  178:astore_2        
			else
	//*  88  179:goto            184
				s = null;
	//   89  182:aconst_null     
	//   90  183:astore_2        
			view = ((View) (s));
	//   91  184:aload_2         
	//   92  185:astore_1        
			if(s == null)
	//*  93  186:aload_2         
	//*  94  187:ifnonnull       204
			{
				view = ((View) (s));
	//   95  190:aload_2         
	//   96  191:astore_1        
				if(s2 != null)
	//*  97  192:aload           9
	//*  98  194:ifnull          204
					view = ((View) (findFragmentByTag(s2)));
	//   99  197:aload_0         
	//  100  198:aload           9
	//  101  200:invokevirtual   #1617 <Method Fragment findFragmentByTag(String)>
	//  102  203:astore_1        
			}
			s = ((String) (view));
	//  103  204:aload_1         
	//  104  205:astore_2        
			if(view == null)
	//* 105  206:aload_1         
	//* 106  207:ifnonnull       225
			{
				s = ((String) (view));
	//  107  210:aload_1         
	//  108  211:astore_2        
				if(i != -1)
	//* 109  212:iload           5
	//* 110  214:iconst_m1       
	//* 111  215:icmpeq          225
					s = ((String) (findFragmentById(i)));
	//  112  218:aload_0         
	//  113  219:iload           5
	//  114  221:invokevirtual   #1615 <Method Fragment findFragmentById(int)>
	//  115  224:astore_2        
			}
			if(DEBUG)
	//* 116  225:getstatic       #791 <Field boolean DEBUG>
	//* 117  228:ifeq            297
			{
				view = ((View) (new StringBuilder()));
	//  118  231:new             #305 <Class StringBuilder>
	//  119  234:dup             
	//  120  235:invokespecial   #306 <Method void StringBuilder()>
	//  121  238:astore_1        
				((StringBuilder) (view)).append("onCreateView: id=0x");
	//  122  239:aload_1         
	//  123  240:ldc2            #1619 <String "onCreateView: id=0x">
	//  124  243:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  125  246:pop             
				((StringBuilder) (view)).append(Integer.toHexString(k));
	//  126  247:aload_1         
	//  127  248:iload           7
	//  128  250:invokestatic    #1100 <Method String Integer.toHexString(int)>
	//  129  253:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  130  256:pop             
				((StringBuilder) (view)).append(" fname=");
	//  131  257:aload_1         
	//  132  258:ldc2            #1621 <String " fname=">
	//  133  261:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  134  264:pop             
				((StringBuilder) (view)).append(s1);
	//  135  265:aload_1         
	//  136  266:aload           8
	//  137  268:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  138  271:pop             
				((StringBuilder) (view)).append(" existing=");
	//  139  272:aload_1         
	//  140  273:ldc2            #1623 <String " existing=">
	//  141  276:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  142  279:pop             
				((StringBuilder) (view)).append(((Object) (s)));
	//  143  280:aload_1         
	//  144  281:aload_2         
	//  145  282:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//  146  285:pop             
				Log.v("FragmentManager", ((StringBuilder) (view)).toString());
	//  147  286:ldc2            #544 <String "FragmentManager">
	//  148  289:aload_1         
	//  149  290:invokevirtual   #318 <Method String StringBuilder.toString()>
	//  150  293:invokestatic    #799 <Method int Log.v(String, String)>
	//  151  296:pop             
			}
			if(s == null)
	//* 152  297:aload_2         
	//* 153  298:ifnonnull       395
			{
				view = ((View) (mContainer.instantiate(context, s1, ((Bundle) (null)))));
	//  154  301:aload_0         
	//  155  302:getfield        #857 <Field FragmentContainer mContainer>
	//  156  305:aload_3         
	//  157  306:aload           8
	//  158  308:aconst_null     
	//  159  309:invokevirtual   #1627 <Method Fragment FragmentContainer.instantiate(Context, String, Bundle)>
	//  160  312:astore_1        
				view.mFromLayout = true;
	//  161  313:aload_1         
	//  162  314:iconst_1        
	//  163  315:putfield        #1173 <Field boolean Fragment.mFromLayout>
				int j;
				if(k != 0)
	//* 164  318:iload           7
	//* 165  320:ifeq            330
					j = k;
	//  166  323:iload           7
	//  167  325:istore          6
				else
	//* 168  327:goto            334
					j = i;
	//  169  330:iload           5
	//  170  332:istore          6
				view.mFragmentId = j;
	//  171  334:aload_1         
	//  172  335:iload           6
	//  173  337:putfield        #1208 <Field int Fragment.mFragmentId>
				view.mContainerId = i;
	//  174  340:aload_1         
	//  175  341:iload           5
	//  176  343:putfield        #880 <Field int Fragment.mContainerId>
				view.mTag = s2;
	//  177  346:aload_1         
	//  178  347:aload           9
	//  179  349:putfield        #1214 <Field String Fragment.mTag>
				view.mInLayout = true;
	//  180  352:aload_1         
	//  181  353:iconst_1        
	//  182  354:putfield        #1356 <Field boolean Fragment.mInLayout>
				view.mFragmentManager = this;
	//  183  357:aload_1         
	//  184  358:aload_0         
	//  185  359:putfield        #1415 <Field FragmentManagerImpl Fragment.mFragmentManager>
				s = ((String) (mHost));
	//  186  362:aload_0         
	//  187  363:getfield        #369 <Field FragmentHostCallback mHost>
	//  188  366:astore_2        
				view.mHost = ((FragmentHostCallback) (s));
	//  189  367:aload_1         
	//  190  368:aload_2         
	//  191  369:putfield        #1401 <Field FragmentHostCallback Fragment.mHost>
				((Fragment) (view)).onInflate(((FragmentHostCallback) (s)).getContext(), attributeset, ((Fragment) (view)).mSavedFragmentState);
	//  192  372:aload_1         
	//  193  373:aload_2         
	//  194  374:invokevirtual   #1270 <Method Context FragmentHostCallback.getContext()>
	//  195  377:aload           4
	//  196  379:aload_1         
	//  197  380:getfield        #1179 <Field Bundle Fragment.mSavedFragmentState>
	//  198  383:invokevirtual   #1631 <Method void Fragment.onInflate(Context, AttributeSet, Bundle)>
				addFragment(((Fragment) (view)), true);
	//  199  386:aload_0         
	//  200  387:aload_1         
	//  201  388:iconst_1        
	//  202  389:invokevirtual   #1633 <Method void addFragment(Fragment, boolean)>
			} else
	//* 203  392:goto            441
			{
				if(((Fragment) (s)).mInLayout)
					break label0;
	//  204  395:aload_2         
	//  205  396:getfield        #1356 <Field boolean Fragment.mInLayout>
	//  206  399:ifne            561
				s.mInLayout = true;
	//  207  402:aload_2         
	//  208  403:iconst_1        
	//  209  404:putfield        #1356 <Field boolean Fragment.mInLayout>
				s.mHost = mHost;
	//  210  407:aload_2         
	//  211  408:aload_0         
	//  212  409:getfield        #369 <Field FragmentHostCallback mHost>
	//  213  412:putfield        #1401 <Field FragmentHostCallback Fragment.mHost>
				if(!((Fragment) (s)).mRetaining)
	//* 214  415:aload_2         
	//* 215  416:getfield        #727 <Field boolean Fragment.mRetaining>
	//* 216  419:ifne            439
					((Fragment) (s)).onInflate(mHost.getContext(), attributeset, ((Fragment) (s)).mSavedFragmentState);
	//  217  422:aload_2         
	//  218  423:aload_0         
	//  219  424:getfield        #369 <Field FragmentHostCallback mHost>
	//  220  427:invokevirtual   #1270 <Method Context FragmentHostCallback.getContext()>
	//  221  430:aload           4
	//  222  432:aload_2         
	//  223  433:getfield        #1179 <Field Bundle Fragment.mSavedFragmentState>
	//  224  436:invokevirtual   #1631 <Method void Fragment.onInflate(Context, AttributeSet, Bundle)>
				view = ((View) (s));
	//  225  439:aload_2         
	//  226  440:astore_1        
			}
			if(mCurState < 1 && ((Fragment) (view)).mFromLayout)
	//* 227  441:aload_0         
	//* 228  442:getfield        #148 <Field int mCurState>
	//* 229  445:iconst_1        
	//* 230  446:icmpge          468
	//* 231  449:aload_1         
	//* 232  450:getfield        #1173 <Field boolean Fragment.mFromLayout>
	//* 233  453:ifeq            468
				moveToState(((Fragment) (view)), 1, 0, 0, false);
	//  234  456:aload_0         
	//  235  457:aload_1         
	//  236  458:iconst_1        
	//  237  459:iconst_0        
	//  238  460:iconst_0        
	//  239  461:iconst_0        
	//  240  462:invokevirtual   #188 <Method void moveToState(Fragment, int, int, int, boolean)>
			else
	//* 241  465:goto            473
				moveToState(((Fragment) (view)));
	//  242  468:aload_0         
	//  243  469:aload_1         
	//  244  470:invokevirtual   #825 <Method void moveToState(Fragment)>
			if(((Fragment) (view)).mView != null)
	//* 245  473:aload_1         
	//* 246  474:getfield        #192 <Field View Fragment.mView>
	//* 247  477:ifnull          518
			{
				if(k != 0)
	//* 248  480:iload           7
	//* 249  482:ifeq            494
					((Fragment) (view)).mView.setId(k);
	//  250  485:aload_1         
	//  251  486:getfield        #192 <Field View Fragment.mView>
	//  252  489:iload           7
	//  253  491:invokevirtual   #1636 <Method void View.setId(int)>
				if(((Fragment) (view)).mView.getTag() == null)
	//* 254  494:aload_1         
	//* 255  495:getfield        #192 <Field View Fragment.mView>
	//* 256  498:invokevirtual   #1639 <Method Object View.getTag()>
	//* 257  501:ifnonnull       513
					((Fragment) (view)).mView.setTag(((Object) (s2)));
	//  258  504:aload_1         
	//  259  505:getfield        #192 <Field View Fragment.mView>
	//  260  508:aload           9
	//  261  510:invokevirtual   #1642 <Method void View.setTag(Object)>
				return ((Fragment) (view)).mView;
	//  262  513:aload_1         
	//  263  514:getfield        #192 <Field View Fragment.mView>
	//  264  517:areturn         
			} else
			{
				view = ((View) (new StringBuilder()));
	//  265  518:new             #305 <Class StringBuilder>
	//  266  521:dup             
	//  267  522:invokespecial   #306 <Method void StringBuilder()>
	//  268  525:astore_1        
				((StringBuilder) (view)).append("Fragment ");
	//  269  526:aload_1         
	//  270  527:ldc2            #1417 <String "Fragment ">
	//  271  530:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  272  533:pop             
				((StringBuilder) (view)).append(s1);
	//  273  534:aload_1         
	//  274  535:aload           8
	//  275  537:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  276  540:pop             
				((StringBuilder) (view)).append(" did not create a view.");
	//  277  541:aload_1         
	//  278  542:ldc2            #1644 <String " did not create a view.">
	//  279  545:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  280  548:pop             
				throw new IllegalStateException(((StringBuilder) (view)).toString());
	//  281  549:new             #314 <Class IllegalStateException>
	//  282  552:dup             
	//  283  553:aload_1         
	//  284  554:invokevirtual   #318 <Method String StringBuilder.toString()>
	//  285  557:invokespecial   #321 <Method void IllegalStateException(String)>
	//  286  560:athrow          
			}
		}
		view = ((View) (new StringBuilder()));
	//  287  561:new             #305 <Class StringBuilder>
	//  288  564:dup             
	//  289  565:invokespecial   #306 <Method void StringBuilder()>
	//  290  568:astore_1        
		((StringBuilder) (view)).append(attributeset.getPositionDescription());
	//  291  569:aload_1         
	//  292  570:aload           4
	//  293  572:invokeinterface #1611 <Method String AttributeSet.getPositionDescription()>
	//  294  577:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  295  580:pop             
		((StringBuilder) (view)).append(": Duplicate id 0x");
	//  296  581:aload_1         
	//  297  582:ldc2            #1646 <String ": Duplicate id 0x">
	//  298  585:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  299  588:pop             
		((StringBuilder) (view)).append(Integer.toHexString(k));
	//  300  589:aload_1         
	//  301  590:iload           7
	//  302  592:invokestatic    #1100 <Method String Integer.toHexString(int)>
	//  303  595:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  304  598:pop             
		((StringBuilder) (view)).append(", tag ");
	//  305  599:aload_1         
	//  306  600:ldc2            #1648 <String ", tag ">
	//  307  603:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  308  606:pop             
		((StringBuilder) (view)).append(s2);
	//  309  607:aload_1         
	//  310  608:aload           9
	//  311  610:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  312  613:pop             
		((StringBuilder) (view)).append(", or parent id 0x");
	//  313  614:aload_1         
	//  314  615:ldc2            #1650 <String ", or parent id 0x">
	//  315  618:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  316  621:pop             
		((StringBuilder) (view)).append(Integer.toHexString(i));
	//  317  622:aload_1         
	//  318  623:iload           5
	//  319  625:invokestatic    #1100 <Method String Integer.toHexString(int)>
	//  320  628:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  321  631:pop             
		((StringBuilder) (view)).append(" with another fragment for ");
	//  322  632:aload_1         
	//  323  633:ldc2            #1652 <String " with another fragment for ">
	//  324  636:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  325  639:pop             
		((StringBuilder) (view)).append(s1);
	//  326  640:aload_1         
	//  327  641:aload           8
	//  328  643:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  329  646:pop             
		throw new IllegalArgumentException(((StringBuilder) (view)).toString());
	//  330  647:new             #1457 <Class IllegalArgumentException>
	//  331  650:dup             
	//  332  651:aload_1         
	//  333  652:invokevirtual   #318 <Method String StringBuilder.toString()>
	//  334  655:invokespecial   #1458 <Method void IllegalArgumentException(String)>
	//  335  658:athrow          
	}

	public View onCreateView(String s, Context context, AttributeSet attributeset)
	{
		return onCreateView(((View) (null)), s, context, attributeset);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokevirtual   #1655 <Method View onCreateView(View, String, Context, AttributeSet)>
	//    6    8:areturn         
	}

	public void performPendingDeferredStart(Fragment fragment)
	{
		if(fragment.mDeferStart)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1353 <Field boolean Fragment.mDeferStart>
	//*   2    4:ifeq            37
		{
			if(mExecutingActions)
	//*   3    7:aload_0         
	//*   4    8:getfield        #326 <Field boolean mExecutingActions>
	//*   5   11:ifeq            20
			{
				mHavePendingDeferredStart = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #1081 <Field boolean mHavePendingDeferredStart>
				return;
	//    9   19:return          
			}
			fragment.mDeferStart = false;
	//   10   20:aload_1         
	//   11   21:iconst_0        
	//   12   22:putfield        #1353 <Field boolean Fragment.mDeferStart>
			moveToState(fragment, mCurState, 0, 0, false);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #148 <Field int mCurState>
	//   17   31:iconst_0        
	//   18   32:iconst_0        
	//   19   33:iconst_0        
	//   20   34:invokevirtual   #188 <Method void moveToState(Fragment, int, int, int, boolean)>
		}
	//   21   37:return          
	}

	public void popBackStack(int i, int j)
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            21
		{
			enqueueAction(((OpGenerator) (new PopBackStackState(((String) (null)), i, j))), false);
	//    2    4:aload_0         
	//    3    5:new             #44  <Class FragmentManagerImpl$PopBackStackState>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:iload_1         
	//    8   12:iload_2         
	//    9   13:invokespecial   #1661 <Method void FragmentManagerImpl$PopBackStackState(FragmentManagerImpl, String, int, int)>
	//   10   16:iconst_0        
	//   11   17:invokevirtual   #1663 <Method void enqueueAction(FragmentManagerImpl$OpGenerator, boolean)>
			return;
	//   12   20:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   13   21:new             #305 <Class StringBuilder>
	//   14   24:dup             
	//   15   25:invokespecial   #306 <Method void StringBuilder()>
	//   16   28:astore_3        
			stringbuilder.append("Bad id: ");
	//   17   29:aload_3         
	//   18   30:ldc2            #1665 <String "Bad id: ">
	//   19   33:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   20   36:pop             
			stringbuilder.append(i);
	//   21   37:aload_3         
	//   22   38:iload_1         
	//   23   39:invokevirtual   #841 <Method StringBuilder StringBuilder.append(int)>
	//   24   42:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   25   43:new             #1457 <Class IllegalArgumentException>
	//   26   46:dup             
	//   27   47:aload_3         
	//   28   48:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   29   51:invokespecial   #1458 <Method void IllegalArgumentException(String)>
	//   30   54:athrow          
		}
	}

	public boolean popBackStackImmediate()
	{
		checkStateLoss();
	//    0    0:aload_0         
	//    1    1:invokespecial   #388 <Method void checkStateLoss()>
		return popBackStackImmediate(((String) (null)), -1, 0);
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:iconst_m1       
	//    5    7:iconst_0        
	//    6    8:invokespecial   #1667 <Method boolean popBackStackImmediate(String, int, int)>
	//    7   11:ireturn         
	}

	boolean popBackStackState(ArrayList arraylist, ArrayList arraylist1, String s, int i, int j)
	{
		ArrayList arraylist2 = mBackStack;
	//    0    0:aload_0         
	//    1    1:getfield        #787 <Field ArrayList mBackStack>
	//    2    4:astore          8
		if(arraylist2 == null)
	//*   3    6:aload           8
	//*   4    8:ifnonnull       13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		if(s == null && i < 0 && (j & 1) == 0)
	//*   7   13:aload_3         
	//*   8   14:ifnonnull       70
	//*   9   17:iload           4
	//*  10   19:ifge            70
	//*  11   22:iload           5
	//*  12   24:iconst_1        
	//*  13   25:iand            
	//*  14   26:ifne            70
		{
			i = arraylist2.size() - 1;
	//   15   29:aload           8
	//   16   31:invokevirtual   #169 <Method int ArrayList.size()>
	//   17   34:iconst_1        
	//   18   35:isub            
	//   19   36:istore          4
			if(i < 0)
	//*  20   38:iload           4
	//*  21   40:ifge            45
			{
				return false;
	//   22   43:iconst_0        
	//   23   44:ireturn         
			} else
			{
				arraylist.add(mBackStack.remove(i));
	//   24   45:aload_1         
	//   25   46:aload_0         
	//   26   47:getfield        #787 <Field ArrayList mBackStack>
	//   27   50:iload           4
	//   28   52:invokevirtual   #496 <Method Object ArrayList.remove(int)>
	//   29   55:invokevirtual   #678 <Method boolean ArrayList.add(Object)>
	//   30   58:pop             
				arraylist1.add(((Object) (Boolean.valueOf(true))));
	//   31   59:aload_2         
	//   32   60:iconst_1        
	//   33   61:invokestatic    #877 <Method Boolean Boolean.valueOf(boolean)>
	//   34   64:invokevirtual   #678 <Method boolean ArrayList.add(Object)>
	//   35   67:pop             
				return true;
	//   36   68:iconst_1        
	//   37   69:ireturn         
			}
		}
		int k;
		if(s == null && i < 0)
	//*  38   70:aload_3         
	//*  39   71:ifnonnull       88
	//*  40   74:iload           4
	//*  41   76:iflt            82
	//*  42   79:goto            88
		{
			k = -1;
	//   43   82:iconst_m1       
	//   44   83:istore          6
		} else
	//*  45   85:goto            259
		{
			int l = mBackStack.size() - 1;
	//   46   88:aload_0         
	//   47   89:getfield        #787 <Field ArrayList mBackStack>
	//   48   92:invokevirtual   #169 <Method int ArrayList.size()>
	//   49   95:iconst_1        
	//   50   96:isub            
	//   51   97:istore          7
			do
			{
				if(l < 0)
					break;
	//   52   99:iload           7
	//   53  101:iflt            164
				BackStackRecord backstackrecord = (BackStackRecord)mBackStack.get(l);
	//   54  104:aload_0         
	//   55  105:getfield        #787 <Field ArrayList mBackStack>
	//   56  108:iload           7
	//   57  110:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//   58  113:checkcast       #402 <Class BackStackRecord>
	//   59  116:astore          8
				if(s != null && s.equals(((Object) (backstackrecord.getName()))) || i >= 0 && i == backstackrecord.mIndex)
	//*  60  118:aload_3         
	//*  61  119:ifnull          137
	//*  62  122:aload_3         
	//*  63  123:aload           8
	//*  64  125:invokevirtual   #1670 <Method String BackStackRecord.getName()>
	//*  65  128:invokevirtual   #628 <Method boolean String.equals(Object)>
	//*  66  131:ifeq            137
	//*  67  134:goto            164
	//*  68  137:iload           4
	//*  69  139:iflt            155
	//*  70  142:iload           4
	//*  71  144:aload           8
	//*  72  146:getfield        #461 <Field int BackStackRecord.mIndex>
	//*  73  149:icmpne          155
					break;
	//   74  152:goto            164
				l--;
	//   75  155:iload           7
	//   76  157:iconst_1        
	//   77  158:isub            
	//   78  159:istore          7
			} while(true);
	//   79  161:goto            99
			if(l < 0)
	//*  80  164:iload           7
	//*  81  166:ifge            171
				return false;
	//   82  169:iconst_0        
	//   83  170:ireturn         
			k = l;
	//   84  171:iload           7
	//   85  173:istore          6
			if((j & 1) != 0)
	//*  86  175:iload           5
	//*  87  177:iconst_1        
	//*  88  178:iand            
	//*  89  179:ifeq            259
			{
				j = l - 1;
	//   90  182:iload           7
	//   91  184:iconst_1        
	//   92  185:isub            
	//   93  186:istore          5
				do
				{
					k = j;
	//   94  188:iload           5
	//   95  190:istore          6
					if(j < 0)
						break;
	//   96  192:iload           5
	//   97  194:iflt            259
					BackStackRecord backstackrecord1 = (BackStackRecord)mBackStack.get(j);
	//   98  197:aload_0         
	//   99  198:getfield        #787 <Field ArrayList mBackStack>
	//  100  201:iload           5
	//  101  203:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//  102  206:checkcast       #402 <Class BackStackRecord>
	//  103  209:astore          8
					if(s == null || !s.equals(((Object) (backstackrecord1.getName()))))
	//* 104  211:aload_3         
	//* 105  212:ifnull          227
	//* 106  215:aload_3         
	//* 107  216:aload           8
	//* 108  218:invokevirtual   #1670 <Method String BackStackRecord.getName()>
	//* 109  221:invokevirtual   #628 <Method boolean String.equals(Object)>
	//* 110  224:ifne            250
					{
						k = j;
	//  111  227:iload           5
	//  112  229:istore          6
						if(i < 0)
							break;
	//  113  231:iload           4
	//  114  233:iflt            259
						k = j;
	//  115  236:iload           5
	//  116  238:istore          6
						if(i != backstackrecord1.mIndex)
							break;
	//  117  240:iload           4
	//  118  242:aload           8
	//  119  244:getfield        #461 <Field int BackStackRecord.mIndex>
	//  120  247:icmpne          259
					}
					j--;
	//  121  250:iload           5
	//  122  252:iconst_1        
	//  123  253:isub            
	//  124  254:istore          5
				} while(true);
	//  125  256:goto            188
			}
		}
		if(k == mBackStack.size() - 1)
	//* 126  259:iload           6
	//* 127  261:aload_0         
	//* 128  262:getfield        #787 <Field ArrayList mBackStack>
	//* 129  265:invokevirtual   #169 <Method int ArrayList.size()>
	//* 130  268:iconst_1        
	//* 131  269:isub            
	//* 132  270:icmpne          275
			return false;
	//  133  273:iconst_0        
	//  134  274:ireturn         
		for(i = mBackStack.size() - 1; i > k; i--)
	//* 135  275:aload_0         
	//* 136  276:getfield        #787 <Field ArrayList mBackStack>
	//* 137  279:invokevirtual   #169 <Method int ArrayList.size()>
	//* 138  282:iconst_1        
	//* 139  283:isub            
	//* 140  284:istore          4
	//* 141  286:iload           4
	//* 142  288:iload           6
	//* 143  290:icmple          325
		{
			arraylist.add(mBackStack.remove(i));
	//  144  293:aload_1         
	//  145  294:aload_0         
	//  146  295:getfield        #787 <Field ArrayList mBackStack>
	//  147  298:iload           4
	//  148  300:invokevirtual   #496 <Method Object ArrayList.remove(int)>
	//  149  303:invokevirtual   #678 <Method boolean ArrayList.add(Object)>
	//  150  306:pop             
			arraylist1.add(((Object) (Boolean.valueOf(true))));
	//  151  307:aload_2         
	//  152  308:iconst_1        
	//  153  309:invokestatic    #877 <Method Boolean Boolean.valueOf(boolean)>
	//  154  312:invokevirtual   #678 <Method boolean ArrayList.add(Object)>
	//  155  315:pop             
		}

	//  156  316:iload           4
	//  157  318:iconst_1        
	//  158  319:isub            
	//  159  320:istore          4
	//* 160  322:goto            286
		return true;
	//  161  325:iconst_1        
	//  162  326:ireturn         
	}

	public void putFragment(Bundle bundle, String s, Fragment fragment)
	{
		if(fragment.mIndex < 0)
	//*   0    0:aload_3         
	//*   1    1:getfield        #1308 <Field int Fragment.mIndex>
	//*   2    4:ifge            57
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #305 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #306 <Method void StringBuilder()>
	//    6   14:astore          4
			stringbuilder.append("Fragment ");
	//    7   16:aload           4
	//    8   18:ldc2            #1417 <String "Fragment ">
	//    9   21:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:pop             
			stringbuilder.append(((Object) (fragment)));
	//   11   25:aload           4
	//   12   27:aload_3         
	//   13   28:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//   14   31:pop             
			stringbuilder.append(" is not currently in the FragmentManager");
	//   15   32:aload           4
	//   16   34:ldc2            #1675 <String " is not currently in the FragmentManager">
	//   17   37:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   18   40:pop             
			throwException(((RuntimeException) (new IllegalStateException(stringbuilder.toString()))));
	//   19   41:aload_0         
	//   20   42:new             #314 <Class IllegalStateException>
	//   21   45:dup             
	//   22   46:aload           4
	//   23   48:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   24   51:invokespecial   #321 <Method void IllegalStateException(String)>
	//   25   54:invokespecial   #1237 <Method void throwException(RuntimeException)>
		}
		bundle.putInt(s, fragment.mIndex);
	//   26   57:aload_1         
	//   27   58:aload_2         
	//   28   59:aload_3         
	//   29   60:getfield        #1308 <Field int Fragment.mIndex>
	//   30   63:invokevirtual   #1679 <Method void Bundle.putInt(String, int)>
	//   31   66:return          
	}

	public void registerFragmentLifecycleCallbacks(FragmentManager.FragmentLifecycleCallbacks fragmentlifecyclecallbacks, boolean flag)
	{
		mLifecycleCallbacks.add(((Object) (new FragmentLifecycleCallbacksHolder(fragmentlifecyclecallbacks, flag))));
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//    2    4:new             #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokespecial   #1683 <Method void FragmentManagerImpl$FragmentLifecycleCallbacksHolder(FragmentManager$FragmentLifecycleCallbacks, boolean)>
	//    7   13:invokevirtual   #1684 <Method boolean CopyOnWriteArrayList.add(Object)>
	//    8   16:pop             
	//    9   17:return          
	}

	public void removeFragment(Fragment fragment)
	{
		if(DEBUG)
	//*   0    0:getstatic       #791 <Field boolean DEBUG>
	//*   1    3:ifeq            56
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #305 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #306 <Method void StringBuilder()>
	//    5   13:astore_3        
			stringbuilder.append("remove: ");
	//    6   14:aload_3         
	//    7   15:ldc2            #1687 <String "remove: ">
	//    8   18:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (fragment)));
	//   10   22:aload_3         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			stringbuilder.append(" nesting=");
	//   14   28:aload_3         
	//   15   29:ldc2            #1689 <String " nesting=">
	//   16   32:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
			stringbuilder.append(fragment.mBackStackNesting);
	//   18   36:aload_3         
	//   19   37:aload_1         
	//   20   38:getfield        #1692 <Field int Fragment.mBackStackNesting>
	//   21   41:invokevirtual   #841 <Method StringBuilder StringBuilder.append(int)>
	//   22   44:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   23   45:ldc2            #544 <String "FragmentManager">
	//   24   48:aload_3         
	//   25   49:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   26   52:invokestatic    #799 <Method int Log.v(String, String)>
	//   27   55:pop             
		}
		boolean flag = fragment.isInBackStack();
	//   28   56:aload_1         
	//   29   57:invokevirtual   #1328 <Method boolean Fragment.isInBackStack()>
	//   30   60:istore_2        
		if(!fragment.mDetached || flag ^ true)
	//*  31   61:aload_1         
	//*  32   62:getfield        #806 <Field boolean Fragment.mDetached>
	//*  33   65:ifeq            74
	//*  34   68:iload_2         
	//*  35   69:iconst_1        
	//*  36   70:ixor            
	//*  37   71:ifeq            121
		{
			synchronized(mAdded)
	//*  38   74:aload_0         
	//*  39   75:getfield        #141 <Field ArrayList mAdded>
	//*  40   78:astore_3        
	//*  41   79:aload_3         
	//*  42   80:monitorenter    
			{
				mAdded.remove(((Object) (fragment)));
	//   43   81:aload_0         
	//   44   82:getfield        #141 <Field ArrayList mAdded>
	//   45   85:aload_1         
	//   46   86:invokevirtual   #913 <Method boolean ArrayList.remove(Object)>
	//   47   89:pop             
			}
	//   48   90:aload_3         
	//   49   91:monitorexit     
			if(fragment.mHasMenu && fragment.mMenuVisible)
	//*  50   92:aload_1         
	//*  51   93:getfield        #818 <Field boolean Fragment.mHasMenu>
	//*  52   96:ifeq            111
	//*  53   99:aload_1         
	//*  54  100:getfield        #821 <Field boolean Fragment.mMenuVisible>
	//*  55  103:ifeq            111
				mNeedMenuInvalidate = true;
	//   56  106:aload_0         
	//   57  107:iconst_1        
	//   58  108:putfield        #823 <Field boolean mNeedMenuInvalidate>
			fragment.mAdded = false;
	//   59  111:aload_1         
	//   60  112:iconst_0        
	//   61  113:putfield        #594 <Field boolean Fragment.mAdded>
			fragment.mRemoving = true;
	//   62  116:aload_1         
	//   63  117:iconst_1        
	//   64  118:putfield        #812 <Field boolean Fragment.mRemoving>
		}
		return;
	//   65  121:return          
		fragment;
	//   66  122:astore_1        
		arraylist;
	//   67  123:aload_3         
		JVM INSTR monitorexit ;
	//   68  124:monitorexit     
		throw fragment;
	//   69  125:aload_1         
	//   70  126:athrow          
	}

	void reportBackStackChanged()
	{
		if(mBackStackChangeListeners != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1694 <Field ArrayList mBackStackChangeListeners>
	//*   2    4:ifnull          43
		{
			for(int i = 0; i < mBackStackChangeListeners.size(); i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_1        
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #1694 <Field ArrayList mBackStackChangeListeners>
	//*   8   14:invokevirtual   #169 <Method int ArrayList.size()>
	//*   9   17:icmpge          43
				((FragmentManager.OnBackStackChangedListener)mBackStackChangeListeners.get(i)).onBackStackChanged();
	//   10   20:aload_0         
	//   11   21:getfield        #1694 <Field ArrayList mBackStackChangeListeners>
	//   12   24:iload_1         
	//   13   25:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//   14   28:checkcast       #1696 <Class FragmentManager$OnBackStackChangedListener>
	//   15   31:invokeinterface #1699 <Method void FragmentManager$OnBackStackChangedListener.onBackStackChanged()>

	//   16   36:iload_1         
	//   17   37:iconst_1        
	//   18   38:iadd            
	//   19   39:istore_1        
		}
	//*  20   40:goto            9
	//   21   43:return          
	}

	void restoreAllState(Parcelable parcelable, FragmentManagerNonConfig fragmentmanagernonconfig)
	{
		FragmentManagerState fragmentmanagerstate;
		if(parcelable == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		fragmentmanagerstate = (FragmentManagerState)parcelable;
	//    3    5:aload_1         
	//    4    6:checkcast       #1703 <Class FragmentManagerState>
	//    5    9:astore          9
		if(fragmentmanagerstate.mActive == null)
	//*   6   11:aload           9
	//*   7   13:getfield        #1706 <Field FragmentState[] FragmentManagerState.mActive>
	//*   8   16:ifnonnull       20
			return;
	//    9   19:return          
		Object obj;
		if(fragmentmanagernonconfig != null)
	//*  10   20:aload_2         
	//*  11   21:ifnull          328
		{
			List list2 = fragmentmanagernonconfig.getFragments();
	//   12   24:aload_2         
	//   13   25:invokevirtual   #711 <Method List FragmentManagerNonConfig.getFragments()>
	//   14   28:astore          10
			List list = fragmentmanagernonconfig.getChildNonConfigs();
	//   15   30:aload_2         
	//   16   31:invokevirtual   #730 <Method List FragmentManagerNonConfig.getChildNonConfigs()>
	//   17   34:astore          7
			List list1 = fragmentmanagernonconfig.getViewModelStores();
	//   18   36:aload_2         
	//   19   37:invokevirtual   #1709 <Method List FragmentManagerNonConfig.getViewModelStores()>
	//   20   40:astore          8
			int i;
			if(list2 != null)
	//*  21   42:aload           10
	//*  22   44:ifnull          58
				i = list2.size();
	//   23   47:aload           10
	//   24   49:invokeinterface #637 <Method int List.size()>
	//   25   54:istore_3        
			else
	//*  26   55:goto            60
				i = 0;
	//   27   58:iconst_0        
	//   28   59:istore_3        
			int j1 = 0;
	//   29   60:iconst_0        
	//   30   61:istore          4
			do
			{
				obj = ((Object) (list));
	//   31   63:aload           7
	//   32   65:astore          6
				parcelable = ((Parcelable) (list1));
	//   33   67:aload           8
	//   34   69:astore_1        
				if(j1 >= i)
					break;
	//   35   70:iload           4
	//   36   72:iload_3         
	//   37   73:icmpge          334
				parcelable = ((Parcelable) ((Fragment)list2.get(j1)));
	//   38   76:aload           10
	//   39   78:iload           4
	//   40   80:invokeinterface #638 <Method Object List.get(int)>
	//   41   85:checkcast       #175 <Class Fragment>
	//   42   88:astore_1        
				if(DEBUG)
	//*  43   89:getstatic       #791 <Field boolean DEBUG>
	//*  44   92:ifeq            132
				{
					obj = ((Object) (new StringBuilder()));
	//   45   95:new             #305 <Class StringBuilder>
	//   46   98:dup             
	//   47   99:invokespecial   #306 <Method void StringBuilder()>
	//   48  102:astore          6
					((StringBuilder) (obj)).append("restoreAllState: re-attaching retained ");
	//   49  104:aload           6
	//   50  106:ldc2            #1711 <String "restoreAllState: re-attaching retained ">
	//   51  109:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   52  112:pop             
					((StringBuilder) (obj)).append(((Object) (parcelable)));
	//   53  113:aload           6
	//   54  115:aload_1         
	//   55  116:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//   56  119:pop             
					Log.v("FragmentManager", ((StringBuilder) (obj)).toString());
	//   57  120:ldc2            #544 <String "FragmentManager">
	//   58  123:aload           6
	//   59  125:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   60  128:invokestatic    #799 <Method int Log.v(String, String)>
	//   61  131:pop             
				}
				int l1;
				for(l1 = 0; l1 < fragmentmanagerstate.mActive.length && fragmentmanagerstate.mActive[l1].mIndex != ((Fragment) (parcelable)).mIndex; l1++);
	//   62  132:iconst_0        
	//   63  133:istore          5
	//   64  135:iload           5
	//   65  137:aload           9
	//   66  139:getfield        #1706 <Field FragmentState[] FragmentManagerState.mActive>
	//   67  142:arraylength     
	//   68  143:icmpge          173
	//   69  146:aload           9
	//   70  148:getfield        #1706 <Field FragmentState[] FragmentManagerState.mActive>
	//   71  151:iload           5
	//   72  153:aaload          
	//   73  154:getfield        #1714 <Field int FragmentState.mIndex>
	//   74  157:aload_1         
	//   75  158:getfield        #1308 <Field int Fragment.mIndex>
	//   76  161:icmpeq          173
	//   77  164:iload           5
	//   78  166:iconst_1        
	//   79  167:iadd            
	//   80  168:istore          5
	//*  81  170:goto            135
				if(l1 == fragmentmanagerstate.mActive.length)
	//*  82  173:iload           5
	//*  83  175:aload           9
	//*  84  177:getfield        #1706 <Field FragmentState[] FragmentManagerState.mActive>
	//*  85  180:arraylength     
	//*  86  181:icmpne          228
				{
					obj = ((Object) (new StringBuilder()));
	//   87  184:new             #305 <Class StringBuilder>
	//   88  187:dup             
	//   89  188:invokespecial   #306 <Method void StringBuilder()>
	//   90  191:astore          6
					((StringBuilder) (obj)).append("Could not find active fragment with index ");
	//   91  193:aload           6
	//   92  195:ldc2            #1716 <String "Could not find active fragment with index ">
	//   93  198:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   94  201:pop             
					((StringBuilder) (obj)).append(((Fragment) (parcelable)).mIndex);
	//   95  202:aload           6
	//   96  204:aload_1         
	//   97  205:getfield        #1308 <Field int Fragment.mIndex>
	//   98  208:invokevirtual   #841 <Method StringBuilder StringBuilder.append(int)>
	//   99  211:pop             
					throwException(((RuntimeException) (new IllegalStateException(((StringBuilder) (obj)).toString()))));
	//  100  212:aload_0         
	//  101  213:new             #314 <Class IllegalStateException>
	//  102  216:dup             
	//  103  217:aload           6
	//  104  219:invokevirtual   #318 <Method String StringBuilder.toString()>
	//  105  222:invokespecial   #321 <Method void IllegalStateException(String)>
	//  106  225:invokespecial   #1237 <Method void throwException(RuntimeException)>
				}
				obj = ((Object) (fragmentmanagerstate.mActive[l1]));
	//  107  228:aload           9
	//  108  230:getfield        #1706 <Field FragmentState[] FragmentManagerState.mActive>
	//  109  233:iload           5
	//  110  235:aaload          
	//  111  236:astore          6
				obj.mInstance = ((Fragment) (parcelable));
	//  112  238:aload           6
	//  113  240:aload_1         
	//  114  241:putfield        #1719 <Field Fragment FragmentState.mInstance>
				parcelable.mSavedViewState = null;
	//  115  244:aload_1         
	//  116  245:aconst_null     
	//  117  246:putfield        #1375 <Field SparseArray Fragment.mSavedViewState>
				parcelable.mBackStackNesting = 0;
	//  118  249:aload_1         
	//  119  250:iconst_0        
	//  120  251:putfield        #1692 <Field int Fragment.mBackStackNesting>
				parcelable.mInLayout = false;
	//  121  254:aload_1         
	//  122  255:iconst_0        
	//  123  256:putfield        #1356 <Field boolean Fragment.mInLayout>
				parcelable.mAdded = false;
	//  124  259:aload_1         
	//  125  260:iconst_0        
	//  126  261:putfield        #594 <Field boolean Fragment.mAdded>
				parcelable.mTarget = null;
	//  127  264:aload_1         
	//  128  265:aconst_null     
	//  129  266:putfield        #1382 <Field Fragment Fragment.mTarget>
				if(((FragmentState) (obj)).mSavedFragmentState != null)
	//* 130  269:aload           6
	//* 131  271:getfield        #1720 <Field Bundle FragmentState.mSavedFragmentState>
	//* 132  274:ifnull          319
				{
					((FragmentState) (obj)).mSavedFragmentState.setClassLoader(mHost.getContext().getClassLoader());
	//  133  277:aload           6
	//  134  279:getfield        #1720 <Field Bundle FragmentState.mSavedFragmentState>
	//  135  282:aload_0         
	//  136  283:getfield        #369 <Field FragmentHostCallback mHost>
	//  137  286:invokevirtual   #1270 <Method Context FragmentHostCallback.getContext()>
	//  138  289:invokevirtual   #1362 <Method ClassLoader Context.getClassLoader()>
	//  139  292:invokevirtual   #1366 <Method void Bundle.setClassLoader(ClassLoader)>
					parcelable.mSavedViewState = ((FragmentState) (obj)).mSavedFragmentState.getSparseParcelableArray("android:view_state");
	//  140  295:aload_1         
	//  141  296:aload           6
	//  142  298:getfield        #1720 <Field Bundle FragmentState.mSavedFragmentState>
	//  143  301:ldc2            #1368 <String "android:view_state">
	//  144  304:invokevirtual   #1372 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//  145  307:putfield        #1375 <Field SparseArray Fragment.mSavedViewState>
					parcelable.mSavedFragmentState = ((FragmentState) (obj)).mSavedFragmentState;
	//  146  310:aload_1         
	//  147  311:aload           6
	//  148  313:getfield        #1720 <Field Bundle FragmentState.mSavedFragmentState>
	//  149  316:putfield        #1179 <Field Bundle Fragment.mSavedFragmentState>
				}
				j1++;
	//  150  319:iload           4
	//  151  321:iconst_1        
	//  152  322:iadd            
	//  153  323:istore          4
			} while(true);
	//  154  325:goto            63
		} else
		{
			obj = null;
	//  155  328:aconst_null     
	//  156  329:astore          6
			parcelable = ((Parcelable) (obj));
	//  157  331:aload           6
	//  158  333:astore_1        
		}
		mActive = new SparseArray(fragmentmanagerstate.mActive.length);
	//  159  334:aload_0         
	//  160  335:new             #285 <Class SparseArray>
	//  161  338:dup             
	//  162  339:aload           9
	//  163  341:getfield        #1706 <Field FragmentState[] FragmentManagerState.mActive>
	//  164  344:arraylength     
	//  165  345:invokespecial   #1721 <Method void SparseArray(int)>
	//  166  348:putfield        #283 <Field SparseArray mActive>
		for(int j = 0; j < fragmentmanagerstate.mActive.length; j++)
	//* 167  351:iconst_0        
	//* 168  352:istore_3        
	//* 169  353:iload_3         
	//* 170  354:aload           9
	//* 171  356:getfield        #1706 <Field FragmentState[] FragmentManagerState.mActive>
	//* 172  359:arraylength     
	//* 173  360:icmpge          554
		{
			FragmentState fragmentstate = fragmentmanagerstate.mActive[j];
	//  174  363:aload           9
	//  175  365:getfield        #1706 <Field FragmentState[] FragmentManagerState.mActive>
	//  176  368:iload_3         
	//  177  369:aaload          
	//  178  370:astore          10
			if(fragmentstate == null)
				continue;
	//  179  372:aload           10
	//  180  374:ifnull          547
			Object obj1;
			if(obj != null && j < ((List) (obj)).size())
	//* 181  377:aload           6
	//* 182  379:ifnull          409
	//* 183  382:iload_3         
	//* 184  383:aload           6
	//* 185  385:invokeinterface #637 <Method int List.size()>
	//* 186  390:icmpge          409
				obj1 = ((Object) ((FragmentManagerNonConfig)((List) (obj)).get(j)));
	//  187  393:aload           6
	//  188  395:iload_3         
	//  189  396:invokeinterface #638 <Method Object List.get(int)>
	//  190  401:checkcast       #708 <Class FragmentManagerNonConfig>
	//  191  404:astore          7
			else
	//* 192  406:goto            412
				obj1 = null;
	//  193  409:aconst_null     
	//  194  410:astore          7
			ViewModelStore viewmodelstore;
			if(parcelable != null && j < ((List) (parcelable)).size())
	//* 195  412:aload_1         
	//* 196  413:ifnull          441
	//* 197  416:iload_3         
	//* 198  417:aload_1         
	//* 199  418:invokeinterface #637 <Method int List.size()>
	//* 200  423:icmpge          441
				viewmodelstore = (ViewModelStore)((List) (parcelable)).get(j);
	//  201  426:aload_1         
	//  202  427:iload_3         
	//  203  428:invokeinterface #638 <Method Object List.get(int)>
	//  204  433:checkcast       #1723 <Class ViewModelStore>
	//  205  436:astore          8
			else
	//* 206  438:goto            444
				viewmodelstore = null;
	//  207  441:aconst_null     
	//  208  442:astore          8
			obj1 = ((Object) (fragmentstate.instantiate(mHost, mContainer, mParent, ((FragmentManagerNonConfig) (obj1)), viewmodelstore)));
	//  209  444:aload           10
	//  210  446:aload_0         
	//  211  447:getfield        #369 <Field FragmentHostCallback mHost>
	//  212  450:aload_0         
	//  213  451:getfield        #857 <Field FragmentContainer mContainer>
	//  214  454:aload_0         
	//  215  455:getfield        #859 <Field Fragment mParent>
	//  216  458:aload           7
	//  217  460:aload           8
	//  218  462:invokevirtual   #1726 <Method Fragment FragmentState.instantiate(FragmentHostCallback, FragmentContainer, Fragment, FragmentManagerNonConfig, ViewModelStore)>
	//  219  465:astore          7
			if(DEBUG)
	//* 220  467:getstatic       #791 <Field boolean DEBUG>
	//* 221  470:ifeq            527
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//  222  473:new             #305 <Class StringBuilder>
	//  223  476:dup             
	//  224  477:invokespecial   #306 <Method void StringBuilder()>
	//  225  480:astore          8
				stringbuilder1.append("restoreAllState: active #");
	//  226  482:aload           8
	//  227  484:ldc2            #1728 <String "restoreAllState: active #">
	//  228  487:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  229  490:pop             
				stringbuilder1.append(j);
	//  230  491:aload           8
	//  231  493:iload_3         
	//  232  494:invokevirtual   #841 <Method StringBuilder StringBuilder.append(int)>
	//  233  497:pop             
				stringbuilder1.append(": ");
	//  234  498:aload           8
	//  235  500:ldc2            #1111 <String ": ">
	//  236  503:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  237  506:pop             
				stringbuilder1.append(obj1);
	//  238  507:aload           8
	//  239  509:aload           7
	//  240  511:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//  241  514:pop             
				Log.v("FragmentManager", stringbuilder1.toString());
	//  242  515:ldc2            #544 <String "FragmentManager">
	//  243  518:aload           8
	//  244  520:invokevirtual   #318 <Method String StringBuilder.toString()>
	//  245  523:invokestatic    #799 <Method int Log.v(String, String)>
	//  246  526:pop             
			}
			mActive.put(((Fragment) (obj1)).mIndex, obj1);
	//  247  527:aload_0         
	//  248  528:getfield        #283 <Field SparseArray mActive>
	//  249  531:aload           7
	//  250  533:getfield        #1308 <Field int Fragment.mIndex>
	//  251  536:aload           7
	//  252  538:invokevirtual   #1316 <Method void SparseArray.put(int, Object)>
			fragmentstate.mInstance = null;
	//  253  541:aload           10
	//  254  543:aconst_null     
	//  255  544:putfield        #1719 <Field Fragment FragmentState.mInstance>
		}

	//  256  547:iload_3         
	//  257  548:iconst_1        
	//  258  549:iadd            
	//  259  550:istore_3        
	//* 260  551:goto            353
		if(fragmentmanagernonconfig != null)
	//* 261  554:aload_2         
	//* 262  555:ifnull          697
		{
			parcelable = ((Parcelable) (fragmentmanagernonconfig.getFragments()));
	//  263  558:aload_2         
	//  264  559:invokevirtual   #711 <Method List FragmentManagerNonConfig.getFragments()>
	//  265  562:astore_1        
			int k;
			if(parcelable != null)
	//* 266  563:aload_1         
	//* 267  564:ifnull          577
				k = ((List) (parcelable)).size();
	//  268  567:aload_1         
	//  269  568:invokeinterface #637 <Method int List.size()>
	//  270  573:istore_3        
			else
	//* 271  574:goto            579
				k = 0;
	//  272  577:iconst_0        
	//  273  578:istore_3        
			for(int k1 = 0; k1 < k; k1++)
	//* 274  579:iconst_0        
	//* 275  580:istore          4
	//* 276  582:iload           4
	//* 277  584:iload_3         
	//* 278  585:icmpge          697
			{
				fragmentmanagernonconfig = ((FragmentManagerNonConfig) ((Fragment)((List) (parcelable)).get(k1)));
	//  279  588:aload_1         
	//  280  589:iload           4
	//  281  591:invokeinterface #638 <Method Object List.get(int)>
	//  282  596:checkcast       #175 <Class Fragment>
	//  283  599:astore_2        
				if(((Fragment) (fragmentmanagernonconfig)).mTargetIndex < 0)
					continue;
	//  284  600:aload_2         
	//  285  601:getfield        #1731 <Field int Fragment.mTargetIndex>
	//  286  604:iflt            688
				fragmentmanagernonconfig.mTarget = (Fragment)mActive.get(((Fragment) (fragmentmanagernonconfig)).mTargetIndex);
	//  287  607:aload_2         
	//  288  608:aload_0         
	//  289  609:getfield        #283 <Field SparseArray mActive>
	//  290  612:aload_2         
	//  291  613:getfield        #1731 <Field int Fragment.mTargetIndex>
	//  292  616:invokevirtual   #1231 <Method Object SparseArray.get(int)>
	//  293  619:checkcast       #175 <Class Fragment>
	//  294  622:putfield        #1382 <Field Fragment Fragment.mTarget>
				if(((Fragment) (fragmentmanagernonconfig)).mTarget == null)
	//* 295  625:aload_2         
	//* 296  626:getfield        #1382 <Field Fragment Fragment.mTarget>
	//* 297  629:ifnonnull       688
				{
					StringBuilder stringbuilder = new StringBuilder();
	//  298  632:new             #305 <Class StringBuilder>
	//  299  635:dup             
	//  300  636:invokespecial   #306 <Method void StringBuilder()>
	//  301  639:astore          6
					stringbuilder.append("Re-attaching retained fragment ");
	//  302  641:aload           6
	//  303  643:ldc2            #1733 <String "Re-attaching retained fragment ">
	//  304  646:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  305  649:pop             
					stringbuilder.append(((Object) (fragmentmanagernonconfig)));
	//  306  650:aload           6
	//  307  652:aload_2         
	//  308  653:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//  309  656:pop             
					stringbuilder.append(" target no longer exists: ");
	//  310  657:aload           6
	//  311  659:ldc2            #1735 <String " target no longer exists: ">
	//  312  662:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  313  665:pop             
					stringbuilder.append(((Fragment) (fragmentmanagernonconfig)).mTargetIndex);
	//  314  666:aload           6
	//  315  668:aload_2         
	//  316  669:getfield        #1731 <Field int Fragment.mTargetIndex>
	//  317  672:invokevirtual   #841 <Method StringBuilder StringBuilder.append(int)>
	//  318  675:pop             
					Log.w("FragmentManager", stringbuilder.toString());
	//  319  676:ldc2            #544 <String "FragmentManager">
	//  320  679:aload           6
	//  321  681:invokevirtual   #318 <Method String StringBuilder.toString()>
	//  322  684:invokestatic    #1565 <Method int Log.w(String, String)>
	//  323  687:pop             
				}
			}

	//  324  688:iload           4
	//  325  690:iconst_1        
	//  326  691:iadd            
	//  327  692:istore          4
		}
	//* 328  694:goto            582
		mAdded.clear();
	//  329  697:aload_0         
	//  330  698:getfield        #141 <Field ArrayList mAdded>
	//  331  701:invokevirtual   #331 <Method void ArrayList.clear()>
		if(fragmentmanagerstate.mAdded != null)
	//* 332  704:aload           9
	//* 333  706:getfield        #1737 <Field int[] FragmentManagerState.mAdded>
	//* 334  709:ifnull          899
		{
			for(int l = 0; l < fragmentmanagerstate.mAdded.length;)
	//* 335  712:iconst_0        
	//* 336  713:istore_3        
	//* 337  714:iload_3         
	//* 338  715:aload           9
	//* 339  717:getfield        #1737 <Field int[] FragmentManagerState.mAdded>
	//* 340  720:arraylength     
	//* 341  721:icmpge          899
			{
				parcelable = ((Parcelable) ((Fragment)mActive.get(fragmentmanagerstate.mAdded[l])));
	//  342  724:aload_0         
	//  343  725:getfield        #283 <Field SparseArray mActive>
	//  344  728:aload           9
	//  345  730:getfield        #1737 <Field int[] FragmentManagerState.mAdded>
	//  346  733:iload_3         
	//  347  734:iaload          
	//  348  735:invokevirtual   #1231 <Method Object SparseArray.get(int)>
	//  349  738:checkcast       #175 <Class Fragment>
	//  350  741:astore_1        
				if(parcelable == null)
	//* 351  742:aload_1         
	//* 352  743:ifnonnull       789
				{
					fragmentmanagernonconfig = ((FragmentManagerNonConfig) (new StringBuilder()));
	//  353  746:new             #305 <Class StringBuilder>
	//  354  749:dup             
	//  355  750:invokespecial   #306 <Method void StringBuilder()>
	//  356  753:astore_2        
					((StringBuilder) (fragmentmanagernonconfig)).append("No instantiated fragment for index #");
	//  357  754:aload_2         
	//  358  755:ldc2            #1739 <String "No instantiated fragment for index #">
	//  359  758:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  360  761:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(fragmentmanagerstate.mAdded[l]);
	//  361  762:aload_2         
	//  362  763:aload           9
	//  363  765:getfield        #1737 <Field int[] FragmentManagerState.mAdded>
	//  364  768:iload_3         
	//  365  769:iaload          
	//  366  770:invokevirtual   #841 <Method StringBuilder StringBuilder.append(int)>
	//  367  773:pop             
					throwException(((RuntimeException) (new IllegalStateException(((StringBuilder) (fragmentmanagernonconfig)).toString()))));
	//  368  774:aload_0         
	//  369  775:new             #314 <Class IllegalStateException>
	//  370  778:dup             
	//  371  779:aload_2         
	//  372  780:invokevirtual   #318 <Method String StringBuilder.toString()>
	//  373  783:invokespecial   #321 <Method void IllegalStateException(String)>
	//  374  786:invokespecial   #1237 <Method void throwException(RuntimeException)>
				}
				parcelable.mAdded = true;
	//  375  789:aload_1         
	//  376  790:iconst_1        
	//  377  791:putfield        #594 <Field boolean Fragment.mAdded>
				if(DEBUG)
	//* 378  794:getstatic       #791 <Field boolean DEBUG>
	//* 379  797:ifeq            847
				{
					fragmentmanagernonconfig = ((FragmentManagerNonConfig) (new StringBuilder()));
	//  380  800:new             #305 <Class StringBuilder>
	//  381  803:dup             
	//  382  804:invokespecial   #306 <Method void StringBuilder()>
	//  383  807:astore_2        
					((StringBuilder) (fragmentmanagernonconfig)).append("restoreAllState: added #");
	//  384  808:aload_2         
	//  385  809:ldc2            #1741 <String "restoreAllState: added #">
	//  386  812:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  387  815:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(l);
	//  388  816:aload_2         
	//  389  817:iload_3         
	//  390  818:invokevirtual   #841 <Method StringBuilder StringBuilder.append(int)>
	//  391  821:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(": ");
	//  392  822:aload_2         
	//  393  823:ldc2            #1111 <String ": ">
	//  394  826:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  395  829:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(((Object) (parcelable)));
	//  396  830:aload_2         
	//  397  831:aload_1         
	//  398  832:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//  399  835:pop             
					Log.v("FragmentManager", ((StringBuilder) (fragmentmanagernonconfig)).toString());
	//  400  836:ldc2            #544 <String "FragmentManager">
	//  401  839:aload_2         
	//  402  840:invokevirtual   #318 <Method String StringBuilder.toString()>
	//  403  843:invokestatic    #799 <Method int Log.v(String, String)>
	//  404  846:pop             
				}
				if(!mAdded.contains(((Object) (parcelable))))
	//* 405  847:aload_0         
	//* 406  848:getfield        #141 <Field ArrayList mAdded>
	//* 407  851:aload_1         
	//* 408  852:invokevirtual   #809 <Method boolean ArrayList.contains(Object)>
	//* 409  855:ifne            888
				{
					synchronized(mAdded)
	//* 410  858:aload_0         
	//* 411  859:getfield        #141 <Field ArrayList mAdded>
	//* 412  862:astore_2        
	//* 413  863:aload_2         
	//* 414  864:monitorenter    
					{
						mAdded.add(((Object) (parcelable)));
	//  415  865:aload_0         
	//  416  866:getfield        #141 <Field ArrayList mAdded>
	//  417  869:aload_1         
	//  418  870:invokevirtual   #678 <Method boolean ArrayList.add(Object)>
	//  419  873:pop             
					}
	//  420  874:aload_2         
	//  421  875:monitorexit     
					l++;
	//  422  876:iload_3         
	//  423  877:iconst_1        
	//  424  878:iadd            
	//  425  879:istore_3        
				} else
	//* 426  880:goto            714
	//* 427  883:astore_1        
	//* 428  884:aload_2         
	//* 429  885:monitorexit     
	//* 430  886:aload_1         
	//* 431  887:athrow          
				{
					throw new IllegalStateException("Already added!");
	//  432  888:new             #314 <Class IllegalStateException>
	//  433  891:dup             
	//  434  892:ldc2            #1743 <String "Already added!">
	//  435  895:invokespecial   #321 <Method void IllegalStateException(String)>
	//  436  898:athrow          
				}
			}

		}
		break MISSING_BLOCK_LABEL_899;
		parcelable;
		fragmentmanagernonconfig;
		JVM INSTR monitorexit ;
		throw parcelable;
		if(fragmentmanagerstate.mBackStack != null)
	//* 437  899:aload           9
	//* 438  901:getfield        #1746 <Field BackStackState[] FragmentManagerState.mBackStack>
	//* 439  904:ifnull          1081
		{
			mBackStack = new ArrayList(fragmentmanagerstate.mBackStack.length);
	//  440  907:aload_0         
	//  441  908:new             #138 <Class ArrayList>
	//  442  911:dup             
	//  443  912:aload           9
	//  444  914:getfield        #1746 <Field BackStackState[] FragmentManagerState.mBackStack>
	//  445  917:arraylength     
	//  446  918:invokespecial   #873 <Method void ArrayList(int)>
	//  447  921:putfield        #787 <Field ArrayList mBackStack>
			for(int i1 = 0; i1 < fragmentmanagerstate.mBackStack.length; i1++)
	//* 448  924:iconst_0        
	//* 449  925:istore_3        
	//* 450  926:iload_3         
	//* 451  927:aload           9
	//* 452  929:getfield        #1746 <Field BackStackState[] FragmentManagerState.mBackStack>
	//* 453  932:arraylength     
	//* 454  933:icmpge          1086
			{
				parcelable = ((Parcelable) (fragmentmanagerstate.mBackStack[i1].instantiate(this)));
	//  455  936:aload           9
	//  456  938:getfield        #1746 <Field BackStackState[] FragmentManagerState.mBackStack>
	//  457  941:iload_3         
	//  458  942:aaload          
	//  459  943:aload_0         
	//  460  944:invokevirtual   #1751 <Method BackStackRecord BackStackState.instantiate(FragmentManagerImpl)>
	//  461  947:astore_1        
				if(DEBUG)
	//* 462  948:getstatic       #791 <Field boolean DEBUG>
	//* 463  951:ifeq            1049
				{
					fragmentmanagernonconfig = ((FragmentManagerNonConfig) (new StringBuilder()));
	//  464  954:new             #305 <Class StringBuilder>
	//  465  957:dup             
	//  466  958:invokespecial   #306 <Method void StringBuilder()>
	//  467  961:astore_2        
					((StringBuilder) (fragmentmanagernonconfig)).append("restoreAllState: back stack #");
	//  468  962:aload_2         
	//  469  963:ldc2            #1753 <String "restoreAllState: back stack #">
	//  470  966:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  471  969:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(i1);
	//  472  970:aload_2         
	//  473  971:iload_3         
	//  474  972:invokevirtual   #841 <Method StringBuilder StringBuilder.append(int)>
	//  475  975:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(" (index ");
	//  476  976:aload_2         
	//  477  977:ldc2            #1755 <String " (index ">
	//  478  980:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  479  983:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(((BackStackRecord) (parcelable)).mIndex);
	//  480  984:aload_2         
	//  481  985:aload_1         
	//  482  986:getfield        #461 <Field int BackStackRecord.mIndex>
	//  483  989:invokevirtual   #841 <Method StringBuilder StringBuilder.append(int)>
	//  484  992:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append("): ");
	//  485  993:aload_2         
	//  486  994:ldc2            #1757 <String "): ">
	//  487  997:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  488 1000:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(((Object) (parcelable)));
	//  489 1001:aload_2         
	//  490 1002:aload_1         
	//  491 1003:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//  492 1006:pop             
					Log.v("FragmentManager", ((StringBuilder) (fragmentmanagernonconfig)).toString());
	//  493 1007:ldc2            #544 <String "FragmentManager">
	//  494 1010:aload_2         
	//  495 1011:invokevirtual   #318 <Method String StringBuilder.toString()>
	//  496 1014:invokestatic    #799 <Method int Log.v(String, String)>
	//  497 1017:pop             
					fragmentmanagernonconfig = ((FragmentManagerNonConfig) (new PrintWriter(((java.io.Writer) (new LogWriter("FragmentManager"))))));
	//  498 1018:new             #764 <Class PrintWriter>
	//  499 1021:dup             
	//  500 1022:new             #766 <Class LogWriter>
	//  501 1025:dup             
	//  502 1026:ldc2            #544 <String "FragmentManager">
	//  503 1029:invokespecial   #767 <Method void LogWriter(String)>
	//  504 1032:invokespecial   #770 <Method void PrintWriter(java.io.Writer)>
	//  505 1035:astore_2        
					((BackStackRecord) (parcelable)).dump("  ", ((PrintWriter) (fragmentmanagernonconfig)), false);
	//  506 1036:aload_1         
	//  507 1037:ldc2            #772 <String "  ">
	//  508 1040:aload_2         
	//  509 1041:iconst_0        
	//  510 1042:invokevirtual   #1760 <Method void BackStackRecord.dump(String, PrintWriter, boolean)>
					((PrintWriter) (fragmentmanagernonconfig)).close();
	//  511 1045:aload_2         
	//  512 1046:invokevirtual   #1763 <Method void PrintWriter.close()>
				}
				mBackStack.add(((Object) (parcelable)));
	//  513 1049:aload_0         
	//  514 1050:getfield        #787 <Field ArrayList mBackStack>
	//  515 1053:aload_1         
	//  516 1054:invokevirtual   #678 <Method boolean ArrayList.add(Object)>
	//  517 1057:pop             
				if(((BackStackRecord) (parcelable)).mIndex >= 0)
	//* 518 1058:aload_1         
	//* 519 1059:getfield        #461 <Field int BackStackRecord.mIndex>
	//* 520 1062:iflt            1074
					setBackStackIndex(((BackStackRecord) (parcelable)).mIndex, ((BackStackRecord) (parcelable)));
	//  521 1065:aload_0         
	//  522 1066:aload_1         
	//  523 1067:getfield        #461 <Field int BackStackRecord.mIndex>
	//  524 1070:aload_1         
	//  525 1071:invokevirtual   #1767 <Method void setBackStackIndex(int, BackStackRecord)>
			}

	//  526 1074:iload_3         
	//  527 1075:iconst_1        
	//  528 1076:iadd            
	//  529 1077:istore_3        
		} else
	//* 530 1078:goto            926
		{
			mBackStack = null;
	//  531 1081:aload_0         
	//  532 1082:aconst_null     
	//  533 1083:putfield        #787 <Field ArrayList mBackStack>
		}
		if(fragmentmanagerstate.mPrimaryNavActiveIndex >= 0)
	//* 534 1086:aload           9
	//* 535 1088:getfield        #1770 <Field int FragmentManagerState.mPrimaryNavActiveIndex>
	//* 536 1091:iflt            1113
			mPrimaryNav = (Fragment)mActive.get(fragmentmanagerstate.mPrimaryNavActiveIndex);
	//  537 1094:aload_0         
	//  538 1095:aload_0         
	//  539 1096:getfield        #283 <Field SparseArray mActive>
	//  540 1099:aload           9
	//  541 1101:getfield        #1770 <Field int FragmentManagerState.mPrimaryNavActiveIndex>
	//  542 1104:invokevirtual   #1231 <Method Object SparseArray.get(int)>
	//  543 1107:checkcast       #175 <Class Fragment>
	//  544 1110:putfield        #651 <Field Fragment mPrimaryNav>
		mNextFragmentIndex = fragmentmanagerstate.mNextFragmentIndex;
	//  545 1113:aload_0         
	//  546 1114:aload           9
	//  547 1116:getfield        #1771 <Field int FragmentManagerState.mNextFragmentIndex>
	//  548 1119:putfield        #136 <Field int mNextFragmentIndex>
		return;
	//  549 1122:return          
	}

	FragmentManagerNonConfig retainNonConfig()
	{
		setRetaining(mSavedNonConfig);
	//    0    0:aload_0         
	//    1    1:getfield        #1568 <Field FragmentManagerNonConfig mSavedNonConfig>
	//    2    4:invokestatic    #732 <Method void setRetaining(FragmentManagerNonConfig)>
		return mSavedNonConfig;
	//    3    7:aload_0         
	//    4    8:getfield        #1568 <Field FragmentManagerNonConfig mSavedNonConfig>
	//    5   11:areturn         
	}

	Parcelable saveAllState()
	{
		forcePostponedTransactions();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1203 <Method void forcePostponedTransactions()>
		endAnimatingAwayFragments();
	//    2    4:aload_0         
	//    3    5:invokespecial   #1777 <Method void endAnimatingAwayFragments()>
		execPendingActions();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #340 <Method boolean execPendingActions()>
	//    6   12:pop             
		mStateSaved = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #916 <Field boolean mStateSaved>
		FragmentManagerState fragmentmanagerstate = null;
	//   10   18:aconst_null     
	//   11   19:astore          7
		mSavedNonConfig = null;
	//   12   21:aload_0         
	//   13   22:aconst_null     
	//   14   23:putfield        #1568 <Field FragmentManagerNonConfig mSavedNonConfig>
		Object obj = ((Object) (mActive));
	//   15   26:aload_0         
	//   16   27:getfield        #283 <Field SparseArray mActive>
	//   17   30:astore          5
		if(obj != null)
	//*  18   32:aload           5
	//*  19   34:ifnull          861
		{
			if(((SparseArray) (obj)).size() <= 0)
	//*  20   37:aload           5
	//*  21   39:invokevirtual   #286 <Method int SparseArray.size()>
	//*  22   42:ifgt            47
				return null;
	//   23   45:aconst_null     
	//   24   46:areturn         
			int j1 = mActive.size();
	//   25   47:aload_0         
	//   26   48:getfield        #283 <Field SparseArray mActive>
	//   27   51:invokevirtual   #286 <Method int SparseArray.size()>
	//   28   54:istore          4
			FragmentState afragmentstate[] = new FragmentState[j1];
	//   29   56:iload           4
	//   30   58:anewarray       FragmentState[]
	//   31   61:astore          8
			boolean flag1 = false;
	//   32   63:iconst_0        
	//   33   64:istore_3        
			int i = 0;
	//   34   65:iconst_0        
	//   35   66:istore_1        
			boolean flag = false;
	//   36   67:iconst_0        
	//   37   68:istore_2        
			for(; i < j1; i++)
	//*  38   69:iload_1         
	//*  39   70:iload           4
	//*  40   72:icmpge          435
			{
				obj = ((Object) ((Fragment)mActive.valueAt(i)));
	//   41   75:aload_0         
	//   42   76:getfield        #283 <Field SparseArray mActive>
	//   43   79:iload_1         
	//   44   80:invokevirtual   #289 <Method Object SparseArray.valueAt(int)>
	//   45   83:checkcast       #175 <Class Fragment>
	//   46   86:astore          5
				if(obj == null)
					continue;
	//   47   88:aload           5
	//   48   90:ifnull          428
				if(((Fragment) (obj)).mIndex < 0)
	//*  49   93:aload           5
	//*  50   95:getfield        #1308 <Field int Fragment.mIndex>
	//*  51   98:ifge            163
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   52  101:new             #305 <Class StringBuilder>
	//   53  104:dup             
	//   54  105:invokespecial   #306 <Method void StringBuilder()>
	//   55  108:astore          6
					stringbuilder.append("Failure saving state: active ");
	//   56  110:aload           6
	//   57  112:ldc2            #1779 <String "Failure saving state: active ">
	//   58  115:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   59  118:pop             
					stringbuilder.append(obj);
	//   60  119:aload           6
	//   61  121:aload           5
	//   62  123:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//   63  126:pop             
					stringbuilder.append(" has cleared index: ");
	//   64  127:aload           6
	//   65  129:ldc2            #1781 <String " has cleared index: ">
	//   66  132:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   67  135:pop             
					stringbuilder.append(((Fragment) (obj)).mIndex);
	//   68  136:aload           6
	//   69  138:aload           5
	//   70  140:getfield        #1308 <Field int Fragment.mIndex>
	//   71  143:invokevirtual   #841 <Method StringBuilder StringBuilder.append(int)>
	//   72  146:pop             
					throwException(((RuntimeException) (new IllegalStateException(stringbuilder.toString()))));
	//   73  147:aload_0         
	//   74  148:new             #314 <Class IllegalStateException>
	//   75  151:dup             
	//   76  152:aload           6
	//   77  154:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   78  157:invokespecial   #321 <Method void IllegalStateException(String)>
	//   79  160:invokespecial   #1237 <Method void throwException(RuntimeException)>
				}
				FragmentState fragmentstate = new FragmentState(((Fragment) (obj)));
	//   80  163:new             #1713 <Class FragmentState>
	//   81  166:dup             
	//   82  167:aload           5
	//   83  169:invokespecial   #1783 <Method void FragmentState(Fragment)>
	//   84  172:astore          6
				afragmentstate[i] = fragmentstate;
	//   85  174:aload           8
	//   86  176:iload_1         
	//   87  177:aload           6
	//   88  179:aastore         
				if(((Fragment) (obj)).mState > 0 && fragmentstate.mSavedFragmentState == null)
	//*  89  180:aload           5
	//*  90  182:getfield        #178 <Field int Fragment.mState>
	//*  91  185:ifle            352
	//*  92  188:aload           6
	//*  93  190:getfield        #1720 <Field Bundle FragmentState.mSavedFragmentState>
	//*  94  193:ifnonnull       352
				{
					fragmentstate.mSavedFragmentState = saveFragmentBasicState(((Fragment) (obj)));
	//   95  196:aload           6
	//   96  198:aload_0         
	//   97  199:aload           5
	//   98  201:invokevirtual   #1787 <Method Bundle saveFragmentBasicState(Fragment)>
	//   99  204:putfield        #1720 <Field Bundle FragmentState.mSavedFragmentState>
					if(((Fragment) (obj)).mTarget != null)
	//* 100  207:aload           5
	//* 101  209:getfield        #1382 <Field Fragment Fragment.mTarget>
	//* 102  212:ifnull          362
					{
						if(((Fragment) (obj)).mTarget.mIndex < 0)
	//* 103  215:aload           5
	//* 104  217:getfield        #1382 <Field Fragment Fragment.mTarget>
	//* 105  220:getfield        #1308 <Field int Fragment.mIndex>
	//* 106  223:ifge            288
						{
							StringBuilder stringbuilder1 = new StringBuilder();
	//  107  226:new             #305 <Class StringBuilder>
	//  108  229:dup             
	//  109  230:invokespecial   #306 <Method void StringBuilder()>
	//  110  233:astore          9
							stringbuilder1.append("Failure saving state: ");
	//  111  235:aload           9
	//  112  237:ldc2            #1789 <String "Failure saving state: ">
	//  113  240:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  114  243:pop             
							stringbuilder1.append(obj);
	//  115  244:aload           9
	//  116  246:aload           5
	//  117  248:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//  118  251:pop             
							stringbuilder1.append(" has target not in fragment manager: ");
	//  119  252:aload           9
	//  120  254:ldc2            #1791 <String " has target not in fragment manager: ">
	//  121  257:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  122  260:pop             
							stringbuilder1.append(((Object) (((Fragment) (obj)).mTarget)));
	//  123  261:aload           9
	//  124  263:aload           5
	//  125  265:getfield        #1382 <Field Fragment Fragment.mTarget>
	//  126  268:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//  127  271:pop             
							throwException(((RuntimeException) (new IllegalStateException(stringbuilder1.toString()))));
	//  128  272:aload_0         
	//  129  273:new             #314 <Class IllegalStateException>
	//  130  276:dup             
	//  131  277:aload           9
	//  132  279:invokevirtual   #318 <Method String StringBuilder.toString()>
	//  133  282:invokespecial   #321 <Method void IllegalStateException(String)>
	//  134  285:invokespecial   #1237 <Method void throwException(RuntimeException)>
						}
						if(fragmentstate.mSavedFragmentState == null)
	//* 135  288:aload           6
	//* 136  290:getfield        #1720 <Field Bundle FragmentState.mSavedFragmentState>
	//* 137  293:ifnonnull       308
							fragmentstate.mSavedFragmentState = new Bundle();
	//  138  296:aload           6
	//  139  298:new             #1226 <Class Bundle>
	//  140  301:dup             
	//  141  302:invokespecial   #1792 <Method void Bundle()>
	//  142  305:putfield        #1720 <Field Bundle FragmentState.mSavedFragmentState>
						putFragment(fragmentstate.mSavedFragmentState, "android:target_state", ((Fragment) (obj)).mTarget);
	//  143  308:aload_0         
	//  144  309:aload           6
	//  145  311:getfield        #1720 <Field Bundle FragmentState.mSavedFragmentState>
	//  146  314:ldc2            #1377 <String "android:target_state">
	//  147  317:aload           5
	//  148  319:getfield        #1382 <Field Fragment Fragment.mTarget>
	//  149  322:invokevirtual   #1794 <Method void putFragment(Bundle, String, Fragment)>
						if(((Fragment) (obj)).mTargetRequestCode != 0)
	//* 150  325:aload           5
	//* 151  327:getfield        #1387 <Field int Fragment.mTargetRequestCode>
	//* 152  330:ifeq            362
							fragmentstate.mSavedFragmentState.putInt("android:target_req_state", ((Fragment) (obj)).mTargetRequestCode);
	//  153  333:aload           6
	//  154  335:getfield        #1720 <Field Bundle FragmentState.mSavedFragmentState>
	//  155  338:ldc2            #1384 <String "android:target_req_state">
	//  156  341:aload           5
	//  157  343:getfield        #1387 <Field int Fragment.mTargetRequestCode>
	//  158  346:invokevirtual   #1679 <Method void Bundle.putInt(String, int)>
					}
				} else
	//* 159  349:goto            362
				{
					fragmentstate.mSavedFragmentState = ((Fragment) (obj)).mSavedFragmentState;
	//  160  352:aload           6
	//  161  354:aload           5
	//  162  356:getfield        #1179 <Field Bundle Fragment.mSavedFragmentState>
	//  163  359:putfield        #1720 <Field Bundle FragmentState.mSavedFragmentState>
				}
				if(DEBUG)
	//* 164  362:getstatic       #791 <Field boolean DEBUG>
	//* 165  365:ifeq            426
				{
					StringBuilder stringbuilder2 = new StringBuilder();
	//  166  368:new             #305 <Class StringBuilder>
	//  167  371:dup             
	//  168  372:invokespecial   #306 <Method void StringBuilder()>
	//  169  375:astore          9
					stringbuilder2.append("Saved state of ");
	//  170  377:aload           9
	//  171  379:ldc2            #1796 <String "Saved state of ">
	//  172  382:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  173  385:pop             
					stringbuilder2.append(obj);
	//  174  386:aload           9
	//  175  388:aload           5
	//  176  390:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//  177  393:pop             
					stringbuilder2.append(": ");
	//  178  394:aload           9
	//  179  396:ldc2            #1111 <String ": ">
	//  180  399:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  181  402:pop             
					stringbuilder2.append(((Object) (fragmentstate.mSavedFragmentState)));
	//  182  403:aload           9
	//  183  405:aload           6
	//  184  407:getfield        #1720 <Field Bundle FragmentState.mSavedFragmentState>
	//  185  410:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//  186  413:pop             
					Log.v("FragmentManager", stringbuilder2.toString());
	//  187  414:ldc2            #544 <String "FragmentManager">
	//  188  417:aload           9
	//  189  419:invokevirtual   #318 <Method String StringBuilder.toString()>
	//  190  422:invokestatic    #799 <Method int Log.v(String, String)>
	//  191  425:pop             
				}
				flag = true;
	//  192  426:iconst_1        
	//  193  427:istore_2        
			}

	//  194  428:iload_1         
	//  195  429:iconst_1        
	//  196  430:iadd            
	//  197  431:istore_1        
	//* 198  432:goto            69
			if(!flag)
	//* 199  435:iload_2         
	//* 200  436:ifne            457
			{
				if(DEBUG)
	//* 201  439:getstatic       #791 <Field boolean DEBUG>
	//* 202  442:ifeq            455
					Log.v("FragmentManager", "saveAllState: no fragments!");
	//  203  445:ldc2            #544 <String "FragmentManager">
	//  204  448:ldc2            #1798 <String "saveAllState: no fragments!">
	//  205  451:invokestatic    #799 <Method int Log.v(String, String)>
	//  206  454:pop             
				return null;
	//  207  455:aconst_null     
	//  208  456:areturn         
			}
			int l = mAdded.size();
	//  209  457:aload_0         
	//  210  458:getfield        #141 <Field ArrayList mAdded>
	//  211  461:invokevirtual   #169 <Method int ArrayList.size()>
	//  212  464:istore_2        
			int ai[];
			if(l > 0)
	//* 213  465:iload_2         
	//* 214  466:ifle            650
			{
				int ai1[] = new int[l];
	//  215  469:iload_2         
	//  216  470:newarray        int[]
	//  217  472:astore          6
				int j = 0;
	//  218  474:iconst_0        
	//  219  475:istore_1        
				do
				{
					ai = ai1;
	//  220  476:aload           6
	//  221  478:astore          5
					if(j >= l)
						break;
	//  222  480:iload_1         
	//  223  481:iload_2         
	//  224  482:icmpge          653
					ai1[j] = ((Fragment)mAdded.get(j)).mIndex;
	//  225  485:aload           6
	//  226  487:iload_1         
	//  227  488:aload_0         
	//  228  489:getfield        #141 <Field ArrayList mAdded>
	//  229  492:iload_1         
	//  230  493:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//  231  496:checkcast       #175 <Class Fragment>
	//  232  499:getfield        #1308 <Field int Fragment.mIndex>
	//  233  502:iastore         
					if(ai1[j] < 0)
	//* 234  503:aload           6
	//* 235  505:iload_1         
	//* 236  506:iaload          
	//* 237  507:ifge            577
					{
						ai = ((int []) (new StringBuilder()));
	//  238  510:new             #305 <Class StringBuilder>
	//  239  513:dup             
	//  240  514:invokespecial   #306 <Method void StringBuilder()>
	//  241  517:astore          5
						((StringBuilder) (ai)).append("Failure saving state: active ");
	//  242  519:aload           5
	//  243  521:ldc2            #1779 <String "Failure saving state: active ">
	//  244  524:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  245  527:pop             
						((StringBuilder) (ai)).append(mAdded.get(j));
	//  246  528:aload           5
	//  247  530:aload_0         
	//  248  531:getfield        #141 <Field ArrayList mAdded>
	//  249  534:iload_1         
	//  250  535:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//  251  538:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//  252  541:pop             
						((StringBuilder) (ai)).append(" has cleared index: ");
	//  253  542:aload           5
	//  254  544:ldc2            #1781 <String " has cleared index: ">
	//  255  547:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  256  550:pop             
						((StringBuilder) (ai)).append(ai1[j]);
	//  257  551:aload           5
	//  258  553:aload           6
	//  259  555:iload_1         
	//  260  556:iaload          
	//  261  557:invokevirtual   #841 <Method StringBuilder StringBuilder.append(int)>
	//  262  560:pop             
						throwException(((RuntimeException) (new IllegalStateException(((StringBuilder) (ai)).toString()))));
	//  263  561:aload_0         
	//  264  562:new             #314 <Class IllegalStateException>
	//  265  565:dup             
	//  266  566:aload           5
	//  267  568:invokevirtual   #318 <Method String StringBuilder.toString()>
	//  268  571:invokespecial   #321 <Method void IllegalStateException(String)>
	//  269  574:invokespecial   #1237 <Method void throwException(RuntimeException)>
					}
					if(DEBUG)
	//* 270  577:getstatic       #791 <Field boolean DEBUG>
	//* 271  580:ifeq            643
					{
						ai = ((int []) (new StringBuilder()));
	//  272  583:new             #305 <Class StringBuilder>
	//  273  586:dup             
	//  274  587:invokespecial   #306 <Method void StringBuilder()>
	//  275  590:astore          5
						((StringBuilder) (ai)).append("saveAllState: adding fragment #");
	//  276  592:aload           5
	//  277  594:ldc2            #1800 <String "saveAllState: adding fragment #">
	//  278  597:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  279  600:pop             
						((StringBuilder) (ai)).append(j);
	//  280  601:aload           5
	//  281  603:iload_1         
	//  282  604:invokevirtual   #841 <Method StringBuilder StringBuilder.append(int)>
	//  283  607:pop             
						((StringBuilder) (ai)).append(": ");
	//  284  608:aload           5
	//  285  610:ldc2            #1111 <String ": ">
	//  286  613:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  287  616:pop             
						((StringBuilder) (ai)).append(mAdded.get(j));
	//  288  617:aload           5
	//  289  619:aload_0         
	//  290  620:getfield        #141 <Field ArrayList mAdded>
	//  291  623:iload_1         
	//  292  624:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//  293  627:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//  294  630:pop             
						Log.v("FragmentManager", ((StringBuilder) (ai)).toString());
	//  295  631:ldc2            #544 <String "FragmentManager">
	//  296  634:aload           5
	//  297  636:invokevirtual   #318 <Method String StringBuilder.toString()>
	//  298  639:invokestatic    #799 <Method int Log.v(String, String)>
	//  299  642:pop             
					}
					j++;
	//  300  643:iload_1         
	//  301  644:iconst_1        
	//  302  645:iadd            
	//  303  646:istore_1        
				} while(true);
	//  304  647:goto            476
			} else
			{
				ai = null;
	//  305  650:aconst_null     
	//  306  651:astore          5
			}
			ArrayList arraylist = mBackStack;
	//  307  653:aload_0         
	//  308  654:getfield        #787 <Field ArrayList mBackStack>
	//  309  657:astore          9
			BackStackState abackstackstate[] = ((BackStackState []) (fragmentmanagerstate));
	//  310  659:aload           7
	//  311  661:astore          6
			if(arraylist != null)
	//* 312  663:aload           9
	//* 313  665:ifnull          794
			{
				int i1 = arraylist.size();
	//  314  668:aload           9
	//  315  670:invokevirtual   #169 <Method int ArrayList.size()>
	//  316  673:istore_2        
				abackstackstate = ((BackStackState []) (fragmentmanagerstate));
	//  317  674:aload           7
	//  318  676:astore          6
				if(i1 > 0)
	//* 319  678:iload_2         
	//* 320  679:ifle            794
				{
					BackStackState abackstackstate1[] = new BackStackState[i1];
	//  321  682:iload_2         
	//  322  683:anewarray       BackStackState[]
	//  323  686:astore          7
					int k = ((int) (flag1));
	//  324  688:iload_3         
	//  325  689:istore_1        
					do
					{
						abackstackstate = abackstackstate1;
	//  326  690:aload           7
	//  327  692:astore          6
						if(k >= i1)
							break;
	//  328  694:iload_1         
	//  329  695:iload_2         
	//  330  696:icmpge          794
						abackstackstate1[k] = new BackStackState((BackStackRecord)mBackStack.get(k));
	//  331  699:aload           7
	//  332  701:iload_1         
	//  333  702:new             #1748 <Class BackStackState>
	//  334  705:dup             
	//  335  706:aload_0         
	//  336  707:getfield        #787 <Field ArrayList mBackStack>
	//  337  710:iload_1         
	//  338  711:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//  339  714:checkcast       #402 <Class BackStackRecord>
	//  340  717:invokespecial   #1802 <Method void BackStackState(BackStackRecord)>
	//  341  720:aastore         
						if(DEBUG)
	//* 342  721:getstatic       #791 <Field boolean DEBUG>
	//* 343  724:ifeq            787
						{
							abackstackstate = ((BackStackState []) (new StringBuilder()));
	//  344  727:new             #305 <Class StringBuilder>
	//  345  730:dup             
	//  346  731:invokespecial   #306 <Method void StringBuilder()>
	//  347  734:astore          6
							((StringBuilder) (abackstackstate)).append("saveAllState: adding back stack #");
	//  348  736:aload           6
	//  349  738:ldc2            #1804 <String "saveAllState: adding back stack #">
	//  350  741:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  351  744:pop             
							((StringBuilder) (abackstackstate)).append(k);
	//  352  745:aload           6
	//  353  747:iload_1         
	//  354  748:invokevirtual   #841 <Method StringBuilder StringBuilder.append(int)>
	//  355  751:pop             
							((StringBuilder) (abackstackstate)).append(": ");
	//  356  752:aload           6
	//  357  754:ldc2            #1111 <String ": ">
	//  358  757:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  359  760:pop             
							((StringBuilder) (abackstackstate)).append(mBackStack.get(k));
	//  360  761:aload           6
	//  361  763:aload_0         
	//  362  764:getfield        #787 <Field ArrayList mBackStack>
	//  363  767:iload_1         
	//  364  768:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//  365  771:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//  366  774:pop             
							Log.v("FragmentManager", ((StringBuilder) (abackstackstate)).toString());
	//  367  775:ldc2            #544 <String "FragmentManager">
	//  368  778:aload           6
	//  369  780:invokevirtual   #318 <Method String StringBuilder.toString()>
	//  370  783:invokestatic    #799 <Method int Log.v(String, String)>
	//  371  786:pop             
						}
						k++;
	//  372  787:iload_1         
	//  373  788:iconst_1        
	//  374  789:iadd            
	//  375  790:istore_1        
					} while(true);
	//  376  791:goto            690
				}
			}
			abackstackstate1 = ((BackStackState []) (new FragmentManagerState()));
	//  377  794:new             #1703 <Class FragmentManagerState>
	//  378  797:dup             
	//  379  798:invokespecial   #1805 <Method void FragmentManagerState()>
	//  380  801:astore          7
			abackstackstate1.mActive = afragmentstate;
	//  381  803:aload           7
	//  382  805:aload           8
	//  383  807:putfield        #1706 <Field FragmentState[] FragmentManagerState.mActive>
			abackstackstate1.mAdded = ai;
	//  384  810:aload           7
	//  385  812:aload           5
	//  386  814:putfield        #1737 <Field int[] FragmentManagerState.mAdded>
			abackstackstate1.mBackStack = abackstackstate;
	//  387  817:aload           7
	//  388  819:aload           6
	//  389  821:putfield        #1746 <Field BackStackState[] FragmentManagerState.mBackStack>
			ai = ((int []) (mPrimaryNav));
	//  390  824:aload_0         
	//  391  825:getfield        #651 <Field Fragment mPrimaryNav>
	//  392  828:astore          5
			if(ai != null)
	//* 393  830:aload           5
	//* 394  832:ifnull          845
				abackstackstate1.mPrimaryNavActiveIndex = ((Fragment) (ai)).mIndex;
	//  395  835:aload           7
	//  396  837:aload           5
	//  397  839:getfield        #1308 <Field int Fragment.mIndex>
	//  398  842:putfield        #1770 <Field int FragmentManagerState.mPrimaryNavActiveIndex>
			abackstackstate1.mNextFragmentIndex = mNextFragmentIndex;
	//  399  845:aload           7
	//  400  847:aload_0         
	//  401  848:getfield        #136 <Field int mNextFragmentIndex>
	//  402  851:putfield        #1771 <Field int FragmentManagerState.mNextFragmentIndex>
			saveNonConfig();
	//  403  854:aload_0         
	//  404  855:invokevirtual   #1808 <Method void saveNonConfig()>
			return ((Parcelable) (abackstackstate1));
	//  405  858:aload           7
	//  406  860:areturn         
		} else
		{
			return null;
	//  407  861:aconst_null     
	//  408  862:areturn         
		}
	}

	Bundle saveFragmentBasicState(Fragment fragment)
	{
		if(mStateBundle == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field Bundle mStateBundle>
	//*   2    4:ifnonnull       18
			mStateBundle = new Bundle();
	//    3    7:aload_0         
	//    4    8:new             #1226 <Class Bundle>
	//    5   11:dup             
	//    6   12:invokespecial   #1792 <Method void Bundle()>
	//    7   15:putfield        #150 <Field Bundle mStateBundle>
		fragment.performSaveInstanceState(mStateBundle);
	//    8   18:aload_1         
	//    9   19:aload_0         
	//   10   20:getfield        #150 <Field Bundle mStateBundle>
	//   11   23:invokevirtual   #1811 <Method void Fragment.performSaveInstanceState(Bundle)>
		dispatchOnFragmentSaveInstanceState(fragment, mStateBundle, false);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #150 <Field Bundle mStateBundle>
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #1028 <Method void dispatchOnFragmentSaveInstanceState(Fragment, Bundle, boolean)>
		Bundle bundle1;
		if(!mStateBundle.isEmpty())
	//*  18   36:aload_0         
	//*  19   37:getfield        #150 <Field Bundle mStateBundle>
	//*  20   40:invokevirtual   #1812 <Method boolean Bundle.isEmpty()>
	//*  21   43:ifne            59
		{
			bundle1 = mStateBundle;
	//   22   46:aload_0         
	//   23   47:getfield        #150 <Field Bundle mStateBundle>
	//   24   50:astore_3        
			mStateBundle = null;
	//   25   51:aload_0         
	//   26   52:aconst_null     
	//   27   53:putfield        #150 <Field Bundle mStateBundle>
		} else
	//*  28   56:goto            61
		{
			bundle1 = null;
	//   29   59:aconst_null     
	//   30   60:astore_3        
		}
		if(fragment.mView != null)
	//*  31   61:aload_1         
	//*  32   62:getfield        #192 <Field View Fragment.mView>
	//*  33   65:ifnull          73
			saveFragmentViewState(fragment);
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:invokevirtual   #1519 <Method void saveFragmentViewState(Fragment)>
		Bundle bundle = bundle1;
	//   37   73:aload_3         
	//   38   74:astore_2        
		if(fragment.mSavedViewState != null)
	//*  39   75:aload_1         
	//*  40   76:getfield        #1375 <Field SparseArray Fragment.mSavedViewState>
	//*  41   79:ifnull          107
		{
			bundle = bundle1;
	//   42   82:aload_3         
	//   43   83:astore_2        
			if(bundle1 == null)
	//*  44   84:aload_3         
	//*  45   85:ifnonnull       96
				bundle = new Bundle();
	//   46   88:new             #1226 <Class Bundle>
	//   47   91:dup             
	//   48   92:invokespecial   #1792 <Method void Bundle()>
	//   49   95:astore_2        
			bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
	//   50   96:aload_2         
	//   51   97:ldc2            #1368 <String "android:view_state">
	//   52  100:aload_1         
	//   53  101:getfield        #1375 <Field SparseArray Fragment.mSavedViewState>
	//   54  104:invokevirtual   #1816 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
		}
		bundle1 = bundle;
	//   55  107:aload_2         
	//   56  108:astore_3        
		if(!fragment.mUserVisibleHint)
	//*  57  109:aload_1         
	//*  58  110:getfield        #1394 <Field boolean Fragment.mUserVisibleHint>
	//*  59  113:ifne            141
		{
			bundle1 = bundle;
	//   60  116:aload_2         
	//   61  117:astore_3        
			if(bundle == null)
	//*  62  118:aload_2         
	//*  63  119:ifnonnull       130
				bundle1 = new Bundle();
	//   64  122:new             #1226 <Class Bundle>
	//   65  125:dup             
	//   66  126:invokespecial   #1792 <Method void Bundle()>
	//   67  129:astore_3        
			bundle1.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
	//   68  130:aload_3         
	//   69  131:ldc2            #1396 <String "android:user_visible_hint">
	//   70  134:aload_1         
	//   71  135:getfield        #1394 <Field boolean Fragment.mUserVisibleHint>
	//   72  138:invokevirtual   #1820 <Method void Bundle.putBoolean(String, boolean)>
		}
		return bundle1;
	//   73  141:aload_3         
	//   74  142:areturn         
	}

	void saveFragmentViewState(Fragment fragment)
	{
		if(fragment.mInnerView == null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1190 <Field View Fragment.mInnerView>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		SparseArray sparsearray = mStateArray;
	//    4    8:aload_0         
	//    5    9:getfield        #152 <Field SparseArray mStateArray>
	//    6   12:astore_2        
		if(sparsearray == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       31
			mStateArray = new SparseArray();
	//    9   17:aload_0         
	//   10   18:new             #285 <Class SparseArray>
	//   11   21:dup             
	//   12   22:invokespecial   #1313 <Method void SparseArray()>
	//   13   25:putfield        #152 <Field SparseArray mStateArray>
		else
	//*  14   28:goto            35
			sparsearray.clear();
	//   15   31:aload_2         
	//   16   32:invokevirtual   #1821 <Method void SparseArray.clear()>
		fragment.mInnerView.saveHierarchyState(mStateArray);
	//   17   35:aload_1         
	//   18   36:getfield        #1190 <Field View Fragment.mInnerView>
	//   19   39:aload_0         
	//   20   40:getfield        #152 <Field SparseArray mStateArray>
	//   21   43:invokevirtual   #1825 <Method void View.saveHierarchyState(SparseArray)>
		if(mStateArray.size() > 0)
	//*  22   46:aload_0         
	//*  23   47:getfield        #152 <Field SparseArray mStateArray>
	//*  24   50:invokevirtual   #286 <Method int SparseArray.size()>
	//*  25   53:ifle            69
		{
			fragment.mSavedViewState = mStateArray;
	//   26   56:aload_1         
	//   27   57:aload_0         
	//   28   58:getfield        #152 <Field SparseArray mStateArray>
	//   29   61:putfield        #1375 <Field SparseArray Fragment.mSavedViewState>
			mStateArray = null;
	//   30   64:aload_0         
	//   31   65:aconst_null     
	//   32   66:putfield        #152 <Field SparseArray mStateArray>
		}
	//   33   69:return          
	}

	void saveNonConfig()
	{
		Object obj1;
		Object obj2;
		ArrayList arraylist3;
		if(mActive != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #283 <Field SparseArray mActive>
	//*   2    4:ifnull          401
		{
			Object obj = null;
	//    3    7:aconst_null     
	//    4    8:astore_3        
			ArrayList arraylist2 = ((ArrayList) (obj));
	//    5    9:aload_3         
	//    6   10:astore          5
			ArrayList arraylist1 = arraylist2;
	//    7   12:aload           5
	//    8   14:astore          4
			int i = 0;
	//    9   16:iconst_0        
	//   10   17:istore_1        
			do
			{
				arraylist3 = ((ArrayList) (obj));
	//   11   18:aload_3         
	//   12   19:astore          8
				obj2 = ((Object) (arraylist2));
	//   13   21:aload           5
	//   14   23:astore          7
				obj1 = ((Object) (arraylist1));
	//   15   25:aload           4
	//   16   27:astore          6
				if(i >= mActive.size())
					break;
	//   17   29:iload_1         
	//   18   30:aload_0         
	//   19   31:getfield        #283 <Field SparseArray mActive>
	//   20   34:invokevirtual   #286 <Method int SparseArray.size()>
	//   21   37:icmpge          413
				Fragment fragment = (Fragment)mActive.valueAt(i);
	//   22   40:aload_0         
	//   23   41:getfield        #283 <Field SparseArray mActive>
	//   24   44:iload_1         
	//   25   45:invokevirtual   #289 <Method Object SparseArray.valueAt(int)>
	//   26   48:checkcast       #175 <Class Fragment>
	//   27   51:astore          10
				obj2 = obj;
	//   28   53:aload_3         
	//   29   54:astore          7
				arraylist3 = arraylist2;
	//   30   56:aload           5
	//   31   58:astore          8
				ArrayList arraylist4 = arraylist1;
	//   32   60:aload           4
	//   33   62:astore          9
				if(fragment != null)
	//*  34   64:aload           10
	//*  35   66:ifnull          383
				{
					obj1 = obj;
	//   36   69:aload_3         
	//   37   70:astore          6
					if(fragment.mRetainInstance)
	//*  38   72:aload           10
	//*  39   74:getfield        #1828 <Field boolean Fragment.mRetainInstance>
	//*  40   77:ifeq            180
					{
						obj2 = obj;
	//   41   80:aload_3         
	//   42   81:astore          7
						if(obj == null)
	//*  43   83:aload_3         
	//*  44   84:ifnonnull       96
							obj2 = ((Object) (new ArrayList()));
	//   45   87:new             #138 <Class ArrayList>
	//   46   90:dup             
	//   47   91:invokespecial   #139 <Method void ArrayList()>
	//   48   94:astore          7
						((ArrayList) (obj2)).add(((Object) (fragment)));
	//   49   96:aload           7
	//   50   98:aload           10
	//   51  100:invokevirtual   #678 <Method boolean ArrayList.add(Object)>
	//   52  103:pop             
						int j;
						if(fragment.mTarget != null)
	//*  53  104:aload           10
	//*  54  106:getfield        #1382 <Field Fragment Fragment.mTarget>
	//*  55  109:ifnull          124
							j = fragment.mTarget.mIndex;
	//   56  112:aload           10
	//   57  114:getfield        #1382 <Field Fragment Fragment.mTarget>
	//   58  117:getfield        #1308 <Field int Fragment.mIndex>
	//   59  120:istore_2        
						else
	//*  60  121:goto            126
							j = -1;
	//   61  124:iconst_m1       
	//   62  125:istore_2        
						fragment.mTargetIndex = j;
	//   63  126:aload           10
	//   64  128:iload_2         
	//   65  129:putfield        #1731 <Field int Fragment.mTargetIndex>
						obj1 = obj2;
	//   66  132:aload           7
	//   67  134:astore          6
						if(DEBUG)
	//*  68  136:getstatic       #791 <Field boolean DEBUG>
	//*  69  139:ifeq            180
						{
							obj = ((Object) (new StringBuilder()));
	//   70  142:new             #305 <Class StringBuilder>
	//   71  145:dup             
	//   72  146:invokespecial   #306 <Method void StringBuilder()>
	//   73  149:astore_3        
							((StringBuilder) (obj)).append("retainNonConfig: keeping retained ");
	//   74  150:aload_3         
	//   75  151:ldc2            #1830 <String "retainNonConfig: keeping retained ">
	//   76  154:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   77  157:pop             
							((StringBuilder) (obj)).append(((Object) (fragment)));
	//   78  158:aload_3         
	//   79  159:aload           10
	//   80  161:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//   81  164:pop             
							Log.v("FragmentManager", ((StringBuilder) (obj)).toString());
	//   82  165:ldc2            #544 <String "FragmentManager">
	//   83  168:aload_3         
	//   84  169:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   85  172:invokestatic    #799 <Method int Log.v(String, String)>
	//   86  175:pop             
							obj1 = obj2;
	//   87  176:aload           7
	//   88  178:astore          6
						}
					}
					if(fragment.mChildFragmentManager != null)
	//*  89  180:aload           10
	//*  90  182:getfield        #1408 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
	//*  91  185:ifnull          209
					{
						fragment.mChildFragmentManager.saveNonConfig();
	//   92  188:aload           10
	//   93  190:getfield        #1408 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
	//   94  193:invokevirtual   #1808 <Method void saveNonConfig()>
						obj2 = ((Object) (fragment.mChildFragmentManager.mSavedNonConfig));
	//   95  196:aload           10
	//   96  198:getfield        #1408 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
	//   97  201:getfield        #1568 <Field FragmentManagerNonConfig mSavedNonConfig>
	//   98  204:astore          7
					} else
	//*  99  206:goto            216
					{
						obj2 = ((Object) (fragment.mChildNonConfig));
	//  100  209:aload           10
	//  101  211:getfield        #1833 <Field FragmentManagerNonConfig Fragment.mChildNonConfig>
	//  102  214:astore          7
					}
					obj = ((Object) (arraylist2));
	//  103  216:aload           5
	//  104  218:astore_3        
					if(arraylist2 == null)
	//* 105  219:aload           5
	//* 106  221:ifnonnull       272
					{
						obj = ((Object) (arraylist2));
	//  107  224:aload           5
	//  108  226:astore_3        
						if(obj2 != null)
	//* 109  227:aload           7
	//* 110  229:ifnull          272
						{
							arraylist2 = new ArrayList(mActive.size());
	//  111  232:new             #138 <Class ArrayList>
	//  112  235:dup             
	//  113  236:aload_0         
	//  114  237:getfield        #283 <Field SparseArray mActive>
	//  115  240:invokevirtual   #286 <Method int SparseArray.size()>
	//  116  243:invokespecial   #873 <Method void ArrayList(int)>
	//  117  246:astore          5
							int k = 0;
	//  118  248:iconst_0        
	//  119  249:istore_2        
							do
							{
								obj = ((Object) (arraylist2));
	//  120  250:aload           5
	//  121  252:astore_3        
								if(k >= i)
									break;
	//  122  253:iload_2         
	//  123  254:iload_1         
	//  124  255:icmpge          272
								arraylist2.add(((Object) (null)));
	//  125  258:aload           5
	//  126  260:aconst_null     
	//  127  261:invokevirtual   #678 <Method boolean ArrayList.add(Object)>
	//  128  264:pop             
								k++;
	//  129  265:iload_2         
	//  130  266:iconst_1        
	//  131  267:iadd            
	//  132  268:istore_2        
							} while(true);
	//  133  269:goto            250
						}
					}
					if(obj != null)
	//* 134  272:aload_3         
	//* 135  273:ifnull          283
						((ArrayList) (obj)).add(obj2);
	//  136  276:aload_3         
	//  137  277:aload           7
	//  138  279:invokevirtual   #678 <Method boolean ArrayList.add(Object)>
	//  139  282:pop             
					arraylist2 = arraylist1;
	//  140  283:aload           4
	//  141  285:astore          5
					if(arraylist1 == null)
	//* 142  287:aload           4
	//* 143  289:ifnonnull       345
					{
						arraylist2 = arraylist1;
	//  144  292:aload           4
	//  145  294:astore          5
						if(fragment.mViewModelStore != null)
	//* 146  296:aload           10
	//* 147  298:getfield        #1837 <Field ViewModelStore Fragment.mViewModelStore>
	//* 148  301:ifnull          345
						{
							arraylist1 = new ArrayList(mActive.size());
	//  149  304:new             #138 <Class ArrayList>
	//  150  307:dup             
	//  151  308:aload_0         
	//  152  309:getfield        #283 <Field SparseArray mActive>
	//  153  312:invokevirtual   #286 <Method int SparseArray.size()>
	//  154  315:invokespecial   #873 <Method void ArrayList(int)>
	//  155  318:astore          4
							int l = 0;
	//  156  320:iconst_0        
	//  157  321:istore_2        
							do
							{
								arraylist2 = arraylist1;
	//  158  322:aload           4
	//  159  324:astore          5
								if(l >= i)
									break;
	//  160  326:iload_2         
	//  161  327:iload_1         
	//  162  328:icmpge          345
								arraylist1.add(((Object) (null)));
	//  163  331:aload           4
	//  164  333:aconst_null     
	//  165  334:invokevirtual   #678 <Method boolean ArrayList.add(Object)>
	//  166  337:pop             
								l++;
	//  167  338:iload_2         
	//  168  339:iconst_1        
	//  169  340:iadd            
	//  170  341:istore_2        
							} while(true);
	//  171  342:goto            322
						}
					}
					obj2 = obj1;
	//  172  345:aload           6
	//  173  347:astore          7
					arraylist3 = ((ArrayList) (obj));
	//  174  349:aload_3         
	//  175  350:astore          8
					arraylist4 = arraylist2;
	//  176  352:aload           5
	//  177  354:astore          9
					if(arraylist2 != null)
	//* 178  356:aload           5
	//* 179  358:ifnull          383
					{
						arraylist2.add(((Object) (fragment.mViewModelStore)));
	//  180  361:aload           5
	//  181  363:aload           10
	//  182  365:getfield        #1837 <Field ViewModelStore Fragment.mViewModelStore>
	//  183  368:invokevirtual   #678 <Method boolean ArrayList.add(Object)>
	//  184  371:pop             
						arraylist4 = arraylist2;
	//  185  372:aload           5
	//  186  374:astore          9
						arraylist3 = ((ArrayList) (obj));
	//  187  376:aload_3         
	//  188  377:astore          8
						obj2 = obj1;
	//  189  379:aload           6
	//  190  381:astore          7
					}
				}
				i++;
	//  191  383:iload_1         
	//  192  384:iconst_1        
	//  193  385:iadd            
	//  194  386:istore_1        
				obj = obj2;
	//  195  387:aload           7
	//  196  389:astore_3        
				arraylist2 = arraylist3;
	//  197  390:aload           8
	//  198  392:astore          5
				arraylist1 = arraylist4;
	//  199  394:aload           9
	//  200  396:astore          4
			} while(true);
	//  201  398:goto            18
		} else
		{
			arraylist3 = null;
	//  202  401:aconst_null     
	//  203  402:astore          8
			ArrayList arraylist = arraylist3;
	//  204  404:aload           8
	//  205  406:astore_3        
			obj1 = ((Object) (arraylist));
	//  206  407:aload_3         
	//  207  408:astore          6
			obj2 = ((Object) (arraylist));
	//  208  410:aload_3         
	//  209  411:astore          7
		}
		if(arraylist3 == null && obj2 == null && obj1 == null)
	//* 210  413:aload           8
	//* 211  415:ifnonnull       434
	//* 212  418:aload           7
	//* 213  420:ifnonnull       434
	//* 214  423:aload           6
	//* 215  425:ifnonnull       434
		{
			mSavedNonConfig = null;
	//  216  428:aload_0         
	//  217  429:aconst_null     
	//  218  430:putfield        #1568 <Field FragmentManagerNonConfig mSavedNonConfig>
			return;
	//  219  433:return          
		} else
		{
			mSavedNonConfig = new FragmentManagerNonConfig(((List) (arraylist3)), ((List) (obj2)), ((List) (obj1)));
	//  220  434:aload_0         
	//  221  435:new             #708 <Class FragmentManagerNonConfig>
	//  222  438:dup             
	//  223  439:aload           8
	//  224  441:aload           7
	//  225  443:aload           6
	//  226  445:invokespecial   #1840 <Method void FragmentManagerNonConfig(List, List, List)>
	//  227  448:putfield        #1568 <Field FragmentManagerNonConfig mSavedNonConfig>
			return;
	//  228  451:return          
		}
	}

	void scheduleCommit()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ArrayList arraylist = mPostponedTransactions;
	//    2    2:aload_0         
	//    3    3:getfield        #472 <Field ArrayList mPostponedTransactions>
	//    4    6:astore          4
		boolean flag2 = false;
	//    5    8:iconst_0        
	//    6    9:istore_3        
		if(arraylist == null) goto _L2; else goto _L1
	//    7   10:aload           4
	//    8   12:ifnull          96
_L1:
		if(mPostponedTransactions.isEmpty()) goto _L2; else goto _L3
	//    9   15:aload_0         
	//   10   16:getfield        #472 <Field ArrayList mPostponedTransactions>
	//   11   19:invokevirtual   #506 <Method boolean ArrayList.isEmpty()>
	//   12   22:ifne            96
_L3:
		boolean flag = true;
	//   13   25:iconst_1        
	//   14   26:istore_1        
	//*  15   27:goto            30
_L6:
		boolean flag1 = flag2;
	//   16   30:iload_3         
	//   17   31:istore_2        
		if(mPendingActions == null) goto _L5; else goto _L4
	//   18   32:aload_0         
	//   19   33:getfield        #510 <Field ArrayList mPendingActions>
	//   20   36:ifnull          101
_L4:
		flag1 = flag2;
	//   21   39:iload_3         
	//   22   40:istore_2        
		if(mPendingActions.size() == 1)
	//*  23   41:aload_0         
	//*  24   42:getfield        #510 <Field ArrayList mPendingActions>
	//*  25   45:invokevirtual   #169 <Method int ArrayList.size()>
	//*  26   48:iconst_1        
	//*  27   49:icmpne          101
			flag1 = true;
	//   28   52:iconst_1        
	//   29   53:istore_2        
		  goto _L5
	//*  30   54:goto            101
_L7:
		mHost.getHandler().removeCallbacks(mExecCommit);
	//   31   57:aload_0         
	//   32   58:getfield        #369 <Field FragmentHostCallback mHost>
	//   33   61:invokevirtual   #381 <Method Handler FragmentHostCallback.getHandler()>
	//   34   64:aload_0         
	//   35   65:getfield        #157 <Field Runnable mExecCommit>
	//   36   68:invokevirtual   #517 <Method void Handler.removeCallbacks(Runnable)>
		mHost.getHandler().post(mExecCommit);
	//   37   71:aload_0         
	//   38   72:getfield        #369 <Field FragmentHostCallback mHost>
	//   39   75:invokevirtual   #381 <Method Handler FragmentHostCallback.getHandler()>
	//   40   78:aload_0         
	//   41   79:getfield        #157 <Field Runnable mExecCommit>
	//   42   82:invokevirtual   #1844 <Method boolean Handler.post(Runnable)>
	//   43   85:pop             
_L8:
		this;
	//   44   86:aload_0         
		JVM INSTR monitorexit ;
	//   45   87:monitorexit     
		return;
	//   46   88:return          
		Exception exception;
		exception;
	//   47   89:astore          4
		this;
	//   48   91:aload_0         
		JVM INSTR monitorexit ;
	//   49   92:monitorexit     
		throw exception;
	//   50   93:aload           4
	//   51   95:athrow          
_L2:
		flag = false;
	//   52   96:iconst_0        
	//   53   97:istore_1        
		  goto _L6
	//*  54   98:goto            30
_L5:
		if(!flag && !flag1) goto _L8; else goto _L7
	//   55  101:iload_1         
	//   56  102:ifne            57
	//   57  105:iload_2         
	//   58  106:ifeq            86
	//*  59  109:goto            57
	}

	public void setBackStackIndex(int i, BackStackRecord backstackrecord)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int k;
		if(mBackStackIndices == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #845 <Field ArrayList mBackStackIndices>
	//*   4    6:ifnonnull       20
			mBackStackIndices = new ArrayList();
	//    5    9:aload_0         
	//    6   10:new             #138 <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #139 <Method void ArrayList()>
	//    9   17:putfield        #845 <Field ArrayList mBackStackIndices>
		k = mBackStackIndices.size();
	//   10   20:aload_0         
	//   11   21:getfield        #845 <Field ArrayList mBackStackIndices>
	//   12   24:invokevirtual   #169 <Method int ArrayList.size()>
	//   13   27:istore          4
		int j;
		j = k;
	//   14   29:iload           4
	//   15   31:istore_3        
		if(i >= k)
			break MISSING_BLOCK_LABEL_110;
	//   16   32:iload_1         
	//   17   33:iload           4
	//   18   35:icmpge          110
		if(DEBUG)
	//*  19   38:getstatic       #791 <Field boolean DEBUG>
	//*  20   41:ifeq            97
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   21   44:new             #305 <Class StringBuilder>
	//   22   47:dup             
	//   23   48:invokespecial   #306 <Method void StringBuilder()>
	//   24   51:astore          5
			stringbuilder.append("Setting back stack index ");
	//   25   53:aload           5
	//   26   55:ldc2            #851 <String "Setting back stack index ">
	//   27   58:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   28   61:pop             
			stringbuilder.append(i);
	//   29   62:aload           5
	//   30   64:iload_1         
	//   31   65:invokevirtual   #841 <Method StringBuilder StringBuilder.append(int)>
	//   32   68:pop             
			stringbuilder.append(" to ");
	//   33   69:aload           5
	//   34   71:ldc2            #853 <String " to ">
	//   35   74:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   36   77:pop             
			stringbuilder.append(((Object) (backstackrecord)));
	//   37   78:aload           5
	//   38   80:aload_2         
	//   39   81:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//   40   84:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   41   85:ldc2            #544 <String "FragmentManager">
	//   42   88:aload           5
	//   43   90:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   44   93:invokestatic    #799 <Method int Log.v(String, String)>
	//   45   96:pop             
		}
		mBackStackIndices.set(i, ((Object) (backstackrecord)));
	//   46   97:aload_0         
	//   47   98:getfield        #845 <Field ArrayList mBackStackIndices>
	//   48  101:iload_1         
	//   49  102:aload_2         
	//   50  103:invokevirtual   #849 <Method Object ArrayList.set(int, Object)>
	//   51  106:pop             
		break MISSING_BLOCK_LABEL_272;
	//   52  107:goto            272
_L2:
		if(j >= i)
			break; /* Loop/switch isn't completed */
	//   53  110:iload_3         
	//   54  111:iload_1         
	//   55  112:icmpge          204
		mBackStackIndices.add(((Object) (null)));
	//   56  115:aload_0         
	//   57  116:getfield        #845 <Field ArrayList mBackStackIndices>
	//   58  119:aconst_null     
	//   59  120:invokevirtual   #678 <Method boolean ArrayList.add(Object)>
	//   60  123:pop             
		if(mAvailBackStackIndices == null)
	//*  61  124:aload_0         
	//*  62  125:getfield        #831 <Field ArrayList mAvailBackStackIndices>
	//*  63  128:ifnonnull       142
			mAvailBackStackIndices = new ArrayList();
	//   64  131:aload_0         
	//   65  132:new             #138 <Class ArrayList>
	//   66  135:dup             
	//   67  136:invokespecial   #139 <Method void ArrayList()>
	//   68  139:putfield        #831 <Field ArrayList mAvailBackStackIndices>
		if(DEBUG)
	//*  69  142:getstatic       #791 <Field boolean DEBUG>
	//*  70  145:ifeq            185
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   71  148:new             #305 <Class StringBuilder>
	//   72  151:dup             
	//   73  152:invokespecial   #306 <Method void StringBuilder()>
	//   74  155:astore          5
			stringbuilder1.append("Adding available back stack index ");
	//   75  157:aload           5
	//   76  159:ldc2            #1846 <String "Adding available back stack index ">
	//   77  162:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   78  165:pop             
			stringbuilder1.append(j);
	//   79  166:aload           5
	//   80  168:iload_3         
	//   81  169:invokevirtual   #841 <Method StringBuilder StringBuilder.append(int)>
	//   82  172:pop             
			Log.v("FragmentManager", stringbuilder1.toString());
	//   83  173:ldc2            #544 <String "FragmentManager">
	//   84  176:aload           5
	//   85  178:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   86  181:invokestatic    #799 <Method int Log.v(String, String)>
	//   87  184:pop             
		}
		mAvailBackStackIndices.add(((Object) (Integer.valueOf(j))));
	//   88  185:aload_0         
	//   89  186:getfield        #831 <Field ArrayList mAvailBackStackIndices>
	//   90  189:iload_3         
	//   91  190:invokestatic    #1222 <Method Integer Integer.valueOf(int)>
	//   92  193:invokevirtual   #678 <Method boolean ArrayList.add(Object)>
	//   93  196:pop             
		j++;
	//   94  197:iload_3         
	//   95  198:iconst_1        
	//   96  199:iadd            
	//   97  200:istore_3        
		if(true) goto _L2; else goto _L1
	//   98  201:goto            110
_L1:
		if(DEBUG)
	//*  99  204:getstatic       #791 <Field boolean DEBUG>
	//* 100  207:ifeq            263
		{
			StringBuilder stringbuilder2 = new StringBuilder();
	//  101  210:new             #305 <Class StringBuilder>
	//  102  213:dup             
	//  103  214:invokespecial   #306 <Method void StringBuilder()>
	//  104  217:astore          5
			stringbuilder2.append("Adding back stack index ");
	//  105  219:aload           5
	//  106  221:ldc2            #838 <String "Adding back stack index ">
	//  107  224:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  108  227:pop             
			stringbuilder2.append(i);
	//  109  228:aload           5
	//  110  230:iload_1         
	//  111  231:invokevirtual   #841 <Method StringBuilder StringBuilder.append(int)>
	//  112  234:pop             
			stringbuilder2.append(" with ");
	//  113  235:aload           5
	//  114  237:ldc2            #843 <String " with ">
	//  115  240:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//  116  243:pop             
			stringbuilder2.append(((Object) (backstackrecord)));
	//  117  244:aload           5
	//  118  246:aload_2         
	//  119  247:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//  120  250:pop             
			Log.v("FragmentManager", stringbuilder2.toString());
	//  121  251:ldc2            #544 <String "FragmentManager">
	//  122  254:aload           5
	//  123  256:invokevirtual   #318 <Method String StringBuilder.toString()>
	//  124  259:invokestatic    #799 <Method int Log.v(String, String)>
	//  125  262:pop             
		}
		mBackStackIndices.add(((Object) (backstackrecord)));
	//  126  263:aload_0         
	//  127  264:getfield        #845 <Field ArrayList mBackStackIndices>
	//  128  267:aload_2         
	//  129  268:invokevirtual   #678 <Method boolean ArrayList.add(Object)>
	//  130  271:pop             
		this;
	//  131  272:aload_0         
		JVM INSTR monitorexit ;
	//  132  273:monitorexit     
		return;
	//  133  274:return          
		backstackrecord;
	//  134  275:astore_2        
		this;
	//  135  276:aload_0         
		JVM INSTR monitorexit ;
	//  136  277:monitorexit     
		throw backstackrecord;
	//  137  278:aload_2         
	//  138  279:athrow          
	}

	public void setPrimaryNavigationFragment(Fragment fragment)
	{
		if(fragment != null && (mActive.get(fragment.mIndex) != fragment || fragment.mHost != null && fragment.getFragmentManager() != this))
	//*   0    0:aload_1         
	//*   1    1:ifnull          85
	//*   2    4:aload_0         
	//*   3    5:getfield        #283 <Field SparseArray mActive>
	//*   4    8:aload_1         
	//*   5    9:getfield        #1308 <Field int Fragment.mIndex>
	//*   6   12:invokevirtual   #1231 <Method Object SparseArray.get(int)>
	//*   7   15:aload_1         
	//*   8   16:if_acmpne       37
	//*   9   19:aload_1         
	//*  10   20:getfield        #1401 <Field FragmentHostCallback Fragment.mHost>
	//*  11   23:ifnull          85
	//*  12   26:aload_1         
	//*  13   27:invokevirtual   #958 <Method FragmentManager Fragment.getFragmentManager()>
	//*  14   30:aload_0         
	//*  15   31:if_acmpne       37
	//*  16   34:goto            85
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   17   37:new             #305 <Class StringBuilder>
	//   18   40:dup             
	//   19   41:invokespecial   #306 <Method void StringBuilder()>
	//   20   44:astore_2        
			stringbuilder.append("Fragment ");
	//   21   45:aload_2         
	//   22   46:ldc2            #1417 <String "Fragment ">
	//   23   49:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   24   52:pop             
			stringbuilder.append(((Object) (fragment)));
	//   25   53:aload_2         
	//   26   54:aload_1         
	//   27   55:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//   28   58:pop             
			stringbuilder.append(" is not an active fragment of FragmentManager ");
	//   29   59:aload_2         
	//   30   60:ldc2            #1849 <String " is not an active fragment of FragmentManager ">
	//   31   63:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   32   66:pop             
			stringbuilder.append(((Object) (this)));
	//   33   67:aload_2         
	//   34   68:aload_0         
	//   35   69:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//   36   72:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   37   73:new             #1457 <Class IllegalArgumentException>
	//   38   76:dup             
	//   39   77:aload_2         
	//   40   78:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   41   81:invokespecial   #1458 <Method void IllegalArgumentException(String)>
	//   42   84:athrow          
		} else
		{
			mPrimaryNav = fragment;
	//   43   85:aload_0         
	//   44   86:aload_1         
	//   45   87:putfield        #651 <Field Fragment mPrimaryNav>
			return;
	//   46   90:return          
		}
	}

	public void showFragment(Fragment fragment)
	{
		if(DEBUG)
	//*   0    0:getstatic       #791 <Field boolean DEBUG>
	//*   1    3:ifeq            39
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #305 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #306 <Method void StringBuilder()>
	//    5   13:astore_2        
			stringbuilder.append("show: ");
	//    6   14:aload_2         
	//    7   15:ldc2            #1852 <String "show: ">
	//    8   18:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (fragment)));
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #796 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   14   28:ldc2            #544 <String "FragmentManager">
	//   15   31:aload_2         
	//   16   32:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   17   35:invokestatic    #799 <Method int Log.v(String, String)>
	//   18   38:pop             
		}
		if(fragment.mHidden)
	//*  19   39:aload_1         
	//*  20   40:getfield        #195 <Field boolean Fragment.mHidden>
	//*  21   43:ifeq            61
		{
			fragment.mHidden = false;
	//   22   46:aload_1         
	//   23   47:iconst_0        
	//   24   48:putfield        #195 <Field boolean Fragment.mHidden>
			fragment.mHiddenChanged = fragment.mHiddenChanged ^ true;
	//   25   51:aload_1         
	//   26   52:aload_1         
	//   27   53:getfield        #815 <Field boolean Fragment.mHiddenChanged>
	//   28   56:iconst_1        
	//   29   57:ixor            
	//   30   58:putfield        #815 <Field boolean Fragment.mHiddenChanged>
		}
	//   31   61:return          
	}

	void startPendingDeferredFragments()
	{
		if(mActive == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #283 <Field SparseArray mActive>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		for(int i = 0; i < mActive.size(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:getfield        #283 <Field SparseArray mActive>
	//*   9   15:invokevirtual   #286 <Method int SparseArray.size()>
	//*  10   18:icmpge          49
		{
			Fragment fragment = (Fragment)mActive.valueAt(i);
	//   11   21:aload_0         
	//   12   22:getfield        #283 <Field SparseArray mActive>
	//   13   25:iload_1         
	//   14   26:invokevirtual   #289 <Method Object SparseArray.valueAt(int)>
	//   15   29:checkcast       #175 <Class Fragment>
	//   16   32:astore_2        
			if(fragment != null)
	//*  17   33:aload_2         
	//*  18   34:ifnull          42
				performPendingDeferredStart(fragment);
	//   19   37:aload_0         
	//   20   38:aload_2         
	//   21   39:invokevirtual   #1854 <Method void performPendingDeferredStart(Fragment)>
		}

	//   22   42:iload_1         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore_1        
	//*  26   46:goto            10
	//   27   49:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(128);
	//    0    0:new             #305 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          128
	//    3    7:invokespecial   #1855 <Method void StringBuilder(int)>
	//    4   10:astore_1        
		stringbuilder.append("FragmentManager{");
	//    5   11:aload_1         
	//    6   12:ldc2            #1857 <String "FragmentManager{">
	//    7   15:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:invokestatic    #1096 <Method int System.identityHashCode(Object)>
	//   12   24:invokestatic    #1100 <Method String Integer.toHexString(int)>
	//   13   27:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
		stringbuilder.append(" in ");
	//   15   31:aload_1         
	//   16   32:ldc2            #1859 <String " in ">
	//   17   35:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
		Fragment fragment = mParent;
	//   19   39:aload_0         
	//   20   40:getfield        #859 <Field Fragment mParent>
	//   21   43:astore_2        
		if(fragment != null)
	//*  22   44:aload_2         
	//*  23   45:ifnull          56
			DebugUtils.buildShortClassTag(((Object) (fragment)), stringbuilder);
	//   24   48:aload_2         
	//   25   49:aload_1         
	//   26   50:invokestatic    #1865 <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
		else
	//*  27   53:goto            64
			DebugUtils.buildShortClassTag(((Object) (mHost)), stringbuilder);
	//   28   56:aload_0         
	//   29   57:getfield        #369 <Field FragmentHostCallback mHost>
	//   30   60:aload_1         
	//   31   61:invokestatic    #1865 <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
		stringbuilder.append("}}");
	//   32   64:aload_1         
	//   33   65:ldc2            #1867 <String "}}">
	//   34   68:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   35   71:pop             
		return stringbuilder.toString();
	//   36   72:aload_1         
	//   37   73:invokevirtual   #318 <Method String StringBuilder.toString()>
	//   38   76:areturn         
	}

	static final Interpolator ACCELERATE_CUBIC = new AccelerateInterpolator(1.5F);
	static final Interpolator ACCELERATE_QUINT = new AccelerateInterpolator(2.5F);
	static boolean DEBUG = false;
	static final Interpolator DECELERATE_CUBIC = new DecelerateInterpolator(1.5F);
	static final Interpolator DECELERATE_QUINT = new DecelerateInterpolator(2.5F);
	static Field sAnimationListenerField;
	SparseArray mActive;
	final ArrayList mAdded = new ArrayList();
	ArrayList mAvailBackStackIndices;
	ArrayList mBackStack;
	ArrayList mBackStackChangeListeners;
	ArrayList mBackStackIndices;
	FragmentContainer mContainer;
	ArrayList mCreatedMenus;
	int mCurState;
	boolean mDestroyed;
	Runnable mExecCommit;
	boolean mExecutingActions;
	boolean mHavePendingDeferredStart;
	FragmentHostCallback mHost;
	private final CopyOnWriteArrayList mLifecycleCallbacks = new CopyOnWriteArrayList();
	boolean mNeedMenuInvalidate;
	int mNextFragmentIndex;
	String mNoTransactionsBecause;
	Fragment mParent;
	ArrayList mPendingActions;
	ArrayList mPostponedTransactions;
	Fragment mPrimaryNav;
	FragmentManagerNonConfig mSavedNonConfig;
	SparseArray mStateArray;
	Bundle mStateBundle;
	boolean mStateSaved;
	boolean mStopped;
	ArrayList mTmpAddedFragments;
	ArrayList mTmpIsPop;
	ArrayList mTmpRecords;

	static 
	{
	//    0    0:new             #114 <Class DecelerateInterpolator>
	//    1    3:dup             
	//    2    4:ldc1            #115 <Float 2.5F>
	//    3    6:invokespecial   #119 <Method void DecelerateInterpolator(float)>
	//    4    9:putstatic       #121 <Field Interpolator DECELERATE_QUINT>
	//    5   12:new             #114 <Class DecelerateInterpolator>
	//    6   15:dup             
	//    7   16:ldc1            #122 <Float 1.5F>
	//    8   18:invokespecial   #119 <Method void DecelerateInterpolator(float)>
	//    9   21:putstatic       #124 <Field Interpolator DECELERATE_CUBIC>
	//   10   24:new             #126 <Class AccelerateInterpolator>
	//   11   27:dup             
	//   12   28:ldc1            #115 <Float 2.5F>
	//   13   30:invokespecial   #127 <Method void AccelerateInterpolator(float)>
	//   14   33:putstatic       #129 <Field Interpolator ACCELERATE_QUINT>
	//   15   36:new             #126 <Class AccelerateInterpolator>
	//   16   39:dup             
	//   17   40:ldc1            #122 <Float 1.5F>
	//   18   42:invokespecial   #127 <Method void AccelerateInterpolator(float)>
	//   19   45:putstatic       #131 <Field Interpolator ACCELERATE_CUBIC>
	//*  20   48:return          
	}
}
