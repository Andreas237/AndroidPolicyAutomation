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
		public static final int Fragment_id = 1;
		public static final int Fragment_name = 0;
		public static final int Fragment_tag = 2;

		static 
		{
		//    0    0:iconst_3        
		//    1    1:newarray        int[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:ldc1            #19  <Int 0x1010003>
		//    5    7:iastore         
		//    6    8:dup             
		//    7    9:iconst_1        
		//    8   10:ldc1            #20  <Int 0x10100d0>
		//    9   12:iastore         
		//   10   13:dup             
		//   11   14:iconst_2        
		//   12   15:ldc1            #21  <Int 0x10100d1>
		//   13   17:iastore         
		//   14   18:putstatic       #23  <Field int[] Fragment>
		//*  15   21:return          
		}

		private FragmentTag()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void Object()>
		//    2    4:return          
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
	//    1    1:invokespecial   #163 <Method void FragmentManager()>
		mNextFragmentIndex = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #165 <Field int mNextFragmentIndex>
	//    5    9:aload_0         
	//    6   10:new             #167 <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #168 <Method void ArrayList()>
	//    9   17:putfield        #170 <Field ArrayList mAdded>
	//   10   20:aload_0         
	//   11   21:new             #172 <Class CopyOnWriteArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #173 <Method void CopyOnWriteArrayList()>
	//   14   28:putfield        #175 <Field CopyOnWriteArrayList mLifecycleCallbacks>
		mCurState = 0;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #177 <Field int mCurState>
		mStateBundle = null;
	//   18   36:aload_0         
	//   19   37:aconst_null     
	//   20   38:putfield        #179 <Field Bundle mStateBundle>
		mStateArray = null;
	//   21   41:aload_0         
	//   22   42:aconst_null     
	//   23   43:putfield        #181 <Field SparseArray mStateArray>
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
	//   28   52:invokespecial   #184 <Method void FragmentManagerImpl$1(FragmentManagerImpl)>
	//   29   55:putfield        #186 <Field Runnable mExecCommit>
	//   30   58:return          
	}

	private void addAddedFragments(ArraySet arrayset)
	{
		int i = mCurState;
	//    0    0:aload_0         
	//    1    1:getfield        #177 <Field int mCurState>
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
	//    9   13:invokestatic    #194 <Method int Math.min(int, int)>
	//   10   16:istore_3        
		int l = mAdded.size();
	//   11   17:aload_0         
	//   12   18:getfield        #170 <Field ArrayList mAdded>
	//   13   21:invokevirtual   #198 <Method int ArrayList.size()>
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
	//   21   35:getfield        #170 <Field ArrayList mAdded>
	//   22   38:iload_2         
	//   23   39:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   24   42:checkcast       #204 <Class Fragment>
	//   25   45:astore          5
			if(fragment.mState >= k)
				continue;
	//   26   47:aload           5
	//   27   49:getfield        #207 <Field int Fragment.mState>
	//   28   52:iload_3         
	//   29   53:icmpge          105
			moveToState(fragment, k, fragment.getNextAnim(), fragment.getNextTransition(), false);
	//   30   56:aload_0         
	//   31   57:aload           5
	//   32   59:iload_3         
	//   33   60:aload           5
	//   34   62:invokevirtual   #210 <Method int Fragment.getNextAnim()>
	//   35   65:aload           5
	//   36   67:invokevirtual   #213 <Method int Fragment.getNextTransition()>
	//   37   70:iconst_0        
	//   38   71:invokevirtual   #217 <Method void moveToState(Fragment, int, int, int, boolean)>
			if(fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded)
	//*  39   74:aload           5
	//*  40   76:getfield        #221 <Field View Fragment.mView>
	//*  41   79:ifnull          105
	//*  42   82:aload           5
	//*  43   84:getfield        #224 <Field boolean Fragment.mHidden>
	//*  44   87:ifne            105
	//*  45   90:aload           5
	//*  46   92:getfield        #227 <Field boolean Fragment.mIsNewlyAdded>
	//*  47   95:ifeq            105
				arrayset.add(((Object) (fragment)));
	//   48   98:aload_1         
	//   49   99:aload           5
	//   50  101:invokevirtual   #233 <Method boolean ArraySet.add(Object)>
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
	//    1    1:getfield        #221 <Field View Fragment.mView>
	//    2    4:astore          4
		final ViewGroup container = fragment.mContainer;
	//    3    6:aload_1         
	//    4    7:getfield        #241 <Field ViewGroup Fragment.mContainer>
	//    5   10:astore          5
		container.startViewTransition(viewToAnimate);
	//    6   12:aload           5
	//    7   14:aload           4
	//    8   16:invokevirtual   #247 <Method void ViewGroup.startViewTransition(View)>
		fragment.setStateAfterAnimating(i);
	//    9   19:aload_1         
	//   10   20:iload_3         
	//   11   21:invokevirtual   #251 <Method void Fragment.setStateAfterAnimating(int)>
		if(animationoranimator.animation != null)
	//*  12   24:aload_2         
	//*  13   25:getfield        #255 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//*  14   28:ifnull          93
		{
			EndViewTransitionAnimator endviewtransitionanimator = new EndViewTransitionAnimator(animationoranimator.animation, container, viewToAnimate);
	//   15   31:new             #32  <Class FragmentManagerImpl$EndViewTransitionAnimator>
	//   16   34:dup             
	//   17   35:aload_2         
	//   18   36:getfield        #255 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   19   39:aload           5
	//   20   41:aload           4
	//   21   43:invokespecial   #258 <Method void FragmentManagerImpl$EndViewTransitionAnimator(Animation, ViewGroup, View)>
	//   22   46:astore          6
			fragment.setAnimatingAway(fragment.mView);
	//   23   48:aload_1         
	//   24   49:aload_1         
	//   25   50:getfield        #221 <Field View Fragment.mView>
	//   26   53:invokevirtual   #261 <Method void Fragment.setAnimatingAway(View)>
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
	//   32   65:invokestatic    #265 <Method android.view.animation.Animation$AnimationListener getAnimationListener(Animation)>
	//   33   68:aload           5
	//   34   70:aload_1         
	//   35   71:invokespecial   #268 <Method void FragmentManagerImpl$2(FragmentManagerImpl, android.view.animation.Animation$AnimationListener, ViewGroup, Fragment)>
	//   36   74:invokevirtual   #274 <Method void Animation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
			setHWLayerAnimListenerIfAlpha(viewToAnimate, animationoranimator);
	//   37   77:aload           4
	//   38   79:aload_2         
	//   39   80:invokestatic    #278 <Method void setHWLayerAnimListenerIfAlpha(View, FragmentManagerImpl$AnimationOrAnimator)>
			fragment.mView.startAnimation(((Animation) (endviewtransitionanimator)));
	//   40   83:aload_1         
	//   41   84:getfield        #221 <Field View Fragment.mView>
	//   42   87:aload           6
	//   43   89:invokevirtual   #284 <Method void View.startAnimation(Animation)>
			return;
	//   44   92:return          
		} else
		{
			Animator animator = animationoranimator.animator;
	//   45   93:aload_2         
	//   46   94:getfield        #288 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   47   97:astore          6
			fragment.setAnimator(animationoranimator.animator);
	//   48   99:aload_1         
	//   49  100:aload_2         
	//   50  101:getfield        #288 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   51  104:invokevirtual   #292 <Method void Fragment.setAnimator(Animator)>
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
	//   59  119:invokespecial   #295 <Method void FragmentManagerImpl$3(FragmentManagerImpl, ViewGroup, View, Fragment)>
	//   60  122:invokevirtual   #301 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
			animator.setTarget(((Object) (fragment.mView)));
	//   61  125:aload           6
	//   62  127:aload_1         
	//   63  128:getfield        #221 <Field View Fragment.mView>
	//   64  131:invokevirtual   #305 <Method void Animator.setTarget(Object)>
			setHWLayerAnimListenerIfAlpha(fragment.mView, animationoranimator);
	//   65  134:aload_1         
	//   66  135:getfield        #221 <Field View Fragment.mView>
	//   67  138:aload_2         
	//   68  139:invokestatic    #278 <Method void setHWLayerAnimListenerIfAlpha(View, FragmentManagerImpl$AnimationOrAnimator)>
			animator.start();
	//   69  142:aload           6
	//   70  144:invokevirtual   #308 <Method void Animator.start()>
			return;
	//   71  147:return          
		}
	}

	private void burpActive()
	{
		SparseArray sparsearray = mActive;
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field SparseArray mActive>
	//    2    4:astore_2        
		if(sparsearray != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          52
		{
			for(int i = sparsearray.size() - 1; i >= 0; i--)
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #315 <Method int SparseArray.size()>
	//*   7   13:iconst_1        
	//*   8   14:isub            
	//*   9   15:istore_1        
	//*  10   16:iload_1         
	//*  11   17:iflt            52
				if(mActive.valueAt(i) == null)
	//*  12   20:aload_0         
	//*  13   21:getfield        #312 <Field SparseArray mActive>
	//*  14   24:iload_1         
	//*  15   25:invokevirtual   #318 <Method Object SparseArray.valueAt(int)>
	//*  16   28:ifnonnull       45
				{
					SparseArray sparsearray1 = mActive;
	//   17   31:aload_0         
	//   18   32:getfield        #312 <Field SparseArray mActive>
	//   19   35:astore_2        
					sparsearray1.delete(sparsearray1.keyAt(i));
	//   20   36:aload_2         
	//   21   37:aload_2         
	//   22   38:iload_1         
	//   23   39:invokevirtual   #322 <Method int SparseArray.keyAt(int)>
	//   24   42:invokevirtual   #325 <Method void SparseArray.delete(int)>
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
	//*   1    1:invokevirtual   #330 <Method boolean isStateSaved()>
	//*   2    4:ifne            52
		{
			if(mNoTransactionsBecause == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #332 <Field String mNoTransactionsBecause>
	//*   5   11:ifnonnull       15
			{
				return;
	//    6   14:return          
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    7   15:new             #334 <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #335 <Method void StringBuilder()>
	//   10   22:astore_1        
				stringbuilder.append("Can not perform this action inside of ");
	//   11   23:aload_1         
	//   12   24:ldc2            #337 <String "Can not perform this action inside of ">
	//   13   27:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
				stringbuilder.append(mNoTransactionsBecause);
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #332 <Field String mNoTransactionsBecause>
	//   18   36:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
				throw new IllegalStateException(stringbuilder.toString());
	//   20   40:new             #343 <Class IllegalStateException>
	//   21   43:dup             
	//   22   44:aload_1         
	//   23   45:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   24   48:invokespecial   #350 <Method void IllegalStateException(String)>
	//   25   51:athrow          
			}
		} else
		{
			throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
	//   26   52:new             #343 <Class IllegalStateException>
	//   27   55:dup             
	//   28   56:ldc2            #352 <String "Can not perform this action after onSaveInstanceState">
	//   29   59:invokespecial   #350 <Method void IllegalStateException(String)>
	//   30   62:athrow          
		}
	}

	private void cleanupExec()
	{
		mExecutingActions = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #355 <Field boolean mExecutingActions>
		mTmpIsPop.clear();
	//    3    5:aload_0         
	//    4    6:getfield        #357 <Field ArrayList mTmpIsPop>
	//    5    9:invokevirtual   #360 <Method void ArrayList.clear()>
		mTmpRecords.clear();
	//    6   12:aload_0         
	//    7   13:getfield        #362 <Field ArrayList mTmpRecords>
	//    8   16:invokevirtual   #360 <Method void ArrayList.clear()>
	//    9   19:return          
	}

	private void dispatchStateChange(int i)
	{
		mExecutingActions = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #355 <Field boolean mExecutingActions>
		moveToState(i, false);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #366 <Method void moveToState(int, boolean)>
		mExecutingActions = false;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #355 <Field boolean mExecutingActions>
		execPendingActions();
	//   10   16:aload_0         
	//   11   17:invokevirtual   #369 <Method boolean execPendingActions()>
	//   12   20:pop             
		return;
	//   13   21:return          
		Exception exception;
		exception;
	//   14   22:astore_2        
		mExecutingActions = false;
	//   15   23:aload_0         
	//   16   24:iconst_0        
	//   17   25:putfield        #355 <Field boolean mExecutingActions>
		throw exception;
	//   18   28:aload_2         
	//   19   29:athrow          
	}

	private void endAnimatingAwayFragments()
	{
		SparseArray sparsearray = mActive;
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field SparseArray mActive>
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
	//   11   20:invokevirtual   #315 <Method int SparseArray.size()>
	//   12   23:istore_1        
		for(; j < i; j++)
	//*  13   24:iload_2         
	//*  14   25:iload_1         
	//*  15   26:icmpge          132
		{
			Fragment fragment = (Fragment)mActive.valueAt(j);
	//   16   29:aload_0         
	//   17   30:getfield        #312 <Field SparseArray mActive>
	//   18   33:iload_2         
	//   19   34:invokevirtual   #318 <Method Object SparseArray.valueAt(int)>
	//   20   37:checkcast       #204 <Class Fragment>
	//   21   40:astore          4
			if(fragment == null)
				continue;
	//   22   42:aload           4
	//   23   44:ifnull          125
			if(fragment.getAnimatingAway() != null)
	//*  24   47:aload           4
	//*  25   49:invokevirtual   #374 <Method View Fragment.getAnimatingAway()>
	//*  26   52:ifnull          109
			{
				int k = fragment.getStateAfterAnimating();
	//   27   55:aload           4
	//   28   57:invokevirtual   #377 <Method int Fragment.getStateAfterAnimating()>
	//   29   60:istore_3        
				View view = fragment.getAnimatingAway();
	//   30   61:aload           4
	//   31   63:invokevirtual   #374 <Method View Fragment.getAnimatingAway()>
	//   32   66:astore          5
				Animation animation = view.getAnimation();
	//   33   68:aload           5
	//   34   70:invokevirtual   #381 <Method Animation View.getAnimation()>
	//   35   73:astore          6
				if(animation != null)
	//*  36   75:aload           6
	//*  37   77:ifnull          90
				{
					animation.cancel();
	//   38   80:aload           6
	//   39   82:invokevirtual   #384 <Method void Animation.cancel()>
					view.clearAnimation();
	//   40   85:aload           5
	//   41   87:invokevirtual   #387 <Method void View.clearAnimation()>
				}
				fragment.setAnimatingAway(((View) (null)));
	//   42   90:aload           4
	//   43   92:aconst_null     
	//   44   93:invokevirtual   #261 <Method void Fragment.setAnimatingAway(View)>
				moveToState(fragment, k, 0, 0, false);
	//   45   96:aload_0         
	//   46   97:aload           4
	//   47   99:iload_3         
	//   48  100:iconst_0        
	//   49  101:iconst_0        
	//   50  102:iconst_0        
	//   51  103:invokevirtual   #217 <Method void moveToState(Fragment, int, int, int, boolean)>
				continue;
	//   52  106:goto            125
			}
			if(fragment.getAnimator() != null)
	//*  53  109:aload           4
	//*  54  111:invokevirtual   #391 <Method Animator Fragment.getAnimator()>
	//*  55  114:ifnull          125
				fragment.getAnimator().end();
	//   56  117:aload           4
	//   57  119:invokevirtual   #391 <Method Animator Fragment.getAnimator()>
	//   58  122:invokevirtual   #394 <Method void Animator.end()>
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
	//    1    1:getfield        #355 <Field boolean mExecutingActions>
	//    2    4:ifne            114
		if(mHost == null)
			break MISSING_BLOCK_LABEL_103;
	//    3    7:aload_0         
	//    4    8:getfield        #398 <Field FragmentHostCallback mHost>
	//    5   11:ifnull          103
		if(Looper.myLooper() != mHost.getHandler().getLooper())
			break MISSING_BLOCK_LABEL_92;
	//    6   14:invokestatic    #404 <Method Looper Looper.myLooper()>
	//    7   17:aload_0         
	//    8   18:getfield        #398 <Field FragmentHostCallback mHost>
	//    9   21:invokevirtual   #410 <Method Handler FragmentHostCallback.getHandler()>
	//   10   24:invokevirtual   #415 <Method Looper Handler.getLooper()>
	//   11   27:if_acmpne       92
		if(!flag)
	//*  12   30:iload_1         
	//*  13   31:ifne            38
			checkStateLoss();
	//   14   34:aload_0         
	//   15   35:invokespecial   #417 <Method void checkStateLoss()>
		if(mTmpRecords == null)
	//*  16   38:aload_0         
	//*  17   39:getfield        #362 <Field ArrayList mTmpRecords>
	//*  18   42:ifnonnull       67
		{
			mTmpRecords = new ArrayList();
	//   19   45:aload_0         
	//   20   46:new             #167 <Class ArrayList>
	//   21   49:dup             
	//   22   50:invokespecial   #168 <Method void ArrayList()>
	//   23   53:putfield        #362 <Field ArrayList mTmpRecords>
			mTmpIsPop = new ArrayList();
	//   24   56:aload_0         
	//   25   57:new             #167 <Class ArrayList>
	//   26   60:dup             
	//   27   61:invokespecial   #168 <Method void ArrayList()>
	//   28   64:putfield        #357 <Field ArrayList mTmpIsPop>
		}
		mExecutingActions = true;
	//   29   67:aload_0         
	//   30   68:iconst_1        
	//   31   69:putfield        #355 <Field boolean mExecutingActions>
		executePostponedTransaction(((ArrayList) (null)), ((ArrayList) (null)));
	//   32   72:aload_0         
	//   33   73:aconst_null     
	//   34   74:aconst_null     
	//   35   75:invokespecial   #421 <Method void executePostponedTransaction(ArrayList, ArrayList)>
		mExecutingActions = false;
	//   36   78:aload_0         
	//   37   79:iconst_0        
	//   38   80:putfield        #355 <Field boolean mExecutingActions>
		return;
	//   39   83:return          
		Exception exception;
		exception;
	//   40   84:astore_2        
		mExecutingActions = false;
	//   41   85:aload_0         
	//   42   86:iconst_0        
	//   43   87:putfield        #355 <Field boolean mExecutingActions>
		throw exception;
	//   44   90:aload_2         
	//   45   91:athrow          
		throw new IllegalStateException("Must be called from main thread of fragment host");
	//   46   92:new             #343 <Class IllegalStateException>
	//   47   95:dup             
	//   48   96:ldc2            #423 <String "Must be called from main thread of fragment host">
	//   49   99:invokespecial   #350 <Method void IllegalStateException(String)>
	//   50  102:athrow          
		throw new IllegalStateException("Fragment host has been destroyed");
	//   51  103:new             #343 <Class IllegalStateException>
	//   52  106:dup             
	//   53  107:ldc2            #425 <String "Fragment host has been destroyed">
	//   54  110:invokespecial   #350 <Method void IllegalStateException(String)>
	//   55  113:athrow          
		throw new IllegalStateException("FragmentManager is already executing transactions");
	//   56  114:new             #343 <Class IllegalStateException>
	//   57  117:dup             
	//   58  118:ldc2            #427 <String "FragmentManager is already executing transactions">
	//   59  121:invokespecial   #350 <Method void IllegalStateException(String)>
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
	//    5    7:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//    6   10:checkcast       #431 <Class BackStackRecord>
	//    7   13:astore          6
			boolean flag1 = ((Boolean)arraylist1.get(i)).booleanValue();
	//    8   15:aload_1         
	//    9   16:iload_2         
	//   10   17:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   11   20:checkcast       #433 <Class Boolean>
	//   12   23:invokevirtual   #436 <Method boolean Boolean.booleanValue()>
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
	//   20   39:invokevirtual   #439 <Method void BackStackRecord.bumpBackStackNesting(int)>
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
	//   31   59:invokevirtual   #442 <Method void BackStackRecord.executePopOps(boolean)>
			} else
	//*  32   62:goto            76
			{
				backstackrecord.bumpBackStackNesting(1);
	//   33   65:aload           6
	//   34   67:iconst_1        
	//   35   68:invokevirtual   #439 <Method void BackStackRecord.bumpBackStackNesting(int)>
				backstackrecord.executeOps();
	//   36   71:aload           6
	//   37   73:invokevirtual   #444 <Method void BackStackRecord.executeOps()>
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
	//    4    6:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//    5    9:checkcast       #431 <Class BackStackRecord>
	//    6   12:getfield        #449 <Field boolean BackStackRecord.mReorderingAllowed>
	//    7   15:istore          9
		Object obj = ((Object) (mTmpAddedFragments));
	//    8   17:aload_0         
	//    9   18:getfield        #451 <Field ArrayList mTmpAddedFragments>
	//   10   21:astore          10
		if(obj == null)
	//*  11   23:aload           10
	//*  12   25:ifnonnull       42
			mTmpAddedFragments = new ArrayList();
	//   13   28:aload_0         
	//   14   29:new             #167 <Class ArrayList>
	//   15   32:dup             
	//   16   33:invokespecial   #168 <Method void ArrayList()>
	//   17   36:putfield        #451 <Field ArrayList mTmpAddedFragments>
		else
	//*  18   39:goto            47
			((ArrayList) (obj)).clear();
	//   19   42:aload           10
	//   20   44:invokevirtual   #360 <Method void ArrayList.clear()>
		mTmpAddedFragments.addAll(((java.util.Collection) (mAdded)));
	//   21   47:aload_0         
	//   22   48:getfield        #451 <Field ArrayList mTmpAddedFragments>
	//   23   51:aload_0         
	//   24   52:getfield        #170 <Field ArrayList mAdded>
	//   25   55:invokevirtual   #455 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   26   58:pop             
		obj = ((Object) (getPrimaryNavigationFragment()));
	//   27   59:aload_0         
	//   28   60:invokevirtual   #459 <Method Fragment getPrimaryNavigationFragment()>
	//   29   63:astore          10
		boolean flag = false;
	//   30   65:iconst_0        
	//   31   66:istore          6
		for(int l = k; l < j; l++)
	//*  32   68:iload           5
	//*  33   70:istore          7
	//*  34   72:iload           7
	//*  35   74:iload           4
	//*  36   76:icmpge          168
		{
			BackStackRecord backstackrecord1 = (BackStackRecord)arraylist.get(l);
	//   37   79:aload_1         
	//   38   80:iload           7
	//   39   82:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   40   85:checkcast       #431 <Class BackStackRecord>
	//   41   88:astore          11
			if(!((Boolean)arraylist1.get(l)).booleanValue())
	//*  42   90:aload_2         
	//*  43   91:iload           7
	//*  44   93:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//*  45   96:checkcast       #433 <Class Boolean>
	//*  46   99:invokevirtual   #436 <Method boolean Boolean.booleanValue()>
	//*  47  102:ifne            121
				obj = ((Object) (backstackrecord1.expandOps(mTmpAddedFragments, ((Fragment) (obj)))));
	//   48  105:aload           11
	//   49  107:aload_0         
	//   50  108:getfield        #451 <Field ArrayList mTmpAddedFragments>
	//   51  111:aload           10
	//   52  113:invokevirtual   #463 <Method Fragment BackStackRecord.expandOps(ArrayList, Fragment)>
	//   53  116:astore          10
			else
	//*  54  118:goto            134
				obj = ((Object) (backstackrecord1.trackAddedFragmentsInPop(mTmpAddedFragments, ((Fragment) (obj)))));
	//   55  121:aload           11
	//   56  123:aload_0         
	//   57  124:getfield        #451 <Field ArrayList mTmpAddedFragments>
	//   58  127:aload           10
	//   59  129:invokevirtual   #466 <Method Fragment BackStackRecord.trackAddedFragmentsInPop(ArrayList, Fragment)>
	//   60  132:astore          10
			if(!flag && !backstackrecord1.mAddToBackStack)
	//*  61  134:iload           6
	//*  62  136:ifne            156
	//*  63  139:aload           11
	//*  64  141:getfield        #469 <Field boolean BackStackRecord.mAddToBackStack>
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
	//   78  169:getfield        #451 <Field ArrayList mTmpAddedFragments>
	//   79  172:invokevirtual   #360 <Method void ArrayList.clear()>
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
	//   88  187:invokestatic    #475 <Method void FragmentTransition.startTransitions(FragmentManagerImpl, ArrayList, ArrayList, int, int, boolean)>
		executeOps(arraylist, arraylist1, i, j);
	//   89  190:aload_1         
	//   90  191:aload_2         
	//   91  192:iload_3         
	//   92  193:iload           4
	//   93  195:invokestatic    #477 <Method void executeOps(ArrayList, ArrayList, int, int)>
		int i1;
		if(flag1)
	//*  94  198:iload           9
	//*  95  200:ifeq            240
		{
			ArraySet arrayset = new ArraySet();
	//   96  203:new             #229 <Class ArraySet>
	//   97  206:dup             
	//   98  207:invokespecial   #478 <Method void ArraySet()>
	//   99  210:astore          10
			addAddedFragments(arrayset);
	//  100  212:aload_0         
	//  101  213:aload           10
	//  102  215:invokespecial   #480 <Method void addAddedFragments(ArraySet)>
			i1 = postponePostponableTransactions(arraylist, arraylist1, i, j, arrayset);
	//  103  218:aload_0         
	//  104  219:aload_1         
	//  105  220:aload_2         
	//  106  221:iload_3         
	//  107  222:iload           4
	//  108  224:aload           10
	//  109  226:invokespecial   #484 <Method int postponePostponableTransactions(ArrayList, ArrayList, int, int, ArraySet)>
	//  110  229:istore          7
			makeRemovedFragmentsInvisible(arrayset);
	//  111  231:aload_0         
	//  112  232:aload           10
	//  113  234:invokespecial   #487 <Method void makeRemovedFragmentsInvisible(ArraySet)>
		} else
	//* 114  237:goto            244
		{
			i1 = j;
	//  115  240:iload           4
	//  116  242:istore          7
		}
		int j1 = k;
	//  117  244:iload           5
	//  118  246:istore          8
		if(i1 != k)
	//* 119  248:iload           7
	//* 120  250:iload           5
	//* 121  252:icmpeq          287
		{
			j1 = k;
	//  122  255:iload           5
	//  123  257:istore          8
			if(flag1)
	//* 124  259:iload           9
	//* 125  261:ifeq            287
			{
				FragmentTransition.startTransitions(this, arraylist, arraylist1, i, i1, true);
	//  126  264:aload_0         
	//  127  265:aload_1         
	//  128  266:aload_2         
	//  129  267:iload_3         
	//  130  268:iload           7
	//  131  270:iconst_1        
	//  132  271:invokestatic    #475 <Method void FragmentTransition.startTransitions(FragmentManagerImpl, ArrayList, ArrayList, int, int, boolean)>
				moveToState(mCurState, true);
	//  133  274:aload_0         
	//  134  275:aload_0         
	//  135  276:getfield        #177 <Field int mCurState>
	//  136  279:iconst_1        
	//  137  280:invokevirtual   #366 <Method void moveToState(int, boolean)>
				j1 = k;
	//  138  283:iload           5
	//  139  285:istore          8
			}
		}
		for(; j1 < j; j1++)
	//* 140  287:iload           8
	//* 141  289:iload           4
	//* 142  291:icmpge          357
		{
			BackStackRecord backstackrecord = (BackStackRecord)arraylist.get(j1);
	//  143  294:aload_1         
	//  144  295:iload           8
	//  145  297:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//  146  300:checkcast       #431 <Class BackStackRecord>
	//  147  303:astore          10
			if(((Boolean)arraylist1.get(j1)).booleanValue() && backstackrecord.mIndex >= 0)
	//* 148  305:aload_2         
	//* 149  306:iload           8
	//* 150  308:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//* 151  311:checkcast       #433 <Class Boolean>
	//* 152  314:invokevirtual   #436 <Method boolean Boolean.booleanValue()>
	//* 153  317:ifeq            343
	//* 154  320:aload           10
	//* 155  322:getfield        #490 <Field int BackStackRecord.mIndex>
	//* 156  325:iflt            343
			{
				freeBackStackIndex(backstackrecord.mIndex);
	//  157  328:aload_0         
	//  158  329:aload           10
	//  159  331:getfield        #490 <Field int BackStackRecord.mIndex>
	//  160  334:invokevirtual   #493 <Method void freeBackStackIndex(int)>
				backstackrecord.mIndex = -1;
	//  161  337:aload           10
	//  162  339:iconst_m1       
	//  163  340:putfield        #490 <Field int BackStackRecord.mIndex>
			}
			backstackrecord.runOnCommitRunnables();
	//  164  343:aload           10
	//  165  345:invokevirtual   #496 <Method void BackStackRecord.runOnCommitRunnables()>
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
	//  174  363:invokevirtual   #499 <Method void reportBackStackChanged()>
	//  175  366:return          
	}

	private void executePostponedTransaction(ArrayList arraylist, ArrayList arraylist1)
	{
		ArrayList arraylist2 = mPostponedTransactions;
	//    0    0:aload_0         
	//    1    1:getfield        #501 <Field ArrayList mPostponedTransactions>
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
	//    9   18:invokevirtual   #198 <Method int ArrayList.size()>
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
	//   21   38:getfield        #501 <Field ArrayList mPostponedTransactions>
	//   22   41:iload_3         
	//   23   42:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   24   45:checkcast       #47  <Class FragmentManagerImpl$StartEnterTransitionListener>
	//   25   48:astore          7
				if(arraylist != null && !startentertransitionlistener.mIsBack)
	//*  26   50:aload_1         
	//*  27   51:ifnull          109
	//*  28   54:aload           7
	//*  29   56:getfield        #504 <Field boolean FragmentManagerImpl$StartEnterTransitionListener.mIsBack>
	//*  30   59:ifne            109
				{
					l = arraylist.indexOf(((Object) (startentertransitionlistener.mRecord)));
	//   31   62:aload_1         
	//   32   63:aload           7
	//   33   65:getfield        #508 <Field BackStackRecord FragmentManagerImpl$StartEnterTransitionListener.mRecord>
	//   34   68:invokevirtual   #512 <Method int ArrayList.indexOf(Object)>
	//   35   71:istore          5
					if(l != -1 && ((Boolean)arraylist1.get(l)).booleanValue())
	//*  36   73:iload           5
	//*  37   75:iconst_m1       
	//*  38   76:icmpeq          109
	//*  39   79:aload_2         
	//*  40   80:iload           5
	//*  41   82:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//*  42   85:checkcast       #433 <Class Boolean>
	//*  43   88:invokevirtual   #436 <Method boolean Boolean.booleanValue()>
	//*  44   91:ifeq            109
					{
						startentertransitionlistener.cancelTransaction();
	//   45   94:aload           7
	//   46   96:invokevirtual   #515 <Method void FragmentManagerImpl$StartEnterTransitionListener.cancelTransaction()>
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
	//*  53  111:invokevirtual   #518 <Method boolean FragmentManagerImpl$StartEnterTransitionListener.isReady()>
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
	//   66  137:getfield        #508 <Field BackStackRecord FragmentManagerImpl$StartEnterTransitionListener.mRecord>
	//   67  140:aload_1         
	//   68  141:iconst_0        
	//   69  142:aload_1         
	//   70  143:invokevirtual   #198 <Method int ArrayList.size()>
	//   71  146:invokevirtual   #522 <Method boolean BackStackRecord.interactsWith(ArrayList, int, int)>
	//   72  149:ifeq            226
				}
				mPostponedTransactions.remove(j);
	//   73  152:aload_0         
	//   74  153:getfield        #501 <Field ArrayList mPostponedTransactions>
	//   75  156:iload_3         
	//   76  157:invokevirtual   #525 <Method Object ArrayList.remove(int)>
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
	//*  89  178:getfield        #504 <Field boolean FragmentManagerImpl$StartEnterTransitionListener.mIsBack>
	//*  90  181:ifne            221
				{
					j = arraylist.indexOf(((Object) (startentertransitionlistener.mRecord)));
	//   91  184:aload_1         
	//   92  185:aload           7
	//   93  187:getfield        #508 <Field BackStackRecord FragmentManagerImpl$StartEnterTransitionListener.mRecord>
	//   94  190:invokevirtual   #512 <Method int ArrayList.indexOf(Object)>
	//   95  193:istore_3        
					if(j != -1 && ((Boolean)arraylist1.get(j)).booleanValue())
	//*  96  194:iload_3         
	//*  97  195:iconst_m1       
	//*  98  196:icmpeq          221
	//*  99  199:aload_2         
	//* 100  200:iload_3         
	//* 101  201:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//* 102  204:checkcast       #433 <Class Boolean>
	//* 103  207:invokevirtual   #436 <Method boolean Boolean.booleanValue()>
	//* 104  210:ifeq            221
					{
						startentertransitionlistener.cancelTransaction();
	//  105  213:aload           7
	//  106  215:invokevirtual   #515 <Method void FragmentManagerImpl$StartEnterTransitionListener.cancelTransaction()>
						break label0;
	//  107  218:goto            226
					}
				}
				startentertransitionlistener.completeTransaction();
	//  108  221:aload           7
	//  109  223:invokevirtual   #528 <Method void FragmentManagerImpl$StartEnterTransitionListener.completeTransaction()>
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
	//    1    1:getfield        #241 <Field ViewGroup Fragment.mContainer>
	//    2    4:astore_3        
		View view = fragment.mView;
	//    3    5:aload_1         
	//    4    6:getfield        #221 <Field View Fragment.mView>
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
	//*  13   23:getfield        #170 <Field ArrayList mAdded>
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #512 <Method int ArrayList.indexOf(Object)>
	//*  16   30:iconst_1        
	//*  17   31:isub            
	//*  18   32:istore_2        
	//*  19   33:iload_2         
	//*  20   34:iflt            73
			{
				fragment = (Fragment)mAdded.get(i);
	//   21   37:aload_0         
	//   22   38:getfield        #170 <Field ArrayList mAdded>
	//   23   41:iload_2         
	//   24   42:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   25   45:checkcast       #204 <Class Fragment>
	//   26   48:astore_1        
				if(fragment.mContainer == viewgroup && fragment.mView != null)
	//*  27   49:aload_1         
	//*  28   50:getfield        #241 <Field ViewGroup Fragment.mContainer>
	//*  29   53:aload_3         
	//*  30   54:if_acmpne       66
	//*  31   57:aload_1         
	//*  32   58:getfield        #221 <Field View Fragment.mView>
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
	//*   1    1:getfield        #501 <Field ArrayList mPostponedTransactions>
	//*   2    4:ifnull          34
			for(; !mPostponedTransactions.isEmpty(); ((StartEnterTransitionListener)mPostponedTransactions.remove(0)).completeTransaction());
	//    3    7:aload_0         
	//    4    8:getfield        #501 <Field ArrayList mPostponedTransactions>
	//    5   11:invokevirtual   #535 <Method boolean ArrayList.isEmpty()>
	//    6   14:ifne            34
	//    7   17:aload_0         
	//    8   18:getfield        #501 <Field ArrayList mPostponedTransactions>
	//    9   21:iconst_0        
	//   10   22:invokevirtual   #525 <Method Object ArrayList.remove(int)>
	//   11   25:checkcast       #47  <Class FragmentManagerImpl$StartEnterTransitionListener>
	//   12   28:invokevirtual   #528 <Method void FragmentManagerImpl$StartEnterTransitionListener.completeTransaction()>
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
	//    3    3:getfield        #539 <Field ArrayList mPendingActions>
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
	//*  10   16:getfield        #539 <Field ArrayList mPendingActions>
	//*  11   19:invokevirtual   #198 <Method int ArrayList.size()>
	//*  12   22:ifne            28
			break MISSING_BLOCK_LABEL_102;
	//   13   25:goto            102
		int j = mPendingActions.size();
	//   14   28:aload_0         
	//   15   29:getfield        #539 <Field ArrayList mPendingActions>
	//   16   32:invokevirtual   #198 <Method int ArrayList.size()>
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
	//   25   49:getfield        #539 <Field ArrayList mPendingActions>
	//   26   52:iload_3         
	//   27   53:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   28   56:checkcast       #41  <Class FragmentManagerImpl$OpGenerator>
	//   29   59:aload_1         
	//   30   60:aload_2         
	//   31   61:invokeinterface #542 <Method boolean FragmentManagerImpl$OpGenerator.generateOps(ArrayList, ArrayList)>
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
	//   40   77:getfield        #539 <Field ArrayList mPendingActions>
	//   41   80:invokevirtual   #360 <Method void ArrayList.clear()>
		mHost.getHandler().removeCallbacks(mExecCommit);
	//   42   83:aload_0         
	//   43   84:getfield        #398 <Field FragmentHostCallback mHost>
	//   44   87:invokevirtual   #410 <Method Handler FragmentHostCallback.getHandler()>
	//   45   90:aload_0         
	//   46   91:getfield        #186 <Field Runnable mExecCommit>
	//   47   94:invokevirtual   #546 <Method void Handler.removeCallbacks(Runnable)>
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
	//*   0    0:getstatic       #553 <Field Field sAnimationListenerField>
	//*   1    3:ifnonnull       25
		{
			sAnimationListenerField = ((Class) (android/view/animation/Animation)).getDeclaredField("mListener");
	//    2    6:ldc2            #270 <Class Animation>
	//    3    9:ldc2            #555 <String "mListener">
	//    4   12:invokevirtual   #561 <Method Field Class.getDeclaredField(String)>
	//    5   15:putstatic       #553 <Field Field sAnimationListenerField>
			sAnimationListenerField.setAccessible(true);
	//    6   18:getstatic       #553 <Field Field sAnimationListenerField>
	//    7   21:iconst_1        
	//    8   22:invokevirtual   #566 <Method void Field.setAccessible(boolean)>
		}
		animation = ((Animation) ((android.view.animation.Animation.AnimationListener)sAnimationListenerField.get(((Object) (animation)))));
	//    9   25:getstatic       #553 <Field Field sAnimationListenerField>
	//   10   28:aload_0         
	//   11   29:invokevirtual   #569 <Method Object Field.get(Object)>
	//   12   32:checkcast       #571 <Class android.view.animation.Animation$AnimationListener>
	//   13   35:astore_0        
		return ((android.view.animation.Animation.AnimationListener) (animation));
	//   14   36:aload_0         
	//   15   37:areturn         
		animation;
	//   16   38:astore_0        
		Log.e("FragmentManager", "Cannot access Animation's mListener field", ((Throwable) (animation)));
	//   17   39:ldc1            #75  <String "FragmentManager">
	//   18   41:ldc2            #573 <String "Cannot access Animation's mListener field">
	//   19   44:aload_0         
	//   20   45:invokestatic    #579 <Method int Log.e(String, String, Throwable)>
	//   21   48:pop             
		break MISSING_BLOCK_LABEL_63;
	//   22   49:goto            63
		animation;
	//   23   52:astore_0        
		Log.e("FragmentManager", "No field with the name mListener is found in Animation class", ((Throwable) (animation)));
	//   24   53:ldc1            #75  <String "FragmentManager">
	//   25   55:ldc2            #581 <String "No field with the name mListener is found in Animation class">
	//   26   58:aload_0         
	//   27   59:invokestatic    #579 <Method int Log.e(String, String, Throwable)>
	//   28   62:pop             
		return null;
	//   29   63:aconst_null     
	//   30   64:areturn         
	}

	static AnimationOrAnimator makeFadeAnimation(Context context, float f, float f1)
	{
		context = ((Context) (new AlphaAnimation(f, f1)));
	//    0    0:new             #585 <Class AlphaAnimation>
	//    1    3:dup             
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokespecial   #588 <Method void AlphaAnimation(float, float)>
	//    5    9:astore_0        
		((AlphaAnimation) (context)).setInterpolator(DECELERATE_CUBIC);
	//    6   10:aload_0         
	//    7   11:getstatic       #153 <Field Interpolator DECELERATE_CUBIC>
	//    8   14:invokevirtual   #592 <Method void AlphaAnimation.setInterpolator(Interpolator)>
		((AlphaAnimation) (context)).setDuration(220L);
	//    9   17:aload_0         
	//   10   18:ldc2w           #593 <Long 220L>
	//   11   21:invokevirtual   #598 <Method void AlphaAnimation.setDuration(long)>
		return new AnimationOrAnimator(((Animation) (context)));
	//   12   24:new             #26  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:invokespecial   #600 <Method void FragmentManagerImpl$AnimationOrAnimator(Animation)>
	//   16   32:areturn         
	}

	static AnimationOrAnimator makeOpenCloseAnimation(Context context, float f, float f1, float f2, float f3)
	{
		context = ((Context) (new AnimationSet(false)));
	//    0    0:new             #604 <Class AnimationSet>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #606 <Method void AnimationSet(boolean)>
	//    4    8:astore_0        
		Object obj = ((Object) (new ScaleAnimation(f, f1, f, f1, 1, 0.5F, 1, 0.5F)));
	//    5    9:new             #608 <Class ScaleAnimation>
	//    6   12:dup             
	//    7   13:fload_1         
	//    8   14:fload_2         
	//    9   15:fload_1         
	//   10   16:fload_2         
	//   11   17:iconst_1        
	//   12   18:ldc2            #609 <Float 0.5F>
	//   13   21:iconst_1        
	//   14   22:ldc2            #609 <Float 0.5F>
	//   15   25:invokespecial   #612 <Method void ScaleAnimation(float, float, float, float, int, float, int, float)>
	//   16   28:astore          5
		((ScaleAnimation) (obj)).setInterpolator(DECELERATE_QUINT);
	//   17   30:aload           5
	//   18   32:getstatic       #150 <Field Interpolator DECELERATE_QUINT>
	//   19   35:invokevirtual   #613 <Method void ScaleAnimation.setInterpolator(Interpolator)>
		((ScaleAnimation) (obj)).setDuration(220L);
	//   20   38:aload           5
	//   21   40:ldc2w           #593 <Long 220L>
	//   22   43:invokevirtual   #614 <Method void ScaleAnimation.setDuration(long)>
		((AnimationSet) (context)).addAnimation(((Animation) (obj)));
	//   23   46:aload_0         
	//   24   47:aload           5
	//   25   49:invokevirtual   #617 <Method void AnimationSet.addAnimation(Animation)>
		obj = ((Object) (new AlphaAnimation(f2, f3)));
	//   26   52:new             #585 <Class AlphaAnimation>
	//   27   55:dup             
	//   28   56:fload_3         
	//   29   57:fload           4
	//   30   59:invokespecial   #588 <Method void AlphaAnimation(float, float)>
	//   31   62:astore          5
		((AlphaAnimation) (obj)).setInterpolator(DECELERATE_CUBIC);
	//   32   64:aload           5
	//   33   66:getstatic       #153 <Field Interpolator DECELERATE_CUBIC>
	//   34   69:invokevirtual   #592 <Method void AlphaAnimation.setInterpolator(Interpolator)>
		((AlphaAnimation) (obj)).setDuration(220L);
	//   35   72:aload           5
	//   36   74:ldc2w           #593 <Long 220L>
	//   37   77:invokevirtual   #598 <Method void AlphaAnimation.setDuration(long)>
		((AnimationSet) (context)).addAnimation(((Animation) (obj)));
	//   38   80:aload_0         
	//   39   81:aload           5
	//   40   83:invokevirtual   #617 <Method void AnimationSet.addAnimation(Animation)>
		return new AnimationOrAnimator(((Animation) (context)));
	//   41   86:new             #26  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   42   89:dup             
	//   43   90:aload_0         
	//   44   91:invokespecial   #600 <Method void FragmentManagerImpl$AnimationOrAnimator(Animation)>
	//   45   94:areturn         
	}

	private void makeRemovedFragmentsInvisible(ArraySet arrayset)
	{
		int j = arrayset.size();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #618 <Method int ArraySet.size()>
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
	//   10   14:invokevirtual   #619 <Method Object ArraySet.valueAt(int)>
	//   11   17:checkcast       #204 <Class Fragment>
	//   12   20:astore          4
			if(!fragment.mAdded)
	//*  13   22:aload           4
	//*  14   24:getfield        #621 <Field boolean Fragment.mAdded>
	//*  15   27:ifne            53
			{
				View view = fragment.getView();
	//   16   30:aload           4
	//   17   32:invokevirtual   #624 <Method View Fragment.getView()>
	//   18   35:astore          5
				fragment.mPostponedAlpha = view.getAlpha();
	//   19   37:aload           4
	//   20   39:aload           5
	//   21   41:invokevirtual   #628 <Method float View.getAlpha()>
	//   22   44:putfield        #632 <Field float Fragment.mPostponedAlpha>
				view.setAlpha(0.0F);
	//   23   47:aload           5
	//   24   49:fconst_0        
	//   25   50:invokevirtual   #635 <Method void View.setAlpha(float)>
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
	//*   5    7:instanceof      #639 <Class ValueAnimator>
	//*   6   10:ifeq            53
		{
			animator = ((Animator) (((ValueAnimator)animator).getValues()));
	//    7   13:aload_0         
	//    8   14:checkcast       #639 <Class ValueAnimator>
	//    9   17:invokevirtual   #643 <Method PropertyValuesHolder[] ValueAnimator.getValues()>
	//   10   20:astore_0        
			for(int i = 0; i < animator.length; i++)
	//*  11   21:iconst_0        
	//*  12   22:istore_1        
	//*  13   23:iload_1         
	//*  14   24:aload_0         
	//*  15   25:arraylength     
	//*  16   26:icmpge          105
				if("alpha".equals(((Object) (((PropertyValuesHolder) (animator[i])).getPropertyName()))))
	//*  17   29:ldc2            #645 <String "alpha">
	//*  18   32:aload_0         
	//*  19   33:iload_1         
	//*  20   34:aaload          
	//*  21   35:invokevirtual   #650 <Method String PropertyValuesHolder.getPropertyName()>
	//*  22   38:invokevirtual   #655 <Method boolean String.equals(Object)>
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
	//*  32   54:instanceof      #657 <Class AnimatorSet>
	//*  33   57:ifeq            105
		{
			animator = ((Animator) (((AnimatorSet)animator).getChildAnimations()));
	//   34   60:aload_0         
	//   35   61:checkcast       #657 <Class AnimatorSet>
	//   36   64:invokevirtual   #661 <Method ArrayList AnimatorSet.getChildAnimations()>
	//   37   67:astore_0        
			for(int j = 0; j < ((List) (animator)).size(); j++)
	//*  38   68:iconst_0        
	//*  39   69:istore_1        
	//*  40   70:iload_1         
	//*  41   71:aload_0         
	//*  42   72:invokeinterface #664 <Method int List.size()>
	//*  43   77:icmpge          105
				if(modifiesAlpha((Animator)((List) (animator)).get(j)))
	//*  44   80:aload_0         
	//*  45   81:iload_1         
	//*  46   82:invokeinterface #665 <Method Object List.get(int)>
	//*  47   87:checkcast       #297 <Class Animator>
	//*  48   90:invokestatic    #667 <Method boolean modifiesAlpha(Animator)>
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
	//*   1    1:getfield        #255 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//*   2    4:instanceof      #585 <Class AlphaAnimation>
	//*   3    7:ifeq            12
			return true;
	//    4   10:iconst_1        
	//    5   11:ireturn         
		if(animationoranimator.animation instanceof AnimationSet)
	//*   6   12:aload_0         
	//*   7   13:getfield        #255 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//*   8   16:instanceof      #604 <Class AnimationSet>
	//*   9   19:ifeq            69
		{
			animationoranimator = ((AnimationOrAnimator) (((AnimationSet)animationoranimator.animation).getAnimations()));
	//   10   22:aload_0         
	//   11   23:getfield        #255 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   12   26:checkcast       #604 <Class AnimationSet>
	//   13   29:invokevirtual   #672 <Method List AnimationSet.getAnimations()>
	//   14   32:astore_0        
			for(int i = 0; i < ((List) (animationoranimator)).size(); i++)
	//*  15   33:iconst_0        
	//*  16   34:istore_1        
	//*  17   35:iload_1         
	//*  18   36:aload_0         
	//*  19   37:invokeinterface #664 <Method int List.size()>
	//*  20   42:icmpge          67
				if(((List) (animationoranimator)).get(i) instanceof AlphaAnimation)
	//*  21   45:aload_0         
	//*  22   46:iload_1         
	//*  23   47:invokeinterface #665 <Method Object List.get(int)>
	//*  24   52:instanceof      #585 <Class AlphaAnimation>
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
	//   36   70:getfield        #288 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   37   73:invokestatic    #667 <Method boolean modifiesAlpha(Animator)>
	//   38   76:ireturn         
		}
	}

	private boolean popBackStackImmediate(String s, int i, int j)
	{
		boolean flag;
		execPendingActions();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #369 <Method boolean execPendingActions()>
	//    2    4:pop             
		ensureExecReady(true);
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokespecial   #676 <Method void ensureExecReady(boolean)>
		Object obj = ((Object) (mPrimaryNav));
	//    6   10:aload_0         
	//    7   11:getfield        #678 <Field Fragment mPrimaryNav>
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
	//   16   31:invokevirtual   #682 <Method FragmentManager Fragment.peekChildFragmentManager()>
	//   17   34:astore          5
			if(obj != null && ((FragmentManager) (obj)).popBackStackImmediate())
	//*  18   36:aload           5
	//*  19   38:ifnull          51
	//*  20   41:aload           5
	//*  21   43:invokevirtual   #684 <Method boolean FragmentManager.popBackStackImmediate()>
	//*  22   46:ifeq            51
				return true;
	//   23   49:iconst_1        
	//   24   50:ireturn         
		}
		flag = popBackStackState(mTmpRecords, mTmpIsPop, s, i, j);
	//   25   51:aload_0         
	//   26   52:aload_0         
	//   27   53:getfield        #362 <Field ArrayList mTmpRecords>
	//   28   56:aload_0         
	//   29   57:getfield        #357 <Field ArrayList mTmpIsPop>
	//   30   60:aload_1         
	//   31   61:iload_2         
	//   32   62:iload_3         
	//   33   63:invokevirtual   #688 <Method boolean popBackStackState(ArrayList, ArrayList, String, int, int)>
	//   34   66:istore          4
		if(!flag)
			break MISSING_BLOCK_LABEL_104;
	//   35   68:iload           4
	//   36   70:ifeq            104
		mExecutingActions = true;
	//   37   73:aload_0         
	//   38   74:iconst_1        
	//   39   75:putfield        #355 <Field boolean mExecutingActions>
		removeRedundantOperationsAndExecute(mTmpRecords, mTmpIsPop);
	//   40   78:aload_0         
	//   41   79:aload_0         
	//   42   80:getfield        #362 <Field ArrayList mTmpRecords>
	//   43   83:aload_0         
	//   44   84:getfield        #357 <Field ArrayList mTmpIsPop>
	//   45   87:invokespecial   #691 <Method void removeRedundantOperationsAndExecute(ArrayList, ArrayList)>
		cleanupExec();
	//   46   90:aload_0         
	//   47   91:invokespecial   #693 <Method void cleanupExec()>
		break MISSING_BLOCK_LABEL_104;
	//   48   94:goto            104
		s;
	//   49   97:astore_1        
		cleanupExec();
	//   50   98:aload_0         
	//   51   99:invokespecial   #693 <Method void cleanupExec()>
		throw s;
	//   52  102:aload_1         
	//   53  103:athrow          
		doPendingDeferredStart();
	//   54  104:aload_0         
	//   55  105:invokevirtual   #696 <Method void doPendingDeferredStart()>
		burpActive();
	//   56  108:aload_0         
	//   57  109:invokespecial   #698 <Method void burpActive()>
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
	//   11   19:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #431 <Class BackStackRecord>
	//   13   25:astore          11
			boolean flag1 = ((Boolean)arraylist1.get(k)).booleanValue();
	//   14   27:aload_2         
	//   15   28:iload           6
	//   16   30:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   17   33:checkcast       #433 <Class Boolean>
	//   18   36:invokevirtual   #436 <Method boolean Boolean.booleanValue()>
	//   19   39:istore          10
			boolean flag;
			if(backstackrecord.isPostponed() && !backstackrecord.interactsWith(arraylist, k + 1, j))
	//*  20   41:aload           11
	//*  21   43:invokevirtual   #701 <Method boolean BackStackRecord.isPostponed()>
	//*  22   46:ifeq            70
	//*  23   49:aload           11
	//*  24   51:aload_1         
	//*  25   52:iload           6
	//*  26   54:iconst_1        
	//*  27   55:iadd            
	//*  28   56:iload           4
	//*  29   58:invokevirtual   #522 <Method boolean BackStackRecord.interactsWith(ArrayList, int, int)>
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
	//*  41   83:getfield        #501 <Field ArrayList mPostponedTransactions>
	//*  42   86:ifnonnull       100
					mPostponedTransactions = new ArrayList();
	//   43   89:aload_0         
	//   44   90:new             #167 <Class ArrayList>
	//   45   93:dup             
	//   46   94:invokespecial   #168 <Method void ArrayList()>
	//   47   97:putfield        #501 <Field ArrayList mPostponedTransactions>
				StartEnterTransitionListener startentertransitionlistener = new StartEnterTransitionListener(backstackrecord, flag1);
	//   48  100:new             #47  <Class FragmentManagerImpl$StartEnterTransitionListener>
	//   49  103:dup             
	//   50  104:aload           11
	//   51  106:iload           10
	//   52  108:invokespecial   #704 <Method void FragmentManagerImpl$StartEnterTransitionListener(BackStackRecord, boolean)>
	//   53  111:astore          12
				mPostponedTransactions.add(((Object) (startentertransitionlistener)));
	//   54  113:aload_0         
	//   55  114:getfield        #501 <Field ArrayList mPostponedTransactions>
	//   56  117:aload           12
	//   57  119:invokevirtual   #705 <Method boolean ArrayList.add(Object)>
	//   58  122:pop             
				backstackrecord.setOnStartPostponedListener(((Fragment.OnStartEnterTransitionListener) (startentertransitionlistener)));
	//   59  123:aload           11
	//   60  125:aload           12
	//   61  127:invokevirtual   #709 <Method void BackStackRecord.setOnStartPostponedListener(Fragment$OnStartEnterTransitionListener)>
				if(flag1)
	//*  62  130:iload           10
	//*  63  132:ifeq            143
					backstackrecord.executeOps();
	//   64  135:aload           11
	//   65  137:invokevirtual   #444 <Method void BackStackRecord.executeOps()>
				else
	//*  66  140:goto            149
					backstackrecord.executePopOps(false);
	//   67  143:aload           11
	//   68  145:iconst_0        
	//   69  146:invokevirtual   #442 <Method void BackStackRecord.executePopOps(boolean)>
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
	//   79  165:invokevirtual   #525 <Method Object ArrayList.remove(int)>
	//   80  168:pop             
					arraylist.add(i1, ((Object) (backstackrecord)));
	//   81  169:aload_1         
	//   82  170:iload           8
	//   83  172:aload           11
	//   84  174:invokevirtual   #712 <Method void ArrayList.add(int, Object)>
				}
				addAddedFragments(arrayset);
	//   85  177:aload_0         
	//   86  178:aload           5
	//   87  180:invokespecial   #480 <Method void addAddedFragments(ArraySet)>
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
	//*   3    5:invokevirtual   #535 <Method boolean ArrayList.isEmpty()>
	//*   4    8:ifeq            12
				return;
	//    5   11:return          
			if(arraylist1 != null && arraylist.size() == arraylist1.size())
	//*   6   12:aload_2         
	//*   7   13:ifnull          212
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #198 <Method int ArrayList.size()>
	//*  10   20:aload_2         
	//*  11   21:invokevirtual   #198 <Method int ArrayList.size()>
	//*  12   24:icmpne          212
			{
				executePostponedTransaction(arraylist, arraylist1);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:aload_2         
	//   16   30:invokespecial   #421 <Method void executePostponedTransaction(ArrayList, ArrayList)>
				int i1 = arraylist.size();
	//   17   33:aload_1         
	//   18   34:invokevirtual   #198 <Method int ArrayList.size()>
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
	//*  33   59:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//*  34   62:checkcast       #431 <Class BackStackRecord>
	//*  35   65:getfield        #449 <Field boolean BackStackRecord.mReorderingAllowed>
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
	//   45   83:invokespecial   #715 <Method void executeOpsTogether(ArrayList, ArrayList, int, int)>
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
	//*  54   97:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//*  55  100:checkcast       #433 <Class Boolean>
	//*  56  103:invokevirtual   #436 <Method boolean Boolean.booleanValue()>
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
	//   67  127:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   68  130:checkcast       #433 <Class Boolean>
	//   69  133:invokevirtual   #436 <Method boolean Boolean.booleanValue()>
	//   70  136:ifeq            167
								j = k;
	//   71  139:iload           5
	//   72  141:istore          4
								if(((BackStackRecord)arraylist.get(k)).mReorderingAllowed)
									break;
	//   73  143:aload_1         
	//   74  144:iload           5
	//   75  146:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   76  149:checkcast       #431 <Class BackStackRecord>
	//   77  152:getfield        #449 <Field boolean BackStackRecord.mReorderingAllowed>
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
	//   89  173:invokespecial   #715 <Method void executeOpsTogether(ArrayList, ArrayList, int, int)>
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
	//  109  208:invokespecial   #715 <Method void executeOpsTogether(ArrayList, ArrayList, int, int)>
				return;
	//  110  211:return          
			} else
			{
				throw new IllegalStateException("Internal error with the back stack records");
	//  111  212:new             #343 <Class IllegalStateException>
	//  112  215:dup             
	//  113  216:ldc2            #717 <String "Internal error with the back stack records">
	//  114  219:invokespecial   #350 <Method void IllegalStateException(String)>
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
	//*   7   11:invokestatic    #722 <Method boolean shouldRunOnHWLayer(View, FragmentManagerImpl$AnimationOrAnimator)>
	//*   8   14:ifeq            70
			{
				if(animationoranimator.animator != null)
	//*   9   17:aload_1         
	//*  10   18:getfield        #288 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//*  11   21:ifnull          40
				{
					animationoranimator.animator.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorOnHWLayerIfNeededListener(view))));
	//   12   24:aload_1         
	//   13   25:getfield        #288 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   14   28:new             #29  <Class FragmentManagerImpl$AnimatorOnHWLayerIfNeededListener>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #724 <Method void FragmentManagerImpl$AnimatorOnHWLayerIfNeededListener(View)>
	//   18   36:invokevirtual   #301 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
					return;
	//   19   39:return          
				}
				android.view.animation.Animation.AnimationListener animationlistener = getAnimationListener(animationoranimator.animation);
	//   20   40:aload_1         
	//   21   41:getfield        #255 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   22   44:invokestatic    #265 <Method android.view.animation.Animation$AnimationListener getAnimationListener(Animation)>
	//   23   47:astore_2        
				view.setLayerType(2, ((android.graphics.Paint) (null)));
	//   24   48:aload_0         
	//   25   49:iconst_2        
	//   26   50:aconst_null     
	//   27   51:invokevirtual   #728 <Method void View.setLayerType(int, android.graphics.Paint)>
				animationoranimator.animation.setAnimationListener(((android.view.animation.Animation.AnimationListener) (new AnimateOnHWLayerIfNeededListener(view, animationlistener))));
	//   28   54:aload_1         
	//   29   55:getfield        #255 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   30   58:new             #18  <Class FragmentManagerImpl$AnimateOnHWLayerIfNeededListener>
	//   31   61:dup             
	//   32   62:aload_0         
	//   33   63:aload_2         
	//   34   64:invokespecial   #731 <Method void FragmentManagerImpl$AnimateOnHWLayerIfNeededListener(View, android.view.animation.Animation$AnimationListener)>
	//   35   67:invokevirtual   #274 <Method void Animation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
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
	//    4    6:invokevirtual   #738 <Method List FragmentManagerNonConfig.getFragments()>
	//    5    9:astore_1        
		if(obj != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          46
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*   8   14:aload_1         
	//*   9   15:invokeinterface #742 <Method Iterator List.iterator()>
	//*  10   20:astore_1        
	//*  11   21:aload_1         
	//*  12   22:invokeinterface #747 <Method boolean Iterator.hasNext()>
	//*  13   27:ifeq            46
				((Fragment)((Iterator) (obj)).next()).mRetaining = true;
	//   14   30:aload_1         
	//   15   31:invokeinterface #751 <Method Object Iterator.next()>
	//   16   36:checkcast       #204 <Class Fragment>
	//   17   39:iconst_1        
	//   18   40:putfield        #754 <Field boolean Fragment.mRetaining>

	//*  19   43:goto            21
		fragmentmanagernonconfig = ((FragmentManagerNonConfig) (fragmentmanagernonconfig.getChildNonConfigs()));
	//   20   46:aload_0         
	//   21   47:invokevirtual   #757 <Method List FragmentManagerNonConfig.getChildNonConfigs()>
	//   22   50:astore_0        
		if(fragmentmanagernonconfig != null)
	//*  23   51:aload_0         
	//*  24   52:ifnull          86
			for(fragmentmanagernonconfig = ((FragmentManagerNonConfig) (((List) (fragmentmanagernonconfig)).iterator())); ((Iterator) (fragmentmanagernonconfig)).hasNext(); setRetaining((FragmentManagerNonConfig)((Iterator) (fragmentmanagernonconfig)).next()));
	//   25   55:aload_0         
	//   26   56:invokeinterface #742 <Method Iterator List.iterator()>
	//   27   61:astore_0        
	//   28   62:aload_0         
	//   29   63:invokeinterface #747 <Method boolean Iterator.hasNext()>
	//   30   68:ifeq            86
	//   31   71:aload_0         
	//   32   72:invokeinterface #751 <Method Object Iterator.next()>
	//   33   77:checkcast       #735 <Class FragmentManagerNonConfig>
	//   34   80:invokestatic    #759 <Method void setRetaining(FragmentManagerNonConfig)>
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
	//*  10   14:getstatic       #764 <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   17:bipush          19
	//*  12   19:icmplt          51
			{
				flag = flag1;
	//   13   22:iload_3         
	//   14   23:istore_2        
				if(view.getLayerType() == 0)
	//*  15   24:aload_0         
	//*  16   25:invokevirtual   #767 <Method int View.getLayerType()>
	//*  17   28:ifne            51
				{
					flag = flag1;
	//   18   31:iload_3         
	//   19   32:istore_2        
					if(ViewCompat.hasOverlappingRendering(view))
	//*  20   33:aload_0         
	//*  21   34:invokestatic    #773 <Method boolean ViewCompat.hasOverlappingRendering(View)>
	//*  22   37:ifeq            51
					{
						flag = flag1;
	//   23   40:iload_3         
	//   24   41:istore_2        
						if(modifiesAlpha(animationoranimator))
	//*  25   42:aload_1         
	//*  26   43:invokestatic    #775 <Method boolean modifiesAlpha(FragmentManagerImpl$AnimationOrAnimator)>
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
	//    0    0:ldc1            #75  <String "FragmentManager">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #784 <Method String RuntimeException.getMessage()>
	//    3    6:invokestatic    #787 <Method int Log.e(String, String)>
	//    4    9:pop             
		Log.e("FragmentManager", "Activity state:");
	//    5   10:ldc1            #75  <String "FragmentManager">
	//    6   12:ldc2            #789 <String "Activity state:">
	//    7   15:invokestatic    #787 <Method int Log.e(String, String)>
	//    8   18:pop             
		Object obj = ((Object) (new PrintWriter(((java.io.Writer) (new LogWriter("FragmentManager"))))));
	//    9   19:new             #791 <Class PrintWriter>
	//   10   22:dup             
	//   11   23:new             #793 <Class LogWriter>
	//   12   26:dup             
	//   13   27:ldc1            #75  <String "FragmentManager">
	//   14   29:invokespecial   #794 <Method void LogWriter(String)>
	//   15   32:invokespecial   #797 <Method void PrintWriter(java.io.Writer)>
	//   16   35:astore_2        
		FragmentHostCallback fragmenthostcallback = mHost;
	//   17   36:aload_0         
	//   18   37:getfield        #398 <Field FragmentHostCallback mHost>
	//   19   40:astore_3        
		if(fragmenthostcallback != null)
	//*  20   41:aload_3         
	//*  21   42:ifnull          75
			try
			{
				fragmenthostcallback.onDump("  ", ((FileDescriptor) (null)), ((PrintWriter) (obj)), new String[0]);
	//   22   45:aload_3         
	//   23   46:ldc2            #799 <String "  ">
	//   24   49:aconst_null     
	//   25   50:aload_2         
	//   26   51:iconst_0        
	//   27   52:anewarray       String[]
	//   28   55:invokevirtual   #803 <Method void FragmentHostCallback.onDump(String, FileDescriptor, PrintWriter, String[])>
			}
	//*  29   58:goto            102
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  30   61:astore_2        
			{
				Log.e("FragmentManager", "Failed dumping state", ((Throwable) (obj)));
	//   31   62:ldc1            #75  <String "FragmentManager">
	//   32   64:ldc2            #805 <String "Failed dumping state">
	//   33   67:aload_2         
	//   34   68:invokestatic    #579 <Method int Log.e(String, String, Throwable)>
	//   35   71:pop             
			}
		else
	//*  36   72:goto            102
			try
			{
				dump("  ", ((FileDescriptor) (null)), ((PrintWriter) (obj)), new String[0]);
	//   37   75:aload_0         
	//   38   76:ldc2            #799 <String "  ">
	//   39   79:aconst_null     
	//   40   80:aload_2         
	//   41   81:iconst_0        
	//   42   82:anewarray       String[]
	//   43   85:invokevirtual   #808 <Method void dump(String, FileDescriptor, PrintWriter, String[])>
			}
	//*  44   88:goto            102
			catch(Exception exception)
	//*  45   91:astore_2        
			{
				Log.e("FragmentManager", "Failed dumping state", ((Throwable) (exception)));
	//   46   92:ldc1            #75  <String "FragmentManager">
	//   47   94:ldc2            #805 <String "Failed dumping state">
	//   48   97:aload_2         
	//   49   98:invokestatic    #579 <Method int Log.e(String, String, Throwable)>
	//   50  101:pop             
			}
		throw runtimeexception;
	//   51  102:aload_1         
	//   52  103:athrow          
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
	//*   1    1:getfield        #814 <Field ArrayList mBackStack>
	//*   2    4:ifnonnull       18
			mBackStack = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #167 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #168 <Method void ArrayList()>
	//    7   15:putfield        #814 <Field ArrayList mBackStack>
		mBackStack.add(((Object) (backstackrecord)));
	//    8   18:aload_0         
	//    9   19:getfield        #814 <Field ArrayList mBackStack>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #705 <Method boolean ArrayList.add(Object)>
	//   12   26:pop             
	//   13   27:return          
	}

	public void addFragment(Fragment fragment, boolean flag)
	{
		if(DEBUG)
	//*   0    0:getstatic       #818 <Field boolean DEBUG>
	//*   1    3:ifeq            38
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #334 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #335 <Method void StringBuilder()>
	//    5   13:astore_3        
			stringbuilder.append("add: ");
	//    6   14:aload_3         
	//    7   15:ldc2            #820 <String "add: ">
	//    8   18:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (fragment)));
	//   10   22:aload_3         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   14   28:ldc1            #75  <String "FragmentManager">
	//   15   30:aload_3         
	//   16   31:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #826 <Method int Log.v(String, String)>
	//   18   37:pop             
		}
		makeActive(fragment);
	//   19   38:aload_0         
	//   20   39:aload_1         
	//   21   40:invokevirtual   #830 <Method void makeActive(Fragment)>
		if(!fragment.mDetached)
	//*  22   43:aload_1         
	//*  23   44:getfield        #833 <Field boolean Fragment.mDetached>
	//*  24   47:ifne            169
			if(!mAdded.contains(((Object) (fragment))))
	//*  25   50:aload_0         
	//*  26   51:getfield        #170 <Field ArrayList mAdded>
	//*  27   54:aload_1         
	//*  28   55:invokevirtual   #836 <Method boolean ArrayList.contains(Object)>
	//*  29   58:ifne            135
			{
				synchronized(mAdded)
	//*  30   61:aload_0         
	//*  31   62:getfield        #170 <Field ArrayList mAdded>
	//*  32   65:astore_3        
	//*  33   66:aload_3         
	//*  34   67:monitorenter    
				{
					mAdded.add(((Object) (fragment)));
	//   35   68:aload_0         
	//   36   69:getfield        #170 <Field ArrayList mAdded>
	//   37   72:aload_1         
	//   38   73:invokevirtual   #705 <Method boolean ArrayList.add(Object)>
	//   39   76:pop             
				}
	//   40   77:aload_3         
	//   41   78:monitorexit     
				fragment.mAdded = true;
	//   42   79:aload_1         
	//   43   80:iconst_1        
	//   44   81:putfield        #621 <Field boolean Fragment.mAdded>
				fragment.mRemoving = false;
	//   45   84:aload_1         
	//   46   85:iconst_0        
	//   47   86:putfield        #839 <Field boolean Fragment.mRemoving>
				if(fragment.mView == null)
	//*  48   89:aload_1         
	//*  49   90:getfield        #221 <Field View Fragment.mView>
	//*  50   93:ifnonnull       101
					fragment.mHiddenChanged = false;
	//   51   96:aload_1         
	//   52   97:iconst_0        
	//   53   98:putfield        #842 <Field boolean Fragment.mHiddenChanged>
				if(fragment.mHasMenu && fragment.mMenuVisible)
	//*  54  101:aload_1         
	//*  55  102:getfield        #845 <Field boolean Fragment.mHasMenu>
	//*  56  105:ifeq            120
	//*  57  108:aload_1         
	//*  58  109:getfield        #848 <Field boolean Fragment.mMenuVisible>
	//*  59  112:ifeq            120
					mNeedMenuInvalidate = true;
	//   60  115:aload_0         
	//   61  116:iconst_1        
	//   62  117:putfield        #850 <Field boolean mNeedMenuInvalidate>
				if(flag)
	//*  63  120:iload_2         
	//*  64  121:ifeq            169
				{
					moveToState(fragment);
	//   65  124:aload_0         
	//   66  125:aload_1         
	//   67  126:invokevirtual   #852 <Method void moveToState(Fragment)>
					return;
	//   68  129:return          
				}
			} else
	//*  69  130:astore_1        
	//*  70  131:aload_3         
	//*  71  132:monitorexit     
	//*  72  133:aload_1         
	//*  73  134:athrow          
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   74  135:new             #334 <Class StringBuilder>
	//   75  138:dup             
	//   76  139:invokespecial   #335 <Method void StringBuilder()>
	//   77  142:astore_3        
				stringbuilder1.append("Fragment already added: ");
	//   78  143:aload_3         
	//   79  144:ldc2            #854 <String "Fragment already added: ">
	//   80  147:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   81  150:pop             
				stringbuilder1.append(((Object) (fragment)));
	//   82  151:aload_3         
	//   83  152:aload_1         
	//   84  153:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//   85  156:pop             
				throw new IllegalStateException(stringbuilder1.toString());
	//   86  157:new             #343 <Class IllegalStateException>
	//   87  160:dup             
	//   88  161:aload_3         
	//   89  162:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   90  165:invokespecial   #350 <Method void IllegalStateException(String)>
	//   91  168:athrow          
			}
		break MISSING_BLOCK_LABEL_169;
		fragment;
		arraylist;
		JVM INSTR monitorexit ;
		throw fragment;
	//   92  169:return          
	}

	public void addOnBackStackChangedListener(FragmentManager.OnBackStackChangedListener onbackstackchangedlistener)
	{
		if(mBackStackChangeListeners == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #858 <Field ArrayList mBackStackChangeListeners>
	//*   2    4:ifnonnull       18
			mBackStackChangeListeners = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #167 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #168 <Method void ArrayList()>
	//    7   15:putfield        #858 <Field ArrayList mBackStackChangeListeners>
		mBackStackChangeListeners.add(((Object) (onbackstackchangedlistener)));
	//    8   18:aload_0         
	//    9   19:getfield        #858 <Field ArrayList mBackStackChangeListeners>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #705 <Method boolean ArrayList.add(Object)>
	//   12   26:pop             
	//   13   27:return          
	}

	public int allocBackStackIndex(BackStackRecord backstackrecord)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mAvailBackStackIndices == null || mAvailBackStackIndices.size() <= 0)
	//*   2    2:aload_0         
	//*   3    3:getfield        #862 <Field ArrayList mAvailBackStackIndices>
	//*   4    6:ifnull          111
	//*   5    9:aload_0         
	//*   6   10:getfield        #862 <Field ArrayList mAvailBackStackIndices>
	//*   7   13:invokevirtual   #198 <Method int ArrayList.size()>
	//*   8   16:ifgt            22
			break MISSING_BLOCK_LABEL_111;
	//    9   19:goto            111
		int i;
		i = ((Integer)mAvailBackStackIndices.remove(mAvailBackStackIndices.size() - 1)).intValue();
	//   10   22:aload_0         
	//   11   23:getfield        #862 <Field ArrayList mAvailBackStackIndices>
	//   12   26:aload_0         
	//   13   27:getfield        #862 <Field ArrayList mAvailBackStackIndices>
	//   14   30:invokevirtual   #198 <Method int ArrayList.size()>
	//   15   33:iconst_1        
	//   16   34:isub            
	//   17   35:invokevirtual   #525 <Method Object ArrayList.remove(int)>
	//   18   38:checkcast       #864 <Class Integer>
	//   19   41:invokevirtual   #867 <Method int Integer.intValue()>
	//   20   44:istore_2        
		if(DEBUG)
	//*  21   45:getstatic       #818 <Field boolean DEBUG>
	//*  22   48:ifeq            97
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   23   51:new             #334 <Class StringBuilder>
	//   24   54:dup             
	//   25   55:invokespecial   #335 <Method void StringBuilder()>
	//   26   58:astore_3        
			stringbuilder.append("Adding back stack index ");
	//   27   59:aload_3         
	//   28   60:ldc2            #869 <String "Adding back stack index ">
	//   29   63:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   30   66:pop             
			stringbuilder.append(i);
	//   31   67:aload_3         
	//   32   68:iload_2         
	//   33   69:invokevirtual   #872 <Method StringBuilder StringBuilder.append(int)>
	//   34   72:pop             
			stringbuilder.append(" with ");
	//   35   73:aload_3         
	//   36   74:ldc2            #874 <String " with ">
	//   37   77:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   38   80:pop             
			stringbuilder.append(((Object) (backstackrecord)));
	//   39   81:aload_3         
	//   40   82:aload_1         
	//   41   83:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//   42   86:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   43   87:ldc1            #75  <String "FragmentManager">
	//   44   89:aload_3         
	//   45   90:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   46   93:invokestatic    #826 <Method int Log.v(String, String)>
	//   47   96:pop             
		}
		mBackStackIndices.set(i, ((Object) (backstackrecord)));
	//   48   97:aload_0         
	//   49   98:getfield        #876 <Field ArrayList mBackStackIndices>
	//   50  101:iload_2         
	//   51  102:aload_1         
	//   52  103:invokevirtual   #880 <Method Object ArrayList.set(int, Object)>
	//   53  106:pop             
		this;
	//   54  107:aload_0         
		JVM INSTR monitorexit ;
	//   55  108:monitorexit     
		return i;
	//   56  109:iload_2         
	//   57  110:ireturn         
		if(mBackStackIndices == null)
	//*  58  111:aload_0         
	//*  59  112:getfield        #876 <Field ArrayList mBackStackIndices>
	//*  60  115:ifnonnull       129
			mBackStackIndices = new ArrayList();
	//   61  118:aload_0         
	//   62  119:new             #167 <Class ArrayList>
	//   63  122:dup             
	//   64  123:invokespecial   #168 <Method void ArrayList()>
	//   65  126:putfield        #876 <Field ArrayList mBackStackIndices>
		i = mBackStackIndices.size();
	//   66  129:aload_0         
	//   67  130:getfield        #876 <Field ArrayList mBackStackIndices>
	//   68  133:invokevirtual   #198 <Method int ArrayList.size()>
	//   69  136:istore_2        
		if(DEBUG)
	//*  70  137:getstatic       #818 <Field boolean DEBUG>
	//*  71  140:ifeq            189
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   72  143:new             #334 <Class StringBuilder>
	//   73  146:dup             
	//   74  147:invokespecial   #335 <Method void StringBuilder()>
	//   75  150:astore_3        
			stringbuilder1.append("Setting back stack index ");
	//   76  151:aload_3         
	//   77  152:ldc2            #882 <String "Setting back stack index ">
	//   78  155:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   79  158:pop             
			stringbuilder1.append(i);
	//   80  159:aload_3         
	//   81  160:iload_2         
	//   82  161:invokevirtual   #872 <Method StringBuilder StringBuilder.append(int)>
	//   83  164:pop             
			stringbuilder1.append(" to ");
	//   84  165:aload_3         
	//   85  166:ldc2            #884 <String " to ">
	//   86  169:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   87  172:pop             
			stringbuilder1.append(((Object) (backstackrecord)));
	//   88  173:aload_3         
	//   89  174:aload_1         
	//   90  175:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//   91  178:pop             
			Log.v("FragmentManager", stringbuilder1.toString());
	//   92  179:ldc1            #75  <String "FragmentManager">
	//   93  181:aload_3         
	//   94  182:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   95  185:invokestatic    #826 <Method int Log.v(String, String)>
	//   96  188:pop             
		}
		mBackStackIndices.add(((Object) (backstackrecord)));
	//   97  189:aload_0         
	//   98  190:getfield        #876 <Field ArrayList mBackStackIndices>
	//   99  193:aload_1         
	//  100  194:invokevirtual   #705 <Method boolean ArrayList.add(Object)>
	//  101  197:pop             
		this;
	//  102  198:aload_0         
		JVM INSTR monitorexit ;
	//  103  199:monitorexit     
		return i;
	//  104  200:iload_2         
	//  105  201:ireturn         
		backstackrecord;
	//  106  202:astore_1        
		this;
	//  107  203:aload_0         
		JVM INSTR monitorexit ;
	//  108  204:monitorexit     
		throw backstackrecord;
	//  109  205:aload_1         
	//  110  206:athrow          
	}

	public void attachController(FragmentHostCallback fragmenthostcallback, FragmentContainer fragmentcontainer, Fragment fragment)
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #398 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       23
		{
			mHost = fragmenthostcallback;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #398 <Field FragmentHostCallback mHost>
			mContainer = fragmentcontainer;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #888 <Field FragmentContainer mContainer>
			mParent = fragment;
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:putfield        #890 <Field Fragment mParent>
			return;
	//   12   22:return          
		} else
		{
			throw new IllegalStateException("Already attached");
	//   13   23:new             #343 <Class IllegalStateException>
	//   14   26:dup             
	//   15   27:ldc2            #892 <String "Already attached">
	//   16   30:invokespecial   #350 <Method void IllegalStateException(String)>
	//   17   33:athrow          
		}
	}

	public void attachFragment(Fragment fragment)
	{
		if(DEBUG)
	//*   0    0:getstatic       #818 <Field boolean DEBUG>
	//*   1    3:ifeq            38
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #334 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #335 <Method void StringBuilder()>
	//    5   13:astore_2        
			stringbuilder.append("attach: ");
	//    6   14:aload_2         
	//    7   15:ldc2            #895 <String "attach: ">
	//    8   18:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (fragment)));
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   14   28:ldc1            #75  <String "FragmentManager">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #826 <Method int Log.v(String, String)>
	//   18   37:pop             
		}
		if(fragment.mDetached)
	//*  19   38:aload_1         
	//*  20   39:getfield        #833 <Field boolean Fragment.mDetached>
	//*  21   42:ifeq            188
		{
			fragment.mDetached = false;
	//   22   45:aload_1         
	//   23   46:iconst_0        
	//   24   47:putfield        #833 <Field boolean Fragment.mDetached>
			if(!fragment.mAdded)
	//*  25   50:aload_1         
	//*  26   51:getfield        #621 <Field boolean Fragment.mAdded>
	//*  27   54:ifne            188
				if(!mAdded.contains(((Object) (fragment))))
	//*  28   57:aload_0         
	//*  29   58:getfield        #170 <Field ArrayList mAdded>
	//*  30   61:aload_1         
	//*  31   62:invokevirtual   #836 <Method boolean ArrayList.contains(Object)>
	//*  32   65:ifne            154
				{
					if(DEBUG)
	//*  33   68:getstatic       #818 <Field boolean DEBUG>
	//*  34   71:ifeq            106
					{
						StringBuilder stringbuilder1 = new StringBuilder();
	//   35   74:new             #334 <Class StringBuilder>
	//   36   77:dup             
	//   37   78:invokespecial   #335 <Method void StringBuilder()>
	//   38   81:astore_2        
						stringbuilder1.append("add from attach: ");
	//   39   82:aload_2         
	//   40   83:ldc2            #897 <String "add from attach: ">
	//   41   86:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   42   89:pop             
						stringbuilder1.append(((Object) (fragment)));
	//   43   90:aload_2         
	//   44   91:aload_1         
	//   45   92:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//   46   95:pop             
						Log.v("FragmentManager", stringbuilder1.toString());
	//   47   96:ldc1            #75  <String "FragmentManager">
	//   48   98:aload_2         
	//   49   99:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   50  102:invokestatic    #826 <Method int Log.v(String, String)>
	//   51  105:pop             
					}
					synchronized(mAdded)
	//*  52  106:aload_0         
	//*  53  107:getfield        #170 <Field ArrayList mAdded>
	//*  54  110:astore_2        
	//*  55  111:aload_2         
	//*  56  112:monitorenter    
					{
						mAdded.add(((Object) (fragment)));
	//   57  113:aload_0         
	//   58  114:getfield        #170 <Field ArrayList mAdded>
	//   59  117:aload_1         
	//   60  118:invokevirtual   #705 <Method boolean ArrayList.add(Object)>
	//   61  121:pop             
					}
	//   62  122:aload_2         
	//   63  123:monitorexit     
					fragment.mAdded = true;
	//   64  124:aload_1         
	//   65  125:iconst_1        
	//   66  126:putfield        #621 <Field boolean Fragment.mAdded>
					if(fragment.mHasMenu && fragment.mMenuVisible)
	//*  67  129:aload_1         
	//*  68  130:getfield        #845 <Field boolean Fragment.mHasMenu>
	//*  69  133:ifeq            188
	//*  70  136:aload_1         
	//*  71  137:getfield        #848 <Field boolean Fragment.mMenuVisible>
	//*  72  140:ifeq            188
					{
						mNeedMenuInvalidate = true;
	//   73  143:aload_0         
	//   74  144:iconst_1        
	//   75  145:putfield        #850 <Field boolean mNeedMenuInvalidate>
						return;
	//   76  148:return          
					}
				} else
	//*  77  149:astore_1        
	//*  78  150:aload_2         
	//*  79  151:monitorexit     
	//*  80  152:aload_1         
	//*  81  153:athrow          
				{
					StringBuilder stringbuilder2 = new StringBuilder();
	//   82  154:new             #334 <Class StringBuilder>
	//   83  157:dup             
	//   84  158:invokespecial   #335 <Method void StringBuilder()>
	//   85  161:astore_2        
					stringbuilder2.append("Fragment already added: ");
	//   86  162:aload_2         
	//   87  163:ldc2            #854 <String "Fragment already added: ">
	//   88  166:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   89  169:pop             
					stringbuilder2.append(((Object) (fragment)));
	//   90  170:aload_2         
	//   91  171:aload_1         
	//   92  172:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//   93  175:pop             
					throw new IllegalStateException(stringbuilder2.toString());
	//   94  176:new             #343 <Class IllegalStateException>
	//   95  179:dup             
	//   96  180:aload_2         
	//   97  181:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   98  184:invokespecial   #350 <Method void IllegalStateException(String)>
	//   99  187:athrow          
				}
		}
		break MISSING_BLOCK_LABEL_188;
		fragment;
		arraylist;
		JVM INSTR monitorexit ;
		throw fragment;
	//  100  188:return          
	}

	public FragmentTransaction beginTransaction()
	{
		return ((FragmentTransaction) (new BackStackRecord(this)));
	//    0    0:new             #431 <Class BackStackRecord>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #900 <Method void BackStackRecord(FragmentManagerImpl)>
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
	//    4    7:invokevirtual   #442 <Method void BackStackRecord.executePopOps(boolean)>
		else
	//*   5   10:goto            17
			backstackrecord.executeOps();
	//    6   13:aload_1         
	//    7   14:invokevirtual   #444 <Method void BackStackRecord.executeOps()>
		Object obj = ((Object) (new ArrayList(1)));
	//    8   17:new             #167 <Class ArrayList>
	//    9   20:dup             
	//   10   21:iconst_1        
	//   11   22:invokespecial   #904 <Method void ArrayList(int)>
	//   12   25:astore          7
		ArrayList arraylist = new ArrayList(1);
	//   13   27:new             #167 <Class ArrayList>
	//   14   30:dup             
	//   15   31:iconst_1        
	//   16   32:invokespecial   #904 <Method void ArrayList(int)>
	//   17   35:astore          8
		((ArrayList) (obj)).add(((Object) (backstackrecord)));
	//   18   37:aload           7
	//   19   39:aload_1         
	//   20   40:invokevirtual   #705 <Method boolean ArrayList.add(Object)>
	//   21   43:pop             
		arraylist.add(((Object) (Boolean.valueOf(flag))));
	//   22   44:aload           8
	//   23   46:iload_2         
	//   24   47:invokestatic    #908 <Method Boolean Boolean.valueOf(boolean)>
	//   25   50:invokevirtual   #705 <Method boolean ArrayList.add(Object)>
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
	//   35   66:invokestatic    #475 <Method void FragmentTransition.startTransitions(FragmentManagerImpl, ArrayList, ArrayList, int, int, boolean)>
		if(flag2)
	//*  36   69:iload           4
	//*  37   71:ifeq            83
			moveToState(mCurState, true);
	//   38   74:aload_0         
	//   39   75:aload_0         
	//   40   76:getfield        #177 <Field int mCurState>
	//   41   79:iconst_1        
	//   42   80:invokevirtual   #366 <Method void moveToState(int, boolean)>
		obj = ((Object) (mActive));
	//   43   83:aload_0         
	//   44   84:getfield        #312 <Field SparseArray mActive>
	//   45   87:astore          7
		if(obj != null)
	//*  46   89:aload           7
	//*  47   91:ifnull          218
		{
			int j = ((SparseArray) (obj)).size();
	//   48   94:aload           7
	//   49   96:invokevirtual   #315 <Method int SparseArray.size()>
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
	//   57  112:getfield        #312 <Field SparseArray mActive>
	//   58  115:iload           5
	//   59  117:invokevirtual   #318 <Method Object SparseArray.valueAt(int)>
	//   60  120:checkcast       #204 <Class Fragment>
	//   61  123:astore          7
				if(fragment == null || fragment.mView == null || !fragment.mIsNewlyAdded || !backstackrecord.interactsWith(fragment.mContainerId))
					continue;
	//   62  125:aload           7
	//   63  127:ifnull          209
	//   64  130:aload           7
	//   65  132:getfield        #221 <Field View Fragment.mView>
	//   66  135:ifnull          209
	//   67  138:aload           7
	//   68  140:getfield        #227 <Field boolean Fragment.mIsNewlyAdded>
	//   69  143:ifeq            209
	//   70  146:aload_1         
	//   71  147:aload           7
	//   72  149:getfield        #911 <Field int Fragment.mContainerId>
	//   73  152:invokevirtual   #914 <Method boolean BackStackRecord.interactsWith(int)>
	//   74  155:ifeq            209
				if(fragment.mPostponedAlpha > 0.0F)
	//*  75  158:aload           7
	//*  76  160:getfield        #632 <Field float Fragment.mPostponedAlpha>
	//*  77  163:fconst_0        
	//*  78  164:fcmpl           
	//*  79  165:ifle            181
					fragment.mView.setAlpha(fragment.mPostponedAlpha);
	//   80  168:aload           7
	//   81  170:getfield        #221 <Field View Fragment.mView>
	//   82  173:aload           7
	//   83  175:getfield        #632 <Field float Fragment.mPostponedAlpha>
	//   84  178:invokevirtual   #635 <Method void View.setAlpha(float)>
				if(flag2)
	//*  85  181:iload           4
	//*  86  183:ifeq            195
				{
					fragment.mPostponedAlpha = 0.0F;
	//   87  186:aload           7
	//   88  188:fconst_0        
	//   89  189:putfield        #632 <Field float Fragment.mPostponedAlpha>
				} else
	//*  90  192:goto            209
				{
					fragment.mPostponedAlpha = -1F;
	//   91  195:aload           7
	//   92  197:ldc2            #915 <Float -1F>
	//   93  200:putfield        #632 <Field float Fragment.mPostponedAlpha>
					fragment.mIsNewlyAdded = false;
	//   94  203:aload           7
	//   95  205:iconst_0        
	//   96  206:putfield        #227 <Field boolean Fragment.mIsNewlyAdded>
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
	//*   1    1:getfield        #221 <Field View Fragment.mView>
	//*   2    4:ifnull          211
		{
			AnimationOrAnimator animationoranimator = loadAnimation(fragment, fragment.getNextTransition(), fragment.mHidden ^ true, fragment.getNextTransitionStyle());
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #213 <Method int Fragment.getNextTransition()>
	//    7   13:aload_1         
	//    8   14:getfield        #224 <Field boolean Fragment.mHidden>
	//    9   17:iconst_1        
	//   10   18:ixor            
	//   11   19:aload_1         
	//   12   20:invokevirtual   #919 <Method int Fragment.getNextTransitionStyle()>
	//   13   23:invokevirtual   #923 <Method FragmentManagerImpl$AnimationOrAnimator loadAnimation(Fragment, int, boolean, int)>
	//   14   26:astore_3        
			if(animationoranimator != null && animationoranimator.animator != null)
	//*  15   27:aload_3         
	//*  16   28:ifnull          139
	//*  17   31:aload_3         
	//*  18   32:getfield        #288 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//*  19   35:ifnull          139
			{
				animationoranimator.animator.setTarget(((Object) (fragment.mView)));
	//   20   38:aload_3         
	//   21   39:getfield        #288 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   22   42:aload_1         
	//   23   43:getfield        #221 <Field View Fragment.mView>
	//   24   46:invokevirtual   #305 <Method void Animator.setTarget(Object)>
				if(fragment.mHidden)
	//*  25   49:aload_1         
	//*  26   50:getfield        #224 <Field boolean Fragment.mHidden>
	//*  27   53:ifeq            113
				{
					if(fragment.isHideReplaced())
	//*  28   56:aload_1         
	//*  29   57:invokevirtual   #926 <Method boolean Fragment.isHideReplaced()>
	//*  30   60:ifeq            71
					{
						fragment.setHideReplaced(false);
	//   31   63:aload_1         
	//   32   64:iconst_0        
	//   33   65:invokevirtual   #929 <Method void Fragment.setHideReplaced(boolean)>
					} else
	//*  34   68:goto            121
					{
						final ViewGroup container = fragment.mContainer;
	//   35   71:aload_1         
	//   36   72:getfield        #241 <Field ViewGroup Fragment.mContainer>
	//   37   75:astore          4
						final View animatingView = fragment.mView;
	//   38   77:aload_1         
	//   39   78:getfield        #221 <Field View Fragment.mView>
	//   40   81:astore          5
						container.startViewTransition(animatingView);
	//   41   83:aload           4
	//   42   85:aload           5
	//   43   87:invokevirtual   #247 <Method void ViewGroup.startViewTransition(View)>
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
	//   45   91:getfield        #288 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   46   94:new             #16  <Class FragmentManagerImpl$4>
	//   47   97:dup             
	//   48   98:aload_0         
	//   49   99:aload           4
	//   50  101:aload           5
	//   51  103:aload_1         
	//   52  104:invokespecial   #930 <Method void FragmentManagerImpl$4(FragmentManagerImpl, ViewGroup, View, Fragment)>
	//   53  107:invokevirtual   #301 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
					}
				} else
	//*  54  110:goto            121
				{
					fragment.mView.setVisibility(0);
	//   55  113:aload_1         
	//   56  114:getfield        #221 <Field View Fragment.mView>
	//   57  117:iconst_0        
	//   58  118:invokevirtual   #933 <Method void View.setVisibility(int)>
				}
				setHWLayerAnimListenerIfAlpha(fragment.mView, animationoranimator);
	//   59  121:aload_1         
	//   60  122:getfield        #221 <Field View Fragment.mView>
	//   61  125:aload_3         
	//   62  126:invokestatic    #278 <Method void setHWLayerAnimListenerIfAlpha(View, FragmentManagerImpl$AnimationOrAnimator)>
				animationoranimator.animator.start();
	//   63  129:aload_3         
	//   64  130:getfield        #288 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   65  133:invokevirtual   #308 <Method void Animator.start()>
			} else
	//*  66  136:goto            211
			{
				if(animationoranimator != null)
	//*  67  139:aload_3         
	//*  68  140:ifnull          169
				{
					setHWLayerAnimListenerIfAlpha(fragment.mView, animationoranimator);
	//   69  143:aload_1         
	//   70  144:getfield        #221 <Field View Fragment.mView>
	//   71  147:aload_3         
	//   72  148:invokestatic    #278 <Method void setHWLayerAnimListenerIfAlpha(View, FragmentManagerImpl$AnimationOrAnimator)>
					fragment.mView.startAnimation(animationoranimator.animation);
	//   73  151:aload_1         
	//   74  152:getfield        #221 <Field View Fragment.mView>
	//   75  155:aload_3         
	//   76  156:getfield        #255 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   77  159:invokevirtual   #284 <Method void View.startAnimation(Animation)>
					animationoranimator.animation.start();
	//   78  162:aload_3         
	//   79  163:getfield        #255 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   80  166:invokevirtual   #934 <Method void Animation.start()>
				}
				byte byte0;
				if(fragment.mHidden && !fragment.isHideReplaced())
	//*  81  169:aload_1         
	//*  82  170:getfield        #224 <Field boolean Fragment.mHidden>
	//*  83  173:ifeq            189
	//*  84  176:aload_1         
	//*  85  177:invokevirtual   #926 <Method boolean Fragment.isHideReplaced()>
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
	//   93  192:getfield        #221 <Field View Fragment.mView>
	//   94  195:iload_2         
	//   95  196:invokevirtual   #933 <Method void View.setVisibility(int)>
				if(fragment.isHideReplaced())
	//*  96  199:aload_1         
	//*  97  200:invokevirtual   #926 <Method boolean Fragment.isHideReplaced()>
	//*  98  203:ifeq            211
					fragment.setHideReplaced(false);
	//   99  206:aload_1         
	//  100  207:iconst_0        
	//  101  208:invokevirtual   #929 <Method void Fragment.setHideReplaced(boolean)>
			}
		}
		if(fragment.mAdded && fragment.mHasMenu && fragment.mMenuVisible)
	//* 102  211:aload_1         
	//* 103  212:getfield        #621 <Field boolean Fragment.mAdded>
	//* 104  215:ifeq            237
	//* 105  218:aload_1         
	//* 106  219:getfield        #845 <Field boolean Fragment.mHasMenu>
	//* 107  222:ifeq            237
	//* 108  225:aload_1         
	//* 109  226:getfield        #848 <Field boolean Fragment.mMenuVisible>
	//* 110  229:ifeq            237
			mNeedMenuInvalidate = true;
	//  111  232:aload_0         
	//  112  233:iconst_1        
	//  113  234:putfield        #850 <Field boolean mNeedMenuInvalidate>
		fragment.mHiddenChanged = false;
	//  114  237:aload_1         
	//  115  238:iconst_0        
	//  116  239:putfield        #842 <Field boolean Fragment.mHiddenChanged>
		fragment.onHiddenChanged(fragment.mHidden);
	//  117  242:aload_1         
	//  118  243:aload_1         
	//  119  244:getfield        #224 <Field boolean Fragment.mHidden>
	//  120  247:invokevirtual   #937 <Method void Fragment.onHiddenChanged(boolean)>
	//  121  250:return          
	}

	public void detachFragment(Fragment fragment)
	{
		if(DEBUG)
	//*   0    0:getstatic       #818 <Field boolean DEBUG>
	//*   1    3:ifeq            38
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #334 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #335 <Method void StringBuilder()>
	//    5   13:astore_2        
			stringbuilder.append("detach: ");
	//    6   14:aload_2         
	//    7   15:ldc2            #940 <String "detach: ">
	//    8   18:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (fragment)));
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   14   28:ldc1            #75  <String "FragmentManager">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #826 <Method int Log.v(String, String)>
	//   18   37:pop             
		}
		if(!fragment.mDetached)
	//*  19   38:aload_1         
	//*  20   39:getfield        #833 <Field boolean Fragment.mDetached>
	//*  21   42:ifne            143
		{
			fragment.mDetached = true;
	//   22   45:aload_1         
	//   23   46:iconst_1        
	//   24   47:putfield        #833 <Field boolean Fragment.mDetached>
			if(fragment.mAdded)
	//*  25   50:aload_1         
	//*  26   51:getfield        #621 <Field boolean Fragment.mAdded>
	//*  27   54:ifeq            143
			{
				if(DEBUG)
	//*  28   57:getstatic       #818 <Field boolean DEBUG>
	//*  29   60:ifeq            95
				{
					StringBuilder stringbuilder1 = new StringBuilder();
	//   30   63:new             #334 <Class StringBuilder>
	//   31   66:dup             
	//   32   67:invokespecial   #335 <Method void StringBuilder()>
	//   33   70:astore_2        
					stringbuilder1.append("remove from detach: ");
	//   34   71:aload_2         
	//   35   72:ldc2            #942 <String "remove from detach: ">
	//   36   75:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   37   78:pop             
					stringbuilder1.append(((Object) (fragment)));
	//   38   79:aload_2         
	//   39   80:aload_1         
	//   40   81:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//   41   84:pop             
					Log.v("FragmentManager", stringbuilder1.toString());
	//   42   85:ldc1            #75  <String "FragmentManager">
	//   43   87:aload_2         
	//   44   88:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   45   91:invokestatic    #826 <Method int Log.v(String, String)>
	//   46   94:pop             
				}
				synchronized(mAdded)
	//*  47   95:aload_0         
	//*  48   96:getfield        #170 <Field ArrayList mAdded>
	//*  49   99:astore_2        
	//*  50  100:aload_2         
	//*  51  101:monitorenter    
				{
					mAdded.remove(((Object) (fragment)));
	//   52  102:aload_0         
	//   53  103:getfield        #170 <Field ArrayList mAdded>
	//   54  106:aload_1         
	//   55  107:invokevirtual   #944 <Method boolean ArrayList.remove(Object)>
	//   56  110:pop             
				}
	//   57  111:aload_2         
	//   58  112:monitorexit     
				if(fragment.mHasMenu && fragment.mMenuVisible)
	//*  59  113:aload_1         
	//*  60  114:getfield        #845 <Field boolean Fragment.mHasMenu>
	//*  61  117:ifeq            132
	//*  62  120:aload_1         
	//*  63  121:getfield        #848 <Field boolean Fragment.mMenuVisible>
	//*  64  124:ifeq            132
					mNeedMenuInvalidate = true;
	//   65  127:aload_0         
	//   66  128:iconst_1        
	//   67  129:putfield        #850 <Field boolean mNeedMenuInvalidate>
				fragment.mAdded = false;
	//   68  132:aload_1         
	//   69  133:iconst_0        
	//   70  134:putfield        #621 <Field boolean Fragment.mAdded>
				return;
	//   71  137:return          
			}
		}
		break MISSING_BLOCK_LABEL_143;
		fragment;
	//   72  138:astore_1        
		arraylist;
	//   73  139:aload_2         
		JVM INSTR monitorexit ;
	//   74  140:monitorexit     
		throw fragment;
	//   75  141:aload_1         
	//   76  142:athrow          
	//   77  143:return          
	}

	public void dispatchActivityCreated()
	{
		mStateSaved = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #947 <Field boolean mStateSaved>
		mStopped = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #949 <Field boolean mStopped>
		dispatchStateChange(2);
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:invokespecial   #951 <Method void dispatchStateChange(int)>
	//    9   15:return          
	}

	public void dispatchConfigurationChanged(Configuration configuration)
	{
		for(int i = 0; i < mAdded.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #170 <Field ArrayList mAdded>
	//*   5    7:invokevirtual   #198 <Method int ArrayList.size()>
	//*   6   10:icmpge          41
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #170 <Field ArrayList mAdded>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #204 <Class Fragment>
	//   12   24:astore_3        
			if(fragment != null)
	//*  13   25:aload_3         
	//*  14   26:ifnull          34
				fragment.performConfigurationChanged(configuration);
	//   15   29:aload_3         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #956 <Method void Fragment.performConfigurationChanged(Configuration)>
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
	//*   1    1:getfield        #177 <Field int mCurState>
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
	//*  10   14:getfield        #170 <Field ArrayList mAdded>
	//*  11   17:invokevirtual   #198 <Method int ArrayList.size()>
	//*  12   20:icmpge          56
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//   13   23:aload_0         
	//   14   24:getfield        #170 <Field ArrayList mAdded>
	//   15   27:iload_2         
	//   16   28:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   17   31:checkcast       #204 <Class Fragment>
	//   18   34:astore_3        
			if(fragment != null && fragment.performContextItemSelected(menuitem))
	//*  19   35:aload_3         
	//*  20   36:ifnull          49
	//*  21   39:aload_3         
	//*  22   40:aload_1         
	//*  23   41:invokevirtual   #961 <Method boolean Fragment.performContextItemSelected(MenuItem)>
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
	//    2    2:putfield        #947 <Field boolean mStateSaved>
		mStopped = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #949 <Field boolean mStopped>
		dispatchStateChange(1);
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:invokespecial   #951 <Method void dispatchStateChange(int)>
	//    9   15:return          
	}

	public boolean dispatchCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #781 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #966 <String "d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #969 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	public void dispatchDestroy()
	{
		mDestroyed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #972 <Field boolean mDestroyed>
		execPendingActions();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #369 <Method boolean execPendingActions()>
	//    5    9:pop             
		dispatchStateChange(0);
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:invokespecial   #951 <Method void dispatchStateChange(int)>
		mHost = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #398 <Field FragmentHostCallback mHost>
		mContainer = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #888 <Field FragmentContainer mContainer>
		mParent = null;
	//   15   25:aload_0         
	//   16   26:aconst_null     
	//   17   27:putfield        #890 <Field Fragment mParent>
	//   18   30:return          
	}

	public void dispatchDestroyView()
	{
		dispatchStateChange(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #951 <Method void dispatchStateChange(int)>
	//    3    5:return          
	}

	public void dispatchLowMemory()
	{
		for(int i = 0; i < mAdded.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #170 <Field ArrayList mAdded>
	//*   5    7:invokevirtual   #198 <Method int ArrayList.size()>
	//*   6   10:icmpge          40
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #170 <Field ArrayList mAdded>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #204 <Class Fragment>
	//   12   24:astore_2        
			if(fragment != null)
	//*  13   25:aload_2         
	//*  14   26:ifnull          33
				fragment.performLowMemory();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #977 <Method void Fragment.performLowMemory()>
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
	//*   1    1:getfield        #170 <Field ArrayList mAdded>
	//*   2    4:invokevirtual   #198 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            42
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    8   14:aload_0         
	//    9   15:getfield        #170 <Field ArrayList mAdded>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #204 <Class Fragment>
	//   13   25:astore_3        
			if(fragment != null)
	//*  14   26:aload_3         
	//*  15   27:ifnull          35
				fragment.performMultiWindowModeChanged(flag);
	//   16   30:aload_3         
	//   17   31:iload_1         
	//   18   32:invokevirtual   #981 <Method void Fragment.performMultiWindowModeChanged(boolean)>
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
	//    1    1:getfield        #890 <Field Fragment mParent>
	//    2    4:astore          4
		if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          37
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5   11:aload           4
	//    6   13:invokevirtual   #986 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   16   34:invokevirtual   #988 <Method void dispatchOnFragmentActivityCreated(Fragment, Bundle, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   17   37:aload_0         
	//   18   38:getfield        #175 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   19   41:invokevirtual   #989 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   20   44:astore          4
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   21   46:aload           4
	//   22   48:invokeinterface #747 <Method boolean Iterator.hasNext()>
	//   23   53:ifeq            94
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   24   56:aload           4
	//   25   58:invokeinterface #751 <Method Object Iterator.next()>
	//   26   63:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   27   66:astore          5
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  28   68:iload_3         
	//*  29   69:ifeq            80
	//*  30   72:aload           5
	//*  31   74:getfield        #992 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  32   77:ifeq            46
				fragmentlifecyclecallbacksholder.mCallback.onFragmentActivityCreated(((FragmentManager) (this)), fragment, bundle);
	//   33   80:aload           5
	//   34   82:getfield        #996 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   35   85:aload_0         
	//   36   86:aload_1         
	//   37   87:aload_2         
	//   38   88:invokevirtual   #1002 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentActivityCreated(FragmentManager, Fragment, Bundle)>
		} while(true);
	//   39   91:goto            46
	//   40   94:return          
	}

	void dispatchOnFragmentAttached(Fragment fragment, Context context, boolean flag)
	{
		Object obj = ((Object) (mParent));
	//    0    0:aload_0         
	//    1    1:getfield        #890 <Field Fragment mParent>
	//    2    4:astore          4
		if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          37
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5   11:aload           4
	//    6   13:invokevirtual   #986 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   16   34:invokevirtual   #1006 <Method void dispatchOnFragmentAttached(Fragment, Context, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   17   37:aload_0         
	//   18   38:getfield        #175 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   19   41:invokevirtual   #989 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   20   44:astore          4
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   21   46:aload           4
	//   22   48:invokeinterface #747 <Method boolean Iterator.hasNext()>
	//   23   53:ifeq            94
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   24   56:aload           4
	//   25   58:invokeinterface #751 <Method Object Iterator.next()>
	//   26   63:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   27   66:astore          5
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  28   68:iload_3         
	//*  29   69:ifeq            80
	//*  30   72:aload           5
	//*  31   74:getfield        #992 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  32   77:ifeq            46
				fragmentlifecyclecallbacksholder.mCallback.onFragmentAttached(((FragmentManager) (this)), fragment, context);
	//   33   80:aload           5
	//   34   82:getfield        #996 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   35   85:aload_0         
	//   36   86:aload_1         
	//   37   87:aload_2         
	//   38   88:invokevirtual   #1010 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentAttached(FragmentManager, Fragment, Context)>
		} while(true);
	//   39   91:goto            46
	//   40   94:return          
	}

	void dispatchOnFragmentCreated(Fragment fragment, Bundle bundle, boolean flag)
	{
		Object obj = ((Object) (mParent));
	//    0    0:aload_0         
	//    1    1:getfield        #890 <Field Fragment mParent>
	//    2    4:astore          4
		if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          37
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5   11:aload           4
	//    6   13:invokevirtual   #986 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   16   34:invokevirtual   #1013 <Method void dispatchOnFragmentCreated(Fragment, Bundle, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   17   37:aload_0         
	//   18   38:getfield        #175 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   19   41:invokevirtual   #989 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   20   44:astore          4
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   21   46:aload           4
	//   22   48:invokeinterface #747 <Method boolean Iterator.hasNext()>
	//   23   53:ifeq            94
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   24   56:aload           4
	//   25   58:invokeinterface #751 <Method Object Iterator.next()>
	//   26   63:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   27   66:astore          5
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  28   68:iload_3         
	//*  29   69:ifeq            80
	//*  30   72:aload           5
	//*  31   74:getfield        #992 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  32   77:ifeq            46
				fragmentlifecyclecallbacksholder.mCallback.onFragmentCreated(((FragmentManager) (this)), fragment, bundle);
	//   33   80:aload           5
	//   34   82:getfield        #996 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   35   85:aload_0         
	//   36   86:aload_1         
	//   37   87:aload_2         
	//   38   88:invokevirtual   #1016 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentCreated(FragmentManager, Fragment, Bundle)>
		} while(true);
	//   39   91:goto            46
	//   40   94:return          
	}

	void dispatchOnFragmentDestroyed(Fragment fragment, boolean flag)
	{
		Object obj = ((Object) (mParent));
	//    0    0:aload_0         
	//    1    1:getfield        #890 <Field Fragment mParent>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          30
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5    9:aload_3         
	//    6   10:invokevirtual   #986 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   15   27:invokevirtual   #1019 <Method void dispatchOnFragmentDestroyed(Fragment, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   16   30:aload_0         
	//   17   31:getfield        #175 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   34:invokevirtual   #989 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   37:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   20   38:aload_3         
	//   21   39:invokeinterface #747 <Method boolean Iterator.hasNext()>
	//   22   44:ifeq            83
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   23   47:aload_3         
	//   24   48:invokeinterface #751 <Method Object Iterator.next()>
	//   25   53:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   26   56:astore          4
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  27   58:iload_2         
	//*  28   59:ifeq            70
	//*  29   62:aload           4
	//*  30   64:getfield        #992 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  31   67:ifeq            38
				fragmentlifecyclecallbacksholder.mCallback.onFragmentDestroyed(((FragmentManager) (this)), fragment);
	//   32   70:aload           4
	//   33   72:getfield        #996 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   34   75:aload_0         
	//   35   76:aload_1         
	//   36   77:invokevirtual   #1023 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentDestroyed(FragmentManager, Fragment)>
		} while(true);
	//   37   80:goto            38
	//   38   83:return          
	}

	void dispatchOnFragmentDetached(Fragment fragment, boolean flag)
	{
		Object obj = ((Object) (mParent));
	//    0    0:aload_0         
	//    1    1:getfield        #890 <Field Fragment mParent>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          30
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5    9:aload_3         
	//    6   10:invokevirtual   #986 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   15   27:invokevirtual   #1026 <Method void dispatchOnFragmentDetached(Fragment, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   16   30:aload_0         
	//   17   31:getfield        #175 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   34:invokevirtual   #989 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   37:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   20   38:aload_3         
	//   21   39:invokeinterface #747 <Method boolean Iterator.hasNext()>
	//   22   44:ifeq            83
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   23   47:aload_3         
	//   24   48:invokeinterface #751 <Method Object Iterator.next()>
	//   25   53:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   26   56:astore          4
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  27   58:iload_2         
	//*  28   59:ifeq            70
	//*  29   62:aload           4
	//*  30   64:getfield        #992 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  31   67:ifeq            38
				fragmentlifecyclecallbacksholder.mCallback.onFragmentDetached(((FragmentManager) (this)), fragment);
	//   32   70:aload           4
	//   33   72:getfield        #996 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   34   75:aload_0         
	//   35   76:aload_1         
	//   36   77:invokevirtual   #1029 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentDetached(FragmentManager, Fragment)>
		} while(true);
	//   37   80:goto            38
	//   38   83:return          
	}

	void dispatchOnFragmentPaused(Fragment fragment, boolean flag)
	{
		Object obj = ((Object) (mParent));
	//    0    0:aload_0         
	//    1    1:getfield        #890 <Field Fragment mParent>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          30
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5    9:aload_3         
	//    6   10:invokevirtual   #986 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   15   27:invokevirtual   #1032 <Method void dispatchOnFragmentPaused(Fragment, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   16   30:aload_0         
	//   17   31:getfield        #175 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   34:invokevirtual   #989 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   37:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   20   38:aload_3         
	//   21   39:invokeinterface #747 <Method boolean Iterator.hasNext()>
	//   22   44:ifeq            83
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   23   47:aload_3         
	//   24   48:invokeinterface #751 <Method Object Iterator.next()>
	//   25   53:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   26   56:astore          4
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  27   58:iload_2         
	//*  28   59:ifeq            70
	//*  29   62:aload           4
	//*  30   64:getfield        #992 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  31   67:ifeq            38
				fragmentlifecyclecallbacksholder.mCallback.onFragmentPaused(((FragmentManager) (this)), fragment);
	//   32   70:aload           4
	//   33   72:getfield        #996 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   34   75:aload_0         
	//   35   76:aload_1         
	//   36   77:invokevirtual   #1035 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentPaused(FragmentManager, Fragment)>
		} while(true);
	//   37   80:goto            38
	//   38   83:return          
	}

	void dispatchOnFragmentPreAttached(Fragment fragment, Context context, boolean flag)
	{
		Object obj = ((Object) (mParent));
	//    0    0:aload_0         
	//    1    1:getfield        #890 <Field Fragment mParent>
	//    2    4:astore          4
		if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          37
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5   11:aload           4
	//    6   13:invokevirtual   #986 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   16   34:invokevirtual   #1038 <Method void dispatchOnFragmentPreAttached(Fragment, Context, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   17   37:aload_0         
	//   18   38:getfield        #175 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   19   41:invokevirtual   #989 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   20   44:astore          4
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   21   46:aload           4
	//   22   48:invokeinterface #747 <Method boolean Iterator.hasNext()>
	//   23   53:ifeq            94
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   24   56:aload           4
	//   25   58:invokeinterface #751 <Method Object Iterator.next()>
	//   26   63:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   27   66:astore          5
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  28   68:iload_3         
	//*  29   69:ifeq            80
	//*  30   72:aload           5
	//*  31   74:getfield        #992 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  32   77:ifeq            46
				fragmentlifecyclecallbacksholder.mCallback.onFragmentPreAttached(((FragmentManager) (this)), fragment, context);
	//   33   80:aload           5
	//   34   82:getfield        #996 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   35   85:aload_0         
	//   36   86:aload_1         
	//   37   87:aload_2         
	//   38   88:invokevirtual   #1041 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentPreAttached(FragmentManager, Fragment, Context)>
		} while(true);
	//   39   91:goto            46
	//   40   94:return          
	}

	void dispatchOnFragmentPreCreated(Fragment fragment, Bundle bundle, boolean flag)
	{
		Object obj = ((Object) (mParent));
	//    0    0:aload_0         
	//    1    1:getfield        #890 <Field Fragment mParent>
	//    2    4:astore          4
		if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          37
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5   11:aload           4
	//    6   13:invokevirtual   #986 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   16   34:invokevirtual   #1044 <Method void dispatchOnFragmentPreCreated(Fragment, Bundle, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   17   37:aload_0         
	//   18   38:getfield        #175 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   19   41:invokevirtual   #989 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   20   44:astore          4
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   21   46:aload           4
	//   22   48:invokeinterface #747 <Method boolean Iterator.hasNext()>
	//   23   53:ifeq            94
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   24   56:aload           4
	//   25   58:invokeinterface #751 <Method Object Iterator.next()>
	//   26   63:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   27   66:astore          5
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  28   68:iload_3         
	//*  29   69:ifeq            80
	//*  30   72:aload           5
	//*  31   74:getfield        #992 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  32   77:ifeq            46
				fragmentlifecyclecallbacksholder.mCallback.onFragmentPreCreated(((FragmentManager) (this)), fragment, bundle);
	//   33   80:aload           5
	//   34   82:getfield        #996 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   35   85:aload_0         
	//   36   86:aload_1         
	//   37   87:aload_2         
	//   38   88:invokevirtual   #1047 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentPreCreated(FragmentManager, Fragment, Bundle)>
		} while(true);
	//   39   91:goto            46
	//   40   94:return          
	}

	void dispatchOnFragmentResumed(Fragment fragment, boolean flag)
	{
		Object obj = ((Object) (mParent));
	//    0    0:aload_0         
	//    1    1:getfield        #890 <Field Fragment mParent>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          30
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5    9:aload_3         
	//    6   10:invokevirtual   #986 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   15   27:invokevirtual   #1050 <Method void dispatchOnFragmentResumed(Fragment, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   16   30:aload_0         
	//   17   31:getfield        #175 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   34:invokevirtual   #989 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   37:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   20   38:aload_3         
	//   21   39:invokeinterface #747 <Method boolean Iterator.hasNext()>
	//   22   44:ifeq            83
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   23   47:aload_3         
	//   24   48:invokeinterface #751 <Method Object Iterator.next()>
	//   25   53:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   26   56:astore          4
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  27   58:iload_2         
	//*  28   59:ifeq            70
	//*  29   62:aload           4
	//*  30   64:getfield        #992 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  31   67:ifeq            38
				fragmentlifecyclecallbacksholder.mCallback.onFragmentResumed(((FragmentManager) (this)), fragment);
	//   32   70:aload           4
	//   33   72:getfield        #996 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   34   75:aload_0         
	//   35   76:aload_1         
	//   36   77:invokevirtual   #1053 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentResumed(FragmentManager, Fragment)>
		} while(true);
	//   37   80:goto            38
	//   38   83:return          
	}

	void dispatchOnFragmentSaveInstanceState(Fragment fragment, Bundle bundle, boolean flag)
	{
		Object obj = ((Object) (mParent));
	//    0    0:aload_0         
	//    1    1:getfield        #890 <Field Fragment mParent>
	//    2    4:astore          4
		if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          37
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5   11:aload           4
	//    6   13:invokevirtual   #986 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   16   34:invokevirtual   #1056 <Method void dispatchOnFragmentSaveInstanceState(Fragment, Bundle, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   17   37:aload_0         
	//   18   38:getfield        #175 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   19   41:invokevirtual   #989 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   20   44:astore          4
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   21   46:aload           4
	//   22   48:invokeinterface #747 <Method boolean Iterator.hasNext()>
	//   23   53:ifeq            94
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   24   56:aload           4
	//   25   58:invokeinterface #751 <Method Object Iterator.next()>
	//   26   63:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   27   66:astore          5
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  28   68:iload_3         
	//*  29   69:ifeq            80
	//*  30   72:aload           5
	//*  31   74:getfield        #992 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  32   77:ifeq            46
				fragmentlifecyclecallbacksholder.mCallback.onFragmentSaveInstanceState(((FragmentManager) (this)), fragment, bundle);
	//   33   80:aload           5
	//   34   82:getfield        #996 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   35   85:aload_0         
	//   36   86:aload_1         
	//   37   87:aload_2         
	//   38   88:invokevirtual   #1059 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentSaveInstanceState(FragmentManager, Fragment, Bundle)>
		} while(true);
	//   39   91:goto            46
	//   40   94:return          
	}

	void dispatchOnFragmentStarted(Fragment fragment, boolean flag)
	{
		Object obj = ((Object) (mParent));
	//    0    0:aload_0         
	//    1    1:getfield        #890 <Field Fragment mParent>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          30
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5    9:aload_3         
	//    6   10:invokevirtual   #986 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   15   27:invokevirtual   #1062 <Method void dispatchOnFragmentStarted(Fragment, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   16   30:aload_0         
	//   17   31:getfield        #175 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   34:invokevirtual   #989 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   37:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   20   38:aload_3         
	//   21   39:invokeinterface #747 <Method boolean Iterator.hasNext()>
	//   22   44:ifeq            83
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   23   47:aload_3         
	//   24   48:invokeinterface #751 <Method Object Iterator.next()>
	//   25   53:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   26   56:astore          4
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  27   58:iload_2         
	//*  28   59:ifeq            70
	//*  29   62:aload           4
	//*  30   64:getfield        #992 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  31   67:ifeq            38
				fragmentlifecyclecallbacksholder.mCallback.onFragmentStarted(((FragmentManager) (this)), fragment);
	//   32   70:aload           4
	//   33   72:getfield        #996 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   34   75:aload_0         
	//   35   76:aload_1         
	//   36   77:invokevirtual   #1065 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentStarted(FragmentManager, Fragment)>
		} while(true);
	//   37   80:goto            38
	//   38   83:return          
	}

	void dispatchOnFragmentStopped(Fragment fragment, boolean flag)
	{
		Object obj = ((Object) (mParent));
	//    0    0:aload_0         
	//    1    1:getfield        #890 <Field Fragment mParent>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          30
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5    9:aload_3         
	//    6   10:invokevirtual   #986 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   15   27:invokevirtual   #1068 <Method void dispatchOnFragmentStopped(Fragment, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   16   30:aload_0         
	//   17   31:getfield        #175 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   34:invokevirtual   #989 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   37:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   20   38:aload_3         
	//   21   39:invokeinterface #747 <Method boolean Iterator.hasNext()>
	//   22   44:ifeq            83
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   23   47:aload_3         
	//   24   48:invokeinterface #751 <Method Object Iterator.next()>
	//   25   53:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   26   56:astore          4
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  27   58:iload_2         
	//*  28   59:ifeq            70
	//*  29   62:aload           4
	//*  30   64:getfield        #992 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  31   67:ifeq            38
				fragmentlifecyclecallbacksholder.mCallback.onFragmentStopped(((FragmentManager) (this)), fragment);
	//   32   70:aload           4
	//   33   72:getfield        #996 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   34   75:aload_0         
	//   35   76:aload_1         
	//   36   77:invokevirtual   #1071 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentStopped(FragmentManager, Fragment)>
		} while(true);
	//   37   80:goto            38
	//   38   83:return          
	}

	void dispatchOnFragmentViewCreated(Fragment fragment, View view, Bundle bundle, boolean flag)
	{
		Object obj = ((Object) (mParent));
	//    0    0:aload_0         
	//    1    1:getfield        #890 <Field Fragment mParent>
	//    2    4:astore          5
		if(obj != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          38
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5   11:aload           5
	//    6   13:invokevirtual   #986 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   17   35:invokevirtual   #1075 <Method void dispatchOnFragmentViewCreated(Fragment, View, Bundle, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   18   38:aload_0         
	//   19   39:getfield        #175 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   20   42:invokevirtual   #989 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   21   45:astore          5
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   22   47:aload           5
	//   23   49:invokeinterface #747 <Method boolean Iterator.hasNext()>
	//   24   54:ifeq            97
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   25   57:aload           5
	//   26   59:invokeinterface #751 <Method Object Iterator.next()>
	//   27   64:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   28   67:astore          6
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  29   69:iload           4
	//*  30   71:ifeq            82
	//*  31   74:aload           6
	//*  32   76:getfield        #992 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  33   79:ifeq            47
				fragmentlifecyclecallbacksholder.mCallback.onFragmentViewCreated(((FragmentManager) (this)), fragment, view, bundle);
	//   34   82:aload           6
	//   35   84:getfield        #996 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   36   87:aload_0         
	//   37   88:aload_1         
	//   38   89:aload_2         
	//   39   90:aload_3         
	//   40   91:invokevirtual   #1079 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentViewCreated(FragmentManager, Fragment, View, Bundle)>
		} while(true);
	//   41   94:goto            47
	//   42   97:return          
	}

	void dispatchOnFragmentViewDestroyed(Fragment fragment, boolean flag)
	{
		Object obj = ((Object) (mParent));
	//    0    0:aload_0         
	//    1    1:getfield        #890 <Field Fragment mParent>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          30
		{
			obj = ((Object) (((Fragment) (obj)).getFragmentManager()));
	//    5    9:aload_3         
	//    6   10:invokevirtual   #986 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   15   27:invokevirtual   #1082 <Method void dispatchOnFragmentViewDestroyed(Fragment, boolean)>
		}
		obj = ((Object) (mLifecycleCallbacks.iterator()));
	//   16   30:aload_0         
	//   17   31:getfield        #175 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   34:invokevirtual   #989 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   37:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   20   38:aload_3         
	//   21   39:invokeinterface #747 <Method boolean Iterator.hasNext()>
	//   22   44:ifeq            83
			FragmentLifecycleCallbacksHolder fragmentlifecyclecallbacksholder = (FragmentLifecycleCallbacksHolder)((Iterator) (obj)).next();
	//   23   47:aload_3         
	//   24   48:invokeinterface #751 <Method Object Iterator.next()>
	//   25   53:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   26   56:astore          4
			if(!flag || fragmentlifecyclecallbacksholder.mRecursive)
	//*  27   58:iload_2         
	//*  28   59:ifeq            70
	//*  29   62:aload           4
	//*  30   64:getfield        #992 <Field boolean FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mRecursive>
	//*  31   67:ifeq            38
				fragmentlifecyclecallbacksholder.mCallback.onFragmentViewDestroyed(((FragmentManager) (this)), fragment);
	//   32   70:aload           4
	//   33   72:getfield        #996 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   34   75:aload_0         
	//   35   76:aload_1         
	//   36   77:invokevirtual   #1085 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentViewDestroyed(FragmentManager, Fragment)>
		} while(true);
	//   37   80:goto            38
	//   38   83:return          
	}

	public boolean dispatchOptionsItemSelected(MenuItem menuitem)
	{
		if(mCurState < 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #177 <Field int mCurState>
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
	//*  10   14:getfield        #170 <Field ArrayList mAdded>
	//*  11   17:invokevirtual   #198 <Method int ArrayList.size()>
	//*  12   20:icmpge          56
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//   13   23:aload_0         
	//   14   24:getfield        #170 <Field ArrayList mAdded>
	//   15   27:iload_2         
	//   16   28:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   17   31:checkcast       #204 <Class Fragment>
	//   18   34:astore_3        
			if(fragment != null && fragment.performOptionsItemSelected(menuitem))
	//*  19   35:aload_3         
	//*  20   36:ifnull          49
	//*  21   39:aload_3         
	//*  22   40:aload_1         
	//*  23   41:invokevirtual   #1089 <Method boolean Fragment.performOptionsItemSelected(MenuItem)>
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
	//*   1    1:getfield        #177 <Field int mCurState>
	//*   2    4:iconst_1        
	//*   3    5:icmpge          9
			return;
	//    4    8:return          
		for(int i = 0; i < mAdded.size(); i++)
	//*   5    9:iconst_0        
	//*   6   10:istore_2        
	//*   7   11:iload_2         
	//*   8   12:aload_0         
	//*   9   13:getfield        #170 <Field ArrayList mAdded>
	//*  10   16:invokevirtual   #198 <Method int ArrayList.size()>
	//*  11   19:icmpge          50
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//   12   22:aload_0         
	//   13   23:getfield        #170 <Field ArrayList mAdded>
	//   14   26:iload_2         
	//   15   27:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   16   30:checkcast       #204 <Class Fragment>
	//   17   33:astore_3        
			if(fragment != null)
	//*  18   34:aload_3         
	//*  19   35:ifnull          43
				fragment.performOptionsMenuClosed(menu);
	//   20   38:aload_3         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #1094 <Method void Fragment.performOptionsMenuClosed(Menu)>
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
	//    2    2:invokespecial   #951 <Method void dispatchStateChange(int)>
	//    3    5:return          
	}

	public void dispatchPictureInPictureModeChanged(boolean flag)
	{
		for(int i = mAdded.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #170 <Field ArrayList mAdded>
	//*   2    4:invokevirtual   #198 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            42
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    8   14:aload_0         
	//    9   15:getfield        #170 <Field ArrayList mAdded>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #204 <Class Fragment>
	//   13   25:astore_3        
			if(fragment != null)
	//*  14   26:aload_3         
	//*  15   27:ifnull          35
				fragment.performPictureInPictureModeChanged(flag);
	//   16   30:aload_3         
	//   17   31:iload_1         
	//   18   32:invokevirtual   #1099 <Method void Fragment.performPictureInPictureModeChanged(boolean)>
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
	//    1    1:getfield        #177 <Field int mCurState>
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
	//*  14   19:getfield        #170 <Field ArrayList mAdded>
	//*  15   22:invokevirtual   #198 <Method int ArrayList.size()>
	//*  16   25:icmpge          77
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//   17   28:aload_0         
	//   18   29:getfield        #170 <Field ArrayList mAdded>
	//   19   32:iload_2         
	//   20   33:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   21   36:checkcast       #204 <Class Fragment>
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
	//*  31   57:invokevirtual   #1104 <Method boolean Fragment.performPrepareOptionsMenu(Menu)>
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
	//    2    2:putfield        #947 <Field boolean mStateSaved>
		mStopped = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #949 <Field boolean mStopped>
		dispatchStateChange(4);
	//    6   10:aload_0         
	//    7   11:iconst_4        
	//    8   12:invokespecial   #951 <Method void dispatchStateChange(int)>
	//    9   15:return          
	}

	public void dispatchStart()
	{
		mStateSaved = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #947 <Field boolean mStateSaved>
		mStopped = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #949 <Field boolean mStopped>
		dispatchStateChange(3);
	//    6   10:aload_0         
	//    7   11:iconst_3        
	//    8   12:invokespecial   #951 <Method void dispatchStateChange(int)>
	//    9   15:return          
	}

	public void dispatchStop()
	{
		mStopped = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #949 <Field boolean mStopped>
		dispatchStateChange(2);
	//    3    5:aload_0         
	//    4    6:iconst_2        
	//    5    7:invokespecial   #951 <Method void dispatchStateChange(int)>
	//    6   10:return          
	}

	void doPendingDeferredStart()
	{
		if(mHavePendingDeferredStart)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1109 <Field boolean mHavePendingDeferredStart>
	//*   2    4:ifeq            16
		{
			mHavePendingDeferredStart = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #1109 <Field boolean mHavePendingDeferredStart>
			startPendingDeferredFragments();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #1112 <Method void startPendingDeferredFragments()>
		}
	//    8   16:return          
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		boolean flag;
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #334 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #335 <Method void StringBuilder()>
	//    3    7:astore          8
		((StringBuilder) (obj)).append(s);
	//    4    9:aload           8
	//    5   11:aload_1         
	//    6   12:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append("    ");
	//    8   16:aload           8
	//    9   18:ldc2            #1114 <String "    ">
	//   10   21:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   12   25:aload           8
	//   13   27:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   14   30:astore          8
		Object obj1 = ((Object) (mActive));
	//   15   32:aload_0         
	//   16   33:getfield        #312 <Field SparseArray mActive>
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
	//   23   48:invokevirtual   #315 <Method int SparseArray.size()>
	//   24   51:istore          7
			if(k1 > 0)
	//*  25   53:iload           7
	//*  26   55:ifle            168
			{
				printwriter.print(s);
	//   27   58:aload_3         
	//   28   59:aload_1         
	//   29   60:invokevirtual   #1117 <Method void PrintWriter.print(String)>
				printwriter.print("Active Fragments in ");
	//   30   63:aload_3         
	//   31   64:ldc2            #1119 <String "Active Fragments in ">
	//   32   67:invokevirtual   #1117 <Method void PrintWriter.print(String)>
				printwriter.print(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//   33   70:aload_3         
	//   34   71:aload_0         
	//   35   72:invokestatic    #1124 <Method int System.identityHashCode(Object)>
	//   36   75:invokestatic    #1128 <Method String Integer.toHexString(int)>
	//   37   78:invokevirtual   #1117 <Method void PrintWriter.print(String)>
				printwriter.println(":");
	//   38   81:aload_3         
	//   39   82:ldc2            #1130 <String ":">
	//   40   85:invokevirtual   #1133 <Method void PrintWriter.println(String)>
				for(int i = 0; i < k1; i++)
	//*  41   88:iconst_0        
	//*  42   89:istore          5
	//*  43   91:iload           5
	//*  44   93:iload           7
	//*  45   95:icmpge          168
				{
					obj1 = ((Object) ((Fragment)mActive.valueAt(i)));
	//   46   98:aload_0         
	//   47   99:getfield        #312 <Field SparseArray mActive>
	//   48  102:iload           5
	//   49  104:invokevirtual   #318 <Method Object SparseArray.valueAt(int)>
	//   50  107:checkcast       #204 <Class Fragment>
	//   51  110:astore          9
					printwriter.print(s);
	//   52  112:aload_3         
	//   53  113:aload_1         
	//   54  114:invokevirtual   #1117 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//   55  117:aload_3         
	//   56  118:ldc2            #1135 <String "  #">
	//   57  121:invokevirtual   #1117 <Method void PrintWriter.print(String)>
					printwriter.print(i);
	//   58  124:aload_3         
	//   59  125:iload           5
	//   60  127:invokevirtual   #1137 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//   61  130:aload_3         
	//   62  131:ldc2            #1139 <String ": ">
	//   63  134:invokevirtual   #1117 <Method void PrintWriter.print(String)>
					printwriter.println(obj1);
	//   64  137:aload_3         
	//   65  138:aload           9
	//   66  140:invokevirtual   #1141 <Method void PrintWriter.println(Object)>
					if(obj1 != null)
	//*  67  143:aload           9
	//*  68  145:ifnull          159
						((Fragment) (obj1)).dump(((String) (obj)), filedescriptor, printwriter, as);
	//   69  148:aload           9
	//   70  150:aload           8
	//   71  152:aload_2         
	//   72  153:aload_3         
	//   73  154:aload           4
	//   74  156:invokevirtual   #1142 <Method void Fragment.dump(String, FileDescriptor, PrintWriter, String[])>
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
	//   81  169:getfield        #170 <Field ArrayList mAdded>
	//   82  172:invokevirtual   #198 <Method int ArrayList.size()>
	//   83  175:istore          7
		if(l1 > 0)
	//*  84  177:iload           7
	//*  85  179:ifle            261
		{
			printwriter.print(s);
	//   86  182:aload_3         
	//   87  183:aload_1         
	//   88  184:invokevirtual   #1117 <Method void PrintWriter.print(String)>
			printwriter.println("Added Fragments:");
	//   89  187:aload_3         
	//   90  188:ldc2            #1144 <String "Added Fragments:">
	//   91  191:invokevirtual   #1133 <Method void PrintWriter.println(String)>
			for(int j = 0; j < l1; j++)
	//*  92  194:iconst_0        
	//*  93  195:istore          5
	//*  94  197:iload           5
	//*  95  199:iload           7
	//*  96  201:icmpge          261
			{
				obj1 = ((Object) ((Fragment)mAdded.get(j)));
	//   97  204:aload_0         
	//   98  205:getfield        #170 <Field ArrayList mAdded>
	//   99  208:iload           5
	//  100  210:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//  101  213:checkcast       #204 <Class Fragment>
	//  102  216:astore          9
				printwriter.print(s);
	//  103  218:aload_3         
	//  104  219:aload_1         
	//  105  220:invokevirtual   #1117 <Method void PrintWriter.print(String)>
				printwriter.print("  #");
	//  106  223:aload_3         
	//  107  224:ldc2            #1135 <String "  #">
	//  108  227:invokevirtual   #1117 <Method void PrintWriter.print(String)>
				printwriter.print(j);
	//  109  230:aload_3         
	//  110  231:iload           5
	//  111  233:invokevirtual   #1137 <Method void PrintWriter.print(int)>
				printwriter.print(": ");
	//  112  236:aload_3         
	//  113  237:ldc2            #1139 <String ": ">
	//  114  240:invokevirtual   #1117 <Method void PrintWriter.print(String)>
				printwriter.println(((Fragment) (obj1)).toString());
	//  115  243:aload_3         
	//  116  244:aload           9
	//  117  246:invokevirtual   #1145 <Method String Fragment.toString()>
	//  118  249:invokevirtual   #1133 <Method void PrintWriter.println(String)>
			}

	//  119  252:iload           5
	//  120  254:iconst_1        
	//  121  255:iadd            
	//  122  256:istore          5
		}
	//* 123  258:goto            197
		obj1 = ((Object) (mCreatedMenus));
	//  124  261:aload_0         
	//  125  262:getfield        #1147 <Field ArrayList mCreatedMenus>
	//  126  265:astore          9
		if(obj1 != null)
	//* 127  267:aload           9
	//* 128  269:ifnull          363
		{
			int i2 = ((ArrayList) (obj1)).size();
	//  129  272:aload           9
	//  130  274:invokevirtual   #198 <Method int ArrayList.size()>
	//  131  277:istore          7
			if(i2 > 0)
	//* 132  279:iload           7
	//* 133  281:ifle            363
			{
				printwriter.print(s);
	//  134  284:aload_3         
	//  135  285:aload_1         
	//  136  286:invokevirtual   #1117 <Method void PrintWriter.print(String)>
				printwriter.println("Fragments Created Menus:");
	//  137  289:aload_3         
	//  138  290:ldc2            #1149 <String "Fragments Created Menus:">
	//  139  293:invokevirtual   #1133 <Method void PrintWriter.println(String)>
				for(int k = 0; k < i2; k++)
	//* 140  296:iconst_0        
	//* 141  297:istore          5
	//* 142  299:iload           5
	//* 143  301:iload           7
	//* 144  303:icmpge          363
				{
					obj1 = ((Object) ((Fragment)mCreatedMenus.get(k)));
	//  145  306:aload_0         
	//  146  307:getfield        #1147 <Field ArrayList mCreatedMenus>
	//  147  310:iload           5
	//  148  312:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//  149  315:checkcast       #204 <Class Fragment>
	//  150  318:astore          9
					printwriter.print(s);
	//  151  320:aload_3         
	//  152  321:aload_1         
	//  153  322:invokevirtual   #1117 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//  154  325:aload_3         
	//  155  326:ldc2            #1135 <String "  #">
	//  156  329:invokevirtual   #1117 <Method void PrintWriter.print(String)>
					printwriter.print(k);
	//  157  332:aload_3         
	//  158  333:iload           5
	//  159  335:invokevirtual   #1137 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//  160  338:aload_3         
	//  161  339:ldc2            #1139 <String ": ">
	//  162  342:invokevirtual   #1117 <Method void PrintWriter.print(String)>
					printwriter.println(((Fragment) (obj1)).toString());
	//  163  345:aload_3         
	//  164  346:aload           9
	//  165  348:invokevirtual   #1145 <Method String Fragment.toString()>
	//  166  351:invokevirtual   #1133 <Method void PrintWriter.println(String)>
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
	//  173  364:getfield        #814 <Field ArrayList mBackStack>
	//  174  367:astore          9
		if(obj1 != null)
	//* 175  369:aload           9
	//* 176  371:ifnull          476
		{
			int j2 = ((ArrayList) (obj1)).size();
	//  177  374:aload           9
	//  178  376:invokevirtual   #198 <Method int ArrayList.size()>
	//  179  379:istore          7
			if(j2 > 0)
	//* 180  381:iload           7
	//* 181  383:ifle            476
			{
				printwriter.print(s);
	//  182  386:aload_3         
	//  183  387:aload_1         
	//  184  388:invokevirtual   #1117 <Method void PrintWriter.print(String)>
				printwriter.println("Back Stack:");
	//  185  391:aload_3         
	//  186  392:ldc2            #1151 <String "Back Stack:">
	//  187  395:invokevirtual   #1133 <Method void PrintWriter.println(String)>
				for(int l = 0; l < j2; l++)
	//* 188  398:iconst_0        
	//* 189  399:istore          5
	//* 190  401:iload           5
	//* 191  403:iload           7
	//* 192  405:icmpge          476
				{
					BackStackRecord backstackrecord = (BackStackRecord)mBackStack.get(l);
	//  193  408:aload_0         
	//  194  409:getfield        #814 <Field ArrayList mBackStack>
	//  195  412:iload           5
	//  196  414:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//  197  417:checkcast       #431 <Class BackStackRecord>
	//  198  420:astore          9
					printwriter.print(s);
	//  199  422:aload_3         
	//  200  423:aload_1         
	//  201  424:invokevirtual   #1117 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//  202  427:aload_3         
	//  203  428:ldc2            #1135 <String "  #">
	//  204  431:invokevirtual   #1117 <Method void PrintWriter.print(String)>
					printwriter.print(l);
	//  205  434:aload_3         
	//  206  435:iload           5
	//  207  437:invokevirtual   #1137 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//  208  440:aload_3         
	//  209  441:ldc2            #1139 <String ": ">
	//  210  444:invokevirtual   #1117 <Method void PrintWriter.print(String)>
					printwriter.println(backstackrecord.toString());
	//  211  447:aload_3         
	//  212  448:aload           9
	//  213  450:invokevirtual   #1152 <Method String BackStackRecord.toString()>
	//  214  453:invokevirtual   #1133 <Method void PrintWriter.println(String)>
					backstackrecord.dump(((String) (obj)), filedescriptor, printwriter, as);
	//  215  456:aload           9
	//  216  458:aload           8
	//  217  460:aload_2         
	//  218  461:aload_3         
	//  219  462:aload           4
	//  220  464:invokevirtual   #1153 <Method void BackStackRecord.dump(String, FileDescriptor, PrintWriter, String[])>
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
	//  229  479:getfield        #876 <Field ArrayList mBackStackIndices>
	//  230  482:ifnull          573
_L1:
		int k2 = mBackStackIndices.size();
	//  231  485:aload_0         
	//  232  486:getfield        #876 <Field ArrayList mBackStackIndices>
	//  233  489:invokevirtual   #198 <Method int ArrayList.size()>
	//  234  492:istore          7
		if(k2 <= 0) goto _L2; else goto _L3
	//  235  494:iload           7
	//  236  496:ifle            573
_L3:
		printwriter.print(s);
	//  237  499:aload_3         
	//  238  500:aload_1         
	//  239  501:invokevirtual   #1117 <Method void PrintWriter.print(String)>
		printwriter.println("Back Stack Indices:");
	//  240  504:aload_3         
	//  241  505:ldc2            #1155 <String "Back Stack Indices:">
	//  242  508:invokevirtual   #1133 <Method void PrintWriter.println(String)>
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
	//  249  522:getfield        #876 <Field ArrayList mBackStackIndices>
	//  250  525:iload           5
	//  251  527:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//  252  530:checkcast       #431 <Class BackStackRecord>
	//  253  533:astore_2        
		printwriter.print(s);
	//  254  534:aload_3         
	//  255  535:aload_1         
	//  256  536:invokevirtual   #1117 <Method void PrintWriter.print(String)>
		printwriter.print("  #");
	//  257  539:aload_3         
	//  258  540:ldc2            #1135 <String "  #">
	//  259  543:invokevirtual   #1117 <Method void PrintWriter.print(String)>
		printwriter.print(i1);
	//  260  546:aload_3         
	//  261  547:iload           5
	//  262  549:invokevirtual   #1137 <Method void PrintWriter.print(int)>
		printwriter.print(": ");
	//  263  552:aload_3         
	//  264  553:ldc2            #1139 <String ": ">
	//  265  556:invokevirtual   #1117 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (filedescriptor)));
	//  266  559:aload_3         
	//  267  560:aload_2         
	//  268  561:invokevirtual   #1141 <Method void PrintWriter.println(Object)>
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
	//* 275  574:getfield        #862 <Field ArrayList mAvailBackStackIndices>
	//* 276  577:ifnull          616
	//* 277  580:aload_0         
	//* 278  581:getfield        #862 <Field ArrayList mAvailBackStackIndices>
	//* 279  584:invokevirtual   #198 <Method int ArrayList.size()>
	//* 280  587:ifle            616
		{
			printwriter.print(s);
	//  281  590:aload_3         
	//  282  591:aload_1         
	//  283  592:invokevirtual   #1117 <Method void PrintWriter.print(String)>
			printwriter.print("mAvailBackStackIndices: ");
	//  284  595:aload_3         
	//  285  596:ldc2            #1157 <String "mAvailBackStackIndices: ">
	//  286  599:invokevirtual   #1117 <Method void PrintWriter.print(String)>
			printwriter.println(Arrays.toString(mAvailBackStackIndices.toArray()));
	//  287  602:aload_3         
	//  288  603:aload_0         
	//  289  604:getfield        #862 <Field ArrayList mAvailBackStackIndices>
	//  290  607:invokevirtual   #1161 <Method Object[] ArrayList.toArray()>
	//  291  610:invokestatic    #1166 <Method String Arrays.toString(Object[])>
	//  292  613:invokevirtual   #1133 <Method void PrintWriter.println(String)>
		}
		this;
	//  293  616:aload_0         
		JVM INSTR monitorexit ;
	//  294  617:monitorexit     
		filedescriptor = ((FileDescriptor) (mPendingActions));
	//  295  618:aload_0         
	//  296  619:getfield        #539 <Field ArrayList mPendingActions>
	//  297  622:astore_2        
		if(filedescriptor != null)
	//* 298  623:aload_2         
	//* 299  624:ifnull          713
		{
			int l2 = ((ArrayList) (filedescriptor)).size();
	//  300  627:aload_2         
	//  301  628:invokevirtual   #198 <Method int ArrayList.size()>
	//  302  631:istore          7
			if(l2 > 0)
	//* 303  633:iload           7
	//* 304  635:ifle            713
			{
				printwriter.print(s);
	//  305  638:aload_3         
	//  306  639:aload_1         
	//  307  640:invokevirtual   #1117 <Method void PrintWriter.print(String)>
				printwriter.println("Pending Actions:");
	//  308  643:aload_3         
	//  309  644:ldc2            #1168 <String "Pending Actions:">
	//  310  647:invokevirtual   #1133 <Method void PrintWriter.println(String)>
				for(int j1 = ((int) (flag)); j1 < l2; j1++)
	//* 311  650:iload           6
	//* 312  652:istore          5
	//* 313  654:iload           5
	//* 314  656:iload           7
	//* 315  658:icmpge          713
				{
					filedescriptor = ((FileDescriptor) ((OpGenerator)mPendingActions.get(j1)));
	//  316  661:aload_0         
	//  317  662:getfield        #539 <Field ArrayList mPendingActions>
	//  318  665:iload           5
	//  319  667:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//  320  670:checkcast       #41  <Class FragmentManagerImpl$OpGenerator>
	//  321  673:astore_2        
					printwriter.print(s);
	//  322  674:aload_3         
	//  323  675:aload_1         
	//  324  676:invokevirtual   #1117 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//  325  679:aload_3         
	//  326  680:ldc2            #1135 <String "  #">
	//  327  683:invokevirtual   #1117 <Method void PrintWriter.print(String)>
					printwriter.print(j1);
	//  328  686:aload_3         
	//  329  687:iload           5
	//  330  689:invokevirtual   #1137 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//  331  692:aload_3         
	//  332  693:ldc2            #1139 <String ": ">
	//  333  696:invokevirtual   #1117 <Method void PrintWriter.print(String)>
					printwriter.println(((Object) (filedescriptor)));
	//  334  699:aload_3         
	//  335  700:aload_2         
	//  336  701:invokevirtual   #1141 <Method void PrintWriter.println(Object)>
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
	//  344  715:invokevirtual   #1117 <Method void PrintWriter.print(String)>
		printwriter.println("FragmentManager misc state:");
	//  345  718:aload_3         
	//  346  719:ldc2            #1170 <String "FragmentManager misc state:">
	//  347  722:invokevirtual   #1133 <Method void PrintWriter.println(String)>
		printwriter.print(s);
	//  348  725:aload_3         
	//  349  726:aload_1         
	//  350  727:invokevirtual   #1117 <Method void PrintWriter.print(String)>
		printwriter.print("  mHost=");
	//  351  730:aload_3         
	//  352  731:ldc2            #1172 <String "  mHost=">
	//  353  734:invokevirtual   #1117 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (mHost)));
	//  354  737:aload_3         
	//  355  738:aload_0         
	//  356  739:getfield        #398 <Field FragmentHostCallback mHost>
	//  357  742:invokevirtual   #1141 <Method void PrintWriter.println(Object)>
		printwriter.print(s);
	//  358  745:aload_3         
	//  359  746:aload_1         
	//  360  747:invokevirtual   #1117 <Method void PrintWriter.print(String)>
		printwriter.print("  mContainer=");
	//  361  750:aload_3         
	//  362  751:ldc2            #1174 <String "  mContainer=">
	//  363  754:invokevirtual   #1117 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (mContainer)));
	//  364  757:aload_3         
	//  365  758:aload_0         
	//  366  759:getfield        #888 <Field FragmentContainer mContainer>
	//  367  762:invokevirtual   #1141 <Method void PrintWriter.println(Object)>
		if(mParent != null)
	//* 368  765:aload_0         
	//* 369  766:getfield        #890 <Field Fragment mParent>
	//* 370  769:ifnull          792
		{
			printwriter.print(s);
	//  371  772:aload_3         
	//  372  773:aload_1         
	//  373  774:invokevirtual   #1117 <Method void PrintWriter.print(String)>
			printwriter.print("  mParent=");
	//  374  777:aload_3         
	//  375  778:ldc2            #1176 <String "  mParent=">
	//  376  781:invokevirtual   #1117 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mParent)));
	//  377  784:aload_3         
	//  378  785:aload_0         
	//  379  786:getfield        #890 <Field Fragment mParent>
	//  380  789:invokevirtual   #1141 <Method void PrintWriter.println(Object)>
		}
		printwriter.print(s);
	//  381  792:aload_3         
	//  382  793:aload_1         
	//  383  794:invokevirtual   #1117 <Method void PrintWriter.print(String)>
		printwriter.print("  mCurState=");
	//  384  797:aload_3         
	//  385  798:ldc2            #1178 <String "  mCurState=">
	//  386  801:invokevirtual   #1117 <Method void PrintWriter.print(String)>
		printwriter.print(mCurState);
	//  387  804:aload_3         
	//  388  805:aload_0         
	//  389  806:getfield        #177 <Field int mCurState>
	//  390  809:invokevirtual   #1137 <Method void PrintWriter.print(int)>
		printwriter.print(" mStateSaved=");
	//  391  812:aload_3         
	//  392  813:ldc2            #1180 <String " mStateSaved=">
	//  393  816:invokevirtual   #1117 <Method void PrintWriter.print(String)>
		printwriter.print(mStateSaved);
	//  394  819:aload_3         
	//  395  820:aload_0         
	//  396  821:getfield        #947 <Field boolean mStateSaved>
	//  397  824:invokevirtual   #1182 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mStopped=");
	//  398  827:aload_3         
	//  399  828:ldc2            #1184 <String " mStopped=">
	//  400  831:invokevirtual   #1117 <Method void PrintWriter.print(String)>
		printwriter.print(mStopped);
	//  401  834:aload_3         
	//  402  835:aload_0         
	//  403  836:getfield        #949 <Field boolean mStopped>
	//  404  839:invokevirtual   #1182 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mDestroyed=");
	//  405  842:aload_3         
	//  406  843:ldc2            #1186 <String " mDestroyed=">
	//  407  846:invokevirtual   #1117 <Method void PrintWriter.print(String)>
		printwriter.println(mDestroyed);
	//  408  849:aload_3         
	//  409  850:aload_0         
	//  410  851:getfield        #972 <Field boolean mDestroyed>
	//  411  854:invokevirtual   #1188 <Method void PrintWriter.println(boolean)>
		if(mNeedMenuInvalidate)
	//* 412  857:aload_0         
	//* 413  858:getfield        #850 <Field boolean mNeedMenuInvalidate>
	//* 414  861:ifeq            884
		{
			printwriter.print(s);
	//  415  864:aload_3         
	//  416  865:aload_1         
	//  417  866:invokevirtual   #1117 <Method void PrintWriter.print(String)>
			printwriter.print("  mNeedMenuInvalidate=");
	//  418  869:aload_3         
	//  419  870:ldc2            #1190 <String "  mNeedMenuInvalidate=">
	//  420  873:invokevirtual   #1117 <Method void PrintWriter.print(String)>
			printwriter.println(mNeedMenuInvalidate);
	//  421  876:aload_3         
	//  422  877:aload_0         
	//  423  878:getfield        #850 <Field boolean mNeedMenuInvalidate>
	//  424  881:invokevirtual   #1188 <Method void PrintWriter.println(boolean)>
		}
		if(mNoTransactionsBecause != null)
	//* 425  884:aload_0         
	//* 426  885:getfield        #332 <Field String mNoTransactionsBecause>
	//* 427  888:ifnull          911
		{
			printwriter.print(s);
	//  428  891:aload_3         
	//  429  892:aload_1         
	//  430  893:invokevirtual   #1117 <Method void PrintWriter.print(String)>
			printwriter.print("  mNoTransactionsBecause=");
	//  431  896:aload_3         
	//  432  897:ldc2            #1192 <String "  mNoTransactionsBecause=">
	//  433  900:invokevirtual   #1117 <Method void PrintWriter.print(String)>
			printwriter.println(mNoTransactionsBecause);
	//  434  903:aload_3         
	//  435  904:aload_0         
	//  436  905:getfield        #332 <Field String mNoTransactionsBecause>
	//  437  908:invokevirtual   #1133 <Method void PrintWriter.println(String)>
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
	//    3    5:invokespecial   #417 <Method void checkStateLoss()>
		this;
	//    4    8:aload_0         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		if(mDestroyed || mHost == null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #972 <Field boolean mDestroyed>
	//*   8   14:ifne            61
	//*   9   17:aload_0         
	//*  10   18:getfield        #398 <Field FragmentHostCallback mHost>
	//*  11   21:ifnonnull       27
			break MISSING_BLOCK_LABEL_61;
	//   12   24:goto            61
		if(mPendingActions == null)
	//*  13   27:aload_0         
	//*  14   28:getfield        #539 <Field ArrayList mPendingActions>
	//*  15   31:ifnonnull       45
			mPendingActions = new ArrayList();
	//   16   34:aload_0         
	//   17   35:new             #167 <Class ArrayList>
	//   18   38:dup             
	//   19   39:invokespecial   #168 <Method void ArrayList()>
	//   20   42:putfield        #539 <Field ArrayList mPendingActions>
		mPendingActions.add(((Object) (opgenerator)));
	//   21   45:aload_0         
	//   22   46:getfield        #539 <Field ArrayList mPendingActions>
	//   23   49:aload_1         
	//   24   50:invokevirtual   #705 <Method boolean ArrayList.add(Object)>
	//   25   53:pop             
		scheduleCommit();
	//   26   54:aload_0         
	//   27   55:invokevirtual   #1197 <Method void scheduleCommit()>
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
	//   36   68:new             #343 <Class IllegalStateException>
	//   37   71:dup             
	//   38   72:ldc2            #1199 <String "Activity has been destroyed">
	//   39   75:invokespecial   #350 <Method void IllegalStateException(String)>
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
	//*   1    1:getfield        #1203 <Field boolean Fragment.mFromLayout>
	//*   2    4:ifeq            102
	//*   3    7:aload_1         
	//*   4    8:getfield        #1206 <Field boolean Fragment.mPerformedCreateView>
	//*   5   11:ifne            102
		{
			fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), ((ViewGroup) (null)), fragment.mSavedFragmentState);
	//    6   14:aload_1         
	//    7   15:aload_1         
	//    8   16:aload_1         
	//    9   17:getfield        #1209 <Field Bundle Fragment.mSavedFragmentState>
	//   10   20:invokevirtual   #1213 <Method android.view.LayoutInflater Fragment.performGetLayoutInflater(Bundle)>
	//   11   23:aconst_null     
	//   12   24:aload_1         
	//   13   25:getfield        #1209 <Field Bundle Fragment.mSavedFragmentState>
	//   14   28:invokevirtual   #1217 <Method void Fragment.performCreateView(android.view.LayoutInflater, ViewGroup, Bundle)>
			if(fragment.mView != null)
	//*  15   31:aload_1         
	//*  16   32:getfield        #221 <Field View Fragment.mView>
	//*  17   35:ifnull          97
			{
				fragment.mInnerView = fragment.mView;
	//   18   38:aload_1         
	//   19   39:aload_1         
	//   20   40:getfield        #221 <Field View Fragment.mView>
	//   21   43:putfield        #1220 <Field View Fragment.mInnerView>
				fragment.mView.setSaveFromParentEnabled(false);
	//   22   46:aload_1         
	//   23   47:getfield        #221 <Field View Fragment.mView>
	//   24   50:iconst_0        
	//   25   51:invokevirtual   #1223 <Method void View.setSaveFromParentEnabled(boolean)>
				if(fragment.mHidden)
	//*  26   54:aload_1         
	//*  27   55:getfield        #224 <Field boolean Fragment.mHidden>
	//*  28   58:ifeq            70
					fragment.mView.setVisibility(8);
	//   29   61:aload_1         
	//   30   62:getfield        #221 <Field View Fragment.mView>
	//   31   65:bipush          8
	//   32   67:invokevirtual   #933 <Method void View.setVisibility(int)>
				fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
	//   33   70:aload_1         
	//   34   71:aload_1         
	//   35   72:getfield        #221 <Field View Fragment.mView>
	//   36   75:aload_1         
	//   37   76:getfield        #1209 <Field Bundle Fragment.mSavedFragmentState>
	//   38   79:invokevirtual   #1227 <Method void Fragment.onViewCreated(View, Bundle)>
				dispatchOnFragmentViewCreated(fragment, fragment.mView, fragment.mSavedFragmentState, false);
	//   39   82:aload_0         
	//   40   83:aload_1         
	//   41   84:aload_1         
	//   42   85:getfield        #221 <Field View Fragment.mView>
	//   43   88:aload_1         
	//   44   89:getfield        #1209 <Field Bundle Fragment.mSavedFragmentState>
	//   45   92:iconst_0        
	//   46   93:invokevirtual   #1075 <Method void dispatchOnFragmentViewCreated(Fragment, View, Bundle, boolean)>
				return;
	//   47   96:return          
			}
			fragment.mInnerView = null;
	//   48   97:aload_1         
	//   49   98:aconst_null     
	//   50   99:putfield        #1220 <Field View Fragment.mInnerView>
		}
	//   51  102:return          
	}

	public boolean execPendingActions()
	{
		boolean flag;
		ensureExecReady(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #676 <Method void ensureExecReady(boolean)>
		flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_1        
_L2:
		if(!generateOpsForPendingActions(mTmpRecords, mTmpIsPop))
			break; /* Loop/switch isn't completed */
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #362 <Field ArrayList mTmpRecords>
	//    8   12:aload_0         
	//    9   13:getfield        #357 <Field ArrayList mTmpIsPop>
	//   10   16:invokespecial   #1229 <Method boolean generateOpsForPendingActions(ArrayList, ArrayList)>
	//   11   19:ifeq            55
		mExecutingActions = true;
	//   12   22:aload_0         
	//   13   23:iconst_1        
	//   14   24:putfield        #355 <Field boolean mExecutingActions>
		removeRedundantOperationsAndExecute(mTmpRecords, mTmpIsPop);
	//   15   27:aload_0         
	//   16   28:aload_0         
	//   17   29:getfield        #362 <Field ArrayList mTmpRecords>
	//   18   32:aload_0         
	//   19   33:getfield        #357 <Field ArrayList mTmpIsPop>
	//   20   36:invokespecial   #691 <Method void removeRedundantOperationsAndExecute(ArrayList, ArrayList)>
		cleanupExec();
	//   21   39:aload_0         
	//   22   40:invokespecial   #693 <Method void cleanupExec()>
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
	//   28   50:invokespecial   #693 <Method void cleanupExec()>
		throw exception;
	//   29   53:aload_2         
	//   30   54:athrow          
_L1:
		doPendingDeferredStart();
	//   31   55:aload_0         
	//   32   56:invokevirtual   #696 <Method void doPendingDeferredStart()>
		burpActive();
	//   33   59:aload_0         
	//   34   60:invokespecial   #698 <Method void burpActive()>
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
	//*   3    5:getfield        #398 <Field FragmentHostCallback mHost>
	//*   4    8:ifnull          18
	//*   5   11:aload_0         
	//*   6   12:getfield        #972 <Field boolean mDestroyed>
	//*   7   15:ifeq            19
			return;
	//    8   18:return          
		ensureExecReady(flag);
	//    9   19:aload_0         
	//   10   20:iload_2         
	//   11   21:invokespecial   #676 <Method void ensureExecReady(boolean)>
		if(!opgenerator.generateOps(mTmpRecords, mTmpIsPop))
			break MISSING_BLOCK_LABEL_72;
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #362 <Field ArrayList mTmpRecords>
	//   15   29:aload_0         
	//   16   30:getfield        #357 <Field ArrayList mTmpIsPop>
	//   17   33:invokeinterface #542 <Method boolean FragmentManagerImpl$OpGenerator.generateOps(ArrayList, ArrayList)>
	//   18   38:ifeq            72
		mExecutingActions = true;
	//   19   41:aload_0         
	//   20   42:iconst_1        
	//   21   43:putfield        #355 <Field boolean mExecutingActions>
		removeRedundantOperationsAndExecute(mTmpRecords, mTmpIsPop);
	//   22   46:aload_0         
	//   23   47:aload_0         
	//   24   48:getfield        #362 <Field ArrayList mTmpRecords>
	//   25   51:aload_0         
	//   26   52:getfield        #357 <Field ArrayList mTmpIsPop>
	//   27   55:invokespecial   #691 <Method void removeRedundantOperationsAndExecute(ArrayList, ArrayList)>
		cleanupExec();
	//   28   58:aload_0         
	//   29   59:invokespecial   #693 <Method void cleanupExec()>
		break MISSING_BLOCK_LABEL_72;
	//   30   62:goto            72
		opgenerator;
	//   31   65:astore_1        
		cleanupExec();
	//   32   66:aload_0         
	//   33   67:invokespecial   #693 <Method void cleanupExec()>
		throw opgenerator;
	//   34   70:aload_1         
	//   35   71:athrow          
		doPendingDeferredStart();
	//   36   72:aload_0         
	//   37   73:invokevirtual   #696 <Method void doPendingDeferredStart()>
		burpActive();
	//   38   76:aload_0         
	//   39   77:invokespecial   #698 <Method void burpActive()>
		return;
	//   40   80:return          
	}

	public boolean executePendingTransactions()
	{
		boolean flag = execPendingActions();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #369 <Method boolean execPendingActions()>
	//    2    4:istore_1        
		forcePostponedTransactions();
	//    3    5:aload_0         
	//    4    6:invokespecial   #1233 <Method void forcePostponedTransactions()>
		return flag;
	//    5    9:iload_1         
	//    6   10:ireturn         
	}

	public Fragment findFragmentById(int i)
	{
		for(int j = mAdded.size() - 1; j >= 0; j--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #170 <Field ArrayList mAdded>
	//*   2    4:invokevirtual   #198 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            47
		{
			Fragment fragment = (Fragment)mAdded.get(j);
	//    8   14:aload_0         
	//    9   15:getfield        #170 <Field ArrayList mAdded>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #204 <Class Fragment>
	//   13   25:astore_3        
			if(fragment != null && fragment.mFragmentId == i)
	//*  14   26:aload_3         
	//*  15   27:ifnull          40
	//*  16   30:aload_3         
	//*  17   31:getfield        #1238 <Field int Fragment.mFragmentId>
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
	//   28   48:getfield        #312 <Field SparseArray mActive>
	//   29   51:astore_3        
		if(sparsearray != null)
	//*  30   52:aload_3         
	//*  31   53:ifnull          100
		{
			for(int k = sparsearray.size() - 1; k >= 0; k--)
	//*  32   56:aload_3         
	//*  33   57:invokevirtual   #315 <Method int SparseArray.size()>
	//*  34   60:iconst_1        
	//*  35   61:isub            
	//*  36   62:istore_2        
	//*  37   63:iload_2         
	//*  38   64:iflt            100
			{
				Fragment fragment1 = (Fragment)mActive.valueAt(k);
	//   39   67:aload_0         
	//   40   68:getfield        #312 <Field SparseArray mActive>
	//   41   71:iload_2         
	//   42   72:invokevirtual   #318 <Method Object SparseArray.valueAt(int)>
	//   43   75:checkcast       #204 <Class Fragment>
	//   44   78:astore_3        
				if(fragment1 != null && fragment1.mFragmentId == i)
	//*  45   79:aload_3         
	//*  46   80:ifnull          93
	//*  47   83:aload_3         
	//*  48   84:getfield        #1238 <Field int Fragment.mFragmentId>
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
	//*   3    5:getfield        #170 <Field ArrayList mAdded>
	//*   4    8:invokevirtual   #198 <Method int ArrayList.size()>
	//*   5   11:iconst_1        
	//*   6   12:isub            
	//*   7   13:istore_2        
	//*   8   14:iload_2         
	//*   9   15:iflt            54
			{
				Fragment fragment = (Fragment)mAdded.get(i);
	//   10   18:aload_0         
	//   11   19:getfield        #170 <Field ArrayList mAdded>
	//   12   22:iload_2         
	//   13   23:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   14   26:checkcast       #204 <Class Fragment>
	//   15   29:astore_3        
				if(fragment != null && s.equals(((Object) (fragment.mTag))))
	//*  16   30:aload_3         
	//*  17   31:ifnull          47
	//*  18   34:aload_1         
	//*  19   35:aload_3         
	//*  20   36:getfield        #1244 <Field String Fragment.mTag>
	//*  21   39:invokevirtual   #655 <Method boolean String.equals(Object)>
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
	//   31   55:getfield        #312 <Field SparseArray mActive>
	//   32   58:astore_3        
		if(sparsearray != null && s != null)
	//*  33   59:aload_3         
	//*  34   60:ifnull          114
	//*  35   63:aload_1         
	//*  36   64:ifnull          114
		{
			for(int j = sparsearray.size() - 1; j >= 0; j--)
	//*  37   67:aload_3         
	//*  38   68:invokevirtual   #315 <Method int SparseArray.size()>
	//*  39   71:iconst_1        
	//*  40   72:isub            
	//*  41   73:istore_2        
	//*  42   74:iload_2         
	//*  43   75:iflt            114
			{
				Fragment fragment1 = (Fragment)mActive.valueAt(j);
	//   44   78:aload_0         
	//   45   79:getfield        #312 <Field SparseArray mActive>
	//   46   82:iload_2         
	//   47   83:invokevirtual   #318 <Method Object SparseArray.valueAt(int)>
	//   48   86:checkcast       #204 <Class Fragment>
	//   49   89:astore_3        
				if(fragment1 != null && s.equals(((Object) (fragment1.mTag))))
	//*  50   90:aload_3         
	//*  51   91:ifnull          107
	//*  52   94:aload_1         
	//*  53   95:aload_3         
	//*  54   96:getfield        #1244 <Field String Fragment.mTag>
	//*  55   99:invokevirtual   #655 <Method boolean String.equals(Object)>
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
	//    1    1:getfield        #312 <Field SparseArray mActive>
	//    2    4:astore_3        
		if(sparsearray != null && s != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          59
	//*   5    9:aload_1         
	//*   6   10:ifnull          59
		{
			for(int i = sparsearray.size() - 1; i >= 0; i--)
	//*   7   13:aload_3         
	//*   8   14:invokevirtual   #315 <Method int SparseArray.size()>
	//*   9   17:iconst_1        
	//*  10   18:isub            
	//*  11   19:istore_2        
	//*  12   20:iload_2         
	//*  13   21:iflt            59
			{
				Fragment fragment = (Fragment)mActive.valueAt(i);
	//   14   24:aload_0         
	//   15   25:getfield        #312 <Field SparseArray mActive>
	//   16   28:iload_2         
	//   17   29:invokevirtual   #318 <Method Object SparseArray.valueAt(int)>
	//   18   32:checkcast       #204 <Class Fragment>
	//   19   35:astore_3        
				if(fragment == null)
					continue;
	//   20   36:aload_3         
	//   21   37:ifnull          52
				fragment = fragment.findFragmentByWho(s);
	//   22   40:aload_3         
	//   23   41:aload_1         
	//   24   42:invokevirtual   #1247 <Method Fragment Fragment.findFragmentByWho(String)>
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
	//    3    3:getfield        #876 <Field ArrayList mBackStackIndices>
	//    4    6:iload_1         
	//    5    7:aconst_null     
	//    6    8:invokevirtual   #880 <Method Object ArrayList.set(int, Object)>
	//    7   11:pop             
		if(mAvailBackStackIndices == null)
	//*   8   12:aload_0         
	//*   9   13:getfield        #862 <Field ArrayList mAvailBackStackIndices>
	//*  10   16:ifnonnull       30
			mAvailBackStackIndices = new ArrayList();
	//   11   19:aload_0         
	//   12   20:new             #167 <Class ArrayList>
	//   13   23:dup             
	//   14   24:invokespecial   #168 <Method void ArrayList()>
	//   15   27:putfield        #862 <Field ArrayList mAvailBackStackIndices>
		if(DEBUG)
	//*  16   30:getstatic       #818 <Field boolean DEBUG>
	//*  17   33:ifeq            68
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   18   36:new             #334 <Class StringBuilder>
	//   19   39:dup             
	//   20   40:invokespecial   #335 <Method void StringBuilder()>
	//   21   43:astore_2        
			stringbuilder.append("Freeing back stack index ");
	//   22   44:aload_2         
	//   23   45:ldc2            #1249 <String "Freeing back stack index ">
	//   24   48:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
			stringbuilder.append(i);
	//   26   52:aload_2         
	//   27   53:iload_1         
	//   28   54:invokevirtual   #872 <Method StringBuilder StringBuilder.append(int)>
	//   29   57:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   30   58:ldc1            #75  <String "FragmentManager">
	//   31   60:aload_2         
	//   32   61:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   33   64:invokestatic    #826 <Method int Log.v(String, String)>
	//   34   67:pop             
		}
		mAvailBackStackIndices.add(((Object) (Integer.valueOf(i))));
	//   35   68:aload_0         
	//   36   69:getfield        #862 <Field ArrayList mAvailBackStackIndices>
	//   37   72:iload_1         
	//   38   73:invokestatic    #1252 <Method Integer Integer.valueOf(int)>
	//   39   76:invokevirtual   #705 <Method boolean ArrayList.add(Object)>
	//   40   79:pop             
		this;
	//   41   80:aload_0         
		JVM INSTR monitorexit ;
	//   42   81:monitorexit     
		return;
	//   43   82:return          
		Exception exception;
		exception;
	//   44   83:astore_2        
		this;
	//   45   84:aload_0         
		JVM INSTR monitorexit ;
	//   46   85:monitorexit     
		throw exception;
	//   47   86:aload_2         
	//   48   87:athrow          
	}

	int getActiveFragmentCount()
	{
		SparseArray sparsearray = mActive;
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field SparseArray mActive>
	//    2    4:astore_1        
		if(sparsearray == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return sparsearray.size();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #315 <Method int SparseArray.size()>
	//    9   15:ireturn         
	}

	List getActiveFragments()
	{
		Object obj = ((Object) (mActive));
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field SparseArray mActive>
	//    2    4:astore_3        
		if(obj == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		int j = ((SparseArray) (obj)).size();
	//    7   11:aload_3         
	//    8   12:invokevirtual   #315 <Method int SparseArray.size()>
	//    9   15:istore_2        
		obj = ((Object) (new ArrayList(j)));
	//   10   16:new             #167 <Class ArrayList>
	//   11   19:dup             
	//   12   20:iload_2         
	//   13   21:invokespecial   #904 <Method void ArrayList(int)>
	//   14   24:astore_3        
		for(int i = 0; i < j; i++)
	//*  15   25:iconst_0        
	//*  16   26:istore_1        
	//*  17   27:iload_1         
	//*  18   28:iload_2         
	//*  19   29:icmpge          52
			((ArrayList) (obj)).add(mActive.valueAt(i));
	//   20   32:aload_3         
	//   21   33:aload_0         
	//   22   34:getfield        #312 <Field SparseArray mActive>
	//   23   37:iload_1         
	//   24   38:invokevirtual   #318 <Method Object SparseArray.valueAt(int)>
	//   25   41:invokevirtual   #705 <Method boolean ArrayList.add(Object)>
	//   26   44:pop             

	//   27   45:iload_1         
	//   28   46:iconst_1        
	//   29   47:iadd            
	//   30   48:istore_1        
	//*  31   49:goto            27
		return ((List) (obj));
	//   32   52:aload_3         
	//   33   53:areturn         
	}

	public FragmentManager.BackStackEntry getBackStackEntryAt(int i)
	{
		return (FragmentManager.BackStackEntry)mBackStack.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #814 <Field ArrayList mBackStack>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #1259 <Class FragmentManager$BackStackEntry>
	//    5   11:areturn         
	}

	public int getBackStackEntryCount()
	{
		ArrayList arraylist = mBackStack;
	//    0    0:aload_0         
	//    1    1:getfield        #814 <Field ArrayList mBackStack>
	//    2    4:astore_1        
		if(arraylist != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return arraylist.size();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #198 <Method int ArrayList.size()>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public Fragment getFragment(Bundle bundle, String s)
	{
		int i = bundle.getInt(s, -1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #1268 <Method int Bundle.getInt(String, int)>
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
	//   11   15:getfield        #312 <Field SparseArray mActive>
	//   12   18:iload_3         
	//   13   19:invokevirtual   #1269 <Method Object SparseArray.get(int)>
	//   14   22:checkcast       #204 <Class Fragment>
	//   15   25:astore_1        
		if(bundle == null)
	//*  16   26:aload_1         
	//*  17   27:ifnonnull       87
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   18   30:new             #334 <Class StringBuilder>
	//   19   33:dup             
	//   20   34:invokespecial   #335 <Method void StringBuilder()>
	//   21   37:astore          4
			stringbuilder.append("Fragment no longer exists for key ");
	//   22   39:aload           4
	//   23   41:ldc2            #1271 <String "Fragment no longer exists for key ">
	//   24   44:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
			stringbuilder.append(s);
	//   26   48:aload           4
	//   27   50:aload_2         
	//   28   51:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   29   54:pop             
			stringbuilder.append(": index ");
	//   30   55:aload           4
	//   31   57:ldc2            #1273 <String ": index ">
	//   32   60:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   33   63:pop             
			stringbuilder.append(i);
	//   34   64:aload           4
	//   35   66:iload_3         
	//   36   67:invokevirtual   #872 <Method StringBuilder StringBuilder.append(int)>
	//   37   70:pop             
			throwException(((RuntimeException) (new IllegalStateException(stringbuilder.toString()))));
	//   38   71:aload_0         
	//   39   72:new             #343 <Class IllegalStateException>
	//   40   75:dup             
	//   41   76:aload           4
	//   42   78:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   43   81:invokespecial   #350 <Method void IllegalStateException(String)>
	//   44   84:invokespecial   #1275 <Method void throwException(RuntimeException)>
		}
		return ((Fragment) (bundle));
	//   45   87:aload_1         
	//   46   88:areturn         
	}

	public List getFragments()
	{
		if(mAdded.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #170 <Field ArrayList mAdded>
	//*   2    4:invokevirtual   #535 <Method boolean ArrayList.isEmpty()>
	//*   3    7:ifeq            14
			return Collections.emptyList();
	//    4   10:invokestatic    #1280 <Method List Collections.emptyList()>
	//    5   13:areturn         
		List list;
		synchronized(mAdded)
	//*   6   14:aload_0         
	//*   7   15:getfield        #170 <Field ArrayList mAdded>
	//*   8   18:astore_1        
	//*   9   19:aload_1         
	//*  10   20:monitorenter    
		{
			list = (List)mAdded.clone();
	//   11   21:aload_0         
	//   12   22:getfield        #170 <Field ArrayList mAdded>
	//   13   25:invokevirtual   #1283 <Method Object ArrayList.clone()>
	//   14   28:checkcast       #663 <Class List>
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
	//    1    1:getfield        #678 <Field Fragment mPrimaryNav>
	//    2    4:areturn         
	}

	public void hideFragment(Fragment fragment)
	{
		if(DEBUG)
	//*   0    0:getstatic       #818 <Field boolean DEBUG>
	//*   1    3:ifeq            38
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #334 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #335 <Method void StringBuilder()>
	//    5   13:astore_2        
			stringbuilder.append("hide: ");
	//    6   14:aload_2         
	//    7   15:ldc2            #1288 <String "hide: ">
	//    8   18:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (fragment)));
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   14   28:ldc1            #75  <String "FragmentManager">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #826 <Method int Log.v(String, String)>
	//   18   37:pop             
		}
		if(!fragment.mHidden)
	//*  19   38:aload_1         
	//*  20   39:getfield        #224 <Field boolean Fragment.mHidden>
	//*  21   42:ifne            60
		{
			fragment.mHidden = true;
	//   22   45:aload_1         
	//   23   46:iconst_1        
	//   24   47:putfield        #224 <Field boolean Fragment.mHidden>
			fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
	//   25   50:aload_1         
	//   26   51:iconst_1        
	//   27   52:aload_1         
	//   28   53:getfield        #842 <Field boolean Fragment.mHiddenChanged>
	//   29   56:ixor            
	//   30   57:putfield        #842 <Field boolean Fragment.mHiddenChanged>
		}
	//   31   60:return          
	}

	public boolean isDestroyed()
	{
		return mDestroyed;
	//    0    0:aload_0         
	//    1    1:getfield        #972 <Field boolean mDestroyed>
	//    2    4:ireturn         
	}

	boolean isStateAtLeast(int i)
	{
		return mCurState >= i;
	//    0    0:aload_0         
	//    1    1:getfield        #177 <Field int mCurState>
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
	//    1    1:getfield        #947 <Field boolean mStateSaved>
	//    2    4:ifne            19
	//    3    7:aload_0         
	//    4    8:getfield        #949 <Field boolean mStopped>
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
	//    1    1:invokevirtual   #210 <Method int Fragment.getNextAnim()>
	//    2    4:istore          7
		Animation animation = fragment.onCreateAnimation(i, flag, k);
	//    3    6:aload_1         
	//    4    7:iload_2         
	//    5    8:iload_3         
	//    6    9:iload           7
	//    7   11:invokevirtual   #1296 <Method Animation Fragment.onCreateAnimation(int, boolean, int)>
	//    8   14:astore          9
		if(animation != null)
	//*   9   16:aload           9
	//*  10   18:ifnull          31
			return new AnimationOrAnimator(animation);
	//   11   21:new             #26  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   12   24:dup             
	//   13   25:aload           9
	//   14   27:invokespecial   #600 <Method void FragmentManagerImpl$AnimationOrAnimator(Animation)>
	//   15   30:areturn         
		fragment = ((Fragment) (fragment.onCreateAnimator(i, flag, k)));
	//   16   31:aload_1         
	//   17   32:iload_2         
	//   18   33:iload_3         
	//   19   34:iload           7
	//   20   36:invokevirtual   #1300 <Method Animator Fragment.onCreateAnimator(int, boolean, int)>
	//   21   39:astore_1        
		if(fragment != null)
	//*  22   40:aload_1         
	//*  23   41:ifnull          53
			return new AnimationOrAnimator(((Animator) (fragment)));
	//   24   44:new             #26  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   25   47:dup             
	//   26   48:aload_1         
	//   27   49:invokespecial   #1302 <Method void FragmentManagerImpl$AnimationOrAnimator(Animator)>
	//   28   52:areturn         
		if(k == 0) goto _L2; else goto _L1
	//   29   53:iload           7
	//   30   55:ifeq            197
_L1:
		boolean flag1;
		boolean flag2;
		boolean flag3;
		flag3 = "anim".equals(((Object) (mHost.getContext().getResources().getResourceTypeName(k))));
	//   31   58:ldc2            #1304 <String "anim">
	//   32   61:aload_0         
	//   33   62:getfield        #398 <Field FragmentHostCallback mHost>
	//   34   65:invokevirtual   #1308 <Method Context FragmentHostCallback.getContext()>
	//   35   68:invokevirtual   #1314 <Method Resources Context.getResources()>
	//   36   71:iload           7
	//   37   73:invokevirtual   #1319 <Method String Resources.getResourceTypeName(int)>
	//   38   76:invokevirtual   #655 <Method boolean String.equals(Object)>
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
	//   47   94:getfield        #398 <Field FragmentHostCallback mHost>
	//   48   97:invokevirtual   #1308 <Method Context FragmentHostCallback.getContext()>
	//   49  100:iload           7
	//   50  102:invokestatic    #1324 <Method Animation AnimationUtils.loadAnimation(Context, int)>
	//   51  105:astore_1        
		if(fragment == null)
			break MISSING_BLOCK_LABEL_121;
	//   52  106:aload_1         
	//   53  107:ifnull          121
		fragment = ((Fragment) (new AnimationOrAnimator(((Animation) (fragment)))));
	//   54  110:new             #26  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   55  113:dup             
	//   56  114:aload_1         
	//   57  115:invokespecial   #600 <Method void FragmentManagerImpl$AnimationOrAnimator(Animation)>
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
	//   70  136:getfield        #398 <Field FragmentHostCallback mHost>
	//   71  139:invokevirtual   #1308 <Method Context FragmentHostCallback.getContext()>
	//   72  142:iload           7
	//   73  144:invokestatic    #1330 <Method Animator AnimatorInflater.loadAnimator(Context, int)>
	//   74  147:astore_1        
		if(fragment == null) goto _L2; else goto _L4
	//   75  148:aload_1         
	//   76  149:ifnull          197
_L4:
		fragment = ((Fragment) (new AnimationOrAnimator(((Animator) (fragment)))));
	//   77  152:new             #26  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   78  155:dup             
	//   79  156:aload_1         
	//   80  157:invokespecial   #1302 <Method void FragmentManagerImpl$AnimationOrAnimator(Animator)>
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
	//   88  170:getfield        #398 <Field FragmentHostCallback mHost>
	//   89  173:invokevirtual   #1308 <Method Context FragmentHostCallback.getContext()>
	//   90  176:iload           7
	//   91  178:invokestatic    #1324 <Method Animation AnimationUtils.loadAnimation(Context, int)>
	//   92  181:astore_1        
			if(fragment != null)
	//*  93  182:aload_1         
	//*  94  183:ifnull          197
				return new AnimationOrAnimator(((Animation) (fragment)));
	//   95  186:new             #26  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   96  189:dup             
	//   97  190:aload_1         
	//   98  191:invokespecial   #600 <Method void FragmentManagerImpl$AnimationOrAnimator(Animation)>
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
	//  108  205:invokestatic    #1332 <Method int transitToStyleIndex(int, boolean)>
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
	//* 123  268:getfield        #398 <Field FragmentHostCallback mHost>
	//* 124  271:invokevirtual   #1335 <Method boolean FragmentHostCallback.onHasWindowAnimations()>
	//* 125  274:ifeq            382
					i = mHost.onGetWindowAnimations();
	//  126  277:aload_0         
	//  127  278:getfield        #398 <Field FragmentHostCallback mHost>
	//  128  281:invokevirtual   #1338 <Method int FragmentHostCallback.onGetWindowAnimations()>
	//  129  284:istore_2        
			}
			break;

	//* 130  285:goto            382
		case 6: // '\006'
			return makeFadeAnimation(mHost.getContext(), 1.0F, 0.0F);
	//  131  288:aload_0         
	//  132  289:getfield        #398 <Field FragmentHostCallback mHost>
	//  133  292:invokevirtual   #1308 <Method Context FragmentHostCallback.getContext()>
	//  134  295:fconst_1        
	//  135  296:fconst_0        
	//  136  297:invokestatic    #1340 <Method FragmentManagerImpl$AnimationOrAnimator makeFadeAnimation(Context, float, float)>
	//  137  300:areturn         

		case 5: // '\005'
			return makeFadeAnimation(mHost.getContext(), 0.0F, 1.0F);
	//  138  301:aload_0         
	//  139  302:getfield        #398 <Field FragmentHostCallback mHost>
	//  140  305:invokevirtual   #1308 <Method Context FragmentHostCallback.getContext()>
	//  141  308:fconst_0        
	//  142  309:fconst_1        
	//  143  310:invokestatic    #1340 <Method FragmentManagerImpl$AnimationOrAnimator makeFadeAnimation(Context, float, float)>
	//  144  313:areturn         

		case 4: // '\004'
			return makeOpenCloseAnimation(mHost.getContext(), 1.0F, 1.075F, 1.0F, 0.0F);
	//  145  314:aload_0         
	//  146  315:getfield        #398 <Field FragmentHostCallback mHost>
	//  147  318:invokevirtual   #1308 <Method Context FragmentHostCallback.getContext()>
	//  148  321:fconst_1        
	//  149  322:ldc2            #1341 <Float 1.075F>
	//  150  325:fconst_1        
	//  151  326:fconst_0        
	//  152  327:invokestatic    #1343 <Method FragmentManagerImpl$AnimationOrAnimator makeOpenCloseAnimation(Context, float, float, float, float)>
	//  153  330:areturn         

		case 3: // '\003'
			return makeOpenCloseAnimation(mHost.getContext(), 0.975F, 1.0F, 0.0F, 1.0F);
	//  154  331:aload_0         
	//  155  332:getfield        #398 <Field FragmentHostCallback mHost>
	//  156  335:invokevirtual   #1308 <Method Context FragmentHostCallback.getContext()>
	//  157  338:ldc2            #1344 <Float 0.975F>
	//  158  341:fconst_1        
	//  159  342:fconst_0        
	//  160  343:fconst_1        
	//  161  344:invokestatic    #1343 <Method FragmentManagerImpl$AnimationOrAnimator makeOpenCloseAnimation(Context, float, float, float, float)>
	//  162  347:areturn         

		case 2: // '\002'
			return makeOpenCloseAnimation(mHost.getContext(), 1.0F, 0.975F, 1.0F, 0.0F);
	//  163  348:aload_0         
	//  164  349:getfield        #398 <Field FragmentHostCallback mHost>
	//  165  352:invokevirtual   #1308 <Method Context FragmentHostCallback.getContext()>
	//  166  355:fconst_1        
	//  167  356:ldc2            #1344 <Float 0.975F>
	//  168  359:fconst_1        
	//  169  360:fconst_0        
	//  170  361:invokestatic    #1343 <Method FragmentManagerImpl$AnimationOrAnimator makeOpenCloseAnimation(Context, float, float, float, float)>
	//  171  364:areturn         

		case 1: // '\001'
			return makeOpenCloseAnimation(mHost.getContext(), 1.125F, 1.0F, 0.0F, 1.0F);
	//  172  365:aload_0         
	//  173  366:getfield        #398 <Field FragmentHostCallback mHost>
	//  174  369:invokevirtual   #1308 <Method Context FragmentHostCallback.getContext()>
	//  175  372:ldc2            #1345 <Float 1.125F>
	//  176  375:fconst_1        
	//  177  376:fconst_0        
	//  178  377:fconst_1        
	//  179  378:invokestatic    #1343 <Method FragmentManagerImpl$AnimationOrAnimator makeOpenCloseAnimation(Context, float, float, float, float)>
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
	//*   1    1:getfield        #1346 <Field int Fragment.mIndex>
	//*   2    4:iflt            8
			return;
	//    3    7:return          
		int i = mNextFragmentIndex;
	//    4    8:aload_0         
	//    5    9:getfield        #165 <Field int mNextFragmentIndex>
	//    6   12:istore_2        
		mNextFragmentIndex = i + 1;
	//    7   13:aload_0         
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:iadd            
	//   11   17:putfield        #165 <Field int mNextFragmentIndex>
		fragment.setIndex(i, mParent);
	//   12   20:aload_1         
	//   13   21:iload_2         
	//   14   22:aload_0         
	//   15   23:getfield        #890 <Field Fragment mParent>
	//   16   26:invokevirtual   #1350 <Method void Fragment.setIndex(int, Fragment)>
		if(mActive == null)
	//*  17   29:aload_0         
	//*  18   30:getfield        #312 <Field SparseArray mActive>
	//*  19   33:ifnonnull       47
			mActive = new SparseArray();
	//   20   36:aload_0         
	//   21   37:new             #314 <Class SparseArray>
	//   22   40:dup             
	//   23   41:invokespecial   #1351 <Method void SparseArray()>
	//   24   44:putfield        #312 <Field SparseArray mActive>
		mActive.put(fragment.mIndex, ((Object) (fragment)));
	//   25   47:aload_0         
	//   26   48:getfield        #312 <Field SparseArray mActive>
	//   27   51:aload_1         
	//   28   52:getfield        #1346 <Field int Fragment.mIndex>
	//   29   55:aload_1         
	//   30   56:invokevirtual   #1354 <Method void SparseArray.put(int, Object)>
		if(DEBUG)
	//*  31   59:getstatic       #818 <Field boolean DEBUG>
	//*  32   62:ifeq            97
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   33   65:new             #334 <Class StringBuilder>
	//   34   68:dup             
	//   35   69:invokespecial   #335 <Method void StringBuilder()>
	//   36   72:astore_3        
			stringbuilder.append("Allocated fragment index ");
	//   37   73:aload_3         
	//   38   74:ldc2            #1356 <String "Allocated fragment index ">
	//   39   77:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   40   80:pop             
			stringbuilder.append(((Object) (fragment)));
	//   41   81:aload_3         
	//   42   82:aload_1         
	//   43   83:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//   44   86:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   45   87:ldc1            #75  <String "FragmentManager">
	//   46   89:aload_3         
	//   47   90:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   48   93:invokestatic    #826 <Method int Log.v(String, String)>
	//   49   96:pop             
		}
	//   50   97:return          
	}

	void makeInactive(Fragment fragment)
	{
		if(fragment.mIndex < 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1346 <Field int Fragment.mIndex>
	//*   2    4:ifge            8
			return;
	//    3    7:return          
		if(DEBUG)
	//*   4    8:getstatic       #818 <Field boolean DEBUG>
	//*   5   11:ifeq            46
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   14:new             #334 <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #335 <Method void StringBuilder()>
	//    9   21:astore_2        
			stringbuilder.append("Freeing fragment index ");
	//   10   22:aload_2         
	//   11   23:ldc2            #1359 <String "Freeing fragment index ">
	//   12   26:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:pop             
			stringbuilder.append(((Object) (fragment)));
	//   14   30:aload_2         
	//   15   31:aload_1         
	//   16   32:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//   17   35:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   18   36:ldc1            #75  <String "FragmentManager">
	//   19   38:aload_2         
	//   20   39:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   21   42:invokestatic    #826 <Method int Log.v(String, String)>
	//   22   45:pop             
		}
		mActive.put(fragment.mIndex, ((Object) (null)));
	//   23   46:aload_0         
	//   24   47:getfield        #312 <Field SparseArray mActive>
	//   25   50:aload_1         
	//   26   51:getfield        #1346 <Field int Fragment.mIndex>
	//   27   54:aconst_null     
	//   28   55:invokevirtual   #1354 <Method void SparseArray.put(int, Object)>
		fragment.initState();
	//   29   58:aload_1         
	//   30   59:invokevirtual   #1362 <Method void Fragment.initState()>
	//   31   62:return          
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
	//    4    6:getfield        #177 <Field int mCurState>
	//    5    9:istore_2        
		if(fragment.mRemoving)
	//*   6   10:aload_1         
	//*   7   11:getfield        #839 <Field boolean Fragment.mRemoving>
	//*   8   14:ifeq            42
			if(fragment.isInBackStack())
	//*   9   17:aload_1         
	//*  10   18:invokevirtual   #1366 <Method boolean Fragment.isInBackStack()>
	//*  11   21:ifeq            33
				i = Math.min(i, 1);
	//   12   24:iload_2         
	//   13   25:iconst_1        
	//   14   26:invokestatic    #194 <Method int Math.min(int, int)>
	//   15   29:istore_2        
			else
	//*  16   30:goto            42
				i = Math.min(i, 0);
	//   17   33:iload_2         
	//   18   34:iconst_0        
	//   19   35:invokestatic    #194 <Method int Math.min(int, int)>
	//   20   38:istore_2        
	//*  21   39:goto            42
		moveToState(fragment, i, fragment.getNextTransition(), fragment.getNextTransitionStyle(), false);
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:iload_2         
	//   25   45:aload_1         
	//   26   46:invokevirtual   #213 <Method int Fragment.getNextTransition()>
	//   27   49:aload_1         
	//   28   50:invokevirtual   #919 <Method int Fragment.getNextTransitionStyle()>
	//   29   53:iconst_0        
	//   30   54:invokevirtual   #217 <Method void moveToState(Fragment, int, int, int, boolean)>
		if(fragment.mView != null)
	//*  31   57:aload_1         
	//*  32   58:getfield        #221 <Field View Fragment.mView>
	//*  33   61:ifnull          245
		{
			Object obj = ((Object) (findFragmentUnder(fragment)));
	//   34   64:aload_0         
	//   35   65:aload_1         
	//   36   66:invokespecial   #1368 <Method Fragment findFragmentUnder(Fragment)>
	//   37   69:astore          4
			if(obj != null)
	//*  38   71:aload           4
	//*  39   73:ifnull          128
			{
				obj = ((Object) (((Fragment) (obj)).mView));
	//   40   76:aload           4
	//   41   78:getfield        #221 <Field View Fragment.mView>
	//   42   81:astore          4
				ViewGroup viewgroup = fragment.mContainer;
	//   43   83:aload_1         
	//   44   84:getfield        #241 <Field ViewGroup Fragment.mContainer>
	//   45   87:astore          5
				int j = viewgroup.indexOfChild(((View) (obj)));
	//   46   89:aload           5
	//   47   91:aload           4
	//   48   93:invokevirtual   #1372 <Method int ViewGroup.indexOfChild(View)>
	//   49   96:istore_2        
				int k = viewgroup.indexOfChild(fragment.mView);
	//   50   97:aload           5
	//   51   99:aload_1         
	//   52  100:getfield        #221 <Field View Fragment.mView>
	//   53  103:invokevirtual   #1372 <Method int ViewGroup.indexOfChild(View)>
	//   54  106:istore_3        
				if(k < j)
	//*  55  107:iload_3         
	//*  56  108:iload_2         
	//*  57  109:icmpge          128
				{
					viewgroup.removeViewAt(k);
	//   58  112:aload           5
	//   59  114:iload_3         
	//   60  115:invokevirtual   #1375 <Method void ViewGroup.removeViewAt(int)>
					viewgroup.addView(fragment.mView, j);
	//   61  118:aload           5
	//   62  120:aload_1         
	//   63  121:getfield        #221 <Field View Fragment.mView>
	//   64  124:iload_2         
	//   65  125:invokevirtual   #1379 <Method void ViewGroup.addView(View, int)>
				}
			}
			if(fragment.mIsNewlyAdded && fragment.mContainer != null)
	//*  66  128:aload_1         
	//*  67  129:getfield        #227 <Field boolean Fragment.mIsNewlyAdded>
	//*  68  132:ifeq            245
	//*  69  135:aload_1         
	//*  70  136:getfield        #241 <Field ViewGroup Fragment.mContainer>
	//*  71  139:ifnull          245
			{
				if(fragment.mPostponedAlpha > 0.0F)
	//*  72  142:aload_1         
	//*  73  143:getfield        #632 <Field float Fragment.mPostponedAlpha>
	//*  74  146:fconst_0        
	//*  75  147:fcmpl           
	//*  76  148:ifle            162
					fragment.mView.setAlpha(fragment.mPostponedAlpha);
	//   77  151:aload_1         
	//   78  152:getfield        #221 <Field View Fragment.mView>
	//   79  155:aload_1         
	//   80  156:getfield        #632 <Field float Fragment.mPostponedAlpha>
	//   81  159:invokevirtual   #635 <Method void View.setAlpha(float)>
				fragment.mPostponedAlpha = 0.0F;
	//   82  162:aload_1         
	//   83  163:fconst_0        
	//   84  164:putfield        #632 <Field float Fragment.mPostponedAlpha>
				fragment.mIsNewlyAdded = false;
	//   85  167:aload_1         
	//   86  168:iconst_0        
	//   87  169:putfield        #227 <Field boolean Fragment.mIsNewlyAdded>
				AnimationOrAnimator animationoranimator = loadAnimation(fragment, fragment.getNextTransition(), true, fragment.getNextTransitionStyle());
	//   88  172:aload_0         
	//   89  173:aload_1         
	//   90  174:aload_1         
	//   91  175:invokevirtual   #213 <Method int Fragment.getNextTransition()>
	//   92  178:iconst_1        
	//   93  179:aload_1         
	//   94  180:invokevirtual   #919 <Method int Fragment.getNextTransitionStyle()>
	//   95  183:invokevirtual   #923 <Method FragmentManagerImpl$AnimationOrAnimator loadAnimation(Fragment, int, boolean, int)>
	//   96  186:astore          4
				if(animationoranimator != null)
	//*  97  188:aload           4
	//*  98  190:ifnull          245
				{
					setHWLayerAnimListenerIfAlpha(fragment.mView, animationoranimator);
	//   99  193:aload_1         
	//  100  194:getfield        #221 <Field View Fragment.mView>
	//  101  197:aload           4
	//  102  199:invokestatic    #278 <Method void setHWLayerAnimListenerIfAlpha(View, FragmentManagerImpl$AnimationOrAnimator)>
					if(animationoranimator.animation != null)
	//* 103  202:aload           4
	//* 104  204:getfield        #255 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//* 105  207:ifnull          225
					{
						fragment.mView.startAnimation(animationoranimator.animation);
	//  106  210:aload_1         
	//  107  211:getfield        #221 <Field View Fragment.mView>
	//  108  214:aload           4
	//  109  216:getfield        #255 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//  110  219:invokevirtual   #284 <Method void View.startAnimation(Animation)>
					} else
	//* 111  222:goto            245
					{
						animationoranimator.animator.setTarget(((Object) (fragment.mView)));
	//  112  225:aload           4
	//  113  227:getfield        #288 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//  114  230:aload_1         
	//  115  231:getfield        #221 <Field View Fragment.mView>
	//  116  234:invokevirtual   #305 <Method void Animator.setTarget(Object)>
						animationoranimator.animator.start();
	//  117  237:aload           4
	//  118  239:getfield        #288 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//  119  242:invokevirtual   #308 <Method void Animator.start()>
					}
				}
			}
		}
		if(fragment.mHiddenChanged)
	//* 120  245:aload_1         
	//* 121  246:getfield        #842 <Field boolean Fragment.mHiddenChanged>
	//* 122  249:ifeq            257
			completeShowHideFragment(fragment);
	//  123  252:aload_0         
	//  124  253:aload_1         
	//  125  254:invokevirtual   #1381 <Method void completeShowHideFragment(Fragment)>
	//  126  257:return          
	}

	void moveToState(int i, boolean flag)
	{
		if(mHost == null && i != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #398 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       25
	//*   3    7:iload_1         
	//*   4    8:ifne            14
	//*   5   11:goto            25
			throw new IllegalStateException("No activity");
	//    6   14:new             #343 <Class IllegalStateException>
	//    7   17:dup             
	//    8   18:ldc2            #1383 <String "No activity">
	//    9   21:invokespecial   #350 <Method void IllegalStateException(String)>
	//   10   24:athrow          
		if(!flag && i == mCurState)
	//*  11   25:iload_2         
	//*  12   26:ifne            38
	//*  13   29:iload_1         
	//*  14   30:aload_0         
	//*  15   31:getfield        #177 <Field int mCurState>
	//*  16   34:icmpne          38
			return;
	//   17   37:return          
		mCurState = i;
	//   18   38:aload_0         
	//   19   39:iload_1         
	//   20   40:putfield        #177 <Field int mCurState>
		if(mActive != null)
	//*  21   43:aload_0         
	//*  22   44:getfield        #312 <Field SparseArray mActive>
	//*  23   47:ifnull          197
		{
			int j = mAdded.size();
	//   24   50:aload_0         
	//   25   51:getfield        #170 <Field ArrayList mAdded>
	//   26   54:invokevirtual   #198 <Method int ArrayList.size()>
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
	//   35   67:getfield        #170 <Field ArrayList mAdded>
	//   36   70:iload_1         
	//   37   71:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   38   74:checkcast       #204 <Class Fragment>
	//   39   77:invokevirtual   #1385 <Method void moveFragmentToExpectedState(Fragment)>

	//   40   80:iload_1         
	//   41   81:iconst_1        
	//   42   82:iadd            
	//   43   83:istore_1        
	//*  44   84:goto            60
			j = mActive.size();
	//   45   87:aload_0         
	//   46   88:getfield        #312 <Field SparseArray mActive>
	//   47   91:invokevirtual   #315 <Method int SparseArray.size()>
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
	//   55  103:getfield        #312 <Field SparseArray mActive>
	//   56  106:iload_1         
	//   57  107:invokevirtual   #318 <Method Object SparseArray.valueAt(int)>
	//   58  110:checkcast       #204 <Class Fragment>
	//   59  113:astore          4
				if(fragment != null && (fragment.mRemoving || fragment.mDetached) && !fragment.mIsNewlyAdded)
	//*  60  115:aload           4
	//*  61  117:ifnull          150
	//*  62  120:aload           4
	//*  63  122:getfield        #839 <Field boolean Fragment.mRemoving>
	//*  64  125:ifne            136
	//*  65  128:aload           4
	//*  66  130:getfield        #833 <Field boolean Fragment.mDetached>
	//*  67  133:ifeq            150
	//*  68  136:aload           4
	//*  69  138:getfield        #227 <Field boolean Fragment.mIsNewlyAdded>
	//*  70  141:ifne            150
					moveFragmentToExpectedState(fragment);
	//   71  144:aload_0         
	//   72  145:aload           4
	//   73  147:invokevirtual   #1385 <Method void moveFragmentToExpectedState(Fragment)>
			}

	//   74  150:iload_1         
	//   75  151:iconst_1        
	//   76  152:iadd            
	//   77  153:istore_1        
	//*  78  154:goto            97
			startPendingDeferredFragments();
	//   79  157:aload_0         
	//   80  158:invokevirtual   #1112 <Method void startPendingDeferredFragments()>
			if(mNeedMenuInvalidate)
	//*  81  161:aload_0         
	//*  82  162:getfield        #850 <Field boolean mNeedMenuInvalidate>
	//*  83  165:ifeq            197
			{
				FragmentHostCallback fragmenthostcallback = mHost;
	//   84  168:aload_0         
	//   85  169:getfield        #398 <Field FragmentHostCallback mHost>
	//   86  172:astore          4
				if(fragmenthostcallback != null && mCurState == 4)
	//*  87  174:aload           4
	//*  88  176:ifnull          197
	//*  89  179:aload_0         
	//*  90  180:getfield        #177 <Field int mCurState>
	//*  91  183:iconst_4        
	//*  92  184:icmpne          197
				{
					fragmenthostcallback.onSupportInvalidateOptionsMenu();
	//   93  187:aload           4
	//   94  189:invokevirtual   #1388 <Method void FragmentHostCallback.onSupportInvalidateOptionsMenu()>
					mNeedMenuInvalidate = false;
	//   95  192:aload_0         
	//   96  193:iconst_0        
	//   97  194:putfield        #850 <Field boolean mNeedMenuInvalidate>
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
	//    3    3:getfield        #177 <Field int mCurState>
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #217 <Method void moveToState(Fragment, int, int, int, boolean)>
	//    8   12:return          
	}

	void moveToState(Fragment fragment, int i, int j, int k, boolean flag)
	{
		android.content.res.Resources.NotFoundException notfoundexception;
		boolean flag3 = fragment.mAdded;
	//    0    0:aload_1         
	//    1    1:getfield        #621 <Field boolean Fragment.mAdded>
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
	//*  10   18:getfield        #833 <Field boolean Fragment.mDetached>
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
	//*  26   48:getfield        #839 <Field boolean Fragment.mRemoving>
	//*  27   51:ifeq            91
		{
			i1 = i;
	//   28   54:iload_2         
	//   29   55:istore          6
			if(i > fragment.mState)
	//*  30   57:iload_2         
	//*  31   58:aload_1         
	//*  32   59:getfield        #207 <Field int Fragment.mState>
	//*  33   62:icmple          91
				if(fragment.mState == 0 && fragment.isInBackStack())
	//*  34   65:aload_1         
	//*  35   66:getfield        #207 <Field int Fragment.mState>
	//*  36   69:ifne            85
	//*  37   72:aload_1         
	//*  38   73:invokevirtual   #1366 <Method boolean Fragment.isInBackStack()>
	//*  39   76:ifeq            85
					i1 = 1;
	//   40   79:iconst_1        
	//   41   80:istore          6
				else
	//*  42   82:goto            91
					i1 = fragment.mState;
	//   43   85:aload_1         
	//   44   86:getfield        #207 <Field int Fragment.mState>
	//   45   89:istore          6
		}
		if(fragment.mDeferStart && fragment.mState < 3 && i1 > 2)
	//*  46   91:aload_1         
	//*  47   92:getfield        #1391 <Field boolean Fragment.mDeferStart>
	//*  48   95:ifeq            117
	//*  49   98:aload_1         
	//*  50   99:getfield        #207 <Field int Fragment.mState>
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
	//*  62  121:getfield        #207 <Field int Fragment.mState>
	//*  63  124:iload_2         
	//*  64  125:icmpgt          1360
		{
			if(fragment.mFromLayout && !fragment.mInLayout)
	//*  65  128:aload_1         
	//*  66  129:getfield        #1203 <Field boolean Fragment.mFromLayout>
	//*  67  132:ifeq            143
	//*  68  135:aload_1         
	//*  69  136:getfield        #1394 <Field boolean Fragment.mInLayout>
	//*  70  139:ifne            143
				return;
	//   71  142:return          
			if(fragment.getAnimatingAway() != null || fragment.getAnimator() != null)
	//*  72  143:aload_1         
	//*  73  144:invokevirtual   #374 <Method View Fragment.getAnimatingAway()>
	//*  74  147:ifnonnull       157
	//*  75  150:aload_1         
	//*  76  151:invokevirtual   #391 <Method Animator Fragment.getAnimator()>
	//*  77  154:ifnull          179
			{
				fragment.setAnimatingAway(((View) (null)));
	//   78  157:aload_1         
	//   79  158:aconst_null     
	//   80  159:invokevirtual   #261 <Method void Fragment.setAnimatingAway(View)>
				fragment.setAnimator(((Animator) (null)));
	//   81  162:aload_1         
	//   82  163:aconst_null     
	//   83  164:invokevirtual   #292 <Method void Fragment.setAnimator(Animator)>
				moveToState(fragment, fragment.getStateAfterAnimating(), 0, 0, true);
	//   84  167:aload_0         
	//   85  168:aload_1         
	//   86  169:aload_1         
	//   87  170:invokevirtual   #377 <Method int Fragment.getStateAfterAnimating()>
	//   88  173:iconst_0        
	//   89  174:iconst_0        
	//   90  175:iconst_1        
	//   91  176:invokevirtual   #217 <Method void moveToState(Fragment, int, int, int, boolean)>
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
	//*  99  188:getfield        #207 <Field int Fragment.mState>
			{
	//* 100  191:tableswitch     0 3: default 220
	//	               0 223
	//	               1 761
	//	               2 1220
	//	               3 1286
	//* 101  220:goto            1956
			case 0: // '\0'
				j = i;
	//  102  223:iload_2         
	//  103  224:istore_3        
				if(i > 0)
	//* 104  225:iload_2         
	//* 105  226:ifle            761
				{
					if(DEBUG)
	//* 106  229:getstatic       #818 <Field boolean DEBUG>
	//* 107  232:ifeq            271
					{
						StringBuilder stringbuilder = new StringBuilder();
	//  108  235:new             #334 <Class StringBuilder>
	//  109  238:dup             
	//  110  239:invokespecial   #335 <Method void StringBuilder()>
	//  111  242:astore          10
						stringbuilder.append("moveto CREATED: ");
	//  112  244:aload           10
	//  113  246:ldc2            #1396 <String "moveto CREATED: ">
	//  114  249:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  115  252:pop             
						stringbuilder.append(((Object) (fragment)));
	//  116  253:aload           10
	//  117  255:aload_1         
	//  118  256:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//  119  259:pop             
						Log.v("FragmentManager", stringbuilder.toString());
	//  120  260:ldc1            #75  <String "FragmentManager">
	//  121  262:aload           10
	//  122  264:invokevirtual   #347 <Method String StringBuilder.toString()>
	//  123  267:invokestatic    #826 <Method int Log.v(String, String)>
	//  124  270:pop             
					}
					j = i;
	//  125  271:iload_2         
	//  126  272:istore_3        
					if(fragment.mSavedFragmentState != null)
	//* 127  273:aload_1         
	//* 128  274:getfield        #1209 <Field Bundle Fragment.mSavedFragmentState>
	//* 129  277:ifnull          408
					{
						fragment.mSavedFragmentState.setClassLoader(mHost.getContext().getClassLoader());
	//  130  280:aload_1         
	//  131  281:getfield        #1209 <Field Bundle Fragment.mSavedFragmentState>
	//  132  284:aload_0         
	//  133  285:getfield        #398 <Field FragmentHostCallback mHost>
	//  134  288:invokevirtual   #1308 <Method Context FragmentHostCallback.getContext()>
	//  135  291:invokevirtual   #1400 <Method ClassLoader Context.getClassLoader()>
	//  136  294:invokevirtual   #1404 <Method void Bundle.setClassLoader(ClassLoader)>
						fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
	//  137  297:aload_1         
	//  138  298:aload_1         
	//  139  299:getfield        #1209 <Field Bundle Fragment.mSavedFragmentState>
	//  140  302:ldc1            #87  <String "android:view_state">
	//  141  304:invokevirtual   #1408 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//  142  307:putfield        #1411 <Field SparseArray Fragment.mSavedViewState>
						fragment.mTarget = getFragment(fragment.mSavedFragmentState, "android:target_state");
	//  143  310:aload_1         
	//  144  311:aload_0         
	//  145  312:aload_1         
	//  146  313:getfield        #1209 <Field Bundle Fragment.mSavedFragmentState>
	//  147  316:ldc1            #81  <String "android:target_state">
	//  148  318:invokevirtual   #1413 <Method Fragment getFragment(Bundle, String)>
	//  149  321:putfield        #1416 <Field Fragment Fragment.mTarget>
						if(fragment.mTarget != null)
	//* 150  324:aload_1         
	//* 151  325:getfield        #1416 <Field Fragment Fragment.mTarget>
	//* 152  328:ifnull          345
							fragment.mTargetRequestCode = fragment.mSavedFragmentState.getInt("android:target_req_state", 0);
	//  153  331:aload_1         
	//  154  332:aload_1         
	//  155  333:getfield        #1209 <Field Bundle Fragment.mSavedFragmentState>
	//  156  336:ldc1            #78  <String "android:target_req_state">
	//  157  338:iconst_0        
	//  158  339:invokevirtual   #1268 <Method int Bundle.getInt(String, int)>
	//  159  342:putfield        #1419 <Field int Fragment.mTargetRequestCode>
						if(fragment.mSavedUserVisibleHint != null)
	//* 160  345:aload_1         
	//* 161  346:getfield        #1423 <Field Boolean Fragment.mSavedUserVisibleHint>
	//* 162  349:ifnull          371
						{
							fragment.mUserVisibleHint = fragment.mSavedUserVisibleHint.booleanValue();
	//  163  352:aload_1         
	//  164  353:aload_1         
	//  165  354:getfield        #1423 <Field Boolean Fragment.mSavedUserVisibleHint>
	//  166  357:invokevirtual   #436 <Method boolean Boolean.booleanValue()>
	//  167  360:putfield        #1426 <Field boolean Fragment.mUserVisibleHint>
							fragment.mSavedUserVisibleHint = null;
	//  168  363:aload_1         
	//  169  364:aconst_null     
	//  170  365:putfield        #1423 <Field Boolean Fragment.mSavedUserVisibleHint>
						} else
	//* 171  368:goto            385
						{
							fragment.mUserVisibleHint = fragment.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
	//  172  371:aload_1         
	//  173  372:aload_1         
	//  174  373:getfield        #1209 <Field Bundle Fragment.mSavedFragmentState>
	//  175  376:ldc1            #84  <String "android:user_visible_hint">
	//  176  378:iconst_1        
	//  177  379:invokevirtual   #1430 <Method boolean Bundle.getBoolean(String, boolean)>
	//  178  382:putfield        #1426 <Field boolean Fragment.mUserVisibleHint>
						}
						j = i;
	//  179  385:iload_2         
	//  180  386:istore_3        
						if(!fragment.mUserVisibleHint)
	//* 181  387:aload_1         
	//* 182  388:getfield        #1426 <Field boolean Fragment.mUserVisibleHint>
	//* 183  391:ifne            408
						{
							fragment.mDeferStart = true;
	//  184  394:aload_1         
	//  185  395:iconst_1        
	//  186  396:putfield        #1391 <Field boolean Fragment.mDeferStart>
							j = i;
	//  187  399:iload_2         
	//  188  400:istore_3        
							if(i > 2)
	//* 189  401:iload_2         
	//* 190  402:iconst_2        
	//* 191  403:icmple          408
								j = 2;
	//  192  406:iconst_2        
	//  193  407:istore_3        
						}
					}
					Object obj = ((Object) (mHost));
	//  194  408:aload_0         
	//  195  409:getfield        #398 <Field FragmentHostCallback mHost>
	//  196  412:astore          10
					fragment.mHost = ((FragmentHostCallback) (obj));
	//  197  414:aload_1         
	//  198  415:aload           10
	//  199  417:putfield        #1431 <Field FragmentHostCallback Fragment.mHost>
					Fragment fragment1 = mParent;
	//  200  420:aload_0         
	//  201  421:getfield        #890 <Field Fragment mParent>
	//  202  424:astore          11
					fragment.mParentFragment = fragment1;
	//  203  426:aload_1         
	//  204  427:aload           11
	//  205  429:putfield        #1434 <Field Fragment Fragment.mParentFragment>
					if(fragment1 != null)
	//* 206  432:aload           11
	//* 207  434:ifnull          447
						obj = ((Object) (fragment1.mChildFragmentManager));
	//  208  437:aload           11
	//  209  439:getfield        #1438 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
	//  210  442:astore          10
					else
	//* 211  444:goto            454
						obj = ((Object) (((FragmentHostCallback) (obj)).getFragmentManagerImpl()));
	//  212  447:aload           10
	//  213  449:invokevirtual   #1442 <Method FragmentManagerImpl FragmentHostCallback.getFragmentManagerImpl()>
	//  214  452:astore          10
					fragment.mFragmentManager = ((FragmentManagerImpl) (obj));
	//  215  454:aload_1         
	//  216  455:aload           10
	//  217  457:putfield        #1445 <Field FragmentManagerImpl Fragment.mFragmentManager>
					if(fragment.mTarget != null)
	//* 218  460:aload_1         
	//* 219  461:getfield        #1416 <Field Fragment Fragment.mTarget>
	//* 220  464:ifnull          580
						if(mActive.get(fragment.mTarget.mIndex) == fragment.mTarget)
	//* 221  467:aload_0         
	//* 222  468:getfield        #312 <Field SparseArray mActive>
	//* 223  471:aload_1         
	//* 224  472:getfield        #1416 <Field Fragment Fragment.mTarget>
	//* 225  475:getfield        #1346 <Field int Fragment.mIndex>
	//* 226  478:invokevirtual   #1269 <Method Object SparseArray.get(int)>
	//* 227  481:aload_1         
	//* 228  482:getfield        #1416 <Field Fragment Fragment.mTarget>
	//* 229  485:if_acmpne       514
						{
							if(fragment.mTarget.mState < 1)
	//* 230  488:aload_1         
	//* 231  489:getfield        #1416 <Field Fragment Fragment.mTarget>
	//* 232  492:getfield        #207 <Field int Fragment.mState>
	//* 233  495:iconst_1        
	//* 234  496:icmpge          580
								moveToState(fragment.mTarget, 1, 0, 0, true);
	//  235  499:aload_0         
	//  236  500:aload_1         
	//  237  501:getfield        #1416 <Field Fragment Fragment.mTarget>
	//  238  504:iconst_1        
	//  239  505:iconst_0        
	//  240  506:iconst_0        
	//  241  507:iconst_1        
	//  242  508:invokevirtual   #217 <Method void moveToState(Fragment, int, int, int, boolean)>
						} else
	//* 243  511:goto            580
						{
							StringBuilder stringbuilder1 = new StringBuilder();
	//  244  514:new             #334 <Class StringBuilder>
	//  245  517:dup             
	//  246  518:invokespecial   #335 <Method void StringBuilder()>
	//  247  521:astore          10
							stringbuilder1.append("Fragment ");
	//  248  523:aload           10
	//  249  525:ldc2            #1447 <String "Fragment ">
	//  250  528:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  251  531:pop             
							stringbuilder1.append(((Object) (fragment)));
	//  252  532:aload           10
	//  253  534:aload_1         
	//  254  535:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//  255  538:pop             
							stringbuilder1.append(" declared target fragment ");
	//  256  539:aload           10
	//  257  541:ldc2            #1449 <String " declared target fragment ">
	//  258  544:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  259  547:pop             
							stringbuilder1.append(((Object) (fragment.mTarget)));
	//  260  548:aload           10
	//  261  550:aload_1         
	//  262  551:getfield        #1416 <Field Fragment Fragment.mTarget>
	//  263  554:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//  264  557:pop             
							stringbuilder1.append(" that does not belong to this FragmentManager!");
	//  265  558:aload           10
	//  266  560:ldc2            #1451 <String " that does not belong to this FragmentManager!">
	//  267  563:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  268  566:pop             
							throw new IllegalStateException(stringbuilder1.toString());
	//  269  567:new             #343 <Class IllegalStateException>
	//  270  570:dup             
	//  271  571:aload           10
	//  272  573:invokevirtual   #347 <Method String StringBuilder.toString()>
	//  273  576:invokespecial   #350 <Method void IllegalStateException(String)>
	//  274  579:athrow          
						}
					dispatchOnFragmentPreAttached(fragment, mHost.getContext(), false);
	//  275  580:aload_0         
	//  276  581:aload_1         
	//  277  582:aload_0         
	//  278  583:getfield        #398 <Field FragmentHostCallback mHost>
	//  279  586:invokevirtual   #1308 <Method Context FragmentHostCallback.getContext()>
	//  280  589:iconst_0        
	//  281  590:invokevirtual   #1038 <Method void dispatchOnFragmentPreAttached(Fragment, Context, boolean)>
					fragment.mCalled = false;
	//  282  593:aload_1         
	//  283  594:iconst_0        
	//  284  595:putfield        #1454 <Field boolean Fragment.mCalled>
					fragment.onAttach(mHost.getContext());
	//  285  598:aload_1         
	//  286  599:aload_0         
	//  287  600:getfield        #398 <Field FragmentHostCallback mHost>
	//  288  603:invokevirtual   #1308 <Method Context FragmentHostCallback.getContext()>
	//  289  606:invokevirtual   #1458 <Method void Fragment.onAttach(Context)>
					if(fragment.mCalled)
	//* 290  609:aload_1         
	//* 291  610:getfield        #1454 <Field boolean Fragment.mCalled>
	//* 292  613:ifeq            714
					{
						if(fragment.mParentFragment == null)
	//* 293  616:aload_1         
	//* 294  617:getfield        #1434 <Field Fragment Fragment.mParentFragment>
	//* 295  620:ifnonnull       634
							mHost.onAttachFragment(fragment);
	//  296  623:aload_0         
	//  297  624:getfield        #398 <Field FragmentHostCallback mHost>
	//  298  627:aload_1         
	//  299  628:invokevirtual   #1461 <Method void FragmentHostCallback.onAttachFragment(Fragment)>
						else
	//* 300  631:goto            642
							fragment.mParentFragment.onAttachFragment(fragment);
	//  301  634:aload_1         
	//  302  635:getfield        #1434 <Field Fragment Fragment.mParentFragment>
	//  303  638:aload_1         
	//  304  639:invokevirtual   #1462 <Method void Fragment.onAttachFragment(Fragment)>
						dispatchOnFragmentAttached(fragment, mHost.getContext(), false);
	//  305  642:aload_0         
	//  306  643:aload_1         
	//  307  644:aload_0         
	//  308  645:getfield        #398 <Field FragmentHostCallback mHost>
	//  309  648:invokevirtual   #1308 <Method Context FragmentHostCallback.getContext()>
	//  310  651:iconst_0        
	//  311  652:invokevirtual   #1006 <Method void dispatchOnFragmentAttached(Fragment, Context, boolean)>
						if(!fragment.mIsCreated)
	//* 312  655:aload_1         
	//* 313  656:getfield        #1465 <Field boolean Fragment.mIsCreated>
	//* 314  659:ifne            693
						{
							dispatchOnFragmentPreCreated(fragment, fragment.mSavedFragmentState, false);
	//  315  662:aload_0         
	//  316  663:aload_1         
	//  317  664:aload_1         
	//  318  665:getfield        #1209 <Field Bundle Fragment.mSavedFragmentState>
	//  319  668:iconst_0        
	//  320  669:invokevirtual   #1044 <Method void dispatchOnFragmentPreCreated(Fragment, Bundle, boolean)>
							fragment.performCreate(fragment.mSavedFragmentState);
	//  321  672:aload_1         
	//  322  673:aload_1         
	//  323  674:getfield        #1209 <Field Bundle Fragment.mSavedFragmentState>
	//  324  677:invokevirtual   #1469 <Method void Fragment.performCreate(Bundle)>
							dispatchOnFragmentCreated(fragment, fragment.mSavedFragmentState, false);
	//  325  680:aload_0         
	//  326  681:aload_1         
	//  327  682:aload_1         
	//  328  683:getfield        #1209 <Field Bundle Fragment.mSavedFragmentState>
	//  329  686:iconst_0        
	//  330  687:invokevirtual   #1013 <Method void dispatchOnFragmentCreated(Fragment, Bundle, boolean)>
						} else
	//* 331  690:goto            706
						{
							fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
	//  332  693:aload_1         
	//  333  694:aload_1         
	//  334  695:getfield        #1209 <Field Bundle Fragment.mSavedFragmentState>
	//  335  698:invokevirtual   #1472 <Method void Fragment.restoreChildFragmentState(Bundle)>
							fragment.mState = 1;
	//  336  701:aload_1         
	//  337  702:iconst_1        
	//  338  703:putfield        #207 <Field int Fragment.mState>
						}
						fragment.mRetaining = false;
	//  339  706:aload_1         
	//  340  707:iconst_0        
	//  341  708:putfield        #754 <Field boolean Fragment.mRetaining>
					} else
	//* 342  711:goto            761
					{
						StringBuilder stringbuilder2 = new StringBuilder();
	//  343  714:new             #334 <Class StringBuilder>
	//  344  717:dup             
	//  345  718:invokespecial   #335 <Method void StringBuilder()>
	//  346  721:astore          10
						stringbuilder2.append("Fragment ");
	//  347  723:aload           10
	//  348  725:ldc2            #1447 <String "Fragment ">
	//  349  728:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  350  731:pop             
						stringbuilder2.append(((Object) (fragment)));
	//  351  732:aload           10
	//  352  734:aload_1         
	//  353  735:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//  354  738:pop             
						stringbuilder2.append(" did not call through to super.onAttach()");
	//  355  739:aload           10
	//  356  741:ldc2            #1474 <String " did not call through to super.onAttach()">
	//  357  744:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  358  747:pop             
						throw new SuperNotCalledException(stringbuilder2.toString());
	//  359  748:new             #1476 <Class SuperNotCalledException>
	//  360  751:dup             
	//  361  752:aload           10
	//  362  754:invokevirtual   #347 <Method String StringBuilder.toString()>
	//  363  757:invokespecial   #1477 <Method void SuperNotCalledException(String)>
	//  364  760:athrow          
					}
				}
				// fall through

			case 1: // '\001'
				ensureInflatedFragmentView(fragment);
	//  365  761:aload_0         
	//  366  762:aload_1         
	//  367  763:invokevirtual   #1479 <Method void ensureInflatedFragmentView(Fragment)>
				k = j;
	//  368  766:iload_3         
	//  369  767:istore          4
				if(j > 1)
	//* 370  769:iload_3         
	//* 371  770:iconst_1        
	//* 372  771:icmple          1220
				{
					if(DEBUG)
	//* 373  774:getstatic       #818 <Field boolean DEBUG>
	//* 374  777:ifeq            816
					{
						StringBuilder stringbuilder3 = new StringBuilder();
	//  375  780:new             #334 <Class StringBuilder>
	//  376  783:dup             
	//  377  784:invokespecial   #335 <Method void StringBuilder()>
	//  378  787:astore          10
						stringbuilder3.append("moveto ACTIVITY_CREATED: ");
	//  379  789:aload           10
	//  380  791:ldc2            #1481 <String "moveto ACTIVITY_CREATED: ">
	//  381  794:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  382  797:pop             
						stringbuilder3.append(((Object) (fragment)));
	//  383  798:aload           10
	//  384  800:aload_1         
	//  385  801:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//  386  804:pop             
						Log.v("FragmentManager", stringbuilder3.toString());
	//  387  805:ldc1            #75  <String "FragmentManager">
	//  388  807:aload           10
	//  389  809:invokevirtual   #347 <Method String StringBuilder.toString()>
	//  390  812:invokestatic    #826 <Method int Log.v(String, String)>
	//  391  815:pop             
					}
					if(!fragment.mFromLayout)
	//* 392  816:aload_1         
	//* 393  817:getfield        #1203 <Field boolean Fragment.mFromLayout>
	//* 394  820:ifne            1179
					{
						Object obj1;
						if(fragment.mContainerId != 0)
	//* 395  823:aload_1         
	//* 396  824:getfield        #911 <Field int Fragment.mContainerId>
	//* 397  827:ifeq            1032
						{
							if(fragment.mContainerId == -1)
	//* 398  830:aload_1         
	//* 399  831:getfield        #911 <Field int Fragment.mContainerId>
	//* 400  834:iconst_m1       
	//* 401  835:icmpne          888
							{
								StringBuilder stringbuilder4 = new StringBuilder();
	//  402  838:new             #334 <Class StringBuilder>
	//  403  841:dup             
	//  404  842:invokespecial   #335 <Method void StringBuilder()>
	//  405  845:astore          10
								stringbuilder4.append("Cannot create fragment ");
	//  406  847:aload           10
	//  407  849:ldc2            #1483 <String "Cannot create fragment ">
	//  408  852:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  409  855:pop             
								stringbuilder4.append(((Object) (fragment)));
	//  410  856:aload           10
	//  411  858:aload_1         
	//  412  859:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//  413  862:pop             
								stringbuilder4.append(" for a container view with no id");
	//  414  863:aload           10
	//  415  865:ldc2            #1485 <String " for a container view with no id">
	//  416  868:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  417  871:pop             
								throwException(((RuntimeException) (new IllegalArgumentException(stringbuilder4.toString()))));
	//  418  872:aload_0         
	//  419  873:new             #1487 <Class IllegalArgumentException>
	//  420  876:dup             
	//  421  877:aload           10
	//  422  879:invokevirtual   #347 <Method String StringBuilder.toString()>
	//  423  882:invokespecial   #1488 <Method void IllegalArgumentException(String)>
	//  424  885:invokespecial   #1275 <Method void throwException(RuntimeException)>
							}
							ViewGroup viewgroup = (ViewGroup)mContainer.onFindViewById(fragment.mContainerId);
	//  425  888:aload_0         
	//  426  889:getfield        #888 <Field FragmentContainer mContainer>
	//  427  892:aload_1         
	//  428  893:getfield        #911 <Field int Fragment.mContainerId>
	//  429  896:invokevirtual   #1494 <Method View FragmentContainer.onFindViewById(int)>
	//  430  899:checkcast       #243 <Class ViewGroup>
	//  431  902:astore          11
							obj1 = ((Object) (viewgroup));
	//  432  904:aload           11
	//  433  906:astore          10
							if(viewgroup == null)
	//* 434  908:aload           11
	//* 435  910:ifnonnull       1035
							{
								obj1 = ((Object) (viewgroup));
	//  436  913:aload           11
	//  437  915:astore          10
								if(!fragment.mRestored)
	//* 438  917:aload_1         
	//* 439  918:getfield        #1497 <Field boolean Fragment.mRestored>
	//* 440  921:ifne            1035
								{
									try
									{
										obj1 = ((Object) (fragment.getResources().getResourceName(fragment.mContainerId)));
	//  441  924:aload_1         
	//  442  925:invokevirtual   #1498 <Method Resources Fragment.getResources()>
	//  443  928:aload_1         
	//  444  929:getfield        #911 <Field int Fragment.mContainerId>
	//  445  932:invokevirtual   #1501 <Method String Resources.getResourceName(int)>
	//  446  935:astore          10
									}
	//* 447  937:goto            945
	//* 448  940:ldc2            #1503 <String "unknown">
	//* 449  943:astore          10
	//* 450  945:new             #334 <Class StringBuilder>
	//* 451  948:dup             
	//* 452  949:invokespecial   #335 <Method void StringBuilder()>
	//* 453  952:astore          12
	//* 454  954:aload           12
	//* 455  956:ldc2            #1505 <String "No view found for id 0x">
	//* 456  959:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 457  962:pop             
	//* 458  963:aload           12
	//* 459  965:aload_1         
	//* 460  966:getfield        #911 <Field int Fragment.mContainerId>
	//* 461  969:invokestatic    #1128 <Method String Integer.toHexString(int)>
	//* 462  972:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 463  975:pop             
	//* 464  976:aload           12
	//* 465  978:ldc2            #1507 <String " (">
	//* 466  981:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 467  984:pop             
	//* 468  985:aload           12
	//* 469  987:aload           10
	//* 470  989:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 471  992:pop             
	//* 472  993:aload           12
	//* 473  995:ldc2            #1509 <String ") for fragment ">
	//* 474  998:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 475 1001:pop             
	//* 476 1002:aload           12
	//* 477 1004:aload_1         
	//* 478 1005:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//* 479 1008:pop             
	//* 480 1009:aload_0         
	//* 481 1010:new             #1487 <Class IllegalArgumentException>
	//* 482 1013:dup             
	//* 483 1014:aload           12
	//* 484 1016:invokevirtual   #347 <Method String StringBuilder.toString()>
	//* 485 1019:invokespecial   #1488 <Method void IllegalArgumentException(String)>
	//* 486 1022:invokespecial   #1275 <Method void throwException(RuntimeException)>
	//* 487 1025:aload           11
	//* 488 1027:astore          10
	//* 489 1029:goto            1035
	//* 490 1032:aconst_null     
	//* 491 1033:astore          10
	//* 492 1035:aload_1         
	//* 493 1036:aload           10
	//* 494 1038:putfield        #241 <Field ViewGroup Fragment.mContainer>
	//* 495 1041:aload_1         
	//* 496 1042:aload_1         
	//* 497 1043:aload_1         
	//* 498 1044:getfield        #1209 <Field Bundle Fragment.mSavedFragmentState>
	//* 499 1047:invokevirtual   #1213 <Method android.view.LayoutInflater Fragment.performGetLayoutInflater(Bundle)>
	//* 500 1050:aload           10
	//* 501 1052:aload_1         
	//* 502 1053:getfield        #1209 <Field Bundle Fragment.mSavedFragmentState>
	//* 503 1056:invokevirtual   #1217 <Method void Fragment.performCreateView(android.view.LayoutInflater, ViewGroup, Bundle)>
	//* 504 1059:aload_1         
	//* 505 1060:getfield        #221 <Field View Fragment.mView>
	//* 506 1063:ifnull          1174
	//* 507 1066:aload_1         
	//* 508 1067:aload_1         
	//* 509 1068:getfield        #221 <Field View Fragment.mView>
	//* 510 1071:putfield        #1220 <Field View Fragment.mInnerView>
	//* 511 1074:aload_1         
	//* 512 1075:getfield        #221 <Field View Fragment.mView>
	//* 513 1078:iconst_0        
	//* 514 1079:invokevirtual   #1223 <Method void View.setSaveFromParentEnabled(boolean)>
	//* 515 1082:aload           10
	//* 516 1084:ifnull          1096
	//* 517 1087:aload           10
	//* 518 1089:aload_1         
	//* 519 1090:getfield        #221 <Field View Fragment.mView>
	//* 520 1093:invokevirtual   #1511 <Method void ViewGroup.addView(View)>
	//* 521 1096:aload_1         
	//* 522 1097:getfield        #224 <Field boolean Fragment.mHidden>
	//* 523 1100:ifeq            1112
	//* 524 1103:aload_1         
	//* 525 1104:getfield        #221 <Field View Fragment.mView>
	//* 526 1107:bipush          8
	//* 527 1109:invokevirtual   #933 <Method void View.setVisibility(int)>
	//* 528 1112:aload_1         
	//* 529 1113:aload_1         
	//* 530 1114:getfield        #221 <Field View Fragment.mView>
	//* 531 1117:aload_1         
	//* 532 1118:getfield        #1209 <Field Bundle Fragment.mSavedFragmentState>
	//* 533 1121:invokevirtual   #1227 <Method void Fragment.onViewCreated(View, Bundle)>
	//* 534 1124:aload_0         
	//* 535 1125:aload_1         
	//* 536 1126:aload_1         
	//* 537 1127:getfield        #221 <Field View Fragment.mView>
	//* 538 1130:aload_1         
	//* 539 1131:getfield        #1209 <Field Bundle Fragment.mSavedFragmentState>
	//* 540 1134:iconst_0        
	//* 541 1135:invokevirtual   #1075 <Method void dispatchOnFragmentViewCreated(Fragment, View, Bundle, boolean)>
	//* 542 1138:aload_1         
	//* 543 1139:getfield        #221 <Field View Fragment.mView>
	//* 544 1142:invokevirtual   #1514 <Method int View.getVisibility()>
	//* 545 1145:ifne            1162
	//* 546 1148:aload_1         
	//* 547 1149:getfield        #241 <Field ViewGroup Fragment.mContainer>
	//* 548 1152:ifnull          1162
	//* 549 1155:iload           8
	//* 550 1157:istore          5
	//* 551 1159:goto            1165
	//* 552 1162:iconst_0        
	//* 553 1163:istore          5
	//* 554 1165:aload_1         
	//* 555 1166:iload           5
	//* 556 1168:putfield        #227 <Field boolean Fragment.mIsNewlyAdded>
	//* 557 1171:goto            1179
	//* 558 1174:aload_1         
	//* 559 1175:aconst_null     
	//* 560 1176:putfield        #1220 <Field View Fragment.mInnerView>
	//* 561 1179:aload_1         
	//* 562 1180:aload_1         
	//* 563 1181:getfield        #1209 <Field Bundle Fragment.mSavedFragmentState>
	//* 564 1184:invokevirtual   #1517 <Method void Fragment.performActivityCreated(Bundle)>
	//* 565 1187:aload_0         
	//* 566 1188:aload_1         
	//* 567 1189:aload_1         
	//* 568 1190:getfield        #1209 <Field Bundle Fragment.mSavedFragmentState>
	//* 569 1193:iconst_0        
	//* 570 1194:invokevirtual   #988 <Method void dispatchOnFragmentActivityCreated(Fragment, Bundle, boolean)>
	//* 571 1197:aload_1         
	//* 572 1198:getfield        #221 <Field View Fragment.mView>
	//* 573 1201:ifnull          1212
	//* 574 1204:aload_1         
	//* 575 1205:aload_1         
	//* 576 1206:getfield        #1209 <Field Bundle Fragment.mSavedFragmentState>
	//* 577 1209:invokevirtual   #1520 <Method void Fragment.restoreViewState(Bundle)>
	//* 578 1212:aload_1         
	//* 579 1213:aconst_null     
	//* 580 1214:putfield        #1209 <Field Bundle Fragment.mSavedFragmentState>
	//* 581 1217:iload_3         
	//* 582 1218:istore          4
	//* 583 1220:iload           4
	//* 584 1222:istore          6
	//* 585 1224:iload           4
	//* 586 1226:iconst_2        
	//* 587 1227:icmple          1286
	//* 588 1230:getstatic       #818 <Field boolean DEBUG>
	//* 589 1233:ifeq            1272
	//* 590 1236:new             #334 <Class StringBuilder>
	//* 591 1239:dup             
	//* 592 1240:invokespecial   #335 <Method void StringBuilder()>
	//* 593 1243:astore          10
	//* 594 1245:aload           10
	//* 595 1247:ldc2            #1522 <String "moveto STARTED: ">
	//* 596 1250:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 597 1253:pop             
	//* 598 1254:aload           10
	//* 599 1256:aload_1         
	//* 600 1257:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//* 601 1260:pop             
	//* 602 1261:ldc1            #75  <String "FragmentManager">
	//* 603 1263:aload           10
	//* 604 1265:invokevirtual   #347 <Method String StringBuilder.toString()>
	//* 605 1268:invokestatic    #826 <Method int Log.v(String, String)>
	//* 606 1271:pop             
	//* 607 1272:aload_1         
	//* 608 1273:invokevirtual   #1525 <Method void Fragment.performStart()>
	//* 609 1276:aload_0         
	//* 610 1277:aload_1         
	//* 611 1278:iconst_0        
	//* 612 1279:invokevirtual   #1062 <Method void dispatchOnFragmentStarted(Fragment, boolean)>
	//* 613 1282:iload           4
	//* 614 1284:istore          6
	//* 615 1286:iload           6
	//* 616 1288:iconst_3        
	//* 617 1289:icmple          1354
	//* 618 1292:getstatic       #818 <Field boolean DEBUG>
	//* 619 1295:ifeq            1334
	//* 620 1298:new             #334 <Class StringBuilder>
	//* 621 1301:dup             
	//* 622 1302:invokespecial   #335 <Method void StringBuilder()>
	//* 623 1305:astore          10
	//* 624 1307:aload           10
	//* 625 1309:ldc2            #1527 <String "moveto RESUMED: ">
	//* 626 1312:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 627 1315:pop             
	//* 628 1316:aload           10
	//* 629 1318:aload_1         
	//* 630 1319:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//* 631 1322:pop             
	//* 632 1323:ldc1            #75  <String "FragmentManager">
	//* 633 1325:aload           10
	//* 634 1327:invokevirtual   #347 <Method String StringBuilder.toString()>
	//* 635 1330:invokestatic    #826 <Method int Log.v(String, String)>
	//* 636 1333:pop             
	//* 637 1334:aload_1         
	//* 638 1335:invokevirtual   #1530 <Method void Fragment.performResume()>
	//* 639 1338:aload_0         
	//* 640 1339:aload_1         
	//* 641 1340:iconst_0        
	//* 642 1341:invokevirtual   #1050 <Method void dispatchOnFragmentResumed(Fragment, boolean)>
	//* 643 1344:aload_1         
	//* 644 1345:aconst_null     
	//* 645 1346:putfield        #1209 <Field Bundle Fragment.mSavedFragmentState>
	//* 646 1349:aload_1         
	//* 647 1350:aconst_null     
	//* 648 1351:putfield        #1411 <Field SparseArray Fragment.mSavedViewState>
	//* 649 1354:iload           6
	//* 650 1356:istore_2        
	//* 651 1357:goto            1956
	//* 652 1360:aload_1         
	//* 653 1361:getfield        #207 <Field int Fragment.mState>
	//* 654 1364:iload_2         
	//* 655 1365:icmple          1956
	//* 656 1368:aload_1         
	//* 657 1369:getfield        #207 <Field int Fragment.mState>
	//* 658 1372:tableswitch     1 4: default 1404
	//	               1 1752
	//	               2 1521
	//	               3 1464
	//	               4 1407
	//* 659 1404:goto            1956
	//* 660 1407:iload_2         
	//* 661 1408:iconst_4        
	//* 662 1409:icmpge          1464
	//* 663 1412:getstatic       #818 <Field boolean DEBUG>
	//* 664 1415:ifeq            1454
	//* 665 1418:new             #334 <Class StringBuilder>
	//* 666 1421:dup             
	//* 667 1422:invokespecial   #335 <Method void StringBuilder()>
	//* 668 1425:astore          10
	//* 669 1427:aload           10
	//* 670 1429:ldc2            #1532 <String "movefrom RESUMED: ">
	//* 671 1432:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 672 1435:pop             
	//* 673 1436:aload           10
	//* 674 1438:aload_1         
	//* 675 1439:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//* 676 1442:pop             
	//* 677 1443:ldc1            #75  <String "FragmentManager">
	//* 678 1445:aload           10
	//* 679 1447:invokevirtual   #347 <Method String StringBuilder.toString()>
	//* 680 1450:invokestatic    #826 <Method int Log.v(String, String)>
	//* 681 1453:pop             
	//* 682 1454:aload_1         
	//* 683 1455:invokevirtual   #1535 <Method void Fragment.performPause()>
	//* 684 1458:aload_0         
	//* 685 1459:aload_1         
	//* 686 1460:iconst_0        
	//* 687 1461:invokevirtual   #1032 <Method void dispatchOnFragmentPaused(Fragment, boolean)>
	//* 688 1464:iload_2         
	//* 689 1465:iconst_3        
	//* 690 1466:icmpge          1521
	//* 691 1469:getstatic       #818 <Field boolean DEBUG>
	//* 692 1472:ifeq            1511
	//* 693 1475:new             #334 <Class StringBuilder>
	//* 694 1478:dup             
	//* 695 1479:invokespecial   #335 <Method void StringBuilder()>
	//* 696 1482:astore          10
	//* 697 1484:aload           10
	//* 698 1486:ldc2            #1537 <String "movefrom STARTED: ">
	//* 699 1489:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 700 1492:pop             
	//* 701 1493:aload           10
	//* 702 1495:aload_1         
	//* 703 1496:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//* 704 1499:pop             
	//* 705 1500:ldc1            #75  <String "FragmentManager">
	//* 706 1502:aload           10
	//* 707 1504:invokevirtual   #347 <Method String StringBuilder.toString()>
	//* 708 1507:invokestatic    #826 <Method int Log.v(String, String)>
	//* 709 1510:pop             
	//* 710 1511:aload_1         
	//* 711 1512:invokevirtual   #1540 <Method void Fragment.performStop()>
	//* 712 1515:aload_0         
	//* 713 1516:aload_1         
	//* 714 1517:iconst_0        
	//* 715 1518:invokevirtual   #1068 <Method void dispatchOnFragmentStopped(Fragment, boolean)>
	//* 716 1521:iload_2         
	//* 717 1522:iconst_2        
	//* 718 1523:icmpge          1752
	//* 719 1526:getstatic       #818 <Field boolean DEBUG>
	//* 720 1529:ifeq            1568
	//* 721 1532:new             #334 <Class StringBuilder>
	//* 722 1535:dup             
	//* 723 1536:invokespecial   #335 <Method void StringBuilder()>
	//* 724 1539:astore          10
	//* 725 1541:aload           10
	//* 726 1543:ldc2            #1542 <String "movefrom ACTIVITY_CREATED: ">
	//* 727 1546:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 728 1549:pop             
	//* 729 1550:aload           10
	//* 730 1552:aload_1         
	//* 731 1553:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//* 732 1556:pop             
	//* 733 1557:ldc1            #75  <String "FragmentManager">
	//* 734 1559:aload           10
	//* 735 1561:invokevirtual   #347 <Method String StringBuilder.toString()>
	//* 736 1564:invokestatic    #826 <Method int Log.v(String, String)>
	//* 737 1567:pop             
	//* 738 1568:aload_1         
	//* 739 1569:getfield        #221 <Field View Fragment.mView>
	//* 740 1572:ifnull          1598
	//* 741 1575:aload_0         
	//* 742 1576:getfield        #398 <Field FragmentHostCallback mHost>
	//* 743 1579:aload_1         
	//* 744 1580:invokevirtual   #1546 <Method boolean FragmentHostCallback.onShouldSaveFragmentState(Fragment)>
	//* 745 1583:ifeq            1598
	//* 746 1586:aload_1         
	//* 747 1587:getfield        #1411 <Field SparseArray Fragment.mSavedViewState>
	//* 748 1590:ifnonnull       1598
	//* 749 1593:aload_0         
	//* 750 1594:aload_1         
	//* 751 1595:invokevirtual   #1549 <Method void saveFragmentViewState(Fragment)>
	//* 752 1598:aload_1         
	//* 753 1599:invokevirtual   #1552 <Method void Fragment.performDestroyView()>
	//* 754 1602:aload_0         
	//* 755 1603:aload_1         
	//* 756 1604:iconst_0        
	//* 757 1605:invokevirtual   #1082 <Method void dispatchOnFragmentViewDestroyed(Fragment, boolean)>
	//* 758 1608:aload_1         
	//* 759 1609:getfield        #221 <Field View Fragment.mView>
	//* 760 1612:ifnull          1719
	//* 761 1615:aload_1         
	//* 762 1616:getfield        #241 <Field ViewGroup Fragment.mContainer>
	//* 763 1619:ifnull          1719
	//* 764 1622:aload_1         
	//* 765 1623:getfield        #241 <Field ViewGroup Fragment.mContainer>
	//* 766 1626:aload_1         
	//* 767 1627:getfield        #221 <Field View Fragment.mView>
	//* 768 1630:invokevirtual   #1555 <Method void ViewGroup.endViewTransition(View)>
	//* 769 1633:aload_1         
	//* 770 1634:getfield        #221 <Field View Fragment.mView>
	//* 771 1637:invokevirtual   #387 <Method void View.clearAnimation()>
	//* 772 1640:aload_0         
	//* 773 1641:getfield        #177 <Field int mCurState>
	//* 774 1644:ifle            1687
	//* 775 1647:aload_0         
	//* 776 1648:getfield        #972 <Field boolean mDestroyed>
	//* 777 1651:ifne            1687
	//* 778 1654:aload_1         
	//* 779 1655:getfield        #221 <Field View Fragment.mView>
	//* 780 1658:invokevirtual   #1514 <Method int View.getVisibility()>
	//* 781 1661:ifne            1687
	//* 782 1664:aload_1         
	//* 783 1665:getfield        #632 <Field float Fragment.mPostponedAlpha>
	//* 784 1668:fconst_0        
	//* 785 1669:fcmpl           
	//* 786 1670:iflt            1687
	//* 787 1673:aload_0         
	//* 788 1674:aload_1         
	//* 789 1675:iload_3         
	//* 790 1676:iconst_0        
	//* 791 1677:iload           4
	//* 792 1679:invokevirtual   #923 <Method FragmentManagerImpl$AnimationOrAnimator loadAnimation(Fragment, int, boolean, int)>
	//* 793 1682:astore          10
	//* 794 1684:goto            1690
	//* 795 1687:aconst_null     
	//* 796 1688:astore          10
	//* 797 1690:aload_1         
	//* 798 1691:fconst_0        
	//* 799 1692:putfield        #632 <Field float Fragment.mPostponedAlpha>
	//* 800 1695:aload           10
	//* 801 1697:ifnull          1708
	//* 802 1700:aload_0         
	//* 803 1701:aload_1         
	//* 804 1702:aload           10
	//* 805 1704:iload_2         
	//* 806 1705:invokespecial   #1557 <Method void animateRemoveFragment(Fragment, FragmentManagerImpl$AnimationOrAnimator, int)>
	//* 807 1708:aload_1         
	//* 808 1709:getfield        #241 <Field ViewGroup Fragment.mContainer>
	//* 809 1712:aload_1         
	//* 810 1713:getfield        #221 <Field View Fragment.mView>
	//* 811 1716:invokevirtual   #1560 <Method void ViewGroup.removeView(View)>
	//* 812 1719:aload_1         
	//* 813 1720:aconst_null     
	//* 814 1721:putfield        #241 <Field ViewGroup Fragment.mContainer>
	//* 815 1724:aload_1         
	//* 816 1725:aconst_null     
	//* 817 1726:putfield        #221 <Field View Fragment.mView>
	//* 818 1729:aload_1         
	//* 819 1730:aconst_null     
	//* 820 1731:putfield        #1564 <Field android.arch.lifecycle.LifecycleOwner Fragment.mViewLifecycleOwner>
	//* 821 1734:aload_1         
	//* 822 1735:getfield        #1568 <Field MutableLiveData Fragment.mViewLifecycleOwnerLiveData>
	//* 823 1738:aconst_null     
	//* 824 1739:invokevirtual   #1573 <Method void MutableLiveData.setValue(Object)>
	//* 825 1742:aload_1         
	//* 826 1743:aconst_null     
	//* 827 1744:putfield        #1220 <Field View Fragment.mInnerView>
	//* 828 1747:aload_1         
	//* 829 1748:iconst_0        
	//* 830 1749:putfield        #1394 <Field boolean Fragment.mInLayout>
	//* 831 1752:iload_2         
	//* 832 1753:iconst_1        
	//* 833 1754:icmpge          1956
	//* 834 1757:aload_0         
	//* 835 1758:getfield        #972 <Field boolean mDestroyed>
	//* 836 1761:ifeq            1813
	//* 837 1764:aload_1         
	//* 838 1765:invokevirtual   #374 <Method View Fragment.getAnimatingAway()>
	//* 839 1768:ifnull          1790
	//* 840 1771:aload_1         
	//* 841 1772:invokevirtual   #374 <Method View Fragment.getAnimatingAway()>
	//* 842 1775:astore          10
	//* 843 1777:aload_1         
	//* 844 1778:aconst_null     
	//* 845 1779:invokevirtual   #261 <Method void Fragment.setAnimatingAway(View)>
	//* 846 1782:aload           10
	//* 847 1784:invokevirtual   #387 <Method void View.clearAnimation()>
	//* 848 1787:goto            1813
	//* 849 1790:aload_1         
	//* 850 1791:invokevirtual   #391 <Method Animator Fragment.getAnimator()>
	//* 851 1794:ifnull          1813
	//* 852 1797:aload_1         
	//* 853 1798:invokevirtual   #391 <Method Animator Fragment.getAnimator()>
	//* 854 1801:astore          10
	//* 855 1803:aload_1         
	//* 856 1804:aconst_null     
	//* 857 1805:invokevirtual   #292 <Method void Fragment.setAnimator(Animator)>
	//* 858 1808:aload           10
	//* 859 1810:invokevirtual   #1574 <Method void Animator.cancel()>
	//* 860 1813:aload_1         
	//* 861 1814:invokevirtual   #374 <Method View Fragment.getAnimatingAway()>
	//* 862 1817:ifnonnull       1945
	//* 863 1820:aload_1         
	//* 864 1821:invokevirtual   #391 <Method Animator Fragment.getAnimator()>
	//* 865 1824:ifnull          1830
	//* 866 1827:goto            1945
	//* 867 1830:getstatic       #818 <Field boolean DEBUG>
	//* 868 1833:ifeq            1872
	//* 869 1836:new             #334 <Class StringBuilder>
	//* 870 1839:dup             
	//* 871 1840:invokespecial   #335 <Method void StringBuilder()>
	//* 872 1843:astore          10
	//* 873 1845:aload           10
	//* 874 1847:ldc2            #1576 <String "movefrom CREATED: ">
	//* 875 1850:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 876 1853:pop             
	//* 877 1854:aload           10
	//* 878 1856:aload_1         
	//* 879 1857:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//* 880 1860:pop             
	//* 881 1861:ldc1            #75  <String "FragmentManager">
	//* 882 1863:aload           10
	//* 883 1865:invokevirtual   #347 <Method String StringBuilder.toString()>
	//* 884 1868:invokestatic    #826 <Method int Log.v(String, String)>
	//* 885 1871:pop             
	//* 886 1872:aload_1         
	//* 887 1873:getfield        #754 <Field boolean Fragment.mRetaining>
	//* 888 1876:ifne            1892
	//* 889 1879:aload_1         
	//* 890 1880:invokevirtual   #1579 <Method void Fragment.performDestroy()>
	//* 891 1883:aload_0         
	//* 892 1884:aload_1         
	//* 893 1885:iconst_0        
	//* 894 1886:invokevirtual   #1019 <Method void dispatchOnFragmentDestroyed(Fragment, boolean)>
	//* 895 1889:goto            1897
	//* 896 1892:aload_1         
	//* 897 1893:iconst_0        
	//* 898 1894:putfield        #207 <Field int Fragment.mState>
	//* 899 1897:aload_1         
	//* 900 1898:invokevirtual   #1582 <Method void Fragment.performDetach()>
	//* 901 1901:aload_0         
	//* 902 1902:aload_1         
	//* 903 1903:iconst_0        
	//* 904 1904:invokevirtual   #1026 <Method void dispatchOnFragmentDetached(Fragment, boolean)>
	//* 905 1907:iload           5
	//* 906 1909:ifne            1956
	//* 907 1912:aload_1         
	//* 908 1913:getfield        #754 <Field boolean Fragment.mRetaining>
	//* 909 1916:ifne            1927
	//* 910 1919:aload_0         
	//* 911 1920:aload_1         
	//* 912 1921:invokevirtual   #1584 <Method void makeInactive(Fragment)>
	//* 913 1924:goto            1956
	//* 914 1927:aload_1         
	//* 915 1928:aconst_null     
	//* 916 1929:putfield        #1431 <Field FragmentHostCallback Fragment.mHost>
	//* 917 1932:aload_1         
	//* 918 1933:aconst_null     
	//* 919 1934:putfield        #1434 <Field Fragment Fragment.mParentFragment>
	//* 920 1937:aload_1         
	//* 921 1938:aconst_null     
	//* 922 1939:putfield        #1445 <Field FragmentManagerImpl Fragment.mFragmentManager>
	//* 923 1942:goto            1956
	//* 924 1945:aload_1         
	//* 925 1946:iload_2         
	//* 926 1947:invokevirtual   #251 <Method void Fragment.setStateAfterAnimating(int)>
	//* 927 1950:iload           7
	//* 928 1952:istore_2        
	//* 929 1953:goto            1956
	//* 930 1956:aload_1         
	//* 931 1957:getfield        #207 <Field int Fragment.mState>
	//* 932 1960:iload_2         
	//* 933 1961:icmpeq          2049
	//* 934 1964:new             #334 <Class StringBuilder>
	//* 935 1967:dup             
	//* 936 1968:invokespecial   #335 <Method void StringBuilder()>
	//* 937 1971:astore          10
	//* 938 1973:aload           10
	//* 939 1975:ldc2            #1586 <String "moveToState: Fragment state for ">
	//* 940 1978:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 941 1981:pop             
	//* 942 1982:aload           10
	//* 943 1984:aload_1         
	//* 944 1985:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//* 945 1988:pop             
	//* 946 1989:aload           10
	//* 947 1991:ldc2            #1588 <String " not updated inline; ">
	//* 948 1994:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 949 1997:pop             
	//* 950 1998:aload           10
	//* 951 2000:ldc2            #1590 <String "expected state ">
	//* 952 2003:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 953 2006:pop             
	//* 954 2007:aload           10
	//* 955 2009:iload_2         
	//* 956 2010:invokevirtual   #872 <Method StringBuilder StringBuilder.append(int)>
	//* 957 2013:pop             
	//* 958 2014:aload           10
	//* 959 2016:ldc2            #1592 <String " found ">
	//* 960 2019:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 961 2022:pop             
	//* 962 2023:aload           10
	//* 963 2025:aload_1         
	//* 964 2026:getfield        #207 <Field int Fragment.mState>
	//* 965 2029:invokevirtual   #872 <Method StringBuilder StringBuilder.append(int)>
	//* 966 2032:pop             
	//* 967 2033:ldc1            #75  <String "FragmentManager">
	//* 968 2035:aload           10
	//* 969 2037:invokevirtual   #347 <Method String StringBuilder.toString()>
	//* 970 2040:invokestatic    #1595 <Method int Log.w(String, String)>
	//* 971 2043:pop             
	//* 972 2044:aload_1         
	//* 973 2045:iload_2         
	//* 974 2046:putfield        #207 <Field int Fragment.mState>
	//* 975 2049:return          
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
	//* 976 2050:astore          10
	//* 977 2052:goto            940
	}

	public void noteStateNotSaved()
	{
		mSavedNonConfig = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #1598 <Field FragmentManagerNonConfig mSavedNonConfig>
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		mStateSaved = false;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #947 <Field boolean mStateSaved>
		mStopped = false;
	//    8   12:aload_0         
	//    9   13:iconst_0        
	//   10   14:putfield        #949 <Field boolean mStopped>
		for(int j = mAdded.size(); i < j; i++)
	//*  11   17:aload_0         
	//*  12   18:getfield        #170 <Field ArrayList mAdded>
	//*  13   21:invokevirtual   #198 <Method int ArrayList.size()>
	//*  14   24:istore_2        
	//*  15   25:iload_1         
	//*  16   26:iload_2         
	//*  17   27:icmpge          57
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//   18   30:aload_0         
	//   19   31:getfield        #170 <Field ArrayList mAdded>
	//   20   34:iload_1         
	//   21   35:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   22   38:checkcast       #204 <Class Fragment>
	//   23   41:astore_3        
			if(fragment != null)
	//*  24   42:aload_3         
	//*  25   43:ifnull          50
				fragment.noteStateNotSaved();
	//   26   46:aload_3         
	//   27   47:invokevirtual   #1600 <Method void Fragment.noteStateNotSaved()>
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
	//*   0    0:ldc2            #1604 <String "fragment">
	//*   1    3:aload_2         
	//*   2    4:invokevirtual   #655 <Method boolean String.equals(Object)>
	//*   3    7:ifne            12
				return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
			s1 = attributeset.getAttributeValue(((String) (null)), "class");
	//    6   12:aload           4
	//    7   14:aconst_null     
	//    8   15:ldc2            #1606 <String "class">
	//    9   18:invokeinterface #1612 <Method String AttributeSet.getAttributeValue(String, String)>
	//   10   23:astore          8
			s = ((String) (context.obtainStyledAttributes(attributeset, FragmentTag.Fragment)));
	//   11   25:aload_3         
	//   12   26:aload           4
	//   13   28:getstatic       #1616 <Field int[] FragmentManagerImpl$FragmentTag.Fragment>
	//   14   31:invokevirtual   #1620 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
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
	//   22   45:invokevirtual   #1625 <Method String TypedArray.getString(int)>
	//   23   48:astore          8
	//*  24   50:goto            53
			k = ((TypedArray) (s)).getResourceId(1, -1);
	//   25   53:aload_2         
	//   26   54:iconst_1        
	//   27   55:iconst_m1       
	//   28   56:invokevirtual   #1628 <Method int TypedArray.getResourceId(int, int)>
	//   29   59:istore          7
			s2 = ((TypedArray) (s)).getString(2);
	//   30   61:aload_2         
	//   31   62:iconst_2        
	//   32   63:invokevirtual   #1625 <Method String TypedArray.getString(int)>
	//   33   66:astore          9
			((TypedArray) (s)).recycle();
	//   34   68:aload_2         
	//   35   69:invokevirtual   #1631 <Method void TypedArray.recycle()>
			if(!Fragment.isSupportFragmentClass(mHost.getContext(), s1))
	//*  36   72:aload_0         
	//*  37   73:getfield        #398 <Field FragmentHostCallback mHost>
	//*  38   76:invokevirtual   #1308 <Method Context FragmentHostCallback.getContext()>
	//*  39   79:aload           8
	//*  40   81:invokestatic    #1635 <Method boolean Fragment.isSupportFragmentClass(Context, String)>
	//*  41   84:ifne            89
				return null;
	//   42   87:aconst_null     
	//   43   88:areturn         
			if(view != null)
	//*  44   89:aload_1         
	//*  45   90:ifnull          99
				i = view.getId();
	//   46   93:aload_1         
	//   47   94:invokevirtual   #1638 <Method int View.getId()>
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
	//   58  119:new             #334 <Class StringBuilder>
	//   59  122:dup             
	//   60  123:invokespecial   #335 <Method void StringBuilder()>
	//   61  126:astore_1        
				((StringBuilder) (view)).append(attributeset.getPositionDescription());
	//   62  127:aload_1         
	//   63  128:aload           4
	//   64  130:invokeinterface #1641 <Method String AttributeSet.getPositionDescription()>
	//   65  135:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   66  138:pop             
				((StringBuilder) (view)).append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
	//   67  139:aload_1         
	//   68  140:ldc2            #1643 <String ": Must specify unique android:id, android:tag, or have a parent with an id for ">
	//   69  143:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   70  146:pop             
				((StringBuilder) (view)).append(s1);
	//   71  147:aload_1         
	//   72  148:aload           8
	//   73  150:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   74  153:pop             
				throw new IllegalArgumentException(((StringBuilder) (view)).toString());
	//   75  154:new             #1487 <Class IllegalArgumentException>
	//   76  157:dup             
	//   77  158:aload_1         
	//   78  159:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   79  162:invokespecial   #1488 <Method void IllegalArgumentException(String)>
	//   80  165:athrow          
			}
			if(k != -1)
	//*  81  166:iload           7
	//*  82  168:iconst_m1       
	//*  83  169:icmpeq          182
				s = ((String) (findFragmentById(k)));
	//   84  172:aload_0         
	//   85  173:iload           7
	//   86  175:invokevirtual   #1645 <Method Fragment findFragmentById(int)>
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
	//  101  200:invokevirtual   #1647 <Method Fragment findFragmentByTag(String)>
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
	//  114  221:invokevirtual   #1645 <Method Fragment findFragmentById(int)>
	//  115  224:astore_2        
			}
			if(DEBUG)
	//* 116  225:getstatic       #818 <Field boolean DEBUG>
	//* 117  228:ifeq            296
			{
				view = ((View) (new StringBuilder()));
	//  118  231:new             #334 <Class StringBuilder>
	//  119  234:dup             
	//  120  235:invokespecial   #335 <Method void StringBuilder()>
	//  121  238:astore_1        
				((StringBuilder) (view)).append("onCreateView: id=0x");
	//  122  239:aload_1         
	//  123  240:ldc2            #1649 <String "onCreateView: id=0x">
	//  124  243:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  125  246:pop             
				((StringBuilder) (view)).append(Integer.toHexString(k));
	//  126  247:aload_1         
	//  127  248:iload           7
	//  128  250:invokestatic    #1128 <Method String Integer.toHexString(int)>
	//  129  253:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  130  256:pop             
				((StringBuilder) (view)).append(" fname=");
	//  131  257:aload_1         
	//  132  258:ldc2            #1651 <String " fname=">
	//  133  261:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  134  264:pop             
				((StringBuilder) (view)).append(s1);
	//  135  265:aload_1         
	//  136  266:aload           8
	//  137  268:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  138  271:pop             
				((StringBuilder) (view)).append(" existing=");
	//  139  272:aload_1         
	//  140  273:ldc2            #1653 <String " existing=">
	//  141  276:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  142  279:pop             
				((StringBuilder) (view)).append(((Object) (s)));
	//  143  280:aload_1         
	//  144  281:aload_2         
	//  145  282:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//  146  285:pop             
				Log.v("FragmentManager", ((StringBuilder) (view)).toString());
	//  147  286:ldc1            #75  <String "FragmentManager">
	//  148  288:aload_1         
	//  149  289:invokevirtual   #347 <Method String StringBuilder.toString()>
	//  150  292:invokestatic    #826 <Method int Log.v(String, String)>
	//  151  295:pop             
			}
			if(s == null)
	//* 152  296:aload_2         
	//* 153  297:ifnonnull       394
			{
				view = ((View) (mContainer.instantiate(context, s1, ((Bundle) (null)))));
	//  154  300:aload_0         
	//  155  301:getfield        #888 <Field FragmentContainer mContainer>
	//  156  304:aload_3         
	//  157  305:aload           8
	//  158  307:aconst_null     
	//  159  308:invokevirtual   #1657 <Method Fragment FragmentContainer.instantiate(Context, String, Bundle)>
	//  160  311:astore_1        
				view.mFromLayout = true;
	//  161  312:aload_1         
	//  162  313:iconst_1        
	//  163  314:putfield        #1203 <Field boolean Fragment.mFromLayout>
				int j;
				if(k != 0)
	//* 164  317:iload           7
	//* 165  319:ifeq            329
					j = k;
	//  166  322:iload           7
	//  167  324:istore          6
				else
	//* 168  326:goto            333
					j = i;
	//  169  329:iload           5
	//  170  331:istore          6
				view.mFragmentId = j;
	//  171  333:aload_1         
	//  172  334:iload           6
	//  173  336:putfield        #1238 <Field int Fragment.mFragmentId>
				view.mContainerId = i;
	//  174  339:aload_1         
	//  175  340:iload           5
	//  176  342:putfield        #911 <Field int Fragment.mContainerId>
				view.mTag = s2;
	//  177  345:aload_1         
	//  178  346:aload           9
	//  179  348:putfield        #1244 <Field String Fragment.mTag>
				view.mInLayout = true;
	//  180  351:aload_1         
	//  181  352:iconst_1        
	//  182  353:putfield        #1394 <Field boolean Fragment.mInLayout>
				view.mFragmentManager = this;
	//  183  356:aload_1         
	//  184  357:aload_0         
	//  185  358:putfield        #1445 <Field FragmentManagerImpl Fragment.mFragmentManager>
				s = ((String) (mHost));
	//  186  361:aload_0         
	//  187  362:getfield        #398 <Field FragmentHostCallback mHost>
	//  188  365:astore_2        
				view.mHost = ((FragmentHostCallback) (s));
	//  189  366:aload_1         
	//  190  367:aload_2         
	//  191  368:putfield        #1431 <Field FragmentHostCallback Fragment.mHost>
				((Fragment) (view)).onInflate(((FragmentHostCallback) (s)).getContext(), attributeset, ((Fragment) (view)).mSavedFragmentState);
	//  192  371:aload_1         
	//  193  372:aload_2         
	//  194  373:invokevirtual   #1308 <Method Context FragmentHostCallback.getContext()>
	//  195  376:aload           4
	//  196  378:aload_1         
	//  197  379:getfield        #1209 <Field Bundle Fragment.mSavedFragmentState>
	//  198  382:invokevirtual   #1661 <Method void Fragment.onInflate(Context, AttributeSet, Bundle)>
				addFragment(((Fragment) (view)), true);
	//  199  385:aload_0         
	//  200  386:aload_1         
	//  201  387:iconst_1        
	//  202  388:invokevirtual   #1663 <Method void addFragment(Fragment, boolean)>
			} else
	//* 203  391:goto            440
			{
				if(((Fragment) (s)).mInLayout)
					break label0;
	//  204  394:aload_2         
	//  205  395:getfield        #1394 <Field boolean Fragment.mInLayout>
	//  206  398:ifne            560
				s.mInLayout = true;
	//  207  401:aload_2         
	//  208  402:iconst_1        
	//  209  403:putfield        #1394 <Field boolean Fragment.mInLayout>
				s.mHost = mHost;
	//  210  406:aload_2         
	//  211  407:aload_0         
	//  212  408:getfield        #398 <Field FragmentHostCallback mHost>
	//  213  411:putfield        #1431 <Field FragmentHostCallback Fragment.mHost>
				if(!((Fragment) (s)).mRetaining)
	//* 214  414:aload_2         
	//* 215  415:getfield        #754 <Field boolean Fragment.mRetaining>
	//* 216  418:ifne            438
					((Fragment) (s)).onInflate(mHost.getContext(), attributeset, ((Fragment) (s)).mSavedFragmentState);
	//  217  421:aload_2         
	//  218  422:aload_0         
	//  219  423:getfield        #398 <Field FragmentHostCallback mHost>
	//  220  426:invokevirtual   #1308 <Method Context FragmentHostCallback.getContext()>
	//  221  429:aload           4
	//  222  431:aload_2         
	//  223  432:getfield        #1209 <Field Bundle Fragment.mSavedFragmentState>
	//  224  435:invokevirtual   #1661 <Method void Fragment.onInflate(Context, AttributeSet, Bundle)>
				view = ((View) (s));
	//  225  438:aload_2         
	//  226  439:astore_1        
			}
			if(mCurState < 1 && ((Fragment) (view)).mFromLayout)
	//* 227  440:aload_0         
	//* 228  441:getfield        #177 <Field int mCurState>
	//* 229  444:iconst_1        
	//* 230  445:icmpge          467
	//* 231  448:aload_1         
	//* 232  449:getfield        #1203 <Field boolean Fragment.mFromLayout>
	//* 233  452:ifeq            467
				moveToState(((Fragment) (view)), 1, 0, 0, false);
	//  234  455:aload_0         
	//  235  456:aload_1         
	//  236  457:iconst_1        
	//  237  458:iconst_0        
	//  238  459:iconst_0        
	//  239  460:iconst_0        
	//  240  461:invokevirtual   #217 <Method void moveToState(Fragment, int, int, int, boolean)>
			else
	//* 241  464:goto            472
				moveToState(((Fragment) (view)));
	//  242  467:aload_0         
	//  243  468:aload_1         
	//  244  469:invokevirtual   #852 <Method void moveToState(Fragment)>
			if(((Fragment) (view)).mView != null)
	//* 245  472:aload_1         
	//* 246  473:getfield        #221 <Field View Fragment.mView>
	//* 247  476:ifnull          517
			{
				if(k != 0)
	//* 248  479:iload           7
	//* 249  481:ifeq            493
					((Fragment) (view)).mView.setId(k);
	//  250  484:aload_1         
	//  251  485:getfield        #221 <Field View Fragment.mView>
	//  252  488:iload           7
	//  253  490:invokevirtual   #1666 <Method void View.setId(int)>
				if(((Fragment) (view)).mView.getTag() == null)
	//* 254  493:aload_1         
	//* 255  494:getfield        #221 <Field View Fragment.mView>
	//* 256  497:invokevirtual   #1669 <Method Object View.getTag()>
	//* 257  500:ifnonnull       512
					((Fragment) (view)).mView.setTag(((Object) (s2)));
	//  258  503:aload_1         
	//  259  504:getfield        #221 <Field View Fragment.mView>
	//  260  507:aload           9
	//  261  509:invokevirtual   #1672 <Method void View.setTag(Object)>
				return ((Fragment) (view)).mView;
	//  262  512:aload_1         
	//  263  513:getfield        #221 <Field View Fragment.mView>
	//  264  516:areturn         
			} else
			{
				view = ((View) (new StringBuilder()));
	//  265  517:new             #334 <Class StringBuilder>
	//  266  520:dup             
	//  267  521:invokespecial   #335 <Method void StringBuilder()>
	//  268  524:astore_1        
				((StringBuilder) (view)).append("Fragment ");
	//  269  525:aload_1         
	//  270  526:ldc2            #1447 <String "Fragment ">
	//  271  529:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  272  532:pop             
				((StringBuilder) (view)).append(s1);
	//  273  533:aload_1         
	//  274  534:aload           8
	//  275  536:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  276  539:pop             
				((StringBuilder) (view)).append(" did not create a view.");
	//  277  540:aload_1         
	//  278  541:ldc2            #1674 <String " did not create a view.">
	//  279  544:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  280  547:pop             
				throw new IllegalStateException(((StringBuilder) (view)).toString());
	//  281  548:new             #343 <Class IllegalStateException>
	//  282  551:dup             
	//  283  552:aload_1         
	//  284  553:invokevirtual   #347 <Method String StringBuilder.toString()>
	//  285  556:invokespecial   #350 <Method void IllegalStateException(String)>
	//  286  559:athrow          
			}
		}
		view = ((View) (new StringBuilder()));
	//  287  560:new             #334 <Class StringBuilder>
	//  288  563:dup             
	//  289  564:invokespecial   #335 <Method void StringBuilder()>
	//  290  567:astore_1        
		((StringBuilder) (view)).append(attributeset.getPositionDescription());
	//  291  568:aload_1         
	//  292  569:aload           4
	//  293  571:invokeinterface #1641 <Method String AttributeSet.getPositionDescription()>
	//  294  576:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  295  579:pop             
		((StringBuilder) (view)).append(": Duplicate id 0x");
	//  296  580:aload_1         
	//  297  581:ldc2            #1676 <String ": Duplicate id 0x">
	//  298  584:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  299  587:pop             
		((StringBuilder) (view)).append(Integer.toHexString(k));
	//  300  588:aload_1         
	//  301  589:iload           7
	//  302  591:invokestatic    #1128 <Method String Integer.toHexString(int)>
	//  303  594:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  304  597:pop             
		((StringBuilder) (view)).append(", tag ");
	//  305  598:aload_1         
	//  306  599:ldc2            #1678 <String ", tag ">
	//  307  602:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  308  605:pop             
		((StringBuilder) (view)).append(s2);
	//  309  606:aload_1         
	//  310  607:aload           9
	//  311  609:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  312  612:pop             
		((StringBuilder) (view)).append(", or parent id 0x");
	//  313  613:aload_1         
	//  314  614:ldc2            #1680 <String ", or parent id 0x">
	//  315  617:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  316  620:pop             
		((StringBuilder) (view)).append(Integer.toHexString(i));
	//  317  621:aload_1         
	//  318  622:iload           5
	//  319  624:invokestatic    #1128 <Method String Integer.toHexString(int)>
	//  320  627:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  321  630:pop             
		((StringBuilder) (view)).append(" with another fragment for ");
	//  322  631:aload_1         
	//  323  632:ldc2            #1682 <String " with another fragment for ">
	//  324  635:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  325  638:pop             
		((StringBuilder) (view)).append(s1);
	//  326  639:aload_1         
	//  327  640:aload           8
	//  328  642:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  329  645:pop             
		throw new IllegalArgumentException(((StringBuilder) (view)).toString());
	//  330  646:new             #1487 <Class IllegalArgumentException>
	//  331  649:dup             
	//  332  650:aload_1         
	//  333  651:invokevirtual   #347 <Method String StringBuilder.toString()>
	//  334  654:invokespecial   #1488 <Method void IllegalArgumentException(String)>
	//  335  657:athrow          
	}

	public View onCreateView(String s, Context context, AttributeSet attributeset)
	{
		return onCreateView(((View) (null)), s, context, attributeset);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokevirtual   #1685 <Method View onCreateView(View, String, Context, AttributeSet)>
	//    6    8:areturn         
	}

	public void performPendingDeferredStart(Fragment fragment)
	{
		if(fragment.mDeferStart)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1391 <Field boolean Fragment.mDeferStart>
	//*   2    4:ifeq            37
		{
			if(mExecutingActions)
	//*   3    7:aload_0         
	//*   4    8:getfield        #355 <Field boolean mExecutingActions>
	//*   5   11:ifeq            20
			{
				mHavePendingDeferredStart = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #1109 <Field boolean mHavePendingDeferredStart>
				return;
	//    9   19:return          
			}
			fragment.mDeferStart = false;
	//   10   20:aload_1         
	//   11   21:iconst_0        
	//   12   22:putfield        #1391 <Field boolean Fragment.mDeferStart>
			moveToState(fragment, mCurState, 0, 0, false);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #177 <Field int mCurState>
	//   17   31:iconst_0        
	//   18   32:iconst_0        
	//   19   33:iconst_0        
	//   20   34:invokevirtual   #217 <Method void moveToState(Fragment, int, int, int, boolean)>
		}
	//   21   37:return          
	}

	public void popBackStack()
	{
		enqueueAction(((OpGenerator) (new PopBackStackState(((String) (null)), -1, 0))), false);
	//    0    0:aload_0         
	//    1    1:new             #44  <Class FragmentManagerImpl$PopBackStackState>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:iconst_m1       
	//    6    8:iconst_0        
	//    7    9:invokespecial   #1690 <Method void FragmentManagerImpl$PopBackStackState(FragmentManagerImpl, String, int, int)>
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #1692 <Method void enqueueAction(FragmentManagerImpl$OpGenerator, boolean)>
	//   10   16:return          
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
	//    9   13:invokespecial   #1690 <Method void FragmentManagerImpl$PopBackStackState(FragmentManagerImpl, String, int, int)>
	//   10   16:iconst_0        
	//   11   17:invokevirtual   #1692 <Method void enqueueAction(FragmentManagerImpl$OpGenerator, boolean)>
			return;
	//   12   20:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   13   21:new             #334 <Class StringBuilder>
	//   14   24:dup             
	//   15   25:invokespecial   #335 <Method void StringBuilder()>
	//   16   28:astore_3        
			stringbuilder.append("Bad id: ");
	//   17   29:aload_3         
	//   18   30:ldc2            #1695 <String "Bad id: ">
	//   19   33:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   20   36:pop             
			stringbuilder.append(i);
	//   21   37:aload_3         
	//   22   38:iload_1         
	//   23   39:invokevirtual   #872 <Method StringBuilder StringBuilder.append(int)>
	//   24   42:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   25   43:new             #1487 <Class IllegalArgumentException>
	//   26   46:dup             
	//   27   47:aload_3         
	//   28   48:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   29   51:invokespecial   #1488 <Method void IllegalArgumentException(String)>
	//   30   54:athrow          
		}
	}

	public void popBackStack(String s, int i)
	{
		enqueueAction(((OpGenerator) (new PopBackStackState(s, -1, i))), false);
	//    0    0:aload_0         
	//    1    1:new             #44  <Class FragmentManagerImpl$PopBackStackState>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iconst_m1       
	//    6    8:iload_2         
	//    7    9:invokespecial   #1690 <Method void FragmentManagerImpl$PopBackStackState(FragmentManagerImpl, String, int, int)>
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #1692 <Method void enqueueAction(FragmentManagerImpl$OpGenerator, boolean)>
	//   10   16:return          
	}

	public boolean popBackStackImmediate()
	{
		checkStateLoss();
	//    0    0:aload_0         
	//    1    1:invokespecial   #417 <Method void checkStateLoss()>
		return popBackStackImmediate(((String) (null)), -1, 0);
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:iconst_m1       
	//    5    7:iconst_0        
	//    6    8:invokespecial   #1698 <Method boolean popBackStackImmediate(String, int, int)>
	//    7   11:ireturn         
	}

	public boolean popBackStackImmediate(int i, int j)
	{
		checkStateLoss();
	//    0    0:aload_0         
	//    1    1:invokespecial   #417 <Method void checkStateLoss()>
		execPendingActions();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #369 <Method boolean execPendingActions()>
	//    4    8:pop             
		if(i >= 0)
	//*   5    9:iload_1         
	//*   6   10:iflt            21
		{
			return popBackStackImmediate(((String) (null)), i, j);
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:iload_1         
	//   10   16:iload_2         
	//   11   17:invokespecial   #1698 <Method boolean popBackStackImmediate(String, int, int)>
	//   12   20:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   13   21:new             #334 <Class StringBuilder>
	//   14   24:dup             
	//   15   25:invokespecial   #335 <Method void StringBuilder()>
	//   16   28:astore_3        
			stringbuilder.append("Bad id: ");
	//   17   29:aload_3         
	//   18   30:ldc2            #1695 <String "Bad id: ">
	//   19   33:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   20   36:pop             
			stringbuilder.append(i);
	//   21   37:aload_3         
	//   22   38:iload_1         
	//   23   39:invokevirtual   #872 <Method StringBuilder StringBuilder.append(int)>
	//   24   42:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   25   43:new             #1487 <Class IllegalArgumentException>
	//   26   46:dup             
	//   27   47:aload_3         
	//   28   48:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   29   51:invokespecial   #1488 <Method void IllegalArgumentException(String)>
	//   30   54:athrow          
		}
	}

	public boolean popBackStackImmediate(String s, int i)
	{
		checkStateLoss();
	//    0    0:aload_0         
	//    1    1:invokespecial   #417 <Method void checkStateLoss()>
		return popBackStackImmediate(s, -1, i);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iconst_m1       
	//    5    7:iload_2         
	//    6    8:invokespecial   #1698 <Method boolean popBackStackImmediate(String, int, int)>
	//    7   11:ireturn         
	}

	boolean popBackStackState(ArrayList arraylist, ArrayList arraylist1, String s, int i, int j)
	{
		ArrayList arraylist2 = mBackStack;
	//    0    0:aload_0         
	//    1    1:getfield        #814 <Field ArrayList mBackStack>
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
	//   16   31:invokevirtual   #198 <Method int ArrayList.size()>
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
	//   26   47:getfield        #814 <Field ArrayList mBackStack>
	//   27   50:iload           4
	//   28   52:invokevirtual   #525 <Method Object ArrayList.remove(int)>
	//   29   55:invokevirtual   #705 <Method boolean ArrayList.add(Object)>
	//   30   58:pop             
				arraylist1.add(((Object) (Boolean.valueOf(true))));
	//   31   59:aload_2         
	//   32   60:iconst_1        
	//   33   61:invokestatic    #908 <Method Boolean Boolean.valueOf(boolean)>
	//   34   64:invokevirtual   #705 <Method boolean ArrayList.add(Object)>
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
	//   47   89:getfield        #814 <Field ArrayList mBackStack>
	//   48   92:invokevirtual   #198 <Method int ArrayList.size()>
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
	//   55  105:getfield        #814 <Field ArrayList mBackStack>
	//   56  108:iload           7
	//   57  110:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   58  113:checkcast       #431 <Class BackStackRecord>
	//   59  116:astore          8
				if(s != null && s.equals(((Object) (backstackrecord.getName()))) || i >= 0 && i == backstackrecord.mIndex)
	//*  60  118:aload_3         
	//*  61  119:ifnull          137
	//*  62  122:aload_3         
	//*  63  123:aload           8
	//*  64  125:invokevirtual   #1703 <Method String BackStackRecord.getName()>
	//*  65  128:invokevirtual   #655 <Method boolean String.equals(Object)>
	//*  66  131:ifeq            137
	//*  67  134:goto            164
	//*  68  137:iload           4
	//*  69  139:iflt            155
	//*  70  142:iload           4
	//*  71  144:aload           8
	//*  72  146:getfield        #490 <Field int BackStackRecord.mIndex>
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
	//   99  198:getfield        #814 <Field ArrayList mBackStack>
	//  100  201:iload           5
	//  101  203:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//  102  206:checkcast       #431 <Class BackStackRecord>
	//  103  209:astore          8
					if(s == null || !s.equals(((Object) (backstackrecord1.getName()))))
	//* 104  211:aload_3         
	//* 105  212:ifnull          227
	//* 106  215:aload_3         
	//* 107  216:aload           8
	//* 108  218:invokevirtual   #1703 <Method String BackStackRecord.getName()>
	//* 109  221:invokevirtual   #655 <Method boolean String.equals(Object)>
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
	//  119  244:getfield        #490 <Field int BackStackRecord.mIndex>
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
	//* 128  262:getfield        #814 <Field ArrayList mBackStack>
	//* 129  265:invokevirtual   #198 <Method int ArrayList.size()>
	//* 130  268:iconst_1        
	//* 131  269:isub            
	//* 132  270:icmpne          275
			return false;
	//  133  273:iconst_0        
	//  134  274:ireturn         
		for(i = mBackStack.size() - 1; i > k; i--)
	//* 135  275:aload_0         
	//* 136  276:getfield        #814 <Field ArrayList mBackStack>
	//* 137  279:invokevirtual   #198 <Method int ArrayList.size()>
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
	//  146  295:getfield        #814 <Field ArrayList mBackStack>
	//  147  298:iload           4
	//  148  300:invokevirtual   #525 <Method Object ArrayList.remove(int)>
	//  149  303:invokevirtual   #705 <Method boolean ArrayList.add(Object)>
	//  150  306:pop             
			arraylist1.add(((Object) (Boolean.valueOf(true))));
	//  151  307:aload_2         
	//  152  308:iconst_1        
	//  153  309:invokestatic    #908 <Method Boolean Boolean.valueOf(boolean)>
	//  154  312:invokevirtual   #705 <Method boolean ArrayList.add(Object)>
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
	//*   1    1:getfield        #1346 <Field int Fragment.mIndex>
	//*   2    4:ifge            57
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #334 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #335 <Method void StringBuilder()>
	//    6   14:astore          4
			stringbuilder.append("Fragment ");
	//    7   16:aload           4
	//    8   18:ldc2            #1447 <String "Fragment ">
	//    9   21:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:pop             
			stringbuilder.append(((Object) (fragment)));
	//   11   25:aload           4
	//   12   27:aload_3         
	//   13   28:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//   14   31:pop             
			stringbuilder.append(" is not currently in the FragmentManager");
	//   15   32:aload           4
	//   16   34:ldc2            #1708 <String " is not currently in the FragmentManager">
	//   17   37:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   18   40:pop             
			throwException(((RuntimeException) (new IllegalStateException(stringbuilder.toString()))));
	//   19   41:aload_0         
	//   20   42:new             #343 <Class IllegalStateException>
	//   21   45:dup             
	//   22   46:aload           4
	//   23   48:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   24   51:invokespecial   #350 <Method void IllegalStateException(String)>
	//   25   54:invokespecial   #1275 <Method void throwException(RuntimeException)>
		}
		bundle.putInt(s, fragment.mIndex);
	//   26   57:aload_1         
	//   27   58:aload_2         
	//   28   59:aload_3         
	//   29   60:getfield        #1346 <Field int Fragment.mIndex>
	//   30   63:invokevirtual   #1711 <Method void Bundle.putInt(String, int)>
	//   31   66:return          
	}

	public void registerFragmentLifecycleCallbacks(FragmentManager.FragmentLifecycleCallbacks fragmentlifecyclecallbacks, boolean flag)
	{
		mLifecycleCallbacks.add(((Object) (new FragmentLifecycleCallbacksHolder(fragmentlifecyclecallbacks, flag))));
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//    2    4:new             #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokespecial   #1715 <Method void FragmentManagerImpl$FragmentLifecycleCallbacksHolder(FragmentManager$FragmentLifecycleCallbacks, boolean)>
	//    7   13:invokevirtual   #1716 <Method boolean CopyOnWriteArrayList.add(Object)>
	//    8   16:pop             
	//    9   17:return          
	}

	public void removeFragment(Fragment fragment)
	{
		if(DEBUG)
	//*   0    0:getstatic       #818 <Field boolean DEBUG>
	//*   1    3:ifeq            55
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #334 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #335 <Method void StringBuilder()>
	//    5   13:astore_3        
			stringbuilder.append("remove: ");
	//    6   14:aload_3         
	//    7   15:ldc2            #1719 <String "remove: ">
	//    8   18:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (fragment)));
	//   10   22:aload_3         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			stringbuilder.append(" nesting=");
	//   14   28:aload_3         
	//   15   29:ldc2            #1721 <String " nesting=">
	//   16   32:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
			stringbuilder.append(fragment.mBackStackNesting);
	//   18   36:aload_3         
	//   19   37:aload_1         
	//   20   38:getfield        #1724 <Field int Fragment.mBackStackNesting>
	//   21   41:invokevirtual   #872 <Method StringBuilder StringBuilder.append(int)>
	//   22   44:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   23   45:ldc1            #75  <String "FragmentManager">
	//   24   47:aload_3         
	//   25   48:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   26   51:invokestatic    #826 <Method int Log.v(String, String)>
	//   27   54:pop             
		}
		boolean flag = fragment.isInBackStack();
	//   28   55:aload_1         
	//   29   56:invokevirtual   #1366 <Method boolean Fragment.isInBackStack()>
	//   30   59:istore_2        
		if(!fragment.mDetached || flag ^ true)
	//*  31   60:aload_1         
	//*  32   61:getfield        #833 <Field boolean Fragment.mDetached>
	//*  33   64:ifeq            73
	//*  34   67:iload_2         
	//*  35   68:iconst_1        
	//*  36   69:ixor            
	//*  37   70:ifeq            120
		{
			synchronized(mAdded)
	//*  38   73:aload_0         
	//*  39   74:getfield        #170 <Field ArrayList mAdded>
	//*  40   77:astore_3        
	//*  41   78:aload_3         
	//*  42   79:monitorenter    
			{
				mAdded.remove(((Object) (fragment)));
	//   43   80:aload_0         
	//   44   81:getfield        #170 <Field ArrayList mAdded>
	//   45   84:aload_1         
	//   46   85:invokevirtual   #944 <Method boolean ArrayList.remove(Object)>
	//   47   88:pop             
			}
	//   48   89:aload_3         
	//   49   90:monitorexit     
			if(fragment.mHasMenu && fragment.mMenuVisible)
	//*  50   91:aload_1         
	//*  51   92:getfield        #845 <Field boolean Fragment.mHasMenu>
	//*  52   95:ifeq            110
	//*  53   98:aload_1         
	//*  54   99:getfield        #848 <Field boolean Fragment.mMenuVisible>
	//*  55  102:ifeq            110
				mNeedMenuInvalidate = true;
	//   56  105:aload_0         
	//   57  106:iconst_1        
	//   58  107:putfield        #850 <Field boolean mNeedMenuInvalidate>
			fragment.mAdded = false;
	//   59  110:aload_1         
	//   60  111:iconst_0        
	//   61  112:putfield        #621 <Field boolean Fragment.mAdded>
			fragment.mRemoving = true;
	//   62  115:aload_1         
	//   63  116:iconst_1        
	//   64  117:putfield        #839 <Field boolean Fragment.mRemoving>
		}
		return;
	//   65  120:return          
		fragment;
	//   66  121:astore_1        
		arraylist;
	//   67  122:aload_3         
		JVM INSTR monitorexit ;
	//   68  123:monitorexit     
		throw fragment;
	//   69  124:aload_1         
	//   70  125:athrow          
	}

	public void removeOnBackStackChangedListener(FragmentManager.OnBackStackChangedListener onbackstackchangedlistener)
	{
		ArrayList arraylist = mBackStackChangeListeners;
	//    0    0:aload_0         
	//    1    1:getfield        #858 <Field ArrayList mBackStackChangeListeners>
	//    2    4:astore_2        
		if(arraylist != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			arraylist.remove(((Object) (onbackstackchangedlistener)));
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #944 <Method boolean ArrayList.remove(Object)>
	//    8   14:pop             
	//    9   15:return          
	}

	void reportBackStackChanged()
	{
		if(mBackStackChangeListeners != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #858 <Field ArrayList mBackStackChangeListeners>
	//*   2    4:ifnull          43
		{
			for(int i = 0; i < mBackStackChangeListeners.size(); i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_1        
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #858 <Field ArrayList mBackStackChangeListeners>
	//*   8   14:invokevirtual   #198 <Method int ArrayList.size()>
	//*   9   17:icmpge          43
				((FragmentManager.OnBackStackChangedListener)mBackStackChangeListeners.get(i)).onBackStackChanged();
	//   10   20:aload_0         
	//   11   21:getfield        #858 <Field ArrayList mBackStackChangeListeners>
	//   12   24:iload_1         
	//   13   25:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   14   28:checkcast       #1727 <Class FragmentManager$OnBackStackChangedListener>
	//   15   31:invokeinterface #1730 <Method void FragmentManager$OnBackStackChangedListener.onBackStackChanged()>

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
	//    4    6:checkcast       #1734 <Class FragmentManagerState>
	//    5    9:astore          9
		if(fragmentmanagerstate.mActive == null)
	//*   6   11:aload           9
	//*   7   13:getfield        #1737 <Field FragmentState[] FragmentManagerState.mActive>
	//*   8   16:ifnonnull       20
			return;
	//    9   19:return          
		Object obj;
		if(fragmentmanagernonconfig != null)
	//*  10   20:aload_2         
	//*  11   21:ifnull          326
		{
			List list2 = fragmentmanagernonconfig.getFragments();
	//   12   24:aload_2         
	//   13   25:invokevirtual   #738 <Method List FragmentManagerNonConfig.getFragments()>
	//   14   28:astore          10
			List list = fragmentmanagernonconfig.getChildNonConfigs();
	//   15   30:aload_2         
	//   16   31:invokevirtual   #757 <Method List FragmentManagerNonConfig.getChildNonConfigs()>
	//   17   34:astore          7
			List list1 = fragmentmanagernonconfig.getViewModelStores();
	//   18   36:aload_2         
	//   19   37:invokevirtual   #1740 <Method List FragmentManagerNonConfig.getViewModelStores()>
	//   20   40:astore          8
			int i;
			if(list2 != null)
	//*  21   42:aload           10
	//*  22   44:ifnull          58
				i = list2.size();
	//   23   47:aload           10
	//   24   49:invokeinterface #664 <Method int List.size()>
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
	//   37   73:icmpge          332
				parcelable = ((Parcelable) ((Fragment)list2.get(j1)));
	//   38   76:aload           10
	//   39   78:iload           4
	//   40   80:invokeinterface #665 <Method Object List.get(int)>
	//   41   85:checkcast       #204 <Class Fragment>
	//   42   88:astore_1        
				if(DEBUG)
	//*  43   89:getstatic       #818 <Field boolean DEBUG>
	//*  44   92:ifeq            131
				{
					obj = ((Object) (new StringBuilder()));
	//   45   95:new             #334 <Class StringBuilder>
	//   46   98:dup             
	//   47   99:invokespecial   #335 <Method void StringBuilder()>
	//   48  102:astore          6
					((StringBuilder) (obj)).append("restoreAllState: re-attaching retained ");
	//   49  104:aload           6
	//   50  106:ldc2            #1742 <String "restoreAllState: re-attaching retained ">
	//   51  109:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   52  112:pop             
					((StringBuilder) (obj)).append(((Object) (parcelable)));
	//   53  113:aload           6
	//   54  115:aload_1         
	//   55  116:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//   56  119:pop             
					Log.v("FragmentManager", ((StringBuilder) (obj)).toString());
	//   57  120:ldc1            #75  <String "FragmentManager">
	//   58  122:aload           6
	//   59  124:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   60  127:invokestatic    #826 <Method int Log.v(String, String)>
	//   61  130:pop             
				}
				int l1;
				for(l1 = 0; l1 < fragmentmanagerstate.mActive.length && fragmentmanagerstate.mActive[l1].mIndex != ((Fragment) (parcelable)).mIndex; l1++);
	//   62  131:iconst_0        
	//   63  132:istore          5
	//   64  134:iload           5
	//   65  136:aload           9
	//   66  138:getfield        #1737 <Field FragmentState[] FragmentManagerState.mActive>
	//   67  141:arraylength     
	//   68  142:icmpge          172
	//   69  145:aload           9
	//   70  147:getfield        #1737 <Field FragmentState[] FragmentManagerState.mActive>
	//   71  150:iload           5
	//   72  152:aaload          
	//   73  153:getfield        #1745 <Field int FragmentState.mIndex>
	//   74  156:aload_1         
	//   75  157:getfield        #1346 <Field int Fragment.mIndex>
	//   76  160:icmpeq          172
	//   77  163:iload           5
	//   78  165:iconst_1        
	//   79  166:iadd            
	//   80  167:istore          5
	//*  81  169:goto            134
				if(l1 == fragmentmanagerstate.mActive.length)
	//*  82  172:iload           5
	//*  83  174:aload           9
	//*  84  176:getfield        #1737 <Field FragmentState[] FragmentManagerState.mActive>
	//*  85  179:arraylength     
	//*  86  180:icmpne          227
				{
					obj = ((Object) (new StringBuilder()));
	//   87  183:new             #334 <Class StringBuilder>
	//   88  186:dup             
	//   89  187:invokespecial   #335 <Method void StringBuilder()>
	//   90  190:astore          6
					((StringBuilder) (obj)).append("Could not find active fragment with index ");
	//   91  192:aload           6
	//   92  194:ldc2            #1747 <String "Could not find active fragment with index ">
	//   93  197:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   94  200:pop             
					((StringBuilder) (obj)).append(((Fragment) (parcelable)).mIndex);
	//   95  201:aload           6
	//   96  203:aload_1         
	//   97  204:getfield        #1346 <Field int Fragment.mIndex>
	//   98  207:invokevirtual   #872 <Method StringBuilder StringBuilder.append(int)>
	//   99  210:pop             
					throwException(((RuntimeException) (new IllegalStateException(((StringBuilder) (obj)).toString()))));
	//  100  211:aload_0         
	//  101  212:new             #343 <Class IllegalStateException>
	//  102  215:dup             
	//  103  216:aload           6
	//  104  218:invokevirtual   #347 <Method String StringBuilder.toString()>
	//  105  221:invokespecial   #350 <Method void IllegalStateException(String)>
	//  106  224:invokespecial   #1275 <Method void throwException(RuntimeException)>
				}
				obj = ((Object) (fragmentmanagerstate.mActive[l1]));
	//  107  227:aload           9
	//  108  229:getfield        #1737 <Field FragmentState[] FragmentManagerState.mActive>
	//  109  232:iload           5
	//  110  234:aaload          
	//  111  235:astore          6
				obj.mInstance = ((Fragment) (parcelable));
	//  112  237:aload           6
	//  113  239:aload_1         
	//  114  240:putfield        #1750 <Field Fragment FragmentState.mInstance>
				parcelable.mSavedViewState = null;
	//  115  243:aload_1         
	//  116  244:aconst_null     
	//  117  245:putfield        #1411 <Field SparseArray Fragment.mSavedViewState>
				parcelable.mBackStackNesting = 0;
	//  118  248:aload_1         
	//  119  249:iconst_0        
	//  120  250:putfield        #1724 <Field int Fragment.mBackStackNesting>
				parcelable.mInLayout = false;
	//  121  253:aload_1         
	//  122  254:iconst_0        
	//  123  255:putfield        #1394 <Field boolean Fragment.mInLayout>
				parcelable.mAdded = false;
	//  124  258:aload_1         
	//  125  259:iconst_0        
	//  126  260:putfield        #621 <Field boolean Fragment.mAdded>
				parcelable.mTarget = null;
	//  127  263:aload_1         
	//  128  264:aconst_null     
	//  129  265:putfield        #1416 <Field Fragment Fragment.mTarget>
				if(((FragmentState) (obj)).mSavedFragmentState != null)
	//* 130  268:aload           6
	//* 131  270:getfield        #1751 <Field Bundle FragmentState.mSavedFragmentState>
	//* 132  273:ifnull          317
				{
					((FragmentState) (obj)).mSavedFragmentState.setClassLoader(mHost.getContext().getClassLoader());
	//  133  276:aload           6
	//  134  278:getfield        #1751 <Field Bundle FragmentState.mSavedFragmentState>
	//  135  281:aload_0         
	//  136  282:getfield        #398 <Field FragmentHostCallback mHost>
	//  137  285:invokevirtual   #1308 <Method Context FragmentHostCallback.getContext()>
	//  138  288:invokevirtual   #1400 <Method ClassLoader Context.getClassLoader()>
	//  139  291:invokevirtual   #1404 <Method void Bundle.setClassLoader(ClassLoader)>
					parcelable.mSavedViewState = ((FragmentState) (obj)).mSavedFragmentState.getSparseParcelableArray("android:view_state");
	//  140  294:aload_1         
	//  141  295:aload           6
	//  142  297:getfield        #1751 <Field Bundle FragmentState.mSavedFragmentState>
	//  143  300:ldc1            #87  <String "android:view_state">
	//  144  302:invokevirtual   #1408 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//  145  305:putfield        #1411 <Field SparseArray Fragment.mSavedViewState>
					parcelable.mSavedFragmentState = ((FragmentState) (obj)).mSavedFragmentState;
	//  146  308:aload_1         
	//  147  309:aload           6
	//  148  311:getfield        #1751 <Field Bundle FragmentState.mSavedFragmentState>
	//  149  314:putfield        #1209 <Field Bundle Fragment.mSavedFragmentState>
				}
				j1++;
	//  150  317:iload           4
	//  151  319:iconst_1        
	//  152  320:iadd            
	//  153  321:istore          4
			} while(true);
	//  154  323:goto            63
		} else
		{
			obj = null;
	//  155  326:aconst_null     
	//  156  327:astore          6
			parcelable = ((Parcelable) (obj));
	//  157  329:aload           6
	//  158  331:astore_1        
		}
		mActive = new SparseArray(fragmentmanagerstate.mActive.length);
	//  159  332:aload_0         
	//  160  333:new             #314 <Class SparseArray>
	//  161  336:dup             
	//  162  337:aload           9
	//  163  339:getfield        #1737 <Field FragmentState[] FragmentManagerState.mActive>
	//  164  342:arraylength     
	//  165  343:invokespecial   #1752 <Method void SparseArray(int)>
	//  166  346:putfield        #312 <Field SparseArray mActive>
		for(int j = 0; j < fragmentmanagerstate.mActive.length; j++)
	//* 167  349:iconst_0        
	//* 168  350:istore_3        
	//* 169  351:iload_3         
	//* 170  352:aload           9
	//* 171  354:getfield        #1737 <Field FragmentState[] FragmentManagerState.mActive>
	//* 172  357:arraylength     
	//* 173  358:icmpge          551
		{
			FragmentState fragmentstate = fragmentmanagerstate.mActive[j];
	//  174  361:aload           9
	//  175  363:getfield        #1737 <Field FragmentState[] FragmentManagerState.mActive>
	//  176  366:iload_3         
	//  177  367:aaload          
	//  178  368:astore          10
			if(fragmentstate == null)
				continue;
	//  179  370:aload           10
	//  180  372:ifnull          544
			Object obj1;
			if(obj != null && j < ((List) (obj)).size())
	//* 181  375:aload           6
	//* 182  377:ifnull          407
	//* 183  380:iload_3         
	//* 184  381:aload           6
	//* 185  383:invokeinterface #664 <Method int List.size()>
	//* 186  388:icmpge          407
				obj1 = ((Object) ((FragmentManagerNonConfig)((List) (obj)).get(j)));
	//  187  391:aload           6
	//  188  393:iload_3         
	//  189  394:invokeinterface #665 <Method Object List.get(int)>
	//  190  399:checkcast       #735 <Class FragmentManagerNonConfig>
	//  191  402:astore          7
			else
	//* 192  404:goto            410
				obj1 = null;
	//  193  407:aconst_null     
	//  194  408:astore          7
			ViewModelStore viewmodelstore;
			if(parcelable != null && j < ((List) (parcelable)).size())
	//* 195  410:aload_1         
	//* 196  411:ifnull          439
	//* 197  414:iload_3         
	//* 198  415:aload_1         
	//* 199  416:invokeinterface #664 <Method int List.size()>
	//* 200  421:icmpge          439
				viewmodelstore = (ViewModelStore)((List) (parcelable)).get(j);
	//  201  424:aload_1         
	//  202  425:iload_3         
	//  203  426:invokeinterface #665 <Method Object List.get(int)>
	//  204  431:checkcast       #1754 <Class ViewModelStore>
	//  205  434:astore          8
			else
	//* 206  436:goto            442
				viewmodelstore = null;
	//  207  439:aconst_null     
	//  208  440:astore          8
			obj1 = ((Object) (fragmentstate.instantiate(mHost, mContainer, mParent, ((FragmentManagerNonConfig) (obj1)), viewmodelstore)));
	//  209  442:aload           10
	//  210  444:aload_0         
	//  211  445:getfield        #398 <Field FragmentHostCallback mHost>
	//  212  448:aload_0         
	//  213  449:getfield        #888 <Field FragmentContainer mContainer>
	//  214  452:aload_0         
	//  215  453:getfield        #890 <Field Fragment mParent>
	//  216  456:aload           7
	//  217  458:aload           8
	//  218  460:invokevirtual   #1757 <Method Fragment FragmentState.instantiate(FragmentHostCallback, FragmentContainer, Fragment, FragmentManagerNonConfig, ViewModelStore)>
	//  219  463:astore          7
			if(DEBUG)
	//* 220  465:getstatic       #818 <Field boolean DEBUG>
	//* 221  468:ifeq            524
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//  222  471:new             #334 <Class StringBuilder>
	//  223  474:dup             
	//  224  475:invokespecial   #335 <Method void StringBuilder()>
	//  225  478:astore          8
				stringbuilder1.append("restoreAllState: active #");
	//  226  480:aload           8
	//  227  482:ldc2            #1759 <String "restoreAllState: active #">
	//  228  485:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  229  488:pop             
				stringbuilder1.append(j);
	//  230  489:aload           8
	//  231  491:iload_3         
	//  232  492:invokevirtual   #872 <Method StringBuilder StringBuilder.append(int)>
	//  233  495:pop             
				stringbuilder1.append(": ");
	//  234  496:aload           8
	//  235  498:ldc2            #1139 <String ": ">
	//  236  501:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  237  504:pop             
				stringbuilder1.append(obj1);
	//  238  505:aload           8
	//  239  507:aload           7
	//  240  509:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//  241  512:pop             
				Log.v("FragmentManager", stringbuilder1.toString());
	//  242  513:ldc1            #75  <String "FragmentManager">
	//  243  515:aload           8
	//  244  517:invokevirtual   #347 <Method String StringBuilder.toString()>
	//  245  520:invokestatic    #826 <Method int Log.v(String, String)>
	//  246  523:pop             
			}
			mActive.put(((Fragment) (obj1)).mIndex, obj1);
	//  247  524:aload_0         
	//  248  525:getfield        #312 <Field SparseArray mActive>
	//  249  528:aload           7
	//  250  530:getfield        #1346 <Field int Fragment.mIndex>
	//  251  533:aload           7
	//  252  535:invokevirtual   #1354 <Method void SparseArray.put(int, Object)>
			fragmentstate.mInstance = null;
	//  253  538:aload           10
	//  254  540:aconst_null     
	//  255  541:putfield        #1750 <Field Fragment FragmentState.mInstance>
		}

	//  256  544:iload_3         
	//  257  545:iconst_1        
	//  258  546:iadd            
	//  259  547:istore_3        
	//* 260  548:goto            351
		if(fragmentmanagernonconfig != null)
	//* 261  551:aload_2         
	//* 262  552:ifnull          693
		{
			parcelable = ((Parcelable) (fragmentmanagernonconfig.getFragments()));
	//  263  555:aload_2         
	//  264  556:invokevirtual   #738 <Method List FragmentManagerNonConfig.getFragments()>
	//  265  559:astore_1        
			int k;
			if(parcelable != null)
	//* 266  560:aload_1         
	//* 267  561:ifnull          574
				k = ((List) (parcelable)).size();
	//  268  564:aload_1         
	//  269  565:invokeinterface #664 <Method int List.size()>
	//  270  570:istore_3        
			else
	//* 271  571:goto            576
				k = 0;
	//  272  574:iconst_0        
	//  273  575:istore_3        
			for(int k1 = 0; k1 < k; k1++)
	//* 274  576:iconst_0        
	//* 275  577:istore          4
	//* 276  579:iload           4
	//* 277  581:iload_3         
	//* 278  582:icmpge          693
			{
				fragmentmanagernonconfig = ((FragmentManagerNonConfig) ((Fragment)((List) (parcelable)).get(k1)));
	//  279  585:aload_1         
	//  280  586:iload           4
	//  281  588:invokeinterface #665 <Method Object List.get(int)>
	//  282  593:checkcast       #204 <Class Fragment>
	//  283  596:astore_2        
				if(((Fragment) (fragmentmanagernonconfig)).mTargetIndex < 0)
					continue;
	//  284  597:aload_2         
	//  285  598:getfield        #1762 <Field int Fragment.mTargetIndex>
	//  286  601:iflt            684
				fragmentmanagernonconfig.mTarget = (Fragment)mActive.get(((Fragment) (fragmentmanagernonconfig)).mTargetIndex);
	//  287  604:aload_2         
	//  288  605:aload_0         
	//  289  606:getfield        #312 <Field SparseArray mActive>
	//  290  609:aload_2         
	//  291  610:getfield        #1762 <Field int Fragment.mTargetIndex>
	//  292  613:invokevirtual   #1269 <Method Object SparseArray.get(int)>
	//  293  616:checkcast       #204 <Class Fragment>
	//  294  619:putfield        #1416 <Field Fragment Fragment.mTarget>
				if(((Fragment) (fragmentmanagernonconfig)).mTarget == null)
	//* 295  622:aload_2         
	//* 296  623:getfield        #1416 <Field Fragment Fragment.mTarget>
	//* 297  626:ifnonnull       684
				{
					StringBuilder stringbuilder = new StringBuilder();
	//  298  629:new             #334 <Class StringBuilder>
	//  299  632:dup             
	//  300  633:invokespecial   #335 <Method void StringBuilder()>
	//  301  636:astore          6
					stringbuilder.append("Re-attaching retained fragment ");
	//  302  638:aload           6
	//  303  640:ldc2            #1764 <String "Re-attaching retained fragment ">
	//  304  643:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  305  646:pop             
					stringbuilder.append(((Object) (fragmentmanagernonconfig)));
	//  306  647:aload           6
	//  307  649:aload_2         
	//  308  650:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//  309  653:pop             
					stringbuilder.append(" target no longer exists: ");
	//  310  654:aload           6
	//  311  656:ldc2            #1766 <String " target no longer exists: ">
	//  312  659:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  313  662:pop             
					stringbuilder.append(((Fragment) (fragmentmanagernonconfig)).mTargetIndex);
	//  314  663:aload           6
	//  315  665:aload_2         
	//  316  666:getfield        #1762 <Field int Fragment.mTargetIndex>
	//  317  669:invokevirtual   #872 <Method StringBuilder StringBuilder.append(int)>
	//  318  672:pop             
					Log.w("FragmentManager", stringbuilder.toString());
	//  319  673:ldc1            #75  <String "FragmentManager">
	//  320  675:aload           6
	//  321  677:invokevirtual   #347 <Method String StringBuilder.toString()>
	//  322  680:invokestatic    #1595 <Method int Log.w(String, String)>
	//  323  683:pop             
				}
			}

	//  324  684:iload           4
	//  325  686:iconst_1        
	//  326  687:iadd            
	//  327  688:istore          4
		}
	//* 328  690:goto            579
		mAdded.clear();
	//  329  693:aload_0         
	//  330  694:getfield        #170 <Field ArrayList mAdded>
	//  331  697:invokevirtual   #360 <Method void ArrayList.clear()>
		if(fragmentmanagerstate.mAdded != null)
	//* 332  700:aload           9
	//* 333  702:getfield        #1768 <Field int[] FragmentManagerState.mAdded>
	//* 334  705:ifnull          894
		{
			for(int l = 0; l < fragmentmanagerstate.mAdded.length;)
	//* 335  708:iconst_0        
	//* 336  709:istore_3        
	//* 337  710:iload_3         
	//* 338  711:aload           9
	//* 339  713:getfield        #1768 <Field int[] FragmentManagerState.mAdded>
	//* 340  716:arraylength     
	//* 341  717:icmpge          894
			{
				parcelable = ((Parcelable) ((Fragment)mActive.get(fragmentmanagerstate.mAdded[l])));
	//  342  720:aload_0         
	//  343  721:getfield        #312 <Field SparseArray mActive>
	//  344  724:aload           9
	//  345  726:getfield        #1768 <Field int[] FragmentManagerState.mAdded>
	//  346  729:iload_3         
	//  347  730:iaload          
	//  348  731:invokevirtual   #1269 <Method Object SparseArray.get(int)>
	//  349  734:checkcast       #204 <Class Fragment>
	//  350  737:astore_1        
				if(parcelable == null)
	//* 351  738:aload_1         
	//* 352  739:ifnonnull       785
				{
					fragmentmanagernonconfig = ((FragmentManagerNonConfig) (new StringBuilder()));
	//  353  742:new             #334 <Class StringBuilder>
	//  354  745:dup             
	//  355  746:invokespecial   #335 <Method void StringBuilder()>
	//  356  749:astore_2        
					((StringBuilder) (fragmentmanagernonconfig)).append("No instantiated fragment for index #");
	//  357  750:aload_2         
	//  358  751:ldc2            #1770 <String "No instantiated fragment for index #">
	//  359  754:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  360  757:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(fragmentmanagerstate.mAdded[l]);
	//  361  758:aload_2         
	//  362  759:aload           9
	//  363  761:getfield        #1768 <Field int[] FragmentManagerState.mAdded>
	//  364  764:iload_3         
	//  365  765:iaload          
	//  366  766:invokevirtual   #872 <Method StringBuilder StringBuilder.append(int)>
	//  367  769:pop             
					throwException(((RuntimeException) (new IllegalStateException(((StringBuilder) (fragmentmanagernonconfig)).toString()))));
	//  368  770:aload_0         
	//  369  771:new             #343 <Class IllegalStateException>
	//  370  774:dup             
	//  371  775:aload_2         
	//  372  776:invokevirtual   #347 <Method String StringBuilder.toString()>
	//  373  779:invokespecial   #350 <Method void IllegalStateException(String)>
	//  374  782:invokespecial   #1275 <Method void throwException(RuntimeException)>
				}
				parcelable.mAdded = true;
	//  375  785:aload_1         
	//  376  786:iconst_1        
	//  377  787:putfield        #621 <Field boolean Fragment.mAdded>
				if(DEBUG)
	//* 378  790:getstatic       #818 <Field boolean DEBUG>
	//* 379  793:ifeq            842
				{
					fragmentmanagernonconfig = ((FragmentManagerNonConfig) (new StringBuilder()));
	//  380  796:new             #334 <Class StringBuilder>
	//  381  799:dup             
	//  382  800:invokespecial   #335 <Method void StringBuilder()>
	//  383  803:astore_2        
					((StringBuilder) (fragmentmanagernonconfig)).append("restoreAllState: added #");
	//  384  804:aload_2         
	//  385  805:ldc2            #1772 <String "restoreAllState: added #">
	//  386  808:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  387  811:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(l);
	//  388  812:aload_2         
	//  389  813:iload_3         
	//  390  814:invokevirtual   #872 <Method StringBuilder StringBuilder.append(int)>
	//  391  817:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(": ");
	//  392  818:aload_2         
	//  393  819:ldc2            #1139 <String ": ">
	//  394  822:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  395  825:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(((Object) (parcelable)));
	//  396  826:aload_2         
	//  397  827:aload_1         
	//  398  828:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//  399  831:pop             
					Log.v("FragmentManager", ((StringBuilder) (fragmentmanagernonconfig)).toString());
	//  400  832:ldc1            #75  <String "FragmentManager">
	//  401  834:aload_2         
	//  402  835:invokevirtual   #347 <Method String StringBuilder.toString()>
	//  403  838:invokestatic    #826 <Method int Log.v(String, String)>
	//  404  841:pop             
				}
				if(!mAdded.contains(((Object) (parcelable))))
	//* 405  842:aload_0         
	//* 406  843:getfield        #170 <Field ArrayList mAdded>
	//* 407  846:aload_1         
	//* 408  847:invokevirtual   #836 <Method boolean ArrayList.contains(Object)>
	//* 409  850:ifne            883
				{
					synchronized(mAdded)
	//* 410  853:aload_0         
	//* 411  854:getfield        #170 <Field ArrayList mAdded>
	//* 412  857:astore_2        
	//* 413  858:aload_2         
	//* 414  859:monitorenter    
					{
						mAdded.add(((Object) (parcelable)));
	//  415  860:aload_0         
	//  416  861:getfield        #170 <Field ArrayList mAdded>
	//  417  864:aload_1         
	//  418  865:invokevirtual   #705 <Method boolean ArrayList.add(Object)>
	//  419  868:pop             
					}
	//  420  869:aload_2         
	//  421  870:monitorexit     
					l++;
	//  422  871:iload_3         
	//  423  872:iconst_1        
	//  424  873:iadd            
	//  425  874:istore_3        
				} else
	//* 426  875:goto            710
	//* 427  878:astore_1        
	//* 428  879:aload_2         
	//* 429  880:monitorexit     
	//* 430  881:aload_1         
	//* 431  882:athrow          
				{
					throw new IllegalStateException("Already added!");
	//  432  883:new             #343 <Class IllegalStateException>
	//  433  886:dup             
	//  434  887:ldc2            #1774 <String "Already added!">
	//  435  890:invokespecial   #350 <Method void IllegalStateException(String)>
	//  436  893:athrow          
				}
			}

		}
		break MISSING_BLOCK_LABEL_894;
		parcelable;
		fragmentmanagernonconfig;
		JVM INSTR monitorexit ;
		throw parcelable;
		if(fragmentmanagerstate.mBackStack != null)
	//* 437  894:aload           9
	//* 438  896:getfield        #1777 <Field BackStackState[] FragmentManagerState.mBackStack>
	//* 439  899:ifnull          1074
		{
			mBackStack = new ArrayList(fragmentmanagerstate.mBackStack.length);
	//  440  902:aload_0         
	//  441  903:new             #167 <Class ArrayList>
	//  442  906:dup             
	//  443  907:aload           9
	//  444  909:getfield        #1777 <Field BackStackState[] FragmentManagerState.mBackStack>
	//  445  912:arraylength     
	//  446  913:invokespecial   #904 <Method void ArrayList(int)>
	//  447  916:putfield        #814 <Field ArrayList mBackStack>
			for(int i1 = 0; i1 < fragmentmanagerstate.mBackStack.length; i1++)
	//* 448  919:iconst_0        
	//* 449  920:istore_3        
	//* 450  921:iload_3         
	//* 451  922:aload           9
	//* 452  924:getfield        #1777 <Field BackStackState[] FragmentManagerState.mBackStack>
	//* 453  927:arraylength     
	//* 454  928:icmpge          1079
			{
				parcelable = ((Parcelable) (fragmentmanagerstate.mBackStack[i1].instantiate(this)));
	//  455  931:aload           9
	//  456  933:getfield        #1777 <Field BackStackState[] FragmentManagerState.mBackStack>
	//  457  936:iload_3         
	//  458  937:aaload          
	//  459  938:aload_0         
	//  460  939:invokevirtual   #1782 <Method BackStackRecord BackStackState.instantiate(FragmentManagerImpl)>
	//  461  942:astore_1        
				if(DEBUG)
	//* 462  943:getstatic       #818 <Field boolean DEBUG>
	//* 463  946:ifeq            1042
				{
					fragmentmanagernonconfig = ((FragmentManagerNonConfig) (new StringBuilder()));
	//  464  949:new             #334 <Class StringBuilder>
	//  465  952:dup             
	//  466  953:invokespecial   #335 <Method void StringBuilder()>
	//  467  956:astore_2        
					((StringBuilder) (fragmentmanagernonconfig)).append("restoreAllState: back stack #");
	//  468  957:aload_2         
	//  469  958:ldc2            #1784 <String "restoreAllState: back stack #">
	//  470  961:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  471  964:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(i1);
	//  472  965:aload_2         
	//  473  966:iload_3         
	//  474  967:invokevirtual   #872 <Method StringBuilder StringBuilder.append(int)>
	//  475  970:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(" (index ");
	//  476  971:aload_2         
	//  477  972:ldc2            #1786 <String " (index ">
	//  478  975:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  479  978:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(((BackStackRecord) (parcelable)).mIndex);
	//  480  979:aload_2         
	//  481  980:aload_1         
	//  482  981:getfield        #490 <Field int BackStackRecord.mIndex>
	//  483  984:invokevirtual   #872 <Method StringBuilder StringBuilder.append(int)>
	//  484  987:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append("): ");
	//  485  988:aload_2         
	//  486  989:ldc2            #1788 <String "): ">
	//  487  992:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  488  995:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(((Object) (parcelable)));
	//  489  996:aload_2         
	//  490  997:aload_1         
	//  491  998:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//  492 1001:pop             
					Log.v("FragmentManager", ((StringBuilder) (fragmentmanagernonconfig)).toString());
	//  493 1002:ldc1            #75  <String "FragmentManager">
	//  494 1004:aload_2         
	//  495 1005:invokevirtual   #347 <Method String StringBuilder.toString()>
	//  496 1008:invokestatic    #826 <Method int Log.v(String, String)>
	//  497 1011:pop             
					fragmentmanagernonconfig = ((FragmentManagerNonConfig) (new PrintWriter(((java.io.Writer) (new LogWriter("FragmentManager"))))));
	//  498 1012:new             #791 <Class PrintWriter>
	//  499 1015:dup             
	//  500 1016:new             #793 <Class LogWriter>
	//  501 1019:dup             
	//  502 1020:ldc1            #75  <String "FragmentManager">
	//  503 1022:invokespecial   #794 <Method void LogWriter(String)>
	//  504 1025:invokespecial   #797 <Method void PrintWriter(java.io.Writer)>
	//  505 1028:astore_2        
					((BackStackRecord) (parcelable)).dump("  ", ((PrintWriter) (fragmentmanagernonconfig)), false);
	//  506 1029:aload_1         
	//  507 1030:ldc2            #799 <String "  ">
	//  508 1033:aload_2         
	//  509 1034:iconst_0        
	//  510 1035:invokevirtual   #1791 <Method void BackStackRecord.dump(String, PrintWriter, boolean)>
					((PrintWriter) (fragmentmanagernonconfig)).close();
	//  511 1038:aload_2         
	//  512 1039:invokevirtual   #1794 <Method void PrintWriter.close()>
				}
				mBackStack.add(((Object) (parcelable)));
	//  513 1042:aload_0         
	//  514 1043:getfield        #814 <Field ArrayList mBackStack>
	//  515 1046:aload_1         
	//  516 1047:invokevirtual   #705 <Method boolean ArrayList.add(Object)>
	//  517 1050:pop             
				if(((BackStackRecord) (parcelable)).mIndex >= 0)
	//* 518 1051:aload_1         
	//* 519 1052:getfield        #490 <Field int BackStackRecord.mIndex>
	//* 520 1055:iflt            1067
					setBackStackIndex(((BackStackRecord) (parcelable)).mIndex, ((BackStackRecord) (parcelable)));
	//  521 1058:aload_0         
	//  522 1059:aload_1         
	//  523 1060:getfield        #490 <Field int BackStackRecord.mIndex>
	//  524 1063:aload_1         
	//  525 1064:invokevirtual   #1798 <Method void setBackStackIndex(int, BackStackRecord)>
			}

	//  526 1067:iload_3         
	//  527 1068:iconst_1        
	//  528 1069:iadd            
	//  529 1070:istore_3        
		} else
	//* 530 1071:goto            921
		{
			mBackStack = null;
	//  531 1074:aload_0         
	//  532 1075:aconst_null     
	//  533 1076:putfield        #814 <Field ArrayList mBackStack>
		}
		if(fragmentmanagerstate.mPrimaryNavActiveIndex >= 0)
	//* 534 1079:aload           9
	//* 535 1081:getfield        #1801 <Field int FragmentManagerState.mPrimaryNavActiveIndex>
	//* 536 1084:iflt            1106
			mPrimaryNav = (Fragment)mActive.get(fragmentmanagerstate.mPrimaryNavActiveIndex);
	//  537 1087:aload_0         
	//  538 1088:aload_0         
	//  539 1089:getfield        #312 <Field SparseArray mActive>
	//  540 1092:aload           9
	//  541 1094:getfield        #1801 <Field int FragmentManagerState.mPrimaryNavActiveIndex>
	//  542 1097:invokevirtual   #1269 <Method Object SparseArray.get(int)>
	//  543 1100:checkcast       #204 <Class Fragment>
	//  544 1103:putfield        #678 <Field Fragment mPrimaryNav>
		mNextFragmentIndex = fragmentmanagerstate.mNextFragmentIndex;
	//  545 1106:aload_0         
	//  546 1107:aload           9
	//  547 1109:getfield        #1802 <Field int FragmentManagerState.mNextFragmentIndex>
	//  548 1112:putfield        #165 <Field int mNextFragmentIndex>
		return;
	//  549 1115:return          
	}

	FragmentManagerNonConfig retainNonConfig()
	{
		setRetaining(mSavedNonConfig);
	//    0    0:aload_0         
	//    1    1:getfield        #1598 <Field FragmentManagerNonConfig mSavedNonConfig>
	//    2    4:invokestatic    #759 <Method void setRetaining(FragmentManagerNonConfig)>
		return mSavedNonConfig;
	//    3    7:aload_0         
	//    4    8:getfield        #1598 <Field FragmentManagerNonConfig mSavedNonConfig>
	//    5   11:areturn         
	}

	Parcelable saveAllState()
	{
		forcePostponedTransactions();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1233 <Method void forcePostponedTransactions()>
		endAnimatingAwayFragments();
	//    2    4:aload_0         
	//    3    5:invokespecial   #1808 <Method void endAnimatingAwayFragments()>
		execPendingActions();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #369 <Method boolean execPendingActions()>
	//    6   12:pop             
		mStateSaved = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #947 <Field boolean mStateSaved>
		FragmentManagerState fragmentmanagerstate = null;
	//   10   18:aconst_null     
	//   11   19:astore          7
		mSavedNonConfig = null;
	//   12   21:aload_0         
	//   13   22:aconst_null     
	//   14   23:putfield        #1598 <Field FragmentManagerNonConfig mSavedNonConfig>
		Object obj = ((Object) (mActive));
	//   15   26:aload_0         
	//   16   27:getfield        #312 <Field SparseArray mActive>
	//   17   30:astore          5
		if(obj != null)
	//*  18   32:aload           5
	//*  19   34:ifnull          855
		{
			if(((SparseArray) (obj)).size() <= 0)
	//*  20   37:aload           5
	//*  21   39:invokevirtual   #315 <Method int SparseArray.size()>
	//*  22   42:ifgt            47
				return null;
	//   23   45:aconst_null     
	//   24   46:areturn         
			int j1 = mActive.size();
	//   25   47:aload_0         
	//   26   48:getfield        #312 <Field SparseArray mActive>
	//   27   51:invokevirtual   #315 <Method int SparseArray.size()>
	//   28   54:istore          4
			FragmentState afragmentstate[] = new FragmentState[j1];
	//   29   56:iload           4
	//   30   58:anewarray       FragmentState[]
	//   31   61:astore          8
			boolean flag = false;
	//   32   63:iconst_0        
	//   33   64:istore_3        
			int i = 0;
	//   34   65:iconst_0        
	//   35   66:istore_1        
			int l = i;
	//   36   67:iload_1         
	//   37   68:istore_2        
			for(; i < j1; i++)
	//*  38   69:iload_1         
	//*  39   70:iload           4
	//*  40   72:icmpge          432
			{
				obj = ((Object) ((Fragment)mActive.valueAt(i)));
	//   41   75:aload_0         
	//   42   76:getfield        #312 <Field SparseArray mActive>
	//   43   79:iload_1         
	//   44   80:invokevirtual   #318 <Method Object SparseArray.valueAt(int)>
	//   45   83:checkcast       #204 <Class Fragment>
	//   46   86:astore          5
				if(obj == null)
					continue;
	//   47   88:aload           5
	//   48   90:ifnull          425
				if(((Fragment) (obj)).mIndex < 0)
	//*  49   93:aload           5
	//*  50   95:getfield        #1346 <Field int Fragment.mIndex>
	//*  51   98:ifge            163
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   52  101:new             #334 <Class StringBuilder>
	//   53  104:dup             
	//   54  105:invokespecial   #335 <Method void StringBuilder()>
	//   55  108:astore          6
					stringbuilder.append("Failure saving state: active ");
	//   56  110:aload           6
	//   57  112:ldc2            #1810 <String "Failure saving state: active ">
	//   58  115:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   59  118:pop             
					stringbuilder.append(obj);
	//   60  119:aload           6
	//   61  121:aload           5
	//   62  123:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//   63  126:pop             
					stringbuilder.append(" has cleared index: ");
	//   64  127:aload           6
	//   65  129:ldc2            #1812 <String " has cleared index: ">
	//   66  132:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   67  135:pop             
					stringbuilder.append(((Fragment) (obj)).mIndex);
	//   68  136:aload           6
	//   69  138:aload           5
	//   70  140:getfield        #1346 <Field int Fragment.mIndex>
	//   71  143:invokevirtual   #872 <Method StringBuilder StringBuilder.append(int)>
	//   72  146:pop             
					throwException(((RuntimeException) (new IllegalStateException(stringbuilder.toString()))));
	//   73  147:aload_0         
	//   74  148:new             #343 <Class IllegalStateException>
	//   75  151:dup             
	//   76  152:aload           6
	//   77  154:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   78  157:invokespecial   #350 <Method void IllegalStateException(String)>
	//   79  160:invokespecial   #1275 <Method void throwException(RuntimeException)>
				}
				FragmentState fragmentstate = new FragmentState(((Fragment) (obj)));
	//   80  163:new             #1744 <Class FragmentState>
	//   81  166:dup             
	//   82  167:aload           5
	//   83  169:invokespecial   #1814 <Method void FragmentState(Fragment)>
	//   84  172:astore          6
				afragmentstate[i] = fragmentstate;
	//   85  174:aload           8
	//   86  176:iload_1         
	//   87  177:aload           6
	//   88  179:aastore         
				if(((Fragment) (obj)).mState > 0 && fragmentstate.mSavedFragmentState == null)
	//*  89  180:aload           5
	//*  90  182:getfield        #207 <Field int Fragment.mState>
	//*  91  185:ifle            350
	//*  92  188:aload           6
	//*  93  190:getfield        #1751 <Field Bundle FragmentState.mSavedFragmentState>
	//*  94  193:ifnonnull       350
				{
					fragmentstate.mSavedFragmentState = saveFragmentBasicState(((Fragment) (obj)));
	//   95  196:aload           6
	//   96  198:aload_0         
	//   97  199:aload           5
	//   98  201:invokevirtual   #1818 <Method Bundle saveFragmentBasicState(Fragment)>
	//   99  204:putfield        #1751 <Field Bundle FragmentState.mSavedFragmentState>
					if(((Fragment) (obj)).mTarget != null)
	//* 100  207:aload           5
	//* 101  209:getfield        #1416 <Field Fragment Fragment.mTarget>
	//* 102  212:ifnull          360
					{
						if(((Fragment) (obj)).mTarget.mIndex < 0)
	//* 103  215:aload           5
	//* 104  217:getfield        #1416 <Field Fragment Fragment.mTarget>
	//* 105  220:getfield        #1346 <Field int Fragment.mIndex>
	//* 106  223:ifge            288
						{
							StringBuilder stringbuilder1 = new StringBuilder();
	//  107  226:new             #334 <Class StringBuilder>
	//  108  229:dup             
	//  109  230:invokespecial   #335 <Method void StringBuilder()>
	//  110  233:astore          9
							stringbuilder1.append("Failure saving state: ");
	//  111  235:aload           9
	//  112  237:ldc2            #1820 <String "Failure saving state: ">
	//  113  240:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  114  243:pop             
							stringbuilder1.append(obj);
	//  115  244:aload           9
	//  116  246:aload           5
	//  117  248:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//  118  251:pop             
							stringbuilder1.append(" has target not in fragment manager: ");
	//  119  252:aload           9
	//  120  254:ldc2            #1822 <String " has target not in fragment manager: ">
	//  121  257:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  122  260:pop             
							stringbuilder1.append(((Object) (((Fragment) (obj)).mTarget)));
	//  123  261:aload           9
	//  124  263:aload           5
	//  125  265:getfield        #1416 <Field Fragment Fragment.mTarget>
	//  126  268:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//  127  271:pop             
							throwException(((RuntimeException) (new IllegalStateException(stringbuilder1.toString()))));
	//  128  272:aload_0         
	//  129  273:new             #343 <Class IllegalStateException>
	//  130  276:dup             
	//  131  277:aload           9
	//  132  279:invokevirtual   #347 <Method String StringBuilder.toString()>
	//  133  282:invokespecial   #350 <Method void IllegalStateException(String)>
	//  134  285:invokespecial   #1275 <Method void throwException(RuntimeException)>
						}
						if(fragmentstate.mSavedFragmentState == null)
	//* 135  288:aload           6
	//* 136  290:getfield        #1751 <Field Bundle FragmentState.mSavedFragmentState>
	//* 137  293:ifnonnull       308
							fragmentstate.mSavedFragmentState = new Bundle();
	//  138  296:aload           6
	//  139  298:new             #1264 <Class Bundle>
	//  140  301:dup             
	//  141  302:invokespecial   #1823 <Method void Bundle()>
	//  142  305:putfield        #1751 <Field Bundle FragmentState.mSavedFragmentState>
						putFragment(fragmentstate.mSavedFragmentState, "android:target_state", ((Fragment) (obj)).mTarget);
	//  143  308:aload_0         
	//  144  309:aload           6
	//  145  311:getfield        #1751 <Field Bundle FragmentState.mSavedFragmentState>
	//  146  314:ldc1            #81  <String "android:target_state">
	//  147  316:aload           5
	//  148  318:getfield        #1416 <Field Fragment Fragment.mTarget>
	//  149  321:invokevirtual   #1825 <Method void putFragment(Bundle, String, Fragment)>
						if(((Fragment) (obj)).mTargetRequestCode != 0)
	//* 150  324:aload           5
	//* 151  326:getfield        #1419 <Field int Fragment.mTargetRequestCode>
	//* 152  329:ifeq            360
							fragmentstate.mSavedFragmentState.putInt("android:target_req_state", ((Fragment) (obj)).mTargetRequestCode);
	//  153  332:aload           6
	//  154  334:getfield        #1751 <Field Bundle FragmentState.mSavedFragmentState>
	//  155  337:ldc1            #78  <String "android:target_req_state">
	//  156  339:aload           5
	//  157  341:getfield        #1419 <Field int Fragment.mTargetRequestCode>
	//  158  344:invokevirtual   #1711 <Method void Bundle.putInt(String, int)>
					}
				} else
	//* 159  347:goto            360
				{
					fragmentstate.mSavedFragmentState = ((Fragment) (obj)).mSavedFragmentState;
	//  160  350:aload           6
	//  161  352:aload           5
	//  162  354:getfield        #1209 <Field Bundle Fragment.mSavedFragmentState>
	//  163  357:putfield        #1751 <Field Bundle FragmentState.mSavedFragmentState>
				}
				if(DEBUG)
	//* 164  360:getstatic       #818 <Field boolean DEBUG>
	//* 165  363:ifeq            423
				{
					StringBuilder stringbuilder2 = new StringBuilder();
	//  166  366:new             #334 <Class StringBuilder>
	//  167  369:dup             
	//  168  370:invokespecial   #335 <Method void StringBuilder()>
	//  169  373:astore          9
					stringbuilder2.append("Saved state of ");
	//  170  375:aload           9
	//  171  377:ldc2            #1827 <String "Saved state of ">
	//  172  380:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  173  383:pop             
					stringbuilder2.append(obj);
	//  174  384:aload           9
	//  175  386:aload           5
	//  176  388:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//  177  391:pop             
					stringbuilder2.append(": ");
	//  178  392:aload           9
	//  179  394:ldc2            #1139 <String ": ">
	//  180  397:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  181  400:pop             
					stringbuilder2.append(((Object) (fragmentstate.mSavedFragmentState)));
	//  182  401:aload           9
	//  183  403:aload           6
	//  184  405:getfield        #1751 <Field Bundle FragmentState.mSavedFragmentState>
	//  185  408:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//  186  411:pop             
					Log.v("FragmentManager", stringbuilder2.toString());
	//  187  412:ldc1            #75  <String "FragmentManager">
	//  188  414:aload           9
	//  189  416:invokevirtual   #347 <Method String StringBuilder.toString()>
	//  190  419:invokestatic    #826 <Method int Log.v(String, String)>
	//  191  422:pop             
				}
				l = 1;
	//  192  423:iconst_1        
	//  193  424:istore_2        
			}

	//  194  425:iload_1         
	//  195  426:iconst_1        
	//  196  427:iadd            
	//  197  428:istore_1        
	//* 198  429:goto            69
			if(l == 0)
	//* 199  432:iload_2         
	//* 200  433:ifne            453
			{
				if(DEBUG)
	//* 201  436:getstatic       #818 <Field boolean DEBUG>
	//* 202  439:ifeq            451
					Log.v("FragmentManager", "saveAllState: no fragments!");
	//  203  442:ldc1            #75  <String "FragmentManager">
	//  204  444:ldc2            #1829 <String "saveAllState: no fragments!">
	//  205  447:invokestatic    #826 <Method int Log.v(String, String)>
	//  206  450:pop             
				return null;
	//  207  451:aconst_null     
	//  208  452:areturn         
			}
			l = mAdded.size();
	//  209  453:aload_0         
	//  210  454:getfield        #170 <Field ArrayList mAdded>
	//  211  457:invokevirtual   #198 <Method int ArrayList.size()>
	//  212  460:istore_2        
			int ai[];
			if(l > 0)
	//* 213  461:iload_2         
	//* 214  462:ifle            645
			{
				int ai1[] = new int[l];
	//  215  465:iload_2         
	//  216  466:newarray        int[]
	//  217  468:astore          6
				int j = 0;
	//  218  470:iconst_0        
	//  219  471:istore_1        
				do
				{
					ai = ai1;
	//  220  472:aload           6
	//  221  474:astore          5
					if(j >= l)
						break;
	//  222  476:iload_1         
	//  223  477:iload_2         
	//  224  478:icmpge          648
					ai1[j] = ((Fragment)mAdded.get(j)).mIndex;
	//  225  481:aload           6
	//  226  483:iload_1         
	//  227  484:aload_0         
	//  228  485:getfield        #170 <Field ArrayList mAdded>
	//  229  488:iload_1         
	//  230  489:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//  231  492:checkcast       #204 <Class Fragment>
	//  232  495:getfield        #1346 <Field int Fragment.mIndex>
	//  233  498:iastore         
					if(ai1[j] < 0)
	//* 234  499:aload           6
	//* 235  501:iload_1         
	//* 236  502:iaload          
	//* 237  503:ifge            573
					{
						ai = ((int []) (new StringBuilder()));
	//  238  506:new             #334 <Class StringBuilder>
	//  239  509:dup             
	//  240  510:invokespecial   #335 <Method void StringBuilder()>
	//  241  513:astore          5
						((StringBuilder) (ai)).append("Failure saving state: active ");
	//  242  515:aload           5
	//  243  517:ldc2            #1810 <String "Failure saving state: active ">
	//  244  520:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  245  523:pop             
						((StringBuilder) (ai)).append(mAdded.get(j));
	//  246  524:aload           5
	//  247  526:aload_0         
	//  248  527:getfield        #170 <Field ArrayList mAdded>
	//  249  530:iload_1         
	//  250  531:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//  251  534:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//  252  537:pop             
						((StringBuilder) (ai)).append(" has cleared index: ");
	//  253  538:aload           5
	//  254  540:ldc2            #1812 <String " has cleared index: ">
	//  255  543:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  256  546:pop             
						((StringBuilder) (ai)).append(ai1[j]);
	//  257  547:aload           5
	//  258  549:aload           6
	//  259  551:iload_1         
	//  260  552:iaload          
	//  261  553:invokevirtual   #872 <Method StringBuilder StringBuilder.append(int)>
	//  262  556:pop             
						throwException(((RuntimeException) (new IllegalStateException(((StringBuilder) (ai)).toString()))));
	//  263  557:aload_0         
	//  264  558:new             #343 <Class IllegalStateException>
	//  265  561:dup             
	//  266  562:aload           5
	//  267  564:invokevirtual   #347 <Method String StringBuilder.toString()>
	//  268  567:invokespecial   #350 <Method void IllegalStateException(String)>
	//  269  570:invokespecial   #1275 <Method void throwException(RuntimeException)>
					}
					if(DEBUG)
	//* 270  573:getstatic       #818 <Field boolean DEBUG>
	//* 271  576:ifeq            638
					{
						ai = ((int []) (new StringBuilder()));
	//  272  579:new             #334 <Class StringBuilder>
	//  273  582:dup             
	//  274  583:invokespecial   #335 <Method void StringBuilder()>
	//  275  586:astore          5
						((StringBuilder) (ai)).append("saveAllState: adding fragment #");
	//  276  588:aload           5
	//  277  590:ldc2            #1831 <String "saveAllState: adding fragment #">
	//  278  593:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  279  596:pop             
						((StringBuilder) (ai)).append(j);
	//  280  597:aload           5
	//  281  599:iload_1         
	//  282  600:invokevirtual   #872 <Method StringBuilder StringBuilder.append(int)>
	//  283  603:pop             
						((StringBuilder) (ai)).append(": ");
	//  284  604:aload           5
	//  285  606:ldc2            #1139 <String ": ">
	//  286  609:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  287  612:pop             
						((StringBuilder) (ai)).append(mAdded.get(j));
	//  288  613:aload           5
	//  289  615:aload_0         
	//  290  616:getfield        #170 <Field ArrayList mAdded>
	//  291  619:iload_1         
	//  292  620:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//  293  623:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//  294  626:pop             
						Log.v("FragmentManager", ((StringBuilder) (ai)).toString());
	//  295  627:ldc1            #75  <String "FragmentManager">
	//  296  629:aload           5
	//  297  631:invokevirtual   #347 <Method String StringBuilder.toString()>
	//  298  634:invokestatic    #826 <Method int Log.v(String, String)>
	//  299  637:pop             
					}
					j++;
	//  300  638:iload_1         
	//  301  639:iconst_1        
	//  302  640:iadd            
	//  303  641:istore_1        
				} while(true);
	//  304  642:goto            472
			} else
			{
				ai = null;
	//  305  645:aconst_null     
	//  306  646:astore          5
			}
			ArrayList arraylist = mBackStack;
	//  307  648:aload_0         
	//  308  649:getfield        #814 <Field ArrayList mBackStack>
	//  309  652:astore          9
			BackStackState abackstackstate[] = ((BackStackState []) (fragmentmanagerstate));
	//  310  654:aload           7
	//  311  656:astore          6
			if(arraylist != null)
	//* 312  658:aload           9
	//* 313  660:ifnull          788
			{
				int i1 = arraylist.size();
	//  314  663:aload           9
	//  315  665:invokevirtual   #198 <Method int ArrayList.size()>
	//  316  668:istore_2        
				abackstackstate = ((BackStackState []) (fragmentmanagerstate));
	//  317  669:aload           7
	//  318  671:astore          6
				if(i1 > 0)
	//* 319  673:iload_2         
	//* 320  674:ifle            788
				{
					BackStackState abackstackstate1[] = new BackStackState[i1];
	//  321  677:iload_2         
	//  322  678:anewarray       BackStackState[]
	//  323  681:astore          7
					int k = ((int) (flag));
	//  324  683:iload_3         
	//  325  684:istore_1        
					do
					{
						abackstackstate = abackstackstate1;
	//  326  685:aload           7
	//  327  687:astore          6
						if(k >= i1)
							break;
	//  328  689:iload_1         
	//  329  690:iload_2         
	//  330  691:icmpge          788
						abackstackstate1[k] = new BackStackState((BackStackRecord)mBackStack.get(k));
	//  331  694:aload           7
	//  332  696:iload_1         
	//  333  697:new             #1779 <Class BackStackState>
	//  334  700:dup             
	//  335  701:aload_0         
	//  336  702:getfield        #814 <Field ArrayList mBackStack>
	//  337  705:iload_1         
	//  338  706:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//  339  709:checkcast       #431 <Class BackStackRecord>
	//  340  712:invokespecial   #1833 <Method void BackStackState(BackStackRecord)>
	//  341  715:aastore         
						if(DEBUG)
	//* 342  716:getstatic       #818 <Field boolean DEBUG>
	//* 343  719:ifeq            781
						{
							abackstackstate = ((BackStackState []) (new StringBuilder()));
	//  344  722:new             #334 <Class StringBuilder>
	//  345  725:dup             
	//  346  726:invokespecial   #335 <Method void StringBuilder()>
	//  347  729:astore          6
							((StringBuilder) (abackstackstate)).append("saveAllState: adding back stack #");
	//  348  731:aload           6
	//  349  733:ldc2            #1835 <String "saveAllState: adding back stack #">
	//  350  736:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  351  739:pop             
							((StringBuilder) (abackstackstate)).append(k);
	//  352  740:aload           6
	//  353  742:iload_1         
	//  354  743:invokevirtual   #872 <Method StringBuilder StringBuilder.append(int)>
	//  355  746:pop             
							((StringBuilder) (abackstackstate)).append(": ");
	//  356  747:aload           6
	//  357  749:ldc2            #1139 <String ": ">
	//  358  752:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  359  755:pop             
							((StringBuilder) (abackstackstate)).append(mBackStack.get(k));
	//  360  756:aload           6
	//  361  758:aload_0         
	//  362  759:getfield        #814 <Field ArrayList mBackStack>
	//  363  762:iload_1         
	//  364  763:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//  365  766:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//  366  769:pop             
							Log.v("FragmentManager", ((StringBuilder) (abackstackstate)).toString());
	//  367  770:ldc1            #75  <String "FragmentManager">
	//  368  772:aload           6
	//  369  774:invokevirtual   #347 <Method String StringBuilder.toString()>
	//  370  777:invokestatic    #826 <Method int Log.v(String, String)>
	//  371  780:pop             
						}
						k++;
	//  372  781:iload_1         
	//  373  782:iconst_1        
	//  374  783:iadd            
	//  375  784:istore_1        
					} while(true);
	//  376  785:goto            685
				}
			}
			abackstackstate1 = ((BackStackState []) (new FragmentManagerState()));
	//  377  788:new             #1734 <Class FragmentManagerState>
	//  378  791:dup             
	//  379  792:invokespecial   #1836 <Method void FragmentManagerState()>
	//  380  795:astore          7
			abackstackstate1.mActive = afragmentstate;
	//  381  797:aload           7
	//  382  799:aload           8
	//  383  801:putfield        #1737 <Field FragmentState[] FragmentManagerState.mActive>
			abackstackstate1.mAdded = ai;
	//  384  804:aload           7
	//  385  806:aload           5
	//  386  808:putfield        #1768 <Field int[] FragmentManagerState.mAdded>
			abackstackstate1.mBackStack = abackstackstate;
	//  387  811:aload           7
	//  388  813:aload           6
	//  389  815:putfield        #1777 <Field BackStackState[] FragmentManagerState.mBackStack>
			ai = ((int []) (mPrimaryNav));
	//  390  818:aload_0         
	//  391  819:getfield        #678 <Field Fragment mPrimaryNav>
	//  392  822:astore          5
			if(ai != null)
	//* 393  824:aload           5
	//* 394  826:ifnull          839
				abackstackstate1.mPrimaryNavActiveIndex = ((Fragment) (ai)).mIndex;
	//  395  829:aload           7
	//  396  831:aload           5
	//  397  833:getfield        #1346 <Field int Fragment.mIndex>
	//  398  836:putfield        #1801 <Field int FragmentManagerState.mPrimaryNavActiveIndex>
			abackstackstate1.mNextFragmentIndex = mNextFragmentIndex;
	//  399  839:aload           7
	//  400  841:aload_0         
	//  401  842:getfield        #165 <Field int mNextFragmentIndex>
	//  402  845:putfield        #1802 <Field int FragmentManagerState.mNextFragmentIndex>
			saveNonConfig();
	//  403  848:aload_0         
	//  404  849:invokevirtual   #1839 <Method void saveNonConfig()>
			return ((Parcelable) (abackstackstate1));
	//  405  852:aload           7
	//  406  854:areturn         
		} else
		{
			return null;
	//  407  855:aconst_null     
	//  408  856:areturn         
		}
	}

	Bundle saveFragmentBasicState(Fragment fragment)
	{
		if(mStateBundle == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #179 <Field Bundle mStateBundle>
	//*   2    4:ifnonnull       18
			mStateBundle = new Bundle();
	//    3    7:aload_0         
	//    4    8:new             #1264 <Class Bundle>
	//    5   11:dup             
	//    6   12:invokespecial   #1823 <Method void Bundle()>
	//    7   15:putfield        #179 <Field Bundle mStateBundle>
		fragment.performSaveInstanceState(mStateBundle);
	//    8   18:aload_1         
	//    9   19:aload_0         
	//   10   20:getfield        #179 <Field Bundle mStateBundle>
	//   11   23:invokevirtual   #1842 <Method void Fragment.performSaveInstanceState(Bundle)>
		dispatchOnFragmentSaveInstanceState(fragment, mStateBundle, false);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #179 <Field Bundle mStateBundle>
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #1056 <Method void dispatchOnFragmentSaveInstanceState(Fragment, Bundle, boolean)>
		Bundle bundle1;
		if(!mStateBundle.isEmpty())
	//*  18   36:aload_0         
	//*  19   37:getfield        #179 <Field Bundle mStateBundle>
	//*  20   40:invokevirtual   #1843 <Method boolean Bundle.isEmpty()>
	//*  21   43:ifne            59
		{
			bundle1 = mStateBundle;
	//   22   46:aload_0         
	//   23   47:getfield        #179 <Field Bundle mStateBundle>
	//   24   50:astore_3        
			mStateBundle = null;
	//   25   51:aload_0         
	//   26   52:aconst_null     
	//   27   53:putfield        #179 <Field Bundle mStateBundle>
		} else
	//*  28   56:goto            61
		{
			bundle1 = null;
	//   29   59:aconst_null     
	//   30   60:astore_3        
		}
		if(fragment.mView != null)
	//*  31   61:aload_1         
	//*  32   62:getfield        #221 <Field View Fragment.mView>
	//*  33   65:ifnull          73
			saveFragmentViewState(fragment);
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:invokevirtual   #1549 <Method void saveFragmentViewState(Fragment)>
		Bundle bundle = bundle1;
	//   37   73:aload_3         
	//   38   74:astore_2        
		if(fragment.mSavedViewState != null)
	//*  39   75:aload_1         
	//*  40   76:getfield        #1411 <Field SparseArray Fragment.mSavedViewState>
	//*  41   79:ifnull          106
		{
			bundle = bundle1;
	//   42   82:aload_3         
	//   43   83:astore_2        
			if(bundle1 == null)
	//*  44   84:aload_3         
	//*  45   85:ifnonnull       96
				bundle = new Bundle();
	//   46   88:new             #1264 <Class Bundle>
	//   47   91:dup             
	//   48   92:invokespecial   #1823 <Method void Bundle()>
	//   49   95:astore_2        
			bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
	//   50   96:aload_2         
	//   51   97:ldc1            #87  <String "android:view_state">
	//   52   99:aload_1         
	//   53  100:getfield        #1411 <Field SparseArray Fragment.mSavedViewState>
	//   54  103:invokevirtual   #1847 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
		}
		bundle1 = bundle;
	//   55  106:aload_2         
	//   56  107:astore_3        
		if(!fragment.mUserVisibleHint)
	//*  57  108:aload_1         
	//*  58  109:getfield        #1426 <Field boolean Fragment.mUserVisibleHint>
	//*  59  112:ifne            139
		{
			bundle1 = bundle;
	//   60  115:aload_2         
	//   61  116:astore_3        
			if(bundle == null)
	//*  62  117:aload_2         
	//*  63  118:ifnonnull       129
				bundle1 = new Bundle();
	//   64  121:new             #1264 <Class Bundle>
	//   65  124:dup             
	//   66  125:invokespecial   #1823 <Method void Bundle()>
	//   67  128:astore_3        
			bundle1.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
	//   68  129:aload_3         
	//   69  130:ldc1            #84  <String "android:user_visible_hint">
	//   70  132:aload_1         
	//   71  133:getfield        #1426 <Field boolean Fragment.mUserVisibleHint>
	//   72  136:invokevirtual   #1851 <Method void Bundle.putBoolean(String, boolean)>
		}
		return bundle1;
	//   73  139:aload_3         
	//   74  140:areturn         
	}

	public Fragment.SavedState saveFragmentInstanceState(Fragment fragment)
	{
		if(fragment.mIndex < 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1346 <Field int Fragment.mIndex>
	//*   2    4:ifge            52
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #334 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #335 <Method void StringBuilder()>
	//    6   14:astore_3        
			stringbuilder.append("Fragment ");
	//    7   15:aload_3         
	//    8   16:ldc2            #1447 <String "Fragment ">
	//    9   19:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
			stringbuilder.append(((Object) (fragment)));
	//   11   23:aload_3         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//   14   28:pop             
			stringbuilder.append(" is not currently in the FragmentManager");
	//   15   29:aload_3         
	//   16   30:ldc2            #1708 <String " is not currently in the FragmentManager">
	//   17   33:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			throwException(((RuntimeException) (new IllegalStateException(stringbuilder.toString()))));
	//   19   37:aload_0         
	//   20   38:new             #343 <Class IllegalStateException>
	//   21   41:dup             
	//   22   42:aload_3         
	//   23   43:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   24   46:invokespecial   #350 <Method void IllegalStateException(String)>
	//   25   49:invokespecial   #1275 <Method void throwException(RuntimeException)>
		}
		int i = fragment.mState;
	//   26   52:aload_1         
	//   27   53:getfield        #207 <Field int Fragment.mState>
	//   28   56:istore_2        
		Object obj = null;
	//   29   57:aconst_null     
	//   30   58:astore_3        
		if(i > 0)
	//*  31   59:iload_2         
	//*  32   60:ifle            89
		{
			Bundle bundle = saveFragmentBasicState(fragment);
	//   33   63:aload_0         
	//   34   64:aload_1         
	//   35   65:invokevirtual   #1818 <Method Bundle saveFragmentBasicState(Fragment)>
	//   36   68:astore          4
			fragment = ((Fragment) (obj));
	//   37   70:aload_3         
	//   38   71:astore_1        
			if(bundle != null)
	//*  39   72:aload           4
	//*  40   74:ifnull          87
				fragment = ((Fragment) (new Fragment.SavedState(bundle)));
	//   41   77:new             #1855 <Class Fragment$SavedState>
	//   42   80:dup             
	//   43   81:aload           4
	//   44   83:invokespecial   #1857 <Method void Fragment$SavedState(Bundle)>
	//   45   86:astore_1        
			return ((Fragment.SavedState) (fragment));
	//   46   87:aload_1         
	//   47   88:areturn         
		} else
		{
			return null;
	//   48   89:aconst_null     
	//   49   90:areturn         
		}
	}

	void saveFragmentViewState(Fragment fragment)
	{
		if(fragment.mInnerView == null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1220 <Field View Fragment.mInnerView>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		SparseArray sparsearray = mStateArray;
	//    4    8:aload_0         
	//    5    9:getfield        #181 <Field SparseArray mStateArray>
	//    6   12:astore_2        
		if(sparsearray == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       31
			mStateArray = new SparseArray();
	//    9   17:aload_0         
	//   10   18:new             #314 <Class SparseArray>
	//   11   21:dup             
	//   12   22:invokespecial   #1351 <Method void SparseArray()>
	//   13   25:putfield        #181 <Field SparseArray mStateArray>
		else
	//*  14   28:goto            35
			sparsearray.clear();
	//   15   31:aload_2         
	//   16   32:invokevirtual   #1858 <Method void SparseArray.clear()>
		fragment.mInnerView.saveHierarchyState(mStateArray);
	//   17   35:aload_1         
	//   18   36:getfield        #1220 <Field View Fragment.mInnerView>
	//   19   39:aload_0         
	//   20   40:getfield        #181 <Field SparseArray mStateArray>
	//   21   43:invokevirtual   #1862 <Method void View.saveHierarchyState(SparseArray)>
		if(mStateArray.size() > 0)
	//*  22   46:aload_0         
	//*  23   47:getfield        #181 <Field SparseArray mStateArray>
	//*  24   50:invokevirtual   #315 <Method int SparseArray.size()>
	//*  25   53:ifle            69
		{
			fragment.mSavedViewState = mStateArray;
	//   26   56:aload_1         
	//   27   57:aload_0         
	//   28   58:getfield        #181 <Field SparseArray mStateArray>
	//   29   61:putfield        #1411 <Field SparseArray Fragment.mSavedViewState>
			mStateArray = null;
	//   30   64:aload_0         
	//   31   65:aconst_null     
	//   32   66:putfield        #181 <Field SparseArray mStateArray>
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
	//*   1    1:getfield        #312 <Field SparseArray mActive>
	//*   2    4:ifnull          400
		{
			int i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
			Object obj = null;
	//    5    9:aconst_null     
	//    6   10:astore_3        
			ArrayList arraylist2 = ((ArrayList) (obj));
	//    7   11:aload_3         
	//    8   12:astore          5
			ArrayList arraylist1 = arraylist2;
	//    9   14:aload           5
	//   10   16:astore          4
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
	//   19   31:getfield        #312 <Field SparseArray mActive>
	//   20   34:invokevirtual   #315 <Method int SparseArray.size()>
	//   21   37:icmpge          412
				Fragment fragment = (Fragment)mActive.valueAt(i);
	//   22   40:aload_0         
	//   23   41:getfield        #312 <Field SparseArray mActive>
	//   24   44:iload_1         
	//   25   45:invokevirtual   #318 <Method Object SparseArray.valueAt(int)>
	//   26   48:checkcast       #204 <Class Fragment>
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
	//*  35   66:ifnull          382
				{
					obj1 = obj;
	//   36   69:aload_3         
	//   37   70:astore          6
					if(fragment.mRetainInstance)
	//*  38   72:aload           10
	//*  39   74:getfield        #1865 <Field boolean Fragment.mRetainInstance>
	//*  40   77:ifeq            179
					{
						obj2 = obj;
	//   41   80:aload_3         
	//   42   81:astore          7
						if(obj == null)
	//*  43   83:aload_3         
	//*  44   84:ifnonnull       96
							obj2 = ((Object) (new ArrayList()));
	//   45   87:new             #167 <Class ArrayList>
	//   46   90:dup             
	//   47   91:invokespecial   #168 <Method void ArrayList()>
	//   48   94:astore          7
						((ArrayList) (obj2)).add(((Object) (fragment)));
	//   49   96:aload           7
	//   50   98:aload           10
	//   51  100:invokevirtual   #705 <Method boolean ArrayList.add(Object)>
	//   52  103:pop             
						int j;
						if(fragment.mTarget != null)
	//*  53  104:aload           10
	//*  54  106:getfield        #1416 <Field Fragment Fragment.mTarget>
	//*  55  109:ifnull          124
							j = fragment.mTarget.mIndex;
	//   56  112:aload           10
	//   57  114:getfield        #1416 <Field Fragment Fragment.mTarget>
	//   58  117:getfield        #1346 <Field int Fragment.mIndex>
	//   59  120:istore_2        
						else
	//*  60  121:goto            126
							j = -1;
	//   61  124:iconst_m1       
	//   62  125:istore_2        
						fragment.mTargetIndex = j;
	//   63  126:aload           10
	//   64  128:iload_2         
	//   65  129:putfield        #1762 <Field int Fragment.mTargetIndex>
						obj1 = obj2;
	//   66  132:aload           7
	//   67  134:astore          6
						if(DEBUG)
	//*  68  136:getstatic       #818 <Field boolean DEBUG>
	//*  69  139:ifeq            179
						{
							obj = ((Object) (new StringBuilder()));
	//   70  142:new             #334 <Class StringBuilder>
	//   71  145:dup             
	//   72  146:invokespecial   #335 <Method void StringBuilder()>
	//   73  149:astore_3        
							((StringBuilder) (obj)).append("retainNonConfig: keeping retained ");
	//   74  150:aload_3         
	//   75  151:ldc2            #1867 <String "retainNonConfig: keeping retained ">
	//   76  154:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   77  157:pop             
							((StringBuilder) (obj)).append(((Object) (fragment)));
	//   78  158:aload_3         
	//   79  159:aload           10
	//   80  161:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//   81  164:pop             
							Log.v("FragmentManager", ((StringBuilder) (obj)).toString());
	//   82  165:ldc1            #75  <String "FragmentManager">
	//   83  167:aload_3         
	//   84  168:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   85  171:invokestatic    #826 <Method int Log.v(String, String)>
	//   86  174:pop             
							obj1 = obj2;
	//   87  175:aload           7
	//   88  177:astore          6
						}
					}
					if(fragment.mChildFragmentManager != null)
	//*  89  179:aload           10
	//*  90  181:getfield        #1438 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
	//*  91  184:ifnull          208
					{
						fragment.mChildFragmentManager.saveNonConfig();
	//   92  187:aload           10
	//   93  189:getfield        #1438 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
	//   94  192:invokevirtual   #1839 <Method void saveNonConfig()>
						obj2 = ((Object) (fragment.mChildFragmentManager.mSavedNonConfig));
	//   95  195:aload           10
	//   96  197:getfield        #1438 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
	//   97  200:getfield        #1598 <Field FragmentManagerNonConfig mSavedNonConfig>
	//   98  203:astore          7
					} else
	//*  99  205:goto            215
					{
						obj2 = ((Object) (fragment.mChildNonConfig));
	//  100  208:aload           10
	//  101  210:getfield        #1870 <Field FragmentManagerNonConfig Fragment.mChildNonConfig>
	//  102  213:astore          7
					}
					obj = ((Object) (arraylist2));
	//  103  215:aload           5
	//  104  217:astore_3        
					if(arraylist2 == null)
	//* 105  218:aload           5
	//* 106  220:ifnonnull       271
					{
						obj = ((Object) (arraylist2));
	//  107  223:aload           5
	//  108  225:astore_3        
						if(obj2 != null)
	//* 109  226:aload           7
	//* 110  228:ifnull          271
						{
							arraylist2 = new ArrayList(mActive.size());
	//  111  231:new             #167 <Class ArrayList>
	//  112  234:dup             
	//  113  235:aload_0         
	//  114  236:getfield        #312 <Field SparseArray mActive>
	//  115  239:invokevirtual   #315 <Method int SparseArray.size()>
	//  116  242:invokespecial   #904 <Method void ArrayList(int)>
	//  117  245:astore          5
							int k = 0;
	//  118  247:iconst_0        
	//  119  248:istore_2        
							do
							{
								obj = ((Object) (arraylist2));
	//  120  249:aload           5
	//  121  251:astore_3        
								if(k >= i)
									break;
	//  122  252:iload_2         
	//  123  253:iload_1         
	//  124  254:icmpge          271
								arraylist2.add(((Object) (null)));
	//  125  257:aload           5
	//  126  259:aconst_null     
	//  127  260:invokevirtual   #705 <Method boolean ArrayList.add(Object)>
	//  128  263:pop             
								k++;
	//  129  264:iload_2         
	//  130  265:iconst_1        
	//  131  266:iadd            
	//  132  267:istore_2        
							} while(true);
	//  133  268:goto            249
						}
					}
					if(obj != null)
	//* 134  271:aload_3         
	//* 135  272:ifnull          282
						((ArrayList) (obj)).add(obj2);
	//  136  275:aload_3         
	//  137  276:aload           7
	//  138  278:invokevirtual   #705 <Method boolean ArrayList.add(Object)>
	//  139  281:pop             
					arraylist2 = arraylist1;
	//  140  282:aload           4
	//  141  284:astore          5
					if(arraylist1 == null)
	//* 142  286:aload           4
	//* 143  288:ifnonnull       344
					{
						arraylist2 = arraylist1;
	//  144  291:aload           4
	//  145  293:astore          5
						if(fragment.mViewModelStore != null)
	//* 146  295:aload           10
	//* 147  297:getfield        #1874 <Field ViewModelStore Fragment.mViewModelStore>
	//* 148  300:ifnull          344
						{
							arraylist1 = new ArrayList(mActive.size());
	//  149  303:new             #167 <Class ArrayList>
	//  150  306:dup             
	//  151  307:aload_0         
	//  152  308:getfield        #312 <Field SparseArray mActive>
	//  153  311:invokevirtual   #315 <Method int SparseArray.size()>
	//  154  314:invokespecial   #904 <Method void ArrayList(int)>
	//  155  317:astore          4
							int l = 0;
	//  156  319:iconst_0        
	//  157  320:istore_2        
							do
							{
								arraylist2 = arraylist1;
	//  158  321:aload           4
	//  159  323:astore          5
								if(l >= i)
									break;
	//  160  325:iload_2         
	//  161  326:iload_1         
	//  162  327:icmpge          344
								arraylist1.add(((Object) (null)));
	//  163  330:aload           4
	//  164  332:aconst_null     
	//  165  333:invokevirtual   #705 <Method boolean ArrayList.add(Object)>
	//  166  336:pop             
								l++;
	//  167  337:iload_2         
	//  168  338:iconst_1        
	//  169  339:iadd            
	//  170  340:istore_2        
							} while(true);
	//  171  341:goto            321
						}
					}
					obj2 = obj1;
	//  172  344:aload           6
	//  173  346:astore          7
					arraylist3 = ((ArrayList) (obj));
	//  174  348:aload_3         
	//  175  349:astore          8
					arraylist4 = arraylist2;
	//  176  351:aload           5
	//  177  353:astore          9
					if(arraylist2 != null)
	//* 178  355:aload           5
	//* 179  357:ifnull          382
					{
						arraylist2.add(((Object) (fragment.mViewModelStore)));
	//  180  360:aload           5
	//  181  362:aload           10
	//  182  364:getfield        #1874 <Field ViewModelStore Fragment.mViewModelStore>
	//  183  367:invokevirtual   #705 <Method boolean ArrayList.add(Object)>
	//  184  370:pop             
						arraylist4 = arraylist2;
	//  185  371:aload           5
	//  186  373:astore          9
						arraylist3 = ((ArrayList) (obj));
	//  187  375:aload_3         
	//  188  376:astore          8
						obj2 = obj1;
	//  189  378:aload           6
	//  190  380:astore          7
					}
				}
				i++;
	//  191  382:iload_1         
	//  192  383:iconst_1        
	//  193  384:iadd            
	//  194  385:istore_1        
				obj = obj2;
	//  195  386:aload           7
	//  196  388:astore_3        
				arraylist2 = arraylist3;
	//  197  389:aload           8
	//  198  391:astore          5
				arraylist1 = arraylist4;
	//  199  393:aload           9
	//  200  395:astore          4
			} while(true);
	//  201  397:goto            18
		} else
		{
			arraylist3 = null;
	//  202  400:aconst_null     
	//  203  401:astore          8
			ArrayList arraylist = arraylist3;
	//  204  403:aload           8
	//  205  405:astore_3        
			obj1 = ((Object) (arraylist));
	//  206  406:aload_3         
	//  207  407:astore          6
			obj2 = ((Object) (arraylist));
	//  208  409:aload_3         
	//  209  410:astore          7
		}
		if(arraylist3 == null && obj2 == null && obj1 == null)
	//* 210  412:aload           8
	//* 211  414:ifnonnull       433
	//* 212  417:aload           7
	//* 213  419:ifnonnull       433
	//* 214  422:aload           6
	//* 215  424:ifnonnull       433
		{
			mSavedNonConfig = null;
	//  216  427:aload_0         
	//  217  428:aconst_null     
	//  218  429:putfield        #1598 <Field FragmentManagerNonConfig mSavedNonConfig>
			return;
	//  219  432:return          
		} else
		{
			mSavedNonConfig = new FragmentManagerNonConfig(((List) (arraylist3)), ((List) (obj2)), ((List) (obj1)));
	//  220  433:aload_0         
	//  221  434:new             #735 <Class FragmentManagerNonConfig>
	//  222  437:dup             
	//  223  438:aload           8
	//  224  440:aload           7
	//  225  442:aload           6
	//  226  444:invokespecial   #1877 <Method void FragmentManagerNonConfig(List, List, List)>
	//  227  447:putfield        #1598 <Field FragmentManagerNonConfig mSavedNonConfig>
			return;
	//  228  450:return          
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
	//    3    3:getfield        #501 <Field ArrayList mPostponedTransactions>
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
	//   10   16:getfield        #501 <Field ArrayList mPostponedTransactions>
	//   11   19:invokevirtual   #535 <Method boolean ArrayList.isEmpty()>
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
	//   19   33:getfield        #539 <Field ArrayList mPendingActions>
	//   20   36:ifnull          101
_L4:
		flag1 = flag2;
	//   21   39:iload_3         
	//   22   40:istore_2        
		if(mPendingActions.size() == 1)
	//*  23   41:aload_0         
	//*  24   42:getfield        #539 <Field ArrayList mPendingActions>
	//*  25   45:invokevirtual   #198 <Method int ArrayList.size()>
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
	//   32   58:getfield        #398 <Field FragmentHostCallback mHost>
	//   33   61:invokevirtual   #410 <Method Handler FragmentHostCallback.getHandler()>
	//   34   64:aload_0         
	//   35   65:getfield        #186 <Field Runnable mExecCommit>
	//   36   68:invokevirtual   #546 <Method void Handler.removeCallbacks(Runnable)>
		mHost.getHandler().post(mExecCommit);
	//   37   71:aload_0         
	//   38   72:getfield        #398 <Field FragmentHostCallback mHost>
	//   39   75:invokevirtual   #410 <Method Handler FragmentHostCallback.getHandler()>
	//   40   78:aload_0         
	//   41   79:getfield        #186 <Field Runnable mExecCommit>
	//   42   82:invokevirtual   #1881 <Method boolean Handler.post(Runnable)>
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
	//*   3    3:getfield        #876 <Field ArrayList mBackStackIndices>
	//*   4    6:ifnonnull       20
			mBackStackIndices = new ArrayList();
	//    5    9:aload_0         
	//    6   10:new             #167 <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #168 <Method void ArrayList()>
	//    9   17:putfield        #876 <Field ArrayList mBackStackIndices>
		k = mBackStackIndices.size();
	//   10   20:aload_0         
	//   11   21:getfield        #876 <Field ArrayList mBackStackIndices>
	//   12   24:invokevirtual   #198 <Method int ArrayList.size()>
	//   13   27:istore          4
		int j;
		j = k;
	//   14   29:iload           4
	//   15   31:istore_3        
		if(i >= k)
			break MISSING_BLOCK_LABEL_109;
	//   16   32:iload_1         
	//   17   33:iload           4
	//   18   35:icmpge          109
		if(DEBUG)
	//*  19   38:getstatic       #818 <Field boolean DEBUG>
	//*  20   41:ifeq            96
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   21   44:new             #334 <Class StringBuilder>
	//   22   47:dup             
	//   23   48:invokespecial   #335 <Method void StringBuilder()>
	//   24   51:astore          5
			stringbuilder.append("Setting back stack index ");
	//   25   53:aload           5
	//   26   55:ldc2            #882 <String "Setting back stack index ">
	//   27   58:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   28   61:pop             
			stringbuilder.append(i);
	//   29   62:aload           5
	//   30   64:iload_1         
	//   31   65:invokevirtual   #872 <Method StringBuilder StringBuilder.append(int)>
	//   32   68:pop             
			stringbuilder.append(" to ");
	//   33   69:aload           5
	//   34   71:ldc2            #884 <String " to ">
	//   35   74:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   36   77:pop             
			stringbuilder.append(((Object) (backstackrecord)));
	//   37   78:aload           5
	//   38   80:aload_2         
	//   39   81:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//   40   84:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   41   85:ldc1            #75  <String "FragmentManager">
	//   42   87:aload           5
	//   43   89:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   44   92:invokestatic    #826 <Method int Log.v(String, String)>
	//   45   95:pop             
		}
		mBackStackIndices.set(i, ((Object) (backstackrecord)));
	//   46   96:aload_0         
	//   47   97:getfield        #876 <Field ArrayList mBackStackIndices>
	//   48  100:iload_1         
	//   49  101:aload_2         
	//   50  102:invokevirtual   #880 <Method Object ArrayList.set(int, Object)>
	//   51  105:pop             
		break MISSING_BLOCK_LABEL_269;
	//   52  106:goto            269
_L2:
		if(j >= i)
			break; /* Loop/switch isn't completed */
	//   53  109:iload_3         
	//   54  110:iload_1         
	//   55  111:icmpge          202
		mBackStackIndices.add(((Object) (null)));
	//   56  114:aload_0         
	//   57  115:getfield        #876 <Field ArrayList mBackStackIndices>
	//   58  118:aconst_null     
	//   59  119:invokevirtual   #705 <Method boolean ArrayList.add(Object)>
	//   60  122:pop             
		if(mAvailBackStackIndices == null)
	//*  61  123:aload_0         
	//*  62  124:getfield        #862 <Field ArrayList mAvailBackStackIndices>
	//*  63  127:ifnonnull       141
			mAvailBackStackIndices = new ArrayList();
	//   64  130:aload_0         
	//   65  131:new             #167 <Class ArrayList>
	//   66  134:dup             
	//   67  135:invokespecial   #168 <Method void ArrayList()>
	//   68  138:putfield        #862 <Field ArrayList mAvailBackStackIndices>
		if(DEBUG)
	//*  69  141:getstatic       #818 <Field boolean DEBUG>
	//*  70  144:ifeq            183
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   71  147:new             #334 <Class StringBuilder>
	//   72  150:dup             
	//   73  151:invokespecial   #335 <Method void StringBuilder()>
	//   74  154:astore          5
			stringbuilder1.append("Adding available back stack index ");
	//   75  156:aload           5
	//   76  158:ldc2            #1883 <String "Adding available back stack index ">
	//   77  161:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   78  164:pop             
			stringbuilder1.append(j);
	//   79  165:aload           5
	//   80  167:iload_3         
	//   81  168:invokevirtual   #872 <Method StringBuilder StringBuilder.append(int)>
	//   82  171:pop             
			Log.v("FragmentManager", stringbuilder1.toString());
	//   83  172:ldc1            #75  <String "FragmentManager">
	//   84  174:aload           5
	//   85  176:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   86  179:invokestatic    #826 <Method int Log.v(String, String)>
	//   87  182:pop             
		}
		mAvailBackStackIndices.add(((Object) (Integer.valueOf(j))));
	//   88  183:aload_0         
	//   89  184:getfield        #862 <Field ArrayList mAvailBackStackIndices>
	//   90  187:iload_3         
	//   91  188:invokestatic    #1252 <Method Integer Integer.valueOf(int)>
	//   92  191:invokevirtual   #705 <Method boolean ArrayList.add(Object)>
	//   93  194:pop             
		j++;
	//   94  195:iload_3         
	//   95  196:iconst_1        
	//   96  197:iadd            
	//   97  198:istore_3        
		if(true) goto _L2; else goto _L1
	//   98  199:goto            109
_L1:
		if(DEBUG)
	//*  99  202:getstatic       #818 <Field boolean DEBUG>
	//* 100  205:ifeq            260
		{
			StringBuilder stringbuilder2 = new StringBuilder();
	//  101  208:new             #334 <Class StringBuilder>
	//  102  211:dup             
	//  103  212:invokespecial   #335 <Method void StringBuilder()>
	//  104  215:astore          5
			stringbuilder2.append("Adding back stack index ");
	//  105  217:aload           5
	//  106  219:ldc2            #869 <String "Adding back stack index ">
	//  107  222:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  108  225:pop             
			stringbuilder2.append(i);
	//  109  226:aload           5
	//  110  228:iload_1         
	//  111  229:invokevirtual   #872 <Method StringBuilder StringBuilder.append(int)>
	//  112  232:pop             
			stringbuilder2.append(" with ");
	//  113  233:aload           5
	//  114  235:ldc2            #874 <String " with ">
	//  115  238:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  116  241:pop             
			stringbuilder2.append(((Object) (backstackrecord)));
	//  117  242:aload           5
	//  118  244:aload_2         
	//  119  245:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//  120  248:pop             
			Log.v("FragmentManager", stringbuilder2.toString());
	//  121  249:ldc1            #75  <String "FragmentManager">
	//  122  251:aload           5
	//  123  253:invokevirtual   #347 <Method String StringBuilder.toString()>
	//  124  256:invokestatic    #826 <Method int Log.v(String, String)>
	//  125  259:pop             
		}
		mBackStackIndices.add(((Object) (backstackrecord)));
	//  126  260:aload_0         
	//  127  261:getfield        #876 <Field ArrayList mBackStackIndices>
	//  128  264:aload_2         
	//  129  265:invokevirtual   #705 <Method boolean ArrayList.add(Object)>
	//  130  268:pop             
		this;
	//  131  269:aload_0         
		JVM INSTR monitorexit ;
	//  132  270:monitorexit     
		return;
	//  133  271:return          
		backstackrecord;
	//  134  272:astore_2        
		this;
	//  135  273:aload_0         
		JVM INSTR monitorexit ;
	//  136  274:monitorexit     
		throw backstackrecord;
	//  137  275:aload_2         
	//  138  276:athrow          
	}

	public void setPrimaryNavigationFragment(Fragment fragment)
	{
		if(fragment != null && (mActive.get(fragment.mIndex) != fragment || fragment.mHost != null && fragment.getFragmentManager() != this))
	//*   0    0:aload_1         
	//*   1    1:ifnull          85
	//*   2    4:aload_0         
	//*   3    5:getfield        #312 <Field SparseArray mActive>
	//*   4    8:aload_1         
	//*   5    9:getfield        #1346 <Field int Fragment.mIndex>
	//*   6   12:invokevirtual   #1269 <Method Object SparseArray.get(int)>
	//*   7   15:aload_1         
	//*   8   16:if_acmpne       37
	//*   9   19:aload_1         
	//*  10   20:getfield        #1431 <Field FragmentHostCallback Fragment.mHost>
	//*  11   23:ifnull          85
	//*  12   26:aload_1         
	//*  13   27:invokevirtual   #986 <Method FragmentManager Fragment.getFragmentManager()>
	//*  14   30:aload_0         
	//*  15   31:if_acmpne       37
	//*  16   34:goto            85
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   17   37:new             #334 <Class StringBuilder>
	//   18   40:dup             
	//   19   41:invokespecial   #335 <Method void StringBuilder()>
	//   20   44:astore_2        
			stringbuilder.append("Fragment ");
	//   21   45:aload_2         
	//   22   46:ldc2            #1447 <String "Fragment ">
	//   23   49:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   24   52:pop             
			stringbuilder.append(((Object) (fragment)));
	//   25   53:aload_2         
	//   26   54:aload_1         
	//   27   55:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//   28   58:pop             
			stringbuilder.append(" is not an active fragment of FragmentManager ");
	//   29   59:aload_2         
	//   30   60:ldc2            #1886 <String " is not an active fragment of FragmentManager ">
	//   31   63:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   32   66:pop             
			stringbuilder.append(((Object) (this)));
	//   33   67:aload_2         
	//   34   68:aload_0         
	//   35   69:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//   36   72:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   37   73:new             #1487 <Class IllegalArgumentException>
	//   38   76:dup             
	//   39   77:aload_2         
	//   40   78:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   41   81:invokespecial   #1488 <Method void IllegalArgumentException(String)>
	//   42   84:athrow          
		} else
		{
			mPrimaryNav = fragment;
	//   43   85:aload_0         
	//   44   86:aload_1         
	//   45   87:putfield        #678 <Field Fragment mPrimaryNav>
			return;
	//   46   90:return          
		}
	}

	public void showFragment(Fragment fragment)
	{
		if(DEBUG)
	//*   0    0:getstatic       #818 <Field boolean DEBUG>
	//*   1    3:ifeq            38
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #334 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #335 <Method void StringBuilder()>
	//    5   13:astore_2        
			stringbuilder.append("show: ");
	//    6   14:aload_2         
	//    7   15:ldc2            #1889 <String "show: ">
	//    8   18:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (fragment)));
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #823 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   14   28:ldc1            #75  <String "FragmentManager">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #826 <Method int Log.v(String, String)>
	//   18   37:pop             
		}
		if(fragment.mHidden)
	//*  19   38:aload_1         
	//*  20   39:getfield        #224 <Field boolean Fragment.mHidden>
	//*  21   42:ifeq            60
		{
			fragment.mHidden = false;
	//   22   45:aload_1         
	//   23   46:iconst_0        
	//   24   47:putfield        #224 <Field boolean Fragment.mHidden>
			fragment.mHiddenChanged = fragment.mHiddenChanged ^ true;
	//   25   50:aload_1         
	//   26   51:aload_1         
	//   27   52:getfield        #842 <Field boolean Fragment.mHiddenChanged>
	//   28   55:iconst_1        
	//   29   56:ixor            
	//   30   57:putfield        #842 <Field boolean Fragment.mHiddenChanged>
		}
	//   31   60:return          
	}

	void startPendingDeferredFragments()
	{
		if(mActive == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #312 <Field SparseArray mActive>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		for(int i = 0; i < mActive.size(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:getfield        #312 <Field SparseArray mActive>
	//*   9   15:invokevirtual   #315 <Method int SparseArray.size()>
	//*  10   18:icmpge          49
		{
			Fragment fragment = (Fragment)mActive.valueAt(i);
	//   11   21:aload_0         
	//   12   22:getfield        #312 <Field SparseArray mActive>
	//   13   25:iload_1         
	//   14   26:invokevirtual   #318 <Method Object SparseArray.valueAt(int)>
	//   15   29:checkcast       #204 <Class Fragment>
	//   16   32:astore_2        
			if(fragment != null)
	//*  17   33:aload_2         
	//*  18   34:ifnull          42
				performPendingDeferredStart(fragment);
	//   19   37:aload_0         
	//   20   38:aload_2         
	//   21   39:invokevirtual   #1891 <Method void performPendingDeferredStart(Fragment)>
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
	//    0    0:new             #334 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          128
	//    3    7:invokespecial   #1892 <Method void StringBuilder(int)>
	//    4   10:astore_1        
		stringbuilder.append("FragmentManager{");
	//    5   11:aload_1         
	//    6   12:ldc2            #1894 <String "FragmentManager{">
	//    7   15:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:invokestatic    #1124 <Method int System.identityHashCode(Object)>
	//   12   24:invokestatic    #1128 <Method String Integer.toHexString(int)>
	//   13   27:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
		stringbuilder.append(" in ");
	//   15   31:aload_1         
	//   16   32:ldc2            #1896 <String " in ">
	//   17   35:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
		Fragment fragment = mParent;
	//   19   39:aload_0         
	//   20   40:getfield        #890 <Field Fragment mParent>
	//   21   43:astore_2        
		if(fragment != null)
	//*  22   44:aload_2         
	//*  23   45:ifnull          56
			DebugUtils.buildShortClassTag(((Object) (fragment)), stringbuilder);
	//   24   48:aload_2         
	//   25   49:aload_1         
	//   26   50:invokestatic    #1902 <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
		else
	//*  27   53:goto            64
			DebugUtils.buildShortClassTag(((Object) (mHost)), stringbuilder);
	//   28   56:aload_0         
	//   29   57:getfield        #398 <Field FragmentHostCallback mHost>
	//   30   60:aload_1         
	//   31   61:invokestatic    #1902 <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
		stringbuilder.append("}}");
	//   32   64:aload_1         
	//   33   65:ldc2            #1904 <String "}}">
	//   34   68:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   35   71:pop             
		return stringbuilder.toString();
	//   36   72:aload_1         
	//   37   73:invokevirtual   #347 <Method String StringBuilder.toString()>
	//   38   76:areturn         
	}

	public void unregisterFragmentLifecycleCallbacks(FragmentManager.FragmentLifecycleCallbacks fragmentlifecyclecallbacks)
	{
		CopyOnWriteArrayList copyonwritearraylist = mLifecycleCallbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//    2    4:astore          4
		copyonwritearraylist;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		int i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		int j = mLifecycleCallbacks.size();
	//    7   11:aload_0         
	//    8   12:getfield        #175 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//    9   15:invokevirtual   #1907 <Method int CopyOnWriteArrayList.size()>
	//   10   18:istore_3        
_L2:
		if(i >= j)
			break MISSING_BLOCK_LABEL_54;
	//   11   19:iload_2         
	//   12   20:iload_3         
	//   13   21:icmpge          54
		if(((FragmentLifecycleCallbacksHolder)mLifecycleCallbacks.get(i)).mCallback != fragmentlifecyclecallbacks)
			break MISSING_BLOCK_LABEL_64;
	//   14   24:aload_0         
	//   15   25:getfield        #175 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   16   28:iload_2         
	//   17   29:invokevirtual   #1908 <Method Object CopyOnWriteArrayList.get(int)>
	//   18   32:checkcast       #35  <Class FragmentManagerImpl$FragmentLifecycleCallbacksHolder>
	//   19   35:getfield        #996 <Field FragmentManager$FragmentLifecycleCallbacks FragmentManagerImpl$FragmentLifecycleCallbacksHolder.mCallback>
	//   20   38:aload_1         
	//   21   39:if_acmpne       64
		mLifecycleCallbacks.remove(i);
	//   22   42:aload_0         
	//   23   43:getfield        #175 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   24   46:iload_2         
	//   25   47:invokevirtual   #1909 <Method Object CopyOnWriteArrayList.remove(int)>
	//   26   50:pop             
	//*  27   51:goto            54
		copyonwritearraylist;
	//   28   54:aload           4
		JVM INSTR monitorexit ;
	//   29   56:monitorexit     
		return;
	//   30   57:return          
		fragmentlifecyclecallbacks;
	//   31   58:astore_1        
		copyonwritearraylist;
	//   32   59:aload           4
		JVM INSTR monitorexit ;
	//   33   61:monitorexit     
		throw fragmentlifecyclecallbacks;
	//   34   62:aload_1         
	//   35   63:athrow          
		i++;
	//   36   64:iload_2         
	//   37   65:iconst_1        
	//   38   66:iadd            
	//   39   67:istore_2        
		if(true) goto _L2; else goto _L1
	//   40   68:goto            19
_L1:
	}

	static final Interpolator ACCELERATE_CUBIC = new AccelerateInterpolator(1.5F);
	static final Interpolator ACCELERATE_QUINT = new AccelerateInterpolator(2.5F);
	static final int ANIM_DUR = 220;
	public static final int ANIM_STYLE_CLOSE_ENTER = 3;
	public static final int ANIM_STYLE_CLOSE_EXIT = 4;
	public static final int ANIM_STYLE_FADE_ENTER = 5;
	public static final int ANIM_STYLE_FADE_EXIT = 6;
	public static final int ANIM_STYLE_OPEN_ENTER = 1;
	public static final int ANIM_STYLE_OPEN_EXIT = 2;
	static boolean DEBUG = false;
	static final Interpolator DECELERATE_CUBIC = new DecelerateInterpolator(1.5F);
	static final Interpolator DECELERATE_QUINT = new DecelerateInterpolator(2.5F);
	static final String TAG = "FragmentManager";
	static final String TARGET_REQUEST_CODE_STATE_TAG = "android:target_req_state";
	static final String TARGET_STATE_TAG = "android:target_state";
	static final String USER_VISIBLE_HINT_TAG = "android:user_visible_hint";
	static final String VIEW_STATE_TAG = "android:view_state";
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
	//    0    0:new             #143 <Class DecelerateInterpolator>
	//    1    3:dup             
	//    2    4:ldc1            #144 <Float 2.5F>
	//    3    6:invokespecial   #148 <Method void DecelerateInterpolator(float)>
	//    4    9:putstatic       #150 <Field Interpolator DECELERATE_QUINT>
	//    5   12:new             #143 <Class DecelerateInterpolator>
	//    6   15:dup             
	//    7   16:ldc1            #151 <Float 1.5F>
	//    8   18:invokespecial   #148 <Method void DecelerateInterpolator(float)>
	//    9   21:putstatic       #153 <Field Interpolator DECELERATE_CUBIC>
	//   10   24:new             #155 <Class AccelerateInterpolator>
	//   11   27:dup             
	//   12   28:ldc1            #144 <Float 2.5F>
	//   13   30:invokespecial   #156 <Method void AccelerateInterpolator(float)>
	//   14   33:putstatic       #158 <Field Interpolator ACCELERATE_QUINT>
	//   15   36:new             #155 <Class AccelerateInterpolator>
	//   16   39:dup             
	//   17   40:ldc1            #151 <Float 1.5F>
	//   18   42:invokespecial   #156 <Method void AccelerateInterpolator(float)>
	//   19   45:putstatic       #160 <Field Interpolator ACCELERATE_CUBIC>
	//*  20   48:return          
	}
}
