// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.animation.*;
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
//			FragmentManager, Fragment, BackStackRecord, FragmentTransition, 
//			FragmentHostCallback, FragmentManagerNonConfig, SuperNotCalledException, FragmentContainer, 
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
		//    2    2:aconst_null     
		//    3    3:invokespecial   #16  <Method void FragmentManagerImpl$AnimationListenerWrapper(android.view.animation.Animation$AnimationListener, FragmentManagerImpl$1)>
			mView = view;
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:putfield        #18  <Field View mView>
		//    7   11:return          
		}
	}

	private static class AnimationListenerWrapper
		implements android.view.animation.Animation.AnimationListener
	{

		public void onAnimationEnd(Animation animation)
		{
			if(mWrapped != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field android.view.animation.Animation$AnimationListener mWrapped>
		//*   2    4:ifnull          17
				mWrapped.onAnimationEnd(animation);
		//    3    7:aload_0         
		//    4    8:getfield        #18  <Field android.view.animation.Animation$AnimationListener mWrapped>
		//    5   11:aload_1         
		//    6   12:invokeinterface #27  <Method void android.view.animation.Animation$AnimationListener.onAnimationEnd(Animation)>
		//    7   17:return          
		}

		public void onAnimationRepeat(Animation animation)
		{
			if(mWrapped != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field android.view.animation.Animation$AnimationListener mWrapped>
		//*   2    4:ifnull          17
				mWrapped.onAnimationRepeat(animation);
		//    3    7:aload_0         
		//    4    8:getfield        #18  <Field android.view.animation.Animation$AnimationListener mWrapped>
		//    5   11:aload_1         
		//    6   12:invokeinterface #31  <Method void android.view.animation.Animation$AnimationListener.onAnimationRepeat(Animation)>
		//    7   17:return          
		}

		public void onAnimationStart(Animation animation)
		{
			if(mWrapped != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field android.view.animation.Animation$AnimationListener mWrapped>
		//*   2    4:ifnull          17
				mWrapped.onAnimationStart(animation);
		//    3    7:aload_0         
		//    4    8:getfield        #18  <Field android.view.animation.Animation$AnimationListener mWrapped>
		//    5   11:aload_1         
		//    6   12:invokeinterface #34  <Method void android.view.animation.Animation$AnimationListener.onAnimationStart(Animation)>
		//    7   17:return          
		}

		private final android.view.animation.Animation.AnimationListener mWrapped;

		private AnimationListenerWrapper(android.view.animation.Animation.AnimationListener animationlistener)
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

		private AnimationOrAnimator(Animator animator1)
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
			if(animator1 == null)
		//*   8   14:aload_1         
		//*   9   15:ifnonnull       28
				throw new IllegalStateException("Animator cannot be null");
		//   10   18:new             #22  <Class IllegalStateException>
		//   11   21:dup             
		//   12   22:ldc1            #24  <String "Animator cannot be null">
		//   13   24:invokespecial   #27  <Method void IllegalStateException(String)>
		//   14   27:athrow          
			else
				return;
		//   15   28:return          
		}


		private AnimationOrAnimator(Animation animation1)
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
			if(animation1 == null)
		//*   8   14:aload_1         
		//*   9   15:ifnonnull       28
				throw new IllegalStateException("Animation cannot be null");
		//   10   18:new             #22  <Class IllegalStateException>
		//   11   21:dup             
		//   12   22:ldc1            #34  <String "Animation cannot be null">
		//   13   24:invokespecial   #27  <Method void IllegalStateException(String)>
		//   14   27:athrow          
			else
				return;
		//   15   28:return          
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

		EndViewTransitionAnimator(Animation animation, ViewGroup viewgroup, View view)
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

		FragmentTag()
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
		//    2    4:getfield        #36  <Field FragmentManagerImpl BackStackRecord.mManager>
		//    3    7:aload_0         
		//    4    8:getfield        #24  <Field BackStackRecord mRecord>
		//    5   11:aload_0         
		//    6   12:getfield        #22  <Field boolean mIsBack>
		//    7   15:iconst_0        
		//    8   16:iconst_0        
		//    9   17:invokestatic    #40  <Method void FragmentManagerImpl.access$600(FragmentManagerImpl, BackStackRecord, boolean, boolean, boolean)>
		//   10   20:return          
		}

		public void completeTransaction()
		{
			int i = mNumPostponed;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field int mNumPostponed>
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
		//   14   22:getfield        #36  <Field FragmentManagerImpl BackStackRecord.mManager>
		//   15   25:astore          4
			for(int k = fragmentmanagerimpl.mAdded.size(); j < k; j++)
		//*  16   27:aload           4
		//*  17   29:getfield        #47  <Field ArrayList FragmentManagerImpl.mAdded>
		//*  18   32:invokevirtual   #53  <Method int ArrayList.size()>
		//*  19   35:istore_3        
		//*  20   36:iload_2         
		//*  21   37:iload_3         
		//*  22   38:icmpge          85
			{
				Fragment fragment = (Fragment)fragmentmanagerimpl.mAdded.get(j);
		//   23   41:aload           4
		//   24   43:getfield        #47  <Field ArrayList FragmentManagerImpl.mAdded>
		//   25   46:iload_2         
		//   26   47:invokevirtual   #57  <Method Object ArrayList.get(int)>
		//   27   50:checkcast       #59  <Class Fragment>
		//   28   53:astore          5
				fragment.setOnStartEnterTransitionListener(((Fragment.OnStartEnterTransitionListener) (null)));
		//   29   55:aload           5
		//   30   57:aconst_null     
		//   31   58:invokevirtual   #63  <Method void Fragment.setOnStartEnterTransitionListener(Fragment$OnStartEnterTransitionListener)>
				if(i && fragment.isPostponed())
		//*  32   61:iload_1         
		//*  33   62:ifeq            78
		//*  34   65:aload           5
		//*  35   67:invokevirtual   #67  <Method boolean Fragment.isPostponed()>
		//*  36   70:ifeq            78
					fragment.startPostponedEnterTransition();
		//   37   73:aload           5
		//   38   75:invokevirtual   #70  <Method void Fragment.startPostponedEnterTransition()>
			}

		//   39   78:iload_2         
		//   40   79:iconst_1        
		//   41   80:iadd            
		//   42   81:istore_2        
		//*  43   82:goto            36
			mRecord.mManager.completeExecute(mRecord, mIsBack, i ^ true, true);
		//   44   85:aload_0         
		//   45   86:getfield        #24  <Field BackStackRecord mRecord>
		//   46   89:getfield        #36  <Field FragmentManagerImpl BackStackRecord.mManager>
		//   47   92:aload_0         
		//   48   93:getfield        #24  <Field BackStackRecord mRecord>
		//   49   96:aload_0         
		//   50   97:getfield        #22  <Field boolean mIsBack>
		//   51  100:iload_1         
		//   52  101:iconst_1        
		//   53  102:ixor            
		//   54  103:iconst_1        
		//   55  104:invokestatic    #40  <Method void FragmentManagerImpl.access$600(FragmentManagerImpl, BackStackRecord, boolean, boolean, boolean)>
		//   56  107:return          
		}

		public boolean isReady()
		{
			return mNumPostponed == 0;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field int mNumPostponed>
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
		//    2    2:getfield        #43  <Field int mNumPostponed>
		//    3    5:iconst_1        
		//    4    6:isub            
		//    5    7:putfield        #43  <Field int mNumPostponed>
			if(mNumPostponed != 0)
		//*   6   10:aload_0         
		//*   7   11:getfield        #43  <Field int mNumPostponed>
		//*   8   14:ifeq            18
			{
				return;
		//    9   17:return          
			} else
			{
				mRecord.mManager.scheduleCommit();
		//   10   18:aload_0         
		//   11   19:getfield        #24  <Field BackStackRecord mRecord>
		//   12   22:getfield        #36  <Field FragmentManagerImpl BackStackRecord.mManager>
		//   13   25:invokestatic    #76  <Method void FragmentManagerImpl.access$500(FragmentManagerImpl)>
				return;
		//   14   28:return          
			}
		}

		public void startListening()
		{
			mNumPostponed = mNumPostponed + 1;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #43  <Field int mNumPostponed>
		//    3    5:iconst_1        
		//    4    6:iadd            
		//    5    7:putfield        #43  <Field int mNumPostponed>
		//    6   10:return          
		}

		private final boolean mIsBack;
		private int mNumPostponed;
		private final BackStackRecord mRecord;


/*
		static boolean access$300(StartEnterTransitionListener startentertransitionlistener)
		{
			return startentertransitionlistener.mIsBack;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field boolean mIsBack>
		//    2    4:ireturn         
		}

*/


/*
		static BackStackRecord access$400(StartEnterTransitionListener startentertransitionlistener)
		{
			return startentertransitionlistener.mRecord;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field BackStackRecord mRecord>
		//    2    4:areturn         
		}

*/

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
	//    1    1:invokespecial   #159 <Method void FragmentManager()>
		mNextFragmentIndex = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #161 <Field int mNextFragmentIndex>
	//    5    9:aload_0         
	//    6   10:new             #163 <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #164 <Method void ArrayList()>
	//    9   17:putfield        #166 <Field ArrayList mAdded>
	//   10   20:aload_0         
	//   11   21:new             #168 <Class CopyOnWriteArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #169 <Method void CopyOnWriteArrayList()>
	//   14   28:putfield        #171 <Field CopyOnWriteArrayList mLifecycleCallbacks>
		mCurState = 0;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #173 <Field int mCurState>
		mStateBundle = null;
	//   18   36:aload_0         
	//   19   37:aconst_null     
	//   20   38:putfield        #175 <Field Bundle mStateBundle>
		mStateArray = null;
	//   21   41:aload_0         
	//   22   42:aconst_null     
	//   23   43:putfield        #177 <Field SparseArray mStateArray>
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
	//   28   52:invokespecial   #180 <Method void FragmentManagerImpl$1(FragmentManagerImpl)>
	//   29   55:putfield        #182 <Field Runnable mExecCommit>
	//   30   58:return          
	}

	private void addAddedFragments(ArraySet arrayset)
	{
		if(mCurState < 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #173 <Field int mCurState>
	//*   2    4:iconst_1        
	//*   3    5:icmpge          9
			return;
	//    4    8:return          
		int j = Math.min(mCurState, 4);
	//    5    9:aload_0         
	//    6   10:getfield        #173 <Field int mCurState>
	//    7   13:iconst_4        
	//    8   14:invokestatic    #200 <Method int Math.min(int, int)>
	//    9   17:istore_3        
		int k = mAdded.size();
	//   10   18:aload_0         
	//   11   19:getfield        #166 <Field ArrayList mAdded>
	//   12   22:invokevirtual   #204 <Method int ArrayList.size()>
	//   13   25:istore          4
		for(int i = 0; i < k; i++)
	//*  14   27:iconst_0        
	//*  15   28:istore_2        
	//*  16   29:iload_2         
	//*  17   30:iload           4
	//*  18   32:icmpge          113
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//   19   35:aload_0         
	//   20   36:getfield        #166 <Field ArrayList mAdded>
	//   21   39:iload_2         
	//   22   40:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//   23   43:checkcast       #210 <Class Fragment>
	//   24   46:astore          5
			if(fragment.mState >= j)
				continue;
	//   25   48:aload           5
	//   26   50:getfield        #213 <Field int Fragment.mState>
	//   27   53:iload_3         
	//   28   54:icmpge          106
			moveToState(fragment, j, fragment.getNextAnim(), fragment.getNextTransition(), false);
	//   29   57:aload_0         
	//   30   58:aload           5
	//   31   60:iload_3         
	//   32   61:aload           5
	//   33   63:invokevirtual   #216 <Method int Fragment.getNextAnim()>
	//   34   66:aload           5
	//   35   68:invokevirtual   #219 <Method int Fragment.getNextTransition()>
	//   36   71:iconst_0        
	//   37   72:invokevirtual   #223 <Method void moveToState(Fragment, int, int, int, boolean)>
			if(fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded)
	//*  38   75:aload           5
	//*  39   77:getfield        #227 <Field View Fragment.mView>
	//*  40   80:ifnull          106
	//*  41   83:aload           5
	//*  42   85:getfield        #230 <Field boolean Fragment.mHidden>
	//*  43   88:ifne            106
	//*  44   91:aload           5
	//*  45   93:getfield        #233 <Field boolean Fragment.mIsNewlyAdded>
	//*  46   96:ifeq            106
				arrayset.add(((Object) (fragment)));
	//   47   99:aload_1         
	//   48  100:aload           5
	//   49  102:invokevirtual   #239 <Method boolean ArraySet.add(Object)>
	//   50  105:pop             
		}

	//   51  106:iload_2         
	//   52  107:iconst_1        
	//   53  108:iadd            
	//   54  109:istore_2        
	//*  55  110:goto            29
	//   56  113:return          
	}

	private void animateRemoveFragment(final Fragment fragment, AnimationOrAnimator animationoranimator, int i)
	{
		final View viewToAnimate = fragment.mView;
	//    0    0:aload_1         
	//    1    1:getfield        #227 <Field View Fragment.mView>
	//    2    4:astore          4
		final ViewGroup container = fragment.mContainer;
	//    3    6:aload_1         
	//    4    7:getfield        #247 <Field ViewGroup Fragment.mContainer>
	//    5   10:astore          5
		container.startViewTransition(viewToAnimate);
	//    6   12:aload           5
	//    7   14:aload           4
	//    8   16:invokevirtual   #253 <Method void ViewGroup.startViewTransition(View)>
		fragment.setStateAfterAnimating(i);
	//    9   19:aload_1         
	//   10   20:iload_3         
	//   11   21:invokevirtual   #257 <Method void Fragment.setStateAfterAnimating(int)>
		if(animationoranimator.animation != null)
	//*  12   24:aload_2         
	//*  13   25:getfield        #261 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//*  14   28:ifnull          93
		{
			EndViewTransitionAnimator endviewtransitionanimator = new EndViewTransitionAnimator(animationoranimator.animation, container, viewToAnimate);
	//   15   31:new             #32  <Class FragmentManagerImpl$EndViewTransitionAnimator>
	//   16   34:dup             
	//   17   35:aload_2         
	//   18   36:getfield        #261 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   19   39:aload           5
	//   20   41:aload           4
	//   21   43:invokespecial   #264 <Method void FragmentManagerImpl$EndViewTransitionAnimator(Animation, ViewGroup, View)>
	//   22   46:astore          6
			fragment.setAnimatingAway(fragment.mView);
	//   23   48:aload_1         
	//   24   49:aload_1         
	//   25   50:getfield        #227 <Field View Fragment.mView>
	//   26   53:invokevirtual   #267 <Method void Fragment.setAnimatingAway(View)>
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
			//   11   18:aconst_null     
			//   12   19:invokespecial   #28  <Method void FragmentManagerImpl$AnimationListenerWrapper(android.view.animation.Animation$AnimationListener, FragmentManagerImpl$1)>
			//   13   22:return          
			}
			}
)));
	//   27   56:aload           6
	//   28   58:new             #10  <Class FragmentManagerImpl$2>
	//   29   61:dup             
	//   30   62:aload_0         
	//   31   63:aload           6
	//   32   65:invokestatic    #271 <Method android.view.animation.Animation$AnimationListener getAnimationListener(Animation)>
	//   33   68:aload           5
	//   34   70:aload_1         
	//   35   71:invokespecial   #274 <Method void FragmentManagerImpl$2(FragmentManagerImpl, android.view.animation.Animation$AnimationListener, ViewGroup, Fragment)>
	//   36   74:invokevirtual   #280 <Method void Animation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
			setHWLayerAnimListenerIfAlpha(viewToAnimate, animationoranimator);
	//   37   77:aload           4
	//   38   79:aload_2         
	//   39   80:invokestatic    #284 <Method void setHWLayerAnimListenerIfAlpha(View, FragmentManagerImpl$AnimationOrAnimator)>
			fragment.mView.startAnimation(((Animation) (endviewtransitionanimator)));
	//   40   83:aload_1         
	//   41   84:getfield        #227 <Field View Fragment.mView>
	//   42   87:aload           6
	//   43   89:invokevirtual   #290 <Method void View.startAnimation(Animation)>
			return;
	//   44   92:return          
		} else
		{
			Animator animator = animationoranimator.animator;
	//   45   93:aload_2         
	//   46   94:getfield        #294 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   47   97:astore          6
			fragment.setAnimator(animationoranimator.animator);
	//   48   99:aload_1         
	//   49  100:aload_2         
	//   50  101:getfield        #294 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   51  104:invokevirtual   #298 <Method void Fragment.setAnimator(Animator)>
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
				//*  14   28:ifnull          66
				//*  15   31:aload_0         
				//*  16   32:getfield        #23  <Field ViewGroup val$container>
				//*  17   35:aload_0         
				//*  18   36:getfield        #25  <Field View val$viewToAnimate>
				//*  19   39:invokevirtual   #52  <Method int ViewGroup.indexOfChild(View)>
				//*  20   42:ifge            66
						moveToState(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
				//   21   45:aload_0         
				//   22   46:getfield        #21  <Field FragmentManagerImpl this$0>
				//   23   49:aload_0         
				//   24   50:getfield        #27  <Field Fragment val$fragment>
				//   25   53:aload_0         
				//   26   54:getfield        #27  <Field Fragment val$fragment>
				//   27   57:invokevirtual   #56  <Method int Fragment.getStateAfterAnimating()>
				//   28   60:iconst_0        
				//   29   61:iconst_0        
				//   30   62:iconst_0        
				//   31   63:invokevirtual   #60  <Method void FragmentManagerImpl.moveToState(Fragment, int, int, int, boolean)>
				//   32   66:return          
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
	//   59  119:invokespecial   #301 <Method void FragmentManagerImpl$3(FragmentManagerImpl, ViewGroup, View, Fragment)>
	//   60  122:invokevirtual   #307 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
			animator.setTarget(((Object) (fragment.mView)));
	//   61  125:aload           6
	//   62  127:aload_1         
	//   63  128:getfield        #227 <Field View Fragment.mView>
	//   64  131:invokevirtual   #311 <Method void Animator.setTarget(Object)>
			setHWLayerAnimListenerIfAlpha(fragment.mView, animationoranimator);
	//   65  134:aload_1         
	//   66  135:getfield        #227 <Field View Fragment.mView>
	//   67  138:aload_2         
	//   68  139:invokestatic    #284 <Method void setHWLayerAnimListenerIfAlpha(View, FragmentManagerImpl$AnimationOrAnimator)>
			animator.start();
	//   69  142:aload           6
	//   70  144:invokevirtual   #314 <Method void Animator.start()>
			return;
	//   71  147:return          
		}
	}

	private void burpActive()
	{
		if(mActive != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #318 <Field SparseArray mActive>
	//*   2    4:ifnull          54
		{
			for(int i = mActive.size() - 1; i >= 0; i--)
	//*   3    7:aload_0         
	//*   4    8:getfield        #318 <Field SparseArray mActive>
	//*   5   11:invokevirtual   #321 <Method int SparseArray.size()>
	//*   6   14:iconst_1        
	//*   7   15:isub            
	//*   8   16:istore_1        
	//*   9   17:iload_1         
	//*  10   18:iflt            54
				if(mActive.valueAt(i) == null)
	//*  11   21:aload_0         
	//*  12   22:getfield        #318 <Field SparseArray mActive>
	//*  13   25:iload_1         
	//*  14   26:invokevirtual   #324 <Method Object SparseArray.valueAt(int)>
	//*  15   29:ifnonnull       47
					mActive.delete(mActive.keyAt(i));
	//   16   32:aload_0         
	//   17   33:getfield        #318 <Field SparseArray mActive>
	//   18   36:aload_0         
	//   19   37:getfield        #318 <Field SparseArray mActive>
	//   20   40:iload_1         
	//   21   41:invokevirtual   #328 <Method int SparseArray.keyAt(int)>
	//   22   44:invokevirtual   #331 <Method void SparseArray.delete(int)>

	//   23   47:iload_1         
	//   24   48:iconst_1        
	//   25   49:isub            
	//   26   50:istore_1        
		}
	//*  27   51:goto            17
	//   28   54:return          
	}

	private void checkStateLoss()
	{
		if(isStateSaved())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #336 <Method boolean isStateSaved()>
	//*   2    4:ifeq            18
			throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
	//    3    7:new             #338 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #340 <String "Can not perform this action after onSaveInstanceState">
	//    6   14:invokespecial   #343 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		if(mNoTransactionsBecause != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #345 <Field String mNoTransactionsBecause>
	//*  10   22:ifnull          62
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   25:new             #347 <Class StringBuilder>
	//   12   28:dup             
	//   13   29:invokespecial   #348 <Method void StringBuilder()>
	//   14   32:astore_1        
			stringbuilder.append("Can not perform this action inside of ");
	//   15   33:aload_1         
	//   16   34:ldc2            #350 <String "Can not perform this action inside of ">
	//   17   37:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   18   40:pop             
			stringbuilder.append(mNoTransactionsBecause);
	//   19   41:aload_1         
	//   20   42:aload_0         
	//   21   43:getfield        #345 <Field String mNoTransactionsBecause>
	//   22   46:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   23   49:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   24   50:new             #338 <Class IllegalStateException>
	//   25   53:dup             
	//   26   54:aload_1         
	//   27   55:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   28   58:invokespecial   #343 <Method void IllegalStateException(String)>
	//   29   61:athrow          
		} else
		{
			return;
	//   30   62:return          
		}
	}

	private void cleanupExec()
	{
		mExecutingActions = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #361 <Field boolean mExecutingActions>
		mTmpIsPop.clear();
	//    3    5:aload_0         
	//    4    6:getfield        #363 <Field ArrayList mTmpIsPop>
	//    5    9:invokevirtual   #366 <Method void ArrayList.clear()>
		mTmpRecords.clear();
	//    6   12:aload_0         
	//    7   13:getfield        #368 <Field ArrayList mTmpRecords>
	//    8   16:invokevirtual   #366 <Method void ArrayList.clear()>
	//    9   19:return          
	}

	private void completeExecute(BackStackRecord backstackrecord, boolean flag, boolean flag1, boolean flag2)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            13
			backstackrecord.executePopOps(flag2);
	//    2    4:aload_1         
	//    3    5:iload           4
	//    4    7:invokevirtual   #374 <Method void BackStackRecord.executePopOps(boolean)>
		else
	//*   5   10:goto            17
			backstackrecord.executeOps();
	//    6   13:aload_1         
	//    7   14:invokevirtual   #377 <Method void BackStackRecord.executeOps()>
		ArrayList arraylist = new ArrayList(1);
	//    8   17:new             #163 <Class ArrayList>
	//    9   20:dup             
	//   10   21:iconst_1        
	//   11   22:invokespecial   #379 <Method void ArrayList(int)>
	//   12   25:astore          7
		ArrayList arraylist1 = new ArrayList(1);
	//   13   27:new             #163 <Class ArrayList>
	//   14   30:dup             
	//   15   31:iconst_1        
	//   16   32:invokespecial   #379 <Method void ArrayList(int)>
	//   17   35:astore          8
		arraylist.add(((Object) (backstackrecord)));
	//   18   37:aload           7
	//   19   39:aload_1         
	//   20   40:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
	//   21   43:pop             
		arraylist1.add(((Object) (Boolean.valueOf(flag))));
	//   22   44:aload           8
	//   23   46:iload_2         
	//   24   47:invokestatic    #386 <Method Boolean Boolean.valueOf(boolean)>
	//   25   50:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
	//   26   53:pop             
		if(flag1)
	//*  27   54:iload_3         
	//*  28   55:ifeq            69
			FragmentTransition.startTransitions(this, arraylist, arraylist1, 0, 1, true);
	//   29   58:aload_0         
	//   30   59:aload           7
	//   31   61:aload           8
	//   32   63:iconst_0        
	//   33   64:iconst_1        
	//   34   65:iconst_1        
	//   35   66:invokestatic    #392 <Method void FragmentTransition.startTransitions(FragmentManagerImpl, ArrayList, ArrayList, int, int, boolean)>
		if(flag2)
	//*  36   69:iload           4
	//*  37   71:ifeq            83
			moveToState(mCurState, true);
	//   38   74:aload_0         
	//   39   75:aload_0         
	//   40   76:getfield        #173 <Field int mCurState>
	//   41   79:iconst_1        
	//   42   80:invokevirtual   #395 <Method void moveToState(int, boolean)>
		if(mActive != null)
	//*  43   83:aload_0         
	//*  44   84:getfield        #318 <Field SparseArray mActive>
	//*  45   87:ifnull          216
		{
			int j = mActive.size();
	//   46   90:aload_0         
	//   47   91:getfield        #318 <Field SparseArray mActive>
	//   48   94:invokevirtual   #321 <Method int SparseArray.size()>
	//   49   97:istore          6
			for(int i = 0; i < j; i++)
	//*  50   99:iconst_0        
	//*  51  100:istore          5
	//*  52  102:iload           5
	//*  53  104:iload           6
	//*  54  106:icmpge          216
			{
				Fragment fragment = (Fragment)mActive.valueAt(i);
	//   55  109:aload_0         
	//   56  110:getfield        #318 <Field SparseArray mActive>
	//   57  113:iload           5
	//   58  115:invokevirtual   #324 <Method Object SparseArray.valueAt(int)>
	//   59  118:checkcast       #210 <Class Fragment>
	//   60  121:astore          7
				if(fragment == null || fragment.mView == null || !fragment.mIsNewlyAdded || !backstackrecord.interactsWith(fragment.mContainerId))
					continue;
	//   61  123:aload           7
	//   62  125:ifnull          207
	//   63  128:aload           7
	//   64  130:getfield        #227 <Field View Fragment.mView>
	//   65  133:ifnull          207
	//   66  136:aload           7
	//   67  138:getfield        #233 <Field boolean Fragment.mIsNewlyAdded>
	//   68  141:ifeq            207
	//   69  144:aload_1         
	//   70  145:aload           7
	//   71  147:getfield        #398 <Field int Fragment.mContainerId>
	//   72  150:invokevirtual   #402 <Method boolean BackStackRecord.interactsWith(int)>
	//   73  153:ifeq            207
				if(fragment.mPostponedAlpha > 0.0F)
	//*  74  156:aload           7
	//*  75  158:getfield        #406 <Field float Fragment.mPostponedAlpha>
	//*  76  161:fconst_0        
	//*  77  162:fcmpl           
	//*  78  163:ifle            179
					fragment.mView.setAlpha(fragment.mPostponedAlpha);
	//   79  166:aload           7
	//   80  168:getfield        #227 <Field View Fragment.mView>
	//   81  171:aload           7
	//   82  173:getfield        #406 <Field float Fragment.mPostponedAlpha>
	//   83  176:invokevirtual   #409 <Method void View.setAlpha(float)>
				if(flag2)
	//*  84  179:iload           4
	//*  85  181:ifeq            193
				{
					fragment.mPostponedAlpha = 0.0F;
	//   86  184:aload           7
	//   87  186:fconst_0        
	//   88  187:putfield        #406 <Field float Fragment.mPostponedAlpha>
				} else
	//*  89  190:goto            207
				{
					fragment.mPostponedAlpha = -1F;
	//   90  193:aload           7
	//   91  195:ldc2            #410 <Float -1F>
	//   92  198:putfield        #406 <Field float Fragment.mPostponedAlpha>
					fragment.mIsNewlyAdded = false;
	//   93  201:aload           7
	//   94  203:iconst_0        
	//   95  204:putfield        #233 <Field boolean Fragment.mIsNewlyAdded>
				}
			}

	//   96  207:iload           5
	//   97  209:iconst_1        
	//   98  210:iadd            
	//   99  211:istore          5
		}
	//* 100  213:goto            102
	//  101  216:return          
	}

	private void dispatchStateChange(int i)
	{
		mExecutingActions = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #361 <Field boolean mExecutingActions>
		moveToState(i, false);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #395 <Method void moveToState(int, boolean)>
		mExecutingActions = false;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #361 <Field boolean mExecutingActions>
		execPendingActions();
	//   10   16:aload_0         
	//   11   17:invokevirtual   #414 <Method boolean execPendingActions()>
	//   12   20:pop             
		return;
	//   13   21:return          
		Exception exception;
		exception;
	//   14   22:astore_2        
		mExecutingActions = false;
	//   15   23:aload_0         
	//   16   24:iconst_0        
	//   17   25:putfield        #361 <Field boolean mExecutingActions>
		throw exception;
	//   18   28:aload_2         
	//   19   29:athrow          
	}

	private void endAnimatingAwayFragments()
	{
		SparseArray sparsearray = mActive;
	//    0    0:aload_0         
	//    1    1:getfield        #318 <Field SparseArray mActive>
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
	//*   9   15:goto            26
			i = mActive.size();
	//   10   18:aload_0         
	//   11   19:getfield        #318 <Field SparseArray mActive>
	//   12   22:invokevirtual   #321 <Method int SparseArray.size()>
	//   13   25:istore_1        
		for(; j < i; j++)
	//*  14   26:iload_2         
	//*  15   27:iload_1         
	//*  16   28:icmpge          134
		{
			Fragment fragment = (Fragment)mActive.valueAt(j);
	//   17   31:aload_0         
	//   18   32:getfield        #318 <Field SparseArray mActive>
	//   19   35:iload_2         
	//   20   36:invokevirtual   #324 <Method Object SparseArray.valueAt(int)>
	//   21   39:checkcast       #210 <Class Fragment>
	//   22   42:astore          4
			if(fragment == null)
				continue;
	//   23   44:aload           4
	//   24   46:ifnull          127
			if(fragment.getAnimatingAway() != null)
	//*  25   49:aload           4
	//*  26   51:invokevirtual   #419 <Method View Fragment.getAnimatingAway()>
	//*  27   54:ifnull          111
			{
				int k = fragment.getStateAfterAnimating();
	//   28   57:aload           4
	//   29   59:invokevirtual   #422 <Method int Fragment.getStateAfterAnimating()>
	//   30   62:istore_3        
				View view = fragment.getAnimatingAway();
	//   31   63:aload           4
	//   32   65:invokevirtual   #419 <Method View Fragment.getAnimatingAway()>
	//   33   68:astore          5
				Animation animation = view.getAnimation();
	//   34   70:aload           5
	//   35   72:invokevirtual   #426 <Method Animation View.getAnimation()>
	//   36   75:astore          6
				if(animation != null)
	//*  37   77:aload           6
	//*  38   79:ifnull          92
				{
					animation.cancel();
	//   39   82:aload           6
	//   40   84:invokevirtual   #429 <Method void Animation.cancel()>
					view.clearAnimation();
	//   41   87:aload           5
	//   42   89:invokevirtual   #432 <Method void View.clearAnimation()>
				}
				fragment.setAnimatingAway(((View) (null)));
	//   43   92:aload           4
	//   44   94:aconst_null     
	//   45   95:invokevirtual   #267 <Method void Fragment.setAnimatingAway(View)>
				moveToState(fragment, k, 0, 0, false);
	//   46   98:aload_0         
	//   47   99:aload           4
	//   48  101:iload_3         
	//   49  102:iconst_0        
	//   50  103:iconst_0        
	//   51  104:iconst_0        
	//   52  105:invokevirtual   #223 <Method void moveToState(Fragment, int, int, int, boolean)>
				continue;
	//   53  108:goto            127
			}
			if(fragment.getAnimator() != null)
	//*  54  111:aload           4
	//*  55  113:invokevirtual   #436 <Method Animator Fragment.getAnimator()>
	//*  56  116:ifnull          127
				fragment.getAnimator().end();
	//   57  119:aload           4
	//   58  121:invokevirtual   #436 <Method Animator Fragment.getAnimator()>
	//   59  124:invokevirtual   #439 <Method void Animator.end()>
		}

	//   60  127:iload_2         
	//   61  128:iconst_1        
	//   62  129:iadd            
	//   63  130:istore_2        
	//*  64  131:goto            26
	//   65  134:return          
	}

	private void ensureExecReady(boolean flag)
	{
		if(mExecutingActions)
	//*   0    0:aload_0         
	//*   1    1:getfield        #361 <Field boolean mExecutingActions>
	//*   2    4:ifeq            18
			throw new IllegalStateException("FragmentManager is already executing transactions");
	//    3    7:new             #338 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #442 <String "FragmentManager is already executing transactions">
	//    6   14:invokespecial   #343 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		if(mHost == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #444 <Field FragmentHostCallback mHost>
	//*  10   22:ifnonnull       36
			throw new IllegalStateException("Fragment host has been destroyed");
	//   11   25:new             #338 <Class IllegalStateException>
	//   12   28:dup             
	//   13   29:ldc2            #446 <String "Fragment host has been destroyed">
	//   14   32:invokespecial   #343 <Method void IllegalStateException(String)>
	//   15   35:athrow          
		if(Looper.myLooper() != mHost.getHandler().getLooper())
	//*  16   36:invokestatic    #452 <Method Looper Looper.myLooper()>
	//*  17   39:aload_0         
	//*  18   40:getfield        #444 <Field FragmentHostCallback mHost>
	//*  19   43:invokevirtual   #458 <Method Handler FragmentHostCallback.getHandler()>
	//*  20   46:invokevirtual   #463 <Method Looper Handler.getLooper()>
	//*  21   49:if_acmpeq       63
			throw new IllegalStateException("Must be called from main thread of fragment host");
	//   22   52:new             #338 <Class IllegalStateException>
	//   23   55:dup             
	//   24   56:ldc2            #465 <String "Must be called from main thread of fragment host">
	//   25   59:invokespecial   #343 <Method void IllegalStateException(String)>
	//   26   62:athrow          
		if(!flag)
	//*  27   63:iload_1         
	//*  28   64:ifne            71
			checkStateLoss();
	//   29   67:aload_0         
	//   30   68:invokespecial   #467 <Method void checkStateLoss()>
		if(mTmpRecords == null)
	//*  31   71:aload_0         
	//*  32   72:getfield        #368 <Field ArrayList mTmpRecords>
	//*  33   75:ifnonnull       100
		{
			mTmpRecords = new ArrayList();
	//   34   78:aload_0         
	//   35   79:new             #163 <Class ArrayList>
	//   36   82:dup             
	//   37   83:invokespecial   #164 <Method void ArrayList()>
	//   38   86:putfield        #368 <Field ArrayList mTmpRecords>
			mTmpIsPop = new ArrayList();
	//   39   89:aload_0         
	//   40   90:new             #163 <Class ArrayList>
	//   41   93:dup             
	//   42   94:invokespecial   #164 <Method void ArrayList()>
	//   43   97:putfield        #363 <Field ArrayList mTmpIsPop>
		}
		mExecutingActions = true;
	//   44  100:aload_0         
	//   45  101:iconst_1        
	//   46  102:putfield        #361 <Field boolean mExecutingActions>
		executePostponedTransaction(((ArrayList) (null)), ((ArrayList) (null)));
	//   47  105:aload_0         
	//   48  106:aconst_null     
	//   49  107:aconst_null     
	//   50  108:invokespecial   #471 <Method void executePostponedTransaction(ArrayList, ArrayList)>
		mExecutingActions = false;
	//   51  111:aload_0         
	//   52  112:iconst_0        
	//   53  113:putfield        #361 <Field boolean mExecutingActions>
		return;
	//   54  116:return          
		Exception exception;
		exception;
	//   55  117:astore_2        
		mExecutingActions = false;
	//   56  118:aload_0         
	//   57  119:iconst_0        
	//   58  120:putfield        #361 <Field boolean mExecutingActions>
		throw exception;
	//   59  123:aload_2         
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
	//    5    7:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//    6   10:checkcast       #370 <Class BackStackRecord>
	//    7   13:astore          6
			boolean flag1 = ((Boolean)arraylist1.get(i)).booleanValue();
	//    8   15:aload_1         
	//    9   16:iload_2         
	//   10   17:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//   11   20:checkcast       #382 <Class Boolean>
	//   12   23:invokevirtual   #475 <Method boolean Boolean.booleanValue()>
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
	//   20   39:invokevirtual   #478 <Method void BackStackRecord.bumpBackStackNesting(int)>
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
	//   31   59:invokevirtual   #374 <Method void BackStackRecord.executePopOps(boolean)>
			} else
	//*  32   62:goto            76
			{
				backstackrecord.bumpBackStackNesting(1);
	//   33   65:aload           6
	//   34   67:iconst_1        
	//   35   68:invokevirtual   #478 <Method void BackStackRecord.bumpBackStackNesting(int)>
				backstackrecord.executeOps();
	//   36   71:aload           6
	//   37   73:invokevirtual   #377 <Method void BackStackRecord.executeOps()>
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
	//    4    6:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//    5    9:checkcast       #370 <Class BackStackRecord>
	//    6   12:getfield        #483 <Field boolean BackStackRecord.mReorderingAllowed>
	//    7   15:istore          8
		if(mTmpAddedFragments == null)
	//*   8   17:aload_0         
	//*   9   18:getfield        #485 <Field ArrayList mTmpAddedFragments>
	//*  10   21:ifnonnull       38
			mTmpAddedFragments = new ArrayList();
	//   11   24:aload_0         
	//   12   25:new             #163 <Class ArrayList>
	//   13   28:dup             
	//   14   29:invokespecial   #164 <Method void ArrayList()>
	//   15   32:putfield        #485 <Field ArrayList mTmpAddedFragments>
		else
	//*  16   35:goto            45
			mTmpAddedFragments.clear();
	//   17   38:aload_0         
	//   18   39:getfield        #485 <Field ArrayList mTmpAddedFragments>
	//   19   42:invokevirtual   #366 <Method void ArrayList.clear()>
		mTmpAddedFragments.addAll(((java.util.Collection) (mAdded)));
	//   20   45:aload_0         
	//   21   46:getfield        #485 <Field ArrayList mTmpAddedFragments>
	//   22   49:aload_0         
	//   23   50:getfield        #166 <Field ArrayList mAdded>
	//   24   53:invokevirtual   #489 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   25   56:pop             
		Fragment fragment = getPrimaryNavigationFragment();
	//   26   57:aload_0         
	//   27   58:invokevirtual   #493 <Method Fragment getPrimaryNavigationFragment()>
	//   28   61:astore          9
		boolean flag = false;
	//   29   63:iconst_0        
	//   30   64:istore          6
		for(int l = k; l < j; l++)
	//*  31   66:iload           5
	//*  32   68:istore          7
	//*  33   70:iload           7
	//*  34   72:iload           4
	//*  35   74:icmpge          166
		{
			BackStackRecord backstackrecord1 = (BackStackRecord)arraylist.get(l);
	//   36   77:aload_1         
	//   37   78:iload           7
	//   38   80:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//   39   83:checkcast       #370 <Class BackStackRecord>
	//   40   86:astore          10
			if(!((Boolean)arraylist1.get(l)).booleanValue())
	//*  41   88:aload_2         
	//*  42   89:iload           7
	//*  43   91:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//*  44   94:checkcast       #382 <Class Boolean>
	//*  45   97:invokevirtual   #475 <Method boolean Boolean.booleanValue()>
	//*  46  100:ifne            119
				fragment = backstackrecord1.expandOps(mTmpAddedFragments, fragment);
	//   47  103:aload           10
	//   48  105:aload_0         
	//   49  106:getfield        #485 <Field ArrayList mTmpAddedFragments>
	//   50  109:aload           9
	//   51  111:invokevirtual   #497 <Method Fragment BackStackRecord.expandOps(ArrayList, Fragment)>
	//   52  114:astore          9
			else
	//*  53  116:goto            132
				fragment = backstackrecord1.trackAddedFragmentsInPop(mTmpAddedFragments, fragment);
	//   54  119:aload           10
	//   55  121:aload_0         
	//   56  122:getfield        #485 <Field ArrayList mTmpAddedFragments>
	//   57  125:aload           9
	//   58  127:invokevirtual   #500 <Method Fragment BackStackRecord.trackAddedFragmentsInPop(ArrayList, Fragment)>
	//   59  130:astore          9
			if(!flag && !backstackrecord1.mAddToBackStack)
	//*  60  132:iload           6
	//*  61  134:ifne            154
	//*  62  137:aload           10
	//*  63  139:getfield        #503 <Field boolean BackStackRecord.mAddToBackStack>
	//*  64  142:ifeq            148
	//*  65  145:goto            154
				flag = false;
	//   66  148:iconst_0        
	//   67  149:istore          6
			else
	//*  68  151:goto            157
				flag = true;
	//   69  154:iconst_1        
	//   70  155:istore          6
		}

	//   71  157:iload           7
	//   72  159:iconst_1        
	//   73  160:iadd            
	//   74  161:istore          7
	//*  75  163:goto            70
		mTmpAddedFragments.clear();
	//   76  166:aload_0         
	//   77  167:getfield        #485 <Field ArrayList mTmpAddedFragments>
	//   78  170:invokevirtual   #366 <Method void ArrayList.clear()>
		if(!flag1)
	//*  79  173:iload           8
	//*  80  175:ifne            189
			FragmentTransition.startTransitions(this, arraylist, arraylist1, k, j, false);
	//   81  178:aload_0         
	//   82  179:aload_1         
	//   83  180:aload_2         
	//   84  181:iload           5
	//   85  183:iload           4
	//   86  185:iconst_0        
	//   87  186:invokestatic    #392 <Method void FragmentTransition.startTransitions(FragmentManagerImpl, ArrayList, ArrayList, int, int, boolean)>
		executeOps(arraylist, arraylist1, i, j);
	//   88  189:aload_1         
	//   89  190:aload_2         
	//   90  191:iload_3         
	//   91  192:iload           4
	//   92  194:invokestatic    #505 <Method void executeOps(ArrayList, ArrayList, int, int)>
		if(flag1)
	//*  93  197:iload           8
	//*  94  199:ifeq            239
		{
			ArraySet arrayset = new ArraySet();
	//   95  202:new             #235 <Class ArraySet>
	//   96  205:dup             
	//   97  206:invokespecial   #506 <Method void ArraySet()>
	//   98  209:astore          9
			addAddedFragments(arrayset);
	//   99  211:aload_0         
	//  100  212:aload           9
	//  101  214:invokespecial   #508 <Method void addAddedFragments(ArraySet)>
			i = postponePostponableTransactions(arraylist, arraylist1, k, j, arrayset);
	//  102  217:aload_0         
	//  103  218:aload_1         
	//  104  219:aload_2         
	//  105  220:iload           5
	//  106  222:iload           4
	//  107  224:aload           9
	//  108  226:invokespecial   #512 <Method int postponePostponableTransactions(ArrayList, ArrayList, int, int, ArraySet)>
	//  109  229:istore_3        
			makeRemovedFragmentsInvisible(arrayset);
	//  110  230:aload_0         
	//  111  231:aload           9
	//  112  233:invokespecial   #515 <Method void makeRemovedFragmentsInvisible(ArraySet)>
		} else
	//* 113  236:goto            242
		{
			i = j;
	//  114  239:iload           4
	//  115  241:istore_3        
		}
		int i1 = k;
	//  116  242:iload           5
	//  117  244:istore          7
		if(i != k)
	//* 118  246:iload_3         
	//* 119  247:iload           5
	//* 120  249:icmpeq          284
		{
			i1 = k;
	//  121  252:iload           5
	//  122  254:istore          7
			if(flag1)
	//* 123  256:iload           8
	//* 124  258:ifeq            284
			{
				FragmentTransition.startTransitions(this, arraylist, arraylist1, k, i, true);
	//  125  261:aload_0         
	//  126  262:aload_1         
	//  127  263:aload_2         
	//  128  264:iload           5
	//  129  266:iload_3         
	//  130  267:iconst_1        
	//  131  268:invokestatic    #392 <Method void FragmentTransition.startTransitions(FragmentManagerImpl, ArrayList, ArrayList, int, int, boolean)>
				moveToState(mCurState, true);
	//  132  271:aload_0         
	//  133  272:aload_0         
	//  134  273:getfield        #173 <Field int mCurState>
	//  135  276:iconst_1        
	//  136  277:invokevirtual   #395 <Method void moveToState(int, boolean)>
				i1 = k;
	//  137  280:iload           5
	//  138  282:istore          7
			}
		}
		for(; i1 < j; i1++)
	//* 139  284:iload           7
	//* 140  286:iload           4
	//* 141  288:icmpge          354
		{
			BackStackRecord backstackrecord = (BackStackRecord)arraylist.get(i1);
	//  142  291:aload_1         
	//  143  292:iload           7
	//  144  294:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//  145  297:checkcast       #370 <Class BackStackRecord>
	//  146  300:astore          9
			if(((Boolean)arraylist1.get(i1)).booleanValue() && backstackrecord.mIndex >= 0)
	//* 147  302:aload_2         
	//* 148  303:iload           7
	//* 149  305:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//* 150  308:checkcast       #382 <Class Boolean>
	//* 151  311:invokevirtual   #475 <Method boolean Boolean.booleanValue()>
	//* 152  314:ifeq            340
	//* 153  317:aload           9
	//* 154  319:getfield        #518 <Field int BackStackRecord.mIndex>
	//* 155  322:iflt            340
			{
				freeBackStackIndex(backstackrecord.mIndex);
	//  156  325:aload_0         
	//  157  326:aload           9
	//  158  328:getfield        #518 <Field int BackStackRecord.mIndex>
	//  159  331:invokevirtual   #521 <Method void freeBackStackIndex(int)>
				backstackrecord.mIndex = -1;
	//  160  334:aload           9
	//  161  336:iconst_m1       
	//  162  337:putfield        #518 <Field int BackStackRecord.mIndex>
			}
			backstackrecord.runOnCommitRunnables();
	//  163  340:aload           9
	//  164  342:invokevirtual   #524 <Method void BackStackRecord.runOnCommitRunnables()>
		}

	//  165  345:iload           7
	//  166  347:iconst_1        
	//  167  348:iadd            
	//  168  349:istore          7
	//* 169  351:goto            284
		if(flag)
	//* 170  354:iload           6
	//* 171  356:ifeq            363
			reportBackStackChanged();
	//  172  359:aload_0         
	//  173  360:invokevirtual   #527 <Method void reportBackStackChanged()>
	//  174  363:return          
	}

	private void executePostponedTransaction(ArrayList arraylist, ArrayList arraylist1)
	{
		int i;
		if(mPostponedTransactions == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #529 <Field ArrayList mPostponedTransactions>
	//*   2    4:ifnonnull       12
			i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_3        
		else
	//*   5    9:goto            20
			i = mPostponedTransactions.size();
	//    6   12:aload_0         
	//    7   13:getfield        #529 <Field ArrayList mPostponedTransactions>
	//    8   16:invokevirtual   #204 <Method int ArrayList.size()>
	//    9   19:istore_3        
		int l = 0;
	//   10   20:iconst_0        
	//   11   21:istore          5
		int k = i;
	//   12   23:iload_3         
	//   13   24:istore          4
		for(int j = l; j < k; k = l)
	//*  14   26:iload           5
	//*  15   28:istore_3        
	//*  16   29:iload_3         
	//*  17   30:iload           4
	//*  18   32:icmpge          236
		{
			int i1;
label0:
			{
				StartEnterTransitionListener startentertransitionlistener = (StartEnterTransitionListener)mPostponedTransactions.get(j);
	//   19   35:aload_0         
	//   20   36:getfield        #529 <Field ArrayList mPostponedTransactions>
	//   21   39:iload_3         
	//   22   40:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//   23   43:checkcast       #44  <Class FragmentManagerImpl$StartEnterTransitionListener>
	//   24   46:astore          7
				if(arraylist != null && !startentertransitionlistener.mIsBack)
	//*  25   48:aload_1         
	//*  26   49:ifnull          107
	//*  27   52:aload           7
	//*  28   54:invokestatic    #533 <Method boolean FragmentManagerImpl$StartEnterTransitionListener.access$300(FragmentManagerImpl$StartEnterTransitionListener)>
	//*  29   57:ifne            107
				{
					l = arraylist.indexOf(((Object) (startentertransitionlistener.mRecord)));
	//   30   60:aload_1         
	//   31   61:aload           7
	//   32   63:invokestatic    #537 <Method BackStackRecord FragmentManagerImpl$StartEnterTransitionListener.access$400(FragmentManagerImpl$StartEnterTransitionListener)>
	//   33   66:invokevirtual   #541 <Method int ArrayList.indexOf(Object)>
	//   34   69:istore          5
					if(l != -1 && ((Boolean)arraylist1.get(l)).booleanValue())
	//*  35   71:iload           5
	//*  36   73:iconst_m1       
	//*  37   74:icmpeq          107
	//*  38   77:aload_2         
	//*  39   78:iload           5
	//*  40   80:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//*  41   83:checkcast       #382 <Class Boolean>
	//*  42   86:invokevirtual   #475 <Method boolean Boolean.booleanValue()>
	//*  43   89:ifeq            107
					{
						startentertransitionlistener.cancelTransaction();
	//   44   92:aload           7
	//   45   94:invokevirtual   #544 <Method void FragmentManagerImpl$StartEnterTransitionListener.cancelTransaction()>
						i1 = j;
	//   46   97:iload_3         
	//   47   98:istore          6
						l = k;
	//   48  100:iload           4
	//   49  102:istore          5
						break label0;
	//   50  104:goto            224
					}
				}
				if(!startentertransitionlistener.isReady())
	//*  51  107:aload           7
	//*  52  109:invokevirtual   #547 <Method boolean FragmentManagerImpl$StartEnterTransitionListener.isReady()>
	//*  53  112:ifne            150
				{
					i1 = j;
	//   54  115:iload_3         
	//   55  116:istore          6
					l = k;
	//   56  118:iload           4
	//   57  120:istore          5
					if(arraylist == null)
						break label0;
	//   58  122:aload_1         
	//   59  123:ifnull          224
					i1 = j;
	//   60  126:iload_3         
	//   61  127:istore          6
					l = k;
	//   62  129:iload           4
	//   63  131:istore          5
					if(!startentertransitionlistener.mRecord.interactsWith(arraylist, 0, arraylist.size()))
						break label0;
	//   64  133:aload           7
	//   65  135:invokestatic    #537 <Method BackStackRecord FragmentManagerImpl$StartEnterTransitionListener.access$400(FragmentManagerImpl$StartEnterTransitionListener)>
	//   66  138:aload_1         
	//   67  139:iconst_0        
	//   68  140:aload_1         
	//   69  141:invokevirtual   #204 <Method int ArrayList.size()>
	//   70  144:invokevirtual   #550 <Method boolean BackStackRecord.interactsWith(ArrayList, int, int)>
	//   71  147:ifeq            224
				}
				mPostponedTransactions.remove(j);
	//   72  150:aload_0         
	//   73  151:getfield        #529 <Field ArrayList mPostponedTransactions>
	//   74  154:iload_3         
	//   75  155:invokevirtual   #553 <Method Object ArrayList.remove(int)>
	//   76  158:pop             
				i1 = j - 1;
	//   77  159:iload_3         
	//   78  160:iconst_1        
	//   79  161:isub            
	//   80  162:istore          6
				l = k - 1;
	//   81  164:iload           4
	//   82  166:iconst_1        
	//   83  167:isub            
	//   84  168:istore          5
				if(arraylist != null && !startentertransitionlistener.mIsBack)
	//*  85  170:aload_1         
	//*  86  171:ifnull          219
	//*  87  174:aload           7
	//*  88  176:invokestatic    #533 <Method boolean FragmentManagerImpl$StartEnterTransitionListener.access$300(FragmentManagerImpl$StartEnterTransitionListener)>
	//*  89  179:ifne            219
				{
					j = arraylist.indexOf(((Object) (startentertransitionlistener.mRecord)));
	//   90  182:aload_1         
	//   91  183:aload           7
	//   92  185:invokestatic    #537 <Method BackStackRecord FragmentManagerImpl$StartEnterTransitionListener.access$400(FragmentManagerImpl$StartEnterTransitionListener)>
	//   93  188:invokevirtual   #541 <Method int ArrayList.indexOf(Object)>
	//   94  191:istore_3        
					if(j != -1 && ((Boolean)arraylist1.get(j)).booleanValue())
	//*  95  192:iload_3         
	//*  96  193:iconst_m1       
	//*  97  194:icmpeq          219
	//*  98  197:aload_2         
	//*  99  198:iload_3         
	//* 100  199:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//* 101  202:checkcast       #382 <Class Boolean>
	//* 102  205:invokevirtual   #475 <Method boolean Boolean.booleanValue()>
	//* 103  208:ifeq            219
					{
						startentertransitionlistener.cancelTransaction();
	//  104  211:aload           7
	//  105  213:invokevirtual   #544 <Method void FragmentManagerImpl$StartEnterTransitionListener.cancelTransaction()>
						break label0;
	//  106  216:goto            224
					}
				}
				startentertransitionlistener.completeTransaction();
	//  107  219:aload           7
	//  108  221:invokevirtual   #556 <Method void FragmentManagerImpl$StartEnterTransitionListener.completeTransaction()>
			}
			j = i1 + 1;
	//  109  224:iload           6
	//  110  226:iconst_1        
	//  111  227:iadd            
	//  112  228:istore_3        
		}

	//  113  229:iload           5
	//  114  231:istore          4
	//* 115  233:goto            29
	//  116  236:return          
	}

	private Fragment findFragmentUnder(Fragment fragment)
	{
		ViewGroup viewgroup = fragment.mContainer;
	//    0    0:aload_1         
	//    1    1:getfield        #247 <Field ViewGroup Fragment.mContainer>
	//    2    4:astore_3        
		View view = fragment.mView;
	//    3    5:aload_1         
	//    4    6:getfield        #227 <Field View Fragment.mView>
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
	//*  13   23:getfield        #166 <Field ArrayList mAdded>
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #541 <Method int ArrayList.indexOf(Object)>
	//*  16   30:iconst_1        
	//*  17   31:isub            
	//*  18   32:istore_2        
	//*  19   33:iload_2         
	//*  20   34:iflt            73
			{
				fragment = (Fragment)mAdded.get(i);
	//   21   37:aload_0         
	//   22   38:getfield        #166 <Field ArrayList mAdded>
	//   23   41:iload_2         
	//   24   42:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//   25   45:checkcast       #210 <Class Fragment>
	//   26   48:astore_1        
				if(fragment.mContainer == viewgroup && fragment.mView != null)
	//*  27   49:aload_1         
	//*  28   50:getfield        #247 <Field ViewGroup Fragment.mContainer>
	//*  29   53:aload_3         
	//*  30   54:if_acmpne       66
	//*  31   57:aload_1         
	//*  32   58:getfield        #227 <Field View Fragment.mView>
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
	//*   1    1:getfield        #529 <Field ArrayList mPostponedTransactions>
	//*   2    4:ifnull          34
			for(; !mPostponedTransactions.isEmpty(); ((StartEnterTransitionListener)mPostponedTransactions.remove(0)).completeTransaction());
	//    3    7:aload_0         
	//    4    8:getfield        #529 <Field ArrayList mPostponedTransactions>
	//    5   11:invokevirtual   #563 <Method boolean ArrayList.isEmpty()>
	//    6   14:ifne            34
	//    7   17:aload_0         
	//    8   18:getfield        #529 <Field ArrayList mPostponedTransactions>
	//    9   21:iconst_0        
	//   10   22:invokevirtual   #553 <Method Object ArrayList.remove(int)>
	//   11   25:checkcast       #44  <Class FragmentManagerImpl$StartEnterTransitionListener>
	//   12   28:invokevirtual   #556 <Method void FragmentManagerImpl$StartEnterTransitionListener.completeTransaction()>
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
	//    3    3:getfield        #567 <Field ArrayList mPendingActions>
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
	//*  10   16:getfield        #567 <Field ArrayList mPendingActions>
	//*  11   19:invokevirtual   #204 <Method int ArrayList.size()>
	//*  12   22:ifne            28
			break MISSING_BLOCK_LABEL_102;
	//   13   25:goto            102
		int j = mPendingActions.size();
	//   14   28:aload_0         
	//   15   29:getfield        #567 <Field ArrayList mPendingActions>
	//   16   32:invokevirtual   #204 <Method int ArrayList.size()>
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
	//   25   49:getfield        #567 <Field ArrayList mPendingActions>
	//   26   52:iload_3         
	//   27   53:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//   28   56:checkcast       #38  <Class FragmentManagerImpl$OpGenerator>
	//   29   59:aload_1         
	//   30   60:aload_2         
	//   31   61:invokeinterface #570 <Method boolean FragmentManagerImpl$OpGenerator.generateOps(ArrayList, ArrayList)>
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
	//   40   77:getfield        #567 <Field ArrayList mPendingActions>
	//   41   80:invokevirtual   #366 <Method void ArrayList.clear()>
		mHost.getHandler().removeCallbacks(mExecCommit);
	//   42   83:aload_0         
	//   43   84:getfield        #444 <Field FragmentHostCallback mHost>
	//   44   87:invokevirtual   #458 <Method Handler FragmentHostCallback.getHandler()>
	//   45   90:aload_0         
	//   46   91:getfield        #182 <Field Runnable mExecCommit>
	//   47   94:invokevirtual   #574 <Method void Handler.removeCallbacks(Runnable)>
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
	//*   0    0:getstatic       #581 <Field Field sAnimationListenerField>
	//*   1    3:ifnonnull       25
		{
			sAnimationListenerField = ((Class) (android/view/animation/Animation)).getDeclaredField("mListener");
	//    2    6:ldc2            #276 <Class Animation>
	//    3    9:ldc2            #583 <String "mListener">
	//    4   12:invokevirtual   #589 <Method Field Class.getDeclaredField(String)>
	//    5   15:putstatic       #581 <Field Field sAnimationListenerField>
			sAnimationListenerField.setAccessible(true);
	//    6   18:getstatic       #581 <Field Field sAnimationListenerField>
	//    7   21:iconst_1        
	//    8   22:invokevirtual   #594 <Method void Field.setAccessible(boolean)>
		}
		animation = ((Animation) ((android.view.animation.Animation.AnimationListener)sAnimationListenerField.get(((Object) (animation)))));
	//    9   25:getstatic       #581 <Field Field sAnimationListenerField>
	//   10   28:aload_0         
	//   11   29:invokevirtual   #597 <Method Object Field.get(Object)>
	//   12   32:checkcast       #599 <Class android.view.animation.Animation$AnimationListener>
	//   13   35:astore_0        
		return ((android.view.animation.Animation.AnimationListener) (animation));
	//   14   36:aload_0         
	//   15   37:areturn         
		animation;
	//   16   38:astore_0        
		Log.e("FragmentManager", "Cannot access Animation's mListener field", ((Throwable) (animation)));
	//   17   39:ldc1            #72  <String "FragmentManager">
	//   18   41:ldc2            #601 <String "Cannot access Animation's mListener field">
	//   19   44:aload_0         
	//   20   45:invokestatic    #607 <Method int Log.e(String, String, Throwable)>
	//   21   48:pop             
		break MISSING_BLOCK_LABEL_63;
	//   22   49:goto            63
		animation;
	//   23   52:astore_0        
		Log.e("FragmentManager", "No field with the name mListener is found in Animation class", ((Throwable) (animation)));
	//   24   53:ldc1            #72  <String "FragmentManager">
	//   25   55:ldc2            #609 <String "No field with the name mListener is found in Animation class">
	//   26   58:aload_0         
	//   27   59:invokestatic    #607 <Method int Log.e(String, String, Throwable)>
	//   28   62:pop             
		return null;
	//   29   63:aconst_null     
	//   30   64:areturn         
	}

	static AnimationOrAnimator makeFadeAnimation(Context context, float f, float f1)
	{
		context = ((Context) (new AlphaAnimation(f, f1)));
	//    0    0:new             #613 <Class AlphaAnimation>
	//    1    3:dup             
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokespecial   #616 <Method void AlphaAnimation(float, float)>
	//    5    9:astore_0        
		((AlphaAnimation) (context)).setInterpolator(DECELERATE_CUBIC);
	//    6   10:aload_0         
	//    7   11:getstatic       #149 <Field Interpolator DECELERATE_CUBIC>
	//    8   14:invokevirtual   #620 <Method void AlphaAnimation.setInterpolator(Interpolator)>
		((AlphaAnimation) (context)).setDuration(220L);
	//    9   17:aload_0         
	//   10   18:ldc2w           #621 <Long 220L>
	//   11   21:invokevirtual   #626 <Method void AlphaAnimation.setDuration(long)>
		return new AnimationOrAnimator(((Animation) (context)));
	//   12   24:new             #26  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:invokespecial   #629 <Method void FragmentManagerImpl$AnimationOrAnimator(Animation, FragmentManagerImpl$1)>
	//   17   33:areturn         
	}

	static AnimationOrAnimator makeOpenCloseAnimation(Context context, float f, float f1, float f2, float f3)
	{
		context = ((Context) (new AnimationSet(false)));
	//    0    0:new             #633 <Class AnimationSet>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #635 <Method void AnimationSet(boolean)>
	//    4    8:astore_0        
		Object obj = ((Object) (new ScaleAnimation(f, f1, f, f1, 1, 0.5F, 1, 0.5F)));
	//    5    9:new             #637 <Class ScaleAnimation>
	//    6   12:dup             
	//    7   13:fload_1         
	//    8   14:fload_2         
	//    9   15:fload_1         
	//   10   16:fload_2         
	//   11   17:iconst_1        
	//   12   18:ldc2            #638 <Float 0.5F>
	//   13   21:iconst_1        
	//   14   22:ldc2            #638 <Float 0.5F>
	//   15   25:invokespecial   #641 <Method void ScaleAnimation(float, float, float, float, int, float, int, float)>
	//   16   28:astore          5
		((ScaleAnimation) (obj)).setInterpolator(DECELERATE_QUINT);
	//   17   30:aload           5
	//   18   32:getstatic       #146 <Field Interpolator DECELERATE_QUINT>
	//   19   35:invokevirtual   #642 <Method void ScaleAnimation.setInterpolator(Interpolator)>
		((ScaleAnimation) (obj)).setDuration(220L);
	//   20   38:aload           5
	//   21   40:ldc2w           #621 <Long 220L>
	//   22   43:invokevirtual   #643 <Method void ScaleAnimation.setDuration(long)>
		((AnimationSet) (context)).addAnimation(((Animation) (obj)));
	//   23   46:aload_0         
	//   24   47:aload           5
	//   25   49:invokevirtual   #646 <Method void AnimationSet.addAnimation(Animation)>
		obj = ((Object) (new AlphaAnimation(f2, f3)));
	//   26   52:new             #613 <Class AlphaAnimation>
	//   27   55:dup             
	//   28   56:fload_3         
	//   29   57:fload           4
	//   30   59:invokespecial   #616 <Method void AlphaAnimation(float, float)>
	//   31   62:astore          5
		((AlphaAnimation) (obj)).setInterpolator(DECELERATE_CUBIC);
	//   32   64:aload           5
	//   33   66:getstatic       #149 <Field Interpolator DECELERATE_CUBIC>
	//   34   69:invokevirtual   #620 <Method void AlphaAnimation.setInterpolator(Interpolator)>
		((AlphaAnimation) (obj)).setDuration(220L);
	//   35   72:aload           5
	//   36   74:ldc2w           #621 <Long 220L>
	//   37   77:invokevirtual   #626 <Method void AlphaAnimation.setDuration(long)>
		((AnimationSet) (context)).addAnimation(((Animation) (obj)));
	//   38   80:aload_0         
	//   39   81:aload           5
	//   40   83:invokevirtual   #646 <Method void AnimationSet.addAnimation(Animation)>
		return new AnimationOrAnimator(((Animation) (context)));
	//   41   86:new             #26  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   42   89:dup             
	//   43   90:aload_0         
	//   44   91:aconst_null     
	//   45   92:invokespecial   #629 <Method void FragmentManagerImpl$AnimationOrAnimator(Animation, FragmentManagerImpl$1)>
	//   46   95:areturn         
	}

	private void makeRemovedFragmentsInvisible(ArraySet arrayset)
	{
		int j = arrayset.size();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #647 <Method int ArraySet.size()>
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
	//   10   14:invokevirtual   #648 <Method Object ArraySet.valueAt(int)>
	//   11   17:checkcast       #210 <Class Fragment>
	//   12   20:astore          4
			if(!fragment.mAdded)
	//*  13   22:aload           4
	//*  14   24:getfield        #650 <Field boolean Fragment.mAdded>
	//*  15   27:ifne            53
			{
				View view = fragment.getView();
	//   16   30:aload           4
	//   17   32:invokevirtual   #653 <Method View Fragment.getView()>
	//   18   35:astore          5
				fragment.mPostponedAlpha = view.getAlpha();
	//   19   37:aload           4
	//   20   39:aload           5
	//   21   41:invokevirtual   #657 <Method float View.getAlpha()>
	//   22   44:putfield        #406 <Field float Fragment.mPostponedAlpha>
				view.setAlpha(0.0F);
	//   23   47:aload           5
	//   24   49:fconst_0        
	//   25   50:invokevirtual   #409 <Method void View.setAlpha(float)>
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
	//*   5    7:instanceof      #661 <Class ValueAnimator>
	//*   6   10:ifeq            53
		{
			animator = ((Animator) (((ValueAnimator)animator).getValues()));
	//    7   13:aload_0         
	//    8   14:checkcast       #661 <Class ValueAnimator>
	//    9   17:invokevirtual   #665 <Method PropertyValuesHolder[] ValueAnimator.getValues()>
	//   10   20:astore_0        
			for(int i = 0; i < animator.length; i++)
	//*  11   21:iconst_0        
	//*  12   22:istore_1        
	//*  13   23:iload_1         
	//*  14   24:aload_0         
	//*  15   25:arraylength     
	//*  16   26:icmpge          105
				if("alpha".equals(((Object) (((PropertyValuesHolder) (animator[i])).getPropertyName()))))
	//*  17   29:ldc2            #667 <String "alpha">
	//*  18   32:aload_0         
	//*  19   33:iload_1         
	//*  20   34:aaload          
	//*  21   35:invokevirtual   #672 <Method String PropertyValuesHolder.getPropertyName()>
	//*  22   38:invokevirtual   #677 <Method boolean String.equals(Object)>
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
	//*  32   54:instanceof      #679 <Class AnimatorSet>
	//*  33   57:ifeq            105
		{
			animator = ((Animator) (((AnimatorSet)animator).getChildAnimations()));
	//   34   60:aload_0         
	//   35   61:checkcast       #679 <Class AnimatorSet>
	//   36   64:invokevirtual   #683 <Method ArrayList AnimatorSet.getChildAnimations()>
	//   37   67:astore_0        
			for(int j = 0; j < ((List) (animator)).size(); j++)
	//*  38   68:iconst_0        
	//*  39   69:istore_1        
	//*  40   70:iload_1         
	//*  41   71:aload_0         
	//*  42   72:invokeinterface #686 <Method int List.size()>
	//*  43   77:icmpge          105
				if(modifiesAlpha((Animator)((List) (animator)).get(j)))
	//*  44   80:aload_0         
	//*  45   81:iload_1         
	//*  46   82:invokeinterface #687 <Method Object List.get(int)>
	//*  47   87:checkcast       #303 <Class Animator>
	//*  48   90:invokestatic    #689 <Method boolean modifiesAlpha(Animator)>
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
	//*   1    1:getfield        #261 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//*   2    4:instanceof      #613 <Class AlphaAnimation>
	//*   3    7:ifeq            12
			return true;
	//    4   10:iconst_1        
	//    5   11:ireturn         
		if(animationoranimator.animation instanceof AnimationSet)
	//*   6   12:aload_0         
	//*   7   13:getfield        #261 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//*   8   16:instanceof      #633 <Class AnimationSet>
	//*   9   19:ifeq            69
		{
			animationoranimator = ((AnimationOrAnimator) (((AnimationSet)animationoranimator.animation).getAnimations()));
	//   10   22:aload_0         
	//   11   23:getfield        #261 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   12   26:checkcast       #633 <Class AnimationSet>
	//   13   29:invokevirtual   #694 <Method List AnimationSet.getAnimations()>
	//   14   32:astore_0        
			for(int i = 0; i < ((List) (animationoranimator)).size(); i++)
	//*  15   33:iconst_0        
	//*  16   34:istore_1        
	//*  17   35:iload_1         
	//*  18   36:aload_0         
	//*  19   37:invokeinterface #686 <Method int List.size()>
	//*  20   42:icmpge          67
				if(((List) (animationoranimator)).get(i) instanceof AlphaAnimation)
	//*  21   45:aload_0         
	//*  22   46:iload_1         
	//*  23   47:invokeinterface #687 <Method Object List.get(int)>
	//*  24   52:instanceof      #613 <Class AlphaAnimation>
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
	//   36   70:getfield        #294 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   37   73:invokestatic    #689 <Method boolean modifiesAlpha(Animator)>
	//   38   76:ireturn         
		}
	}

	private boolean popBackStackImmediate(String s, int i, int j)
	{
		boolean flag;
		execPendingActions();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #414 <Method boolean execPendingActions()>
	//    2    4:pop             
		ensureExecReady(true);
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokespecial   #698 <Method void ensureExecReady(boolean)>
		if(mPrimaryNav != null && i < 0 && s == null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #700 <Field Fragment mPrimaryNav>
	//*   8   14:ifnull          49
	//*   9   17:iload_2         
	//*  10   18:ifge            49
	//*  11   21:aload_1         
	//*  12   22:ifnonnull       49
		{
			FragmentManager fragmentmanager = mPrimaryNav.peekChildFragmentManager();
	//   13   25:aload_0         
	//   14   26:getfield        #700 <Field Fragment mPrimaryNav>
	//   15   29:invokevirtual   #704 <Method FragmentManager Fragment.peekChildFragmentManager()>
	//   16   32:astore          5
			if(fragmentmanager != null && fragmentmanager.popBackStackImmediate())
	//*  17   34:aload           5
	//*  18   36:ifnull          49
	//*  19   39:aload           5
	//*  20   41:invokevirtual   #706 <Method boolean FragmentManager.popBackStackImmediate()>
	//*  21   44:ifeq            49
				return true;
	//   22   47:iconst_1        
	//   23   48:ireturn         
		}
		flag = popBackStackState(mTmpRecords, mTmpIsPop, s, i, j);
	//   24   49:aload_0         
	//   25   50:aload_0         
	//   26   51:getfield        #368 <Field ArrayList mTmpRecords>
	//   27   54:aload_0         
	//   28   55:getfield        #363 <Field ArrayList mTmpIsPop>
	//   29   58:aload_1         
	//   30   59:iload_2         
	//   31   60:iload_3         
	//   32   61:invokevirtual   #710 <Method boolean popBackStackState(ArrayList, ArrayList, String, int, int)>
	//   33   64:istore          4
		if(!flag)
			break MISSING_BLOCK_LABEL_102;
	//   34   66:iload           4
	//   35   68:ifeq            102
		mExecutingActions = true;
	//   36   71:aload_0         
	//   37   72:iconst_1        
	//   38   73:putfield        #361 <Field boolean mExecutingActions>
		removeRedundantOperationsAndExecute(mTmpRecords, mTmpIsPop);
	//   39   76:aload_0         
	//   40   77:aload_0         
	//   41   78:getfield        #368 <Field ArrayList mTmpRecords>
	//   42   81:aload_0         
	//   43   82:getfield        #363 <Field ArrayList mTmpIsPop>
	//   44   85:invokespecial   #713 <Method void removeRedundantOperationsAndExecute(ArrayList, ArrayList)>
		cleanupExec();
	//   45   88:aload_0         
	//   46   89:invokespecial   #715 <Method void cleanupExec()>
		break MISSING_BLOCK_LABEL_102;
	//   47   92:goto            102
		s;
	//   48   95:astore_1        
		cleanupExec();
	//   49   96:aload_0         
	//   50   97:invokespecial   #715 <Method void cleanupExec()>
		throw s;
	//   51  100:aload_1         
	//   52  101:athrow          
		doPendingDeferredStart();
	//   53  102:aload_0         
	//   54  103:invokevirtual   #718 <Method void doPendingDeferredStart()>
		burpActive();
	//   55  106:aload_0         
	//   56  107:invokespecial   #720 <Method void burpActive()>
		return flag;
	//   57  110:iload           4
	//   58  112:ireturn         
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
	//   11   19:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #370 <Class BackStackRecord>
	//   13   25:astore          11
			boolean flag1 = ((Boolean)arraylist1.get(k)).booleanValue();
	//   14   27:aload_2         
	//   15   28:iload           6
	//   16   30:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//   17   33:checkcast       #382 <Class Boolean>
	//   18   36:invokevirtual   #475 <Method boolean Boolean.booleanValue()>
	//   19   39:istore          10
			boolean flag;
			if(backstackrecord.isPostponed() && !backstackrecord.interactsWith(arraylist, k + 1, j))
	//*  20   41:aload           11
	//*  21   43:invokevirtual   #723 <Method boolean BackStackRecord.isPostponed()>
	//*  22   46:ifeq            70
	//*  23   49:aload           11
	//*  24   51:aload_1         
	//*  25   52:iload           6
	//*  26   54:iconst_1        
	//*  27   55:iadd            
	//*  28   56:iload           4
	//*  29   58:invokevirtual   #550 <Method boolean BackStackRecord.interactsWith(ArrayList, int, int)>
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
	//*  41   83:getfield        #529 <Field ArrayList mPostponedTransactions>
	//*  42   86:ifnonnull       100
					mPostponedTransactions = new ArrayList();
	//   43   89:aload_0         
	//   44   90:new             #163 <Class ArrayList>
	//   45   93:dup             
	//   46   94:invokespecial   #164 <Method void ArrayList()>
	//   47   97:putfield        #529 <Field ArrayList mPostponedTransactions>
				StartEnterTransitionListener startentertransitionlistener = new StartEnterTransitionListener(backstackrecord, flag1);
	//   48  100:new             #44  <Class FragmentManagerImpl$StartEnterTransitionListener>
	//   49  103:dup             
	//   50  104:aload           11
	//   51  106:iload           10
	//   52  108:invokespecial   #726 <Method void FragmentManagerImpl$StartEnterTransitionListener(BackStackRecord, boolean)>
	//   53  111:astore          12
				mPostponedTransactions.add(((Object) (startentertransitionlistener)));
	//   54  113:aload_0         
	//   55  114:getfield        #529 <Field ArrayList mPostponedTransactions>
	//   56  117:aload           12
	//   57  119:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
	//   58  122:pop             
				backstackrecord.setOnStartPostponedListener(((Fragment.OnStartEnterTransitionListener) (startentertransitionlistener)));
	//   59  123:aload           11
	//   60  125:aload           12
	//   61  127:invokevirtual   #730 <Method void BackStackRecord.setOnStartPostponedListener(Fragment$OnStartEnterTransitionListener)>
				if(flag1)
	//*  62  130:iload           10
	//*  63  132:ifeq            143
					backstackrecord.executeOps();
	//   64  135:aload           11
	//   65  137:invokevirtual   #377 <Method void BackStackRecord.executeOps()>
				else
	//*  66  140:goto            149
					backstackrecord.executePopOps(false);
	//   67  143:aload           11
	//   68  145:iconst_0        
	//   69  146:invokevirtual   #374 <Method void BackStackRecord.executePopOps(boolean)>
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
	//   79  165:invokevirtual   #553 <Method Object ArrayList.remove(int)>
	//   80  168:pop             
					arraylist.add(i1, ((Object) (backstackrecord)));
	//   81  169:aload_1         
	//   82  170:iload           8
	//   83  172:aload           11
	//   84  174:invokevirtual   #733 <Method void ArrayList.add(int, Object)>
				}
				addAddedFragments(arrayset);
	//   85  177:aload_0         
	//   86  178:aload           5
	//   87  180:invokespecial   #508 <Method void addAddedFragments(ArraySet)>
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
	//*   1    1:ifnull          226
		{
			if(arraylist.isEmpty())
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #563 <Method boolean ArrayList.isEmpty()>
	//*   4    8:ifeq            12
				return;
	//    5   11:return          
			if(arraylist1 != null && arraylist.size() == arraylist1.size())
	//*   6   12:aload_2         
	//*   7   13:ifnull          215
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #204 <Method int ArrayList.size()>
	//*  10   20:aload_2         
	//*  11   21:invokevirtual   #204 <Method int ArrayList.size()>
	//*  12   24:icmpeq          30
	//*  13   27:goto            215
			{
				executePostponedTransaction(arraylist, arraylist1);
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:aload_2         
	//   17   33:invokespecial   #471 <Method void executePostponedTransaction(ArrayList, ArrayList)>
				int i1 = arraylist.size();
	//   18   36:aload_1         
	//   19   37:invokevirtual   #204 <Method int ArrayList.size()>
	//   20   40:istore          7
				int i = 0;
	//   21   42:iconst_0        
	//   22   43:istore_3        
				int j;
				int k;
				for(k = 0; i < i1; k = j)
	//*  23   44:iconst_0        
	//*  24   45:istore          5
	//*  25   47:iload_3         
	//*  26   48:iload           7
	//*  27   50:icmpge          197
				{
					int l = i;
	//   28   53:iload_3         
	//   29   54:istore          6
					j = k;
	//   30   56:iload           5
	//   31   58:istore          4
					if(!((BackStackRecord)arraylist.get(i)).mReorderingAllowed)
	//*  32   60:aload_1         
	//*  33   61:iload_3         
	//*  34   62:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//*  35   65:checkcast       #370 <Class BackStackRecord>
	//*  36   68:getfield        #483 <Field boolean BackStackRecord.mReorderingAllowed>
	//*  37   71:ifne            185
					{
						if(k != i)
	//*  38   74:iload           5
	//*  39   76:iload_3         
	//*  40   77:icmpeq          89
							executeOpsTogether(arraylist, arraylist1, k, i);
	//   41   80:aload_0         
	//   42   81:aload_1         
	//   43   82:aload_2         
	//   44   83:iload           5
	//   45   85:iload_3         
	//   46   86:invokespecial   #736 <Method void executeOpsTogether(ArrayList, ArrayList, int, int)>
						k = i + 1;
	//   47   89:iload_3         
	//   48   90:iconst_1        
	//   49   91:iadd            
	//   50   92:istore          5
						j = k;
	//   51   94:iload           5
	//   52   96:istore          4
						if(((Boolean)arraylist1.get(i)).booleanValue())
	//*  53   98:aload_2         
	//*  54   99:iload_3         
	//*  55  100:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//*  56  103:checkcast       #382 <Class Boolean>
	//*  57  106:invokevirtual   #475 <Method boolean Boolean.booleanValue()>
	//*  58  109:ifeq            170
							do
							{
								j = k;
	//   59  112:iload           5
	//   60  114:istore          4
								if(k >= i1)
									break;
	//   61  116:iload           5
	//   62  118:iload           7
	//   63  120:icmpge          170
								j = k;
	//   64  123:iload           5
	//   65  125:istore          4
								if(!((Boolean)arraylist1.get(k)).booleanValue())
									break;
	//   66  127:aload_2         
	//   67  128:iload           5
	//   68  130:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//   69  133:checkcast       #382 <Class Boolean>
	//   70  136:invokevirtual   #475 <Method boolean Boolean.booleanValue()>
	//   71  139:ifeq            170
								j = k;
	//   72  142:iload           5
	//   73  144:istore          4
								if(((BackStackRecord)arraylist.get(k)).mReorderingAllowed)
									break;
	//   74  146:aload_1         
	//   75  147:iload           5
	//   76  149:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//   77  152:checkcast       #370 <Class BackStackRecord>
	//   78  155:getfield        #483 <Field boolean BackStackRecord.mReorderingAllowed>
	//   79  158:ifne            170
								k++;
	//   80  161:iload           5
	//   81  163:iconst_1        
	//   82  164:iadd            
	//   83  165:istore          5
							} while(true);
	//   84  167:goto            112
						executeOpsTogether(arraylist, arraylist1, i, j);
	//   85  170:aload_0         
	//   86  171:aload_1         
	//   87  172:aload_2         
	//   88  173:iload_3         
	//   89  174:iload           4
	//   90  176:invokespecial   #736 <Method void executeOpsTogether(ArrayList, ArrayList, int, int)>
						l = j - 1;
	//   91  179:iload           4
	//   92  181:iconst_1        
	//   93  182:isub            
	//   94  183:istore          6
					}
					i = l + 1;
	//   95  185:iload           6
	//   96  187:iconst_1        
	//   97  188:iadd            
	//   98  189:istore_3        
				}

	//   99  190:iload           4
	//  100  192:istore          5
	//* 101  194:goto            47
				if(k != i1)
	//* 102  197:iload           5
	//* 103  199:iload           7
	//* 104  201:icmpeq          214
					executeOpsTogether(arraylist, arraylist1, k, i1);
	//  105  204:aload_0         
	//  106  205:aload_1         
	//  107  206:aload_2         
	//  108  207:iload           5
	//  109  209:iload           7
	//  110  211:invokespecial   #736 <Method void executeOpsTogether(ArrayList, ArrayList, int, int)>
				return;
	//  111  214:return          
			} else
			{
				throw new IllegalStateException("Internal error with the back stack records");
	//  112  215:new             #338 <Class IllegalStateException>
	//  113  218:dup             
	//  114  219:ldc2            #738 <String "Internal error with the back stack records">
	//  115  222:invokespecial   #343 <Method void IllegalStateException(String)>
	//  116  225:athrow          
			}
		} else
		{
			return;
	//  117  226:return          
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

	private void scheduleCommit()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ArrayList arraylist = mPostponedTransactions;
	//    2    2:aload_0         
	//    3    3:getfield        #529 <Field ArrayList mPostponedTransactions>
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
	//   10   16:getfield        #529 <Field ArrayList mPostponedTransactions>
	//   11   19:invokevirtual   #563 <Method boolean ArrayList.isEmpty()>
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
	//   19   33:getfield        #567 <Field ArrayList mPendingActions>
	//   20   36:ifnull          101
_L4:
		flag1 = flag2;
	//   21   39:iload_3         
	//   22   40:istore_2        
		if(mPendingActions.size() == 1)
	//*  23   41:aload_0         
	//*  24   42:getfield        #567 <Field ArrayList mPendingActions>
	//*  25   45:invokevirtual   #204 <Method int ArrayList.size()>
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
	//   32   58:getfield        #444 <Field FragmentHostCallback mHost>
	//   33   61:invokevirtual   #458 <Method Handler FragmentHostCallback.getHandler()>
	//   34   64:aload_0         
	//   35   65:getfield        #182 <Field Runnable mExecCommit>
	//   36   68:invokevirtual   #574 <Method void Handler.removeCallbacks(Runnable)>
		mHost.getHandler().post(mExecCommit);
	//   37   71:aload_0         
	//   38   72:getfield        #444 <Field FragmentHostCallback mHost>
	//   39   75:invokevirtual   #458 <Method Handler FragmentHostCallback.getHandler()>
	//   40   78:aload_0         
	//   41   79:getfield        #182 <Field Runnable mExecCommit>
	//   42   82:invokevirtual   #743 <Method boolean Handler.post(Runnable)>
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
	//*   7   11:invokestatic    #747 <Method boolean shouldRunOnHWLayer(View, FragmentManagerImpl$AnimationOrAnimator)>
	//*   8   14:ifeq            70
			{
				if(animationoranimator.animator != null)
	//*   9   17:aload_1         
	//*  10   18:getfield        #294 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//*  11   21:ifnull          40
				{
					animationoranimator.animator.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorOnHWLayerIfNeededListener(view))));
	//   12   24:aload_1         
	//   13   25:getfield        #294 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   14   28:new             #29  <Class FragmentManagerImpl$AnimatorOnHWLayerIfNeededListener>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #749 <Method void FragmentManagerImpl$AnimatorOnHWLayerIfNeededListener(View)>
	//   18   36:invokevirtual   #307 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
					return;
	//   19   39:return          
				}
				android.view.animation.Animation.AnimationListener animationlistener = getAnimationListener(animationoranimator.animation);
	//   20   40:aload_1         
	//   21   41:getfield        #261 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   22   44:invokestatic    #271 <Method android.view.animation.Animation$AnimationListener getAnimationListener(Animation)>
	//   23   47:astore_2        
				view.setLayerType(2, ((android.graphics.Paint) (null)));
	//   24   48:aload_0         
	//   25   49:iconst_2        
	//   26   50:aconst_null     
	//   27   51:invokevirtual   #753 <Method void View.setLayerType(int, android.graphics.Paint)>
				animationoranimator.animation.setAnimationListener(((android.view.animation.Animation.AnimationListener) (new AnimateOnHWLayerIfNeededListener(view, animationlistener))));
	//   28   54:aload_1         
	//   29   55:getfield        #261 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   30   58:new             #18  <Class FragmentManagerImpl$AnimateOnHWLayerIfNeededListener>
	//   31   61:dup             
	//   32   62:aload_0         
	//   33   63:aload_2         
	//   34   64:invokespecial   #756 <Method void FragmentManagerImpl$AnimateOnHWLayerIfNeededListener(View, android.view.animation.Animation$AnimationListener)>
	//   35   67:invokevirtual   #280 <Method void Animation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
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
	//    4    6:invokevirtual   #763 <Method List FragmentManagerNonConfig.getFragments()>
	//    5    9:astore_1        
		if(obj != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          46
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*   8   14:aload_1         
	//*   9   15:invokeinterface #767 <Method Iterator List.iterator()>
	//*  10   20:astore_1        
	//*  11   21:aload_1         
	//*  12   22:invokeinterface #772 <Method boolean Iterator.hasNext()>
	//*  13   27:ifeq            46
				((Fragment)((Iterator) (obj)).next()).mRetaining = true;
	//   14   30:aload_1         
	//   15   31:invokeinterface #776 <Method Object Iterator.next()>
	//   16   36:checkcast       #210 <Class Fragment>
	//   17   39:iconst_1        
	//   18   40:putfield        #779 <Field boolean Fragment.mRetaining>

	//*  19   43:goto            21
		fragmentmanagernonconfig = ((FragmentManagerNonConfig) (fragmentmanagernonconfig.getChildNonConfigs()));
	//   20   46:aload_0         
	//   21   47:invokevirtual   #782 <Method List FragmentManagerNonConfig.getChildNonConfigs()>
	//   22   50:astore_0        
		if(fragmentmanagernonconfig != null)
	//*  23   51:aload_0         
	//*  24   52:ifnull          86
			for(fragmentmanagernonconfig = ((FragmentManagerNonConfig) (((List) (fragmentmanagernonconfig)).iterator())); ((Iterator) (fragmentmanagernonconfig)).hasNext(); setRetaining((FragmentManagerNonConfig)((Iterator) (fragmentmanagernonconfig)).next()));
	//   25   55:aload_0         
	//   26   56:invokeinterface #767 <Method Iterator List.iterator()>
	//   27   61:astore_0        
	//   28   62:aload_0         
	//   29   63:invokeinterface #772 <Method boolean Iterator.hasNext()>
	//   30   68:ifeq            86
	//   31   71:aload_0         
	//   32   72:invokeinterface #776 <Method Object Iterator.next()>
	//   33   77:checkcast       #760 <Class FragmentManagerNonConfig>
	//   34   80:invokestatic    #784 <Method void setRetaining(FragmentManagerNonConfig)>
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
	//*  10   14:getstatic       #789 <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   17:bipush          19
	//*  12   19:icmplt          51
			{
				flag = flag1;
	//   13   22:iload_3         
	//   14   23:istore_2        
				if(view.getLayerType() == 0)
	//*  15   24:aload_0         
	//*  16   25:invokevirtual   #792 <Method int View.getLayerType()>
	//*  17   28:ifne            51
				{
					flag = flag1;
	//   18   31:iload_3         
	//   19   32:istore_2        
					if(ViewCompat.hasOverlappingRendering(view))
	//*  20   33:aload_0         
	//*  21   34:invokestatic    #798 <Method boolean ViewCompat.hasOverlappingRendering(View)>
	//*  22   37:ifeq            51
					{
						flag = flag1;
	//   23   40:iload_3         
	//   24   41:istore_2        
						if(modifiesAlpha(animationoranimator))
	//*  25   42:aload_1         
	//*  26   43:invokestatic    #800 <Method boolean modifiesAlpha(FragmentManagerImpl$AnimationOrAnimator)>
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
	//    0    0:ldc1            #72  <String "FragmentManager">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #809 <Method String RuntimeException.getMessage()>
	//    3    6:invokestatic    #812 <Method int Log.e(String, String)>
	//    4    9:pop             
		Log.e("FragmentManager", "Activity state:");
	//    5   10:ldc1            #72  <String "FragmentManager">
	//    6   12:ldc2            #814 <String "Activity state:">
	//    7   15:invokestatic    #812 <Method int Log.e(String, String)>
	//    8   18:pop             
		Object obj = ((Object) (new PrintWriter(((java.io.Writer) (new LogWriter("FragmentManager"))))));
	//    9   19:new             #816 <Class PrintWriter>
	//   10   22:dup             
	//   11   23:new             #818 <Class LogWriter>
	//   12   26:dup             
	//   13   27:ldc1            #72  <String "FragmentManager">
	//   14   29:invokespecial   #819 <Method void LogWriter(String)>
	//   15   32:invokespecial   #822 <Method void PrintWriter(java.io.Writer)>
	//   16   35:astore_2        
		if(mHost != null)
	//*  17   36:aload_0         
	//*  18   37:getfield        #444 <Field FragmentHostCallback mHost>
	//*  19   40:ifnull          76
			try
			{
				mHost.onDump("  ", ((FileDescriptor) (null)), ((PrintWriter) (obj)), new String[0]);
	//   20   43:aload_0         
	//   21   44:getfield        #444 <Field FragmentHostCallback mHost>
	//   22   47:ldc2            #824 <String "  ">
	//   23   50:aconst_null     
	//   24   51:aload_2         
	//   25   52:iconst_0        
	//   26   53:anewarray       String[]
	//   27   56:invokevirtual   #828 <Method void FragmentHostCallback.onDump(String, FileDescriptor, PrintWriter, String[])>
			}
	//*  28   59:goto            103
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  29   62:astore_2        
			{
				Log.e("FragmentManager", "Failed dumping state", ((Throwable) (obj)));
	//   30   63:ldc1            #72  <String "FragmentManager">
	//   31   65:ldc2            #830 <String "Failed dumping state">
	//   32   68:aload_2         
	//   33   69:invokestatic    #607 <Method int Log.e(String, String, Throwable)>
	//   34   72:pop             
			}
		else
	//*  35   73:goto            103
			try
			{
				dump("  ", ((FileDescriptor) (null)), ((PrintWriter) (obj)), new String[0]);
	//   36   76:aload_0         
	//   37   77:ldc2            #824 <String "  ">
	//   38   80:aconst_null     
	//   39   81:aload_2         
	//   40   82:iconst_0        
	//   41   83:anewarray       String[]
	//   42   86:invokevirtual   #833 <Method void dump(String, FileDescriptor, PrintWriter, String[])>
			}
	//*  43   89:goto            103
			catch(Exception exception)
	//*  44   92:astore_2        
			{
				Log.e("FragmentManager", "Failed dumping state", ((Throwable) (exception)));
	//   45   93:ldc1            #72  <String "FragmentManager">
	//   46   95:ldc2            #830 <String "Failed dumping state">
	//   47   98:aload_2         
	//   48   99:invokestatic    #607 <Method int Log.e(String, String, Throwable)>
	//   49  102:pop             
			}
		throw runtimeexception;
	//   50  103:aload_1         
	//   51  104:athrow          
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
	//*   1    1:getfield        #839 <Field ArrayList mBackStack>
	//*   2    4:ifnonnull       18
			mBackStack = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #163 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #164 <Method void ArrayList()>
	//    7   15:putfield        #839 <Field ArrayList mBackStack>
		mBackStack.add(((Object) (backstackrecord)));
	//    8   18:aload_0         
	//    9   19:getfield        #839 <Field ArrayList mBackStack>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
	//   12   26:pop             
	//   13   27:return          
	}

	public void addFragment(Fragment fragment, boolean flag)
	{
		if(DEBUG)
	//*   0    0:getstatic       #843 <Field boolean DEBUG>
	//*   1    3:ifeq            38
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #347 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #348 <Method void StringBuilder()>
	//    5   13:astore_3        
			stringbuilder.append("add: ");
	//    6   14:aload_3         
	//    7   15:ldc2            #845 <String "add: ">
	//    8   18:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (fragment)));
	//   10   22:aload_3         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   14   28:ldc1            #72  <String "FragmentManager">
	//   15   30:aload_3         
	//   16   31:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #851 <Method int Log.v(String, String)>
	//   18   37:pop             
		}
		makeActive(fragment);
	//   19   38:aload_0         
	//   20   39:aload_1         
	//   21   40:invokevirtual   #855 <Method void makeActive(Fragment)>
		if(!fragment.mDetached)
	//*  22   43:aload_1         
	//*  23   44:getfield        #858 <Field boolean Fragment.mDetached>
	//*  24   47:ifne            169
		{
			if(mAdded.contains(((Object) (fragment))))
	//*  25   50:aload_0         
	//*  26   51:getfield        #166 <Field ArrayList mAdded>
	//*  27   54:aload_1         
	//*  28   55:invokevirtual   #861 <Method boolean ArrayList.contains(Object)>
	//*  29   58:ifeq            95
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   30   61:new             #347 <Class StringBuilder>
	//   31   64:dup             
	//   32   65:invokespecial   #348 <Method void StringBuilder()>
	//   33   68:astore_3        
				stringbuilder1.append("Fragment already added: ");
	//   34   69:aload_3         
	//   35   70:ldc2            #863 <String "Fragment already added: ">
	//   36   73:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   37   76:pop             
				stringbuilder1.append(((Object) (fragment)));
	//   38   77:aload_3         
	//   39   78:aload_1         
	//   40   79:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//   41   82:pop             
				throw new IllegalStateException(stringbuilder1.toString());
	//   42   83:new             #338 <Class IllegalStateException>
	//   43   86:dup             
	//   44   87:aload_3         
	//   45   88:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   46   91:invokespecial   #343 <Method void IllegalStateException(String)>
	//   47   94:athrow          
			}
			synchronized(mAdded)
	//*  48   95:aload_0         
	//*  49   96:getfield        #166 <Field ArrayList mAdded>
	//*  50   99:astore_3        
	//*  51  100:aload_3         
	//*  52  101:monitorenter    
			{
				mAdded.add(((Object) (fragment)));
	//   53  102:aload_0         
	//   54  103:getfield        #166 <Field ArrayList mAdded>
	//   55  106:aload_1         
	//   56  107:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
	//   57  110:pop             
			}
	//   58  111:aload_3         
	//   59  112:monitorexit     
			fragment.mAdded = true;
	//   60  113:aload_1         
	//   61  114:iconst_1        
	//   62  115:putfield        #650 <Field boolean Fragment.mAdded>
			fragment.mRemoving = false;
	//   63  118:aload_1         
	//   64  119:iconst_0        
	//   65  120:putfield        #866 <Field boolean Fragment.mRemoving>
			if(fragment.mView == null)
	//*  66  123:aload_1         
	//*  67  124:getfield        #227 <Field View Fragment.mView>
	//*  68  127:ifnonnull       135
				fragment.mHiddenChanged = false;
	//   69  130:aload_1         
	//   70  131:iconst_0        
	//   71  132:putfield        #869 <Field boolean Fragment.mHiddenChanged>
			if(fragment.mHasMenu && fragment.mMenuVisible)
	//*  72  135:aload_1         
	//*  73  136:getfield        #872 <Field boolean Fragment.mHasMenu>
	//*  74  139:ifeq            154
	//*  75  142:aload_1         
	//*  76  143:getfield        #875 <Field boolean Fragment.mMenuVisible>
	//*  77  146:ifeq            154
				mNeedMenuInvalidate = true;
	//   78  149:aload_0         
	//   79  150:iconst_1        
	//   80  151:putfield        #877 <Field boolean mNeedMenuInvalidate>
			if(flag)
	//*  81  154:iload_2         
	//*  82  155:ifeq            169
			{
				moveToState(fragment);
	//   83  158:aload_0         
	//   84  159:aload_1         
	//   85  160:invokevirtual   #879 <Method void moveToState(Fragment)>
				return;
	//   86  163:return          
			}
		}
		break MISSING_BLOCK_LABEL_169;
		fragment;
	//   87  164:astore_1        
		arraylist;
	//   88  165:aload_3         
		JVM INSTR monitorexit ;
	//   89  166:monitorexit     
		throw fragment;
	//   90  167:aload_1         
	//   91  168:athrow          
	//   92  169:return          
	}

	public void addOnBackStackChangedListener(FragmentManager.OnBackStackChangedListener onbackstackchangedlistener)
	{
		if(mBackStackChangeListeners == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #883 <Field ArrayList mBackStackChangeListeners>
	//*   2    4:ifnonnull       18
			mBackStackChangeListeners = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #163 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #164 <Method void ArrayList()>
	//    7   15:putfield        #883 <Field ArrayList mBackStackChangeListeners>
		mBackStackChangeListeners.add(((Object) (onbackstackchangedlistener)));
	//    8   18:aload_0         
	//    9   19:getfield        #883 <Field ArrayList mBackStackChangeListeners>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
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
	//*   3    3:getfield        #887 <Field ArrayList mAvailBackStackIndices>
	//*   4    6:ifnull          111
	//*   5    9:aload_0         
	//*   6   10:getfield        #887 <Field ArrayList mAvailBackStackIndices>
	//*   7   13:invokevirtual   #204 <Method int ArrayList.size()>
	//*   8   16:ifgt            22
			break MISSING_BLOCK_LABEL_111;
	//    9   19:goto            111
		int i;
		i = ((Integer)mAvailBackStackIndices.remove(mAvailBackStackIndices.size() - 1)).intValue();
	//   10   22:aload_0         
	//   11   23:getfield        #887 <Field ArrayList mAvailBackStackIndices>
	//   12   26:aload_0         
	//   13   27:getfield        #887 <Field ArrayList mAvailBackStackIndices>
	//   14   30:invokevirtual   #204 <Method int ArrayList.size()>
	//   15   33:iconst_1        
	//   16   34:isub            
	//   17   35:invokevirtual   #553 <Method Object ArrayList.remove(int)>
	//   18   38:checkcast       #889 <Class Integer>
	//   19   41:invokevirtual   #892 <Method int Integer.intValue()>
	//   20   44:istore_2        
		if(DEBUG)
	//*  21   45:getstatic       #843 <Field boolean DEBUG>
	//*  22   48:ifeq            97
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   23   51:new             #347 <Class StringBuilder>
	//   24   54:dup             
	//   25   55:invokespecial   #348 <Method void StringBuilder()>
	//   26   58:astore_3        
			stringbuilder.append("Adding back stack index ");
	//   27   59:aload_3         
	//   28   60:ldc2            #894 <String "Adding back stack index ">
	//   29   63:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   30   66:pop             
			stringbuilder.append(i);
	//   31   67:aload_3         
	//   32   68:iload_2         
	//   33   69:invokevirtual   #897 <Method StringBuilder StringBuilder.append(int)>
	//   34   72:pop             
			stringbuilder.append(" with ");
	//   35   73:aload_3         
	//   36   74:ldc2            #899 <String " with ">
	//   37   77:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   38   80:pop             
			stringbuilder.append(((Object) (backstackrecord)));
	//   39   81:aload_3         
	//   40   82:aload_1         
	//   41   83:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//   42   86:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   43   87:ldc1            #72  <String "FragmentManager">
	//   44   89:aload_3         
	//   45   90:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   46   93:invokestatic    #851 <Method int Log.v(String, String)>
	//   47   96:pop             
		}
		mBackStackIndices.set(i, ((Object) (backstackrecord)));
	//   48   97:aload_0         
	//   49   98:getfield        #901 <Field ArrayList mBackStackIndices>
	//   50  101:iload_2         
	//   51  102:aload_1         
	//   52  103:invokevirtual   #905 <Method Object ArrayList.set(int, Object)>
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
	//*  59  112:getfield        #901 <Field ArrayList mBackStackIndices>
	//*  60  115:ifnonnull       129
			mBackStackIndices = new ArrayList();
	//   61  118:aload_0         
	//   62  119:new             #163 <Class ArrayList>
	//   63  122:dup             
	//   64  123:invokespecial   #164 <Method void ArrayList()>
	//   65  126:putfield        #901 <Field ArrayList mBackStackIndices>
		i = mBackStackIndices.size();
	//   66  129:aload_0         
	//   67  130:getfield        #901 <Field ArrayList mBackStackIndices>
	//   68  133:invokevirtual   #204 <Method int ArrayList.size()>
	//   69  136:istore_2        
		if(DEBUG)
	//*  70  137:getstatic       #843 <Field boolean DEBUG>
	//*  71  140:ifeq            189
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   72  143:new             #347 <Class StringBuilder>
	//   73  146:dup             
	//   74  147:invokespecial   #348 <Method void StringBuilder()>
	//   75  150:astore_3        
			stringbuilder1.append("Setting back stack index ");
	//   76  151:aload_3         
	//   77  152:ldc2            #907 <String "Setting back stack index ">
	//   78  155:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   79  158:pop             
			stringbuilder1.append(i);
	//   80  159:aload_3         
	//   81  160:iload_2         
	//   82  161:invokevirtual   #897 <Method StringBuilder StringBuilder.append(int)>
	//   83  164:pop             
			stringbuilder1.append(" to ");
	//   84  165:aload_3         
	//   85  166:ldc2            #909 <String " to ">
	//   86  169:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   87  172:pop             
			stringbuilder1.append(((Object) (backstackrecord)));
	//   88  173:aload_3         
	//   89  174:aload_1         
	//   90  175:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//   91  178:pop             
			Log.v("FragmentManager", stringbuilder1.toString());
	//   92  179:ldc1            #72  <String "FragmentManager">
	//   93  181:aload_3         
	//   94  182:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   95  185:invokestatic    #851 <Method int Log.v(String, String)>
	//   96  188:pop             
		}
		mBackStackIndices.add(((Object) (backstackrecord)));
	//   97  189:aload_0         
	//   98  190:getfield        #901 <Field ArrayList mBackStackIndices>
	//   99  193:aload_1         
	//  100  194:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
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
		if(mHost != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #444 <Field FragmentHostCallback mHost>
	//*   2    4:ifnull          18
		{
			throw new IllegalStateException("Already attached");
	//    3    7:new             #338 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #913 <String "Already attached">
	//    6   14:invokespecial   #343 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			mHost = fragmenthostcallback;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #444 <Field FragmentHostCallback mHost>
			mContainer = fragmentcontainer;
	//   11   23:aload_0         
	//   12   24:aload_2         
	//   13   25:putfield        #915 <Field FragmentContainer mContainer>
			mParent = fragment;
	//   14   28:aload_0         
	//   15   29:aload_3         
	//   16   30:putfield        #917 <Field Fragment mParent>
			return;
	//   17   33:return          
		}
	}

	public void attachFragment(Fragment fragment)
	{
		if(DEBUG)
	//*   0    0:getstatic       #843 <Field boolean DEBUG>
	//*   1    3:ifeq            38
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #347 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #348 <Method void StringBuilder()>
	//    5   13:astore_2        
			stringbuilder.append("attach: ");
	//    6   14:aload_2         
	//    7   15:ldc2            #920 <String "attach: ">
	//    8   18:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (fragment)));
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   14   28:ldc1            #72  <String "FragmentManager">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #851 <Method int Log.v(String, String)>
	//   18   37:pop             
		}
		if(fragment.mDetached)
	//*  19   38:aload_1         
	//*  20   39:getfield        #858 <Field boolean Fragment.mDetached>
	//*  21   42:ifeq            188
		{
			fragment.mDetached = false;
	//   22   45:aload_1         
	//   23   46:iconst_0        
	//   24   47:putfield        #858 <Field boolean Fragment.mDetached>
			if(!fragment.mAdded)
	//*  25   50:aload_1         
	//*  26   51:getfield        #650 <Field boolean Fragment.mAdded>
	//*  27   54:ifne            188
			{
				if(mAdded.contains(((Object) (fragment))))
	//*  28   57:aload_0         
	//*  29   58:getfield        #166 <Field ArrayList mAdded>
	//*  30   61:aload_1         
	//*  31   62:invokevirtual   #861 <Method boolean ArrayList.contains(Object)>
	//*  32   65:ifeq            102
				{
					StringBuilder stringbuilder1 = new StringBuilder();
	//   33   68:new             #347 <Class StringBuilder>
	//   34   71:dup             
	//   35   72:invokespecial   #348 <Method void StringBuilder()>
	//   36   75:astore_2        
					stringbuilder1.append("Fragment already added: ");
	//   37   76:aload_2         
	//   38   77:ldc2            #863 <String "Fragment already added: ">
	//   39   80:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   40   83:pop             
					stringbuilder1.append(((Object) (fragment)));
	//   41   84:aload_2         
	//   42   85:aload_1         
	//   43   86:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//   44   89:pop             
					throw new IllegalStateException(stringbuilder1.toString());
	//   45   90:new             #338 <Class IllegalStateException>
	//   46   93:dup             
	//   47   94:aload_2         
	//   48   95:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   49   98:invokespecial   #343 <Method void IllegalStateException(String)>
	//   50  101:athrow          
				}
				if(DEBUG)
	//*  51  102:getstatic       #843 <Field boolean DEBUG>
	//*  52  105:ifeq            140
				{
					StringBuilder stringbuilder2 = new StringBuilder();
	//   53  108:new             #347 <Class StringBuilder>
	//   54  111:dup             
	//   55  112:invokespecial   #348 <Method void StringBuilder()>
	//   56  115:astore_2        
					stringbuilder2.append("add from attach: ");
	//   57  116:aload_2         
	//   58  117:ldc2            #922 <String "add from attach: ">
	//   59  120:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   60  123:pop             
					stringbuilder2.append(((Object) (fragment)));
	//   61  124:aload_2         
	//   62  125:aload_1         
	//   63  126:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//   64  129:pop             
					Log.v("FragmentManager", stringbuilder2.toString());
	//   65  130:ldc1            #72  <String "FragmentManager">
	//   66  132:aload_2         
	//   67  133:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   68  136:invokestatic    #851 <Method int Log.v(String, String)>
	//   69  139:pop             
				}
				synchronized(mAdded)
	//*  70  140:aload_0         
	//*  71  141:getfield        #166 <Field ArrayList mAdded>
	//*  72  144:astore_2        
	//*  73  145:aload_2         
	//*  74  146:monitorenter    
				{
					mAdded.add(((Object) (fragment)));
	//   75  147:aload_0         
	//   76  148:getfield        #166 <Field ArrayList mAdded>
	//   77  151:aload_1         
	//   78  152:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
	//   79  155:pop             
				}
	//   80  156:aload_2         
	//   81  157:monitorexit     
				fragment.mAdded = true;
	//   82  158:aload_1         
	//   83  159:iconst_1        
	//   84  160:putfield        #650 <Field boolean Fragment.mAdded>
				if(fragment.mHasMenu && fragment.mMenuVisible)
	//*  85  163:aload_1         
	//*  86  164:getfield        #872 <Field boolean Fragment.mHasMenu>
	//*  87  167:ifeq            188
	//*  88  170:aload_1         
	//*  89  171:getfield        #875 <Field boolean Fragment.mMenuVisible>
	//*  90  174:ifeq            188
				{
					mNeedMenuInvalidate = true;
	//   91  177:aload_0         
	//   92  178:iconst_1        
	//   93  179:putfield        #877 <Field boolean mNeedMenuInvalidate>
					return;
	//   94  182:return          
				}
			}
		}
		break MISSING_BLOCK_LABEL_188;
		fragment;
	//   95  183:astore_1        
		arraylist;
	//   96  184:aload_2         
		JVM INSTR monitorexit ;
	//   97  185:monitorexit     
		throw fragment;
	//   98  186:aload_1         
	//   99  187:athrow          
	//  100  188:return          
	}

	public FragmentTransaction beginTransaction()
	{
		return ((FragmentTransaction) (new BackStackRecord(this)));
	//    0    0:new             #370 <Class BackStackRecord>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #925 <Method void BackStackRecord(FragmentManagerImpl)>
	//    4    8:areturn         
	}

	void completeShowHideFragment(final Fragment fragment)
	{
		if(fragment.mView != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #227 <Field View Fragment.mView>
	//*   2    4:ifnull          211
		{
			AnimationOrAnimator animationoranimator = loadAnimation(fragment, fragment.getNextTransition(), fragment.mHidden ^ true, fragment.getNextTransitionStyle());
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #219 <Method int Fragment.getNextTransition()>
	//    7   13:aload_1         
	//    8   14:getfield        #230 <Field boolean Fragment.mHidden>
	//    9   17:iconst_1        
	//   10   18:ixor            
	//   11   19:aload_1         
	//   12   20:invokevirtual   #929 <Method int Fragment.getNextTransitionStyle()>
	//   13   23:invokevirtual   #933 <Method FragmentManagerImpl$AnimationOrAnimator loadAnimation(Fragment, int, boolean, int)>
	//   14   26:astore_3        
			if(animationoranimator != null && animationoranimator.animator != null)
	//*  15   27:aload_3         
	//*  16   28:ifnull          139
	//*  17   31:aload_3         
	//*  18   32:getfield        #294 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//*  19   35:ifnull          139
			{
				animationoranimator.animator.setTarget(((Object) (fragment.mView)));
	//   20   38:aload_3         
	//   21   39:getfield        #294 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   22   42:aload_1         
	//   23   43:getfield        #227 <Field View Fragment.mView>
	//   24   46:invokevirtual   #311 <Method void Animator.setTarget(Object)>
				if(fragment.mHidden)
	//*  25   49:aload_1         
	//*  26   50:getfield        #230 <Field boolean Fragment.mHidden>
	//*  27   53:ifeq            113
				{
					if(fragment.isHideReplaced())
	//*  28   56:aload_1         
	//*  29   57:invokevirtual   #936 <Method boolean Fragment.isHideReplaced()>
	//*  30   60:ifeq            71
					{
						fragment.setHideReplaced(false);
	//   31   63:aload_1         
	//   32   64:iconst_0        
	//   33   65:invokevirtual   #939 <Method void Fragment.setHideReplaced(boolean)>
					} else
	//*  34   68:goto            121
					{
						final ViewGroup container = fragment.mContainer;
	//   35   71:aload_1         
	//   36   72:getfield        #247 <Field ViewGroup Fragment.mContainer>
	//   37   75:astore          4
						final View animatingView = fragment.mView;
	//   38   77:aload_1         
	//   39   78:getfield        #227 <Field View Fragment.mView>
	//   40   81:astore          5
						container.startViewTransition(animatingView);
	//   41   83:aload           4
	//   42   85:aload           5
	//   43   87:invokevirtual   #253 <Method void ViewGroup.startViewTransition(View)>
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
	//   45   91:getfield        #294 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   46   94:new             #16  <Class FragmentManagerImpl$4>
	//   47   97:dup             
	//   48   98:aload_0         
	//   49   99:aload           4
	//   50  101:aload           5
	//   51  103:aload_1         
	//   52  104:invokespecial   #940 <Method void FragmentManagerImpl$4(FragmentManagerImpl, ViewGroup, View, Fragment)>
	//   53  107:invokevirtual   #307 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
					}
				} else
	//*  54  110:goto            121
				{
					fragment.mView.setVisibility(0);
	//   55  113:aload_1         
	//   56  114:getfield        #227 <Field View Fragment.mView>
	//   57  117:iconst_0        
	//   58  118:invokevirtual   #943 <Method void View.setVisibility(int)>
				}
				setHWLayerAnimListenerIfAlpha(fragment.mView, animationoranimator);
	//   59  121:aload_1         
	//   60  122:getfield        #227 <Field View Fragment.mView>
	//   61  125:aload_3         
	//   62  126:invokestatic    #284 <Method void setHWLayerAnimListenerIfAlpha(View, FragmentManagerImpl$AnimationOrAnimator)>
				animationoranimator.animator.start();
	//   63  129:aload_3         
	//   64  130:getfield        #294 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   65  133:invokevirtual   #314 <Method void Animator.start()>
			} else
	//*  66  136:goto            211
			{
				if(animationoranimator != null)
	//*  67  139:aload_3         
	//*  68  140:ifnull          169
				{
					setHWLayerAnimListenerIfAlpha(fragment.mView, animationoranimator);
	//   69  143:aload_1         
	//   70  144:getfield        #227 <Field View Fragment.mView>
	//   71  147:aload_3         
	//   72  148:invokestatic    #284 <Method void setHWLayerAnimListenerIfAlpha(View, FragmentManagerImpl$AnimationOrAnimator)>
					fragment.mView.startAnimation(animationoranimator.animation);
	//   73  151:aload_1         
	//   74  152:getfield        #227 <Field View Fragment.mView>
	//   75  155:aload_3         
	//   76  156:getfield        #261 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   77  159:invokevirtual   #290 <Method void View.startAnimation(Animation)>
					animationoranimator.animation.start();
	//   78  162:aload_3         
	//   79  163:getfield        #261 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   80  166:invokevirtual   #944 <Method void Animation.start()>
				}
				byte byte0;
				if(fragment.mHidden && !fragment.isHideReplaced())
	//*  81  169:aload_1         
	//*  82  170:getfield        #230 <Field boolean Fragment.mHidden>
	//*  83  173:ifeq            189
	//*  84  176:aload_1         
	//*  85  177:invokevirtual   #936 <Method boolean Fragment.isHideReplaced()>
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
	//   93  192:getfield        #227 <Field View Fragment.mView>
	//   94  195:iload_2         
	//   95  196:invokevirtual   #943 <Method void View.setVisibility(int)>
				if(fragment.isHideReplaced())
	//*  96  199:aload_1         
	//*  97  200:invokevirtual   #936 <Method boolean Fragment.isHideReplaced()>
	//*  98  203:ifeq            211
					fragment.setHideReplaced(false);
	//   99  206:aload_1         
	//  100  207:iconst_0        
	//  101  208:invokevirtual   #939 <Method void Fragment.setHideReplaced(boolean)>
			}
		}
		if(fragment.mAdded && fragment.mHasMenu && fragment.mMenuVisible)
	//* 102  211:aload_1         
	//* 103  212:getfield        #650 <Field boolean Fragment.mAdded>
	//* 104  215:ifeq            237
	//* 105  218:aload_1         
	//* 106  219:getfield        #872 <Field boolean Fragment.mHasMenu>
	//* 107  222:ifeq            237
	//* 108  225:aload_1         
	//* 109  226:getfield        #875 <Field boolean Fragment.mMenuVisible>
	//* 110  229:ifeq            237
			mNeedMenuInvalidate = true;
	//  111  232:aload_0         
	//  112  233:iconst_1        
	//  113  234:putfield        #877 <Field boolean mNeedMenuInvalidate>
		fragment.mHiddenChanged = false;
	//  114  237:aload_1         
	//  115  238:iconst_0        
	//  116  239:putfield        #869 <Field boolean Fragment.mHiddenChanged>
		fragment.onHiddenChanged(fragment.mHidden);
	//  117  242:aload_1         
	//  118  243:aload_1         
	//  119  244:getfield        #230 <Field boolean Fragment.mHidden>
	//  120  247:invokevirtual   #947 <Method void Fragment.onHiddenChanged(boolean)>
	//  121  250:return          
	}

	public void detachFragment(Fragment fragment)
	{
		if(DEBUG)
	//*   0    0:getstatic       #843 <Field boolean DEBUG>
	//*   1    3:ifeq            38
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #347 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #348 <Method void StringBuilder()>
	//    5   13:astore_2        
			stringbuilder.append("detach: ");
	//    6   14:aload_2         
	//    7   15:ldc2            #950 <String "detach: ">
	//    8   18:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (fragment)));
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   14   28:ldc1            #72  <String "FragmentManager">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #851 <Method int Log.v(String, String)>
	//   18   37:pop             
		}
		if(!fragment.mDetached)
	//*  19   38:aload_1         
	//*  20   39:getfield        #858 <Field boolean Fragment.mDetached>
	//*  21   42:ifne            143
		{
			fragment.mDetached = true;
	//   22   45:aload_1         
	//   23   46:iconst_1        
	//   24   47:putfield        #858 <Field boolean Fragment.mDetached>
			if(fragment.mAdded)
	//*  25   50:aload_1         
	//*  26   51:getfield        #650 <Field boolean Fragment.mAdded>
	//*  27   54:ifeq            143
			{
				if(DEBUG)
	//*  28   57:getstatic       #843 <Field boolean DEBUG>
	//*  29   60:ifeq            95
				{
					StringBuilder stringbuilder1 = new StringBuilder();
	//   30   63:new             #347 <Class StringBuilder>
	//   31   66:dup             
	//   32   67:invokespecial   #348 <Method void StringBuilder()>
	//   33   70:astore_2        
					stringbuilder1.append("remove from detach: ");
	//   34   71:aload_2         
	//   35   72:ldc2            #952 <String "remove from detach: ">
	//   36   75:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   37   78:pop             
					stringbuilder1.append(((Object) (fragment)));
	//   38   79:aload_2         
	//   39   80:aload_1         
	//   40   81:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//   41   84:pop             
					Log.v("FragmentManager", stringbuilder1.toString());
	//   42   85:ldc1            #72  <String "FragmentManager">
	//   43   87:aload_2         
	//   44   88:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   45   91:invokestatic    #851 <Method int Log.v(String, String)>
	//   46   94:pop             
				}
				synchronized(mAdded)
	//*  47   95:aload_0         
	//*  48   96:getfield        #166 <Field ArrayList mAdded>
	//*  49   99:astore_2        
	//*  50  100:aload_2         
	//*  51  101:monitorenter    
				{
					mAdded.remove(((Object) (fragment)));
	//   52  102:aload_0         
	//   53  103:getfield        #166 <Field ArrayList mAdded>
	//   54  106:aload_1         
	//   55  107:invokevirtual   #954 <Method boolean ArrayList.remove(Object)>
	//   56  110:pop             
				}
	//   57  111:aload_2         
	//   58  112:monitorexit     
				if(fragment.mHasMenu && fragment.mMenuVisible)
	//*  59  113:aload_1         
	//*  60  114:getfield        #872 <Field boolean Fragment.mHasMenu>
	//*  61  117:ifeq            132
	//*  62  120:aload_1         
	//*  63  121:getfield        #875 <Field boolean Fragment.mMenuVisible>
	//*  64  124:ifeq            132
					mNeedMenuInvalidate = true;
	//   65  127:aload_0         
	//   66  128:iconst_1        
	//   67  129:putfield        #877 <Field boolean mNeedMenuInvalidate>
				fragment.mAdded = false;
	//   68  132:aload_1         
	//   69  133:iconst_0        
	//   70  134:putfield        #650 <Field boolean Fragment.mAdded>
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
	//    2    2:putfield        #957 <Field boolean mStateSaved>
		mStopped = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #959 <Field boolean mStopped>
		dispatchStateChange(2);
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:invokespecial   #961 <Method void dispatchStateChange(int)>
	//    9   15:return          
	}

	public void dispatchConfigurationChanged(Configuration configuration)
	{
		for(int i = 0; i < mAdded.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #166 <Field ArrayList mAdded>
	//*   5    7:invokevirtual   #204 <Method int ArrayList.size()>
	//*   6   10:icmpge          41
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #166 <Field ArrayList mAdded>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #210 <Class Fragment>
	//   12   24:astore_3        
			if(fragment != null)
	//*  13   25:aload_3         
	//*  14   26:ifnull          34
				fragment.performConfigurationChanged(configuration);
	//   15   29:aload_3         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #966 <Method void Fragment.performConfigurationChanged(Configuration)>
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
	//*   1    1:getfield        #173 <Field int mCurState>
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
	//*  10   14:getfield        #166 <Field ArrayList mAdded>
	//*  11   17:invokevirtual   #204 <Method int ArrayList.size()>
	//*  12   20:icmpge          56
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//   13   23:aload_0         
	//   14   24:getfield        #166 <Field ArrayList mAdded>
	//   15   27:iload_2         
	//   16   28:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//   17   31:checkcast       #210 <Class Fragment>
	//   18   34:astore_3        
			if(fragment != null && fragment.performContextItemSelected(menuitem))
	//*  19   35:aload_3         
	//*  20   36:ifnull          49
	//*  21   39:aload_3         
	//*  22   40:aload_1         
	//*  23   41:invokevirtual   #971 <Method boolean Fragment.performContextItemSelected(MenuItem)>
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
	//    2    2:putfield        #957 <Field boolean mStateSaved>
		mStopped = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #959 <Field boolean mStopped>
		dispatchStateChange(1);
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:invokespecial   #961 <Method void dispatchStateChange(int)>
	//    9   15:return          
	}

	public boolean dispatchCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #806 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #976 <String "d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #979 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	public void dispatchDestroy()
	{
		mDestroyed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #982 <Field boolean mDestroyed>
		execPendingActions();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #414 <Method boolean execPendingActions()>
	//    5    9:pop             
		dispatchStateChange(0);
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:invokespecial   #961 <Method void dispatchStateChange(int)>
		mHost = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #444 <Field FragmentHostCallback mHost>
		mContainer = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #915 <Field FragmentContainer mContainer>
		mParent = null;
	//   15   25:aload_0         
	//   16   26:aconst_null     
	//   17   27:putfield        #917 <Field Fragment mParent>
	//   18   30:return          
	}

	public void dispatchDestroyView()
	{
		dispatchStateChange(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #961 <Method void dispatchStateChange(int)>
	//    3    5:return          
	}

	public void dispatchLowMemory()
	{
		for(int i = 0; i < mAdded.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #166 <Field ArrayList mAdded>
	//*   5    7:invokevirtual   #204 <Method int ArrayList.size()>
	//*   6   10:icmpge          40
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #166 <Field ArrayList mAdded>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #210 <Class Fragment>
	//   12   24:astore_2        
			if(fragment != null)
	//*  13   25:aload_2         
	//*  14   26:ifnull          33
				fragment.performLowMemory();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #987 <Method void Fragment.performLowMemory()>
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
	//*   1    1:getfield        #166 <Field ArrayList mAdded>
	//*   2    4:invokevirtual   #204 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            42
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    8   14:aload_0         
	//    9   15:getfield        #166 <Field ArrayList mAdded>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #210 <Class Fragment>
	//   13   25:astore_3        
			if(fragment != null)
	//*  14   26:aload_3         
	//*  15   27:ifnull          35
				fragment.performMultiWindowModeChanged(flag);
	//   16   30:aload_3         
	//   17   31:iload_1         
	//   18   32:invokevirtual   #991 <Method void Fragment.performMultiWindowModeChanged(boolean)>
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
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #917 <Field Fragment mParent>
	//*   2    4:ifnull          35
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #917 <Field Fragment mParent>
	//    5   11:invokevirtual   #996 <Method FragmentManager Fragment.getFragmentManager()>
	//    6   14:astore          4
			if(fragmentmanager instanceof FragmentManagerImpl)
	//*   7   16:aload           4
	//*   8   18:instanceof      #2   <Class FragmentManagerImpl>
	//*   9   21:ifeq            35
				((FragmentManagerImpl)fragmentmanager).dispatchOnFragmentActivityCreated(fragment, bundle, true);
	//   10   24:aload           4
	//   11   26:checkcast       #2   <Class FragmentManagerImpl>
	//   12   29:aload_1         
	//   13   30:aload_2         
	//   14   31:iconst_1        
	//   15   32:invokevirtual   #998 <Method void dispatchOnFragmentActivityCreated(Fragment, Bundle, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   16   35:aload_0         
	//   17   36:getfield        #171 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   39:invokevirtual   #999 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   42:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   20   44:aload           4
	//   21   46:invokeinterface #772 <Method boolean Iterator.hasNext()>
	//   22   51:ifeq            101
			Pair pair = (Pair)iterator.next();
	//   23   54:aload           4
	//   24   56:invokeinterface #776 <Method Object Iterator.next()>
	//   25   61:checkcast       #1001 <Class Pair>
	//   26   64:astore          5
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  27   66:iload_3         
	//*  28   67:ifeq            84
	//*  29   70:aload           5
	//*  30   72:getfield        #1005 <Field Object Pair.second>
	//*  31   75:checkcast       #382 <Class Boolean>
	//*  32   78:invokevirtual   #475 <Method boolean Boolean.booleanValue()>
	//*  33   81:ifeq            44
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentActivityCreated(((FragmentManager) (this)), fragment, bundle);
	//   34   84:aload           5
	//   35   86:getfield        #1008 <Field Object Pair.first>
	//   36   89:checkcast       #1010 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   37   92:aload_0         
	//   38   93:aload_1         
	//   39   94:aload_2         
	//   40   95:invokevirtual   #1014 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentActivityCreated(FragmentManager, Fragment, Bundle)>
		} while(true);
	//   41   98:goto            44
	//   42  101:return          
	}

	void dispatchOnFragmentAttached(Fragment fragment, Context context, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #917 <Field Fragment mParent>
	//*   2    4:ifnull          35
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #917 <Field Fragment mParent>
	//    5   11:invokevirtual   #996 <Method FragmentManager Fragment.getFragmentManager()>
	//    6   14:astore          4
			if(fragmentmanager instanceof FragmentManagerImpl)
	//*   7   16:aload           4
	//*   8   18:instanceof      #2   <Class FragmentManagerImpl>
	//*   9   21:ifeq            35
				((FragmentManagerImpl)fragmentmanager).dispatchOnFragmentAttached(fragment, context, true);
	//   10   24:aload           4
	//   11   26:checkcast       #2   <Class FragmentManagerImpl>
	//   12   29:aload_1         
	//   13   30:aload_2         
	//   14   31:iconst_1        
	//   15   32:invokevirtual   #1018 <Method void dispatchOnFragmentAttached(Fragment, Context, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   16   35:aload_0         
	//   17   36:getfield        #171 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   39:invokevirtual   #999 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   42:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   20   44:aload           4
	//   21   46:invokeinterface #772 <Method boolean Iterator.hasNext()>
	//   22   51:ifeq            101
			Pair pair = (Pair)iterator.next();
	//   23   54:aload           4
	//   24   56:invokeinterface #776 <Method Object Iterator.next()>
	//   25   61:checkcast       #1001 <Class Pair>
	//   26   64:astore          5
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  27   66:iload_3         
	//*  28   67:ifeq            84
	//*  29   70:aload           5
	//*  30   72:getfield        #1005 <Field Object Pair.second>
	//*  31   75:checkcast       #382 <Class Boolean>
	//*  32   78:invokevirtual   #475 <Method boolean Boolean.booleanValue()>
	//*  33   81:ifeq            44
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentAttached(((FragmentManager) (this)), fragment, context);
	//   34   84:aload           5
	//   35   86:getfield        #1008 <Field Object Pair.first>
	//   36   89:checkcast       #1010 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   37   92:aload_0         
	//   38   93:aload_1         
	//   39   94:aload_2         
	//   40   95:invokevirtual   #1022 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentAttached(FragmentManager, Fragment, Context)>
		} while(true);
	//   41   98:goto            44
	//   42  101:return          
	}

	void dispatchOnFragmentCreated(Fragment fragment, Bundle bundle, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #917 <Field Fragment mParent>
	//*   2    4:ifnull          35
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #917 <Field Fragment mParent>
	//    5   11:invokevirtual   #996 <Method FragmentManager Fragment.getFragmentManager()>
	//    6   14:astore          4
			if(fragmentmanager instanceof FragmentManagerImpl)
	//*   7   16:aload           4
	//*   8   18:instanceof      #2   <Class FragmentManagerImpl>
	//*   9   21:ifeq            35
				((FragmentManagerImpl)fragmentmanager).dispatchOnFragmentCreated(fragment, bundle, true);
	//   10   24:aload           4
	//   11   26:checkcast       #2   <Class FragmentManagerImpl>
	//   12   29:aload_1         
	//   13   30:aload_2         
	//   14   31:iconst_1        
	//   15   32:invokevirtual   #1025 <Method void dispatchOnFragmentCreated(Fragment, Bundle, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   16   35:aload_0         
	//   17   36:getfield        #171 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   39:invokevirtual   #999 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   42:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   20   44:aload           4
	//   21   46:invokeinterface #772 <Method boolean Iterator.hasNext()>
	//   22   51:ifeq            101
			Pair pair = (Pair)iterator.next();
	//   23   54:aload           4
	//   24   56:invokeinterface #776 <Method Object Iterator.next()>
	//   25   61:checkcast       #1001 <Class Pair>
	//   26   64:astore          5
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  27   66:iload_3         
	//*  28   67:ifeq            84
	//*  29   70:aload           5
	//*  30   72:getfield        #1005 <Field Object Pair.second>
	//*  31   75:checkcast       #382 <Class Boolean>
	//*  32   78:invokevirtual   #475 <Method boolean Boolean.booleanValue()>
	//*  33   81:ifeq            44
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentCreated(((FragmentManager) (this)), fragment, bundle);
	//   34   84:aload           5
	//   35   86:getfield        #1008 <Field Object Pair.first>
	//   36   89:checkcast       #1010 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   37   92:aload_0         
	//   38   93:aload_1         
	//   39   94:aload_2         
	//   40   95:invokevirtual   #1028 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentCreated(FragmentManager, Fragment, Bundle)>
		} while(true);
	//   41   98:goto            44
	//   42  101:return          
	}

	void dispatchOnFragmentDestroyed(Fragment fragment, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #917 <Field Fragment mParent>
	//*   2    4:ifnull          31
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #917 <Field Fragment mParent>
	//    5   11:invokevirtual   #996 <Method FragmentManager Fragment.getFragmentManager()>
	//    6   14:astore_3        
			if(fragmentmanager instanceof FragmentManagerImpl)
	//*   7   15:aload_3         
	//*   8   16:instanceof      #2   <Class FragmentManagerImpl>
	//*   9   19:ifeq            31
				((FragmentManagerImpl)fragmentmanager).dispatchOnFragmentDestroyed(fragment, true);
	//   10   22:aload_3         
	//   11   23:checkcast       #2   <Class FragmentManagerImpl>
	//   12   26:aload_1         
	//   13   27:iconst_1        
	//   14   28:invokevirtual   #1031 <Method void dispatchOnFragmentDestroyed(Fragment, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   15   31:aload_0         
	//   16   32:getfield        #171 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   17   35:invokevirtual   #999 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   18   38:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   19   39:aload_3         
	//   20   40:invokeinterface #772 <Method boolean Iterator.hasNext()>
	//   21   45:ifeq            93
			Pair pair = (Pair)iterator.next();
	//   22   48:aload_3         
	//   23   49:invokeinterface #776 <Method Object Iterator.next()>
	//   24   54:checkcast       #1001 <Class Pair>
	//   25   57:astore          4
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  26   59:iload_2         
	//*  27   60:ifeq            77
	//*  28   63:aload           4
	//*  29   65:getfield        #1005 <Field Object Pair.second>
	//*  30   68:checkcast       #382 <Class Boolean>
	//*  31   71:invokevirtual   #475 <Method boolean Boolean.booleanValue()>
	//*  32   74:ifeq            39
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentDestroyed(((FragmentManager) (this)), fragment);
	//   33   77:aload           4
	//   34   79:getfield        #1008 <Field Object Pair.first>
	//   35   82:checkcast       #1010 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   36   85:aload_0         
	//   37   86:aload_1         
	//   38   87:invokevirtual   #1035 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentDestroyed(FragmentManager, Fragment)>
		} while(true);
	//   39   90:goto            39
	//   40   93:return          
	}

	void dispatchOnFragmentDetached(Fragment fragment, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #917 <Field Fragment mParent>
	//*   2    4:ifnull          31
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #917 <Field Fragment mParent>
	//    5   11:invokevirtual   #996 <Method FragmentManager Fragment.getFragmentManager()>
	//    6   14:astore_3        
			if(fragmentmanager instanceof FragmentManagerImpl)
	//*   7   15:aload_3         
	//*   8   16:instanceof      #2   <Class FragmentManagerImpl>
	//*   9   19:ifeq            31
				((FragmentManagerImpl)fragmentmanager).dispatchOnFragmentDetached(fragment, true);
	//   10   22:aload_3         
	//   11   23:checkcast       #2   <Class FragmentManagerImpl>
	//   12   26:aload_1         
	//   13   27:iconst_1        
	//   14   28:invokevirtual   #1038 <Method void dispatchOnFragmentDetached(Fragment, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   15   31:aload_0         
	//   16   32:getfield        #171 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   17   35:invokevirtual   #999 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   18   38:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   19   39:aload_3         
	//   20   40:invokeinterface #772 <Method boolean Iterator.hasNext()>
	//   21   45:ifeq            93
			Pair pair = (Pair)iterator.next();
	//   22   48:aload_3         
	//   23   49:invokeinterface #776 <Method Object Iterator.next()>
	//   24   54:checkcast       #1001 <Class Pair>
	//   25   57:astore          4
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  26   59:iload_2         
	//*  27   60:ifeq            77
	//*  28   63:aload           4
	//*  29   65:getfield        #1005 <Field Object Pair.second>
	//*  30   68:checkcast       #382 <Class Boolean>
	//*  31   71:invokevirtual   #475 <Method boolean Boolean.booleanValue()>
	//*  32   74:ifeq            39
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentDetached(((FragmentManager) (this)), fragment);
	//   33   77:aload           4
	//   34   79:getfield        #1008 <Field Object Pair.first>
	//   35   82:checkcast       #1010 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   36   85:aload_0         
	//   37   86:aload_1         
	//   38   87:invokevirtual   #1041 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentDetached(FragmentManager, Fragment)>
		} while(true);
	//   39   90:goto            39
	//   40   93:return          
	}

	void dispatchOnFragmentPaused(Fragment fragment, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #917 <Field Fragment mParent>
	//*   2    4:ifnull          31
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #917 <Field Fragment mParent>
	//    5   11:invokevirtual   #996 <Method FragmentManager Fragment.getFragmentManager()>
	//    6   14:astore_3        
			if(fragmentmanager instanceof FragmentManagerImpl)
	//*   7   15:aload_3         
	//*   8   16:instanceof      #2   <Class FragmentManagerImpl>
	//*   9   19:ifeq            31
				((FragmentManagerImpl)fragmentmanager).dispatchOnFragmentPaused(fragment, true);
	//   10   22:aload_3         
	//   11   23:checkcast       #2   <Class FragmentManagerImpl>
	//   12   26:aload_1         
	//   13   27:iconst_1        
	//   14   28:invokevirtual   #1044 <Method void dispatchOnFragmentPaused(Fragment, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   15   31:aload_0         
	//   16   32:getfield        #171 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   17   35:invokevirtual   #999 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   18   38:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   19   39:aload_3         
	//   20   40:invokeinterface #772 <Method boolean Iterator.hasNext()>
	//   21   45:ifeq            93
			Pair pair = (Pair)iterator.next();
	//   22   48:aload_3         
	//   23   49:invokeinterface #776 <Method Object Iterator.next()>
	//   24   54:checkcast       #1001 <Class Pair>
	//   25   57:astore          4
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  26   59:iload_2         
	//*  27   60:ifeq            77
	//*  28   63:aload           4
	//*  29   65:getfield        #1005 <Field Object Pair.second>
	//*  30   68:checkcast       #382 <Class Boolean>
	//*  31   71:invokevirtual   #475 <Method boolean Boolean.booleanValue()>
	//*  32   74:ifeq            39
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentPaused(((FragmentManager) (this)), fragment);
	//   33   77:aload           4
	//   34   79:getfield        #1008 <Field Object Pair.first>
	//   35   82:checkcast       #1010 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   36   85:aload_0         
	//   37   86:aload_1         
	//   38   87:invokevirtual   #1047 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentPaused(FragmentManager, Fragment)>
		} while(true);
	//   39   90:goto            39
	//   40   93:return          
	}

	void dispatchOnFragmentPreAttached(Fragment fragment, Context context, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #917 <Field Fragment mParent>
	//*   2    4:ifnull          35
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #917 <Field Fragment mParent>
	//    5   11:invokevirtual   #996 <Method FragmentManager Fragment.getFragmentManager()>
	//    6   14:astore          4
			if(fragmentmanager instanceof FragmentManagerImpl)
	//*   7   16:aload           4
	//*   8   18:instanceof      #2   <Class FragmentManagerImpl>
	//*   9   21:ifeq            35
				((FragmentManagerImpl)fragmentmanager).dispatchOnFragmentPreAttached(fragment, context, true);
	//   10   24:aload           4
	//   11   26:checkcast       #2   <Class FragmentManagerImpl>
	//   12   29:aload_1         
	//   13   30:aload_2         
	//   14   31:iconst_1        
	//   15   32:invokevirtual   #1050 <Method void dispatchOnFragmentPreAttached(Fragment, Context, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   16   35:aload_0         
	//   17   36:getfield        #171 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   39:invokevirtual   #999 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   42:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   20   44:aload           4
	//   21   46:invokeinterface #772 <Method boolean Iterator.hasNext()>
	//   22   51:ifeq            101
			Pair pair = (Pair)iterator.next();
	//   23   54:aload           4
	//   24   56:invokeinterface #776 <Method Object Iterator.next()>
	//   25   61:checkcast       #1001 <Class Pair>
	//   26   64:astore          5
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  27   66:iload_3         
	//*  28   67:ifeq            84
	//*  29   70:aload           5
	//*  30   72:getfield        #1005 <Field Object Pair.second>
	//*  31   75:checkcast       #382 <Class Boolean>
	//*  32   78:invokevirtual   #475 <Method boolean Boolean.booleanValue()>
	//*  33   81:ifeq            44
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentPreAttached(((FragmentManager) (this)), fragment, context);
	//   34   84:aload           5
	//   35   86:getfield        #1008 <Field Object Pair.first>
	//   36   89:checkcast       #1010 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   37   92:aload_0         
	//   38   93:aload_1         
	//   39   94:aload_2         
	//   40   95:invokevirtual   #1053 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentPreAttached(FragmentManager, Fragment, Context)>
		} while(true);
	//   41   98:goto            44
	//   42  101:return          
	}

	void dispatchOnFragmentPreCreated(Fragment fragment, Bundle bundle, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #917 <Field Fragment mParent>
	//*   2    4:ifnull          35
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #917 <Field Fragment mParent>
	//    5   11:invokevirtual   #996 <Method FragmentManager Fragment.getFragmentManager()>
	//    6   14:astore          4
			if(fragmentmanager instanceof FragmentManagerImpl)
	//*   7   16:aload           4
	//*   8   18:instanceof      #2   <Class FragmentManagerImpl>
	//*   9   21:ifeq            35
				((FragmentManagerImpl)fragmentmanager).dispatchOnFragmentPreCreated(fragment, bundle, true);
	//   10   24:aload           4
	//   11   26:checkcast       #2   <Class FragmentManagerImpl>
	//   12   29:aload_1         
	//   13   30:aload_2         
	//   14   31:iconst_1        
	//   15   32:invokevirtual   #1056 <Method void dispatchOnFragmentPreCreated(Fragment, Bundle, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   16   35:aload_0         
	//   17   36:getfield        #171 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   39:invokevirtual   #999 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   42:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   20   44:aload           4
	//   21   46:invokeinterface #772 <Method boolean Iterator.hasNext()>
	//   22   51:ifeq            101
			Pair pair = (Pair)iterator.next();
	//   23   54:aload           4
	//   24   56:invokeinterface #776 <Method Object Iterator.next()>
	//   25   61:checkcast       #1001 <Class Pair>
	//   26   64:astore          5
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  27   66:iload_3         
	//*  28   67:ifeq            84
	//*  29   70:aload           5
	//*  30   72:getfield        #1005 <Field Object Pair.second>
	//*  31   75:checkcast       #382 <Class Boolean>
	//*  32   78:invokevirtual   #475 <Method boolean Boolean.booleanValue()>
	//*  33   81:ifeq            44
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentPreCreated(((FragmentManager) (this)), fragment, bundle);
	//   34   84:aload           5
	//   35   86:getfield        #1008 <Field Object Pair.first>
	//   36   89:checkcast       #1010 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   37   92:aload_0         
	//   38   93:aload_1         
	//   39   94:aload_2         
	//   40   95:invokevirtual   #1059 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentPreCreated(FragmentManager, Fragment, Bundle)>
		} while(true);
	//   41   98:goto            44
	//   42  101:return          
	}

	void dispatchOnFragmentResumed(Fragment fragment, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #917 <Field Fragment mParent>
	//*   2    4:ifnull          31
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #917 <Field Fragment mParent>
	//    5   11:invokevirtual   #996 <Method FragmentManager Fragment.getFragmentManager()>
	//    6   14:astore_3        
			if(fragmentmanager instanceof FragmentManagerImpl)
	//*   7   15:aload_3         
	//*   8   16:instanceof      #2   <Class FragmentManagerImpl>
	//*   9   19:ifeq            31
				((FragmentManagerImpl)fragmentmanager).dispatchOnFragmentResumed(fragment, true);
	//   10   22:aload_3         
	//   11   23:checkcast       #2   <Class FragmentManagerImpl>
	//   12   26:aload_1         
	//   13   27:iconst_1        
	//   14   28:invokevirtual   #1062 <Method void dispatchOnFragmentResumed(Fragment, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   15   31:aload_0         
	//   16   32:getfield        #171 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   17   35:invokevirtual   #999 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   18   38:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   19   39:aload_3         
	//   20   40:invokeinterface #772 <Method boolean Iterator.hasNext()>
	//   21   45:ifeq            93
			Pair pair = (Pair)iterator.next();
	//   22   48:aload_3         
	//   23   49:invokeinterface #776 <Method Object Iterator.next()>
	//   24   54:checkcast       #1001 <Class Pair>
	//   25   57:astore          4
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  26   59:iload_2         
	//*  27   60:ifeq            77
	//*  28   63:aload           4
	//*  29   65:getfield        #1005 <Field Object Pair.second>
	//*  30   68:checkcast       #382 <Class Boolean>
	//*  31   71:invokevirtual   #475 <Method boolean Boolean.booleanValue()>
	//*  32   74:ifeq            39
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentResumed(((FragmentManager) (this)), fragment);
	//   33   77:aload           4
	//   34   79:getfield        #1008 <Field Object Pair.first>
	//   35   82:checkcast       #1010 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   36   85:aload_0         
	//   37   86:aload_1         
	//   38   87:invokevirtual   #1065 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentResumed(FragmentManager, Fragment)>
		} while(true);
	//   39   90:goto            39
	//   40   93:return          
	}

	void dispatchOnFragmentSaveInstanceState(Fragment fragment, Bundle bundle, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #917 <Field Fragment mParent>
	//*   2    4:ifnull          35
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #917 <Field Fragment mParent>
	//    5   11:invokevirtual   #996 <Method FragmentManager Fragment.getFragmentManager()>
	//    6   14:astore          4
			if(fragmentmanager instanceof FragmentManagerImpl)
	//*   7   16:aload           4
	//*   8   18:instanceof      #2   <Class FragmentManagerImpl>
	//*   9   21:ifeq            35
				((FragmentManagerImpl)fragmentmanager).dispatchOnFragmentSaveInstanceState(fragment, bundle, true);
	//   10   24:aload           4
	//   11   26:checkcast       #2   <Class FragmentManagerImpl>
	//   12   29:aload_1         
	//   13   30:aload_2         
	//   14   31:iconst_1        
	//   15   32:invokevirtual   #1068 <Method void dispatchOnFragmentSaveInstanceState(Fragment, Bundle, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   16   35:aload_0         
	//   17   36:getfield        #171 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   39:invokevirtual   #999 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   42:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   20   44:aload           4
	//   21   46:invokeinterface #772 <Method boolean Iterator.hasNext()>
	//   22   51:ifeq            101
			Pair pair = (Pair)iterator.next();
	//   23   54:aload           4
	//   24   56:invokeinterface #776 <Method Object Iterator.next()>
	//   25   61:checkcast       #1001 <Class Pair>
	//   26   64:astore          5
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  27   66:iload_3         
	//*  28   67:ifeq            84
	//*  29   70:aload           5
	//*  30   72:getfield        #1005 <Field Object Pair.second>
	//*  31   75:checkcast       #382 <Class Boolean>
	//*  32   78:invokevirtual   #475 <Method boolean Boolean.booleanValue()>
	//*  33   81:ifeq            44
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentSaveInstanceState(((FragmentManager) (this)), fragment, bundle);
	//   34   84:aload           5
	//   35   86:getfield        #1008 <Field Object Pair.first>
	//   36   89:checkcast       #1010 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   37   92:aload_0         
	//   38   93:aload_1         
	//   39   94:aload_2         
	//   40   95:invokevirtual   #1071 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentSaveInstanceState(FragmentManager, Fragment, Bundle)>
		} while(true);
	//   41   98:goto            44
	//   42  101:return          
	}

	void dispatchOnFragmentStarted(Fragment fragment, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #917 <Field Fragment mParent>
	//*   2    4:ifnull          31
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #917 <Field Fragment mParent>
	//    5   11:invokevirtual   #996 <Method FragmentManager Fragment.getFragmentManager()>
	//    6   14:astore_3        
			if(fragmentmanager instanceof FragmentManagerImpl)
	//*   7   15:aload_3         
	//*   8   16:instanceof      #2   <Class FragmentManagerImpl>
	//*   9   19:ifeq            31
				((FragmentManagerImpl)fragmentmanager).dispatchOnFragmentStarted(fragment, true);
	//   10   22:aload_3         
	//   11   23:checkcast       #2   <Class FragmentManagerImpl>
	//   12   26:aload_1         
	//   13   27:iconst_1        
	//   14   28:invokevirtual   #1074 <Method void dispatchOnFragmentStarted(Fragment, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   15   31:aload_0         
	//   16   32:getfield        #171 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   17   35:invokevirtual   #999 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   18   38:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   19   39:aload_3         
	//   20   40:invokeinterface #772 <Method boolean Iterator.hasNext()>
	//   21   45:ifeq            93
			Pair pair = (Pair)iterator.next();
	//   22   48:aload_3         
	//   23   49:invokeinterface #776 <Method Object Iterator.next()>
	//   24   54:checkcast       #1001 <Class Pair>
	//   25   57:astore          4
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  26   59:iload_2         
	//*  27   60:ifeq            77
	//*  28   63:aload           4
	//*  29   65:getfield        #1005 <Field Object Pair.second>
	//*  30   68:checkcast       #382 <Class Boolean>
	//*  31   71:invokevirtual   #475 <Method boolean Boolean.booleanValue()>
	//*  32   74:ifeq            39
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentStarted(((FragmentManager) (this)), fragment);
	//   33   77:aload           4
	//   34   79:getfield        #1008 <Field Object Pair.first>
	//   35   82:checkcast       #1010 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   36   85:aload_0         
	//   37   86:aload_1         
	//   38   87:invokevirtual   #1077 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentStarted(FragmentManager, Fragment)>
		} while(true);
	//   39   90:goto            39
	//   40   93:return          
	}

	void dispatchOnFragmentStopped(Fragment fragment, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #917 <Field Fragment mParent>
	//*   2    4:ifnull          31
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #917 <Field Fragment mParent>
	//    5   11:invokevirtual   #996 <Method FragmentManager Fragment.getFragmentManager()>
	//    6   14:astore_3        
			if(fragmentmanager instanceof FragmentManagerImpl)
	//*   7   15:aload_3         
	//*   8   16:instanceof      #2   <Class FragmentManagerImpl>
	//*   9   19:ifeq            31
				((FragmentManagerImpl)fragmentmanager).dispatchOnFragmentStopped(fragment, true);
	//   10   22:aload_3         
	//   11   23:checkcast       #2   <Class FragmentManagerImpl>
	//   12   26:aload_1         
	//   13   27:iconst_1        
	//   14   28:invokevirtual   #1080 <Method void dispatchOnFragmentStopped(Fragment, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   15   31:aload_0         
	//   16   32:getfield        #171 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   17   35:invokevirtual   #999 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   18   38:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   19   39:aload_3         
	//   20   40:invokeinterface #772 <Method boolean Iterator.hasNext()>
	//   21   45:ifeq            93
			Pair pair = (Pair)iterator.next();
	//   22   48:aload_3         
	//   23   49:invokeinterface #776 <Method Object Iterator.next()>
	//   24   54:checkcast       #1001 <Class Pair>
	//   25   57:astore          4
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  26   59:iload_2         
	//*  27   60:ifeq            77
	//*  28   63:aload           4
	//*  29   65:getfield        #1005 <Field Object Pair.second>
	//*  30   68:checkcast       #382 <Class Boolean>
	//*  31   71:invokevirtual   #475 <Method boolean Boolean.booleanValue()>
	//*  32   74:ifeq            39
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentStopped(((FragmentManager) (this)), fragment);
	//   33   77:aload           4
	//   34   79:getfield        #1008 <Field Object Pair.first>
	//   35   82:checkcast       #1010 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   36   85:aload_0         
	//   37   86:aload_1         
	//   38   87:invokevirtual   #1083 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentStopped(FragmentManager, Fragment)>
		} while(true);
	//   39   90:goto            39
	//   40   93:return          
	}

	void dispatchOnFragmentViewCreated(Fragment fragment, View view, Bundle bundle, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #917 <Field Fragment mParent>
	//*   2    4:ifnull          36
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #917 <Field Fragment mParent>
	//    5   11:invokevirtual   #996 <Method FragmentManager Fragment.getFragmentManager()>
	//    6   14:astore          5
			if(fragmentmanager instanceof FragmentManagerImpl)
	//*   7   16:aload           5
	//*   8   18:instanceof      #2   <Class FragmentManagerImpl>
	//*   9   21:ifeq            36
				((FragmentManagerImpl)fragmentmanager).dispatchOnFragmentViewCreated(fragment, view, bundle, true);
	//   10   24:aload           5
	//   11   26:checkcast       #2   <Class FragmentManagerImpl>
	//   12   29:aload_1         
	//   13   30:aload_2         
	//   14   31:aload_3         
	//   15   32:iconst_1        
	//   16   33:invokevirtual   #1087 <Method void dispatchOnFragmentViewCreated(Fragment, View, Bundle, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   17   36:aload_0         
	//   18   37:getfield        #171 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   19   40:invokevirtual   #999 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   20   43:astore          5
		do
		{
			if(!iterator.hasNext())
				break;
	//   21   45:aload           5
	//   22   47:invokeinterface #772 <Method boolean Iterator.hasNext()>
	//   23   52:ifeq            104
			Pair pair = (Pair)iterator.next();
	//   24   55:aload           5
	//   25   57:invokeinterface #776 <Method Object Iterator.next()>
	//   26   62:checkcast       #1001 <Class Pair>
	//   27   65:astore          6
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  28   67:iload           4
	//*  29   69:ifeq            86
	//*  30   72:aload           6
	//*  31   74:getfield        #1005 <Field Object Pair.second>
	//*  32   77:checkcast       #382 <Class Boolean>
	//*  33   80:invokevirtual   #475 <Method boolean Boolean.booleanValue()>
	//*  34   83:ifeq            45
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentViewCreated(((FragmentManager) (this)), fragment, view, bundle);
	//   35   86:aload           6
	//   36   88:getfield        #1008 <Field Object Pair.first>
	//   37   91:checkcast       #1010 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   38   94:aload_0         
	//   39   95:aload_1         
	//   40   96:aload_2         
	//   41   97:aload_3         
	//   42   98:invokevirtual   #1091 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentViewCreated(FragmentManager, Fragment, View, Bundle)>
		} while(true);
	//   43  101:goto            45
	//   44  104:return          
	}

	void dispatchOnFragmentViewDestroyed(Fragment fragment, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #917 <Field Fragment mParent>
	//*   2    4:ifnull          31
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #917 <Field Fragment mParent>
	//    5   11:invokevirtual   #996 <Method FragmentManager Fragment.getFragmentManager()>
	//    6   14:astore_3        
			if(fragmentmanager instanceof FragmentManagerImpl)
	//*   7   15:aload_3         
	//*   8   16:instanceof      #2   <Class FragmentManagerImpl>
	//*   9   19:ifeq            31
				((FragmentManagerImpl)fragmentmanager).dispatchOnFragmentViewDestroyed(fragment, true);
	//   10   22:aload_3         
	//   11   23:checkcast       #2   <Class FragmentManagerImpl>
	//   12   26:aload_1         
	//   13   27:iconst_1        
	//   14   28:invokevirtual   #1094 <Method void dispatchOnFragmentViewDestroyed(Fragment, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   15   31:aload_0         
	//   16   32:getfield        #171 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   17   35:invokevirtual   #999 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   18   38:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   19   39:aload_3         
	//   20   40:invokeinterface #772 <Method boolean Iterator.hasNext()>
	//   21   45:ifeq            93
			Pair pair = (Pair)iterator.next();
	//   22   48:aload_3         
	//   23   49:invokeinterface #776 <Method Object Iterator.next()>
	//   24   54:checkcast       #1001 <Class Pair>
	//   25   57:astore          4
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  26   59:iload_2         
	//*  27   60:ifeq            77
	//*  28   63:aload           4
	//*  29   65:getfield        #1005 <Field Object Pair.second>
	//*  30   68:checkcast       #382 <Class Boolean>
	//*  31   71:invokevirtual   #475 <Method boolean Boolean.booleanValue()>
	//*  32   74:ifeq            39
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentViewDestroyed(((FragmentManager) (this)), fragment);
	//   33   77:aload           4
	//   34   79:getfield        #1008 <Field Object Pair.first>
	//   35   82:checkcast       #1010 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   36   85:aload_0         
	//   37   86:aload_1         
	//   38   87:invokevirtual   #1097 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentViewDestroyed(FragmentManager, Fragment)>
		} while(true);
	//   39   90:goto            39
	//   40   93:return          
	}

	public boolean dispatchOptionsItemSelected(MenuItem menuitem)
	{
		if(mCurState < 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #173 <Field int mCurState>
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
	//*  10   14:getfield        #166 <Field ArrayList mAdded>
	//*  11   17:invokevirtual   #204 <Method int ArrayList.size()>
	//*  12   20:icmpge          56
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//   13   23:aload_0         
	//   14   24:getfield        #166 <Field ArrayList mAdded>
	//   15   27:iload_2         
	//   16   28:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//   17   31:checkcast       #210 <Class Fragment>
	//   18   34:astore_3        
			if(fragment != null && fragment.performOptionsItemSelected(menuitem))
	//*  19   35:aload_3         
	//*  20   36:ifnull          49
	//*  21   39:aload_3         
	//*  22   40:aload_1         
	//*  23   41:invokevirtual   #1101 <Method boolean Fragment.performOptionsItemSelected(MenuItem)>
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
	//*   1    1:getfield        #173 <Field int mCurState>
	//*   2    4:iconst_1        
	//*   3    5:icmpge          9
			return;
	//    4    8:return          
		for(int i = 0; i < mAdded.size(); i++)
	//*   5    9:iconst_0        
	//*   6   10:istore_2        
	//*   7   11:iload_2         
	//*   8   12:aload_0         
	//*   9   13:getfield        #166 <Field ArrayList mAdded>
	//*  10   16:invokevirtual   #204 <Method int ArrayList.size()>
	//*  11   19:icmpge          50
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//   12   22:aload_0         
	//   13   23:getfield        #166 <Field ArrayList mAdded>
	//   14   26:iload_2         
	//   15   27:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//   16   30:checkcast       #210 <Class Fragment>
	//   17   33:astore_3        
			if(fragment != null)
	//*  18   34:aload_3         
	//*  19   35:ifnull          43
				fragment.performOptionsMenuClosed(menu);
	//   20   38:aload_3         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #1106 <Method void Fragment.performOptionsMenuClosed(Menu)>
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
		dispatchStateChange(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokespecial   #961 <Method void dispatchStateChange(int)>
	//    3    5:return          
	}

	public void dispatchPictureInPictureModeChanged(boolean flag)
	{
		for(int i = mAdded.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #166 <Field ArrayList mAdded>
	//*   2    4:invokevirtual   #204 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            42
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    8   14:aload_0         
	//    9   15:getfield        #166 <Field ArrayList mAdded>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #210 <Class Fragment>
	//   13   25:astore_3        
			if(fragment != null)
	//*  14   26:aload_3         
	//*  15   27:ifnull          35
				fragment.performPictureInPictureModeChanged(flag);
	//   16   30:aload_3         
	//   17   31:iload_1         
	//   18   32:invokevirtual   #1111 <Method void Fragment.performPictureInPictureModeChanged(boolean)>
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
	//    1    1:getfield        #173 <Field int mCurState>
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
	//*  14   19:getfield        #166 <Field ArrayList mAdded>
	//*  15   22:invokevirtual   #204 <Method int ArrayList.size()>
	//*  16   25:icmpge          77
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//   17   28:aload_0         
	//   18   29:getfield        #166 <Field ArrayList mAdded>
	//   19   32:iload_2         
	//   20   33:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//   21   36:checkcast       #210 <Class Fragment>
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
	//*  31   57:invokevirtual   #1116 <Method boolean Fragment.performPrepareOptionsMenu(Menu)>
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

	public void dispatchReallyStop()
	{
		dispatchStateChange(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokespecial   #961 <Method void dispatchStateChange(int)>
	//    3    5:return          
	}

	public void dispatchResume()
	{
		mStateSaved = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #957 <Field boolean mStateSaved>
		mStopped = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #959 <Field boolean mStopped>
		dispatchStateChange(5);
	//    6   10:aload_0         
	//    7   11:iconst_5        
	//    8   12:invokespecial   #961 <Method void dispatchStateChange(int)>
	//    9   15:return          
	}

	public void dispatchStart()
	{
		mStateSaved = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #957 <Field boolean mStateSaved>
		mStopped = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #959 <Field boolean mStopped>
		dispatchStateChange(4);
	//    6   10:aload_0         
	//    7   11:iconst_4        
	//    8   12:invokespecial   #961 <Method void dispatchStateChange(int)>
	//    9   15:return          
	}

	public void dispatchStop()
	{
		mStopped = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #959 <Field boolean mStopped>
		dispatchStateChange(3);
	//    3    5:aload_0         
	//    4    6:iconst_3        
	//    5    7:invokespecial   #961 <Method void dispatchStateChange(int)>
	//    6   10:return          
	}

	void doPendingDeferredStart()
	{
		if(mHavePendingDeferredStart)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1122 <Field boolean mHavePendingDeferredStart>
	//*   2    4:ifeq            16
		{
			mHavePendingDeferredStart = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #1122 <Field boolean mHavePendingDeferredStart>
			startPendingDeferredFragments();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #1125 <Method void startPendingDeferredFragments()>
		}
	//    8   16:return          
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		boolean flag;
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #347 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #348 <Method void StringBuilder()>
	//    3    7:astore          8
		((StringBuilder) (obj)).append(s);
	//    4    9:aload           8
	//    5   11:aload_1         
	//    6   12:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append("    ");
	//    8   16:aload           8
	//    9   18:ldc2            #1127 <String "    ">
	//   10   21:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   12   25:aload           8
	//   13   27:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   14   30:astore          8
		SparseArray sparsearray = mActive;
	//   15   32:aload_0         
	//   16   33:getfield        #318 <Field SparseArray mActive>
	//   17   36:astore          9
		flag = false;
	//   18   38:iconst_0        
	//   19   39:istore          6
		if(sparsearray != null)
	//*  20   41:aload           9
	//*  21   43:ifnull          170
		{
			int k1 = mActive.size();
	//   22   46:aload_0         
	//   23   47:getfield        #318 <Field SparseArray mActive>
	//   24   50:invokevirtual   #321 <Method int SparseArray.size()>
	//   25   53:istore          7
			if(k1 > 0)
	//*  26   55:iload           7
	//*  27   57:ifle            170
			{
				printwriter.print(s);
	//   28   60:aload_3         
	//   29   61:aload_1         
	//   30   62:invokevirtual   #1130 <Method void PrintWriter.print(String)>
				printwriter.print("Active Fragments in ");
	//   31   65:aload_3         
	//   32   66:ldc2            #1132 <String "Active Fragments in ">
	//   33   69:invokevirtual   #1130 <Method void PrintWriter.print(String)>
				printwriter.print(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//   34   72:aload_3         
	//   35   73:aload_0         
	//   36   74:invokestatic    #1137 <Method int System.identityHashCode(Object)>
	//   37   77:invokestatic    #1141 <Method String Integer.toHexString(int)>
	//   38   80:invokevirtual   #1130 <Method void PrintWriter.print(String)>
				printwriter.println(":");
	//   39   83:aload_3         
	//   40   84:ldc2            #1143 <String ":">
	//   41   87:invokevirtual   #1146 <Method void PrintWriter.println(String)>
				for(int i = 0; i < k1; i++)
	//*  42   90:iconst_0        
	//*  43   91:istore          5
	//*  44   93:iload           5
	//*  45   95:iload           7
	//*  46   97:icmpge          170
				{
					Fragment fragment = (Fragment)mActive.valueAt(i);
	//   47  100:aload_0         
	//   48  101:getfield        #318 <Field SparseArray mActive>
	//   49  104:iload           5
	//   50  106:invokevirtual   #324 <Method Object SparseArray.valueAt(int)>
	//   51  109:checkcast       #210 <Class Fragment>
	//   52  112:astore          9
					printwriter.print(s);
	//   53  114:aload_3         
	//   54  115:aload_1         
	//   55  116:invokevirtual   #1130 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//   56  119:aload_3         
	//   57  120:ldc2            #1148 <String "  #">
	//   58  123:invokevirtual   #1130 <Method void PrintWriter.print(String)>
					printwriter.print(i);
	//   59  126:aload_3         
	//   60  127:iload           5
	//   61  129:invokevirtual   #1150 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//   62  132:aload_3         
	//   63  133:ldc2            #1152 <String ": ">
	//   64  136:invokevirtual   #1130 <Method void PrintWriter.print(String)>
					printwriter.println(((Object) (fragment)));
	//   65  139:aload_3         
	//   66  140:aload           9
	//   67  142:invokevirtual   #1154 <Method void PrintWriter.println(Object)>
					if(fragment != null)
	//*  68  145:aload           9
	//*  69  147:ifnull          161
						fragment.dump(((String) (obj)), filedescriptor, printwriter, as);
	//   70  150:aload           9
	//   71  152:aload           8
	//   72  154:aload_2         
	//   73  155:aload_3         
	//   74  156:aload           4
	//   75  158:invokevirtual   #1155 <Method void Fragment.dump(String, FileDescriptor, PrintWriter, String[])>
				}

	//   76  161:iload           5
	//   77  163:iconst_1        
	//   78  164:iadd            
	//   79  165:istore          5
			}
		}
	//*  80  167:goto            93
		int l1 = mAdded.size();
	//   81  170:aload_0         
	//   82  171:getfield        #166 <Field ArrayList mAdded>
	//   83  174:invokevirtual   #204 <Method int ArrayList.size()>
	//   84  177:istore          7
		if(l1 > 0)
	//*  85  179:iload           7
	//*  86  181:ifle            263
		{
			printwriter.print(s);
	//   87  184:aload_3         
	//   88  185:aload_1         
	//   89  186:invokevirtual   #1130 <Method void PrintWriter.print(String)>
			printwriter.println("Added Fragments:");
	//   90  189:aload_3         
	//   91  190:ldc2            #1157 <String "Added Fragments:">
	//   92  193:invokevirtual   #1146 <Method void PrintWriter.println(String)>
			for(int j = 0; j < l1; j++)
	//*  93  196:iconst_0        
	//*  94  197:istore          5
	//*  95  199:iload           5
	//*  96  201:iload           7
	//*  97  203:icmpge          263
			{
				Fragment fragment1 = (Fragment)mAdded.get(j);
	//   98  206:aload_0         
	//   99  207:getfield        #166 <Field ArrayList mAdded>
	//  100  210:iload           5
	//  101  212:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//  102  215:checkcast       #210 <Class Fragment>
	//  103  218:astore          9
				printwriter.print(s);
	//  104  220:aload_3         
	//  105  221:aload_1         
	//  106  222:invokevirtual   #1130 <Method void PrintWriter.print(String)>
				printwriter.print("  #");
	//  107  225:aload_3         
	//  108  226:ldc2            #1148 <String "  #">
	//  109  229:invokevirtual   #1130 <Method void PrintWriter.print(String)>
				printwriter.print(j);
	//  110  232:aload_3         
	//  111  233:iload           5
	//  112  235:invokevirtual   #1150 <Method void PrintWriter.print(int)>
				printwriter.print(": ");
	//  113  238:aload_3         
	//  114  239:ldc2            #1152 <String ": ">
	//  115  242:invokevirtual   #1130 <Method void PrintWriter.print(String)>
				printwriter.println(fragment1.toString());
	//  116  245:aload_3         
	//  117  246:aload           9
	//  118  248:invokevirtual   #1158 <Method String Fragment.toString()>
	//  119  251:invokevirtual   #1146 <Method void PrintWriter.println(String)>
			}

	//  120  254:iload           5
	//  121  256:iconst_1        
	//  122  257:iadd            
	//  123  258:istore          5
		}
	//* 124  260:goto            199
		if(mCreatedMenus != null)
	//* 125  263:aload_0         
	//* 126  264:getfield        #1160 <Field ArrayList mCreatedMenus>
	//* 127  267:ifnull          363
		{
			int i2 = mCreatedMenus.size();
	//  128  270:aload_0         
	//  129  271:getfield        #1160 <Field ArrayList mCreatedMenus>
	//  130  274:invokevirtual   #204 <Method int ArrayList.size()>
	//  131  277:istore          7
			if(i2 > 0)
	//* 132  279:iload           7
	//* 133  281:ifle            363
			{
				printwriter.print(s);
	//  134  284:aload_3         
	//  135  285:aload_1         
	//  136  286:invokevirtual   #1130 <Method void PrintWriter.print(String)>
				printwriter.println("Fragments Created Menus:");
	//  137  289:aload_3         
	//  138  290:ldc2            #1162 <String "Fragments Created Menus:">
	//  139  293:invokevirtual   #1146 <Method void PrintWriter.println(String)>
				for(int k = 0; k < i2; k++)
	//* 140  296:iconst_0        
	//* 141  297:istore          5
	//* 142  299:iload           5
	//* 143  301:iload           7
	//* 144  303:icmpge          363
				{
					Fragment fragment2 = (Fragment)mCreatedMenus.get(k);
	//  145  306:aload_0         
	//  146  307:getfield        #1160 <Field ArrayList mCreatedMenus>
	//  147  310:iload           5
	//  148  312:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//  149  315:checkcast       #210 <Class Fragment>
	//  150  318:astore          9
					printwriter.print(s);
	//  151  320:aload_3         
	//  152  321:aload_1         
	//  153  322:invokevirtual   #1130 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//  154  325:aload_3         
	//  155  326:ldc2            #1148 <String "  #">
	//  156  329:invokevirtual   #1130 <Method void PrintWriter.print(String)>
					printwriter.print(k);
	//  157  332:aload_3         
	//  158  333:iload           5
	//  159  335:invokevirtual   #1150 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//  160  338:aload_3         
	//  161  339:ldc2            #1152 <String ": ">
	//  162  342:invokevirtual   #1130 <Method void PrintWriter.print(String)>
					printwriter.println(fragment2.toString());
	//  163  345:aload_3         
	//  164  346:aload           9
	//  165  348:invokevirtual   #1158 <Method String Fragment.toString()>
	//  166  351:invokevirtual   #1146 <Method void PrintWriter.println(String)>
				}

	//  167  354:iload           5
	//  168  356:iconst_1        
	//  169  357:iadd            
	//  170  358:istore          5
			}
		}
	//* 171  360:goto            299
		if(mBackStack != null)
	//* 172  363:aload_0         
	//* 173  364:getfield        #839 <Field ArrayList mBackStack>
	//* 174  367:ifnull          474
		{
			int j2 = mBackStack.size();
	//  175  370:aload_0         
	//  176  371:getfield        #839 <Field ArrayList mBackStack>
	//  177  374:invokevirtual   #204 <Method int ArrayList.size()>
	//  178  377:istore          7
			if(j2 > 0)
	//* 179  379:iload           7
	//* 180  381:ifle            474
			{
				printwriter.print(s);
	//  181  384:aload_3         
	//  182  385:aload_1         
	//  183  386:invokevirtual   #1130 <Method void PrintWriter.print(String)>
				printwriter.println("Back Stack:");
	//  184  389:aload_3         
	//  185  390:ldc2            #1164 <String "Back Stack:">
	//  186  393:invokevirtual   #1146 <Method void PrintWriter.println(String)>
				for(int l = 0; l < j2; l++)
	//* 187  396:iconst_0        
	//* 188  397:istore          5
	//* 189  399:iload           5
	//* 190  401:iload           7
	//* 191  403:icmpge          474
				{
					BackStackRecord backstackrecord = (BackStackRecord)mBackStack.get(l);
	//  192  406:aload_0         
	//  193  407:getfield        #839 <Field ArrayList mBackStack>
	//  194  410:iload           5
	//  195  412:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//  196  415:checkcast       #370 <Class BackStackRecord>
	//  197  418:astore          9
					printwriter.print(s);
	//  198  420:aload_3         
	//  199  421:aload_1         
	//  200  422:invokevirtual   #1130 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//  201  425:aload_3         
	//  202  426:ldc2            #1148 <String "  #">
	//  203  429:invokevirtual   #1130 <Method void PrintWriter.print(String)>
					printwriter.print(l);
	//  204  432:aload_3         
	//  205  433:iload           5
	//  206  435:invokevirtual   #1150 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//  207  438:aload_3         
	//  208  439:ldc2            #1152 <String ": ">
	//  209  442:invokevirtual   #1130 <Method void PrintWriter.print(String)>
					printwriter.println(backstackrecord.toString());
	//  210  445:aload_3         
	//  211  446:aload           9
	//  212  448:invokevirtual   #1165 <Method String BackStackRecord.toString()>
	//  213  451:invokevirtual   #1146 <Method void PrintWriter.println(String)>
					backstackrecord.dump(((String) (obj)), filedescriptor, printwriter, as);
	//  214  454:aload           9
	//  215  456:aload           8
	//  216  458:aload_2         
	//  217  459:aload_3         
	//  218  460:aload           4
	//  219  462:invokevirtual   #1166 <Method void BackStackRecord.dump(String, FileDescriptor, PrintWriter, String[])>
				}

	//  220  465:iload           5
	//  221  467:iconst_1        
	//  222  468:iadd            
	//  223  469:istore          5
			}
		}
	//* 224  471:goto            399
		this;
	//  225  474:aload_0         
		JVM INSTR monitorenter ;
	//  226  475:monitorenter    
		if(mBackStackIndices == null) goto _L2; else goto _L1
	//  227  476:aload_0         
	//  228  477:getfield        #901 <Field ArrayList mBackStackIndices>
	//  229  480:ifnull          571
_L1:
		int k2 = mBackStackIndices.size();
	//  230  483:aload_0         
	//  231  484:getfield        #901 <Field ArrayList mBackStackIndices>
	//  232  487:invokevirtual   #204 <Method int ArrayList.size()>
	//  233  490:istore          7
		if(k2 <= 0) goto _L2; else goto _L3
	//  234  492:iload           7
	//  235  494:ifle            571
_L3:
		printwriter.print(s);
	//  236  497:aload_3         
	//  237  498:aload_1         
	//  238  499:invokevirtual   #1130 <Method void PrintWriter.print(String)>
		printwriter.println("Back Stack Indices:");
	//  239  502:aload_3         
	//  240  503:ldc2            #1168 <String "Back Stack Indices:">
	//  241  506:invokevirtual   #1146 <Method void PrintWriter.println(String)>
		int i1 = 0;
	//  242  509:iconst_0        
	//  243  510:istore          5
_L4:
		if(i1 >= k2)
			break; /* Loop/switch isn't completed */
	//  244  512:iload           5
	//  245  514:iload           7
	//  246  516:icmpge          571
		filedescriptor = ((FileDescriptor) ((BackStackRecord)mBackStackIndices.get(i1)));
	//  247  519:aload_0         
	//  248  520:getfield        #901 <Field ArrayList mBackStackIndices>
	//  249  523:iload           5
	//  250  525:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//  251  528:checkcast       #370 <Class BackStackRecord>
	//  252  531:astore_2        
		printwriter.print(s);
	//  253  532:aload_3         
	//  254  533:aload_1         
	//  255  534:invokevirtual   #1130 <Method void PrintWriter.print(String)>
		printwriter.print("  #");
	//  256  537:aload_3         
	//  257  538:ldc2            #1148 <String "  #">
	//  258  541:invokevirtual   #1130 <Method void PrintWriter.print(String)>
		printwriter.print(i1);
	//  259  544:aload_3         
	//  260  545:iload           5
	//  261  547:invokevirtual   #1150 <Method void PrintWriter.print(int)>
		printwriter.print(": ");
	//  262  550:aload_3         
	//  263  551:ldc2            #1152 <String ": ">
	//  264  554:invokevirtual   #1130 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (filedescriptor)));
	//  265  557:aload_3         
	//  266  558:aload_2         
	//  267  559:invokevirtual   #1154 <Method void PrintWriter.println(Object)>
		i1++;
	//  268  562:iload           5
	//  269  564:iconst_1        
	//  270  565:iadd            
	//  271  566:istore          5
		if(true) goto _L4; else goto _L2
	//  272  568:goto            512
_L2:
		if(mAvailBackStackIndices != null && mAvailBackStackIndices.size() > 0)
	//* 273  571:aload_0         
	//* 274  572:getfield        #887 <Field ArrayList mAvailBackStackIndices>
	//* 275  575:ifnull          614
	//* 276  578:aload_0         
	//* 277  579:getfield        #887 <Field ArrayList mAvailBackStackIndices>
	//* 278  582:invokevirtual   #204 <Method int ArrayList.size()>
	//* 279  585:ifle            614
		{
			printwriter.print(s);
	//  280  588:aload_3         
	//  281  589:aload_1         
	//  282  590:invokevirtual   #1130 <Method void PrintWriter.print(String)>
			printwriter.print("mAvailBackStackIndices: ");
	//  283  593:aload_3         
	//  284  594:ldc2            #1170 <String "mAvailBackStackIndices: ">
	//  285  597:invokevirtual   #1130 <Method void PrintWriter.print(String)>
			printwriter.println(Arrays.toString(mAvailBackStackIndices.toArray()));
	//  286  600:aload_3         
	//  287  601:aload_0         
	//  288  602:getfield        #887 <Field ArrayList mAvailBackStackIndices>
	//  289  605:invokevirtual   #1174 <Method Object[] ArrayList.toArray()>
	//  290  608:invokestatic    #1179 <Method String Arrays.toString(Object[])>
	//  291  611:invokevirtual   #1146 <Method void PrintWriter.println(String)>
		}
		this;
	//  292  614:aload_0         
		JVM INSTR monitorexit ;
	//  293  615:monitorexit     
		if(mPendingActions != null)
	//* 294  616:aload_0         
	//* 295  617:getfield        #567 <Field ArrayList mPendingActions>
	//* 296  620:ifnull          712
		{
			int l2 = mPendingActions.size();
	//  297  623:aload_0         
	//  298  624:getfield        #567 <Field ArrayList mPendingActions>
	//  299  627:invokevirtual   #204 <Method int ArrayList.size()>
	//  300  630:istore          7
			if(l2 > 0)
	//* 301  632:iload           7
	//* 302  634:ifle            712
			{
				printwriter.print(s);
	//  303  637:aload_3         
	//  304  638:aload_1         
	//  305  639:invokevirtual   #1130 <Method void PrintWriter.print(String)>
				printwriter.println("Pending Actions:");
	//  306  642:aload_3         
	//  307  643:ldc2            #1181 <String "Pending Actions:">
	//  308  646:invokevirtual   #1146 <Method void PrintWriter.println(String)>
				for(int j1 = ((int) (flag)); j1 < l2; j1++)
	//* 309  649:iload           6
	//* 310  651:istore          5
	//* 311  653:iload           5
	//* 312  655:iload           7
	//* 313  657:icmpge          712
				{
					filedescriptor = ((FileDescriptor) ((OpGenerator)mPendingActions.get(j1)));
	//  314  660:aload_0         
	//  315  661:getfield        #567 <Field ArrayList mPendingActions>
	//  316  664:iload           5
	//  317  666:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//  318  669:checkcast       #38  <Class FragmentManagerImpl$OpGenerator>
	//  319  672:astore_2        
					printwriter.print(s);
	//  320  673:aload_3         
	//  321  674:aload_1         
	//  322  675:invokevirtual   #1130 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//  323  678:aload_3         
	//  324  679:ldc2            #1148 <String "  #">
	//  325  682:invokevirtual   #1130 <Method void PrintWriter.print(String)>
					printwriter.print(j1);
	//  326  685:aload_3         
	//  327  686:iload           5
	//  328  688:invokevirtual   #1150 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//  329  691:aload_3         
	//  330  692:ldc2            #1152 <String ": ">
	//  331  695:invokevirtual   #1130 <Method void PrintWriter.print(String)>
					printwriter.println(((Object) (filedescriptor)));
	//  332  698:aload_3         
	//  333  699:aload_2         
	//  334  700:invokevirtual   #1154 <Method void PrintWriter.println(Object)>
				}

	//  335  703:iload           5
	//  336  705:iconst_1        
	//  337  706:iadd            
	//  338  707:istore          5
			}
		}
	//* 339  709:goto            653
		printwriter.print(s);
	//  340  712:aload_3         
	//  341  713:aload_1         
	//  342  714:invokevirtual   #1130 <Method void PrintWriter.print(String)>
		printwriter.println("FragmentManager misc state:");
	//  343  717:aload_3         
	//  344  718:ldc2            #1183 <String "FragmentManager misc state:">
	//  345  721:invokevirtual   #1146 <Method void PrintWriter.println(String)>
		printwriter.print(s);
	//  346  724:aload_3         
	//  347  725:aload_1         
	//  348  726:invokevirtual   #1130 <Method void PrintWriter.print(String)>
		printwriter.print("  mHost=");
	//  349  729:aload_3         
	//  350  730:ldc2            #1185 <String "  mHost=">
	//  351  733:invokevirtual   #1130 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (mHost)));
	//  352  736:aload_3         
	//  353  737:aload_0         
	//  354  738:getfield        #444 <Field FragmentHostCallback mHost>
	//  355  741:invokevirtual   #1154 <Method void PrintWriter.println(Object)>
		printwriter.print(s);
	//  356  744:aload_3         
	//  357  745:aload_1         
	//  358  746:invokevirtual   #1130 <Method void PrintWriter.print(String)>
		printwriter.print("  mContainer=");
	//  359  749:aload_3         
	//  360  750:ldc2            #1187 <String "  mContainer=">
	//  361  753:invokevirtual   #1130 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (mContainer)));
	//  362  756:aload_3         
	//  363  757:aload_0         
	//  364  758:getfield        #915 <Field FragmentContainer mContainer>
	//  365  761:invokevirtual   #1154 <Method void PrintWriter.println(Object)>
		if(mParent != null)
	//* 366  764:aload_0         
	//* 367  765:getfield        #917 <Field Fragment mParent>
	//* 368  768:ifnull          791
		{
			printwriter.print(s);
	//  369  771:aload_3         
	//  370  772:aload_1         
	//  371  773:invokevirtual   #1130 <Method void PrintWriter.print(String)>
			printwriter.print("  mParent=");
	//  372  776:aload_3         
	//  373  777:ldc2            #1189 <String "  mParent=">
	//  374  780:invokevirtual   #1130 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mParent)));
	//  375  783:aload_3         
	//  376  784:aload_0         
	//  377  785:getfield        #917 <Field Fragment mParent>
	//  378  788:invokevirtual   #1154 <Method void PrintWriter.println(Object)>
		}
		printwriter.print(s);
	//  379  791:aload_3         
	//  380  792:aload_1         
	//  381  793:invokevirtual   #1130 <Method void PrintWriter.print(String)>
		printwriter.print("  mCurState=");
	//  382  796:aload_3         
	//  383  797:ldc2            #1191 <String "  mCurState=">
	//  384  800:invokevirtual   #1130 <Method void PrintWriter.print(String)>
		printwriter.print(mCurState);
	//  385  803:aload_3         
	//  386  804:aload_0         
	//  387  805:getfield        #173 <Field int mCurState>
	//  388  808:invokevirtual   #1150 <Method void PrintWriter.print(int)>
		printwriter.print(" mStateSaved=");
	//  389  811:aload_3         
	//  390  812:ldc2            #1193 <String " mStateSaved=">
	//  391  815:invokevirtual   #1130 <Method void PrintWriter.print(String)>
		printwriter.print(mStateSaved);
	//  392  818:aload_3         
	//  393  819:aload_0         
	//  394  820:getfield        #957 <Field boolean mStateSaved>
	//  395  823:invokevirtual   #1195 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mStopped=");
	//  396  826:aload_3         
	//  397  827:ldc2            #1197 <String " mStopped=">
	//  398  830:invokevirtual   #1130 <Method void PrintWriter.print(String)>
		printwriter.print(mStopped);
	//  399  833:aload_3         
	//  400  834:aload_0         
	//  401  835:getfield        #959 <Field boolean mStopped>
	//  402  838:invokevirtual   #1195 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mDestroyed=");
	//  403  841:aload_3         
	//  404  842:ldc2            #1199 <String " mDestroyed=">
	//  405  845:invokevirtual   #1130 <Method void PrintWriter.print(String)>
		printwriter.println(mDestroyed);
	//  406  848:aload_3         
	//  407  849:aload_0         
	//  408  850:getfield        #982 <Field boolean mDestroyed>
	//  409  853:invokevirtual   #1201 <Method void PrintWriter.println(boolean)>
		if(mNeedMenuInvalidate)
	//* 410  856:aload_0         
	//* 411  857:getfield        #877 <Field boolean mNeedMenuInvalidate>
	//* 412  860:ifeq            883
		{
			printwriter.print(s);
	//  413  863:aload_3         
	//  414  864:aload_1         
	//  415  865:invokevirtual   #1130 <Method void PrintWriter.print(String)>
			printwriter.print("  mNeedMenuInvalidate=");
	//  416  868:aload_3         
	//  417  869:ldc2            #1203 <String "  mNeedMenuInvalidate=">
	//  418  872:invokevirtual   #1130 <Method void PrintWriter.print(String)>
			printwriter.println(mNeedMenuInvalidate);
	//  419  875:aload_3         
	//  420  876:aload_0         
	//  421  877:getfield        #877 <Field boolean mNeedMenuInvalidate>
	//  422  880:invokevirtual   #1201 <Method void PrintWriter.println(boolean)>
		}
		if(mNoTransactionsBecause != null)
	//* 423  883:aload_0         
	//* 424  884:getfield        #345 <Field String mNoTransactionsBecause>
	//* 425  887:ifnull          910
		{
			printwriter.print(s);
	//  426  890:aload_3         
	//  427  891:aload_1         
	//  428  892:invokevirtual   #1130 <Method void PrintWriter.print(String)>
			printwriter.print("  mNoTransactionsBecause=");
	//  429  895:aload_3         
	//  430  896:ldc2            #1205 <String "  mNoTransactionsBecause=">
	//  431  899:invokevirtual   #1130 <Method void PrintWriter.print(String)>
			printwriter.println(mNoTransactionsBecause);
	//  432  902:aload_3         
	//  433  903:aload_0         
	//  434  904:getfield        #345 <Field String mNoTransactionsBecause>
	//  435  907:invokevirtual   #1146 <Method void PrintWriter.println(String)>
		}
		return;
	//  436  910:return          
		s;
	//  437  911:astore_1        
		this;
	//  438  912:aload_0         
		JVM INSTR monitorexit ;
	//  439  913:monitorexit     
		throw s;
	//  440  914:aload_1         
	//  441  915:athrow          
	}

	public void enqueueAction(OpGenerator opgenerator, boolean flag)
	{
		if(!flag)
	//*   0    0:iload_2         
	//*   1    1:ifne            8
			checkStateLoss();
	//    2    4:aload_0         
	//    3    5:invokespecial   #467 <Method void checkStateLoss()>
		this;
	//    4    8:aload_0         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		if(mDestroyed || mHost == null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #982 <Field boolean mDestroyed>
	//*   8   14:ifne            61
	//*   9   17:aload_0         
	//*  10   18:getfield        #444 <Field FragmentHostCallback mHost>
	//*  11   21:ifnonnull       27
			break MISSING_BLOCK_LABEL_61;
	//   12   24:goto            61
		if(mPendingActions == null)
	//*  13   27:aload_0         
	//*  14   28:getfield        #567 <Field ArrayList mPendingActions>
	//*  15   31:ifnonnull       45
			mPendingActions = new ArrayList();
	//   16   34:aload_0         
	//   17   35:new             #163 <Class ArrayList>
	//   18   38:dup             
	//   19   39:invokespecial   #164 <Method void ArrayList()>
	//   20   42:putfield        #567 <Field ArrayList mPendingActions>
		mPendingActions.add(((Object) (opgenerator)));
	//   21   45:aload_0         
	//   22   46:getfield        #567 <Field ArrayList mPendingActions>
	//   23   49:aload_1         
	//   24   50:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
	//   25   53:pop             
		scheduleCommit();
	//   26   54:aload_0         
	//   27   55:invokespecial   #186 <Method void scheduleCommit()>
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
	//   36   68:new             #338 <Class IllegalStateException>
	//   37   71:dup             
	//   38   72:ldc2            #1209 <String "Activity has been destroyed">
	//   39   75:invokespecial   #343 <Method void IllegalStateException(String)>
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
	//*   1    1:getfield        #1213 <Field boolean Fragment.mFromLayout>
	//*   2    4:ifeq            106
	//*   3    7:aload_1         
	//*   4    8:getfield        #1216 <Field boolean Fragment.mPerformedCreateView>
	//*   5   11:ifne            106
		{
			fragment.mView = fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), ((ViewGroup) (null)), fragment.mSavedFragmentState);
	//    6   14:aload_1         
	//    7   15:aload_1         
	//    8   16:aload_1         
	//    9   17:aload_1         
	//   10   18:getfield        #1219 <Field Bundle Fragment.mSavedFragmentState>
	//   11   21:invokevirtual   #1223 <Method android.view.LayoutInflater Fragment.performGetLayoutInflater(Bundle)>
	//   12   24:aconst_null     
	//   13   25:aload_1         
	//   14   26:getfield        #1219 <Field Bundle Fragment.mSavedFragmentState>
	//   15   29:invokevirtual   #1227 <Method View Fragment.performCreateView(android.view.LayoutInflater, ViewGroup, Bundle)>
	//   16   32:putfield        #227 <Field View Fragment.mView>
			if(fragment.mView != null)
	//*  17   35:aload_1         
	//*  18   36:getfield        #227 <Field View Fragment.mView>
	//*  19   39:ifnull          101
			{
				fragment.mInnerView = fragment.mView;
	//   20   42:aload_1         
	//   21   43:aload_1         
	//   22   44:getfield        #227 <Field View Fragment.mView>
	//   23   47:putfield        #1230 <Field View Fragment.mInnerView>
				fragment.mView.setSaveFromParentEnabled(false);
	//   24   50:aload_1         
	//   25   51:getfield        #227 <Field View Fragment.mView>
	//   26   54:iconst_0        
	//   27   55:invokevirtual   #1233 <Method void View.setSaveFromParentEnabled(boolean)>
				if(fragment.mHidden)
	//*  28   58:aload_1         
	//*  29   59:getfield        #230 <Field boolean Fragment.mHidden>
	//*  30   62:ifeq            74
					fragment.mView.setVisibility(8);
	//   31   65:aload_1         
	//   32   66:getfield        #227 <Field View Fragment.mView>
	//   33   69:bipush          8
	//   34   71:invokevirtual   #943 <Method void View.setVisibility(int)>
				fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
	//   35   74:aload_1         
	//   36   75:aload_1         
	//   37   76:getfield        #227 <Field View Fragment.mView>
	//   38   79:aload_1         
	//   39   80:getfield        #1219 <Field Bundle Fragment.mSavedFragmentState>
	//   40   83:invokevirtual   #1237 <Method void Fragment.onViewCreated(View, Bundle)>
				dispatchOnFragmentViewCreated(fragment, fragment.mView, fragment.mSavedFragmentState, false);
	//   41   86:aload_0         
	//   42   87:aload_1         
	//   43   88:aload_1         
	//   44   89:getfield        #227 <Field View Fragment.mView>
	//   45   92:aload_1         
	//   46   93:getfield        #1219 <Field Bundle Fragment.mSavedFragmentState>
	//   47   96:iconst_0        
	//   48   97:invokevirtual   #1087 <Method void dispatchOnFragmentViewCreated(Fragment, View, Bundle, boolean)>
				return;
	//   49  100:return          
			}
			fragment.mInnerView = null;
	//   50  101:aload_1         
	//   51  102:aconst_null     
	//   52  103:putfield        #1230 <Field View Fragment.mInnerView>
		}
	//   53  106:return          
	}

	public boolean execPendingActions()
	{
		boolean flag;
		ensureExecReady(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #698 <Method void ensureExecReady(boolean)>
		flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_1        
_L2:
		if(!generateOpsForPendingActions(mTmpRecords, mTmpIsPop))
			break; /* Loop/switch isn't completed */
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #368 <Field ArrayList mTmpRecords>
	//    8   12:aload_0         
	//    9   13:getfield        #363 <Field ArrayList mTmpIsPop>
	//   10   16:invokespecial   #1239 <Method boolean generateOpsForPendingActions(ArrayList, ArrayList)>
	//   11   19:ifeq            55
		mExecutingActions = true;
	//   12   22:aload_0         
	//   13   23:iconst_1        
	//   14   24:putfield        #361 <Field boolean mExecutingActions>
		removeRedundantOperationsAndExecute(mTmpRecords, mTmpIsPop);
	//   15   27:aload_0         
	//   16   28:aload_0         
	//   17   29:getfield        #368 <Field ArrayList mTmpRecords>
	//   18   32:aload_0         
	//   19   33:getfield        #363 <Field ArrayList mTmpIsPop>
	//   20   36:invokespecial   #713 <Method void removeRedundantOperationsAndExecute(ArrayList, ArrayList)>
		cleanupExec();
	//   21   39:aload_0         
	//   22   40:invokespecial   #715 <Method void cleanupExec()>
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
	//   28   50:invokespecial   #715 <Method void cleanupExec()>
		throw exception;
	//   29   53:aload_2         
	//   30   54:athrow          
_L1:
		doPendingDeferredStart();
	//   31   55:aload_0         
	//   32   56:invokevirtual   #718 <Method void doPendingDeferredStart()>
		burpActive();
	//   33   59:aload_0         
	//   34   60:invokespecial   #720 <Method void burpActive()>
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
	//*   3    5:getfield        #444 <Field FragmentHostCallback mHost>
	//*   4    8:ifnull          18
	//*   5   11:aload_0         
	//*   6   12:getfield        #982 <Field boolean mDestroyed>
	//*   7   15:ifeq            19
			return;
	//    8   18:return          
		ensureExecReady(flag);
	//    9   19:aload_0         
	//   10   20:iload_2         
	//   11   21:invokespecial   #698 <Method void ensureExecReady(boolean)>
		if(!opgenerator.generateOps(mTmpRecords, mTmpIsPop))
			break MISSING_BLOCK_LABEL_72;
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #368 <Field ArrayList mTmpRecords>
	//   15   29:aload_0         
	//   16   30:getfield        #363 <Field ArrayList mTmpIsPop>
	//   17   33:invokeinterface #570 <Method boolean FragmentManagerImpl$OpGenerator.generateOps(ArrayList, ArrayList)>
	//   18   38:ifeq            72
		mExecutingActions = true;
	//   19   41:aload_0         
	//   20   42:iconst_1        
	//   21   43:putfield        #361 <Field boolean mExecutingActions>
		removeRedundantOperationsAndExecute(mTmpRecords, mTmpIsPop);
	//   22   46:aload_0         
	//   23   47:aload_0         
	//   24   48:getfield        #368 <Field ArrayList mTmpRecords>
	//   25   51:aload_0         
	//   26   52:getfield        #363 <Field ArrayList mTmpIsPop>
	//   27   55:invokespecial   #713 <Method void removeRedundantOperationsAndExecute(ArrayList, ArrayList)>
		cleanupExec();
	//   28   58:aload_0         
	//   29   59:invokespecial   #715 <Method void cleanupExec()>
		break MISSING_BLOCK_LABEL_72;
	//   30   62:goto            72
		opgenerator;
	//   31   65:astore_1        
		cleanupExec();
	//   32   66:aload_0         
	//   33   67:invokespecial   #715 <Method void cleanupExec()>
		throw opgenerator;
	//   34   70:aload_1         
	//   35   71:athrow          
		doPendingDeferredStart();
	//   36   72:aload_0         
	//   37   73:invokevirtual   #718 <Method void doPendingDeferredStart()>
		burpActive();
	//   38   76:aload_0         
	//   39   77:invokespecial   #720 <Method void burpActive()>
		return;
	//   40   80:return          
	}

	public boolean executePendingTransactions()
	{
		boolean flag = execPendingActions();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #414 <Method boolean execPendingActions()>
	//    2    4:istore_1        
		forcePostponedTransactions();
	//    3    5:aload_0         
	//    4    6:invokespecial   #1243 <Method void forcePostponedTransactions()>
		return flag;
	//    5    9:iload_1         
	//    6   10:ireturn         
	}

	public Fragment findFragmentById(int i)
	{
		for(int j = mAdded.size() - 1; j >= 0; j--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #166 <Field ArrayList mAdded>
	//*   2    4:invokevirtual   #204 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            47
		{
			Fragment fragment = (Fragment)mAdded.get(j);
	//    8   14:aload_0         
	//    9   15:getfield        #166 <Field ArrayList mAdded>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #210 <Class Fragment>
	//   13   25:astore_3        
			if(fragment != null && fragment.mFragmentId == i)
	//*  14   26:aload_3         
	//*  15   27:ifnull          40
	//*  16   30:aload_3         
	//*  17   31:getfield        #1248 <Field int Fragment.mFragmentId>
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
		if(mActive != null)
	//*  27   47:aload_0         
	//*  28   48:getfield        #318 <Field SparseArray mActive>
	//*  29   51:ifnull          101
		{
			for(int k = mActive.size() - 1; k >= 0; k--)
	//*  30   54:aload_0         
	//*  31   55:getfield        #318 <Field SparseArray mActive>
	//*  32   58:invokevirtual   #321 <Method int SparseArray.size()>
	//*  33   61:iconst_1        
	//*  34   62:isub            
	//*  35   63:istore_2        
	//*  36   64:iload_2         
	//*  37   65:iflt            101
			{
				Fragment fragment1 = (Fragment)mActive.valueAt(k);
	//   38   68:aload_0         
	//   39   69:getfield        #318 <Field SparseArray mActive>
	//   40   72:iload_2         
	//   41   73:invokevirtual   #324 <Method Object SparseArray.valueAt(int)>
	//   42   76:checkcast       #210 <Class Fragment>
	//   43   79:astore_3        
				if(fragment1 != null && fragment1.mFragmentId == i)
	//*  44   80:aload_3         
	//*  45   81:ifnull          94
	//*  46   84:aload_3         
	//*  47   85:getfield        #1248 <Field int Fragment.mFragmentId>
	//*  48   88:iload_1         
	//*  49   89:icmpne          94
					return fragment1;
	//   50   92:aload_3         
	//   51   93:areturn         
			}

	//   52   94:iload_2         
	//   53   95:iconst_1        
	//   54   96:isub            
	//   55   97:istore_2        
		}
	//*  56   98:goto            64
		return null;
	//   57  101:aconst_null     
	//   58  102:areturn         
	}

	public Fragment findFragmentByTag(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          54
		{
			for(int i = mAdded.size() - 1; i >= 0; i--)
	//*   2    4:aload_0         
	//*   3    5:getfield        #166 <Field ArrayList mAdded>
	//*   4    8:invokevirtual   #204 <Method int ArrayList.size()>
	//*   5   11:iconst_1        
	//*   6   12:isub            
	//*   7   13:istore_2        
	//*   8   14:iload_2         
	//*   9   15:iflt            54
			{
				Fragment fragment = (Fragment)mAdded.get(i);
	//   10   18:aload_0         
	//   11   19:getfield        #166 <Field ArrayList mAdded>
	//   12   22:iload_2         
	//   13   23:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//   14   26:checkcast       #210 <Class Fragment>
	//   15   29:astore_3        
				if(fragment != null && s.equals(((Object) (fragment.mTag))))
	//*  16   30:aload_3         
	//*  17   31:ifnull          47
	//*  18   34:aload_1         
	//*  19   35:aload_3         
	//*  20   36:getfield        #1253 <Field String Fragment.mTag>
	//*  21   39:invokevirtual   #677 <Method boolean String.equals(Object)>
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
		if(mActive != null && s != null)
	//*  30   54:aload_0         
	//*  31   55:getfield        #318 <Field SparseArray mActive>
	//*  32   58:ifnull          115
	//*  33   61:aload_1         
	//*  34   62:ifnull          115
		{
			for(int j = mActive.size() - 1; j >= 0; j--)
	//*  35   65:aload_0         
	//*  36   66:getfield        #318 <Field SparseArray mActive>
	//*  37   69:invokevirtual   #321 <Method int SparseArray.size()>
	//*  38   72:iconst_1        
	//*  39   73:isub            
	//*  40   74:istore_2        
	//*  41   75:iload_2         
	//*  42   76:iflt            115
			{
				Fragment fragment1 = (Fragment)mActive.valueAt(j);
	//   43   79:aload_0         
	//   44   80:getfield        #318 <Field SparseArray mActive>
	//   45   83:iload_2         
	//   46   84:invokevirtual   #324 <Method Object SparseArray.valueAt(int)>
	//   47   87:checkcast       #210 <Class Fragment>
	//   48   90:astore_3        
				if(fragment1 != null && s.equals(((Object) (fragment1.mTag))))
	//*  49   91:aload_3         
	//*  50   92:ifnull          108
	//*  51   95:aload_1         
	//*  52   96:aload_3         
	//*  53   97:getfield        #1253 <Field String Fragment.mTag>
	//*  54  100:invokevirtual   #677 <Method boolean String.equals(Object)>
	//*  55  103:ifeq            108
					return fragment1;
	//   56  106:aload_3         
	//   57  107:areturn         
			}

	//   58  108:iload_2         
	//   59  109:iconst_1        
	//   60  110:isub            
	//   61  111:istore_2        
		}
	//*  62  112:goto            75
		return null;
	//   63  115:aconst_null     
	//   64  116:areturn         
	}

	public Fragment findFragmentByWho(String s)
	{
		if(mActive != null && s != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #318 <Field SparseArray mActive>
	//*   2    4:ifnull          60
	//*   3    7:aload_1         
	//*   4    8:ifnull          60
		{
			for(int i = mActive.size() - 1; i >= 0; i--)
	//*   5   11:aload_0         
	//*   6   12:getfield        #318 <Field SparseArray mActive>
	//*   7   15:invokevirtual   #321 <Method int SparseArray.size()>
	//*   8   18:iconst_1        
	//*   9   19:isub            
	//*  10   20:istore_2        
	//*  11   21:iload_2         
	//*  12   22:iflt            60
			{
				Fragment fragment = (Fragment)mActive.valueAt(i);
	//   13   25:aload_0         
	//   14   26:getfield        #318 <Field SparseArray mActive>
	//   15   29:iload_2         
	//   16   30:invokevirtual   #324 <Method Object SparseArray.valueAt(int)>
	//   17   33:checkcast       #210 <Class Fragment>
	//   18   36:astore_3        
				if(fragment == null)
					continue;
	//   19   37:aload_3         
	//   20   38:ifnull          53
				fragment = fragment.findFragmentByWho(s);
	//   21   41:aload_3         
	//   22   42:aload_1         
	//   23   43:invokevirtual   #1256 <Method Fragment Fragment.findFragmentByWho(String)>
	//   24   46:astore_3        
				if(fragment != null)
	//*  25   47:aload_3         
	//*  26   48:ifnull          53
					return fragment;
	//   27   51:aload_3         
	//   28   52:areturn         
			}

	//   29   53:iload_2         
	//   30   54:iconst_1        
	//   31   55:isub            
	//   32   56:istore_2        
		}
	//*  33   57:goto            21
		return null;
	//   34   60:aconst_null     
	//   35   61:areturn         
	}

	public void freeBackStackIndex(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mBackStackIndices.set(i, ((Object) (null)));
	//    2    2:aload_0         
	//    3    3:getfield        #901 <Field ArrayList mBackStackIndices>
	//    4    6:iload_1         
	//    5    7:aconst_null     
	//    6    8:invokevirtual   #905 <Method Object ArrayList.set(int, Object)>
	//    7   11:pop             
		if(mAvailBackStackIndices == null)
	//*   8   12:aload_0         
	//*   9   13:getfield        #887 <Field ArrayList mAvailBackStackIndices>
	//*  10   16:ifnonnull       30
			mAvailBackStackIndices = new ArrayList();
	//   11   19:aload_0         
	//   12   20:new             #163 <Class ArrayList>
	//   13   23:dup             
	//   14   24:invokespecial   #164 <Method void ArrayList()>
	//   15   27:putfield        #887 <Field ArrayList mAvailBackStackIndices>
		if(DEBUG)
	//*  16   30:getstatic       #843 <Field boolean DEBUG>
	//*  17   33:ifeq            68
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   18   36:new             #347 <Class StringBuilder>
	//   19   39:dup             
	//   20   40:invokespecial   #348 <Method void StringBuilder()>
	//   21   43:astore_2        
			stringbuilder.append("Freeing back stack index ");
	//   22   44:aload_2         
	//   23   45:ldc2            #1258 <String "Freeing back stack index ">
	//   24   48:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
			stringbuilder.append(i);
	//   26   52:aload_2         
	//   27   53:iload_1         
	//   28   54:invokevirtual   #897 <Method StringBuilder StringBuilder.append(int)>
	//   29   57:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   30   58:ldc1            #72  <String "FragmentManager">
	//   31   60:aload_2         
	//   32   61:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   33   64:invokestatic    #851 <Method int Log.v(String, String)>
	//   34   67:pop             
		}
		mAvailBackStackIndices.add(((Object) (Integer.valueOf(i))));
	//   35   68:aload_0         
	//   36   69:getfield        #887 <Field ArrayList mAvailBackStackIndices>
	//   37   72:iload_1         
	//   38   73:invokestatic    #1261 <Method Integer Integer.valueOf(int)>
	//   39   76:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
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
		if(mActive == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #318 <Field SparseArray mActive>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mActive.size();
	//    5    9:aload_0         
	//    6   10:getfield        #318 <Field SparseArray mActive>
	//    7   13:invokevirtual   #321 <Method int SparseArray.size()>
	//    8   16:ireturn         
	}

	List getActiveFragments()
	{
		if(mActive == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #318 <Field SparseArray mActive>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		int j = mActive.size();
	//    5    9:aload_0         
	//    6   10:getfield        #318 <Field SparseArray mActive>
	//    7   13:invokevirtual   #321 <Method int SparseArray.size()>
	//    8   16:istore_2        
		ArrayList arraylist = new ArrayList(j);
	//    9   17:new             #163 <Class ArrayList>
	//   10   20:dup             
	//   11   21:iload_2         
	//   12   22:invokespecial   #379 <Method void ArrayList(int)>
	//   13   25:astore_3        
		for(int i = 0; i < j; i++)
	//*  14   26:iconst_0        
	//*  15   27:istore_1        
	//*  16   28:iload_1         
	//*  17   29:iload_2         
	//*  18   30:icmpge          53
			arraylist.add(mActive.valueAt(i));
	//   19   33:aload_3         
	//   20   34:aload_0         
	//   21   35:getfield        #318 <Field SparseArray mActive>
	//   22   38:iload_1         
	//   23   39:invokevirtual   #324 <Method Object SparseArray.valueAt(int)>
	//   24   42:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
	//   25   45:pop             

	//   26   46:iload_1         
	//   27   47:iconst_1        
	//   28   48:iadd            
	//   29   49:istore_1        
	//*  30   50:goto            28
		return ((List) (arraylist));
	//   31   53:aload_3         
	//   32   54:areturn         
	}

	public FragmentManager.BackStackEntry getBackStackEntryAt(int i)
	{
		return (FragmentManager.BackStackEntry)mBackStack.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #839 <Field ArrayList mBackStack>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #1268 <Class FragmentManager$BackStackEntry>
	//    5   11:areturn         
	}

	public int getBackStackEntryCount()
	{
		if(mBackStack != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #839 <Field ArrayList mBackStack>
	//*   2    4:ifnull          15
			return mBackStack.size();
	//    3    7:aload_0         
	//    4    8:getfield        #839 <Field ArrayList mBackStack>
	//    5   11:invokevirtual   #204 <Method int ArrayList.size()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public Fragment getFragment(Bundle bundle, String s)
	{
		int i = bundle.getInt(s, -1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #1277 <Method int Bundle.getInt(String, int)>
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
	//   11   15:getfield        #318 <Field SparseArray mActive>
	//   12   18:iload_3         
	//   13   19:invokevirtual   #1278 <Method Object SparseArray.get(int)>
	//   14   22:checkcast       #210 <Class Fragment>
	//   15   25:astore_1        
		if(bundle == null)
	//*  16   26:aload_1         
	//*  17   27:ifnonnull       87
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   18   30:new             #347 <Class StringBuilder>
	//   19   33:dup             
	//   20   34:invokespecial   #348 <Method void StringBuilder()>
	//   21   37:astore          4
			stringbuilder.append("Fragment no longer exists for key ");
	//   22   39:aload           4
	//   23   41:ldc2            #1280 <String "Fragment no longer exists for key ">
	//   24   44:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
			stringbuilder.append(s);
	//   26   48:aload           4
	//   27   50:aload_2         
	//   28   51:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   29   54:pop             
			stringbuilder.append(": index ");
	//   30   55:aload           4
	//   31   57:ldc2            #1282 <String ": index ">
	//   32   60:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   33   63:pop             
			stringbuilder.append(i);
	//   34   64:aload           4
	//   35   66:iload_3         
	//   36   67:invokevirtual   #897 <Method StringBuilder StringBuilder.append(int)>
	//   37   70:pop             
			throwException(((RuntimeException) (new IllegalStateException(stringbuilder.toString()))));
	//   38   71:aload_0         
	//   39   72:new             #338 <Class IllegalStateException>
	//   40   75:dup             
	//   41   76:aload           4
	//   42   78:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   43   81:invokespecial   #343 <Method void IllegalStateException(String)>
	//   44   84:invokespecial   #1284 <Method void throwException(RuntimeException)>
		}
		return ((Fragment) (bundle));
	//   45   87:aload_1         
	//   46   88:areturn         
	}

	public List getFragments()
	{
		if(mAdded.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #166 <Field ArrayList mAdded>
	//*   2    4:invokevirtual   #563 <Method boolean ArrayList.isEmpty()>
	//*   3    7:ifeq            14
			return Collections.EMPTY_LIST;
	//    4   10:getstatic       #1290 <Field List Collections.EMPTY_LIST>
	//    5   13:areturn         
		List list;
		synchronized(mAdded)
	//*   6   14:aload_0         
	//*   7   15:getfield        #166 <Field ArrayList mAdded>
	//*   8   18:astore_1        
	//*   9   19:aload_1         
	//*  10   20:monitorenter    
		{
			list = (List)mAdded.clone();
	//   11   21:aload_0         
	//   12   22:getfield        #166 <Field ArrayList mAdded>
	//   13   25:invokevirtual   #1293 <Method Object ArrayList.clone()>
	//   14   28:checkcast       #685 <Class List>
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
	//    1    1:getfield        #700 <Field Fragment mPrimaryNav>
	//    2    4:areturn         
	}

	public void hideFragment(Fragment fragment)
	{
		if(DEBUG)
	//*   0    0:getstatic       #843 <Field boolean DEBUG>
	//*   1    3:ifeq            38
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #347 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #348 <Method void StringBuilder()>
	//    5   13:astore_2        
			stringbuilder.append("hide: ");
	//    6   14:aload_2         
	//    7   15:ldc2            #1298 <String "hide: ">
	//    8   18:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (fragment)));
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   14   28:ldc1            #72  <String "FragmentManager">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #851 <Method int Log.v(String, String)>
	//   18   37:pop             
		}
		if(!fragment.mHidden)
	//*  19   38:aload_1         
	//*  20   39:getfield        #230 <Field boolean Fragment.mHidden>
	//*  21   42:ifne            60
		{
			fragment.mHidden = true;
	//   22   45:aload_1         
	//   23   46:iconst_1        
	//   24   47:putfield        #230 <Field boolean Fragment.mHidden>
			fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
	//   25   50:aload_1         
	//   26   51:iconst_1        
	//   27   52:aload_1         
	//   28   53:getfield        #869 <Field boolean Fragment.mHiddenChanged>
	//   29   56:ixor            
	//   30   57:putfield        #869 <Field boolean Fragment.mHiddenChanged>
		}
	//   31   60:return          
	}

	public boolean isDestroyed()
	{
		return mDestroyed;
	//    0    0:aload_0         
	//    1    1:getfield        #982 <Field boolean mDestroyed>
	//    2    4:ireturn         
	}

	boolean isStateAtLeast(int i)
	{
		return mCurState >= i;
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field int mCurState>
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
	//    1    1:getfield        #957 <Field boolean mStateSaved>
	//    2    4:ifne            19
	//    3    7:aload_0         
	//    4    8:getfield        #959 <Field boolean mStopped>
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
	//    1    1:invokevirtual   #216 <Method int Fragment.getNextAnim()>
	//    2    4:istore          7
		Animation animation = fragment.onCreateAnimation(i, flag, k);
	//    3    6:aload_1         
	//    4    7:iload_2         
	//    5    8:iload_3         
	//    6    9:iload           7
	//    7   11:invokevirtual   #1306 <Method Animation Fragment.onCreateAnimation(int, boolean, int)>
	//    8   14:astore          9
		if(animation != null)
	//*   9   16:aload           9
	//*  10   18:ifnull          32
			return new AnimationOrAnimator(animation);
	//   11   21:new             #26  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   12   24:dup             
	//   13   25:aload           9
	//   14   27:aconst_null     
	//   15   28:invokespecial   #629 <Method void FragmentManagerImpl$AnimationOrAnimator(Animation, FragmentManagerImpl$1)>
	//   16   31:areturn         
		fragment = ((Fragment) (fragment.onCreateAnimator(i, flag, k)));
	//   17   32:aload_1         
	//   18   33:iload_2         
	//   19   34:iload_3         
	//   20   35:iload           7
	//   21   37:invokevirtual   #1310 <Method Animator Fragment.onCreateAnimator(int, boolean, int)>
	//   22   40:astore_1        
		if(fragment != null)
	//*  23   41:aload_1         
	//*  24   42:ifnull          55
			return new AnimationOrAnimator(((Animator) (fragment)));
	//   25   45:new             #26  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   26   48:dup             
	//   27   49:aload_1         
	//   28   50:aconst_null     
	//   29   51:invokespecial   #1313 <Method void FragmentManagerImpl$AnimationOrAnimator(Animator, FragmentManagerImpl$1)>
	//   30   54:areturn         
		if(k == 0) goto _L2; else goto _L1
	//   31   55:iload           7
	//   32   57:ifeq            202
_L1:
		boolean flag1;
		boolean flag2;
		boolean flag3;
		flag3 = "anim".equals(((Object) (mHost.getContext().getResources().getResourceTypeName(k))));
	//   33   60:ldc2            #1315 <String "anim">
	//   34   63:aload_0         
	//   35   64:getfield        #444 <Field FragmentHostCallback mHost>
	//   36   67:invokevirtual   #1319 <Method Context FragmentHostCallback.getContext()>
	//   37   70:invokevirtual   #1325 <Method Resources Context.getResources()>
	//   38   73:iload           7
	//   39   75:invokevirtual   #1330 <Method String Resources.getResourceTypeName(int)>
	//   40   78:invokevirtual   #677 <Method boolean String.equals(Object)>
	//   41   81:istore          8
		flag2 = false;
	//   42   83:iconst_0        
	//   43   84:istore          6
		flag1 = flag2;
	//   44   86:iload           6
	//   45   88:istore          5
		if(!flag3)
			break MISSING_BLOCK_LABEL_133;
	//   46   90:iload           8
	//   47   92:ifeq            133
		fragment = ((Fragment) (AnimationUtils.loadAnimation(mHost.getContext(), k)));
	//   48   95:aload_0         
	//   49   96:getfield        #444 <Field FragmentHostCallback mHost>
	//   50   99:invokevirtual   #1319 <Method Context FragmentHostCallback.getContext()>
	//   51  102:iload           7
	//   52  104:invokestatic    #1335 <Method Animation AnimationUtils.loadAnimation(Context, int)>
	//   53  107:astore_1        
		if(fragment == null)
			break MISSING_BLOCK_LABEL_124;
	//   54  108:aload_1         
	//   55  109:ifnull          124
		fragment = ((Fragment) (new AnimationOrAnimator(((Animation) (fragment)))));
	//   56  112:new             #26  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   57  115:dup             
	//   58  116:aload_1         
	//   59  117:aconst_null     
	//   60  118:invokespecial   #629 <Method void FragmentManagerImpl$AnimationOrAnimator(Animation, FragmentManagerImpl$1)>
	//   61  121:astore_1        
		return ((AnimationOrAnimator) (fragment));
	//   62  122:aload_1         
	//   63  123:areturn         
		flag1 = true;
	//   64  124:iconst_1        
	//   65  125:istore          5
		break MISSING_BLOCK_LABEL_133;
	//   66  127:goto            133
		fragment;
	//   67  130:astore_1        
		throw fragment;
	//   68  131:aload_1         
	//   69  132:athrow          
_L6:
		if(flag1) goto _L2; else goto _L3
	//   70  133:iload           5
	//   71  135:ifne            202
_L3:
		fragment = ((Fragment) (AnimatorInflater.loadAnimator(mHost.getContext(), k)));
	//   72  138:aload_0         
	//   73  139:getfield        #444 <Field FragmentHostCallback mHost>
	//   74  142:invokevirtual   #1319 <Method Context FragmentHostCallback.getContext()>
	//   75  145:iload           7
	//   76  147:invokestatic    #1341 <Method Animator AnimatorInflater.loadAnimator(Context, int)>
	//   77  150:astore_1        
		if(fragment == null) goto _L2; else goto _L4
	//   78  151:aload_1         
	//   79  152:ifnull          202
_L4:
		fragment = ((Fragment) (new AnimationOrAnimator(((Animator) (fragment)))));
	//   80  155:new             #26  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   81  158:dup             
	//   82  159:aload_1         
	//   83  160:aconst_null     
	//   84  161:invokespecial   #1313 <Method void FragmentManagerImpl$AnimationOrAnimator(Animator, FragmentManagerImpl$1)>
	//   85  164:astore_1        
		return ((AnimationOrAnimator) (fragment));
	//   86  165:aload_1         
	//   87  166:areturn         
		fragment;
	//   88  167:astore_1        
		if(flag3)
	//*  89  168:iload           8
	//*  90  170:ifeq            175
			throw fragment;
	//   91  173:aload_1         
	//   92  174:athrow          
		fragment = ((Fragment) (AnimationUtils.loadAnimation(mHost.getContext(), k)));
	//   93  175:aload_0         
	//   94  176:getfield        #444 <Field FragmentHostCallback mHost>
	//   95  179:invokevirtual   #1319 <Method Context FragmentHostCallback.getContext()>
	//   96  182:iload           7
	//   97  184:invokestatic    #1335 <Method Animation AnimationUtils.loadAnimation(Context, int)>
	//   98  187:astore_1        
		if(fragment != null)
	//*  99  188:aload_1         
	//* 100  189:ifnull          202
			return new AnimationOrAnimator(((Animation) (fragment)));
	//  101  192:new             #26  <Class FragmentManagerImpl$AnimationOrAnimator>
	//  102  195:dup             
	//  103  196:aload_1         
	//  104  197:aconst_null     
	//  105  198:invokespecial   #629 <Method void FragmentManagerImpl$AnimationOrAnimator(Animation, FragmentManagerImpl$1)>
	//  106  201:areturn         
_L2:
		if(i == 0)
	//* 107  202:iload_2         
	//* 108  203:ifne            208
			return null;
	//  109  206:aconst_null     
	//  110  207:areturn         
		i = transitToStyleIndex(i, flag);
	//  111  208:iload_2         
	//  112  209:iload_3         
	//  113  210:invokestatic    #1343 <Method int transitToStyleIndex(int, boolean)>
	//  114  213:istore_2        
		if(i < 0)
	//* 115  214:iload_2         
	//* 116  215:ifge            220
			return null;
	//  117  218:aconst_null     
	//  118  219:areturn         
		switch(i)
	//* 119  220:iload_2         
		{
	//* 120  221:tableswitch     1 6: default 260
	//	               1 369
	//	               2 352
	//	               3 335
	//	               4 318
	//	               5 305
	//	               6 292
		default:
			i = j;
	//  121  260:iload           4
	//  122  262:istore_2        
			if(j == 0)
	//* 123  263:iload           4
	//* 124  265:ifne            386
			{
				i = j;
	//  125  268:iload           4
	//  126  270:istore_2        
				if(mHost.onHasWindowAnimations())
	//* 127  271:aload_0         
	//* 128  272:getfield        #444 <Field FragmentHostCallback mHost>
	//* 129  275:invokevirtual   #1346 <Method boolean FragmentHostCallback.onHasWindowAnimations()>
	//* 130  278:ifeq            386
					i = mHost.onGetWindowAnimations();
	//  131  281:aload_0         
	//  132  282:getfield        #444 <Field FragmentHostCallback mHost>
	//  133  285:invokevirtual   #1349 <Method int FragmentHostCallback.onGetWindowAnimations()>
	//  134  288:istore_2        
			}
			break;

	//* 135  289:goto            386
		case 6: // '\006'
			return makeFadeAnimation(mHost.getContext(), 1.0F, 0.0F);
	//  136  292:aload_0         
	//  137  293:getfield        #444 <Field FragmentHostCallback mHost>
	//  138  296:invokevirtual   #1319 <Method Context FragmentHostCallback.getContext()>
	//  139  299:fconst_1        
	//  140  300:fconst_0        
	//  141  301:invokestatic    #1351 <Method FragmentManagerImpl$AnimationOrAnimator makeFadeAnimation(Context, float, float)>
	//  142  304:areturn         

		case 5: // '\005'
			return makeFadeAnimation(mHost.getContext(), 0.0F, 1.0F);
	//  143  305:aload_0         
	//  144  306:getfield        #444 <Field FragmentHostCallback mHost>
	//  145  309:invokevirtual   #1319 <Method Context FragmentHostCallback.getContext()>
	//  146  312:fconst_0        
	//  147  313:fconst_1        
	//  148  314:invokestatic    #1351 <Method FragmentManagerImpl$AnimationOrAnimator makeFadeAnimation(Context, float, float)>
	//  149  317:areturn         

		case 4: // '\004'
			return makeOpenCloseAnimation(mHost.getContext(), 1.0F, 1.075F, 1.0F, 0.0F);
	//  150  318:aload_0         
	//  151  319:getfield        #444 <Field FragmentHostCallback mHost>
	//  152  322:invokevirtual   #1319 <Method Context FragmentHostCallback.getContext()>
	//  153  325:fconst_1        
	//  154  326:ldc2            #1352 <Float 1.075F>
	//  155  329:fconst_1        
	//  156  330:fconst_0        
	//  157  331:invokestatic    #1354 <Method FragmentManagerImpl$AnimationOrAnimator makeOpenCloseAnimation(Context, float, float, float, float)>
	//  158  334:areturn         

		case 3: // '\003'
			return makeOpenCloseAnimation(mHost.getContext(), 0.975F, 1.0F, 0.0F, 1.0F);
	//  159  335:aload_0         
	//  160  336:getfield        #444 <Field FragmentHostCallback mHost>
	//  161  339:invokevirtual   #1319 <Method Context FragmentHostCallback.getContext()>
	//  162  342:ldc2            #1355 <Float 0.975F>
	//  163  345:fconst_1        
	//  164  346:fconst_0        
	//  165  347:fconst_1        
	//  166  348:invokestatic    #1354 <Method FragmentManagerImpl$AnimationOrAnimator makeOpenCloseAnimation(Context, float, float, float, float)>
	//  167  351:areturn         

		case 2: // '\002'
			return makeOpenCloseAnimation(mHost.getContext(), 1.0F, 0.975F, 1.0F, 0.0F);
	//  168  352:aload_0         
	//  169  353:getfield        #444 <Field FragmentHostCallback mHost>
	//  170  356:invokevirtual   #1319 <Method Context FragmentHostCallback.getContext()>
	//  171  359:fconst_1        
	//  172  360:ldc2            #1355 <Float 0.975F>
	//  173  363:fconst_1        
	//  174  364:fconst_0        
	//  175  365:invokestatic    #1354 <Method FragmentManagerImpl$AnimationOrAnimator makeOpenCloseAnimation(Context, float, float, float, float)>
	//  176  368:areturn         

		case 1: // '\001'
			return makeOpenCloseAnimation(mHost.getContext(), 1.125F, 1.0F, 0.0F, 1.0F);
	//  177  369:aload_0         
	//  178  370:getfield        #444 <Field FragmentHostCallback mHost>
	//  179  373:invokevirtual   #1319 <Method Context FragmentHostCallback.getContext()>
	//  180  376:ldc2            #1356 <Float 1.125F>
	//  181  379:fconst_1        
	//  182  380:fconst_0        
	//  183  381:fconst_1        
	//  184  382:invokestatic    #1354 <Method FragmentManagerImpl$AnimationOrAnimator makeOpenCloseAnimation(Context, float, float, float, float)>
	//  185  385:areturn         
		}
		if(i == 0)
	//* 186  386:iload_2         
	//* 187  387:ifne            392
			return null;
	//  188  390:aconst_null     
	//  189  391:areturn         
		else
			return null;
	//  190  392:aconst_null     
	//  191  393:areturn         
		fragment;
	//  192  394:astore_1        
		flag1 = flag2;
	//  193  395:iload           6
	//  194  397:istore          5
		if(true) goto _L6; else goto _L5
	//  195  399:goto            133
_L5:
	}

	void makeActive(Fragment fragment)
	{
		if(fragment.mIndex >= 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1357 <Field int Fragment.mIndex>
	//*   2    4:iflt            8
			return;
	//    3    7:return          
		int i = mNextFragmentIndex;
	//    4    8:aload_0         
	//    5    9:getfield        #161 <Field int mNextFragmentIndex>
	//    6   12:istore_2        
		mNextFragmentIndex = i + 1;
	//    7   13:aload_0         
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:iadd            
	//   11   17:putfield        #161 <Field int mNextFragmentIndex>
		fragment.setIndex(i, mParent);
	//   12   20:aload_1         
	//   13   21:iload_2         
	//   14   22:aload_0         
	//   15   23:getfield        #917 <Field Fragment mParent>
	//   16   26:invokevirtual   #1361 <Method void Fragment.setIndex(int, Fragment)>
		if(mActive == null)
	//*  17   29:aload_0         
	//*  18   30:getfield        #318 <Field SparseArray mActive>
	//*  19   33:ifnonnull       47
			mActive = new SparseArray();
	//   20   36:aload_0         
	//   21   37:new             #320 <Class SparseArray>
	//   22   40:dup             
	//   23   41:invokespecial   #1362 <Method void SparseArray()>
	//   24   44:putfield        #318 <Field SparseArray mActive>
		mActive.put(fragment.mIndex, ((Object) (fragment)));
	//   25   47:aload_0         
	//   26   48:getfield        #318 <Field SparseArray mActive>
	//   27   51:aload_1         
	//   28   52:getfield        #1357 <Field int Fragment.mIndex>
	//   29   55:aload_1         
	//   30   56:invokevirtual   #1365 <Method void SparseArray.put(int, Object)>
		if(DEBUG)
	//*  31   59:getstatic       #843 <Field boolean DEBUG>
	//*  32   62:ifeq            97
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   33   65:new             #347 <Class StringBuilder>
	//   34   68:dup             
	//   35   69:invokespecial   #348 <Method void StringBuilder()>
	//   36   72:astore_3        
			stringbuilder.append("Allocated fragment index ");
	//   37   73:aload_3         
	//   38   74:ldc2            #1367 <String "Allocated fragment index ">
	//   39   77:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   40   80:pop             
			stringbuilder.append(((Object) (fragment)));
	//   41   81:aload_3         
	//   42   82:aload_1         
	//   43   83:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//   44   86:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   45   87:ldc1            #72  <String "FragmentManager">
	//   46   89:aload_3         
	//   47   90:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   48   93:invokestatic    #851 <Method int Log.v(String, String)>
	//   49   96:pop             
		}
	//   50   97:return          
	}

	void makeInactive(Fragment fragment)
	{
		if(fragment.mIndex < 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1357 <Field int Fragment.mIndex>
	//*   2    4:ifge            8
			return;
	//    3    7:return          
		if(DEBUG)
	//*   4    8:getstatic       #843 <Field boolean DEBUG>
	//*   5   11:ifeq            46
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   14:new             #347 <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #348 <Method void StringBuilder()>
	//    9   21:astore_2        
			stringbuilder.append("Freeing fragment index ");
	//   10   22:aload_2         
	//   11   23:ldc2            #1370 <String "Freeing fragment index ">
	//   12   26:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:pop             
			stringbuilder.append(((Object) (fragment)));
	//   14   30:aload_2         
	//   15   31:aload_1         
	//   16   32:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//   17   35:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   18   36:ldc1            #72  <String "FragmentManager">
	//   19   38:aload_2         
	//   20   39:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   21   42:invokestatic    #851 <Method int Log.v(String, String)>
	//   22   45:pop             
		}
		mActive.put(fragment.mIndex, ((Object) (null)));
	//   23   46:aload_0         
	//   24   47:getfield        #318 <Field SparseArray mActive>
	//   25   50:aload_1         
	//   26   51:getfield        #1357 <Field int Fragment.mIndex>
	//   27   54:aconst_null     
	//   28   55:invokevirtual   #1365 <Method void SparseArray.put(int, Object)>
		fragment.initState();
	//   29   58:aload_1         
	//   30   59:invokevirtual   #1373 <Method void Fragment.initState()>
	//   31   62:return          
	}

	void moveFragmentToExpectedState(Fragment fragment)
	{
		if(fragment == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		int k = mCurState;
	//    3    5:aload_0         
	//    4    6:getfield        #173 <Field int mCurState>
	//    5    9:istore_3        
		int i = k;
	//    6   10:iload_3         
	//    7   11:istore_2        
		if(fragment.mRemoving)
	//*   8   12:aload_1         
	//*   9   13:getfield        #866 <Field boolean Fragment.mRemoving>
	//*  10   16:ifeq            41
			if(fragment.isInBackStack())
	//*  11   19:aload_1         
	//*  12   20:invokevirtual   #1377 <Method boolean Fragment.isInBackStack()>
	//*  13   23:ifeq            35
				i = Math.min(k, 1);
	//   14   26:iload_3         
	//   15   27:iconst_1        
	//   16   28:invokestatic    #200 <Method int Math.min(int, int)>
	//   17   31:istore_2        
			else
	//*  18   32:goto            41
				i = Math.min(k, 0);
	//   19   35:iload_3         
	//   20   36:iconst_0        
	//   21   37:invokestatic    #200 <Method int Math.min(int, int)>
	//   22   40:istore_2        
		moveToState(fragment, i, fragment.getNextTransition(), fragment.getNextTransitionStyle(), false);
	//   23   41:aload_0         
	//   24   42:aload_1         
	//   25   43:iload_2         
	//   26   44:aload_1         
	//   27   45:invokevirtual   #219 <Method int Fragment.getNextTransition()>
	//   28   48:aload_1         
	//   29   49:invokevirtual   #929 <Method int Fragment.getNextTransitionStyle()>
	//   30   52:iconst_0        
	//   31   53:invokevirtual   #223 <Method void moveToState(Fragment, int, int, int, boolean)>
		if(fragment.mView != null)
	//*  32   56:aload_1         
	//*  33   57:getfield        #227 <Field View Fragment.mView>
	//*  34   60:ifnull          244
		{
			Object obj = ((Object) (findFragmentUnder(fragment)));
	//   35   63:aload_0         
	//   36   64:aload_1         
	//   37   65:invokespecial   #1379 <Method Fragment findFragmentUnder(Fragment)>
	//   38   68:astore          4
			if(obj != null)
	//*  39   70:aload           4
	//*  40   72:ifnull          127
			{
				obj = ((Object) (((Fragment) (obj)).mView));
	//   41   75:aload           4
	//   42   77:getfield        #227 <Field View Fragment.mView>
	//   43   80:astore          4
				ViewGroup viewgroup = fragment.mContainer;
	//   44   82:aload_1         
	//   45   83:getfield        #247 <Field ViewGroup Fragment.mContainer>
	//   46   86:astore          5
				int j = viewgroup.indexOfChild(((View) (obj)));
	//   47   88:aload           5
	//   48   90:aload           4
	//   49   92:invokevirtual   #1383 <Method int ViewGroup.indexOfChild(View)>
	//   50   95:istore_2        
				int l = viewgroup.indexOfChild(fragment.mView);
	//   51   96:aload           5
	//   52   98:aload_1         
	//   53   99:getfield        #227 <Field View Fragment.mView>
	//   54  102:invokevirtual   #1383 <Method int ViewGroup.indexOfChild(View)>
	//   55  105:istore_3        
				if(l < j)
	//*  56  106:iload_3         
	//*  57  107:iload_2         
	//*  58  108:icmpge          127
				{
					viewgroup.removeViewAt(l);
	//   59  111:aload           5
	//   60  113:iload_3         
	//   61  114:invokevirtual   #1386 <Method void ViewGroup.removeViewAt(int)>
					viewgroup.addView(fragment.mView, j);
	//   62  117:aload           5
	//   63  119:aload_1         
	//   64  120:getfield        #227 <Field View Fragment.mView>
	//   65  123:iload_2         
	//   66  124:invokevirtual   #1390 <Method void ViewGroup.addView(View, int)>
				}
			}
			if(fragment.mIsNewlyAdded && fragment.mContainer != null)
	//*  67  127:aload_1         
	//*  68  128:getfield        #233 <Field boolean Fragment.mIsNewlyAdded>
	//*  69  131:ifeq            244
	//*  70  134:aload_1         
	//*  71  135:getfield        #247 <Field ViewGroup Fragment.mContainer>
	//*  72  138:ifnull          244
			{
				if(fragment.mPostponedAlpha > 0.0F)
	//*  73  141:aload_1         
	//*  74  142:getfield        #406 <Field float Fragment.mPostponedAlpha>
	//*  75  145:fconst_0        
	//*  76  146:fcmpl           
	//*  77  147:ifle            161
					fragment.mView.setAlpha(fragment.mPostponedAlpha);
	//   78  150:aload_1         
	//   79  151:getfield        #227 <Field View Fragment.mView>
	//   80  154:aload_1         
	//   81  155:getfield        #406 <Field float Fragment.mPostponedAlpha>
	//   82  158:invokevirtual   #409 <Method void View.setAlpha(float)>
				fragment.mPostponedAlpha = 0.0F;
	//   83  161:aload_1         
	//   84  162:fconst_0        
	//   85  163:putfield        #406 <Field float Fragment.mPostponedAlpha>
				fragment.mIsNewlyAdded = false;
	//   86  166:aload_1         
	//   87  167:iconst_0        
	//   88  168:putfield        #233 <Field boolean Fragment.mIsNewlyAdded>
				AnimationOrAnimator animationoranimator = loadAnimation(fragment, fragment.getNextTransition(), true, fragment.getNextTransitionStyle());
	//   89  171:aload_0         
	//   90  172:aload_1         
	//   91  173:aload_1         
	//   92  174:invokevirtual   #219 <Method int Fragment.getNextTransition()>
	//   93  177:iconst_1        
	//   94  178:aload_1         
	//   95  179:invokevirtual   #929 <Method int Fragment.getNextTransitionStyle()>
	//   96  182:invokevirtual   #933 <Method FragmentManagerImpl$AnimationOrAnimator loadAnimation(Fragment, int, boolean, int)>
	//   97  185:astore          4
				if(animationoranimator != null)
	//*  98  187:aload           4
	//*  99  189:ifnull          244
				{
					setHWLayerAnimListenerIfAlpha(fragment.mView, animationoranimator);
	//  100  192:aload_1         
	//  101  193:getfield        #227 <Field View Fragment.mView>
	//  102  196:aload           4
	//  103  198:invokestatic    #284 <Method void setHWLayerAnimListenerIfAlpha(View, FragmentManagerImpl$AnimationOrAnimator)>
					if(animationoranimator.animation != null)
	//* 104  201:aload           4
	//* 105  203:getfield        #261 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//* 106  206:ifnull          224
					{
						fragment.mView.startAnimation(animationoranimator.animation);
	//  107  209:aload_1         
	//  108  210:getfield        #227 <Field View Fragment.mView>
	//  109  213:aload           4
	//  110  215:getfield        #261 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//  111  218:invokevirtual   #290 <Method void View.startAnimation(Animation)>
					} else
	//* 112  221:goto            244
					{
						animationoranimator.animator.setTarget(((Object) (fragment.mView)));
	//  113  224:aload           4
	//  114  226:getfield        #294 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//  115  229:aload_1         
	//  116  230:getfield        #227 <Field View Fragment.mView>
	//  117  233:invokevirtual   #311 <Method void Animator.setTarget(Object)>
						animationoranimator.animator.start();
	//  118  236:aload           4
	//  119  238:getfield        #294 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//  120  241:invokevirtual   #314 <Method void Animator.start()>
					}
				}
			}
		}
		if(fragment.mHiddenChanged)
	//* 121  244:aload_1         
	//* 122  245:getfield        #869 <Field boolean Fragment.mHiddenChanged>
	//* 123  248:ifeq            256
			completeShowHideFragment(fragment);
	//  124  251:aload_0         
	//  125  252:aload_1         
	//  126  253:invokevirtual   #1392 <Method void completeShowHideFragment(Fragment)>
	//  127  256:return          
	}

	void moveToState(int i, boolean flag)
	{
		if(mHost == null && i != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #444 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       22
	//*   3    7:iload_1         
	//*   4    8:ifeq            22
			throw new IllegalStateException("No activity");
	//    5   11:new             #338 <Class IllegalStateException>
	//    6   14:dup             
	//    7   15:ldc2            #1394 <String "No activity">
	//    8   18:invokespecial   #343 <Method void IllegalStateException(String)>
	//    9   21:athrow          
		if(!flag && i == mCurState)
	//*  10   22:iload_2         
	//*  11   23:ifne            35
	//*  12   26:iload_1         
	//*  13   27:aload_0         
	//*  14   28:getfield        #173 <Field int mCurState>
	//*  15   31:icmpne          35
			return;
	//   16   34:return          
		mCurState = i;
	//   17   35:aload_0         
	//   18   36:iload_1         
	//   19   37:putfield        #173 <Field int mCurState>
		if(mActive != null)
	//*  20   40:aload_0         
	//*  21   41:getfield        #318 <Field SparseArray mActive>
	//*  22   44:ifnull          192
		{
			int j = mAdded.size();
	//   23   47:aload_0         
	//   24   48:getfield        #166 <Field ArrayList mAdded>
	//   25   51:invokevirtual   #204 <Method int ArrayList.size()>
	//   26   54:istore_3        
			for(i = 0; i < j; i++)
	//*  27   55:iconst_0        
	//*  28   56:istore_1        
	//*  29   57:iload_1         
	//*  30   58:iload_3         
	//*  31   59:icmpge          84
				moveFragmentToExpectedState((Fragment)mAdded.get(i));
	//   32   62:aload_0         
	//   33   63:aload_0         
	//   34   64:getfield        #166 <Field ArrayList mAdded>
	//   35   67:iload_1         
	//   36   68:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//   37   71:checkcast       #210 <Class Fragment>
	//   38   74:invokevirtual   #1396 <Method void moveFragmentToExpectedState(Fragment)>

	//   39   77:iload_1         
	//   40   78:iconst_1        
	//   41   79:iadd            
	//   42   80:istore_1        
	//*  43   81:goto            57
			j = mActive.size();
	//   44   84:aload_0         
	//   45   85:getfield        #318 <Field SparseArray mActive>
	//   46   88:invokevirtual   #321 <Method int SparseArray.size()>
	//   47   91:istore_3        
			for(i = 0; i < j; i++)
	//*  48   92:iconst_0        
	//*  49   93:istore_1        
	//*  50   94:iload_1         
	//*  51   95:iload_3         
	//*  52   96:icmpge          154
			{
				Fragment fragment = (Fragment)mActive.valueAt(i);
	//   53   99:aload_0         
	//   54  100:getfield        #318 <Field SparseArray mActive>
	//   55  103:iload_1         
	//   56  104:invokevirtual   #324 <Method Object SparseArray.valueAt(int)>
	//   57  107:checkcast       #210 <Class Fragment>
	//   58  110:astore          4
				if(fragment != null && (fragment.mRemoving || fragment.mDetached) && !fragment.mIsNewlyAdded)
	//*  59  112:aload           4
	//*  60  114:ifnull          147
	//*  61  117:aload           4
	//*  62  119:getfield        #866 <Field boolean Fragment.mRemoving>
	//*  63  122:ifne            133
	//*  64  125:aload           4
	//*  65  127:getfield        #858 <Field boolean Fragment.mDetached>
	//*  66  130:ifeq            147
	//*  67  133:aload           4
	//*  68  135:getfield        #233 <Field boolean Fragment.mIsNewlyAdded>
	//*  69  138:ifne            147
					moveFragmentToExpectedState(fragment);
	//   70  141:aload_0         
	//   71  142:aload           4
	//   72  144:invokevirtual   #1396 <Method void moveFragmentToExpectedState(Fragment)>
			}

	//   73  147:iload_1         
	//   74  148:iconst_1        
	//   75  149:iadd            
	//   76  150:istore_1        
	//*  77  151:goto            94
			startPendingDeferredFragments();
	//   78  154:aload_0         
	//   79  155:invokevirtual   #1125 <Method void startPendingDeferredFragments()>
			if(mNeedMenuInvalidate && mHost != null && mCurState == 5)
	//*  80  158:aload_0         
	//*  81  159:getfield        #877 <Field boolean mNeedMenuInvalidate>
	//*  82  162:ifeq            192
	//*  83  165:aload_0         
	//*  84  166:getfield        #444 <Field FragmentHostCallback mHost>
	//*  85  169:ifnull          192
	//*  86  172:aload_0         
	//*  87  173:getfield        #173 <Field int mCurState>
	//*  88  176:iconst_5        
	//*  89  177:icmpne          192
			{
				mHost.onSupportInvalidateOptionsMenu();
	//   90  180:aload_0         
	//   91  181:getfield        #444 <Field FragmentHostCallback mHost>
	//   92  184:invokevirtual   #1399 <Method void FragmentHostCallback.onSupportInvalidateOptionsMenu()>
				mNeedMenuInvalidate = false;
	//   93  187:aload_0         
	//   94  188:iconst_0        
	//   95  189:putfield        #877 <Field boolean mNeedMenuInvalidate>
			}
		}
	//   96  192:return          
	}

	void moveToState(Fragment fragment)
	{
		moveToState(fragment, mCurState, 0, 0, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #173 <Field int mCurState>
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #223 <Method void moveToState(Fragment, int, int, int, boolean)>
	//    8   12:return          
	}

	void moveToState(Fragment fragment, int i, int j, int k, boolean flag)
	{
		android.content.res.Resources.NotFoundException notfoundexception;
		boolean flag2 = fragment.mAdded;
	//    0    0:aload_1         
	//    1    1:getfield        #650 <Field boolean Fragment.mAdded>
	//    2    4:istore          9
		int j1 = 1;
	//    3    6:iconst_1        
	//    4    7:istore          7
		boolean flag1 = true;
	//    5    9:iconst_1        
	//    6   10:istore          8
		if(!flag2 || fragment.mDetached)
	//*   7   12:iload           9
	//*   8   14:ifeq            30
	//*   9   17:aload_1         
	//*  10   18:getfield        #858 <Field boolean Fragment.mDetached>
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
	//*  26   48:getfield        #866 <Field boolean Fragment.mRemoving>
	//*  27   51:ifeq            91
		{
			i1 = i;
	//   28   54:iload_2         
	//   29   55:istore          6
			if(i > fragment.mState)
	//*  30   57:iload_2         
	//*  31   58:aload_1         
	//*  32   59:getfield        #213 <Field int Fragment.mState>
	//*  33   62:icmple          91
				if(fragment.mState == 0 && fragment.isInBackStack())
	//*  34   65:aload_1         
	//*  35   66:getfield        #213 <Field int Fragment.mState>
	//*  36   69:ifne            85
	//*  37   72:aload_1         
	//*  38   73:invokevirtual   #1377 <Method boolean Fragment.isInBackStack()>
	//*  39   76:ifeq            85
					i1 = 1;
	//   40   79:iconst_1        
	//   41   80:istore          6
				else
	//*  42   82:goto            91
					i1 = fragment.mState;
	//   43   85:aload_1         
	//   44   86:getfield        #213 <Field int Fragment.mState>
	//   45   89:istore          6
		}
		if(fragment.mDeferStart && fragment.mState < 4 && i1 > 3)
	//*  46   91:aload_1         
	//*  47   92:getfield        #1402 <Field boolean Fragment.mDeferStart>
	//*  48   95:ifeq            117
	//*  49   98:aload_1         
	//*  50   99:getfield        #213 <Field int Fragment.mState>
	//*  51  102:iconst_4        
	//*  52  103:icmpge          117
	//*  53  106:iload           6
	//*  54  108:iconst_3        
	//*  55  109:icmple          117
			i = 3;
	//   56  112:iconst_3        
	//   57  113:istore_2        
		else
	//*  58  114:goto            120
			i = i1;
	//   59  117:iload           6
	//   60  119:istore_2        
		if(fragment.mState <= i)
	//*  61  120:aload_1         
	//*  62  121:getfield        #213 <Field int Fragment.mState>
	//*  63  124:iload_2         
	//*  64  125:icmpgt          1394
		{
			if(fragment.mFromLayout && !fragment.mInLayout)
	//*  65  128:aload_1         
	//*  66  129:getfield        #1213 <Field boolean Fragment.mFromLayout>
	//*  67  132:ifeq            143
	//*  68  135:aload_1         
	//*  69  136:getfield        #1405 <Field boolean Fragment.mInLayout>
	//*  70  139:ifne            143
				return;
	//   71  142:return          
			if(fragment.getAnimatingAway() != null || fragment.getAnimator() != null)
	//*  72  143:aload_1         
	//*  73  144:invokevirtual   #419 <Method View Fragment.getAnimatingAway()>
	//*  74  147:ifnonnull       157
	//*  75  150:aload_1         
	//*  76  151:invokevirtual   #436 <Method Animator Fragment.getAnimator()>
	//*  77  154:ifnull          179
			{
				fragment.setAnimatingAway(((View) (null)));
	//   78  157:aload_1         
	//   79  158:aconst_null     
	//   80  159:invokevirtual   #267 <Method void Fragment.setAnimatingAway(View)>
				fragment.setAnimator(((Animator) (null)));
	//   81  162:aload_1         
	//   82  163:aconst_null     
	//   83  164:invokevirtual   #298 <Method void Fragment.setAnimator(Animator)>
				moveToState(fragment, fragment.getStateAfterAnimating(), 0, 0, true);
	//   84  167:aload_0         
	//   85  168:aload_1         
	//   86  169:aload_1         
	//   87  170:invokevirtual   #422 <Method int Fragment.getStateAfterAnimating()>
	//   88  173:iconst_0        
	//   89  174:iconst_0        
	//   90  175:iconst_1        
	//   91  176:invokevirtual   #223 <Method void moveToState(Fragment, int, int, int, boolean)>
			}
			k = i;
	//   92  179:iload_2         
	//   93  180:istore          4
			i1 = i;
	//   94  182:iload_2         
	//   95  183:istore          6
			j1 = i;
	//   96  185:iload_2         
	//   97  186:istore          7
			j = i;
	//   98  188:iload_2         
	//   99  189:istore_3        
			switch(fragment.mState)
	//* 100  190:aload_1         
	//* 101  191:getfield        #213 <Field int Fragment.mState>
			{
	//* 102  194:tableswitch     0 4: default 228
	//	               0 234
	//	               1 769
	//	               2 1235
	//	               3 1254
	//	               4 1318
			default:
				i1 = i;
	//  103  228:iload_2         
	//  104  229:istore          6
				break;

	//* 105  231:goto            2050
			case 0: // '\0'
				k = i;
	//  106  234:iload_2         
	//  107  235:istore          4
				if(i > 0)
	//* 108  237:iload_2         
	//* 109  238:ifle            769
				{
					if(DEBUG)
	//* 110  241:getstatic       #843 <Field boolean DEBUG>
	//* 111  244:ifeq            283
					{
						StringBuilder stringbuilder = new StringBuilder();
	//  112  247:new             #347 <Class StringBuilder>
	//  113  250:dup             
	//  114  251:invokespecial   #348 <Method void StringBuilder()>
	//  115  254:astore          10
						stringbuilder.append("moveto CREATED: ");
	//  116  256:aload           10
	//  117  258:ldc2            #1407 <String "moveto CREATED: ">
	//  118  261:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  119  264:pop             
						stringbuilder.append(((Object) (fragment)));
	//  120  265:aload           10
	//  121  267:aload_1         
	//  122  268:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//  123  271:pop             
						Log.v("FragmentManager", stringbuilder.toString());
	//  124  272:ldc1            #72  <String "FragmentManager">
	//  125  274:aload           10
	//  126  276:invokevirtual   #358 <Method String StringBuilder.toString()>
	//  127  279:invokestatic    #851 <Method int Log.v(String, String)>
	//  128  282:pop             
					}
					k = i;
	//  129  283:iload_2         
	//  130  284:istore          4
					if(fragment.mSavedFragmentState != null)
	//* 131  286:aload_1         
	//* 132  287:getfield        #1219 <Field Bundle Fragment.mSavedFragmentState>
	//* 133  290:ifnull          424
					{
						fragment.mSavedFragmentState.setClassLoader(mHost.getContext().getClassLoader());
	//  134  293:aload_1         
	//  135  294:getfield        #1219 <Field Bundle Fragment.mSavedFragmentState>
	//  136  297:aload_0         
	//  137  298:getfield        #444 <Field FragmentHostCallback mHost>
	//  138  301:invokevirtual   #1319 <Method Context FragmentHostCallback.getContext()>
	//  139  304:invokevirtual   #1411 <Method ClassLoader Context.getClassLoader()>
	//  140  307:invokevirtual   #1415 <Method void Bundle.setClassLoader(ClassLoader)>
						fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
	//  141  310:aload_1         
	//  142  311:aload_1         
	//  143  312:getfield        #1219 <Field Bundle Fragment.mSavedFragmentState>
	//  144  315:ldc1            #84  <String "android:view_state">
	//  145  317:invokevirtual   #1419 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//  146  320:putfield        #1422 <Field SparseArray Fragment.mSavedViewState>
						fragment.mTarget = getFragment(fragment.mSavedFragmentState, "android:target_state");
	//  147  323:aload_1         
	//  148  324:aload_0         
	//  149  325:aload_1         
	//  150  326:getfield        #1219 <Field Bundle Fragment.mSavedFragmentState>
	//  151  329:ldc1            #78  <String "android:target_state">
	//  152  331:invokevirtual   #1424 <Method Fragment getFragment(Bundle, String)>
	//  153  334:putfield        #1427 <Field Fragment Fragment.mTarget>
						if(fragment.mTarget != null)
	//* 154  337:aload_1         
	//* 155  338:getfield        #1427 <Field Fragment Fragment.mTarget>
	//* 156  341:ifnull          358
							fragment.mTargetRequestCode = fragment.mSavedFragmentState.getInt("android:target_req_state", 0);
	//  157  344:aload_1         
	//  158  345:aload_1         
	//  159  346:getfield        #1219 <Field Bundle Fragment.mSavedFragmentState>
	//  160  349:ldc1            #75  <String "android:target_req_state">
	//  161  351:iconst_0        
	//  162  352:invokevirtual   #1277 <Method int Bundle.getInt(String, int)>
	//  163  355:putfield        #1430 <Field int Fragment.mTargetRequestCode>
						if(fragment.mSavedUserVisibleHint != null)
	//* 164  358:aload_1         
	//* 165  359:getfield        #1434 <Field Boolean Fragment.mSavedUserVisibleHint>
	//* 166  362:ifnull          384
						{
							fragment.mUserVisibleHint = fragment.mSavedUserVisibleHint.booleanValue();
	//  167  365:aload_1         
	//  168  366:aload_1         
	//  169  367:getfield        #1434 <Field Boolean Fragment.mSavedUserVisibleHint>
	//  170  370:invokevirtual   #475 <Method boolean Boolean.booleanValue()>
	//  171  373:putfield        #1437 <Field boolean Fragment.mUserVisibleHint>
							fragment.mSavedUserVisibleHint = null;
	//  172  376:aload_1         
	//  173  377:aconst_null     
	//  174  378:putfield        #1434 <Field Boolean Fragment.mSavedUserVisibleHint>
						} else
	//* 175  381:goto            398
						{
							fragment.mUserVisibleHint = fragment.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
	//  176  384:aload_1         
	//  177  385:aload_1         
	//  178  386:getfield        #1219 <Field Bundle Fragment.mSavedFragmentState>
	//  179  389:ldc1            #81  <String "android:user_visible_hint">
	//  180  391:iconst_1        
	//  181  392:invokevirtual   #1441 <Method boolean Bundle.getBoolean(String, boolean)>
	//  182  395:putfield        #1437 <Field boolean Fragment.mUserVisibleHint>
						}
						k = i;
	//  183  398:iload_2         
	//  184  399:istore          4
						if(!fragment.mUserVisibleHint)
	//* 185  401:aload_1         
	//* 186  402:getfield        #1437 <Field boolean Fragment.mUserVisibleHint>
	//* 187  405:ifne            424
						{
							fragment.mDeferStart = true;
	//  188  408:aload_1         
	//  189  409:iconst_1        
	//  190  410:putfield        #1402 <Field boolean Fragment.mDeferStart>
							k = i;
	//  191  413:iload_2         
	//  192  414:istore          4
							if(i > 3)
	//* 193  416:iload_2         
	//* 194  417:iconst_3        
	//* 195  418:icmple          424
								k = 3;
	//  196  421:iconst_3        
	//  197  422:istore          4
						}
					}
					fragment.mHost = mHost;
	//  198  424:aload_1         
	//  199  425:aload_0         
	//  200  426:getfield        #444 <Field FragmentHostCallback mHost>
	//  201  429:putfield        #1442 <Field FragmentHostCallback Fragment.mHost>
					fragment.mParentFragment = mParent;
	//  202  432:aload_1         
	//  203  433:aload_0         
	//  204  434:getfield        #917 <Field Fragment mParent>
	//  205  437:putfield        #1445 <Field Fragment Fragment.mParentFragment>
					FragmentManagerImpl fragmentmanagerimpl;
					if(mParent != null)
	//* 206  440:aload_0         
	//* 207  441:getfield        #917 <Field Fragment mParent>
	//* 208  444:ifnull          459
						fragmentmanagerimpl = mParent.mChildFragmentManager;
	//  209  447:aload_0         
	//  210  448:getfield        #917 <Field Fragment mParent>
	//  211  451:getfield        #1449 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
	//  212  454:astore          10
					else
	//* 213  456:goto            468
						fragmentmanagerimpl = mHost.getFragmentManagerImpl();
	//  214  459:aload_0         
	//  215  460:getfield        #444 <Field FragmentHostCallback mHost>
	//  216  463:invokevirtual   #1453 <Method FragmentManagerImpl FragmentHostCallback.getFragmentManagerImpl()>
	//  217  466:astore          10
					fragment.mFragmentManager = fragmentmanagerimpl;
	//  218  468:aload_1         
	//  219  469:aload           10
	//  220  471:putfield        #1456 <Field FragmentManagerImpl Fragment.mFragmentManager>
					if(fragment.mTarget != null)
	//* 221  474:aload_1         
	//* 222  475:getfield        #1427 <Field Fragment Fragment.mTarget>
	//* 223  478:ifnull          591
					{
						if(mActive.get(fragment.mTarget.mIndex) != fragment.mTarget)
	//* 224  481:aload_0         
	//* 225  482:getfield        #318 <Field SparseArray mActive>
	//* 226  485:aload_1         
	//* 227  486:getfield        #1427 <Field Fragment Fragment.mTarget>
	//* 228  489:getfield        #1357 <Field int Fragment.mIndex>
	//* 229  492:invokevirtual   #1278 <Method Object SparseArray.get(int)>
	//* 230  495:aload_1         
	//* 231  496:getfield        #1427 <Field Fragment Fragment.mTarget>
	//* 232  499:if_acmpeq       568
						{
							StringBuilder stringbuilder1 = new StringBuilder();
	//  233  502:new             #347 <Class StringBuilder>
	//  234  505:dup             
	//  235  506:invokespecial   #348 <Method void StringBuilder()>
	//  236  509:astore          10
							stringbuilder1.append("Fragment ");
	//  237  511:aload           10
	//  238  513:ldc2            #1458 <String "Fragment ">
	//  239  516:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  240  519:pop             
							stringbuilder1.append(((Object) (fragment)));
	//  241  520:aload           10
	//  242  522:aload_1         
	//  243  523:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//  244  526:pop             
							stringbuilder1.append(" declared target fragment ");
	//  245  527:aload           10
	//  246  529:ldc2            #1460 <String " declared target fragment ">
	//  247  532:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  248  535:pop             
							stringbuilder1.append(((Object) (fragment.mTarget)));
	//  249  536:aload           10
	//  250  538:aload_1         
	//  251  539:getfield        #1427 <Field Fragment Fragment.mTarget>
	//  252  542:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//  253  545:pop             
							stringbuilder1.append(" that does not belong to this FragmentManager!");
	//  254  546:aload           10
	//  255  548:ldc2            #1462 <String " that does not belong to this FragmentManager!">
	//  256  551:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  257  554:pop             
							throw new IllegalStateException(stringbuilder1.toString());
	//  258  555:new             #338 <Class IllegalStateException>
	//  259  558:dup             
	//  260  559:aload           10
	//  261  561:invokevirtual   #358 <Method String StringBuilder.toString()>
	//  262  564:invokespecial   #343 <Method void IllegalStateException(String)>
	//  263  567:athrow          
						}
						if(fragment.mTarget.mState < 1)
	//* 264  568:aload_1         
	//* 265  569:getfield        #1427 <Field Fragment Fragment.mTarget>
	//* 266  572:getfield        #213 <Field int Fragment.mState>
	//* 267  575:iconst_1        
	//* 268  576:icmpge          591
							moveToState(fragment.mTarget, 1, 0, 0, true);
	//  269  579:aload_0         
	//  270  580:aload_1         
	//  271  581:getfield        #1427 <Field Fragment Fragment.mTarget>
	//  272  584:iconst_1        
	//  273  585:iconst_0        
	//  274  586:iconst_0        
	//  275  587:iconst_1        
	//  276  588:invokevirtual   #223 <Method void moveToState(Fragment, int, int, int, boolean)>
					}
					dispatchOnFragmentPreAttached(fragment, mHost.getContext(), false);
	//  277  591:aload_0         
	//  278  592:aload_1         
	//  279  593:aload_0         
	//  280  594:getfield        #444 <Field FragmentHostCallback mHost>
	//  281  597:invokevirtual   #1319 <Method Context FragmentHostCallback.getContext()>
	//  282  600:iconst_0        
	//  283  601:invokevirtual   #1050 <Method void dispatchOnFragmentPreAttached(Fragment, Context, boolean)>
					fragment.mCalled = false;
	//  284  604:aload_1         
	//  285  605:iconst_0        
	//  286  606:putfield        #1465 <Field boolean Fragment.mCalled>
					fragment.onAttach(mHost.getContext());
	//  287  609:aload_1         
	//  288  610:aload_0         
	//  289  611:getfield        #444 <Field FragmentHostCallback mHost>
	//  290  614:invokevirtual   #1319 <Method Context FragmentHostCallback.getContext()>
	//  291  617:invokevirtual   #1469 <Method void Fragment.onAttach(Context)>
					if(!fragment.mCalled)
	//* 292  620:aload_1         
	//* 293  621:getfield        #1465 <Field boolean Fragment.mCalled>
	//* 294  624:ifne            674
					{
						StringBuilder stringbuilder2 = new StringBuilder();
	//  295  627:new             #347 <Class StringBuilder>
	//  296  630:dup             
	//  297  631:invokespecial   #348 <Method void StringBuilder()>
	//  298  634:astore          10
						stringbuilder2.append("Fragment ");
	//  299  636:aload           10
	//  300  638:ldc2            #1458 <String "Fragment ">
	//  301  641:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  302  644:pop             
						stringbuilder2.append(((Object) (fragment)));
	//  303  645:aload           10
	//  304  647:aload_1         
	//  305  648:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//  306  651:pop             
						stringbuilder2.append(" did not call through to super.onAttach()");
	//  307  652:aload           10
	//  308  654:ldc2            #1471 <String " did not call through to super.onAttach()">
	//  309  657:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  310  660:pop             
						throw new SuperNotCalledException(stringbuilder2.toString());
	//  311  661:new             #1473 <Class SuperNotCalledException>
	//  312  664:dup             
	//  313  665:aload           10
	//  314  667:invokevirtual   #358 <Method String StringBuilder.toString()>
	//  315  670:invokespecial   #1474 <Method void SuperNotCalledException(String)>
	//  316  673:athrow          
					}
					if(fragment.mParentFragment == null)
	//* 317  674:aload_1         
	//* 318  675:getfield        #1445 <Field Fragment Fragment.mParentFragment>
	//* 319  678:ifnonnull       692
						mHost.onAttachFragment(fragment);
	//  320  681:aload_0         
	//  321  682:getfield        #444 <Field FragmentHostCallback mHost>
	//  322  685:aload_1         
	//  323  686:invokevirtual   #1477 <Method void FragmentHostCallback.onAttachFragment(Fragment)>
					else
	//* 324  689:goto            700
						fragment.mParentFragment.onAttachFragment(fragment);
	//  325  692:aload_1         
	//  326  693:getfield        #1445 <Field Fragment Fragment.mParentFragment>
	//  327  696:aload_1         
	//  328  697:invokevirtual   #1478 <Method void Fragment.onAttachFragment(Fragment)>
					dispatchOnFragmentAttached(fragment, mHost.getContext(), false);
	//  329  700:aload_0         
	//  330  701:aload_1         
	//  331  702:aload_0         
	//  332  703:getfield        #444 <Field FragmentHostCallback mHost>
	//  333  706:invokevirtual   #1319 <Method Context FragmentHostCallback.getContext()>
	//  334  709:iconst_0        
	//  335  710:invokevirtual   #1018 <Method void dispatchOnFragmentAttached(Fragment, Context, boolean)>
					if(!fragment.mIsCreated)
	//* 336  713:aload_1         
	//* 337  714:getfield        #1481 <Field boolean Fragment.mIsCreated>
	//* 338  717:ifne            751
					{
						dispatchOnFragmentPreCreated(fragment, fragment.mSavedFragmentState, false);
	//  339  720:aload_0         
	//  340  721:aload_1         
	//  341  722:aload_1         
	//  342  723:getfield        #1219 <Field Bundle Fragment.mSavedFragmentState>
	//  343  726:iconst_0        
	//  344  727:invokevirtual   #1056 <Method void dispatchOnFragmentPreCreated(Fragment, Bundle, boolean)>
						fragment.performCreate(fragment.mSavedFragmentState);
	//  345  730:aload_1         
	//  346  731:aload_1         
	//  347  732:getfield        #1219 <Field Bundle Fragment.mSavedFragmentState>
	//  348  735:invokevirtual   #1485 <Method void Fragment.performCreate(Bundle)>
						dispatchOnFragmentCreated(fragment, fragment.mSavedFragmentState, false);
	//  349  738:aload_0         
	//  350  739:aload_1         
	//  351  740:aload_1         
	//  352  741:getfield        #1219 <Field Bundle Fragment.mSavedFragmentState>
	//  353  744:iconst_0        
	//  354  745:invokevirtual   #1025 <Method void dispatchOnFragmentCreated(Fragment, Bundle, boolean)>
					} else
	//* 355  748:goto            764
					{
						fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
	//  356  751:aload_1         
	//  357  752:aload_1         
	//  358  753:getfield        #1219 <Field Bundle Fragment.mSavedFragmentState>
	//  359  756:invokevirtual   #1488 <Method void Fragment.restoreChildFragmentState(Bundle)>
						fragment.mState = 1;
	//  360  759:aload_1         
	//  361  760:iconst_1        
	//  362  761:putfield        #213 <Field int Fragment.mState>
					}
					fragment.mRetaining = false;
	//  363  764:aload_1         
	//  364  765:iconst_0        
	//  365  766:putfield        #779 <Field boolean Fragment.mRetaining>
				}
				// fall through

			case 1: // '\001'
				ensureInflatedFragmentView(fragment);
	//  366  769:aload_0         
	//  367  770:aload_1         
	//  368  771:invokevirtual   #1490 <Method void ensureInflatedFragmentView(Fragment)>
				i1 = k;
	//  369  774:iload           4
	//  370  776:istore          6
				if(k > 1)
	//* 371  778:iload           4
	//* 372  780:iconst_1        
	//* 373  781:icmple          1235
				{
					if(DEBUG)
	//* 374  784:getstatic       #843 <Field boolean DEBUG>
	//* 375  787:ifeq            826
					{
						StringBuilder stringbuilder3 = new StringBuilder();
	//  376  790:new             #347 <Class StringBuilder>
	//  377  793:dup             
	//  378  794:invokespecial   #348 <Method void StringBuilder()>
	//  379  797:astore          10
						stringbuilder3.append("moveto ACTIVITY_CREATED: ");
	//  380  799:aload           10
	//  381  801:ldc2            #1492 <String "moveto ACTIVITY_CREATED: ">
	//  382  804:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  383  807:pop             
						stringbuilder3.append(((Object) (fragment)));
	//  384  808:aload           10
	//  385  810:aload_1         
	//  386  811:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//  387  814:pop             
						Log.v("FragmentManager", stringbuilder3.toString());
	//  388  815:ldc1            #72  <String "FragmentManager">
	//  389  817:aload           10
	//  390  819:invokevirtual   #358 <Method String StringBuilder.toString()>
	//  391  822:invokestatic    #851 <Method int Log.v(String, String)>
	//  392  825:pop             
					}
					if(!fragment.mFromLayout)
	//* 393  826:aload_1         
	//* 394  827:getfield        #1213 <Field boolean Fragment.mFromLayout>
	//* 395  830:ifne            1193
					{
						Object obj;
						if(fragment.mContainerId != 0)
	//* 396  833:aload_1         
	//* 397  834:getfield        #398 <Field int Fragment.mContainerId>
	//* 398  837:ifeq            1042
						{
							if(fragment.mContainerId == -1)
	//* 399  840:aload_1         
	//* 400  841:getfield        #398 <Field int Fragment.mContainerId>
	//* 401  844:iconst_m1       
	//* 402  845:icmpne          898
							{
								StringBuilder stringbuilder4 = new StringBuilder();
	//  403  848:new             #347 <Class StringBuilder>
	//  404  851:dup             
	//  405  852:invokespecial   #348 <Method void StringBuilder()>
	//  406  855:astore          10
								stringbuilder4.append("Cannot create fragment ");
	//  407  857:aload           10
	//  408  859:ldc2            #1494 <String "Cannot create fragment ">
	//  409  862:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  410  865:pop             
								stringbuilder4.append(((Object) (fragment)));
	//  411  866:aload           10
	//  412  868:aload_1         
	//  413  869:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//  414  872:pop             
								stringbuilder4.append(" for a container view with no id");
	//  415  873:aload           10
	//  416  875:ldc2            #1496 <String " for a container view with no id">
	//  417  878:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  418  881:pop             
								throwException(((RuntimeException) (new IllegalArgumentException(stringbuilder4.toString()))));
	//  419  882:aload_0         
	//  420  883:new             #1498 <Class IllegalArgumentException>
	//  421  886:dup             
	//  422  887:aload           10
	//  423  889:invokevirtual   #358 <Method String StringBuilder.toString()>
	//  424  892:invokespecial   #1499 <Method void IllegalArgumentException(String)>
	//  425  895:invokespecial   #1284 <Method void throwException(RuntimeException)>
							}
							ViewGroup viewgroup = (ViewGroup)mContainer.onFindViewById(fragment.mContainerId);
	//  426  898:aload_0         
	//  427  899:getfield        #915 <Field FragmentContainer mContainer>
	//  428  902:aload_1         
	//  429  903:getfield        #398 <Field int Fragment.mContainerId>
	//  430  906:invokevirtual   #1505 <Method View FragmentContainer.onFindViewById(int)>
	//  431  909:checkcast       #249 <Class ViewGroup>
	//  432  912:astore          11
							obj = ((Object) (viewgroup));
	//  433  914:aload           11
	//  434  916:astore          10
							if(viewgroup == null)
	//* 435  918:aload           11
	//* 436  920:ifnonnull       1045
							{
								obj = ((Object) (viewgroup));
	//  437  923:aload           11
	//  438  925:astore          10
								if(!fragment.mRestored)
	//* 439  927:aload_1         
	//* 440  928:getfield        #1508 <Field boolean Fragment.mRestored>
	//* 441  931:ifne            1045
								{
									try
									{
										obj = ((Object) (fragment.getResources().getResourceName(fragment.mContainerId)));
	//  442  934:aload_1         
	//  443  935:invokevirtual   #1509 <Method Resources Fragment.getResources()>
	//  444  938:aload_1         
	//  445  939:getfield        #398 <Field int Fragment.mContainerId>
	//  446  942:invokevirtual   #1512 <Method String Resources.getResourceName(int)>
	//  447  945:astore          10
									}
	//* 448  947:goto            955
	//* 449  950:ldc2            #1514 <String "unknown">
	//* 450  953:astore          10
	//* 451  955:new             #347 <Class StringBuilder>
	//* 452  958:dup             
	//* 453  959:invokespecial   #348 <Method void StringBuilder()>
	//* 454  962:astore          12
	//* 455  964:aload           12
	//* 456  966:ldc2            #1516 <String "No view found for id 0x">
	//* 457  969:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//* 458  972:pop             
	//* 459  973:aload           12
	//* 460  975:aload_1         
	//* 461  976:getfield        #398 <Field int Fragment.mContainerId>
	//* 462  979:invokestatic    #1141 <Method String Integer.toHexString(int)>
	//* 463  982:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//* 464  985:pop             
	//* 465  986:aload           12
	//* 466  988:ldc2            #1518 <String " (">
	//* 467  991:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//* 468  994:pop             
	//* 469  995:aload           12
	//* 470  997:aload           10
	//* 471  999:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//* 472 1002:pop             
	//* 473 1003:aload           12
	//* 474 1005:ldc2            #1520 <String ") for fragment ">
	//* 475 1008:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//* 476 1011:pop             
	//* 477 1012:aload           12
	//* 478 1014:aload_1         
	//* 479 1015:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//* 480 1018:pop             
	//* 481 1019:aload_0         
	//* 482 1020:new             #1498 <Class IllegalArgumentException>
	//* 483 1023:dup             
	//* 484 1024:aload           12
	//* 485 1026:invokevirtual   #358 <Method String StringBuilder.toString()>
	//* 486 1029:invokespecial   #1499 <Method void IllegalArgumentException(String)>
	//* 487 1032:invokespecial   #1284 <Method void throwException(RuntimeException)>
	//* 488 1035:aload           11
	//* 489 1037:astore          10
	//* 490 1039:goto            1045
	//* 491 1042:aconst_null     
	//* 492 1043:astore          10
	//* 493 1045:aload_1         
	//* 494 1046:aload           10
	//* 495 1048:putfield        #247 <Field ViewGroup Fragment.mContainer>
	//* 496 1051:aload_1         
	//* 497 1052:aload_1         
	//* 498 1053:aload_1         
	//* 499 1054:aload_1         
	//* 500 1055:getfield        #1219 <Field Bundle Fragment.mSavedFragmentState>
	//* 501 1058:invokevirtual   #1223 <Method android.view.LayoutInflater Fragment.performGetLayoutInflater(Bundle)>
	//* 502 1061:aload           10
	//* 503 1063:aload_1         
	//* 504 1064:getfield        #1219 <Field Bundle Fragment.mSavedFragmentState>
	//* 505 1067:invokevirtual   #1227 <Method View Fragment.performCreateView(android.view.LayoutInflater, ViewGroup, Bundle)>
	//* 506 1070:putfield        #227 <Field View Fragment.mView>
	//* 507 1073:aload_1         
	//* 508 1074:getfield        #227 <Field View Fragment.mView>
	//* 509 1077:ifnull          1188
	//* 510 1080:aload_1         
	//* 511 1081:aload_1         
	//* 512 1082:getfield        #227 <Field View Fragment.mView>
	//* 513 1085:putfield        #1230 <Field View Fragment.mInnerView>
	//* 514 1088:aload_1         
	//* 515 1089:getfield        #227 <Field View Fragment.mView>
	//* 516 1092:iconst_0        
	//* 517 1093:invokevirtual   #1233 <Method void View.setSaveFromParentEnabled(boolean)>
	//* 518 1096:aload           10
	//* 519 1098:ifnull          1110
	//* 520 1101:aload           10
	//* 521 1103:aload_1         
	//* 522 1104:getfield        #227 <Field View Fragment.mView>
	//* 523 1107:invokevirtual   #1522 <Method void ViewGroup.addView(View)>
	//* 524 1110:aload_1         
	//* 525 1111:getfield        #230 <Field boolean Fragment.mHidden>
	//* 526 1114:ifeq            1126
	//* 527 1117:aload_1         
	//* 528 1118:getfield        #227 <Field View Fragment.mView>
	//* 529 1121:bipush          8
	//* 530 1123:invokevirtual   #943 <Method void View.setVisibility(int)>
	//* 531 1126:aload_1         
	//* 532 1127:aload_1         
	//* 533 1128:getfield        #227 <Field View Fragment.mView>
	//* 534 1131:aload_1         
	//* 535 1132:getfield        #1219 <Field Bundle Fragment.mSavedFragmentState>
	//* 536 1135:invokevirtual   #1237 <Method void Fragment.onViewCreated(View, Bundle)>
	//* 537 1138:aload_0         
	//* 538 1139:aload_1         
	//* 539 1140:aload_1         
	//* 540 1141:getfield        #227 <Field View Fragment.mView>
	//* 541 1144:aload_1         
	//* 542 1145:getfield        #1219 <Field Bundle Fragment.mSavedFragmentState>
	//* 543 1148:iconst_0        
	//* 544 1149:invokevirtual   #1087 <Method void dispatchOnFragmentViewCreated(Fragment, View, Bundle, boolean)>
	//* 545 1152:aload_1         
	//* 546 1153:getfield        #227 <Field View Fragment.mView>
	//* 547 1156:invokevirtual   #1525 <Method int View.getVisibility()>
	//* 548 1159:ifne            1176
	//* 549 1162:aload_1         
	//* 550 1163:getfield        #247 <Field ViewGroup Fragment.mContainer>
	//* 551 1166:ifnull          1176
	//* 552 1169:iload           8
	//* 553 1171:istore          5
	//* 554 1173:goto            1179
	//* 555 1176:iconst_0        
	//* 556 1177:istore          5
	//* 557 1179:aload_1         
	//* 558 1180:iload           5
	//* 559 1182:putfield        #233 <Field boolean Fragment.mIsNewlyAdded>
	//* 560 1185:goto            1193
	//* 561 1188:aload_1         
	//* 562 1189:aconst_null     
	//* 563 1190:putfield        #1230 <Field View Fragment.mInnerView>
	//* 564 1193:aload_1         
	//* 565 1194:aload_1         
	//* 566 1195:getfield        #1219 <Field Bundle Fragment.mSavedFragmentState>
	//* 567 1198:invokevirtual   #1528 <Method void Fragment.performActivityCreated(Bundle)>
	//* 568 1201:aload_0         
	//* 569 1202:aload_1         
	//* 570 1203:aload_1         
	//* 571 1204:getfield        #1219 <Field Bundle Fragment.mSavedFragmentState>
	//* 572 1207:iconst_0        
	//* 573 1208:invokevirtual   #998 <Method void dispatchOnFragmentActivityCreated(Fragment, Bundle, boolean)>
	//* 574 1211:aload_1         
	//* 575 1212:getfield        #227 <Field View Fragment.mView>
	//* 576 1215:ifnull          1226
	//* 577 1218:aload_1         
	//* 578 1219:aload_1         
	//* 579 1220:getfield        #1219 <Field Bundle Fragment.mSavedFragmentState>
	//* 580 1223:invokevirtual   #1531 <Method void Fragment.restoreViewState(Bundle)>
	//* 581 1226:aload_1         
	//* 582 1227:aconst_null     
	//* 583 1228:putfield        #1219 <Field Bundle Fragment.mSavedFragmentState>
	//* 584 1231:iload           4
	//* 585 1233:istore          6
	//* 586 1235:iload           6
	//* 587 1237:istore          7
	//* 588 1239:iload           6
	//* 589 1241:iconst_2        
	//* 590 1242:icmple          1254
	//* 591 1245:aload_1         
	//* 592 1246:iconst_3        
	//* 593 1247:putfield        #213 <Field int Fragment.mState>
	//* 594 1250:iload           6
	//* 595 1252:istore          7
	//* 596 1254:iload           7
	//* 597 1256:istore_3        
	//* 598 1257:iload           7
	//* 599 1259:iconst_3        
	//* 600 1260:icmple          1318
	//* 601 1263:getstatic       #843 <Field boolean DEBUG>
	//* 602 1266:ifeq            1305
	//* 603 1269:new             #347 <Class StringBuilder>
	//* 604 1272:dup             
	//* 605 1273:invokespecial   #348 <Method void StringBuilder()>
	//* 606 1276:astore          10
	//* 607 1278:aload           10
	//* 608 1280:ldc2            #1533 <String "moveto STARTED: ">
	//* 609 1283:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//* 610 1286:pop             
	//* 611 1287:aload           10
	//* 612 1289:aload_1         
	//* 613 1290:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//* 614 1293:pop             
	//* 615 1294:ldc1            #72  <String "FragmentManager">
	//* 616 1296:aload           10
	//* 617 1298:invokevirtual   #358 <Method String StringBuilder.toString()>
	//* 618 1301:invokestatic    #851 <Method int Log.v(String, String)>
	//* 619 1304:pop             
	//* 620 1305:aload_1         
	//* 621 1306:invokevirtual   #1536 <Method void Fragment.performStart()>
	//* 622 1309:aload_0         
	//* 623 1310:aload_1         
	//* 624 1311:iconst_0        
	//* 625 1312:invokevirtual   #1074 <Method void dispatchOnFragmentStarted(Fragment, boolean)>
	//* 626 1315:iload           7
	//* 627 1317:istore_3        
	//* 628 1318:iload_3         
	//* 629 1319:istore          6
	//* 630 1321:iload_3         
	//* 631 1322:iconst_4        
	//* 632 1323:icmple          2050
	//* 633 1326:getstatic       #843 <Field boolean DEBUG>
	//* 634 1329:ifeq            1368
	//* 635 1332:new             #347 <Class StringBuilder>
	//* 636 1335:dup             
	//* 637 1336:invokespecial   #348 <Method void StringBuilder()>
	//* 638 1339:astore          10
	//* 639 1341:aload           10
	//* 640 1343:ldc2            #1538 <String "moveto RESUMED: ">
	//* 641 1346:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//* 642 1349:pop             
	//* 643 1350:aload           10
	//* 644 1352:aload_1         
	//* 645 1353:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//* 646 1356:pop             
	//* 647 1357:ldc1            #72  <String "FragmentManager">
	//* 648 1359:aload           10
	//* 649 1361:invokevirtual   #358 <Method String StringBuilder.toString()>
	//* 650 1364:invokestatic    #851 <Method int Log.v(String, String)>
	//* 651 1367:pop             
	//* 652 1368:aload_1         
	//* 653 1369:invokevirtual   #1541 <Method void Fragment.performResume()>
	//* 654 1372:aload_0         
	//* 655 1373:aload_1         
	//* 656 1374:iconst_0        
	//* 657 1375:invokevirtual   #1062 <Method void dispatchOnFragmentResumed(Fragment, boolean)>
	//* 658 1378:aload_1         
	//* 659 1379:aconst_null     
	//* 660 1380:putfield        #1219 <Field Bundle Fragment.mSavedFragmentState>
	//* 661 1383:aload_1         
	//* 662 1384:aconst_null     
	//* 663 1385:putfield        #1422 <Field SparseArray Fragment.mSavedViewState>
	//* 664 1388:iload_3         
	//* 665 1389:istore          6
	//* 666 1391:goto            2050
	//* 667 1394:iload_2         
	//* 668 1395:istore          6
	//* 669 1397:aload_1         
	//* 670 1398:getfield        #213 <Field int Fragment.mState>
	//* 671 1401:iload_2         
	//* 672 1402:icmple          2050
	//* 673 1405:aload_1         
	//* 674 1406:getfield        #213 <Field int Fragment.mState>
	//* 675 1409:tableswitch     1 5: default 1444
	//	               1 1833
	//	               2 1615
	//	               3 1564
	//	               4 1507
	//	               5 1450
	//* 676 1444:iload_2         
	//* 677 1445:istore          6
	//* 678 1447:goto            2050
	//* 679 1450:iload_2         
	//* 680 1451:iconst_5        
	//* 681 1452:icmpge          1507
	//* 682 1455:getstatic       #843 <Field boolean DEBUG>
	//* 683 1458:ifeq            1497
	//* 684 1461:new             #347 <Class StringBuilder>
	//* 685 1464:dup             
	//* 686 1465:invokespecial   #348 <Method void StringBuilder()>
	//* 687 1468:astore          10
	//* 688 1470:aload           10
	//* 689 1472:ldc2            #1543 <String "movefrom RESUMED: ">
	//* 690 1475:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//* 691 1478:pop             
	//* 692 1479:aload           10
	//* 693 1481:aload_1         
	//* 694 1482:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//* 695 1485:pop             
	//* 696 1486:ldc1            #72  <String "FragmentManager">
	//* 697 1488:aload           10
	//* 698 1490:invokevirtual   #358 <Method String StringBuilder.toString()>
	//* 699 1493:invokestatic    #851 <Method int Log.v(String, String)>
	//* 700 1496:pop             
	//* 701 1497:aload_1         
	//* 702 1498:invokevirtual   #1546 <Method void Fragment.performPause()>
	//* 703 1501:aload_0         
	//* 704 1502:aload_1         
	//* 705 1503:iconst_0        
	//* 706 1504:invokevirtual   #1044 <Method void dispatchOnFragmentPaused(Fragment, boolean)>
	//* 707 1507:iload_2         
	//* 708 1508:iconst_4        
	//* 709 1509:icmpge          1564
	//* 710 1512:getstatic       #843 <Field boolean DEBUG>
	//* 711 1515:ifeq            1554
	//* 712 1518:new             #347 <Class StringBuilder>
	//* 713 1521:dup             
	//* 714 1522:invokespecial   #348 <Method void StringBuilder()>
	//* 715 1525:astore          10
	//* 716 1527:aload           10
	//* 717 1529:ldc2            #1548 <String "movefrom STARTED: ">
	//* 718 1532:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//* 719 1535:pop             
	//* 720 1536:aload           10
	//* 721 1538:aload_1         
	//* 722 1539:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//* 723 1542:pop             
	//* 724 1543:ldc1            #72  <String "FragmentManager">
	//* 725 1545:aload           10
	//* 726 1547:invokevirtual   #358 <Method String StringBuilder.toString()>
	//* 727 1550:invokestatic    #851 <Method int Log.v(String, String)>
	//* 728 1553:pop             
	//* 729 1554:aload_1         
	//* 730 1555:invokevirtual   #1551 <Method void Fragment.performStop()>
	//* 731 1558:aload_0         
	//* 732 1559:aload_1         
	//* 733 1560:iconst_0        
	//* 734 1561:invokevirtual   #1080 <Method void dispatchOnFragmentStopped(Fragment, boolean)>
	//* 735 1564:iload_2         
	//* 736 1565:iconst_3        
	//* 737 1566:icmpge          1615
	//* 738 1569:getstatic       #843 <Field boolean DEBUG>
	//* 739 1572:ifeq            1611
	//* 740 1575:new             #347 <Class StringBuilder>
	//* 741 1578:dup             
	//* 742 1579:invokespecial   #348 <Method void StringBuilder()>
	//* 743 1582:astore          10
	//* 744 1584:aload           10
	//* 745 1586:ldc2            #1553 <String "movefrom STOPPED: ">
	//* 746 1589:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//* 747 1592:pop             
	//* 748 1593:aload           10
	//* 749 1595:aload_1         
	//* 750 1596:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//* 751 1599:pop             
	//* 752 1600:ldc1            #72  <String "FragmentManager">
	//* 753 1602:aload           10
	//* 754 1604:invokevirtual   #358 <Method String StringBuilder.toString()>
	//* 755 1607:invokestatic    #851 <Method int Log.v(String, String)>
	//* 756 1610:pop             
	//* 757 1611:aload_1         
	//* 758 1612:invokevirtual   #1556 <Method void Fragment.performReallyStop()>
	//* 759 1615:iload_2         
	//* 760 1616:iconst_2        
	//* 761 1617:icmpge          1833
	//* 762 1620:getstatic       #843 <Field boolean DEBUG>
	//* 763 1623:ifeq            1662
	//* 764 1626:new             #347 <Class StringBuilder>
	//* 765 1629:dup             
	//* 766 1630:invokespecial   #348 <Method void StringBuilder()>
	//* 767 1633:astore          10
	//* 768 1635:aload           10
	//* 769 1637:ldc2            #1558 <String "movefrom ACTIVITY_CREATED: ">
	//* 770 1640:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//* 771 1643:pop             
	//* 772 1644:aload           10
	//* 773 1646:aload_1         
	//* 774 1647:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//* 775 1650:pop             
	//* 776 1651:ldc1            #72  <String "FragmentManager">
	//* 777 1653:aload           10
	//* 778 1655:invokevirtual   #358 <Method String StringBuilder.toString()>
	//* 779 1658:invokestatic    #851 <Method int Log.v(String, String)>
	//* 780 1661:pop             
	//* 781 1662:aload_1         
	//* 782 1663:getfield        #227 <Field View Fragment.mView>
	//* 783 1666:ifnull          1692
	//* 784 1669:aload_0         
	//* 785 1670:getfield        #444 <Field FragmentHostCallback mHost>
	//* 786 1673:aload_1         
	//* 787 1674:invokevirtual   #1562 <Method boolean FragmentHostCallback.onShouldSaveFragmentState(Fragment)>
	//* 788 1677:ifeq            1692
	//* 789 1680:aload_1         
	//* 790 1681:getfield        #1422 <Field SparseArray Fragment.mSavedViewState>
	//* 791 1684:ifnonnull       1692
	//* 792 1687:aload_0         
	//* 793 1688:aload_1         
	//* 794 1689:invokevirtual   #1565 <Method void saveFragmentViewState(Fragment)>
	//* 795 1692:aload_1         
	//* 796 1693:invokevirtual   #1568 <Method void Fragment.performDestroyView()>
	//* 797 1696:aload_0         
	//* 798 1697:aload_1         
	//* 799 1698:iconst_0        
	//* 800 1699:invokevirtual   #1094 <Method void dispatchOnFragmentViewDestroyed(Fragment, boolean)>
	//* 801 1702:aload_1         
	//* 802 1703:getfield        #227 <Field View Fragment.mView>
	//* 803 1706:ifnull          1813
	//* 804 1709:aload_1         
	//* 805 1710:getfield        #247 <Field ViewGroup Fragment.mContainer>
	//* 806 1713:ifnull          1813
	//* 807 1716:aload_1         
	//* 808 1717:getfield        #247 <Field ViewGroup Fragment.mContainer>
	//* 809 1720:aload_1         
	//* 810 1721:getfield        #227 <Field View Fragment.mView>
	//* 811 1724:invokevirtual   #1571 <Method void ViewGroup.endViewTransition(View)>
	//* 812 1727:aload_1         
	//* 813 1728:getfield        #227 <Field View Fragment.mView>
	//* 814 1731:invokevirtual   #432 <Method void View.clearAnimation()>
	//* 815 1734:aload_0         
	//* 816 1735:getfield        #173 <Field int mCurState>
	//* 817 1738:ifle            1781
	//* 818 1741:aload_0         
	//* 819 1742:getfield        #982 <Field boolean mDestroyed>
	//* 820 1745:ifne            1781
	//* 821 1748:aload_1         
	//* 822 1749:getfield        #227 <Field View Fragment.mView>
	//* 823 1752:invokevirtual   #1525 <Method int View.getVisibility()>
	//* 824 1755:ifne            1781
	//* 825 1758:aload_1         
	//* 826 1759:getfield        #406 <Field float Fragment.mPostponedAlpha>
	//* 827 1762:fconst_0        
	//* 828 1763:fcmpl           
	//* 829 1764:iflt            1781
	//* 830 1767:aload_0         
	//* 831 1768:aload_1         
	//* 832 1769:iload_3         
	//* 833 1770:iconst_0        
	//* 834 1771:iload           4
	//* 835 1773:invokevirtual   #933 <Method FragmentManagerImpl$AnimationOrAnimator loadAnimation(Fragment, int, boolean, int)>
	//* 836 1776:astore          10
	//* 837 1778:goto            1784
	//* 838 1781:aconst_null     
	//* 839 1782:astore          10
	//* 840 1784:aload_1         
	//* 841 1785:fconst_0        
	//* 842 1786:putfield        #406 <Field float Fragment.mPostponedAlpha>
	//* 843 1789:aload           10
	//* 844 1791:ifnull          1802
	//* 845 1794:aload_0         
	//* 846 1795:aload_1         
	//* 847 1796:aload           10
	//* 848 1798:iload_2         
	//* 849 1799:invokespecial   #1573 <Method void animateRemoveFragment(Fragment, FragmentManagerImpl$AnimationOrAnimator, int)>
	//* 850 1802:aload_1         
	//* 851 1803:getfield        #247 <Field ViewGroup Fragment.mContainer>
	//* 852 1806:aload_1         
	//* 853 1807:getfield        #227 <Field View Fragment.mView>
	//* 854 1810:invokevirtual   #1576 <Method void ViewGroup.removeView(View)>
	//* 855 1813:aload_1         
	//* 856 1814:aconst_null     
	//* 857 1815:putfield        #247 <Field ViewGroup Fragment.mContainer>
	//* 858 1818:aload_1         
	//* 859 1819:aconst_null     
	//* 860 1820:putfield        #227 <Field View Fragment.mView>
	//* 861 1823:aload_1         
	//* 862 1824:aconst_null     
	//* 863 1825:putfield        #1230 <Field View Fragment.mInnerView>
	//* 864 1828:aload_1         
	//* 865 1829:iconst_0        
	//* 866 1830:putfield        #1405 <Field boolean Fragment.mInLayout>
	//* 867 1833:iload_2         
	//* 868 1834:istore          6
	//* 869 1836:iload_2         
	//* 870 1837:iconst_1        
	//* 871 1838:icmpge          2050
	//* 872 1841:aload_0         
	//* 873 1842:getfield        #982 <Field boolean mDestroyed>
	//* 874 1845:ifeq            1897
	//* 875 1848:aload_1         
	//* 876 1849:invokevirtual   #419 <Method View Fragment.getAnimatingAway()>
	//* 877 1852:ifnull          1874
	//* 878 1855:aload_1         
	//* 879 1856:invokevirtual   #419 <Method View Fragment.getAnimatingAway()>
	//* 880 1859:astore          10
	//* 881 1861:aload_1         
	//* 882 1862:aconst_null     
	//* 883 1863:invokevirtual   #267 <Method void Fragment.setAnimatingAway(View)>
	//* 884 1866:aload           10
	//* 885 1868:invokevirtual   #432 <Method void View.clearAnimation()>
	//* 886 1871:goto            1897
	//* 887 1874:aload_1         
	//* 888 1875:invokevirtual   #436 <Method Animator Fragment.getAnimator()>
	//* 889 1878:ifnull          1897
	//* 890 1881:aload_1         
	//* 891 1882:invokevirtual   #436 <Method Animator Fragment.getAnimator()>
	//* 892 1885:astore          10
	//* 893 1887:aload_1         
	//* 894 1888:aconst_null     
	//* 895 1889:invokevirtual   #298 <Method void Fragment.setAnimator(Animator)>
	//* 896 1892:aload           10
	//* 897 1894:invokevirtual   #1577 <Method void Animator.cancel()>
	//* 898 1897:aload_1         
	//* 899 1898:invokevirtual   #419 <Method View Fragment.getAnimatingAway()>
	//* 900 1901:ifnonnull       2038
	//* 901 1904:aload_1         
	//* 902 1905:invokevirtual   #436 <Method Animator Fragment.getAnimator()>
	//* 903 1908:ifnull          1914
	//* 904 1911:goto            2038
	//* 905 1914:getstatic       #843 <Field boolean DEBUG>
	//* 906 1917:ifeq            1956
	//* 907 1920:new             #347 <Class StringBuilder>
	//* 908 1923:dup             
	//* 909 1924:invokespecial   #348 <Method void StringBuilder()>
	//* 910 1927:astore          10
	//* 911 1929:aload           10
	//* 912 1931:ldc2            #1579 <String "movefrom CREATED: ">
	//* 913 1934:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//* 914 1937:pop             
	//* 915 1938:aload           10
	//* 916 1940:aload_1         
	//* 917 1941:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//* 918 1944:pop             
	//* 919 1945:ldc1            #72  <String "FragmentManager">
	//* 920 1947:aload           10
	//* 921 1949:invokevirtual   #358 <Method String StringBuilder.toString()>
	//* 922 1952:invokestatic    #851 <Method int Log.v(String, String)>
	//* 923 1955:pop             
	//* 924 1956:aload_1         
	//* 925 1957:getfield        #779 <Field boolean Fragment.mRetaining>
	//* 926 1960:ifne            1976
	//* 927 1963:aload_1         
	//* 928 1964:invokevirtual   #1582 <Method void Fragment.performDestroy()>
	//* 929 1967:aload_0         
	//* 930 1968:aload_1         
	//* 931 1969:iconst_0        
	//* 932 1970:invokevirtual   #1031 <Method void dispatchOnFragmentDestroyed(Fragment, boolean)>
	//* 933 1973:goto            1981
	//* 934 1976:aload_1         
	//* 935 1977:iconst_0        
	//* 936 1978:putfield        #213 <Field int Fragment.mState>
	//* 937 1981:aload_1         
	//* 938 1982:invokevirtual   #1585 <Method void Fragment.performDetach()>
	//* 939 1985:aload_0         
	//* 940 1986:aload_1         
	//* 941 1987:iconst_0        
	//* 942 1988:invokevirtual   #1038 <Method void dispatchOnFragmentDetached(Fragment, boolean)>
	//* 943 1991:iload_2         
	//* 944 1992:istore          6
	//* 945 1994:iload           5
	//* 946 1996:ifne            2050
	//* 947 1999:aload_1         
	//* 948 2000:getfield        #779 <Field boolean Fragment.mRetaining>
	//* 949 2003:ifne            2017
	//* 950 2006:aload_0         
	//* 951 2007:aload_1         
	//* 952 2008:invokevirtual   #1587 <Method void makeInactive(Fragment)>
	//* 953 2011:iload_2         
	//* 954 2012:istore          6
	//* 955 2014:goto            2050
	//* 956 2017:aload_1         
	//* 957 2018:aconst_null     
	//* 958 2019:putfield        #1442 <Field FragmentHostCallback Fragment.mHost>
	//* 959 2022:aload_1         
	//* 960 2023:aconst_null     
	//* 961 2024:putfield        #1445 <Field Fragment Fragment.mParentFragment>
	//* 962 2027:aload_1         
	//* 963 2028:aconst_null     
	//* 964 2029:putfield        #1456 <Field FragmentManagerImpl Fragment.mFragmentManager>
	//* 965 2032:iload_2         
	//* 966 2033:istore          6
	//* 967 2035:goto            2050
	//* 968 2038:aload_1         
	//* 969 2039:iload_2         
	//* 970 2040:invokevirtual   #257 <Method void Fragment.setStateAfterAnimating(int)>
	//* 971 2043:iload           7
	//* 972 2045:istore          6
	//* 973 2047:goto            2050
	//* 974 2050:aload_1         
	//* 975 2051:getfield        #213 <Field int Fragment.mState>
	//* 976 2054:iload           6
	//* 977 2056:icmpeq          2146
	//* 978 2059:new             #347 <Class StringBuilder>
	//* 979 2062:dup             
	//* 980 2063:invokespecial   #348 <Method void StringBuilder()>
	//* 981 2066:astore          10
	//* 982 2068:aload           10
	//* 983 2070:ldc2            #1589 <String "moveToState: Fragment state for ">
	//* 984 2073:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//* 985 2076:pop             
	//* 986 2077:aload           10
	//* 987 2079:aload_1         
	//* 988 2080:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//* 989 2083:pop             
	//* 990 2084:aload           10
	//* 991 2086:ldc2            #1591 <String " not updated inline; ">
	//* 992 2089:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//* 993 2092:pop             
	//* 994 2093:aload           10
	//* 995 2095:ldc2            #1593 <String "expected state ">
	//* 996 2098:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//* 997 2101:pop             
	//* 998 2102:aload           10
	//* 999 2104:iload           6
	//*1000 2106:invokevirtual   #897 <Method StringBuilder StringBuilder.append(int)>
	//*1001 2109:pop             
	//*1002 2110:aload           10
	//*1003 2112:ldc2            #1595 <String " found ">
	//*1004 2115:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//*1005 2118:pop             
	//*1006 2119:aload           10
	//*1007 2121:aload_1         
	//*1008 2122:getfield        #213 <Field int Fragment.mState>
	//*1009 2125:invokevirtual   #897 <Method StringBuilder StringBuilder.append(int)>
	//*1010 2128:pop             
	//*1011 2129:ldc1            #72  <String "FragmentManager">
	//*1012 2131:aload           10
	//*1013 2133:invokevirtual   #358 <Method String StringBuilder.toString()>
	//*1014 2136:invokestatic    #1598 <Method int Log.w(String, String)>
	//*1015 2139:pop             
	//*1016 2140:aload_1         
	//*1017 2141:iload           6
	//*1018 2143:putfield        #213 <Field int Fragment.mState>
	//*1019 2146:return          
									// Misplaced declaration of an exception variable
									catch(android.content.res.Resources.NotFoundException notfoundexception)
									{
										obj = "unknown";
									}
									StringBuilder stringbuilder13 = new StringBuilder();
									stringbuilder13.append("No view found for id 0x");
									stringbuilder13.append(Integer.toHexString(fragment.mContainerId));
									stringbuilder13.append(" (");
									stringbuilder13.append(((String) (obj)));
									stringbuilder13.append(") for fragment ");
									stringbuilder13.append(((Object) (fragment)));
									throwException(((RuntimeException) (new IllegalArgumentException(stringbuilder13.toString()))));
									obj = ((Object) (viewgroup));
								}
							}
						} else
						{
							obj = null;
						}
						fragment.mContainer = ((ViewGroup) (obj));
						fragment.mView = fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), ((ViewGroup) (obj)), fragment.mSavedFragmentState);
						if(fragment.mView != null)
						{
							fragment.mInnerView = fragment.mView;
							fragment.mView.setSaveFromParentEnabled(false);
							if(obj != null)
								((ViewGroup) (obj)).addView(fragment.mView);
							if(fragment.mHidden)
								fragment.mView.setVisibility(8);
							fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
							dispatchOnFragmentViewCreated(fragment, fragment.mView, fragment.mSavedFragmentState, false);
							if(fragment.mView.getVisibility() == 0 && fragment.mContainer != null)
								flag = flag1;
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
					i1 = k;
				}
				// fall through

			case 2: // '\002'
				j1 = i1;
				if(i1 > 2)
				{
					fragment.mState = 3;
					j1 = i1;
				}
				// fall through

			case 3: // '\003'
				j = j1;
				if(j1 > 3)
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
					j = j1;
				}
				// fall through

			case 4: // '\004'
				i1 = j;
				if(j > 4)
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
					i1 = j;
				}
				break;
			}
		} else
		{
			i1 = i;
			if(fragment.mState > i)
				switch(fragment.mState)
				{
				default:
					i1 = i;
					break;

				case 5: // '\005'
					if(i < 5)
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

				case 4: // '\004'
					if(i < 4)
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

				case 3: // '\003'
					if(i < 3)
					{
						if(DEBUG)
						{
							StringBuilder stringbuilder9 = new StringBuilder();
							stringbuilder9.append("movefrom STOPPED: ");
							stringbuilder9.append(((Object) (fragment)));
							Log.v("FragmentManager", stringbuilder9.toString());
						}
						fragment.performReallyStop();
					}
					// fall through

				case 2: // '\002'
					if(i < 2)
					{
						if(DEBUG)
						{
							StringBuilder stringbuilder10 = new StringBuilder();
							stringbuilder10.append("movefrom ACTIVITY_CREATED: ");
							stringbuilder10.append(((Object) (fragment)));
							Log.v("FragmentManager", stringbuilder10.toString());
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
						fragment.mInnerView = null;
						fragment.mInLayout = false;
					}
					// fall through

				case 1: // '\001'
					i1 = i;
					if(i >= 1)
						break;
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
							StringBuilder stringbuilder11 = new StringBuilder();
							stringbuilder11.append("movefrom CREATED: ");
							stringbuilder11.append(((Object) (fragment)));
							Log.v("FragmentManager", stringbuilder11.toString());
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
						i1 = i;
						if(flag)
							break;
						if(!fragment.mRetaining)
						{
							makeInactive(fragment);
							i1 = i;
						} else
						{
							fragment.mHost = null;
							fragment.mParentFragment = null;
							fragment.mFragmentManager = null;
							i1 = i;
						}
					} else
					{
						fragment.setStateAfterAnimating(i);
						i1 = j1;
					}
					break;
				}
		}
		if(fragment.mState != i1)
		{
			StringBuilder stringbuilder12 = new StringBuilder();
			stringbuilder12.append("moveToState: Fragment state for ");
			stringbuilder12.append(((Object) (fragment)));
			stringbuilder12.append(" not updated inline; ");
			stringbuilder12.append("expected state ");
			stringbuilder12.append(i1);
			stringbuilder12.append(" found ");
			stringbuilder12.append(fragment.mState);
			Log.w("FragmentManager", stringbuilder12.toString());
			fragment.mState = i1;
		}
	//*1020 2147:astore          10
	//*1021 2149:goto            950
	}

	public void noteStateNotSaved()
	{
		mSavedNonConfig = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #1601 <Field FragmentManagerNonConfig mSavedNonConfig>
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		mStateSaved = false;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #957 <Field boolean mStateSaved>
		mStopped = false;
	//    8   12:aload_0         
	//    9   13:iconst_0        
	//   10   14:putfield        #959 <Field boolean mStopped>
		for(int j = mAdded.size(); i < j; i++)
	//*  11   17:aload_0         
	//*  12   18:getfield        #166 <Field ArrayList mAdded>
	//*  13   21:invokevirtual   #204 <Method int ArrayList.size()>
	//*  14   24:istore_2        
	//*  15   25:iload_1         
	//*  16   26:iload_2         
	//*  17   27:icmpge          57
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//   18   30:aload_0         
	//   19   31:getfield        #166 <Field ArrayList mAdded>
	//   20   34:iload_1         
	//   21   35:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//   22   38:checkcast       #210 <Class Fragment>
	//   23   41:astore_3        
			if(fragment != null)
	//*  24   42:aload_3         
	//*  25   43:ifnull          50
				fragment.noteStateNotSaved();
	//   26   46:aload_3         
	//   27   47:invokevirtual   #1603 <Method void Fragment.noteStateNotSaved()>
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
		if(!"fragment".equals(((Object) (s))))
	//*   0    0:ldc2            #1607 <String "fragment">
	//*   1    3:aload_2         
	//*   2    4:invokevirtual   #677 <Method boolean String.equals(Object)>
	//*   3    7:ifne            12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		s = attributeset.getAttributeValue(((String) (null)), "class");
	//    6   12:aload           4
	//    7   14:aconst_null     
	//    8   15:ldc2            #1609 <String "class">
	//    9   18:invokeinterface #1615 <Method String AttributeSet.getAttributeValue(String, String)>
	//   10   23:astore_2        
		TypedArray typedarray = context.obtainStyledAttributes(attributeset, FragmentTag.Fragment);
	//   11   24:aload_3         
	//   12   25:aload           4
	//   13   27:getstatic       #1619 <Field int[] FragmentManagerImpl$FragmentTag.Fragment>
	//   14   30:invokevirtual   #1623 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   15   33:astore          10
		int i = 0;
	//   16   35:iconst_0        
	//   17   36:istore          5
		String s1 = s;
	//   18   38:aload_2         
	//   19   39:astore          8
		if(s == null)
	//*  20   41:aload_2         
	//*  21   42:ifnonnull       53
			s1 = typedarray.getString(0);
	//   22   45:aload           10
	//   23   47:iconst_0        
	//   24   48:invokevirtual   #1628 <Method String TypedArray.getString(int)>
	//   25   51:astore          8
		int k = typedarray.getResourceId(1, -1);
	//   26   53:aload           10
	//   27   55:iconst_1        
	//   28   56:iconst_m1       
	//   29   57:invokevirtual   #1631 <Method int TypedArray.getResourceId(int, int)>
	//   30   60:istore          7
		String s2 = typedarray.getString(2);
	//   31   62:aload           10
	//   32   64:iconst_2        
	//   33   65:invokevirtual   #1628 <Method String TypedArray.getString(int)>
	//   34   68:astore          9
		typedarray.recycle();
	//   35   70:aload           10
	//   36   72:invokevirtual   #1634 <Method void TypedArray.recycle()>
		if(!Fragment.isSupportFragmentClass(mHost.getContext(), s1))
	//*  37   75:aload_0         
	//*  38   76:getfield        #444 <Field FragmentHostCallback mHost>
	//*  39   79:invokevirtual   #1319 <Method Context FragmentHostCallback.getContext()>
	//*  40   82:aload           8
	//*  41   84:invokestatic    #1638 <Method boolean Fragment.isSupportFragmentClass(Context, String)>
	//*  42   87:ifne            92
			return null;
	//   43   90:aconst_null     
	//   44   91:areturn         
		if(view != null)
	//*  45   92:aload_1         
	//*  46   93:ifnull          102
			i = view.getId();
	//   47   96:aload_1         
	//   48   97:invokevirtual   #1641 <Method int View.getId()>
	//   49  100:istore          5
		if(i == -1 && k == -1 && s2 == null)
	//*  50  102:iload           5
	//*  51  104:iconst_m1       
	//*  52  105:icmpne          166
	//*  53  108:iload           7
	//*  54  110:iconst_m1       
	//*  55  111:icmpne          166
	//*  56  114:aload           9
	//*  57  116:ifnonnull       166
		{
			view = ((View) (new StringBuilder()));
	//   58  119:new             #347 <Class StringBuilder>
	//   59  122:dup             
	//   60  123:invokespecial   #348 <Method void StringBuilder()>
	//   61  126:astore_1        
			((StringBuilder) (view)).append(attributeset.getPositionDescription());
	//   62  127:aload_1         
	//   63  128:aload           4
	//   64  130:invokeinterface #1644 <Method String AttributeSet.getPositionDescription()>
	//   65  135:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   66  138:pop             
			((StringBuilder) (view)).append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
	//   67  139:aload_1         
	//   68  140:ldc2            #1646 <String ": Must specify unique android:id, android:tag, or have a parent with an id for ">
	//   69  143:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   70  146:pop             
			((StringBuilder) (view)).append(s1);
	//   71  147:aload_1         
	//   72  148:aload           8
	//   73  150:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   74  153:pop             
			throw new IllegalArgumentException(((StringBuilder) (view)).toString());
	//   75  154:new             #1498 <Class IllegalArgumentException>
	//   76  157:dup             
	//   77  158:aload_1         
	//   78  159:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   79  162:invokespecial   #1499 <Method void IllegalArgumentException(String)>
	//   80  165:athrow          
		}
		if(k != -1)
	//*  81  166:iload           7
	//*  82  168:iconst_m1       
	//*  83  169:icmpeq          182
			s = ((String) (findFragmentById(k)));
	//   84  172:aload_0         
	//   85  173:iload           7
	//   86  175:invokevirtual   #1648 <Method Fragment findFragmentById(int)>
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
	//  101  200:invokevirtual   #1650 <Method Fragment findFragmentByTag(String)>
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
	//  114  221:invokevirtual   #1648 <Method Fragment findFragmentById(int)>
	//  115  224:astore_2        
		}
		if(DEBUG)
	//* 116  225:getstatic       #843 <Field boolean DEBUG>
	//* 117  228:ifeq            296
		{
			view = ((View) (new StringBuilder()));
	//  118  231:new             #347 <Class StringBuilder>
	//  119  234:dup             
	//  120  235:invokespecial   #348 <Method void StringBuilder()>
	//  121  238:astore_1        
			((StringBuilder) (view)).append("onCreateView: id=0x");
	//  122  239:aload_1         
	//  123  240:ldc2            #1652 <String "onCreateView: id=0x">
	//  124  243:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  125  246:pop             
			((StringBuilder) (view)).append(Integer.toHexString(k));
	//  126  247:aload_1         
	//  127  248:iload           7
	//  128  250:invokestatic    #1141 <Method String Integer.toHexString(int)>
	//  129  253:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  130  256:pop             
			((StringBuilder) (view)).append(" fname=");
	//  131  257:aload_1         
	//  132  258:ldc2            #1654 <String " fname=">
	//  133  261:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  134  264:pop             
			((StringBuilder) (view)).append(s1);
	//  135  265:aload_1         
	//  136  266:aload           8
	//  137  268:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  138  271:pop             
			((StringBuilder) (view)).append(" existing=");
	//  139  272:aload_1         
	//  140  273:ldc2            #1656 <String " existing=">
	//  141  276:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  142  279:pop             
			((StringBuilder) (view)).append(((Object) (s)));
	//  143  280:aload_1         
	//  144  281:aload_2         
	//  145  282:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//  146  285:pop             
			Log.v("FragmentManager", ((StringBuilder) (view)).toString());
	//  147  286:ldc1            #72  <String "FragmentManager">
	//  148  288:aload_1         
	//  149  289:invokevirtual   #358 <Method String StringBuilder.toString()>
	//  150  292:invokestatic    #851 <Method int Log.v(String, String)>
	//  151  295:pop             
		}
		if(s == null)
	//* 152  296:aload_2         
	//* 153  297:ifnonnull       395
		{
			view = ((View) (mContainer.instantiate(context, s1, ((Bundle) (null)))));
	//  154  300:aload_0         
	//  155  301:getfield        #915 <Field FragmentContainer mContainer>
	//  156  304:aload_3         
	//  157  305:aload           8
	//  158  307:aconst_null     
	//  159  308:invokevirtual   #1660 <Method Fragment FragmentContainer.instantiate(Context, String, Bundle)>
	//  160  311:astore_1        
			view.mFromLayout = true;
	//  161  312:aload_1         
	//  162  313:iconst_1        
	//  163  314:putfield        #1213 <Field boolean Fragment.mFromLayout>
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
	//  173  336:putfield        #1248 <Field int Fragment.mFragmentId>
			view.mContainerId = i;
	//  174  339:aload_1         
	//  175  340:iload           5
	//  176  342:putfield        #398 <Field int Fragment.mContainerId>
			view.mTag = s2;
	//  177  345:aload_1         
	//  178  346:aload           9
	//  179  348:putfield        #1253 <Field String Fragment.mTag>
			view.mInLayout = true;
	//  180  351:aload_1         
	//  181  352:iconst_1        
	//  182  353:putfield        #1405 <Field boolean Fragment.mInLayout>
			view.mFragmentManager = this;
	//  183  356:aload_1         
	//  184  357:aload_0         
	//  185  358:putfield        #1456 <Field FragmentManagerImpl Fragment.mFragmentManager>
			view.mHost = mHost;
	//  186  361:aload_1         
	//  187  362:aload_0         
	//  188  363:getfield        #444 <Field FragmentHostCallback mHost>
	//  189  366:putfield        #1442 <Field FragmentHostCallback Fragment.mHost>
			((Fragment) (view)).onInflate(mHost.getContext(), attributeset, ((Fragment) (view)).mSavedFragmentState);
	//  190  369:aload_1         
	//  191  370:aload_0         
	//  192  371:getfield        #444 <Field FragmentHostCallback mHost>
	//  193  374:invokevirtual   #1319 <Method Context FragmentHostCallback.getContext()>
	//  194  377:aload           4
	//  195  379:aload_1         
	//  196  380:getfield        #1219 <Field Bundle Fragment.mSavedFragmentState>
	//  197  383:invokevirtual   #1664 <Method void Fragment.onInflate(Context, AttributeSet, Bundle)>
			addFragment(((Fragment) (view)), true);
	//  198  386:aload_0         
	//  199  387:aload_1         
	//  200  388:iconst_1        
	//  201  389:invokevirtual   #1666 <Method void addFragment(Fragment, boolean)>
		} else
	//* 202  392:goto            539
		{
			if(((Fragment) (s)).mInLayout)
	//* 203  395:aload_2         
	//* 204  396:getfield        #1405 <Field boolean Fragment.mInLayout>
	//* 205  399:ifeq            500
			{
				view = ((View) (new StringBuilder()));
	//  206  402:new             #347 <Class StringBuilder>
	//  207  405:dup             
	//  208  406:invokespecial   #348 <Method void StringBuilder()>
	//  209  409:astore_1        
				((StringBuilder) (view)).append(attributeset.getPositionDescription());
	//  210  410:aload_1         
	//  211  411:aload           4
	//  212  413:invokeinterface #1644 <Method String AttributeSet.getPositionDescription()>
	//  213  418:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  214  421:pop             
				((StringBuilder) (view)).append(": Duplicate id 0x");
	//  215  422:aload_1         
	//  216  423:ldc2            #1668 <String ": Duplicate id 0x">
	//  217  426:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  218  429:pop             
				((StringBuilder) (view)).append(Integer.toHexString(k));
	//  219  430:aload_1         
	//  220  431:iload           7
	//  221  433:invokestatic    #1141 <Method String Integer.toHexString(int)>
	//  222  436:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  223  439:pop             
				((StringBuilder) (view)).append(", tag ");
	//  224  440:aload_1         
	//  225  441:ldc2            #1670 <String ", tag ">
	//  226  444:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  227  447:pop             
				((StringBuilder) (view)).append(s2);
	//  228  448:aload_1         
	//  229  449:aload           9
	//  230  451:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  231  454:pop             
				((StringBuilder) (view)).append(", or parent id 0x");
	//  232  455:aload_1         
	//  233  456:ldc2            #1672 <String ", or parent id 0x">
	//  234  459:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  235  462:pop             
				((StringBuilder) (view)).append(Integer.toHexString(i));
	//  236  463:aload_1         
	//  237  464:iload           5
	//  238  466:invokestatic    #1141 <Method String Integer.toHexString(int)>
	//  239  469:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  240  472:pop             
				((StringBuilder) (view)).append(" with another fragment for ");
	//  241  473:aload_1         
	//  242  474:ldc2            #1674 <String " with another fragment for ">
	//  243  477:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  244  480:pop             
				((StringBuilder) (view)).append(s1);
	//  245  481:aload_1         
	//  246  482:aload           8
	//  247  484:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  248  487:pop             
				throw new IllegalArgumentException(((StringBuilder) (view)).toString());
	//  249  488:new             #1498 <Class IllegalArgumentException>
	//  250  491:dup             
	//  251  492:aload_1         
	//  252  493:invokevirtual   #358 <Method String StringBuilder.toString()>
	//  253  496:invokespecial   #1499 <Method void IllegalArgumentException(String)>
	//  254  499:athrow          
			}
			s.mInLayout = true;
	//  255  500:aload_2         
	//  256  501:iconst_1        
	//  257  502:putfield        #1405 <Field boolean Fragment.mInLayout>
			s.mHost = mHost;
	//  258  505:aload_2         
	//  259  506:aload_0         
	//  260  507:getfield        #444 <Field FragmentHostCallback mHost>
	//  261  510:putfield        #1442 <Field FragmentHostCallback Fragment.mHost>
			if(!((Fragment) (s)).mRetaining)
	//* 262  513:aload_2         
	//* 263  514:getfield        #779 <Field boolean Fragment.mRetaining>
	//* 264  517:ifne            537
				((Fragment) (s)).onInflate(mHost.getContext(), attributeset, ((Fragment) (s)).mSavedFragmentState);
	//  265  520:aload_2         
	//  266  521:aload_0         
	//  267  522:getfield        #444 <Field FragmentHostCallback mHost>
	//  268  525:invokevirtual   #1319 <Method Context FragmentHostCallback.getContext()>
	//  269  528:aload           4
	//  270  530:aload_2         
	//  271  531:getfield        #1219 <Field Bundle Fragment.mSavedFragmentState>
	//  272  534:invokevirtual   #1664 <Method void Fragment.onInflate(Context, AttributeSet, Bundle)>
			view = ((View) (s));
	//  273  537:aload_2         
	//  274  538:astore_1        
		}
		if(mCurState < 1 && ((Fragment) (view)).mFromLayout)
	//* 275  539:aload_0         
	//* 276  540:getfield        #173 <Field int mCurState>
	//* 277  543:iconst_1        
	//* 278  544:icmpge          566
	//* 279  547:aload_1         
	//* 280  548:getfield        #1213 <Field boolean Fragment.mFromLayout>
	//* 281  551:ifeq            566
			moveToState(((Fragment) (view)), 1, 0, 0, false);
	//  282  554:aload_0         
	//  283  555:aload_1         
	//  284  556:iconst_1        
	//  285  557:iconst_0        
	//  286  558:iconst_0        
	//  287  559:iconst_0        
	//  288  560:invokevirtual   #223 <Method void moveToState(Fragment, int, int, int, boolean)>
		else
	//* 289  563:goto            571
			moveToState(((Fragment) (view)));
	//  290  566:aload_0         
	//  291  567:aload_1         
	//  292  568:invokevirtual   #879 <Method void moveToState(Fragment)>
		if(((Fragment) (view)).mView == null)
	//* 293  571:aload_1         
	//* 294  572:getfield        #227 <Field View Fragment.mView>
	//* 295  575:ifnonnull       621
		{
			view = ((View) (new StringBuilder()));
	//  296  578:new             #347 <Class StringBuilder>
	//  297  581:dup             
	//  298  582:invokespecial   #348 <Method void StringBuilder()>
	//  299  585:astore_1        
			((StringBuilder) (view)).append("Fragment ");
	//  300  586:aload_1         
	//  301  587:ldc2            #1458 <String "Fragment ">
	//  302  590:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  303  593:pop             
			((StringBuilder) (view)).append(s1);
	//  304  594:aload_1         
	//  305  595:aload           8
	//  306  597:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  307  600:pop             
			((StringBuilder) (view)).append(" did not create a view.");
	//  308  601:aload_1         
	//  309  602:ldc2            #1676 <String " did not create a view.">
	//  310  605:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  311  608:pop             
			throw new IllegalStateException(((StringBuilder) (view)).toString());
	//  312  609:new             #338 <Class IllegalStateException>
	//  313  612:dup             
	//  314  613:aload_1         
	//  315  614:invokevirtual   #358 <Method String StringBuilder.toString()>
	//  316  617:invokespecial   #343 <Method void IllegalStateException(String)>
	//  317  620:athrow          
		}
		if(k != 0)
	//* 318  621:iload           7
	//* 319  623:ifeq            635
			((Fragment) (view)).mView.setId(k);
	//  320  626:aload_1         
	//  321  627:getfield        #227 <Field View Fragment.mView>
	//  322  630:iload           7
	//  323  632:invokevirtual   #1679 <Method void View.setId(int)>
		if(((Fragment) (view)).mView.getTag() == null)
	//* 324  635:aload_1         
	//* 325  636:getfield        #227 <Field View Fragment.mView>
	//* 326  639:invokevirtual   #1682 <Method Object View.getTag()>
	//* 327  642:ifnonnull       654
			((Fragment) (view)).mView.setTag(((Object) (s2)));
	//  328  645:aload_1         
	//  329  646:getfield        #227 <Field View Fragment.mView>
	//  330  649:aload           9
	//  331  651:invokevirtual   #1685 <Method void View.setTag(Object)>
		return ((Fragment) (view)).mView;
	//  332  654:aload_1         
	//  333  655:getfield        #227 <Field View Fragment.mView>
	//  334  658:areturn         
	}

	public View onCreateView(String s, Context context, AttributeSet attributeset)
	{
		return onCreateView(((View) (null)), s, context, attributeset);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokevirtual   #1688 <Method View onCreateView(View, String, Context, AttributeSet)>
	//    6    8:areturn         
	}

	public void performPendingDeferredStart(Fragment fragment)
	{
		if(fragment.mDeferStart)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1402 <Field boolean Fragment.mDeferStart>
	//*   2    4:ifeq            37
		{
			if(mExecutingActions)
	//*   3    7:aload_0         
	//*   4    8:getfield        #361 <Field boolean mExecutingActions>
	//*   5   11:ifeq            20
			{
				mHavePendingDeferredStart = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #1122 <Field boolean mHavePendingDeferredStart>
				return;
	//    9   19:return          
			}
			fragment.mDeferStart = false;
	//   10   20:aload_1         
	//   11   21:iconst_0        
	//   12   22:putfield        #1402 <Field boolean Fragment.mDeferStart>
			moveToState(fragment, mCurState, 0, 0, false);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #173 <Field int mCurState>
	//   17   31:iconst_0        
	//   18   32:iconst_0        
	//   19   33:iconst_0        
	//   20   34:invokevirtual   #223 <Method void moveToState(Fragment, int, int, int, boolean)>
		}
	//   21   37:return          
	}

	public void popBackStack()
	{
		enqueueAction(((OpGenerator) (new PopBackStackState(((String) (null)), -1, 0))), false);
	//    0    0:aload_0         
	//    1    1:new             #41  <Class FragmentManagerImpl$PopBackStackState>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:iconst_m1       
	//    6    8:iconst_0        
	//    7    9:invokespecial   #1693 <Method void FragmentManagerImpl$PopBackStackState(FragmentManagerImpl, String, int, int)>
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #1695 <Method void enqueueAction(FragmentManagerImpl$OpGenerator, boolean)>
	//   10   16:return          
	}

	public void popBackStack(int i, int j)
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            38
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #347 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #348 <Method void StringBuilder()>
	//    5   11:astore_3        
			stringbuilder.append("Bad id: ");
	//    6   12:aload_3         
	//    7   13:ldc2            #1698 <String "Bad id: ">
	//    8   16:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
			stringbuilder.append(i);
	//   10   20:aload_3         
	//   11   21:iload_1         
	//   12   22:invokevirtual   #897 <Method StringBuilder StringBuilder.append(int)>
	//   13   25:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   14   26:new             #1498 <Class IllegalArgumentException>
	//   15   29:dup             
	//   16   30:aload_3         
	//   17   31:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   18   34:invokespecial   #1499 <Method void IllegalArgumentException(String)>
	//   19   37:athrow          
		} else
		{
			enqueueAction(((OpGenerator) (new PopBackStackState(((String) (null)), i, j))), false);
	//   20   38:aload_0         
	//   21   39:new             #41  <Class FragmentManagerImpl$PopBackStackState>
	//   22   42:dup             
	//   23   43:aload_0         
	//   24   44:aconst_null     
	//   25   45:iload_1         
	//   26   46:iload_2         
	//   27   47:invokespecial   #1693 <Method void FragmentManagerImpl$PopBackStackState(FragmentManagerImpl, String, int, int)>
	//   28   50:iconst_0        
	//   29   51:invokevirtual   #1695 <Method void enqueueAction(FragmentManagerImpl$OpGenerator, boolean)>
			return;
	//   30   54:return          
		}
	}

	public void popBackStack(String s, int i)
	{
		enqueueAction(((OpGenerator) (new PopBackStackState(s, -1, i))), false);
	//    0    0:aload_0         
	//    1    1:new             #41  <Class FragmentManagerImpl$PopBackStackState>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iconst_m1       
	//    6    8:iload_2         
	//    7    9:invokespecial   #1693 <Method void FragmentManagerImpl$PopBackStackState(FragmentManagerImpl, String, int, int)>
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #1695 <Method void enqueueAction(FragmentManagerImpl$OpGenerator, boolean)>
	//   10   16:return          
	}

	public boolean popBackStackImmediate()
	{
		checkStateLoss();
	//    0    0:aload_0         
	//    1    1:invokespecial   #467 <Method void checkStateLoss()>
		return popBackStackImmediate(((String) (null)), -1, 0);
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:iconst_m1       
	//    5    7:iconst_0        
	//    6    8:invokespecial   #1701 <Method boolean popBackStackImmediate(String, int, int)>
	//    7   11:ireturn         
	}

	public boolean popBackStackImmediate(int i, int j)
	{
		checkStateLoss();
	//    0    0:aload_0         
	//    1    1:invokespecial   #467 <Method void checkStateLoss()>
		execPendingActions();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #414 <Method boolean execPendingActions()>
	//    4    8:pop             
		if(i < 0)
	//*   5    9:iload_1         
	//*   6   10:ifge            47
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   13:new             #347 <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #348 <Method void StringBuilder()>
	//   10   20:astore_3        
			stringbuilder.append("Bad id: ");
	//   11   21:aload_3         
	//   12   22:ldc2            #1698 <String "Bad id: ">
	//   13   25:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
			stringbuilder.append(i);
	//   15   29:aload_3         
	//   16   30:iload_1         
	//   17   31:invokevirtual   #897 <Method StringBuilder StringBuilder.append(int)>
	//   18   34:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   19   35:new             #1498 <Class IllegalArgumentException>
	//   20   38:dup             
	//   21   39:aload_3         
	//   22   40:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   23   43:invokespecial   #1499 <Method void IllegalArgumentException(String)>
	//   24   46:athrow          
		} else
		{
			return popBackStackImmediate(((String) (null)), i, j);
	//   25   47:aload_0         
	//   26   48:aconst_null     
	//   27   49:iload_1         
	//   28   50:iload_2         
	//   29   51:invokespecial   #1701 <Method boolean popBackStackImmediate(String, int, int)>
	//   30   54:ireturn         
		}
	}

	public boolean popBackStackImmediate(String s, int i)
	{
		checkStateLoss();
	//    0    0:aload_0         
	//    1    1:invokespecial   #467 <Method void checkStateLoss()>
		return popBackStackImmediate(s, -1, i);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iconst_m1       
	//    5    7:iload_2         
	//    6    8:invokespecial   #1701 <Method boolean popBackStackImmediate(String, int, int)>
	//    7   11:ireturn         
	}

	boolean popBackStackState(ArrayList arraylist, ArrayList arraylist1, String s, int i, int j)
	{
		if(mBackStack == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #839 <Field ArrayList mBackStack>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(s == null && i < 0 && (j & 1) == 0)
	//*   5    9:aload_3         
	//*   6   10:ifnonnull       68
	//*   7   13:iload           4
	//*   8   15:ifge            68
	//*   9   18:iload           5
	//*  10   20:iconst_1        
	//*  11   21:iand            
	//*  12   22:ifne            68
		{
			i = mBackStack.size() - 1;
	//   13   25:aload_0         
	//   14   26:getfield        #839 <Field ArrayList mBackStack>
	//   15   29:invokevirtual   #204 <Method int ArrayList.size()>
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:istore          4
			if(i < 0)
	//*  19   36:iload           4
	//*  20   38:ifge            43
			{
				return false;
	//   21   41:iconst_0        
	//   22   42:ireturn         
			} else
			{
				arraylist.add(mBackStack.remove(i));
	//   23   43:aload_1         
	//   24   44:aload_0         
	//   25   45:getfield        #839 <Field ArrayList mBackStack>
	//   26   48:iload           4
	//   27   50:invokevirtual   #553 <Method Object ArrayList.remove(int)>
	//   28   53:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
	//   29   56:pop             
				arraylist1.add(((Object) (Boolean.valueOf(true))));
	//   30   57:aload_2         
	//   31   58:iconst_1        
	//   32   59:invokestatic    #386 <Method Boolean Boolean.valueOf(boolean)>
	//   33   62:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
	//   34   65:pop             
				return true;
	//   35   66:iconst_1        
	//   36   67:ireturn         
			}
		}
		int k;
		if(s == null && i < 0)
	//*  37   68:aload_3         
	//*  38   69:ifnonnull       86
	//*  39   72:iload           4
	//*  40   74:iflt            80
	//*  41   77:goto            86
		{
			k = -1;
	//   42   80:iconst_m1       
	//   43   81:istore          6
		} else
	//*  44   83:goto            257
		{
			int l = mBackStack.size() - 1;
	//   45   86:aload_0         
	//   46   87:getfield        #839 <Field ArrayList mBackStack>
	//   47   90:invokevirtual   #204 <Method int ArrayList.size()>
	//   48   93:iconst_1        
	//   49   94:isub            
	//   50   95:istore          7
			do
			{
				if(l < 0)
					break;
	//   51   97:iload           7
	//   52   99:iflt            162
				BackStackRecord backstackrecord = (BackStackRecord)mBackStack.get(l);
	//   53  102:aload_0         
	//   54  103:getfield        #839 <Field ArrayList mBackStack>
	//   55  106:iload           7
	//   56  108:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//   57  111:checkcast       #370 <Class BackStackRecord>
	//   58  114:astore          8
				if(s != null && s.equals(((Object) (backstackrecord.getName()))) || i >= 0 && i == backstackrecord.mIndex)
	//*  59  116:aload_3         
	//*  60  117:ifnull          135
	//*  61  120:aload_3         
	//*  62  121:aload           8
	//*  63  123:invokevirtual   #1706 <Method String BackStackRecord.getName()>
	//*  64  126:invokevirtual   #677 <Method boolean String.equals(Object)>
	//*  65  129:ifeq            135
	//*  66  132:goto            162
	//*  67  135:iload           4
	//*  68  137:iflt            153
	//*  69  140:iload           4
	//*  70  142:aload           8
	//*  71  144:getfield        #518 <Field int BackStackRecord.mIndex>
	//*  72  147:icmpne          153
					break;
	//   73  150:goto            162
				l--;
	//   74  153:iload           7
	//   75  155:iconst_1        
	//   76  156:isub            
	//   77  157:istore          7
			} while(true);
	//   78  159:goto            97
			if(l < 0)
	//*  79  162:iload           7
	//*  80  164:ifge            169
				return false;
	//   81  167:iconst_0        
	//   82  168:ireturn         
			k = l;
	//   83  169:iload           7
	//   84  171:istore          6
			if((j & 1) != 0)
	//*  85  173:iload           5
	//*  86  175:iconst_1        
	//*  87  176:iand            
	//*  88  177:ifeq            257
			{
				j = l - 1;
	//   89  180:iload           7
	//   90  182:iconst_1        
	//   91  183:isub            
	//   92  184:istore          5
				do
				{
					k = j;
	//   93  186:iload           5
	//   94  188:istore          6
					if(j < 0)
						break;
	//   95  190:iload           5
	//   96  192:iflt            257
					BackStackRecord backstackrecord1 = (BackStackRecord)mBackStack.get(j);
	//   97  195:aload_0         
	//   98  196:getfield        #839 <Field ArrayList mBackStack>
	//   99  199:iload           5
	//  100  201:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//  101  204:checkcast       #370 <Class BackStackRecord>
	//  102  207:astore          8
					if(s == null || !s.equals(((Object) (backstackrecord1.getName()))))
	//* 103  209:aload_3         
	//* 104  210:ifnull          225
	//* 105  213:aload_3         
	//* 106  214:aload           8
	//* 107  216:invokevirtual   #1706 <Method String BackStackRecord.getName()>
	//* 108  219:invokevirtual   #677 <Method boolean String.equals(Object)>
	//* 109  222:ifne            248
					{
						k = j;
	//  110  225:iload           5
	//  111  227:istore          6
						if(i < 0)
							break;
	//  112  229:iload           4
	//  113  231:iflt            257
						k = j;
	//  114  234:iload           5
	//  115  236:istore          6
						if(i != backstackrecord1.mIndex)
							break;
	//  116  238:iload           4
	//  117  240:aload           8
	//  118  242:getfield        #518 <Field int BackStackRecord.mIndex>
	//  119  245:icmpne          257
					}
					j--;
	//  120  248:iload           5
	//  121  250:iconst_1        
	//  122  251:isub            
	//  123  252:istore          5
				} while(true);
	//  124  254:goto            186
			}
		}
		if(k == mBackStack.size() - 1)
	//* 125  257:iload           6
	//* 126  259:aload_0         
	//* 127  260:getfield        #839 <Field ArrayList mBackStack>
	//* 128  263:invokevirtual   #204 <Method int ArrayList.size()>
	//* 129  266:iconst_1        
	//* 130  267:isub            
	//* 131  268:icmpne          273
			return false;
	//  132  271:iconst_0        
	//  133  272:ireturn         
		for(i = mBackStack.size() - 1; i > k; i--)
	//* 134  273:aload_0         
	//* 135  274:getfield        #839 <Field ArrayList mBackStack>
	//* 136  277:invokevirtual   #204 <Method int ArrayList.size()>
	//* 137  280:iconst_1        
	//* 138  281:isub            
	//* 139  282:istore          4
	//* 140  284:iload           4
	//* 141  286:iload           6
	//* 142  288:icmple          323
		{
			arraylist.add(mBackStack.remove(i));
	//  143  291:aload_1         
	//  144  292:aload_0         
	//  145  293:getfield        #839 <Field ArrayList mBackStack>
	//  146  296:iload           4
	//  147  298:invokevirtual   #553 <Method Object ArrayList.remove(int)>
	//  148  301:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
	//  149  304:pop             
			arraylist1.add(((Object) (Boolean.valueOf(true))));
	//  150  305:aload_2         
	//  151  306:iconst_1        
	//  152  307:invokestatic    #386 <Method Boolean Boolean.valueOf(boolean)>
	//  153  310:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
	//  154  313:pop             
		}

	//  155  314:iload           4
	//  156  316:iconst_1        
	//  157  317:isub            
	//  158  318:istore          4
	//* 159  320:goto            284
		return true;
	//  160  323:iconst_1        
	//  161  324:ireturn         
	}

	public void putFragment(Bundle bundle, String s, Fragment fragment)
	{
		if(fragment.mIndex < 0)
	//*   0    0:aload_3         
	//*   1    1:getfield        #1357 <Field int Fragment.mIndex>
	//*   2    4:ifge            57
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #347 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #348 <Method void StringBuilder()>
	//    6   14:astore          4
			stringbuilder.append("Fragment ");
	//    7   16:aload           4
	//    8   18:ldc2            #1458 <String "Fragment ">
	//    9   21:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:pop             
			stringbuilder.append(((Object) (fragment)));
	//   11   25:aload           4
	//   12   27:aload_3         
	//   13   28:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//   14   31:pop             
			stringbuilder.append(" is not currently in the FragmentManager");
	//   15   32:aload           4
	//   16   34:ldc2            #1711 <String " is not currently in the FragmentManager">
	//   17   37:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   18   40:pop             
			throwException(((RuntimeException) (new IllegalStateException(stringbuilder.toString()))));
	//   19   41:aload_0         
	//   20   42:new             #338 <Class IllegalStateException>
	//   21   45:dup             
	//   22   46:aload           4
	//   23   48:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   24   51:invokespecial   #343 <Method void IllegalStateException(String)>
	//   25   54:invokespecial   #1284 <Method void throwException(RuntimeException)>
		}
		bundle.putInt(s, fragment.mIndex);
	//   26   57:aload_1         
	//   27   58:aload_2         
	//   28   59:aload_3         
	//   29   60:getfield        #1357 <Field int Fragment.mIndex>
	//   30   63:invokevirtual   #1714 <Method void Bundle.putInt(String, int)>
	//   31   66:return          
	}

	public void registerFragmentLifecycleCallbacks(FragmentManager.FragmentLifecycleCallbacks fragmentlifecyclecallbacks, boolean flag)
	{
		mLifecycleCallbacks.add(((Object) (new Pair(((Object) (fragmentlifecyclecallbacks)), ((Object) (Boolean.valueOf(flag)))))));
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//    2    4:new             #1001 <Class Pair>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokestatic    #386 <Method Boolean Boolean.valueOf(boolean)>
	//    7   13:invokespecial   #1719 <Method void Pair(Object, Object)>
	//    8   16:invokevirtual   #1720 <Method boolean CopyOnWriteArrayList.add(Object)>
	//    9   19:pop             
	//   10   20:return          
	}

	public void removeFragment(Fragment fragment)
	{
		if(DEBUG)
	//*   0    0:getstatic       #843 <Field boolean DEBUG>
	//*   1    3:ifeq            55
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #347 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #348 <Method void StringBuilder()>
	//    5   13:astore_3        
			stringbuilder.append("remove: ");
	//    6   14:aload_3         
	//    7   15:ldc2            #1723 <String "remove: ">
	//    8   18:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (fragment)));
	//   10   22:aload_3         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			stringbuilder.append(" nesting=");
	//   14   28:aload_3         
	//   15   29:ldc2            #1725 <String " nesting=">
	//   16   32:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
			stringbuilder.append(fragment.mBackStackNesting);
	//   18   36:aload_3         
	//   19   37:aload_1         
	//   20   38:getfield        #1728 <Field int Fragment.mBackStackNesting>
	//   21   41:invokevirtual   #897 <Method StringBuilder StringBuilder.append(int)>
	//   22   44:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   23   45:ldc1            #72  <String "FragmentManager">
	//   24   47:aload_3         
	//   25   48:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   26   51:invokestatic    #851 <Method int Log.v(String, String)>
	//   27   54:pop             
		}
		boolean flag = fragment.isInBackStack();
	//   28   55:aload_1         
	//   29   56:invokevirtual   #1377 <Method boolean Fragment.isInBackStack()>
	//   30   59:istore_2        
		if(!fragment.mDetached || flag ^ true)
	//*  31   60:aload_1         
	//*  32   61:getfield        #858 <Field boolean Fragment.mDetached>
	//*  33   64:ifeq            73
	//*  34   67:iload_2         
	//*  35   68:iconst_1        
	//*  36   69:ixor            
	//*  37   70:ifeq            120
		{
			synchronized(mAdded)
	//*  38   73:aload_0         
	//*  39   74:getfield        #166 <Field ArrayList mAdded>
	//*  40   77:astore_3        
	//*  41   78:aload_3         
	//*  42   79:monitorenter    
			{
				mAdded.remove(((Object) (fragment)));
	//   43   80:aload_0         
	//   44   81:getfield        #166 <Field ArrayList mAdded>
	//   45   84:aload_1         
	//   46   85:invokevirtual   #954 <Method boolean ArrayList.remove(Object)>
	//   47   88:pop             
			}
	//   48   89:aload_3         
	//   49   90:monitorexit     
			if(fragment.mHasMenu && fragment.mMenuVisible)
	//*  50   91:aload_1         
	//*  51   92:getfield        #872 <Field boolean Fragment.mHasMenu>
	//*  52   95:ifeq            110
	//*  53   98:aload_1         
	//*  54   99:getfield        #875 <Field boolean Fragment.mMenuVisible>
	//*  55  102:ifeq            110
				mNeedMenuInvalidate = true;
	//   56  105:aload_0         
	//   57  106:iconst_1        
	//   58  107:putfield        #877 <Field boolean mNeedMenuInvalidate>
			fragment.mAdded = false;
	//   59  110:aload_1         
	//   60  111:iconst_0        
	//   61  112:putfield        #650 <Field boolean Fragment.mAdded>
			fragment.mRemoving = true;
	//   62  115:aload_1         
	//   63  116:iconst_1        
	//   64  117:putfield        #866 <Field boolean Fragment.mRemoving>
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
		if(mBackStackChangeListeners != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #883 <Field ArrayList mBackStackChangeListeners>
	//*   2    4:ifnull          16
			mBackStackChangeListeners.remove(((Object) (onbackstackchangedlistener)));
	//    3    7:aload_0         
	//    4    8:getfield        #883 <Field ArrayList mBackStackChangeListeners>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #954 <Method boolean ArrayList.remove(Object)>
	//    7   15:pop             
	//    8   16:return          
	}

	void reportBackStackChanged()
	{
		if(mBackStackChangeListeners != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #883 <Field ArrayList mBackStackChangeListeners>
	//*   2    4:ifnull          43
		{
			for(int i = 0; i < mBackStackChangeListeners.size(); i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_1        
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #883 <Field ArrayList mBackStackChangeListeners>
	//*   8   14:invokevirtual   #204 <Method int ArrayList.size()>
	//*   9   17:icmpge          43
				((FragmentManager.OnBackStackChangedListener)mBackStackChangeListeners.get(i)).onBackStackChanged();
	//   10   20:aload_0         
	//   11   21:getfield        #883 <Field ArrayList mBackStackChangeListeners>
	//   12   24:iload_1         
	//   13   25:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//   14   28:checkcast       #1731 <Class FragmentManager$OnBackStackChangedListener>
	//   15   31:invokeinterface #1734 <Method void FragmentManager$OnBackStackChangedListener.onBackStackChanged()>

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
	//    4    6:checkcast       #1738 <Class FragmentManagerState>
	//    5    9:astore          9
		if(fragmentmanagerstate.mActive == null)
	//*   6   11:aload           9
	//*   7   13:getfield        #1741 <Field FragmentState[] FragmentManagerState.mActive>
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
	//   13   25:invokevirtual   #763 <Method List FragmentManagerNonConfig.getFragments()>
	//   14   28:astore          10
			List list = fragmentmanagernonconfig.getChildNonConfigs();
	//   15   30:aload_2         
	//   16   31:invokevirtual   #782 <Method List FragmentManagerNonConfig.getChildNonConfigs()>
	//   17   34:astore          7
			List list1 = fragmentmanagernonconfig.getViewModelStores();
	//   18   36:aload_2         
	//   19   37:invokevirtual   #1744 <Method List FragmentManagerNonConfig.getViewModelStores()>
	//   20   40:astore          8
			int i;
			if(list2 != null)
	//*  21   42:aload           10
	//*  22   44:ifnull          58
				i = list2.size();
	//   23   47:aload           10
	//   24   49:invokeinterface #686 <Method int List.size()>
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
	//   40   80:invokeinterface #687 <Method Object List.get(int)>
	//   41   85:checkcast       #210 <Class Fragment>
	//   42   88:astore_1        
				if(DEBUG)
	//*  43   89:getstatic       #843 <Field boolean DEBUG>
	//*  44   92:ifeq            131
				{
					obj = ((Object) (new StringBuilder()));
	//   45   95:new             #347 <Class StringBuilder>
	//   46   98:dup             
	//   47   99:invokespecial   #348 <Method void StringBuilder()>
	//   48  102:astore          6
					((StringBuilder) (obj)).append("restoreAllState: re-attaching retained ");
	//   49  104:aload           6
	//   50  106:ldc2            #1746 <String "restoreAllState: re-attaching retained ">
	//   51  109:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   52  112:pop             
					((StringBuilder) (obj)).append(((Object) (parcelable)));
	//   53  113:aload           6
	//   54  115:aload_1         
	//   55  116:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//   56  119:pop             
					Log.v("FragmentManager", ((StringBuilder) (obj)).toString());
	//   57  120:ldc1            #72  <String "FragmentManager">
	//   58  122:aload           6
	//   59  124:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   60  127:invokestatic    #851 <Method int Log.v(String, String)>
	//   61  130:pop             
				}
				int l1;
				for(l1 = 0; l1 < fragmentmanagerstate.mActive.length && fragmentmanagerstate.mActive[l1].mIndex != ((Fragment) (parcelable)).mIndex; l1++);
	//   62  131:iconst_0        
	//   63  132:istore          5
	//   64  134:iload           5
	//   65  136:aload           9
	//   66  138:getfield        #1741 <Field FragmentState[] FragmentManagerState.mActive>
	//   67  141:arraylength     
	//   68  142:icmpge          172
	//   69  145:aload           9
	//   70  147:getfield        #1741 <Field FragmentState[] FragmentManagerState.mActive>
	//   71  150:iload           5
	//   72  152:aaload          
	//   73  153:getfield        #1749 <Field int FragmentState.mIndex>
	//   74  156:aload_1         
	//   75  157:getfield        #1357 <Field int Fragment.mIndex>
	//   76  160:icmpeq          172
	//   77  163:iload           5
	//   78  165:iconst_1        
	//   79  166:iadd            
	//   80  167:istore          5
	//*  81  169:goto            134
				if(l1 == fragmentmanagerstate.mActive.length)
	//*  82  172:iload           5
	//*  83  174:aload           9
	//*  84  176:getfield        #1741 <Field FragmentState[] FragmentManagerState.mActive>
	//*  85  179:arraylength     
	//*  86  180:icmpne          227
				{
					obj = ((Object) (new StringBuilder()));
	//   87  183:new             #347 <Class StringBuilder>
	//   88  186:dup             
	//   89  187:invokespecial   #348 <Method void StringBuilder()>
	//   90  190:astore          6
					((StringBuilder) (obj)).append("Could not find active fragment with index ");
	//   91  192:aload           6
	//   92  194:ldc2            #1751 <String "Could not find active fragment with index ">
	//   93  197:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   94  200:pop             
					((StringBuilder) (obj)).append(((Fragment) (parcelable)).mIndex);
	//   95  201:aload           6
	//   96  203:aload_1         
	//   97  204:getfield        #1357 <Field int Fragment.mIndex>
	//   98  207:invokevirtual   #897 <Method StringBuilder StringBuilder.append(int)>
	//   99  210:pop             
					throwException(((RuntimeException) (new IllegalStateException(((StringBuilder) (obj)).toString()))));
	//  100  211:aload_0         
	//  101  212:new             #338 <Class IllegalStateException>
	//  102  215:dup             
	//  103  216:aload           6
	//  104  218:invokevirtual   #358 <Method String StringBuilder.toString()>
	//  105  221:invokespecial   #343 <Method void IllegalStateException(String)>
	//  106  224:invokespecial   #1284 <Method void throwException(RuntimeException)>
				}
				obj = ((Object) (fragmentmanagerstate.mActive[l1]));
	//  107  227:aload           9
	//  108  229:getfield        #1741 <Field FragmentState[] FragmentManagerState.mActive>
	//  109  232:iload           5
	//  110  234:aaload          
	//  111  235:astore          6
				obj.mInstance = ((Fragment) (parcelable));
	//  112  237:aload           6
	//  113  239:aload_1         
	//  114  240:putfield        #1754 <Field Fragment FragmentState.mInstance>
				parcelable.mSavedViewState = null;
	//  115  243:aload_1         
	//  116  244:aconst_null     
	//  117  245:putfield        #1422 <Field SparseArray Fragment.mSavedViewState>
				parcelable.mBackStackNesting = 0;
	//  118  248:aload_1         
	//  119  249:iconst_0        
	//  120  250:putfield        #1728 <Field int Fragment.mBackStackNesting>
				parcelable.mInLayout = false;
	//  121  253:aload_1         
	//  122  254:iconst_0        
	//  123  255:putfield        #1405 <Field boolean Fragment.mInLayout>
				parcelable.mAdded = false;
	//  124  258:aload_1         
	//  125  259:iconst_0        
	//  126  260:putfield        #650 <Field boolean Fragment.mAdded>
				parcelable.mTarget = null;
	//  127  263:aload_1         
	//  128  264:aconst_null     
	//  129  265:putfield        #1427 <Field Fragment Fragment.mTarget>
				if(((FragmentState) (obj)).mSavedFragmentState != null)
	//* 130  268:aload           6
	//* 131  270:getfield        #1755 <Field Bundle FragmentState.mSavedFragmentState>
	//* 132  273:ifnull          317
				{
					((FragmentState) (obj)).mSavedFragmentState.setClassLoader(mHost.getContext().getClassLoader());
	//  133  276:aload           6
	//  134  278:getfield        #1755 <Field Bundle FragmentState.mSavedFragmentState>
	//  135  281:aload_0         
	//  136  282:getfield        #444 <Field FragmentHostCallback mHost>
	//  137  285:invokevirtual   #1319 <Method Context FragmentHostCallback.getContext()>
	//  138  288:invokevirtual   #1411 <Method ClassLoader Context.getClassLoader()>
	//  139  291:invokevirtual   #1415 <Method void Bundle.setClassLoader(ClassLoader)>
					parcelable.mSavedViewState = ((FragmentState) (obj)).mSavedFragmentState.getSparseParcelableArray("android:view_state");
	//  140  294:aload_1         
	//  141  295:aload           6
	//  142  297:getfield        #1755 <Field Bundle FragmentState.mSavedFragmentState>
	//  143  300:ldc1            #84  <String "android:view_state">
	//  144  302:invokevirtual   #1419 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//  145  305:putfield        #1422 <Field SparseArray Fragment.mSavedViewState>
					parcelable.mSavedFragmentState = ((FragmentState) (obj)).mSavedFragmentState;
	//  146  308:aload_1         
	//  147  309:aload           6
	//  148  311:getfield        #1755 <Field Bundle FragmentState.mSavedFragmentState>
	//  149  314:putfield        #1219 <Field Bundle Fragment.mSavedFragmentState>
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
	//  160  333:new             #320 <Class SparseArray>
	//  161  336:dup             
	//  162  337:aload           9
	//  163  339:getfield        #1741 <Field FragmentState[] FragmentManagerState.mActive>
	//  164  342:arraylength     
	//  165  343:invokespecial   #1756 <Method void SparseArray(int)>
	//  166  346:putfield        #318 <Field SparseArray mActive>
		for(int j = 0; j < fragmentmanagerstate.mActive.length; j++)
	//* 167  349:iconst_0        
	//* 168  350:istore_3        
	//* 169  351:iload_3         
	//* 170  352:aload           9
	//* 171  354:getfield        #1741 <Field FragmentState[] FragmentManagerState.mActive>
	//* 172  357:arraylength     
	//* 173  358:icmpge          551
		{
			FragmentState fragmentstate = fragmentmanagerstate.mActive[j];
	//  174  361:aload           9
	//  175  363:getfield        #1741 <Field FragmentState[] FragmentManagerState.mActive>
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
	//* 185  383:invokeinterface #686 <Method int List.size()>
	//* 186  388:icmpge          407
				obj1 = ((Object) ((FragmentManagerNonConfig)((List) (obj)).get(j)));
	//  187  391:aload           6
	//  188  393:iload_3         
	//  189  394:invokeinterface #687 <Method Object List.get(int)>
	//  190  399:checkcast       #760 <Class FragmentManagerNonConfig>
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
	//* 199  416:invokeinterface #686 <Method int List.size()>
	//* 200  421:icmpge          439
				viewmodelstore = (ViewModelStore)((List) (parcelable)).get(j);
	//  201  424:aload_1         
	//  202  425:iload_3         
	//  203  426:invokeinterface #687 <Method Object List.get(int)>
	//  204  431:checkcast       #1758 <Class ViewModelStore>
	//  205  434:astore          8
			else
	//* 206  436:goto            442
				viewmodelstore = null;
	//  207  439:aconst_null     
	//  208  440:astore          8
			obj1 = ((Object) (fragmentstate.instantiate(mHost, mContainer, mParent, ((FragmentManagerNonConfig) (obj1)), viewmodelstore)));
	//  209  442:aload           10
	//  210  444:aload_0         
	//  211  445:getfield        #444 <Field FragmentHostCallback mHost>
	//  212  448:aload_0         
	//  213  449:getfield        #915 <Field FragmentContainer mContainer>
	//  214  452:aload_0         
	//  215  453:getfield        #917 <Field Fragment mParent>
	//  216  456:aload           7
	//  217  458:aload           8
	//  218  460:invokevirtual   #1761 <Method Fragment FragmentState.instantiate(FragmentHostCallback, FragmentContainer, Fragment, FragmentManagerNonConfig, ViewModelStore)>
	//  219  463:astore          7
			if(DEBUG)
	//* 220  465:getstatic       #843 <Field boolean DEBUG>
	//* 221  468:ifeq            524
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//  222  471:new             #347 <Class StringBuilder>
	//  223  474:dup             
	//  224  475:invokespecial   #348 <Method void StringBuilder()>
	//  225  478:astore          8
				stringbuilder1.append("restoreAllState: active #");
	//  226  480:aload           8
	//  227  482:ldc2            #1763 <String "restoreAllState: active #">
	//  228  485:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  229  488:pop             
				stringbuilder1.append(j);
	//  230  489:aload           8
	//  231  491:iload_3         
	//  232  492:invokevirtual   #897 <Method StringBuilder StringBuilder.append(int)>
	//  233  495:pop             
				stringbuilder1.append(": ");
	//  234  496:aload           8
	//  235  498:ldc2            #1152 <String ": ">
	//  236  501:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  237  504:pop             
				stringbuilder1.append(obj1);
	//  238  505:aload           8
	//  239  507:aload           7
	//  240  509:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//  241  512:pop             
				Log.v("FragmentManager", stringbuilder1.toString());
	//  242  513:ldc1            #72  <String "FragmentManager">
	//  243  515:aload           8
	//  244  517:invokevirtual   #358 <Method String StringBuilder.toString()>
	//  245  520:invokestatic    #851 <Method int Log.v(String, String)>
	//  246  523:pop             
			}
			mActive.put(((Fragment) (obj1)).mIndex, obj1);
	//  247  524:aload_0         
	//  248  525:getfield        #318 <Field SparseArray mActive>
	//  249  528:aload           7
	//  250  530:getfield        #1357 <Field int Fragment.mIndex>
	//  251  533:aload           7
	//  252  535:invokevirtual   #1365 <Method void SparseArray.put(int, Object)>
			fragmentstate.mInstance = null;
	//  253  538:aload           10
	//  254  540:aconst_null     
	//  255  541:putfield        #1754 <Field Fragment FragmentState.mInstance>
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
	//  264  556:invokevirtual   #763 <Method List FragmentManagerNonConfig.getFragments()>
	//  265  559:astore_1        
			int k;
			if(parcelable != null)
	//* 266  560:aload_1         
	//* 267  561:ifnull          574
				k = ((List) (parcelable)).size();
	//  268  564:aload_1         
	//  269  565:invokeinterface #686 <Method int List.size()>
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
	//  281  588:invokeinterface #687 <Method Object List.get(int)>
	//  282  593:checkcast       #210 <Class Fragment>
	//  283  596:astore_2        
				if(((Fragment) (fragmentmanagernonconfig)).mTargetIndex < 0)
					continue;
	//  284  597:aload_2         
	//  285  598:getfield        #1766 <Field int Fragment.mTargetIndex>
	//  286  601:iflt            684
				fragmentmanagernonconfig.mTarget = (Fragment)mActive.get(((Fragment) (fragmentmanagernonconfig)).mTargetIndex);
	//  287  604:aload_2         
	//  288  605:aload_0         
	//  289  606:getfield        #318 <Field SparseArray mActive>
	//  290  609:aload_2         
	//  291  610:getfield        #1766 <Field int Fragment.mTargetIndex>
	//  292  613:invokevirtual   #1278 <Method Object SparseArray.get(int)>
	//  293  616:checkcast       #210 <Class Fragment>
	//  294  619:putfield        #1427 <Field Fragment Fragment.mTarget>
				if(((Fragment) (fragmentmanagernonconfig)).mTarget == null)
	//* 295  622:aload_2         
	//* 296  623:getfield        #1427 <Field Fragment Fragment.mTarget>
	//* 297  626:ifnonnull       684
				{
					StringBuilder stringbuilder = new StringBuilder();
	//  298  629:new             #347 <Class StringBuilder>
	//  299  632:dup             
	//  300  633:invokespecial   #348 <Method void StringBuilder()>
	//  301  636:astore          6
					stringbuilder.append("Re-attaching retained fragment ");
	//  302  638:aload           6
	//  303  640:ldc2            #1768 <String "Re-attaching retained fragment ">
	//  304  643:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  305  646:pop             
					stringbuilder.append(((Object) (fragmentmanagernonconfig)));
	//  306  647:aload           6
	//  307  649:aload_2         
	//  308  650:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//  309  653:pop             
					stringbuilder.append(" target no longer exists: ");
	//  310  654:aload           6
	//  311  656:ldc2            #1770 <String " target no longer exists: ">
	//  312  659:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  313  662:pop             
					stringbuilder.append(((Fragment) (fragmentmanagernonconfig)).mTargetIndex);
	//  314  663:aload           6
	//  315  665:aload_2         
	//  316  666:getfield        #1766 <Field int Fragment.mTargetIndex>
	//  317  669:invokevirtual   #897 <Method StringBuilder StringBuilder.append(int)>
	//  318  672:pop             
					Log.w("FragmentManager", stringbuilder.toString());
	//  319  673:ldc1            #72  <String "FragmentManager">
	//  320  675:aload           6
	//  321  677:invokevirtual   #358 <Method String StringBuilder.toString()>
	//  322  680:invokestatic    #1598 <Method int Log.w(String, String)>
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
	//  330  694:getfield        #166 <Field ArrayList mAdded>
	//  331  697:invokevirtual   #366 <Method void ArrayList.clear()>
		if(fragmentmanagerstate.mAdded != null)
	//* 332  700:aload           9
	//* 333  702:getfield        #1772 <Field int[] FragmentManagerState.mAdded>
	//* 334  705:ifnull          894
		{
			for(int l = 0; l < fragmentmanagerstate.mAdded.length; l++)
	//* 335  708:iconst_0        
	//* 336  709:istore_3        
	//* 337  710:iload_3         
	//* 338  711:aload           9
	//* 339  713:getfield        #1772 <Field int[] FragmentManagerState.mAdded>
	//* 340  716:arraylength     
	//* 341  717:icmpge          894
			{
				parcelable = ((Parcelable) ((Fragment)mActive.get(fragmentmanagerstate.mAdded[l])));
	//  342  720:aload_0         
	//  343  721:getfield        #318 <Field SparseArray mActive>
	//  344  724:aload           9
	//  345  726:getfield        #1772 <Field int[] FragmentManagerState.mAdded>
	//  346  729:iload_3         
	//  347  730:iaload          
	//  348  731:invokevirtual   #1278 <Method Object SparseArray.get(int)>
	//  349  734:checkcast       #210 <Class Fragment>
	//  350  737:astore_1        
				if(parcelable == null)
	//* 351  738:aload_1         
	//* 352  739:ifnonnull       785
				{
					fragmentmanagernonconfig = ((FragmentManagerNonConfig) (new StringBuilder()));
	//  353  742:new             #347 <Class StringBuilder>
	//  354  745:dup             
	//  355  746:invokespecial   #348 <Method void StringBuilder()>
	//  356  749:astore_2        
					((StringBuilder) (fragmentmanagernonconfig)).append("No instantiated fragment for index #");
	//  357  750:aload_2         
	//  358  751:ldc2            #1774 <String "No instantiated fragment for index #">
	//  359  754:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  360  757:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(fragmentmanagerstate.mAdded[l]);
	//  361  758:aload_2         
	//  362  759:aload           9
	//  363  761:getfield        #1772 <Field int[] FragmentManagerState.mAdded>
	//  364  764:iload_3         
	//  365  765:iaload          
	//  366  766:invokevirtual   #897 <Method StringBuilder StringBuilder.append(int)>
	//  367  769:pop             
					throwException(((RuntimeException) (new IllegalStateException(((StringBuilder) (fragmentmanagernonconfig)).toString()))));
	//  368  770:aload_0         
	//  369  771:new             #338 <Class IllegalStateException>
	//  370  774:dup             
	//  371  775:aload_2         
	//  372  776:invokevirtual   #358 <Method String StringBuilder.toString()>
	//  373  779:invokespecial   #343 <Method void IllegalStateException(String)>
	//  374  782:invokespecial   #1284 <Method void throwException(RuntimeException)>
				}
				parcelable.mAdded = true;
	//  375  785:aload_1         
	//  376  786:iconst_1        
	//  377  787:putfield        #650 <Field boolean Fragment.mAdded>
				if(DEBUG)
	//* 378  790:getstatic       #843 <Field boolean DEBUG>
	//* 379  793:ifeq            842
				{
					fragmentmanagernonconfig = ((FragmentManagerNonConfig) (new StringBuilder()));
	//  380  796:new             #347 <Class StringBuilder>
	//  381  799:dup             
	//  382  800:invokespecial   #348 <Method void StringBuilder()>
	//  383  803:astore_2        
					((StringBuilder) (fragmentmanagernonconfig)).append("restoreAllState: added #");
	//  384  804:aload_2         
	//  385  805:ldc2            #1776 <String "restoreAllState: added #">
	//  386  808:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  387  811:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(l);
	//  388  812:aload_2         
	//  389  813:iload_3         
	//  390  814:invokevirtual   #897 <Method StringBuilder StringBuilder.append(int)>
	//  391  817:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(": ");
	//  392  818:aload_2         
	//  393  819:ldc2            #1152 <String ": ">
	//  394  822:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  395  825:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(((Object) (parcelable)));
	//  396  826:aload_2         
	//  397  827:aload_1         
	//  398  828:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//  399  831:pop             
					Log.v("FragmentManager", ((StringBuilder) (fragmentmanagernonconfig)).toString());
	//  400  832:ldc1            #72  <String "FragmentManager">
	//  401  834:aload_2         
	//  402  835:invokevirtual   #358 <Method String StringBuilder.toString()>
	//  403  838:invokestatic    #851 <Method int Log.v(String, String)>
	//  404  841:pop             
				}
				if(mAdded.contains(((Object) (parcelable))))
	//* 405  842:aload_0         
	//* 406  843:getfield        #166 <Field ArrayList mAdded>
	//* 407  846:aload_1         
	//* 408  847:invokevirtual   #861 <Method boolean ArrayList.contains(Object)>
	//* 409  850:ifeq            864
					throw new IllegalStateException("Already added!");
	//  410  853:new             #338 <Class IllegalStateException>
	//  411  856:dup             
	//  412  857:ldc2            #1778 <String "Already added!">
	//  413  860:invokespecial   #343 <Method void IllegalStateException(String)>
	//  414  863:athrow          
				synchronized(mAdded)
	//* 415  864:aload_0         
	//* 416  865:getfield        #166 <Field ArrayList mAdded>
	//* 417  868:astore_2        
	//* 418  869:aload_2         
	//* 419  870:monitorenter    
				{
					mAdded.add(((Object) (parcelable)));
	//  420  871:aload_0         
	//  421  872:getfield        #166 <Field ArrayList mAdded>
	//  422  875:aload_1         
	//  423  876:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
	//  424  879:pop             
				}
	//  425  880:aload_2         
	//  426  881:monitorexit     
			}

	//  427  882:iload_3         
	//  428  883:iconst_1        
	//  429  884:iadd            
	//  430  885:istore_3        
		}
		break MISSING_BLOCK_LABEL_894;
	//  431  886:goto            710
		parcelable;
	//  432  889:astore_1        
		fragmentmanagernonconfig;
	//  433  890:aload_2         
		JVM INSTR monitorexit ;
	//  434  891:monitorexit     
		throw parcelable;
	//  435  892:aload_1         
	//  436  893:athrow          
		if(fragmentmanagerstate.mBackStack != null)
	//* 437  894:aload           9
	//* 438  896:getfield        #1781 <Field BackStackState[] FragmentManagerState.mBackStack>
	//* 439  899:ifnull          1074
		{
			mBackStack = new ArrayList(fragmentmanagerstate.mBackStack.length);
	//  440  902:aload_0         
	//  441  903:new             #163 <Class ArrayList>
	//  442  906:dup             
	//  443  907:aload           9
	//  444  909:getfield        #1781 <Field BackStackState[] FragmentManagerState.mBackStack>
	//  445  912:arraylength     
	//  446  913:invokespecial   #379 <Method void ArrayList(int)>
	//  447  916:putfield        #839 <Field ArrayList mBackStack>
			for(int i1 = 0; i1 < fragmentmanagerstate.mBackStack.length; i1++)
	//* 448  919:iconst_0        
	//* 449  920:istore_3        
	//* 450  921:iload_3         
	//* 451  922:aload           9
	//* 452  924:getfield        #1781 <Field BackStackState[] FragmentManagerState.mBackStack>
	//* 453  927:arraylength     
	//* 454  928:icmpge          1079
			{
				parcelable = ((Parcelable) (fragmentmanagerstate.mBackStack[i1].instantiate(this)));
	//  455  931:aload           9
	//  456  933:getfield        #1781 <Field BackStackState[] FragmentManagerState.mBackStack>
	//  457  936:iload_3         
	//  458  937:aaload          
	//  459  938:aload_0         
	//  460  939:invokevirtual   #1786 <Method BackStackRecord BackStackState.instantiate(FragmentManagerImpl)>
	//  461  942:astore_1        
				if(DEBUG)
	//* 462  943:getstatic       #843 <Field boolean DEBUG>
	//* 463  946:ifeq            1042
				{
					fragmentmanagernonconfig = ((FragmentManagerNonConfig) (new StringBuilder()));
	//  464  949:new             #347 <Class StringBuilder>
	//  465  952:dup             
	//  466  953:invokespecial   #348 <Method void StringBuilder()>
	//  467  956:astore_2        
					((StringBuilder) (fragmentmanagernonconfig)).append("restoreAllState: back stack #");
	//  468  957:aload_2         
	//  469  958:ldc2            #1788 <String "restoreAllState: back stack #">
	//  470  961:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  471  964:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(i1);
	//  472  965:aload_2         
	//  473  966:iload_3         
	//  474  967:invokevirtual   #897 <Method StringBuilder StringBuilder.append(int)>
	//  475  970:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(" (index ");
	//  476  971:aload_2         
	//  477  972:ldc2            #1790 <String " (index ">
	//  478  975:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  479  978:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(((BackStackRecord) (parcelable)).mIndex);
	//  480  979:aload_2         
	//  481  980:aload_1         
	//  482  981:getfield        #518 <Field int BackStackRecord.mIndex>
	//  483  984:invokevirtual   #897 <Method StringBuilder StringBuilder.append(int)>
	//  484  987:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append("): ");
	//  485  988:aload_2         
	//  486  989:ldc2            #1792 <String "): ">
	//  487  992:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  488  995:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(((Object) (parcelable)));
	//  489  996:aload_2         
	//  490  997:aload_1         
	//  491  998:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//  492 1001:pop             
					Log.v("FragmentManager", ((StringBuilder) (fragmentmanagernonconfig)).toString());
	//  493 1002:ldc1            #72  <String "FragmentManager">
	//  494 1004:aload_2         
	//  495 1005:invokevirtual   #358 <Method String StringBuilder.toString()>
	//  496 1008:invokestatic    #851 <Method int Log.v(String, String)>
	//  497 1011:pop             
					fragmentmanagernonconfig = ((FragmentManagerNonConfig) (new PrintWriter(((java.io.Writer) (new LogWriter("FragmentManager"))))));
	//  498 1012:new             #816 <Class PrintWriter>
	//  499 1015:dup             
	//  500 1016:new             #818 <Class LogWriter>
	//  501 1019:dup             
	//  502 1020:ldc1            #72  <String "FragmentManager">
	//  503 1022:invokespecial   #819 <Method void LogWriter(String)>
	//  504 1025:invokespecial   #822 <Method void PrintWriter(java.io.Writer)>
	//  505 1028:astore_2        
					((BackStackRecord) (parcelable)).dump("  ", ((PrintWriter) (fragmentmanagernonconfig)), false);
	//  506 1029:aload_1         
	//  507 1030:ldc2            #824 <String "  ">
	//  508 1033:aload_2         
	//  509 1034:iconst_0        
	//  510 1035:invokevirtual   #1795 <Method void BackStackRecord.dump(String, PrintWriter, boolean)>
					((PrintWriter) (fragmentmanagernonconfig)).close();
	//  511 1038:aload_2         
	//  512 1039:invokevirtual   #1798 <Method void PrintWriter.close()>
				}
				mBackStack.add(((Object) (parcelable)));
	//  513 1042:aload_0         
	//  514 1043:getfield        #839 <Field ArrayList mBackStack>
	//  515 1046:aload_1         
	//  516 1047:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
	//  517 1050:pop             
				if(((BackStackRecord) (parcelable)).mIndex >= 0)
	//* 518 1051:aload_1         
	//* 519 1052:getfield        #518 <Field int BackStackRecord.mIndex>
	//* 520 1055:iflt            1067
					setBackStackIndex(((BackStackRecord) (parcelable)).mIndex, ((BackStackRecord) (parcelable)));
	//  521 1058:aload_0         
	//  522 1059:aload_1         
	//  523 1060:getfield        #518 <Field int BackStackRecord.mIndex>
	//  524 1063:aload_1         
	//  525 1064:invokevirtual   #1802 <Method void setBackStackIndex(int, BackStackRecord)>
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
	//  533 1076:putfield        #839 <Field ArrayList mBackStack>
		}
		if(fragmentmanagerstate.mPrimaryNavActiveIndex >= 0)
	//* 534 1079:aload           9
	//* 535 1081:getfield        #1805 <Field int FragmentManagerState.mPrimaryNavActiveIndex>
	//* 536 1084:iflt            1106
			mPrimaryNav = (Fragment)mActive.get(fragmentmanagerstate.mPrimaryNavActiveIndex);
	//  537 1087:aload_0         
	//  538 1088:aload_0         
	//  539 1089:getfield        #318 <Field SparseArray mActive>
	//  540 1092:aload           9
	//  541 1094:getfield        #1805 <Field int FragmentManagerState.mPrimaryNavActiveIndex>
	//  542 1097:invokevirtual   #1278 <Method Object SparseArray.get(int)>
	//  543 1100:checkcast       #210 <Class Fragment>
	//  544 1103:putfield        #700 <Field Fragment mPrimaryNav>
		mNextFragmentIndex = fragmentmanagerstate.mNextFragmentIndex;
	//  545 1106:aload_0         
	//  546 1107:aload           9
	//  547 1109:getfield        #1806 <Field int FragmentManagerState.mNextFragmentIndex>
	//  548 1112:putfield        #161 <Field int mNextFragmentIndex>
		return;
	//  549 1115:return          
	}

	FragmentManagerNonConfig retainNonConfig()
	{
		setRetaining(mSavedNonConfig);
	//    0    0:aload_0         
	//    1    1:getfield        #1601 <Field FragmentManagerNonConfig mSavedNonConfig>
	//    2    4:invokestatic    #784 <Method void setRetaining(FragmentManagerNonConfig)>
		return mSavedNonConfig;
	//    3    7:aload_0         
	//    4    8:getfield        #1601 <Field FragmentManagerNonConfig mSavedNonConfig>
	//    5   11:areturn         
	}

	Parcelable saveAllState()
	{
		forcePostponedTransactions();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1243 <Method void forcePostponedTransactions()>
		endAnimatingAwayFragments();
	//    2    4:aload_0         
	//    3    5:invokespecial   #1812 <Method void endAnimatingAwayFragments()>
		execPendingActions();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #414 <Method boolean execPendingActions()>
	//    6   12:pop             
		mStateSaved = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #957 <Field boolean mStateSaved>
		FragmentManagerState fragmentmanagerstate = null;
	//   10   18:aconst_null     
	//   11   19:astore          7
		mSavedNonConfig = null;
	//   12   21:aload_0         
	//   13   22:aconst_null     
	//   14   23:putfield        #1601 <Field FragmentManagerNonConfig mSavedNonConfig>
		if(mActive != null)
	//*  15   26:aload_0         
	//*  16   27:getfield        #318 <Field SparseArray mActive>
	//*  17   30:ifnull          849
		{
			if(mActive.size() <= 0)
	//*  18   33:aload_0         
	//*  19   34:getfield        #318 <Field SparseArray mActive>
	//*  20   37:invokevirtual   #321 <Method int SparseArray.size()>
	//*  21   40:ifgt            45
				return null;
	//   22   43:aconst_null     
	//   23   44:areturn         
			int j1 = mActive.size();
	//   24   45:aload_0         
	//   25   46:getfield        #318 <Field SparseArray mActive>
	//   26   49:invokevirtual   #321 <Method int SparseArray.size()>
	//   27   52:istore          4
			FragmentState afragmentstate[] = new FragmentState[j1];
	//   28   54:iload           4
	//   29   56:anewarray       FragmentState[]
	//   30   59:astore          8
			boolean flag = false;
	//   31   61:iconst_0        
	//   32   62:istore_3        
			int i = 0;
	//   33   63:iconst_0        
	//   34   64:istore_1        
			int l = i;
	//   35   65:iload_1         
	//   36   66:istore_2        
			for(; i < j1; i++)
	//*  37   67:iload_1         
	//*  38   68:iload           4
	//*  39   70:icmpge          430
			{
				Fragment fragment = (Fragment)mActive.valueAt(i);
	//   40   73:aload_0         
	//   41   74:getfield        #318 <Field SparseArray mActive>
	//   42   77:iload_1         
	//   43   78:invokevirtual   #324 <Method Object SparseArray.valueAt(int)>
	//   44   81:checkcast       #210 <Class Fragment>
	//   45   84:astore          5
				if(fragment == null)
					continue;
	//   46   86:aload           5
	//   47   88:ifnull          423
				if(fragment.mIndex < 0)
	//*  48   91:aload           5
	//*  49   93:getfield        #1357 <Field int Fragment.mIndex>
	//*  50   96:ifge            161
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   51   99:new             #347 <Class StringBuilder>
	//   52  102:dup             
	//   53  103:invokespecial   #348 <Method void StringBuilder()>
	//   54  106:astore          6
					stringbuilder.append("Failure saving state: active ");
	//   55  108:aload           6
	//   56  110:ldc2            #1814 <String "Failure saving state: active ">
	//   57  113:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   58  116:pop             
					stringbuilder.append(((Object) (fragment)));
	//   59  117:aload           6
	//   60  119:aload           5
	//   61  121:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//   62  124:pop             
					stringbuilder.append(" has cleared index: ");
	//   63  125:aload           6
	//   64  127:ldc2            #1816 <String " has cleared index: ">
	//   65  130:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   66  133:pop             
					stringbuilder.append(fragment.mIndex);
	//   67  134:aload           6
	//   68  136:aload           5
	//   69  138:getfield        #1357 <Field int Fragment.mIndex>
	//   70  141:invokevirtual   #897 <Method StringBuilder StringBuilder.append(int)>
	//   71  144:pop             
					throwException(((RuntimeException) (new IllegalStateException(stringbuilder.toString()))));
	//   72  145:aload_0         
	//   73  146:new             #338 <Class IllegalStateException>
	//   74  149:dup             
	//   75  150:aload           6
	//   76  152:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   77  155:invokespecial   #343 <Method void IllegalStateException(String)>
	//   78  158:invokespecial   #1284 <Method void throwException(RuntimeException)>
				}
				FragmentState fragmentstate = new FragmentState(fragment);
	//   79  161:new             #1748 <Class FragmentState>
	//   80  164:dup             
	//   81  165:aload           5
	//   82  167:invokespecial   #1818 <Method void FragmentState(Fragment)>
	//   83  170:astore          6
				afragmentstate[i] = fragmentstate;
	//   84  172:aload           8
	//   85  174:iload_1         
	//   86  175:aload           6
	//   87  177:aastore         
				if(fragment.mState > 0 && fragmentstate.mSavedFragmentState == null)
	//*  88  178:aload           5
	//*  89  180:getfield        #213 <Field int Fragment.mState>
	//*  90  183:ifle            348
	//*  91  186:aload           6
	//*  92  188:getfield        #1755 <Field Bundle FragmentState.mSavedFragmentState>
	//*  93  191:ifnonnull       348
				{
					fragmentstate.mSavedFragmentState = saveFragmentBasicState(fragment);
	//   94  194:aload           6
	//   95  196:aload_0         
	//   96  197:aload           5
	//   97  199:invokevirtual   #1822 <Method Bundle saveFragmentBasicState(Fragment)>
	//   98  202:putfield        #1755 <Field Bundle FragmentState.mSavedFragmentState>
					if(fragment.mTarget != null)
	//*  99  205:aload           5
	//* 100  207:getfield        #1427 <Field Fragment Fragment.mTarget>
	//* 101  210:ifnull          358
					{
						if(fragment.mTarget.mIndex < 0)
	//* 102  213:aload           5
	//* 103  215:getfield        #1427 <Field Fragment Fragment.mTarget>
	//* 104  218:getfield        #1357 <Field int Fragment.mIndex>
	//* 105  221:ifge            286
						{
							StringBuilder stringbuilder1 = new StringBuilder();
	//  106  224:new             #347 <Class StringBuilder>
	//  107  227:dup             
	//  108  228:invokespecial   #348 <Method void StringBuilder()>
	//  109  231:astore          9
							stringbuilder1.append("Failure saving state: ");
	//  110  233:aload           9
	//  111  235:ldc2            #1824 <String "Failure saving state: ">
	//  112  238:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  113  241:pop             
							stringbuilder1.append(((Object) (fragment)));
	//  114  242:aload           9
	//  115  244:aload           5
	//  116  246:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//  117  249:pop             
							stringbuilder1.append(" has target not in fragment manager: ");
	//  118  250:aload           9
	//  119  252:ldc2            #1826 <String " has target not in fragment manager: ">
	//  120  255:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  121  258:pop             
							stringbuilder1.append(((Object) (fragment.mTarget)));
	//  122  259:aload           9
	//  123  261:aload           5
	//  124  263:getfield        #1427 <Field Fragment Fragment.mTarget>
	//  125  266:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//  126  269:pop             
							throwException(((RuntimeException) (new IllegalStateException(stringbuilder1.toString()))));
	//  127  270:aload_0         
	//  128  271:new             #338 <Class IllegalStateException>
	//  129  274:dup             
	//  130  275:aload           9
	//  131  277:invokevirtual   #358 <Method String StringBuilder.toString()>
	//  132  280:invokespecial   #343 <Method void IllegalStateException(String)>
	//  133  283:invokespecial   #1284 <Method void throwException(RuntimeException)>
						}
						if(fragmentstate.mSavedFragmentState == null)
	//* 134  286:aload           6
	//* 135  288:getfield        #1755 <Field Bundle FragmentState.mSavedFragmentState>
	//* 136  291:ifnonnull       306
							fragmentstate.mSavedFragmentState = new Bundle();
	//  137  294:aload           6
	//  138  296:new             #1273 <Class Bundle>
	//  139  299:dup             
	//  140  300:invokespecial   #1827 <Method void Bundle()>
	//  141  303:putfield        #1755 <Field Bundle FragmentState.mSavedFragmentState>
						putFragment(fragmentstate.mSavedFragmentState, "android:target_state", fragment.mTarget);
	//  142  306:aload_0         
	//  143  307:aload           6
	//  144  309:getfield        #1755 <Field Bundle FragmentState.mSavedFragmentState>
	//  145  312:ldc1            #78  <String "android:target_state">
	//  146  314:aload           5
	//  147  316:getfield        #1427 <Field Fragment Fragment.mTarget>
	//  148  319:invokevirtual   #1829 <Method void putFragment(Bundle, String, Fragment)>
						if(fragment.mTargetRequestCode != 0)
	//* 149  322:aload           5
	//* 150  324:getfield        #1430 <Field int Fragment.mTargetRequestCode>
	//* 151  327:ifeq            358
							fragmentstate.mSavedFragmentState.putInt("android:target_req_state", fragment.mTargetRequestCode);
	//  152  330:aload           6
	//  153  332:getfield        #1755 <Field Bundle FragmentState.mSavedFragmentState>
	//  154  335:ldc1            #75  <String "android:target_req_state">
	//  155  337:aload           5
	//  156  339:getfield        #1430 <Field int Fragment.mTargetRequestCode>
	//  157  342:invokevirtual   #1714 <Method void Bundle.putInt(String, int)>
					}
				} else
	//* 158  345:goto            358
				{
					fragmentstate.mSavedFragmentState = fragment.mSavedFragmentState;
	//  159  348:aload           6
	//  160  350:aload           5
	//  161  352:getfield        #1219 <Field Bundle Fragment.mSavedFragmentState>
	//  162  355:putfield        #1755 <Field Bundle FragmentState.mSavedFragmentState>
				}
				if(DEBUG)
	//* 163  358:getstatic       #843 <Field boolean DEBUG>
	//* 164  361:ifeq            421
				{
					StringBuilder stringbuilder2 = new StringBuilder();
	//  165  364:new             #347 <Class StringBuilder>
	//  166  367:dup             
	//  167  368:invokespecial   #348 <Method void StringBuilder()>
	//  168  371:astore          9
					stringbuilder2.append("Saved state of ");
	//  169  373:aload           9
	//  170  375:ldc2            #1831 <String "Saved state of ">
	//  171  378:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  172  381:pop             
					stringbuilder2.append(((Object) (fragment)));
	//  173  382:aload           9
	//  174  384:aload           5
	//  175  386:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//  176  389:pop             
					stringbuilder2.append(": ");
	//  177  390:aload           9
	//  178  392:ldc2            #1152 <String ": ">
	//  179  395:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  180  398:pop             
					stringbuilder2.append(((Object) (fragmentstate.mSavedFragmentState)));
	//  181  399:aload           9
	//  182  401:aload           6
	//  183  403:getfield        #1755 <Field Bundle FragmentState.mSavedFragmentState>
	//  184  406:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//  185  409:pop             
					Log.v("FragmentManager", stringbuilder2.toString());
	//  186  410:ldc1            #72  <String "FragmentManager">
	//  187  412:aload           9
	//  188  414:invokevirtual   #358 <Method String StringBuilder.toString()>
	//  189  417:invokestatic    #851 <Method int Log.v(String, String)>
	//  190  420:pop             
				}
				l = 1;
	//  191  421:iconst_1        
	//  192  422:istore_2        
			}

	//  193  423:iload_1         
	//  194  424:iconst_1        
	//  195  425:iadd            
	//  196  426:istore_1        
	//* 197  427:goto            67
			if(l == 0)
	//* 198  430:iload_2         
	//* 199  431:ifne            451
			{
				if(DEBUG)
	//* 200  434:getstatic       #843 <Field boolean DEBUG>
	//* 201  437:ifeq            449
					Log.v("FragmentManager", "saveAllState: no fragments!");
	//  202  440:ldc1            #72  <String "FragmentManager">
	//  203  442:ldc2            #1833 <String "saveAllState: no fragments!">
	//  204  445:invokestatic    #851 <Method int Log.v(String, String)>
	//  205  448:pop             
				return null;
	//  206  449:aconst_null     
	//  207  450:areturn         
			}
			l = mAdded.size();
	//  208  451:aload_0         
	//  209  452:getfield        #166 <Field ArrayList mAdded>
	//  210  455:invokevirtual   #204 <Method int ArrayList.size()>
	//  211  458:istore_2        
			int ai[];
			if(l > 0)
	//* 212  459:iload_2         
	//* 213  460:ifle            643
			{
				int ai1[] = new int[l];
	//  214  463:iload_2         
	//  215  464:newarray        int[]
	//  216  466:astore          6
				int j = 0;
	//  217  468:iconst_0        
	//  218  469:istore_1        
				do
				{
					ai = ai1;
	//  219  470:aload           6
	//  220  472:astore          5
					if(j >= l)
						break;
	//  221  474:iload_1         
	//  222  475:iload_2         
	//  223  476:icmpge          646
					ai1[j] = ((Fragment)mAdded.get(j)).mIndex;
	//  224  479:aload           6
	//  225  481:iload_1         
	//  226  482:aload_0         
	//  227  483:getfield        #166 <Field ArrayList mAdded>
	//  228  486:iload_1         
	//  229  487:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//  230  490:checkcast       #210 <Class Fragment>
	//  231  493:getfield        #1357 <Field int Fragment.mIndex>
	//  232  496:iastore         
					if(ai1[j] < 0)
	//* 233  497:aload           6
	//* 234  499:iload_1         
	//* 235  500:iaload          
	//* 236  501:ifge            571
					{
						ai = ((int []) (new StringBuilder()));
	//  237  504:new             #347 <Class StringBuilder>
	//  238  507:dup             
	//  239  508:invokespecial   #348 <Method void StringBuilder()>
	//  240  511:astore          5
						((StringBuilder) (ai)).append("Failure saving state: active ");
	//  241  513:aload           5
	//  242  515:ldc2            #1814 <String "Failure saving state: active ">
	//  243  518:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  244  521:pop             
						((StringBuilder) (ai)).append(mAdded.get(j));
	//  245  522:aload           5
	//  246  524:aload_0         
	//  247  525:getfield        #166 <Field ArrayList mAdded>
	//  248  528:iload_1         
	//  249  529:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//  250  532:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//  251  535:pop             
						((StringBuilder) (ai)).append(" has cleared index: ");
	//  252  536:aload           5
	//  253  538:ldc2            #1816 <String " has cleared index: ">
	//  254  541:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  255  544:pop             
						((StringBuilder) (ai)).append(ai1[j]);
	//  256  545:aload           5
	//  257  547:aload           6
	//  258  549:iload_1         
	//  259  550:iaload          
	//  260  551:invokevirtual   #897 <Method StringBuilder StringBuilder.append(int)>
	//  261  554:pop             
						throwException(((RuntimeException) (new IllegalStateException(((StringBuilder) (ai)).toString()))));
	//  262  555:aload_0         
	//  263  556:new             #338 <Class IllegalStateException>
	//  264  559:dup             
	//  265  560:aload           5
	//  266  562:invokevirtual   #358 <Method String StringBuilder.toString()>
	//  267  565:invokespecial   #343 <Method void IllegalStateException(String)>
	//  268  568:invokespecial   #1284 <Method void throwException(RuntimeException)>
					}
					if(DEBUG)
	//* 269  571:getstatic       #843 <Field boolean DEBUG>
	//* 270  574:ifeq            636
					{
						ai = ((int []) (new StringBuilder()));
	//  271  577:new             #347 <Class StringBuilder>
	//  272  580:dup             
	//  273  581:invokespecial   #348 <Method void StringBuilder()>
	//  274  584:astore          5
						((StringBuilder) (ai)).append("saveAllState: adding fragment #");
	//  275  586:aload           5
	//  276  588:ldc2            #1835 <String "saveAllState: adding fragment #">
	//  277  591:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  278  594:pop             
						((StringBuilder) (ai)).append(j);
	//  279  595:aload           5
	//  280  597:iload_1         
	//  281  598:invokevirtual   #897 <Method StringBuilder StringBuilder.append(int)>
	//  282  601:pop             
						((StringBuilder) (ai)).append(": ");
	//  283  602:aload           5
	//  284  604:ldc2            #1152 <String ": ">
	//  285  607:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  286  610:pop             
						((StringBuilder) (ai)).append(mAdded.get(j));
	//  287  611:aload           5
	//  288  613:aload_0         
	//  289  614:getfield        #166 <Field ArrayList mAdded>
	//  290  617:iload_1         
	//  291  618:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//  292  621:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//  293  624:pop             
						Log.v("FragmentManager", ((StringBuilder) (ai)).toString());
	//  294  625:ldc1            #72  <String "FragmentManager">
	//  295  627:aload           5
	//  296  629:invokevirtual   #358 <Method String StringBuilder.toString()>
	//  297  632:invokestatic    #851 <Method int Log.v(String, String)>
	//  298  635:pop             
					}
					j++;
	//  299  636:iload_1         
	//  300  637:iconst_1        
	//  301  638:iadd            
	//  302  639:istore_1        
				} while(true);
	//  303  640:goto            470
			} else
			{
				ai = null;
	//  304  643:aconst_null     
	//  305  644:astore          5
			}
			BackStackState abackstackstate[] = ((BackStackState []) (fragmentmanagerstate));
	//  306  646:aload           7
	//  307  648:astore          6
			if(mBackStack != null)
	//* 308  650:aload_0         
	//* 309  651:getfield        #839 <Field ArrayList mBackStack>
	//* 310  654:ifnull          784
			{
				int i1 = mBackStack.size();
	//  311  657:aload_0         
	//  312  658:getfield        #839 <Field ArrayList mBackStack>
	//  313  661:invokevirtual   #204 <Method int ArrayList.size()>
	//  314  664:istore_2        
				abackstackstate = ((BackStackState []) (fragmentmanagerstate));
	//  315  665:aload           7
	//  316  667:astore          6
				if(i1 > 0)
	//* 317  669:iload_2         
	//* 318  670:ifle            784
				{
					BackStackState abackstackstate1[] = new BackStackState[i1];
	//  319  673:iload_2         
	//  320  674:anewarray       BackStackState[]
	//  321  677:astore          7
					int k = ((int) (flag));
	//  322  679:iload_3         
	//  323  680:istore_1        
					do
					{
						abackstackstate = abackstackstate1;
	//  324  681:aload           7
	//  325  683:astore          6
						if(k >= i1)
							break;
	//  326  685:iload_1         
	//  327  686:iload_2         
	//  328  687:icmpge          784
						abackstackstate1[k] = new BackStackState((BackStackRecord)mBackStack.get(k));
	//  329  690:aload           7
	//  330  692:iload_1         
	//  331  693:new             #1783 <Class BackStackState>
	//  332  696:dup             
	//  333  697:aload_0         
	//  334  698:getfield        #839 <Field ArrayList mBackStack>
	//  335  701:iload_1         
	//  336  702:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//  337  705:checkcast       #370 <Class BackStackRecord>
	//  338  708:invokespecial   #1837 <Method void BackStackState(BackStackRecord)>
	//  339  711:aastore         
						if(DEBUG)
	//* 340  712:getstatic       #843 <Field boolean DEBUG>
	//* 341  715:ifeq            777
						{
							abackstackstate = ((BackStackState []) (new StringBuilder()));
	//  342  718:new             #347 <Class StringBuilder>
	//  343  721:dup             
	//  344  722:invokespecial   #348 <Method void StringBuilder()>
	//  345  725:astore          6
							((StringBuilder) (abackstackstate)).append("saveAllState: adding back stack #");
	//  346  727:aload           6
	//  347  729:ldc2            #1839 <String "saveAllState: adding back stack #">
	//  348  732:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  349  735:pop             
							((StringBuilder) (abackstackstate)).append(k);
	//  350  736:aload           6
	//  351  738:iload_1         
	//  352  739:invokevirtual   #897 <Method StringBuilder StringBuilder.append(int)>
	//  353  742:pop             
							((StringBuilder) (abackstackstate)).append(": ");
	//  354  743:aload           6
	//  355  745:ldc2            #1152 <String ": ">
	//  356  748:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  357  751:pop             
							((StringBuilder) (abackstackstate)).append(mBackStack.get(k));
	//  358  752:aload           6
	//  359  754:aload_0         
	//  360  755:getfield        #839 <Field ArrayList mBackStack>
	//  361  758:iload_1         
	//  362  759:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//  363  762:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//  364  765:pop             
							Log.v("FragmentManager", ((StringBuilder) (abackstackstate)).toString());
	//  365  766:ldc1            #72  <String "FragmentManager">
	//  366  768:aload           6
	//  367  770:invokevirtual   #358 <Method String StringBuilder.toString()>
	//  368  773:invokestatic    #851 <Method int Log.v(String, String)>
	//  369  776:pop             
						}
						k++;
	//  370  777:iload_1         
	//  371  778:iconst_1        
	//  372  779:iadd            
	//  373  780:istore_1        
					} while(true);
	//  374  781:goto            681
				}
			}
			abackstackstate1 = ((BackStackState []) (new FragmentManagerState()));
	//  375  784:new             #1738 <Class FragmentManagerState>
	//  376  787:dup             
	//  377  788:invokespecial   #1840 <Method void FragmentManagerState()>
	//  378  791:astore          7
			abackstackstate1.mActive = afragmentstate;
	//  379  793:aload           7
	//  380  795:aload           8
	//  381  797:putfield        #1741 <Field FragmentState[] FragmentManagerState.mActive>
			abackstackstate1.mAdded = ai;
	//  382  800:aload           7
	//  383  802:aload           5
	//  384  804:putfield        #1772 <Field int[] FragmentManagerState.mAdded>
			abackstackstate1.mBackStack = abackstackstate;
	//  385  807:aload           7
	//  386  809:aload           6
	//  387  811:putfield        #1781 <Field BackStackState[] FragmentManagerState.mBackStack>
			if(mPrimaryNav != null)
	//* 388  814:aload_0         
	//* 389  815:getfield        #700 <Field Fragment mPrimaryNav>
	//* 390  818:ifnull          833
				abackstackstate1.mPrimaryNavActiveIndex = mPrimaryNav.mIndex;
	//  391  821:aload           7
	//  392  823:aload_0         
	//  393  824:getfield        #700 <Field Fragment mPrimaryNav>
	//  394  827:getfield        #1357 <Field int Fragment.mIndex>
	//  395  830:putfield        #1805 <Field int FragmentManagerState.mPrimaryNavActiveIndex>
			abackstackstate1.mNextFragmentIndex = mNextFragmentIndex;
	//  396  833:aload           7
	//  397  835:aload_0         
	//  398  836:getfield        #161 <Field int mNextFragmentIndex>
	//  399  839:putfield        #1806 <Field int FragmentManagerState.mNextFragmentIndex>
			saveNonConfig();
	//  400  842:aload_0         
	//  401  843:invokevirtual   #1843 <Method void saveNonConfig()>
			return ((Parcelable) (abackstackstate1));
	//  402  846:aload           7
	//  403  848:areturn         
		} else
		{
			return null;
	//  404  849:aconst_null     
	//  405  850:areturn         
		}
	}

	Bundle saveFragmentBasicState(Fragment fragment)
	{
		if(mStateBundle == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #175 <Field Bundle mStateBundle>
	//*   2    4:ifnonnull       18
			mStateBundle = new Bundle();
	//    3    7:aload_0         
	//    4    8:new             #1273 <Class Bundle>
	//    5   11:dup             
	//    6   12:invokespecial   #1827 <Method void Bundle()>
	//    7   15:putfield        #175 <Field Bundle mStateBundle>
		fragment.performSaveInstanceState(mStateBundle);
	//    8   18:aload_1         
	//    9   19:aload_0         
	//   10   20:getfield        #175 <Field Bundle mStateBundle>
	//   11   23:invokevirtual   #1846 <Method void Fragment.performSaveInstanceState(Bundle)>
		dispatchOnFragmentSaveInstanceState(fragment, mStateBundle, false);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #175 <Field Bundle mStateBundle>
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #1068 <Method void dispatchOnFragmentSaveInstanceState(Fragment, Bundle, boolean)>
		Bundle bundle1;
		if(!mStateBundle.isEmpty())
	//*  18   36:aload_0         
	//*  19   37:getfield        #175 <Field Bundle mStateBundle>
	//*  20   40:invokevirtual   #1847 <Method boolean Bundle.isEmpty()>
	//*  21   43:ifne            59
		{
			bundle1 = mStateBundle;
	//   22   46:aload_0         
	//   23   47:getfield        #175 <Field Bundle mStateBundle>
	//   24   50:astore_3        
			mStateBundle = null;
	//   25   51:aload_0         
	//   26   52:aconst_null     
	//   27   53:putfield        #175 <Field Bundle mStateBundle>
		} else
	//*  28   56:goto            61
		{
			bundle1 = null;
	//   29   59:aconst_null     
	//   30   60:astore_3        
		}
		if(fragment.mView != null)
	//*  31   61:aload_1         
	//*  32   62:getfield        #227 <Field View Fragment.mView>
	//*  33   65:ifnull          73
			saveFragmentViewState(fragment);
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:invokevirtual   #1565 <Method void saveFragmentViewState(Fragment)>
		Bundle bundle = bundle1;
	//   37   73:aload_3         
	//   38   74:astore_2        
		if(fragment.mSavedViewState != null)
	//*  39   75:aload_1         
	//*  40   76:getfield        #1422 <Field SparseArray Fragment.mSavedViewState>
	//*  41   79:ifnull          106
		{
			bundle = bundle1;
	//   42   82:aload_3         
	//   43   83:astore_2        
			if(bundle1 == null)
	//*  44   84:aload_3         
	//*  45   85:ifnonnull       96
				bundle = new Bundle();
	//   46   88:new             #1273 <Class Bundle>
	//   47   91:dup             
	//   48   92:invokespecial   #1827 <Method void Bundle()>
	//   49   95:astore_2        
			bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
	//   50   96:aload_2         
	//   51   97:ldc1            #84  <String "android:view_state">
	//   52   99:aload_1         
	//   53  100:getfield        #1422 <Field SparseArray Fragment.mSavedViewState>
	//   54  103:invokevirtual   #1851 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
		}
		bundle1 = bundle;
	//   55  106:aload_2         
	//   56  107:astore_3        
		if(!fragment.mUserVisibleHint)
	//*  57  108:aload_1         
	//*  58  109:getfield        #1437 <Field boolean Fragment.mUserVisibleHint>
	//*  59  112:ifne            139
		{
			bundle1 = bundle;
	//   60  115:aload_2         
	//   61  116:astore_3        
			if(bundle == null)
	//*  62  117:aload_2         
	//*  63  118:ifnonnull       129
				bundle1 = new Bundle();
	//   64  121:new             #1273 <Class Bundle>
	//   65  124:dup             
	//   66  125:invokespecial   #1827 <Method void Bundle()>
	//   67  128:astore_3        
			bundle1.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
	//   68  129:aload_3         
	//   69  130:ldc1            #81  <String "android:user_visible_hint">
	//   70  132:aload_1         
	//   71  133:getfield        #1437 <Field boolean Fragment.mUserVisibleHint>
	//   72  136:invokevirtual   #1855 <Method void Bundle.putBoolean(String, boolean)>
		}
		return bundle1;
	//   73  139:aload_3         
	//   74  140:areturn         
	}

	public Fragment.SavedState saveFragmentInstanceState(Fragment fragment)
	{
		if(fragment.mIndex < 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1357 <Field int Fragment.mIndex>
	//*   2    4:ifge            52
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #347 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #348 <Method void StringBuilder()>
	//    6   14:astore_3        
			stringbuilder.append("Fragment ");
	//    7   15:aload_3         
	//    8   16:ldc2            #1458 <String "Fragment ">
	//    9   19:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
			stringbuilder.append(((Object) (fragment)));
	//   11   23:aload_3         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//   14   28:pop             
			stringbuilder.append(" is not currently in the FragmentManager");
	//   15   29:aload_3         
	//   16   30:ldc2            #1711 <String " is not currently in the FragmentManager">
	//   17   33:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			throwException(((RuntimeException) (new IllegalStateException(stringbuilder.toString()))));
	//   19   37:aload_0         
	//   20   38:new             #338 <Class IllegalStateException>
	//   21   41:dup             
	//   22   42:aload_3         
	//   23   43:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   24   46:invokespecial   #343 <Method void IllegalStateException(String)>
	//   25   49:invokespecial   #1284 <Method void throwException(RuntimeException)>
		}
		int i = fragment.mState;
	//   26   52:aload_1         
	//   27   53:getfield        #213 <Field int Fragment.mState>
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
	//   35   65:invokevirtual   #1822 <Method Bundle saveFragmentBasicState(Fragment)>
	//   36   68:astore          4
			fragment = ((Fragment) (obj));
	//   37   70:aload_3         
	//   38   71:astore_1        
			if(bundle != null)
	//*  39   72:aload           4
	//*  40   74:ifnull          87
				fragment = ((Fragment) (new Fragment.SavedState(bundle)));
	//   41   77:new             #1859 <Class Fragment$SavedState>
	//   42   80:dup             
	//   43   81:aload           4
	//   44   83:invokespecial   #1861 <Method void Fragment$SavedState(Bundle)>
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
	//*   1    1:getfield        #1230 <Field View Fragment.mInnerView>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(mStateArray == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #177 <Field SparseArray mStateArray>
	//*   6   12:ifnonnull       29
			mStateArray = new SparseArray();
	//    7   15:aload_0         
	//    8   16:new             #320 <Class SparseArray>
	//    9   19:dup             
	//   10   20:invokespecial   #1362 <Method void SparseArray()>
	//   11   23:putfield        #177 <Field SparseArray mStateArray>
		else
	//*  12   26:goto            36
			mStateArray.clear();
	//   13   29:aload_0         
	//   14   30:getfield        #177 <Field SparseArray mStateArray>
	//   15   33:invokevirtual   #1862 <Method void SparseArray.clear()>
		fragment.mInnerView.saveHierarchyState(mStateArray);
	//   16   36:aload_1         
	//   17   37:getfield        #1230 <Field View Fragment.mInnerView>
	//   18   40:aload_0         
	//   19   41:getfield        #177 <Field SparseArray mStateArray>
	//   20   44:invokevirtual   #1866 <Method void View.saveHierarchyState(SparseArray)>
		if(mStateArray.size() > 0)
	//*  21   47:aload_0         
	//*  22   48:getfield        #177 <Field SparseArray mStateArray>
	//*  23   51:invokevirtual   #321 <Method int SparseArray.size()>
	//*  24   54:ifle            70
		{
			fragment.mSavedViewState = mStateArray;
	//   25   57:aload_1         
	//   26   58:aload_0         
	//   27   59:getfield        #177 <Field SparseArray mStateArray>
	//   28   62:putfield        #1422 <Field SparseArray Fragment.mSavedViewState>
			mStateArray = null;
	//   29   65:aload_0         
	//   30   66:aconst_null     
	//   31   67:putfield        #177 <Field SparseArray mStateArray>
		}
	//   32   70:return          
	}

	void saveNonConfig()
	{
		Object obj1;
		Object obj2;
		ArrayList arraylist3;
		if(mActive != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #318 <Field SparseArray mActive>
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
	//   19   31:getfield        #318 <Field SparseArray mActive>
	//   20   34:invokevirtual   #321 <Method int SparseArray.size()>
	//   21   37:icmpge          412
				Fragment fragment = (Fragment)mActive.valueAt(i);
	//   22   40:aload_0         
	//   23   41:getfield        #318 <Field SparseArray mActive>
	//   24   44:iload_1         
	//   25   45:invokevirtual   #324 <Method Object SparseArray.valueAt(int)>
	//   26   48:checkcast       #210 <Class Fragment>
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
	//*  39   74:getfield        #1869 <Field boolean Fragment.mRetainInstance>
	//*  40   77:ifeq            179
					{
						obj2 = obj;
	//   41   80:aload_3         
	//   42   81:astore          7
						if(obj == null)
	//*  43   83:aload_3         
	//*  44   84:ifnonnull       96
							obj2 = ((Object) (new ArrayList()));
	//   45   87:new             #163 <Class ArrayList>
	//   46   90:dup             
	//   47   91:invokespecial   #164 <Method void ArrayList()>
	//   48   94:astore          7
						((ArrayList) (obj2)).add(((Object) (fragment)));
	//   49   96:aload           7
	//   50   98:aload           10
	//   51  100:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
	//   52  103:pop             
						int j;
						if(fragment.mTarget != null)
	//*  53  104:aload           10
	//*  54  106:getfield        #1427 <Field Fragment Fragment.mTarget>
	//*  55  109:ifnull          124
							j = fragment.mTarget.mIndex;
	//   56  112:aload           10
	//   57  114:getfield        #1427 <Field Fragment Fragment.mTarget>
	//   58  117:getfield        #1357 <Field int Fragment.mIndex>
	//   59  120:istore_2        
						else
	//*  60  121:goto            126
							j = -1;
	//   61  124:iconst_m1       
	//   62  125:istore_2        
						fragment.mTargetIndex = j;
	//   63  126:aload           10
	//   64  128:iload_2         
	//   65  129:putfield        #1766 <Field int Fragment.mTargetIndex>
						obj1 = obj2;
	//   66  132:aload           7
	//   67  134:astore          6
						if(DEBUG)
	//*  68  136:getstatic       #843 <Field boolean DEBUG>
	//*  69  139:ifeq            179
						{
							obj = ((Object) (new StringBuilder()));
	//   70  142:new             #347 <Class StringBuilder>
	//   71  145:dup             
	//   72  146:invokespecial   #348 <Method void StringBuilder()>
	//   73  149:astore_3        
							((StringBuilder) (obj)).append("retainNonConfig: keeping retained ");
	//   74  150:aload_3         
	//   75  151:ldc2            #1871 <String "retainNonConfig: keeping retained ">
	//   76  154:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   77  157:pop             
							((StringBuilder) (obj)).append(((Object) (fragment)));
	//   78  158:aload_3         
	//   79  159:aload           10
	//   80  161:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//   81  164:pop             
							Log.v("FragmentManager", ((StringBuilder) (obj)).toString());
	//   82  165:ldc1            #72  <String "FragmentManager">
	//   83  167:aload_3         
	//   84  168:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   85  171:invokestatic    #851 <Method int Log.v(String, String)>
	//   86  174:pop             
							obj1 = obj2;
	//   87  175:aload           7
	//   88  177:astore          6
						}
					}
					if(fragment.mChildFragmentManager != null)
	//*  89  179:aload           10
	//*  90  181:getfield        #1449 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
	//*  91  184:ifnull          208
					{
						fragment.mChildFragmentManager.saveNonConfig();
	//   92  187:aload           10
	//   93  189:getfield        #1449 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
	//   94  192:invokevirtual   #1843 <Method void saveNonConfig()>
						obj2 = ((Object) (fragment.mChildFragmentManager.mSavedNonConfig));
	//   95  195:aload           10
	//   96  197:getfield        #1449 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
	//   97  200:getfield        #1601 <Field FragmentManagerNonConfig mSavedNonConfig>
	//   98  203:astore          7
					} else
	//*  99  205:goto            215
					{
						obj2 = ((Object) (fragment.mChildNonConfig));
	//  100  208:aload           10
	//  101  210:getfield        #1874 <Field FragmentManagerNonConfig Fragment.mChildNonConfig>
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
	//  111  231:new             #163 <Class ArrayList>
	//  112  234:dup             
	//  113  235:aload_0         
	//  114  236:getfield        #318 <Field SparseArray mActive>
	//  115  239:invokevirtual   #321 <Method int SparseArray.size()>
	//  116  242:invokespecial   #379 <Method void ArrayList(int)>
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
	//  127  260:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
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
	//  138  278:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
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
	//* 147  297:getfield        #1878 <Field ViewModelStore Fragment.mViewModelStore>
	//* 148  300:ifnull          344
						{
							arraylist1 = new ArrayList(mActive.size());
	//  149  303:new             #163 <Class ArrayList>
	//  150  306:dup             
	//  151  307:aload_0         
	//  152  308:getfield        #318 <Field SparseArray mActive>
	//  153  311:invokevirtual   #321 <Method int SparseArray.size()>
	//  154  314:invokespecial   #379 <Method void ArrayList(int)>
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
	//  165  333:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
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
	//  182  364:getfield        #1878 <Field ViewModelStore Fragment.mViewModelStore>
	//  183  367:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
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
	//  218  429:putfield        #1601 <Field FragmentManagerNonConfig mSavedNonConfig>
			return;
	//  219  432:return          
		} else
		{
			mSavedNonConfig = new FragmentManagerNonConfig(((List) (arraylist3)), ((List) (obj2)), ((List) (obj1)));
	//  220  433:aload_0         
	//  221  434:new             #760 <Class FragmentManagerNonConfig>
	//  222  437:dup             
	//  223  438:aload           8
	//  224  440:aload           7
	//  225  442:aload           6
	//  226  444:invokespecial   #1881 <Method void FragmentManagerNonConfig(List, List, List)>
	//  227  447:putfield        #1601 <Field FragmentManagerNonConfig mSavedNonConfig>
			return;
	//  228  450:return          
		}
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
	//*   3    3:getfield        #901 <Field ArrayList mBackStackIndices>
	//*   4    6:ifnonnull       20
			mBackStackIndices = new ArrayList();
	//    5    9:aload_0         
	//    6   10:new             #163 <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #164 <Method void ArrayList()>
	//    9   17:putfield        #901 <Field ArrayList mBackStackIndices>
		k = mBackStackIndices.size();
	//   10   20:aload_0         
	//   11   21:getfield        #901 <Field ArrayList mBackStackIndices>
	//   12   24:invokevirtual   #204 <Method int ArrayList.size()>
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
	//*  19   38:getstatic       #843 <Field boolean DEBUG>
	//*  20   41:ifeq            96
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   21   44:new             #347 <Class StringBuilder>
	//   22   47:dup             
	//   23   48:invokespecial   #348 <Method void StringBuilder()>
	//   24   51:astore          5
			stringbuilder.append("Setting back stack index ");
	//   25   53:aload           5
	//   26   55:ldc2            #907 <String "Setting back stack index ">
	//   27   58:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   28   61:pop             
			stringbuilder.append(i);
	//   29   62:aload           5
	//   30   64:iload_1         
	//   31   65:invokevirtual   #897 <Method StringBuilder StringBuilder.append(int)>
	//   32   68:pop             
			stringbuilder.append(" to ");
	//   33   69:aload           5
	//   34   71:ldc2            #909 <String " to ">
	//   35   74:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   36   77:pop             
			stringbuilder.append(((Object) (backstackrecord)));
	//   37   78:aload           5
	//   38   80:aload_2         
	//   39   81:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//   40   84:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   41   85:ldc1            #72  <String "FragmentManager">
	//   42   87:aload           5
	//   43   89:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   44   92:invokestatic    #851 <Method int Log.v(String, String)>
	//   45   95:pop             
		}
		mBackStackIndices.set(i, ((Object) (backstackrecord)));
	//   46   96:aload_0         
	//   47   97:getfield        #901 <Field ArrayList mBackStackIndices>
	//   48  100:iload_1         
	//   49  101:aload_2         
	//   50  102:invokevirtual   #905 <Method Object ArrayList.set(int, Object)>
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
	//   57  115:getfield        #901 <Field ArrayList mBackStackIndices>
	//   58  118:aconst_null     
	//   59  119:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
	//   60  122:pop             
		if(mAvailBackStackIndices == null)
	//*  61  123:aload_0         
	//*  62  124:getfield        #887 <Field ArrayList mAvailBackStackIndices>
	//*  63  127:ifnonnull       141
			mAvailBackStackIndices = new ArrayList();
	//   64  130:aload_0         
	//   65  131:new             #163 <Class ArrayList>
	//   66  134:dup             
	//   67  135:invokespecial   #164 <Method void ArrayList()>
	//   68  138:putfield        #887 <Field ArrayList mAvailBackStackIndices>
		if(DEBUG)
	//*  69  141:getstatic       #843 <Field boolean DEBUG>
	//*  70  144:ifeq            183
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   71  147:new             #347 <Class StringBuilder>
	//   72  150:dup             
	//   73  151:invokespecial   #348 <Method void StringBuilder()>
	//   74  154:astore          5
			stringbuilder1.append("Adding available back stack index ");
	//   75  156:aload           5
	//   76  158:ldc2            #1883 <String "Adding available back stack index ">
	//   77  161:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   78  164:pop             
			stringbuilder1.append(j);
	//   79  165:aload           5
	//   80  167:iload_3         
	//   81  168:invokevirtual   #897 <Method StringBuilder StringBuilder.append(int)>
	//   82  171:pop             
			Log.v("FragmentManager", stringbuilder1.toString());
	//   83  172:ldc1            #72  <String "FragmentManager">
	//   84  174:aload           5
	//   85  176:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   86  179:invokestatic    #851 <Method int Log.v(String, String)>
	//   87  182:pop             
		}
		mAvailBackStackIndices.add(((Object) (Integer.valueOf(j))));
	//   88  183:aload_0         
	//   89  184:getfield        #887 <Field ArrayList mAvailBackStackIndices>
	//   90  187:iload_3         
	//   91  188:invokestatic    #1261 <Method Integer Integer.valueOf(int)>
	//   92  191:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
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
	//*  99  202:getstatic       #843 <Field boolean DEBUG>
	//* 100  205:ifeq            260
		{
			StringBuilder stringbuilder2 = new StringBuilder();
	//  101  208:new             #347 <Class StringBuilder>
	//  102  211:dup             
	//  103  212:invokespecial   #348 <Method void StringBuilder()>
	//  104  215:astore          5
			stringbuilder2.append("Adding back stack index ");
	//  105  217:aload           5
	//  106  219:ldc2            #894 <String "Adding back stack index ">
	//  107  222:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  108  225:pop             
			stringbuilder2.append(i);
	//  109  226:aload           5
	//  110  228:iload_1         
	//  111  229:invokevirtual   #897 <Method StringBuilder StringBuilder.append(int)>
	//  112  232:pop             
			stringbuilder2.append(" with ");
	//  113  233:aload           5
	//  114  235:ldc2            #899 <String " with ">
	//  115  238:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  116  241:pop             
			stringbuilder2.append(((Object) (backstackrecord)));
	//  117  242:aload           5
	//  118  244:aload_2         
	//  119  245:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//  120  248:pop             
			Log.v("FragmentManager", stringbuilder2.toString());
	//  121  249:ldc1            #72  <String "FragmentManager">
	//  122  251:aload           5
	//  123  253:invokevirtual   #358 <Method String StringBuilder.toString()>
	//  124  256:invokestatic    #851 <Method int Log.v(String, String)>
	//  125  259:pop             
		}
		mBackStackIndices.add(((Object) (backstackrecord)));
	//  126  260:aload_0         
	//  127  261:getfield        #901 <Field ArrayList mBackStackIndices>
	//  128  264:aload_2         
	//  129  265:invokevirtual   #380 <Method boolean ArrayList.add(Object)>
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
	//*   1    1:ifnull          82
	//*   2    4:aload_0         
	//*   3    5:getfield        #318 <Field SparseArray mActive>
	//*   4    8:aload_1         
	//*   5    9:getfield        #1357 <Field int Fragment.mIndex>
	//*   6   12:invokevirtual   #1278 <Method Object SparseArray.get(int)>
	//*   7   15:aload_1         
	//*   8   16:if_acmpne       34
	//*   9   19:aload_1         
	//*  10   20:getfield        #1442 <Field FragmentHostCallback Fragment.mHost>
	//*  11   23:ifnull          82
	//*  12   26:aload_1         
	//*  13   27:invokevirtual   #996 <Method FragmentManager Fragment.getFragmentManager()>
	//*  14   30:aload_0         
	//*  15   31:if_acmpeq       82
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   16   34:new             #347 <Class StringBuilder>
	//   17   37:dup             
	//   18   38:invokespecial   #348 <Method void StringBuilder()>
	//   19   41:astore_2        
			stringbuilder.append("Fragment ");
	//   20   42:aload_2         
	//   21   43:ldc2            #1458 <String "Fragment ">
	//   22   46:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   23   49:pop             
			stringbuilder.append(((Object) (fragment)));
	//   24   50:aload_2         
	//   25   51:aload_1         
	//   26   52:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//   27   55:pop             
			stringbuilder.append(" is not an active fragment of FragmentManager ");
	//   28   56:aload_2         
	//   29   57:ldc2            #1886 <String " is not an active fragment of FragmentManager ">
	//   30   60:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   31   63:pop             
			stringbuilder.append(((Object) (this)));
	//   32   64:aload_2         
	//   33   65:aload_0         
	//   34   66:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//   35   69:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   36   70:new             #1498 <Class IllegalArgumentException>
	//   37   73:dup             
	//   38   74:aload_2         
	//   39   75:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   40   78:invokespecial   #1499 <Method void IllegalArgumentException(String)>
	//   41   81:athrow          
		} else
		{
			mPrimaryNav = fragment;
	//   42   82:aload_0         
	//   43   83:aload_1         
	//   44   84:putfield        #700 <Field Fragment mPrimaryNav>
			return;
	//   45   87:return          
		}
	}

	public void showFragment(Fragment fragment)
	{
		if(DEBUG)
	//*   0    0:getstatic       #843 <Field boolean DEBUG>
	//*   1    3:ifeq            38
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #347 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #348 <Method void StringBuilder()>
	//    5   13:astore_2        
			stringbuilder.append("show: ");
	//    6   14:aload_2         
	//    7   15:ldc2            #1889 <String "show: ">
	//    8   18:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (fragment)));
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #848 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   14   28:ldc1            #72  <String "FragmentManager">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #851 <Method int Log.v(String, String)>
	//   18   37:pop             
		}
		if(fragment.mHidden)
	//*  19   38:aload_1         
	//*  20   39:getfield        #230 <Field boolean Fragment.mHidden>
	//*  21   42:ifeq            60
		{
			fragment.mHidden = false;
	//   22   45:aload_1         
	//   23   46:iconst_0        
	//   24   47:putfield        #230 <Field boolean Fragment.mHidden>
			fragment.mHiddenChanged = fragment.mHiddenChanged ^ true;
	//   25   50:aload_1         
	//   26   51:aload_1         
	//   27   52:getfield        #869 <Field boolean Fragment.mHiddenChanged>
	//   28   55:iconst_1        
	//   29   56:ixor            
	//   30   57:putfield        #869 <Field boolean Fragment.mHiddenChanged>
		}
	//   31   60:return          
	}

	void startPendingDeferredFragments()
	{
		if(mActive == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #318 <Field SparseArray mActive>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		for(int i = 0; i < mActive.size(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:getfield        #318 <Field SparseArray mActive>
	//*   9   15:invokevirtual   #321 <Method int SparseArray.size()>
	//*  10   18:icmpge          49
		{
			Fragment fragment = (Fragment)mActive.valueAt(i);
	//   11   21:aload_0         
	//   12   22:getfield        #318 <Field SparseArray mActive>
	//   13   25:iload_1         
	//   14   26:invokevirtual   #324 <Method Object SparseArray.valueAt(int)>
	//   15   29:checkcast       #210 <Class Fragment>
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
	//    0    0:new             #347 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          128
	//    3    7:invokespecial   #1892 <Method void StringBuilder(int)>
	//    4   10:astore_1        
		stringbuilder.append("FragmentManager{");
	//    5   11:aload_1         
	//    6   12:ldc2            #1894 <String "FragmentManager{">
	//    7   15:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:invokestatic    #1137 <Method int System.identityHashCode(Object)>
	//   12   24:invokestatic    #1141 <Method String Integer.toHexString(int)>
	//   13   27:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
		stringbuilder.append(" in ");
	//   15   31:aload_1         
	//   16   32:ldc2            #1896 <String " in ">
	//   17   35:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
		if(mParent != null)
	//*  19   39:aload_0         
	//*  20   40:getfield        #917 <Field Fragment mParent>
	//*  21   43:ifnull          57
			DebugUtils.buildShortClassTag(((Object) (mParent)), stringbuilder);
	//   22   46:aload_0         
	//   23   47:getfield        #917 <Field Fragment mParent>
	//   24   50:aload_1         
	//   25   51:invokestatic    #1902 <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
		else
	//*  26   54:goto            65
			DebugUtils.buildShortClassTag(((Object) (mHost)), stringbuilder);
	//   27   57:aload_0         
	//   28   58:getfield        #444 <Field FragmentHostCallback mHost>
	//   29   61:aload_1         
	//   30   62:invokestatic    #1902 <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
		stringbuilder.append("}}");
	//   31   65:aload_1         
	//   32   66:ldc2            #1904 <String "}}">
	//   33   69:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   34   72:pop             
		return stringbuilder.toString();
	//   35   73:aload_1         
	//   36   74:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   37   77:areturn         
	}

	public void unregisterFragmentLifecycleCallbacks(FragmentManager.FragmentLifecycleCallbacks fragmentlifecyclecallbacks)
	{
		CopyOnWriteArrayList copyonwritearraylist = mLifecycleCallbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field CopyOnWriteArrayList mLifecycleCallbacks>
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
	//    8   12:getfield        #171 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//    9   15:invokevirtual   #1907 <Method int CopyOnWriteArrayList.size()>
	//   10   18:istore_3        
_L2:
		if(i >= j)
			break MISSING_BLOCK_LABEL_54;
	//   11   19:iload_2         
	//   12   20:iload_3         
	//   13   21:icmpge          54
		if(((Pair)mLifecycleCallbacks.get(i)).first != fragmentlifecyclecallbacks)
			break MISSING_BLOCK_LABEL_64;
	//   14   24:aload_0         
	//   15   25:getfield        #171 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   16   28:iload_2         
	//   17   29:invokevirtual   #1908 <Method Object CopyOnWriteArrayList.get(int)>
	//   18   32:checkcast       #1001 <Class Pair>
	//   19   35:getfield        #1008 <Field Object Pair.first>
	//   20   38:aload_1         
	//   21   39:if_acmpne       64
		mLifecycleCallbacks.remove(i);
	//   22   42:aload_0         
	//   23   43:getfield        #171 <Field CopyOnWriteArrayList mLifecycleCallbacks>
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
	//    0    0:new             #139 <Class DecelerateInterpolator>
	//    1    3:dup             
	//    2    4:ldc1            #140 <Float 2.5F>
	//    3    6:invokespecial   #144 <Method void DecelerateInterpolator(float)>
	//    4    9:putstatic       #146 <Field Interpolator DECELERATE_QUINT>
	//    5   12:new             #139 <Class DecelerateInterpolator>
	//    6   15:dup             
	//    7   16:ldc1            #147 <Float 1.5F>
	//    8   18:invokespecial   #144 <Method void DecelerateInterpolator(float)>
	//    9   21:putstatic       #149 <Field Interpolator DECELERATE_CUBIC>
	//   10   24:new             #151 <Class AccelerateInterpolator>
	//   11   27:dup             
	//   12   28:ldc1            #140 <Float 2.5F>
	//   13   30:invokespecial   #152 <Method void AccelerateInterpolator(float)>
	//   14   33:putstatic       #154 <Field Interpolator ACCELERATE_QUINT>
	//   15   36:new             #151 <Class AccelerateInterpolator>
	//   16   39:dup             
	//   17   40:ldc1            #147 <Float 1.5F>
	//   18   42:invokespecial   #152 <Method void AccelerateInterpolator(float)>
	//   19   45:putstatic       #156 <Field Interpolator ACCELERATE_CUBIC>
	//*  20   48:return          
	}


/*
	static void access$500(FragmentManagerImpl fragmentmanagerimpl)
	{
		fragmentmanagerimpl.scheduleCommit();
	//    0    0:aload_0         
	//    1    1:invokespecial   #186 <Method void scheduleCommit()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$600(FragmentManagerImpl fragmentmanagerimpl, BackStackRecord backstackrecord, boolean flag, boolean flag1, boolean flag2)
	{
		fragmentmanagerimpl.completeExecute(backstackrecord, flag, flag1, flag2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #192 <Method void completeExecute(BackStackRecord, boolean, boolean, boolean)>
		return;
	//    6    9:return          
	}

*/
}
