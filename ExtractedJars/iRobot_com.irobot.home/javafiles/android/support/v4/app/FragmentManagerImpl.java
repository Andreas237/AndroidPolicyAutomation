// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.animation.*;
import android.content.Context;
import android.content.res.*;
import android.os.*;
import android.support.v4.f.*;
import android.support.v4.view.s;
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
//			FragmentHostCallback, FragmentManagerNonConfig, LoaderManagerImpl, SuperNotCalledException, 
//			FragmentContainer, FragmentManagerState, FragmentState, BackStackState, 
//			FragmentTransaction

final class FragmentManagerImpl extends FragmentManager
	implements android.view.LayoutInflater.Factory2
{
	private static class AnimateOnHWLayerIfNeededListener extends AnimationListenerWrapper
	{

		public void onAnimationEnd(Animation animation)
		{
			if(!s.A(mView) && android.os.Build.VERSION.SDK_INT < 24)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field View mView>
		//*   2    4:invokestatic    #27  <Method boolean s.A(View)>
		//*   3    7:ifne            33
		//*   4   10:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
		//*   5   13:bipush          24
		//*   6   15:icmplt          21
		//*   7   18:goto            33
				mView.setLayerType(0, ((android.graphics.Paint) (null)));
		//    8   21:aload_0         
		//    9   22:getfield        #18  <Field View mView>
		//   10   25:iconst_0        
		//   11   26:aconst_null     
		//   12   27:invokevirtual   #39  <Method void View.setLayerType(int, android.graphics.Paint)>
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
		//   19   42:invokespecial   #42  <Method void FragmentManagerImpl$AnimateOnHWLayerIfNeededListener$1(FragmentManagerImpl$AnimateOnHWLayerIfNeededListener)>
		//   20   45:invokevirtual   #46  <Method boolean View.post(Runnable)>
		//   21   48:pop             
			super.onAnimationEnd(animation);
		//   22   49:aload_0         
		//   23   50:aload_1         
		//   24   51:invokespecial   #48  <Method void FragmentManagerImpl$AnimationListenerWrapper.onAnimationEnd(Animation)>
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
		//    6   12:invokeinterface #26  <Method void android.view.animation.Animation$AnimationListener.onAnimationEnd(Animation)>
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
		//    6   12:invokeinterface #29  <Method void android.view.animation.Animation$AnimationListener.onAnimationRepeat(Animation)>
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
		//    6   12:invokeinterface #32  <Method void android.view.animation.Animation$AnimationListener.onAnimationStart(Animation)>
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

		PopBackStackState(String s1, int i, int k)
		{
			this$0 = FragmentManagerImpl.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #20  <Field FragmentManagerImpl this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #23  <Method void Object()>
			mName = s1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field String mName>
			mId = i;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #27  <Field int mId>
			mFlags = k;
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
			int k = 0;
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
			for(int l = fragmentmanagerimpl.mAdded.size(); k < l; k++)
		//*  16   27:aload           4
		//*  17   29:getfield        #47  <Field ArrayList FragmentManagerImpl.mAdded>
		//*  18   32:invokevirtual   #53  <Method int ArrayList.size()>
		//*  19   35:istore_3        
		//*  20   36:iload_2         
		//*  21   37:iload_3         
		//*  22   38:icmpge          85
			{
				Fragment fragment = (Fragment)fragmentmanagerimpl.mAdded.get(k);
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
	//    1    1:invokespecial   #153 <Method void FragmentManager()>
		mNextFragmentIndex = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #155 <Field int mNextFragmentIndex>
	//    5    9:aload_0         
	//    6   10:new             #157 <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #158 <Method void ArrayList()>
	//    9   17:putfield        #160 <Field ArrayList mAdded>
	//   10   20:aload_0         
	//   11   21:new             #162 <Class CopyOnWriteArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #163 <Method void CopyOnWriteArrayList()>
	//   14   28:putfield        #165 <Field CopyOnWriteArrayList mLifecycleCallbacks>
		mCurState = 0;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #167 <Field int mCurState>
		mStateBundle = null;
	//   18   36:aload_0         
	//   19   37:aconst_null     
	//   20   38:putfield        #169 <Field Bundle mStateBundle>
		mStateArray = null;
	//   21   41:aload_0         
	//   22   42:aconst_null     
	//   23   43:putfield        #171 <Field SparseArray mStateArray>
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
	//   28   52:invokespecial   #174 <Method void FragmentManagerImpl$1(FragmentManagerImpl)>
	//   29   55:putfield        #176 <Field Runnable mExecCommit>
	//   30   58:return          
	}

	private void addAddedFragments(b b1)
	{
		if(mCurState < 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field int mCurState>
	//*   2    4:iconst_1        
	//*   3    5:icmpge          9
			return;
	//    4    8:return          
		int k = Math.min(mCurState, 4);
	//    5    9:aload_0         
	//    6   10:getfield        #167 <Field int mCurState>
	//    7   13:iconst_4        
	//    8   14:invokestatic    #194 <Method int Math.min(int, int)>
	//    9   17:istore_3        
		int l = mAdded.size();
	//   10   18:aload_0         
	//   11   19:getfield        #160 <Field ArrayList mAdded>
	//   12   22:invokevirtual   #198 <Method int ArrayList.size()>
	//   13   25:istore          4
		for(int i = 0; i < l; i++)
	//*  14   27:iconst_0        
	//*  15   28:istore_2        
	//*  16   29:iload_2         
	//*  17   30:iload           4
	//*  18   32:icmpge          113
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//   19   35:aload_0         
	//   20   36:getfield        #160 <Field ArrayList mAdded>
	//   21   39:iload_2         
	//   22   40:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   23   43:checkcast       #204 <Class Fragment>
	//   24   46:astore          5
			if(fragment.mState >= k)
				continue;
	//   25   48:aload           5
	//   26   50:getfield        #207 <Field int Fragment.mState>
	//   27   53:iload_3         
	//   28   54:icmpge          106
			moveToState(fragment, k, fragment.getNextAnim(), fragment.getNextTransition(), false);
	//   29   57:aload_0         
	//   30   58:aload           5
	//   31   60:iload_3         
	//   32   61:aload           5
	//   33   63:invokevirtual   #210 <Method int Fragment.getNextAnim()>
	//   34   66:aload           5
	//   35   68:invokevirtual   #213 <Method int Fragment.getNextTransition()>
	//   36   71:iconst_0        
	//   37   72:invokevirtual   #217 <Method void moveToState(Fragment, int, int, int, boolean)>
			if(fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded)
	//*  38   75:aload           5
	//*  39   77:getfield        #221 <Field View Fragment.mView>
	//*  40   80:ifnull          106
	//*  41   83:aload           5
	//*  42   85:getfield        #224 <Field boolean Fragment.mHidden>
	//*  43   88:ifne            106
	//*  44   91:aload           5
	//*  45   93:getfield        #227 <Field boolean Fragment.mIsNewlyAdded>
	//*  46   96:ifeq            106
				b1.add(((Object) (fragment)));
	//   47   99:aload_1         
	//   48  100:aload           5
	//   49  102:invokevirtual   #233 <Method boolean b.add(Object)>
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
	//    1    1:getfield        #221 <Field View Fragment.mView>
	//    2    4:astore          4
		fragment.setStateAfterAnimating(i);
	//    3    6:aload_1         
	//    4    7:iload_3         
	//    5    8:invokevirtual   #241 <Method void Fragment.setStateAfterAnimating(int)>
		if(animationoranimator.animation != null)
	//*   6   11:aload_2         
	//*   7   12:getfield        #245 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//*   8   15:ifnull          67
		{
			Animation animation = animationoranimator.animation;
	//    9   18:aload_2         
	//   10   19:getfield        #245 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   11   22:astore          5
			fragment.setAnimatingAway(fragment.mView);
	//   12   24:aload_1         
	//   13   25:aload_1         
	//   14   26:getfield        #221 <Field View Fragment.mView>
	//   15   29:invokevirtual   #249 <Method void Fragment.setAnimatingAway(View)>
			animation.setAnimationListener(((android.view.animation.Animation.AnimationListener) (new AnimationListenerWrapper(fragment) {

				public void onAnimationEnd(Animation animation1)
				{
					super.onAnimationEnd(animation1);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:invokespecial   #27  <Method void FragmentManagerImpl$AnimationListenerWrapper.onAnimationEnd(Animation)>
					if(fragment.getAnimatingAway() != null)
				//*   3    5:aload_0         
				//*   4    6:getfield        #19  <Field Fragment val$fragment>
				//*   5    9:invokevirtual   #33  <Method View Fragment.getAnimatingAway()>
				//*   6   12:ifnull          44
					{
						fragment.setAnimatingAway(((View) (null)));
				//    7   15:aload_0         
				//    8   16:getfield        #19  <Field Fragment val$fragment>
				//    9   19:aconst_null     
				//   10   20:invokevirtual   #37  <Method void Fragment.setAnimatingAway(View)>
						moveToState(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
				//   11   23:aload_0         
				//   12   24:getfield        #17  <Field FragmentManagerImpl this$0>
				//   13   27:aload_0         
				//   14   28:getfield        #19  <Field Fragment val$fragment>
				//   15   31:aload_0         
				//   16   32:getfield        #19  <Field Fragment val$fragment>
				//   17   35:invokevirtual   #41  <Method int Fragment.getStateAfterAnimating()>
				//   18   38:iconst_0        
				//   19   39:iconst_0        
				//   20   40:iconst_0        
				//   21   41:invokevirtual   #45  <Method void FragmentManagerImpl.moveToState(Fragment, int, int, int, boolean)>
					}
				//   22   44:return          
				}

				final FragmentManagerImpl this$0;
				final Fragment val$fragment;

			
			{
				this$0 = FragmentManagerImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field FragmentManagerImpl this$0>
				fragment = fragment1;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #19  <Field Fragment val$fragment>
				super(final_animationlistener);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:aconst_null     
			//    9   13:invokespecial   #22  <Method void FragmentManagerImpl$AnimationListenerWrapper(android.view.animation.Animation$AnimationListener, FragmentManagerImpl$1)>
			//   10   16:return          
			}
			}
)));
	//   16   32:aload           5
	//   17   34:new             #10  <Class FragmentManagerImpl$2>
	//   18   37:dup             
	//   19   38:aload_0         
	//   20   39:aload           5
	//   21   41:invokestatic    #253 <Method android.view.animation.Animation$AnimationListener getAnimationListener(Animation)>
	//   22   44:aload_1         
	//   23   45:invokespecial   #256 <Method void FragmentManagerImpl$2(FragmentManagerImpl, android.view.animation.Animation$AnimationListener, Fragment)>
	//   24   48:invokevirtual   #262 <Method void Animation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
			setHWLayerAnimListenerIfAlpha(viewToAnimate, animationoranimator);
	//   25   51:aload           4
	//   26   53:aload_2         
	//   27   54:invokestatic    #266 <Method void setHWLayerAnimListenerIfAlpha(View, FragmentManagerImpl$AnimationOrAnimator)>
			fragment.mView.startAnimation(animation);
	//   28   57:aload_1         
	//   29   58:getfield        #221 <Field View Fragment.mView>
	//   30   61:aload           5
	//   31   63:invokevirtual   #272 <Method void View.startAnimation(Animation)>
			return;
	//   32   66:return          
		}
		Animator animator = animationoranimator.animator;
	//   33   67:aload_2         
	//   34   68:getfield        #276 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   35   71:astore          5
		fragment.setAnimator(animationoranimator.animator);
	//   36   73:aload_1         
	//   37   74:aload_2         
	//   38   75:getfield        #276 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   39   78:invokevirtual   #280 <Method void Fragment.setAnimator(Animator)>
		final ViewGroup container = fragment.mContainer;
	//   40   81:aload_1         
	//   41   82:getfield        #283 <Field ViewGroup Fragment.mContainer>
	//   42   85:astore          6
		if(container != null)
	//*  43   87:aload           6
	//*  44   89:ifnull          99
			container.startViewTransition(viewToAnimate);
	//   45   92:aload           6
	//   46   94:aload           4
	//   47   96:invokevirtual   #288 <Method void ViewGroup.startViewTransition(View)>
		animator.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

			public void onAnimationEnd(Animator animator1)
			{
				if(container != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #23  <Field ViewGroup val$container>
			//*   2    4:ifnull          18
					container.endViewTransition(viewToAnimate);
			//    3    7:aload_0         
			//    4    8:getfield        #23  <Field ViewGroup val$container>
			//    5   11:aload_0         
			//    6   12:getfield        #25  <Field View val$viewToAnimate>
			//    7   15:invokevirtual   #39  <Method void ViewGroup.endViewTransition(View)>
				if(fragment.getAnimator() != null)
			//*   8   18:aload_0         
			//*   9   19:getfield        #27  <Field Fragment val$fragment>
			//*  10   22:invokevirtual   #45  <Method Animator Fragment.getAnimator()>
			//*  11   25:ifnull          57
				{
					fragment.setAnimator(((Animator) (null)));
			//   12   28:aload_0         
			//   13   29:getfield        #27  <Field Fragment val$fragment>
			//   14   32:aconst_null     
			//   15   33:invokevirtual   #48  <Method void Fragment.setAnimator(Animator)>
					moveToState(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
			//   16   36:aload_0         
			//   17   37:getfield        #21  <Field FragmentManagerImpl this$0>
			//   18   40:aload_0         
			//   19   41:getfield        #27  <Field Fragment val$fragment>
			//   20   44:aload_0         
			//   21   45:getfield        #27  <Field Fragment val$fragment>
			//   22   48:invokevirtual   #52  <Method int Fragment.getStateAfterAnimating()>
			//   23   51:iconst_0        
			//   24   52:iconst_0        
			//   25   53:iconst_0        
			//   26   54:invokevirtual   #56  <Method void FragmentManagerImpl.moveToState(Fragment, int, int, int, boolean)>
				}
			//   27   57:return          
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
	//   48   99:aload           5
	//   49  101:new             #12  <Class FragmentManagerImpl$3>
	//   50  104:dup             
	//   51  105:aload_0         
	//   52  106:aload           6
	//   53  108:aload           4
	//   54  110:aload_1         
	//   55  111:invokespecial   #291 <Method void FragmentManagerImpl$3(FragmentManagerImpl, ViewGroup, View, Fragment)>
	//   56  114:invokevirtual   #297 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
		animator.setTarget(((Object) (fragment.mView)));
	//   57  117:aload           5
	//   58  119:aload_1         
	//   59  120:getfield        #221 <Field View Fragment.mView>
	//   60  123:invokevirtual   #301 <Method void Animator.setTarget(Object)>
		setHWLayerAnimListenerIfAlpha(fragment.mView, animationoranimator);
	//   61  126:aload_1         
	//   62  127:getfield        #221 <Field View Fragment.mView>
	//   63  130:aload_2         
	//   64  131:invokestatic    #266 <Method void setHWLayerAnimListenerIfAlpha(View, FragmentManagerImpl$AnimationOrAnimator)>
		animator.start();
	//   65  134:aload           5
	//   66  136:invokevirtual   #304 <Method void Animator.start()>
	//   67  139:return          
	}

	private void burpActive()
	{
		if(mActive != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #307 <Field SparseArray mActive>
	//*   2    4:ifnull          54
		{
			for(int i = mActive.size() - 1; i >= 0; i--)
	//*   3    7:aload_0         
	//*   4    8:getfield        #307 <Field SparseArray mActive>
	//*   5   11:invokevirtual   #310 <Method int SparseArray.size()>
	//*   6   14:iconst_1        
	//*   7   15:isub            
	//*   8   16:istore_1        
	//*   9   17:iload_1         
	//*  10   18:iflt            54
				if(mActive.valueAt(i) == null)
	//*  11   21:aload_0         
	//*  12   22:getfield        #307 <Field SparseArray mActive>
	//*  13   25:iload_1         
	//*  14   26:invokevirtual   #313 <Method Object SparseArray.valueAt(int)>
	//*  15   29:ifnonnull       47
					mActive.delete(mActive.keyAt(i));
	//   16   32:aload_0         
	//   17   33:getfield        #307 <Field SparseArray mActive>
	//   18   36:aload_0         
	//   19   37:getfield        #307 <Field SparseArray mActive>
	//   20   40:iload_1         
	//   21   41:invokevirtual   #317 <Method int SparseArray.keyAt(int)>
	//   22   44:invokevirtual   #320 <Method void SparseArray.delete(int)>

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
		if(mStateSaved)
	//*   0    0:aload_0         
	//*   1    1:getfield        #323 <Field boolean mStateSaved>
	//*   2    4:ifeq            18
			throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
	//    3    7:new             #325 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #327 <String "Can not perform this action after onSaveInstanceState">
	//    6   14:invokespecial   #330 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		if(mNoTransactionsBecause != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #332 <Field String mNoTransactionsBecause>
	//*  10   22:ifnull          62
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   25:new             #334 <Class StringBuilder>
	//   12   28:dup             
	//   13   29:invokespecial   #335 <Method void StringBuilder()>
	//   14   32:astore_1        
			stringbuilder.append("Can not perform this action inside of ");
	//   15   33:aload_1         
	//   16   34:ldc2            #337 <String "Can not perform this action inside of ">
	//   17   37:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   18   40:pop             
			stringbuilder.append(mNoTransactionsBecause);
	//   19   41:aload_1         
	//   20   42:aload_0         
	//   21   43:getfield        #332 <Field String mNoTransactionsBecause>
	//   22   46:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   23   49:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   24   50:new             #325 <Class IllegalStateException>
	//   25   53:dup             
	//   26   54:aload_1         
	//   27   55:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   28   58:invokespecial   #330 <Method void IllegalStateException(String)>
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
	//    2    2:putfield        #348 <Field boolean mExecutingActions>
		mTmpIsPop.clear();
	//    3    5:aload_0         
	//    4    6:getfield        #350 <Field ArrayList mTmpIsPop>
	//    5    9:invokevirtual   #353 <Method void ArrayList.clear()>
		mTmpRecords.clear();
	//    6   12:aload_0         
	//    7   13:getfield        #355 <Field ArrayList mTmpRecords>
	//    8   16:invokevirtual   #353 <Method void ArrayList.clear()>
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
	//    4    7:invokevirtual   #361 <Method void BackStackRecord.executePopOps(boolean)>
		else
	//*   5   10:goto            17
			backstackrecord.executeOps();
	//    6   13:aload_1         
	//    7   14:invokevirtual   #364 <Method void BackStackRecord.executeOps()>
		ArrayList arraylist = new ArrayList(1);
	//    8   17:new             #157 <Class ArrayList>
	//    9   20:dup             
	//   10   21:iconst_1        
	//   11   22:invokespecial   #366 <Method void ArrayList(int)>
	//   12   25:astore          7
		ArrayList arraylist1 = new ArrayList(1);
	//   13   27:new             #157 <Class ArrayList>
	//   14   30:dup             
	//   15   31:iconst_1        
	//   16   32:invokespecial   #366 <Method void ArrayList(int)>
	//   17   35:astore          8
		arraylist.add(((Object) (backstackrecord)));
	//   18   37:aload           7
	//   19   39:aload_1         
	//   20   40:invokevirtual   #367 <Method boolean ArrayList.add(Object)>
	//   21   43:pop             
		arraylist1.add(((Object) (Boolean.valueOf(flag))));
	//   22   44:aload           8
	//   23   46:iload_2         
	//   24   47:invokestatic    #373 <Method Boolean Boolean.valueOf(boolean)>
	//   25   50:invokevirtual   #367 <Method boolean ArrayList.add(Object)>
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
	//   35   66:invokestatic    #379 <Method void FragmentTransition.startTransitions(FragmentManagerImpl, ArrayList, ArrayList, int, int, boolean)>
		if(flag2)
	//*  36   69:iload           4
	//*  37   71:ifeq            83
			moveToState(mCurState, true);
	//   38   74:aload_0         
	//   39   75:aload_0         
	//   40   76:getfield        #167 <Field int mCurState>
	//   41   79:iconst_1        
	//   42   80:invokevirtual   #382 <Method void moveToState(int, boolean)>
		if(mActive != null)
	//*  43   83:aload_0         
	//*  44   84:getfield        #307 <Field SparseArray mActive>
	//*  45   87:ifnull          216
		{
			int k = mActive.size();
	//   46   90:aload_0         
	//   47   91:getfield        #307 <Field SparseArray mActive>
	//   48   94:invokevirtual   #310 <Method int SparseArray.size()>
	//   49   97:istore          6
			for(int i = 0; i < k; i++)
	//*  50   99:iconst_0        
	//*  51  100:istore          5
	//*  52  102:iload           5
	//*  53  104:iload           6
	//*  54  106:icmpge          216
			{
				Fragment fragment = (Fragment)mActive.valueAt(i);
	//   55  109:aload_0         
	//   56  110:getfield        #307 <Field SparseArray mActive>
	//   57  113:iload           5
	//   58  115:invokevirtual   #313 <Method Object SparseArray.valueAt(int)>
	//   59  118:checkcast       #204 <Class Fragment>
	//   60  121:astore          7
				if(fragment == null || fragment.mView == null || !fragment.mIsNewlyAdded || !backstackrecord.interactsWith(fragment.mContainerId))
					continue;
	//   61  123:aload           7
	//   62  125:ifnull          207
	//   63  128:aload           7
	//   64  130:getfield        #221 <Field View Fragment.mView>
	//   65  133:ifnull          207
	//   66  136:aload           7
	//   67  138:getfield        #227 <Field boolean Fragment.mIsNewlyAdded>
	//   68  141:ifeq            207
	//   69  144:aload_1         
	//   70  145:aload           7
	//   71  147:getfield        #385 <Field int Fragment.mContainerId>
	//   72  150:invokevirtual   #389 <Method boolean BackStackRecord.interactsWith(int)>
	//   73  153:ifeq            207
				if(fragment.mPostponedAlpha > 0.0F)
	//*  74  156:aload           7
	//*  75  158:getfield        #393 <Field float Fragment.mPostponedAlpha>
	//*  76  161:fconst_0        
	//*  77  162:fcmpl           
	//*  78  163:ifle            179
					fragment.mView.setAlpha(fragment.mPostponedAlpha);
	//   79  166:aload           7
	//   80  168:getfield        #221 <Field View Fragment.mView>
	//   81  171:aload           7
	//   82  173:getfield        #393 <Field float Fragment.mPostponedAlpha>
	//   83  176:invokevirtual   #396 <Method void View.setAlpha(float)>
				if(flag2)
	//*  84  179:iload           4
	//*  85  181:ifeq            193
				{
					fragment.mPostponedAlpha = 0.0F;
	//   86  184:aload           7
	//   87  186:fconst_0        
	//   88  187:putfield        #393 <Field float Fragment.mPostponedAlpha>
				} else
	//*  89  190:goto            207
				{
					fragment.mPostponedAlpha = -1F;
	//   90  193:aload           7
	//   91  195:ldc2            #397 <Float -1F>
	//   92  198:putfield        #393 <Field float Fragment.mPostponedAlpha>
					fragment.mIsNewlyAdded = false;
	//   93  201:aload           7
	//   94  203:iconst_0        
	//   95  204:putfield        #227 <Field boolean Fragment.mIsNewlyAdded>
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
	//    2    2:putfield        #348 <Field boolean mExecutingActions>
		moveToState(i, false);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #382 <Method void moveToState(int, boolean)>
		mExecutingActions = false;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #348 <Field boolean mExecutingActions>
		execPendingActions();
	//   10   16:aload_0         
	//   11   17:invokevirtual   #402 <Method boolean execPendingActions()>
	//   12   20:pop             
		return;
	//   13   21:return          
		Exception exception;
		exception;
	//   14   22:astore_2        
		mExecutingActions = false;
	//   15   23:aload_0         
	//   16   24:iconst_0        
	//   17   25:putfield        #348 <Field boolean mExecutingActions>
		throw exception;
	//   18   28:aload_2         
	//   19   29:athrow          
	}

	private void endAnimatingAwayFragments()
	{
		SparseArray sparsearray = mActive;
	//    0    0:aload_0         
	//    1    1:getfield        #307 <Field SparseArray mActive>
	//    2    4:astore          4
		int k = 0;
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
	//   11   19:getfield        #307 <Field SparseArray mActive>
	//   12   22:invokevirtual   #310 <Method int SparseArray.size()>
	//   13   25:istore_1        
		for(; k < i; k++)
	//*  14   26:iload_2         
	//*  15   27:iload_1         
	//*  16   28:icmpge          134
		{
			Fragment fragment = (Fragment)mActive.valueAt(k);
	//   17   31:aload_0         
	//   18   32:getfield        #307 <Field SparseArray mActive>
	//   19   35:iload_2         
	//   20   36:invokevirtual   #313 <Method Object SparseArray.valueAt(int)>
	//   21   39:checkcast       #204 <Class Fragment>
	//   22   42:astore          4
			if(fragment == null)
				continue;
	//   23   44:aload           4
	//   24   46:ifnull          127
			if(fragment.getAnimatingAway() != null)
	//*  25   49:aload           4
	//*  26   51:invokevirtual   #407 <Method View Fragment.getAnimatingAway()>
	//*  27   54:ifnull          111
			{
				int l = fragment.getStateAfterAnimating();
	//   28   57:aload           4
	//   29   59:invokevirtual   #410 <Method int Fragment.getStateAfterAnimating()>
	//   30   62:istore_3        
				View view = fragment.getAnimatingAway();
	//   31   63:aload           4
	//   32   65:invokevirtual   #407 <Method View Fragment.getAnimatingAway()>
	//   33   68:astore          5
				fragment.setAnimatingAway(((View) (null)));
	//   34   70:aload           4
	//   35   72:aconst_null     
	//   36   73:invokevirtual   #249 <Method void Fragment.setAnimatingAway(View)>
				Animation animation = view.getAnimation();
	//   37   76:aload           5
	//   38   78:invokevirtual   #414 <Method Animation View.getAnimation()>
	//   39   81:astore          6
				if(animation != null)
	//*  40   83:aload           6
	//*  41   85:ifnull          98
				{
					animation.cancel();
	//   42   88:aload           6
	//   43   90:invokevirtual   #417 <Method void Animation.cancel()>
					view.clearAnimation();
	//   44   93:aload           5
	//   45   95:invokevirtual   #420 <Method void View.clearAnimation()>
				}
				moveToState(fragment, l, 0, 0, false);
	//   46   98:aload_0         
	//   47   99:aload           4
	//   48  101:iload_3         
	//   49  102:iconst_0        
	//   50  103:iconst_0        
	//   51  104:iconst_0        
	//   52  105:invokevirtual   #217 <Method void moveToState(Fragment, int, int, int, boolean)>
				continue;
	//   53  108:goto            127
			}
			if(fragment.getAnimator() != null)
	//*  54  111:aload           4
	//*  55  113:invokevirtual   #424 <Method Animator Fragment.getAnimator()>
	//*  56  116:ifnull          127
				fragment.getAnimator().end();
	//   57  119:aload           4
	//   58  121:invokevirtual   #424 <Method Animator Fragment.getAnimator()>
	//   59  124:invokevirtual   #427 <Method void Animator.end()>
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
	//*   1    1:getfield        #348 <Field boolean mExecutingActions>
	//*   2    4:ifeq            18
			throw new IllegalStateException("FragmentManager is already executing transactions");
	//    3    7:new             #325 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #430 <String "FragmentManager is already executing transactions">
	//    6   14:invokespecial   #330 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		if(Looper.myLooper() != mHost.getHandler().getLooper())
	//*   8   18:invokestatic    #436 <Method Looper Looper.myLooper()>
	//*   9   21:aload_0         
	//*  10   22:getfield        #438 <Field FragmentHostCallback mHost>
	//*  11   25:invokevirtual   #444 <Method Handler FragmentHostCallback.getHandler()>
	//*  12   28:invokevirtual   #449 <Method Looper Handler.getLooper()>
	//*  13   31:if_acmpeq       45
			throw new IllegalStateException("Must be called from main thread of fragment host");
	//   14   34:new             #325 <Class IllegalStateException>
	//   15   37:dup             
	//   16   38:ldc2            #451 <String "Must be called from main thread of fragment host">
	//   17   41:invokespecial   #330 <Method void IllegalStateException(String)>
	//   18   44:athrow          
		if(!flag)
	//*  19   45:iload_1         
	//*  20   46:ifne            53
			checkStateLoss();
	//   21   49:aload_0         
	//   22   50:invokespecial   #453 <Method void checkStateLoss()>
		if(mTmpRecords == null)
	//*  23   53:aload_0         
	//*  24   54:getfield        #355 <Field ArrayList mTmpRecords>
	//*  25   57:ifnonnull       82
		{
			mTmpRecords = new ArrayList();
	//   26   60:aload_0         
	//   27   61:new             #157 <Class ArrayList>
	//   28   64:dup             
	//   29   65:invokespecial   #158 <Method void ArrayList()>
	//   30   68:putfield        #355 <Field ArrayList mTmpRecords>
			mTmpIsPop = new ArrayList();
	//   31   71:aload_0         
	//   32   72:new             #157 <Class ArrayList>
	//   33   75:dup             
	//   34   76:invokespecial   #158 <Method void ArrayList()>
	//   35   79:putfield        #350 <Field ArrayList mTmpIsPop>
		}
		mExecutingActions = true;
	//   36   82:aload_0         
	//   37   83:iconst_1        
	//   38   84:putfield        #348 <Field boolean mExecutingActions>
		executePostponedTransaction(((ArrayList) (null)), ((ArrayList) (null)));
	//   39   87:aload_0         
	//   40   88:aconst_null     
	//   41   89:aconst_null     
	//   42   90:invokespecial   #457 <Method void executePostponedTransaction(ArrayList, ArrayList)>
		mExecutingActions = false;
	//   43   93:aload_0         
	//   44   94:iconst_0        
	//   45   95:putfield        #348 <Field boolean mExecutingActions>
		return;
	//   46   98:return          
		Exception exception;
		exception;
	//   47   99:astore_2        
		mExecutingActions = false;
	//   48  100:aload_0         
	//   49  101:iconst_0        
	//   50  102:putfield        #348 <Field boolean mExecutingActions>
		throw exception;
	//   51  105:aload_2         
	//   52  106:athrow          
	}

	private static void executeOps(ArrayList arraylist, ArrayList arraylist1, int i, int k)
	{
		for(; i < k; i++)
	//*   0    0:iload_2         
	//*   1    1:iload_3         
	//*   2    2:icmpge          83
		{
			BackStackRecord backstackrecord = (BackStackRecord)arraylist.get(i);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//    6   10:checkcast       #357 <Class BackStackRecord>
	//    7   13:astore          6
			boolean flag1 = ((Boolean)arraylist1.get(i)).booleanValue();
	//    8   15:aload_1         
	//    9   16:iload_2         
	//   10   17:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   11   20:checkcast       #369 <Class Boolean>
	//   12   23:invokevirtual   #461 <Method boolean Boolean.booleanValue()>
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
	//   20   39:invokevirtual   #464 <Method void BackStackRecord.bumpBackStackNesting(int)>
				if(i != k - 1)
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
	//   31   59:invokevirtual   #361 <Method void BackStackRecord.executePopOps(boolean)>
			} else
	//*  32   62:goto            76
			{
				backstackrecord.bumpBackStackNesting(1);
	//   33   65:aload           6
	//   34   67:iconst_1        
	//   35   68:invokevirtual   #464 <Method void BackStackRecord.bumpBackStackNesting(int)>
				backstackrecord.executeOps();
	//   36   71:aload           6
	//   37   73:invokevirtual   #364 <Method void BackStackRecord.executeOps()>
			}
		}

	//   38   76:iload_2         
	//   39   77:iconst_1        
	//   40   78:iadd            
	//   41   79:istore_2        
	//*  42   80:goto            0
	//   43   83:return          
	}

	private void executeOpsTogether(ArrayList arraylist, ArrayList arraylist1, int i, int k)
	{
		int l = i;
	//    0    0:iload_3         
	//    1    1:istore          5
		boolean flag1 = ((BackStackRecord)arraylist.get(l)).mReorderingAllowed;
	//    2    3:aload_1         
	//    3    4:iload           5
	//    4    6:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//    5    9:checkcast       #357 <Class BackStackRecord>
	//    6   12:getfield        #469 <Field boolean BackStackRecord.mReorderingAllowed>
	//    7   15:istore          8
		if(mTmpAddedFragments == null)
	//*   8   17:aload_0         
	//*   9   18:getfield        #471 <Field ArrayList mTmpAddedFragments>
	//*  10   21:ifnonnull       38
			mTmpAddedFragments = new ArrayList();
	//   11   24:aload_0         
	//   12   25:new             #157 <Class ArrayList>
	//   13   28:dup             
	//   14   29:invokespecial   #158 <Method void ArrayList()>
	//   15   32:putfield        #471 <Field ArrayList mTmpAddedFragments>
		else
	//*  16   35:goto            45
			mTmpAddedFragments.clear();
	//   17   38:aload_0         
	//   18   39:getfield        #471 <Field ArrayList mTmpAddedFragments>
	//   19   42:invokevirtual   #353 <Method void ArrayList.clear()>
		mTmpAddedFragments.addAll(((java.util.Collection) (mAdded)));
	//   20   45:aload_0         
	//   21   46:getfield        #471 <Field ArrayList mTmpAddedFragments>
	//   22   49:aload_0         
	//   23   50:getfield        #160 <Field ArrayList mAdded>
	//   24   53:invokevirtual   #475 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   25   56:pop             
		Fragment fragment = getPrimaryNavigationFragment();
	//   26   57:aload_0         
	//   27   58:invokevirtual   #479 <Method Fragment getPrimaryNavigationFragment()>
	//   28   61:astore          9
		int i1 = l;
	//   29   63:iload           5
	//   30   65:istore          7
		boolean flag = false;
	//   31   67:iconst_0        
	//   32   68:istore          6
		for(; i1 < k; i1++)
	//*  33   70:iload           7
	//*  34   72:iload           4
	//*  35   74:icmpge          166
		{
			BackStackRecord backstackrecord1 = (BackStackRecord)arraylist.get(i1);
	//   36   77:aload_1         
	//   37   78:iload           7
	//   38   80:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   39   83:checkcast       #357 <Class BackStackRecord>
	//   40   86:astore          10
			if(!((Boolean)arraylist1.get(i1)).booleanValue())
	//*  41   88:aload_2         
	//*  42   89:iload           7
	//*  43   91:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//*  44   94:checkcast       #369 <Class Boolean>
	//*  45   97:invokevirtual   #461 <Method boolean Boolean.booleanValue()>
	//*  46  100:ifne            119
				fragment = backstackrecord1.expandOps(mTmpAddedFragments, fragment);
	//   47  103:aload           10
	//   48  105:aload_0         
	//   49  106:getfield        #471 <Field ArrayList mTmpAddedFragments>
	//   50  109:aload           9
	//   51  111:invokevirtual   #483 <Method Fragment BackStackRecord.expandOps(ArrayList, Fragment)>
	//   52  114:astore          9
			else
	//*  53  116:goto            132
				fragment = backstackrecord1.trackAddedFragmentsInPop(mTmpAddedFragments, fragment);
	//   54  119:aload           10
	//   55  121:aload_0         
	//   56  122:getfield        #471 <Field ArrayList mTmpAddedFragments>
	//   57  125:aload           9
	//   58  127:invokevirtual   #486 <Method Fragment BackStackRecord.trackAddedFragmentsInPop(ArrayList, Fragment)>
	//   59  130:astore          9
			if(!flag && !backstackrecord1.mAddToBackStack)
	//*  60  132:iload           6
	//*  61  134:ifne            154
	//*  62  137:aload           10
	//*  63  139:getfield        #489 <Field boolean BackStackRecord.mAddToBackStack>
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
	//   77  167:getfield        #471 <Field ArrayList mTmpAddedFragments>
	//   78  170:invokevirtual   #353 <Method void ArrayList.clear()>
		if(!flag1)
	//*  79  173:iload           8
	//*  80  175:ifne            189
			FragmentTransition.startTransitions(this, arraylist, arraylist1, l, k, false);
	//   81  178:aload_0         
	//   82  179:aload_1         
	//   83  180:aload_2         
	//   84  181:iload           5
	//   85  183:iload           4
	//   86  185:iconst_0        
	//   87  186:invokestatic    #379 <Method void FragmentTransition.startTransitions(FragmentManagerImpl, ArrayList, ArrayList, int, int, boolean)>
		executeOps(arraylist, arraylist1, i, k);
	//   88  189:aload_1         
	//   89  190:aload_2         
	//   90  191:iload_3         
	//   91  192:iload           4
	//   92  194:invokestatic    #491 <Method void executeOps(ArrayList, ArrayList, int, int)>
		if(flag1)
	//*  93  197:iload           8
	//*  94  199:ifeq            239
		{
			b b1 = new b();
	//   95  202:new             #229 <Class b>
	//   96  205:dup             
	//   97  206:invokespecial   #492 <Method void b()>
	//   98  209:astore          9
			addAddedFragments(b1);
	//   99  211:aload_0         
	//  100  212:aload           9
	//  101  214:invokespecial   #494 <Method void addAddedFragments(b)>
			i = postponePostponableTransactions(arraylist, arraylist1, l, k, b1);
	//  102  217:aload_0         
	//  103  218:aload_1         
	//  104  219:aload_2         
	//  105  220:iload           5
	//  106  222:iload           4
	//  107  224:aload           9
	//  108  226:invokespecial   #498 <Method int postponePostponableTransactions(ArrayList, ArrayList, int, int, b)>
	//  109  229:istore_3        
			makeRemovedFragmentsInvisible(b1);
	//  110  230:aload_0         
	//  111  231:aload           9
	//  112  233:invokespecial   #501 <Method void makeRemovedFragmentsInvisible(b)>
		} else
	//* 113  236:goto            242
		{
			i = k;
	//  114  239:iload           4
	//  115  241:istore_3        
		}
		i1 = l;
	//  116  242:iload           5
	//  117  244:istore          7
		if(i != l)
	//* 118  246:iload_3         
	//* 119  247:iload           5
	//* 120  249:icmpeq          284
		{
			i1 = l;
	//  121  252:iload           5
	//  122  254:istore          7
			if(flag1)
	//* 123  256:iload           8
	//* 124  258:ifeq            284
			{
				FragmentTransition.startTransitions(this, arraylist, arraylist1, l, i, true);
	//  125  261:aload_0         
	//  126  262:aload_1         
	//  127  263:aload_2         
	//  128  264:iload           5
	//  129  266:iload_3         
	//  130  267:iconst_1        
	//  131  268:invokestatic    #379 <Method void FragmentTransition.startTransitions(FragmentManagerImpl, ArrayList, ArrayList, int, int, boolean)>
				moveToState(mCurState, true);
	//  132  271:aload_0         
	//  133  272:aload_0         
	//  134  273:getfield        #167 <Field int mCurState>
	//  135  276:iconst_1        
	//  136  277:invokevirtual   #382 <Method void moveToState(int, boolean)>
				i1 = l;
	//  137  280:iload           5
	//  138  282:istore          7
			}
		}
		for(; i1 < k; i1++)
	//* 139  284:iload           7
	//* 140  286:iload           4
	//* 141  288:icmpge          354
		{
			BackStackRecord backstackrecord = (BackStackRecord)arraylist.get(i1);
	//  142  291:aload_1         
	//  143  292:iload           7
	//  144  294:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//  145  297:checkcast       #357 <Class BackStackRecord>
	//  146  300:astore          9
			if(((Boolean)arraylist1.get(i1)).booleanValue() && backstackrecord.mIndex >= 0)
	//* 147  302:aload_2         
	//* 148  303:iload           7
	//* 149  305:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//* 150  308:checkcast       #369 <Class Boolean>
	//* 151  311:invokevirtual   #461 <Method boolean Boolean.booleanValue()>
	//* 152  314:ifeq            340
	//* 153  317:aload           9
	//* 154  319:getfield        #504 <Field int BackStackRecord.mIndex>
	//* 155  322:iflt            340
			{
				freeBackStackIndex(backstackrecord.mIndex);
	//  156  325:aload_0         
	//  157  326:aload           9
	//  158  328:getfield        #504 <Field int BackStackRecord.mIndex>
	//  159  331:invokevirtual   #507 <Method void freeBackStackIndex(int)>
				backstackrecord.mIndex = -1;
	//  160  334:aload           9
	//  161  336:iconst_m1       
	//  162  337:putfield        #504 <Field int BackStackRecord.mIndex>
			}
			backstackrecord.runOnCommitRunnables();
	//  163  340:aload           9
	//  164  342:invokevirtual   #510 <Method void BackStackRecord.runOnCommitRunnables()>
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
	//  173  360:invokevirtual   #513 <Method void reportBackStackChanged()>
	//  174  363:return          
	}

	private void executePostponedTransaction(ArrayList arraylist, ArrayList arraylist1)
	{
		int i;
		int k;
		if(mPostponedTransactions == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #515 <Field ArrayList mPostponedTransactions>
	//*   2    4:ifnonnull       12
			i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_3        
		else
	//*   5    9:goto            20
			i = mPostponedTransactions.size();
	//    6   12:aload_0         
	//    7   13:getfield        #515 <Field ArrayList mPostponedTransactions>
	//    8   16:invokevirtual   #198 <Method int ArrayList.size()>
	//    9   19:istore_3        
		boolean flag = false;
	//   10   20:iconst_0        
	//   11   21:istore          5
		k = i;
	//   12   23:iload_3         
	//   13   24:istore          4
		i = ((int) (flag));
	//   14   26:iload           5
	//   15   28:istore_3        
_L7:
		if(i >= k) goto _L2; else goto _L1
	//   16   29:iload_3         
	//   17   30:iload           4
	//   18   32:icmpge          240
_L1:
		StartEnterTransitionListener startentertransitionlistener = (StartEnterTransitionListener)mPostponedTransactions.get(i);
	//   19   35:aload_0         
	//   20   36:getfield        #515 <Field ArrayList mPostponedTransactions>
	//   21   39:iload_3         
	//   22   40:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   23   43:checkcast       #39  <Class FragmentManagerImpl$StartEnterTransitionListener>
	//   24   46:astore          7
		if(arraylist == null || startentertransitionlistener.mIsBack) goto _L4; else goto _L3
	//   25   48:aload_1         
	//   26   49:ifnull          107
	//   27   52:aload           7
	//   28   54:invokestatic    #519 <Method boolean FragmentManagerImpl$StartEnterTransitionListener.access$300(FragmentManagerImpl$StartEnterTransitionListener)>
	//   29   57:ifne            107
_L3:
		int l = arraylist.indexOf(((Object) (startentertransitionlistener.mRecord)));
	//   30   60:aload_1         
	//   31   61:aload           7
	//   32   63:invokestatic    #523 <Method BackStackRecord FragmentManagerImpl$StartEnterTransitionListener.access$400(FragmentManagerImpl$StartEnterTransitionListener)>
	//   33   66:invokevirtual   #527 <Method int ArrayList.indexOf(Object)>
	//   34   69:istore          5
		if(l == -1 || !((Boolean)arraylist1.get(l)).booleanValue()) goto _L4; else goto _L5
	//   35   71:iload           5
	//   36   73:iconst_m1       
	//   37   74:icmpeq          107
	//   38   77:aload_2         
	//   39   78:iload           5
	//   40   80:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   41   83:checkcast       #369 <Class Boolean>
	//   42   86:invokevirtual   #461 <Method boolean Boolean.booleanValue()>
	//   43   89:ifeq            107
_L5:
		int i1;
		startentertransitionlistener.cancelTransaction();
	//   44   92:aload           7
	//   45   94:invokevirtual   #530 <Method void FragmentManagerImpl$StartEnterTransitionListener.cancelTransaction()>
		i1 = i;
	//   46   97:iload_3         
	//   47   98:istore          6
		l = k;
	//   48  100:iload           4
	//   49  102:istore          5
		break MISSING_BLOCK_LABEL_228;
	//   50  104:goto            228
_L4:
		if(!startentertransitionlistener.isReady())
	//*  51  107:aload           7
	//*  52  109:invokevirtual   #533 <Method boolean FragmentManagerImpl$StartEnterTransitionListener.isReady()>
	//*  53  112:ifne            150
		{
			i1 = i;
	//   54  115:iload_3         
	//   55  116:istore          6
			l = k;
	//   56  118:iload           4
	//   57  120:istore          5
			if(arraylist == null)
				break MISSING_BLOCK_LABEL_228;
	//   58  122:aload_1         
	//   59  123:ifnull          228
			i1 = i;
	//   60  126:iload_3         
	//   61  127:istore          6
			l = k;
	//   62  129:iload           4
	//   63  131:istore          5
			if(!startentertransitionlistener.mRecord.interactsWith(arraylist, 0, arraylist.size()))
				break MISSING_BLOCK_LABEL_228;
	//   64  133:aload           7
	//   65  135:invokestatic    #523 <Method BackStackRecord FragmentManagerImpl$StartEnterTransitionListener.access$400(FragmentManagerImpl$StartEnterTransitionListener)>
	//   66  138:aload_1         
	//   67  139:iconst_0        
	//   68  140:aload_1         
	//   69  141:invokevirtual   #198 <Method int ArrayList.size()>
	//   70  144:invokevirtual   #536 <Method boolean BackStackRecord.interactsWith(ArrayList, int, int)>
	//   71  147:ifeq            228
		}
		mPostponedTransactions.remove(i);
	//   72  150:aload_0         
	//   73  151:getfield        #515 <Field ArrayList mPostponedTransactions>
	//   74  154:iload_3         
	//   75  155:invokevirtual   #539 <Method Object ArrayList.remove(int)>
	//   76  158:pop             
		i--;
	//   77  159:iload_3         
	//   78  160:iconst_1        
	//   79  161:isub            
	//   80  162:istore_3        
		k--;
	//   81  163:iload           4
	//   82  165:iconst_1        
	//   83  166:isub            
	//   84  167:istore          4
		if(arraylist == null || startentertransitionlistener.mIsBack)
			break; /* Loop/switch isn't completed */
	//   85  169:aload_1         
	//   86  170:ifnull          216
	//   87  173:aload           7
	//   88  175:invokestatic    #519 <Method boolean FragmentManagerImpl$StartEnterTransitionListener.access$300(FragmentManagerImpl$StartEnterTransitionListener)>
	//   89  178:ifne            216
		l = arraylist.indexOf(((Object) (startentertransitionlistener.mRecord)));
	//   90  181:aload_1         
	//   91  182:aload           7
	//   92  184:invokestatic    #523 <Method BackStackRecord FragmentManagerImpl$StartEnterTransitionListener.access$400(FragmentManagerImpl$StartEnterTransitionListener)>
	//   93  187:invokevirtual   #527 <Method int ArrayList.indexOf(Object)>
	//   94  190:istore          5
		if(l == -1 || !((Boolean)arraylist1.get(l)).booleanValue()) goto _L6; else goto _L5
	//   95  192:iload           5
	//   96  194:iconst_m1       
	//   97  195:icmpeq          216
	//   98  198:aload_2         
	//   99  199:iload           5
	//  100  201:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//  101  204:checkcast       #369 <Class Boolean>
	//  102  207:invokevirtual   #461 <Method boolean Boolean.booleanValue()>
	//  103  210:ifeq            216
	//* 104  213:goto            92
_L6:
		startentertransitionlistener.completeTransaction();
	//  105  216:aload           7
	//  106  218:invokevirtual   #542 <Method void FragmentManagerImpl$StartEnterTransitionListener.completeTransaction()>
		l = k;
	//  107  221:iload           4
	//  108  223:istore          5
		i1 = i;
	//  109  225:iload_3         
	//  110  226:istore          6
		i = i1 + 1;
	//  111  228:iload           6
	//  112  230:iconst_1        
	//  113  231:iadd            
	//  114  232:istore_3        
		k = l;
	//  115  233:iload           5
	//  116  235:istore          4
		  goto _L7
	//* 117  237:goto            29
_L2:
	//  118  240:return          
	}

	private Fragment findFragmentUnder(Fragment fragment)
	{
		ViewGroup viewgroup = fragment.mContainer;
	//    0    0:aload_1         
	//    1    1:getfield        #283 <Field ViewGroup Fragment.mContainer>
	//    2    4:astore_3        
		View view = fragment.mView;
	//    3    5:aload_1         
	//    4    6:getfield        #221 <Field View Fragment.mView>
	//    5    9:astore          4
		if(viewgroup != null)
	//*   6   11:aload_3         
	//*   7   12:ifnull          73
		{
			if(view == null)
	//*   8   15:aload           4
	//*   9   17:ifnonnull       22
				return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
			for(int i = mAdded.indexOf(((Object) (fragment))) - 1; i >= 0; i--)
	//*  12   22:aload_0         
	//*  13   23:getfield        #160 <Field ArrayList mAdded>
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #527 <Method int ArrayList.indexOf(Object)>
	//*  16   30:iconst_1        
	//*  17   31:isub            
	//*  18   32:istore_2        
	//*  19   33:iload_2         
	//*  20   34:iflt            73
			{
				fragment = (Fragment)mAdded.get(i);
	//   21   37:aload_0         
	//   22   38:getfield        #160 <Field ArrayList mAdded>
	//   23   41:iload_2         
	//   24   42:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   25   45:checkcast       #204 <Class Fragment>
	//   26   48:astore_1        
				if(fragment.mContainer == viewgroup && fragment.mView != null)
	//*  27   49:aload_1         
	//*  28   50:getfield        #283 <Field ViewGroup Fragment.mContainer>
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
		}
	//*  40   70:goto            33
		return null;
	//   41   73:aconst_null     
	//   42   74:areturn         
	}

	private void forcePostponedTransactions()
	{
		if(mPostponedTransactions != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #515 <Field ArrayList mPostponedTransactions>
	//*   2    4:ifnull          34
			for(; !mPostponedTransactions.isEmpty(); ((StartEnterTransitionListener)mPostponedTransactions.remove(0)).completeTransaction());
	//    3    7:aload_0         
	//    4    8:getfield        #515 <Field ArrayList mPostponedTransactions>
	//    5   11:invokevirtual   #549 <Method boolean ArrayList.isEmpty()>
	//    6   14:ifne            34
	//    7   17:aload_0         
	//    8   18:getfield        #515 <Field ArrayList mPostponedTransactions>
	//    9   21:iconst_0        
	//   10   22:invokevirtual   #539 <Method Object ArrayList.remove(int)>
	//   11   25:checkcast       #39  <Class FragmentManagerImpl$StartEnterTransitionListener>
	//   12   28:invokevirtual   #542 <Method void FragmentManagerImpl$StartEnterTransitionListener.completeTransaction()>
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
	//    3    3:getfield        #553 <Field ArrayList mPendingActions>
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
	//*  10   16:getfield        #553 <Field ArrayList mPendingActions>
	//*  11   19:invokevirtual   #198 <Method int ArrayList.size()>
	//*  12   22:ifne            28
			break MISSING_BLOCK_LABEL_102;
	//   13   25:goto            102
		int k = mPendingActions.size();
	//   14   28:aload_0         
	//   15   29:getfield        #553 <Field ArrayList mPendingActions>
	//   16   32:invokevirtual   #198 <Method int ArrayList.size()>
	//   17   35:istore          4
		boolean flag = false;
	//   18   37:iconst_0        
	//   19   38:istore          5
_L2:
		if(i >= k)
			break; /* Loop/switch isn't completed */
	//   20   40:iload_3         
	//   21   41:iload           4
	//   22   43:icmpge          76
		flag |= ((OpGenerator)mPendingActions.get(i)).generateOps(arraylist, arraylist1);
	//   23   46:iload           5
	//   24   48:aload_0         
	//   25   49:getfield        #553 <Field ArrayList mPendingActions>
	//   26   52:iload_3         
	//   27   53:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   28   56:checkcast       #33  <Class FragmentManagerImpl$OpGenerator>
	//   29   59:aload_1         
	//   30   60:aload_2         
	//   31   61:invokeinterface #556 <Method boolean FragmentManagerImpl$OpGenerator.generateOps(ArrayList, ArrayList)>
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
	//   40   77:getfield        #553 <Field ArrayList mPendingActions>
	//   41   80:invokevirtual   #353 <Method void ArrayList.clear()>
		mHost.getHandler().removeCallbacks(mExecCommit);
	//   42   83:aload_0         
	//   43   84:getfield        #438 <Field FragmentHostCallback mHost>
	//   44   87:invokevirtual   #444 <Method Handler FragmentHostCallback.getHandler()>
	//   45   90:aload_0         
	//   46   91:getfield        #176 <Field Runnable mExecCommit>
	//   47   94:invokevirtual   #560 <Method void Handler.removeCallbacks(Runnable)>
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
	//*   0    0:getstatic       #567 <Field Field sAnimationListenerField>
	//*   1    3:ifnonnull       25
		{
			sAnimationListenerField = ((Class) (android/view/animation/Animation)).getDeclaredField("mListener");
	//    2    6:ldc2            #258 <Class Animation>
	//    3    9:ldc2            #569 <String "mListener">
	//    4   12:invokevirtual   #575 <Method Field Class.getDeclaredField(String)>
	//    5   15:putstatic       #567 <Field Field sAnimationListenerField>
			sAnimationListenerField.setAccessible(true);
	//    6   18:getstatic       #567 <Field Field sAnimationListenerField>
	//    7   21:iconst_1        
	//    8   22:invokevirtual   #580 <Method void Field.setAccessible(boolean)>
		}
		animation = ((Animation) ((android.view.animation.Animation.AnimationListener)sAnimationListenerField.get(((Object) (animation)))));
	//    9   25:getstatic       #567 <Field Field sAnimationListenerField>
	//   10   28:aload_0         
	//   11   29:invokevirtual   #583 <Method Object Field.get(Object)>
	//   12   32:checkcast       #585 <Class android.view.animation.Animation$AnimationListener>
	//   13   35:astore_0        
		return ((android.view.animation.Animation.AnimationListener) (animation));
	//   14   36:aload_0         
	//   15   37:areturn         
		Object obj;
		obj;
	//   16   38:astore_1        
		animation = "Cannot access Animation's mListener field";
	//   17   39:ldc2            #587 <String "Cannot access Animation's mListener field">
	//   18   42:astore_0        
		break MISSING_BLOCK_LABEL_51;
	//   19   43:goto            51
		obj;
	//   20   46:astore_1        
		animation = "No field with the name mListener is found in Animation class";
	//   21   47:ldc2            #589 <String "No field with the name mListener is found in Animation class">
	//   22   50:astore_0        
		Log.e("FragmentManager", ((String) (animation)), ((Throwable) (obj)));
	//   23   51:ldc1            #67  <String "FragmentManager">
	//   24   53:aload_0         
	//   25   54:aload_1         
	//   26   55:invokestatic    #595 <Method int Log.e(String, String, Throwable)>
	//   27   58:pop             
		return null;
	//   28   59:aconst_null     
	//   29   60:areturn         
	}

	static AnimationOrAnimator makeFadeAnimation(Context context, float f, float f1)
	{
		context = ((Context) (new AlphaAnimation(f, f1)));
	//    0    0:new             #599 <Class AlphaAnimation>
	//    1    3:dup             
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokespecial   #602 <Method void AlphaAnimation(float, float)>
	//    5    9:astore_0        
		((AlphaAnimation) (context)).setInterpolator(DECELERATE_CUBIC);
	//    6   10:aload_0         
	//    7   11:getstatic       #143 <Field Interpolator DECELERATE_CUBIC>
	//    8   14:invokevirtual   #606 <Method void AlphaAnimation.setInterpolator(Interpolator)>
		((AlphaAnimation) (context)).setDuration(220L);
	//    9   17:aload_0         
	//   10   18:ldc2w           #607 <Long 220L>
	//   11   21:invokevirtual   #612 <Method void AlphaAnimation.setDuration(long)>
		return new AnimationOrAnimator(((Animation) (context)));
	//   12   24:new             #24  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:invokespecial   #615 <Method void FragmentManagerImpl$AnimationOrAnimator(Animation, FragmentManagerImpl$1)>
	//   17   33:areturn         
	}

	static AnimationOrAnimator makeOpenCloseAnimation(Context context, float f, float f1, float f2, float f3)
	{
		context = ((Context) (new AnimationSet(false)));
	//    0    0:new             #619 <Class AnimationSet>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #621 <Method void AnimationSet(boolean)>
	//    4    8:astore_0        
		Object obj = ((Object) (new ScaleAnimation(f, f1, f, f1, 1, 0.5F, 1, 0.5F)));
	//    5    9:new             #623 <Class ScaleAnimation>
	//    6   12:dup             
	//    7   13:fload_1         
	//    8   14:fload_2         
	//    9   15:fload_1         
	//   10   16:fload_2         
	//   11   17:iconst_1        
	//   12   18:ldc2            #624 <Float 0.5F>
	//   13   21:iconst_1        
	//   14   22:ldc2            #624 <Float 0.5F>
	//   15   25:invokespecial   #627 <Method void ScaleAnimation(float, float, float, float, int, float, int, float)>
	//   16   28:astore          5
		((ScaleAnimation) (obj)).setInterpolator(DECELERATE_QUINT);
	//   17   30:aload           5
	//   18   32:getstatic       #140 <Field Interpolator DECELERATE_QUINT>
	//   19   35:invokevirtual   #628 <Method void ScaleAnimation.setInterpolator(Interpolator)>
		((ScaleAnimation) (obj)).setDuration(220L);
	//   20   38:aload           5
	//   21   40:ldc2w           #607 <Long 220L>
	//   22   43:invokevirtual   #629 <Method void ScaleAnimation.setDuration(long)>
		((AnimationSet) (context)).addAnimation(((Animation) (obj)));
	//   23   46:aload_0         
	//   24   47:aload           5
	//   25   49:invokevirtual   #632 <Method void AnimationSet.addAnimation(Animation)>
		obj = ((Object) (new AlphaAnimation(f2, f3)));
	//   26   52:new             #599 <Class AlphaAnimation>
	//   27   55:dup             
	//   28   56:fload_3         
	//   29   57:fload           4
	//   30   59:invokespecial   #602 <Method void AlphaAnimation(float, float)>
	//   31   62:astore          5
		((AlphaAnimation) (obj)).setInterpolator(DECELERATE_CUBIC);
	//   32   64:aload           5
	//   33   66:getstatic       #143 <Field Interpolator DECELERATE_CUBIC>
	//   34   69:invokevirtual   #606 <Method void AlphaAnimation.setInterpolator(Interpolator)>
		((AlphaAnimation) (obj)).setDuration(220L);
	//   35   72:aload           5
	//   36   74:ldc2w           #607 <Long 220L>
	//   37   77:invokevirtual   #612 <Method void AlphaAnimation.setDuration(long)>
		((AnimationSet) (context)).addAnimation(((Animation) (obj)));
	//   38   80:aload_0         
	//   39   81:aload           5
	//   40   83:invokevirtual   #632 <Method void AnimationSet.addAnimation(Animation)>
		return new AnimationOrAnimator(((Animation) (context)));
	//   41   86:new             #24  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   42   89:dup             
	//   43   90:aload_0         
	//   44   91:aconst_null     
	//   45   92:invokespecial   #615 <Method void FragmentManagerImpl$AnimationOrAnimator(Animation, FragmentManagerImpl$1)>
	//   46   95:areturn         
	}

	private void makeRemovedFragmentsInvisible(b b1)
	{
		int k = b1.size();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #633 <Method int b.size()>
	//    2    4:istore_3        
		for(int i = 0; i < k; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          60
		{
			Fragment fragment = (Fragment)b1.b(i);
	//    8   12:aload_1         
	//    9   13:iload_2         
	//   10   14:invokevirtual   #636 <Method Object b.b(int)>
	//   11   17:checkcast       #204 <Class Fragment>
	//   12   20:astore          4
			if(!fragment.mAdded)
	//*  13   22:aload           4
	//*  14   24:getfield        #638 <Field boolean Fragment.mAdded>
	//*  15   27:ifne            53
			{
				View view = fragment.getView();
	//   16   30:aload           4
	//   17   32:invokevirtual   #641 <Method View Fragment.getView()>
	//   18   35:astore          5
				fragment.mPostponedAlpha = view.getAlpha();
	//   19   37:aload           4
	//   20   39:aload           5
	//   21   41:invokevirtual   #645 <Method float View.getAlpha()>
	//   22   44:putfield        #393 <Field float Fragment.mPostponedAlpha>
				view.setAlpha(0.0F);
	//   23   47:aload           5
	//   24   49:fconst_0        
	//   25   50:invokevirtual   #396 <Method void View.setAlpha(float)>
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
	//*   5    7:instanceof      #649 <Class ValueAnimator>
	//*   6   10:ifeq            53
		{
			animator = ((Animator) (((ValueAnimator)animator).getValues()));
	//    7   13:aload_0         
	//    8   14:checkcast       #649 <Class ValueAnimator>
	//    9   17:invokevirtual   #653 <Method PropertyValuesHolder[] ValueAnimator.getValues()>
	//   10   20:astore_0        
			for(int i = 0; i < animator.length; i++)
	//*  11   21:iconst_0        
	//*  12   22:istore_1        
	//*  13   23:iload_1         
	//*  14   24:aload_0         
	//*  15   25:arraylength     
	//*  16   26:icmpge          105
				if("alpha".equals(((Object) (((PropertyValuesHolder) (animator[i])).getPropertyName()))))
	//*  17   29:ldc2            #655 <String "alpha">
	//*  18   32:aload_0         
	//*  19   33:iload_1         
	//*  20   34:aaload          
	//*  21   35:invokevirtual   #660 <Method String PropertyValuesHolder.getPropertyName()>
	//*  22   38:invokevirtual   #665 <Method boolean String.equals(Object)>
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
	//*  32   54:instanceof      #667 <Class AnimatorSet>
	//*  33   57:ifeq            105
		{
			animator = ((Animator) (((AnimatorSet)animator).getChildAnimations()));
	//   34   60:aload_0         
	//   35   61:checkcast       #667 <Class AnimatorSet>
	//   36   64:invokevirtual   #671 <Method ArrayList AnimatorSet.getChildAnimations()>
	//   37   67:astore_0        
			for(int k = 0; k < ((List) (animator)).size(); k++)
	//*  38   68:iconst_0        
	//*  39   69:istore_1        
	//*  40   70:iload_1         
	//*  41   71:aload_0         
	//*  42   72:invokeinterface #674 <Method int List.size()>
	//*  43   77:icmpge          105
				if(modifiesAlpha((Animator)((List) (animator)).get(k)))
	//*  44   80:aload_0         
	//*  45   81:iload_1         
	//*  46   82:invokeinterface #675 <Method Object List.get(int)>
	//*  47   87:checkcast       #293 <Class Animator>
	//*  48   90:invokestatic    #677 <Method boolean modifiesAlpha(Animator)>
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
	//*   1    1:getfield        #245 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//*   2    4:instanceof      #599 <Class AlphaAnimation>
	//*   3    7:ifeq            12
			return true;
	//    4   10:iconst_1        
	//    5   11:ireturn         
		if(animationoranimator.animation instanceof AnimationSet)
	//*   6   12:aload_0         
	//*   7   13:getfield        #245 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//*   8   16:instanceof      #619 <Class AnimationSet>
	//*   9   19:ifeq            69
		{
			animationoranimator = ((AnimationOrAnimator) (((AnimationSet)animationoranimator.animation).getAnimations()));
	//   10   22:aload_0         
	//   11   23:getfield        #245 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   12   26:checkcast       #619 <Class AnimationSet>
	//   13   29:invokevirtual   #682 <Method List AnimationSet.getAnimations()>
	//   14   32:astore_0        
			for(int i = 0; i < ((List) (animationoranimator)).size(); i++)
	//*  15   33:iconst_0        
	//*  16   34:istore_1        
	//*  17   35:iload_1         
	//*  18   36:aload_0         
	//*  19   37:invokeinterface #674 <Method int List.size()>
	//*  20   42:icmpge          67
				if(((List) (animationoranimator)).get(i) instanceof AlphaAnimation)
	//*  21   45:aload_0         
	//*  22   46:iload_1         
	//*  23   47:invokeinterface #675 <Method Object List.get(int)>
	//*  24   52:instanceof      #599 <Class AlphaAnimation>
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
	//   36   70:getfield        #276 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   37   73:invokestatic    #677 <Method boolean modifiesAlpha(Animator)>
	//   38   76:ireturn         
		}
	}

	private boolean popBackStackImmediate(String s1, int i, int k)
	{
		boolean flag;
		execPendingActions();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #402 <Method boolean execPendingActions()>
	//    2    4:pop             
		ensureExecReady(true);
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokespecial   #686 <Method void ensureExecReady(boolean)>
		if(mPrimaryNav != null && i < 0 && s1 == null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #688 <Field Fragment mPrimaryNav>
	//*   8   14:ifnull          49
	//*   9   17:iload_2         
	//*  10   18:ifge            49
	//*  11   21:aload_1         
	//*  12   22:ifnonnull       49
		{
			FragmentManager fragmentmanager = mPrimaryNav.peekChildFragmentManager();
	//   13   25:aload_0         
	//   14   26:getfield        #688 <Field Fragment mPrimaryNav>
	//   15   29:invokevirtual   #692 <Method FragmentManager Fragment.peekChildFragmentManager()>
	//   16   32:astore          5
			if(fragmentmanager != null && fragmentmanager.popBackStackImmediate())
	//*  17   34:aload           5
	//*  18   36:ifnull          49
	//*  19   39:aload           5
	//*  20   41:invokevirtual   #694 <Method boolean FragmentManager.popBackStackImmediate()>
	//*  21   44:ifeq            49
				return true;
	//   22   47:iconst_1        
	//   23   48:ireturn         
		}
		flag = popBackStackState(mTmpRecords, mTmpIsPop, s1, i, k);
	//   24   49:aload_0         
	//   25   50:aload_0         
	//   26   51:getfield        #355 <Field ArrayList mTmpRecords>
	//   27   54:aload_0         
	//   28   55:getfield        #350 <Field ArrayList mTmpIsPop>
	//   29   58:aload_1         
	//   30   59:iload_2         
	//   31   60:iload_3         
	//   32   61:invokevirtual   #698 <Method boolean popBackStackState(ArrayList, ArrayList, String, int, int)>
	//   33   64:istore          4
		if(!flag)
			break MISSING_BLOCK_LABEL_102;
	//   34   66:iload           4
	//   35   68:ifeq            102
		mExecutingActions = true;
	//   36   71:aload_0         
	//   37   72:iconst_1        
	//   38   73:putfield        #348 <Field boolean mExecutingActions>
		removeRedundantOperationsAndExecute(mTmpRecords, mTmpIsPop);
	//   39   76:aload_0         
	//   40   77:aload_0         
	//   41   78:getfield        #355 <Field ArrayList mTmpRecords>
	//   42   81:aload_0         
	//   43   82:getfield        #350 <Field ArrayList mTmpIsPop>
	//   44   85:invokespecial   #701 <Method void removeRedundantOperationsAndExecute(ArrayList, ArrayList)>
		cleanupExec();
	//   45   88:aload_0         
	//   46   89:invokespecial   #703 <Method void cleanupExec()>
		break MISSING_BLOCK_LABEL_102;
	//   47   92:goto            102
		s1;
	//   48   95:astore_1        
		cleanupExec();
	//   49   96:aload_0         
	//   50   97:invokespecial   #703 <Method void cleanupExec()>
		throw s1;
	//   51  100:aload_1         
	//   52  101:athrow          
		doPendingDeferredStart();
	//   53  102:aload_0         
	//   54  103:invokevirtual   #706 <Method void doPendingDeferredStart()>
		burpActive();
	//   55  106:aload_0         
	//   56  107:invokespecial   #708 <Method void burpActive()>
		return flag;
	//   57  110:iload           4
	//   58  112:ireturn         
	}

	private int postponePostponableTransactions(ArrayList arraylist, ArrayList arraylist1, int i, int k, b b1)
	{
		int l = k - 1;
	//    0    0:iload           4
	//    1    2:iconst_1        
	//    2    3:isub            
	//    3    4:istore          6
		int i1;
		int j1;
		for(i1 = k; l >= i; i1 = j1)
	//*   4    6:iload           4
	//*   5    8:istore          7
	//*   6   10:iload           6
	//*   7   12:iload_3         
	//*   8   13:icmplt          196
		{
			BackStackRecord backstackrecord = (BackStackRecord)arraylist.get(l);
	//    9   16:aload_1         
	//   10   17:iload           6
	//   11   19:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #357 <Class BackStackRecord>
	//   13   25:astore          11
			boolean flag1 = ((Boolean)arraylist1.get(l)).booleanValue();
	//   14   27:aload_2         
	//   15   28:iload           6
	//   16   30:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   17   33:checkcast       #369 <Class Boolean>
	//   18   36:invokevirtual   #461 <Method boolean Boolean.booleanValue()>
	//   19   39:istore          10
			boolean flag;
			if(backstackrecord.isPostponed() && !backstackrecord.interactsWith(arraylist, l + 1, k))
	//*  20   41:aload           11
	//*  21   43:invokevirtual   #711 <Method boolean BackStackRecord.isPostponed()>
	//*  22   46:ifeq            70
	//*  23   49:aload           11
	//*  24   51:aload_1         
	//*  25   52:iload           6
	//*  26   54:iconst_1        
	//*  27   55:iadd            
	//*  28   56:iload           4
	//*  29   58:invokevirtual   #536 <Method boolean BackStackRecord.interactsWith(ArrayList, int, int)>
	//*  30   61:ifne            70
				flag = true;
	//   31   64:iconst_1        
	//   32   65:istore          9
			else
	//*  33   67:goto            73
				flag = false;
	//   34   70:iconst_0        
	//   35   71:istore          9
			j1 = i1;
	//   36   73:iload           7
	//   37   75:istore          8
			if(flag)
	//*  38   77:iload           9
	//*  39   79:ifeq            183
			{
				if(mPostponedTransactions == null)
	//*  40   82:aload_0         
	//*  41   83:getfield        #515 <Field ArrayList mPostponedTransactions>
	//*  42   86:ifnonnull       100
					mPostponedTransactions = new ArrayList();
	//   43   89:aload_0         
	//   44   90:new             #157 <Class ArrayList>
	//   45   93:dup             
	//   46   94:invokespecial   #158 <Method void ArrayList()>
	//   47   97:putfield        #515 <Field ArrayList mPostponedTransactions>
				StartEnterTransitionListener startentertransitionlistener = new StartEnterTransitionListener(backstackrecord, flag1);
	//   48  100:new             #39  <Class FragmentManagerImpl$StartEnterTransitionListener>
	//   49  103:dup             
	//   50  104:aload           11
	//   51  106:iload           10
	//   52  108:invokespecial   #714 <Method void FragmentManagerImpl$StartEnterTransitionListener(BackStackRecord, boolean)>
	//   53  111:astore          12
				mPostponedTransactions.add(((Object) (startentertransitionlistener)));
	//   54  113:aload_0         
	//   55  114:getfield        #515 <Field ArrayList mPostponedTransactions>
	//   56  117:aload           12
	//   57  119:invokevirtual   #367 <Method boolean ArrayList.add(Object)>
	//   58  122:pop             
				backstackrecord.setOnStartPostponedListener(((Fragment.OnStartEnterTransitionListener) (startentertransitionlistener)));
	//   59  123:aload           11
	//   60  125:aload           12
	//   61  127:invokevirtual   #718 <Method void BackStackRecord.setOnStartPostponedListener(Fragment$OnStartEnterTransitionListener)>
				if(flag1)
	//*  62  130:iload           10
	//*  63  132:ifeq            143
					backstackrecord.executeOps();
	//   64  135:aload           11
	//   65  137:invokevirtual   #364 <Method void BackStackRecord.executeOps()>
				else
	//*  66  140:goto            149
					backstackrecord.executePopOps(false);
	//   67  143:aload           11
	//   68  145:iconst_0        
	//   69  146:invokevirtual   #361 <Method void BackStackRecord.executePopOps(boolean)>
				j1 = i1 - 1;
	//   70  149:iload           7
	//   71  151:iconst_1        
	//   72  152:isub            
	//   73  153:istore          8
				if(l != j1)
	//*  74  155:iload           6
	//*  75  157:iload           8
	//*  76  159:icmpeq          177
				{
					arraylist.remove(l);
	//   77  162:aload_1         
	//   78  163:iload           6
	//   79  165:invokevirtual   #539 <Method Object ArrayList.remove(int)>
	//   80  168:pop             
					arraylist.add(j1, ((Object) (backstackrecord)));
	//   81  169:aload_1         
	//   82  170:iload           8
	//   83  172:aload           11
	//   84  174:invokevirtual   #721 <Method void ArrayList.add(int, Object)>
				}
				addAddedFragments(b1);
	//   85  177:aload_0         
	//   86  178:aload           5
	//   87  180:invokespecial   #494 <Method void addAddedFragments(b)>
			}
			l--;
	//   88  183:iload           6
	//   89  185:iconst_1        
	//   90  186:isub            
	//   91  187:istore          6
		}

	//   92  189:iload           8
	//   93  191:istore          7
	//*  94  193:goto            10
		return i1;
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
	//*   3    5:invokevirtual   #549 <Method boolean ArrayList.isEmpty()>
	//*   4    8:ifeq            12
				return;
	//    5   11:return          
			if(arraylist1 != null && arraylist.size() == arraylist1.size())
	//*   6   12:aload_2         
	//*   7   13:ifnull          215
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #198 <Method int ArrayList.size()>
	//*  10   20:aload_2         
	//*  11   21:invokevirtual   #198 <Method int ArrayList.size()>
	//*  12   24:icmpeq          30
	//*  13   27:goto            215
			{
				executePostponedTransaction(arraylist, arraylist1);
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:aload_2         
	//   17   33:invokespecial   #457 <Method void executePostponedTransaction(ArrayList, ArrayList)>
				int j1 = arraylist.size();
	//   18   36:aload_1         
	//   19   37:invokevirtual   #198 <Method int ArrayList.size()>
	//   20   40:istore          7
				int i = 0;
	//   21   42:iconst_0        
	//   22   43:istore_3        
				int k;
				int l;
				for(l = 0; i < j1; l = k)
	//*  23   44:iconst_0        
	//*  24   45:istore          5
	//*  25   47:iload_3         
	//*  26   48:iload           7
	//*  27   50:icmpge          197
				{
					int i1 = i;
	//   28   53:iload_3         
	//   29   54:istore          6
					k = l;
	//   30   56:iload           5
	//   31   58:istore          4
					if(!((BackStackRecord)arraylist.get(i)).mReorderingAllowed)
	//*  32   60:aload_1         
	//*  33   61:iload_3         
	//*  34   62:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//*  35   65:checkcast       #357 <Class BackStackRecord>
	//*  36   68:getfield        #469 <Field boolean BackStackRecord.mReorderingAllowed>
	//*  37   71:ifne            185
					{
						if(l != i)
	//*  38   74:iload           5
	//*  39   76:iload_3         
	//*  40   77:icmpeq          89
							executeOpsTogether(arraylist, arraylist1, l, i);
	//   41   80:aload_0         
	//   42   81:aload_1         
	//   43   82:aload_2         
	//   44   83:iload           5
	//   45   85:iload_3         
	//   46   86:invokespecial   #724 <Method void executeOpsTogether(ArrayList, ArrayList, int, int)>
						l = i + 1;
	//   47   89:iload_3         
	//   48   90:iconst_1        
	//   49   91:iadd            
	//   50   92:istore          5
						k = l;
	//   51   94:iload           5
	//   52   96:istore          4
						if(((Boolean)arraylist1.get(i)).booleanValue())
	//*  53   98:aload_2         
	//*  54   99:iload_3         
	//*  55  100:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//*  56  103:checkcast       #369 <Class Boolean>
	//*  57  106:invokevirtual   #461 <Method boolean Boolean.booleanValue()>
	//*  58  109:ifeq            170
							do
							{
								k = l;
	//   59  112:iload           5
	//   60  114:istore          4
								if(l >= j1)
									break;
	//   61  116:iload           5
	//   62  118:iload           7
	//   63  120:icmpge          170
								k = l;
	//   64  123:iload           5
	//   65  125:istore          4
								if(!((Boolean)arraylist1.get(l)).booleanValue())
									break;
	//   66  127:aload_2         
	//   67  128:iload           5
	//   68  130:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   69  133:checkcast       #369 <Class Boolean>
	//   70  136:invokevirtual   #461 <Method boolean Boolean.booleanValue()>
	//   71  139:ifeq            170
								k = l;
	//   72  142:iload           5
	//   73  144:istore          4
								if(((BackStackRecord)arraylist.get(l)).mReorderingAllowed)
									break;
	//   74  146:aload_1         
	//   75  147:iload           5
	//   76  149:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   77  152:checkcast       #357 <Class BackStackRecord>
	//   78  155:getfield        #469 <Field boolean BackStackRecord.mReorderingAllowed>
	//   79  158:ifne            170
								l++;
	//   80  161:iload           5
	//   81  163:iconst_1        
	//   82  164:iadd            
	//   83  165:istore          5
							} while(true);
	//   84  167:goto            112
						executeOpsTogether(arraylist, arraylist1, i, k);
	//   85  170:aload_0         
	//   86  171:aload_1         
	//   87  172:aload_2         
	//   88  173:iload_3         
	//   89  174:iload           4
	//   90  176:invokespecial   #724 <Method void executeOpsTogether(ArrayList, ArrayList, int, int)>
						i1 = k - 1;
	//   91  179:iload           4
	//   92  181:iconst_1        
	//   93  182:isub            
	//   94  183:istore          6
					}
					i = i1 + 1;
	//   95  185:iload           6
	//   96  187:iconst_1        
	//   97  188:iadd            
	//   98  189:istore_3        
				}

	//   99  190:iload           4
	//  100  192:istore          5
	//* 101  194:goto            47
				if(l != j1)
	//* 102  197:iload           5
	//* 103  199:iload           7
	//* 104  201:icmpeq          214
					executeOpsTogether(arraylist, arraylist1, l, j1);
	//  105  204:aload_0         
	//  106  205:aload_1         
	//  107  206:aload_2         
	//  108  207:iload           5
	//  109  209:iload           7
	//  110  211:invokespecial   #724 <Method void executeOpsTogether(ArrayList, ArrayList, int, int)>
				return;
	//  111  214:return          
			} else
			{
				throw new IllegalStateException("Internal error with the back stack records");
	//  112  215:new             #325 <Class IllegalStateException>
	//  113  218:dup             
	//  114  219:ldc2            #726 <String "Internal error with the back stack records">
	//  115  222:invokespecial   #330 <Method void IllegalStateException(String)>
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
	//    3    3:getfield        #515 <Field ArrayList mPostponedTransactions>
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
	//   10   16:getfield        #515 <Field ArrayList mPostponedTransactions>
	//   11   19:invokevirtual   #549 <Method boolean ArrayList.isEmpty()>
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
	//   19   33:getfield        #553 <Field ArrayList mPendingActions>
	//   20   36:ifnull          101
_L4:
		flag1 = flag2;
	//   21   39:iload_3         
	//   22   40:istore_2        
		if(mPendingActions.size() == 1)
	//*  23   41:aload_0         
	//*  24   42:getfield        #553 <Field ArrayList mPendingActions>
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
	//   32   58:getfield        #438 <Field FragmentHostCallback mHost>
	//   33   61:invokevirtual   #444 <Method Handler FragmentHostCallback.getHandler()>
	//   34   64:aload_0         
	//   35   65:getfield        #176 <Field Runnable mExecCommit>
	//   36   68:invokevirtual   #560 <Method void Handler.removeCallbacks(Runnable)>
		mHost.getHandler().post(mExecCommit);
	//   37   71:aload_0         
	//   38   72:getfield        #438 <Field FragmentHostCallback mHost>
	//   39   75:invokevirtual   #444 <Method Handler FragmentHostCallback.getHandler()>
	//   40   78:aload_0         
	//   41   79:getfield        #176 <Field Runnable mExecCommit>
	//   42   82:invokevirtual   #731 <Method boolean Handler.post(Runnable)>
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
	//*   1    1:ifnull          70
		{
			if(animationoranimator == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       9
				return;
	//    4    8:return          
			if(shouldRunOnHWLayer(view, animationoranimator))
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:invokestatic    #735 <Method boolean shouldRunOnHWLayer(View, FragmentManagerImpl$AnimationOrAnimator)>
	//*   8   14:ifeq            70
			{
				if(animationoranimator.animator != null)
	//*   9   17:aload_1         
	//*  10   18:getfield        #276 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//*  11   21:ifnull          40
				{
					animationoranimator.animator.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorOnHWLayerIfNeededListener(view))));
	//   12   24:aload_1         
	//   13   25:getfield        #276 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   14   28:new             #27  <Class FragmentManagerImpl$AnimatorOnHWLayerIfNeededListener>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #737 <Method void FragmentManagerImpl$AnimatorOnHWLayerIfNeededListener(View)>
	//   18   36:invokevirtual   #297 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
					return;
	//   19   39:return          
				}
				android.view.animation.Animation.AnimationListener animationlistener = getAnimationListener(animationoranimator.animation);
	//   20   40:aload_1         
	//   21   41:getfield        #245 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   22   44:invokestatic    #253 <Method android.view.animation.Animation$AnimationListener getAnimationListener(Animation)>
	//   23   47:astore_2        
				view.setLayerType(2, ((android.graphics.Paint) (null)));
	//   24   48:aload_0         
	//   25   49:iconst_2        
	//   26   50:aconst_null     
	//   27   51:invokevirtual   #741 <Method void View.setLayerType(int, android.graphics.Paint)>
				animationoranimator.animation.setAnimationListener(((android.view.animation.Animation.AnimationListener) (new AnimateOnHWLayerIfNeededListener(view, animationlistener))));
	//   28   54:aload_1         
	//   29   55:getfield        #245 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   30   58:new             #16  <Class FragmentManagerImpl$AnimateOnHWLayerIfNeededListener>
	//   31   61:dup             
	//   32   62:aload_0         
	//   33   63:aload_2         
	//   34   64:invokespecial   #744 <Method void FragmentManagerImpl$AnimateOnHWLayerIfNeededListener(View, android.view.animation.Animation$AnimationListener)>
	//   35   67:invokevirtual   #262 <Method void Animation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
			}
		}
	//   36   70:return          
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
	//    4    6:invokevirtual   #751 <Method List FragmentManagerNonConfig.getFragments()>
	//    5    9:astore_1        
		if(obj != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          46
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*   8   14:aload_1         
	//*   9   15:invokeinterface #755 <Method Iterator List.iterator()>
	//*  10   20:astore_1        
	//*  11   21:aload_1         
	//*  12   22:invokeinterface #760 <Method boolean Iterator.hasNext()>
	//*  13   27:ifeq            46
				((Fragment)((Iterator) (obj)).next()).mRetaining = true;
	//   14   30:aload_1         
	//   15   31:invokeinterface #764 <Method Object Iterator.next()>
	//   16   36:checkcast       #204 <Class Fragment>
	//   17   39:iconst_1        
	//   18   40:putfield        #767 <Field boolean Fragment.mRetaining>

	//*  19   43:goto            21
		fragmentmanagernonconfig = ((FragmentManagerNonConfig) (fragmentmanagernonconfig.getChildNonConfigs()));
	//   20   46:aload_0         
	//   21   47:invokevirtual   #770 <Method List FragmentManagerNonConfig.getChildNonConfigs()>
	//   22   50:astore_0        
		if(fragmentmanagernonconfig != null)
	//*  23   51:aload_0         
	//*  24   52:ifnull          86
			for(fragmentmanagernonconfig = ((FragmentManagerNonConfig) (((List) (fragmentmanagernonconfig)).iterator())); ((Iterator) (fragmentmanagernonconfig)).hasNext(); setRetaining((FragmentManagerNonConfig)((Iterator) (fragmentmanagernonconfig)).next()));
	//   25   55:aload_0         
	//   26   56:invokeinterface #755 <Method Iterator List.iterator()>
	//   27   61:astore_0        
	//   28   62:aload_0         
	//   29   63:invokeinterface #760 <Method boolean Iterator.hasNext()>
	//   30   68:ifeq            86
	//   31   71:aload_0         
	//   32   72:invokeinterface #764 <Method Object Iterator.next()>
	//   33   77:checkcast       #748 <Class FragmentManagerNonConfig>
	//   34   80:invokestatic    #772 <Method void setRetaining(FragmentManagerNonConfig)>
	//*  35   83:goto            62
	//   36   86:return          
	}

	static boolean shouldRunOnHWLayer(View view, AnimationOrAnimator animationoranimator)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = flag1;
	//    2    2:iload_3         
	//    3    3:istore_2        
		if(view != null)
	//*   4    4:aload_0         
	//*   5    5:ifnull          53
		{
			if(animationoranimator == null)
	//*   6    8:aload_1         
	//*   7    9:ifnonnull       14
				return false;
	//    8   12:iconst_0        
	//    9   13:ireturn         
			flag = flag1;
	//   10   14:iload_3         
	//   11   15:istore_2        
			if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  12   16:getstatic       #777 <Field int android.os.Build$VERSION.SDK_INT>
	//*  13   19:bipush          19
	//*  14   21:icmplt          53
			{
				flag = flag1;
	//   15   24:iload_3         
	//   16   25:istore_2        
				if(view.getLayerType() == 0)
	//*  17   26:aload_0         
	//*  18   27:invokevirtual   #780 <Method int View.getLayerType()>
	//*  19   30:ifne            53
				{
					flag = flag1;
	//   20   33:iload_3         
	//   21   34:istore_2        
					if(s.r(view))
	//*  22   35:aload_0         
	//*  23   36:invokestatic    #786 <Method boolean s.r(View)>
	//*  24   39:ifeq            53
					{
						flag = flag1;
	//   25   42:iload_3         
	//   26   43:istore_2        
						if(modifiesAlpha(animationoranimator))
	//*  27   44:aload_1         
	//*  28   45:invokestatic    #788 <Method boolean modifiesAlpha(FragmentManagerImpl$AnimationOrAnimator)>
	//*  29   48:ifeq            53
							flag = true;
	//   30   51:iconst_1        
	//   31   52:istore_2        
					}
				}
			}
		}
		return flag;
	//   32   53:iload_2         
	//   33   54:ireturn         
	}

	private void throwException(RuntimeException runtimeexception)
	{
		Object obj;
		Log.e("FragmentManager", runtimeexception.getMessage());
	//    0    0:ldc1            #67  <String "FragmentManager">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #797 <Method String RuntimeException.getMessage()>
	//    3    6:invokestatic    #800 <Method int Log.e(String, String)>
	//    4    9:pop             
		Log.e("FragmentManager", "Activity state:");
	//    5   10:ldc1            #67  <String "FragmentManager">
	//    6   12:ldc2            #802 <String "Activity state:">
	//    7   15:invokestatic    #800 <Method int Log.e(String, String)>
	//    8   18:pop             
		obj = ((Object) (new PrintWriter(((java.io.Writer) (new e("FragmentManager"))))));
	//    9   19:new             #804 <Class PrintWriter>
	//   10   22:dup             
	//   11   23:new             #806 <Class e>
	//   12   26:dup             
	//   13   27:ldc1            #67  <String "FragmentManager">
	//   14   29:invokespecial   #807 <Method void e(String)>
	//   15   32:invokespecial   #810 <Method void PrintWriter(java.io.Writer)>
	//   16   35:astore_2        
		if(mHost != null)
	//*  17   36:aload_0         
	//*  18   37:getfield        #438 <Field FragmentHostCallback mHost>
	//*  19   40:ifnull          76
		{
			try
			{
				mHost.onDump("  ", ((FileDescriptor) (null)), ((PrintWriter) (obj)), new String[0]);
	//   20   43:aload_0         
	//   21   44:getfield        #438 <Field FragmentHostCallback mHost>
	//   22   47:ldc2            #812 <String "  ">
	//   23   50:aconst_null     
	//   24   51:aload_2         
	//   25   52:iconst_0        
	//   26   53:anewarray       String[]
	//   27   56:invokevirtual   #816 <Method void FragmentHostCallback.onDump(String, FileDescriptor, PrintWriter, String[])>
			}
	//*  28   59:goto            89
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  29   62:astore_2        
			{
				Log.e("FragmentManager", "Failed dumping state", ((Throwable) (obj)));
	//   30   63:ldc1            #67  <String "FragmentManager">
	//   31   65:ldc2            #818 <String "Failed dumping state">
	//   32   68:aload_2         
	//   33   69:invokestatic    #595 <Method int Log.e(String, String, Throwable)>
	//   34   72:pop             
			}
			break MISSING_BLOCK_LABEL_89;
	//   35   73:goto            89
		}
		dump("  ", ((FileDescriptor) (null)), ((PrintWriter) (obj)), new String[0]);
	//   36   76:aload_0         
	//   37   77:ldc2            #812 <String "  ">
	//   38   80:aconst_null     
	//   39   81:aload_2         
	//   40   82:iconst_0        
	//   41   83:anewarray       String[]
	//   42   86:invokevirtual   #821 <Method void dump(String, FileDescriptor, PrintWriter, String[])>
		throw runtimeexception;
	//   43   89:aload_1         
	//   44   90:athrow          
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
	//*   1    1:getfield        #827 <Field ArrayList mBackStack>
	//*   2    4:ifnonnull       18
			mBackStack = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #157 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #158 <Method void ArrayList()>
	//    7   15:putfield        #827 <Field ArrayList mBackStack>
		mBackStack.add(((Object) (backstackrecord)));
	//    8   18:aload_0         
	//    9   19:getfield        #827 <Field ArrayList mBackStack>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #367 <Method boolean ArrayList.add(Object)>
	//   12   26:pop             
	//   13   27:return          
	}

	public void addFragment(Fragment fragment, boolean flag)
	{
		if(DEBUG)
	//*   0    0:getstatic       #831 <Field boolean DEBUG>
	//*   1    3:ifeq            38
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #334 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #335 <Method void StringBuilder()>
	//    5   13:astore_3        
			stringbuilder.append("add: ");
	//    6   14:aload_3         
	//    7   15:ldc2            #833 <String "add: ">
	//    8   18:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (fragment)));
	//   10   22:aload_3         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   14   28:ldc1            #67  <String "FragmentManager">
	//   15   30:aload_3         
	//   16   31:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #839 <Method int Log.v(String, String)>
	//   18   37:pop             
		}
		makeActive(fragment);
	//   19   38:aload_0         
	//   20   39:aload_1         
	//   21   40:invokevirtual   #843 <Method void makeActive(Fragment)>
		if(!fragment.mDetached)
	//*  22   43:aload_1         
	//*  23   44:getfield        #846 <Field boolean Fragment.mDetached>
	//*  24   47:ifne            169
		{
			if(mAdded.contains(((Object) (fragment))))
	//*  25   50:aload_0         
	//*  26   51:getfield        #160 <Field ArrayList mAdded>
	//*  27   54:aload_1         
	//*  28   55:invokevirtual   #849 <Method boolean ArrayList.contains(Object)>
	//*  29   58:ifeq            95
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   30   61:new             #334 <Class StringBuilder>
	//   31   64:dup             
	//   32   65:invokespecial   #335 <Method void StringBuilder()>
	//   33   68:astore_3        
				stringbuilder1.append("Fragment already added: ");
	//   34   69:aload_3         
	//   35   70:ldc2            #851 <String "Fragment already added: ">
	//   36   73:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   37   76:pop             
				stringbuilder1.append(((Object) (fragment)));
	//   38   77:aload_3         
	//   39   78:aload_1         
	//   40   79:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   41   82:pop             
				throw new IllegalStateException(stringbuilder1.toString());
	//   42   83:new             #325 <Class IllegalStateException>
	//   43   86:dup             
	//   44   87:aload_3         
	//   45   88:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   46   91:invokespecial   #330 <Method void IllegalStateException(String)>
	//   47   94:athrow          
			}
			synchronized(mAdded)
	//*  48   95:aload_0         
	//*  49   96:getfield        #160 <Field ArrayList mAdded>
	//*  50   99:astore_3        
	//*  51  100:aload_3         
	//*  52  101:monitorenter    
			{
				mAdded.add(((Object) (fragment)));
	//   53  102:aload_0         
	//   54  103:getfield        #160 <Field ArrayList mAdded>
	//   55  106:aload_1         
	//   56  107:invokevirtual   #367 <Method boolean ArrayList.add(Object)>
	//   57  110:pop             
			}
	//   58  111:aload_3         
	//   59  112:monitorexit     
			fragment.mAdded = true;
	//   60  113:aload_1         
	//   61  114:iconst_1        
	//   62  115:putfield        #638 <Field boolean Fragment.mAdded>
			fragment.mRemoving = false;
	//   63  118:aload_1         
	//   64  119:iconst_0        
	//   65  120:putfield        #854 <Field boolean Fragment.mRemoving>
			if(fragment.mView == null)
	//*  66  123:aload_1         
	//*  67  124:getfield        #221 <Field View Fragment.mView>
	//*  68  127:ifnonnull       135
				fragment.mHiddenChanged = false;
	//   69  130:aload_1         
	//   70  131:iconst_0        
	//   71  132:putfield        #857 <Field boolean Fragment.mHiddenChanged>
			if(fragment.mHasMenu && fragment.mMenuVisible)
	//*  72  135:aload_1         
	//*  73  136:getfield        #860 <Field boolean Fragment.mHasMenu>
	//*  74  139:ifeq            154
	//*  75  142:aload_1         
	//*  76  143:getfield        #863 <Field boolean Fragment.mMenuVisible>
	//*  77  146:ifeq            154
				mNeedMenuInvalidate = true;
	//   78  149:aload_0         
	//   79  150:iconst_1        
	//   80  151:putfield        #865 <Field boolean mNeedMenuInvalidate>
			if(flag)
	//*  81  154:iload_2         
	//*  82  155:ifeq            169
			{
				moveToState(fragment);
	//   83  158:aload_0         
	//   84  159:aload_1         
	//   85  160:invokevirtual   #867 <Method void moveToState(Fragment)>
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
	//*   1    1:getfield        #871 <Field ArrayList mBackStackChangeListeners>
	//*   2    4:ifnonnull       18
			mBackStackChangeListeners = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #157 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #158 <Method void ArrayList()>
	//    7   15:putfield        #871 <Field ArrayList mBackStackChangeListeners>
		mBackStackChangeListeners.add(((Object) (onbackstackchangedlistener)));
	//    8   18:aload_0         
	//    9   19:getfield        #871 <Field ArrayList mBackStackChangeListeners>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #367 <Method boolean ArrayList.add(Object)>
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
	//*   3    3:getfield        #875 <Field ArrayList mAvailBackStackIndices>
	//*   4    6:ifnull          111
	//*   5    9:aload_0         
	//*   6   10:getfield        #875 <Field ArrayList mAvailBackStackIndices>
	//*   7   13:invokevirtual   #198 <Method int ArrayList.size()>
	//*   8   16:ifgt            22
			break MISSING_BLOCK_LABEL_111;
	//    9   19:goto            111
		int i;
		i = ((Integer)mAvailBackStackIndices.remove(mAvailBackStackIndices.size() - 1)).intValue();
	//   10   22:aload_0         
	//   11   23:getfield        #875 <Field ArrayList mAvailBackStackIndices>
	//   12   26:aload_0         
	//   13   27:getfield        #875 <Field ArrayList mAvailBackStackIndices>
	//   14   30:invokevirtual   #198 <Method int ArrayList.size()>
	//   15   33:iconst_1        
	//   16   34:isub            
	//   17   35:invokevirtual   #539 <Method Object ArrayList.remove(int)>
	//   18   38:checkcast       #877 <Class Integer>
	//   19   41:invokevirtual   #880 <Method int Integer.intValue()>
	//   20   44:istore_2        
		if(DEBUG)
	//*  21   45:getstatic       #831 <Field boolean DEBUG>
	//*  22   48:ifeq            97
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   23   51:new             #334 <Class StringBuilder>
	//   24   54:dup             
	//   25   55:invokespecial   #335 <Method void StringBuilder()>
	//   26   58:astore_3        
			stringbuilder.append("Adding back stack index ");
	//   27   59:aload_3         
	//   28   60:ldc2            #882 <String "Adding back stack index ">
	//   29   63:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   30   66:pop             
			stringbuilder.append(i);
	//   31   67:aload_3         
	//   32   68:iload_2         
	//   33   69:invokevirtual   #885 <Method StringBuilder StringBuilder.append(int)>
	//   34   72:pop             
			stringbuilder.append(" with ");
	//   35   73:aload_3         
	//   36   74:ldc2            #887 <String " with ">
	//   37   77:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   38   80:pop             
			stringbuilder.append(((Object) (backstackrecord)));
	//   39   81:aload_3         
	//   40   82:aload_1         
	//   41   83:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   42   86:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   43   87:ldc1            #67  <String "FragmentManager">
	//   44   89:aload_3         
	//   45   90:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   46   93:invokestatic    #839 <Method int Log.v(String, String)>
	//   47   96:pop             
		}
		mBackStackIndices.set(i, ((Object) (backstackrecord)));
	//   48   97:aload_0         
	//   49   98:getfield        #889 <Field ArrayList mBackStackIndices>
	//   50  101:iload_2         
	//   51  102:aload_1         
	//   52  103:invokevirtual   #893 <Method Object ArrayList.set(int, Object)>
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
	//*  59  112:getfield        #889 <Field ArrayList mBackStackIndices>
	//*  60  115:ifnonnull       129
			mBackStackIndices = new ArrayList();
	//   61  118:aload_0         
	//   62  119:new             #157 <Class ArrayList>
	//   63  122:dup             
	//   64  123:invokespecial   #158 <Method void ArrayList()>
	//   65  126:putfield        #889 <Field ArrayList mBackStackIndices>
		i = mBackStackIndices.size();
	//   66  129:aload_0         
	//   67  130:getfield        #889 <Field ArrayList mBackStackIndices>
	//   68  133:invokevirtual   #198 <Method int ArrayList.size()>
	//   69  136:istore_2        
		if(DEBUG)
	//*  70  137:getstatic       #831 <Field boolean DEBUG>
	//*  71  140:ifeq            189
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   72  143:new             #334 <Class StringBuilder>
	//   73  146:dup             
	//   74  147:invokespecial   #335 <Method void StringBuilder()>
	//   75  150:astore_3        
			stringbuilder1.append("Setting back stack index ");
	//   76  151:aload_3         
	//   77  152:ldc2            #895 <String "Setting back stack index ">
	//   78  155:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   79  158:pop             
			stringbuilder1.append(i);
	//   80  159:aload_3         
	//   81  160:iload_2         
	//   82  161:invokevirtual   #885 <Method StringBuilder StringBuilder.append(int)>
	//   83  164:pop             
			stringbuilder1.append(" to ");
	//   84  165:aload_3         
	//   85  166:ldc2            #897 <String " to ">
	//   86  169:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   87  172:pop             
			stringbuilder1.append(((Object) (backstackrecord)));
	//   88  173:aload_3         
	//   89  174:aload_1         
	//   90  175:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   91  178:pop             
			Log.v("FragmentManager", stringbuilder1.toString());
	//   92  179:ldc1            #67  <String "FragmentManager">
	//   93  181:aload_3         
	//   94  182:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   95  185:invokestatic    #839 <Method int Log.v(String, String)>
	//   96  188:pop             
		}
		mBackStackIndices.add(((Object) (backstackrecord)));
	//   97  189:aload_0         
	//   98  190:getfield        #889 <Field ArrayList mBackStackIndices>
	//   99  193:aload_1         
	//  100  194:invokevirtual   #367 <Method boolean ArrayList.add(Object)>
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
	//*   1    1:getfield        #438 <Field FragmentHostCallback mHost>
	//*   2    4:ifnull          18
		{
			throw new IllegalStateException("Already attached");
	//    3    7:new             #325 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #901 <String "Already attached">
	//    6   14:invokespecial   #330 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			mHost = fragmenthostcallback;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #438 <Field FragmentHostCallback mHost>
			mContainer = fragmentcontainer;
	//   11   23:aload_0         
	//   12   24:aload_2         
	//   13   25:putfield        #903 <Field FragmentContainer mContainer>
			mParent = fragment;
	//   14   28:aload_0         
	//   15   29:aload_3         
	//   16   30:putfield        #905 <Field Fragment mParent>
			return;
	//   17   33:return          
		}
	}

	public void attachFragment(Fragment fragment)
	{
		if(DEBUG)
	//*   0    0:getstatic       #831 <Field boolean DEBUG>
	//*   1    3:ifeq            38
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #334 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #335 <Method void StringBuilder()>
	//    5   13:astore_2        
			stringbuilder.append("attach: ");
	//    6   14:aload_2         
	//    7   15:ldc2            #908 <String "attach: ">
	//    8   18:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (fragment)));
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   14   28:ldc1            #67  <String "FragmentManager">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #839 <Method int Log.v(String, String)>
	//   18   37:pop             
		}
		if(fragment.mDetached)
	//*  19   38:aload_1         
	//*  20   39:getfield        #846 <Field boolean Fragment.mDetached>
	//*  21   42:ifeq            188
		{
			fragment.mDetached = false;
	//   22   45:aload_1         
	//   23   46:iconst_0        
	//   24   47:putfield        #846 <Field boolean Fragment.mDetached>
			if(!fragment.mAdded)
	//*  25   50:aload_1         
	//*  26   51:getfield        #638 <Field boolean Fragment.mAdded>
	//*  27   54:ifne            188
			{
				if(mAdded.contains(((Object) (fragment))))
	//*  28   57:aload_0         
	//*  29   58:getfield        #160 <Field ArrayList mAdded>
	//*  30   61:aload_1         
	//*  31   62:invokevirtual   #849 <Method boolean ArrayList.contains(Object)>
	//*  32   65:ifeq            102
				{
					StringBuilder stringbuilder1 = new StringBuilder();
	//   33   68:new             #334 <Class StringBuilder>
	//   34   71:dup             
	//   35   72:invokespecial   #335 <Method void StringBuilder()>
	//   36   75:astore_2        
					stringbuilder1.append("Fragment already added: ");
	//   37   76:aload_2         
	//   38   77:ldc2            #851 <String "Fragment already added: ">
	//   39   80:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   40   83:pop             
					stringbuilder1.append(((Object) (fragment)));
	//   41   84:aload_2         
	//   42   85:aload_1         
	//   43   86:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   44   89:pop             
					throw new IllegalStateException(stringbuilder1.toString());
	//   45   90:new             #325 <Class IllegalStateException>
	//   46   93:dup             
	//   47   94:aload_2         
	//   48   95:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   49   98:invokespecial   #330 <Method void IllegalStateException(String)>
	//   50  101:athrow          
				}
				if(DEBUG)
	//*  51  102:getstatic       #831 <Field boolean DEBUG>
	//*  52  105:ifeq            140
				{
					StringBuilder stringbuilder2 = new StringBuilder();
	//   53  108:new             #334 <Class StringBuilder>
	//   54  111:dup             
	//   55  112:invokespecial   #335 <Method void StringBuilder()>
	//   56  115:astore_2        
					stringbuilder2.append("add from attach: ");
	//   57  116:aload_2         
	//   58  117:ldc2            #910 <String "add from attach: ">
	//   59  120:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   60  123:pop             
					stringbuilder2.append(((Object) (fragment)));
	//   61  124:aload_2         
	//   62  125:aload_1         
	//   63  126:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   64  129:pop             
					Log.v("FragmentManager", stringbuilder2.toString());
	//   65  130:ldc1            #67  <String "FragmentManager">
	//   66  132:aload_2         
	//   67  133:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   68  136:invokestatic    #839 <Method int Log.v(String, String)>
	//   69  139:pop             
				}
				synchronized(mAdded)
	//*  70  140:aload_0         
	//*  71  141:getfield        #160 <Field ArrayList mAdded>
	//*  72  144:astore_2        
	//*  73  145:aload_2         
	//*  74  146:monitorenter    
				{
					mAdded.add(((Object) (fragment)));
	//   75  147:aload_0         
	//   76  148:getfield        #160 <Field ArrayList mAdded>
	//   77  151:aload_1         
	//   78  152:invokevirtual   #367 <Method boolean ArrayList.add(Object)>
	//   79  155:pop             
				}
	//   80  156:aload_2         
	//   81  157:monitorexit     
				fragment.mAdded = true;
	//   82  158:aload_1         
	//   83  159:iconst_1        
	//   84  160:putfield        #638 <Field boolean Fragment.mAdded>
				if(fragment.mHasMenu && fragment.mMenuVisible)
	//*  85  163:aload_1         
	//*  86  164:getfield        #860 <Field boolean Fragment.mHasMenu>
	//*  87  167:ifeq            188
	//*  88  170:aload_1         
	//*  89  171:getfield        #863 <Field boolean Fragment.mMenuVisible>
	//*  90  174:ifeq            188
				{
					mNeedMenuInvalidate = true;
	//   91  177:aload_0         
	//   92  178:iconst_1        
	//   93  179:putfield        #865 <Field boolean mNeedMenuInvalidate>
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
	//    0    0:new             #357 <Class BackStackRecord>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #913 <Method void BackStackRecord(FragmentManagerImpl)>
	//    4    8:areturn         
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
	//   12   20:invokevirtual   #917 <Method int Fragment.getNextTransitionStyle()>
	//   13   23:invokevirtual   #921 <Method FragmentManagerImpl$AnimationOrAnimator loadAnimation(Fragment, int, boolean, int)>
	//   14   26:astore_3        
			if(animationoranimator != null && animationoranimator.animator != null)
	//*  15   27:aload_3         
	//*  16   28:ifnull          139
	//*  17   31:aload_3         
	//*  18   32:getfield        #276 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//*  19   35:ifnull          139
			{
				animationoranimator.animator.setTarget(((Object) (fragment.mView)));
	//   20   38:aload_3         
	//   21   39:getfield        #276 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   22   42:aload_1         
	//   23   43:getfield        #221 <Field View Fragment.mView>
	//   24   46:invokevirtual   #301 <Method void Animator.setTarget(Object)>
				if(fragment.mHidden)
	//*  25   49:aload_1         
	//*  26   50:getfield        #224 <Field boolean Fragment.mHidden>
	//*  27   53:ifeq            113
				{
					if(fragment.isHideReplaced())
	//*  28   56:aload_1         
	//*  29   57:invokevirtual   #924 <Method boolean Fragment.isHideReplaced()>
	//*  30   60:ifeq            71
					{
						fragment.setHideReplaced(false);
	//   31   63:aload_1         
	//   32   64:iconst_0        
	//   33   65:invokevirtual   #927 <Method void Fragment.setHideReplaced(boolean)>
					} else
	//*  34   68:goto            121
					{
						final ViewGroup container = fragment.mContainer;
	//   35   71:aload_1         
	//   36   72:getfield        #283 <Field ViewGroup Fragment.mContainer>
	//   37   75:astore          4
						final View animatingView = fragment.mView;
	//   38   77:aload_1         
	//   39   78:getfield        #221 <Field View Fragment.mView>
	//   40   81:astore          5
						container.startViewTransition(animatingView);
	//   41   83:aload           4
	//   42   85:aload           5
	//   43   87:invokevirtual   #288 <Method void ViewGroup.startViewTransition(View)>
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
	//   45   91:getfield        #276 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   46   94:new             #14  <Class FragmentManagerImpl$4>
	//   47   97:dup             
	//   48   98:aload_0         
	//   49   99:aload           4
	//   50  101:aload           5
	//   51  103:aload_1         
	//   52  104:invokespecial   #928 <Method void FragmentManagerImpl$4(FragmentManagerImpl, ViewGroup, View, Fragment)>
	//   53  107:invokevirtual   #297 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
					}
				} else
	//*  54  110:goto            121
				{
					fragment.mView.setVisibility(0);
	//   55  113:aload_1         
	//   56  114:getfield        #221 <Field View Fragment.mView>
	//   57  117:iconst_0        
	//   58  118:invokevirtual   #931 <Method void View.setVisibility(int)>
				}
				setHWLayerAnimListenerIfAlpha(fragment.mView, animationoranimator);
	//   59  121:aload_1         
	//   60  122:getfield        #221 <Field View Fragment.mView>
	//   61  125:aload_3         
	//   62  126:invokestatic    #266 <Method void setHWLayerAnimListenerIfAlpha(View, FragmentManagerImpl$AnimationOrAnimator)>
				animationoranimator.animator.start();
	//   63  129:aload_3         
	//   64  130:getfield        #276 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   65  133:invokevirtual   #304 <Method void Animator.start()>
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
	//   72  148:invokestatic    #266 <Method void setHWLayerAnimListenerIfAlpha(View, FragmentManagerImpl$AnimationOrAnimator)>
					fragment.mView.startAnimation(animationoranimator.animation);
	//   73  151:aload_1         
	//   74  152:getfield        #221 <Field View Fragment.mView>
	//   75  155:aload_3         
	//   76  156:getfield        #245 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   77  159:invokevirtual   #272 <Method void View.startAnimation(Animation)>
					animationoranimator.animation.start();
	//   78  162:aload_3         
	//   79  163:getfield        #245 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   80  166:invokevirtual   #932 <Method void Animation.start()>
				}
				byte byte0;
				if(fragment.mHidden && !fragment.isHideReplaced())
	//*  81  169:aload_1         
	//*  82  170:getfield        #224 <Field boolean Fragment.mHidden>
	//*  83  173:ifeq            189
	//*  84  176:aload_1         
	//*  85  177:invokevirtual   #924 <Method boolean Fragment.isHideReplaced()>
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
	//   95  196:invokevirtual   #931 <Method void View.setVisibility(int)>
				if(fragment.isHideReplaced())
	//*  96  199:aload_1         
	//*  97  200:invokevirtual   #924 <Method boolean Fragment.isHideReplaced()>
	//*  98  203:ifeq            211
					fragment.setHideReplaced(false);
	//   99  206:aload_1         
	//  100  207:iconst_0        
	//  101  208:invokevirtual   #927 <Method void Fragment.setHideReplaced(boolean)>
			}
		}
		if(fragment.mAdded && fragment.mHasMenu && fragment.mMenuVisible)
	//* 102  211:aload_1         
	//* 103  212:getfield        #638 <Field boolean Fragment.mAdded>
	//* 104  215:ifeq            237
	//* 105  218:aload_1         
	//* 106  219:getfield        #860 <Field boolean Fragment.mHasMenu>
	//* 107  222:ifeq            237
	//* 108  225:aload_1         
	//* 109  226:getfield        #863 <Field boolean Fragment.mMenuVisible>
	//* 110  229:ifeq            237
			mNeedMenuInvalidate = true;
	//  111  232:aload_0         
	//  112  233:iconst_1        
	//  113  234:putfield        #865 <Field boolean mNeedMenuInvalidate>
		fragment.mHiddenChanged = false;
	//  114  237:aload_1         
	//  115  238:iconst_0        
	//  116  239:putfield        #857 <Field boolean Fragment.mHiddenChanged>
		fragment.onHiddenChanged(fragment.mHidden);
	//  117  242:aload_1         
	//  118  243:aload_1         
	//  119  244:getfield        #224 <Field boolean Fragment.mHidden>
	//  120  247:invokevirtual   #935 <Method void Fragment.onHiddenChanged(boolean)>
	//  121  250:return          
	}

	public void detachFragment(Fragment fragment)
	{
		if(DEBUG)
	//*   0    0:getstatic       #831 <Field boolean DEBUG>
	//*   1    3:ifeq            38
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #334 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #335 <Method void StringBuilder()>
	//    5   13:astore_2        
			stringbuilder.append("detach: ");
	//    6   14:aload_2         
	//    7   15:ldc2            #938 <String "detach: ">
	//    8   18:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (fragment)));
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   14   28:ldc1            #67  <String "FragmentManager">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #839 <Method int Log.v(String, String)>
	//   18   37:pop             
		}
		if(!fragment.mDetached)
	//*  19   38:aload_1         
	//*  20   39:getfield        #846 <Field boolean Fragment.mDetached>
	//*  21   42:ifne            143
		{
			fragment.mDetached = true;
	//   22   45:aload_1         
	//   23   46:iconst_1        
	//   24   47:putfield        #846 <Field boolean Fragment.mDetached>
			if(fragment.mAdded)
	//*  25   50:aload_1         
	//*  26   51:getfield        #638 <Field boolean Fragment.mAdded>
	//*  27   54:ifeq            143
			{
				if(DEBUG)
	//*  28   57:getstatic       #831 <Field boolean DEBUG>
	//*  29   60:ifeq            95
				{
					StringBuilder stringbuilder1 = new StringBuilder();
	//   30   63:new             #334 <Class StringBuilder>
	//   31   66:dup             
	//   32   67:invokespecial   #335 <Method void StringBuilder()>
	//   33   70:astore_2        
					stringbuilder1.append("remove from detach: ");
	//   34   71:aload_2         
	//   35   72:ldc2            #940 <String "remove from detach: ">
	//   36   75:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   37   78:pop             
					stringbuilder1.append(((Object) (fragment)));
	//   38   79:aload_2         
	//   39   80:aload_1         
	//   40   81:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   41   84:pop             
					Log.v("FragmentManager", stringbuilder1.toString());
	//   42   85:ldc1            #67  <String "FragmentManager">
	//   43   87:aload_2         
	//   44   88:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   45   91:invokestatic    #839 <Method int Log.v(String, String)>
	//   46   94:pop             
				}
				synchronized(mAdded)
	//*  47   95:aload_0         
	//*  48   96:getfield        #160 <Field ArrayList mAdded>
	//*  49   99:astore_2        
	//*  50  100:aload_2         
	//*  51  101:monitorenter    
				{
					mAdded.remove(((Object) (fragment)));
	//   52  102:aload_0         
	//   53  103:getfield        #160 <Field ArrayList mAdded>
	//   54  106:aload_1         
	//   55  107:invokevirtual   #942 <Method boolean ArrayList.remove(Object)>
	//   56  110:pop             
				}
	//   57  111:aload_2         
	//   58  112:monitorexit     
				if(fragment.mHasMenu && fragment.mMenuVisible)
	//*  59  113:aload_1         
	//*  60  114:getfield        #860 <Field boolean Fragment.mHasMenu>
	//*  61  117:ifeq            132
	//*  62  120:aload_1         
	//*  63  121:getfield        #863 <Field boolean Fragment.mMenuVisible>
	//*  64  124:ifeq            132
					mNeedMenuInvalidate = true;
	//   65  127:aload_0         
	//   66  128:iconst_1        
	//   67  129:putfield        #865 <Field boolean mNeedMenuInvalidate>
				fragment.mAdded = false;
	//   68  132:aload_1         
	//   69  133:iconst_0        
	//   70  134:putfield        #638 <Field boolean Fragment.mAdded>
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
	//    2    2:putfield        #323 <Field boolean mStateSaved>
		dispatchStateChange(2);
	//    3    5:aload_0         
	//    4    6:iconst_2        
	//    5    7:invokespecial   #945 <Method void dispatchStateChange(int)>
	//    6   10:return          
	}

	public void dispatchConfigurationChanged(Configuration configuration)
	{
		for(int i = 0; i < mAdded.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #160 <Field ArrayList mAdded>
	//*   5    7:invokevirtual   #198 <Method int ArrayList.size()>
	//*   6   10:icmpge          41
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #160 <Field ArrayList mAdded>
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
	//   17   31:invokevirtual   #950 <Method void Fragment.performConfigurationChanged(Configuration)>
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
		for(int i = 0; i < mAdded.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #160 <Field ArrayList mAdded>
	//*   5    7:invokevirtual   #198 <Method int ArrayList.size()>
	//*   6   10:icmpge          46
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #160 <Field ArrayList mAdded>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #204 <Class Fragment>
	//   12   24:astore_3        
			if(fragment != null && fragment.performContextItemSelected(menuitem))
	//*  13   25:aload_3         
	//*  14   26:ifnull          39
	//*  15   29:aload_3         
	//*  16   30:aload_1         
	//*  17   31:invokevirtual   #955 <Method boolean Fragment.performContextItemSelected(MenuItem)>
	//*  18   34:ifeq            39
				return true;
	//   19   37:iconst_1        
	//   20   38:ireturn         
		}

	//   21   39:iload_2         
	//   22   40:iconst_1        
	//   23   41:iadd            
	//   24   42:istore_2        
	//*  25   43:goto            2
		return false;
	//   26   46:iconst_0        
	//   27   47:ireturn         
	}

	public void dispatchCreate()
	{
		mStateSaved = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #323 <Field boolean mStateSaved>
		dispatchStateChange(1);
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokespecial   #945 <Method void dispatchStateChange(int)>
	//    6   10:return          
	}

	public boolean dispatchCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		ArrayList arraylist = null;
	//    2    3:aconst_null     
	//    3    4:astore          7
		int i = 0;
	//    4    6:iconst_0        
	//    5    7:istore_3        
		boolean flag1;
		boolean flag2;
		for(flag1 = false; i < mAdded.size(); flag1 = flag2)
	//*   6    8:iconst_0        
	//*   7    9:istore          5
	//*   8   11:iload_3         
	//*   9   12:aload_0         
	//*  10   13:getfield        #160 <Field ArrayList mAdded>
	//*  11   16:invokevirtual   #198 <Method int ArrayList.size()>
	//*  12   19:icmpge          110
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//   13   22:aload_0         
	//   14   23:getfield        #160 <Field ArrayList mAdded>
	//   15   26:iload_3         
	//   16   27:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   17   30:checkcast       #204 <Class Fragment>
	//   18   33:astore          9
			ArrayList arraylist1 = arraylist;
	//   19   35:aload           7
	//   20   37:astore          8
			flag2 = flag1;
	//   21   39:iload           5
	//   22   41:istore          6
			if(fragment != null)
	//*  23   43:aload           9
	//*  24   45:ifnull          95
			{
				arraylist1 = arraylist;
	//   25   48:aload           7
	//   26   50:astore          8
				flag2 = flag1;
	//   27   52:iload           5
	//   28   54:istore          6
				if(fragment.performCreateOptionsMenu(menu, menuinflater))
	//*  29   56:aload           9
	//*  30   58:aload_1         
	//*  31   59:aload_2         
	//*  32   60:invokevirtual   #961 <Method boolean Fragment.performCreateOptionsMenu(Menu, MenuInflater)>
	//*  33   63:ifeq            95
				{
					arraylist1 = arraylist;
	//   34   66:aload           7
	//   35   68:astore          8
					if(arraylist == null)
	//*  36   70:aload           7
	//*  37   72:ifnonnull       84
						arraylist1 = new ArrayList();
	//   38   75:new             #157 <Class ArrayList>
	//   39   78:dup             
	//   40   79:invokespecial   #158 <Method void ArrayList()>
	//   41   82:astore          8
					arraylist1.add(((Object) (fragment)));
	//   42   84:aload           8
	//   43   86:aload           9
	//   44   88:invokevirtual   #367 <Method boolean ArrayList.add(Object)>
	//   45   91:pop             
					flag2 = true;
	//   46   92:iconst_1        
	//   47   93:istore          6
				}
			}
			i++;
	//   48   95:iload_3         
	//   49   96:iconst_1        
	//   50   97:iadd            
	//   51   98:istore_3        
			arraylist = arraylist1;
	//   52   99:aload           8
	//   53  101:astore          7
		}

	//   54  103:iload           6
	//   55  105:istore          5
	//*  56  107:goto            11
		if(mCreatedMenus != null)
	//*  57  110:aload_0         
	//*  58  111:getfield        #963 <Field ArrayList mCreatedMenus>
	//*  59  114:ifnull          168
		{
			for(int k = ((int) (flag)); k < mCreatedMenus.size(); k++)
	//*  60  117:iload           4
	//*  61  119:istore_3        
	//*  62  120:iload_3         
	//*  63  121:aload_0         
	//*  64  122:getfield        #963 <Field ArrayList mCreatedMenus>
	//*  65  125:invokevirtual   #198 <Method int ArrayList.size()>
	//*  66  128:icmpge          168
			{
				menu = ((Menu) ((Fragment)mCreatedMenus.get(k)));
	//   67  131:aload_0         
	//   68  132:getfield        #963 <Field ArrayList mCreatedMenus>
	//   69  135:iload_3         
	//   70  136:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   71  139:checkcast       #204 <Class Fragment>
	//   72  142:astore_1        
				if(arraylist == null || !arraylist.contains(((Object) (menu))))
	//*  73  143:aload           7
	//*  74  145:ifnull          157
	//*  75  148:aload           7
	//*  76  150:aload_1         
	//*  77  151:invokevirtual   #849 <Method boolean ArrayList.contains(Object)>
	//*  78  154:ifne            161
					((Fragment) (menu)).onDestroyOptionsMenu();
	//   79  157:aload_1         
	//   80  158:invokevirtual   #966 <Method void Fragment.onDestroyOptionsMenu()>
			}

	//   81  161:iload_3         
	//   82  162:iconst_1        
	//   83  163:iadd            
	//   84  164:istore_3        
		}
	//*  85  165:goto            120
		mCreatedMenus = arraylist;
	//   86  168:aload_0         
	//   87  169:aload           7
	//   88  171:putfield        #963 <Field ArrayList mCreatedMenus>
		return flag1;
	//   89  174:iload           5
	//   90  176:ireturn         
	}

	public void dispatchDestroy()
	{
		mDestroyed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #969 <Field boolean mDestroyed>
		execPendingActions();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #402 <Method boolean execPendingActions()>
	//    5    9:pop             
		dispatchStateChange(0);
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:invokespecial   #945 <Method void dispatchStateChange(int)>
		mHost = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #438 <Field FragmentHostCallback mHost>
		mContainer = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #903 <Field FragmentContainer mContainer>
		mParent = null;
	//   15   25:aload_0         
	//   16   26:aconst_null     
	//   17   27:putfield        #905 <Field Fragment mParent>
	//   18   30:return          
	}

	public void dispatchDestroyView()
	{
		dispatchStateChange(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #945 <Method void dispatchStateChange(int)>
	//    3    5:return          
	}

	public void dispatchLowMemory()
	{
		for(int i = 0; i < mAdded.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #160 <Field ArrayList mAdded>
	//*   5    7:invokevirtual   #198 <Method int ArrayList.size()>
	//*   6   10:icmpge          40
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #160 <Field ArrayList mAdded>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #204 <Class Fragment>
	//   12   24:astore_2        
			if(fragment != null)
	//*  13   25:aload_2         
	//*  14   26:ifnull          33
				fragment.performLowMemory();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #974 <Method void Fragment.performLowMemory()>
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
	//*   1    1:getfield        #160 <Field ArrayList mAdded>
	//*   2    4:invokevirtual   #198 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            42
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    8   14:aload_0         
	//    9   15:getfield        #160 <Field ArrayList mAdded>
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
	//   18   32:invokevirtual   #978 <Method void Fragment.performMultiWindowModeChanged(boolean)>
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
	//*   1    1:getfield        #905 <Field Fragment mParent>
	//*   2    4:ifnull          35
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #905 <Field Fragment mParent>
	//    5   11:invokevirtual   #983 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   15   32:invokevirtual   #985 <Method void dispatchOnFragmentActivityCreated(Fragment, Bundle, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   16   35:aload_0         
	//   17   36:getfield        #165 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   39:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   42:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   20   44:aload           4
	//   21   46:invokeinterface #760 <Method boolean Iterator.hasNext()>
	//   22   51:ifeq            101
			j j1 = (j)iterator.next();
	//   23   54:aload           4
	//   24   56:invokeinterface #764 <Method Object Iterator.next()>
	//   25   61:checkcast       #988 <Class j>
	//   26   64:astore          5
			if(!flag || ((Boolean)j1.b).booleanValue())
	//*  27   66:iload_3         
	//*  28   67:ifeq            84
	//*  29   70:aload           5
	//*  30   72:getfield        #991 <Field Object j.b>
	//*  31   75:checkcast       #369 <Class Boolean>
	//*  32   78:invokevirtual   #461 <Method boolean Boolean.booleanValue()>
	//*  33   81:ifeq            44
				((FragmentManager.FragmentLifecycleCallbacks)j1.a).onFragmentActivityCreated(((FragmentManager) (this)), fragment, bundle);
	//   34   84:aload           5
	//   35   86:getfield        #994 <Field Object j.a>
	//   36   89:checkcast       #996 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   37   92:aload_0         
	//   38   93:aload_1         
	//   39   94:aload_2         
	//   40   95:invokevirtual   #1000 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentActivityCreated(FragmentManager, Fragment, Bundle)>
		} while(true);
	//   41   98:goto            44
	//   42  101:return          
	}

	void dispatchOnFragmentAttached(Fragment fragment, Context context, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #905 <Field Fragment mParent>
	//*   2    4:ifnull          35
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #905 <Field Fragment mParent>
	//    5   11:invokevirtual   #983 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   15   32:invokevirtual   #1004 <Method void dispatchOnFragmentAttached(Fragment, Context, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   16   35:aload_0         
	//   17   36:getfield        #165 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   39:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   42:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   20   44:aload           4
	//   21   46:invokeinterface #760 <Method boolean Iterator.hasNext()>
	//   22   51:ifeq            101
			j j1 = (j)iterator.next();
	//   23   54:aload           4
	//   24   56:invokeinterface #764 <Method Object Iterator.next()>
	//   25   61:checkcast       #988 <Class j>
	//   26   64:astore          5
			if(!flag || ((Boolean)j1.b).booleanValue())
	//*  27   66:iload_3         
	//*  28   67:ifeq            84
	//*  29   70:aload           5
	//*  30   72:getfield        #991 <Field Object j.b>
	//*  31   75:checkcast       #369 <Class Boolean>
	//*  32   78:invokevirtual   #461 <Method boolean Boolean.booleanValue()>
	//*  33   81:ifeq            44
				((FragmentManager.FragmentLifecycleCallbacks)j1.a).onFragmentAttached(((FragmentManager) (this)), fragment, context);
	//   34   84:aload           5
	//   35   86:getfield        #994 <Field Object j.a>
	//   36   89:checkcast       #996 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   37   92:aload_0         
	//   38   93:aload_1         
	//   39   94:aload_2         
	//   40   95:invokevirtual   #1008 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentAttached(FragmentManager, Fragment, Context)>
		} while(true);
	//   41   98:goto            44
	//   42  101:return          
	}

	void dispatchOnFragmentCreated(Fragment fragment, Bundle bundle, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #905 <Field Fragment mParent>
	//*   2    4:ifnull          35
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #905 <Field Fragment mParent>
	//    5   11:invokevirtual   #983 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   15   32:invokevirtual   #1011 <Method void dispatchOnFragmentCreated(Fragment, Bundle, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   16   35:aload_0         
	//   17   36:getfield        #165 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   39:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   42:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   20   44:aload           4
	//   21   46:invokeinterface #760 <Method boolean Iterator.hasNext()>
	//   22   51:ifeq            101
			j j1 = (j)iterator.next();
	//   23   54:aload           4
	//   24   56:invokeinterface #764 <Method Object Iterator.next()>
	//   25   61:checkcast       #988 <Class j>
	//   26   64:astore          5
			if(!flag || ((Boolean)j1.b).booleanValue())
	//*  27   66:iload_3         
	//*  28   67:ifeq            84
	//*  29   70:aload           5
	//*  30   72:getfield        #991 <Field Object j.b>
	//*  31   75:checkcast       #369 <Class Boolean>
	//*  32   78:invokevirtual   #461 <Method boolean Boolean.booleanValue()>
	//*  33   81:ifeq            44
				((FragmentManager.FragmentLifecycleCallbacks)j1.a).onFragmentCreated(((FragmentManager) (this)), fragment, bundle);
	//   34   84:aload           5
	//   35   86:getfield        #994 <Field Object j.a>
	//   36   89:checkcast       #996 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   37   92:aload_0         
	//   38   93:aload_1         
	//   39   94:aload_2         
	//   40   95:invokevirtual   #1014 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentCreated(FragmentManager, Fragment, Bundle)>
		} while(true);
	//   41   98:goto            44
	//   42  101:return          
	}

	void dispatchOnFragmentDestroyed(Fragment fragment, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #905 <Field Fragment mParent>
	//*   2    4:ifnull          31
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #905 <Field Fragment mParent>
	//    5   11:invokevirtual   #983 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   14   28:invokevirtual   #1017 <Method void dispatchOnFragmentDestroyed(Fragment, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   15   31:aload_0         
	//   16   32:getfield        #165 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   17   35:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   18   38:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   19   39:aload_3         
	//   20   40:invokeinterface #760 <Method boolean Iterator.hasNext()>
	//   21   45:ifeq            93
			j j1 = (j)iterator.next();
	//   22   48:aload_3         
	//   23   49:invokeinterface #764 <Method Object Iterator.next()>
	//   24   54:checkcast       #988 <Class j>
	//   25   57:astore          4
			if(!flag || ((Boolean)j1.b).booleanValue())
	//*  26   59:iload_2         
	//*  27   60:ifeq            77
	//*  28   63:aload           4
	//*  29   65:getfield        #991 <Field Object j.b>
	//*  30   68:checkcast       #369 <Class Boolean>
	//*  31   71:invokevirtual   #461 <Method boolean Boolean.booleanValue()>
	//*  32   74:ifeq            39
				((FragmentManager.FragmentLifecycleCallbacks)j1.a).onFragmentDestroyed(((FragmentManager) (this)), fragment);
	//   33   77:aload           4
	//   34   79:getfield        #994 <Field Object j.a>
	//   35   82:checkcast       #996 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   36   85:aload_0         
	//   37   86:aload_1         
	//   38   87:invokevirtual   #1021 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentDestroyed(FragmentManager, Fragment)>
		} while(true);
	//   39   90:goto            39
	//   40   93:return          
	}

	void dispatchOnFragmentDetached(Fragment fragment, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #905 <Field Fragment mParent>
	//*   2    4:ifnull          31
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #905 <Field Fragment mParent>
	//    5   11:invokevirtual   #983 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   14   28:invokevirtual   #1024 <Method void dispatchOnFragmentDetached(Fragment, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   15   31:aload_0         
	//   16   32:getfield        #165 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   17   35:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   18   38:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   19   39:aload_3         
	//   20   40:invokeinterface #760 <Method boolean Iterator.hasNext()>
	//   21   45:ifeq            93
			j j1 = (j)iterator.next();
	//   22   48:aload_3         
	//   23   49:invokeinterface #764 <Method Object Iterator.next()>
	//   24   54:checkcast       #988 <Class j>
	//   25   57:astore          4
			if(!flag || ((Boolean)j1.b).booleanValue())
	//*  26   59:iload_2         
	//*  27   60:ifeq            77
	//*  28   63:aload           4
	//*  29   65:getfield        #991 <Field Object j.b>
	//*  30   68:checkcast       #369 <Class Boolean>
	//*  31   71:invokevirtual   #461 <Method boolean Boolean.booleanValue()>
	//*  32   74:ifeq            39
				((FragmentManager.FragmentLifecycleCallbacks)j1.a).onFragmentDetached(((FragmentManager) (this)), fragment);
	//   33   77:aload           4
	//   34   79:getfield        #994 <Field Object j.a>
	//   35   82:checkcast       #996 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   36   85:aload_0         
	//   37   86:aload_1         
	//   38   87:invokevirtual   #1027 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentDetached(FragmentManager, Fragment)>
		} while(true);
	//   39   90:goto            39
	//   40   93:return          
	}

	void dispatchOnFragmentPaused(Fragment fragment, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #905 <Field Fragment mParent>
	//*   2    4:ifnull          31
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #905 <Field Fragment mParent>
	//    5   11:invokevirtual   #983 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   14   28:invokevirtual   #1030 <Method void dispatchOnFragmentPaused(Fragment, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   15   31:aload_0         
	//   16   32:getfield        #165 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   17   35:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   18   38:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   19   39:aload_3         
	//   20   40:invokeinterface #760 <Method boolean Iterator.hasNext()>
	//   21   45:ifeq            93
			j j1 = (j)iterator.next();
	//   22   48:aload_3         
	//   23   49:invokeinterface #764 <Method Object Iterator.next()>
	//   24   54:checkcast       #988 <Class j>
	//   25   57:astore          4
			if(!flag || ((Boolean)j1.b).booleanValue())
	//*  26   59:iload_2         
	//*  27   60:ifeq            77
	//*  28   63:aload           4
	//*  29   65:getfield        #991 <Field Object j.b>
	//*  30   68:checkcast       #369 <Class Boolean>
	//*  31   71:invokevirtual   #461 <Method boolean Boolean.booleanValue()>
	//*  32   74:ifeq            39
				((FragmentManager.FragmentLifecycleCallbacks)j1.a).onFragmentPaused(((FragmentManager) (this)), fragment);
	//   33   77:aload           4
	//   34   79:getfield        #994 <Field Object j.a>
	//   35   82:checkcast       #996 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   36   85:aload_0         
	//   37   86:aload_1         
	//   38   87:invokevirtual   #1033 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentPaused(FragmentManager, Fragment)>
		} while(true);
	//   39   90:goto            39
	//   40   93:return          
	}

	void dispatchOnFragmentPreAttached(Fragment fragment, Context context, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #905 <Field Fragment mParent>
	//*   2    4:ifnull          35
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #905 <Field Fragment mParent>
	//    5   11:invokevirtual   #983 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   15   32:invokevirtual   #1036 <Method void dispatchOnFragmentPreAttached(Fragment, Context, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   16   35:aload_0         
	//   17   36:getfield        #165 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   39:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   42:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   20   44:aload           4
	//   21   46:invokeinterface #760 <Method boolean Iterator.hasNext()>
	//   22   51:ifeq            101
			j j1 = (j)iterator.next();
	//   23   54:aload           4
	//   24   56:invokeinterface #764 <Method Object Iterator.next()>
	//   25   61:checkcast       #988 <Class j>
	//   26   64:astore          5
			if(!flag || ((Boolean)j1.b).booleanValue())
	//*  27   66:iload_3         
	//*  28   67:ifeq            84
	//*  29   70:aload           5
	//*  30   72:getfield        #991 <Field Object j.b>
	//*  31   75:checkcast       #369 <Class Boolean>
	//*  32   78:invokevirtual   #461 <Method boolean Boolean.booleanValue()>
	//*  33   81:ifeq            44
				((FragmentManager.FragmentLifecycleCallbacks)j1.a).onFragmentPreAttached(((FragmentManager) (this)), fragment, context);
	//   34   84:aload           5
	//   35   86:getfield        #994 <Field Object j.a>
	//   36   89:checkcast       #996 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   37   92:aload_0         
	//   38   93:aload_1         
	//   39   94:aload_2         
	//   40   95:invokevirtual   #1039 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentPreAttached(FragmentManager, Fragment, Context)>
		} while(true);
	//   41   98:goto            44
	//   42  101:return          
	}

	void dispatchOnFragmentPreCreated(Fragment fragment, Bundle bundle, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #905 <Field Fragment mParent>
	//*   2    4:ifnull          35
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #905 <Field Fragment mParent>
	//    5   11:invokevirtual   #983 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   15   32:invokevirtual   #1042 <Method void dispatchOnFragmentPreCreated(Fragment, Bundle, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   16   35:aload_0         
	//   17   36:getfield        #165 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   39:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   42:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   20   44:aload           4
	//   21   46:invokeinterface #760 <Method boolean Iterator.hasNext()>
	//   22   51:ifeq            101
			j j1 = (j)iterator.next();
	//   23   54:aload           4
	//   24   56:invokeinterface #764 <Method Object Iterator.next()>
	//   25   61:checkcast       #988 <Class j>
	//   26   64:astore          5
			if(!flag || ((Boolean)j1.b).booleanValue())
	//*  27   66:iload_3         
	//*  28   67:ifeq            84
	//*  29   70:aload           5
	//*  30   72:getfield        #991 <Field Object j.b>
	//*  31   75:checkcast       #369 <Class Boolean>
	//*  32   78:invokevirtual   #461 <Method boolean Boolean.booleanValue()>
	//*  33   81:ifeq            44
				((FragmentManager.FragmentLifecycleCallbacks)j1.a).onFragmentPreCreated(((FragmentManager) (this)), fragment, bundle);
	//   34   84:aload           5
	//   35   86:getfield        #994 <Field Object j.a>
	//   36   89:checkcast       #996 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   37   92:aload_0         
	//   38   93:aload_1         
	//   39   94:aload_2         
	//   40   95:invokevirtual   #1045 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentPreCreated(FragmentManager, Fragment, Bundle)>
		} while(true);
	//   41   98:goto            44
	//   42  101:return          
	}

	void dispatchOnFragmentResumed(Fragment fragment, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #905 <Field Fragment mParent>
	//*   2    4:ifnull          31
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #905 <Field Fragment mParent>
	//    5   11:invokevirtual   #983 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   14   28:invokevirtual   #1048 <Method void dispatchOnFragmentResumed(Fragment, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   15   31:aload_0         
	//   16   32:getfield        #165 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   17   35:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   18   38:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   19   39:aload_3         
	//   20   40:invokeinterface #760 <Method boolean Iterator.hasNext()>
	//   21   45:ifeq            93
			j j1 = (j)iterator.next();
	//   22   48:aload_3         
	//   23   49:invokeinterface #764 <Method Object Iterator.next()>
	//   24   54:checkcast       #988 <Class j>
	//   25   57:astore          4
			if(!flag || ((Boolean)j1.b).booleanValue())
	//*  26   59:iload_2         
	//*  27   60:ifeq            77
	//*  28   63:aload           4
	//*  29   65:getfield        #991 <Field Object j.b>
	//*  30   68:checkcast       #369 <Class Boolean>
	//*  31   71:invokevirtual   #461 <Method boolean Boolean.booleanValue()>
	//*  32   74:ifeq            39
				((FragmentManager.FragmentLifecycleCallbacks)j1.a).onFragmentResumed(((FragmentManager) (this)), fragment);
	//   33   77:aload           4
	//   34   79:getfield        #994 <Field Object j.a>
	//   35   82:checkcast       #996 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   36   85:aload_0         
	//   37   86:aload_1         
	//   38   87:invokevirtual   #1051 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentResumed(FragmentManager, Fragment)>
		} while(true);
	//   39   90:goto            39
	//   40   93:return          
	}

	void dispatchOnFragmentSaveInstanceState(Fragment fragment, Bundle bundle, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #905 <Field Fragment mParent>
	//*   2    4:ifnull          35
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #905 <Field Fragment mParent>
	//    5   11:invokevirtual   #983 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   15   32:invokevirtual   #1054 <Method void dispatchOnFragmentSaveInstanceState(Fragment, Bundle, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   16   35:aload_0         
	//   17   36:getfield        #165 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   39:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   42:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   20   44:aload           4
	//   21   46:invokeinterface #760 <Method boolean Iterator.hasNext()>
	//   22   51:ifeq            101
			j j1 = (j)iterator.next();
	//   23   54:aload           4
	//   24   56:invokeinterface #764 <Method Object Iterator.next()>
	//   25   61:checkcast       #988 <Class j>
	//   26   64:astore          5
			if(!flag || ((Boolean)j1.b).booleanValue())
	//*  27   66:iload_3         
	//*  28   67:ifeq            84
	//*  29   70:aload           5
	//*  30   72:getfield        #991 <Field Object j.b>
	//*  31   75:checkcast       #369 <Class Boolean>
	//*  32   78:invokevirtual   #461 <Method boolean Boolean.booleanValue()>
	//*  33   81:ifeq            44
				((FragmentManager.FragmentLifecycleCallbacks)j1.a).onFragmentSaveInstanceState(((FragmentManager) (this)), fragment, bundle);
	//   34   84:aload           5
	//   35   86:getfield        #994 <Field Object j.a>
	//   36   89:checkcast       #996 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   37   92:aload_0         
	//   38   93:aload_1         
	//   39   94:aload_2         
	//   40   95:invokevirtual   #1057 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentSaveInstanceState(FragmentManager, Fragment, Bundle)>
		} while(true);
	//   41   98:goto            44
	//   42  101:return          
	}

	void dispatchOnFragmentStarted(Fragment fragment, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #905 <Field Fragment mParent>
	//*   2    4:ifnull          31
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #905 <Field Fragment mParent>
	//    5   11:invokevirtual   #983 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   14   28:invokevirtual   #1060 <Method void dispatchOnFragmentStarted(Fragment, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   15   31:aload_0         
	//   16   32:getfield        #165 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   17   35:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   18   38:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   19   39:aload_3         
	//   20   40:invokeinterface #760 <Method boolean Iterator.hasNext()>
	//   21   45:ifeq            93
			j j1 = (j)iterator.next();
	//   22   48:aload_3         
	//   23   49:invokeinterface #764 <Method Object Iterator.next()>
	//   24   54:checkcast       #988 <Class j>
	//   25   57:astore          4
			if(!flag || ((Boolean)j1.b).booleanValue())
	//*  26   59:iload_2         
	//*  27   60:ifeq            77
	//*  28   63:aload           4
	//*  29   65:getfield        #991 <Field Object j.b>
	//*  30   68:checkcast       #369 <Class Boolean>
	//*  31   71:invokevirtual   #461 <Method boolean Boolean.booleanValue()>
	//*  32   74:ifeq            39
				((FragmentManager.FragmentLifecycleCallbacks)j1.a).onFragmentStarted(((FragmentManager) (this)), fragment);
	//   33   77:aload           4
	//   34   79:getfield        #994 <Field Object j.a>
	//   35   82:checkcast       #996 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   36   85:aload_0         
	//   37   86:aload_1         
	//   38   87:invokevirtual   #1063 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentStarted(FragmentManager, Fragment)>
		} while(true);
	//   39   90:goto            39
	//   40   93:return          
	}

	void dispatchOnFragmentStopped(Fragment fragment, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #905 <Field Fragment mParent>
	//*   2    4:ifnull          31
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #905 <Field Fragment mParent>
	//    5   11:invokevirtual   #983 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   14   28:invokevirtual   #1066 <Method void dispatchOnFragmentStopped(Fragment, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   15   31:aload_0         
	//   16   32:getfield        #165 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   17   35:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   18   38:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   19   39:aload_3         
	//   20   40:invokeinterface #760 <Method boolean Iterator.hasNext()>
	//   21   45:ifeq            93
			j j1 = (j)iterator.next();
	//   22   48:aload_3         
	//   23   49:invokeinterface #764 <Method Object Iterator.next()>
	//   24   54:checkcast       #988 <Class j>
	//   25   57:astore          4
			if(!flag || ((Boolean)j1.b).booleanValue())
	//*  26   59:iload_2         
	//*  27   60:ifeq            77
	//*  28   63:aload           4
	//*  29   65:getfield        #991 <Field Object j.b>
	//*  30   68:checkcast       #369 <Class Boolean>
	//*  31   71:invokevirtual   #461 <Method boolean Boolean.booleanValue()>
	//*  32   74:ifeq            39
				((FragmentManager.FragmentLifecycleCallbacks)j1.a).onFragmentStopped(((FragmentManager) (this)), fragment);
	//   33   77:aload           4
	//   34   79:getfield        #994 <Field Object j.a>
	//   35   82:checkcast       #996 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   36   85:aload_0         
	//   37   86:aload_1         
	//   38   87:invokevirtual   #1069 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentStopped(FragmentManager, Fragment)>
		} while(true);
	//   39   90:goto            39
	//   40   93:return          
	}

	void dispatchOnFragmentViewCreated(Fragment fragment, View view, Bundle bundle, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #905 <Field Fragment mParent>
	//*   2    4:ifnull          36
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #905 <Field Fragment mParent>
	//    5   11:invokevirtual   #983 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   16   33:invokevirtual   #1073 <Method void dispatchOnFragmentViewCreated(Fragment, View, Bundle, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   17   36:aload_0         
	//   18   37:getfield        #165 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   19   40:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   20   43:astore          5
		do
		{
			if(!iterator.hasNext())
				break;
	//   21   45:aload           5
	//   22   47:invokeinterface #760 <Method boolean Iterator.hasNext()>
	//   23   52:ifeq            104
			j j1 = (j)iterator.next();
	//   24   55:aload           5
	//   25   57:invokeinterface #764 <Method Object Iterator.next()>
	//   26   62:checkcast       #988 <Class j>
	//   27   65:astore          6
			if(!flag || ((Boolean)j1.b).booleanValue())
	//*  28   67:iload           4
	//*  29   69:ifeq            86
	//*  30   72:aload           6
	//*  31   74:getfield        #991 <Field Object j.b>
	//*  32   77:checkcast       #369 <Class Boolean>
	//*  33   80:invokevirtual   #461 <Method boolean Boolean.booleanValue()>
	//*  34   83:ifeq            45
				((FragmentManager.FragmentLifecycleCallbacks)j1.a).onFragmentViewCreated(((FragmentManager) (this)), fragment, view, bundle);
	//   35   86:aload           6
	//   36   88:getfield        #994 <Field Object j.a>
	//   37   91:checkcast       #996 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   38   94:aload_0         
	//   39   95:aload_1         
	//   40   96:aload_2         
	//   41   97:aload_3         
	//   42   98:invokevirtual   #1077 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentViewCreated(FragmentManager, Fragment, View, Bundle)>
		} while(true);
	//   43  101:goto            45
	//   44  104:return          
	}

	void dispatchOnFragmentViewDestroyed(Fragment fragment, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #905 <Field Fragment mParent>
	//*   2    4:ifnull          31
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #905 <Field Fragment mParent>
	//    5   11:invokevirtual   #983 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   14   28:invokevirtual   #1080 <Method void dispatchOnFragmentViewDestroyed(Fragment, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   15   31:aload_0         
	//   16   32:getfield        #165 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   17   35:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   18   38:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   19   39:aload_3         
	//   20   40:invokeinterface #760 <Method boolean Iterator.hasNext()>
	//   21   45:ifeq            93
			j j1 = (j)iterator.next();
	//   22   48:aload_3         
	//   23   49:invokeinterface #764 <Method Object Iterator.next()>
	//   24   54:checkcast       #988 <Class j>
	//   25   57:astore          4
			if(!flag || ((Boolean)j1.b).booleanValue())
	//*  26   59:iload_2         
	//*  27   60:ifeq            77
	//*  28   63:aload           4
	//*  29   65:getfield        #991 <Field Object j.b>
	//*  30   68:checkcast       #369 <Class Boolean>
	//*  31   71:invokevirtual   #461 <Method boolean Boolean.booleanValue()>
	//*  32   74:ifeq            39
				((FragmentManager.FragmentLifecycleCallbacks)j1.a).onFragmentViewDestroyed(((FragmentManager) (this)), fragment);
	//   33   77:aload           4
	//   34   79:getfield        #994 <Field Object j.a>
	//   35   82:checkcast       #996 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   36   85:aload_0         
	//   37   86:aload_1         
	//   38   87:invokevirtual   #1083 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentViewDestroyed(FragmentManager, Fragment)>
		} while(true);
	//   39   90:goto            39
	//   40   93:return          
	}

	public boolean dispatchOptionsItemSelected(MenuItem menuitem)
	{
		for(int i = 0; i < mAdded.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #160 <Field ArrayList mAdded>
	//*   5    7:invokevirtual   #198 <Method int ArrayList.size()>
	//*   6   10:icmpge          46
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #160 <Field ArrayList mAdded>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #204 <Class Fragment>
	//   12   24:astore_3        
			if(fragment != null && fragment.performOptionsItemSelected(menuitem))
	//*  13   25:aload_3         
	//*  14   26:ifnull          39
	//*  15   29:aload_3         
	//*  16   30:aload_1         
	//*  17   31:invokevirtual   #1087 <Method boolean Fragment.performOptionsItemSelected(MenuItem)>
	//*  18   34:ifeq            39
				return true;
	//   19   37:iconst_1        
	//   20   38:ireturn         
		}

	//   21   39:iload_2         
	//   22   40:iconst_1        
	//   23   41:iadd            
	//   24   42:istore_2        
	//*  25   43:goto            2
		return false;
	//   26   46:iconst_0        
	//   27   47:ireturn         
	}

	public void dispatchOptionsMenuClosed(Menu menu)
	{
		for(int i = 0; i < mAdded.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #160 <Field ArrayList mAdded>
	//*   5    7:invokevirtual   #198 <Method int ArrayList.size()>
	//*   6   10:icmpge          41
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #160 <Field ArrayList mAdded>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #204 <Class Fragment>
	//   12   24:astore_3        
			if(fragment != null)
	//*  13   25:aload_3         
	//*  14   26:ifnull          34
				fragment.performOptionsMenuClosed(menu);
	//   15   29:aload_3         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #1092 <Method void Fragment.performOptionsMenuClosed(Menu)>
		}

	//   18   34:iload_2         
	//   19   35:iconst_1        
	//   20   36:iadd            
	//   21   37:istore_2        
	//*  22   38:goto            2
	//   23   41:return          
	}

	public void dispatchPause()
	{
		dispatchStateChange(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokespecial   #945 <Method void dispatchStateChange(int)>
	//    3    5:return          
	}

	public void dispatchPictureInPictureModeChanged(boolean flag)
	{
		for(int i = mAdded.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field ArrayList mAdded>
	//*   2    4:invokevirtual   #198 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            42
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    8   14:aload_0         
	//    9   15:getfield        #160 <Field ArrayList mAdded>
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
	//   18   32:invokevirtual   #1097 <Method void Fragment.performPictureInPictureModeChanged(boolean)>
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
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		boolean flag;
		boolean flag1;
		for(flag = false; i < mAdded.size(); flag = flag1)
	//*   2    2:iconst_0        
	//*   3    3:istore_3        
	//*   4    4:iload_2         
	//*   5    5:aload_0         
	//*   6    6:getfield        #160 <Field ArrayList mAdded>
	//*   7    9:invokevirtual   #198 <Method int ArrayList.size()>
	//*   8   12:icmpge          61
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    9   15:aload_0         
	//   10   16:getfield        #160 <Field ArrayList mAdded>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #204 <Class Fragment>
	//   14   26:astore          5
			flag1 = flag;
	//   15   28:iload_3         
	//   16   29:istore          4
			if(fragment != null)
	//*  17   31:aload           5
	//*  18   33:ifnull          51
			{
				flag1 = flag;
	//   19   36:iload_3         
	//   20   37:istore          4
				if(fragment.performPrepareOptionsMenu(menu))
	//*  21   39:aload           5
	//*  22   41:aload_1         
	//*  23   42:invokevirtual   #1102 <Method boolean Fragment.performPrepareOptionsMenu(Menu)>
	//*  24   45:ifeq            51
					flag1 = true;
	//   25   48:iconst_1        
	//   26   49:istore          4
			}
			i++;
	//   27   51:iload_2         
	//   28   52:iconst_1        
	//   29   53:iadd            
	//   30   54:istore_2        
		}

	//   31   55:iload           4
	//   32   57:istore_3        
	//*  33   58:goto            4
		return flag;
	//   34   61:iload_3         
	//   35   62:ireturn         
	}

	public void dispatchReallyStop()
	{
		dispatchStateChange(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokespecial   #945 <Method void dispatchStateChange(int)>
	//    3    5:return          
	}

	public void dispatchResume()
	{
		mStateSaved = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #323 <Field boolean mStateSaved>
		dispatchStateChange(5);
	//    3    5:aload_0         
	//    4    6:iconst_5        
	//    5    7:invokespecial   #945 <Method void dispatchStateChange(int)>
	//    6   10:return          
	}

	public void dispatchStart()
	{
		mStateSaved = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #323 <Field boolean mStateSaved>
		dispatchStateChange(4);
	//    3    5:aload_0         
	//    4    6:iconst_4        
	//    5    7:invokespecial   #945 <Method void dispatchStateChange(int)>
	//    6   10:return          
	}

	public void dispatchStop()
	{
		mStateSaved = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #323 <Field boolean mStateSaved>
		dispatchStateChange(3);
	//    3    5:aload_0         
	//    4    6:iconst_3        
	//    5    7:invokespecial   #945 <Method void dispatchStateChange(int)>
	//    6   10:return          
	}

	void doPendingDeferredStart()
	{
		if(mHavePendingDeferredStart)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1108 <Field boolean mHavePendingDeferredStart>
	//*   2    4:ifeq            85
		{
			int i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
			boolean flag;
			boolean flag1;
			for(flag = false; i < mActive.size(); flag = flag1)
	//*   5    9:iconst_0        
	//*   6   10:istore_2        
	//*   7   11:iload_1         
	//*   8   12:aload_0         
	//*   9   13:getfield        #307 <Field SparseArray mActive>
	//*  10   16:invokevirtual   #310 <Method int SparseArray.size()>
	//*  11   19:icmpge          72
			{
				Fragment fragment = (Fragment)mActive.valueAt(i);
	//   12   22:aload_0         
	//   13   23:getfield        #307 <Field SparseArray mActive>
	//   14   26:iload_1         
	//   15   27:invokevirtual   #313 <Method Object SparseArray.valueAt(int)>
	//   16   30:checkcast       #204 <Class Fragment>
	//   17   33:astore          4
				flag1 = flag;
	//   18   35:iload_2         
	//   19   36:istore_3        
				if(fragment != null)
	//*  20   37:aload           4
	//*  21   39:ifnull          63
				{
					flag1 = flag;
	//   22   42:iload_2         
	//   23   43:istore_3        
					if(fragment.mLoaderManager != null)
	//*  24   44:aload           4
	//*  25   46:getfield        #1112 <Field LoaderManagerImpl Fragment.mLoaderManager>
	//*  26   49:ifnull          63
						flag1 = flag | fragment.mLoaderManager.hasRunningLoaders();
	//   27   52:iload_2         
	//   28   53:aload           4
	//   29   55:getfield        #1112 <Field LoaderManagerImpl Fragment.mLoaderManager>
	//   30   58:invokevirtual   #1117 <Method boolean LoaderManagerImpl.hasRunningLoaders()>
	//   31   61:ior             
	//   32   62:istore_3        
				}
				i++;
	//   33   63:iload_1         
	//   34   64:iconst_1        
	//   35   65:iadd            
	//   36   66:istore_1        
			}

	//   37   67:iload_3         
	//   38   68:istore_2        
	//*  39   69:goto            11
			if(!flag)
	//*  40   72:iload_2         
	//*  41   73:ifne            85
			{
				mHavePendingDeferredStart = false;
	//   42   76:aload_0         
	//   43   77:iconst_0        
	//   44   78:putfield        #1108 <Field boolean mHavePendingDeferredStart>
				startPendingDeferredFragments();
	//   45   81:aload_0         
	//   46   82:invokevirtual   #1120 <Method void startPendingDeferredFragments()>
			}
		}
	//   47   85:return          
	}

	public void dump(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		boolean flag;
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #334 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #335 <Method void StringBuilder()>
	//    3    7:astore          8
		((StringBuilder) (obj)).append(s1);
	//    4    9:aload           8
	//    5   11:aload_1         
	//    6   12:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append("    ");
	//    8   16:aload           8
	//    9   18:ldc2            #1122 <String "    ">
	//   10   21:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   12   25:aload           8
	//   13   27:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   14   30:astore          8
		SparseArray sparsearray = mActive;
	//   15   32:aload_0         
	//   16   33:getfield        #307 <Field SparseArray mActive>
	//   17   36:astore          9
		flag = false;
	//   18   38:iconst_0        
	//   19   39:istore          6
		if(sparsearray != null)
	//*  20   41:aload           9
	//*  21   43:ifnull          170
		{
			int l1 = mActive.size();
	//   22   46:aload_0         
	//   23   47:getfield        #307 <Field SparseArray mActive>
	//   24   50:invokevirtual   #310 <Method int SparseArray.size()>
	//   25   53:istore          7
			if(l1 > 0)
	//*  26   55:iload           7
	//*  27   57:ifle            170
			{
				printwriter.print(s1);
	//   28   60:aload_3         
	//   29   61:aload_1         
	//   30   62:invokevirtual   #1125 <Method void PrintWriter.print(String)>
				printwriter.print("Active Fragments in ");
	//   31   65:aload_3         
	//   32   66:ldc2            #1127 <String "Active Fragments in ">
	//   33   69:invokevirtual   #1125 <Method void PrintWriter.print(String)>
				printwriter.print(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//   34   72:aload_3         
	//   35   73:aload_0         
	//   36   74:invokestatic    #1132 <Method int System.identityHashCode(Object)>
	//   37   77:invokestatic    #1136 <Method String Integer.toHexString(int)>
	//   38   80:invokevirtual   #1125 <Method void PrintWriter.print(String)>
				printwriter.println(":");
	//   39   83:aload_3         
	//   40   84:ldc2            #1138 <String ":">
	//   41   87:invokevirtual   #1141 <Method void PrintWriter.println(String)>
				for(int i = 0; i < l1; i++)
	//*  42   90:iconst_0        
	//*  43   91:istore          5
	//*  44   93:iload           5
	//*  45   95:iload           7
	//*  46   97:icmpge          170
				{
					Fragment fragment = (Fragment)mActive.valueAt(i);
	//   47  100:aload_0         
	//   48  101:getfield        #307 <Field SparseArray mActive>
	//   49  104:iload           5
	//   50  106:invokevirtual   #313 <Method Object SparseArray.valueAt(int)>
	//   51  109:checkcast       #204 <Class Fragment>
	//   52  112:astore          9
					printwriter.print(s1);
	//   53  114:aload_3         
	//   54  115:aload_1         
	//   55  116:invokevirtual   #1125 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//   56  119:aload_3         
	//   57  120:ldc2            #1143 <String "  #">
	//   58  123:invokevirtual   #1125 <Method void PrintWriter.print(String)>
					printwriter.print(i);
	//   59  126:aload_3         
	//   60  127:iload           5
	//   61  129:invokevirtual   #1145 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//   62  132:aload_3         
	//   63  133:ldc2            #1147 <String ": ">
	//   64  136:invokevirtual   #1125 <Method void PrintWriter.print(String)>
					printwriter.println(((Object) (fragment)));
	//   65  139:aload_3         
	//   66  140:aload           9
	//   67  142:invokevirtual   #1149 <Method void PrintWriter.println(Object)>
					if(fragment != null)
	//*  68  145:aload           9
	//*  69  147:ifnull          161
						fragment.dump(((String) (obj)), filedescriptor, printwriter, as);
	//   70  150:aload           9
	//   71  152:aload           8
	//   72  154:aload_2         
	//   73  155:aload_3         
	//   74  156:aload           4
	//   75  158:invokevirtual   #1150 <Method void Fragment.dump(String, FileDescriptor, PrintWriter, String[])>
				}

	//   76  161:iload           5
	//   77  163:iconst_1        
	//   78  164:iadd            
	//   79  165:istore          5
			}
		}
	//*  80  167:goto            93
		int i2 = mAdded.size();
	//   81  170:aload_0         
	//   82  171:getfield        #160 <Field ArrayList mAdded>
	//   83  174:invokevirtual   #198 <Method int ArrayList.size()>
	//   84  177:istore          7
		if(i2 > 0)
	//*  85  179:iload           7
	//*  86  181:ifle            263
		{
			printwriter.print(s1);
	//   87  184:aload_3         
	//   88  185:aload_1         
	//   89  186:invokevirtual   #1125 <Method void PrintWriter.print(String)>
			printwriter.println("Added Fragments:");
	//   90  189:aload_3         
	//   91  190:ldc2            #1152 <String "Added Fragments:">
	//   92  193:invokevirtual   #1141 <Method void PrintWriter.println(String)>
			for(int k = 0; k < i2; k++)
	//*  93  196:iconst_0        
	//*  94  197:istore          5
	//*  95  199:iload           5
	//*  96  201:iload           7
	//*  97  203:icmpge          263
			{
				Fragment fragment1 = (Fragment)mAdded.get(k);
	//   98  206:aload_0         
	//   99  207:getfield        #160 <Field ArrayList mAdded>
	//  100  210:iload           5
	//  101  212:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//  102  215:checkcast       #204 <Class Fragment>
	//  103  218:astore          9
				printwriter.print(s1);
	//  104  220:aload_3         
	//  105  221:aload_1         
	//  106  222:invokevirtual   #1125 <Method void PrintWriter.print(String)>
				printwriter.print("  #");
	//  107  225:aload_3         
	//  108  226:ldc2            #1143 <String "  #">
	//  109  229:invokevirtual   #1125 <Method void PrintWriter.print(String)>
				printwriter.print(k);
	//  110  232:aload_3         
	//  111  233:iload           5
	//  112  235:invokevirtual   #1145 <Method void PrintWriter.print(int)>
				printwriter.print(": ");
	//  113  238:aload_3         
	//  114  239:ldc2            #1147 <String ": ">
	//  115  242:invokevirtual   #1125 <Method void PrintWriter.print(String)>
				printwriter.println(fragment1.toString());
	//  116  245:aload_3         
	//  117  246:aload           9
	//  118  248:invokevirtual   #1153 <Method String Fragment.toString()>
	//  119  251:invokevirtual   #1141 <Method void PrintWriter.println(String)>
			}

	//  120  254:iload           5
	//  121  256:iconst_1        
	//  122  257:iadd            
	//  123  258:istore          5
		}
	//* 124  260:goto            199
		if(mCreatedMenus != null)
	//* 125  263:aload_0         
	//* 126  264:getfield        #963 <Field ArrayList mCreatedMenus>
	//* 127  267:ifnull          363
		{
			int j2 = mCreatedMenus.size();
	//  128  270:aload_0         
	//  129  271:getfield        #963 <Field ArrayList mCreatedMenus>
	//  130  274:invokevirtual   #198 <Method int ArrayList.size()>
	//  131  277:istore          7
			if(j2 > 0)
	//* 132  279:iload           7
	//* 133  281:ifle            363
			{
				printwriter.print(s1);
	//  134  284:aload_3         
	//  135  285:aload_1         
	//  136  286:invokevirtual   #1125 <Method void PrintWriter.print(String)>
				printwriter.println("Fragments Created Menus:");
	//  137  289:aload_3         
	//  138  290:ldc2            #1155 <String "Fragments Created Menus:">
	//  139  293:invokevirtual   #1141 <Method void PrintWriter.println(String)>
				for(int l = 0; l < j2; l++)
	//* 140  296:iconst_0        
	//* 141  297:istore          5
	//* 142  299:iload           5
	//* 143  301:iload           7
	//* 144  303:icmpge          363
				{
					Fragment fragment2 = (Fragment)mCreatedMenus.get(l);
	//  145  306:aload_0         
	//  146  307:getfield        #963 <Field ArrayList mCreatedMenus>
	//  147  310:iload           5
	//  148  312:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//  149  315:checkcast       #204 <Class Fragment>
	//  150  318:astore          9
					printwriter.print(s1);
	//  151  320:aload_3         
	//  152  321:aload_1         
	//  153  322:invokevirtual   #1125 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//  154  325:aload_3         
	//  155  326:ldc2            #1143 <String "  #">
	//  156  329:invokevirtual   #1125 <Method void PrintWriter.print(String)>
					printwriter.print(l);
	//  157  332:aload_3         
	//  158  333:iload           5
	//  159  335:invokevirtual   #1145 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//  160  338:aload_3         
	//  161  339:ldc2            #1147 <String ": ">
	//  162  342:invokevirtual   #1125 <Method void PrintWriter.print(String)>
					printwriter.println(fragment2.toString());
	//  163  345:aload_3         
	//  164  346:aload           9
	//  165  348:invokevirtual   #1153 <Method String Fragment.toString()>
	//  166  351:invokevirtual   #1141 <Method void PrintWriter.println(String)>
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
	//* 173  364:getfield        #827 <Field ArrayList mBackStack>
	//* 174  367:ifnull          474
		{
			int k2 = mBackStack.size();
	//  175  370:aload_0         
	//  176  371:getfield        #827 <Field ArrayList mBackStack>
	//  177  374:invokevirtual   #198 <Method int ArrayList.size()>
	//  178  377:istore          7
			if(k2 > 0)
	//* 179  379:iload           7
	//* 180  381:ifle            474
			{
				printwriter.print(s1);
	//  181  384:aload_3         
	//  182  385:aload_1         
	//  183  386:invokevirtual   #1125 <Method void PrintWriter.print(String)>
				printwriter.println("Back Stack:");
	//  184  389:aload_3         
	//  185  390:ldc2            #1157 <String "Back Stack:">
	//  186  393:invokevirtual   #1141 <Method void PrintWriter.println(String)>
				for(int i1 = 0; i1 < k2; i1++)
	//* 187  396:iconst_0        
	//* 188  397:istore          5
	//* 189  399:iload           5
	//* 190  401:iload           7
	//* 191  403:icmpge          474
				{
					BackStackRecord backstackrecord = (BackStackRecord)mBackStack.get(i1);
	//  192  406:aload_0         
	//  193  407:getfield        #827 <Field ArrayList mBackStack>
	//  194  410:iload           5
	//  195  412:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//  196  415:checkcast       #357 <Class BackStackRecord>
	//  197  418:astore          9
					printwriter.print(s1);
	//  198  420:aload_3         
	//  199  421:aload_1         
	//  200  422:invokevirtual   #1125 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//  201  425:aload_3         
	//  202  426:ldc2            #1143 <String "  #">
	//  203  429:invokevirtual   #1125 <Method void PrintWriter.print(String)>
					printwriter.print(i1);
	//  204  432:aload_3         
	//  205  433:iload           5
	//  206  435:invokevirtual   #1145 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//  207  438:aload_3         
	//  208  439:ldc2            #1147 <String ": ">
	//  209  442:invokevirtual   #1125 <Method void PrintWriter.print(String)>
					printwriter.println(backstackrecord.toString());
	//  210  445:aload_3         
	//  211  446:aload           9
	//  212  448:invokevirtual   #1158 <Method String BackStackRecord.toString()>
	//  213  451:invokevirtual   #1141 <Method void PrintWriter.println(String)>
					backstackrecord.dump(((String) (obj)), filedescriptor, printwriter, as);
	//  214  454:aload           9
	//  215  456:aload           8
	//  216  458:aload_2         
	//  217  459:aload_3         
	//  218  460:aload           4
	//  219  462:invokevirtual   #1159 <Method void BackStackRecord.dump(String, FileDescriptor, PrintWriter, String[])>
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
	//  228  477:getfield        #889 <Field ArrayList mBackStackIndices>
	//  229  480:ifnull          571
_L1:
		int l2 = mBackStackIndices.size();
	//  230  483:aload_0         
	//  231  484:getfield        #889 <Field ArrayList mBackStackIndices>
	//  232  487:invokevirtual   #198 <Method int ArrayList.size()>
	//  233  490:istore          7
		if(l2 <= 0) goto _L2; else goto _L3
	//  234  492:iload           7
	//  235  494:ifle            571
_L3:
		printwriter.print(s1);
	//  236  497:aload_3         
	//  237  498:aload_1         
	//  238  499:invokevirtual   #1125 <Method void PrintWriter.print(String)>
		printwriter.println("Back Stack Indices:");
	//  239  502:aload_3         
	//  240  503:ldc2            #1161 <String "Back Stack Indices:">
	//  241  506:invokevirtual   #1141 <Method void PrintWriter.println(String)>
		int j1 = 0;
	//  242  509:iconst_0        
	//  243  510:istore          5
_L4:
		if(j1 >= l2)
			break; /* Loop/switch isn't completed */
	//  244  512:iload           5
	//  245  514:iload           7
	//  246  516:icmpge          571
		filedescriptor = ((FileDescriptor) ((BackStackRecord)mBackStackIndices.get(j1)));
	//  247  519:aload_0         
	//  248  520:getfield        #889 <Field ArrayList mBackStackIndices>
	//  249  523:iload           5
	//  250  525:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//  251  528:checkcast       #357 <Class BackStackRecord>
	//  252  531:astore_2        
		printwriter.print(s1);
	//  253  532:aload_3         
	//  254  533:aload_1         
	//  255  534:invokevirtual   #1125 <Method void PrintWriter.print(String)>
		printwriter.print("  #");
	//  256  537:aload_3         
	//  257  538:ldc2            #1143 <String "  #">
	//  258  541:invokevirtual   #1125 <Method void PrintWriter.print(String)>
		printwriter.print(j1);
	//  259  544:aload_3         
	//  260  545:iload           5
	//  261  547:invokevirtual   #1145 <Method void PrintWriter.print(int)>
		printwriter.print(": ");
	//  262  550:aload_3         
	//  263  551:ldc2            #1147 <String ": ">
	//  264  554:invokevirtual   #1125 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (filedescriptor)));
	//  265  557:aload_3         
	//  266  558:aload_2         
	//  267  559:invokevirtual   #1149 <Method void PrintWriter.println(Object)>
		j1++;
	//  268  562:iload           5
	//  269  564:iconst_1        
	//  270  565:iadd            
	//  271  566:istore          5
		if(true) goto _L4; else goto _L2
	//  272  568:goto            512
_L2:
		if(mAvailBackStackIndices != null && mAvailBackStackIndices.size() > 0)
	//* 273  571:aload_0         
	//* 274  572:getfield        #875 <Field ArrayList mAvailBackStackIndices>
	//* 275  575:ifnull          614
	//* 276  578:aload_0         
	//* 277  579:getfield        #875 <Field ArrayList mAvailBackStackIndices>
	//* 278  582:invokevirtual   #198 <Method int ArrayList.size()>
	//* 279  585:ifle            614
		{
			printwriter.print(s1);
	//  280  588:aload_3         
	//  281  589:aload_1         
	//  282  590:invokevirtual   #1125 <Method void PrintWriter.print(String)>
			printwriter.print("mAvailBackStackIndices: ");
	//  283  593:aload_3         
	//  284  594:ldc2            #1163 <String "mAvailBackStackIndices: ">
	//  285  597:invokevirtual   #1125 <Method void PrintWriter.print(String)>
			printwriter.println(Arrays.toString(mAvailBackStackIndices.toArray()));
	//  286  600:aload_3         
	//  287  601:aload_0         
	//  288  602:getfield        #875 <Field ArrayList mAvailBackStackIndices>
	//  289  605:invokevirtual   #1167 <Method Object[] ArrayList.toArray()>
	//  290  608:invokestatic    #1172 <Method String Arrays.toString(Object[])>
	//  291  611:invokevirtual   #1141 <Method void PrintWriter.println(String)>
		}
		this;
	//  292  614:aload_0         
		JVM INSTR monitorexit ;
	//  293  615:monitorexit     
		if(mPendingActions != null)
	//* 294  616:aload_0         
	//* 295  617:getfield        #553 <Field ArrayList mPendingActions>
	//* 296  620:ifnull          712
		{
			int i3 = mPendingActions.size();
	//  297  623:aload_0         
	//  298  624:getfield        #553 <Field ArrayList mPendingActions>
	//  299  627:invokevirtual   #198 <Method int ArrayList.size()>
	//  300  630:istore          7
			if(i3 > 0)
	//* 301  632:iload           7
	//* 302  634:ifle            712
			{
				printwriter.print(s1);
	//  303  637:aload_3         
	//  304  638:aload_1         
	//  305  639:invokevirtual   #1125 <Method void PrintWriter.print(String)>
				printwriter.println("Pending Actions:");
	//  306  642:aload_3         
	//  307  643:ldc2            #1174 <String "Pending Actions:">
	//  308  646:invokevirtual   #1141 <Method void PrintWriter.println(String)>
				for(int k1 = ((int) (flag)); k1 < i3; k1++)
	//* 309  649:iload           6
	//* 310  651:istore          5
	//* 311  653:iload           5
	//* 312  655:iload           7
	//* 313  657:icmpge          712
				{
					filedescriptor = ((FileDescriptor) ((OpGenerator)mPendingActions.get(k1)));
	//  314  660:aload_0         
	//  315  661:getfield        #553 <Field ArrayList mPendingActions>
	//  316  664:iload           5
	//  317  666:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//  318  669:checkcast       #33  <Class FragmentManagerImpl$OpGenerator>
	//  319  672:astore_2        
					printwriter.print(s1);
	//  320  673:aload_3         
	//  321  674:aload_1         
	//  322  675:invokevirtual   #1125 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//  323  678:aload_3         
	//  324  679:ldc2            #1143 <String "  #">
	//  325  682:invokevirtual   #1125 <Method void PrintWriter.print(String)>
					printwriter.print(k1);
	//  326  685:aload_3         
	//  327  686:iload           5
	//  328  688:invokevirtual   #1145 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//  329  691:aload_3         
	//  330  692:ldc2            #1147 <String ": ">
	//  331  695:invokevirtual   #1125 <Method void PrintWriter.print(String)>
					printwriter.println(((Object) (filedescriptor)));
	//  332  698:aload_3         
	//  333  699:aload_2         
	//  334  700:invokevirtual   #1149 <Method void PrintWriter.println(Object)>
				}

	//  335  703:iload           5
	//  336  705:iconst_1        
	//  337  706:iadd            
	//  338  707:istore          5
			}
		}
	//* 339  709:goto            653
		printwriter.print(s1);
	//  340  712:aload_3         
	//  341  713:aload_1         
	//  342  714:invokevirtual   #1125 <Method void PrintWriter.print(String)>
		printwriter.println("FragmentManager misc state:");
	//  343  717:aload_3         
	//  344  718:ldc2            #1176 <String "FragmentManager misc state:">
	//  345  721:invokevirtual   #1141 <Method void PrintWriter.println(String)>
		printwriter.print(s1);
	//  346  724:aload_3         
	//  347  725:aload_1         
	//  348  726:invokevirtual   #1125 <Method void PrintWriter.print(String)>
		printwriter.print("  mHost=");
	//  349  729:aload_3         
	//  350  730:ldc2            #1178 <String "  mHost=">
	//  351  733:invokevirtual   #1125 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (mHost)));
	//  352  736:aload_3         
	//  353  737:aload_0         
	//  354  738:getfield        #438 <Field FragmentHostCallback mHost>
	//  355  741:invokevirtual   #1149 <Method void PrintWriter.println(Object)>
		printwriter.print(s1);
	//  356  744:aload_3         
	//  357  745:aload_1         
	//  358  746:invokevirtual   #1125 <Method void PrintWriter.print(String)>
		printwriter.print("  mContainer=");
	//  359  749:aload_3         
	//  360  750:ldc2            #1180 <String "  mContainer=">
	//  361  753:invokevirtual   #1125 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (mContainer)));
	//  362  756:aload_3         
	//  363  757:aload_0         
	//  364  758:getfield        #903 <Field FragmentContainer mContainer>
	//  365  761:invokevirtual   #1149 <Method void PrintWriter.println(Object)>
		if(mParent != null)
	//* 366  764:aload_0         
	//* 367  765:getfield        #905 <Field Fragment mParent>
	//* 368  768:ifnull          791
		{
			printwriter.print(s1);
	//  369  771:aload_3         
	//  370  772:aload_1         
	//  371  773:invokevirtual   #1125 <Method void PrintWriter.print(String)>
			printwriter.print("  mParent=");
	//  372  776:aload_3         
	//  373  777:ldc2            #1182 <String "  mParent=">
	//  374  780:invokevirtual   #1125 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mParent)));
	//  375  783:aload_3         
	//  376  784:aload_0         
	//  377  785:getfield        #905 <Field Fragment mParent>
	//  378  788:invokevirtual   #1149 <Method void PrintWriter.println(Object)>
		}
		printwriter.print(s1);
	//  379  791:aload_3         
	//  380  792:aload_1         
	//  381  793:invokevirtual   #1125 <Method void PrintWriter.print(String)>
		printwriter.print("  mCurState=");
	//  382  796:aload_3         
	//  383  797:ldc2            #1184 <String "  mCurState=">
	//  384  800:invokevirtual   #1125 <Method void PrintWriter.print(String)>
		printwriter.print(mCurState);
	//  385  803:aload_3         
	//  386  804:aload_0         
	//  387  805:getfield        #167 <Field int mCurState>
	//  388  808:invokevirtual   #1145 <Method void PrintWriter.print(int)>
		printwriter.print(" mStateSaved=");
	//  389  811:aload_3         
	//  390  812:ldc2            #1186 <String " mStateSaved=">
	//  391  815:invokevirtual   #1125 <Method void PrintWriter.print(String)>
		printwriter.print(mStateSaved);
	//  392  818:aload_3         
	//  393  819:aload_0         
	//  394  820:getfield        #323 <Field boolean mStateSaved>
	//  395  823:invokevirtual   #1188 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mDestroyed=");
	//  396  826:aload_3         
	//  397  827:ldc2            #1190 <String " mDestroyed=">
	//  398  830:invokevirtual   #1125 <Method void PrintWriter.print(String)>
		printwriter.println(mDestroyed);
	//  399  833:aload_3         
	//  400  834:aload_0         
	//  401  835:getfield        #969 <Field boolean mDestroyed>
	//  402  838:invokevirtual   #1192 <Method void PrintWriter.println(boolean)>
		if(mNeedMenuInvalidate)
	//* 403  841:aload_0         
	//* 404  842:getfield        #865 <Field boolean mNeedMenuInvalidate>
	//* 405  845:ifeq            868
		{
			printwriter.print(s1);
	//  406  848:aload_3         
	//  407  849:aload_1         
	//  408  850:invokevirtual   #1125 <Method void PrintWriter.print(String)>
			printwriter.print("  mNeedMenuInvalidate=");
	//  409  853:aload_3         
	//  410  854:ldc2            #1194 <String "  mNeedMenuInvalidate=">
	//  411  857:invokevirtual   #1125 <Method void PrintWriter.print(String)>
			printwriter.println(mNeedMenuInvalidate);
	//  412  860:aload_3         
	//  413  861:aload_0         
	//  414  862:getfield        #865 <Field boolean mNeedMenuInvalidate>
	//  415  865:invokevirtual   #1192 <Method void PrintWriter.println(boolean)>
		}
		if(mNoTransactionsBecause != null)
	//* 416  868:aload_0         
	//* 417  869:getfield        #332 <Field String mNoTransactionsBecause>
	//* 418  872:ifnull          895
		{
			printwriter.print(s1);
	//  419  875:aload_3         
	//  420  876:aload_1         
	//  421  877:invokevirtual   #1125 <Method void PrintWriter.print(String)>
			printwriter.print("  mNoTransactionsBecause=");
	//  422  880:aload_3         
	//  423  881:ldc2            #1196 <String "  mNoTransactionsBecause=">
	//  424  884:invokevirtual   #1125 <Method void PrintWriter.print(String)>
			printwriter.println(mNoTransactionsBecause);
	//  425  887:aload_3         
	//  426  888:aload_0         
	//  427  889:getfield        #332 <Field String mNoTransactionsBecause>
	//  428  892:invokevirtual   #1141 <Method void PrintWriter.println(String)>
		}
		return;
	//  429  895:return          
		s1;
	//  430  896:astore_1        
		this;
	//  431  897:aload_0         
		JVM INSTR monitorexit ;
	//  432  898:monitorexit     
		throw s1;
	//  433  899:aload_1         
	//  434  900:athrow          
	}

	public void enqueueAction(OpGenerator opgenerator, boolean flag)
	{
		if(!flag)
	//*   0    0:iload_2         
	//*   1    1:ifne            8
			checkStateLoss();
	//    2    4:aload_0         
	//    3    5:invokespecial   #453 <Method void checkStateLoss()>
		this;
	//    4    8:aload_0         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		if(mDestroyed || mHost == null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #969 <Field boolean mDestroyed>
	//*   8   14:ifne            61
	//*   9   17:aload_0         
	//*  10   18:getfield        #438 <Field FragmentHostCallback mHost>
	//*  11   21:ifnonnull       27
			break MISSING_BLOCK_LABEL_61;
	//   12   24:goto            61
		if(mPendingActions == null)
	//*  13   27:aload_0         
	//*  14   28:getfield        #553 <Field ArrayList mPendingActions>
	//*  15   31:ifnonnull       45
			mPendingActions = new ArrayList();
	//   16   34:aload_0         
	//   17   35:new             #157 <Class ArrayList>
	//   18   38:dup             
	//   19   39:invokespecial   #158 <Method void ArrayList()>
	//   20   42:putfield        #553 <Field ArrayList mPendingActions>
		mPendingActions.add(((Object) (opgenerator)));
	//   21   45:aload_0         
	//   22   46:getfield        #553 <Field ArrayList mPendingActions>
	//   23   49:aload_1         
	//   24   50:invokevirtual   #367 <Method boolean ArrayList.add(Object)>
	//   25   53:pop             
		scheduleCommit();
	//   26   54:aload_0         
	//   27   55:invokespecial   #180 <Method void scheduleCommit()>
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
	//   36   68:new             #325 <Class IllegalStateException>
	//   37   71:dup             
	//   38   72:ldc2            #1200 <String "Activity has been destroyed">
	//   39   75:invokespecial   #330 <Method void IllegalStateException(String)>
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
	//*   1    1:getfield        #1204 <Field boolean Fragment.mFromLayout>
	//*   2    4:ifeq            106
	//*   3    7:aload_1         
	//*   4    8:getfield        #1207 <Field boolean Fragment.mPerformedCreateView>
	//*   5   11:ifne            106
		{
			fragment.mView = fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), ((ViewGroup) (null)), fragment.mSavedFragmentState);
	//    6   14:aload_1         
	//    7   15:aload_1         
	//    8   16:aload_1         
	//    9   17:aload_1         
	//   10   18:getfield        #1210 <Field Bundle Fragment.mSavedFragmentState>
	//   11   21:invokevirtual   #1214 <Method android.view.LayoutInflater Fragment.performGetLayoutInflater(Bundle)>
	//   12   24:aconst_null     
	//   13   25:aload_1         
	//   14   26:getfield        #1210 <Field Bundle Fragment.mSavedFragmentState>
	//   15   29:invokevirtual   #1218 <Method View Fragment.performCreateView(android.view.LayoutInflater, ViewGroup, Bundle)>
	//   16   32:putfield        #221 <Field View Fragment.mView>
			if(fragment.mView != null)
	//*  17   35:aload_1         
	//*  18   36:getfield        #221 <Field View Fragment.mView>
	//*  19   39:ifnull          101
			{
				fragment.mInnerView = fragment.mView;
	//   20   42:aload_1         
	//   21   43:aload_1         
	//   22   44:getfield        #221 <Field View Fragment.mView>
	//   23   47:putfield        #1221 <Field View Fragment.mInnerView>
				fragment.mView.setSaveFromParentEnabled(false);
	//   24   50:aload_1         
	//   25   51:getfield        #221 <Field View Fragment.mView>
	//   26   54:iconst_0        
	//   27   55:invokevirtual   #1224 <Method void View.setSaveFromParentEnabled(boolean)>
				if(fragment.mHidden)
	//*  28   58:aload_1         
	//*  29   59:getfield        #224 <Field boolean Fragment.mHidden>
	//*  30   62:ifeq            74
					fragment.mView.setVisibility(8);
	//   31   65:aload_1         
	//   32   66:getfield        #221 <Field View Fragment.mView>
	//   33   69:bipush          8
	//   34   71:invokevirtual   #931 <Method void View.setVisibility(int)>
				fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
	//   35   74:aload_1         
	//   36   75:aload_1         
	//   37   76:getfield        #221 <Field View Fragment.mView>
	//   38   79:aload_1         
	//   39   80:getfield        #1210 <Field Bundle Fragment.mSavedFragmentState>
	//   40   83:invokevirtual   #1228 <Method void Fragment.onViewCreated(View, Bundle)>
				dispatchOnFragmentViewCreated(fragment, fragment.mView, fragment.mSavedFragmentState, false);
	//   41   86:aload_0         
	//   42   87:aload_1         
	//   43   88:aload_1         
	//   44   89:getfield        #221 <Field View Fragment.mView>
	//   45   92:aload_1         
	//   46   93:getfield        #1210 <Field Bundle Fragment.mSavedFragmentState>
	//   47   96:iconst_0        
	//   48   97:invokevirtual   #1073 <Method void dispatchOnFragmentViewCreated(Fragment, View, Bundle, boolean)>
				return;
	//   49  100:return          
			}
			fragment.mInnerView = null;
	//   50  101:aload_1         
	//   51  102:aconst_null     
	//   52  103:putfield        #1221 <Field View Fragment.mInnerView>
		}
	//   53  106:return          
	}

	public boolean execPendingActions()
	{
		boolean flag;
		ensureExecReady(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #686 <Method void ensureExecReady(boolean)>
		flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_1        
_L2:
		if(!generateOpsForPendingActions(mTmpRecords, mTmpIsPop))
			break; /* Loop/switch isn't completed */
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #355 <Field ArrayList mTmpRecords>
	//    8   12:aload_0         
	//    9   13:getfield        #350 <Field ArrayList mTmpIsPop>
	//   10   16:invokespecial   #1230 <Method boolean generateOpsForPendingActions(ArrayList, ArrayList)>
	//   11   19:ifeq            55
		mExecutingActions = true;
	//   12   22:aload_0         
	//   13   23:iconst_1        
	//   14   24:putfield        #348 <Field boolean mExecutingActions>
		removeRedundantOperationsAndExecute(mTmpRecords, mTmpIsPop);
	//   15   27:aload_0         
	//   16   28:aload_0         
	//   17   29:getfield        #355 <Field ArrayList mTmpRecords>
	//   18   32:aload_0         
	//   19   33:getfield        #350 <Field ArrayList mTmpIsPop>
	//   20   36:invokespecial   #701 <Method void removeRedundantOperationsAndExecute(ArrayList, ArrayList)>
		cleanupExec();
	//   21   39:aload_0         
	//   22   40:invokespecial   #703 <Method void cleanupExec()>
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
	//   28   50:invokespecial   #703 <Method void cleanupExec()>
		throw exception;
	//   29   53:aload_2         
	//   30   54:athrow          
_L1:
		doPendingDeferredStart();
	//   31   55:aload_0         
	//   32   56:invokevirtual   #706 <Method void doPendingDeferredStart()>
		burpActive();
	//   33   59:aload_0         
	//   34   60:invokespecial   #708 <Method void burpActive()>
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
	//*   3    5:getfield        #438 <Field FragmentHostCallback mHost>
	//*   4    8:ifnull          18
	//*   5   11:aload_0         
	//*   6   12:getfield        #969 <Field boolean mDestroyed>
	//*   7   15:ifeq            19
			return;
	//    8   18:return          
		ensureExecReady(flag);
	//    9   19:aload_0         
	//   10   20:iload_2         
	//   11   21:invokespecial   #686 <Method void ensureExecReady(boolean)>
		if(!opgenerator.generateOps(mTmpRecords, mTmpIsPop))
			break MISSING_BLOCK_LABEL_72;
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #355 <Field ArrayList mTmpRecords>
	//   15   29:aload_0         
	//   16   30:getfield        #350 <Field ArrayList mTmpIsPop>
	//   17   33:invokeinterface #556 <Method boolean FragmentManagerImpl$OpGenerator.generateOps(ArrayList, ArrayList)>
	//   18   38:ifeq            72
		mExecutingActions = true;
	//   19   41:aload_0         
	//   20   42:iconst_1        
	//   21   43:putfield        #348 <Field boolean mExecutingActions>
		removeRedundantOperationsAndExecute(mTmpRecords, mTmpIsPop);
	//   22   46:aload_0         
	//   23   47:aload_0         
	//   24   48:getfield        #355 <Field ArrayList mTmpRecords>
	//   25   51:aload_0         
	//   26   52:getfield        #350 <Field ArrayList mTmpIsPop>
	//   27   55:invokespecial   #701 <Method void removeRedundantOperationsAndExecute(ArrayList, ArrayList)>
		cleanupExec();
	//   28   58:aload_0         
	//   29   59:invokespecial   #703 <Method void cleanupExec()>
		break MISSING_BLOCK_LABEL_72;
	//   30   62:goto            72
		opgenerator;
	//   31   65:astore_1        
		cleanupExec();
	//   32   66:aload_0         
	//   33   67:invokespecial   #703 <Method void cleanupExec()>
		throw opgenerator;
	//   34   70:aload_1         
	//   35   71:athrow          
		doPendingDeferredStart();
	//   36   72:aload_0         
	//   37   73:invokevirtual   #706 <Method void doPendingDeferredStart()>
		burpActive();
	//   38   76:aload_0         
	//   39   77:invokespecial   #708 <Method void burpActive()>
		return;
	//   40   80:return          
	}

	public boolean executePendingTransactions()
	{
		boolean flag = execPendingActions();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #402 <Method boolean execPendingActions()>
	//    2    4:istore_1        
		forcePostponedTransactions();
	//    3    5:aload_0         
	//    4    6:invokespecial   #1234 <Method void forcePostponedTransactions()>
		return flag;
	//    5    9:iload_1         
	//    6   10:ireturn         
	}

	public Fragment findFragmentById(int i)
	{
		for(int k = mAdded.size() - 1; k >= 0; k--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field ArrayList mAdded>
	//*   2    4:invokevirtual   #198 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            47
		{
			Fragment fragment = (Fragment)mAdded.get(k);
	//    8   14:aload_0         
	//    9   15:getfield        #160 <Field ArrayList mAdded>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #204 <Class Fragment>
	//   13   25:astore_3        
			if(fragment != null && fragment.mFragmentId == i)
	//*  14   26:aload_3         
	//*  15   27:ifnull          40
	//*  16   30:aload_3         
	//*  17   31:getfield        #1239 <Field int Fragment.mFragmentId>
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
	//*  28   48:getfield        #307 <Field SparseArray mActive>
	//*  29   51:ifnull          101
		{
			for(int l = mActive.size() - 1; l >= 0; l--)
	//*  30   54:aload_0         
	//*  31   55:getfield        #307 <Field SparseArray mActive>
	//*  32   58:invokevirtual   #310 <Method int SparseArray.size()>
	//*  33   61:iconst_1        
	//*  34   62:isub            
	//*  35   63:istore_2        
	//*  36   64:iload_2         
	//*  37   65:iflt            101
			{
				Fragment fragment1 = (Fragment)mActive.valueAt(l);
	//   38   68:aload_0         
	//   39   69:getfield        #307 <Field SparseArray mActive>
	//   40   72:iload_2         
	//   41   73:invokevirtual   #313 <Method Object SparseArray.valueAt(int)>
	//   42   76:checkcast       #204 <Class Fragment>
	//   43   79:astore_3        
				if(fragment1 != null && fragment1.mFragmentId == i)
	//*  44   80:aload_3         
	//*  45   81:ifnull          94
	//*  46   84:aload_3         
	//*  47   85:getfield        #1239 <Field int Fragment.mFragmentId>
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

	public Fragment findFragmentByTag(String s1)
	{
		if(s1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          54
		{
			for(int i = mAdded.size() - 1; i >= 0; i--)
	//*   2    4:aload_0         
	//*   3    5:getfield        #160 <Field ArrayList mAdded>
	//*   4    8:invokevirtual   #198 <Method int ArrayList.size()>
	//*   5   11:iconst_1        
	//*   6   12:isub            
	//*   7   13:istore_2        
	//*   8   14:iload_2         
	//*   9   15:iflt            54
			{
				Fragment fragment = (Fragment)mAdded.get(i);
	//   10   18:aload_0         
	//   11   19:getfield        #160 <Field ArrayList mAdded>
	//   12   22:iload_2         
	//   13   23:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   14   26:checkcast       #204 <Class Fragment>
	//   15   29:astore_3        
				if(fragment != null && s1.equals(((Object) (fragment.mTag))))
	//*  16   30:aload_3         
	//*  17   31:ifnull          47
	//*  18   34:aload_1         
	//*  19   35:aload_3         
	//*  20   36:getfield        #1244 <Field String Fragment.mTag>
	//*  21   39:invokevirtual   #665 <Method boolean String.equals(Object)>
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
		if(mActive != null && s1 != null)
	//*  30   54:aload_0         
	//*  31   55:getfield        #307 <Field SparseArray mActive>
	//*  32   58:ifnull          115
	//*  33   61:aload_1         
	//*  34   62:ifnull          115
		{
			for(int k = mActive.size() - 1; k >= 0; k--)
	//*  35   65:aload_0         
	//*  36   66:getfield        #307 <Field SparseArray mActive>
	//*  37   69:invokevirtual   #310 <Method int SparseArray.size()>
	//*  38   72:iconst_1        
	//*  39   73:isub            
	//*  40   74:istore_2        
	//*  41   75:iload_2         
	//*  42   76:iflt            115
			{
				Fragment fragment1 = (Fragment)mActive.valueAt(k);
	//   43   79:aload_0         
	//   44   80:getfield        #307 <Field SparseArray mActive>
	//   45   83:iload_2         
	//   46   84:invokevirtual   #313 <Method Object SparseArray.valueAt(int)>
	//   47   87:checkcast       #204 <Class Fragment>
	//   48   90:astore_3        
				if(fragment1 != null && s1.equals(((Object) (fragment1.mTag))))
	//*  49   91:aload_3         
	//*  50   92:ifnull          108
	//*  51   95:aload_1         
	//*  52   96:aload_3         
	//*  53   97:getfield        #1244 <Field String Fragment.mTag>
	//*  54  100:invokevirtual   #665 <Method boolean String.equals(Object)>
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

	public Fragment findFragmentByWho(String s1)
	{
		if(mActive != null && s1 != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #307 <Field SparseArray mActive>
	//*   2    4:ifnull          60
	//*   3    7:aload_1         
	//*   4    8:ifnull          60
		{
			for(int i = mActive.size() - 1; i >= 0; i--)
	//*   5   11:aload_0         
	//*   6   12:getfield        #307 <Field SparseArray mActive>
	//*   7   15:invokevirtual   #310 <Method int SparseArray.size()>
	//*   8   18:iconst_1        
	//*   9   19:isub            
	//*  10   20:istore_2        
	//*  11   21:iload_2         
	//*  12   22:iflt            60
			{
				Fragment fragment = (Fragment)mActive.valueAt(i);
	//   13   25:aload_0         
	//   14   26:getfield        #307 <Field SparseArray mActive>
	//   15   29:iload_2         
	//   16   30:invokevirtual   #313 <Method Object SparseArray.valueAt(int)>
	//   17   33:checkcast       #204 <Class Fragment>
	//   18   36:astore_3        
				if(fragment == null)
					continue;
	//   19   37:aload_3         
	//   20   38:ifnull          53
				fragment = fragment.findFragmentByWho(s1);
	//   21   41:aload_3         
	//   22   42:aload_1         
	//   23   43:invokevirtual   #1247 <Method Fragment Fragment.findFragmentByWho(String)>
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
	//    3    3:getfield        #889 <Field ArrayList mBackStackIndices>
	//    4    6:iload_1         
	//    5    7:aconst_null     
	//    6    8:invokevirtual   #893 <Method Object ArrayList.set(int, Object)>
	//    7   11:pop             
		if(mAvailBackStackIndices == null)
	//*   8   12:aload_0         
	//*   9   13:getfield        #875 <Field ArrayList mAvailBackStackIndices>
	//*  10   16:ifnonnull       30
			mAvailBackStackIndices = new ArrayList();
	//   11   19:aload_0         
	//   12   20:new             #157 <Class ArrayList>
	//   13   23:dup             
	//   14   24:invokespecial   #158 <Method void ArrayList()>
	//   15   27:putfield        #875 <Field ArrayList mAvailBackStackIndices>
		if(DEBUG)
	//*  16   30:getstatic       #831 <Field boolean DEBUG>
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
	//   28   54:invokevirtual   #885 <Method StringBuilder StringBuilder.append(int)>
	//   29   57:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   30   58:ldc1            #67  <String "FragmentManager">
	//   31   60:aload_2         
	//   32   61:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   33   64:invokestatic    #839 <Method int Log.v(String, String)>
	//   34   67:pop             
		}
		mAvailBackStackIndices.add(((Object) (Integer.valueOf(i))));
	//   35   68:aload_0         
	//   36   69:getfield        #875 <Field ArrayList mAvailBackStackIndices>
	//   37   72:iload_1         
	//   38   73:invokestatic    #1252 <Method Integer Integer.valueOf(int)>
	//   39   76:invokevirtual   #367 <Method boolean ArrayList.add(Object)>
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
	//*   1    1:getfield        #307 <Field SparseArray mActive>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mActive.size();
	//    5    9:aload_0         
	//    6   10:getfield        #307 <Field SparseArray mActive>
	//    7   13:invokevirtual   #310 <Method int SparseArray.size()>
	//    8   16:ireturn         
	}

	List getActiveFragments()
	{
		if(mActive == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #307 <Field SparseArray mActive>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		int k = mActive.size();
	//    5    9:aload_0         
	//    6   10:getfield        #307 <Field SparseArray mActive>
	//    7   13:invokevirtual   #310 <Method int SparseArray.size()>
	//    8   16:istore_2        
		ArrayList arraylist = new ArrayList(k);
	//    9   17:new             #157 <Class ArrayList>
	//   10   20:dup             
	//   11   21:iload_2         
	//   12   22:invokespecial   #366 <Method void ArrayList(int)>
	//   13   25:astore_3        
		for(int i = 0; i < k; i++)
	//*  14   26:iconst_0        
	//*  15   27:istore_1        
	//*  16   28:iload_1         
	//*  17   29:iload_2         
	//*  18   30:icmpge          53
			arraylist.add(mActive.valueAt(i));
	//   19   33:aload_3         
	//   20   34:aload_0         
	//   21   35:getfield        #307 <Field SparseArray mActive>
	//   22   38:iload_1         
	//   23   39:invokevirtual   #313 <Method Object SparseArray.valueAt(int)>
	//   24   42:invokevirtual   #367 <Method boolean ArrayList.add(Object)>
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
	//    1    1:getfield        #827 <Field ArrayList mBackStack>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #1259 <Class FragmentManager$BackStackEntry>
	//    5   11:areturn         
	}

	public int getBackStackEntryCount()
	{
		if(mBackStack != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #827 <Field ArrayList mBackStack>
	//*   2    4:ifnull          15
			return mBackStack.size();
	//    3    7:aload_0         
	//    4    8:getfield        #827 <Field ArrayList mBackStack>
	//    5   11:invokevirtual   #198 <Method int ArrayList.size()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public Fragment getFragment(Bundle bundle, String s1)
	{
		int i = bundle.getInt(s1, -1);
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
	//   11   15:getfield        #307 <Field SparseArray mActive>
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
			stringbuilder.append(s1);
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
	//   36   67:invokevirtual   #885 <Method StringBuilder StringBuilder.append(int)>
	//   37   70:pop             
			throwException(((RuntimeException) (new IllegalStateException(stringbuilder.toString()))));
	//   38   71:aload_0         
	//   39   72:new             #325 <Class IllegalStateException>
	//   40   75:dup             
	//   41   76:aload           4
	//   42   78:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   43   81:invokespecial   #330 <Method void IllegalStateException(String)>
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
	//*   1    1:getfield        #160 <Field ArrayList mAdded>
	//*   2    4:invokevirtual   #549 <Method boolean ArrayList.isEmpty()>
	//*   3    7:ifeq            14
			return Collections.EMPTY_LIST;
	//    4   10:getstatic       #1281 <Field List Collections.EMPTY_LIST>
	//    5   13:areturn         
		List list;
		synchronized(mAdded)
	//*   6   14:aload_0         
	//*   7   15:getfield        #160 <Field ArrayList mAdded>
	//*   8   18:astore_1        
	//*   9   19:aload_1         
	//*  10   20:monitorenter    
		{
			list = (List)mAdded.clone();
	//   11   21:aload_0         
	//   12   22:getfield        #160 <Field ArrayList mAdded>
	//   13   25:invokevirtual   #1284 <Method Object ArrayList.clone()>
	//   14   28:checkcast       #673 <Class List>
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
	//    1    1:getfield        #688 <Field Fragment mPrimaryNav>
	//    2    4:areturn         
	}

	public void hideFragment(Fragment fragment)
	{
		if(DEBUG)
	//*   0    0:getstatic       #831 <Field boolean DEBUG>
	//*   1    3:ifeq            38
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #334 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #335 <Method void StringBuilder()>
	//    5   13:astore_2        
			stringbuilder.append("hide: ");
	//    6   14:aload_2         
	//    7   15:ldc2            #1289 <String "hide: ">
	//    8   18:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (fragment)));
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   14   28:ldc1            #67  <String "FragmentManager">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #839 <Method int Log.v(String, String)>
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
	//   28   53:getfield        #857 <Field boolean Fragment.mHiddenChanged>
	//   29   56:ixor            
	//   30   57:putfield        #857 <Field boolean Fragment.mHiddenChanged>
		}
	//   31   60:return          
	}

	public boolean isDestroyed()
	{
		return mDestroyed;
	//    0    0:aload_0         
	//    1    1:getfield        #969 <Field boolean mDestroyed>
	//    2    4:ireturn         
	}

	boolean isStateAtLeast(int i)
	{
		return mCurState >= i;
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field int mCurState>
	//    2    4:iload_1         
	//    3    5:icmplt          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean isStateSaved()
	{
		return mStateSaved;
	//    0    0:aload_0         
	//    1    1:getfield        #323 <Field boolean mStateSaved>
	//    2    4:ireturn         
	}

	AnimationOrAnimator loadAnimation(Fragment fragment, int i, boolean flag, int k)
	{
		int l;
		l = fragment.getNextAnim();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #210 <Method int Fragment.getNextAnim()>
	//    2    4:istore          7
		Animation animation = fragment.onCreateAnimation(i, flag, l);
	//    3    6:aload_1         
	//    4    7:iload_2         
	//    5    8:iload_3         
	//    6    9:iload           7
	//    7   11:invokevirtual   #1298 <Method Animation Fragment.onCreateAnimation(int, boolean, int)>
	//    8   14:astore          9
		if(animation != null)
	//*   9   16:aload           9
	//*  10   18:ifnull          32
			return new AnimationOrAnimator(animation);
	//   11   21:new             #24  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   12   24:dup             
	//   13   25:aload           9
	//   14   27:aconst_null     
	//   15   28:invokespecial   #615 <Method void FragmentManagerImpl$AnimationOrAnimator(Animation, FragmentManagerImpl$1)>
	//   16   31:areturn         
		fragment = ((Fragment) (fragment.onCreateAnimator(i, flag, l)));
	//   17   32:aload_1         
	//   18   33:iload_2         
	//   19   34:iload_3         
	//   20   35:iload           7
	//   21   37:invokevirtual   #1302 <Method Animator Fragment.onCreateAnimator(int, boolean, int)>
	//   22   40:astore_1        
		if(fragment != null)
	//*  23   41:aload_1         
	//*  24   42:ifnull          55
			return new AnimationOrAnimator(((Animator) (fragment)));
	//   25   45:new             #24  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   26   48:dup             
	//   27   49:aload_1         
	//   28   50:aconst_null     
	//   29   51:invokespecial   #1305 <Method void FragmentManagerImpl$AnimationOrAnimator(Animator, FragmentManagerImpl$1)>
	//   30   54:areturn         
		if(l == 0) goto _L2; else goto _L1
	//   31   55:iload           7
	//   32   57:ifeq            202
_L1:
		boolean flag1;
		boolean flag2;
		boolean flag3;
		flag3 = "anim".equals(((Object) (mHost.getContext().getResources().getResourceTypeName(l))));
	//   33   60:ldc2            #1307 <String "anim">
	//   34   63:aload_0         
	//   35   64:getfield        #438 <Field FragmentHostCallback mHost>
	//   36   67:invokevirtual   #1311 <Method Context FragmentHostCallback.getContext()>
	//   37   70:invokevirtual   #1317 <Method Resources Context.getResources()>
	//   38   73:iload           7
	//   39   75:invokevirtual   #1322 <Method String Resources.getResourceTypeName(int)>
	//   40   78:invokevirtual   #665 <Method boolean String.equals(Object)>
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
		fragment = ((Fragment) (AnimationUtils.loadAnimation(mHost.getContext(), l)));
	//   48   95:aload_0         
	//   49   96:getfield        #438 <Field FragmentHostCallback mHost>
	//   50   99:invokevirtual   #1311 <Method Context FragmentHostCallback.getContext()>
	//   51  102:iload           7
	//   52  104:invokestatic    #1327 <Method Animation AnimationUtils.loadAnimation(Context, int)>
	//   53  107:astore_1        
		if(fragment == null)
			break MISSING_BLOCK_LABEL_124;
	//   54  108:aload_1         
	//   55  109:ifnull          124
		fragment = ((Fragment) (new AnimationOrAnimator(((Animation) (fragment)))));
	//   56  112:new             #24  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   57  115:dup             
	//   58  116:aload_1         
	//   59  117:aconst_null     
	//   60  118:invokespecial   #615 <Method void FragmentManagerImpl$AnimationOrAnimator(Animation, FragmentManagerImpl$1)>
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
		fragment = ((Fragment) (AnimatorInflater.loadAnimator(mHost.getContext(), l)));
	//   72  138:aload_0         
	//   73  139:getfield        #438 <Field FragmentHostCallback mHost>
	//   74  142:invokevirtual   #1311 <Method Context FragmentHostCallback.getContext()>
	//   75  145:iload           7
	//   76  147:invokestatic    #1333 <Method Animator AnimatorInflater.loadAnimator(Context, int)>
	//   77  150:astore_1        
		if(fragment == null) goto _L2; else goto _L4
	//   78  151:aload_1         
	//   79  152:ifnull          202
_L4:
		fragment = ((Fragment) (new AnimationOrAnimator(((Animator) (fragment)))));
	//   80  155:new             #24  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   81  158:dup             
	//   82  159:aload_1         
	//   83  160:aconst_null     
	//   84  161:invokespecial   #1305 <Method void FragmentManagerImpl$AnimationOrAnimator(Animator, FragmentManagerImpl$1)>
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
		fragment = ((Fragment) (AnimationUtils.loadAnimation(mHost.getContext(), l)));
	//   93  175:aload_0         
	//   94  176:getfield        #438 <Field FragmentHostCallback mHost>
	//   95  179:invokevirtual   #1311 <Method Context FragmentHostCallback.getContext()>
	//   96  182:iload           7
	//   97  184:invokestatic    #1327 <Method Animation AnimationUtils.loadAnimation(Context, int)>
	//   98  187:astore_1        
		if(fragment != null)
	//*  99  188:aload_1         
	//* 100  189:ifnull          202
			return new AnimationOrAnimator(((Animation) (fragment)));
	//  101  192:new             #24  <Class FragmentManagerImpl$AnimationOrAnimator>
	//  102  195:dup             
	//  103  196:aload_1         
	//  104  197:aconst_null     
	//  105  198:invokespecial   #615 <Method void FragmentManagerImpl$AnimationOrAnimator(Animation, FragmentManagerImpl$1)>
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
	//  113  210:invokestatic    #1335 <Method int transitToStyleIndex(int, boolean)>
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
			i = k;
	//  121  260:iload           4
	//  122  262:istore_2        
			if(k == 0)
	//* 123  263:iload           4
	//* 124  265:ifne            386
			{
				i = k;
	//  125  268:iload           4
	//  126  270:istore_2        
				if(mHost.onHasWindowAnimations())
	//* 127  271:aload_0         
	//* 128  272:getfield        #438 <Field FragmentHostCallback mHost>
	//* 129  275:invokevirtual   #1338 <Method boolean FragmentHostCallback.onHasWindowAnimations()>
	//* 130  278:ifeq            386
					i = mHost.onGetWindowAnimations();
	//  131  281:aload_0         
	//  132  282:getfield        #438 <Field FragmentHostCallback mHost>
	//  133  285:invokevirtual   #1341 <Method int FragmentHostCallback.onGetWindowAnimations()>
	//  134  288:istore_2        
			}
			break;

	//* 135  289:goto            386
		case 6: // '\006'
			return makeFadeAnimation(mHost.getContext(), 1.0F, 0.0F);
	//  136  292:aload_0         
	//  137  293:getfield        #438 <Field FragmentHostCallback mHost>
	//  138  296:invokevirtual   #1311 <Method Context FragmentHostCallback.getContext()>
	//  139  299:fconst_1        
	//  140  300:fconst_0        
	//  141  301:invokestatic    #1343 <Method FragmentManagerImpl$AnimationOrAnimator makeFadeAnimation(Context, float, float)>
	//  142  304:areturn         

		case 5: // '\005'
			return makeFadeAnimation(mHost.getContext(), 0.0F, 1.0F);
	//  143  305:aload_0         
	//  144  306:getfield        #438 <Field FragmentHostCallback mHost>
	//  145  309:invokevirtual   #1311 <Method Context FragmentHostCallback.getContext()>
	//  146  312:fconst_0        
	//  147  313:fconst_1        
	//  148  314:invokestatic    #1343 <Method FragmentManagerImpl$AnimationOrAnimator makeFadeAnimation(Context, float, float)>
	//  149  317:areturn         

		case 4: // '\004'
			return makeOpenCloseAnimation(mHost.getContext(), 1.0F, 1.075F, 1.0F, 0.0F);
	//  150  318:aload_0         
	//  151  319:getfield        #438 <Field FragmentHostCallback mHost>
	//  152  322:invokevirtual   #1311 <Method Context FragmentHostCallback.getContext()>
	//  153  325:fconst_1        
	//  154  326:ldc2            #1344 <Float 1.075F>
	//  155  329:fconst_1        
	//  156  330:fconst_0        
	//  157  331:invokestatic    #1346 <Method FragmentManagerImpl$AnimationOrAnimator makeOpenCloseAnimation(Context, float, float, float, float)>
	//  158  334:areturn         

		case 3: // '\003'
			return makeOpenCloseAnimation(mHost.getContext(), 0.975F, 1.0F, 0.0F, 1.0F);
	//  159  335:aload_0         
	//  160  336:getfield        #438 <Field FragmentHostCallback mHost>
	//  161  339:invokevirtual   #1311 <Method Context FragmentHostCallback.getContext()>
	//  162  342:ldc2            #1347 <Float 0.975F>
	//  163  345:fconst_1        
	//  164  346:fconst_0        
	//  165  347:fconst_1        
	//  166  348:invokestatic    #1346 <Method FragmentManagerImpl$AnimationOrAnimator makeOpenCloseAnimation(Context, float, float, float, float)>
	//  167  351:areturn         

		case 2: // '\002'
			return makeOpenCloseAnimation(mHost.getContext(), 1.0F, 0.975F, 1.0F, 0.0F);
	//  168  352:aload_0         
	//  169  353:getfield        #438 <Field FragmentHostCallback mHost>
	//  170  356:invokevirtual   #1311 <Method Context FragmentHostCallback.getContext()>
	//  171  359:fconst_1        
	//  172  360:ldc2            #1347 <Float 0.975F>
	//  173  363:fconst_1        
	//  174  364:fconst_0        
	//  175  365:invokestatic    #1346 <Method FragmentManagerImpl$AnimationOrAnimator makeOpenCloseAnimation(Context, float, float, float, float)>
	//  176  368:areturn         

		case 1: // '\001'
			return makeOpenCloseAnimation(mHost.getContext(), 1.125F, 1.0F, 0.0F, 1.0F);
	//  177  369:aload_0         
	//  178  370:getfield        #438 <Field FragmentHostCallback mHost>
	//  179  373:invokevirtual   #1311 <Method Context FragmentHostCallback.getContext()>
	//  180  376:ldc2            #1348 <Float 1.125F>
	//  181  379:fconst_1        
	//  182  380:fconst_0        
	//  183  381:fconst_1        
	//  184  382:invokestatic    #1346 <Method FragmentManagerImpl$AnimationOrAnimator makeOpenCloseAnimation(Context, float, float, float, float)>
	//  185  385:areturn         
		}
		if(i != 0);
	//  186  386:iload_2         
	//  187  387:ifne            390
		return null;
	//  188  390:aconst_null     
	//  189  391:areturn         
		fragment;
	//  190  392:astore_1        
		flag1 = flag2;
	//  191  393:iload           6
	//  192  395:istore          5
		if(true) goto _L6; else goto _L5
	//  193  397:goto            133
_L5:
	}

	void makeActive(Fragment fragment)
	{
		if(fragment.mIndex >= 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1349 <Field int Fragment.mIndex>
	//*   2    4:iflt            8
			return;
	//    3    7:return          
		int i = mNextFragmentIndex;
	//    4    8:aload_0         
	//    5    9:getfield        #155 <Field int mNextFragmentIndex>
	//    6   12:istore_2        
		mNextFragmentIndex = i + 1;
	//    7   13:aload_0         
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:iadd            
	//   11   17:putfield        #155 <Field int mNextFragmentIndex>
		fragment.setIndex(i, mParent);
	//   12   20:aload_1         
	//   13   21:iload_2         
	//   14   22:aload_0         
	//   15   23:getfield        #905 <Field Fragment mParent>
	//   16   26:invokevirtual   #1353 <Method void Fragment.setIndex(int, Fragment)>
		if(mActive == null)
	//*  17   29:aload_0         
	//*  18   30:getfield        #307 <Field SparseArray mActive>
	//*  19   33:ifnonnull       47
			mActive = new SparseArray();
	//   20   36:aload_0         
	//   21   37:new             #309 <Class SparseArray>
	//   22   40:dup             
	//   23   41:invokespecial   #1354 <Method void SparseArray()>
	//   24   44:putfield        #307 <Field SparseArray mActive>
		mActive.put(fragment.mIndex, ((Object) (fragment)));
	//   25   47:aload_0         
	//   26   48:getfield        #307 <Field SparseArray mActive>
	//   27   51:aload_1         
	//   28   52:getfield        #1349 <Field int Fragment.mIndex>
	//   29   55:aload_1         
	//   30   56:invokevirtual   #1357 <Method void SparseArray.put(int, Object)>
		if(DEBUG)
	//*  31   59:getstatic       #831 <Field boolean DEBUG>
	//*  32   62:ifeq            97
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   33   65:new             #334 <Class StringBuilder>
	//   34   68:dup             
	//   35   69:invokespecial   #335 <Method void StringBuilder()>
	//   36   72:astore_3        
			stringbuilder.append("Allocated fragment index ");
	//   37   73:aload_3         
	//   38   74:ldc2            #1359 <String "Allocated fragment index ">
	//   39   77:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   40   80:pop             
			stringbuilder.append(((Object) (fragment)));
	//   41   81:aload_3         
	//   42   82:aload_1         
	//   43   83:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   44   86:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   45   87:ldc1            #67  <String "FragmentManager">
	//   46   89:aload_3         
	//   47   90:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   48   93:invokestatic    #839 <Method int Log.v(String, String)>
	//   49   96:pop             
		}
	//   50   97:return          
	}

	void makeInactive(Fragment fragment)
	{
		if(fragment.mIndex < 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1349 <Field int Fragment.mIndex>
	//*   2    4:ifge            8
			return;
	//    3    7:return          
		if(DEBUG)
	//*   4    8:getstatic       #831 <Field boolean DEBUG>
	//*   5   11:ifeq            46
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   14:new             #334 <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #335 <Method void StringBuilder()>
	//    9   21:astore_2        
			stringbuilder.append("Freeing fragment index ");
	//   10   22:aload_2         
	//   11   23:ldc2            #1362 <String "Freeing fragment index ">
	//   12   26:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:pop             
			stringbuilder.append(((Object) (fragment)));
	//   14   30:aload_2         
	//   15   31:aload_1         
	//   16   32:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   17   35:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   18   36:ldc1            #67  <String "FragmentManager">
	//   19   38:aload_2         
	//   20   39:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   21   42:invokestatic    #839 <Method int Log.v(String, String)>
	//   22   45:pop             
		}
		mActive.put(fragment.mIndex, ((Object) (null)));
	//   23   46:aload_0         
	//   24   47:getfield        #307 <Field SparseArray mActive>
	//   25   50:aload_1         
	//   26   51:getfield        #1349 <Field int Fragment.mIndex>
	//   27   54:aconst_null     
	//   28   55:invokevirtual   #1357 <Method void SparseArray.put(int, Object)>
		mHost.inactivateFragment(fragment.mWho);
	//   29   58:aload_0         
	//   30   59:getfield        #438 <Field FragmentHostCallback mHost>
	//   31   62:aload_1         
	//   32   63:getfield        #1365 <Field String Fragment.mWho>
	//   33   66:invokevirtual   #1368 <Method void FragmentHostCallback.inactivateFragment(String)>
		fragment.initState();
	//   34   69:aload_1         
	//   35   70:invokevirtual   #1371 <Method void Fragment.initState()>
	//   36   73:return          
	}

	void moveFragmentToExpectedState(Fragment fragment)
	{
		if(fragment == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		int l = mCurState;
	//    3    5:aload_0         
	//    4    6:getfield        #167 <Field int mCurState>
	//    5    9:istore_3        
		int i = l;
	//    6   10:iload_3         
	//    7   11:istore_2        
		if(fragment.mRemoving)
	//*   8   12:aload_1         
	//*   9   13:getfield        #854 <Field boolean Fragment.mRemoving>
	//*  10   16:ifeq            41
			if(fragment.isInBackStack())
	//*  11   19:aload_1         
	//*  12   20:invokevirtual   #1375 <Method boolean Fragment.isInBackStack()>
	//*  13   23:ifeq            35
				i = Math.min(l, 1);
	//   14   26:iload_3         
	//   15   27:iconst_1        
	//   16   28:invokestatic    #194 <Method int Math.min(int, int)>
	//   17   31:istore_2        
			else
	//*  18   32:goto            41
				i = Math.min(l, 0);
	//   19   35:iload_3         
	//   20   36:iconst_0        
	//   21   37:invokestatic    #194 <Method int Math.min(int, int)>
	//   22   40:istore_2        
		moveToState(fragment, i, fragment.getNextTransition(), fragment.getNextTransitionStyle(), false);
	//   23   41:aload_0         
	//   24   42:aload_1         
	//   25   43:iload_2         
	//   26   44:aload_1         
	//   27   45:invokevirtual   #213 <Method int Fragment.getNextTransition()>
	//   28   48:aload_1         
	//   29   49:invokevirtual   #917 <Method int Fragment.getNextTransitionStyle()>
	//   30   52:iconst_0        
	//   31   53:invokevirtual   #217 <Method void moveToState(Fragment, int, int, int, boolean)>
		if(fragment.mView != null)
	//*  32   56:aload_1         
	//*  33   57:getfield        #221 <Field View Fragment.mView>
	//*  34   60:ifnull          244
		{
			Object obj = ((Object) (findFragmentUnder(fragment)));
	//   35   63:aload_0         
	//   36   64:aload_1         
	//   37   65:invokespecial   #1377 <Method Fragment findFragmentUnder(Fragment)>
	//   38   68:astore          4
			if(obj != null)
	//*  39   70:aload           4
	//*  40   72:ifnull          127
			{
				obj = ((Object) (((Fragment) (obj)).mView));
	//   41   75:aload           4
	//   42   77:getfield        #221 <Field View Fragment.mView>
	//   43   80:astore          4
				ViewGroup viewgroup = fragment.mContainer;
	//   44   82:aload_1         
	//   45   83:getfield        #283 <Field ViewGroup Fragment.mContainer>
	//   46   86:astore          5
				int k = viewgroup.indexOfChild(((View) (obj)));
	//   47   88:aload           5
	//   48   90:aload           4
	//   49   92:invokevirtual   #1381 <Method int ViewGroup.indexOfChild(View)>
	//   50   95:istore_2        
				int i1 = viewgroup.indexOfChild(fragment.mView);
	//   51   96:aload           5
	//   52   98:aload_1         
	//   53   99:getfield        #221 <Field View Fragment.mView>
	//   54  102:invokevirtual   #1381 <Method int ViewGroup.indexOfChild(View)>
	//   55  105:istore_3        
				if(i1 < k)
	//*  56  106:iload_3         
	//*  57  107:iload_2         
	//*  58  108:icmpge          127
				{
					viewgroup.removeViewAt(i1);
	//   59  111:aload           5
	//   60  113:iload_3         
	//   61  114:invokevirtual   #1384 <Method void ViewGroup.removeViewAt(int)>
					viewgroup.addView(fragment.mView, k);
	//   62  117:aload           5
	//   63  119:aload_1         
	//   64  120:getfield        #221 <Field View Fragment.mView>
	//   65  123:iload_2         
	//   66  124:invokevirtual   #1388 <Method void ViewGroup.addView(View, int)>
				}
			}
			if(fragment.mIsNewlyAdded && fragment.mContainer != null)
	//*  67  127:aload_1         
	//*  68  128:getfield        #227 <Field boolean Fragment.mIsNewlyAdded>
	//*  69  131:ifeq            244
	//*  70  134:aload_1         
	//*  71  135:getfield        #283 <Field ViewGroup Fragment.mContainer>
	//*  72  138:ifnull          244
			{
				if(fragment.mPostponedAlpha > 0.0F)
	//*  73  141:aload_1         
	//*  74  142:getfield        #393 <Field float Fragment.mPostponedAlpha>
	//*  75  145:fconst_0        
	//*  76  146:fcmpl           
	//*  77  147:ifle            161
					fragment.mView.setAlpha(fragment.mPostponedAlpha);
	//   78  150:aload_1         
	//   79  151:getfield        #221 <Field View Fragment.mView>
	//   80  154:aload_1         
	//   81  155:getfield        #393 <Field float Fragment.mPostponedAlpha>
	//   82  158:invokevirtual   #396 <Method void View.setAlpha(float)>
				fragment.mPostponedAlpha = 0.0F;
	//   83  161:aload_1         
	//   84  162:fconst_0        
	//   85  163:putfield        #393 <Field float Fragment.mPostponedAlpha>
				fragment.mIsNewlyAdded = false;
	//   86  166:aload_1         
	//   87  167:iconst_0        
	//   88  168:putfield        #227 <Field boolean Fragment.mIsNewlyAdded>
				AnimationOrAnimator animationoranimator = loadAnimation(fragment, fragment.getNextTransition(), true, fragment.getNextTransitionStyle());
	//   89  171:aload_0         
	//   90  172:aload_1         
	//   91  173:aload_1         
	//   92  174:invokevirtual   #213 <Method int Fragment.getNextTransition()>
	//   93  177:iconst_1        
	//   94  178:aload_1         
	//   95  179:invokevirtual   #917 <Method int Fragment.getNextTransitionStyle()>
	//   96  182:invokevirtual   #921 <Method FragmentManagerImpl$AnimationOrAnimator loadAnimation(Fragment, int, boolean, int)>
	//   97  185:astore          4
				if(animationoranimator != null)
	//*  98  187:aload           4
	//*  99  189:ifnull          244
				{
					setHWLayerAnimListenerIfAlpha(fragment.mView, animationoranimator);
	//  100  192:aload_1         
	//  101  193:getfield        #221 <Field View Fragment.mView>
	//  102  196:aload           4
	//  103  198:invokestatic    #266 <Method void setHWLayerAnimListenerIfAlpha(View, FragmentManagerImpl$AnimationOrAnimator)>
					if(animationoranimator.animation != null)
	//* 104  201:aload           4
	//* 105  203:getfield        #245 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//* 106  206:ifnull          224
					{
						fragment.mView.startAnimation(animationoranimator.animation);
	//  107  209:aload_1         
	//  108  210:getfield        #221 <Field View Fragment.mView>
	//  109  213:aload           4
	//  110  215:getfield        #245 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//  111  218:invokevirtual   #272 <Method void View.startAnimation(Animation)>
					} else
	//* 112  221:goto            244
					{
						animationoranimator.animator.setTarget(((Object) (fragment.mView)));
	//  113  224:aload           4
	//  114  226:getfield        #276 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//  115  229:aload_1         
	//  116  230:getfield        #221 <Field View Fragment.mView>
	//  117  233:invokevirtual   #301 <Method void Animator.setTarget(Object)>
						animationoranimator.animator.start();
	//  118  236:aload           4
	//  119  238:getfield        #276 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//  120  241:invokevirtual   #304 <Method void Animator.start()>
					}
				}
			}
		}
		if(fragment.mHiddenChanged)
	//* 121  244:aload_1         
	//* 122  245:getfield        #857 <Field boolean Fragment.mHiddenChanged>
	//* 123  248:ifeq            256
			completeShowHideFragment(fragment);
	//  124  251:aload_0         
	//  125  252:aload_1         
	//  126  253:invokevirtual   #1390 <Method void completeShowHideFragment(Fragment)>
	//  127  256:return          
	}

	void moveToState(int i, boolean flag)
	{
label0:
		{
			if(mHost == null && i != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #438 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       22
	//*   3    7:iload_1         
	//*   4    8:ifeq            22
				throw new IllegalStateException("No activity");
	//    5   11:new             #325 <Class IllegalStateException>
	//    6   14:dup             
	//    7   15:ldc2            #1392 <String "No activity">
	//    8   18:invokespecial   #330 <Method void IllegalStateException(String)>
	//    9   21:athrow          
			if(!flag && i == mCurState)
	//*  10   22:iload_2         
	//*  11   23:ifne            35
	//*  12   26:iload_1         
	//*  13   27:aload_0         
	//*  14   28:getfield        #167 <Field int mCurState>
	//*  15   31:icmpne          35
				return;
	//   16   34:return          
			mCurState = i;
	//   17   35:aload_0         
	//   18   36:iload_1         
	//   19   37:putfield        #167 <Field int mCurState>
			if(mActive == null)
				break label0;
	//   20   40:aload_0         
	//   21   41:getfield        #307 <Field SparseArray mActive>
	//   22   44:ifnull          273
			int j1 = mAdded.size();
	//   23   47:aload_0         
	//   24   48:getfield        #160 <Field ArrayList mAdded>
	//   25   51:invokevirtual   #198 <Method int ArrayList.size()>
	//   26   54:istore          5
			int k = 0;
	//   27   56:iconst_0        
	//   28   57:istore_3        
			int l;
			for(i = 0; k < j1; i = l)
	//*  29   58:iconst_0        
	//*  30   59:istore_1        
	//*  31   60:iload_3         
	//*  32   61:iload           5
	//*  33   63:icmpge          118
			{
				Fragment fragment = (Fragment)mAdded.get(k);
	//   34   66:aload_0         
	//   35   67:getfield        #160 <Field ArrayList mAdded>
	//   36   70:iload_3         
	//   37   71:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   38   74:checkcast       #204 <Class Fragment>
	//   39   77:astore          6
				moveFragmentToExpectedState(fragment);
	//   40   79:aload_0         
	//   41   80:aload           6
	//   42   82:invokevirtual   #1394 <Method void moveFragmentToExpectedState(Fragment)>
				l = i;
	//   43   85:iload_1         
	//   44   86:istore          4
				if(fragment.mLoaderManager != null)
	//*  45   88:aload           6
	//*  46   90:getfield        #1112 <Field LoaderManagerImpl Fragment.mLoaderManager>
	//*  47   93:ifnull          108
					l = i | fragment.mLoaderManager.hasRunningLoaders();
	//   48   96:iload_1         
	//   49   97:aload           6
	//   50   99:getfield        #1112 <Field LoaderManagerImpl Fragment.mLoaderManager>
	//   51  102:invokevirtual   #1117 <Method boolean LoaderManagerImpl.hasRunningLoaders()>
	//   52  105:ior             
	//   53  106:istore          4
				k++;
	//   54  108:iload_3         
	//   55  109:iconst_1        
	//   56  110:iadd            
	//   57  111:istore_3        
			}

	//   58  112:iload           4
	//   59  114:istore_1        
	//*  60  115:goto            60
			j1 = mActive.size();
	//   61  118:aload_0         
	//   62  119:getfield        #307 <Field SparseArray mActive>
	//   63  122:invokevirtual   #310 <Method int SparseArray.size()>
	//   64  125:istore          5
			boolean flag1 = false;
	//   65  127:iconst_0        
	//   66  128:istore          4
			k = i;
	//   67  130:iload_1         
	//   68  131:istore_3        
			for(i = ((int) (flag1)); i < j1;)
	//*  69  132:iload           4
	//*  70  134:istore_1        
	//*  71  135:iload_1         
	//*  72  136:iload           5
	//*  73  138:icmpge          231
			{
				int i1;
label1:
				{
					Fragment fragment1 = (Fragment)mActive.valueAt(i);
	//   74  141:aload_0         
	//   75  142:getfield        #307 <Field SparseArray mActive>
	//   76  145:iload_1         
	//   77  146:invokevirtual   #313 <Method Object SparseArray.valueAt(int)>
	//   78  149:checkcast       #204 <Class Fragment>
	//   79  152:astore          6
					i1 = k;
	//   80  154:iload_3         
	//   81  155:istore          4
					if(fragment1 == null)
						break label1;
	//   82  157:aload           6
	//   83  159:ifnull          221
					if(!fragment1.mRemoving)
	//*  84  162:aload           6
	//*  85  164:getfield        #854 <Field boolean Fragment.mRemoving>
	//*  86  167:ifne            181
					{
						i1 = k;
	//   87  170:iload_3         
	//   88  171:istore          4
						if(!fragment1.mDetached)
							break label1;
	//   89  173:aload           6
	//   90  175:getfield        #846 <Field boolean Fragment.mDetached>
	//   91  178:ifeq            221
					}
					i1 = k;
	//   92  181:iload_3         
	//   93  182:istore          4
					if(!fragment1.mIsNewlyAdded)
	//*  94  184:aload           6
	//*  95  186:getfield        #227 <Field boolean Fragment.mIsNewlyAdded>
	//*  96  189:ifne            221
					{
						moveFragmentToExpectedState(fragment1);
	//   97  192:aload_0         
	//   98  193:aload           6
	//   99  195:invokevirtual   #1394 <Method void moveFragmentToExpectedState(Fragment)>
						i1 = k;
	//  100  198:iload_3         
	//  101  199:istore          4
						if(fragment1.mLoaderManager != null)
	//* 102  201:aload           6
	//* 103  203:getfield        #1112 <Field LoaderManagerImpl Fragment.mLoaderManager>
	//* 104  206:ifnull          221
							i1 = k | fragment1.mLoaderManager.hasRunningLoaders();
	//  105  209:iload_3         
	//  106  210:aload           6
	//  107  212:getfield        #1112 <Field LoaderManagerImpl Fragment.mLoaderManager>
	//  108  215:invokevirtual   #1117 <Method boolean LoaderManagerImpl.hasRunningLoaders()>
	//  109  218:ior             
	//  110  219:istore          4
					}
				}
				i++;
	//  111  221:iload_1         
	//  112  222:iconst_1        
	//  113  223:iadd            
	//  114  224:istore_1        
				k = i1;
	//  115  225:iload           4
	//  116  227:istore_3        
			}

	//* 117  228:goto            135
			if(k == 0)
	//* 118  231:iload_3         
	//* 119  232:ifne            239
				startPendingDeferredFragments();
	//  120  235:aload_0         
	//  121  236:invokevirtual   #1120 <Method void startPendingDeferredFragments()>
			if(mNeedMenuInvalidate && mHost != null && mCurState == 5)
	//* 122  239:aload_0         
	//* 123  240:getfield        #865 <Field boolean mNeedMenuInvalidate>
	//* 124  243:ifeq            273
	//* 125  246:aload_0         
	//* 126  247:getfield        #438 <Field FragmentHostCallback mHost>
	//* 127  250:ifnull          273
	//* 128  253:aload_0         
	//* 129  254:getfield        #167 <Field int mCurState>
	//* 130  257:iconst_5        
	//* 131  258:icmpne          273
			{
				mHost.onSupportInvalidateOptionsMenu();
	//  132  261:aload_0         
	//  133  262:getfield        #438 <Field FragmentHostCallback mHost>
	//  134  265:invokevirtual   #1397 <Method void FragmentHostCallback.onSupportInvalidateOptionsMenu()>
				mNeedMenuInvalidate = false;
	//  135  268:aload_0         
	//  136  269:iconst_0        
	//  137  270:putfield        #865 <Field boolean mNeedMenuInvalidate>
			}
		}
	//  138  273:return          
	}

	void moveToState(Fragment fragment)
	{
		moveToState(fragment, mCurState, 0, 0, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #167 <Field int mCurState>
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #217 <Method void moveToState(Fragment, int, int, int, boolean)>
	//    8   12:return          
	}

	void moveToState(Fragment fragment, int i, int k, int l, boolean flag)
	{
		android.content.res.Resources.NotFoundException notfoundexception;
		boolean flag2 = fragment.mAdded;
	//    0    0:aload_1         
	//    1    1:getfield        #638 <Field boolean Fragment.mAdded>
	//    2    4:istore          9
		int k1 = 1;
	//    3    6:iconst_1        
	//    4    7:istore          7
		boolean flag1 = true;
	//    5    9:iconst_1        
	//    6   10:istore          8
		if(!flag2 || fragment.mDetached)
	//*   7   12:iload           9
	//*   8   14:ifeq            30
	//*   9   17:aload_1         
	//*  10   18:getfield        #846 <Field boolean Fragment.mDetached>
	//*  11   21:ifeq            27
	//*  12   24:goto            30
	//*  13   27:goto            44
		{
			int i1 = i;
	//   14   30:iload_2         
	//   15   31:istore          6
			i = i1;
	//   16   33:iload           6
	//   17   35:istore_2        
			if(i1 > 1)
	//*  18   36:iload           6
	//*  19   38:iconst_1        
	//*  20   39:icmple          44
				i = 1;
	//   21   42:iconst_1        
	//   22   43:istore_2        
		}
		int j1 = i;
	//   23   44:iload_2         
	//   24   45:istore          6
		if(fragment.mRemoving)
	//*  25   47:aload_1         
	//*  26   48:getfield        #854 <Field boolean Fragment.mRemoving>
	//*  27   51:ifeq            91
		{
			j1 = i;
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
	//*  38   73:invokevirtual   #1375 <Method boolean Fragment.isInBackStack()>
	//*  39   76:ifeq            85
					j1 = 1;
	//   40   79:iconst_1        
	//   41   80:istore          6
				else
	//*  42   82:goto            91
					j1 = fragment.mState;
	//   43   85:aload_1         
	//   44   86:getfield        #207 <Field int Fragment.mState>
	//   45   89:istore          6
		}
		if(fragment.mDeferStart && fragment.mState < 4 && j1 > 3)
	//*  46   91:aload_1         
	//*  47   92:getfield        #1400 <Field boolean Fragment.mDeferStart>
	//*  48   95:ifeq            117
	//*  49   98:aload_1         
	//*  50   99:getfield        #207 <Field int Fragment.mState>
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
			i = j1;
	//   59  117:iload           6
	//   60  119:istore_2        
		if(fragment.mState <= i)
	//*  61  120:aload_1         
	//*  62  121:getfield        #207 <Field int Fragment.mState>
	//*  63  124:iload_2         
	//*  64  125:icmpgt          1368
		{
			if(fragment.mFromLayout && !fragment.mInLayout)
	//*  65  128:aload_1         
	//*  66  129:getfield        #1204 <Field boolean Fragment.mFromLayout>
	//*  67  132:ifeq            143
	//*  68  135:aload_1         
	//*  69  136:getfield        #1403 <Field boolean Fragment.mInLayout>
	//*  70  139:ifne            143
				return;
	//   71  142:return          
			if(fragment.getAnimatingAway() != null || fragment.getAnimator() != null)
	//*  72  143:aload_1         
	//*  73  144:invokevirtual   #407 <Method View Fragment.getAnimatingAway()>
	//*  74  147:ifnonnull       157
	//*  75  150:aload_1         
	//*  76  151:invokevirtual   #424 <Method Animator Fragment.getAnimator()>
	//*  77  154:ifnull          179
			{
				fragment.setAnimatingAway(((View) (null)));
	//   78  157:aload_1         
	//   79  158:aconst_null     
	//   80  159:invokevirtual   #249 <Method void Fragment.setAnimatingAway(View)>
				fragment.setAnimator(((Animator) (null)));
	//   81  162:aload_1         
	//   82  163:aconst_null     
	//   83  164:invokevirtual   #280 <Method void Fragment.setAnimator(Animator)>
				moveToState(fragment, fragment.getStateAfterAnimating(), 0, 0, true);
	//   84  167:aload_0         
	//   85  168:aload_1         
	//   86  169:aload_1         
	//   87  170:invokevirtual   #410 <Method int Fragment.getStateAfterAnimating()>
	//   88  173:iconst_0        
	//   89  174:iconst_0        
	//   90  175:iconst_1        
	//   91  176:invokevirtual   #217 <Method void moveToState(Fragment, int, int, int, boolean)>
			}
			l = i;
	//   92  179:iload_2         
	//   93  180:istore          4
			j1 = i;
	//   94  182:iload_2         
	//   95  183:istore          6
			k1 = i;
	//   96  185:iload_2         
	//   97  186:istore          7
			k = i;
	//   98  188:iload_2         
	//   99  189:istore_3        
			switch(fragment.mState)
	//* 100  190:aload_1         
	//* 101  191:getfield        #207 <Field int Fragment.mState>
			{
	//* 102  194:tableswitch     0 4: default 228
	//	               0 234
	//	               1 743
	//	               2 1209
	//	               3 1228
	//	               4 1292
			default:
				j1 = i;
	//  103  228:iload_2         
	//  104  229:istore          6
				break;

	//* 105  231:goto            2022
			case 0: // '\0'
				l = i;
	//  106  234:iload_2         
	//  107  235:istore          4
				if(i > 0)
	//* 108  237:iload_2         
	//* 109  238:ifle            743
				{
					if(DEBUG)
	//* 110  241:getstatic       #831 <Field boolean DEBUG>
	//* 111  244:ifeq            283
					{
						StringBuilder stringbuilder = new StringBuilder();
	//  112  247:new             #334 <Class StringBuilder>
	//  113  250:dup             
	//  114  251:invokespecial   #335 <Method void StringBuilder()>
	//  115  254:astore          10
						stringbuilder.append("moveto CREATED: ");
	//  116  256:aload           10
	//  117  258:ldc2            #1405 <String "moveto CREATED: ">
	//  118  261:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  119  264:pop             
						stringbuilder.append(((Object) (fragment)));
	//  120  265:aload           10
	//  121  267:aload_1         
	//  122  268:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  123  271:pop             
						Log.v("FragmentManager", stringbuilder.toString());
	//  124  272:ldc1            #67  <String "FragmentManager">
	//  125  274:aload           10
	//  126  276:invokevirtual   #345 <Method String StringBuilder.toString()>
	//  127  279:invokestatic    #839 <Method int Log.v(String, String)>
	//  128  282:pop             
					}
					l = i;
	//  129  283:iload_2         
	//  130  284:istore          4
					if(fragment.mSavedFragmentState != null)
	//* 131  286:aload_1         
	//* 132  287:getfield        #1210 <Field Bundle Fragment.mSavedFragmentState>
	//* 133  290:ifnull          398
					{
						fragment.mSavedFragmentState.setClassLoader(mHost.getContext().getClassLoader());
	//  134  293:aload_1         
	//  135  294:getfield        #1210 <Field Bundle Fragment.mSavedFragmentState>
	//  136  297:aload_0         
	//  137  298:getfield        #438 <Field FragmentHostCallback mHost>
	//  138  301:invokevirtual   #1311 <Method Context FragmentHostCallback.getContext()>
	//  139  304:invokevirtual   #1409 <Method ClassLoader Context.getClassLoader()>
	//  140  307:invokevirtual   #1413 <Method void Bundle.setClassLoader(ClassLoader)>
						fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
	//  141  310:aload_1         
	//  142  311:aload_1         
	//  143  312:getfield        #1210 <Field Bundle Fragment.mSavedFragmentState>
	//  144  315:ldc1            #79  <String "android:view_state">
	//  145  317:invokevirtual   #1417 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//  146  320:putfield        #1420 <Field SparseArray Fragment.mSavedViewState>
						fragment.mTarget = getFragment(fragment.mSavedFragmentState, "android:target_state");
	//  147  323:aload_1         
	//  148  324:aload_0         
	//  149  325:aload_1         
	//  150  326:getfield        #1210 <Field Bundle Fragment.mSavedFragmentState>
	//  151  329:ldc1            #73  <String "android:target_state">
	//  152  331:invokevirtual   #1422 <Method Fragment getFragment(Bundle, String)>
	//  153  334:putfield        #1425 <Field Fragment Fragment.mTarget>
						if(fragment.mTarget != null)
	//* 154  337:aload_1         
	//* 155  338:getfield        #1425 <Field Fragment Fragment.mTarget>
	//* 156  341:ifnull          358
							fragment.mTargetRequestCode = fragment.mSavedFragmentState.getInt("android:target_req_state", 0);
	//  157  344:aload_1         
	//  158  345:aload_1         
	//  159  346:getfield        #1210 <Field Bundle Fragment.mSavedFragmentState>
	//  160  349:ldc1            #70  <String "android:target_req_state">
	//  161  351:iconst_0        
	//  162  352:invokevirtual   #1268 <Method int Bundle.getInt(String, int)>
	//  163  355:putfield        #1428 <Field int Fragment.mTargetRequestCode>
						fragment.mUserVisibleHint = fragment.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
	//  164  358:aload_1         
	//  165  359:aload_1         
	//  166  360:getfield        #1210 <Field Bundle Fragment.mSavedFragmentState>
	//  167  363:ldc1            #76  <String "android:user_visible_hint">
	//  168  365:iconst_1        
	//  169  366:invokevirtual   #1432 <Method boolean Bundle.getBoolean(String, boolean)>
	//  170  369:putfield        #1435 <Field boolean Fragment.mUserVisibleHint>
						l = i;
	//  171  372:iload_2         
	//  172  373:istore          4
						if(!fragment.mUserVisibleHint)
	//* 173  375:aload_1         
	//* 174  376:getfield        #1435 <Field boolean Fragment.mUserVisibleHint>
	//* 175  379:ifne            398
						{
							fragment.mDeferStart = true;
	//  176  382:aload_1         
	//  177  383:iconst_1        
	//  178  384:putfield        #1400 <Field boolean Fragment.mDeferStart>
							l = i;
	//  179  387:iload_2         
	//  180  388:istore          4
							if(i > 3)
	//* 181  390:iload_2         
	//* 182  391:iconst_3        
	//* 183  392:icmple          398
								l = 3;
	//  184  395:iconst_3        
	//  185  396:istore          4
						}
					}
					fragment.mHost = mHost;
	//  186  398:aload_1         
	//  187  399:aload_0         
	//  188  400:getfield        #438 <Field FragmentHostCallback mHost>
	//  189  403:putfield        #1436 <Field FragmentHostCallback Fragment.mHost>
					fragment.mParentFragment = mParent;
	//  190  406:aload_1         
	//  191  407:aload_0         
	//  192  408:getfield        #905 <Field Fragment mParent>
	//  193  411:putfield        #1439 <Field Fragment Fragment.mParentFragment>
					FragmentManagerImpl fragmentmanagerimpl;
					if(mParent != null)
	//* 194  414:aload_0         
	//* 195  415:getfield        #905 <Field Fragment mParent>
	//* 196  418:ifnull          433
						fragmentmanagerimpl = mParent.mChildFragmentManager;
	//  197  421:aload_0         
	//  198  422:getfield        #905 <Field Fragment mParent>
	//  199  425:getfield        #1443 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
	//  200  428:astore          10
					else
	//* 201  430:goto            442
						fragmentmanagerimpl = mHost.getFragmentManagerImpl();
	//  202  433:aload_0         
	//  203  434:getfield        #438 <Field FragmentHostCallback mHost>
	//  204  437:invokevirtual   #1447 <Method FragmentManagerImpl FragmentHostCallback.getFragmentManagerImpl()>
	//  205  440:astore          10
					fragment.mFragmentManager = fragmentmanagerimpl;
	//  206  442:aload_1         
	//  207  443:aload           10
	//  208  445:putfield        #1450 <Field FragmentManagerImpl Fragment.mFragmentManager>
					if(fragment.mTarget != null)
	//* 209  448:aload_1         
	//* 210  449:getfield        #1425 <Field Fragment Fragment.mTarget>
	//* 211  452:ifnull          565
					{
						if(mActive.get(fragment.mTarget.mIndex) != fragment.mTarget)
	//* 212  455:aload_0         
	//* 213  456:getfield        #307 <Field SparseArray mActive>
	//* 214  459:aload_1         
	//* 215  460:getfield        #1425 <Field Fragment Fragment.mTarget>
	//* 216  463:getfield        #1349 <Field int Fragment.mIndex>
	//* 217  466:invokevirtual   #1269 <Method Object SparseArray.get(int)>
	//* 218  469:aload_1         
	//* 219  470:getfield        #1425 <Field Fragment Fragment.mTarget>
	//* 220  473:if_acmpeq       542
						{
							StringBuilder stringbuilder1 = new StringBuilder();
	//  221  476:new             #334 <Class StringBuilder>
	//  222  479:dup             
	//  223  480:invokespecial   #335 <Method void StringBuilder()>
	//  224  483:astore          10
							stringbuilder1.append("Fragment ");
	//  225  485:aload           10
	//  226  487:ldc2            #1452 <String "Fragment ">
	//  227  490:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  228  493:pop             
							stringbuilder1.append(((Object) (fragment)));
	//  229  494:aload           10
	//  230  496:aload_1         
	//  231  497:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  232  500:pop             
							stringbuilder1.append(" declared target fragment ");
	//  233  501:aload           10
	//  234  503:ldc2            #1454 <String " declared target fragment ">
	//  235  506:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  236  509:pop             
							stringbuilder1.append(((Object) (fragment.mTarget)));
	//  237  510:aload           10
	//  238  512:aload_1         
	//  239  513:getfield        #1425 <Field Fragment Fragment.mTarget>
	//  240  516:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  241  519:pop             
							stringbuilder1.append(" that does not belong to this FragmentManager!");
	//  242  520:aload           10
	//  243  522:ldc2            #1456 <String " that does not belong to this FragmentManager!">
	//  244  525:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  245  528:pop             
							throw new IllegalStateException(stringbuilder1.toString());
	//  246  529:new             #325 <Class IllegalStateException>
	//  247  532:dup             
	//  248  533:aload           10
	//  249  535:invokevirtual   #345 <Method String StringBuilder.toString()>
	//  250  538:invokespecial   #330 <Method void IllegalStateException(String)>
	//  251  541:athrow          
						}
						if(fragment.mTarget.mState < 1)
	//* 252  542:aload_1         
	//* 253  543:getfield        #1425 <Field Fragment Fragment.mTarget>
	//* 254  546:getfield        #207 <Field int Fragment.mState>
	//* 255  549:iconst_1        
	//* 256  550:icmpge          565
							moveToState(fragment.mTarget, 1, 0, 0, true);
	//  257  553:aload_0         
	//  258  554:aload_1         
	//  259  555:getfield        #1425 <Field Fragment Fragment.mTarget>
	//  260  558:iconst_1        
	//  261  559:iconst_0        
	//  262  560:iconst_0        
	//  263  561:iconst_1        
	//  264  562:invokevirtual   #217 <Method void moveToState(Fragment, int, int, int, boolean)>
					}
					dispatchOnFragmentPreAttached(fragment, mHost.getContext(), false);
	//  265  565:aload_0         
	//  266  566:aload_1         
	//  267  567:aload_0         
	//  268  568:getfield        #438 <Field FragmentHostCallback mHost>
	//  269  571:invokevirtual   #1311 <Method Context FragmentHostCallback.getContext()>
	//  270  574:iconst_0        
	//  271  575:invokevirtual   #1036 <Method void dispatchOnFragmentPreAttached(Fragment, Context, boolean)>
					fragment.mCalled = false;
	//  272  578:aload_1         
	//  273  579:iconst_0        
	//  274  580:putfield        #1459 <Field boolean Fragment.mCalled>
					fragment.onAttach(mHost.getContext());
	//  275  583:aload_1         
	//  276  584:aload_0         
	//  277  585:getfield        #438 <Field FragmentHostCallback mHost>
	//  278  588:invokevirtual   #1311 <Method Context FragmentHostCallback.getContext()>
	//  279  591:invokevirtual   #1463 <Method void Fragment.onAttach(Context)>
					if(!fragment.mCalled)
	//* 280  594:aload_1         
	//* 281  595:getfield        #1459 <Field boolean Fragment.mCalled>
	//* 282  598:ifne            648
					{
						StringBuilder stringbuilder2 = new StringBuilder();
	//  283  601:new             #334 <Class StringBuilder>
	//  284  604:dup             
	//  285  605:invokespecial   #335 <Method void StringBuilder()>
	//  286  608:astore          10
						stringbuilder2.append("Fragment ");
	//  287  610:aload           10
	//  288  612:ldc2            #1452 <String "Fragment ">
	//  289  615:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  290  618:pop             
						stringbuilder2.append(((Object) (fragment)));
	//  291  619:aload           10
	//  292  621:aload_1         
	//  293  622:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  294  625:pop             
						stringbuilder2.append(" did not call through to super.onAttach()");
	//  295  626:aload           10
	//  296  628:ldc2            #1465 <String " did not call through to super.onAttach()">
	//  297  631:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  298  634:pop             
						throw new SuperNotCalledException(stringbuilder2.toString());
	//  299  635:new             #1467 <Class SuperNotCalledException>
	//  300  638:dup             
	//  301  639:aload           10
	//  302  641:invokevirtual   #345 <Method String StringBuilder.toString()>
	//  303  644:invokespecial   #1468 <Method void SuperNotCalledException(String)>
	//  304  647:athrow          
					}
					if(fragment.mParentFragment == null)
	//* 305  648:aload_1         
	//* 306  649:getfield        #1439 <Field Fragment Fragment.mParentFragment>
	//* 307  652:ifnonnull       666
						mHost.onAttachFragment(fragment);
	//  308  655:aload_0         
	//  309  656:getfield        #438 <Field FragmentHostCallback mHost>
	//  310  659:aload_1         
	//  311  660:invokevirtual   #1471 <Method void FragmentHostCallback.onAttachFragment(Fragment)>
					else
	//* 312  663:goto            674
						fragment.mParentFragment.onAttachFragment(fragment);
	//  313  666:aload_1         
	//  314  667:getfield        #1439 <Field Fragment Fragment.mParentFragment>
	//  315  670:aload_1         
	//  316  671:invokevirtual   #1472 <Method void Fragment.onAttachFragment(Fragment)>
					dispatchOnFragmentAttached(fragment, mHost.getContext(), false);
	//  317  674:aload_0         
	//  318  675:aload_1         
	//  319  676:aload_0         
	//  320  677:getfield        #438 <Field FragmentHostCallback mHost>
	//  321  680:invokevirtual   #1311 <Method Context FragmentHostCallback.getContext()>
	//  322  683:iconst_0        
	//  323  684:invokevirtual   #1004 <Method void dispatchOnFragmentAttached(Fragment, Context, boolean)>
					if(!fragment.mIsCreated)
	//* 324  687:aload_1         
	//* 325  688:getfield        #1475 <Field boolean Fragment.mIsCreated>
	//* 326  691:ifne            725
					{
						dispatchOnFragmentPreCreated(fragment, fragment.mSavedFragmentState, false);
	//  327  694:aload_0         
	//  328  695:aload_1         
	//  329  696:aload_1         
	//  330  697:getfield        #1210 <Field Bundle Fragment.mSavedFragmentState>
	//  331  700:iconst_0        
	//  332  701:invokevirtual   #1042 <Method void dispatchOnFragmentPreCreated(Fragment, Bundle, boolean)>
						fragment.performCreate(fragment.mSavedFragmentState);
	//  333  704:aload_1         
	//  334  705:aload_1         
	//  335  706:getfield        #1210 <Field Bundle Fragment.mSavedFragmentState>
	//  336  709:invokevirtual   #1479 <Method void Fragment.performCreate(Bundle)>
						dispatchOnFragmentCreated(fragment, fragment.mSavedFragmentState, false);
	//  337  712:aload_0         
	//  338  713:aload_1         
	//  339  714:aload_1         
	//  340  715:getfield        #1210 <Field Bundle Fragment.mSavedFragmentState>
	//  341  718:iconst_0        
	//  342  719:invokevirtual   #1011 <Method void dispatchOnFragmentCreated(Fragment, Bundle, boolean)>
					} else
	//* 343  722:goto            738
					{
						fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
	//  344  725:aload_1         
	//  345  726:aload_1         
	//  346  727:getfield        #1210 <Field Bundle Fragment.mSavedFragmentState>
	//  347  730:invokevirtual   #1482 <Method void Fragment.restoreChildFragmentState(Bundle)>
						fragment.mState = 1;
	//  348  733:aload_1         
	//  349  734:iconst_1        
	//  350  735:putfield        #207 <Field int Fragment.mState>
					}
					fragment.mRetaining = false;
	//  351  738:aload_1         
	//  352  739:iconst_0        
	//  353  740:putfield        #767 <Field boolean Fragment.mRetaining>
				}
				// fall through

			case 1: // '\001'
				ensureInflatedFragmentView(fragment);
	//  354  743:aload_0         
	//  355  744:aload_1         
	//  356  745:invokevirtual   #1484 <Method void ensureInflatedFragmentView(Fragment)>
				j1 = l;
	//  357  748:iload           4
	//  358  750:istore          6
				if(l > 1)
	//* 359  752:iload           4
	//* 360  754:iconst_1        
	//* 361  755:icmple          1209
				{
					if(DEBUG)
	//* 362  758:getstatic       #831 <Field boolean DEBUG>
	//* 363  761:ifeq            800
					{
						StringBuilder stringbuilder3 = new StringBuilder();
	//  364  764:new             #334 <Class StringBuilder>
	//  365  767:dup             
	//  366  768:invokespecial   #335 <Method void StringBuilder()>
	//  367  771:astore          10
						stringbuilder3.append("moveto ACTIVITY_CREATED: ");
	//  368  773:aload           10
	//  369  775:ldc2            #1486 <String "moveto ACTIVITY_CREATED: ">
	//  370  778:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  371  781:pop             
						stringbuilder3.append(((Object) (fragment)));
	//  372  782:aload           10
	//  373  784:aload_1         
	//  374  785:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  375  788:pop             
						Log.v("FragmentManager", stringbuilder3.toString());
	//  376  789:ldc1            #67  <String "FragmentManager">
	//  377  791:aload           10
	//  378  793:invokevirtual   #345 <Method String StringBuilder.toString()>
	//  379  796:invokestatic    #839 <Method int Log.v(String, String)>
	//  380  799:pop             
					}
					if(!fragment.mFromLayout)
	//* 381  800:aload_1         
	//* 382  801:getfield        #1204 <Field boolean Fragment.mFromLayout>
	//* 383  804:ifne            1167
					{
						Object obj;
						if(fragment.mContainerId != 0)
	//* 384  807:aload_1         
	//* 385  808:getfield        #385 <Field int Fragment.mContainerId>
	//* 386  811:ifeq            1016
						{
							if(fragment.mContainerId == -1)
	//* 387  814:aload_1         
	//* 388  815:getfield        #385 <Field int Fragment.mContainerId>
	//* 389  818:iconst_m1       
	//* 390  819:icmpne          872
							{
								StringBuilder stringbuilder4 = new StringBuilder();
	//  391  822:new             #334 <Class StringBuilder>
	//  392  825:dup             
	//  393  826:invokespecial   #335 <Method void StringBuilder()>
	//  394  829:astore          10
								stringbuilder4.append("Cannot create fragment ");
	//  395  831:aload           10
	//  396  833:ldc2            #1488 <String "Cannot create fragment ">
	//  397  836:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  398  839:pop             
								stringbuilder4.append(((Object) (fragment)));
	//  399  840:aload           10
	//  400  842:aload_1         
	//  401  843:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  402  846:pop             
								stringbuilder4.append(" for a container view with no id");
	//  403  847:aload           10
	//  404  849:ldc2            #1490 <String " for a container view with no id">
	//  405  852:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  406  855:pop             
								throwException(((RuntimeException) (new IllegalArgumentException(stringbuilder4.toString()))));
	//  407  856:aload_0         
	//  408  857:new             #1492 <Class IllegalArgumentException>
	//  409  860:dup             
	//  410  861:aload           10
	//  411  863:invokevirtual   #345 <Method String StringBuilder.toString()>
	//  412  866:invokespecial   #1493 <Method void IllegalArgumentException(String)>
	//  413  869:invokespecial   #1275 <Method void throwException(RuntimeException)>
							}
							ViewGroup viewgroup = (ViewGroup)mContainer.onFindViewById(fragment.mContainerId);
	//  414  872:aload_0         
	//  415  873:getfield        #903 <Field FragmentContainer mContainer>
	//  416  876:aload_1         
	//  417  877:getfield        #385 <Field int Fragment.mContainerId>
	//  418  880:invokevirtual   #1499 <Method View FragmentContainer.onFindViewById(int)>
	//  419  883:checkcast       #285 <Class ViewGroup>
	//  420  886:astore          11
							obj = ((Object) (viewgroup));
	//  421  888:aload           11
	//  422  890:astore          10
							if(viewgroup == null)
	//* 423  892:aload           11
	//* 424  894:ifnonnull       1019
							{
								obj = ((Object) (viewgroup));
	//  425  897:aload           11
	//  426  899:astore          10
								if(!fragment.mRestored)
	//* 427  901:aload_1         
	//* 428  902:getfield        #1502 <Field boolean Fragment.mRestored>
	//* 429  905:ifne            1019
								{
									try
									{
										obj = ((Object) (fragment.getResources().getResourceName(fragment.mContainerId)));
	//  430  908:aload_1         
	//  431  909:invokevirtual   #1503 <Method Resources Fragment.getResources()>
	//  432  912:aload_1         
	//  433  913:getfield        #385 <Field int Fragment.mContainerId>
	//  434  916:invokevirtual   #1506 <Method String Resources.getResourceName(int)>
	//  435  919:astore          10
									}
	//* 436  921:goto            929
	//* 437  924:ldc2            #1508 <String "unknown">
	//* 438  927:astore          10
	//* 439  929:new             #334 <Class StringBuilder>
	//* 440  932:dup             
	//* 441  933:invokespecial   #335 <Method void StringBuilder()>
	//* 442  936:astore          12
	//* 443  938:aload           12
	//* 444  940:ldc2            #1510 <String "No view found for id 0x">
	//* 445  943:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 446  946:pop             
	//* 447  947:aload           12
	//* 448  949:aload_1         
	//* 449  950:getfield        #385 <Field int Fragment.mContainerId>
	//* 450  953:invokestatic    #1136 <Method String Integer.toHexString(int)>
	//* 451  956:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 452  959:pop             
	//* 453  960:aload           12
	//* 454  962:ldc2            #1512 <String " (">
	//* 455  965:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 456  968:pop             
	//* 457  969:aload           12
	//* 458  971:aload           10
	//* 459  973:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 460  976:pop             
	//* 461  977:aload           12
	//* 462  979:ldc2            #1514 <String ") for fragment ">
	//* 463  982:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 464  985:pop             
	//* 465  986:aload           12
	//* 466  988:aload_1         
	//* 467  989:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 468  992:pop             
	//* 469  993:aload_0         
	//* 470  994:new             #1492 <Class IllegalArgumentException>
	//* 471  997:dup             
	//* 472  998:aload           12
	//* 473 1000:invokevirtual   #345 <Method String StringBuilder.toString()>
	//* 474 1003:invokespecial   #1493 <Method void IllegalArgumentException(String)>
	//* 475 1006:invokespecial   #1275 <Method void throwException(RuntimeException)>
	//* 476 1009:aload           11
	//* 477 1011:astore          10
	//* 478 1013:goto            1019
	//* 479 1016:aconst_null     
	//* 480 1017:astore          10
	//* 481 1019:aload_1         
	//* 482 1020:aload           10
	//* 483 1022:putfield        #283 <Field ViewGroup Fragment.mContainer>
	//* 484 1025:aload_1         
	//* 485 1026:aload_1         
	//* 486 1027:aload_1         
	//* 487 1028:aload_1         
	//* 488 1029:getfield        #1210 <Field Bundle Fragment.mSavedFragmentState>
	//* 489 1032:invokevirtual   #1214 <Method android.view.LayoutInflater Fragment.performGetLayoutInflater(Bundle)>
	//* 490 1035:aload           10
	//* 491 1037:aload_1         
	//* 492 1038:getfield        #1210 <Field Bundle Fragment.mSavedFragmentState>
	//* 493 1041:invokevirtual   #1218 <Method View Fragment.performCreateView(android.view.LayoutInflater, ViewGroup, Bundle)>
	//* 494 1044:putfield        #221 <Field View Fragment.mView>
	//* 495 1047:aload_1         
	//* 496 1048:getfield        #221 <Field View Fragment.mView>
	//* 497 1051:ifnull          1162
	//* 498 1054:aload_1         
	//* 499 1055:aload_1         
	//* 500 1056:getfield        #221 <Field View Fragment.mView>
	//* 501 1059:putfield        #1221 <Field View Fragment.mInnerView>
	//* 502 1062:aload_1         
	//* 503 1063:getfield        #221 <Field View Fragment.mView>
	//* 504 1066:iconst_0        
	//* 505 1067:invokevirtual   #1224 <Method void View.setSaveFromParentEnabled(boolean)>
	//* 506 1070:aload           10
	//* 507 1072:ifnull          1084
	//* 508 1075:aload           10
	//* 509 1077:aload_1         
	//* 510 1078:getfield        #221 <Field View Fragment.mView>
	//* 511 1081:invokevirtual   #1516 <Method void ViewGroup.addView(View)>
	//* 512 1084:aload_1         
	//* 513 1085:getfield        #224 <Field boolean Fragment.mHidden>
	//* 514 1088:ifeq            1100
	//* 515 1091:aload_1         
	//* 516 1092:getfield        #221 <Field View Fragment.mView>
	//* 517 1095:bipush          8
	//* 518 1097:invokevirtual   #931 <Method void View.setVisibility(int)>
	//* 519 1100:aload_1         
	//* 520 1101:aload_1         
	//* 521 1102:getfield        #221 <Field View Fragment.mView>
	//* 522 1105:aload_1         
	//* 523 1106:getfield        #1210 <Field Bundle Fragment.mSavedFragmentState>
	//* 524 1109:invokevirtual   #1228 <Method void Fragment.onViewCreated(View, Bundle)>
	//* 525 1112:aload_0         
	//* 526 1113:aload_1         
	//* 527 1114:aload_1         
	//* 528 1115:getfield        #221 <Field View Fragment.mView>
	//* 529 1118:aload_1         
	//* 530 1119:getfield        #1210 <Field Bundle Fragment.mSavedFragmentState>
	//* 531 1122:iconst_0        
	//* 532 1123:invokevirtual   #1073 <Method void dispatchOnFragmentViewCreated(Fragment, View, Bundle, boolean)>
	//* 533 1126:aload_1         
	//* 534 1127:getfield        #221 <Field View Fragment.mView>
	//* 535 1130:invokevirtual   #1519 <Method int View.getVisibility()>
	//* 536 1133:ifne            1150
	//* 537 1136:aload_1         
	//* 538 1137:getfield        #283 <Field ViewGroup Fragment.mContainer>
	//* 539 1140:ifnull          1150
	//* 540 1143:iload           8
	//* 541 1145:istore          5
	//* 542 1147:goto            1153
	//* 543 1150:iconst_0        
	//* 544 1151:istore          5
	//* 545 1153:aload_1         
	//* 546 1154:iload           5
	//* 547 1156:putfield        #227 <Field boolean Fragment.mIsNewlyAdded>
	//* 548 1159:goto            1167
	//* 549 1162:aload_1         
	//* 550 1163:aconst_null     
	//* 551 1164:putfield        #1221 <Field View Fragment.mInnerView>
	//* 552 1167:aload_1         
	//* 553 1168:aload_1         
	//* 554 1169:getfield        #1210 <Field Bundle Fragment.mSavedFragmentState>
	//* 555 1172:invokevirtual   #1522 <Method void Fragment.performActivityCreated(Bundle)>
	//* 556 1175:aload_0         
	//* 557 1176:aload_1         
	//* 558 1177:aload_1         
	//* 559 1178:getfield        #1210 <Field Bundle Fragment.mSavedFragmentState>
	//* 560 1181:iconst_0        
	//* 561 1182:invokevirtual   #985 <Method void dispatchOnFragmentActivityCreated(Fragment, Bundle, boolean)>
	//* 562 1185:aload_1         
	//* 563 1186:getfield        #221 <Field View Fragment.mView>
	//* 564 1189:ifnull          1200
	//* 565 1192:aload_1         
	//* 566 1193:aload_1         
	//* 567 1194:getfield        #1210 <Field Bundle Fragment.mSavedFragmentState>
	//* 568 1197:invokevirtual   #1525 <Method void Fragment.restoreViewState(Bundle)>
	//* 569 1200:aload_1         
	//* 570 1201:aconst_null     
	//* 571 1202:putfield        #1210 <Field Bundle Fragment.mSavedFragmentState>
	//* 572 1205:iload           4
	//* 573 1207:istore          6
	//* 574 1209:iload           6
	//* 575 1211:istore          7
	//* 576 1213:iload           6
	//* 577 1215:iconst_2        
	//* 578 1216:icmple          1228
	//* 579 1219:aload_1         
	//* 580 1220:iconst_3        
	//* 581 1221:putfield        #207 <Field int Fragment.mState>
	//* 582 1224:iload           6
	//* 583 1226:istore          7
	//* 584 1228:iload           7
	//* 585 1230:istore_3        
	//* 586 1231:iload           7
	//* 587 1233:iconst_3        
	//* 588 1234:icmple          1292
	//* 589 1237:getstatic       #831 <Field boolean DEBUG>
	//* 590 1240:ifeq            1279
	//* 591 1243:new             #334 <Class StringBuilder>
	//* 592 1246:dup             
	//* 593 1247:invokespecial   #335 <Method void StringBuilder()>
	//* 594 1250:astore          10
	//* 595 1252:aload           10
	//* 596 1254:ldc2            #1527 <String "moveto STARTED: ">
	//* 597 1257:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 598 1260:pop             
	//* 599 1261:aload           10
	//* 600 1263:aload_1         
	//* 601 1264:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 602 1267:pop             
	//* 603 1268:ldc1            #67  <String "FragmentManager">
	//* 604 1270:aload           10
	//* 605 1272:invokevirtual   #345 <Method String StringBuilder.toString()>
	//* 606 1275:invokestatic    #839 <Method int Log.v(String, String)>
	//* 607 1278:pop             
	//* 608 1279:aload_1         
	//* 609 1280:invokevirtual   #1530 <Method void Fragment.performStart()>
	//* 610 1283:aload_0         
	//* 611 1284:aload_1         
	//* 612 1285:iconst_0        
	//* 613 1286:invokevirtual   #1060 <Method void dispatchOnFragmentStarted(Fragment, boolean)>
	//* 614 1289:iload           7
	//* 615 1291:istore_3        
	//* 616 1292:iload_3         
	//* 617 1293:istore          6
	//* 618 1295:iload_3         
	//* 619 1296:iconst_4        
	//* 620 1297:icmple          2022
	//* 621 1300:getstatic       #831 <Field boolean DEBUG>
	//* 622 1303:ifeq            1342
	//* 623 1306:new             #334 <Class StringBuilder>
	//* 624 1309:dup             
	//* 625 1310:invokespecial   #335 <Method void StringBuilder()>
	//* 626 1313:astore          10
	//* 627 1315:aload           10
	//* 628 1317:ldc2            #1532 <String "moveto RESUMED: ">
	//* 629 1320:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 630 1323:pop             
	//* 631 1324:aload           10
	//* 632 1326:aload_1         
	//* 633 1327:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 634 1330:pop             
	//* 635 1331:ldc1            #67  <String "FragmentManager">
	//* 636 1333:aload           10
	//* 637 1335:invokevirtual   #345 <Method String StringBuilder.toString()>
	//* 638 1338:invokestatic    #839 <Method int Log.v(String, String)>
	//* 639 1341:pop             
	//* 640 1342:aload_1         
	//* 641 1343:invokevirtual   #1535 <Method void Fragment.performResume()>
	//* 642 1346:aload_0         
	//* 643 1347:aload_1         
	//* 644 1348:iconst_0        
	//* 645 1349:invokevirtual   #1048 <Method void dispatchOnFragmentResumed(Fragment, boolean)>
	//* 646 1352:aload_1         
	//* 647 1353:aconst_null     
	//* 648 1354:putfield        #1210 <Field Bundle Fragment.mSavedFragmentState>
	//* 649 1357:aload_1         
	//* 650 1358:aconst_null     
	//* 651 1359:putfield        #1420 <Field SparseArray Fragment.mSavedViewState>
	//* 652 1362:iload_3         
	//* 653 1363:istore          6
	//* 654 1365:goto            2022
	//* 655 1368:iload_2         
	//* 656 1369:istore          6
	//* 657 1371:aload_1         
	//* 658 1372:getfield        #207 <Field int Fragment.mState>
	//* 659 1375:iload_2         
	//* 660 1376:icmple          2022
	//* 661 1379:aload_1         
	//* 662 1380:getfield        #207 <Field int Fragment.mState>
	//* 663 1383:tableswitch     1 5: default 1416
	//	               1 1805
	//	               2 1587
	//	               3 1536
	//	               4 1479
	//	               5 1422
	//* 664 1416:iload_2         
	//* 665 1417:istore          6
	//* 666 1419:goto            2022
	//* 667 1422:iload_2         
	//* 668 1423:iconst_5        
	//* 669 1424:icmpge          1479
	//* 670 1427:getstatic       #831 <Field boolean DEBUG>
	//* 671 1430:ifeq            1469
	//* 672 1433:new             #334 <Class StringBuilder>
	//* 673 1436:dup             
	//* 674 1437:invokespecial   #335 <Method void StringBuilder()>
	//* 675 1440:astore          10
	//* 676 1442:aload           10
	//* 677 1444:ldc2            #1537 <String "movefrom RESUMED: ">
	//* 678 1447:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 679 1450:pop             
	//* 680 1451:aload           10
	//* 681 1453:aload_1         
	//* 682 1454:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 683 1457:pop             
	//* 684 1458:ldc1            #67  <String "FragmentManager">
	//* 685 1460:aload           10
	//* 686 1462:invokevirtual   #345 <Method String StringBuilder.toString()>
	//* 687 1465:invokestatic    #839 <Method int Log.v(String, String)>
	//* 688 1468:pop             
	//* 689 1469:aload_1         
	//* 690 1470:invokevirtual   #1540 <Method void Fragment.performPause()>
	//* 691 1473:aload_0         
	//* 692 1474:aload_1         
	//* 693 1475:iconst_0        
	//* 694 1476:invokevirtual   #1030 <Method void dispatchOnFragmentPaused(Fragment, boolean)>
	//* 695 1479:iload_2         
	//* 696 1480:iconst_4        
	//* 697 1481:icmpge          1536
	//* 698 1484:getstatic       #831 <Field boolean DEBUG>
	//* 699 1487:ifeq            1526
	//* 700 1490:new             #334 <Class StringBuilder>
	//* 701 1493:dup             
	//* 702 1494:invokespecial   #335 <Method void StringBuilder()>
	//* 703 1497:astore          10
	//* 704 1499:aload           10
	//* 705 1501:ldc2            #1542 <String "movefrom STARTED: ">
	//* 706 1504:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 707 1507:pop             
	//* 708 1508:aload           10
	//* 709 1510:aload_1         
	//* 710 1511:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 711 1514:pop             
	//* 712 1515:ldc1            #67  <String "FragmentManager">
	//* 713 1517:aload           10
	//* 714 1519:invokevirtual   #345 <Method String StringBuilder.toString()>
	//* 715 1522:invokestatic    #839 <Method int Log.v(String, String)>
	//* 716 1525:pop             
	//* 717 1526:aload_1         
	//* 718 1527:invokevirtual   #1545 <Method void Fragment.performStop()>
	//* 719 1530:aload_0         
	//* 720 1531:aload_1         
	//* 721 1532:iconst_0        
	//* 722 1533:invokevirtual   #1066 <Method void dispatchOnFragmentStopped(Fragment, boolean)>
	//* 723 1536:iload_2         
	//* 724 1537:iconst_3        
	//* 725 1538:icmpge          1587
	//* 726 1541:getstatic       #831 <Field boolean DEBUG>
	//* 727 1544:ifeq            1583
	//* 728 1547:new             #334 <Class StringBuilder>
	//* 729 1550:dup             
	//* 730 1551:invokespecial   #335 <Method void StringBuilder()>
	//* 731 1554:astore          10
	//* 732 1556:aload           10
	//* 733 1558:ldc2            #1547 <String "movefrom STOPPED: ">
	//* 734 1561:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 735 1564:pop             
	//* 736 1565:aload           10
	//* 737 1567:aload_1         
	//* 738 1568:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 739 1571:pop             
	//* 740 1572:ldc1            #67  <String "FragmentManager">
	//* 741 1574:aload           10
	//* 742 1576:invokevirtual   #345 <Method String StringBuilder.toString()>
	//* 743 1579:invokestatic    #839 <Method int Log.v(String, String)>
	//* 744 1582:pop             
	//* 745 1583:aload_1         
	//* 746 1584:invokevirtual   #1550 <Method void Fragment.performReallyStop()>
	//* 747 1587:iload_2         
	//* 748 1588:iconst_2        
	//* 749 1589:icmpge          1805
	//* 750 1592:getstatic       #831 <Field boolean DEBUG>
	//* 751 1595:ifeq            1634
	//* 752 1598:new             #334 <Class StringBuilder>
	//* 753 1601:dup             
	//* 754 1602:invokespecial   #335 <Method void StringBuilder()>
	//* 755 1605:astore          10
	//* 756 1607:aload           10
	//* 757 1609:ldc2            #1552 <String "movefrom ACTIVITY_CREATED: ">
	//* 758 1612:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 759 1615:pop             
	//* 760 1616:aload           10
	//* 761 1618:aload_1         
	//* 762 1619:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 763 1622:pop             
	//* 764 1623:ldc1            #67  <String "FragmentManager">
	//* 765 1625:aload           10
	//* 766 1627:invokevirtual   #345 <Method String StringBuilder.toString()>
	//* 767 1630:invokestatic    #839 <Method int Log.v(String, String)>
	//* 768 1633:pop             
	//* 769 1634:aload_1         
	//* 770 1635:getfield        #221 <Field View Fragment.mView>
	//* 771 1638:ifnull          1664
	//* 772 1641:aload_0         
	//* 773 1642:getfield        #438 <Field FragmentHostCallback mHost>
	//* 774 1645:aload_1         
	//* 775 1646:invokevirtual   #1556 <Method boolean FragmentHostCallback.onShouldSaveFragmentState(Fragment)>
	//* 776 1649:ifeq            1664
	//* 777 1652:aload_1         
	//* 778 1653:getfield        #1420 <Field SparseArray Fragment.mSavedViewState>
	//* 779 1656:ifnonnull       1664
	//* 780 1659:aload_0         
	//* 781 1660:aload_1         
	//* 782 1661:invokevirtual   #1559 <Method void saveFragmentViewState(Fragment)>
	//* 783 1664:aload_1         
	//* 784 1665:invokevirtual   #1562 <Method void Fragment.performDestroyView()>
	//* 785 1668:aload_0         
	//* 786 1669:aload_1         
	//* 787 1670:iconst_0        
	//* 788 1671:invokevirtual   #1080 <Method void dispatchOnFragmentViewDestroyed(Fragment, boolean)>
	//* 789 1674:aload_1         
	//* 790 1675:getfield        #221 <Field View Fragment.mView>
	//* 791 1678:ifnull          1785
	//* 792 1681:aload_1         
	//* 793 1682:getfield        #283 <Field ViewGroup Fragment.mContainer>
	//* 794 1685:ifnull          1785
	//* 795 1688:aload_1         
	//* 796 1689:getfield        #221 <Field View Fragment.mView>
	//* 797 1692:invokevirtual   #420 <Method void View.clearAnimation()>
	//* 798 1695:aload_1         
	//* 799 1696:getfield        #283 <Field ViewGroup Fragment.mContainer>
	//* 800 1699:aload_1         
	//* 801 1700:getfield        #221 <Field View Fragment.mView>
	//* 802 1703:invokevirtual   #1565 <Method void ViewGroup.endViewTransition(View)>
	//* 803 1706:aload_0         
	//* 804 1707:getfield        #167 <Field int mCurState>
	//* 805 1710:ifle            1753
	//* 806 1713:aload_0         
	//* 807 1714:getfield        #969 <Field boolean mDestroyed>
	//* 808 1717:ifne            1753
	//* 809 1720:aload_1         
	//* 810 1721:getfield        #221 <Field View Fragment.mView>
	//* 811 1724:invokevirtual   #1519 <Method int View.getVisibility()>
	//* 812 1727:ifne            1753
	//* 813 1730:aload_1         
	//* 814 1731:getfield        #393 <Field float Fragment.mPostponedAlpha>
	//* 815 1734:fconst_0        
	//* 816 1735:fcmpl           
	//* 817 1736:iflt            1753
	//* 818 1739:aload_0         
	//* 819 1740:aload_1         
	//* 820 1741:iload_3         
	//* 821 1742:iconst_0        
	//* 822 1743:iload           4
	//* 823 1745:invokevirtual   #921 <Method FragmentManagerImpl$AnimationOrAnimator loadAnimation(Fragment, int, boolean, int)>
	//* 824 1748:astore          10
	//* 825 1750:goto            1756
	//* 826 1753:aconst_null     
	//* 827 1754:astore          10
	//* 828 1756:aload_1         
	//* 829 1757:fconst_0        
	//* 830 1758:putfield        #393 <Field float Fragment.mPostponedAlpha>
	//* 831 1761:aload           10
	//* 832 1763:ifnull          1774
	//* 833 1766:aload_0         
	//* 834 1767:aload_1         
	//* 835 1768:aload           10
	//* 836 1770:iload_2         
	//* 837 1771:invokespecial   #1567 <Method void animateRemoveFragment(Fragment, FragmentManagerImpl$AnimationOrAnimator, int)>
	//* 838 1774:aload_1         
	//* 839 1775:getfield        #283 <Field ViewGroup Fragment.mContainer>
	//* 840 1778:aload_1         
	//* 841 1779:getfield        #221 <Field View Fragment.mView>
	//* 842 1782:invokevirtual   #1570 <Method void ViewGroup.removeView(View)>
	//* 843 1785:aload_1         
	//* 844 1786:aconst_null     
	//* 845 1787:putfield        #283 <Field ViewGroup Fragment.mContainer>
	//* 846 1790:aload_1         
	//* 847 1791:aconst_null     
	//* 848 1792:putfield        #221 <Field View Fragment.mView>
	//* 849 1795:aload_1         
	//* 850 1796:aconst_null     
	//* 851 1797:putfield        #1221 <Field View Fragment.mInnerView>
	//* 852 1800:aload_1         
	//* 853 1801:iconst_0        
	//* 854 1802:putfield        #1403 <Field boolean Fragment.mInLayout>
	//* 855 1805:iload_2         
	//* 856 1806:istore          6
	//* 857 1808:iload_2         
	//* 858 1809:iconst_1        
	//* 859 1810:icmpge          2022
	//* 860 1813:aload_0         
	//* 861 1814:getfield        #969 <Field boolean mDestroyed>
	//* 862 1817:ifeq            1869
	//* 863 1820:aload_1         
	//* 864 1821:invokevirtual   #407 <Method View Fragment.getAnimatingAway()>
	//* 865 1824:ifnull          1846
	//* 866 1827:aload_1         
	//* 867 1828:invokevirtual   #407 <Method View Fragment.getAnimatingAway()>
	//* 868 1831:astore          10
	//* 869 1833:aload_1         
	//* 870 1834:aconst_null     
	//* 871 1835:invokevirtual   #249 <Method void Fragment.setAnimatingAway(View)>
	//* 872 1838:aload           10
	//* 873 1840:invokevirtual   #420 <Method void View.clearAnimation()>
	//* 874 1843:goto            1869
	//* 875 1846:aload_1         
	//* 876 1847:invokevirtual   #424 <Method Animator Fragment.getAnimator()>
	//* 877 1850:ifnull          1869
	//* 878 1853:aload_1         
	//* 879 1854:invokevirtual   #424 <Method Animator Fragment.getAnimator()>
	//* 880 1857:astore          10
	//* 881 1859:aload_1         
	//* 882 1860:aconst_null     
	//* 883 1861:invokevirtual   #280 <Method void Fragment.setAnimator(Animator)>
	//* 884 1864:aload           10
	//* 885 1866:invokevirtual   #1571 <Method void Animator.cancel()>
	//* 886 1869:aload_1         
	//* 887 1870:invokevirtual   #407 <Method View Fragment.getAnimatingAway()>
	//* 888 1873:ifnonnull       2010
	//* 889 1876:aload_1         
	//* 890 1877:invokevirtual   #424 <Method Animator Fragment.getAnimator()>
	//* 891 1880:ifnull          1886
	//* 892 1883:goto            2010
	//* 893 1886:getstatic       #831 <Field boolean DEBUG>
	//* 894 1889:ifeq            1928
	//* 895 1892:new             #334 <Class StringBuilder>
	//* 896 1895:dup             
	//* 897 1896:invokespecial   #335 <Method void StringBuilder()>
	//* 898 1899:astore          10
	//* 899 1901:aload           10
	//* 900 1903:ldc2            #1573 <String "movefrom CREATED: ">
	//* 901 1906:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 902 1909:pop             
	//* 903 1910:aload           10
	//* 904 1912:aload_1         
	//* 905 1913:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 906 1916:pop             
	//* 907 1917:ldc1            #67  <String "FragmentManager">
	//* 908 1919:aload           10
	//* 909 1921:invokevirtual   #345 <Method String StringBuilder.toString()>
	//* 910 1924:invokestatic    #839 <Method int Log.v(String, String)>
	//* 911 1927:pop             
	//* 912 1928:aload_1         
	//* 913 1929:getfield        #767 <Field boolean Fragment.mRetaining>
	//* 914 1932:ifne            1948
	//* 915 1935:aload_1         
	//* 916 1936:invokevirtual   #1576 <Method void Fragment.performDestroy()>
	//* 917 1939:aload_0         
	//* 918 1940:aload_1         
	//* 919 1941:iconst_0        
	//* 920 1942:invokevirtual   #1017 <Method void dispatchOnFragmentDestroyed(Fragment, boolean)>
	//* 921 1945:goto            1953
	//* 922 1948:aload_1         
	//* 923 1949:iconst_0        
	//* 924 1950:putfield        #207 <Field int Fragment.mState>
	//* 925 1953:aload_1         
	//* 926 1954:invokevirtual   #1579 <Method void Fragment.performDetach()>
	//* 927 1957:aload_0         
	//* 928 1958:aload_1         
	//* 929 1959:iconst_0        
	//* 930 1960:invokevirtual   #1024 <Method void dispatchOnFragmentDetached(Fragment, boolean)>
	//* 931 1963:iload_2         
	//* 932 1964:istore          6
	//* 933 1966:iload           5
	//* 934 1968:ifne            2022
	//* 935 1971:aload_1         
	//* 936 1972:getfield        #767 <Field boolean Fragment.mRetaining>
	//* 937 1975:ifne            1989
	//* 938 1978:aload_0         
	//* 939 1979:aload_1         
	//* 940 1980:invokevirtual   #1581 <Method void makeInactive(Fragment)>
	//* 941 1983:iload_2         
	//* 942 1984:istore          6
	//* 943 1986:goto            2022
	//* 944 1989:aload_1         
	//* 945 1990:aconst_null     
	//* 946 1991:putfield        #1436 <Field FragmentHostCallback Fragment.mHost>
	//* 947 1994:aload_1         
	//* 948 1995:aconst_null     
	//* 949 1996:putfield        #1439 <Field Fragment Fragment.mParentFragment>
	//* 950 1999:aload_1         
	//* 951 2000:aconst_null     
	//* 952 2001:putfield        #1450 <Field FragmentManagerImpl Fragment.mFragmentManager>
	//* 953 2004:iload_2         
	//* 954 2005:istore          6
	//* 955 2007:goto            2022
	//* 956 2010:aload_1         
	//* 957 2011:iload_2         
	//* 958 2012:invokevirtual   #241 <Method void Fragment.setStateAfterAnimating(int)>
	//* 959 2015:iload           7
	//* 960 2017:istore          6
	//* 961 2019:goto            2022
	//* 962 2022:aload_1         
	//* 963 2023:getfield        #207 <Field int Fragment.mState>
	//* 964 2026:iload           6
	//* 965 2028:icmpeq          2118
	//* 966 2031:new             #334 <Class StringBuilder>
	//* 967 2034:dup             
	//* 968 2035:invokespecial   #335 <Method void StringBuilder()>
	//* 969 2038:astore          10
	//* 970 2040:aload           10
	//* 971 2042:ldc2            #1583 <String "moveToState: Fragment state for ">
	//* 972 2045:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 973 2048:pop             
	//* 974 2049:aload           10
	//* 975 2051:aload_1         
	//* 976 2052:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 977 2055:pop             
	//* 978 2056:aload           10
	//* 979 2058:ldc2            #1585 <String " not updated inline; ">
	//* 980 2061:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 981 2064:pop             
	//* 982 2065:aload           10
	//* 983 2067:ldc2            #1587 <String "expected state ">
	//* 984 2070:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 985 2073:pop             
	//* 986 2074:aload           10
	//* 987 2076:iload           6
	//* 988 2078:invokevirtual   #885 <Method StringBuilder StringBuilder.append(int)>
	//* 989 2081:pop             
	//* 990 2082:aload           10
	//* 991 2084:ldc2            #1589 <String " found ">
	//* 992 2087:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//* 993 2090:pop             
	//* 994 2091:aload           10
	//* 995 2093:aload_1         
	//* 996 2094:getfield        #207 <Field int Fragment.mState>
	//* 997 2097:invokevirtual   #885 <Method StringBuilder StringBuilder.append(int)>
	//* 998 2100:pop             
	//* 999 2101:ldc1            #67  <String "FragmentManager">
	//*1000 2103:aload           10
	//*1001 2105:invokevirtual   #345 <Method String StringBuilder.toString()>
	//*1002 2108:invokestatic    #1592 <Method int Log.w(String, String)>
	//*1003 2111:pop             
	//*1004 2112:aload_1         
	//*1005 2113:iload           6
	//*1006 2115:putfield        #207 <Field int Fragment.mState>
	//*1007 2118:return          
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
					j1 = l;
				}
				// fall through

			case 2: // '\002'
				k1 = j1;
				if(j1 > 2)
				{
					fragment.mState = 3;
					k1 = j1;
				}
				// fall through

			case 3: // '\003'
				k = k1;
				if(k1 > 3)
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
					k = k1;
				}
				// fall through

			case 4: // '\004'
				j1 = k;
				if(k > 4)
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
					j1 = k;
				}
				break;
			}
		} else
		{
			j1 = i;
			if(fragment.mState > i)
				switch(fragment.mState)
				{
				default:
					j1 = i;
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
							fragment.mView.clearAnimation();
							fragment.mContainer.endViewTransition(fragment.mView);
							AnimationOrAnimator animationoranimator;
							if(mCurState > 0 && !mDestroyed && fragment.mView.getVisibility() == 0 && fragment.mPostponedAlpha >= 0.0F)
								animationoranimator = loadAnimation(fragment, k, false, l);
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
					j1 = i;
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
						j1 = i;
						if(flag)
							break;
						if(!fragment.mRetaining)
						{
							makeInactive(fragment);
							j1 = i;
						} else
						{
							fragment.mHost = null;
							fragment.mParentFragment = null;
							fragment.mFragmentManager = null;
							j1 = i;
						}
					} else
					{
						fragment.setStateAfterAnimating(i);
						j1 = k1;
					}
					break;
				}
		}
		if(fragment.mState != j1)
		{
			StringBuilder stringbuilder12 = new StringBuilder();
			stringbuilder12.append("moveToState: Fragment state for ");
			stringbuilder12.append(((Object) (fragment)));
			stringbuilder12.append(" not updated inline; ");
			stringbuilder12.append("expected state ");
			stringbuilder12.append(j1);
			stringbuilder12.append(" found ");
			stringbuilder12.append(fragment.mState);
			Log.w("FragmentManager", stringbuilder12.toString());
			fragment.mState = j1;
		}
	//*1008 2119:astore          10
	//*1009 2121:goto            924
	}

	public void noteStateNotSaved()
	{
		mSavedNonConfig = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #1595 <Field FragmentManagerNonConfig mSavedNonConfig>
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		mStateSaved = false;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #323 <Field boolean mStateSaved>
		for(int k = mAdded.size(); i < k; i++)
	//*   8   12:aload_0         
	//*   9   13:getfield        #160 <Field ArrayList mAdded>
	//*  10   16:invokevirtual   #198 <Method int ArrayList.size()>
	//*  11   19:istore_2        
	//*  12   20:iload_1         
	//*  13   21:iload_2         
	//*  14   22:icmpge          52
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//   15   25:aload_0         
	//   16   26:getfield        #160 <Field ArrayList mAdded>
	//   17   29:iload_1         
	//   18   30:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   19   33:checkcast       #204 <Class Fragment>
	//   20   36:astore_3        
			if(fragment != null)
	//*  21   37:aload_3         
	//*  22   38:ifnull          45
				fragment.noteStateNotSaved();
	//   23   41:aload_3         
	//   24   42:invokevirtual   #1597 <Method void Fragment.noteStateNotSaved()>
		}

	//   25   45:iload_1         
	//   26   46:iconst_1        
	//   27   47:iadd            
	//   28   48:istore_1        
	//*  29   49:goto            20
	//   30   52:return          
	}

	public View onCreateView(View view, String s1, Context context, AttributeSet attributeset)
	{
		if(!"fragment".equals(((Object) (s1))))
	//*   0    0:ldc2            #1601 <String "fragment">
	//*   1    3:aload_2         
	//*   2    4:invokevirtual   #665 <Method boolean String.equals(Object)>
	//*   3    7:ifne            12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		s1 = attributeset.getAttributeValue(((String) (null)), "class");
	//    6   12:aload           4
	//    7   14:aconst_null     
	//    8   15:ldc2            #1603 <String "class">
	//    9   18:invokeinterface #1609 <Method String AttributeSet.getAttributeValue(String, String)>
	//   10   23:astore_2        
		TypedArray typedarray = context.obtainStyledAttributes(attributeset, FragmentTag.Fragment);
	//   11   24:aload_3         
	//   12   25:aload           4
	//   13   27:getstatic       #1613 <Field int[] FragmentManagerImpl$FragmentTag.Fragment>
	//   14   30:invokevirtual   #1617 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   15   33:astore          10
		int i = 0;
	//   16   35:iconst_0        
	//   17   36:istore          5
		String s2 = s1;
	//   18   38:aload_2         
	//   19   39:astore          8
		if(s1 == null)
	//*  20   41:aload_2         
	//*  21   42:ifnonnull       53
			s2 = typedarray.getString(0);
	//   22   45:aload           10
	//   23   47:iconst_0        
	//   24   48:invokevirtual   #1622 <Method String TypedArray.getString(int)>
	//   25   51:astore          8
		int l = typedarray.getResourceId(1, -1);
	//   26   53:aload           10
	//   27   55:iconst_1        
	//   28   56:iconst_m1       
	//   29   57:invokevirtual   #1625 <Method int TypedArray.getResourceId(int, int)>
	//   30   60:istore          7
		String s3 = typedarray.getString(2);
	//   31   62:aload           10
	//   32   64:iconst_2        
	//   33   65:invokevirtual   #1622 <Method String TypedArray.getString(int)>
	//   34   68:astore          9
		typedarray.recycle();
	//   35   70:aload           10
	//   36   72:invokevirtual   #1628 <Method void TypedArray.recycle()>
		if(!Fragment.isSupportFragmentClass(mHost.getContext(), s2))
	//*  37   75:aload_0         
	//*  38   76:getfield        #438 <Field FragmentHostCallback mHost>
	//*  39   79:invokevirtual   #1311 <Method Context FragmentHostCallback.getContext()>
	//*  40   82:aload           8
	//*  41   84:invokestatic    #1632 <Method boolean Fragment.isSupportFragmentClass(Context, String)>
	//*  42   87:ifne            92
			return null;
	//   43   90:aconst_null     
	//   44   91:areturn         
		if(view != null)
	//*  45   92:aload_1         
	//*  46   93:ifnull          102
			i = view.getId();
	//   47   96:aload_1         
	//   48   97:invokevirtual   #1635 <Method int View.getId()>
	//   49  100:istore          5
		if(i == -1 && l == -1 && s3 == null)
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
	//   58  119:new             #334 <Class StringBuilder>
	//   59  122:dup             
	//   60  123:invokespecial   #335 <Method void StringBuilder()>
	//   61  126:astore_1        
			((StringBuilder) (view)).append(attributeset.getPositionDescription());
	//   62  127:aload_1         
	//   63  128:aload           4
	//   64  130:invokeinterface #1638 <Method String AttributeSet.getPositionDescription()>
	//   65  135:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   66  138:pop             
			((StringBuilder) (view)).append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
	//   67  139:aload_1         
	//   68  140:ldc2            #1640 <String ": Must specify unique android:id, android:tag, or have a parent with an id for ">
	//   69  143:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   70  146:pop             
			((StringBuilder) (view)).append(s2);
	//   71  147:aload_1         
	//   72  148:aload           8
	//   73  150:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   74  153:pop             
			throw new IllegalArgumentException(((StringBuilder) (view)).toString());
	//   75  154:new             #1492 <Class IllegalArgumentException>
	//   76  157:dup             
	//   77  158:aload_1         
	//   78  159:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   79  162:invokespecial   #1493 <Method void IllegalArgumentException(String)>
	//   80  165:athrow          
		}
		if(l != -1)
	//*  81  166:iload           7
	//*  82  168:iconst_m1       
	//*  83  169:icmpeq          182
			s1 = ((String) (findFragmentById(l)));
	//   84  172:aload_0         
	//   85  173:iload           7
	//   86  175:invokevirtual   #1642 <Method Fragment findFragmentById(int)>
	//   87  178:astore_2        
		else
	//*  88  179:goto            184
			s1 = null;
	//   89  182:aconst_null     
	//   90  183:astore_2        
		view = ((View) (s1));
	//   91  184:aload_2         
	//   92  185:astore_1        
		if(s1 == null)
	//*  93  186:aload_2         
	//*  94  187:ifnonnull       204
		{
			view = ((View) (s1));
	//   95  190:aload_2         
	//   96  191:astore_1        
			if(s3 != null)
	//*  97  192:aload           9
	//*  98  194:ifnull          204
				view = ((View) (findFragmentByTag(s3)));
	//   99  197:aload_0         
	//  100  198:aload           9
	//  101  200:invokevirtual   #1644 <Method Fragment findFragmentByTag(String)>
	//  102  203:astore_1        
		}
		s1 = ((String) (view));
	//  103  204:aload_1         
	//  104  205:astore_2        
		if(view == null)
	//* 105  206:aload_1         
	//* 106  207:ifnonnull       225
		{
			s1 = ((String) (view));
	//  107  210:aload_1         
	//  108  211:astore_2        
			if(i != -1)
	//* 109  212:iload           5
	//* 110  214:iconst_m1       
	//* 111  215:icmpeq          225
				s1 = ((String) (findFragmentById(i)));
	//  112  218:aload_0         
	//  113  219:iload           5
	//  114  221:invokevirtual   #1642 <Method Fragment findFragmentById(int)>
	//  115  224:astore_2        
		}
		if(DEBUG)
	//* 116  225:getstatic       #831 <Field boolean DEBUG>
	//* 117  228:ifeq            296
		{
			view = ((View) (new StringBuilder()));
	//  118  231:new             #334 <Class StringBuilder>
	//  119  234:dup             
	//  120  235:invokespecial   #335 <Method void StringBuilder()>
	//  121  238:astore_1        
			((StringBuilder) (view)).append("onCreateView: id=0x");
	//  122  239:aload_1         
	//  123  240:ldc2            #1646 <String "onCreateView: id=0x">
	//  124  243:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  125  246:pop             
			((StringBuilder) (view)).append(Integer.toHexString(l));
	//  126  247:aload_1         
	//  127  248:iload           7
	//  128  250:invokestatic    #1136 <Method String Integer.toHexString(int)>
	//  129  253:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  130  256:pop             
			((StringBuilder) (view)).append(" fname=");
	//  131  257:aload_1         
	//  132  258:ldc2            #1648 <String " fname=">
	//  133  261:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  134  264:pop             
			((StringBuilder) (view)).append(s2);
	//  135  265:aload_1         
	//  136  266:aload           8
	//  137  268:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  138  271:pop             
			((StringBuilder) (view)).append(" existing=");
	//  139  272:aload_1         
	//  140  273:ldc2            #1650 <String " existing=">
	//  141  276:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  142  279:pop             
			((StringBuilder) (view)).append(((Object) (s1)));
	//  143  280:aload_1         
	//  144  281:aload_2         
	//  145  282:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  146  285:pop             
			Log.v("FragmentManager", ((StringBuilder) (view)).toString());
	//  147  286:ldc1            #67  <String "FragmentManager">
	//  148  288:aload_1         
	//  149  289:invokevirtual   #345 <Method String StringBuilder.toString()>
	//  150  292:invokestatic    #839 <Method int Log.v(String, String)>
	//  151  295:pop             
		}
		if(s1 == null)
	//* 152  296:aload_2         
	//* 153  297:ifnonnull       395
		{
			view = ((View) (mContainer.instantiate(context, s2, ((Bundle) (null)))));
	//  154  300:aload_0         
	//  155  301:getfield        #903 <Field FragmentContainer mContainer>
	//  156  304:aload_3         
	//  157  305:aload           8
	//  158  307:aconst_null     
	//  159  308:invokevirtual   #1654 <Method Fragment FragmentContainer.instantiate(Context, String, Bundle)>
	//  160  311:astore_1        
			view.mFromLayout = true;
	//  161  312:aload_1         
	//  162  313:iconst_1        
	//  163  314:putfield        #1204 <Field boolean Fragment.mFromLayout>
			int k;
			if(l != 0)
	//* 164  317:iload           7
	//* 165  319:ifeq            329
				k = l;
	//  166  322:iload           7
	//  167  324:istore          6
			else
	//* 168  326:goto            333
				k = i;
	//  169  329:iload           5
	//  170  331:istore          6
			view.mFragmentId = k;
	//  171  333:aload_1         
	//  172  334:iload           6
	//  173  336:putfield        #1239 <Field int Fragment.mFragmentId>
			view.mContainerId = i;
	//  174  339:aload_1         
	//  175  340:iload           5
	//  176  342:putfield        #385 <Field int Fragment.mContainerId>
			view.mTag = s3;
	//  177  345:aload_1         
	//  178  346:aload           9
	//  179  348:putfield        #1244 <Field String Fragment.mTag>
			view.mInLayout = true;
	//  180  351:aload_1         
	//  181  352:iconst_1        
	//  182  353:putfield        #1403 <Field boolean Fragment.mInLayout>
			view.mFragmentManager = this;
	//  183  356:aload_1         
	//  184  357:aload_0         
	//  185  358:putfield        #1450 <Field FragmentManagerImpl Fragment.mFragmentManager>
			view.mHost = mHost;
	//  186  361:aload_1         
	//  187  362:aload_0         
	//  188  363:getfield        #438 <Field FragmentHostCallback mHost>
	//  189  366:putfield        #1436 <Field FragmentHostCallback Fragment.mHost>
			((Fragment) (view)).onInflate(mHost.getContext(), attributeset, ((Fragment) (view)).mSavedFragmentState);
	//  190  369:aload_1         
	//  191  370:aload_0         
	//  192  371:getfield        #438 <Field FragmentHostCallback mHost>
	//  193  374:invokevirtual   #1311 <Method Context FragmentHostCallback.getContext()>
	//  194  377:aload           4
	//  195  379:aload_1         
	//  196  380:getfield        #1210 <Field Bundle Fragment.mSavedFragmentState>
	//  197  383:invokevirtual   #1658 <Method void Fragment.onInflate(Context, AttributeSet, Bundle)>
			addFragment(((Fragment) (view)), true);
	//  198  386:aload_0         
	//  199  387:aload_1         
	//  200  388:iconst_1        
	//  201  389:invokevirtual   #1660 <Method void addFragment(Fragment, boolean)>
		} else
	//* 202  392:goto            539
		{
			if(((Fragment) (s1)).mInLayout)
	//* 203  395:aload_2         
	//* 204  396:getfield        #1403 <Field boolean Fragment.mInLayout>
	//* 205  399:ifeq            500
			{
				view = ((View) (new StringBuilder()));
	//  206  402:new             #334 <Class StringBuilder>
	//  207  405:dup             
	//  208  406:invokespecial   #335 <Method void StringBuilder()>
	//  209  409:astore_1        
				((StringBuilder) (view)).append(attributeset.getPositionDescription());
	//  210  410:aload_1         
	//  211  411:aload           4
	//  212  413:invokeinterface #1638 <Method String AttributeSet.getPositionDescription()>
	//  213  418:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  214  421:pop             
				((StringBuilder) (view)).append(": Duplicate id 0x");
	//  215  422:aload_1         
	//  216  423:ldc2            #1662 <String ": Duplicate id 0x">
	//  217  426:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  218  429:pop             
				((StringBuilder) (view)).append(Integer.toHexString(l));
	//  219  430:aload_1         
	//  220  431:iload           7
	//  221  433:invokestatic    #1136 <Method String Integer.toHexString(int)>
	//  222  436:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  223  439:pop             
				((StringBuilder) (view)).append(", tag ");
	//  224  440:aload_1         
	//  225  441:ldc2            #1664 <String ", tag ">
	//  226  444:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  227  447:pop             
				((StringBuilder) (view)).append(s3);
	//  228  448:aload_1         
	//  229  449:aload           9
	//  230  451:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  231  454:pop             
				((StringBuilder) (view)).append(", or parent id 0x");
	//  232  455:aload_1         
	//  233  456:ldc2            #1666 <String ", or parent id 0x">
	//  234  459:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  235  462:pop             
				((StringBuilder) (view)).append(Integer.toHexString(i));
	//  236  463:aload_1         
	//  237  464:iload           5
	//  238  466:invokestatic    #1136 <Method String Integer.toHexString(int)>
	//  239  469:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  240  472:pop             
				((StringBuilder) (view)).append(" with another fragment for ");
	//  241  473:aload_1         
	//  242  474:ldc2            #1668 <String " with another fragment for ">
	//  243  477:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  244  480:pop             
				((StringBuilder) (view)).append(s2);
	//  245  481:aload_1         
	//  246  482:aload           8
	//  247  484:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  248  487:pop             
				throw new IllegalArgumentException(((StringBuilder) (view)).toString());
	//  249  488:new             #1492 <Class IllegalArgumentException>
	//  250  491:dup             
	//  251  492:aload_1         
	//  252  493:invokevirtual   #345 <Method String StringBuilder.toString()>
	//  253  496:invokespecial   #1493 <Method void IllegalArgumentException(String)>
	//  254  499:athrow          
			}
			s1.mInLayout = true;
	//  255  500:aload_2         
	//  256  501:iconst_1        
	//  257  502:putfield        #1403 <Field boolean Fragment.mInLayout>
			s1.mHost = mHost;
	//  258  505:aload_2         
	//  259  506:aload_0         
	//  260  507:getfield        #438 <Field FragmentHostCallback mHost>
	//  261  510:putfield        #1436 <Field FragmentHostCallback Fragment.mHost>
			if(!((Fragment) (s1)).mRetaining)
	//* 262  513:aload_2         
	//* 263  514:getfield        #767 <Field boolean Fragment.mRetaining>
	//* 264  517:ifne            537
				((Fragment) (s1)).onInflate(mHost.getContext(), attributeset, ((Fragment) (s1)).mSavedFragmentState);
	//  265  520:aload_2         
	//  266  521:aload_0         
	//  267  522:getfield        #438 <Field FragmentHostCallback mHost>
	//  268  525:invokevirtual   #1311 <Method Context FragmentHostCallback.getContext()>
	//  269  528:aload           4
	//  270  530:aload_2         
	//  271  531:getfield        #1210 <Field Bundle Fragment.mSavedFragmentState>
	//  272  534:invokevirtual   #1658 <Method void Fragment.onInflate(Context, AttributeSet, Bundle)>
			view = ((View) (s1));
	//  273  537:aload_2         
	//  274  538:astore_1        
		}
		if(mCurState < 1 && ((Fragment) (view)).mFromLayout)
	//* 275  539:aload_0         
	//* 276  540:getfield        #167 <Field int mCurState>
	//* 277  543:iconst_1        
	//* 278  544:icmpge          566
	//* 279  547:aload_1         
	//* 280  548:getfield        #1204 <Field boolean Fragment.mFromLayout>
	//* 281  551:ifeq            566
			moveToState(((Fragment) (view)), 1, 0, 0, false);
	//  282  554:aload_0         
	//  283  555:aload_1         
	//  284  556:iconst_1        
	//  285  557:iconst_0        
	//  286  558:iconst_0        
	//  287  559:iconst_0        
	//  288  560:invokevirtual   #217 <Method void moveToState(Fragment, int, int, int, boolean)>
		else
	//* 289  563:goto            571
			moveToState(((Fragment) (view)));
	//  290  566:aload_0         
	//  291  567:aload_1         
	//  292  568:invokevirtual   #867 <Method void moveToState(Fragment)>
		if(((Fragment) (view)).mView == null)
	//* 293  571:aload_1         
	//* 294  572:getfield        #221 <Field View Fragment.mView>
	//* 295  575:ifnonnull       621
		{
			view = ((View) (new StringBuilder()));
	//  296  578:new             #334 <Class StringBuilder>
	//  297  581:dup             
	//  298  582:invokespecial   #335 <Method void StringBuilder()>
	//  299  585:astore_1        
			((StringBuilder) (view)).append("Fragment ");
	//  300  586:aload_1         
	//  301  587:ldc2            #1452 <String "Fragment ">
	//  302  590:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  303  593:pop             
			((StringBuilder) (view)).append(s2);
	//  304  594:aload_1         
	//  305  595:aload           8
	//  306  597:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  307  600:pop             
			((StringBuilder) (view)).append(" did not create a view.");
	//  308  601:aload_1         
	//  309  602:ldc2            #1670 <String " did not create a view.">
	//  310  605:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  311  608:pop             
			throw new IllegalStateException(((StringBuilder) (view)).toString());
	//  312  609:new             #325 <Class IllegalStateException>
	//  313  612:dup             
	//  314  613:aload_1         
	//  315  614:invokevirtual   #345 <Method String StringBuilder.toString()>
	//  316  617:invokespecial   #330 <Method void IllegalStateException(String)>
	//  317  620:athrow          
		}
		if(l != 0)
	//* 318  621:iload           7
	//* 319  623:ifeq            635
			((Fragment) (view)).mView.setId(l);
	//  320  626:aload_1         
	//  321  627:getfield        #221 <Field View Fragment.mView>
	//  322  630:iload           7
	//  323  632:invokevirtual   #1673 <Method void View.setId(int)>
		if(((Fragment) (view)).mView.getTag() == null)
	//* 324  635:aload_1         
	//* 325  636:getfield        #221 <Field View Fragment.mView>
	//* 326  639:invokevirtual   #1676 <Method Object View.getTag()>
	//* 327  642:ifnonnull       654
			((Fragment) (view)).mView.setTag(((Object) (s3)));
	//  328  645:aload_1         
	//  329  646:getfield        #221 <Field View Fragment.mView>
	//  330  649:aload           9
	//  331  651:invokevirtual   #1679 <Method void View.setTag(Object)>
		return ((Fragment) (view)).mView;
	//  332  654:aload_1         
	//  333  655:getfield        #221 <Field View Fragment.mView>
	//  334  658:areturn         
	}

	public View onCreateView(String s1, Context context, AttributeSet attributeset)
	{
		return onCreateView(((View) (null)), s1, context, attributeset);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokevirtual   #1682 <Method View onCreateView(View, String, Context, AttributeSet)>
	//    6    8:areturn         
	}

	public void performPendingDeferredStart(Fragment fragment)
	{
		if(fragment.mDeferStart)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1400 <Field boolean Fragment.mDeferStart>
	//*   2    4:ifeq            37
		{
			if(mExecutingActions)
	//*   3    7:aload_0         
	//*   4    8:getfield        #348 <Field boolean mExecutingActions>
	//*   5   11:ifeq            20
			{
				mHavePendingDeferredStart = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #1108 <Field boolean mHavePendingDeferredStart>
				return;
	//    9   19:return          
			}
			fragment.mDeferStart = false;
	//   10   20:aload_1         
	//   11   21:iconst_0        
	//   12   22:putfield        #1400 <Field boolean Fragment.mDeferStart>
			moveToState(fragment, mCurState, 0, 0, false);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #167 <Field int mCurState>
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
	//    1    1:new             #36  <Class FragmentManagerImpl$PopBackStackState>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:iconst_m1       
	//    6    8:iconst_0        
	//    7    9:invokespecial   #1687 <Method void FragmentManagerImpl$PopBackStackState(FragmentManagerImpl, String, int, int)>
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #1689 <Method void enqueueAction(FragmentManagerImpl$OpGenerator, boolean)>
	//   10   16:return          
	}

	public void popBackStack(int i, int k)
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            38
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #334 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #335 <Method void StringBuilder()>
	//    5   11:astore_3        
			stringbuilder.append("Bad id: ");
	//    6   12:aload_3         
	//    7   13:ldc2            #1692 <String "Bad id: ">
	//    8   16:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
			stringbuilder.append(i);
	//   10   20:aload_3         
	//   11   21:iload_1         
	//   12   22:invokevirtual   #885 <Method StringBuilder StringBuilder.append(int)>
	//   13   25:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   14   26:new             #1492 <Class IllegalArgumentException>
	//   15   29:dup             
	//   16   30:aload_3         
	//   17   31:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   18   34:invokespecial   #1493 <Method void IllegalArgumentException(String)>
	//   19   37:athrow          
		} else
		{
			enqueueAction(((OpGenerator) (new PopBackStackState(((String) (null)), i, k))), false);
	//   20   38:aload_0         
	//   21   39:new             #36  <Class FragmentManagerImpl$PopBackStackState>
	//   22   42:dup             
	//   23   43:aload_0         
	//   24   44:aconst_null     
	//   25   45:iload_1         
	//   26   46:iload_2         
	//   27   47:invokespecial   #1687 <Method void FragmentManagerImpl$PopBackStackState(FragmentManagerImpl, String, int, int)>
	//   28   50:iconst_0        
	//   29   51:invokevirtual   #1689 <Method void enqueueAction(FragmentManagerImpl$OpGenerator, boolean)>
			return;
	//   30   54:return          
		}
	}

	public void popBackStack(String s1, int i)
	{
		enqueueAction(((OpGenerator) (new PopBackStackState(s1, -1, i))), false);
	//    0    0:aload_0         
	//    1    1:new             #36  <Class FragmentManagerImpl$PopBackStackState>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iconst_m1       
	//    6    8:iload_2         
	//    7    9:invokespecial   #1687 <Method void FragmentManagerImpl$PopBackStackState(FragmentManagerImpl, String, int, int)>
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #1689 <Method void enqueueAction(FragmentManagerImpl$OpGenerator, boolean)>
	//   10   16:return          
	}

	public boolean popBackStackImmediate()
	{
		checkStateLoss();
	//    0    0:aload_0         
	//    1    1:invokespecial   #453 <Method void checkStateLoss()>
		return popBackStackImmediate(((String) (null)), -1, 0);
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:iconst_m1       
	//    5    7:iconst_0        
	//    6    8:invokespecial   #1695 <Method boolean popBackStackImmediate(String, int, int)>
	//    7   11:ireturn         
	}

	public boolean popBackStackImmediate(int i, int k)
	{
		checkStateLoss();
	//    0    0:aload_0         
	//    1    1:invokespecial   #453 <Method void checkStateLoss()>
		execPendingActions();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #402 <Method boolean execPendingActions()>
	//    4    8:pop             
		if(i < 0)
	//*   5    9:iload_1         
	//*   6   10:ifge            47
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   13:new             #334 <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #335 <Method void StringBuilder()>
	//   10   20:astore_3        
			stringbuilder.append("Bad id: ");
	//   11   21:aload_3         
	//   12   22:ldc2            #1692 <String "Bad id: ">
	//   13   25:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
			stringbuilder.append(i);
	//   15   29:aload_3         
	//   16   30:iload_1         
	//   17   31:invokevirtual   #885 <Method StringBuilder StringBuilder.append(int)>
	//   18   34:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   19   35:new             #1492 <Class IllegalArgumentException>
	//   20   38:dup             
	//   21   39:aload_3         
	//   22   40:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   23   43:invokespecial   #1493 <Method void IllegalArgumentException(String)>
	//   24   46:athrow          
		} else
		{
			return popBackStackImmediate(((String) (null)), i, k);
	//   25   47:aload_0         
	//   26   48:aconst_null     
	//   27   49:iload_1         
	//   28   50:iload_2         
	//   29   51:invokespecial   #1695 <Method boolean popBackStackImmediate(String, int, int)>
	//   30   54:ireturn         
		}
	}

	public boolean popBackStackImmediate(String s1, int i)
	{
		checkStateLoss();
	//    0    0:aload_0         
	//    1    1:invokespecial   #453 <Method void checkStateLoss()>
		return popBackStackImmediate(s1, -1, i);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iconst_m1       
	//    5    7:iload_2         
	//    6    8:invokespecial   #1695 <Method boolean popBackStackImmediate(String, int, int)>
	//    7   11:ireturn         
	}

	boolean popBackStackState(ArrayList arraylist, ArrayList arraylist1, String s1, int i, int k)
	{
		if(mBackStack == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #827 <Field ArrayList mBackStack>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(s1 == null && i < 0 && (k & 1) == 0)
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
	//   14   26:getfield        #827 <Field ArrayList mBackStack>
	//   15   29:invokevirtual   #198 <Method int ArrayList.size()>
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
	//   25   45:getfield        #827 <Field ArrayList mBackStack>
	//   26   48:iload           4
	//   27   50:invokevirtual   #539 <Method Object ArrayList.remove(int)>
	//   28   53:invokevirtual   #367 <Method boolean ArrayList.add(Object)>
	//   29   56:pop             
				arraylist1.add(((Object) (Boolean.valueOf(true))));
	//   30   57:aload_2         
	//   31   58:iconst_1        
	//   32   59:invokestatic    #373 <Method Boolean Boolean.valueOf(boolean)>
	//   33   62:invokevirtual   #367 <Method boolean ArrayList.add(Object)>
	//   34   65:pop             
				return true;
	//   35   66:iconst_1        
	//   36   67:ireturn         
			}
		}
		int i1;
		if(s1 == null && i < 0)
	//*  37   68:aload_3         
	//*  38   69:ifnonnull       86
	//*  39   72:iload           4
	//*  40   74:iflt            80
	//*  41   77:goto            86
		{
			i1 = -1;
	//   42   80:iconst_m1       
	//   43   81:istore          7
		} else
	//*  44   83:goto            259
		{
			int l = mBackStack.size() - 1;
	//   45   86:aload_0         
	//   46   87:getfield        #827 <Field ArrayList mBackStack>
	//   47   90:invokevirtual   #198 <Method int ArrayList.size()>
	//   48   93:iconst_1        
	//   49   94:isub            
	//   50   95:istore          6
			do
			{
				if(l < 0)
					break;
	//   51   97:iload           6
	//   52   99:iflt            162
				BackStackRecord backstackrecord = (BackStackRecord)mBackStack.get(l);
	//   53  102:aload_0         
	//   54  103:getfield        #827 <Field ArrayList mBackStack>
	//   55  106:iload           6
	//   56  108:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   57  111:checkcast       #357 <Class BackStackRecord>
	//   58  114:astore          8
				if(s1 != null && s1.equals(((Object) (backstackrecord.getName()))) || i >= 0 && i == backstackrecord.mIndex)
	//*  59  116:aload_3         
	//*  60  117:ifnull          135
	//*  61  120:aload_3         
	//*  62  121:aload           8
	//*  63  123:invokevirtual   #1700 <Method String BackStackRecord.getName()>
	//*  64  126:invokevirtual   #665 <Method boolean String.equals(Object)>
	//*  65  129:ifeq            135
	//*  66  132:goto            162
	//*  67  135:iload           4
	//*  68  137:iflt            153
	//*  69  140:iload           4
	//*  70  142:aload           8
	//*  71  144:getfield        #504 <Field int BackStackRecord.mIndex>
	//*  72  147:icmpne          153
					break;
	//   73  150:goto            162
				l--;
	//   74  153:iload           6
	//   75  155:iconst_1        
	//   76  156:isub            
	//   77  157:istore          6
			} while(true);
	//   78  159:goto            97
			if(l < 0)
	//*  79  162:iload           6
	//*  80  164:ifge            169
				return false;
	//   81  167:iconst_0        
	//   82  168:ireturn         
			i1 = l;
	//   83  169:iload           6
	//   84  171:istore          7
			if((k & 1) != 0)
	//*  85  173:iload           5
	//*  86  175:iconst_1        
	//*  87  176:iand            
	//*  88  177:ifeq            259
				do
				{
					k = l - 1;
	//   89  180:iload           6
	//   90  182:iconst_1        
	//   91  183:isub            
	//   92  184:istore          5
					i1 = k;
	//   93  186:iload           5
	//   94  188:istore          7
					if(k < 0)
						break;
	//   95  190:iload           5
	//   96  192:iflt            259
					BackStackRecord backstackrecord1 = (BackStackRecord)mBackStack.get(k);
	//   97  195:aload_0         
	//   98  196:getfield        #827 <Field ArrayList mBackStack>
	//   99  199:iload           5
	//  100  201:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//  101  204:checkcast       #357 <Class BackStackRecord>
	//  102  207:astore          8
					if(s1 != null)
	//* 103  209:aload_3         
	//* 104  210:ifnull          229
					{
						l = k;
	//  105  213:iload           5
	//  106  215:istore          6
						if(s1.equals(((Object) (backstackrecord1.getName()))))
							continue;
	//  107  217:aload_3         
	//  108  218:aload           8
	//  109  220:invokevirtual   #1700 <Method String BackStackRecord.getName()>
	//  110  223:invokevirtual   #665 <Method boolean String.equals(Object)>
	//  111  226:ifne            180
					}
					i1 = k;
	//  112  229:iload           5
	//  113  231:istore          7
					if(i < 0)
						break;
	//  114  233:iload           4
	//  115  235:iflt            259
					i1 = k;
	//  116  238:iload           5
	//  117  240:istore          7
					if(i != backstackrecord1.mIndex)
						break;
	//  118  242:iload           4
	//  119  244:aload           8
	//  120  246:getfield        #504 <Field int BackStackRecord.mIndex>
	//  121  249:icmpne          259
					l = k;
	//  122  252:iload           5
	//  123  254:istore          6
				} while(true);
	//  124  256:goto            180
		}
		if(i1 == mBackStack.size() - 1)
	//* 125  259:iload           7
	//* 126  261:aload_0         
	//* 127  262:getfield        #827 <Field ArrayList mBackStack>
	//* 128  265:invokevirtual   #198 <Method int ArrayList.size()>
	//* 129  268:iconst_1        
	//* 130  269:isub            
	//* 131  270:icmpne          275
			return false;
	//  132  273:iconst_0        
	//  133  274:ireturn         
		for(i = mBackStack.size() - 1; i > i1; i--)
	//* 134  275:aload_0         
	//* 135  276:getfield        #827 <Field ArrayList mBackStack>
	//* 136  279:invokevirtual   #198 <Method int ArrayList.size()>
	//* 137  282:iconst_1        
	//* 138  283:isub            
	//* 139  284:istore          4
	//* 140  286:iload           4
	//* 141  288:iload           7
	//* 142  290:icmple          325
		{
			arraylist.add(mBackStack.remove(i));
	//  143  293:aload_1         
	//  144  294:aload_0         
	//  145  295:getfield        #827 <Field ArrayList mBackStack>
	//  146  298:iload           4
	//  147  300:invokevirtual   #539 <Method Object ArrayList.remove(int)>
	//  148  303:invokevirtual   #367 <Method boolean ArrayList.add(Object)>
	//  149  306:pop             
			arraylist1.add(((Object) (Boolean.valueOf(true))));
	//  150  307:aload_2         
	//  151  308:iconst_1        
	//  152  309:invokestatic    #373 <Method Boolean Boolean.valueOf(boolean)>
	//  153  312:invokevirtual   #367 <Method boolean ArrayList.add(Object)>
	//  154  315:pop             
		}

	//  155  316:iload           4
	//  156  318:iconst_1        
	//  157  319:isub            
	//  158  320:istore          4
	//* 159  322:goto            286
		return true;
	//  160  325:iconst_1        
	//  161  326:ireturn         
	}

	public void putFragment(Bundle bundle, String s1, Fragment fragment)
	{
		if(fragment.mIndex < 0)
	//*   0    0:aload_3         
	//*   1    1:getfield        #1349 <Field int Fragment.mIndex>
	//*   2    4:ifge            57
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #334 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #335 <Method void StringBuilder()>
	//    6   14:astore          4
			stringbuilder.append("Fragment ");
	//    7   16:aload           4
	//    8   18:ldc2            #1452 <String "Fragment ">
	//    9   21:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:pop             
			stringbuilder.append(((Object) (fragment)));
	//   11   25:aload           4
	//   12   27:aload_3         
	//   13   28:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   14   31:pop             
			stringbuilder.append(" is not currently in the FragmentManager");
	//   15   32:aload           4
	//   16   34:ldc2            #1705 <String " is not currently in the FragmentManager">
	//   17   37:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   18   40:pop             
			throwException(((RuntimeException) (new IllegalStateException(stringbuilder.toString()))));
	//   19   41:aload_0         
	//   20   42:new             #325 <Class IllegalStateException>
	//   21   45:dup             
	//   22   46:aload           4
	//   23   48:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   24   51:invokespecial   #330 <Method void IllegalStateException(String)>
	//   25   54:invokespecial   #1275 <Method void throwException(RuntimeException)>
		}
		bundle.putInt(s1, fragment.mIndex);
	//   26   57:aload_1         
	//   27   58:aload_2         
	//   28   59:aload_3         
	//   29   60:getfield        #1349 <Field int Fragment.mIndex>
	//   30   63:invokevirtual   #1708 <Method void Bundle.putInt(String, int)>
	//   31   66:return          
	}

	public void registerFragmentLifecycleCallbacks(FragmentManager.FragmentLifecycleCallbacks fragmentlifecyclecallbacks, boolean flag)
	{
		mLifecycleCallbacks.add(((Object) (new j(((Object) (fragmentlifecyclecallbacks)), ((Object) (Boolean.valueOf(flag)))))));
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//    2    4:new             #988 <Class j>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokestatic    #373 <Method Boolean Boolean.valueOf(boolean)>
	//    7   13:invokespecial   #1713 <Method void j(Object, Object)>
	//    8   16:invokevirtual   #1714 <Method boolean CopyOnWriteArrayList.add(Object)>
	//    9   19:pop             
	//   10   20:return          
	}

	public void removeFragment(Fragment fragment)
	{
		if(DEBUG)
	//*   0    0:getstatic       #831 <Field boolean DEBUG>
	//*   1    3:ifeq            55
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #334 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #335 <Method void StringBuilder()>
	//    5   13:astore_3        
			stringbuilder.append("remove: ");
	//    6   14:aload_3         
	//    7   15:ldc2            #1717 <String "remove: ">
	//    8   18:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (fragment)));
	//   10   22:aload_3         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			stringbuilder.append(" nesting=");
	//   14   28:aload_3         
	//   15   29:ldc2            #1719 <String " nesting=">
	//   16   32:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
			stringbuilder.append(fragment.mBackStackNesting);
	//   18   36:aload_3         
	//   19   37:aload_1         
	//   20   38:getfield        #1722 <Field int Fragment.mBackStackNesting>
	//   21   41:invokevirtual   #885 <Method StringBuilder StringBuilder.append(int)>
	//   22   44:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   23   45:ldc1            #67  <String "FragmentManager">
	//   24   47:aload_3         
	//   25   48:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   26   51:invokestatic    #839 <Method int Log.v(String, String)>
	//   27   54:pop             
		}
		boolean flag = fragment.isInBackStack();
	//   28   55:aload_1         
	//   29   56:invokevirtual   #1375 <Method boolean Fragment.isInBackStack()>
	//   30   59:istore_2        
		if(!fragment.mDetached || flag ^ true)
	//*  31   60:aload_1         
	//*  32   61:getfield        #846 <Field boolean Fragment.mDetached>
	//*  33   64:ifeq            73
	//*  34   67:iload_2         
	//*  35   68:iconst_1        
	//*  36   69:ixor            
	//*  37   70:ifeq            120
		{
			synchronized(mAdded)
	//*  38   73:aload_0         
	//*  39   74:getfield        #160 <Field ArrayList mAdded>
	//*  40   77:astore_3        
	//*  41   78:aload_3         
	//*  42   79:monitorenter    
			{
				mAdded.remove(((Object) (fragment)));
	//   43   80:aload_0         
	//   44   81:getfield        #160 <Field ArrayList mAdded>
	//   45   84:aload_1         
	//   46   85:invokevirtual   #942 <Method boolean ArrayList.remove(Object)>
	//   47   88:pop             
			}
	//   48   89:aload_3         
	//   49   90:monitorexit     
			if(fragment.mHasMenu && fragment.mMenuVisible)
	//*  50   91:aload_1         
	//*  51   92:getfield        #860 <Field boolean Fragment.mHasMenu>
	//*  52   95:ifeq            110
	//*  53   98:aload_1         
	//*  54   99:getfield        #863 <Field boolean Fragment.mMenuVisible>
	//*  55  102:ifeq            110
				mNeedMenuInvalidate = true;
	//   56  105:aload_0         
	//   57  106:iconst_1        
	//   58  107:putfield        #865 <Field boolean mNeedMenuInvalidate>
			fragment.mAdded = false;
	//   59  110:aload_1         
	//   60  111:iconst_0        
	//   61  112:putfield        #638 <Field boolean Fragment.mAdded>
			fragment.mRemoving = true;
	//   62  115:aload_1         
	//   63  116:iconst_1        
	//   64  117:putfield        #854 <Field boolean Fragment.mRemoving>
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
	//*   1    1:getfield        #871 <Field ArrayList mBackStackChangeListeners>
	//*   2    4:ifnull          16
			mBackStackChangeListeners.remove(((Object) (onbackstackchangedlistener)));
	//    3    7:aload_0         
	//    4    8:getfield        #871 <Field ArrayList mBackStackChangeListeners>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #942 <Method boolean ArrayList.remove(Object)>
	//    7   15:pop             
	//    8   16:return          
	}

	void reportBackStackChanged()
	{
		if(mBackStackChangeListeners != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #871 <Field ArrayList mBackStackChangeListeners>
	//*   2    4:ifnull          43
		{
			for(int i = 0; i < mBackStackChangeListeners.size(); i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_1        
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #871 <Field ArrayList mBackStackChangeListeners>
	//*   8   14:invokevirtual   #198 <Method int ArrayList.size()>
	//*   9   17:icmpge          43
				((FragmentManager.OnBackStackChangedListener)mBackStackChangeListeners.get(i)).onBackStackChanged();
	//   10   20:aload_0         
	//   11   21:getfield        #871 <Field ArrayList mBackStackChangeListeners>
	//   12   24:iload_1         
	//   13   25:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//   14   28:checkcast       #1725 <Class FragmentManager$OnBackStackChangedListener>
	//   15   31:invokeinterface #1728 <Method void FragmentManager$OnBackStackChangedListener.onBackStackChanged()>

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
	//    4    6:checkcast       #1732 <Class FragmentManagerState>
	//    5    9:astore          7
		if(fragmentmanagerstate.mActive == null)
	//*   6   11:aload           7
	//*   7   13:getfield        #1735 <Field FragmentState[] FragmentManagerState.mActive>
	//*   8   16:ifnonnull       20
			return;
	//    9   19:return          
		if(fragmentmanagernonconfig != null)
	//*  10   20:aload_2         
	//*  11   21:ifnull          316
		{
			List list1 = fragmentmanagernonconfig.getFragments();
	//   12   24:aload_2         
	//   13   25:invokevirtual   #751 <Method List FragmentManagerNonConfig.getFragments()>
	//   14   28:astore          8
			List list = fragmentmanagernonconfig.getChildNonConfigs();
	//   15   30:aload_2         
	//   16   31:invokevirtual   #770 <Method List FragmentManagerNonConfig.getChildNonConfigs()>
	//   17   34:astore          6
			int i;
			if(list1 != null)
	//*  18   36:aload           8
	//*  19   38:ifnull          52
				i = list1.size();
	//   20   41:aload           8
	//   21   43:invokeinterface #674 <Method int List.size()>
	//   22   48:istore_3        
			else
	//*  23   49:goto            54
				i = 0;
	//   24   52:iconst_0        
	//   25   53:istore_3        
			int k1 = 0;
	//   26   54:iconst_0        
	//   27   55:istore          4
			do
			{
				parcelable = ((Parcelable) (list));
	//   28   57:aload           6
	//   29   59:astore_1        
				if(k1 >= i)
					break;
	//   30   60:iload           4
	//   31   62:iload_3         
	//   32   63:icmpge          318
				parcelable = ((Parcelable) ((Fragment)list1.get(k1)));
	//   33   66:aload           8
	//   34   68:iload           4
	//   35   70:invokeinterface #675 <Method Object List.get(int)>
	//   36   75:checkcast       #204 <Class Fragment>
	//   37   78:astore_1        
				if(DEBUG)
	//*  38   79:getstatic       #831 <Field boolean DEBUG>
	//*  39   82:ifeq            121
				{
					StringBuilder stringbuilder1 = new StringBuilder();
	//   40   85:new             #334 <Class StringBuilder>
	//   41   88:dup             
	//   42   89:invokespecial   #335 <Method void StringBuilder()>
	//   43   92:astore          9
					stringbuilder1.append("restoreAllState: re-attaching retained ");
	//   44   94:aload           9
	//   45   96:ldc2            #1737 <String "restoreAllState: re-attaching retained ">
	//   46   99:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   47  102:pop             
					stringbuilder1.append(((Object) (parcelable)));
	//   48  103:aload           9
	//   49  105:aload_1         
	//   50  106:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   51  109:pop             
					Log.v("FragmentManager", stringbuilder1.toString());
	//   52  110:ldc1            #67  <String "FragmentManager">
	//   53  112:aload           9
	//   54  114:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   55  117:invokestatic    #839 <Method int Log.v(String, String)>
	//   56  120:pop             
				}
				int i2;
				for(i2 = 0; i2 < fragmentmanagerstate.mActive.length && fragmentmanagerstate.mActive[i2].mIndex != ((Fragment) (parcelable)).mIndex; i2++);
	//   57  121:iconst_0        
	//   58  122:istore          5
	//   59  124:iload           5
	//   60  126:aload           7
	//   61  128:getfield        #1735 <Field FragmentState[] FragmentManagerState.mActive>
	//   62  131:arraylength     
	//   63  132:icmpge          162
	//   64  135:aload           7
	//   65  137:getfield        #1735 <Field FragmentState[] FragmentManagerState.mActive>
	//   66  140:iload           5
	//   67  142:aaload          
	//   68  143:getfield        #1740 <Field int FragmentState.mIndex>
	//   69  146:aload_1         
	//   70  147:getfield        #1349 <Field int Fragment.mIndex>
	//   71  150:icmpeq          162
	//   72  153:iload           5
	//   73  155:iconst_1        
	//   74  156:iadd            
	//   75  157:istore          5
	//*  76  159:goto            124
				if(i2 == fragmentmanagerstate.mActive.length)
	//*  77  162:iload           5
	//*  78  164:aload           7
	//*  79  166:getfield        #1735 <Field FragmentState[] FragmentManagerState.mActive>
	//*  80  169:arraylength     
	//*  81  170:icmpne          217
				{
					StringBuilder stringbuilder2 = new StringBuilder();
	//   82  173:new             #334 <Class StringBuilder>
	//   83  176:dup             
	//   84  177:invokespecial   #335 <Method void StringBuilder()>
	//   85  180:astore          9
					stringbuilder2.append("Could not find active fragment with index ");
	//   86  182:aload           9
	//   87  184:ldc2            #1742 <String "Could not find active fragment with index ">
	//   88  187:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   89  190:pop             
					stringbuilder2.append(((Fragment) (parcelable)).mIndex);
	//   90  191:aload           9
	//   91  193:aload_1         
	//   92  194:getfield        #1349 <Field int Fragment.mIndex>
	//   93  197:invokevirtual   #885 <Method StringBuilder StringBuilder.append(int)>
	//   94  200:pop             
					throwException(((RuntimeException) (new IllegalStateException(stringbuilder2.toString()))));
	//   95  201:aload_0         
	//   96  202:new             #325 <Class IllegalStateException>
	//   97  205:dup             
	//   98  206:aload           9
	//   99  208:invokevirtual   #345 <Method String StringBuilder.toString()>
	//  100  211:invokespecial   #330 <Method void IllegalStateException(String)>
	//  101  214:invokespecial   #1275 <Method void throwException(RuntimeException)>
				}
				FragmentState fragmentstate1 = fragmentmanagerstate.mActive[i2];
	//  102  217:aload           7
	//  103  219:getfield        #1735 <Field FragmentState[] FragmentManagerState.mActive>
	//  104  222:iload           5
	//  105  224:aaload          
	//  106  225:astore          9
				fragmentstate1.mInstance = ((Fragment) (parcelable));
	//  107  227:aload           9
	//  108  229:aload_1         
	//  109  230:putfield        #1745 <Field Fragment FragmentState.mInstance>
				parcelable.mSavedViewState = null;
	//  110  233:aload_1         
	//  111  234:aconst_null     
	//  112  235:putfield        #1420 <Field SparseArray Fragment.mSavedViewState>
				parcelable.mBackStackNesting = 0;
	//  113  238:aload_1         
	//  114  239:iconst_0        
	//  115  240:putfield        #1722 <Field int Fragment.mBackStackNesting>
				parcelable.mInLayout = false;
	//  116  243:aload_1         
	//  117  244:iconst_0        
	//  118  245:putfield        #1403 <Field boolean Fragment.mInLayout>
				parcelable.mAdded = false;
	//  119  248:aload_1         
	//  120  249:iconst_0        
	//  121  250:putfield        #638 <Field boolean Fragment.mAdded>
				parcelable.mTarget = null;
	//  122  253:aload_1         
	//  123  254:aconst_null     
	//  124  255:putfield        #1425 <Field Fragment Fragment.mTarget>
				if(fragmentstate1.mSavedFragmentState != null)
	//* 125  258:aload           9
	//* 126  260:getfield        #1746 <Field Bundle FragmentState.mSavedFragmentState>
	//* 127  263:ifnull          307
				{
					fragmentstate1.mSavedFragmentState.setClassLoader(mHost.getContext().getClassLoader());
	//  128  266:aload           9
	//  129  268:getfield        #1746 <Field Bundle FragmentState.mSavedFragmentState>
	//  130  271:aload_0         
	//  131  272:getfield        #438 <Field FragmentHostCallback mHost>
	//  132  275:invokevirtual   #1311 <Method Context FragmentHostCallback.getContext()>
	//  133  278:invokevirtual   #1409 <Method ClassLoader Context.getClassLoader()>
	//  134  281:invokevirtual   #1413 <Method void Bundle.setClassLoader(ClassLoader)>
					parcelable.mSavedViewState = fragmentstate1.mSavedFragmentState.getSparseParcelableArray("android:view_state");
	//  135  284:aload_1         
	//  136  285:aload           9
	//  137  287:getfield        #1746 <Field Bundle FragmentState.mSavedFragmentState>
	//  138  290:ldc1            #79  <String "android:view_state">
	//  139  292:invokevirtual   #1417 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//  140  295:putfield        #1420 <Field SparseArray Fragment.mSavedViewState>
					parcelable.mSavedFragmentState = fragmentstate1.mSavedFragmentState;
	//  141  298:aload_1         
	//  142  299:aload           9
	//  143  301:getfield        #1746 <Field Bundle FragmentState.mSavedFragmentState>
	//  144  304:putfield        #1210 <Field Bundle Fragment.mSavedFragmentState>
				}
				k1++;
	//  145  307:iload           4
	//  146  309:iconst_1        
	//  147  310:iadd            
	//  148  311:istore          4
			} while(true);
	//  149  313:goto            57
		} else
		{
			parcelable = null;
	//  150  316:aconst_null     
	//  151  317:astore_1        
		}
		mActive = new SparseArray(fragmentmanagerstate.mActive.length);
	//  152  318:aload_0         
	//  153  319:new             #309 <Class SparseArray>
	//  154  322:dup             
	//  155  323:aload           7
	//  156  325:getfield        #1735 <Field FragmentState[] FragmentManagerState.mActive>
	//  157  328:arraylength     
	//  158  329:invokespecial   #1747 <Method void SparseArray(int)>
	//  159  332:putfield        #307 <Field SparseArray mActive>
		for(int k = 0; k < fragmentmanagerstate.mActive.length; k++)
	//* 160  335:iconst_0        
	//* 161  336:istore_3        
	//* 162  337:iload_3         
	//* 163  338:aload           7
	//* 164  340:getfield        #1735 <Field FragmentState[] FragmentManagerState.mActive>
	//* 165  343:arraylength     
	//* 166  344:icmpge          500
		{
			FragmentState fragmentstate = fragmentmanagerstate.mActive[k];
	//  167  347:aload           7
	//  168  349:getfield        #1735 <Field FragmentState[] FragmentManagerState.mActive>
	//  169  352:iload_3         
	//  170  353:aaload          
	//  171  354:astore          8
			if(fragmentstate == null)
				continue;
	//  172  356:aload           8
	//  173  358:ifnull          493
			Object obj;
			if(parcelable != null && k < ((List) (parcelable)).size())
	//* 174  361:aload_1         
	//* 175  362:ifnull          390
	//* 176  365:iload_3         
	//* 177  366:aload_1         
	//* 178  367:invokeinterface #674 <Method int List.size()>
	//* 179  372:icmpge          390
				obj = ((Object) ((FragmentManagerNonConfig)((List) (parcelable)).get(k)));
	//  180  375:aload_1         
	//  181  376:iload_3         
	//  182  377:invokeinterface #675 <Method Object List.get(int)>
	//  183  382:checkcast       #748 <Class FragmentManagerNonConfig>
	//  184  385:astore          6
			else
	//* 185  387:goto            393
				obj = null;
	//  186  390:aconst_null     
	//  187  391:astore          6
			obj = ((Object) (fragmentstate.instantiate(mHost, mContainer, mParent, ((FragmentManagerNonConfig) (obj)))));
	//  188  393:aload           8
	//  189  395:aload_0         
	//  190  396:getfield        #438 <Field FragmentHostCallback mHost>
	//  191  399:aload_0         
	//  192  400:getfield        #903 <Field FragmentContainer mContainer>
	//  193  403:aload_0         
	//  194  404:getfield        #905 <Field Fragment mParent>
	//  195  407:aload           6
	//  196  409:invokevirtual   #1750 <Method Fragment FragmentState.instantiate(FragmentHostCallback, FragmentContainer, Fragment, FragmentManagerNonConfig)>
	//  197  412:astore          6
			if(DEBUG)
	//* 198  414:getstatic       #831 <Field boolean DEBUG>
	//* 199  417:ifeq            473
			{
				StringBuilder stringbuilder3 = new StringBuilder();
	//  200  420:new             #334 <Class StringBuilder>
	//  201  423:dup             
	//  202  424:invokespecial   #335 <Method void StringBuilder()>
	//  203  427:astore          9
				stringbuilder3.append("restoreAllState: active #");
	//  204  429:aload           9
	//  205  431:ldc2            #1752 <String "restoreAllState: active #">
	//  206  434:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  207  437:pop             
				stringbuilder3.append(k);
	//  208  438:aload           9
	//  209  440:iload_3         
	//  210  441:invokevirtual   #885 <Method StringBuilder StringBuilder.append(int)>
	//  211  444:pop             
				stringbuilder3.append(": ");
	//  212  445:aload           9
	//  213  447:ldc2            #1147 <String ": ">
	//  214  450:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  215  453:pop             
				stringbuilder3.append(obj);
	//  216  454:aload           9
	//  217  456:aload           6
	//  218  458:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  219  461:pop             
				Log.v("FragmentManager", stringbuilder3.toString());
	//  220  462:ldc1            #67  <String "FragmentManager">
	//  221  464:aload           9
	//  222  466:invokevirtual   #345 <Method String StringBuilder.toString()>
	//  223  469:invokestatic    #839 <Method int Log.v(String, String)>
	//  224  472:pop             
			}
			mActive.put(((Fragment) (obj)).mIndex, obj);
	//  225  473:aload_0         
	//  226  474:getfield        #307 <Field SparseArray mActive>
	//  227  477:aload           6
	//  228  479:getfield        #1349 <Field int Fragment.mIndex>
	//  229  482:aload           6
	//  230  484:invokevirtual   #1357 <Method void SparseArray.put(int, Object)>
			fragmentstate.mInstance = null;
	//  231  487:aload           8
	//  232  489:aconst_null     
	//  233  490:putfield        #1745 <Field Fragment FragmentState.mInstance>
		}

	//  234  493:iload_3         
	//  235  494:iconst_1        
	//  236  495:iadd            
	//  237  496:istore_3        
	//* 238  497:goto            337
		if(fragmentmanagernonconfig != null)
	//* 239  500:aload_2         
	//* 240  501:ifnull          642
		{
			parcelable = ((Parcelable) (fragmentmanagernonconfig.getFragments()));
	//  241  504:aload_2         
	//  242  505:invokevirtual   #751 <Method List FragmentManagerNonConfig.getFragments()>
	//  243  508:astore_1        
			int l;
			if(parcelable != null)
	//* 244  509:aload_1         
	//* 245  510:ifnull          523
				l = ((List) (parcelable)).size();
	//  246  513:aload_1         
	//  247  514:invokeinterface #674 <Method int List.size()>
	//  248  519:istore_3        
			else
	//* 249  520:goto            525
				l = 0;
	//  250  523:iconst_0        
	//  251  524:istore_3        
			for(int l1 = 0; l1 < l; l1++)
	//* 252  525:iconst_0        
	//* 253  526:istore          4
	//* 254  528:iload           4
	//* 255  530:iload_3         
	//* 256  531:icmpge          642
			{
				fragmentmanagernonconfig = ((FragmentManagerNonConfig) ((Fragment)((List) (parcelable)).get(l1)));
	//  257  534:aload_1         
	//  258  535:iload           4
	//  259  537:invokeinterface #675 <Method Object List.get(int)>
	//  260  542:checkcast       #204 <Class Fragment>
	//  261  545:astore_2        
				if(((Fragment) (fragmentmanagernonconfig)).mTargetIndex < 0)
					continue;
	//  262  546:aload_2         
	//  263  547:getfield        #1755 <Field int Fragment.mTargetIndex>
	//  264  550:iflt            633
				fragmentmanagernonconfig.mTarget = (Fragment)mActive.get(((Fragment) (fragmentmanagernonconfig)).mTargetIndex);
	//  265  553:aload_2         
	//  266  554:aload_0         
	//  267  555:getfield        #307 <Field SparseArray mActive>
	//  268  558:aload_2         
	//  269  559:getfield        #1755 <Field int Fragment.mTargetIndex>
	//  270  562:invokevirtual   #1269 <Method Object SparseArray.get(int)>
	//  271  565:checkcast       #204 <Class Fragment>
	//  272  568:putfield        #1425 <Field Fragment Fragment.mTarget>
				if(((Fragment) (fragmentmanagernonconfig)).mTarget == null)
	//* 273  571:aload_2         
	//* 274  572:getfield        #1425 <Field Fragment Fragment.mTarget>
	//* 275  575:ifnonnull       633
				{
					StringBuilder stringbuilder = new StringBuilder();
	//  276  578:new             #334 <Class StringBuilder>
	//  277  581:dup             
	//  278  582:invokespecial   #335 <Method void StringBuilder()>
	//  279  585:astore          6
					stringbuilder.append("Re-attaching retained fragment ");
	//  280  587:aload           6
	//  281  589:ldc2            #1757 <String "Re-attaching retained fragment ">
	//  282  592:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  283  595:pop             
					stringbuilder.append(((Object) (fragmentmanagernonconfig)));
	//  284  596:aload           6
	//  285  598:aload_2         
	//  286  599:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  287  602:pop             
					stringbuilder.append(" target no longer exists: ");
	//  288  603:aload           6
	//  289  605:ldc2            #1759 <String " target no longer exists: ">
	//  290  608:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  291  611:pop             
					stringbuilder.append(((Fragment) (fragmentmanagernonconfig)).mTargetIndex);
	//  292  612:aload           6
	//  293  614:aload_2         
	//  294  615:getfield        #1755 <Field int Fragment.mTargetIndex>
	//  295  618:invokevirtual   #885 <Method StringBuilder StringBuilder.append(int)>
	//  296  621:pop             
					Log.w("FragmentManager", stringbuilder.toString());
	//  297  622:ldc1            #67  <String "FragmentManager">
	//  298  624:aload           6
	//  299  626:invokevirtual   #345 <Method String StringBuilder.toString()>
	//  300  629:invokestatic    #1592 <Method int Log.w(String, String)>
	//  301  632:pop             
				}
			}

	//  302  633:iload           4
	//  303  635:iconst_1        
	//  304  636:iadd            
	//  305  637:istore          4
		}
	//* 306  639:goto            528
		mAdded.clear();
	//  307  642:aload_0         
	//  308  643:getfield        #160 <Field ArrayList mAdded>
	//  309  646:invokevirtual   #353 <Method void ArrayList.clear()>
		if(fragmentmanagerstate.mAdded != null)
	//* 310  649:aload           7
	//* 311  651:getfield        #1761 <Field int[] FragmentManagerState.mAdded>
	//* 312  654:ifnull          843
		{
			for(int i1 = 0; i1 < fragmentmanagerstate.mAdded.length; i1++)
	//* 313  657:iconst_0        
	//* 314  658:istore_3        
	//* 315  659:iload_3         
	//* 316  660:aload           7
	//* 317  662:getfield        #1761 <Field int[] FragmentManagerState.mAdded>
	//* 318  665:arraylength     
	//* 319  666:icmpge          843
			{
				parcelable = ((Parcelable) ((Fragment)mActive.get(fragmentmanagerstate.mAdded[i1])));
	//  320  669:aload_0         
	//  321  670:getfield        #307 <Field SparseArray mActive>
	//  322  673:aload           7
	//  323  675:getfield        #1761 <Field int[] FragmentManagerState.mAdded>
	//  324  678:iload_3         
	//  325  679:iaload          
	//  326  680:invokevirtual   #1269 <Method Object SparseArray.get(int)>
	//  327  683:checkcast       #204 <Class Fragment>
	//  328  686:astore_1        
				if(parcelable == null)
	//* 329  687:aload_1         
	//* 330  688:ifnonnull       734
				{
					fragmentmanagernonconfig = ((FragmentManagerNonConfig) (new StringBuilder()));
	//  331  691:new             #334 <Class StringBuilder>
	//  332  694:dup             
	//  333  695:invokespecial   #335 <Method void StringBuilder()>
	//  334  698:astore_2        
					((StringBuilder) (fragmentmanagernonconfig)).append("No instantiated fragment for index #");
	//  335  699:aload_2         
	//  336  700:ldc2            #1763 <String "No instantiated fragment for index #">
	//  337  703:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  338  706:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(fragmentmanagerstate.mAdded[i1]);
	//  339  707:aload_2         
	//  340  708:aload           7
	//  341  710:getfield        #1761 <Field int[] FragmentManagerState.mAdded>
	//  342  713:iload_3         
	//  343  714:iaload          
	//  344  715:invokevirtual   #885 <Method StringBuilder StringBuilder.append(int)>
	//  345  718:pop             
					throwException(((RuntimeException) (new IllegalStateException(((StringBuilder) (fragmentmanagernonconfig)).toString()))));
	//  346  719:aload_0         
	//  347  720:new             #325 <Class IllegalStateException>
	//  348  723:dup             
	//  349  724:aload_2         
	//  350  725:invokevirtual   #345 <Method String StringBuilder.toString()>
	//  351  728:invokespecial   #330 <Method void IllegalStateException(String)>
	//  352  731:invokespecial   #1275 <Method void throwException(RuntimeException)>
				}
				parcelable.mAdded = true;
	//  353  734:aload_1         
	//  354  735:iconst_1        
	//  355  736:putfield        #638 <Field boolean Fragment.mAdded>
				if(DEBUG)
	//* 356  739:getstatic       #831 <Field boolean DEBUG>
	//* 357  742:ifeq            791
				{
					fragmentmanagernonconfig = ((FragmentManagerNonConfig) (new StringBuilder()));
	//  358  745:new             #334 <Class StringBuilder>
	//  359  748:dup             
	//  360  749:invokespecial   #335 <Method void StringBuilder()>
	//  361  752:astore_2        
					((StringBuilder) (fragmentmanagernonconfig)).append("restoreAllState: added #");
	//  362  753:aload_2         
	//  363  754:ldc2            #1765 <String "restoreAllState: added #">
	//  364  757:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  365  760:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(i1);
	//  366  761:aload_2         
	//  367  762:iload_3         
	//  368  763:invokevirtual   #885 <Method StringBuilder StringBuilder.append(int)>
	//  369  766:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(": ");
	//  370  767:aload_2         
	//  371  768:ldc2            #1147 <String ": ">
	//  372  771:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  373  774:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(((Object) (parcelable)));
	//  374  775:aload_2         
	//  375  776:aload_1         
	//  376  777:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  377  780:pop             
					Log.v("FragmentManager", ((StringBuilder) (fragmentmanagernonconfig)).toString());
	//  378  781:ldc1            #67  <String "FragmentManager">
	//  379  783:aload_2         
	//  380  784:invokevirtual   #345 <Method String StringBuilder.toString()>
	//  381  787:invokestatic    #839 <Method int Log.v(String, String)>
	//  382  790:pop             
				}
				if(mAdded.contains(((Object) (parcelable))))
	//* 383  791:aload_0         
	//* 384  792:getfield        #160 <Field ArrayList mAdded>
	//* 385  795:aload_1         
	//* 386  796:invokevirtual   #849 <Method boolean ArrayList.contains(Object)>
	//* 387  799:ifeq            813
					throw new IllegalStateException("Already added!");
	//  388  802:new             #325 <Class IllegalStateException>
	//  389  805:dup             
	//  390  806:ldc2            #1767 <String "Already added!">
	//  391  809:invokespecial   #330 <Method void IllegalStateException(String)>
	//  392  812:athrow          
				synchronized(mAdded)
	//* 393  813:aload_0         
	//* 394  814:getfield        #160 <Field ArrayList mAdded>
	//* 395  817:astore_2        
	//* 396  818:aload_2         
	//* 397  819:monitorenter    
				{
					mAdded.add(((Object) (parcelable)));
	//  398  820:aload_0         
	//  399  821:getfield        #160 <Field ArrayList mAdded>
	//  400  824:aload_1         
	//  401  825:invokevirtual   #367 <Method boolean ArrayList.add(Object)>
	//  402  828:pop             
				}
	//  403  829:aload_2         
	//  404  830:monitorexit     
			}

	//  405  831:iload_3         
	//  406  832:iconst_1        
	//  407  833:iadd            
	//  408  834:istore_3        
		}
		break MISSING_BLOCK_LABEL_843;
	//  409  835:goto            659
		parcelable;
	//  410  838:astore_1        
		fragmentmanagernonconfig;
	//  411  839:aload_2         
		JVM INSTR monitorexit ;
	//  412  840:monitorexit     
		throw parcelable;
	//  413  841:aload_1         
	//  414  842:athrow          
		if(fragmentmanagerstate.mBackStack != null)
	//* 415  843:aload           7
	//* 416  845:getfield        #1770 <Field BackStackState[] FragmentManagerState.mBackStack>
	//* 417  848:ifnull          1023
		{
			mBackStack = new ArrayList(fragmentmanagerstate.mBackStack.length);
	//  418  851:aload_0         
	//  419  852:new             #157 <Class ArrayList>
	//  420  855:dup             
	//  421  856:aload           7
	//  422  858:getfield        #1770 <Field BackStackState[] FragmentManagerState.mBackStack>
	//  423  861:arraylength     
	//  424  862:invokespecial   #366 <Method void ArrayList(int)>
	//  425  865:putfield        #827 <Field ArrayList mBackStack>
			for(int j1 = 0; j1 < fragmentmanagerstate.mBackStack.length; j1++)
	//* 426  868:iconst_0        
	//* 427  869:istore_3        
	//* 428  870:iload_3         
	//* 429  871:aload           7
	//* 430  873:getfield        #1770 <Field BackStackState[] FragmentManagerState.mBackStack>
	//* 431  876:arraylength     
	//* 432  877:icmpge          1028
			{
				parcelable = ((Parcelable) (fragmentmanagerstate.mBackStack[j1].instantiate(this)));
	//  433  880:aload           7
	//  434  882:getfield        #1770 <Field BackStackState[] FragmentManagerState.mBackStack>
	//  435  885:iload_3         
	//  436  886:aaload          
	//  437  887:aload_0         
	//  438  888:invokevirtual   #1775 <Method BackStackRecord BackStackState.instantiate(FragmentManagerImpl)>
	//  439  891:astore_1        
				if(DEBUG)
	//* 440  892:getstatic       #831 <Field boolean DEBUG>
	//* 441  895:ifeq            991
				{
					fragmentmanagernonconfig = ((FragmentManagerNonConfig) (new StringBuilder()));
	//  442  898:new             #334 <Class StringBuilder>
	//  443  901:dup             
	//  444  902:invokespecial   #335 <Method void StringBuilder()>
	//  445  905:astore_2        
					((StringBuilder) (fragmentmanagernonconfig)).append("restoreAllState: back stack #");
	//  446  906:aload_2         
	//  447  907:ldc2            #1777 <String "restoreAllState: back stack #">
	//  448  910:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  449  913:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(j1);
	//  450  914:aload_2         
	//  451  915:iload_3         
	//  452  916:invokevirtual   #885 <Method StringBuilder StringBuilder.append(int)>
	//  453  919:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(" (index ");
	//  454  920:aload_2         
	//  455  921:ldc2            #1779 <String " (index ">
	//  456  924:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  457  927:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(((BackStackRecord) (parcelable)).mIndex);
	//  458  928:aload_2         
	//  459  929:aload_1         
	//  460  930:getfield        #504 <Field int BackStackRecord.mIndex>
	//  461  933:invokevirtual   #885 <Method StringBuilder StringBuilder.append(int)>
	//  462  936:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append("): ");
	//  463  937:aload_2         
	//  464  938:ldc2            #1781 <String "): ">
	//  465  941:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  466  944:pop             
					((StringBuilder) (fragmentmanagernonconfig)).append(((Object) (parcelable)));
	//  467  945:aload_2         
	//  468  946:aload_1         
	//  469  947:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  470  950:pop             
					Log.v("FragmentManager", ((StringBuilder) (fragmentmanagernonconfig)).toString());
	//  471  951:ldc1            #67  <String "FragmentManager">
	//  472  953:aload_2         
	//  473  954:invokevirtual   #345 <Method String StringBuilder.toString()>
	//  474  957:invokestatic    #839 <Method int Log.v(String, String)>
	//  475  960:pop             
					fragmentmanagernonconfig = ((FragmentManagerNonConfig) (new PrintWriter(((java.io.Writer) (new e("FragmentManager"))))));
	//  476  961:new             #804 <Class PrintWriter>
	//  477  964:dup             
	//  478  965:new             #806 <Class e>
	//  479  968:dup             
	//  480  969:ldc1            #67  <String "FragmentManager">
	//  481  971:invokespecial   #807 <Method void e(String)>
	//  482  974:invokespecial   #810 <Method void PrintWriter(java.io.Writer)>
	//  483  977:astore_2        
					((BackStackRecord) (parcelable)).dump("  ", ((PrintWriter) (fragmentmanagernonconfig)), false);
	//  484  978:aload_1         
	//  485  979:ldc2            #812 <String "  ">
	//  486  982:aload_2         
	//  487  983:iconst_0        
	//  488  984:invokevirtual   #1784 <Method void BackStackRecord.dump(String, PrintWriter, boolean)>
					((PrintWriter) (fragmentmanagernonconfig)).close();
	//  489  987:aload_2         
	//  490  988:invokevirtual   #1787 <Method void PrintWriter.close()>
				}
				mBackStack.add(((Object) (parcelable)));
	//  491  991:aload_0         
	//  492  992:getfield        #827 <Field ArrayList mBackStack>
	//  493  995:aload_1         
	//  494  996:invokevirtual   #367 <Method boolean ArrayList.add(Object)>
	//  495  999:pop             
				if(((BackStackRecord) (parcelable)).mIndex >= 0)
	//* 496 1000:aload_1         
	//* 497 1001:getfield        #504 <Field int BackStackRecord.mIndex>
	//* 498 1004:iflt            1016
					setBackStackIndex(((BackStackRecord) (parcelable)).mIndex, ((BackStackRecord) (parcelable)));
	//  499 1007:aload_0         
	//  500 1008:aload_1         
	//  501 1009:getfield        #504 <Field int BackStackRecord.mIndex>
	//  502 1012:aload_1         
	//  503 1013:invokevirtual   #1791 <Method void setBackStackIndex(int, BackStackRecord)>
			}

	//  504 1016:iload_3         
	//  505 1017:iconst_1        
	//  506 1018:iadd            
	//  507 1019:istore_3        
		} else
	//* 508 1020:goto            870
		{
			mBackStack = null;
	//  509 1023:aload_0         
	//  510 1024:aconst_null     
	//  511 1025:putfield        #827 <Field ArrayList mBackStack>
		}
		if(fragmentmanagerstate.mPrimaryNavActiveIndex >= 0)
	//* 512 1028:aload           7
	//* 513 1030:getfield        #1794 <Field int FragmentManagerState.mPrimaryNavActiveIndex>
	//* 514 1033:iflt            1055
			mPrimaryNav = (Fragment)mActive.get(fragmentmanagerstate.mPrimaryNavActiveIndex);
	//  515 1036:aload_0         
	//  516 1037:aload_0         
	//  517 1038:getfield        #307 <Field SparseArray mActive>
	//  518 1041:aload           7
	//  519 1043:getfield        #1794 <Field int FragmentManagerState.mPrimaryNavActiveIndex>
	//  520 1046:invokevirtual   #1269 <Method Object SparseArray.get(int)>
	//  521 1049:checkcast       #204 <Class Fragment>
	//  522 1052:putfield        #688 <Field Fragment mPrimaryNav>
		mNextFragmentIndex = fragmentmanagerstate.mNextFragmentIndex;
	//  523 1055:aload_0         
	//  524 1056:aload           7
	//  525 1058:getfield        #1795 <Field int FragmentManagerState.mNextFragmentIndex>
	//  526 1061:putfield        #155 <Field int mNextFragmentIndex>
		return;
	//  527 1064:return          
	}

	FragmentManagerNonConfig retainNonConfig()
	{
		setRetaining(mSavedNonConfig);
	//    0    0:aload_0         
	//    1    1:getfield        #1595 <Field FragmentManagerNonConfig mSavedNonConfig>
	//    2    4:invokestatic    #772 <Method void setRetaining(FragmentManagerNonConfig)>
		return mSavedNonConfig;
	//    3    7:aload_0         
	//    4    8:getfield        #1595 <Field FragmentManagerNonConfig mSavedNonConfig>
	//    5   11:areturn         
	}

	Parcelable saveAllState()
	{
		forcePostponedTransactions();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1234 <Method void forcePostponedTransactions()>
		endAnimatingAwayFragments();
	//    2    4:aload_0         
	//    3    5:invokespecial   #1801 <Method void endAnimatingAwayFragments()>
		execPendingActions();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #402 <Method boolean execPendingActions()>
	//    6   12:pop             
		mStateSaved = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #323 <Field boolean mStateSaved>
		FragmentManagerState fragmentmanagerstate = null;
	//   10   18:aconst_null     
	//   11   19:astore          7
		mSavedNonConfig = null;
	//   12   21:aload_0         
	//   13   22:aconst_null     
	//   14   23:putfield        #1595 <Field FragmentManagerNonConfig mSavedNonConfig>
		if(mActive != null)
	//*  15   26:aload_0         
	//*  16   27:getfield        #307 <Field SparseArray mActive>
	//*  17   30:ifnull          849
		{
			if(mActive.size() <= 0)
	//*  18   33:aload_0         
	//*  19   34:getfield        #307 <Field SparseArray mActive>
	//*  20   37:invokevirtual   #310 <Method int SparseArray.size()>
	//*  21   40:ifgt            45
				return null;
	//   22   43:aconst_null     
	//   23   44:areturn         
			int k1 = mActive.size();
	//   24   45:aload_0         
	//   25   46:getfield        #307 <Field SparseArray mActive>
	//   26   49:invokevirtual   #310 <Method int SparseArray.size()>
	//   27   52:istore          4
			FragmentState afragmentstate[] = new FragmentState[k1];
	//   28   54:iload           4
	//   29   56:anewarray       FragmentState[]
	//   30   59:astore          8
			boolean flag1 = false;
	//   31   61:iconst_0        
	//   32   62:istore_3        
			int i = 0;
	//   33   63:iconst_0        
	//   34   64:istore_1        
			boolean flag = false;
	//   35   65:iconst_0        
	//   36   66:istore_2        
			for(; i < k1; i++)
	//*  37   67:iload_1         
	//*  38   68:iload           4
	//*  39   70:icmpge          430
			{
				Fragment fragment = (Fragment)mActive.valueAt(i);
	//   40   73:aload_0         
	//   41   74:getfield        #307 <Field SparseArray mActive>
	//   42   77:iload_1         
	//   43   78:invokevirtual   #313 <Method Object SparseArray.valueAt(int)>
	//   44   81:checkcast       #204 <Class Fragment>
	//   45   84:astore          5
				if(fragment == null)
					continue;
	//   46   86:aload           5
	//   47   88:ifnull          423
				if(fragment.mIndex < 0)
	//*  48   91:aload           5
	//*  49   93:getfield        #1349 <Field int Fragment.mIndex>
	//*  50   96:ifge            161
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   51   99:new             #334 <Class StringBuilder>
	//   52  102:dup             
	//   53  103:invokespecial   #335 <Method void StringBuilder()>
	//   54  106:astore          6
					stringbuilder.append("Failure saving state: active ");
	//   55  108:aload           6
	//   56  110:ldc2            #1803 <String "Failure saving state: active ">
	//   57  113:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   58  116:pop             
					stringbuilder.append(((Object) (fragment)));
	//   59  117:aload           6
	//   60  119:aload           5
	//   61  121:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   62  124:pop             
					stringbuilder.append(" has cleared index: ");
	//   63  125:aload           6
	//   64  127:ldc2            #1805 <String " has cleared index: ">
	//   65  130:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   66  133:pop             
					stringbuilder.append(fragment.mIndex);
	//   67  134:aload           6
	//   68  136:aload           5
	//   69  138:getfield        #1349 <Field int Fragment.mIndex>
	//   70  141:invokevirtual   #885 <Method StringBuilder StringBuilder.append(int)>
	//   71  144:pop             
					throwException(((RuntimeException) (new IllegalStateException(stringbuilder.toString()))));
	//   72  145:aload_0         
	//   73  146:new             #325 <Class IllegalStateException>
	//   74  149:dup             
	//   75  150:aload           6
	//   76  152:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   77  155:invokespecial   #330 <Method void IllegalStateException(String)>
	//   78  158:invokespecial   #1275 <Method void throwException(RuntimeException)>
				}
				FragmentState fragmentstate = new FragmentState(fragment);
	//   79  161:new             #1739 <Class FragmentState>
	//   80  164:dup             
	//   81  165:aload           5
	//   82  167:invokespecial   #1807 <Method void FragmentState(Fragment)>
	//   83  170:astore          6
				afragmentstate[i] = fragmentstate;
	//   84  172:aload           8
	//   85  174:iload_1         
	//   86  175:aload           6
	//   87  177:aastore         
				if(fragment.mState > 0 && fragmentstate.mSavedFragmentState == null)
	//*  88  178:aload           5
	//*  89  180:getfield        #207 <Field int Fragment.mState>
	//*  90  183:ifle            348
	//*  91  186:aload           6
	//*  92  188:getfield        #1746 <Field Bundle FragmentState.mSavedFragmentState>
	//*  93  191:ifnonnull       348
				{
					fragmentstate.mSavedFragmentState = saveFragmentBasicState(fragment);
	//   94  194:aload           6
	//   95  196:aload_0         
	//   96  197:aload           5
	//   97  199:invokevirtual   #1811 <Method Bundle saveFragmentBasicState(Fragment)>
	//   98  202:putfield        #1746 <Field Bundle FragmentState.mSavedFragmentState>
					if(fragment.mTarget != null)
	//*  99  205:aload           5
	//* 100  207:getfield        #1425 <Field Fragment Fragment.mTarget>
	//* 101  210:ifnull          358
					{
						if(fragment.mTarget.mIndex < 0)
	//* 102  213:aload           5
	//* 103  215:getfield        #1425 <Field Fragment Fragment.mTarget>
	//* 104  218:getfield        #1349 <Field int Fragment.mIndex>
	//* 105  221:ifge            286
						{
							StringBuilder stringbuilder1 = new StringBuilder();
	//  106  224:new             #334 <Class StringBuilder>
	//  107  227:dup             
	//  108  228:invokespecial   #335 <Method void StringBuilder()>
	//  109  231:astore          9
							stringbuilder1.append("Failure saving state: ");
	//  110  233:aload           9
	//  111  235:ldc2            #1813 <String "Failure saving state: ">
	//  112  238:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  113  241:pop             
							stringbuilder1.append(((Object) (fragment)));
	//  114  242:aload           9
	//  115  244:aload           5
	//  116  246:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  117  249:pop             
							stringbuilder1.append(" has target not in fragment manager: ");
	//  118  250:aload           9
	//  119  252:ldc2            #1815 <String " has target not in fragment manager: ">
	//  120  255:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  121  258:pop             
							stringbuilder1.append(((Object) (fragment.mTarget)));
	//  122  259:aload           9
	//  123  261:aload           5
	//  124  263:getfield        #1425 <Field Fragment Fragment.mTarget>
	//  125  266:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  126  269:pop             
							throwException(((RuntimeException) (new IllegalStateException(stringbuilder1.toString()))));
	//  127  270:aload_0         
	//  128  271:new             #325 <Class IllegalStateException>
	//  129  274:dup             
	//  130  275:aload           9
	//  131  277:invokevirtual   #345 <Method String StringBuilder.toString()>
	//  132  280:invokespecial   #330 <Method void IllegalStateException(String)>
	//  133  283:invokespecial   #1275 <Method void throwException(RuntimeException)>
						}
						if(fragmentstate.mSavedFragmentState == null)
	//* 134  286:aload           6
	//* 135  288:getfield        #1746 <Field Bundle FragmentState.mSavedFragmentState>
	//* 136  291:ifnonnull       306
							fragmentstate.mSavedFragmentState = new Bundle();
	//  137  294:aload           6
	//  138  296:new             #1264 <Class Bundle>
	//  139  299:dup             
	//  140  300:invokespecial   #1816 <Method void Bundle()>
	//  141  303:putfield        #1746 <Field Bundle FragmentState.mSavedFragmentState>
						putFragment(fragmentstate.mSavedFragmentState, "android:target_state", fragment.mTarget);
	//  142  306:aload_0         
	//  143  307:aload           6
	//  144  309:getfield        #1746 <Field Bundle FragmentState.mSavedFragmentState>
	//  145  312:ldc1            #73  <String "android:target_state">
	//  146  314:aload           5
	//  147  316:getfield        #1425 <Field Fragment Fragment.mTarget>
	//  148  319:invokevirtual   #1818 <Method void putFragment(Bundle, String, Fragment)>
						if(fragment.mTargetRequestCode != 0)
	//* 149  322:aload           5
	//* 150  324:getfield        #1428 <Field int Fragment.mTargetRequestCode>
	//* 151  327:ifeq            358
							fragmentstate.mSavedFragmentState.putInt("android:target_req_state", fragment.mTargetRequestCode);
	//  152  330:aload           6
	//  153  332:getfield        #1746 <Field Bundle FragmentState.mSavedFragmentState>
	//  154  335:ldc1            #70  <String "android:target_req_state">
	//  155  337:aload           5
	//  156  339:getfield        #1428 <Field int Fragment.mTargetRequestCode>
	//  157  342:invokevirtual   #1708 <Method void Bundle.putInt(String, int)>
					}
				} else
	//* 158  345:goto            358
				{
					fragmentstate.mSavedFragmentState = fragment.mSavedFragmentState;
	//  159  348:aload           6
	//  160  350:aload           5
	//  161  352:getfield        #1210 <Field Bundle Fragment.mSavedFragmentState>
	//  162  355:putfield        #1746 <Field Bundle FragmentState.mSavedFragmentState>
				}
				if(DEBUG)
	//* 163  358:getstatic       #831 <Field boolean DEBUG>
	//* 164  361:ifeq            421
				{
					StringBuilder stringbuilder2 = new StringBuilder();
	//  165  364:new             #334 <Class StringBuilder>
	//  166  367:dup             
	//  167  368:invokespecial   #335 <Method void StringBuilder()>
	//  168  371:astore          9
					stringbuilder2.append("Saved state of ");
	//  169  373:aload           9
	//  170  375:ldc2            #1820 <String "Saved state of ">
	//  171  378:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  172  381:pop             
					stringbuilder2.append(((Object) (fragment)));
	//  173  382:aload           9
	//  174  384:aload           5
	//  175  386:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  176  389:pop             
					stringbuilder2.append(": ");
	//  177  390:aload           9
	//  178  392:ldc2            #1147 <String ": ">
	//  179  395:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  180  398:pop             
					stringbuilder2.append(((Object) (fragmentstate.mSavedFragmentState)));
	//  181  399:aload           9
	//  182  401:aload           6
	//  183  403:getfield        #1746 <Field Bundle FragmentState.mSavedFragmentState>
	//  184  406:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  185  409:pop             
					Log.v("FragmentManager", stringbuilder2.toString());
	//  186  410:ldc1            #67  <String "FragmentManager">
	//  187  412:aload           9
	//  188  414:invokevirtual   #345 <Method String StringBuilder.toString()>
	//  189  417:invokestatic    #839 <Method int Log.v(String, String)>
	//  190  420:pop             
				}
				flag = true;
	//  191  421:iconst_1        
	//  192  422:istore_2        
			}

	//  193  423:iload_1         
	//  194  424:iconst_1        
	//  195  425:iadd            
	//  196  426:istore_1        
	//* 197  427:goto            67
			if(!flag)
	//* 198  430:iload_2         
	//* 199  431:ifne            451
			{
				if(DEBUG)
	//* 200  434:getstatic       #831 <Field boolean DEBUG>
	//* 201  437:ifeq            449
					Log.v("FragmentManager", "saveAllState: no fragments!");
	//  202  440:ldc1            #67  <String "FragmentManager">
	//  203  442:ldc2            #1822 <String "saveAllState: no fragments!">
	//  204  445:invokestatic    #839 <Method int Log.v(String, String)>
	//  205  448:pop             
				return null;
	//  206  449:aconst_null     
	//  207  450:areturn         
			}
			int i1 = mAdded.size();
	//  208  451:aload_0         
	//  209  452:getfield        #160 <Field ArrayList mAdded>
	//  210  455:invokevirtual   #198 <Method int ArrayList.size()>
	//  211  458:istore_2        
			int ai[];
			if(i1 > 0)
	//* 212  459:iload_2         
	//* 213  460:ifle            643
			{
				int ai1[] = new int[i1];
	//  214  463:iload_2         
	//  215  464:newarray        int[]
	//  216  466:astore          6
				int k = 0;
	//  217  468:iconst_0        
	//  218  469:istore_1        
				do
				{
					ai = ai1;
	//  219  470:aload           6
	//  220  472:astore          5
					if(k >= i1)
						break;
	//  221  474:iload_1         
	//  222  475:iload_2         
	//  223  476:icmpge          646
					ai1[k] = ((Fragment)mAdded.get(k)).mIndex;
	//  224  479:aload           6
	//  225  481:iload_1         
	//  226  482:aload_0         
	//  227  483:getfield        #160 <Field ArrayList mAdded>
	//  228  486:iload_1         
	//  229  487:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//  230  490:checkcast       #204 <Class Fragment>
	//  231  493:getfield        #1349 <Field int Fragment.mIndex>
	//  232  496:iastore         
					if(ai1[k] < 0)
	//* 233  497:aload           6
	//* 234  499:iload_1         
	//* 235  500:iaload          
	//* 236  501:ifge            571
					{
						ai = ((int []) (new StringBuilder()));
	//  237  504:new             #334 <Class StringBuilder>
	//  238  507:dup             
	//  239  508:invokespecial   #335 <Method void StringBuilder()>
	//  240  511:astore          5
						((StringBuilder) (ai)).append("Failure saving state: active ");
	//  241  513:aload           5
	//  242  515:ldc2            #1803 <String "Failure saving state: active ">
	//  243  518:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  244  521:pop             
						((StringBuilder) (ai)).append(mAdded.get(k));
	//  245  522:aload           5
	//  246  524:aload_0         
	//  247  525:getfield        #160 <Field ArrayList mAdded>
	//  248  528:iload_1         
	//  249  529:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//  250  532:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  251  535:pop             
						((StringBuilder) (ai)).append(" has cleared index: ");
	//  252  536:aload           5
	//  253  538:ldc2            #1805 <String " has cleared index: ">
	//  254  541:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  255  544:pop             
						((StringBuilder) (ai)).append(ai1[k]);
	//  256  545:aload           5
	//  257  547:aload           6
	//  258  549:iload_1         
	//  259  550:iaload          
	//  260  551:invokevirtual   #885 <Method StringBuilder StringBuilder.append(int)>
	//  261  554:pop             
						throwException(((RuntimeException) (new IllegalStateException(((StringBuilder) (ai)).toString()))));
	//  262  555:aload_0         
	//  263  556:new             #325 <Class IllegalStateException>
	//  264  559:dup             
	//  265  560:aload           5
	//  266  562:invokevirtual   #345 <Method String StringBuilder.toString()>
	//  267  565:invokespecial   #330 <Method void IllegalStateException(String)>
	//  268  568:invokespecial   #1275 <Method void throwException(RuntimeException)>
					}
					if(DEBUG)
	//* 269  571:getstatic       #831 <Field boolean DEBUG>
	//* 270  574:ifeq            636
					{
						ai = ((int []) (new StringBuilder()));
	//  271  577:new             #334 <Class StringBuilder>
	//  272  580:dup             
	//  273  581:invokespecial   #335 <Method void StringBuilder()>
	//  274  584:astore          5
						((StringBuilder) (ai)).append("saveAllState: adding fragment #");
	//  275  586:aload           5
	//  276  588:ldc2            #1824 <String "saveAllState: adding fragment #">
	//  277  591:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  278  594:pop             
						((StringBuilder) (ai)).append(k);
	//  279  595:aload           5
	//  280  597:iload_1         
	//  281  598:invokevirtual   #885 <Method StringBuilder StringBuilder.append(int)>
	//  282  601:pop             
						((StringBuilder) (ai)).append(": ");
	//  283  602:aload           5
	//  284  604:ldc2            #1147 <String ": ">
	//  285  607:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  286  610:pop             
						((StringBuilder) (ai)).append(mAdded.get(k));
	//  287  611:aload           5
	//  288  613:aload_0         
	//  289  614:getfield        #160 <Field ArrayList mAdded>
	//  290  617:iload_1         
	//  291  618:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//  292  621:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  293  624:pop             
						Log.v("FragmentManager", ((StringBuilder) (ai)).toString());
	//  294  625:ldc1            #67  <String "FragmentManager">
	//  295  627:aload           5
	//  296  629:invokevirtual   #345 <Method String StringBuilder.toString()>
	//  297  632:invokestatic    #839 <Method int Log.v(String, String)>
	//  298  635:pop             
					}
					k++;
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
	//* 309  651:getfield        #827 <Field ArrayList mBackStack>
	//* 310  654:ifnull          784
			{
				int j1 = mBackStack.size();
	//  311  657:aload_0         
	//  312  658:getfield        #827 <Field ArrayList mBackStack>
	//  313  661:invokevirtual   #198 <Method int ArrayList.size()>
	//  314  664:istore_2        
				abackstackstate = ((BackStackState []) (fragmentmanagerstate));
	//  315  665:aload           7
	//  316  667:astore          6
				if(j1 > 0)
	//* 317  669:iload_2         
	//* 318  670:ifle            784
				{
					BackStackState abackstackstate1[] = new BackStackState[j1];
	//  319  673:iload_2         
	//  320  674:anewarray       BackStackState[]
	//  321  677:astore          7
					int l = ((int) (flag1));
	//  322  679:iload_3         
	//  323  680:istore_1        
					do
					{
						abackstackstate = abackstackstate1;
	//  324  681:aload           7
	//  325  683:astore          6
						if(l >= j1)
							break;
	//  326  685:iload_1         
	//  327  686:iload_2         
	//  328  687:icmpge          784
						abackstackstate1[l] = new BackStackState((BackStackRecord)mBackStack.get(l));
	//  329  690:aload           7
	//  330  692:iload_1         
	//  331  693:new             #1772 <Class BackStackState>
	//  332  696:dup             
	//  333  697:aload_0         
	//  334  698:getfield        #827 <Field ArrayList mBackStack>
	//  335  701:iload_1         
	//  336  702:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//  337  705:checkcast       #357 <Class BackStackRecord>
	//  338  708:invokespecial   #1826 <Method void BackStackState(BackStackRecord)>
	//  339  711:aastore         
						if(DEBUG)
	//* 340  712:getstatic       #831 <Field boolean DEBUG>
	//* 341  715:ifeq            777
						{
							abackstackstate = ((BackStackState []) (new StringBuilder()));
	//  342  718:new             #334 <Class StringBuilder>
	//  343  721:dup             
	//  344  722:invokespecial   #335 <Method void StringBuilder()>
	//  345  725:astore          6
							((StringBuilder) (abackstackstate)).append("saveAllState: adding back stack #");
	//  346  727:aload           6
	//  347  729:ldc2            #1828 <String "saveAllState: adding back stack #">
	//  348  732:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  349  735:pop             
							((StringBuilder) (abackstackstate)).append(l);
	//  350  736:aload           6
	//  351  738:iload_1         
	//  352  739:invokevirtual   #885 <Method StringBuilder StringBuilder.append(int)>
	//  353  742:pop             
							((StringBuilder) (abackstackstate)).append(": ");
	//  354  743:aload           6
	//  355  745:ldc2            #1147 <String ": ">
	//  356  748:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  357  751:pop             
							((StringBuilder) (abackstackstate)).append(mBackStack.get(l));
	//  358  752:aload           6
	//  359  754:aload_0         
	//  360  755:getfield        #827 <Field ArrayList mBackStack>
	//  361  758:iload_1         
	//  362  759:invokevirtual   #202 <Method Object ArrayList.get(int)>
	//  363  762:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  364  765:pop             
							Log.v("FragmentManager", ((StringBuilder) (abackstackstate)).toString());
	//  365  766:ldc1            #67  <String "FragmentManager">
	//  366  768:aload           6
	//  367  770:invokevirtual   #345 <Method String StringBuilder.toString()>
	//  368  773:invokestatic    #839 <Method int Log.v(String, String)>
	//  369  776:pop             
						}
						l++;
	//  370  777:iload_1         
	//  371  778:iconst_1        
	//  372  779:iadd            
	//  373  780:istore_1        
					} while(true);
	//  374  781:goto            681
				}
			}
			abackstackstate1 = ((BackStackState []) (new FragmentManagerState()));
	//  375  784:new             #1732 <Class FragmentManagerState>
	//  376  787:dup             
	//  377  788:invokespecial   #1829 <Method void FragmentManagerState()>
	//  378  791:astore          7
			abackstackstate1.mActive = afragmentstate;
	//  379  793:aload           7
	//  380  795:aload           8
	//  381  797:putfield        #1735 <Field FragmentState[] FragmentManagerState.mActive>
			abackstackstate1.mAdded = ai;
	//  382  800:aload           7
	//  383  802:aload           5
	//  384  804:putfield        #1761 <Field int[] FragmentManagerState.mAdded>
			abackstackstate1.mBackStack = abackstackstate;
	//  385  807:aload           7
	//  386  809:aload           6
	//  387  811:putfield        #1770 <Field BackStackState[] FragmentManagerState.mBackStack>
			if(mPrimaryNav != null)
	//* 388  814:aload_0         
	//* 389  815:getfield        #688 <Field Fragment mPrimaryNav>
	//* 390  818:ifnull          833
				abackstackstate1.mPrimaryNavActiveIndex = mPrimaryNav.mIndex;
	//  391  821:aload           7
	//  392  823:aload_0         
	//  393  824:getfield        #688 <Field Fragment mPrimaryNav>
	//  394  827:getfield        #1349 <Field int Fragment.mIndex>
	//  395  830:putfield        #1794 <Field int FragmentManagerState.mPrimaryNavActiveIndex>
			abackstackstate1.mNextFragmentIndex = mNextFragmentIndex;
	//  396  833:aload           7
	//  397  835:aload_0         
	//  398  836:getfield        #155 <Field int mNextFragmentIndex>
	//  399  839:putfield        #1795 <Field int FragmentManagerState.mNextFragmentIndex>
			saveNonConfig();
	//  400  842:aload_0         
	//  401  843:invokevirtual   #1832 <Method void saveNonConfig()>
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
	//*   1    1:getfield        #169 <Field Bundle mStateBundle>
	//*   2    4:ifnonnull       18
			mStateBundle = new Bundle();
	//    3    7:aload_0         
	//    4    8:new             #1264 <Class Bundle>
	//    5   11:dup             
	//    6   12:invokespecial   #1816 <Method void Bundle()>
	//    7   15:putfield        #169 <Field Bundle mStateBundle>
		fragment.performSaveInstanceState(mStateBundle);
	//    8   18:aload_1         
	//    9   19:aload_0         
	//   10   20:getfield        #169 <Field Bundle mStateBundle>
	//   11   23:invokevirtual   #1835 <Method void Fragment.performSaveInstanceState(Bundle)>
		dispatchOnFragmentSaveInstanceState(fragment, mStateBundle, false);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #169 <Field Bundle mStateBundle>
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #1054 <Method void dispatchOnFragmentSaveInstanceState(Fragment, Bundle, boolean)>
		Bundle bundle1;
		if(!mStateBundle.isEmpty())
	//*  18   36:aload_0         
	//*  19   37:getfield        #169 <Field Bundle mStateBundle>
	//*  20   40:invokevirtual   #1836 <Method boolean Bundle.isEmpty()>
	//*  21   43:ifne            59
		{
			bundle1 = mStateBundle;
	//   22   46:aload_0         
	//   23   47:getfield        #169 <Field Bundle mStateBundle>
	//   24   50:astore_3        
			mStateBundle = null;
	//   25   51:aload_0         
	//   26   52:aconst_null     
	//   27   53:putfield        #169 <Field Bundle mStateBundle>
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
	//   36   70:invokevirtual   #1559 <Method void saveFragmentViewState(Fragment)>
		Bundle bundle = bundle1;
	//   37   73:aload_3         
	//   38   74:astore_2        
		if(fragment.mSavedViewState != null)
	//*  39   75:aload_1         
	//*  40   76:getfield        #1420 <Field SparseArray Fragment.mSavedViewState>
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
	//   48   92:invokespecial   #1816 <Method void Bundle()>
	//   49   95:astore_2        
			bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
	//   50   96:aload_2         
	//   51   97:ldc1            #79  <String "android:view_state">
	//   52   99:aload_1         
	//   53  100:getfield        #1420 <Field SparseArray Fragment.mSavedViewState>
	//   54  103:invokevirtual   #1840 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
		}
		bundle1 = bundle;
	//   55  106:aload_2         
	//   56  107:astore_3        
		if(!fragment.mUserVisibleHint)
	//*  57  108:aload_1         
	//*  58  109:getfield        #1435 <Field boolean Fragment.mUserVisibleHint>
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
	//   66  125:invokespecial   #1816 <Method void Bundle()>
	//   67  128:astore_3        
			bundle1.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
	//   68  129:aload_3         
	//   69  130:ldc1            #76  <String "android:user_visible_hint">
	//   70  132:aload_1         
	//   71  133:getfield        #1435 <Field boolean Fragment.mUserVisibleHint>
	//   72  136:invokevirtual   #1844 <Method void Bundle.putBoolean(String, boolean)>
		}
		return bundle1;
	//   73  139:aload_3         
	//   74  140:areturn         
	}

	public Fragment.SavedState saveFragmentInstanceState(Fragment fragment)
	{
		if(fragment.mIndex < 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1349 <Field int Fragment.mIndex>
	//*   2    4:ifge            52
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #334 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #335 <Method void StringBuilder()>
	//    6   14:astore_3        
			stringbuilder.append("Fragment ");
	//    7   15:aload_3         
	//    8   16:ldc2            #1452 <String "Fragment ">
	//    9   19:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
			stringbuilder.append(((Object) (fragment)));
	//   11   23:aload_3         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   14   28:pop             
			stringbuilder.append(" is not currently in the FragmentManager");
	//   15   29:aload_3         
	//   16   30:ldc2            #1705 <String " is not currently in the FragmentManager">
	//   17   33:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			throwException(((RuntimeException) (new IllegalStateException(stringbuilder.toString()))));
	//   19   37:aload_0         
	//   20   38:new             #325 <Class IllegalStateException>
	//   21   41:dup             
	//   22   42:aload_3         
	//   23   43:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   24   46:invokespecial   #330 <Method void IllegalStateException(String)>
	//   25   49:invokespecial   #1275 <Method void throwException(RuntimeException)>
		}
		int i = fragment.mState;
	//   26   52:aload_1         
	//   27   53:getfield        #207 <Field int Fragment.mState>
	//   28   56:istore_2        
		Object obj = null;
	//   29   57:aconst_null     
	//   30   58:astore          4
		Fragment.SavedState savedstate = ((Fragment.SavedState) (obj));
	//   31   60:aload           4
	//   32   62:astore_3        
		if(i > 0)
	//*  33   63:iload_2         
	//*  34   64:ifle            89
		{
			fragment = ((Fragment) (saveFragmentBasicState(fragment)));
	//   35   67:aload_0         
	//   36   68:aload_1         
	//   37   69:invokevirtual   #1811 <Method Bundle saveFragmentBasicState(Fragment)>
	//   38   72:astore_1        
			savedstate = ((Fragment.SavedState) (obj));
	//   39   73:aload           4
	//   40   75:astore_3        
			if(fragment != null)
	//*  41   76:aload_1         
	//*  42   77:ifnull          89
				savedstate = new Fragment.SavedState(((Bundle) (fragment)));
	//   43   80:new             #1848 <Class Fragment$SavedState>
	//   44   83:dup             
	//   45   84:aload_1         
	//   46   85:invokespecial   #1850 <Method void Fragment$SavedState(Bundle)>
	//   47   88:astore_3        
		}
		return savedstate;
	//   48   89:aload_3         
	//   49   90:areturn         
	}

	void saveFragmentViewState(Fragment fragment)
	{
		if(fragment.mInnerView == null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1221 <Field View Fragment.mInnerView>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(mStateArray == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #171 <Field SparseArray mStateArray>
	//*   6   12:ifnonnull       29
			mStateArray = new SparseArray();
	//    7   15:aload_0         
	//    8   16:new             #309 <Class SparseArray>
	//    9   19:dup             
	//   10   20:invokespecial   #1354 <Method void SparseArray()>
	//   11   23:putfield        #171 <Field SparseArray mStateArray>
		else
	//*  12   26:goto            36
			mStateArray.clear();
	//   13   29:aload_0         
	//   14   30:getfield        #171 <Field SparseArray mStateArray>
	//   15   33:invokevirtual   #1851 <Method void SparseArray.clear()>
		fragment.mInnerView.saveHierarchyState(mStateArray);
	//   16   36:aload_1         
	//   17   37:getfield        #1221 <Field View Fragment.mInnerView>
	//   18   40:aload_0         
	//   19   41:getfield        #171 <Field SparseArray mStateArray>
	//   20   44:invokevirtual   #1855 <Method void View.saveHierarchyState(SparseArray)>
		if(mStateArray.size() > 0)
	//*  21   47:aload_0         
	//*  22   48:getfield        #171 <Field SparseArray mStateArray>
	//*  23   51:invokevirtual   #310 <Method int SparseArray.size()>
	//*  24   54:ifle            70
		{
			fragment.mSavedViewState = mStateArray;
	//   25   57:aload_1         
	//   26   58:aload_0         
	//   27   59:getfield        #171 <Field SparseArray mStateArray>
	//   28   62:putfield        #1420 <Field SparseArray Fragment.mSavedViewState>
			mStateArray = null;
	//   29   65:aload_0         
	//   30   66:aconst_null     
	//   31   67:putfield        #171 <Field SparseArray mStateArray>
		}
	//   32   70:return          
	}

	void saveNonConfig()
	{
		ArrayList arraylist1;
		ArrayList arraylist2;
		if(mActive != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #307 <Field SparseArray mActive>
	//*   2    4:ifnull          298
		{
			Object obj = null;
	//    3    7:aconst_null     
	//    4    8:astore_3        
			ArrayList arraylist = ((ArrayList) (obj));
	//    5    9:aload_3         
	//    6   10:astore          4
			int i = 0;
	//    7   12:iconst_0        
	//    8   13:istore_1        
			do
			{
				arraylist2 = ((ArrayList) (obj));
	//    9   14:aload_3         
	//   10   15:astore          6
				arraylist1 = arraylist;
	//   11   17:aload           4
	//   12   19:astore          5
				if(i >= mActive.size())
					break;
	//   13   21:iload_1         
	//   14   22:aload_0         
	//   15   23:getfield        #307 <Field SparseArray mActive>
	//   16   26:invokevirtual   #310 <Method int SparseArray.size()>
	//   17   29:icmpge          305
				Object obj1 = ((Object) ((Fragment)mActive.valueAt(i)));
	//   18   32:aload_0         
	//   19   33:getfield        #307 <Field SparseArray mActive>
	//   20   36:iload_1         
	//   21   37:invokevirtual   #313 <Method Object SparseArray.valueAt(int)>
	//   22   40:checkcast       #204 <Class Fragment>
	//   23   43:astore          8
				arraylist2 = ((ArrayList) (obj));
	//   24   45:aload_3         
	//   25   46:astore          6
				ArrayList arraylist3 = arraylist;
	//   26   48:aload           4
	//   27   50:astore          7
				if(obj1 != null)
	//*  28   52:aload           8
	//*  29   54:ifnull          284
				{
					arraylist1 = ((ArrayList) (obj));
	//   30   57:aload_3         
	//   31   58:astore          5
					if(((Fragment) (obj1)).mRetainInstance)
	//*  32   60:aload           8
	//*  33   62:getfield        #1858 <Field boolean Fragment.mRetainInstance>
	//*  34   65:ifeq            167
					{
						arraylist2 = ((ArrayList) (obj));
	//   35   68:aload_3         
	//   36   69:astore          6
						if(obj == null)
	//*  37   71:aload_3         
	//*  38   72:ifnonnull       84
							arraylist2 = new ArrayList();
	//   39   75:new             #157 <Class ArrayList>
	//   40   78:dup             
	//   41   79:invokespecial   #158 <Method void ArrayList()>
	//   42   82:astore          6
						arraylist2.add(obj1);
	//   43   84:aload           6
	//   44   86:aload           8
	//   45   88:invokevirtual   #367 <Method boolean ArrayList.add(Object)>
	//   46   91:pop             
						int k;
						if(((Fragment) (obj1)).mTarget != null)
	//*  47   92:aload           8
	//*  48   94:getfield        #1425 <Field Fragment Fragment.mTarget>
	//*  49   97:ifnull          112
							k = ((Fragment) (obj1)).mTarget.mIndex;
	//   50  100:aload           8
	//   51  102:getfield        #1425 <Field Fragment Fragment.mTarget>
	//   52  105:getfield        #1349 <Field int Fragment.mIndex>
	//   53  108:istore_2        
						else
	//*  54  109:goto            114
							k = -1;
	//   55  112:iconst_m1       
	//   56  113:istore_2        
						obj1.mTargetIndex = k;
	//   57  114:aload           8
	//   58  116:iload_2         
	//   59  117:putfield        #1755 <Field int Fragment.mTargetIndex>
						arraylist1 = arraylist2;
	//   60  120:aload           6
	//   61  122:astore          5
						if(DEBUG)
	//*  62  124:getstatic       #831 <Field boolean DEBUG>
	//*  63  127:ifeq            167
						{
							obj = ((Object) (new StringBuilder()));
	//   64  130:new             #334 <Class StringBuilder>
	//   65  133:dup             
	//   66  134:invokespecial   #335 <Method void StringBuilder()>
	//   67  137:astore_3        
							((StringBuilder) (obj)).append("retainNonConfig: keeping retained ");
	//   68  138:aload_3         
	//   69  139:ldc2            #1860 <String "retainNonConfig: keeping retained ">
	//   70  142:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   71  145:pop             
							((StringBuilder) (obj)).append(obj1);
	//   72  146:aload_3         
	//   73  147:aload           8
	//   74  149:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   75  152:pop             
							Log.v("FragmentManager", ((StringBuilder) (obj)).toString());
	//   76  153:ldc1            #67  <String "FragmentManager">
	//   77  155:aload_3         
	//   78  156:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   79  159:invokestatic    #839 <Method int Log.v(String, String)>
	//   80  162:pop             
							arraylist1 = arraylist2;
	//   81  163:aload           6
	//   82  165:astore          5
						}
					}
					if(((Fragment) (obj1)).mChildFragmentManager != null)
	//*  83  167:aload           8
	//*  84  169:getfield        #1443 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
	//*  85  172:ifnull          196
					{
						((Fragment) (obj1)).mChildFragmentManager.saveNonConfig();
	//   86  175:aload           8
	//   87  177:getfield        #1443 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
	//   88  180:invokevirtual   #1832 <Method void saveNonConfig()>
						obj1 = ((Object) (((Fragment) (obj1)).mChildFragmentManager.mSavedNonConfig));
	//   89  183:aload           8
	//   90  185:getfield        #1443 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
	//   91  188:getfield        #1595 <Field FragmentManagerNonConfig mSavedNonConfig>
	//   92  191:astore          8
					} else
	//*  93  193:goto            203
					{
						obj1 = ((Object) (((Fragment) (obj1)).mChildNonConfig));
	//   94  196:aload           8
	//   95  198:getfield        #1863 <Field FragmentManagerNonConfig Fragment.mChildNonConfig>
	//   96  201:astore          8
					}
					obj = ((Object) (arraylist));
	//   97  203:aload           4
	//   98  205:astore_3        
					if(arraylist == null)
	//*  99  206:aload           4
	//* 100  208:ifnonnull       259
					{
						obj = ((Object) (arraylist));
	//  101  211:aload           4
	//  102  213:astore_3        
						if(obj1 != null)
	//* 103  214:aload           8
	//* 104  216:ifnull          259
						{
							arraylist = new ArrayList(mActive.size());
	//  105  219:new             #157 <Class ArrayList>
	//  106  222:dup             
	//  107  223:aload_0         
	//  108  224:getfield        #307 <Field SparseArray mActive>
	//  109  227:invokevirtual   #310 <Method int SparseArray.size()>
	//  110  230:invokespecial   #366 <Method void ArrayList(int)>
	//  111  233:astore          4
							int l = 0;
	//  112  235:iconst_0        
	//  113  236:istore_2        
							do
							{
								obj = ((Object) (arraylist));
	//  114  237:aload           4
	//  115  239:astore_3        
								if(l >= i)
									break;
	//  116  240:iload_2         
	//  117  241:iload_1         
	//  118  242:icmpge          259
								arraylist.add(((Object) (null)));
	//  119  245:aload           4
	//  120  247:aconst_null     
	//  121  248:invokevirtual   #367 <Method boolean ArrayList.add(Object)>
	//  122  251:pop             
								l++;
	//  123  252:iload_2         
	//  124  253:iconst_1        
	//  125  254:iadd            
	//  126  255:istore_2        
							} while(true);
	//  127  256:goto            237
						}
					}
					arraylist2 = arraylist1;
	//  128  259:aload           5
	//  129  261:astore          6
					arraylist3 = ((ArrayList) (obj));
	//  130  263:aload_3         
	//  131  264:astore          7
					if(obj != null)
	//* 132  266:aload_3         
	//* 133  267:ifnull          284
					{
						((ArrayList) (obj)).add(obj1);
	//  134  270:aload_3         
	//  135  271:aload           8
	//  136  273:invokevirtual   #367 <Method boolean ArrayList.add(Object)>
	//  137  276:pop             
						arraylist3 = ((ArrayList) (obj));
	//  138  277:aload_3         
	//  139  278:astore          7
						arraylist2 = arraylist1;
	//  140  280:aload           5
	//  141  282:astore          6
					}
				}
				i++;
	//  142  284:iload_1         
	//  143  285:iconst_1        
	//  144  286:iadd            
	//  145  287:istore_1        
				obj = ((Object) (arraylist2));
	//  146  288:aload           6
	//  147  290:astore_3        
				arraylist = arraylist3;
	//  148  291:aload           7
	//  149  293:astore          4
			} while(true);
	//  150  295:goto            14
		} else
		{
			arraylist2 = null;
	//  151  298:aconst_null     
	//  152  299:astore          6
			arraylist1 = arraylist2;
	//  153  301:aload           6
	//  154  303:astore          5
		}
		if(arraylist2 == null && arraylist1 == null)
	//* 155  305:aload           6
	//* 156  307:ifnonnull       321
	//* 157  310:aload           5
	//* 158  312:ifnonnull       321
		{
			mSavedNonConfig = null;
	//  159  315:aload_0         
	//  160  316:aconst_null     
	//  161  317:putfield        #1595 <Field FragmentManagerNonConfig mSavedNonConfig>
			return;
	//  162  320:return          
		} else
		{
			mSavedNonConfig = new FragmentManagerNonConfig(((List) (arraylist2)), ((List) (arraylist1)));
	//  163  321:aload_0         
	//  164  322:new             #748 <Class FragmentManagerNonConfig>
	//  165  325:dup             
	//  166  326:aload           6
	//  167  328:aload           5
	//  168  330:invokespecial   #1866 <Method void FragmentManagerNonConfig(List, List)>
	//  169  333:putfield        #1595 <Field FragmentManagerNonConfig mSavedNonConfig>
			return;
	//  170  336:return          
		}
	}

	public void setBackStackIndex(int i, BackStackRecord backstackrecord)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int l;
		if(mBackStackIndices == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #889 <Field ArrayList mBackStackIndices>
	//*   4    6:ifnonnull       20
			mBackStackIndices = new ArrayList();
	//    5    9:aload_0         
	//    6   10:new             #157 <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #158 <Method void ArrayList()>
	//    9   17:putfield        #889 <Field ArrayList mBackStackIndices>
		l = mBackStackIndices.size();
	//   10   20:aload_0         
	//   11   21:getfield        #889 <Field ArrayList mBackStackIndices>
	//   12   24:invokevirtual   #198 <Method int ArrayList.size()>
	//   13   27:istore          4
		int k;
		k = l;
	//   14   29:iload           4
	//   15   31:istore_3        
		if(i >= l)
			break MISSING_BLOCK_LABEL_109;
	//   16   32:iload_1         
	//   17   33:iload           4
	//   18   35:icmpge          109
		if(DEBUG)
	//*  19   38:getstatic       #831 <Field boolean DEBUG>
	//*  20   41:ifeq            96
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   21   44:new             #334 <Class StringBuilder>
	//   22   47:dup             
	//   23   48:invokespecial   #335 <Method void StringBuilder()>
	//   24   51:astore          5
			stringbuilder.append("Setting back stack index ");
	//   25   53:aload           5
	//   26   55:ldc2            #895 <String "Setting back stack index ">
	//   27   58:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   28   61:pop             
			stringbuilder.append(i);
	//   29   62:aload           5
	//   30   64:iload_1         
	//   31   65:invokevirtual   #885 <Method StringBuilder StringBuilder.append(int)>
	//   32   68:pop             
			stringbuilder.append(" to ");
	//   33   69:aload           5
	//   34   71:ldc2            #897 <String " to ">
	//   35   74:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   36   77:pop             
			stringbuilder.append(((Object) (backstackrecord)));
	//   37   78:aload           5
	//   38   80:aload_2         
	//   39   81:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   40   84:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   41   85:ldc1            #67  <String "FragmentManager">
	//   42   87:aload           5
	//   43   89:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   44   92:invokestatic    #839 <Method int Log.v(String, String)>
	//   45   95:pop             
		}
		mBackStackIndices.set(i, ((Object) (backstackrecord)));
	//   46   96:aload_0         
	//   47   97:getfield        #889 <Field ArrayList mBackStackIndices>
	//   48  100:iload_1         
	//   49  101:aload_2         
	//   50  102:invokevirtual   #893 <Method Object ArrayList.set(int, Object)>
	//   51  105:pop             
		break MISSING_BLOCK_LABEL_269;
	//   52  106:goto            269
_L2:
		if(k >= i)
			break; /* Loop/switch isn't completed */
	//   53  109:iload_3         
	//   54  110:iload_1         
	//   55  111:icmpge          202
		mBackStackIndices.add(((Object) (null)));
	//   56  114:aload_0         
	//   57  115:getfield        #889 <Field ArrayList mBackStackIndices>
	//   58  118:aconst_null     
	//   59  119:invokevirtual   #367 <Method boolean ArrayList.add(Object)>
	//   60  122:pop             
		if(mAvailBackStackIndices == null)
	//*  61  123:aload_0         
	//*  62  124:getfield        #875 <Field ArrayList mAvailBackStackIndices>
	//*  63  127:ifnonnull       141
			mAvailBackStackIndices = new ArrayList();
	//   64  130:aload_0         
	//   65  131:new             #157 <Class ArrayList>
	//   66  134:dup             
	//   67  135:invokespecial   #158 <Method void ArrayList()>
	//   68  138:putfield        #875 <Field ArrayList mAvailBackStackIndices>
		if(DEBUG)
	//*  69  141:getstatic       #831 <Field boolean DEBUG>
	//*  70  144:ifeq            183
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   71  147:new             #334 <Class StringBuilder>
	//   72  150:dup             
	//   73  151:invokespecial   #335 <Method void StringBuilder()>
	//   74  154:astore          5
			stringbuilder1.append("Adding available back stack index ");
	//   75  156:aload           5
	//   76  158:ldc2            #1868 <String "Adding available back stack index ">
	//   77  161:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   78  164:pop             
			stringbuilder1.append(k);
	//   79  165:aload           5
	//   80  167:iload_3         
	//   81  168:invokevirtual   #885 <Method StringBuilder StringBuilder.append(int)>
	//   82  171:pop             
			Log.v("FragmentManager", stringbuilder1.toString());
	//   83  172:ldc1            #67  <String "FragmentManager">
	//   84  174:aload           5
	//   85  176:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   86  179:invokestatic    #839 <Method int Log.v(String, String)>
	//   87  182:pop             
		}
		mAvailBackStackIndices.add(((Object) (Integer.valueOf(k))));
	//   88  183:aload_0         
	//   89  184:getfield        #875 <Field ArrayList mAvailBackStackIndices>
	//   90  187:iload_3         
	//   91  188:invokestatic    #1252 <Method Integer Integer.valueOf(int)>
	//   92  191:invokevirtual   #367 <Method boolean ArrayList.add(Object)>
	//   93  194:pop             
		k++;
	//   94  195:iload_3         
	//   95  196:iconst_1        
	//   96  197:iadd            
	//   97  198:istore_3        
		if(true) goto _L2; else goto _L1
	//   98  199:goto            109
_L1:
		if(DEBUG)
	//*  99  202:getstatic       #831 <Field boolean DEBUG>
	//* 100  205:ifeq            260
		{
			StringBuilder stringbuilder2 = new StringBuilder();
	//  101  208:new             #334 <Class StringBuilder>
	//  102  211:dup             
	//  103  212:invokespecial   #335 <Method void StringBuilder()>
	//  104  215:astore          5
			stringbuilder2.append("Adding back stack index ");
	//  105  217:aload           5
	//  106  219:ldc2            #882 <String "Adding back stack index ">
	//  107  222:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  108  225:pop             
			stringbuilder2.append(i);
	//  109  226:aload           5
	//  110  228:iload_1         
	//  111  229:invokevirtual   #885 <Method StringBuilder StringBuilder.append(int)>
	//  112  232:pop             
			stringbuilder2.append(" with ");
	//  113  233:aload           5
	//  114  235:ldc2            #887 <String " with ">
	//  115  238:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//  116  241:pop             
			stringbuilder2.append(((Object) (backstackrecord)));
	//  117  242:aload           5
	//  118  244:aload_2         
	//  119  245:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  120  248:pop             
			Log.v("FragmentManager", stringbuilder2.toString());
	//  121  249:ldc1            #67  <String "FragmentManager">
	//  122  251:aload           5
	//  123  253:invokevirtual   #345 <Method String StringBuilder.toString()>
	//  124  256:invokestatic    #839 <Method int Log.v(String, String)>
	//  125  259:pop             
		}
		mBackStackIndices.add(((Object) (backstackrecord)));
	//  126  260:aload_0         
	//  127  261:getfield        #889 <Field ArrayList mBackStackIndices>
	//  128  264:aload_2         
	//  129  265:invokevirtual   #367 <Method boolean ArrayList.add(Object)>
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
	//*   3    5:getfield        #307 <Field SparseArray mActive>
	//*   4    8:aload_1         
	//*   5    9:getfield        #1349 <Field int Fragment.mIndex>
	//*   6   12:invokevirtual   #1269 <Method Object SparseArray.get(int)>
	//*   7   15:aload_1         
	//*   8   16:if_acmpne       34
	//*   9   19:aload_1         
	//*  10   20:getfield        #1436 <Field FragmentHostCallback Fragment.mHost>
	//*  11   23:ifnull          82
	//*  12   26:aload_1         
	//*  13   27:invokevirtual   #983 <Method FragmentManager Fragment.getFragmentManager()>
	//*  14   30:aload_0         
	//*  15   31:if_acmpeq       82
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   16   34:new             #334 <Class StringBuilder>
	//   17   37:dup             
	//   18   38:invokespecial   #335 <Method void StringBuilder()>
	//   19   41:astore_2        
			stringbuilder.append("Fragment ");
	//   20   42:aload_2         
	//   21   43:ldc2            #1452 <String "Fragment ">
	//   22   46:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   23   49:pop             
			stringbuilder.append(((Object) (fragment)));
	//   24   50:aload_2         
	//   25   51:aload_1         
	//   26   52:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   27   55:pop             
			stringbuilder.append(" is not an active fragment of FragmentManager ");
	//   28   56:aload_2         
	//   29   57:ldc2            #1871 <String " is not an active fragment of FragmentManager ">
	//   30   60:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   31   63:pop             
			stringbuilder.append(((Object) (this)));
	//   32   64:aload_2         
	//   33   65:aload_0         
	//   34   66:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   35   69:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   36   70:new             #1492 <Class IllegalArgumentException>
	//   37   73:dup             
	//   38   74:aload_2         
	//   39   75:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   40   78:invokespecial   #1493 <Method void IllegalArgumentException(String)>
	//   41   81:athrow          
		} else
		{
			mPrimaryNav = fragment;
	//   42   82:aload_0         
	//   43   83:aload_1         
	//   44   84:putfield        #688 <Field Fragment mPrimaryNav>
			return;
	//   45   87:return          
		}
	}

	public void showFragment(Fragment fragment)
	{
		if(DEBUG)
	//*   0    0:getstatic       #831 <Field boolean DEBUG>
	//*   1    3:ifeq            38
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #334 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #335 <Method void StringBuilder()>
	//    5   13:astore_2        
			stringbuilder.append("show: ");
	//    6   14:aload_2         
	//    7   15:ldc2            #1874 <String "show: ">
	//    8   18:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (fragment)));
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			Log.v("FragmentManager", stringbuilder.toString());
	//   14   28:ldc1            #67  <String "FragmentManager">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #839 <Method int Log.v(String, String)>
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
	//   27   52:getfield        #857 <Field boolean Fragment.mHiddenChanged>
	//   28   55:iconst_1        
	//   29   56:ixor            
	//   30   57:putfield        #857 <Field boolean Fragment.mHiddenChanged>
		}
	//   31   60:return          
	}

	void startPendingDeferredFragments()
	{
		if(mActive == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #307 <Field SparseArray mActive>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		for(int i = 0; i < mActive.size(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:getfield        #307 <Field SparseArray mActive>
	//*   9   15:invokevirtual   #310 <Method int SparseArray.size()>
	//*  10   18:icmpge          49
		{
			Fragment fragment = (Fragment)mActive.valueAt(i);
	//   11   21:aload_0         
	//   12   22:getfield        #307 <Field SparseArray mActive>
	//   13   25:iload_1         
	//   14   26:invokevirtual   #313 <Method Object SparseArray.valueAt(int)>
	//   15   29:checkcast       #204 <Class Fragment>
	//   16   32:astore_2        
			if(fragment != null)
	//*  17   33:aload_2         
	//*  18   34:ifnull          42
				performPendingDeferredStart(fragment);
	//   19   37:aload_0         
	//   20   38:aload_2         
	//   21   39:invokevirtual   #1876 <Method void performPendingDeferredStart(Fragment)>
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
	//    3    7:invokespecial   #1877 <Method void StringBuilder(int)>
	//    4   10:astore_2        
		stringbuilder.append("FragmentManager{");
	//    5   11:aload_2         
	//    6   12:ldc2            #1879 <String "FragmentManager{">
	//    7   15:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//    9   19:aload_2         
	//   10   20:aload_0         
	//   11   21:invokestatic    #1132 <Method int System.identityHashCode(Object)>
	//   12   24:invokestatic    #1136 <Method String Integer.toHexString(int)>
	//   13   27:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
		stringbuilder.append(" in ");
	//   15   31:aload_2         
	//   16   32:ldc2            #1881 <String " in ">
	//   17   35:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
		Object obj;
		if(mParent != null)
	//*  19   39:aload_0         
	//*  20   40:getfield        #905 <Field Fragment mParent>
	//*  21   43:ifnull          59
			obj = ((Object) (mParent));
	//   22   46:aload_0         
	//   23   47:getfield        #905 <Field Fragment mParent>
	//   24   50:astore_1        
		else
	//*  25   51:aload_1         
	//*  26   52:aload_2         
	//*  27   53:invokestatic    #1886 <Method void d.a(Object, StringBuilder)>
	//*  28   56:goto            67
			obj = ((Object) (mHost));
	//   29   59:aload_0         
	//   30   60:getfield        #438 <Field FragmentHostCallback mHost>
	//   31   63:astore_1        
		d.a(obj, stringbuilder);
	//*  32   64:goto            51
		stringbuilder.append("}}");
	//   33   67:aload_2         
	//   34   68:ldc2            #1888 <String "}}">
	//   35   71:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   36   74:pop             
		return stringbuilder.toString();
	//   37   75:aload_2         
	//   38   76:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   39   79:areturn         
	}

	public void unregisterFragmentLifecycleCallbacks(FragmentManager.FragmentLifecycleCallbacks fragmentlifecyclecallbacks)
	{
		CopyOnWriteArrayList copyonwritearraylist = mLifecycleCallbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//    2    4:astore          4
		copyonwritearraylist;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		int i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		int k = mLifecycleCallbacks.size();
	//    7   11:aload_0         
	//    8   12:getfield        #165 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//    9   15:invokevirtual   #1891 <Method int CopyOnWriteArrayList.size()>
	//   10   18:istore_3        
_L2:
		if(i >= k)
			break MISSING_BLOCK_LABEL_54;
	//   11   19:iload_2         
	//   12   20:iload_3         
	//   13   21:icmpge          54
		if(((j)mLifecycleCallbacks.get(i)).a != fragmentlifecyclecallbacks)
			break MISSING_BLOCK_LABEL_64;
	//   14   24:aload_0         
	//   15   25:getfield        #165 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   16   28:iload_2         
	//   17   29:invokevirtual   #1892 <Method Object CopyOnWriteArrayList.get(int)>
	//   18   32:checkcast       #988 <Class j>
	//   19   35:getfield        #994 <Field Object j.a>
	//   20   38:aload_1         
	//   21   39:if_acmpne       64
		mLifecycleCallbacks.remove(i);
	//   22   42:aload_0         
	//   23   43:getfield        #165 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   24   46:iload_2         
	//   25   47:invokevirtual   #1893 <Method Object CopyOnWriteArrayList.remove(int)>
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
	ArrayList mTmpAddedFragments;
	ArrayList mTmpIsPop;
	ArrayList mTmpRecords;

	static 
	{
	//    0    0:new             #133 <Class DecelerateInterpolator>
	//    1    3:dup             
	//    2    4:ldc1            #134 <Float 2.5F>
	//    3    6:invokespecial   #138 <Method void DecelerateInterpolator(float)>
	//    4    9:putstatic       #140 <Field Interpolator DECELERATE_QUINT>
	//    5   12:new             #133 <Class DecelerateInterpolator>
	//    6   15:dup             
	//    7   16:ldc1            #141 <Float 1.5F>
	//    8   18:invokespecial   #138 <Method void DecelerateInterpolator(float)>
	//    9   21:putstatic       #143 <Field Interpolator DECELERATE_CUBIC>
	//   10   24:new             #145 <Class AccelerateInterpolator>
	//   11   27:dup             
	//   12   28:ldc1            #134 <Float 2.5F>
	//   13   30:invokespecial   #146 <Method void AccelerateInterpolator(float)>
	//   14   33:putstatic       #148 <Field Interpolator ACCELERATE_QUINT>
	//   15   36:new             #145 <Class AccelerateInterpolator>
	//   16   39:dup             
	//   17   40:ldc1            #141 <Float 1.5F>
	//   18   42:invokespecial   #146 <Method void AccelerateInterpolator(float)>
	//   19   45:putstatic       #150 <Field Interpolator ACCELERATE_CUBIC>
	//*  20   48:return          
	}


/*
	static void access$500(FragmentManagerImpl fragmentmanagerimpl)
	{
		fragmentmanagerimpl.scheduleCommit();
	//    0    0:aload_0         
	//    1    1:invokespecial   #180 <Method void scheduleCommit()>
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
	//    5    6:invokespecial   #186 <Method void completeExecute(BackStackRecord, boolean, boolean, boolean)>
		return;
	//    6    9:return          
	}

*/
}
