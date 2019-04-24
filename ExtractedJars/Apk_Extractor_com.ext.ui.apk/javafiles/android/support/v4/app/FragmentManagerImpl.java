// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.animation.*;
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
			if(ViewCompat.isAttachedToWindow(mView) || android.os.Build.VERSION.SDK_INT >= 24)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field View mView>
		//*   2    4:invokestatic    #28  <Method boolean ViewCompat.isAttachedToWindow(View)>
		//*   3    7:ifne            18
		//*   4   10:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
		//*   5   13:bipush          24
		//*   6   15:icmplt          40
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
		//    7   18:aload_0         
		//    8   19:getfield        #18  <Field View mView>
		//    9   22:new             #9   <Class FragmentManagerImpl$AnimateOnHWLayerIfNeededListener$1>
		//   10   25:dup             
		//   11   26:aload_0         
		//   12   27:invokespecial   #37  <Method void FragmentManagerImpl$AnimateOnHWLayerIfNeededListener$1(FragmentManagerImpl$AnimateOnHWLayerIfNeededListener)>
		//   13   30:invokevirtual   #43  <Method boolean View.post(Runnable)>
		//   14   33:pop             
			else
		//*  15   34:aload_0         
		//*  16   35:aload_1         
		//*  17   36:invokespecial   #45  <Method void FragmentManagerImpl$AnimationListenerWrapper.onAnimationEnd(Animation)>
		//*  18   39:return          
				mView.setLayerType(0, ((android.graphics.Paint) (null)));
		//   19   40:aload_0         
		//   20   41:getfield        #18  <Field View mView>
		//   21   44:iconst_0        
		//   22   45:aconst_null     
		//   23   46:invokevirtual   #49  <Method void View.setLayerType(int, android.graphics.Paint)>
			super.onAnimationEnd(animation);
		//*  24   49:goto            34
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
			boolean flag1 = false;
		//    0    0:iconst_0        
		//    1    1:istore          4
			boolean flag;
			int j;
			FragmentManagerImpl fragmentmanagerimpl;
			if(mNumPostponed > 0)
		//*   2    3:aload_0         
		//*   3    4:getfield        #43  <Field int mNumPostponed>
		//*   4    7:ifle            81
				flag = true;
		//    5   10:iconst_1        
		//    6   11:istore_1        
			else
		//*   7   12:aload_0         
		//*   8   13:getfield        #24  <Field BackStackRecord mRecord>
		//*   9   16:getfield        #36  <Field FragmentManagerImpl BackStackRecord.mManager>
		//*  10   19:astore          6
		//*  11   21:aload           6
		//*  12   23:getfield        #47  <Field ArrayList FragmentManagerImpl.mAdded>
		//*  13   26:invokevirtual   #53  <Method int ArrayList.size()>
		//*  14   29:istore_3        
		//*  15   30:iconst_0        
		//*  16   31:istore_2        
		//*  17   32:iload_2         
		//*  18   33:iload_3         
		//*  19   34:icmpge          86
		//*  20   37:aload           6
		//*  21   39:getfield        #47  <Field ArrayList FragmentManagerImpl.mAdded>
		//*  22   42:iload_2         
		//*  23   43:invokevirtual   #57  <Method Object ArrayList.get(int)>
		//*  24   46:checkcast       #59  <Class Fragment>
		//*  25   49:astore          7
		//*  26   51:aload           7
		//*  27   53:aconst_null     
		//*  28   54:invokevirtual   #63  <Method void Fragment.setOnStartEnterTransitionListener(Fragment$OnStartEnterTransitionListener)>
		//*  29   57:iload_1         
		//*  30   58:ifeq            74
		//*  31   61:aload           7
		//*  32   63:invokevirtual   #67  <Method boolean Fragment.isPostponed()>
		//*  33   66:ifeq            74
		//*  34   69:aload           7
		//*  35   71:invokevirtual   #70  <Method void Fragment.startPostponedEnterTransition()>
		//*  36   74:iload_2         
		//*  37   75:iconst_1        
		//*  38   76:iadd            
		//*  39   77:istore_2        
		//*  40   78:goto            32
				flag = false;
		//   41   81:iconst_0        
		//   42   82:istore_1        
			fragmentmanagerimpl = mRecord.mManager;
			j = fragmentmanagerimpl.mAdded.size();
			for(int i = 0; i < j; i++)
			{
				Fragment fragment = (Fragment)fragmentmanagerimpl.mAdded.get(i);
				fragment.setOnStartEnterTransitionListener(((Fragment.OnStartEnterTransitionListener) (null)));
				if(flag && fragment.isPostponed())
					fragment.startPostponedEnterTransition();
			}

		//*  43   83:goto            12
			fragmentmanagerimpl = mRecord.mManager;
		//   44   86:aload_0         
		//   45   87:getfield        #24  <Field BackStackRecord mRecord>
		//   46   90:getfield        #36  <Field FragmentManagerImpl BackStackRecord.mManager>
		//   47   93:astore          6
			BackStackRecord backstackrecord = mRecord;
		//   48   95:aload_0         
		//   49   96:getfield        #24  <Field BackStackRecord mRecord>
		//   50   99:astore          7
			boolean flag2 = mIsBack;
		//   51  101:aload_0         
		//   52  102:getfield        #22  <Field boolean mIsBack>
		//   53  105:istore          5
			if(!flag)
		//*  54  107:iload_1         
		//*  55  108:ifne            114
				flag1 = true;
		//   56  111:iconst_1        
		//   57  112:istore          4
			fragmentmanagerimpl.completeExecute(backstackrecord, flag2, flag1, true);
		//   58  114:aload           6
		//   59  116:aload           7
		//   60  118:iload           5
		//   61  120:iload           4
		//   62  122:iconst_1        
		//   63  123:invokestatic    #40  <Method void FragmentManagerImpl.access$600(FragmentManagerImpl, BackStackRecord, boolean, boolean, boolean)>
		//   64  126:return          
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
	//    1    1:invokespecial   #157 <Method void FragmentManager()>
		mNextFragmentIndex = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #159 <Field int mNextFragmentIndex>
	//    5    9:aload_0         
	//    6   10:new             #161 <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #162 <Method void ArrayList()>
	//    9   17:putfield        #164 <Field ArrayList mAdded>
	//   10   20:aload_0         
	//   11   21:new             #166 <Class CopyOnWriteArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #167 <Method void CopyOnWriteArrayList()>
	//   14   28:putfield        #169 <Field CopyOnWriteArrayList mLifecycleCallbacks>
		mCurState = 0;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #171 <Field int mCurState>
		mStateBundle = null;
	//   18   36:aload_0         
	//   19   37:aconst_null     
	//   20   38:putfield        #173 <Field Bundle mStateBundle>
		mStateArray = null;
	//   21   41:aload_0         
	//   22   42:aconst_null     
	//   23   43:putfield        #175 <Field SparseArray mStateArray>
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
	//   28   52:invokespecial   #178 <Method void FragmentManagerImpl$1(FragmentManagerImpl)>
	//   29   55:putfield        #180 <Field Runnable mExecCommit>
	//   30   58:return          
	}

	private void addAddedFragments(ArraySet arrayset)
	{
		if(mCurState >= 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #171 <Field int mCurState>
	//*   2    4:iconst_1        
	//*   3    5:icmpge          9
	//*   4    8:return          
		{
			int j = Math.min(mCurState, 4);
	//    5    9:aload_0         
	//    6   10:getfield        #171 <Field int mCurState>
	//    7   13:iconst_4        
	//    8   14:invokestatic    #198 <Method int Math.min(int, int)>
	//    9   17:istore_3        
			int k = mAdded.size();
	//   10   18:aload_0         
	//   11   19:getfield        #164 <Field ArrayList mAdded>
	//   12   22:invokevirtual   #202 <Method int ArrayList.size()>
	//   13   25:istore          4
			int i = 0;
	//   14   27:iconst_0        
	//   15   28:istore_2        
			while(i < k) 
	//*  16   29:iload_2         
	//*  17   30:iload           4
	//*  18   32:icmpge          8
			{
				Fragment fragment = (Fragment)mAdded.get(i);
	//   19   35:aload_0         
	//   20   36:getfield        #164 <Field ArrayList mAdded>
	//   21   39:iload_2         
	//   22   40:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   23   43:checkcast       #208 <Class Fragment>
	//   24   46:astore          5
				if(fragment.mState < j)
	//*  25   48:aload           5
	//*  26   50:getfield        #211 <Field int Fragment.mState>
	//*  27   53:iload_3         
	//*  28   54:icmpge          106
				{
					moveToState(fragment, j, fragment.getNextAnim(), fragment.getNextTransition(), false);
	//   29   57:aload_0         
	//   30   58:aload           5
	//   31   60:iload_3         
	//   32   61:aload           5
	//   33   63:invokevirtual   #214 <Method int Fragment.getNextAnim()>
	//   34   66:aload           5
	//   35   68:invokevirtual   #217 <Method int Fragment.getNextTransition()>
	//   36   71:iconst_0        
	//   37   72:invokevirtual   #221 <Method void moveToState(Fragment, int, int, int, boolean)>
					if(fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded)
	//*  38   75:aload           5
	//*  39   77:getfield        #225 <Field View Fragment.mView>
	//*  40   80:ifnull          106
	//*  41   83:aload           5
	//*  42   85:getfield        #228 <Field boolean Fragment.mHidden>
	//*  43   88:ifne            106
	//*  44   91:aload           5
	//*  45   93:getfield        #231 <Field boolean Fragment.mIsNewlyAdded>
	//*  46   96:ifeq            106
						arrayset.add(((Object) (fragment)));
	//   47   99:aload_1         
	//   48  100:aload           5
	//   49  102:invokevirtual   #237 <Method boolean ArraySet.add(Object)>
	//   50  105:pop             
				}
				i++;
	//   51  106:iload_2         
	//   52  107:iconst_1        
	//   53  108:iadd            
	//   54  109:istore_2        
			}
		}
	//*  55  110:goto            29
	}

	private void animateRemoveFragment(final Fragment fragment, AnimationOrAnimator animationoranimator, int i)
	{
		final View viewToAnimate = fragment.mView;
	//    0    0:aload_1         
	//    1    1:getfield        #225 <Field View Fragment.mView>
	//    2    4:astore          4
		fragment.setStateAfterAnimating(i);
	//    3    6:aload_1         
	//    4    7:iload_3         
	//    5    8:invokevirtual   #246 <Method void Fragment.setStateAfterAnimating(int)>
		if(animationoranimator.animation != null)
	//*   6   11:aload_2         
	//*   7   12:getfield        #250 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//*   8   15:ifnull          67
		{
			Animation animation = animationoranimator.animation;
	//    9   18:aload_2         
	//   10   19:getfield        #250 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   11   22:astore          5
			fragment.setAnimatingAway(fragment.mView);
	//   12   24:aload_1         
	//   13   25:aload_1         
	//   14   26:getfield        #225 <Field View Fragment.mView>
	//   15   29:invokevirtual   #254 <Method void Fragment.setAnimatingAway(View)>
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
	//   21   41:invokestatic    #258 <Method android.view.animation.Animation$AnimationListener getAnimationListener(Animation)>
	//   22   44:aload_1         
	//   23   45:invokespecial   #261 <Method void FragmentManagerImpl$2(FragmentManagerImpl, android.view.animation.Animation$AnimationListener, Fragment)>
	//   24   48:invokevirtual   #267 <Method void Animation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
			setHWLayerAnimListenerIfAlpha(viewToAnimate, animationoranimator);
	//   25   51:aload           4
	//   26   53:aload_2         
	//   27   54:invokestatic    #271 <Method void setHWLayerAnimListenerIfAlpha(View, FragmentManagerImpl$AnimationOrAnimator)>
			fragment.mView.startAnimation(animation);
	//   28   57:aload_1         
	//   29   58:getfield        #225 <Field View Fragment.mView>
	//   30   61:aload           5
	//   31   63:invokevirtual   #277 <Method void View.startAnimation(Animation)>
			return;
	//   32   66:return          
		}
		Animator animator = animationoranimator.animator;
	//   33   67:aload_2         
	//   34   68:getfield        #281 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   35   71:astore          5
		fragment.setAnimator(animationoranimator.animator);
	//   36   73:aload_1         
	//   37   74:aload_2         
	//   38   75:getfield        #281 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   39   78:invokevirtual   #285 <Method void Fragment.setAnimator(Animator)>
		final ViewGroup container = fragment.mContainer;
	//   40   81:aload_1         
	//   41   82:getfield        #288 <Field ViewGroup Fragment.mContainer>
	//   42   85:astore          6
		if(container != null)
	//*  43   87:aload           6
	//*  44   89:ifnull          99
			container.startViewTransition(viewToAnimate);
	//   45   92:aload           6
	//   46   94:aload           4
	//   47   96:invokevirtual   #293 <Method void ViewGroup.startViewTransition(View)>
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
	//   55  111:invokespecial   #296 <Method void FragmentManagerImpl$3(FragmentManagerImpl, ViewGroup, View, Fragment)>
	//   56  114:invokevirtual   #302 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
		animator.setTarget(((Object) (fragment.mView)));
	//   57  117:aload           5
	//   58  119:aload_1         
	//   59  120:getfield        #225 <Field View Fragment.mView>
	//   60  123:invokevirtual   #306 <Method void Animator.setTarget(Object)>
		setHWLayerAnimListenerIfAlpha(fragment.mView, animationoranimator);
	//   61  126:aload_1         
	//   62  127:getfield        #225 <Field View Fragment.mView>
	//   63  130:aload_2         
	//   64  131:invokestatic    #271 <Method void setHWLayerAnimListenerIfAlpha(View, FragmentManagerImpl$AnimationOrAnimator)>
		animator.start();
	//   65  134:aload           5
	//   66  136:invokevirtual   #309 <Method void Animator.start()>
	//   67  139:return          
	}

	private void burpActive()
	{
		if(mActive != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field SparseArray mActive>
	//*   2    4:ifnull          54
		{
			for(int i = mActive.size() - 1; i >= 0; i--)
	//*   3    7:aload_0         
	//*   4    8:getfield        #313 <Field SparseArray mActive>
	//*   5   11:invokevirtual   #316 <Method int SparseArray.size()>
	//*   6   14:iconst_1        
	//*   7   15:isub            
	//*   8   16:istore_1        
	//*   9   17:iload_1         
	//*  10   18:iflt            54
				if(mActive.valueAt(i) == null)
	//*  11   21:aload_0         
	//*  12   22:getfield        #313 <Field SparseArray mActive>
	//*  13   25:iload_1         
	//*  14   26:invokevirtual   #319 <Method Object SparseArray.valueAt(int)>
	//*  15   29:ifnonnull       47
					mActive.delete(mActive.keyAt(i));
	//   16   32:aload_0         
	//   17   33:getfield        #313 <Field SparseArray mActive>
	//   18   36:aload_0         
	//   19   37:getfield        #313 <Field SparseArray mActive>
	//   20   40:iload_1         
	//   21   41:invokevirtual   #323 <Method int SparseArray.keyAt(int)>
	//   22   44:invokevirtual   #326 <Method void SparseArray.delete(int)>

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
	//*   1    1:getfield        #329 <Field boolean mStateSaved>
	//*   2    4:ifeq            18
			throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
	//    3    7:new             #331 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #333 <String "Can not perform this action after onSaveInstanceState">
	//    6   14:invokespecial   #336 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		if(mNoTransactionsBecause != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #338 <Field String mNoTransactionsBecause>
	//*  10   22:ifnull          56
			throw new IllegalStateException((new StringBuilder()).append("Can not perform this action inside of ").append(mNoTransactionsBecause).toString());
	//   11   25:new             #331 <Class IllegalStateException>
	//   12   28:dup             
	//   13   29:new             #340 <Class StringBuilder>
	//   14   32:dup             
	//   15   33:invokespecial   #341 <Method void StringBuilder()>
	//   16   36:ldc2            #343 <String "Can not perform this action inside of ">
	//   17   39:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   18   42:aload_0         
	//   19   43:getfield        #338 <Field String mNoTransactionsBecause>
	//   20   46:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   21   49:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   22   52:invokespecial   #336 <Method void IllegalStateException(String)>
	//   23   55:athrow          
		else
			return;
	//   24   56:return          
	}

	private void cleanupExec()
	{
		mExecutingActions = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #354 <Field boolean mExecutingActions>
		mTmpIsPop.clear();
	//    3    5:aload_0         
	//    4    6:getfield        #356 <Field ArrayList mTmpIsPop>
	//    5    9:invokevirtual   #359 <Method void ArrayList.clear()>
		mTmpRecords.clear();
	//    6   12:aload_0         
	//    7   13:getfield        #361 <Field ArrayList mTmpRecords>
	//    8   16:invokevirtual   #359 <Method void ArrayList.clear()>
	//    9   19:return          
	}

	private void completeExecute(BackStackRecord backstackrecord, boolean flag, boolean flag1, boolean flag2)
	{
		ArrayList arraylist;
		ArrayList arraylist1;
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            192
			backstackrecord.executePopOps(flag2);
	//    2    4:aload_1         
	//    3    5:iload           4
	//    4    7:invokevirtual   #367 <Method void BackStackRecord.executePopOps(boolean)>
		else
	//*   5   10:new             #161 <Class ArrayList>
	//*   6   13:dup             
	//*   7   14:iconst_1        
	//*   8   15:invokespecial   #369 <Method void ArrayList(int)>
	//*   9   18:astore          7
	//*  10   20:new             #161 <Class ArrayList>
	//*  11   23:dup             
	//*  12   24:iconst_1        
	//*  13   25:invokespecial   #369 <Method void ArrayList(int)>
	//*  14   28:astore          8
	//*  15   30:aload           7
	//*  16   32:aload_1         
	//*  17   33:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//*  18   36:pop             
	//*  19   37:aload           8
	//*  20   39:iload_2         
	//*  21   40:invokestatic    #376 <Method Boolean Boolean.valueOf(boolean)>
	//*  22   43:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//*  23   46:pop             
	//*  24   47:iload_3         
	//*  25   48:ifeq            62
	//*  26   51:aload_0         
	//*  27   52:aload           7
	//*  28   54:aload           8
	//*  29   56:iconst_0        
	//*  30   57:iconst_1        
	//*  31   58:iconst_1        
	//*  32   59:invokestatic    #382 <Method void FragmentTransition.startTransitions(FragmentManagerImpl, ArrayList, ArrayList, int, int, boolean)>
	//*  33   62:iload           4
	//*  34   64:ifeq            76
	//*  35   67:aload_0         
	//*  36   68:aload_0         
	//*  37   69:getfield        #171 <Field int mCurState>
	//*  38   72:iconst_1        
	//*  39   73:invokevirtual   #385 <Method void moveToState(int, boolean)>
	//*  40   76:aload_0         
	//*  41   77:getfield        #313 <Field SparseArray mActive>
	//*  42   80:ifnull          216
	//*  43   83:aload_0         
	//*  44   84:getfield        #313 <Field SparseArray mActive>
	//*  45   87:invokevirtual   #316 <Method int SparseArray.size()>
	//*  46   90:istore          6
	//*  47   92:iconst_0        
	//*  48   93:istore          5
	//*  49   95:iload           5
	//*  50   97:iload           6
	//*  51   99:icmpge          216
	//*  52  102:aload_0         
	//*  53  103:getfield        #313 <Field SparseArray mActive>
	//*  54  106:iload           5
	//*  55  108:invokevirtual   #319 <Method Object SparseArray.valueAt(int)>
	//*  56  111:checkcast       #208 <Class Fragment>
	//*  57  114:astore          7
	//*  58  116:aload           7
	//*  59  118:ifnull          183
	//*  60  121:aload           7
	//*  61  123:getfield        #225 <Field View Fragment.mView>
	//*  62  126:ifnull          183
	//*  63  129:aload           7
	//*  64  131:getfield        #231 <Field boolean Fragment.mIsNewlyAdded>
	//*  65  134:ifeq            183
	//*  66  137:aload_1         
	//*  67  138:aload           7
	//*  68  140:getfield        #388 <Field int Fragment.mContainerId>
	//*  69  143:invokevirtual   #392 <Method boolean BackStackRecord.interactsWith(int)>
	//*  70  146:ifeq            183
	//*  71  149:aload           7
	//*  72  151:getfield        #396 <Field float Fragment.mPostponedAlpha>
	//*  73  154:fconst_0        
	//*  74  155:fcmpl           
	//*  75  156:ifle            172
	//*  76  159:aload           7
	//*  77  161:getfield        #225 <Field View Fragment.mView>
	//*  78  164:aload           7
	//*  79  166:getfield        #396 <Field float Fragment.mPostponedAlpha>
	//*  80  169:invokevirtual   #399 <Method void View.setAlpha(float)>
	//*  81  172:iload           4
	//*  82  174:ifeq            199
	//*  83  177:aload           7
	//*  84  179:fconst_0        
	//*  85  180:putfield        #396 <Field float Fragment.mPostponedAlpha>
	//*  86  183:iload           5
	//*  87  185:iconst_1        
	//*  88  186:iadd            
	//*  89  187:istore          5
	//*  90  189:goto            95
			backstackrecord.executeOps();
	//   91  192:aload_1         
	//   92  193:invokevirtual   #402 <Method void BackStackRecord.executeOps()>
		arraylist = new ArrayList(1);
		arraylist1 = new ArrayList(1);
		arraylist.add(((Object) (backstackrecord)));
		arraylist1.add(((Object) (Boolean.valueOf(flag))));
		if(flag1)
			FragmentTransition.startTransitions(this, arraylist, arraylist1, 0, 1, true);
		if(flag2)
			moveToState(mCurState, true);
		if(mActive != null)
		{
			int j = mActive.size();
			int i = 0;
			while(i < j) 
			{
				Fragment fragment = (Fragment)mActive.valueAt(i);
				if(fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && backstackrecord.interactsWith(fragment.mContainerId))
				{
					if(fragment.mPostponedAlpha > 0.0F)
						fragment.mView.setAlpha(fragment.mPostponedAlpha);
					if(flag2)
					{
						fragment.mPostponedAlpha = 0.0F;
					} else
	//*  93  196:goto            10
					{
						fragment.mPostponedAlpha = -1F;
	//   94  199:aload           7
	//   95  201:ldc2            #403 <Float -1F>
	//   96  204:putfield        #396 <Field float Fragment.mPostponedAlpha>
						fragment.mIsNewlyAdded = false;
	//   97  207:aload           7
	//   98  209:iconst_0        
	//   99  210:putfield        #231 <Field boolean Fragment.mIsNewlyAdded>
					}
				}
				i++;
			}
		}
	//* 100  213:goto            183
	//  101  216:return          
	}

	private void dispatchStateChange(int i)
	{
		mExecutingActions = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #354 <Field boolean mExecutingActions>
		moveToState(i, false);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #385 <Method void moveToState(int, boolean)>
		mExecutingActions = false;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #354 <Field boolean mExecutingActions>
		execPendingActions();
	//   10   16:aload_0         
	//   11   17:invokevirtual   #408 <Method boolean execPendingActions()>
	//   12   20:pop             
		return;
	//   13   21:return          
		Exception exception;
		exception;
	//   14   22:astore_2        
		mExecutingActions = false;
	//   15   23:aload_0         
	//   16   24:iconst_0        
	//   17   25:putfield        #354 <Field boolean mExecutingActions>
		throw exception;
	//   18   28:aload_2         
	//   19   29:athrow          
	}

	private void endAnimatingAwayFragments()
	{
		int i;
		int j;
		if(mActive == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field SparseArray mActive>
	//*   2    4:ifnonnull       100
			i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
		else
	//*   5    9:iconst_0        
	//*   6   10:istore_2        
	//*   7   11:iload_2         
	//*   8   12:iload_1         
	//*   9   13:icmpge          130
	//*  10   16:aload_0         
	//*  11   17:getfield        #313 <Field SparseArray mActive>
	//*  12   20:iload_2         
	//*  13   21:invokevirtual   #319 <Method Object SparseArray.valueAt(int)>
	//*  14   24:checkcast       #208 <Class Fragment>
	//*  15   27:astore          4
	//*  16   29:aload           4
	//*  17   31:ifnull          93
	//*  18   34:aload           4
	//*  19   36:invokevirtual   #413 <Method View Fragment.getAnimatingAway()>
	//*  20   39:ifnull          111
	//*  21   42:aload           4
	//*  22   44:invokevirtual   #416 <Method int Fragment.getStateAfterAnimating()>
	//*  23   47:istore_3        
	//*  24   48:aload           4
	//*  25   50:invokevirtual   #413 <Method View Fragment.getAnimatingAway()>
	//*  26   53:astore          5
	//*  27   55:aload           4
	//*  28   57:aconst_null     
	//*  29   58:invokevirtual   #254 <Method void Fragment.setAnimatingAway(View)>
	//*  30   61:aload           5
	//*  31   63:invokevirtual   #420 <Method Animation View.getAnimation()>
	//*  32   66:astore          6
	//*  33   68:aload           6
	//*  34   70:ifnull          83
	//*  35   73:aload           6
	//*  36   75:invokevirtual   #423 <Method void Animation.cancel()>
	//*  37   78:aload           5
	//*  38   80:invokevirtual   #426 <Method void View.clearAnimation()>
	//*  39   83:aload_0         
	//*  40   84:aload           4
	//*  41   86:iload_3         
	//*  42   87:iconst_0        
	//*  43   88:iconst_0        
	//*  44   89:iconst_0        
	//*  45   90:invokevirtual   #221 <Method void moveToState(Fragment, int, int, int, boolean)>
	//*  46   93:iload_2         
	//*  47   94:iconst_1        
	//*  48   95:iadd            
	//*  49   96:istore_2        
	//*  50   97:goto            11
			i = mActive.size();
	//   51  100:aload_0         
	//   52  101:getfield        #313 <Field SparseArray mActive>
	//   53  104:invokevirtual   #316 <Method int SparseArray.size()>
	//   54  107:istore_1        
		j = 0;
		while(j < i) 
		{
			Fragment fragment = (Fragment)mActive.valueAt(j);
			if(fragment != null)
				if(fragment.getAnimatingAway() != null)
				{
					int k = fragment.getStateAfterAnimating();
					View view = fragment.getAnimatingAway();
					fragment.setAnimatingAway(((View) (null)));
					Animation animation = view.getAnimation();
					if(animation != null)
					{
						animation.cancel();
						view.clearAnimation();
					}
					moveToState(fragment, k, 0, 0, false);
				} else
	//*  55  108:goto            9
				if(fragment.getAnimator() != null)
	//*  56  111:aload           4
	//*  57  113:invokevirtual   #430 <Method Animator Fragment.getAnimator()>
	//*  58  116:ifnull          93
					fragment.getAnimator().end();
	//   59  119:aload           4
	//   60  121:invokevirtual   #430 <Method Animator Fragment.getAnimator()>
	//   61  124:invokevirtual   #433 <Method void Animator.end()>
			j++;
		}
	//*  62  127:goto            93
	//   63  130:return          
	}

	private void ensureExecReady(boolean flag)
	{
		if(mExecutingActions)
	//*   0    0:aload_0         
	//*   1    1:getfield        #354 <Field boolean mExecutingActions>
	//*   2    4:ifeq            18
			throw new IllegalStateException("FragmentManager is already executing transactions");
	//    3    7:new             #331 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #436 <String "FragmentManager is already executing transactions">
	//    6   14:invokespecial   #336 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		if(Looper.myLooper() != mHost.getHandler().getLooper())
	//*   8   18:invokestatic    #442 <Method Looper Looper.myLooper()>
	//*   9   21:aload_0         
	//*  10   22:getfield        #444 <Field FragmentHostCallback mHost>
	//*  11   25:invokevirtual   #450 <Method Handler FragmentHostCallback.getHandler()>
	//*  12   28:invokevirtual   #455 <Method Looper Handler.getLooper()>
	//*  13   31:if_acmpeq       45
			throw new IllegalStateException("Must be called from main thread of fragment host");
	//   14   34:new             #331 <Class IllegalStateException>
	//   15   37:dup             
	//   16   38:ldc2            #457 <String "Must be called from main thread of fragment host">
	//   17   41:invokespecial   #336 <Method void IllegalStateException(String)>
	//   18   44:athrow          
		if(!flag)
	//*  19   45:iload_1         
	//*  20   46:ifne            53
			checkStateLoss();
	//   21   49:aload_0         
	//   22   50:invokespecial   #459 <Method void checkStateLoss()>
		if(mTmpRecords == null)
	//*  23   53:aload_0         
	//*  24   54:getfield        #361 <Field ArrayList mTmpRecords>
	//*  25   57:ifnonnull       82
		{
			mTmpRecords = new ArrayList();
	//   26   60:aload_0         
	//   27   61:new             #161 <Class ArrayList>
	//   28   64:dup             
	//   29   65:invokespecial   #162 <Method void ArrayList()>
	//   30   68:putfield        #361 <Field ArrayList mTmpRecords>
			mTmpIsPop = new ArrayList();
	//   31   71:aload_0         
	//   32   72:new             #161 <Class ArrayList>
	//   33   75:dup             
	//   34   76:invokespecial   #162 <Method void ArrayList()>
	//   35   79:putfield        #356 <Field ArrayList mTmpIsPop>
		}
		mExecutingActions = true;
	//   36   82:aload_0         
	//   37   83:iconst_1        
	//   38   84:putfield        #354 <Field boolean mExecutingActions>
		executePostponedTransaction(((ArrayList) (null)), ((ArrayList) (null)));
	//   39   87:aload_0         
	//   40   88:aconst_null     
	//   41   89:aconst_null     
	//   42   90:invokespecial   #463 <Method void executePostponedTransaction(ArrayList, ArrayList)>
		mExecutingActions = false;
	//   43   93:aload_0         
	//   44   94:iconst_0        
	//   45   95:putfield        #354 <Field boolean mExecutingActions>
		return;
	//   46   98:return          
		Exception exception;
		exception;
	//   47   99:astore_2        
		mExecutingActions = false;
	//   48  100:aload_0         
	//   49  101:iconst_0        
	//   50  102:putfield        #354 <Field boolean mExecutingActions>
		throw exception;
	//   51  105:aload_2         
	//   52  106:athrow          
	}

	private static void executeOps(ArrayList arraylist, ArrayList arraylist1, int i, int j)
	{
		while(i < j) 
	//*   0    0:iload_2         
	//*   1    1:iload_3         
	//*   2    2:icmpge          79
		{
			BackStackRecord backstackrecord = (BackStackRecord)arraylist.get(i);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//    6   10:checkcast       #363 <Class BackStackRecord>
	//    7   13:astore          5
			if(((Boolean)arraylist1.get(i)).booleanValue())
	//*   8   15:aload_1         
	//*   9   16:iload_2         
	//*  10   17:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//*  11   20:checkcast       #372 <Class Boolean>
	//*  12   23:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//*  13   26:ifeq            65
			{
				backstackrecord.bumpBackStackNesting(-1);
	//   14   29:aload           5
	//   15   31:iconst_m1       
	//   16   32:invokevirtual   #470 <Method void BackStackRecord.bumpBackStackNesting(int)>
				boolean flag;
				if(i == j - 1)
	//*  17   35:iload_2         
	//*  18   36:iload_3         
	//*  19   37:iconst_1        
	//*  20   38:isub            
	//*  21   39:icmpne          59
					flag = true;
	//   22   42:iconst_1        
	//   23   43:istore          4
				else
	//*  24   45:aload           5
	//*  25   47:iload           4
	//*  26   49:invokevirtual   #367 <Method void BackStackRecord.executePopOps(boolean)>
	//*  27   52:iload_2         
	//*  28   53:iconst_1        
	//*  29   54:iadd            
	//*  30   55:istore_2        
	//*  31   56:goto            0
					flag = false;
	//   32   59:iconst_0        
	//   33   60:istore          4
				backstackrecord.executePopOps(flag);
			} else
	//*  34   62:goto            45
			{
				backstackrecord.bumpBackStackNesting(1);
	//   35   65:aload           5
	//   36   67:iconst_1        
	//   37   68:invokevirtual   #470 <Method void BackStackRecord.bumpBackStackNesting(int)>
				backstackrecord.executeOps();
	//   38   71:aload           5
	//   39   73:invokevirtual   #402 <Method void BackStackRecord.executeOps()>
			}
			i++;
		}
	//*  40   76:goto            52
	//   41   79:return          
	}

	private void executeOpsTogether(ArrayList arraylist, ArrayList arraylist1, int i, int j)
	{
		boolean flag1 = ((BackStackRecord)arraylist.get(i)).mReorderingAllowed;
	//    0    0:aload_1         
	//    1    1:iload_3         
	//    2    2:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//    3    5:checkcast       #363 <Class BackStackRecord>
	//    4    8:getfield        #475 <Field boolean BackStackRecord.mReorderingAllowed>
	//    5   11:istore          8
		boolean flag;
		int k;
		Fragment fragment;
		if(mTmpAddedFragments == null)
	//*   6   13:aload_0         
	//*   7   14:getfield        #477 <Field ArrayList mTmpAddedFragments>
	//*   8   17:ifnonnull       126
			mTmpAddedFragments = new ArrayList();
	//    9   20:aload_0         
	//   10   21:new             #161 <Class ArrayList>
	//   11   24:dup             
	//   12   25:invokespecial   #162 <Method void ArrayList()>
	//   13   28:putfield        #477 <Field ArrayList mTmpAddedFragments>
		else
	//*  14   31:aload_0         
	//*  15   32:getfield        #477 <Field ArrayList mTmpAddedFragments>
	//*  16   35:aload_0         
	//*  17   36:getfield        #164 <Field ArrayList mAdded>
	//*  18   39:invokevirtual   #481 <Method boolean ArrayList.addAll(java.util.Collection)>
	//*  19   42:pop             
	//*  20   43:aload_0         
	//*  21   44:invokevirtual   #485 <Method Fragment getPrimaryNavigationFragment()>
	//*  22   47:astore          9
	//*  23   49:iload_3         
	//*  24   50:istore          6
	//*  25   52:iconst_0        
	//*  26   53:istore          5
	//*  27   55:iload           6
	//*  28   57:iload           4
	//*  29   59:icmpge          158
	//*  30   62:aload_1         
	//*  31   63:iload           6
	//*  32   65:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//*  33   68:checkcast       #363 <Class BackStackRecord>
	//*  34   71:astore          10
	//*  35   73:aload_2         
	//*  36   74:iload           6
	//*  37   76:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//*  38   79:checkcast       #372 <Class Boolean>
	//*  39   82:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//*  40   85:ifne            136
	//*  41   88:aload           10
	//*  42   90:aload_0         
	//*  43   91:getfield        #477 <Field ArrayList mTmpAddedFragments>
	//*  44   94:aload           9
	//*  45   96:invokevirtual   #489 <Method Fragment BackStackRecord.expandOps(ArrayList, Fragment)>
	//*  46   99:astore          9
	//*  47  101:iload           5
	//*  48  103:ifne            114
	//*  49  106:aload           10
	//*  50  108:getfield        #492 <Field boolean BackStackRecord.mAddToBackStack>
	//*  51  111:ifeq            152
	//*  52  114:iconst_1        
	//*  53  115:istore          5
	//*  54  117:iload           6
	//*  55  119:iconst_1        
	//*  56  120:iadd            
	//*  57  121:istore          6
	//*  58  123:goto            55
			mTmpAddedFragments.clear();
	//   59  126:aload_0         
	//   60  127:getfield        #477 <Field ArrayList mTmpAddedFragments>
	//   61  130:invokevirtual   #359 <Method void ArrayList.clear()>
		mTmpAddedFragments.addAll(((java.util.Collection) (mAdded)));
		fragment = getPrimaryNavigationFragment();
		k = i;
		flag = false;
		while(k < j) 
		{
			BackStackRecord backstackrecord1 = (BackStackRecord)arraylist.get(k);
			if(!((Boolean)arraylist1.get(k)).booleanValue())
				fragment = backstackrecord1.expandOps(mTmpAddedFragments, fragment);
			else
	//*  62  133:goto            31
				fragment = backstackrecord1.trackAddedFragmentsInPop(mTmpAddedFragments, fragment);
	//   63  136:aload           10
	//   64  138:aload_0         
	//   65  139:getfield        #477 <Field ArrayList mTmpAddedFragments>
	//   66  142:aload           9
	//   67  144:invokevirtual   #495 <Method Fragment BackStackRecord.trackAddedFragmentsInPop(ArrayList, Fragment)>
	//   68  147:astore          9
			if(flag || backstackrecord1.mAddToBackStack)
				flag = true;
			else
	//*  69  149:goto            101
				flag = false;
	//   70  152:iconst_0        
	//   71  153:istore          5
			k++;
		}
	//*  72  155:goto            117
		mTmpAddedFragments.clear();
	//   73  158:aload_0         
	//   74  159:getfield        #477 <Field ArrayList mTmpAddedFragments>
	//   75  162:invokevirtual   #359 <Method void ArrayList.clear()>
		if(!flag1)
	//*  76  165:iload           8
	//*  77  167:ifne            180
			FragmentTransition.startTransitions(this, arraylist, arraylist1, i, j, false);
	//   78  170:aload_0         
	//   79  171:aload_1         
	//   80  172:aload_2         
	//   81  173:iload_3         
	//   82  174:iload           4
	//   83  176:iconst_0        
	//   84  177:invokestatic    #382 <Method void FragmentTransition.startTransitions(FragmentManagerImpl, ArrayList, ArrayList, int, int, boolean)>
		executeOps(arraylist, arraylist1, i, j);
	//   85  180:aload_1         
	//   86  181:aload_2         
	//   87  182:iload_3         
	//   88  183:iload           4
	//   89  185:invokestatic    #497 <Method void executeOps(ArrayList, ArrayList, int, int)>
		int l;
		if(flag1)
	//*  90  188:iload           8
	//*  91  190:ifeq            346
		{
			ArraySet arrayset = new ArraySet();
	//   92  193:new             #233 <Class ArraySet>
	//   93  196:dup             
	//   94  197:invokespecial   #498 <Method void ArraySet()>
	//   95  200:astore          9
			addAddedFragments(arrayset);
	//   96  202:aload_0         
	//   97  203:aload           9
	//   98  205:invokespecial   #500 <Method void addAddedFragments(ArraySet)>
			k = postponePostponableTransactions(arraylist, arraylist1, i, j, arrayset);
	//   99  208:aload_0         
	//  100  209:aload_1         
	//  101  210:aload_2         
	//  102  211:iload_3         
	//  103  212:iload           4
	//  104  214:aload           9
	//  105  216:invokespecial   #504 <Method int postponePostponableTransactions(ArrayList, ArrayList, int, int, ArraySet)>
	//  106  219:istore          6
			makeRemovedFragmentsInvisible(arrayset);
	//  107  221:aload_0         
	//  108  222:aload           9
	//  109  224:invokespecial   #507 <Method void makeRemovedFragmentsInvisible(ArraySet)>
		} else
	//* 110  227:iload_3         
	//* 111  228:istore          7
	//* 112  230:iload           6
	//* 113  232:iload_3         
	//* 114  233:icmpeq          266
	//* 115  236:iload_3         
	//* 116  237:istore          7
	//* 117  239:iload           8
	//* 118  241:ifeq            266
	//* 119  244:aload_0         
	//* 120  245:aload_1         
	//* 121  246:aload_2         
	//* 122  247:iload_3         
	//* 123  248:iload           6
	//* 124  250:iconst_1        
	//* 125  251:invokestatic    #382 <Method void FragmentTransition.startTransitions(FragmentManagerImpl, ArrayList, ArrayList, int, int, boolean)>
	//* 126  254:aload_0         
	//* 127  255:aload_0         
	//* 128  256:getfield        #171 <Field int mCurState>
	//* 129  259:iconst_1        
	//* 130  260:invokevirtual   #385 <Method void moveToState(int, boolean)>
	//* 131  263:iload_3         
	//* 132  264:istore          7
	//* 133  266:iload           7
	//* 134  268:iload           4
	//* 135  270:icmpge          336
	//* 136  273:aload_1         
	//* 137  274:iload           7
	//* 138  276:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//* 139  279:checkcast       #363 <Class BackStackRecord>
	//* 140  282:astore          9
	//* 141  284:aload_2         
	//* 142  285:iload           7
	//* 143  287:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//* 144  290:checkcast       #372 <Class Boolean>
	//* 145  293:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//* 146  296:ifeq            322
	//* 147  299:aload           9
	//* 148  301:getfield        #510 <Field int BackStackRecord.mIndex>
	//* 149  304:iflt            322
	//* 150  307:aload_0         
	//* 151  308:aload           9
	//* 152  310:getfield        #510 <Field int BackStackRecord.mIndex>
	//* 153  313:invokevirtual   #513 <Method void freeBackStackIndex(int)>
	//* 154  316:aload           9
	//* 155  318:iconst_m1       
	//* 156  319:putfield        #510 <Field int BackStackRecord.mIndex>
	//* 157  322:aload           9
	//* 158  324:invokevirtual   #516 <Method void BackStackRecord.runOnCommitRunnables()>
	//* 159  327:iload           7
	//* 160  329:iconst_1        
	//* 161  330:iadd            
	//* 162  331:istore          7
	//* 163  333:goto            266
	//* 164  336:iload           5
	//* 165  338:ifeq            345
	//* 166  341:aload_0         
	//* 167  342:invokevirtual   #519 <Method void reportBackStackChanged()>
	//* 168  345:return          
		{
			k = j;
	//  169  346:iload           4
	//  170  348:istore          6
		}
		l = i;
		if(k != i)
		{
			l = i;
			if(flag1)
			{
				FragmentTransition.startTransitions(this, arraylist, arraylist1, i, k, true);
				moveToState(mCurState, true);
				l = i;
			}
		}
		for(; l < j; l++)
		{
			BackStackRecord backstackrecord = (BackStackRecord)arraylist.get(l);
			if(((Boolean)arraylist1.get(l)).booleanValue() && backstackrecord.mIndex >= 0)
			{
				freeBackStackIndex(backstackrecord.mIndex);
				backstackrecord.mIndex = -1;
			}
			backstackrecord.runOnCommitRunnables();
		}

		if(flag)
			reportBackStackChanged();
	//* 171  350:goto            227
	}

	private void executePostponedTransaction(ArrayList arraylist, ArrayList arraylist1)
	{
		int i;
		int j;
		StartEnterTransitionListener startentertransitionlistener;
		int k;
		if(mPostponedTransactions == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #521 <Field ArrayList mPostponedTransactions>
	//*   2    4:ifnonnull       90
			i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_3        
		else
	//*   5    9:iconst_0        
	//*   6   10:istore          4
	//*   7   12:iload           4
	//*   8   14:iload_3         
	//*   9   15:icmpge          236
	//*  10   18:aload_0         
	//*  11   19:getfield        #521 <Field ArrayList mPostponedTransactions>
	//*  12   22:iload           4
	//*  13   24:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//*  14   27:checkcast       #39  <Class FragmentManagerImpl$StartEnterTransitionListener>
	//*  15   30:astore          7
	//*  16   32:aload_1         
	//*  17   33:ifnull          101
	//*  18   36:aload           7
	//*  19   38:invokestatic    #525 <Method boolean FragmentManagerImpl$StartEnterTransitionListener.access$300(FragmentManagerImpl$StartEnterTransitionListener)>
	//*  20   41:ifne            101
	//*  21   44:aload_1         
	//*  22   45:aload           7
	//*  23   47:invokestatic    #529 <Method BackStackRecord FragmentManagerImpl$StartEnterTransitionListener.access$400(FragmentManagerImpl$StartEnterTransitionListener)>
	//*  24   50:invokevirtual   #533 <Method int ArrayList.indexOf(Object)>
	//*  25   53:istore          5
	//*  26   55:iload           5
	//*  27   57:iconst_m1       
	//*  28   58:icmpeq          101
	//*  29   61:aload_2         
	//*  30   62:iload           5
	//*  31   64:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//*  32   67:checkcast       #372 <Class Boolean>
	//*  33   70:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//*  34   73:ifeq            101
	//*  35   76:aload           7
	//*  36   78:invokevirtual   #536 <Method void FragmentManagerImpl$StartEnterTransitionListener.cancelTransaction()>
	//*  37   81:iload           4
	//*  38   83:iconst_1        
	//*  39   84:iadd            
	//*  40   85:istore          4
	//*  41   87:goto            12
			i = mPostponedTransactions.size();
	//   42   90:aload_0         
	//   43   91:getfield        #521 <Field ArrayList mPostponedTransactions>
	//   44   94:invokevirtual   #202 <Method int ArrayList.size()>
	//   45   97:istore_3        
		j = 0;
		if(j >= i)
			break MISSING_BLOCK_LABEL_236;
		startentertransitionlistener = (StartEnterTransitionListener)mPostponedTransactions.get(j);
		if(arraylist == null || startentertransitionlistener.mIsBack)
			break; /* Loop/switch isn't completed */
		k = arraylist.indexOf(((Object) (startentertransitionlistener.mRecord)));
		if(k == -1 || !((Boolean)arraylist1.get(k)).booleanValue())
			break; /* Loop/switch isn't completed */
		startentertransitionlistener.cancelTransaction();
_L4:
		j++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_12;
	//*  46   98:goto            9
_L1:
		int l;
		int i1;
label0:
		{
			if(!startentertransitionlistener.isReady())
	//*  47  101:aload           7
	//*  48  103:invokevirtual   #539 <Method boolean FragmentManagerImpl$StartEnterTransitionListener.isReady()>
	//*  49  106:ifne            144
			{
				i1 = j;
	//   50  109:iload           4
	//   51  111:istore          6
				l = i;
	//   52  113:iload_3         
	//   53  114:istore          5
				if(arraylist == null)
					break MISSING_BLOCK_LABEL_226;
	//   54  116:aload_1         
	//   55  117:ifnull          226
				i1 = j;
	//   56  120:iload           4
	//   57  122:istore          6
				l = i;
	//   58  124:iload_3         
	//   59  125:istore          5
				if(!startentertransitionlistener.mRecord.interactsWith(arraylist, 0, arraylist.size()))
					break MISSING_BLOCK_LABEL_226;
	//   60  127:aload           7
	//   61  129:invokestatic    #529 <Method BackStackRecord FragmentManagerImpl$StartEnterTransitionListener.access$400(FragmentManagerImpl$StartEnterTransitionListener)>
	//   62  132:aload_1         
	//   63  133:iconst_0        
	//   64  134:aload_1         
	//   65  135:invokevirtual   #202 <Method int ArrayList.size()>
	//   66  138:invokevirtual   #542 <Method boolean BackStackRecord.interactsWith(ArrayList, int, int)>
	//   67  141:ifeq            226
			}
			mPostponedTransactions.remove(j);
	//   68  144:aload_0         
	//   69  145:getfield        #521 <Field ArrayList mPostponedTransactions>
	//   70  148:iload           4
	//   71  150:invokevirtual   #545 <Method Object ArrayList.remove(int)>
	//   72  153:pop             
			i1 = j - 1;
	//   73  154:iload           4
	//   74  156:iconst_1        
	//   75  157:isub            
	//   76  158:istore          6
			l = i - 1;
	//   77  160:iload_3         
	//   78  161:iconst_1        
	//   79  162:isub            
	//   80  163:istore          5
			if(arraylist == null || startentertransitionlistener.mIsBack)
				break label0;
	//   81  165:aload_1         
	//   82  166:ifnull          221
	//   83  169:aload           7
	//   84  171:invokestatic    #525 <Method boolean FragmentManagerImpl$StartEnterTransitionListener.access$300(FragmentManagerImpl$StartEnterTransitionListener)>
	//   85  174:ifne            221
			i = arraylist.indexOf(((Object) (startentertransitionlistener.mRecord)));
	//   86  177:aload_1         
	//   87  178:aload           7
	//   88  180:invokestatic    #529 <Method BackStackRecord FragmentManagerImpl$StartEnterTransitionListener.access$400(FragmentManagerImpl$StartEnterTransitionListener)>
	//   89  183:invokevirtual   #533 <Method int ArrayList.indexOf(Object)>
	//   90  186:istore_3        
			if(i == -1 || !((Boolean)arraylist1.get(i)).booleanValue())
				break label0;
	//   91  187:iload_3         
	//   92  188:iconst_m1       
	//   93  189:icmpeq          221
	//   94  192:aload_2         
	//   95  193:iload_3         
	//   96  194:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   97  197:checkcast       #372 <Class Boolean>
	//   98  200:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//   99  203:ifeq            221
			startentertransitionlistener.cancelTransaction();
	//  100  206:aload           7
	//  101  208:invokevirtual   #536 <Method void FragmentManagerImpl$StartEnterTransitionListener.cancelTransaction()>
			j = i1;
	//  102  211:iload           6
	//  103  213:istore          4
			i = l;
	//  104  215:iload           5
	//  105  217:istore_3        
		}
		continue; /* Loop/switch isn't completed */
	//  106  218:goto            81
		startentertransitionlistener.completeTransaction();
	//  107  221:aload           7
	//  108  223:invokevirtual   #548 <Method void FragmentManagerImpl$StartEnterTransitionListener.completeTransaction()>
		j = i1;
	//  109  226:iload           6
	//  110  228:istore          4
		i = l;
	//  111  230:iload           5
	//  112  232:istore_3        
		if(true) goto _L4; else goto _L3
	//  113  233:goto            81
_L3:
	//  114  236:return          
	}

	private Fragment findFragmentUnder(Fragment fragment)
	{
		Object obj;
		ViewGroup viewgroup;
		viewgroup = fragment.mContainer;
	//    0    0:aload_1         
	//    1    1:getfield        #288 <Field ViewGroup Fragment.mContainer>
	//    2    4:astore          4
		obj = ((Object) (fragment.mView));
	//    3    6:aload_1         
	//    4    7:getfield        #225 <Field View Fragment.mView>
	//    5   10:astore_3        
		if(viewgroup != null && obj != null) goto _L2; else goto _L1
	//    6   11:aload           4
	//    7   13:ifnull          20
	//    8   16:aload_3         
	//    9   17:ifnonnull       24
_L1:
		fragment = null;
	//   10   20:aconst_null     
	//   11   21:astore_1        
_L6:
		return fragment;
	//   12   22:aload_1         
	//   13   23:areturn         
_L2:
		int i = mAdded.indexOf(((Object) (fragment))) - 1;
	//   14   24:aload_0         
	//   15   25:getfield        #164 <Field ArrayList mAdded>
	//   16   28:aload_1         
	//   17   29:invokevirtual   #533 <Method int ArrayList.indexOf(Object)>
	//   18   32:iconst_1        
	//   19   33:isub            
	//   20   34:istore_2        
_L7:
		if(i < 0) goto _L4; else goto _L3
	//   21   35:iload_2         
	//   22   36:iflt            76
_L3:
		obj = ((Object) ((Fragment)mAdded.get(i)));
	//   23   39:aload_0         
	//   24   40:getfield        #164 <Field ArrayList mAdded>
	//   25   43:iload_2         
	//   26   44:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   27   47:checkcast       #208 <Class Fragment>
	//   28   50:astore_3        
		if(((Fragment) (obj)).mContainer != viewgroup)
			continue; /* Loop/switch isn't completed */
	//   29   51:aload_3         
	//   30   52:getfield        #288 <Field ViewGroup Fragment.mContainer>
	//   31   55:aload           4
	//   32   57:if_acmpne       69
		fragment = ((Fragment) (obj));
	//   33   60:aload_3         
	//   34   61:astore_1        
		if(((Fragment) (obj)).mView != null) goto _L6; else goto _L5
	//   35   62:aload_3         
	//   36   63:getfield        #225 <Field View Fragment.mView>
	//   37   66:ifnonnull       22
_L5:
		i--;
	//   38   69:iload_2         
	//   39   70:iconst_1        
	//   40   71:isub            
	//   41   72:istore_2        
		  goto _L7
	//*  42   73:goto            35
_L4:
		return null;
	//   43   76:aconst_null     
	//   44   77:areturn         
	}

	private void forcePostponedTransactions()
	{
		if(mPostponedTransactions != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #521 <Field ArrayList mPostponedTransactions>
	//*   2    4:ifnull          34
			for(; !mPostponedTransactions.isEmpty(); ((StartEnterTransitionListener)mPostponedTransactions.remove(0)).completeTransaction());
	//    3    7:aload_0         
	//    4    8:getfield        #521 <Field ArrayList mPostponedTransactions>
	//    5   11:invokevirtual   #555 <Method boolean ArrayList.isEmpty()>
	//    6   14:ifne            34
	//    7   17:aload_0         
	//    8   18:getfield        #521 <Field ArrayList mPostponedTransactions>
	//    9   21:iconst_0        
	//   10   22:invokevirtual   #545 <Method Object ArrayList.remove(int)>
	//   11   25:checkcast       #39  <Class FragmentManagerImpl$StartEnterTransitionListener>
	//   12   28:invokevirtual   #548 <Method void FragmentManagerImpl$StartEnterTransitionListener.completeTransaction()>
	//*  13   31:goto            7
	//   14   34:return          
	}

	private boolean generateOpsForPendingActions(ArrayList arraylist, ArrayList arraylist1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mPendingActions != null && mPendingActions.size() != 0)
			break MISSING_BLOCK_LABEL_23;
	//    2    2:aload_0         
	//    3    3:getfield        #559 <Field ArrayList mPendingActions>
	//    4    6:ifnull          19
	//    5    9:aload_0         
	//    6   10:getfield        #559 <Field ArrayList mPendingActions>
	//    7   13:invokevirtual   #202 <Method int ArrayList.size()>
	//    8   16:ifne            23
		this;
	//    9   19:aload_0         
		JVM INSTR monitorexit ;
	//   10   20:monitorexit     
		return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         
		int j = mPendingActions.size();
	//   13   23:aload_0         
	//   14   24:getfield        #559 <Field ArrayList mPendingActions>
	//   15   27:invokevirtual   #202 <Method int ArrayList.size()>
	//   16   30:istore          4
		int i;
		boolean flag;
		i = 0;
	//   17   32:iconst_0        
	//   18   33:istore_3        
		flag = false;
	//   19   34:iconst_0        
	//   20   35:istore          5
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   21   37:iload_3         
	//   22   38:iload           4
	//   23   40:icmpge          73
		flag |= ((OpGenerator)mPendingActions.get(i)).generateOps(arraylist, arraylist1);
	//   24   43:iload           5
	//   25   45:aload_0         
	//   26   46:getfield        #559 <Field ArrayList mPendingActions>
	//   27   49:iload_3         
	//   28   50:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   29   53:checkcast       #33  <Class FragmentManagerImpl$OpGenerator>
	//   30   56:aload_1         
	//   31   57:aload_2         
	//   32   58:invokeinterface #562 <Method boolean FragmentManagerImpl$OpGenerator.generateOps(ArrayList, ArrayList)>
	//   33   63:ior             
	//   34   64:istore          5
		i++;
	//   35   66:iload_3         
	//   36   67:iconst_1        
	//   37   68:iadd            
	//   38   69:istore_3        
		if(true) goto _L2; else goto _L1
	//   39   70:goto            37
_L1:
		mPendingActions.clear();
	//   40   73:aload_0         
	//   41   74:getfield        #559 <Field ArrayList mPendingActions>
	//   42   77:invokevirtual   #359 <Method void ArrayList.clear()>
		mHost.getHandler().removeCallbacks(mExecCommit);
	//   43   80:aload_0         
	//   44   81:getfield        #444 <Field FragmentHostCallback mHost>
	//   45   84:invokevirtual   #450 <Method Handler FragmentHostCallback.getHandler()>
	//   46   87:aload_0         
	//   47   88:getfield        #180 <Field Runnable mExecCommit>
	//   48   91:invokevirtual   #566 <Method void Handler.removeCallbacks(Runnable)>
		this;
	//   49   94:aload_0         
		JVM INSTR monitorexit ;
	//   50   95:monitorexit     
		return flag;
	//   51   96:iload           5
	//   52   98:ireturn         
		arraylist;
	//   53   99:astore_1        
		this;
	//   54  100:aload_0         
		JVM INSTR monitorexit ;
	//   55  101:monitorexit     
		throw arraylist;
	//   56  102:aload_1         
	//   57  103:athrow          
	}

	private static android.view.animation.Animation.AnimationListener getAnimationListener(Animation animation)
	{
		try
		{
			if(sAnimationListenerField == null)
	//*   0    0:getstatic       #135 <Field Field sAnimationListenerField>
	//*   1    3:ifnonnull       25
			{
				sAnimationListenerField = ((Class) (android/view/animation/Animation)).getDeclaredField("mListener");
	//    2    6:ldc2            #263 <Class Animation>
	//    3    9:ldc2            #573 <String "mListener">
	//    4   12:invokevirtual   #579 <Method Field Class.getDeclaredField(String)>
	//    5   15:putstatic       #135 <Field Field sAnimationListenerField>
				sAnimationListenerField.setAccessible(true);
	//    6   18:getstatic       #135 <Field Field sAnimationListenerField>
	//    7   21:iconst_1        
	//    8   22:invokevirtual   #584 <Method void Field.setAccessible(boolean)>
			}
			animation = ((Animation) ((android.view.animation.Animation.AnimationListener)sAnimationListenerField.get(((Object) (animation)))));
	//    9   25:getstatic       #135 <Field Field sAnimationListenerField>
	//   10   28:aload_0         
	//   11   29:invokevirtual   #587 <Method Object Field.get(Object)>
	//   12   32:checkcast       #589 <Class android.view.animation.Animation$AnimationListener>
	//   13   35:astore_0        
		}
	//*  14   36:aload_0         
	//*  15   37:areturn         
		// Misplaced declaration of an exception variable
		catch(Animation animation)
	//*  16   38:astore_0        
		{
			Log.e("FragmentManager", "No field with the name mListener is found in Animation class", ((Throwable) (animation)));
	//   17   39:ldc1            #67  <String "FragmentManager">
	//   18   41:ldc2            #591 <String "No field with the name mListener is found in Animation class">
	//   19   44:aload_0         
	//   20   45:invokestatic    #597 <Method int Log.e(String, String, Throwable)>
	//   21   48:pop             
			return null;
	//   22   49:aconst_null     
	//   23   50:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(Animation animation)
	//*  24   51:astore_0        
		{
			Log.e("FragmentManager", "Cannot access Animation's mListener field", ((Throwable) (animation)));
	//   25   52:ldc1            #67  <String "FragmentManager">
	//   26   54:ldc2            #599 <String "Cannot access Animation's mListener field">
	//   27   57:aload_0         
	//   28   58:invokestatic    #597 <Method int Log.e(String, String, Throwable)>
	//   29   61:pop             
			return null;
	//   30   62:aconst_null     
	//   31   63:areturn         
		}
		return ((android.view.animation.Animation.AnimationListener) (animation));
	}

	static AnimationOrAnimator makeFadeAnimation(Context context, float f, float f1)
	{
		context = ((Context) (new AlphaAnimation(f, f1)));
	//    0    0:new             #603 <Class AlphaAnimation>
	//    1    3:dup             
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokespecial   #606 <Method void AlphaAnimation(float, float)>
	//    5    9:astore_0        
		((AlphaAnimation) (context)).setInterpolator(DECELERATE_CUBIC);
	//    6   10:aload_0         
	//    7   11:getstatic       #147 <Field Interpolator DECELERATE_CUBIC>
	//    8   14:invokevirtual   #610 <Method void AlphaAnimation.setInterpolator(Interpolator)>
		((AlphaAnimation) (context)).setDuration(220L);
	//    9   17:aload_0         
	//   10   18:ldc2w           #611 <Long 220L>
	//   11   21:invokevirtual   #616 <Method void AlphaAnimation.setDuration(long)>
		return new AnimationOrAnimator(((Animation) (context)));
	//   12   24:new             #24  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:invokespecial   #619 <Method void FragmentManagerImpl$AnimationOrAnimator(Animation, FragmentManagerImpl$1)>
	//   17   33:areturn         
	}

	static AnimationOrAnimator makeOpenCloseAnimation(Context context, float f, float f1, float f2, float f3)
	{
		context = ((Context) (new AnimationSet(false)));
	//    0    0:new             #623 <Class AnimationSet>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #625 <Method void AnimationSet(boolean)>
	//    4    8:astore_0        
		Object obj = ((Object) (new ScaleAnimation(f, f1, f, f1, 1, 0.5F, 1, 0.5F)));
	//    5    9:new             #627 <Class ScaleAnimation>
	//    6   12:dup             
	//    7   13:fload_1         
	//    8   14:fload_2         
	//    9   15:fload_1         
	//   10   16:fload_2         
	//   11   17:iconst_1        
	//   12   18:ldc2            #628 <Float 0.5F>
	//   13   21:iconst_1        
	//   14   22:ldc2            #628 <Float 0.5F>
	//   15   25:invokespecial   #631 <Method void ScaleAnimation(float, float, float, float, int, float, int, float)>
	//   16   28:astore          5
		((ScaleAnimation) (obj)).setInterpolator(DECELERATE_QUINT);
	//   17   30:aload           5
	//   18   32:getstatic       #144 <Field Interpolator DECELERATE_QUINT>
	//   19   35:invokevirtual   #632 <Method void ScaleAnimation.setInterpolator(Interpolator)>
		((ScaleAnimation) (obj)).setDuration(220L);
	//   20   38:aload           5
	//   21   40:ldc2w           #611 <Long 220L>
	//   22   43:invokevirtual   #633 <Method void ScaleAnimation.setDuration(long)>
		((AnimationSet) (context)).addAnimation(((Animation) (obj)));
	//   23   46:aload_0         
	//   24   47:aload           5
	//   25   49:invokevirtual   #636 <Method void AnimationSet.addAnimation(Animation)>
		obj = ((Object) (new AlphaAnimation(f2, f3)));
	//   26   52:new             #603 <Class AlphaAnimation>
	//   27   55:dup             
	//   28   56:fload_3         
	//   29   57:fload           4
	//   30   59:invokespecial   #606 <Method void AlphaAnimation(float, float)>
	//   31   62:astore          5
		((AlphaAnimation) (obj)).setInterpolator(DECELERATE_CUBIC);
	//   32   64:aload           5
	//   33   66:getstatic       #147 <Field Interpolator DECELERATE_CUBIC>
	//   34   69:invokevirtual   #610 <Method void AlphaAnimation.setInterpolator(Interpolator)>
		((AlphaAnimation) (obj)).setDuration(220L);
	//   35   72:aload           5
	//   36   74:ldc2w           #611 <Long 220L>
	//   37   77:invokevirtual   #616 <Method void AlphaAnimation.setDuration(long)>
		((AnimationSet) (context)).addAnimation(((Animation) (obj)));
	//   38   80:aload_0         
	//   39   81:aload           5
	//   40   83:invokevirtual   #636 <Method void AnimationSet.addAnimation(Animation)>
		return new AnimationOrAnimator(((Animation) (context)));
	//   41   86:new             #24  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   42   89:dup             
	//   43   90:aload_0         
	//   44   91:aconst_null     
	//   45   92:invokespecial   #619 <Method void FragmentManagerImpl$AnimationOrAnimator(Animation, FragmentManagerImpl$1)>
	//   46   95:areturn         
	}

	private void makeRemovedFragmentsInvisible(ArraySet arrayset)
	{
		int j = arrayset.size();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #637 <Method int ArraySet.size()>
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
	//   10   14:invokevirtual   #638 <Method Object ArraySet.valueAt(int)>
	//   11   17:checkcast       #208 <Class Fragment>
	//   12   20:astore          4
			if(!fragment.mAdded)
	//*  13   22:aload           4
	//*  14   24:getfield        #640 <Field boolean Fragment.mAdded>
	//*  15   27:ifne            53
			{
				View view = fragment.getView();
	//   16   30:aload           4
	//   17   32:invokevirtual   #643 <Method View Fragment.getView()>
	//   18   35:astore          5
				fragment.mPostponedAlpha = view.getAlpha();
	//   19   37:aload           4
	//   20   39:aload           5
	//   21   41:invokevirtual   #647 <Method float View.getAlpha()>
	//   22   44:putfield        #396 <Field float Fragment.mPostponedAlpha>
				view.setAlpha(0.0F);
	//   23   47:aload           5
	//   24   49:fconst_0        
	//   25   50:invokevirtual   #399 <Method void View.setAlpha(float)>
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
		if(animator != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       6
_L1:
		return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
_L2:
		if(!(animator instanceof ValueAnimator))
			break; /* Loop/switch isn't completed */
	//    4    6:aload_0         
	//    5    7:instanceof      #651 <Class ValueAnimator>
	//    6   10:ifeq            53
		animator = ((Animator) (((ValueAnimator)animator).getValues()));
	//    7   13:aload_0         
	//    8   14:checkcast       #651 <Class ValueAnimator>
	//    9   17:invokevirtual   #655 <Method PropertyValuesHolder[] ValueAnimator.getValues()>
	//   10   20:astore_0        
		int i = 0;
	//   11   21:iconst_0        
	//   12   22:istore_1        
		while(i < animator.length) 
	//*  13   23:iload_1         
	//*  14   24:aload_0         
	//*  15   25:arraylength     
	//*  16   26:icmpge          4
		{
			if("alpha".equals(((Object) (((PropertyValuesHolder) (animator[i])).getPropertyName()))))
	//*  17   29:ldc2            #657 <String "alpha">
	//*  18   32:aload_0         
	//*  19   33:iload_1         
	//*  20   34:aaload          
	//*  21   35:invokevirtual   #662 <Method String PropertyValuesHolder.getPropertyName()>
	//*  22   38:invokevirtual   #667 <Method boolean String.equals(Object)>
	//*  23   41:ifeq            46
				return true;
	//   24   44:iconst_1        
	//   25   45:ireturn         
			i++;
	//   26   46:iload_1         
	//   27   47:iconst_1        
	//   28   48:iadd            
	//   29   49:istore_1        
		}
		if(true) goto _L1; else goto _L3
	//   30   50:goto            23
_L3:
		if(animator instanceof AnimatorSet)
	//*  31   53:aload_0         
	//*  32   54:instanceof      #669 <Class AnimatorSet>
	//*  33   57:ifeq            4
		{
			animator = ((Animator) (((AnimatorSet)animator).getChildAnimations()));
	//   34   60:aload_0         
	//   35   61:checkcast       #669 <Class AnimatorSet>
	//   36   64:invokevirtual   #673 <Method ArrayList AnimatorSet.getChildAnimations()>
	//   37   67:astore_0        
			int j = 0;
	//   38   68:iconst_0        
	//   39   69:istore_1        
			while(j < ((List) (animator)).size()) 
	//*  40   70:iload_1         
	//*  41   71:aload_0         
	//*  42   72:invokeinterface #676 <Method int List.size()>
	//*  43   77:icmpge          4
			{
				if(modifiesAlpha((Animator)((List) (animator)).get(j)))
	//*  44   80:aload_0         
	//*  45   81:iload_1         
	//*  46   82:invokeinterface #677 <Method Object List.get(int)>
	//*  47   87:checkcast       #298 <Class Animator>
	//*  48   90:invokestatic    #679 <Method boolean modifiesAlpha(Animator)>
	//*  49   93:ifeq            98
					return true;
	//   50   96:iconst_1        
	//   51   97:ireturn         
				j++;
	//   52   98:iload_1         
	//   53   99:iconst_1        
	//   54  100:iadd            
	//   55  101:istore_1        
			}
		}
		if(true) goto _L1; else goto _L4
	//   56  102:goto            70
_L4:
	}

	static boolean modifiesAlpha(AnimationOrAnimator animationoranimator)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(!(animationoranimator.animation instanceof AlphaAnimation)) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #250 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//    4    6:instanceof      #603 <Class AlphaAnimation>
	//    5    9:ifeq            16
_L1:
		boolean flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_2        
_L4:
		return flag;
	//    8   14:iload_2         
	//    9   15:ireturn         
_L2:
label0:
		{
			if(!(animationoranimator.animation instanceof AnimationSet))
				break label0;
	//   10   16:aload_0         
	//   11   17:getfield        #250 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   12   20:instanceof      #623 <Class AnimationSet>
	//   13   23:ifeq            73
			animationoranimator = ((AnimationOrAnimator) (((AnimationSet)animationoranimator.animation).getAnimations()));
	//   14   26:aload_0         
	//   15   27:getfield        #250 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   16   30:checkcast       #623 <Class AnimationSet>
	//   17   33:invokevirtual   #684 <Method List AnimationSet.getAnimations()>
	//   18   36:astore_0        
			int i = 0;
	//   19   37:iconst_0        
	//   20   38:istore_1        
			do
			{
				flag = flag1;
	//   21   39:iload_3         
	//   22   40:istore_2        
				if(i >= ((List) (animationoranimator)).size())
					break;
	//   23   41:iload_1         
	//   24   42:aload_0         
	//   25   43:invokeinterface #676 <Method int List.size()>
	//   26   48:icmpge          14
				if(((List) (animationoranimator)).get(i) instanceof AlphaAnimation)
	//*  27   51:aload_0         
	//*  28   52:iload_1         
	//*  29   53:invokeinterface #677 <Method Object List.get(int)>
	//*  30   58:instanceof      #603 <Class AlphaAnimation>
	//*  31   61:ifeq            66
					return true;
	//   32   64:iconst_1        
	//   33   65:ireturn         
				i++;
	//   34   66:iload_1         
	//   35   67:iconst_1        
	//   36   68:iadd            
	//   37   69:istore_1        
			} while(true);
	//   38   70:goto            39
		}
		if(true) goto _L4; else goto _L3
_L3:
		return modifiesAlpha(animationoranimator.animator);
	//   39   73:aload_0         
	//   40   74:getfield        #281 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   41   77:invokestatic    #679 <Method boolean modifiesAlpha(Animator)>
	//   42   80:ireturn         
	}

	private boolean popBackStackImmediate(String s, int i, int j)
	{
		boolean flag;
		execPendingActions();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #408 <Method boolean execPendingActions()>
	//    2    4:pop             
		ensureExecReady(true);
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokespecial   #688 <Method void ensureExecReady(boolean)>
		if(mPrimaryNav != null && i < 0 && s == null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #690 <Field Fragment mPrimaryNav>
	//*   8   14:ifnull          49
	//*   9   17:iload_2         
	//*  10   18:ifge            49
	//*  11   21:aload_1         
	//*  12   22:ifnonnull       49
		{
			FragmentManager fragmentmanager = mPrimaryNav.peekChildFragmentManager();
	//   13   25:aload_0         
	//   14   26:getfield        #690 <Field Fragment mPrimaryNav>
	//   15   29:invokevirtual   #694 <Method FragmentManager Fragment.peekChildFragmentManager()>
	//   16   32:astore          5
			if(fragmentmanager != null && fragmentmanager.popBackStackImmediate())
	//*  17   34:aload           5
	//*  18   36:ifnull          49
	//*  19   39:aload           5
	//*  20   41:invokevirtual   #696 <Method boolean FragmentManager.popBackStackImmediate()>
	//*  21   44:ifeq            49
				return true;
	//   22   47:iconst_1        
	//   23   48:ireturn         
		}
		flag = popBackStackState(mTmpRecords, mTmpIsPop, s, i, j);
	//   24   49:aload_0         
	//   25   50:aload_0         
	//   26   51:getfield        #361 <Field ArrayList mTmpRecords>
	//   27   54:aload_0         
	//   28   55:getfield        #356 <Field ArrayList mTmpIsPop>
	//   29   58:aload_1         
	//   30   59:iload_2         
	//   31   60:iload_3         
	//   32   61:invokevirtual   #700 <Method boolean popBackStackState(ArrayList, ArrayList, String, int, int)>
	//   33   64:istore          4
		if(!flag)
			break MISSING_BLOCK_LABEL_92;
	//   34   66:iload           4
	//   35   68:ifeq            92
		mExecutingActions = true;
	//   36   71:aload_0         
	//   37   72:iconst_1        
	//   38   73:putfield        #354 <Field boolean mExecutingActions>
		removeRedundantOperationsAndExecute(mTmpRecords, mTmpIsPop);
	//   39   76:aload_0         
	//   40   77:aload_0         
	//   41   78:getfield        #361 <Field ArrayList mTmpRecords>
	//   42   81:aload_0         
	//   43   82:getfield        #356 <Field ArrayList mTmpIsPop>
	//   44   85:invokespecial   #703 <Method void removeRedundantOperationsAndExecute(ArrayList, ArrayList)>
		cleanupExec();
	//   45   88:aload_0         
	//   46   89:invokespecial   #705 <Method void cleanupExec()>
		doPendingDeferredStart();
	//   47   92:aload_0         
	//   48   93:invokevirtual   #708 <Method void doPendingDeferredStart()>
		burpActive();
	//   49   96:aload_0         
	//   50   97:invokespecial   #710 <Method void burpActive()>
		return flag;
	//   51  100:iload           4
	//   52  102:ireturn         
		s;
	//   53  103:astore_1        
		cleanupExec();
	//   54  104:aload_0         
	//   55  105:invokespecial   #705 <Method void cleanupExec()>
		throw s;
	//   56  108:aload_1         
	//   57  109:athrow          
	}

	private int postponePostponableTransactions(ArrayList arraylist, ArrayList arraylist1, int i, int j, ArraySet arrayset)
	{
		int l = j - 1;
	//    0    0:iload           4
	//    1    2:iconst_1        
	//    2    3:isub            
	//    3    4:istore          7
		int k = j;
	//    4    6:iload           4
	//    5    8:istore          6
		while(l >= i) 
	//*   6   10:iload           7
	//*   7   12:iload_3         
	//*   8   13:icmplt          188
		{
			BackStackRecord backstackrecord = (BackStackRecord)arraylist.get(l);
	//    9   16:aload_1         
	//   10   17:iload           7
	//   11   19:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #363 <Class BackStackRecord>
	//   13   25:astore          10
			boolean flag1 = ((Boolean)arraylist1.get(l)).booleanValue();
	//   14   27:aload_2         
	//   15   28:iload           7
	//   16   30:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   17   33:checkcast       #372 <Class Boolean>
	//   18   36:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//   19   39:istore          9
			boolean flag;
			StartEnterTransitionListener startentertransitionlistener;
			if(backstackrecord.isPostponed() && !backstackrecord.interactsWith(arraylist, l + 1, j))
	//*  20   41:aload           10
	//*  21   43:invokevirtual   #713 <Method boolean BackStackRecord.isPostponed()>
	//*  22   46:ifeq            173
	//*  23   49:aload           10
	//*  24   51:aload_1         
	//*  25   52:iload           7
	//*  26   54:iconst_1        
	//*  27   55:iadd            
	//*  28   56:iload           4
	//*  29   58:invokevirtual   #542 <Method boolean BackStackRecord.interactsWith(ArrayList, int, int)>
	//*  30   61:ifne            173
				flag = true;
	//   31   64:iconst_1        
	//   32   65:istore          8
			else
	//*  33   67:iload           8
	//*  34   69:ifeq            191
	//*  35   72:aload_0         
	//*  36   73:getfield        #521 <Field ArrayList mPostponedTransactions>
	//*  37   76:ifnonnull       90
	//*  38   79:aload_0         
	//*  39   80:new             #161 <Class ArrayList>
	//*  40   83:dup             
	//*  41   84:invokespecial   #162 <Method void ArrayList()>
	//*  42   87:putfield        #521 <Field ArrayList mPostponedTransactions>
	//*  43   90:new             #39  <Class FragmentManagerImpl$StartEnterTransitionListener>
	//*  44   93:dup             
	//*  45   94:aload           10
	//*  46   96:iload           9
	//*  47   98:invokespecial   #716 <Method void FragmentManagerImpl$StartEnterTransitionListener(BackStackRecord, boolean)>
	//*  48  101:astore          11
	//*  49  103:aload_0         
	//*  50  104:getfield        #521 <Field ArrayList mPostponedTransactions>
	//*  51  107:aload           11
	//*  52  109:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//*  53  112:pop             
	//*  54  113:aload           10
	//*  55  115:aload           11
	//*  56  117:invokevirtual   #720 <Method void BackStackRecord.setOnStartPostponedListener(Fragment$OnStartEnterTransitionListener)>
	//*  57  120:iload           9
	//*  58  122:ifeq            179
	//*  59  125:aload           10
	//*  60  127:invokevirtual   #402 <Method void BackStackRecord.executeOps()>
	//*  61  130:iload           6
	//*  62  132:iconst_1        
	//*  63  133:isub            
	//*  64  134:istore          6
	//*  65  136:iload           7
	//*  66  138:iload           6
	//*  67  140:icmpeq          158
	//*  68  143:aload_1         
	//*  69  144:iload           7
	//*  70  146:invokevirtual   #545 <Method Object ArrayList.remove(int)>
	//*  71  149:pop             
	//*  72  150:aload_1         
	//*  73  151:iload           6
	//*  74  153:aload           10
	//*  75  155:invokevirtual   #723 <Method void ArrayList.add(int, Object)>
	//*  76  158:aload_0         
	//*  77  159:aload           5
	//*  78  161:invokespecial   #500 <Method void addAddedFragments(ArraySet)>
	//*  79  164:iload           7
	//*  80  166:iconst_1        
	//*  81  167:isub            
	//*  82  168:istore          7
	//*  83  170:goto            10
				flag = false;
	//   84  173:iconst_0        
	//   85  174:istore          8
			if(!flag)
				continue;
			if(mPostponedTransactions == null)
				mPostponedTransactions = new ArrayList();
			startentertransitionlistener = new StartEnterTransitionListener(backstackrecord, flag1);
			mPostponedTransactions.add(((Object) (startentertransitionlistener)));
			backstackrecord.setOnStartPostponedListener(((Fragment.OnStartEnterTransitionListener) (startentertransitionlistener)));
			if(flag1)
				backstackrecord.executeOps();
			else
	//*  86  176:goto            67
				backstackrecord.executePopOps(false);
	//   87  179:aload           10
	//   88  181:iconst_0        
	//   89  182:invokevirtual   #367 <Method void BackStackRecord.executePopOps(boolean)>
			k--;
			if(l != k)
			{
				arraylist.remove(l);
				arraylist.add(k, ((Object) (backstackrecord)));
			}
			addAddedFragments(arrayset);
			l--;
		}
	//*  90  185:goto            130
		return k;
	//   91  188:iload           6
	//   92  190:ireturn         
	//*  93  191:goto            164
	}

	private void removeRedundantOperationsAndExecute(ArrayList arraylist, ArrayList arraylist1)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(arraylist != null && !arraylist.isEmpty())
	//*   2    2:aload_1         
	//*   3    3:ifnull          13
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #555 <Method boolean ArrayList.isEmpty()>
	//*   6   10:ifeq            14
	//*   7   13:return          
		{
			if(arraylist1 == null || arraylist.size() != arraylist1.size())
	//*   8   14:aload_2         
	//*   9   15:ifnull          29
	//*  10   18:aload_1         
	//*  11   19:invokevirtual   #202 <Method int ArrayList.size()>
	//*  12   22:aload_2         
	//*  13   23:invokevirtual   #202 <Method int ArrayList.size()>
	//*  14   26:icmpeq          40
				throw new IllegalStateException("Internal error with the back stack records");
	//   15   29:new             #331 <Class IllegalStateException>
	//   16   32:dup             
	//   17   33:ldc2            #726 <String "Internal error with the back stack records">
	//   18   36:invokespecial   #336 <Method void IllegalStateException(String)>
	//   19   39:athrow          
			executePostponedTransaction(arraylist, arraylist1);
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:aload_2         
	//   23   43:invokespecial   #463 <Method void executePostponedTransaction(ArrayList, ArrayList)>
			int l = arraylist.size();
	//   24   46:aload_1         
	//   25   47:invokevirtual   #202 <Method int ArrayList.size()>
	//   26   50:istore          6
			int j = 0;
	//   27   52:iconst_0        
	//   28   53:istore          4
			for(; i < l; i++)
	//*  29   55:iload_3         
	//*  30   56:iload           6
	//*  31   58:icmpge          202
			{
				if(((BackStackRecord)arraylist.get(i)).mReorderingAllowed)
					continue;
	//   32   61:aload_1         
	//   33   62:iload_3         
	//   34   63:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   35   66:checkcast       #363 <Class BackStackRecord>
	//   36   69:getfield        #475 <Field boolean BackStackRecord.mReorderingAllowed>
	//   37   72:ifne            220
				if(j != i)
	//*  38   75:iload           4
	//*  39   77:iload_3         
	//*  40   78:icmpeq          90
					executeOpsTogether(arraylist, arraylist1, j, i);
	//   41   81:aload_0         
	//   42   82:aload_1         
	//   43   83:aload_2         
	//   44   84:iload           4
	//   45   86:iload_3         
	//   46   87:invokespecial   #728 <Method void executeOpsTogether(ArrayList, ArrayList, int, int)>
				int k = i + 1;
	//   47   90:iload_3         
	//   48   91:iconst_1        
	//   49   92:iadd            
	//   50   93:istore          5
				j = k;
	//   51   95:iload           5
	//   52   97:istore          4
				if(((Boolean)arraylist1.get(i)).booleanValue())
	//*  53   99:aload_2         
	//*  54  100:iload_3         
	//*  55  101:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//*  56  104:checkcast       #372 <Class Boolean>
	//*  57  107:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//*  58  110:ifeq            171
					do
					{
						j = k;
	//   59  113:iload           5
	//   60  115:istore          4
						if(k >= l)
							break;
	//   61  117:iload           5
	//   62  119:iload           6
	//   63  121:icmpge          171
						j = k;
	//   64  124:iload           5
	//   65  126:istore          4
						if(!((Boolean)arraylist1.get(k)).booleanValue())
							break;
	//   66  128:aload_2         
	//   67  129:iload           5
	//   68  131:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   69  134:checkcast       #372 <Class Boolean>
	//   70  137:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//   71  140:ifeq            171
						j = k;
	//   72  143:iload           5
	//   73  145:istore          4
						if(((BackStackRecord)arraylist.get(k)).mReorderingAllowed)
							break;
	//   74  147:aload_1         
	//   75  148:iload           5
	//   76  150:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   77  153:checkcast       #363 <Class BackStackRecord>
	//   78  156:getfield        #475 <Field boolean BackStackRecord.mReorderingAllowed>
	//   79  159:ifne            171
						k++;
	//   80  162:iload           5
	//   81  164:iconst_1        
	//   82  165:iadd            
	//   83  166:istore          5
					} while(true);
	//   84  168:goto            113
				executeOpsTogether(arraylist, arraylist1, i, j);
	//   85  171:aload_0         
	//   86  172:aload_1         
	//   87  173:aload_2         
	//   88  174:iload_3         
	//   89  175:iload           4
	//   90  177:invokespecial   #728 <Method void executeOpsTogether(ArrayList, ArrayList, int, int)>
				i = j;
	//   91  180:iload           4
	//   92  182:istore_3        
				k = j - 1;
	//   93  183:iload           4
	//   94  185:iconst_1        
	//   95  186:isub            
	//   96  187:istore          5
				j = i;
	//   97  189:iload_3         
	//   98  190:istore          4
				i = k;
	//   99  192:iload           5
	//  100  194:istore_3        
			}

	//  101  195:iload_3         
	//  102  196:iconst_1        
	//  103  197:iadd            
	//  104  198:istore_3        
	//* 105  199:goto            55
			if(j != l)
	//* 106  202:iload           4
	//* 107  204:iload           6
	//* 108  206:icmpeq          13
			{
				executeOpsTogether(arraylist, arraylist1, j, l);
	//  109  209:aload_0         
	//  110  210:aload_1         
	//  111  211:aload_2         
	//  112  212:iload           4
	//  113  214:iload           6
	//  114  216:invokespecial   #728 <Method void executeOpsTogether(ArrayList, ArrayList, int, int)>
				return;
	//  115  219:return          
			}
		}
	//* 116  220:goto            195
	}

	public static int reverseTransit(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:lookupswitch    3: default 36
	//	               4097: 38
	//	               4099: 46
	//	               8194: 42
		default:
			return 0;
	//    2   36:iconst_0        
	//    3   37:ireturn         

		case 4097: 
			return 8194;
	//    4   38:sipush          8194
	//    5   41:ireturn         

		case 8194: 
			return 4097;
	//    6   42:sipush          4097
	//    7   45:ireturn         

		case 4099: 
			return 4099;
	//    8   46:sipush          4099
	//    9   49:ireturn         
		}
	}

	private void scheduleCommit()
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		this;
	//    2    2:aload_0         
		JVM INSTR monitorenter ;
	//    3    3:monitorenter    
		boolean flag;
		Exception exception;
		if(mPostponedTransactions != null && !mPostponedTransactions.isEmpty())
	//*   4    4:aload_0         
	//*   5    5:getfield        #521 <Field ArrayList mPostponedTransactions>
	//*   6    8:ifnull          92
	//*   7   11:aload_0         
	//*   8   12:getfield        #521 <Field ArrayList mPostponedTransactions>
	//*   9   15:invokevirtual   #555 <Method boolean ArrayList.isEmpty()>
	//*  10   18:ifne            92
			flag = true;
	//   11   21:iconst_1        
	//   12   22:istore_1        
		else
	//*  13   23:aload_0         
	//*  14   24:getfield        #559 <Field ArrayList mPendingActions>
	//*  15   27:ifnull          97
	//*  16   30:aload_0         
	//*  17   31:getfield        #559 <Field ArrayList mPendingActions>
	//*  18   34:invokevirtual   #202 <Method int ArrayList.size()>
	//*  19   37:iconst_1        
	//*  20   38:icmpne          97
	//*  21   41:goto            81
	//*  22   44:aload_0         
	//*  23   45:getfield        #444 <Field FragmentHostCallback mHost>
	//*  24   48:invokevirtual   #450 <Method Handler FragmentHostCallback.getHandler()>
	//*  25   51:aload_0         
	//*  26   52:getfield        #180 <Field Runnable mExecCommit>
	//*  27   55:invokevirtual   #566 <Method void Handler.removeCallbacks(Runnable)>
	//*  28   58:aload_0         
	//*  29   59:getfield        #444 <Field FragmentHostCallback mHost>
	//*  30   62:invokevirtual   #450 <Method Handler FragmentHostCallback.getHandler()>
	//*  31   65:aload_0         
	//*  32   66:getfield        #180 <Field Runnable mExecCommit>
	//*  33   69:invokevirtual   #733 <Method boolean Handler.post(Runnable)>
	//*  34   72:pop             
	//*  35   73:aload_0         
	//*  36   74:monitorexit     
	//*  37   75:return          
	//*  38   76:astore_3        
	//*  39   77:aload_0         
	//*  40   78:monitorexit     
	//*  41   79:aload_3         
	//*  42   80:athrow          
	//*  43   81:iload_1         
	//*  44   82:ifne            44
	//*  45   85:iload_2         
	//*  46   86:ifeq            73
	//*  47   89:goto            44
			flag = false;
	//   48   92:iconst_0        
	//   49   93:istore_1        
		if(mPendingActions == null || mPendingActions.size() != 1)
	//*  50   94:goto            23
			flag1 = false;
	//   51   97:iconst_0        
	//   52   98:istore_2        
		  goto _L1
_L2:
		mHost.getHandler().removeCallbacks(mExecCommit);
		mHost.getHandler().post(mExecCommit);
_L3:
		this;
		JVM INSTR monitorexit ;
		return;
		exception;
		this;
		JVM INSTR monitorexit ;
		throw exception;
_L1:
		if(!flag && !flag1) goto _L3; else goto _L2
	//*  53   99:goto            81
	}

	private static void setHWLayerAnimListenerIfAlpha(View view, AnimationOrAnimator animationoranimator)
	{
		while(view == null || animationoranimator == null || !shouldRunOnHWLayer(view, animationoranimator)) 
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       9
			return;
	//    4    8:return          
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokestatic    #737 <Method boolean shouldRunOnHWLayer(View, FragmentManagerImpl$AnimationOrAnimator)>
	//    8   14:ifeq            8
		if(animationoranimator.animator != null)
	//*   9   17:aload_1         
	//*  10   18:getfield        #281 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//*  11   21:ifnull          40
		{
			animationoranimator.animator.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorOnHWLayerIfNeededListener(view))));
	//   12   24:aload_1         
	//   13   25:getfield        #281 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   14   28:new             #27  <Class FragmentManagerImpl$AnimatorOnHWLayerIfNeededListener>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #739 <Method void FragmentManagerImpl$AnimatorOnHWLayerIfNeededListener(View)>
	//   18   36:invokevirtual   #302 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
			return;
	//   19   39:return          
		} else
		{
			android.view.animation.Animation.AnimationListener animationlistener = getAnimationListener(animationoranimator.animation);
	//   20   40:aload_1         
	//   21   41:getfield        #250 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   22   44:invokestatic    #258 <Method android.view.animation.Animation$AnimationListener getAnimationListener(Animation)>
	//   23   47:astore_2        
			view.setLayerType(2, ((android.graphics.Paint) (null)));
	//   24   48:aload_0         
	//   25   49:iconst_2        
	//   26   50:aconst_null     
	//   27   51:invokevirtual   #743 <Method void View.setLayerType(int, android.graphics.Paint)>
			animationoranimator.animation.setAnimationListener(((android.view.animation.Animation.AnimationListener) (new AnimateOnHWLayerIfNeededListener(view, animationlistener))));
	//   28   54:aload_1         
	//   29   55:getfield        #250 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   30   58:new             #16  <Class FragmentManagerImpl$AnimateOnHWLayerIfNeededListener>
	//   31   61:dup             
	//   32   62:aload_0         
	//   33   63:aload_2         
	//   34   64:invokespecial   #746 <Method void FragmentManagerImpl$AnimateOnHWLayerIfNeededListener(View, android.view.animation.Animation$AnimationListener)>
	//   35   67:invokevirtual   #267 <Method void Animation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
			return;
	//   36   70:return          
		}
	}

	private static void setRetaining(FragmentManagerNonConfig fragmentmanagernonconfig)
	{
		if(fragmentmanagernonconfig != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       5
_L1:
		return;
	//    2    4:return          
_L2:
		Object obj = ((Object) (fragmentmanagernonconfig.getFragments()));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #753 <Method List FragmentManagerNonConfig.getFragments()>
	//    5    9:astore_1        
		if(obj != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          46
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*   8   14:aload_1         
	//*   9   15:invokeinterface #757 <Method Iterator List.iterator()>
	//*  10   20:astore_1        
	//*  11   21:aload_1         
	//*  12   22:invokeinterface #762 <Method boolean Iterator.hasNext()>
	//*  13   27:ifeq            46
				((Fragment)((Iterator) (obj)).next()).mRetaining = true;
	//   14   30:aload_1         
	//   15   31:invokeinterface #766 <Method Object Iterator.next()>
	//   16   36:checkcast       #208 <Class Fragment>
	//   17   39:iconst_1        
	//   18   40:putfield        #769 <Field boolean Fragment.mRetaining>

	//*  19   43:goto            21
		fragmentmanagernonconfig = ((FragmentManagerNonConfig) (fragmentmanagernonconfig.getChildNonConfigs()));
	//   20   46:aload_0         
	//   21   47:invokevirtual   #772 <Method List FragmentManagerNonConfig.getChildNonConfigs()>
	//   22   50:astore_0        
		if(fragmentmanagernonconfig != null)
	//*  23   51:aload_0         
	//*  24   52:ifnull          4
		{
			fragmentmanagernonconfig = ((FragmentManagerNonConfig) (((List) (fragmentmanagernonconfig)).iterator()));
	//   25   55:aload_0         
	//   26   56:invokeinterface #757 <Method Iterator List.iterator()>
	//   27   61:astore_0        
			while(((Iterator) (fragmentmanagernonconfig)).hasNext()) 
	//*  28   62:aload_0         
	//*  29   63:invokeinterface #762 <Method boolean Iterator.hasNext()>
	//*  30   68:ifeq            4
				setRetaining((FragmentManagerNonConfig)((Iterator) (fragmentmanagernonconfig)).next());
	//   31   71:aload_0         
	//   32   72:invokeinterface #766 <Method Object Iterator.next()>
	//   33   77:checkcast       #750 <Class FragmentManagerNonConfig>
	//   34   80:invokestatic    #774 <Method void setRetaining(FragmentManagerNonConfig)>
		}
		if(true) goto _L1; else goto _L3
	//   35   83:goto            62
_L3:
	}

	static boolean shouldRunOnHWLayer(View view, AnimationOrAnimator animationoranimator)
	{
		while(view == null || animationoranimator == null || android.os.Build.VERSION.SDK_INT < 19 || view.getLayerType() != 0 || !ViewCompat.hasOverlappingRendering(view) || !modifiesAlpha(animationoranimator)) 
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       10
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
	//    6   10:getstatic       #779 <Field int android.os.Build$VERSION.SDK_INT>
	//    7   13:bipush          19
	//    8   15:icmplt          8
	//    9   18:aload_0         
	//   10   19:invokevirtual   #782 <Method int View.getLayerType()>
	//   11   22:ifne            8
	//   12   25:aload_0         
	//   13   26:invokestatic    #788 <Method boolean ViewCompat.hasOverlappingRendering(View)>
	//   14   29:ifeq            8
	//   15   32:aload_1         
	//   16   33:invokestatic    #790 <Method boolean modifiesAlpha(FragmentManagerImpl$AnimationOrAnimator)>
	//   17   36:ifeq            8
		return true;
	//   18   39:iconst_1        
	//   19   40:ireturn         
	}

	private void throwException(RuntimeException runtimeexception)
	{
		Log.e("FragmentManager", runtimeexception.getMessage());
	//    0    0:ldc1            #67  <String "FragmentManager">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #799 <Method String RuntimeException.getMessage()>
	//    3    6:invokestatic    #802 <Method int Log.e(String, String)>
	//    4    9:pop             
		Log.e("FragmentManager", "Activity state:");
	//    5   10:ldc1            #67  <String "FragmentManager">
	//    6   12:ldc2            #804 <String "Activity state:">
	//    7   15:invokestatic    #802 <Method int Log.e(String, String)>
	//    8   18:pop             
		Object obj = ((Object) (new PrintWriter(((java.io.Writer) (new LogWriter("FragmentManager"))))));
	//    9   19:new             #806 <Class PrintWriter>
	//   10   22:dup             
	//   11   23:new             #808 <Class LogWriter>
	//   12   26:dup             
	//   13   27:ldc1            #67  <String "FragmentManager">
	//   14   29:invokespecial   #809 <Method void LogWriter(String)>
	//   15   32:invokespecial   #812 <Method void PrintWriter(java.io.Writer)>
	//   16   35:astore_2        
		if(mHost != null)
	//*  17   36:aload_0         
	//*  18   37:getfield        #444 <Field FragmentHostCallback mHost>
	//*  19   40:ifnull          75
			try
			{
				mHost.onDump("  ", ((FileDescriptor) (null)), ((PrintWriter) (obj)), new String[0]);
	//   20   43:aload_0         
	//   21   44:getfield        #444 <Field FragmentHostCallback mHost>
	//   22   47:ldc2            #814 <String "  ">
	//   23   50:aconst_null     
	//   24   51:aload_2         
	//   25   52:iconst_0        
	//   26   53:anewarray       String[]
	//   27   56:invokevirtual   #818 <Method void FragmentHostCallback.onDump(String, FileDescriptor, PrintWriter, String[])>
			}
	//*  28   59:aload_1         
	//*  29   60:athrow          
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  30   61:astore_2        
			{
				Log.e("FragmentManager", "Failed dumping state", ((Throwable) (obj)));
	//   31   62:ldc1            #67  <String "FragmentManager">
	//   32   64:ldc2            #820 <String "Failed dumping state">
	//   33   67:aload_2         
	//   34   68:invokestatic    #597 <Method int Log.e(String, String, Throwable)>
	//   35   71:pop             
			}
		else
	//*  36   72:goto            59
			try
			{
				dump("  ", ((FileDescriptor) (null)), ((PrintWriter) (obj)), new String[0]);
	//   37   75:aload_0         
	//   38   76:ldc2            #814 <String "  ">
	//   39   79:aconst_null     
	//   40   80:aload_2         
	//   41   81:iconst_0        
	//   42   82:anewarray       String[]
	//   43   85:invokevirtual   #823 <Method void dump(String, FileDescriptor, PrintWriter, String[])>
			}
	//*  44   88:goto            59
			catch(Exception exception)
	//*  45   91:astore_2        
			{
				Log.e("FragmentManager", "Failed dumping state", ((Throwable) (exception)));
	//   46   92:ldc1            #67  <String "FragmentManager">
	//   47   94:ldc2            #820 <String "Failed dumping state">
	//   48   97:aload_2         
	//   49   98:invokestatic    #597 <Method int Log.e(String, String, Throwable)>
	//   50  101:pop             
			}
		throw runtimeexception;
	//*  51  102:goto            59
	}

	public static int transitToStyleIndex(int i, boolean flag)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:lookupswitch    3: default 36
	//	               4097: 38
	//	               4099: 54
	//	               8194: 46
		default:
			return -1;
	//    2   36:iconst_m1       
	//    3   37:ireturn         

		case 4097: 
			return !flag ? 2 : 1;
	//    4   38:iload_1         
	//    5   39:ifeq            44
	//    6   42:iconst_1        
	//    7   43:ireturn         
	//    8   44:iconst_2        
	//    9   45:ireturn         

		case 8194: 
			return !flag ? 4 : 3;
	//   10   46:iload_1         
	//   11   47:ifeq            52
	//   12   50:iconst_3        
	//   13   51:ireturn         
	//   14   52:iconst_4        
	//   15   53:ireturn         

		case 4099: 
			break;
		}
		return !flag ? 6 : 5;
	//   16   54:iload_1         
	//   17   55:ifeq            60
	//   18   58:iconst_5        
	//   19   59:ireturn         
	//   20   60:bipush          6
	//   21   62:ireturn         
	}

	void addBackStackState(BackStackRecord backstackrecord)
	{
		if(mBackStack == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #829 <Field ArrayList mBackStack>
	//*   2    4:ifnonnull       18
			mBackStack = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #161 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #162 <Method void ArrayList()>
	//    7   15:putfield        #829 <Field ArrayList mBackStack>
		mBackStack.add(((Object) (backstackrecord)));
	//    8   18:aload_0         
	//    9   19:getfield        #829 <Field ArrayList mBackStack>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//   12   26:pop             
	//   13   27:return          
	}

	public void addFragment(Fragment fragment, boolean flag)
	{
		if(DEBUG)
	//*   0    0:getstatic       #133 <Field boolean DEBUG>
	//*   1    3:ifeq            32
			Log.v("FragmentManager", (new StringBuilder()).append("add: ").append(((Object) (fragment))).toString());
	//    2    6:ldc1            #67  <String "FragmentManager">
	//    3    8:new             #340 <Class StringBuilder>
	//    4   11:dup             
	//    5   12:invokespecial   #341 <Method void StringBuilder()>
	//    6   15:ldc2            #833 <String "add: ">
	//    7   18:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//    8   21:aload_1         
	//    9   22:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   10   25:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   11   28:invokestatic    #839 <Method int Log.v(String, String)>
	//   12   31:pop             
		makeActive(fragment);
	//   13   32:aload_0         
	//   14   33:aload_1         
	//   15   34:invokevirtual   #843 <Method void makeActive(Fragment)>
		if(!fragment.mDetached)
	//*  16   37:aload_1         
	//*  17   38:getfield        #846 <Field boolean Fragment.mDetached>
	//*  18   41:ifne            151
		{
			if(mAdded.contains(((Object) (fragment))))
	//*  19   44:aload_0         
	//*  20   45:getfield        #164 <Field ArrayList mAdded>
	//*  21   48:aload_1         
	//*  22   49:invokevirtual   #849 <Method boolean ArrayList.contains(Object)>
	//*  23   52:ifeq            83
				throw new IllegalStateException((new StringBuilder()).append("Fragment already added: ").append(((Object) (fragment))).toString());
	//   24   55:new             #331 <Class IllegalStateException>
	//   25   58:dup             
	//   26   59:new             #340 <Class StringBuilder>
	//   27   62:dup             
	//   28   63:invokespecial   #341 <Method void StringBuilder()>
	//   29   66:ldc2            #851 <String "Fragment already added: ">
	//   30   69:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   31   72:aload_1         
	//   32   73:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   33   76:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   34   79:invokespecial   #336 <Method void IllegalStateException(String)>
	//   35   82:athrow          
			synchronized(mAdded)
	//*  36   83:aload_0         
	//*  37   84:getfield        #164 <Field ArrayList mAdded>
	//*  38   87:astore_3        
	//*  39   88:aload_3         
	//*  40   89:monitorenter    
			{
				mAdded.add(((Object) (fragment)));
	//   41   90:aload_0         
	//   42   91:getfield        #164 <Field ArrayList mAdded>
	//   43   94:aload_1         
	//   44   95:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//   45   98:pop             
			}
	//   46   99:aload_3         
	//   47  100:monitorexit     
			fragment.mAdded = true;
	//   48  101:aload_1         
	//   49  102:iconst_1        
	//   50  103:putfield        #640 <Field boolean Fragment.mAdded>
			fragment.mRemoving = false;
	//   51  106:aload_1         
	//   52  107:iconst_0        
	//   53  108:putfield        #854 <Field boolean Fragment.mRemoving>
			if(fragment.mView == null)
	//*  54  111:aload_1         
	//*  55  112:getfield        #225 <Field View Fragment.mView>
	//*  56  115:ifnonnull       123
				fragment.mHiddenChanged = false;
	//   57  118:aload_1         
	//   58  119:iconst_0        
	//   59  120:putfield        #857 <Field boolean Fragment.mHiddenChanged>
			if(fragment.mHasMenu && fragment.mMenuVisible)
	//*  60  123:aload_1         
	//*  61  124:getfield        #860 <Field boolean Fragment.mHasMenu>
	//*  62  127:ifeq            142
	//*  63  130:aload_1         
	//*  64  131:getfield        #863 <Field boolean Fragment.mMenuVisible>
	//*  65  134:ifeq            142
				mNeedMenuInvalidate = true;
	//   66  137:aload_0         
	//   67  138:iconst_1        
	//   68  139:putfield        #865 <Field boolean mNeedMenuInvalidate>
			if(flag)
	//*  69  142:iload_2         
	//*  70  143:ifeq            151
				moveToState(fragment);
	//   71  146:aload_0         
	//   72  147:aload_1         
	//   73  148:invokevirtual   #867 <Method void moveToState(Fragment)>
		}
		return;
	//   74  151:return          
		fragment;
	//   75  152:astore_1        
		arraylist;
	//   76  153:aload_3         
		JVM INSTR monitorexit ;
	//   77  154:monitorexit     
		throw fragment;
	//   78  155:aload_1         
	//   79  156:athrow          
	}

	public void addOnBackStackChangedListener(FragmentManager.OnBackStackChangedListener onbackstackchangedlistener)
	{
		if(mBackStackChangeListeners == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #871 <Field ArrayList mBackStackChangeListeners>
	//*   2    4:ifnonnull       18
			mBackStackChangeListeners = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #161 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #162 <Method void ArrayList()>
	//    7   15:putfield        #871 <Field ArrayList mBackStackChangeListeners>
		mBackStackChangeListeners.add(((Object) (onbackstackchangedlistener)));
	//    8   18:aload_0         
	//    9   19:getfield        #871 <Field ArrayList mBackStackChangeListeners>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//   12   26:pop             
	//   13   27:return          
	}

	public int allocBackStackIndex(BackStackRecord backstackrecord)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		if(mAvailBackStackIndices != null && mAvailBackStackIndices.size() > 0)
			break MISSING_BLOCK_LABEL_100;
	//    2    2:aload_0         
	//    3    3:getfield        #875 <Field ArrayList mAvailBackStackIndices>
	//    4    6:ifnull          19
	//    5    9:aload_0         
	//    6   10:getfield        #875 <Field ArrayList mAvailBackStackIndices>
	//    7   13:invokevirtual   #202 <Method int ArrayList.size()>
	//    8   16:ifgt            100
		if(mBackStackIndices == null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #877 <Field ArrayList mBackStackIndices>
	//*  11   23:ifnonnull       37
			mBackStackIndices = new ArrayList();
	//   12   26:aload_0         
	//   13   27:new             #161 <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #162 <Method void ArrayList()>
	//   16   34:putfield        #877 <Field ArrayList mBackStackIndices>
		i = mBackStackIndices.size();
	//   17   37:aload_0         
	//   18   38:getfield        #877 <Field ArrayList mBackStackIndices>
	//   19   41:invokevirtual   #202 <Method int ArrayList.size()>
	//   20   44:istore_2        
		if(DEBUG)
	//*  21   45:getstatic       #133 <Field boolean DEBUG>
	//*  22   48:ifeq            87
			Log.v("FragmentManager", (new StringBuilder()).append("Setting back stack index ").append(i).append(" to ").append(((Object) (backstackrecord))).toString());
	//   23   51:ldc1            #67  <String "FragmentManager">
	//   24   53:new             #340 <Class StringBuilder>
	//   25   56:dup             
	//   26   57:invokespecial   #341 <Method void StringBuilder()>
	//   27   60:ldc2            #879 <String "Setting back stack index ">
	//   28   63:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   29   66:iload_2         
	//   30   67:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//   31   70:ldc2            #884 <String " to ">
	//   32   73:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   33   76:aload_1         
	//   34   77:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   35   80:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   36   83:invokestatic    #839 <Method int Log.v(String, String)>
	//   37   86:pop             
		mBackStackIndices.add(((Object) (backstackrecord)));
	//   38   87:aload_0         
	//   39   88:getfield        #877 <Field ArrayList mBackStackIndices>
	//   40   91:aload_1         
	//   41   92:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//   42   95:pop             
		this;
	//   43   96:aload_0         
		JVM INSTR monitorexit ;
	//   44   97:monitorexit     
		return i;
	//   45   98:iload_2         
	//   46   99:ireturn         
		i = ((Integer)mAvailBackStackIndices.remove(mAvailBackStackIndices.size() - 1)).intValue();
	//   47  100:aload_0         
	//   48  101:getfield        #875 <Field ArrayList mAvailBackStackIndices>
	//   49  104:aload_0         
	//   50  105:getfield        #875 <Field ArrayList mAvailBackStackIndices>
	//   51  108:invokevirtual   #202 <Method int ArrayList.size()>
	//   52  111:iconst_1        
	//   53  112:isub            
	//   54  113:invokevirtual   #545 <Method Object ArrayList.remove(int)>
	//   55  116:checkcast       #886 <Class Integer>
	//   56  119:invokevirtual   #889 <Method int Integer.intValue()>
	//   57  122:istore_2        
		if(DEBUG)
	//*  58  123:getstatic       #133 <Field boolean DEBUG>
	//*  59  126:ifeq            165
			Log.v("FragmentManager", (new StringBuilder()).append("Adding back stack index ").append(i).append(" with ").append(((Object) (backstackrecord))).toString());
	//   60  129:ldc1            #67  <String "FragmentManager">
	//   61  131:new             #340 <Class StringBuilder>
	//   62  134:dup             
	//   63  135:invokespecial   #341 <Method void StringBuilder()>
	//   64  138:ldc2            #891 <String "Adding back stack index ">
	//   65  141:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   66  144:iload_2         
	//   67  145:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//   68  148:ldc2            #893 <String " with ">
	//   69  151:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   70  154:aload_1         
	//   71  155:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   72  158:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   73  161:invokestatic    #839 <Method int Log.v(String, String)>
	//   74  164:pop             
		mBackStackIndices.set(i, ((Object) (backstackrecord)));
	//   75  165:aload_0         
	//   76  166:getfield        #877 <Field ArrayList mBackStackIndices>
	//   77  169:iload_2         
	//   78  170:aload_1         
	//   79  171:invokevirtual   #897 <Method Object ArrayList.set(int, Object)>
	//   80  174:pop             
		this;
	//   81  175:aload_0         
		JVM INSTR monitorexit ;
	//   82  176:monitorexit     
		return i;
	//   83  177:iload_2         
	//   84  178:ireturn         
		backstackrecord;
	//   85  179:astore_1        
		this;
	//   86  180:aload_0         
		JVM INSTR monitorexit ;
	//   87  181:monitorexit     
		throw backstackrecord;
	//   88  182:aload_1         
	//   89  183:athrow          
	}

	public void attachController(FragmentHostCallback fragmenthostcallback, FragmentContainer fragmentcontainer, Fragment fragment)
	{
		if(mHost != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #444 <Field FragmentHostCallback mHost>
	//*   2    4:ifnull          18
		{
			throw new IllegalStateException("Already attached");
	//    3    7:new             #331 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #901 <String "Already attached">
	//    6   14:invokespecial   #336 <Method void IllegalStateException(String)>
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
	//*   0    0:getstatic       #133 <Field boolean DEBUG>
	//*   1    3:ifeq            32
			Log.v("FragmentManager", (new StringBuilder()).append("attach: ").append(((Object) (fragment))).toString());
	//    2    6:ldc1            #67  <String "FragmentManager">
	//    3    8:new             #340 <Class StringBuilder>
	//    4   11:dup             
	//    5   12:invokespecial   #341 <Method void StringBuilder()>
	//    6   15:ldc2            #908 <String "attach: ">
	//    7   18:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//    8   21:aload_1         
	//    9   22:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   10   25:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   11   28:invokestatic    #839 <Method int Log.v(String, String)>
	//   12   31:pop             
		if(fragment.mDetached)
	//*  13   32:aload_1         
	//*  14   33:getfield        #846 <Field boolean Fragment.mDetached>
	//*  15   36:ifeq            164
		{
			fragment.mDetached = false;
	//   16   39:aload_1         
	//   17   40:iconst_0        
	//   18   41:putfield        #846 <Field boolean Fragment.mDetached>
			if(!fragment.mAdded)
	//*  19   44:aload_1         
	//*  20   45:getfield        #640 <Field boolean Fragment.mAdded>
	//*  21   48:ifne            164
			{
				if(mAdded.contains(((Object) (fragment))))
	//*  22   51:aload_0         
	//*  23   52:getfield        #164 <Field ArrayList mAdded>
	//*  24   55:aload_1         
	//*  25   56:invokevirtual   #849 <Method boolean ArrayList.contains(Object)>
	//*  26   59:ifeq            90
					throw new IllegalStateException((new StringBuilder()).append("Fragment already added: ").append(((Object) (fragment))).toString());
	//   27   62:new             #331 <Class IllegalStateException>
	//   28   65:dup             
	//   29   66:new             #340 <Class StringBuilder>
	//   30   69:dup             
	//   31   70:invokespecial   #341 <Method void StringBuilder()>
	//   32   73:ldc2            #851 <String "Fragment already added: ">
	//   33   76:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   34   79:aload_1         
	//   35   80:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   36   83:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   37   86:invokespecial   #336 <Method void IllegalStateException(String)>
	//   38   89:athrow          
				if(DEBUG)
	//*  39   90:getstatic       #133 <Field boolean DEBUG>
	//*  40   93:ifeq            122
					Log.v("FragmentManager", (new StringBuilder()).append("add from attach: ").append(((Object) (fragment))).toString());
	//   41   96:ldc1            #67  <String "FragmentManager">
	//   42   98:new             #340 <Class StringBuilder>
	//   43  101:dup             
	//   44  102:invokespecial   #341 <Method void StringBuilder()>
	//   45  105:ldc2            #910 <String "add from attach: ">
	//   46  108:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   47  111:aload_1         
	//   48  112:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   49  115:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   50  118:invokestatic    #839 <Method int Log.v(String, String)>
	//   51  121:pop             
				synchronized(mAdded)
	//*  52  122:aload_0         
	//*  53  123:getfield        #164 <Field ArrayList mAdded>
	//*  54  126:astore_2        
	//*  55  127:aload_2         
	//*  56  128:monitorenter    
				{
					mAdded.add(((Object) (fragment)));
	//   57  129:aload_0         
	//   58  130:getfield        #164 <Field ArrayList mAdded>
	//   59  133:aload_1         
	//   60  134:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//   61  137:pop             
				}
	//   62  138:aload_2         
	//   63  139:monitorexit     
				fragment.mAdded = true;
	//   64  140:aload_1         
	//   65  141:iconst_1        
	//   66  142:putfield        #640 <Field boolean Fragment.mAdded>
				if(fragment.mHasMenu && fragment.mMenuVisible)
	//*  67  145:aload_1         
	//*  68  146:getfield        #860 <Field boolean Fragment.mHasMenu>
	//*  69  149:ifeq            164
	//*  70  152:aload_1         
	//*  71  153:getfield        #863 <Field boolean Fragment.mMenuVisible>
	//*  72  156:ifeq            164
					mNeedMenuInvalidate = true;
	//   73  159:aload_0         
	//   74  160:iconst_1        
	//   75  161:putfield        #865 <Field boolean mNeedMenuInvalidate>
			}
		}
		return;
	//   76  164:return          
		fragment;
	//   77  165:astore_1        
		arraylist;
	//   78  166:aload_2         
		JVM INSTR monitorexit ;
	//   79  167:monitorexit     
		throw fragment;
	//   80  168:aload_1         
	//   81  169:athrow          
	}

	public FragmentTransaction beginTransaction()
	{
		return ((FragmentTransaction) (new BackStackRecord(this)));
	//    0    0:new             #363 <Class BackStackRecord>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #913 <Method void BackStackRecord(FragmentManagerImpl)>
	//    4    8:areturn         
	}

	void completeShowHideFragment(final Fragment fragment)
	{
		if(fragment.mView == null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:getfield        #225 <Field View Fragment.mView>
	//    2    4:ifnull          95
_L1:
		AnimationOrAnimator animationoranimator;
		int i = fragment.getNextTransition();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #217 <Method int Fragment.getNextTransition()>
	//    5   11:istore_2        
		boolean flag;
		if(!fragment.mHidden)
	//*   6   12:aload_1         
	//*   7   13:getfield        #228 <Field boolean Fragment.mHidden>
	//*   8   16:ifne            135
			flag = true;
	//    9   19:iconst_1        
	//   10   20:istore_3        
		else
	//*  11   21:aload_0         
	//*  12   22:aload_1         
	//*  13   23:iload_2         
	//*  14   24:iload_3         
	//*  15   25:aload_1         
	//*  16   26:invokevirtual   #917 <Method int Fragment.getNextTransitionStyle()>
	//*  17   29:invokevirtual   #921 <Method FragmentManagerImpl$AnimationOrAnimator loadAnimation(Fragment, int, boolean, int)>
	//*  18   32:astore          4
	//*  19   34:aload           4
	//*  20   36:ifnull          194
	//*  21   39:aload           4
	//*  22   41:getfield        #281 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//*  23   44:ifnull          194
	//*  24   47:aload           4
	//*  25   49:getfield        #281 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//*  26   52:aload_1         
	//*  27   53:getfield        #225 <Field View Fragment.mView>
	//*  28   56:invokevirtual   #306 <Method void Animator.setTarget(Object)>
	//*  29   59:aload_1         
	//*  30   60:getfield        #228 <Field boolean Fragment.mHidden>
	//*  31   63:ifeq            183
	//*  32   66:aload_1         
	//*  33   67:invokevirtual   #924 <Method boolean Fragment.isHideReplaced()>
	//*  34   70:ifeq            140
	//*  35   73:aload_1         
	//*  36   74:iconst_0        
	//*  37   75:invokevirtual   #927 <Method void Fragment.setHideReplaced(boolean)>
	//*  38   78:aload_1         
	//*  39   79:getfield        #225 <Field View Fragment.mView>
	//*  40   82:aload           4
	//*  41   84:invokestatic    #271 <Method void setHWLayerAnimListenerIfAlpha(View, FragmentManagerImpl$AnimationOrAnimator)>
	//*  42   87:aload           4
	//*  43   89:getfield        #281 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//*  44   92:invokevirtual   #309 <Method void Animator.start()>
	//*  45   95:aload_1         
	//*  46   96:getfield        #640 <Field boolean Fragment.mAdded>
	//*  47   99:ifeq            121
	//*  48  102:aload_1         
	//*  49  103:getfield        #860 <Field boolean Fragment.mHasMenu>
	//*  50  106:ifeq            121
	//*  51  109:aload_1         
	//*  52  110:getfield        #863 <Field boolean Fragment.mMenuVisible>
	//*  53  113:ifeq            121
	//*  54  116:aload_0         
	//*  55  117:iconst_1        
	//*  56  118:putfield        #865 <Field boolean mNeedMenuInvalidate>
	//*  57  121:aload_1         
	//*  58  122:iconst_0        
	//*  59  123:putfield        #857 <Field boolean Fragment.mHiddenChanged>
	//*  60  126:aload_1         
	//*  61  127:aload_1         
	//*  62  128:getfield        #228 <Field boolean Fragment.mHidden>
	//*  63  131:invokevirtual   #930 <Method void Fragment.onHiddenChanged(boolean)>
	//*  64  134:return          
			flag = false;
	//   65  135:iconst_0        
	//   66  136:istore_3        
		animationoranimator = loadAnimation(fragment, i, flag, fragment.getNextTransitionStyle());
		if(animationoranimator == null || animationoranimator.animator == null) goto _L4; else goto _L3
_L3:
		animationoranimator.animator.setTarget(((Object) (fragment.mView)));
		if(fragment.mHidden)
		{
			if(fragment.isHideReplaced())
			{
				fragment.setHideReplaced(false);
			} else
	//*  67  137:goto            21
			{
				final ViewGroup container = fragment.mContainer;
	//   68  140:aload_1         
	//   69  141:getfield        #288 <Field ViewGroup Fragment.mContainer>
	//   70  144:astore          5
				final View animatingView = fragment.mView;
	//   71  146:aload_1         
	//   72  147:getfield        #225 <Field View Fragment.mView>
	//   73  150:astore          6
				container.startViewTransition(animatingView);
	//   74  152:aload           5
	//   75  154:aload           6
	//   76  156:invokevirtual   #293 <Method void ViewGroup.startViewTransition(View)>
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
	//   77  159:aload           4
	//   78  161:getfield        #281 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   79  164:new             #14  <Class FragmentManagerImpl$4>
	//   80  167:dup             
	//   81  168:aload_0         
	//   82  169:aload           5
	//   83  171:aload           6
	//   84  173:aload_1         
	//   85  174:invokespecial   #931 <Method void FragmentManagerImpl$4(FragmentManagerImpl, ViewGroup, View, Fragment)>
	//   86  177:invokevirtual   #302 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
			}
		} else
	//*  87  180:goto            78
		{
			fragment.mView.setVisibility(0);
	//   88  183:aload_1         
	//   89  184:getfield        #225 <Field View Fragment.mView>
	//   90  187:iconst_0        
	//   91  188:invokevirtual   #934 <Method void View.setVisibility(int)>
		}
		setHWLayerAnimListenerIfAlpha(fragment.mView, animationoranimator);
		animationoranimator.animator.start();
_L2:
		if(fragment.mAdded && fragment.mHasMenu && fragment.mMenuVisible)
			mNeedMenuInvalidate = true;
		fragment.mHiddenChanged = false;
		fragment.onHiddenChanged(fragment.mHidden);
		return;
	//*  92  191:goto            78
_L4:
		if(animationoranimator != null)
	//*  93  194:aload           4
	//*  94  196:ifnull          228
		{
			setHWLayerAnimListenerIfAlpha(fragment.mView, animationoranimator);
	//   95  199:aload_1         
	//   96  200:getfield        #225 <Field View Fragment.mView>
	//   97  203:aload           4
	//   98  205:invokestatic    #271 <Method void setHWLayerAnimListenerIfAlpha(View, FragmentManagerImpl$AnimationOrAnimator)>
			fragment.mView.startAnimation(animationoranimator.animation);
	//   99  208:aload_1         
	//  100  209:getfield        #225 <Field View Fragment.mView>
	//  101  212:aload           4
	//  102  214:getfield        #250 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//  103  217:invokevirtual   #277 <Method void View.startAnimation(Animation)>
			animationoranimator.animation.start();
	//  104  220:aload           4
	//  105  222:getfield        #250 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//  106  225:invokevirtual   #935 <Method void Animation.start()>
		}
		byte byte0;
		if(fragment.mHidden && !fragment.isHideReplaced())
	//* 107  228:aload_1         
	//* 108  229:getfield        #228 <Field boolean Fragment.mHidden>
	//* 109  232:ifeq            268
	//* 110  235:aload_1         
	//* 111  236:invokevirtual   #924 <Method boolean Fragment.isHideReplaced()>
	//* 112  239:ifne            268
			byte0 = 8;
	//  113  242:bipush          8
	//  114  244:istore_2        
		else
	//* 115  245:aload_1         
	//* 116  246:getfield        #225 <Field View Fragment.mView>
	//* 117  249:iload_2         
	//* 118  250:invokevirtual   #934 <Method void View.setVisibility(int)>
	//* 119  253:aload_1         
	//* 120  254:invokevirtual   #924 <Method boolean Fragment.isHideReplaced()>
	//* 121  257:ifeq            95
	//* 122  260:aload_1         
	//* 123  261:iconst_0        
	//* 124  262:invokevirtual   #927 <Method void Fragment.setHideReplaced(boolean)>
	//* 125  265:goto            95
			byte0 = 0;
	//  126  268:iconst_0        
	//  127  269:istore_2        
		fragment.mView.setVisibility(((int) (byte0)));
		if(fragment.isHideReplaced())
			fragment.setHideReplaced(false);
		if(true) goto _L2; else goto _L5
_L5:
	//* 128  270:goto            245
	}

	public void detachFragment(Fragment fragment)
	{
		if(DEBUG)
	//*   0    0:getstatic       #133 <Field boolean DEBUG>
	//*   1    3:ifeq            32
			Log.v("FragmentManager", (new StringBuilder()).append("detach: ").append(((Object) (fragment))).toString());
	//    2    6:ldc1            #67  <String "FragmentManager">
	//    3    8:new             #340 <Class StringBuilder>
	//    4   11:dup             
	//    5   12:invokespecial   #341 <Method void StringBuilder()>
	//    6   15:ldc2            #938 <String "detach: ">
	//    7   18:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//    8   21:aload_1         
	//    9   22:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   10   25:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   11   28:invokestatic    #839 <Method int Log.v(String, String)>
	//   12   31:pop             
		if(!fragment.mDetached)
	//*  13   32:aload_1         
	//*  14   33:getfield        #846 <Field boolean Fragment.mDetached>
	//*  15   36:ifne            125
		{
			fragment.mDetached = true;
	//   16   39:aload_1         
	//   17   40:iconst_1        
	//   18   41:putfield        #846 <Field boolean Fragment.mDetached>
			if(fragment.mAdded)
	//*  19   44:aload_1         
	//*  20   45:getfield        #640 <Field boolean Fragment.mAdded>
	//*  21   48:ifeq            125
			{
				if(DEBUG)
	//*  22   51:getstatic       #133 <Field boolean DEBUG>
	//*  23   54:ifeq            83
					Log.v("FragmentManager", (new StringBuilder()).append("remove from detach: ").append(((Object) (fragment))).toString());
	//   24   57:ldc1            #67  <String "FragmentManager">
	//   25   59:new             #340 <Class StringBuilder>
	//   26   62:dup             
	//   27   63:invokespecial   #341 <Method void StringBuilder()>
	//   28   66:ldc2            #940 <String "remove from detach: ">
	//   29   69:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   30   72:aload_1         
	//   31   73:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   32   76:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   33   79:invokestatic    #839 <Method int Log.v(String, String)>
	//   34   82:pop             
				synchronized(mAdded)
	//*  35   83:aload_0         
	//*  36   84:getfield        #164 <Field ArrayList mAdded>
	//*  37   87:astore_2        
	//*  38   88:aload_2         
	//*  39   89:monitorenter    
				{
					mAdded.remove(((Object) (fragment)));
	//   40   90:aload_0         
	//   41   91:getfield        #164 <Field ArrayList mAdded>
	//   42   94:aload_1         
	//   43   95:invokevirtual   #942 <Method boolean ArrayList.remove(Object)>
	//   44   98:pop             
				}
	//   45   99:aload_2         
	//   46  100:monitorexit     
				if(fragment.mHasMenu && fragment.mMenuVisible)
	//*  47  101:aload_1         
	//*  48  102:getfield        #860 <Field boolean Fragment.mHasMenu>
	//*  49  105:ifeq            120
	//*  50  108:aload_1         
	//*  51  109:getfield        #863 <Field boolean Fragment.mMenuVisible>
	//*  52  112:ifeq            120
					mNeedMenuInvalidate = true;
	//   53  115:aload_0         
	//   54  116:iconst_1        
	//   55  117:putfield        #865 <Field boolean mNeedMenuInvalidate>
				fragment.mAdded = false;
	//   56  120:aload_1         
	//   57  121:iconst_0        
	//   58  122:putfield        #640 <Field boolean Fragment.mAdded>
			}
		}
		return;
	//   59  125:return          
		fragment;
	//   60  126:astore_1        
		arraylist;
	//   61  127:aload_2         
		JVM INSTR monitorexit ;
	//   62  128:monitorexit     
		throw fragment;
	//   63  129:aload_1         
	//   64  130:athrow          
	}

	public void dispatchActivityCreated()
	{
		mStateSaved = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #329 <Field boolean mStateSaved>
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
	//*   4    4:getfield        #164 <Field ArrayList mAdded>
	//*   5    7:invokevirtual   #202 <Method int ArrayList.size()>
	//*   6   10:icmpge          41
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #164 <Field ArrayList mAdded>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #208 <Class Fragment>
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
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		int i = 0;
	//    2    3:iconst_0        
	//    3    4:istore_2        
		do
		{
label0:
			{
				boolean flag = flag1;
	//    4    5:iload           4
	//    5    7:istore_3        
				if(i < mAdded.size())
	//*   6    8:iload_2         
	//*   7    9:aload_0         
	//*   8   10:getfield        #164 <Field ArrayList mAdded>
	//*   9   13:invokevirtual   #202 <Method int ArrayList.size()>
	//*  10   16:icmpge          48
				{
					Fragment fragment = (Fragment)mAdded.get(i);
	//   11   19:aload_0         
	//   12   20:getfield        #164 <Field ArrayList mAdded>
	//   13   23:iload_2         
	//   14   24:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   15   27:checkcast       #208 <Class Fragment>
	//   16   30:astore          5
					if(fragment == null || !fragment.performContextItemSelected(menuitem))
						break label0;
	//   17   32:aload           5
	//   18   34:ifnull          50
	//   19   37:aload           5
	//   20   39:aload_1         
	//   21   40:invokevirtual   #955 <Method boolean Fragment.performContextItemSelected(MenuItem)>
	//   22   43:ifeq            50
					flag = true;
	//   23   46:iconst_1        
	//   24   47:istore_3        
				}
				return flag;
	//   25   48:iload_3         
	//   26   49:ireturn         
			}
			i++;
	//   27   50:iload_2         
	//   28   51:iconst_1        
	//   29   52:iadd            
	//   30   53:istore_2        
		} while(true);
	//   31   54:goto            5
	}

	public void dispatchCreate()
	{
		mStateSaved = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #329 <Field boolean mStateSaved>
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
		boolean flag1 = false;
	//    6    8:iconst_0        
	//    7    9:istore          5
		while(i < mAdded.size()) 
	//*   8   11:iload_3         
	//*   9   12:aload_0         
	//*  10   13:getfield        #164 <Field ArrayList mAdded>
	//*  11   16:invokevirtual   #202 <Method int ArrayList.size()>
	//*  12   19:icmpge          110
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//   13   22:aload_0         
	//   14   23:getfield        #164 <Field ArrayList mAdded>
	//   15   26:iload_3         
	//   16   27:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   17   30:checkcast       #208 <Class Fragment>
	//   18   33:astore          9
			ArrayList arraylist1 = arraylist;
	//   19   35:aload           7
	//   20   37:astore          8
			boolean flag2 = flag1;
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
					flag2 = true;
	//   34   66:iconst_1        
	//   35   67:istore          6
					arraylist1 = arraylist;
	//   36   69:aload           7
	//   37   71:astore          8
					if(arraylist == null)
	//*  38   73:aload           7
	//*  39   75:ifnonnull       87
						arraylist1 = new ArrayList();
	//   40   78:new             #161 <Class ArrayList>
	//   41   81:dup             
	//   42   82:invokespecial   #162 <Method void ArrayList()>
	//   43   85:astore          8
					arraylist1.add(((Object) (fragment)));
	//   44   87:aload           8
	//   45   89:aload           9
	//   46   91:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//   47   94:pop             
				}
			}
			i++;
	//   48   95:iload_3         
	//   49   96:iconst_1        
	//   50   97:iadd            
	//   51   98:istore_3        
			flag1 = flag2;
	//   52   99:iload           6
	//   53  101:istore          5
			arraylist = arraylist1;
	//   54  103:aload           8
	//   55  105:astore          7
		}
	//*  56  107:goto            11
		if(mCreatedMenus != null)
	//*  57  110:aload_0         
	//*  58  111:getfield        #963 <Field ArrayList mCreatedMenus>
	//*  59  114:ifnull          168
		{
			for(int j = ((int) (flag)); j < mCreatedMenus.size(); j++)
	//*  60  117:iload           4
	//*  61  119:istore_3        
	//*  62  120:iload_3         
	//*  63  121:aload_0         
	//*  64  122:getfield        #963 <Field ArrayList mCreatedMenus>
	//*  65  125:invokevirtual   #202 <Method int ArrayList.size()>
	//*  66  128:icmpge          168
			{
				menu = ((Menu) ((Fragment)mCreatedMenus.get(j)));
	//   67  131:aload_0         
	//   68  132:getfield        #963 <Field ArrayList mCreatedMenus>
	//   69  135:iload_3         
	//   70  136:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   71  139:checkcast       #208 <Class Fragment>
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
	//    4    6:invokevirtual   #408 <Method boolean execPendingActions()>
	//    5    9:pop             
		dispatchStateChange(0);
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:invokespecial   #945 <Method void dispatchStateChange(int)>
		mHost = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #444 <Field FragmentHostCallback mHost>
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
	//*   4    4:getfield        #164 <Field ArrayList mAdded>
	//*   5    7:invokevirtual   #202 <Method int ArrayList.size()>
	//*   6   10:icmpge          40
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #164 <Field ArrayList mAdded>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #208 <Class Fragment>
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
	//*   1    1:getfield        #164 <Field ArrayList mAdded>
	//*   2    4:invokevirtual   #202 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            42
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    8   14:aload_0         
	//    9   15:getfield        #164 <Field ArrayList mAdded>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #208 <Class Fragment>
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
	//   17   36:getfield        #169 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   39:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   42:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   20   44:aload           4
	//   21   46:invokeinterface #762 <Method boolean Iterator.hasNext()>
	//   22   51:ifeq            101
			Pair pair = (Pair)iterator.next();
	//   23   54:aload           4
	//   24   56:invokeinterface #766 <Method Object Iterator.next()>
	//   25   61:checkcast       #988 <Class Pair>
	//   26   64:astore          5
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  27   66:iload_3         
	//*  28   67:ifeq            84
	//*  29   70:aload           5
	//*  30   72:getfield        #992 <Field Object Pair.second>
	//*  31   75:checkcast       #372 <Class Boolean>
	//*  32   78:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//*  33   81:ifeq            44
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentActivityCreated(((FragmentManager) (this)), fragment, bundle);
	//   34   84:aload           5
	//   35   86:getfield        #995 <Field Object Pair.first>
	//   36   89:checkcast       #997 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   37   92:aload_0         
	//   38   93:aload_1         
	//   39   94:aload_2         
	//   40   95:invokevirtual   #1001 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentActivityCreated(FragmentManager, Fragment, Bundle)>
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
	//   15   32:invokevirtual   #1005 <Method void dispatchOnFragmentAttached(Fragment, Context, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   16   35:aload_0         
	//   17   36:getfield        #169 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   39:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   42:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   20   44:aload           4
	//   21   46:invokeinterface #762 <Method boolean Iterator.hasNext()>
	//   22   51:ifeq            101
			Pair pair = (Pair)iterator.next();
	//   23   54:aload           4
	//   24   56:invokeinterface #766 <Method Object Iterator.next()>
	//   25   61:checkcast       #988 <Class Pair>
	//   26   64:astore          5
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  27   66:iload_3         
	//*  28   67:ifeq            84
	//*  29   70:aload           5
	//*  30   72:getfield        #992 <Field Object Pair.second>
	//*  31   75:checkcast       #372 <Class Boolean>
	//*  32   78:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//*  33   81:ifeq            44
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentAttached(((FragmentManager) (this)), fragment, context);
	//   34   84:aload           5
	//   35   86:getfield        #995 <Field Object Pair.first>
	//   36   89:checkcast       #997 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   37   92:aload_0         
	//   38   93:aload_1         
	//   39   94:aload_2         
	//   40   95:invokevirtual   #1009 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentAttached(FragmentManager, Fragment, Context)>
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
	//   15   32:invokevirtual   #1012 <Method void dispatchOnFragmentCreated(Fragment, Bundle, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   16   35:aload_0         
	//   17   36:getfield        #169 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   39:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   42:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   20   44:aload           4
	//   21   46:invokeinterface #762 <Method boolean Iterator.hasNext()>
	//   22   51:ifeq            101
			Pair pair = (Pair)iterator.next();
	//   23   54:aload           4
	//   24   56:invokeinterface #766 <Method Object Iterator.next()>
	//   25   61:checkcast       #988 <Class Pair>
	//   26   64:astore          5
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  27   66:iload_3         
	//*  28   67:ifeq            84
	//*  29   70:aload           5
	//*  30   72:getfield        #992 <Field Object Pair.second>
	//*  31   75:checkcast       #372 <Class Boolean>
	//*  32   78:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//*  33   81:ifeq            44
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentCreated(((FragmentManager) (this)), fragment, bundle);
	//   34   84:aload           5
	//   35   86:getfield        #995 <Field Object Pair.first>
	//   36   89:checkcast       #997 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   37   92:aload_0         
	//   38   93:aload_1         
	//   39   94:aload_2         
	//   40   95:invokevirtual   #1015 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentCreated(FragmentManager, Fragment, Bundle)>
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
	//   14   28:invokevirtual   #1018 <Method void dispatchOnFragmentDestroyed(Fragment, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   15   31:aload_0         
	//   16   32:getfield        #169 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   17   35:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   18   38:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   19   39:aload_3         
	//   20   40:invokeinterface #762 <Method boolean Iterator.hasNext()>
	//   21   45:ifeq            93
			Pair pair = (Pair)iterator.next();
	//   22   48:aload_3         
	//   23   49:invokeinterface #766 <Method Object Iterator.next()>
	//   24   54:checkcast       #988 <Class Pair>
	//   25   57:astore          4
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  26   59:iload_2         
	//*  27   60:ifeq            77
	//*  28   63:aload           4
	//*  29   65:getfield        #992 <Field Object Pair.second>
	//*  30   68:checkcast       #372 <Class Boolean>
	//*  31   71:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//*  32   74:ifeq            39
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentDestroyed(((FragmentManager) (this)), fragment);
	//   33   77:aload           4
	//   34   79:getfield        #995 <Field Object Pair.first>
	//   35   82:checkcast       #997 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   36   85:aload_0         
	//   37   86:aload_1         
	//   38   87:invokevirtual   #1022 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentDestroyed(FragmentManager, Fragment)>
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
	//   14   28:invokevirtual   #1025 <Method void dispatchOnFragmentDetached(Fragment, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   15   31:aload_0         
	//   16   32:getfield        #169 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   17   35:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   18   38:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   19   39:aload_3         
	//   20   40:invokeinterface #762 <Method boolean Iterator.hasNext()>
	//   21   45:ifeq            93
			Pair pair = (Pair)iterator.next();
	//   22   48:aload_3         
	//   23   49:invokeinterface #766 <Method Object Iterator.next()>
	//   24   54:checkcast       #988 <Class Pair>
	//   25   57:astore          4
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  26   59:iload_2         
	//*  27   60:ifeq            77
	//*  28   63:aload           4
	//*  29   65:getfield        #992 <Field Object Pair.second>
	//*  30   68:checkcast       #372 <Class Boolean>
	//*  31   71:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//*  32   74:ifeq            39
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentDetached(((FragmentManager) (this)), fragment);
	//   33   77:aload           4
	//   34   79:getfield        #995 <Field Object Pair.first>
	//   35   82:checkcast       #997 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   36   85:aload_0         
	//   37   86:aload_1         
	//   38   87:invokevirtual   #1028 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentDetached(FragmentManager, Fragment)>
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
	//   14   28:invokevirtual   #1031 <Method void dispatchOnFragmentPaused(Fragment, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   15   31:aload_0         
	//   16   32:getfield        #169 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   17   35:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   18   38:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   19   39:aload_3         
	//   20   40:invokeinterface #762 <Method boolean Iterator.hasNext()>
	//   21   45:ifeq            93
			Pair pair = (Pair)iterator.next();
	//   22   48:aload_3         
	//   23   49:invokeinterface #766 <Method Object Iterator.next()>
	//   24   54:checkcast       #988 <Class Pair>
	//   25   57:astore          4
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  26   59:iload_2         
	//*  27   60:ifeq            77
	//*  28   63:aload           4
	//*  29   65:getfield        #992 <Field Object Pair.second>
	//*  30   68:checkcast       #372 <Class Boolean>
	//*  31   71:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//*  32   74:ifeq            39
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentPaused(((FragmentManager) (this)), fragment);
	//   33   77:aload           4
	//   34   79:getfield        #995 <Field Object Pair.first>
	//   35   82:checkcast       #997 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   36   85:aload_0         
	//   37   86:aload_1         
	//   38   87:invokevirtual   #1034 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentPaused(FragmentManager, Fragment)>
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
	//   15   32:invokevirtual   #1037 <Method void dispatchOnFragmentPreAttached(Fragment, Context, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   16   35:aload_0         
	//   17   36:getfield        #169 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   39:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   42:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   20   44:aload           4
	//   21   46:invokeinterface #762 <Method boolean Iterator.hasNext()>
	//   22   51:ifeq            101
			Pair pair = (Pair)iterator.next();
	//   23   54:aload           4
	//   24   56:invokeinterface #766 <Method Object Iterator.next()>
	//   25   61:checkcast       #988 <Class Pair>
	//   26   64:astore          5
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  27   66:iload_3         
	//*  28   67:ifeq            84
	//*  29   70:aload           5
	//*  30   72:getfield        #992 <Field Object Pair.second>
	//*  31   75:checkcast       #372 <Class Boolean>
	//*  32   78:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//*  33   81:ifeq            44
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentPreAttached(((FragmentManager) (this)), fragment, context);
	//   34   84:aload           5
	//   35   86:getfield        #995 <Field Object Pair.first>
	//   36   89:checkcast       #997 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   37   92:aload_0         
	//   38   93:aload_1         
	//   39   94:aload_2         
	//   40   95:invokevirtual   #1040 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentPreAttached(FragmentManager, Fragment, Context)>
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
	//   15   32:invokevirtual   #1043 <Method void dispatchOnFragmentPreCreated(Fragment, Bundle, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   16   35:aload_0         
	//   17   36:getfield        #169 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   39:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   42:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   20   44:aload           4
	//   21   46:invokeinterface #762 <Method boolean Iterator.hasNext()>
	//   22   51:ifeq            101
			Pair pair = (Pair)iterator.next();
	//   23   54:aload           4
	//   24   56:invokeinterface #766 <Method Object Iterator.next()>
	//   25   61:checkcast       #988 <Class Pair>
	//   26   64:astore          5
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  27   66:iload_3         
	//*  28   67:ifeq            84
	//*  29   70:aload           5
	//*  30   72:getfield        #992 <Field Object Pair.second>
	//*  31   75:checkcast       #372 <Class Boolean>
	//*  32   78:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//*  33   81:ifeq            44
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentPreCreated(((FragmentManager) (this)), fragment, bundle);
	//   34   84:aload           5
	//   35   86:getfield        #995 <Field Object Pair.first>
	//   36   89:checkcast       #997 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   37   92:aload_0         
	//   38   93:aload_1         
	//   39   94:aload_2         
	//   40   95:invokevirtual   #1046 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentPreCreated(FragmentManager, Fragment, Bundle)>
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
	//   14   28:invokevirtual   #1049 <Method void dispatchOnFragmentResumed(Fragment, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   15   31:aload_0         
	//   16   32:getfield        #169 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   17   35:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   18   38:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   19   39:aload_3         
	//   20   40:invokeinterface #762 <Method boolean Iterator.hasNext()>
	//   21   45:ifeq            93
			Pair pair = (Pair)iterator.next();
	//   22   48:aload_3         
	//   23   49:invokeinterface #766 <Method Object Iterator.next()>
	//   24   54:checkcast       #988 <Class Pair>
	//   25   57:astore          4
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  26   59:iload_2         
	//*  27   60:ifeq            77
	//*  28   63:aload           4
	//*  29   65:getfield        #992 <Field Object Pair.second>
	//*  30   68:checkcast       #372 <Class Boolean>
	//*  31   71:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//*  32   74:ifeq            39
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentResumed(((FragmentManager) (this)), fragment);
	//   33   77:aload           4
	//   34   79:getfield        #995 <Field Object Pair.first>
	//   35   82:checkcast       #997 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   36   85:aload_0         
	//   37   86:aload_1         
	//   38   87:invokevirtual   #1052 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentResumed(FragmentManager, Fragment)>
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
	//   15   32:invokevirtual   #1055 <Method void dispatchOnFragmentSaveInstanceState(Fragment, Bundle, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   16   35:aload_0         
	//   17   36:getfield        #169 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   18   39:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   42:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   20   44:aload           4
	//   21   46:invokeinterface #762 <Method boolean Iterator.hasNext()>
	//   22   51:ifeq            101
			Pair pair = (Pair)iterator.next();
	//   23   54:aload           4
	//   24   56:invokeinterface #766 <Method Object Iterator.next()>
	//   25   61:checkcast       #988 <Class Pair>
	//   26   64:astore          5
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  27   66:iload_3         
	//*  28   67:ifeq            84
	//*  29   70:aload           5
	//*  30   72:getfield        #992 <Field Object Pair.second>
	//*  31   75:checkcast       #372 <Class Boolean>
	//*  32   78:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//*  33   81:ifeq            44
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentSaveInstanceState(((FragmentManager) (this)), fragment, bundle);
	//   34   84:aload           5
	//   35   86:getfield        #995 <Field Object Pair.first>
	//   36   89:checkcast       #997 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   37   92:aload_0         
	//   38   93:aload_1         
	//   39   94:aload_2         
	//   40   95:invokevirtual   #1058 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentSaveInstanceState(FragmentManager, Fragment, Bundle)>
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
	//   14   28:invokevirtual   #1061 <Method void dispatchOnFragmentStarted(Fragment, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   15   31:aload_0         
	//   16   32:getfield        #169 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   17   35:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   18   38:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   19   39:aload_3         
	//   20   40:invokeinterface #762 <Method boolean Iterator.hasNext()>
	//   21   45:ifeq            93
			Pair pair = (Pair)iterator.next();
	//   22   48:aload_3         
	//   23   49:invokeinterface #766 <Method Object Iterator.next()>
	//   24   54:checkcast       #988 <Class Pair>
	//   25   57:astore          4
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  26   59:iload_2         
	//*  27   60:ifeq            77
	//*  28   63:aload           4
	//*  29   65:getfield        #992 <Field Object Pair.second>
	//*  30   68:checkcast       #372 <Class Boolean>
	//*  31   71:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//*  32   74:ifeq            39
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentStarted(((FragmentManager) (this)), fragment);
	//   33   77:aload           4
	//   34   79:getfield        #995 <Field Object Pair.first>
	//   35   82:checkcast       #997 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   36   85:aload_0         
	//   37   86:aload_1         
	//   38   87:invokevirtual   #1064 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentStarted(FragmentManager, Fragment)>
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
	//   14   28:invokevirtual   #1067 <Method void dispatchOnFragmentStopped(Fragment, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   15   31:aload_0         
	//   16   32:getfield        #169 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   17   35:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   18   38:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   19   39:aload_3         
	//   20   40:invokeinterface #762 <Method boolean Iterator.hasNext()>
	//   21   45:ifeq            93
			Pair pair = (Pair)iterator.next();
	//   22   48:aload_3         
	//   23   49:invokeinterface #766 <Method Object Iterator.next()>
	//   24   54:checkcast       #988 <Class Pair>
	//   25   57:astore          4
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  26   59:iload_2         
	//*  27   60:ifeq            77
	//*  28   63:aload           4
	//*  29   65:getfield        #992 <Field Object Pair.second>
	//*  30   68:checkcast       #372 <Class Boolean>
	//*  31   71:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//*  32   74:ifeq            39
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentStopped(((FragmentManager) (this)), fragment);
	//   33   77:aload           4
	//   34   79:getfield        #995 <Field Object Pair.first>
	//   35   82:checkcast       #997 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   36   85:aload_0         
	//   37   86:aload_1         
	//   38   87:invokevirtual   #1070 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentStopped(FragmentManager, Fragment)>
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
	//   16   33:invokevirtual   #1074 <Method void dispatchOnFragmentViewCreated(Fragment, View, Bundle, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   17   36:aload_0         
	//   18   37:getfield        #169 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   19   40:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   20   43:astore          5
		do
		{
			if(!iterator.hasNext())
				break;
	//   21   45:aload           5
	//   22   47:invokeinterface #762 <Method boolean Iterator.hasNext()>
	//   23   52:ifeq            104
			Pair pair = (Pair)iterator.next();
	//   24   55:aload           5
	//   25   57:invokeinterface #766 <Method Object Iterator.next()>
	//   26   62:checkcast       #988 <Class Pair>
	//   27   65:astore          6
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  28   67:iload           4
	//*  29   69:ifeq            86
	//*  30   72:aload           6
	//*  31   74:getfield        #992 <Field Object Pair.second>
	//*  32   77:checkcast       #372 <Class Boolean>
	//*  33   80:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//*  34   83:ifeq            45
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentViewCreated(((FragmentManager) (this)), fragment, view, bundle);
	//   35   86:aload           6
	//   36   88:getfield        #995 <Field Object Pair.first>
	//   37   91:checkcast       #997 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   38   94:aload_0         
	//   39   95:aload_1         
	//   40   96:aload_2         
	//   41   97:aload_3         
	//   42   98:invokevirtual   #1078 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentViewCreated(FragmentManager, Fragment, View, Bundle)>
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
	//   14   28:invokevirtual   #1081 <Method void dispatchOnFragmentViewDestroyed(Fragment, boolean)>
		}
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   15   31:aload_0         
	//   16   32:getfield        #169 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   17   35:invokevirtual   #986 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   18   38:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   19   39:aload_3         
	//   20   40:invokeinterface #762 <Method boolean Iterator.hasNext()>
	//   21   45:ifeq            93
			Pair pair = (Pair)iterator.next();
	//   22   48:aload_3         
	//   23   49:invokeinterface #766 <Method Object Iterator.next()>
	//   24   54:checkcast       #988 <Class Pair>
	//   25   57:astore          4
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  26   59:iload_2         
	//*  27   60:ifeq            77
	//*  28   63:aload           4
	//*  29   65:getfield        #992 <Field Object Pair.second>
	//*  30   68:checkcast       #372 <Class Boolean>
	//*  31   71:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//*  32   74:ifeq            39
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentViewDestroyed(((FragmentManager) (this)), fragment);
	//   33   77:aload           4
	//   34   79:getfield        #995 <Field Object Pair.first>
	//   35   82:checkcast       #997 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   36   85:aload_0         
	//   37   86:aload_1         
	//   38   87:invokevirtual   #1084 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentViewDestroyed(FragmentManager, Fragment)>
		} while(true);
	//   39   90:goto            39
	//   40   93:return          
	}

	public boolean dispatchOptionsItemSelected(MenuItem menuitem)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		int i = 0;
	//    2    3:iconst_0        
	//    3    4:istore_2        
		do
		{
label0:
			{
				boolean flag = flag1;
	//    4    5:iload           4
	//    5    7:istore_3        
				if(i < mAdded.size())
	//*   6    8:iload_2         
	//*   7    9:aload_0         
	//*   8   10:getfield        #164 <Field ArrayList mAdded>
	//*   9   13:invokevirtual   #202 <Method int ArrayList.size()>
	//*  10   16:icmpge          48
				{
					Fragment fragment = (Fragment)mAdded.get(i);
	//   11   19:aload_0         
	//   12   20:getfield        #164 <Field ArrayList mAdded>
	//   13   23:iload_2         
	//   14   24:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   15   27:checkcast       #208 <Class Fragment>
	//   16   30:astore          5
					if(fragment == null || !fragment.performOptionsItemSelected(menuitem))
						break label0;
	//   17   32:aload           5
	//   18   34:ifnull          50
	//   19   37:aload           5
	//   20   39:aload_1         
	//   21   40:invokevirtual   #1088 <Method boolean Fragment.performOptionsItemSelected(MenuItem)>
	//   22   43:ifeq            50
					flag = true;
	//   23   46:iconst_1        
	//   24   47:istore_3        
				}
				return flag;
	//   25   48:iload_3         
	//   26   49:ireturn         
			}
			i++;
	//   27   50:iload_2         
	//   28   51:iconst_1        
	//   29   52:iadd            
	//   30   53:istore_2        
		} while(true);
	//   31   54:goto            5
	}

	public void dispatchOptionsMenuClosed(Menu menu)
	{
		for(int i = 0; i < mAdded.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #164 <Field ArrayList mAdded>
	//*   5    7:invokevirtual   #202 <Method int ArrayList.size()>
	//*   6   10:icmpge          41
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #164 <Field ArrayList mAdded>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #208 <Class Fragment>
	//   12   24:astore_3        
			if(fragment != null)
	//*  13   25:aload_3         
	//*  14   26:ifnull          34
				fragment.performOptionsMenuClosed(menu);
	//   15   29:aload_3         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #1093 <Method void Fragment.performOptionsMenuClosed(Menu)>
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
	//*   1    1:getfield        #164 <Field ArrayList mAdded>
	//*   2    4:invokevirtual   #202 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            42
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    8   14:aload_0         
	//    9   15:getfield        #164 <Field ArrayList mAdded>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #208 <Class Fragment>
	//   13   25:astore_3        
			if(fragment != null)
	//*  14   26:aload_3         
	//*  15   27:ifnull          35
				fragment.performPictureInPictureModeChanged(flag);
	//   16   30:aload_3         
	//   17   31:iload_1         
	//   18   32:invokevirtual   #1098 <Method void Fragment.performPictureInPictureModeChanged(boolean)>
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
	//*   6    6:getfield        #164 <Field ArrayList mAdded>
	//*   7    9:invokevirtual   #202 <Method int ArrayList.size()>
	//*   8   12:icmpge          61
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    9   15:aload_0         
	//   10   16:getfield        #164 <Field ArrayList mAdded>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #208 <Class Fragment>
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
	//*  23   42:invokevirtual   #1103 <Method boolean Fragment.performPrepareOptionsMenu(Menu)>
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
	//    2    2:putfield        #329 <Field boolean mStateSaved>
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
	//    2    2:putfield        #329 <Field boolean mStateSaved>
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
	//    2    2:putfield        #329 <Field boolean mStateSaved>
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
	//*   1    1:getfield        #1109 <Field boolean mHavePendingDeferredStart>
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
	//*   9   13:getfield        #313 <Field SparseArray mActive>
	//*  10   16:invokevirtual   #316 <Method int SparseArray.size()>
	//*  11   19:icmpge          72
			{
				Fragment fragment = (Fragment)mActive.valueAt(i);
	//   12   22:aload_0         
	//   13   23:getfield        #313 <Field SparseArray mActive>
	//   14   26:iload_1         
	//   15   27:invokevirtual   #319 <Method Object SparseArray.valueAt(int)>
	//   16   30:checkcast       #208 <Class Fragment>
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
	//*  25   46:getfield        #1113 <Field LoaderManagerImpl Fragment.mLoaderManager>
	//*  26   49:ifnull          63
						flag1 = flag | fragment.mLoaderManager.hasRunningLoaders();
	//   27   52:iload_2         
	//   28   53:aload           4
	//   29   55:getfield        #1113 <Field LoaderManagerImpl Fragment.mLoaderManager>
	//   30   58:invokevirtual   #1118 <Method boolean LoaderManagerImpl.hasRunningLoaders()>
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
	//   44   78:putfield        #1109 <Field boolean mHavePendingDeferredStart>
				startPendingDeferredFragments();
	//   45   81:aload_0         
	//   46   82:invokevirtual   #1121 <Method void startPendingDeferredFragments()>
			}
		}
	//   47   85:return          
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		boolean flag;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
		String s1 = (new StringBuilder()).append(s).append("    ").toString();
	//    2    3:new             #340 <Class StringBuilder>
	//    3    6:dup             
	//    4    7:invokespecial   #341 <Method void StringBuilder()>
	//    5   10:aload_1         
	//    6   11:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:ldc2            #1123 <String "    ">
	//    8   17:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//    9   20:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   10   23:astore          8
		if(mActive != null)
	//*  11   25:aload_0         
	//*  12   26:getfield        #313 <Field SparseArray mActive>
	//*  13   29:ifnull          156
		{
			int k1 = mActive.size();
	//   14   32:aload_0         
	//   15   33:getfield        #313 <Field SparseArray mActive>
	//   16   36:invokevirtual   #316 <Method int SparseArray.size()>
	//   17   39:istore          7
			if(k1 > 0)
	//*  18   41:iload           7
	//*  19   43:ifle            156
			{
				printwriter.print(s);
	//   20   46:aload_3         
	//   21   47:aload_1         
	//   22   48:invokevirtual   #1126 <Method void PrintWriter.print(String)>
				printwriter.print("Active Fragments in ");
	//   23   51:aload_3         
	//   24   52:ldc2            #1128 <String "Active Fragments in ">
	//   25   55:invokevirtual   #1126 <Method void PrintWriter.print(String)>
				printwriter.print(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//   26   58:aload_3         
	//   27   59:aload_0         
	//   28   60:invokestatic    #1133 <Method int System.identityHashCode(Object)>
	//   29   63:invokestatic    #1137 <Method String Integer.toHexString(int)>
	//   30   66:invokevirtual   #1126 <Method void PrintWriter.print(String)>
				printwriter.println(":");
	//   31   69:aload_3         
	//   32   70:ldc2            #1139 <String ":">
	//   33   73:invokevirtual   #1142 <Method void PrintWriter.println(String)>
				for(int i = 0; i < k1; i++)
	//*  34   76:iconst_0        
	//*  35   77:istore          5
	//*  36   79:iload           5
	//*  37   81:iload           7
	//*  38   83:icmpge          156
				{
					Fragment fragment = (Fragment)mActive.valueAt(i);
	//   39   86:aload_0         
	//   40   87:getfield        #313 <Field SparseArray mActive>
	//   41   90:iload           5
	//   42   92:invokevirtual   #319 <Method Object SparseArray.valueAt(int)>
	//   43   95:checkcast       #208 <Class Fragment>
	//   44   98:astore          9
					printwriter.print(s);
	//   45  100:aload_3         
	//   46  101:aload_1         
	//   47  102:invokevirtual   #1126 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//   48  105:aload_3         
	//   49  106:ldc2            #1144 <String "  #">
	//   50  109:invokevirtual   #1126 <Method void PrintWriter.print(String)>
					printwriter.print(i);
	//   51  112:aload_3         
	//   52  113:iload           5
	//   53  115:invokevirtual   #1146 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//   54  118:aload_3         
	//   55  119:ldc2            #1148 <String ": ">
	//   56  122:invokevirtual   #1126 <Method void PrintWriter.print(String)>
					printwriter.println(((Object) (fragment)));
	//   57  125:aload_3         
	//   58  126:aload           9
	//   59  128:invokevirtual   #1150 <Method void PrintWriter.println(Object)>
					if(fragment != null)
	//*  60  131:aload           9
	//*  61  133:ifnull          147
						fragment.dump(s1, filedescriptor, printwriter, as);
	//   62  136:aload           9
	//   63  138:aload           8
	//   64  140:aload_2         
	//   65  141:aload_3         
	//   66  142:aload           4
	//   67  144:invokevirtual   #1151 <Method void Fragment.dump(String, FileDescriptor, PrintWriter, String[])>
				}

	//   68  147:iload           5
	//   69  149:iconst_1        
	//   70  150:iadd            
	//   71  151:istore          5
			}
		}
	//*  72  153:goto            79
		int l1 = mAdded.size();
	//   73  156:aload_0         
	//   74  157:getfield        #164 <Field ArrayList mAdded>
	//   75  160:invokevirtual   #202 <Method int ArrayList.size()>
	//   76  163:istore          7
		if(l1 > 0)
	//*  77  165:iload           7
	//*  78  167:ifle            249
		{
			printwriter.print(s);
	//   79  170:aload_3         
	//   80  171:aload_1         
	//   81  172:invokevirtual   #1126 <Method void PrintWriter.print(String)>
			printwriter.println("Added Fragments:");
	//   82  175:aload_3         
	//   83  176:ldc2            #1153 <String "Added Fragments:">
	//   84  179:invokevirtual   #1142 <Method void PrintWriter.println(String)>
			for(int j = 0; j < l1; j++)
	//*  85  182:iconst_0        
	//*  86  183:istore          5
	//*  87  185:iload           5
	//*  88  187:iload           7
	//*  89  189:icmpge          249
			{
				Fragment fragment1 = (Fragment)mAdded.get(j);
	//   90  192:aload_0         
	//   91  193:getfield        #164 <Field ArrayList mAdded>
	//   92  196:iload           5
	//   93  198:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   94  201:checkcast       #208 <Class Fragment>
	//   95  204:astore          9
				printwriter.print(s);
	//   96  206:aload_3         
	//   97  207:aload_1         
	//   98  208:invokevirtual   #1126 <Method void PrintWriter.print(String)>
				printwriter.print("  #");
	//   99  211:aload_3         
	//  100  212:ldc2            #1144 <String "  #">
	//  101  215:invokevirtual   #1126 <Method void PrintWriter.print(String)>
				printwriter.print(j);
	//  102  218:aload_3         
	//  103  219:iload           5
	//  104  221:invokevirtual   #1146 <Method void PrintWriter.print(int)>
				printwriter.print(": ");
	//  105  224:aload_3         
	//  106  225:ldc2            #1148 <String ": ">
	//  107  228:invokevirtual   #1126 <Method void PrintWriter.print(String)>
				printwriter.println(fragment1.toString());
	//  108  231:aload_3         
	//  109  232:aload           9
	//  110  234:invokevirtual   #1154 <Method String Fragment.toString()>
	//  111  237:invokevirtual   #1142 <Method void PrintWriter.println(String)>
			}

	//  112  240:iload           5
	//  113  242:iconst_1        
	//  114  243:iadd            
	//  115  244:istore          5
		}
	//* 116  246:goto            185
		if(mCreatedMenus != null)
	//* 117  249:aload_0         
	//* 118  250:getfield        #963 <Field ArrayList mCreatedMenus>
	//* 119  253:ifnull          349
		{
			int i2 = mCreatedMenus.size();
	//  120  256:aload_0         
	//  121  257:getfield        #963 <Field ArrayList mCreatedMenus>
	//  122  260:invokevirtual   #202 <Method int ArrayList.size()>
	//  123  263:istore          7
			if(i2 > 0)
	//* 124  265:iload           7
	//* 125  267:ifle            349
			{
				printwriter.print(s);
	//  126  270:aload_3         
	//  127  271:aload_1         
	//  128  272:invokevirtual   #1126 <Method void PrintWriter.print(String)>
				printwriter.println("Fragments Created Menus:");
	//  129  275:aload_3         
	//  130  276:ldc2            #1156 <String "Fragments Created Menus:">
	//  131  279:invokevirtual   #1142 <Method void PrintWriter.println(String)>
				for(int k = 0; k < i2; k++)
	//* 132  282:iconst_0        
	//* 133  283:istore          5
	//* 134  285:iload           5
	//* 135  287:iload           7
	//* 136  289:icmpge          349
				{
					Fragment fragment2 = (Fragment)mCreatedMenus.get(k);
	//  137  292:aload_0         
	//  138  293:getfield        #963 <Field ArrayList mCreatedMenus>
	//  139  296:iload           5
	//  140  298:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//  141  301:checkcast       #208 <Class Fragment>
	//  142  304:astore          9
					printwriter.print(s);
	//  143  306:aload_3         
	//  144  307:aload_1         
	//  145  308:invokevirtual   #1126 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//  146  311:aload_3         
	//  147  312:ldc2            #1144 <String "  #">
	//  148  315:invokevirtual   #1126 <Method void PrintWriter.print(String)>
					printwriter.print(k);
	//  149  318:aload_3         
	//  150  319:iload           5
	//  151  321:invokevirtual   #1146 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//  152  324:aload_3         
	//  153  325:ldc2            #1148 <String ": ">
	//  154  328:invokevirtual   #1126 <Method void PrintWriter.print(String)>
					printwriter.println(fragment2.toString());
	//  155  331:aload_3         
	//  156  332:aload           9
	//  157  334:invokevirtual   #1154 <Method String Fragment.toString()>
	//  158  337:invokevirtual   #1142 <Method void PrintWriter.println(String)>
				}

	//  159  340:iload           5
	//  160  342:iconst_1        
	//  161  343:iadd            
	//  162  344:istore          5
			}
		}
	//* 163  346:goto            285
		if(mBackStack != null)
	//* 164  349:aload_0         
	//* 165  350:getfield        #829 <Field ArrayList mBackStack>
	//* 166  353:ifnull          460
		{
			int j2 = mBackStack.size();
	//  167  356:aload_0         
	//  168  357:getfield        #829 <Field ArrayList mBackStack>
	//  169  360:invokevirtual   #202 <Method int ArrayList.size()>
	//  170  363:istore          7
			if(j2 > 0)
	//* 171  365:iload           7
	//* 172  367:ifle            460
			{
				printwriter.print(s);
	//  173  370:aload_3         
	//  174  371:aload_1         
	//  175  372:invokevirtual   #1126 <Method void PrintWriter.print(String)>
				printwriter.println("Back Stack:");
	//  176  375:aload_3         
	//  177  376:ldc2            #1158 <String "Back Stack:">
	//  178  379:invokevirtual   #1142 <Method void PrintWriter.println(String)>
				for(int l = 0; l < j2; l++)
	//* 179  382:iconst_0        
	//* 180  383:istore          5
	//* 181  385:iload           5
	//* 182  387:iload           7
	//* 183  389:icmpge          460
				{
					BackStackRecord backstackrecord = (BackStackRecord)mBackStack.get(l);
	//  184  392:aload_0         
	//  185  393:getfield        #829 <Field ArrayList mBackStack>
	//  186  396:iload           5
	//  187  398:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//  188  401:checkcast       #363 <Class BackStackRecord>
	//  189  404:astore          9
					printwriter.print(s);
	//  190  406:aload_3         
	//  191  407:aload_1         
	//  192  408:invokevirtual   #1126 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//  193  411:aload_3         
	//  194  412:ldc2            #1144 <String "  #">
	//  195  415:invokevirtual   #1126 <Method void PrintWriter.print(String)>
					printwriter.print(l);
	//  196  418:aload_3         
	//  197  419:iload           5
	//  198  421:invokevirtual   #1146 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//  199  424:aload_3         
	//  200  425:ldc2            #1148 <String ": ">
	//  201  428:invokevirtual   #1126 <Method void PrintWriter.print(String)>
					printwriter.println(backstackrecord.toString());
	//  202  431:aload_3         
	//  203  432:aload           9
	//  204  434:invokevirtual   #1159 <Method String BackStackRecord.toString()>
	//  205  437:invokevirtual   #1142 <Method void PrintWriter.println(String)>
					backstackrecord.dump(s1, filedescriptor, printwriter, as);
	//  206  440:aload           9
	//  207  442:aload           8
	//  208  444:aload_2         
	//  209  445:aload_3         
	//  210  446:aload           4
	//  211  448:invokevirtual   #1160 <Method void BackStackRecord.dump(String, FileDescriptor, PrintWriter, String[])>
				}

	//  212  451:iload           5
	//  213  453:iconst_1        
	//  214  454:iadd            
	//  215  455:istore          5
			}
		}
	//* 216  457:goto            385
		this;
	//  217  460:aload_0         
		JVM INSTR monitorenter ;
	//  218  461:monitorenter    
		if(mBackStackIndices == null) goto _L2; else goto _L1
	//  219  462:aload_0         
	//  220  463:getfield        #877 <Field ArrayList mBackStackIndices>
	//  221  466:ifnull          557
_L1:
		int k2 = mBackStackIndices.size();
	//  222  469:aload_0         
	//  223  470:getfield        #877 <Field ArrayList mBackStackIndices>
	//  224  473:invokevirtual   #202 <Method int ArrayList.size()>
	//  225  476:istore          7
		if(k2 <= 0) goto _L2; else goto _L3
	//  226  478:iload           7
	//  227  480:ifle            557
_L3:
		printwriter.print(s);
	//  228  483:aload_3         
	//  229  484:aload_1         
	//  230  485:invokevirtual   #1126 <Method void PrintWriter.print(String)>
		printwriter.println("Back Stack Indices:");
	//  231  488:aload_3         
	//  232  489:ldc2            #1162 <String "Back Stack Indices:">
	//  233  492:invokevirtual   #1142 <Method void PrintWriter.println(String)>
		int i1 = 0;
	//  234  495:iconst_0        
	//  235  496:istore          5
_L4:
		if(i1 >= k2)
			break; /* Loop/switch isn't completed */
	//  236  498:iload           5
	//  237  500:iload           7
	//  238  502:icmpge          557
		filedescriptor = ((FileDescriptor) ((BackStackRecord)mBackStackIndices.get(i1)));
	//  239  505:aload_0         
	//  240  506:getfield        #877 <Field ArrayList mBackStackIndices>
	//  241  509:iload           5
	//  242  511:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//  243  514:checkcast       #363 <Class BackStackRecord>
	//  244  517:astore_2        
		printwriter.print(s);
	//  245  518:aload_3         
	//  246  519:aload_1         
	//  247  520:invokevirtual   #1126 <Method void PrintWriter.print(String)>
		printwriter.print("  #");
	//  248  523:aload_3         
	//  249  524:ldc2            #1144 <String "  #">
	//  250  527:invokevirtual   #1126 <Method void PrintWriter.print(String)>
		printwriter.print(i1);
	//  251  530:aload_3         
	//  252  531:iload           5
	//  253  533:invokevirtual   #1146 <Method void PrintWriter.print(int)>
		printwriter.print(": ");
	//  254  536:aload_3         
	//  255  537:ldc2            #1148 <String ": ">
	//  256  540:invokevirtual   #1126 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (filedescriptor)));
	//  257  543:aload_3         
	//  258  544:aload_2         
	//  259  545:invokevirtual   #1150 <Method void PrintWriter.println(Object)>
		i1++;
	//  260  548:iload           5
	//  261  550:iconst_1        
	//  262  551:iadd            
	//  263  552:istore          5
		if(true) goto _L4; else goto _L2
	//  264  554:goto            498
_L2:
		if(mAvailBackStackIndices != null && mAvailBackStackIndices.size() > 0)
	//* 265  557:aload_0         
	//* 266  558:getfield        #875 <Field ArrayList mAvailBackStackIndices>
	//* 267  561:ifnull          600
	//* 268  564:aload_0         
	//* 269  565:getfield        #875 <Field ArrayList mAvailBackStackIndices>
	//* 270  568:invokevirtual   #202 <Method int ArrayList.size()>
	//* 271  571:ifle            600
		{
			printwriter.print(s);
	//  272  574:aload_3         
	//  273  575:aload_1         
	//  274  576:invokevirtual   #1126 <Method void PrintWriter.print(String)>
			printwriter.print("mAvailBackStackIndices: ");
	//  275  579:aload_3         
	//  276  580:ldc2            #1164 <String "mAvailBackStackIndices: ">
	//  277  583:invokevirtual   #1126 <Method void PrintWriter.print(String)>
			printwriter.println(Arrays.toString(mAvailBackStackIndices.toArray()));
	//  278  586:aload_3         
	//  279  587:aload_0         
	//  280  588:getfield        #875 <Field ArrayList mAvailBackStackIndices>
	//  281  591:invokevirtual   #1168 <Method Object[] ArrayList.toArray()>
	//  282  594:invokestatic    #1173 <Method String Arrays.toString(Object[])>
	//  283  597:invokevirtual   #1142 <Method void PrintWriter.println(String)>
		}
		this;
	//  284  600:aload_0         
		JVM INSTR monitorexit ;
	//  285  601:monitorexit     
		if(mPendingActions != null)
	//* 286  602:aload_0         
	//* 287  603:getfield        #559 <Field ArrayList mPendingActions>
	//* 288  606:ifnull          703
		{
			int l2 = mPendingActions.size();
	//  289  609:aload_0         
	//  290  610:getfield        #559 <Field ArrayList mPendingActions>
	//  291  613:invokevirtual   #202 <Method int ArrayList.size()>
	//  292  616:istore          7
			if(l2 > 0)
	//* 293  618:iload           7
	//* 294  620:ifle            703
			{
				printwriter.print(s);
	//  295  623:aload_3         
	//  296  624:aload_1         
	//  297  625:invokevirtual   #1126 <Method void PrintWriter.print(String)>
				printwriter.println("Pending Actions:");
	//  298  628:aload_3         
	//  299  629:ldc2            #1175 <String "Pending Actions:">
	//  300  632:invokevirtual   #1142 <Method void PrintWriter.println(String)>
				for(int j1 = ((int) (flag)); j1 < l2; j1++)
	//* 301  635:iload           6
	//* 302  637:istore          5
	//* 303  639:iload           5
	//* 304  641:iload           7
	//* 305  643:icmpge          703
				{
					filedescriptor = ((FileDescriptor) ((OpGenerator)mPendingActions.get(j1)));
	//  306  646:aload_0         
	//  307  647:getfield        #559 <Field ArrayList mPendingActions>
	//  308  650:iload           5
	//  309  652:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//  310  655:checkcast       #33  <Class FragmentManagerImpl$OpGenerator>
	//  311  658:astore_2        
					printwriter.print(s);
	//  312  659:aload_3         
	//  313  660:aload_1         
	//  314  661:invokevirtual   #1126 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//  315  664:aload_3         
	//  316  665:ldc2            #1144 <String "  #">
	//  317  668:invokevirtual   #1126 <Method void PrintWriter.print(String)>
					printwriter.print(j1);
	//  318  671:aload_3         
	//  319  672:iload           5
	//  320  674:invokevirtual   #1146 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//  321  677:aload_3         
	//  322  678:ldc2            #1148 <String ": ">
	//  323  681:invokevirtual   #1126 <Method void PrintWriter.print(String)>
					printwriter.println(((Object) (filedescriptor)));
	//  324  684:aload_3         
	//  325  685:aload_2         
	//  326  686:invokevirtual   #1150 <Method void PrintWriter.println(Object)>
				}

	//  327  689:iload           5
	//  328  691:iconst_1        
	//  329  692:iadd            
	//  330  693:istore          5
			}
		}
		break MISSING_BLOCK_LABEL_703;
	//  331  695:goto            639
		s;
	//  332  698:astore_1        
		this;
	//  333  699:aload_0         
		JVM INSTR monitorexit ;
	//  334  700:monitorexit     
		throw s;
	//  335  701:aload_1         
	//  336  702:athrow          
		printwriter.print(s);
	//  337  703:aload_3         
	//  338  704:aload_1         
	//  339  705:invokevirtual   #1126 <Method void PrintWriter.print(String)>
		printwriter.println("FragmentManager misc state:");
	//  340  708:aload_3         
	//  341  709:ldc2            #1177 <String "FragmentManager misc state:">
	//  342  712:invokevirtual   #1142 <Method void PrintWriter.println(String)>
		printwriter.print(s);
	//  343  715:aload_3         
	//  344  716:aload_1         
	//  345  717:invokevirtual   #1126 <Method void PrintWriter.print(String)>
		printwriter.print("  mHost=");
	//  346  720:aload_3         
	//  347  721:ldc2            #1179 <String "  mHost=">
	//  348  724:invokevirtual   #1126 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (mHost)));
	//  349  727:aload_3         
	//  350  728:aload_0         
	//  351  729:getfield        #444 <Field FragmentHostCallback mHost>
	//  352  732:invokevirtual   #1150 <Method void PrintWriter.println(Object)>
		printwriter.print(s);
	//  353  735:aload_3         
	//  354  736:aload_1         
	//  355  737:invokevirtual   #1126 <Method void PrintWriter.print(String)>
		printwriter.print("  mContainer=");
	//  356  740:aload_3         
	//  357  741:ldc2            #1181 <String "  mContainer=">
	//  358  744:invokevirtual   #1126 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (mContainer)));
	//  359  747:aload_3         
	//  360  748:aload_0         
	//  361  749:getfield        #903 <Field FragmentContainer mContainer>
	//  362  752:invokevirtual   #1150 <Method void PrintWriter.println(Object)>
		if(mParent != null)
	//* 363  755:aload_0         
	//* 364  756:getfield        #905 <Field Fragment mParent>
	//* 365  759:ifnull          782
		{
			printwriter.print(s);
	//  366  762:aload_3         
	//  367  763:aload_1         
	//  368  764:invokevirtual   #1126 <Method void PrintWriter.print(String)>
			printwriter.print("  mParent=");
	//  369  767:aload_3         
	//  370  768:ldc2            #1183 <String "  mParent=">
	//  371  771:invokevirtual   #1126 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mParent)));
	//  372  774:aload_3         
	//  373  775:aload_0         
	//  374  776:getfield        #905 <Field Fragment mParent>
	//  375  779:invokevirtual   #1150 <Method void PrintWriter.println(Object)>
		}
		printwriter.print(s);
	//  376  782:aload_3         
	//  377  783:aload_1         
	//  378  784:invokevirtual   #1126 <Method void PrintWriter.print(String)>
		printwriter.print("  mCurState=");
	//  379  787:aload_3         
	//  380  788:ldc2            #1185 <String "  mCurState=">
	//  381  791:invokevirtual   #1126 <Method void PrintWriter.print(String)>
		printwriter.print(mCurState);
	//  382  794:aload_3         
	//  383  795:aload_0         
	//  384  796:getfield        #171 <Field int mCurState>
	//  385  799:invokevirtual   #1146 <Method void PrintWriter.print(int)>
		printwriter.print(" mStateSaved=");
	//  386  802:aload_3         
	//  387  803:ldc2            #1187 <String " mStateSaved=">
	//  388  806:invokevirtual   #1126 <Method void PrintWriter.print(String)>
		printwriter.print(mStateSaved);
	//  389  809:aload_3         
	//  390  810:aload_0         
	//  391  811:getfield        #329 <Field boolean mStateSaved>
	//  392  814:invokevirtual   #1189 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mDestroyed=");
	//  393  817:aload_3         
	//  394  818:ldc2            #1191 <String " mDestroyed=">
	//  395  821:invokevirtual   #1126 <Method void PrintWriter.print(String)>
		printwriter.println(mDestroyed);
	//  396  824:aload_3         
	//  397  825:aload_0         
	//  398  826:getfield        #969 <Field boolean mDestroyed>
	//  399  829:invokevirtual   #1193 <Method void PrintWriter.println(boolean)>
		if(mNeedMenuInvalidate)
	//* 400  832:aload_0         
	//* 401  833:getfield        #865 <Field boolean mNeedMenuInvalidate>
	//* 402  836:ifeq            859
		{
			printwriter.print(s);
	//  403  839:aload_3         
	//  404  840:aload_1         
	//  405  841:invokevirtual   #1126 <Method void PrintWriter.print(String)>
			printwriter.print("  mNeedMenuInvalidate=");
	//  406  844:aload_3         
	//  407  845:ldc2            #1195 <String "  mNeedMenuInvalidate=">
	//  408  848:invokevirtual   #1126 <Method void PrintWriter.print(String)>
			printwriter.println(mNeedMenuInvalidate);
	//  409  851:aload_3         
	//  410  852:aload_0         
	//  411  853:getfield        #865 <Field boolean mNeedMenuInvalidate>
	//  412  856:invokevirtual   #1193 <Method void PrintWriter.println(boolean)>
		}
		if(mNoTransactionsBecause != null)
	//* 413  859:aload_0         
	//* 414  860:getfield        #338 <Field String mNoTransactionsBecause>
	//* 415  863:ifnull          886
		{
			printwriter.print(s);
	//  416  866:aload_3         
	//  417  867:aload_1         
	//  418  868:invokevirtual   #1126 <Method void PrintWriter.print(String)>
			printwriter.print("  mNoTransactionsBecause=");
	//  419  871:aload_3         
	//  420  872:ldc2            #1197 <String "  mNoTransactionsBecause=">
	//  421  875:invokevirtual   #1126 <Method void PrintWriter.print(String)>
			printwriter.println(mNoTransactionsBecause);
	//  422  878:aload_3         
	//  423  879:aload_0         
	//  424  880:getfield        #338 <Field String mNoTransactionsBecause>
	//  425  883:invokevirtual   #1142 <Method void PrintWriter.println(String)>
		}
		return;
	//  426  886:return          
	}

	public void enqueueAction(OpGenerator opgenerator, boolean flag)
	{
		if(!flag)
	//*   0    0:iload_2         
	//*   1    1:ifne            8
			checkStateLoss();
	//    2    4:aload_0         
	//    3    5:invokespecial   #459 <Method void checkStateLoss()>
		this;
	//    4    8:aload_0         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		if(!mDestroyed && mHost != null)
			break MISSING_BLOCK_LABEL_47;
	//    6   10:aload_0         
	//    7   11:getfield        #969 <Field boolean mDestroyed>
	//    8   14:ifne            24
	//    9   17:aload_0         
	//   10   18:getfield        #444 <Field FragmentHostCallback mHost>
	//   11   21:ifnonnull       47
		if(!flag)
			break MISSING_BLOCK_LABEL_31;
	//   12   24:iload_2         
	//   13   25:ifeq            31
		this;
	//   14   28:aload_0         
		JVM INSTR monitorexit ;
	//   15   29:monitorexit     
		return;
	//   16   30:return          
		throw new IllegalStateException("Activity has been destroyed");
	//   17   31:new             #331 <Class IllegalStateException>
	//   18   34:dup             
	//   19   35:ldc2            #1201 <String "Activity has been destroyed">
	//   20   38:invokespecial   #336 <Method void IllegalStateException(String)>
	//   21   41:athrow          
		opgenerator;
	//   22   42:astore_1        
		this;
	//   23   43:aload_0         
		JVM INSTR monitorexit ;
	//   24   44:monitorexit     
		throw opgenerator;
	//   25   45:aload_1         
	//   26   46:athrow          
		if(mPendingActions == null)
	//*  27   47:aload_0         
	//*  28   48:getfield        #559 <Field ArrayList mPendingActions>
	//*  29   51:ifnonnull       65
			mPendingActions = new ArrayList();
	//   30   54:aload_0         
	//   31   55:new             #161 <Class ArrayList>
	//   32   58:dup             
	//   33   59:invokespecial   #162 <Method void ArrayList()>
	//   34   62:putfield        #559 <Field ArrayList mPendingActions>
		mPendingActions.add(((Object) (opgenerator)));
	//   35   65:aload_0         
	//   36   66:getfield        #559 <Field ArrayList mPendingActions>
	//   37   69:aload_1         
	//   38   70:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//   39   73:pop             
		scheduleCommit();
	//   40   74:aload_0         
	//   41   75:invokespecial   #184 <Method void scheduleCommit()>
		this;
	//   42   78:aload_0         
		JVM INSTR monitorexit ;
	//   43   79:monitorexit     
	//   44   80:return          
	}

	void ensureInflatedFragmentView(Fragment fragment)
	{
label0:
		{
			if(fragment.mFromLayout && !fragment.mPerformedCreateView)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1205 <Field boolean Fragment.mFromLayout>
	//*   2    4:ifeq            100
	//*   3    7:aload_1         
	//*   4    8:getfield        #1208 <Field boolean Fragment.mPerformedCreateView>
	//*   5   11:ifne            100
			{
				fragment.mView = fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), ((ViewGroup) (null)), fragment.mSavedFragmentState);
	//    6   14:aload_1         
	//    7   15:aload_1         
	//    8   16:aload_1         
	//    9   17:aload_1         
	//   10   18:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//   11   21:invokevirtual   #1215 <Method android.view.LayoutInflater Fragment.performGetLayoutInflater(Bundle)>
	//   12   24:aconst_null     
	//   13   25:aload_1         
	//   14   26:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//   15   29:invokevirtual   #1219 <Method View Fragment.performCreateView(android.view.LayoutInflater, ViewGroup, Bundle)>
	//   16   32:putfield        #225 <Field View Fragment.mView>
				if(fragment.mView == null)
					break label0;
	//   17   35:aload_1         
	//   18   36:getfield        #225 <Field View Fragment.mView>
	//   19   39:ifnull          101
				fragment.mInnerView = fragment.mView;
	//   20   42:aload_1         
	//   21   43:aload_1         
	//   22   44:getfield        #225 <Field View Fragment.mView>
	//   23   47:putfield        #1222 <Field View Fragment.mInnerView>
				fragment.mView.setSaveFromParentEnabled(false);
	//   24   50:aload_1         
	//   25   51:getfield        #225 <Field View Fragment.mView>
	//   26   54:iconst_0        
	//   27   55:invokevirtual   #1225 <Method void View.setSaveFromParentEnabled(boolean)>
				if(fragment.mHidden)
	//*  28   58:aload_1         
	//*  29   59:getfield        #228 <Field boolean Fragment.mHidden>
	//*  30   62:ifeq            74
					fragment.mView.setVisibility(8);
	//   31   65:aload_1         
	//   32   66:getfield        #225 <Field View Fragment.mView>
	//   33   69:bipush          8
	//   34   71:invokevirtual   #934 <Method void View.setVisibility(int)>
				fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
	//   35   74:aload_1         
	//   36   75:aload_1         
	//   37   76:getfield        #225 <Field View Fragment.mView>
	//   38   79:aload_1         
	//   39   80:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//   40   83:invokevirtual   #1229 <Method void Fragment.onViewCreated(View, Bundle)>
				dispatchOnFragmentViewCreated(fragment, fragment.mView, fragment.mSavedFragmentState, false);
	//   41   86:aload_0         
	//   42   87:aload_1         
	//   43   88:aload_1         
	//   44   89:getfield        #225 <Field View Fragment.mView>
	//   45   92:aload_1         
	//   46   93:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//   47   96:iconst_0        
	//   48   97:invokevirtual   #1074 <Method void dispatchOnFragmentViewCreated(Fragment, View, Bundle, boolean)>
			}
			return;
	//   49  100:return          
		}
		fragment.mInnerView = null;
	//   50  101:aload_1         
	//   51  102:aconst_null     
	//   52  103:putfield        #1222 <Field View Fragment.mInnerView>
	//   53  106:return          
	}

	public boolean execPendingActions()
	{
		boolean flag;
		ensureExecReady(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #688 <Method void ensureExecReady(boolean)>
		flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_1        
_L2:
		if(!generateOpsForPendingActions(mTmpRecords, mTmpIsPop))
			break; /* Loop/switch isn't completed */
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #361 <Field ArrayList mTmpRecords>
	//    8   12:aload_0         
	//    9   13:getfield        #356 <Field ArrayList mTmpIsPop>
	//   10   16:invokespecial   #1231 <Method boolean generateOpsForPendingActions(ArrayList, ArrayList)>
	//   11   19:ifeq            55
		mExecutingActions = true;
	//   12   22:aload_0         
	//   13   23:iconst_1        
	//   14   24:putfield        #354 <Field boolean mExecutingActions>
		removeRedundantOperationsAndExecute(mTmpRecords, mTmpIsPop);
	//   15   27:aload_0         
	//   16   28:aload_0         
	//   17   29:getfield        #361 <Field ArrayList mTmpRecords>
	//   18   32:aload_0         
	//   19   33:getfield        #356 <Field ArrayList mTmpIsPop>
	//   20   36:invokespecial   #703 <Method void removeRedundantOperationsAndExecute(ArrayList, ArrayList)>
		cleanupExec();
	//   21   39:aload_0         
	//   22   40:invokespecial   #705 <Method void cleanupExec()>
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
	//   28   50:invokespecial   #705 <Method void cleanupExec()>
		throw exception;
	//   29   53:aload_2         
	//   30   54:athrow          
_L1:
		doPendingDeferredStart();
	//   31   55:aload_0         
	//   32   56:invokevirtual   #708 <Method void doPendingDeferredStart()>
		burpActive();
	//   33   59:aload_0         
	//   34   60:invokespecial   #710 <Method void burpActive()>
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
	//*   6   12:getfield        #969 <Field boolean mDestroyed>
	//*   7   15:ifeq            19
			return;
	//    8   18:return          
		ensureExecReady(flag);
	//    9   19:aload_0         
	//   10   20:iload_2         
	//   11   21:invokespecial   #688 <Method void ensureExecReady(boolean)>
		if(!opgenerator.generateOps(mTmpRecords, mTmpIsPop))
			break MISSING_BLOCK_LABEL_62;
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #361 <Field ArrayList mTmpRecords>
	//   15   29:aload_0         
	//   16   30:getfield        #356 <Field ArrayList mTmpIsPop>
	//   17   33:invokeinterface #562 <Method boolean FragmentManagerImpl$OpGenerator.generateOps(ArrayList, ArrayList)>
	//   18   38:ifeq            62
		mExecutingActions = true;
	//   19   41:aload_0         
	//   20   42:iconst_1        
	//   21   43:putfield        #354 <Field boolean mExecutingActions>
		removeRedundantOperationsAndExecute(mTmpRecords, mTmpIsPop);
	//   22   46:aload_0         
	//   23   47:aload_0         
	//   24   48:getfield        #361 <Field ArrayList mTmpRecords>
	//   25   51:aload_0         
	//   26   52:getfield        #356 <Field ArrayList mTmpIsPop>
	//   27   55:invokespecial   #703 <Method void removeRedundantOperationsAndExecute(ArrayList, ArrayList)>
		cleanupExec();
	//   28   58:aload_0         
	//   29   59:invokespecial   #705 <Method void cleanupExec()>
		doPendingDeferredStart();
	//   30   62:aload_0         
	//   31   63:invokevirtual   #708 <Method void doPendingDeferredStart()>
		burpActive();
	//   32   66:aload_0         
	//   33   67:invokespecial   #710 <Method void burpActive()>
		return;
	//   34   70:return          
		opgenerator;
	//   35   71:astore_1        
		cleanupExec();
	//   36   72:aload_0         
	//   37   73:invokespecial   #705 <Method void cleanupExec()>
		throw opgenerator;
	//   38   76:aload_1         
	//   39   77:athrow          
	}

	public boolean executePendingTransactions()
	{
		boolean flag = execPendingActions();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #408 <Method boolean execPendingActions()>
	//    2    4:istore_1        
		forcePostponedTransactions();
	//    3    5:aload_0         
	//    4    6:invokespecial   #1235 <Method void forcePostponedTransactions()>
		return flag;
	//    5    9:iload_1         
	//    6   10:ireturn         
	}

	public Fragment findFragmentById(int i)
	{
		int j = mAdded.size() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field ArrayList mAdded>
	//    2    4:invokevirtual   #202 <Method int ArrayList.size()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
_L10:
		if(j < 0) goto _L2; else goto _L1
	//    6   10:iload_2         
	//    7   11:iflt            47
_L1:
		Fragment fragment = (Fragment)mAdded.get(j);
	//    8   14:aload_0         
	//    9   15:getfield        #164 <Field ArrayList mAdded>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #208 <Class Fragment>
	//   13   25:astore_3        
		if(fragment == null || fragment.mFragmentId != i) goto _L4; else goto _L3
	//   14   26:aload_3         
	//   15   27:ifnull          40
	//   16   30:aload_3         
	//   17   31:getfield        #1240 <Field int Fragment.mFragmentId>
	//   18   34:iload_1         
	//   19   35:icmpne          40
_L3:
		return fragment;
	//   20   38:aload_3         
	//   21   39:areturn         
_L4:
		j--;
	//   22   40:iload_2         
	//   23   41:iconst_1        
	//   24   42:isub            
	//   25   43:istore_2        
		continue; /* Loop/switch isn't completed */
	//   26   44:goto            10
_L2:
		if(mActive == null)
			break MISSING_BLOCK_LABEL_105;
	//   27   47:aload_0         
	//   28   48:getfield        #313 <Field SparseArray mActive>
	//   29   51:ifnull          105
		j = mActive.size() - 1;
	//   30   54:aload_0         
	//   31   55:getfield        #313 <Field SparseArray mActive>
	//   32   58:invokevirtual   #316 <Method int SparseArray.size()>
	//   33   61:iconst_1        
	//   34   62:isub            
	//   35   63:istore_2        
_L8:
		if(j < 0) goto _L6; else goto _L5
	//   36   64:iload_2         
	//   37   65:iflt            105
_L5:
		Fragment fragment1;
		fragment1 = (Fragment)mActive.valueAt(j);
	//   38   68:aload_0         
	//   39   69:getfield        #313 <Field SparseArray mActive>
	//   40   72:iload_2         
	//   41   73:invokevirtual   #319 <Method Object SparseArray.valueAt(int)>
	//   42   76:checkcast       #208 <Class Fragment>
	//   43   79:astore          4
		if(fragment1 == null)
			continue; /* Loop/switch isn't completed */
	//   44   81:aload           4
	//   45   83:ifnull          98
		fragment = fragment1;
	//   46   86:aload           4
	//   47   88:astore_3        
		if(fragment1.mFragmentId == i) goto _L3; else goto _L7
	//   48   89:aload           4
	//   49   91:getfield        #1240 <Field int Fragment.mFragmentId>
	//   50   94:iload_1         
	//   51   95:icmpeq          38
_L7:
		j--;
	//   52   98:iload_2         
	//   53   99:iconst_1        
	//   54  100:isub            
	//   55  101:istore_2        
		  goto _L8
	//*  56  102:goto            64
_L6:
		return null;
	//   57  105:aconst_null     
	//   58  106:areturn         
		if(true) goto _L10; else goto _L9
_L9:
	}

	public Fragment findFragmentByTag(String s)
	{
		if(s == null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnull          54
_L1:
		int i = mAdded.size() - 1;
	//    2    4:aload_0         
	//    3    5:getfield        #164 <Field ArrayList mAdded>
	//    4    8:invokevirtual   #202 <Method int ArrayList.size()>
	//    5   11:iconst_1        
	//    6   12:isub            
	//    7   13:istore_2        
_L11:
		if(i < 0) goto _L2; else goto _L3
	//    8   14:iload_2         
	//    9   15:iflt            54
_L3:
		Fragment fragment = (Fragment)mAdded.get(i);
	//   10   18:aload_0         
	//   11   19:getfield        #164 <Field ArrayList mAdded>
	//   12   22:iload_2         
	//   13   23:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   14   26:checkcast       #208 <Class Fragment>
	//   15   29:astore_3        
		if(fragment == null || !s.equals(((Object) (fragment.mTag)))) goto _L5; else goto _L4
	//   16   30:aload_3         
	//   17   31:ifnull          47
	//   18   34:aload_1         
	//   19   35:aload_3         
	//   20   36:getfield        #1245 <Field String Fragment.mTag>
	//   21   39:invokevirtual   #667 <Method boolean String.equals(Object)>
	//   22   42:ifeq            47
_L4:
		return fragment;
	//   23   45:aload_3         
	//   24   46:areturn         
_L5:
		i--;
	//   25   47:iload_2         
	//   26   48:iconst_1        
	//   27   49:isub            
	//   28   50:istore_2        
		continue; /* Loop/switch isn't completed */
	//   29   51:goto            14
_L2:
		if(mActive == null || s == null)
			break MISSING_BLOCK_LABEL_119;
	//   30   54:aload_0         
	//   31   55:getfield        #313 <Field SparseArray mActive>
	//   32   58:ifnull          119
	//   33   61:aload_1         
	//   34   62:ifnull          119
		i = mActive.size() - 1;
	//   35   65:aload_0         
	//   36   66:getfield        #313 <Field SparseArray mActive>
	//   37   69:invokevirtual   #316 <Method int SparseArray.size()>
	//   38   72:iconst_1        
	//   39   73:isub            
	//   40   74:istore_2        
_L9:
		if(i < 0) goto _L7; else goto _L6
	//   41   75:iload_2         
	//   42   76:iflt            119
_L6:
		Fragment fragment1;
		fragment1 = (Fragment)mActive.valueAt(i);
	//   43   79:aload_0         
	//   44   80:getfield        #313 <Field SparseArray mActive>
	//   45   83:iload_2         
	//   46   84:invokevirtual   #319 <Method Object SparseArray.valueAt(int)>
	//   47   87:checkcast       #208 <Class Fragment>
	//   48   90:astore          4
		if(fragment1 == null)
			continue; /* Loop/switch isn't completed */
	//   49   92:aload           4
	//   50   94:ifnull          112
		fragment = fragment1;
	//   51   97:aload           4
	//   52   99:astore_3        
		if(s.equals(((Object) (fragment1.mTag)))) goto _L4; else goto _L8
	//   53  100:aload_1         
	//   54  101:aload           4
	//   55  103:getfield        #1245 <Field String Fragment.mTag>
	//   56  106:invokevirtual   #667 <Method boolean String.equals(Object)>
	//   57  109:ifne            45
_L8:
		i--;
	//   58  112:iload_2         
	//   59  113:iconst_1        
	//   60  114:isub            
	//   61  115:istore_2        
		  goto _L9
	//*  62  116:goto            75
_L7:
		return null;
	//   63  119:aconst_null     
	//   64  120:areturn         
		if(true) goto _L11; else goto _L10
_L10:
	}

	public Fragment findFragmentByWho(String s)
	{
		if(mActive != null && s != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field SparseArray mActive>
	//*   2    4:ifnull          60
	//*   3    7:aload_1         
	//*   4    8:ifnull          60
		{
			for(int i = mActive.size() - 1; i >= 0; i--)
	//*   5   11:aload_0         
	//*   6   12:getfield        #313 <Field SparseArray mActive>
	//*   7   15:invokevirtual   #316 <Method int SparseArray.size()>
	//*   8   18:iconst_1        
	//*   9   19:isub            
	//*  10   20:istore_2        
	//*  11   21:iload_2         
	//*  12   22:iflt            60
			{
				Fragment fragment = (Fragment)mActive.valueAt(i);
	//   13   25:aload_0         
	//   14   26:getfield        #313 <Field SparseArray mActive>
	//   15   29:iload_2         
	//   16   30:invokevirtual   #319 <Method Object SparseArray.valueAt(int)>
	//   17   33:checkcast       #208 <Class Fragment>
	//   18   36:astore_3        
				if(fragment == null)
					continue;
	//   19   37:aload_3         
	//   20   38:ifnull          53
				fragment = fragment.findFragmentByWho(s);
	//   21   41:aload_3         
	//   22   42:aload_1         
	//   23   43:invokevirtual   #1248 <Method Fragment Fragment.findFragmentByWho(String)>
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
	//    3    3:getfield        #877 <Field ArrayList mBackStackIndices>
	//    4    6:iload_1         
	//    5    7:aconst_null     
	//    6    8:invokevirtual   #897 <Method Object ArrayList.set(int, Object)>
	//    7   11:pop             
		if(mAvailBackStackIndices == null)
	//*   8   12:aload_0         
	//*   9   13:getfield        #875 <Field ArrayList mAvailBackStackIndices>
	//*  10   16:ifnonnull       30
			mAvailBackStackIndices = new ArrayList();
	//   11   19:aload_0         
	//   12   20:new             #161 <Class ArrayList>
	//   13   23:dup             
	//   14   24:invokespecial   #162 <Method void ArrayList()>
	//   15   27:putfield        #875 <Field ArrayList mAvailBackStackIndices>
		if(DEBUG)
	//*  16   30:getstatic       #133 <Field boolean DEBUG>
	//*  17   33:ifeq            62
			Log.v("FragmentManager", (new StringBuilder()).append("Freeing back stack index ").append(i).toString());
	//   18   36:ldc1            #67  <String "FragmentManager">
	//   19   38:new             #340 <Class StringBuilder>
	//   20   41:dup             
	//   21   42:invokespecial   #341 <Method void StringBuilder()>
	//   22   45:ldc2            #1250 <String "Freeing back stack index ">
	//   23   48:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   24   51:iload_1         
	//   25   52:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//   26   55:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   27   58:invokestatic    #839 <Method int Log.v(String, String)>
	//   28   61:pop             
		mAvailBackStackIndices.add(((Object) (Integer.valueOf(i))));
	//   29   62:aload_0         
	//   30   63:getfield        #875 <Field ArrayList mAvailBackStackIndices>
	//   31   66:iload_1         
	//   32   67:invokestatic    #1253 <Method Integer Integer.valueOf(int)>
	//   33   70:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//   34   73:pop             
		this;
	//   35   74:aload_0         
		JVM INSTR monitorexit ;
	//   36   75:monitorexit     
		return;
	//   37   76:return          
		Exception exception;
		exception;
	//   38   77:astore_2        
		this;
	//   39   78:aload_0         
		JVM INSTR monitorexit ;
	//   40   79:monitorexit     
		throw exception;
	//   41   80:aload_2         
	//   42   81:athrow          
	}

	int getActiveFragmentCount()
	{
		if(mActive == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field SparseArray mActive>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mActive.size();
	//    5    9:aload_0         
	//    6   10:getfield        #313 <Field SparseArray mActive>
	//    7   13:invokevirtual   #316 <Method int SparseArray.size()>
	//    8   16:ireturn         
	}

	List getActiveFragments()
	{
		if(mActive != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #313 <Field SparseArray mActive>
	//    2    4:ifnonnull       11
_L1:
		Object obj = null;
	//    3    7:aconst_null     
	//    4    8:astore_3        
_L4:
		return ((List) (obj));
	//    5    9:aload_3         
	//    6   10:areturn         
_L2:
		int j = mActive.size();
	//    7   11:aload_0         
	//    8   12:getfield        #313 <Field SparseArray mActive>
	//    9   15:invokevirtual   #316 <Method int SparseArray.size()>
	//   10   18:istore_2        
		ArrayList arraylist = new ArrayList(j);
	//   11   19:new             #161 <Class ArrayList>
	//   12   22:dup             
	//   13   23:iload_2         
	//   14   24:invokespecial   #369 <Method void ArrayList(int)>
	//   15   27:astore          4
		int i = 0;
	//   16   29:iconst_0        
	//   17   30:istore_1        
		do
		{
			obj = ((Object) (arraylist));
	//   18   31:aload           4
	//   19   33:astore_3        
			if(i >= j)
				continue;
	//   20   34:iload_1         
	//   21   35:iload_2         
	//   22   36:icmpge          9
			arraylist.add(mActive.valueAt(i));
	//   23   39:aload           4
	//   24   41:aload_0         
	//   25   42:getfield        #313 <Field SparseArray mActive>
	//   26   45:iload_1         
	//   27   46:invokevirtual   #319 <Method Object SparseArray.valueAt(int)>
	//   28   49:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//   29   52:pop             
			i++;
	//   30   53:iload_1         
	//   31   54:iconst_1        
	//   32   55:iadd            
	//   33   56:istore_1        
		} while(true);
	//   34   57:goto            31
		if(true) goto _L4; else goto _L3
_L3:
	}

	public FragmentManager.BackStackEntry getBackStackEntryAt(int i)
	{
		return (FragmentManager.BackStackEntry)mBackStack.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #829 <Field ArrayList mBackStack>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #1260 <Class FragmentManager$BackStackEntry>
	//    5   11:areturn         
	}

	public int getBackStackEntryCount()
	{
		if(mBackStack != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #829 <Field ArrayList mBackStack>
	//*   2    4:ifnull          15
			return mBackStack.size();
	//    3    7:aload_0         
	//    4    8:getfield        #829 <Field ArrayList mBackStack>
	//    5   11:invokevirtual   #202 <Method int ArrayList.size()>
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
	//    3    3:invokevirtual   #1269 <Method int Bundle.getInt(String, int)>
	//    4    6:istore_3        
		if(i == -1)
	//*   5    7:iload_3         
	//*   6    8:iconst_m1       
	//*   7    9:icmpne          16
		{
			bundle = null;
	//    8   12:aconst_null     
	//    9   13:astore_1        
		} else
	//*  10   14:aload_1         
	//*  11   15:areturn         
		{
			Fragment fragment = (Fragment)mActive.get(i);
	//   12   16:aload_0         
	//   13   17:getfield        #313 <Field SparseArray mActive>
	//   14   20:iload_3         
	//   15   21:invokevirtual   #1270 <Method Object SparseArray.get(int)>
	//   16   24:checkcast       #208 <Class Fragment>
	//   17   27:astore          4
			bundle = ((Bundle) (fragment));
	//   18   29:aload           4
	//   19   31:astore_1        
			if(fragment == null)
	//*  20   32:aload           4
	//*  21   34:ifnonnull       14
			{
				throwException(((RuntimeException) (new IllegalStateException((new StringBuilder()).append("Fragment no longer exists for key ").append(s).append(": index ").append(i).toString()))));
	//   22   37:aload_0         
	//   23   38:new             #331 <Class IllegalStateException>
	//   24   41:dup             
	//   25   42:new             #340 <Class StringBuilder>
	//   26   45:dup             
	//   27   46:invokespecial   #341 <Method void StringBuilder()>
	//   28   49:ldc2            #1272 <String "Fragment no longer exists for key ">
	//   29   52:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   30   55:aload_2         
	//   31   56:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   32   59:ldc2            #1274 <String ": index ">
	//   33   62:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   34   65:iload_3         
	//   35   66:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//   36   69:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   37   72:invokespecial   #336 <Method void IllegalStateException(String)>
	//   38   75:invokespecial   #1276 <Method void throwException(RuntimeException)>
				return fragment;
	//   39   78:aload           4
	//   40   80:areturn         
			}
		}
		return ((Fragment) (bundle));
	}

	public List getFragments()
	{
		if(mAdded.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #164 <Field ArrayList mAdded>
	//*   2    4:invokevirtual   #555 <Method boolean ArrayList.isEmpty()>
	//*   3    7:ifeq            14
			return Collections.EMPTY_LIST;
	//    4   10:getstatic       #1282 <Field List Collections.EMPTY_LIST>
	//    5   13:areturn         
		List list;
		synchronized(mAdded)
	//*   6   14:aload_0         
	//*   7   15:getfield        #164 <Field ArrayList mAdded>
	//*   8   18:astore_1        
	//*   9   19:aload_1         
	//*  10   20:monitorenter    
		{
			list = (List)mAdded.clone();
	//   11   21:aload_0         
	//   12   22:getfield        #164 <Field ArrayList mAdded>
	//   13   25:invokevirtual   #1285 <Method Object ArrayList.clone()>
	//   14   28:checkcast       #675 <Class List>
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
	//    1    1:getfield        #690 <Field Fragment mPrimaryNav>
	//    2    4:areturn         
	}

	public void hideFragment(Fragment fragment)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		if(DEBUG)
	//*   2    2:getstatic       #133 <Field boolean DEBUG>
	//*   3    5:ifeq            34
			Log.v("FragmentManager", (new StringBuilder()).append("hide: ").append(((Object) (fragment))).toString());
	//    4    8:ldc1            #67  <String "FragmentManager">
	//    5   10:new             #340 <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #341 <Method void StringBuilder()>
	//    8   17:ldc2            #1290 <String "hide: ">
	//    9   20:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   10   23:aload_1         
	//   11   24:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   12   27:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   13   30:invokestatic    #839 <Method int Log.v(String, String)>
	//   14   33:pop             
		if(!fragment.mHidden)
	//*  15   34:aload_1         
	//*  16   35:getfield        #228 <Field boolean Fragment.mHidden>
	//*  17   38:ifne            58
		{
			fragment.mHidden = true;
	//   18   41:aload_1         
	//   19   42:iconst_1        
	//   20   43:putfield        #228 <Field boolean Fragment.mHidden>
			if(fragment.mHiddenChanged)
	//*  21   46:aload_1         
	//*  22   47:getfield        #857 <Field boolean Fragment.mHiddenChanged>
	//*  23   50:ifne            59
	//*  24   53:aload_1         
	//*  25   54:iload_2         
	//*  26   55:putfield        #857 <Field boolean Fragment.mHiddenChanged>
	//*  27   58:return          
				flag = false;
	//   28   59:iconst_0        
	//   29   60:istore_2        
			fragment.mHiddenChanged = flag;
		}
	//*  30   61:goto            53
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
	//    1    1:getfield        #171 <Field int mCurState>
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
	//    1    1:getfield        #329 <Field boolean mStateSaved>
	//    2    4:ireturn         
	}

	AnimationOrAnimator loadAnimation(Fragment fragment, int i, boolean flag, int j)
	{
		int k;
		k = fragment.getNextAnim();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #214 <Method int Fragment.getNextAnim()>
	//    2    4:istore          6
		Animation animation = fragment.onCreateAnimation(i, flag, k);
	//    3    6:aload_1         
	//    4    7:iload_2         
	//    5    8:iload_3         
	//    6    9:iload           6
	//    7   11:invokevirtual   #1299 <Method Animation Fragment.onCreateAnimation(int, boolean, int)>
	//    8   14:astore          8
		if(animation != null)
	//*   9   16:aload           8
	//*  10   18:ifnull          32
			return new AnimationOrAnimator(animation);
	//   11   21:new             #24  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   12   24:dup             
	//   13   25:aload           8
	//   14   27:aconst_null     
	//   15   28:invokespecial   #619 <Method void FragmentManagerImpl$AnimationOrAnimator(Animation, FragmentManagerImpl$1)>
	//   16   31:areturn         
		fragment = ((Fragment) (fragment.onCreateAnimator(i, flag, k)));
	//   17   32:aload_1         
	//   18   33:iload_2         
	//   19   34:iload_3         
	//   20   35:iload           6
	//   21   37:invokevirtual   #1303 <Method Animator Fragment.onCreateAnimator(int, boolean, int)>
	//   22   40:astore_1        
		if(fragment != null)
	//*  23   41:aload_1         
	//*  24   42:ifnull          55
			return new AnimationOrAnimator(((Animator) (fragment)));
	//   25   45:new             #24  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   26   48:dup             
	//   27   49:aload_1         
	//   28   50:aconst_null     
	//   29   51:invokespecial   #1306 <Method void FragmentManagerImpl$AnimationOrAnimator(Animator, FragmentManagerImpl$1)>
	//   30   54:areturn         
		if(k == 0) goto _L2; else goto _L1
	//   31   55:iload           6
	//   32   57:ifeq            199
_L1:
		boolean flag2 = "anim".equals(((Object) (mHost.getContext().getResources().getResourceTypeName(k))));
	//   33   60:ldc2            #1308 <String "anim">
	//   34   63:aload_0         
	//   35   64:getfield        #444 <Field FragmentHostCallback mHost>
	//   36   67:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//   37   70:invokevirtual   #1318 <Method Resources Context.getResources()>
	//   38   73:iload           6
	//   39   75:invokevirtual   #1323 <Method String Resources.getResourceTypeName(int)>
	//   40   78:invokevirtual   #667 <Method boolean String.equals(Object)>
	//   41   81:istore          7
		if(!flag2) goto _L4; else goto _L3
	//   42   83:iload           7
	//   43   85:ifeq            387
_L3:
		boolean flag1;
		try
		{
			fragment = ((Fragment) (AnimationUtils.loadAnimation(mHost.getContext(), k)));
	//   44   88:aload_0         
	//   45   89:getfield        #444 <Field FragmentHostCallback mHost>
	//   46   92:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//   47   95:iload           6
	//   48   97:invokestatic    #1328 <Method Animation AnimationUtils.loadAnimation(Context, int)>
	//   49  100:astore_1        
		}
	//*  50  101:aload_1         
	//*  51  102:ifnull          120
	//*  52  105:new             #24  <Class FragmentManagerImpl$AnimationOrAnimator>
	//*  53  108:dup             
	//*  54  109:aload_1         
	//*  55  110:aconst_null     
	//*  56  111:invokespecial   #619 <Method void FragmentManagerImpl$AnimationOrAnimator(Animation, FragmentManagerImpl$1)>
	//*  57  114:astore_1        
	//*  58  115:aload_1         
	//*  59  116:areturn         
		// Misplaced declaration of an exception variable
		catch(Fragment fragment)
	//*  60  117:astore_1        
		{
			throw fragment;
	//   61  118:aload_1         
	//   62  119:athrow          
		}
	//*  63  120:iconst_1        
	//*  64  121:istore          5
	//*  65  123:iload           5
	//*  66  125:ifne            199
	//*  67  128:aload_0         
	//*  68  129:getfield        #444 <Field FragmentHostCallback mHost>
	//*  69  132:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//*  70  135:iload           6
	//*  71  137:invokestatic    #1334 <Method Animator AnimatorInflater.loadAnimator(Context, int)>
	//*  72  140:astore_1        
	//*  73  141:aload_1         
	//*  74  142:ifnull          199
	//*  75  145:new             #24  <Class FragmentManagerImpl$AnimationOrAnimator>
	//*  76  148:dup             
	//*  77  149:aload_1         
	//*  78  150:aconst_null     
	//*  79  151:invokespecial   #1306 <Method void FragmentManagerImpl$AnimationOrAnimator(Animator, FragmentManagerImpl$1)>
	//*  80  154:astore_1        
	//*  81  155:aload_1         
	//*  82  156:areturn         
	//*  83  157:astore_1        
	//*  84  158:iload           7
	//*  85  160:ifeq            172
	//*  86  163:aload_1         
	//*  87  164:athrow          
		// Misplaced declaration of an exception variable
		catch(Fragment fragment)
	//*  88  165:astore_1        
		{
			flag1 = false;
	//   89  166:iconst_0        
	//   90  167:istore          5
			continue; /* Loop/switch isn't completed */
	//   91  169:goto            123
		}
		if(fragment == null)
			break MISSING_BLOCK_LABEL_120;
		fragment = ((Fragment) (new AnimationOrAnimator(((Animation) (fragment)))));
		return ((AnimationOrAnimator) (fragment));
		flag1 = true;
_L8:
		if(flag1) goto _L2; else goto _L5
_L5:
		fragment = ((Fragment) (AnimatorInflater.loadAnimator(mHost.getContext(), k)));
		if(fragment == null) goto _L2; else goto _L6
_L6:
		fragment = ((Fragment) (new AnimationOrAnimator(((Animator) (fragment)))));
		return ((AnimationOrAnimator) (fragment));
		fragment;
		if(flag2)
			throw fragment;
		fragment = ((Fragment) (AnimationUtils.loadAnimation(mHost.getContext(), k)));
	//   92  172:aload_0         
	//   93  173:getfield        #444 <Field FragmentHostCallback mHost>
	//   94  176:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//   95  179:iload           6
	//   96  181:invokestatic    #1328 <Method Animation AnimationUtils.loadAnimation(Context, int)>
	//   97  184:astore_1        
		if(fragment != null)
	//*  98  185:aload_1         
	//*  99  186:ifnull          199
			return new AnimationOrAnimator(((Animation) (fragment)));
	//  100  189:new             #24  <Class FragmentManagerImpl$AnimationOrAnimator>
	//  101  192:dup             
	//  102  193:aload_1         
	//  103  194:aconst_null     
	//  104  195:invokespecial   #619 <Method void FragmentManagerImpl$AnimationOrAnimator(Animation, FragmentManagerImpl$1)>
	//  105  198:areturn         
_L2:
		if(i == 0)
	//* 106  199:iload_2         
	//* 107  200:ifne            205
			return null;
	//  108  203:aconst_null     
	//  109  204:areturn         
		i = transitToStyleIndex(i, flag);
	//  110  205:iload_2         
	//  111  206:iload_3         
	//  112  207:invokestatic    #1336 <Method int transitToStyleIndex(int, boolean)>
	//  113  210:istore_2        
		if(i < 0)
	//* 114  211:iload_2         
	//* 115  212:ifge            217
			return null;
	//  116  215:aconst_null     
	//  117  216:areturn         
		switch(i)
	//* 118  217:iload_2         
		{
	//* 119  218:tableswitch     1 6: default 256
	//	               1 291
	//	               2 308
	//	               3 325
	//	               4 342
	//	               5 359
	//	               6 372
		default:
			i = j;
	//  120  256:iload           4
	//  121  258:istore_2        
			if(j == 0)
	//* 122  259:iload           4
	//* 123  261:ifne            285
			{
				i = j;
	//  124  264:iload           4
	//  125  266:istore_2        
				if(mHost.onHasWindowAnimations())
	//* 126  267:aload_0         
	//* 127  268:getfield        #444 <Field FragmentHostCallback mHost>
	//* 128  271:invokevirtual   #1339 <Method boolean FragmentHostCallback.onHasWindowAnimations()>
	//* 129  274:ifeq            285
					i = mHost.onGetWindowAnimations();
	//  130  277:aload_0         
	//  131  278:getfield        #444 <Field FragmentHostCallback mHost>
	//  132  281:invokevirtual   #1342 <Method int FragmentHostCallback.onGetWindowAnimations()>
	//  133  284:istore_2        
			}
			if(i == 0)
	//* 134  285:iload_2         
	//* 135  286:ifne            385
				return null;
	//  136  289:aconst_null     
	//  137  290:areturn         
			else
	//* 138  291:aload_0         
	//* 139  292:getfield        #444 <Field FragmentHostCallback mHost>
	//* 140  295:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//* 141  298:ldc2            #1343 <Float 1.125F>
	//* 142  301:fconst_1        
	//* 143  302:fconst_0        
	//* 144  303:fconst_1        
	//* 145  304:invokestatic    #1345 <Method FragmentManagerImpl$AnimationOrAnimator makeOpenCloseAnimation(Context, float, float, float, float)>
	//* 146  307:areturn         
	//* 147  308:aload_0         
	//* 148  309:getfield        #444 <Field FragmentHostCallback mHost>
	//* 149  312:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//* 150  315:fconst_1        
	//* 151  316:ldc2            #1346 <Float 0.975F>
	//* 152  319:fconst_1        
	//* 153  320:fconst_0        
	//* 154  321:invokestatic    #1345 <Method FragmentManagerImpl$AnimationOrAnimator makeOpenCloseAnimation(Context, float, float, float, float)>
	//* 155  324:areturn         
	//* 156  325:aload_0         
	//* 157  326:getfield        #444 <Field FragmentHostCallback mHost>
	//* 158  329:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//* 159  332:ldc2            #1346 <Float 0.975F>
	//* 160  335:fconst_1        
	//* 161  336:fconst_0        
	//* 162  337:fconst_1        
	//* 163  338:invokestatic    #1345 <Method FragmentManagerImpl$AnimationOrAnimator makeOpenCloseAnimation(Context, float, float, float, float)>
	//* 164  341:areturn         
	//* 165  342:aload_0         
	//* 166  343:getfield        #444 <Field FragmentHostCallback mHost>
	//* 167  346:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//* 168  349:fconst_1        
	//* 169  350:ldc2            #1347 <Float 1.075F>
	//* 170  353:fconst_1        
	//* 171  354:fconst_0        
	//* 172  355:invokestatic    #1345 <Method FragmentManagerImpl$AnimationOrAnimator makeOpenCloseAnimation(Context, float, float, float, float)>
	//* 173  358:areturn         
	//* 174  359:aload_0         
	//* 175  360:getfield        #444 <Field FragmentHostCallback mHost>
	//* 176  363:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//* 177  366:fconst_0        
	//* 178  367:fconst_1        
	//* 179  368:invokestatic    #1349 <Method FragmentManagerImpl$AnimationOrAnimator makeFadeAnimation(Context, float, float)>
	//* 180  371:areturn         
	//* 181  372:aload_0         
	//* 182  373:getfield        #444 <Field FragmentHostCallback mHost>
	//* 183  376:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//* 184  379:fconst_1        
	//* 185  380:fconst_0        
	//* 186  381:invokestatic    #1349 <Method FragmentManagerImpl$AnimationOrAnimator makeFadeAnimation(Context, float, float)>
	//* 187  384:areturn         
				return null;
	//  188  385:aconst_null     
	//  189  386:areturn         

		case 1: // '\001'
			return makeOpenCloseAnimation(mHost.getContext(), 1.125F, 1.0F, 0.0F, 1.0F);

		case 2: // '\002'
			return makeOpenCloseAnimation(mHost.getContext(), 1.0F, 0.975F, 1.0F, 0.0F);

		case 3: // '\003'
			return makeOpenCloseAnimation(mHost.getContext(), 0.975F, 1.0F, 0.0F, 1.0F);

		case 4: // '\004'
			return makeOpenCloseAnimation(mHost.getContext(), 1.0F, 1.075F, 1.0F, 0.0F);

		case 5: // '\005'
			return makeFadeAnimation(mHost.getContext(), 0.0F, 1.0F);

		case 6: // '\006'
			return makeFadeAnimation(mHost.getContext(), 1.0F, 0.0F);
		}
_L4:
		flag1 = false;
	//  190  387:iconst_0        
	//  191  388:istore          5
		if(true) goto _L8; else goto _L7
	//  192  390:goto            123
_L7:
	}

	void makeActive(Fragment fragment)
	{
		if(fragment.mIndex < 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1350 <Field int Fragment.mIndex>
	//*   2    4:iflt            8
	//*   3    7:return          
		{
			int i = mNextFragmentIndex;
	//    4    8:aload_0         
	//    5    9:getfield        #159 <Field int mNextFragmentIndex>
	//    6   12:istore_2        
			mNextFragmentIndex = i + 1;
	//    7   13:aload_0         
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:iadd            
	//   11   17:putfield        #159 <Field int mNextFragmentIndex>
			fragment.setIndex(i, mParent);
	//   12   20:aload_1         
	//   13   21:iload_2         
	//   14   22:aload_0         
	//   15   23:getfield        #905 <Field Fragment mParent>
	//   16   26:invokevirtual   #1354 <Method void Fragment.setIndex(int, Fragment)>
			if(mActive == null)
	//*  17   29:aload_0         
	//*  18   30:getfield        #313 <Field SparseArray mActive>
	//*  19   33:ifnonnull       47
				mActive = new SparseArray();
	//   20   36:aload_0         
	//   21   37:new             #315 <Class SparseArray>
	//   22   40:dup             
	//   23   41:invokespecial   #1355 <Method void SparseArray()>
	//   24   44:putfield        #313 <Field SparseArray mActive>
			mActive.put(fragment.mIndex, ((Object) (fragment)));
	//   25   47:aload_0         
	//   26   48:getfield        #313 <Field SparseArray mActive>
	//   27   51:aload_1         
	//   28   52:getfield        #1350 <Field int Fragment.mIndex>
	//   29   55:aload_1         
	//   30   56:invokevirtual   #1358 <Method void SparseArray.put(int, Object)>
			if(DEBUG)
	//*  31   59:getstatic       #133 <Field boolean DEBUG>
	//*  32   62:ifeq            7
			{
				Log.v("FragmentManager", (new StringBuilder()).append("Allocated fragment index ").append(((Object) (fragment))).toString());
	//   33   65:ldc1            #67  <String "FragmentManager">
	//   34   67:new             #340 <Class StringBuilder>
	//   35   70:dup             
	//   36   71:invokespecial   #341 <Method void StringBuilder()>
	//   37   74:ldc2            #1360 <String "Allocated fragment index ">
	//   38   77:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   39   80:aload_1         
	//   40   81:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   41   84:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   42   87:invokestatic    #839 <Method int Log.v(String, String)>
	//   43   90:pop             
				return;
	//   44   91:return          
			}
		}
	}

	void makeInactive(Fragment fragment)
	{
		if(fragment.mIndex < 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1350 <Field int Fragment.mIndex>
	//*   2    4:ifge            8
			return;
	//    3    7:return          
		if(DEBUG)
	//*   4    8:getstatic       #133 <Field boolean DEBUG>
	//*   5   11:ifeq            40
			Log.v("FragmentManager", (new StringBuilder()).append("Freeing fragment index ").append(((Object) (fragment))).toString());
	//    6   14:ldc1            #67  <String "FragmentManager">
	//    7   16:new             #340 <Class StringBuilder>
	//    8   19:dup             
	//    9   20:invokespecial   #341 <Method void StringBuilder()>
	//   10   23:ldc2            #1363 <String "Freeing fragment index ">
	//   11   26:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   12   29:aload_1         
	//   13   30:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   14   33:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   15   36:invokestatic    #839 <Method int Log.v(String, String)>
	//   16   39:pop             
		mActive.put(fragment.mIndex, ((Object) (null)));
	//   17   40:aload_0         
	//   18   41:getfield        #313 <Field SparseArray mActive>
	//   19   44:aload_1         
	//   20   45:getfield        #1350 <Field int Fragment.mIndex>
	//   21   48:aconst_null     
	//   22   49:invokevirtual   #1358 <Method void SparseArray.put(int, Object)>
		mHost.inactivateFragment(fragment.mWho);
	//   23   52:aload_0         
	//   24   53:getfield        #444 <Field FragmentHostCallback mHost>
	//   25   56:aload_1         
	//   26   57:getfield        #1366 <Field String Fragment.mWho>
	//   27   60:invokevirtual   #1369 <Method void FragmentHostCallback.inactivateFragment(String)>
		fragment.initState();
	//   28   63:aload_1         
	//   29   64:invokevirtual   #1372 <Method void Fragment.initState()>
	//   30   67:return          
	}

	void moveFragmentToExpectedState(Fragment fragment)
	{
		if(fragment != null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
	//*   2    4:return          
		{
			int j = mCurState;
	//    3    5:aload_0         
	//    4    6:getfield        #171 <Field int mCurState>
	//    5    9:istore_3        
			int i = j;
	//    6   10:iload_3         
	//    7   11:istore_2        
			if(fragment.mRemoving)
	//*   8   12:aload_1         
	//*   9   13:getfield        #854 <Field boolean Fragment.mRemoving>
	//*  10   16:ifeq            32
				if(fragment.isInBackStack())
	//*  11   19:aload_1         
	//*  12   20:invokevirtual   #1376 <Method boolean Fragment.isInBackStack()>
	//*  13   23:ifeq            225
					i = Math.min(j, 1);
	//   14   26:iload_3         
	//   15   27:iconst_1        
	//   16   28:invokestatic    #198 <Method int Math.min(int, int)>
	//   17   31:istore_2        
				else
	//*  18   32:aload_0         
	//*  19   33:aload_1         
	//*  20   34:iload_2         
	//*  21   35:aload_1         
	//*  22   36:invokevirtual   #217 <Method int Fragment.getNextTransition()>
	//*  23   39:aload_1         
	//*  24   40:invokevirtual   #917 <Method int Fragment.getNextTransitionStyle()>
	//*  25   43:iconst_0        
	//*  26   44:invokevirtual   #221 <Method void moveToState(Fragment, int, int, int, boolean)>
	//*  27   47:aload_1         
	//*  28   48:getfield        #225 <Field View Fragment.mView>
	//*  29   51:ifnull          212
	//*  30   54:aload_0         
	//*  31   55:aload_1         
	//*  32   56:invokespecial   #1378 <Method Fragment findFragmentUnder(Fragment)>
	//*  33   59:astore          4
	//*  34   61:aload           4
	//*  35   63:ifnull          118
	//*  36   66:aload           4
	//*  37   68:getfield        #225 <Field View Fragment.mView>
	//*  38   71:astore          4
	//*  39   73:aload_1         
	//*  40   74:getfield        #288 <Field ViewGroup Fragment.mContainer>
	//*  41   77:astore          5
	//*  42   79:aload           5
	//*  43   81:aload           4
	//*  44   83:invokevirtual   #1382 <Method int ViewGroup.indexOfChild(View)>
	//*  45   86:istore_2        
	//*  46   87:aload           5
	//*  47   89:aload_1         
	//*  48   90:getfield        #225 <Field View Fragment.mView>
	//*  49   93:invokevirtual   #1382 <Method int ViewGroup.indexOfChild(View)>
	//*  50   96:istore_3        
	//*  51   97:iload_3         
	//*  52   98:iload_2         
	//*  53   99:icmpge          118
	//*  54  102:aload           5
	//*  55  104:iload_3         
	//*  56  105:invokevirtual   #1385 <Method void ViewGroup.removeViewAt(int)>
	//*  57  108:aload           5
	//*  58  110:aload_1         
	//*  59  111:getfield        #225 <Field View Fragment.mView>
	//*  60  114:iload_2         
	//*  61  115:invokevirtual   #1389 <Method void ViewGroup.addView(View, int)>
	//*  62  118:aload_1         
	//*  63  119:getfield        #231 <Field boolean Fragment.mIsNewlyAdded>
	//*  64  122:ifeq            212
	//*  65  125:aload_1         
	//*  66  126:getfield        #288 <Field ViewGroup Fragment.mContainer>
	//*  67  129:ifnull          212
	//*  68  132:aload_1         
	//*  69  133:getfield        #396 <Field float Fragment.mPostponedAlpha>
	//*  70  136:fconst_0        
	//*  71  137:fcmpl           
	//*  72  138:ifle            152
	//*  73  141:aload_1         
	//*  74  142:getfield        #225 <Field View Fragment.mView>
	//*  75  145:aload_1         
	//*  76  146:getfield        #396 <Field float Fragment.mPostponedAlpha>
	//*  77  149:invokevirtual   #399 <Method void View.setAlpha(float)>
	//*  78  152:aload_1         
	//*  79  153:fconst_0        
	//*  80  154:putfield        #396 <Field float Fragment.mPostponedAlpha>
	//*  81  157:aload_1         
	//*  82  158:iconst_0        
	//*  83  159:putfield        #231 <Field boolean Fragment.mIsNewlyAdded>
	//*  84  162:aload_0         
	//*  85  163:aload_1         
	//*  86  164:aload_1         
	//*  87  165:invokevirtual   #217 <Method int Fragment.getNextTransition()>
	//*  88  168:iconst_1        
	//*  89  169:aload_1         
	//*  90  170:invokevirtual   #917 <Method int Fragment.getNextTransitionStyle()>
	//*  91  173:invokevirtual   #921 <Method FragmentManagerImpl$AnimationOrAnimator loadAnimation(Fragment, int, boolean, int)>
	//*  92  176:astore          4
	//*  93  178:aload           4
	//*  94  180:ifnull          212
	//*  95  183:aload_1         
	//*  96  184:getfield        #225 <Field View Fragment.mView>
	//*  97  187:aload           4
	//*  98  189:invokestatic    #271 <Method void setHWLayerAnimListenerIfAlpha(View, FragmentManagerImpl$AnimationOrAnimator)>
	//*  99  192:aload           4
	//* 100  194:getfield        #250 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//* 101  197:ifnull          234
	//* 102  200:aload_1         
	//* 103  201:getfield        #225 <Field View Fragment.mView>
	//* 104  204:aload           4
	//* 105  206:getfield        #250 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//* 106  209:invokevirtual   #277 <Method void View.startAnimation(Animation)>
	//* 107  212:aload_1         
	//* 108  213:getfield        #857 <Field boolean Fragment.mHiddenChanged>
	//* 109  216:ifeq            4
	//* 110  219:aload_0         
	//* 111  220:aload_1         
	//* 112  221:invokevirtual   #1391 <Method void completeShowHideFragment(Fragment)>
	//* 113  224:return          
					i = Math.min(j, 0);
	//  114  225:iload_3         
	//  115  226:iconst_0        
	//  116  227:invokestatic    #198 <Method int Math.min(int, int)>
	//  117  230:istore_2        
			moveToState(fragment, i, fragment.getNextTransition(), fragment.getNextTransitionStyle(), false);
			if(fragment.mView != null)
			{
				Object obj = ((Object) (findFragmentUnder(fragment)));
				if(obj != null)
				{
					obj = ((Object) (((Fragment) (obj)).mView));
					ViewGroup viewgroup = fragment.mContainer;
					i = viewgroup.indexOfChild(((View) (obj)));
					j = viewgroup.indexOfChild(fragment.mView);
					if(j < i)
					{
						viewgroup.removeViewAt(j);
						viewgroup.addView(fragment.mView, i);
					}
				}
				if(fragment.mIsNewlyAdded && fragment.mContainer != null)
				{
					if(fragment.mPostponedAlpha > 0.0F)
						fragment.mView.setAlpha(fragment.mPostponedAlpha);
					fragment.mPostponedAlpha = 0.0F;
					fragment.mIsNewlyAdded = false;
					AnimationOrAnimator animationoranimator = loadAnimation(fragment, fragment.getNextTransition(), true, fragment.getNextTransitionStyle());
					if(animationoranimator != null)
					{
						setHWLayerAnimListenerIfAlpha(fragment.mView, animationoranimator);
						if(animationoranimator.animation != null)
						{
							fragment.mView.startAnimation(animationoranimator.animation);
						} else
	//* 118  231:goto            32
						{
							animationoranimator.animator.setTarget(((Object) (fragment.mView)));
	//  119  234:aload           4
	//  120  236:getfield        #281 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//  121  239:aload_1         
	//  122  240:getfield        #225 <Field View Fragment.mView>
	//  123  243:invokevirtual   #306 <Method void Animator.setTarget(Object)>
							animationoranimator.animator.start();
	//  124  246:aload           4
	//  125  248:getfield        #281 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//  126  251:invokevirtual   #309 <Method void Animator.start()>
						}
					}
				}
			}
			if(fragment.mHiddenChanged)
			{
				completeShowHideFragment(fragment);
				return;
			}
		}
	//* 127  254:goto            212
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
	//    5   11:new             #331 <Class IllegalStateException>
	//    6   14:dup             
	//    7   15:ldc2            #1393 <String "No activity">
	//    8   18:invokespecial   #336 <Method void IllegalStateException(String)>
	//    9   21:athrow          
		if(flag || i != mCurState)
	//*  10   22:iload_2         
	//*  11   23:ifne            35
	//*  12   26:iload_1         
	//*  13   27:aload_0         
	//*  14   28:getfield        #171 <Field int mCurState>
	//*  15   31:icmpne          35
	//*  16   34:return          
		{
			mCurState = i;
	//   17   35:aload_0         
	//   18   36:iload_1         
	//   19   37:putfield        #171 <Field int mCurState>
			if(mActive != null)
	//*  20   40:aload_0         
	//*  21   41:getfield        #313 <Field SparseArray mActive>
	//*  22   44:ifnull          34
			{
				int l = mAdded.size();
	//   23   47:aload_0         
	//   24   48:getfield        #164 <Field ArrayList mAdded>
	//   25   51:invokevirtual   #202 <Method int ArrayList.size()>
	//   26   54:istore          4
				int j = 0;
	//   27   56:iconst_0        
	//   28   57:istore_3        
				i = 0;
	//   29   58:iconst_0        
	//   30   59:istore_1        
				for(; j < l; j++)
	//*  31   60:iload_3         
	//*  32   61:iload           4
	//*  33   63:icmpge          111
				{
					Fragment fragment = (Fragment)mAdded.get(j);
	//   34   66:aload_0         
	//   35   67:getfield        #164 <Field ArrayList mAdded>
	//   36   70:iload_3         
	//   37   71:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   38   74:checkcast       #208 <Class Fragment>
	//   39   77:astore          5
					moveFragmentToExpectedState(fragment);
	//   40   79:aload_0         
	//   41   80:aload           5
	//   42   82:invokevirtual   #1395 <Method void moveFragmentToExpectedState(Fragment)>
					if(fragment.mLoaderManager != null)
	//*  43   85:aload           5
	//*  44   87:getfield        #1113 <Field LoaderManagerImpl Fragment.mLoaderManager>
	//*  45   90:ifnull          248
						i = fragment.mLoaderManager.hasRunningLoaders() | i;
	//   46   93:aload           5
	//   47   95:getfield        #1113 <Field LoaderManagerImpl Fragment.mLoaderManager>
	//   48   98:invokevirtual   #1118 <Method boolean LoaderManagerImpl.hasRunningLoaders()>
	//   49  101:iload_1         
	//   50  102:ior             
	//   51  103:istore_1        
				}

	//   52  104:iload_3         
	//   53  105:iconst_1        
	//   54  106:iadd            
	//   55  107:istore_3        
	//*  56  108:goto            60
				l = mActive.size();
	//   57  111:aload_0         
	//   58  112:getfield        #313 <Field SparseArray mActive>
	//   59  115:invokevirtual   #316 <Method int SparseArray.size()>
	//   60  118:istore          4
				for(int k = 0; k < l; k++)
	//*  61  120:iconst_0        
	//*  62  121:istore_3        
	//*  63  122:iload_3         
	//*  64  123:iload           4
	//*  65  125:icmpge          202
				{
					Fragment fragment1 = (Fragment)mActive.valueAt(k);
	//   66  128:aload_0         
	//   67  129:getfield        #313 <Field SparseArray mActive>
	//   68  132:iload_3         
	//   69  133:invokevirtual   #319 <Method Object SparseArray.valueAt(int)>
	//   70  136:checkcast       #208 <Class Fragment>
	//   71  139:astore          5
					if(fragment1 == null || !fragment1.mRemoving && !fragment1.mDetached || fragment1.mIsNewlyAdded)
						continue;
	//   72  141:aload           5
	//   73  143:ifnull          245
	//   74  146:aload           5
	//   75  148:getfield        #854 <Field boolean Fragment.mRemoving>
	//   76  151:ifne            162
	//   77  154:aload           5
	//   78  156:getfield        #846 <Field boolean Fragment.mDetached>
	//   79  159:ifeq            245
	//   80  162:aload           5
	//   81  164:getfield        #231 <Field boolean Fragment.mIsNewlyAdded>
	//   82  167:ifne            245
					moveFragmentToExpectedState(fragment1);
	//   83  170:aload_0         
	//   84  171:aload           5
	//   85  173:invokevirtual   #1395 <Method void moveFragmentToExpectedState(Fragment)>
					if(fragment1.mLoaderManager != null)
	//*  86  176:aload           5
	//*  87  178:getfield        #1113 <Field LoaderManagerImpl Fragment.mLoaderManager>
	//*  88  181:ifnull          245
						i = fragment1.mLoaderManager.hasRunningLoaders() | i;
	//   89  184:aload           5
	//   90  186:getfield        #1113 <Field LoaderManagerImpl Fragment.mLoaderManager>
	//   91  189:invokevirtual   #1118 <Method boolean LoaderManagerImpl.hasRunningLoaders()>
	//   92  192:iload_1         
	//   93  193:ior             
	//   94  194:istore_1        
				}

	//   95  195:iload_3         
	//   96  196:iconst_1        
	//   97  197:iadd            
	//   98  198:istore_3        
	//*  99  199:goto            122
				if(i == 0)
	//* 100  202:iload_1         
	//* 101  203:ifne            210
					startPendingDeferredFragments();
	//  102  206:aload_0         
	//  103  207:invokevirtual   #1121 <Method void startPendingDeferredFragments()>
				if(mNeedMenuInvalidate && mHost != null && mCurState == 5)
	//* 104  210:aload_0         
	//* 105  211:getfield        #865 <Field boolean mNeedMenuInvalidate>
	//* 106  214:ifeq            34
	//* 107  217:aload_0         
	//* 108  218:getfield        #444 <Field FragmentHostCallback mHost>
	//* 109  221:ifnull          34
	//* 110  224:aload_0         
	//* 111  225:getfield        #171 <Field int mCurState>
	//* 112  228:iconst_5        
	//* 113  229:icmpne          34
				{
					mHost.onSupportInvalidateOptionsMenu();
	//  114  232:aload_0         
	//  115  233:getfield        #444 <Field FragmentHostCallback mHost>
	//  116  236:invokevirtual   #1398 <Method void FragmentHostCallback.onSupportInvalidateOptionsMenu()>
					mNeedMenuInvalidate = false;
	//  117  239:aload_0         
	//  118  240:iconst_0        
	//  119  241:putfield        #865 <Field boolean mNeedMenuInvalidate>
					return;
	//  120  244:return          
				}
			}
		}
	//* 121  245:goto            195
	//* 122  248:goto            104
	}

	void moveToState(Fragment fragment)
	{
		moveToState(fragment, mCurState, 0, 0, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #171 <Field int mCurState>
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #221 <Method void moveToState(Fragment, int, int, int, boolean)>
	//    8   12:return          
	}

	void moveToState(Fragment fragment, int i, int j, int k, boolean flag)
	{
		boolean flag1;
		int j1;
label0:
		{
			flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          8
			if(fragment.mAdded)
	//*   2    3:aload_1         
	//*   3    4:getfield        #640 <Field boolean Fragment.mAdded>
	//*   4    7:ifeq            20
			{
				j1 = i;
	//    5   10:iload_2         
	//    6   11:istore          7
				if(!fragment.mDetached)
					break label0;
	//    7   13:aload_1         
	//    8   14:getfield        #846 <Field boolean Fragment.mDetached>
	//    9   17:ifeq            31
			}
			j1 = i;
	//   10   20:iload_2         
	//   11   21:istore          7
			if(i > 1)
	//*  12   23:iload_2         
	//*  13   24:iconst_1        
	//*  14   25:icmple          31
				j1 = 1;
	//   15   28:iconst_1        
	//   16   29:istore          7
		}
		int l = j1;
	//   17   31:iload           7
	//   18   33:istore          6
		if(fragment.mRemoving)
	//*  19   35:aload_1         
	//*  20   36:getfield        #854 <Field boolean Fragment.mRemoving>
	//*  21   39:ifeq            72
		{
			l = j1;
	//   22   42:iload           7
	//   23   44:istore          6
			if(j1 > fragment.mState)
	//*  24   46:iload           7
	//*  25   48:aload_1         
	//*  26   49:getfield        #211 <Field int Fragment.mState>
	//*  27   52:icmple          72
				if(fragment.mState == 0 && fragment.isInBackStack())
	//*  28   55:aload_1         
	//*  29   56:getfield        #211 <Field int Fragment.mState>
	//*  30   59:ifne            127
	//*  31   62:aload_1         
	//*  32   63:invokevirtual   #1376 <Method boolean Fragment.isInBackStack()>
	//*  33   66:ifeq            127
					l = 1;
	//   34   69:iconst_1        
	//   35   70:istore          6
				else
	//*  36   72:iload           6
	//*  37   74:istore_2        
	//*  38   75:aload_1         
	//*  39   76:getfield        #1401 <Field boolean Fragment.mDeferStart>
	//*  40   79:ifeq            104
	//*  41   82:iload           6
	//*  42   84:istore_2        
	//*  43   85:aload_1         
	//*  44   86:getfield        #211 <Field int Fragment.mState>
	//*  45   89:iconst_4        
	//*  46   90:icmpge          104
	//*  47   93:iload           6
	//*  48   95:istore_2        
	//*  49   96:iload           6
	//*  50   98:iconst_3        
	//*  51   99:icmple          104
	//*  52  102:iconst_3        
	//*  53  103:istore_2        
	//*  54  104:aload_1         
	//*  55  105:getfield        #211 <Field int Fragment.mState>
	//*  56  108:iload_2         
	//*  57  109:icmpgt          1318
	//*  58  112:aload_1         
	//*  59  113:getfield        #1205 <Field boolean Fragment.mFromLayout>
	//*  60  116:ifeq            136
	//*  61  119:aload_1         
	//*  62  120:getfield        #1404 <Field boolean Fragment.mInLayout>
	//*  63  123:ifne            136
	//*  64  126:return          
					l = fragment.mState;
	//   65  127:aload_1         
	//   66  128:getfield        #211 <Field int Fragment.mState>
	//   67  131:istore          6
		}
		i = l;
		if(fragment.mDeferStart)
		{
			i = l;
			if(fragment.mState < 4)
			{
				i = l;
				if(l > 3)
					i = 3;
			}
		}
		if(fragment.mState > i) goto _L2; else goto _L1
_L1:
		if(!fragment.mFromLayout || fragment.mInLayout) goto _L4; else goto _L3
_L3:
		return;
	//*  68  133:goto            72
_L4:
		int i1;
		int k1;
		if(fragment.getAnimatingAway() != null || fragment.getAnimator() != null)
	//*  69  136:aload_1         
	//*  70  137:invokevirtual   #413 <Method View Fragment.getAnimatingAway()>
	//*  71  140:ifnonnull       150
	//*  72  143:aload_1         
	//*  73  144:invokevirtual   #430 <Method Animator Fragment.getAnimator()>
	//*  74  147:ifnull          172
		{
			fragment.setAnimatingAway(((View) (null)));
	//   75  150:aload_1         
	//   76  151:aconst_null     
	//   77  152:invokevirtual   #254 <Method void Fragment.setAnimatingAway(View)>
			fragment.setAnimator(((Animator) (null)));
	//   78  155:aload_1         
	//   79  156:aconst_null     
	//   80  157:invokevirtual   #285 <Method void Fragment.setAnimator(Animator)>
			moveToState(fragment, fragment.getStateAfterAnimating(), 0, 0, true);
	//   81  160:aload_0         
	//   82  161:aload_1         
	//   83  162:aload_1         
	//   84  163:invokevirtual   #416 <Method int Fragment.getStateAfterAnimating()>
	//   85  166:iconst_0        
	//   86  167:iconst_0        
	//   87  168:iconst_1        
	//   88  169:invokevirtual   #221 <Method void moveToState(Fragment, int, int, int, boolean)>
		}
		k = i;
	//   89  172:iload_2         
	//   90  173:istore          4
		i1 = i;
	//   91  175:iload_2         
	//   92  176:istore          6
		k1 = i;
	//   93  178:iload_2         
	//   94  179:istore          7
		j = i;
	//   95  181:iload_2         
	//   96  182:istore_3        
		fragment.mState;
	//   97  183:aload_1         
	//   98  184:getfield        #211 <Field int Fragment.mState>
		JVM INSTR tableswitch 0 4: default 220
	//	               0 295
	//	               1 735
	//	               2 1128
	//	               3 1147
	//	               4 1201;
	//   99  187:tableswitch     0 4: default 220
	//	               0 295
	//	               1 735
	//	               2 1128
	//	               3 1147
	//	               4 1201
		   goto _L5 _L6 _L7 _L8 _L9 _L10
_L6:
		break; /* Loop/switch isn't completed */
_L5:
		i1 = i;
	//  100  220:iload_2         
	//  101  221:istore          6
_L12:
		if(fragment.mState != i1)
	//* 102  223:aload_1         
	//* 103  224:getfield        #211 <Field int Fragment.mState>
	//* 104  227:iload           6
	//* 105  229:icmpeq          126
		{
			Log.w("FragmentManager", (new StringBuilder()).append("moveToState: Fragment state for ").append(((Object) (fragment))).append(" not updated inline; ").append("expected state ").append(i1).append(" found ").append(fragment.mState).toString());
	//  106  232:ldc1            #67  <String "FragmentManager">
	//  107  234:new             #340 <Class StringBuilder>
	//  108  237:dup             
	//  109  238:invokespecial   #341 <Method void StringBuilder()>
	//  110  241:ldc2            #1406 <String "moveToState: Fragment state for ">
	//  111  244:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  112  247:aload_1         
	//  113  248:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  114  251:ldc2            #1408 <String " not updated inline; ">
	//  115  254:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  116  257:ldc2            #1410 <String "expected state ">
	//  117  260:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  118  263:iload           6
	//  119  265:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//  120  268:ldc2            #1412 <String " found ">
	//  121  271:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  122  274:aload_1         
	//  123  275:getfield        #211 <Field int Fragment.mState>
	//  124  278:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//  125  281:invokevirtual   #351 <Method String StringBuilder.toString()>
	//  126  284:invokestatic    #1415 <Method int Log.w(String, String)>
	//  127  287:pop             
			fragment.mState = i1;
	//  128  288:aload_1         
	//  129  289:iload           6
	//  130  291:putfield        #211 <Field int Fragment.mState>
			return;
	//  131  294:return          
		}
		if(true) goto _L3; else goto _L11
_L11:
		k = i;
	//  132  295:iload_2         
	//  133  296:istore          4
		if(i > 0)
	//* 134  298:iload_2         
	//* 135  299:ifle            735
		{
			if(DEBUG)
	//* 136  302:getstatic       #133 <Field boolean DEBUG>
	//* 137  305:ifeq            334
				Log.v("FragmentManager", (new StringBuilder()).append("moveto CREATED: ").append(((Object) (fragment))).toString());
	//  138  308:ldc1            #67  <String "FragmentManager">
	//  139  310:new             #340 <Class StringBuilder>
	//  140  313:dup             
	//  141  314:invokespecial   #341 <Method void StringBuilder()>
	//  142  317:ldc2            #1417 <String "moveto CREATED: ">
	//  143  320:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  144  323:aload_1         
	//  145  324:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  146  327:invokevirtual   #351 <Method String StringBuilder.toString()>
	//  147  330:invokestatic    #839 <Method int Log.v(String, String)>
	//  148  333:pop             
			k = i;
	//  149  334:iload_2         
	//  150  335:istore          4
			if(fragment.mSavedFragmentState != null)
	//* 151  337:aload_1         
	//* 152  338:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 153  341:ifnull          449
			{
				fragment.mSavedFragmentState.setClassLoader(mHost.getContext().getClassLoader());
	//  154  344:aload_1         
	//  155  345:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//  156  348:aload_0         
	//  157  349:getfield        #444 <Field FragmentHostCallback mHost>
	//  158  352:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//  159  355:invokevirtual   #1421 <Method ClassLoader Context.getClassLoader()>
	//  160  358:invokevirtual   #1425 <Method void Bundle.setClassLoader(ClassLoader)>
				fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
	//  161  361:aload_1         
	//  162  362:aload_1         
	//  163  363:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//  164  366:ldc1            #79  <String "android:view_state">
	//  165  368:invokevirtual   #1429 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//  166  371:putfield        #1432 <Field SparseArray Fragment.mSavedViewState>
				fragment.mTarget = getFragment(fragment.mSavedFragmentState, "android:target_state");
	//  167  374:aload_1         
	//  168  375:aload_0         
	//  169  376:aload_1         
	//  170  377:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//  171  380:ldc1            #73  <String "android:target_state">
	//  172  382:invokevirtual   #1434 <Method Fragment getFragment(Bundle, String)>
	//  173  385:putfield        #1437 <Field Fragment Fragment.mTarget>
				if(fragment.mTarget != null)
	//* 174  388:aload_1         
	//* 175  389:getfield        #1437 <Field Fragment Fragment.mTarget>
	//* 176  392:ifnull          409
					fragment.mTargetRequestCode = fragment.mSavedFragmentState.getInt("android:target_req_state", 0);
	//  177  395:aload_1         
	//  178  396:aload_1         
	//  179  397:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//  180  400:ldc1            #70  <String "android:target_req_state">
	//  181  402:iconst_0        
	//  182  403:invokevirtual   #1269 <Method int Bundle.getInt(String, int)>
	//  183  406:putfield        #1440 <Field int Fragment.mTargetRequestCode>
				fragment.mUserVisibleHint = fragment.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
	//  184  409:aload_1         
	//  185  410:aload_1         
	//  186  411:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//  187  414:ldc1            #76  <String "android:user_visible_hint">
	//  188  416:iconst_1        
	//  189  417:invokevirtual   #1444 <Method boolean Bundle.getBoolean(String, boolean)>
	//  190  420:putfield        #1447 <Field boolean Fragment.mUserVisibleHint>
				k = i;
	//  191  423:iload_2         
	//  192  424:istore          4
				if(!fragment.mUserVisibleHint)
	//* 193  426:aload_1         
	//* 194  427:getfield        #1447 <Field boolean Fragment.mUserVisibleHint>
	//* 195  430:ifne            449
				{
					fragment.mDeferStart = true;
	//  196  433:aload_1         
	//  197  434:iconst_1        
	//  198  435:putfield        #1401 <Field boolean Fragment.mDeferStart>
					k = i;
	//  199  438:iload_2         
	//  200  439:istore          4
					if(i > 3)
	//* 201  441:iload_2         
	//* 202  442:iconst_3        
	//* 203  443:icmple          449
						k = 3;
	//  204  446:iconst_3        
	//  205  447:istore          4
				}
			}
			fragment.mHost = mHost;
	//  206  449:aload_1         
	//  207  450:aload_0         
	//  208  451:getfield        #444 <Field FragmentHostCallback mHost>
	//  209  454:putfield        #1448 <Field FragmentHostCallback Fragment.mHost>
			fragment.mParentFragment = mParent;
	//  210  457:aload_1         
	//  211  458:aload_0         
	//  212  459:getfield        #905 <Field Fragment mParent>
	//  213  462:putfield        #1451 <Field Fragment Fragment.mParentFragment>
			FragmentManagerImpl fragmentmanagerimpl;
			if(mParent != null)
	//* 214  465:aload_0         
	//* 215  466:getfield        #905 <Field Fragment mParent>
	//* 216  469:ifnull          562
				fragmentmanagerimpl = mParent.mChildFragmentManager;
	//  217  472:aload_0         
	//  218  473:getfield        #905 <Field Fragment mParent>
	//  219  476:getfield        #1455 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
	//  220  479:astore          9
			else
	//* 221  481:aload_1         
	//* 222  482:aload           9
	//* 223  484:putfield        #1458 <Field FragmentManagerImpl Fragment.mFragmentManager>
	//* 224  487:aload_1         
	//* 225  488:getfield        #1437 <Field Fragment Fragment.mTarget>
	//* 226  491:ifnull          597
	//* 227  494:aload_0         
	//* 228  495:getfield        #313 <Field SparseArray mActive>
	//* 229  498:aload_1         
	//* 230  499:getfield        #1437 <Field Fragment Fragment.mTarget>
	//* 231  502:getfield        #1350 <Field int Fragment.mIndex>
	//* 232  505:invokevirtual   #1270 <Method Object SparseArray.get(int)>
	//* 233  508:aload_1         
	//* 234  509:getfield        #1437 <Field Fragment Fragment.mTarget>
	//* 235  512:if_acmpeq       574
	//* 236  515:new             #331 <Class IllegalStateException>
	//* 237  518:dup             
	//* 238  519:new             #340 <Class StringBuilder>
	//* 239  522:dup             
	//* 240  523:invokespecial   #341 <Method void StringBuilder()>
	//* 241  526:ldc2            #1460 <String "Fragment ">
	//* 242  529:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 243  532:aload_1         
	//* 244  533:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 245  536:ldc2            #1462 <String " declared target fragment ">
	//* 246  539:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 247  542:aload_1         
	//* 248  543:getfield        #1437 <Field Fragment Fragment.mTarget>
	//* 249  546:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 250  549:ldc2            #1464 <String " that does not belong to this FragmentManager!">
	//* 251  552:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 252  555:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 253  558:invokespecial   #336 <Method void IllegalStateException(String)>
	//* 254  561:athrow          
				fragmentmanagerimpl = mHost.getFragmentManagerImpl();
	//  255  562:aload_0         
	//  256  563:getfield        #444 <Field FragmentHostCallback mHost>
	//  257  566:invokevirtual   #1468 <Method FragmentManagerImpl FragmentHostCallback.getFragmentManagerImpl()>
	//  258  569:astore          9
			fragment.mFragmentManager = fragmentmanagerimpl;
			if(fragment.mTarget != null)
			{
				if(mActive.get(fragment.mTarget.mIndex) != fragment.mTarget)
					throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(((Object) (fragment))).append(" declared target fragment ").append(((Object) (fragment.mTarget))).append(" that does not belong to this FragmentManager!").toString());
	//* 259  571:goto            481
				if(fragment.mTarget.mState < 1)
	//* 260  574:aload_1         
	//* 261  575:getfield        #1437 <Field Fragment Fragment.mTarget>
	//* 262  578:getfield        #211 <Field int Fragment.mState>
	//* 263  581:iconst_1        
	//* 264  582:icmpge          597
					moveToState(fragment.mTarget, 1, 0, 0, true);
	//  265  585:aload_0         
	//  266  586:aload_1         
	//  267  587:getfield        #1437 <Field Fragment Fragment.mTarget>
	//  268  590:iconst_1        
	//  269  591:iconst_0        
	//  270  592:iconst_0        
	//  271  593:iconst_1        
	//  272  594:invokevirtual   #221 <Method void moveToState(Fragment, int, int, int, boolean)>
			}
			dispatchOnFragmentPreAttached(fragment, mHost.getContext(), false);
	//  273  597:aload_0         
	//  274  598:aload_1         
	//  275  599:aload_0         
	//  276  600:getfield        #444 <Field FragmentHostCallback mHost>
	//  277  603:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//  278  606:iconst_0        
	//  279  607:invokevirtual   #1037 <Method void dispatchOnFragmentPreAttached(Fragment, Context, boolean)>
			fragment.mCalled = false;
	//  280  610:aload_1         
	//  281  611:iconst_0        
	//  282  612:putfield        #1471 <Field boolean Fragment.mCalled>
			fragment.onAttach(mHost.getContext());
	//  283  615:aload_1         
	//  284  616:aload_0         
	//  285  617:getfield        #444 <Field FragmentHostCallback mHost>
	//  286  620:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//  287  623:invokevirtual   #1475 <Method void Fragment.onAttach(Context)>
			if(!fragment.mCalled)
	//* 288  626:aload_1         
	//* 289  627:getfield        #1471 <Field boolean Fragment.mCalled>
	//* 290  630:ifne            667
				throw new SuperNotCalledException((new StringBuilder()).append("Fragment ").append(((Object) (fragment))).append(" did not call through to super.onAttach()").toString());
	//  291  633:new             #1477 <Class SuperNotCalledException>
	//  292  636:dup             
	//  293  637:new             #340 <Class StringBuilder>
	//  294  640:dup             
	//  295  641:invokespecial   #341 <Method void StringBuilder()>
	//  296  644:ldc2            #1460 <String "Fragment ">
	//  297  647:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  298  650:aload_1         
	//  299  651:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  300  654:ldc2            #1479 <String " did not call through to super.onAttach()">
	//  301  657:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  302  660:invokevirtual   #351 <Method String StringBuilder.toString()>
	//  303  663:invokespecial   #1480 <Method void SuperNotCalledException(String)>
	//  304  666:athrow          
			ViewGroup viewgroup;
			if(fragment.mParentFragment == null)
	//* 305  667:aload_1         
	//* 306  668:getfield        #1451 <Field Fragment Fragment.mParentFragment>
	//* 307  671:ifnonnull       1267
				mHost.onAttachFragment(fragment);
	//  308  674:aload_0         
	//  309  675:getfield        #444 <Field FragmentHostCallback mHost>
	//  310  678:aload_1         
	//  311  679:invokevirtual   #1483 <Method void FragmentHostCallback.onAttachFragment(Fragment)>
			else
	//* 312  682:aload_0         
	//* 313  683:aload_1         
	//* 314  684:aload_0         
	//* 315  685:getfield        #444 <Field FragmentHostCallback mHost>
	//* 316  688:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//* 317  691:iconst_0        
	//* 318  692:invokevirtual   #1005 <Method void dispatchOnFragmentAttached(Fragment, Context, boolean)>
	//* 319  695:aload_1         
	//* 320  696:getfield        #1486 <Field boolean Fragment.mIsCreated>
	//* 321  699:ifne            1278
	//* 322  702:aload_0         
	//* 323  703:aload_1         
	//* 324  704:aload_1         
	//* 325  705:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 326  708:iconst_0        
	//* 327  709:invokevirtual   #1043 <Method void dispatchOnFragmentPreCreated(Fragment, Bundle, boolean)>
	//* 328  712:aload_1         
	//* 329  713:aload_1         
	//* 330  714:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 331  717:invokevirtual   #1490 <Method void Fragment.performCreate(Bundle)>
	//* 332  720:aload_0         
	//* 333  721:aload_1         
	//* 334  722:aload_1         
	//* 335  723:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 336  726:iconst_0        
	//* 337  727:invokevirtual   #1012 <Method void dispatchOnFragmentCreated(Fragment, Bundle, boolean)>
	//* 338  730:aload_1         
	//* 339  731:iconst_0        
	//* 340  732:putfield        #769 <Field boolean Fragment.mRetaining>
	//* 341  735:aload_0         
	//* 342  736:aload_1         
	//* 343  737:invokevirtual   #1492 <Method void ensureInflatedFragmentView(Fragment)>
	//* 344  740:iload           4
	//* 345  742:istore          6
	//* 346  744:iload           4
	//* 347  746:iconst_1        
	//* 348  747:icmple          1128
	//* 349  750:getstatic       #133 <Field boolean DEBUG>
	//* 350  753:ifeq            782
	//* 351  756:ldc1            #67  <String "FragmentManager">
	//* 352  758:new             #340 <Class StringBuilder>
	//* 353  761:dup             
	//* 354  762:invokespecial   #341 <Method void StringBuilder()>
	//* 355  765:ldc2            #1494 <String "moveto ACTIVITY_CREATED: ">
	//* 356  768:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 357  771:aload_1         
	//* 358  772:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 359  775:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 360  778:invokestatic    #839 <Method int Log.v(String, String)>
	//* 361  781:pop             
	//* 362  782:aload_1         
	//* 363  783:getfield        #1205 <Field boolean Fragment.mFromLayout>
	//* 364  786:ifne            1086
	//* 365  789:aload_1         
	//* 366  790:getfield        #388 <Field int Fragment.mContainerId>
	//* 367  793:ifeq            1923
	//* 368  796:aload_1         
	//* 369  797:getfield        #388 <Field int Fragment.mContainerId>
	//* 370  800:iconst_m1       
	//* 371  801:icmpne          841
	//* 372  804:aload_0         
	//* 373  805:new             #1496 <Class IllegalArgumentException>
	//* 374  808:dup             
	//* 375  809:new             #340 <Class StringBuilder>
	//* 376  812:dup             
	//* 377  813:invokespecial   #341 <Method void StringBuilder()>
	//* 378  816:ldc2            #1498 <String "Cannot create fragment ">
	//* 379  819:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 380  822:aload_1         
	//* 381  823:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 382  826:ldc2            #1500 <String " for a container view with no id">
	//* 383  829:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 384  832:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 385  835:invokespecial   #1501 <Method void IllegalArgumentException(String)>
	//* 386  838:invokespecial   #1276 <Method void throwException(RuntimeException)>
	//* 387  841:aload_0         
	//* 388  842:getfield        #903 <Field FragmentContainer mContainer>
	//* 389  845:aload_1         
	//* 390  846:getfield        #388 <Field int Fragment.mContainerId>
	//* 391  849:invokevirtual   #1507 <Method View FragmentContainer.onFindViewById(int)>
	//* 392  852:checkcast       #290 <Class ViewGroup>
	//* 393  855:astore          10
	//* 394  857:aload           10
	//* 395  859:astore          9
	//* 396  861:aload           10
	//* 397  863:ifnonnull       952
	//* 398  866:aload           10
	//* 399  868:astore          9
	//* 400  870:aload_1         
	//* 401  871:getfield        #1510 <Field boolean Fragment.mRestored>
	//* 402  874:ifne            952
	//* 403  877:aload_1         
	//* 404  878:invokevirtual   #1511 <Method Resources Fragment.getResources()>
	//* 405  881:aload_1         
	//* 406  882:getfield        #388 <Field int Fragment.mContainerId>
	//* 407  885:invokevirtual   #1514 <Method String Resources.getResourceName(int)>
	//* 408  888:astore          9
	//* 409  890:aload_0         
	//* 410  891:new             #1496 <Class IllegalArgumentException>
	//* 411  894:dup             
	//* 412  895:new             #340 <Class StringBuilder>
	//* 413  898:dup             
	//* 414  899:invokespecial   #341 <Method void StringBuilder()>
	//* 415  902:ldc2            #1516 <String "No view found for id 0x">
	//* 416  905:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 417  908:aload_1         
	//* 418  909:getfield        #388 <Field int Fragment.mContainerId>
	//* 419  912:invokestatic    #1137 <Method String Integer.toHexString(int)>
	//* 420  915:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 421  918:ldc2            #1518 <String " (">
	//* 422  921:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 423  924:aload           9
	//* 424  926:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 425  929:ldc2            #1520 <String ") for fragment ">
	//* 426  932:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 427  935:aload_1         
	//* 428  936:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 429  939:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 430  942:invokespecial   #1501 <Method void IllegalArgumentException(String)>
	//* 431  945:invokespecial   #1276 <Method void throwException(RuntimeException)>
	//* 432  948:aload           10
	//* 433  950:astore          9
	//* 434  952:aload_1         
	//* 435  953:aload           9
	//* 436  955:putfield        #288 <Field ViewGroup Fragment.mContainer>
	//* 437  958:aload_1         
	//* 438  959:aload_1         
	//* 439  960:aload_1         
	//* 440  961:aload_1         
	//* 441  962:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 442  965:invokevirtual   #1215 <Method android.view.LayoutInflater Fragment.performGetLayoutInflater(Bundle)>
	//* 443  968:aload           9
	//* 444  970:aload_1         
	//* 445  971:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 446  974:invokevirtual   #1219 <Method View Fragment.performCreateView(android.view.LayoutInflater, ViewGroup, Bundle)>
	//* 447  977:putfield        #225 <Field View Fragment.mView>
	//* 448  980:aload_1         
	//* 449  981:getfield        #225 <Field View Fragment.mView>
	//* 450  984:ifnull          1310
	//* 451  987:aload_1         
	//* 452  988:aload_1         
	//* 453  989:getfield        #225 <Field View Fragment.mView>
	//* 454  992:putfield        #1222 <Field View Fragment.mInnerView>
	//* 455  995:aload_1         
	//* 456  996:getfield        #225 <Field View Fragment.mView>
	//* 457  999:iconst_0        
	//* 458 1000:invokevirtual   #1225 <Method void View.setSaveFromParentEnabled(boolean)>
	//* 459 1003:aload           9
	//* 460 1005:ifnull          1017
	//* 461 1008:aload           9
	//* 462 1010:aload_1         
	//* 463 1011:getfield        #225 <Field View Fragment.mView>
	//* 464 1014:invokevirtual   #1522 <Method void ViewGroup.addView(View)>
	//* 465 1017:aload_1         
	//* 466 1018:getfield        #228 <Field boolean Fragment.mHidden>
	//* 467 1021:ifeq            1033
	//* 468 1024:aload_1         
	//* 469 1025:getfield        #225 <Field View Fragment.mView>
	//* 470 1028:bipush          8
	//* 471 1030:invokevirtual   #934 <Method void View.setVisibility(int)>
	//* 472 1033:aload_1         
	//* 473 1034:aload_1         
	//* 474 1035:getfield        #225 <Field View Fragment.mView>
	//* 475 1038:aload_1         
	//* 476 1039:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 477 1042:invokevirtual   #1229 <Method void Fragment.onViewCreated(View, Bundle)>
	//* 478 1045:aload_0         
	//* 479 1046:aload_1         
	//* 480 1047:aload_1         
	//* 481 1048:getfield        #225 <Field View Fragment.mView>
	//* 482 1051:aload_1         
	//* 483 1052:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 484 1055:iconst_0        
	//* 485 1056:invokevirtual   #1074 <Method void dispatchOnFragmentViewCreated(Fragment, View, Bundle, boolean)>
	//* 486 1059:aload_1         
	//* 487 1060:getfield        #225 <Field View Fragment.mView>
	//* 488 1063:invokevirtual   #1525 <Method int View.getVisibility()>
	//* 489 1066:ifne            1304
	//* 490 1069:aload_1         
	//* 491 1070:getfield        #288 <Field ViewGroup Fragment.mContainer>
	//* 492 1073:ifnull          1304
	//* 493 1076:iload           8
	//* 494 1078:istore          5
	//* 495 1080:aload_1         
	//* 496 1081:iload           5
	//* 497 1083:putfield        #231 <Field boolean Fragment.mIsNewlyAdded>
	//* 498 1086:aload_1         
	//* 499 1087:aload_1         
	//* 500 1088:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 501 1091:invokevirtual   #1528 <Method void Fragment.performActivityCreated(Bundle)>
	//* 502 1094:aload_0         
	//* 503 1095:aload_1         
	//* 504 1096:aload_1         
	//* 505 1097:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 506 1100:iconst_0        
	//* 507 1101:invokevirtual   #985 <Method void dispatchOnFragmentActivityCreated(Fragment, Bundle, boolean)>
	//* 508 1104:aload_1         
	//* 509 1105:getfield        #225 <Field View Fragment.mView>
	//* 510 1108:ifnull          1119
	//* 511 1111:aload_1         
	//* 512 1112:aload_1         
	//* 513 1113:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 514 1116:invokevirtual   #1531 <Method void Fragment.restoreViewState(Bundle)>
	//* 515 1119:aload_1         
	//* 516 1120:aconst_null     
	//* 517 1121:putfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 518 1124:iload           4
	//* 519 1126:istore          6
	//* 520 1128:iload           6
	//* 521 1130:istore          7
	//* 522 1132:iload           6
	//* 523 1134:iconst_2        
	//* 524 1135:icmple          1147
	//* 525 1138:aload_1         
	//* 526 1139:iconst_3        
	//* 527 1140:putfield        #211 <Field int Fragment.mState>
	//* 528 1143:iload           6
	//* 529 1145:istore          7
	//* 530 1147:iload           7
	//* 531 1149:istore_3        
	//* 532 1150:iload           7
	//* 533 1152:iconst_3        
	//* 534 1153:icmple          1201
	//* 535 1156:getstatic       #133 <Field boolean DEBUG>
	//* 536 1159:ifeq            1188
	//* 537 1162:ldc1            #67  <String "FragmentManager">
	//* 538 1164:new             #340 <Class StringBuilder>
	//* 539 1167:dup             
	//* 540 1168:invokespecial   #341 <Method void StringBuilder()>
	//* 541 1171:ldc2            #1533 <String "moveto STARTED: ">
	//* 542 1174:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 543 1177:aload_1         
	//* 544 1178:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 545 1181:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 546 1184:invokestatic    #839 <Method int Log.v(String, String)>
	//* 547 1187:pop             
	//* 548 1188:aload_1         
	//* 549 1189:invokevirtual   #1536 <Method void Fragment.performStart()>
	//* 550 1192:aload_0         
	//* 551 1193:aload_1         
	//* 552 1194:iconst_0        
	//* 553 1195:invokevirtual   #1061 <Method void dispatchOnFragmentStarted(Fragment, boolean)>
	//* 554 1198:iload           7
	//* 555 1200:istore_3        
	//* 556 1201:iload_3         
	//* 557 1202:istore          6
	//* 558 1204:iload_3         
	//* 559 1205:iconst_4        
	//* 560 1206:icmple          223
	//* 561 1209:getstatic       #133 <Field boolean DEBUG>
	//* 562 1212:ifeq            1241
	//* 563 1215:ldc1            #67  <String "FragmentManager">
	//* 564 1217:new             #340 <Class StringBuilder>
	//* 565 1220:dup             
	//* 566 1221:invokespecial   #341 <Method void StringBuilder()>
	//* 567 1224:ldc2            #1538 <String "moveto RESUMED: ">
	//* 568 1227:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 569 1230:aload_1         
	//* 570 1231:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 571 1234:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 572 1237:invokestatic    #839 <Method int Log.v(String, String)>
	//* 573 1240:pop             
	//* 574 1241:aload_1         
	//* 575 1242:invokevirtual   #1541 <Method void Fragment.performResume()>
	//* 576 1245:aload_0         
	//* 577 1246:aload_1         
	//* 578 1247:iconst_0        
	//* 579 1248:invokevirtual   #1049 <Method void dispatchOnFragmentResumed(Fragment, boolean)>
	//* 580 1251:aload_1         
	//* 581 1252:aconst_null     
	//* 582 1253:putfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 583 1256:aload_1         
	//* 584 1257:aconst_null     
	//* 585 1258:putfield        #1432 <Field SparseArray Fragment.mSavedViewState>
	//* 586 1261:iload_3         
	//* 587 1262:istore          6
	//* 588 1264:goto            223
				fragment.mParentFragment.onAttachFragment(fragment);
	//  589 1267:aload_1         
	//  590 1268:getfield        #1451 <Field Fragment Fragment.mParentFragment>
	//  591 1271:aload_1         
	//  592 1272:invokevirtual   #1542 <Method void Fragment.onAttachFragment(Fragment)>
			dispatchOnFragmentAttached(fragment, mHost.getContext(), false);
			if(!fragment.mIsCreated)
			{
				dispatchOnFragmentPreCreated(fragment, fragment.mSavedFragmentState, false);
				fragment.performCreate(fragment.mSavedFragmentState);
				dispatchOnFragmentCreated(fragment, fragment.mSavedFragmentState, false);
			} else
	//* 593 1275:goto            682
			{
				fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
	//  594 1278:aload_1         
	//  595 1279:aload_1         
	//  596 1280:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//  597 1283:invokevirtual   #1545 <Method void Fragment.restoreChildFragmentState(Bundle)>
				fragment.mState = 1;
	//  598 1286:aload_1         
	//  599 1287:iconst_1        
	//  600 1288:putfield        #211 <Field int Fragment.mState>
			}
			fragment.mRetaining = false;
		}
_L7:
		ensureInflatedFragmentView(fragment);
		i1 = k;
		if(k > 1)
		{
			if(DEBUG)
				Log.v("FragmentManager", (new StringBuilder()).append("moveto ACTIVITY_CREATED: ").append(((Object) (fragment))).toString());
			if(!fragment.mFromLayout)
			{
				Object obj;
				if(fragment.mContainerId != 0)
				{
					if(fragment.mContainerId == -1)
						throwException(((RuntimeException) (new IllegalArgumentException((new StringBuilder()).append("Cannot create fragment ").append(((Object) (fragment))).append(" for a container view with no id").toString()))));
					viewgroup = (ViewGroup)mContainer.onFindViewById(fragment.mContainerId);
					obj = ((Object) (viewgroup));
					if(viewgroup == null)
					{
						obj = ((Object) (viewgroup));
						if(!fragment.mRestored)
						{
							try
							{
								obj = ((Object) (fragment.getResources().getResourceName(fragment.mContainerId)));
							}
	//* 601 1291:goto            730
							// Misplaced declaration of an exception variable
							catch(Object obj)
	//* 602 1294:astore          9
							{
								obj = "unknown";
	//  603 1296:ldc2            #1547 <String "unknown">
	//  604 1299:astore          9
							}
							throwException(((RuntimeException) (new IllegalArgumentException((new StringBuilder()).append("No view found for id 0x").append(Integer.toHexString(fragment.mContainerId)).append(" (").append(((String) (obj))).append(") for fragment ").append(((Object) (fragment))).toString()))));
							obj = ((Object) (viewgroup));
						}
					}
				} else
	//* 605 1301:goto            890
	//* 606 1304:iconst_0        
	//* 607 1305:istore          5
	//* 608 1307:goto            1080
	//* 609 1310:aload_1         
	//* 610 1311:aconst_null     
	//* 611 1312:putfield        #1222 <Field View Fragment.mInnerView>
	//* 612 1315:goto            1086
	//* 613 1318:iload_2         
	//* 614 1319:istore          6
	//* 615 1321:aload_1         
	//* 616 1322:getfield        #211 <Field int Fragment.mState>
	//* 617 1325:iload_2         
	//* 618 1326:icmple          223
	//* 619 1329:aload_1         
	//* 620 1330:getfield        #211 <Field int Fragment.mState>
	//* 621 1333:tableswitch     1 5: default 1368
	//	               1 1374
	//	               2 1572
	//	               3 1531
	//	               4 1484
	//	               5 1437
	//* 622 1368:iload_2         
	//* 623 1369:istore          6
	//* 624 1371:goto            223
	//* 625 1374:iload_2         
	//* 626 1375:istore          6
	//* 627 1377:iload_2         
	//* 628 1378:iconst_1        
	//* 629 1379:icmpge          223
	//* 630 1382:aload_0         
	//* 631 1383:getfield        #969 <Field boolean mDestroyed>
	//* 632 1386:ifeq            1412
	//* 633 1389:aload_1         
	//* 634 1390:invokevirtual   #413 <Method View Fragment.getAnimatingAway()>
	//* 635 1393:ifnull          1777
	//* 636 1396:aload_1         
	//* 637 1397:invokevirtual   #413 <Method View Fragment.getAnimatingAway()>
	//* 638 1400:astore          9
	//* 639 1402:aload_1         
	//* 640 1403:aconst_null     
	//* 641 1404:invokevirtual   #254 <Method void Fragment.setAnimatingAway(View)>
	//* 642 1407:aload           9
	//* 643 1409:invokevirtual   #426 <Method void View.clearAnimation()>
	//* 644 1412:aload_1         
	//* 645 1413:invokevirtual   #413 <Method View Fragment.getAnimatingAway()>
	//* 646 1416:ifnonnull       1426
	//* 647 1419:aload_1         
	//* 648 1420:invokevirtual   #430 <Method Animator Fragment.getAnimator()>
	//* 649 1423:ifnull          1803
	//* 650 1426:aload_1         
	//* 651 1427:iload_2         
	//* 652 1428:invokevirtual   #246 <Method void Fragment.setStateAfterAnimating(int)>
	//* 653 1431:iconst_1        
	//* 654 1432:istore          6
	//* 655 1434:goto            223
	//* 656 1437:iload_2         
	//* 657 1438:iconst_5        
	//* 658 1439:icmpge          1484
	//* 659 1442:getstatic       #133 <Field boolean DEBUG>
	//* 660 1445:ifeq            1474
	//* 661 1448:ldc1            #67  <String "FragmentManager">
	//* 662 1450:new             #340 <Class StringBuilder>
	//* 663 1453:dup             
	//* 664 1454:invokespecial   #341 <Method void StringBuilder()>
	//* 665 1457:ldc2            #1549 <String "movefrom RESUMED: ">
	//* 666 1460:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 667 1463:aload_1         
	//* 668 1464:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 669 1467:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 670 1470:invokestatic    #839 <Method int Log.v(String, String)>
	//* 671 1473:pop             
	//* 672 1474:aload_1         
	//* 673 1475:invokevirtual   #1552 <Method void Fragment.performPause()>
	//* 674 1478:aload_0         
	//* 675 1479:aload_1         
	//* 676 1480:iconst_0        
	//* 677 1481:invokevirtual   #1031 <Method void dispatchOnFragmentPaused(Fragment, boolean)>
	//* 678 1484:iload_2         
	//* 679 1485:iconst_4        
	//* 680 1486:icmpge          1531
	//* 681 1489:getstatic       #133 <Field boolean DEBUG>
	//* 682 1492:ifeq            1521
	//* 683 1495:ldc1            #67  <String "FragmentManager">
	//* 684 1497:new             #340 <Class StringBuilder>
	//* 685 1500:dup             
	//* 686 1501:invokespecial   #341 <Method void StringBuilder()>
	//* 687 1504:ldc2            #1554 <String "movefrom STARTED: ">
	//* 688 1507:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 689 1510:aload_1         
	//* 690 1511:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 691 1514:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 692 1517:invokestatic    #839 <Method int Log.v(String, String)>
	//* 693 1520:pop             
	//* 694 1521:aload_1         
	//* 695 1522:invokevirtual   #1557 <Method void Fragment.performStop()>
	//* 696 1525:aload_0         
	//* 697 1526:aload_1         
	//* 698 1527:iconst_0        
	//* 699 1528:invokevirtual   #1067 <Method void dispatchOnFragmentStopped(Fragment, boolean)>
	//* 700 1531:iload_2         
	//* 701 1532:iconst_3        
	//* 702 1533:icmpge          1572
	//* 703 1536:getstatic       #133 <Field boolean DEBUG>
	//* 704 1539:ifeq            1568
	//* 705 1542:ldc1            #67  <String "FragmentManager">
	//* 706 1544:new             #340 <Class StringBuilder>
	//* 707 1547:dup             
	//* 708 1548:invokespecial   #341 <Method void StringBuilder()>
	//* 709 1551:ldc2            #1559 <String "movefrom STOPPED: ">
	//* 710 1554:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 711 1557:aload_1         
	//* 712 1558:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 713 1561:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 714 1564:invokestatic    #839 <Method int Log.v(String, String)>
	//* 715 1567:pop             
	//* 716 1568:aload_1         
	//* 717 1569:invokevirtual   #1562 <Method void Fragment.performReallyStop()>
	//* 718 1572:iload_2         
	//* 719 1573:iconst_2        
	//* 720 1574:icmpge          1374
	//* 721 1577:getstatic       #133 <Field boolean DEBUG>
	//* 722 1580:ifeq            1609
	//* 723 1583:ldc1            #67  <String "FragmentManager">
	//* 724 1585:new             #340 <Class StringBuilder>
	//* 725 1588:dup             
	//* 726 1589:invokespecial   #341 <Method void StringBuilder()>
	//* 727 1592:ldc2            #1564 <String "movefrom ACTIVITY_CREATED: ">
	//* 728 1595:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 729 1598:aload_1         
	//* 730 1599:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 731 1602:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 732 1605:invokestatic    #839 <Method int Log.v(String, String)>
	//* 733 1608:pop             
	//* 734 1609:aload_1         
	//* 735 1610:getfield        #225 <Field View Fragment.mView>
	//* 736 1613:ifnull          1639
	//* 737 1616:aload_0         
	//* 738 1617:getfield        #444 <Field FragmentHostCallback mHost>
	//* 739 1620:aload_1         
	//* 740 1621:invokevirtual   #1568 <Method boolean FragmentHostCallback.onShouldSaveFragmentState(Fragment)>
	//* 741 1624:ifeq            1639
	//* 742 1627:aload_1         
	//* 743 1628:getfield        #1432 <Field SparseArray Fragment.mSavedViewState>
	//* 744 1631:ifnonnull       1639
	//* 745 1634:aload_0         
	//* 746 1635:aload_1         
	//* 747 1636:invokevirtual   #1571 <Method void saveFragmentViewState(Fragment)>
	//* 748 1639:aload_1         
	//* 749 1640:invokevirtual   #1574 <Method void Fragment.performDestroyView()>
	//* 750 1643:aload_0         
	//* 751 1644:aload_1         
	//* 752 1645:iconst_0        
	//* 753 1646:invokevirtual   #1081 <Method void dispatchOnFragmentViewDestroyed(Fragment, boolean)>
	//* 754 1649:aload_1         
	//* 755 1650:getfield        #225 <Field View Fragment.mView>
	//* 756 1653:ifnull          1754
	//* 757 1656:aload_1         
	//* 758 1657:getfield        #288 <Field ViewGroup Fragment.mContainer>
	//* 759 1660:ifnull          1754
	//* 760 1663:aload_1         
	//* 761 1664:getfield        #225 <Field View Fragment.mView>
	//* 762 1667:invokevirtual   #426 <Method void View.clearAnimation()>
	//* 763 1670:aload_1         
	//* 764 1671:getfield        #288 <Field ViewGroup Fragment.mContainer>
	//* 765 1674:aload_1         
	//* 766 1675:getfield        #225 <Field View Fragment.mView>
	//* 767 1678:invokevirtual   #1577 <Method void ViewGroup.endViewTransition(View)>
	//* 768 1681:aload_0         
	//* 769 1682:getfield        #171 <Field int mCurState>
	//* 770 1685:ifle            1917
	//* 771 1688:aload_0         
	//* 772 1689:getfield        #969 <Field boolean mDestroyed>
	//* 773 1692:ifne            1917
	//* 774 1695:aload_1         
	//* 775 1696:getfield        #225 <Field View Fragment.mView>
	//* 776 1699:invokevirtual   #1525 <Method int View.getVisibility()>
	//* 777 1702:ifne            1917
	//* 778 1705:aload_1         
	//* 779 1706:getfield        #396 <Field float Fragment.mPostponedAlpha>
	//* 780 1709:fconst_0        
	//* 781 1710:fcmpl           
	//* 782 1711:iflt            1917
	//* 783 1714:aload_0         
	//* 784 1715:aload_1         
	//* 785 1716:iload_3         
	//* 786 1717:iconst_0        
	//* 787 1718:iload           4
	//* 788 1720:invokevirtual   #921 <Method FragmentManagerImpl$AnimationOrAnimator loadAnimation(Fragment, int, boolean, int)>
	//* 789 1723:astore          9
	//* 790 1725:aload_1         
	//* 791 1726:fconst_0        
	//* 792 1727:putfield        #396 <Field float Fragment.mPostponedAlpha>
	//* 793 1730:aload           9
	//* 794 1732:ifnull          1743
	//* 795 1735:aload_0         
	//* 796 1736:aload_1         
	//* 797 1737:aload           9
	//* 798 1739:iload_2         
	//* 799 1740:invokespecial   #1579 <Method void animateRemoveFragment(Fragment, FragmentManagerImpl$AnimationOrAnimator, int)>
	//* 800 1743:aload_1         
	//* 801 1744:getfield        #288 <Field ViewGroup Fragment.mContainer>
	//* 802 1747:aload_1         
	//* 803 1748:getfield        #225 <Field View Fragment.mView>
	//* 804 1751:invokevirtual   #1582 <Method void ViewGroup.removeView(View)>
	//* 805 1754:aload_1         
	//* 806 1755:aconst_null     
	//* 807 1756:putfield        #288 <Field ViewGroup Fragment.mContainer>
	//* 808 1759:aload_1         
	//* 809 1760:aconst_null     
	//* 810 1761:putfield        #225 <Field View Fragment.mView>
	//* 811 1764:aload_1         
	//* 812 1765:aconst_null     
	//* 813 1766:putfield        #1222 <Field View Fragment.mInnerView>
	//* 814 1769:aload_1         
	//* 815 1770:iconst_0        
	//* 816 1771:putfield        #1404 <Field boolean Fragment.mInLayout>
	//* 817 1774:goto            1374
	//* 818 1777:aload_1         
	//* 819 1778:invokevirtual   #430 <Method Animator Fragment.getAnimator()>
	//* 820 1781:ifnull          1412
	//* 821 1784:aload_1         
	//* 822 1785:invokevirtual   #430 <Method Animator Fragment.getAnimator()>
	//* 823 1788:astore          9
	//* 824 1790:aload_1         
	//* 825 1791:aconst_null     
	//* 826 1792:invokevirtual   #285 <Method void Fragment.setAnimator(Animator)>
	//* 827 1795:aload           9
	//* 828 1797:invokevirtual   #1583 <Method void Animator.cancel()>
	//* 829 1800:goto            1412
	//* 830 1803:getstatic       #133 <Field boolean DEBUG>
	//* 831 1806:ifeq            1835
	//* 832 1809:ldc1            #67  <String "FragmentManager">
	//* 833 1811:new             #340 <Class StringBuilder>
	//* 834 1814:dup             
	//* 835 1815:invokespecial   #341 <Method void StringBuilder()>
	//* 836 1818:ldc2            #1585 <String "movefrom CREATED: ">
	//* 837 1821:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 838 1824:aload_1         
	//* 839 1825:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 840 1828:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 841 1831:invokestatic    #839 <Method int Log.v(String, String)>
	//* 842 1834:pop             
	//* 843 1835:aload_1         
	//* 844 1836:getfield        #769 <Field boolean Fragment.mRetaining>
	//* 845 1839:ifne            1888
	//* 846 1842:aload_1         
	//* 847 1843:invokevirtual   #1588 <Method void Fragment.performDestroy()>
	//* 848 1846:aload_0         
	//* 849 1847:aload_1         
	//* 850 1848:iconst_0        
	//* 851 1849:invokevirtual   #1018 <Method void dispatchOnFragmentDestroyed(Fragment, boolean)>
	//* 852 1852:aload_1         
	//* 853 1853:invokevirtual   #1591 <Method void Fragment.performDetach()>
	//* 854 1856:aload_0         
	//* 855 1857:aload_1         
	//* 856 1858:iconst_0        
	//* 857 1859:invokevirtual   #1025 <Method void dispatchOnFragmentDetached(Fragment, boolean)>
	//* 858 1862:iload_2         
	//* 859 1863:istore          6
	//* 860 1865:iload           5
	//* 861 1867:ifne            223
	//* 862 1870:aload_1         
	//* 863 1871:getfield        #769 <Field boolean Fragment.mRetaining>
	//* 864 1874:ifne            1896
	//* 865 1877:aload_0         
	//* 866 1878:aload_1         
	//* 867 1879:invokevirtual   #1593 <Method void makeInactive(Fragment)>
	//* 868 1882:iload_2         
	//* 869 1883:istore          6
	//* 870 1885:goto            223
	//* 871 1888:aload_1         
	//* 872 1889:iconst_0        
	//* 873 1890:putfield        #211 <Field int Fragment.mState>
	//* 874 1893:goto            1852
	//* 875 1896:aload_1         
	//* 876 1897:aconst_null     
	//* 877 1898:putfield        #1448 <Field FragmentHostCallback Fragment.mHost>
	//* 878 1901:aload_1         
	//* 879 1902:aconst_null     
	//* 880 1903:putfield        #1451 <Field Fragment Fragment.mParentFragment>
	//* 881 1906:aload_1         
	//* 882 1907:aconst_null     
	//* 883 1908:putfield        #1458 <Field FragmentManagerImpl Fragment.mFragmentManager>
	//* 884 1911:iload_2         
	//* 885 1912:istore          6
	//* 886 1914:goto            223
	//* 887 1917:aconst_null     
	//* 888 1918:astore          9
	//* 889 1920:goto            1725
				{
					obj = null;
	//  890 1923:aconst_null     
	//  891 1924:astore          9
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
_L8:
		k1 = i1;
		if(i1 > 2)
		{
			fragment.mState = 3;
			k1 = i1;
		}
_L9:
		j = k1;
		if(k1 > 3)
		{
			if(DEBUG)
				Log.v("FragmentManager", (new StringBuilder()).append("moveto STARTED: ").append(((Object) (fragment))).toString());
			fragment.performStart();
			dispatchOnFragmentStarted(fragment, false);
			j = k1;
		}
_L10:
		i1 = j;
		if(j > 4)
		{
			if(DEBUG)
				Log.v("FragmentManager", (new StringBuilder()).append("moveto RESUMED: ").append(((Object) (fragment))).toString());
			fragment.performResume();
			dispatchOnFragmentResumed(fragment, false);
			fragment.mSavedFragmentState = null;
			fragment.mSavedViewState = null;
			i1 = j;
		}
		  goto _L12
_L2:
		i1 = i;
		if(fragment.mState <= i) goto _L12; else goto _L13
_L13:
		fragment.mState;
		JVM INSTR tableswitch 1 5: default 1368
	//	               1 1374
	//	               2 1572
	//	               3 1531
	//	               4 1484
	//	               5 1437;
		   goto _L14 _L15 _L16 _L17 _L18 _L19
_L15:
		break MISSING_BLOCK_LABEL_1374;
_L14:
		i1 = i;
		  goto _L20
_L21:
		i1 = i;
		if(i < 1)
		{
			if(mDestroyed)
				if(fragment.getAnimatingAway() != null)
				{
					obj = ((Object) (fragment.getAnimatingAway()));
					fragment.setAnimatingAway(((View) (null)));
					((View) (obj)).clearAnimation();
				} else
				if(fragment.getAnimator() != null)
				{
					obj = ((Object) (fragment.getAnimator()));
					fragment.setAnimator(((Animator) (null)));
					((Animator) (obj)).cancel();
				}
			if(fragment.getAnimatingAway() != null || fragment.getAnimator() != null)
			{
				fragment.setStateAfterAnimating(i);
				i1 = 1;
			} else
			{
				if(DEBUG)
					Log.v("FragmentManager", (new StringBuilder()).append("movefrom CREATED: ").append(((Object) (fragment))).toString());
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
				if(!flag)
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
			}
		}
		  goto _L20
_L19:
		if(i < 5)
		{
			if(DEBUG)
				Log.v("FragmentManager", (new StringBuilder()).append("movefrom RESUMED: ").append(((Object) (fragment))).toString());
			fragment.performPause();
			dispatchOnFragmentPaused(fragment, false);
		}
_L18:
		if(i < 4)
		{
			if(DEBUG)
				Log.v("FragmentManager", (new StringBuilder()).append("movefrom STARTED: ").append(((Object) (fragment))).toString());
			fragment.performStop();
			dispatchOnFragmentStopped(fragment, false);
		}
_L17:
		if(i < 3)
		{
			if(DEBUG)
				Log.v("FragmentManager", (new StringBuilder()).append("movefrom STOPPED: ").append(((Object) (fragment))).toString());
			fragment.performReallyStop();
		}
_L16:
		if(i < 2)
		{
			if(DEBUG)
				Log.v("FragmentManager", (new StringBuilder()).append("movefrom ACTIVITY_CREATED: ").append(((Object) (fragment))).toString());
			if(fragment.mView != null && mHost.onShouldSaveFragmentState(fragment) && fragment.mSavedViewState == null)
				saveFragmentViewState(fragment);
			fragment.performDestroyView();
			dispatchOnFragmentViewDestroyed(fragment, false);
			if(fragment.mView != null && fragment.mContainer != null)
			{
				fragment.mView.clearAnimation();
				fragment.mContainer.endViewTransition(fragment.mView);
				if(mCurState > 0 && !mDestroyed && fragment.mView.getVisibility() == 0 && fragment.mPostponedAlpha >= 0.0F)
					obj = ((Object) (loadAnimation(fragment, j, false, k)));
				else
					obj = null;
				fragment.mPostponedAlpha = 0.0F;
				if(obj != null)
					animateRemoveFragment(fragment, ((AnimationOrAnimator) (obj)), i);
				fragment.mContainer.removeView(fragment.mView);
			}
			fragment.mContainer = null;
			fragment.mView = null;
			fragment.mInnerView = null;
			fragment.mInLayout = false;
		}
		if(true) goto _L21; else goto _L20
_L20:
		if(true) goto _L12; else goto _L22
_L22:
	//* 892 1926:goto            952
	}

	public void noteStateNotSaved()
	{
		mSavedNonConfig = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #1596 <Field FragmentManagerNonConfig mSavedNonConfig>
		mStateSaved = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #329 <Field boolean mStateSaved>
		int j = mAdded.size();
	//    6   10:aload_0         
	//    7   11:getfield        #164 <Field ArrayList mAdded>
	//    8   14:invokevirtual   #202 <Method int ArrayList.size()>
	//    9   17:istore_2        
		for(int i = 0; i < j; i++)
	//*  10   18:iconst_0        
	//*  11   19:istore_1        
	//*  12   20:iload_1         
	//*  13   21:iload_2         
	//*  14   22:icmpge          52
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//   15   25:aload_0         
	//   16   26:getfield        #164 <Field ArrayList mAdded>
	//   17   29:iload_1         
	//   18   30:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   19   33:checkcast       #208 <Class Fragment>
	//   20   36:astore_3        
			if(fragment != null)
	//*  21   37:aload_3         
	//*  22   38:ifnull          45
				fragment.noteStateNotSaved();
	//   23   41:aload_3         
	//   24   42:invokevirtual   #1598 <Method void Fragment.noteStateNotSaved()>
		}

	//   25   45:iload_1         
	//   26   46:iconst_1        
	//   27   47:iadd            
	//   28   48:istore_1        
	//*  29   49:goto            20
	//   30   52:return          
	}

	public View onCreateView(View view, String s, Context context, AttributeSet attributeset)
	{
		if(!"fragment".equals(((Object) (s))))
	//*   0    0:ldc2            #1602 <String "fragment">
	//*   1    3:aload_2         
	//*   2    4:invokevirtual   #667 <Method boolean String.equals(Object)>
	//*   3    7:ifne            12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		String s1 = attributeset.getAttributeValue(((String) (null)), "class");
	//    6   12:aload           4
	//    7   14:aconst_null     
	//    8   15:ldc2            #1604 <String "class">
	//    9   18:invokeinterface #1610 <Method String AttributeSet.getAttributeValue(String, String)>
	//   10   23:astore          8
		s = ((String) (context.obtainStyledAttributes(attributeset, FragmentTag.Fragment)));
	//   11   25:aload_3         
	//   12   26:aload           4
	//   13   28:getstatic       #1614 <Field int[] FragmentManagerImpl$FragmentTag.Fragment>
	//   14   31:invokevirtual   #1618 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   15   34:astore_2        
		if(s1 == null)
	//*  16   35:aload           8
	//*  17   37:ifnonnull       606
			s1 = ((TypedArray) (s)).getString(0);
	//   18   40:aload_2         
	//   19   41:iconst_0        
	//   20   42:invokevirtual   #1623 <Method String TypedArray.getString(int)>
	//   21   45:astore          8
		int k = ((TypedArray) (s)).getResourceId(1, -1);
	//   22   47:aload_2         
	//   23   48:iconst_1        
	//   24   49:iconst_m1       
	//   25   50:invokevirtual   #1626 <Method int TypedArray.getResourceId(int, int)>
	//   26   53:istore          7
		String s2 = ((TypedArray) (s)).getString(2);
	//   27   55:aload_2         
	//   28   56:iconst_2        
	//   29   57:invokevirtual   #1623 <Method String TypedArray.getString(int)>
	//   30   60:astore          9
		((TypedArray) (s)).recycle();
	//   31   62:aload_2         
	//   32   63:invokevirtual   #1629 <Method void TypedArray.recycle()>
		if(!Fragment.isSupportFragmentClass(mHost.getContext(), s1))
	//*  33   66:aload_0         
	//*  34   67:getfield        #444 <Field FragmentHostCallback mHost>
	//*  35   70:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//*  36   73:aload           8
	//*  37   75:invokestatic    #1633 <Method boolean Fragment.isSupportFragmentClass(Context, String)>
	//*  38   78:ifne            83
			return null;
	//   39   81:aconst_null     
	//   40   82:areturn         
		int i;
		if(view != null)
	//*  41   83:aload_1         
	//*  42   84:ifnull          149
			i = view.getId();
	//   43   87:aload_1         
	//   44   88:invokevirtual   #1636 <Method int View.getId()>
	//   45   91:istore          5
		else
	//*  46   93:iload           5
	//*  47   95:iconst_m1       
	//*  48   96:icmpne          155
	//*  49   99:iload           7
	//*  50  101:iconst_m1       
	//*  51  102:icmpne          155
	//*  52  105:aload           9
	//*  53  107:ifnonnull       155
	//*  54  110:new             #1496 <Class IllegalArgumentException>
	//*  55  113:dup             
	//*  56  114:new             #340 <Class StringBuilder>
	//*  57  117:dup             
	//*  58  118:invokespecial   #341 <Method void StringBuilder()>
	//*  59  121:aload           4
	//*  60  123:invokeinterface #1639 <Method String AttributeSet.getPositionDescription()>
	//*  61  128:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//*  62  131:ldc2            #1641 <String ": Must specify unique android:id, android:tag, or have a parent with an id for ">
	//*  63  134:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//*  64  137:aload           8
	//*  65  139:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//*  66  142:invokevirtual   #351 <Method String StringBuilder.toString()>
	//*  67  145:invokespecial   #1501 <Method void IllegalArgumentException(String)>
	//*  68  148:athrow          
			i = 0;
	//   69  149:iconst_0        
	//   70  150:istore          5
		if(i == -1 && k == -1 && s2 == null)
			throw new IllegalArgumentException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Must specify unique android:id, android:tag, or have a parent with an id for ").append(s1).toString());
	//*  71  152:goto            93
		if(k != -1)
	//*  72  155:iload           7
	//*  73  157:iconst_m1       
	//*  74  158:icmpeq          421
			s = ((String) (findFragmentById(k)));
	//   75  161:aload_0         
	//   76  162:iload           7
	//   77  164:invokevirtual   #1643 <Method Fragment findFragmentById(int)>
	//   78  167:astore_2        
		else
	//*  79  168:aload_2         
	//*  80  169:astore_1        
	//*  81  170:aload_2         
	//*  82  171:ifnonnull       188
	//*  83  174:aload_2         
	//*  84  175:astore_1        
	//*  85  176:aload           9
	//*  86  178:ifnull          188
	//*  87  181:aload_0         
	//*  88  182:aload           9
	//*  89  184:invokevirtual   #1645 <Method Fragment findFragmentByTag(String)>
	//*  90  187:astore_1        
	//*  91  188:aload_1         
	//*  92  189:astore_2        
	//*  93  190:aload_1         
	//*  94  191:ifnonnull       209
	//*  95  194:aload_1         
	//*  96  195:astore_2        
	//*  97  196:iload           5
	//*  98  198:iconst_m1       
	//*  99  199:icmpeq          209
	//* 100  202:aload_0         
	//* 101  203:iload           5
	//* 102  205:invokevirtual   #1643 <Method Fragment findFragmentById(int)>
	//* 103  208:astore_2        
	//* 104  209:getstatic       #133 <Field boolean DEBUG>
	//* 105  212:ifeq            266
	//* 106  215:ldc1            #67  <String "FragmentManager">
	//* 107  217:new             #340 <Class StringBuilder>
	//* 108  220:dup             
	//* 109  221:invokespecial   #341 <Method void StringBuilder()>
	//* 110  224:ldc2            #1647 <String "onCreateView: id=0x">
	//* 111  227:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 112  230:iload           7
	//* 113  232:invokestatic    #1137 <Method String Integer.toHexString(int)>
	//* 114  235:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 115  238:ldc2            #1649 <String " fname=">
	//* 116  241:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 117  244:aload           8
	//* 118  246:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 119  249:ldc2            #1651 <String " existing=">
	//* 120  252:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 121  255:aload_2         
	//* 122  256:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 123  259:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 124  262:invokestatic    #839 <Method int Log.v(String, String)>
	//* 125  265:pop             
	//* 126  266:aload_2         
	//* 127  267:ifnonnull       433
	//* 128  270:aload_0         
	//* 129  271:getfield        #903 <Field FragmentContainer mContainer>
	//* 130  274:aload_3         
	//* 131  275:aload           8
	//* 132  277:aconst_null     
	//* 133  278:invokevirtual   #1655 <Method Fragment FragmentContainer.instantiate(Context, String, Bundle)>
	//* 134  281:astore_1        
	//* 135  282:aload_1         
	//* 136  283:iconst_1        
	//* 137  284:putfield        #1205 <Field boolean Fragment.mFromLayout>
	//* 138  287:iload           7
	//* 139  289:ifeq            426
	//* 140  292:iload           7
	//* 141  294:istore          6
	//* 142  296:aload_1         
	//* 143  297:iload           6
	//* 144  299:putfield        #1240 <Field int Fragment.mFragmentId>
	//* 145  302:aload_1         
	//* 146  303:iload           5
	//* 147  305:putfield        #388 <Field int Fragment.mContainerId>
	//* 148  308:aload_1         
	//* 149  309:aload           9
	//* 150  311:putfield        #1245 <Field String Fragment.mTag>
	//* 151  314:aload_1         
	//* 152  315:iconst_1        
	//* 153  316:putfield        #1404 <Field boolean Fragment.mInLayout>
	//* 154  319:aload_1         
	//* 155  320:aload_0         
	//* 156  321:putfield        #1458 <Field FragmentManagerImpl Fragment.mFragmentManager>
	//* 157  324:aload_1         
	//* 158  325:aload_0         
	//* 159  326:getfield        #444 <Field FragmentHostCallback mHost>
	//* 160  329:putfield        #1448 <Field FragmentHostCallback Fragment.mHost>
	//* 161  332:aload_1         
	//* 162  333:aload_0         
	//* 163  334:getfield        #444 <Field FragmentHostCallback mHost>
	//* 164  337:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//* 165  340:aload           4
	//* 166  342:aload_1         
	//* 167  343:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 168  346:invokevirtual   #1659 <Method void Fragment.onInflate(Context, AttributeSet, Bundle)>
	//* 169  349:aload_0         
	//* 170  350:aload_1         
	//* 171  351:iconst_1        
	//* 172  352:invokevirtual   #1661 <Method void addFragment(Fragment, boolean)>
	//* 173  355:aload_0         
	//* 174  356:getfield        #171 <Field int mCurState>
	//* 175  359:iconst_1        
	//* 176  360:icmpge          560
	//* 177  363:aload_1         
	//* 178  364:getfield        #1205 <Field boolean Fragment.mFromLayout>
	//* 179  367:ifeq            560
	//* 180  370:aload_0         
	//* 181  371:aload_1         
	//* 182  372:iconst_1        
	//* 183  373:iconst_0        
	//* 184  374:iconst_0        
	//* 185  375:iconst_0        
	//* 186  376:invokevirtual   #221 <Method void moveToState(Fragment, int, int, int, boolean)>
	//* 187  379:aload_1         
	//* 188  380:getfield        #225 <Field View Fragment.mView>
	//* 189  383:ifnonnull       568
	//* 190  386:new             #331 <Class IllegalStateException>
	//* 191  389:dup             
	//* 192  390:new             #340 <Class StringBuilder>
	//* 193  393:dup             
	//* 194  394:invokespecial   #341 <Method void StringBuilder()>
	//* 195  397:ldc2            #1460 <String "Fragment ">
	//* 196  400:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 197  403:aload           8
	//* 198  405:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 199  408:ldc2            #1663 <String " did not create a view.">
	//* 200  411:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 201  414:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 202  417:invokespecial   #336 <Method void IllegalStateException(String)>
	//* 203  420:athrow          
			s = null;
	//  204  421:aconst_null     
	//  205  422:astore_2        
		view = ((View) (s));
		if(s == null)
		{
			view = ((View) (s));
			if(s2 != null)
				view = ((View) (findFragmentByTag(s2)));
		}
		s = ((String) (view));
		if(view == null)
		{
			s = ((String) (view));
			if(i != -1)
				s = ((String) (findFragmentById(i)));
		}
		if(DEBUG)
			Log.v("FragmentManager", (new StringBuilder()).append("onCreateView: id=0x").append(Integer.toHexString(k)).append(" fname=").append(s1).append(" existing=").append(((Object) (s))).toString());
		if(s == null)
		{
			view = ((View) (mContainer.instantiate(context, s1, ((Bundle) (null)))));
			view.mFromLayout = true;
			int j;
			if(k != 0)
				j = k;
			else
	//* 206  423:goto            168
				j = i;
	//  207  426:iload           5
	//  208  428:istore          6
			view.mFragmentId = j;
			view.mContainerId = i;
			view.mTag = s2;
			view.mInLayout = true;
			view.mFragmentManager = this;
			view.mHost = mHost;
			((Fragment) (view)).onInflate(mHost.getContext(), attributeset, ((Fragment) (view)).mSavedFragmentState);
			addFragment(((Fragment) (view)), true);
		} else
	//* 209  430:goto            296
		{
			if(((Fragment) (s)).mInLayout)
	//* 210  433:aload_2         
	//* 211  434:getfield        #1404 <Field boolean Fragment.mInLayout>
	//* 212  437:ifeq            518
				throw new IllegalArgumentException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Duplicate id 0x").append(Integer.toHexString(k)).append(", tag ").append(s2).append(", or parent id 0x").append(Integer.toHexString(i)).append(" with another fragment for ").append(s1).toString());
	//  213  440:new             #1496 <Class IllegalArgumentException>
	//  214  443:dup             
	//  215  444:new             #340 <Class StringBuilder>
	//  216  447:dup             
	//  217  448:invokespecial   #341 <Method void StringBuilder()>
	//  218  451:aload           4
	//  219  453:invokeinterface #1639 <Method String AttributeSet.getPositionDescription()>
	//  220  458:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  221  461:ldc2            #1665 <String ": Duplicate id 0x">
	//  222  464:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  223  467:iload           7
	//  224  469:invokestatic    #1137 <Method String Integer.toHexString(int)>
	//  225  472:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  226  475:ldc2            #1667 <String ", tag ">
	//  227  478:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  228  481:aload           9
	//  229  483:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  230  486:ldc2            #1669 <String ", or parent id 0x">
	//  231  489:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  232  492:iload           5
	//  233  494:invokestatic    #1137 <Method String Integer.toHexString(int)>
	//  234  497:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  235  500:ldc2            #1671 <String " with another fragment for ">
	//  236  503:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  237  506:aload           8
	//  238  508:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  239  511:invokevirtual   #351 <Method String StringBuilder.toString()>
	//  240  514:invokespecial   #1501 <Method void IllegalArgumentException(String)>
	//  241  517:athrow          
			s.mInLayout = true;
	//  242  518:aload_2         
	//  243  519:iconst_1        
	//  244  520:putfield        #1404 <Field boolean Fragment.mInLayout>
			s.mHost = mHost;
	//  245  523:aload_2         
	//  246  524:aload_0         
	//  247  525:getfield        #444 <Field FragmentHostCallback mHost>
	//  248  528:putfield        #1448 <Field FragmentHostCallback Fragment.mHost>
			if(!((Fragment) (s)).mRetaining)
	//* 249  531:aload_2         
	//* 250  532:getfield        #769 <Field boolean Fragment.mRetaining>
	//* 251  535:ifne            555
				((Fragment) (s)).onInflate(mHost.getContext(), attributeset, ((Fragment) (s)).mSavedFragmentState);
	//  252  538:aload_2         
	//  253  539:aload_0         
	//  254  540:getfield        #444 <Field FragmentHostCallback mHost>
	//  255  543:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//  256  546:aload           4
	//  257  548:aload_2         
	//  258  549:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//  259  552:invokevirtual   #1659 <Method void Fragment.onInflate(Context, AttributeSet, Bundle)>
			view = ((View) (s));
	//  260  555:aload_2         
	//  261  556:astore_1        
		}
		if(mCurState < 1 && ((Fragment) (view)).mFromLayout)
			moveToState(((Fragment) (view)), 1, 0, 0, false);
		else
	//* 262  557:goto            355
			moveToState(((Fragment) (view)));
	//  263  560:aload_0         
	//  264  561:aload_1         
	//  265  562:invokevirtual   #867 <Method void moveToState(Fragment)>
		if(((Fragment) (view)).mView == null)
			throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(s1).append(" did not create a view.").toString());
	//* 266  565:goto            379
		if(k != 0)
	//* 267  568:iload           7
	//* 268  570:ifeq            582
			((Fragment) (view)).mView.setId(k);
	//  269  573:aload_1         
	//  270  574:getfield        #225 <Field View Fragment.mView>
	//  271  577:iload           7
	//  272  579:invokevirtual   #1674 <Method void View.setId(int)>
		if(((Fragment) (view)).mView.getTag() == null)
	//* 273  582:aload_1         
	//* 274  583:getfield        #225 <Field View Fragment.mView>
	//* 275  586:invokevirtual   #1677 <Method Object View.getTag()>
	//* 276  589:ifnonnull       601
			((Fragment) (view)).mView.setTag(((Object) (s2)));
	//  277  592:aload_1         
	//  278  593:getfield        #225 <Field View Fragment.mView>
	//  279  596:aload           9
	//  280  598:invokevirtual   #1680 <Method void View.setTag(Object)>
		return ((Fragment) (view)).mView;
	//  281  601:aload_1         
	//  282  602:getfield        #225 <Field View Fragment.mView>
	//  283  605:areturn         
	//* 284  606:goto            47
	}

	public View onCreateView(String s, Context context, AttributeSet attributeset)
	{
		return onCreateView(((View) (null)), s, context, attributeset);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokevirtual   #1683 <Method View onCreateView(View, String, Context, AttributeSet)>
	//    6    8:areturn         
	}

	public void performPendingDeferredStart(Fragment fragment)
	{
label0:
		{
			if(fragment.mDeferStart)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1401 <Field boolean Fragment.mDeferStart>
	//*   2    4:ifeq            19
			{
				if(!mExecutingActions)
					break label0;
	//    3    7:aload_0         
	//    4    8:getfield        #354 <Field boolean mExecutingActions>
	//    5   11:ifeq            20
				mHavePendingDeferredStart = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #1109 <Field boolean mHavePendingDeferredStart>
			}
			return;
	//    9   19:return          
		}
		fragment.mDeferStart = false;
	//   10   20:aload_1         
	//   11   21:iconst_0        
	//   12   22:putfield        #1401 <Field boolean Fragment.mDeferStart>
		moveToState(fragment, mCurState, 0, 0, false);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #171 <Field int mCurState>
	//   17   31:iconst_0        
	//   18   32:iconst_0        
	//   19   33:iconst_0        
	//   20   34:invokevirtual   #221 <Method void moveToState(Fragment, int, int, int, boolean)>
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
	//    7    9:invokespecial   #1688 <Method void FragmentManagerImpl$PopBackStackState(FragmentManagerImpl, String, int, int)>
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #1690 <Method void enqueueAction(FragmentManagerImpl$OpGenerator, boolean)>
	//   10   16:return          
	}

	public void popBackStack(int i, int j)
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            32
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Bad id: ").append(i).toString());
	//    2    4:new             #1496 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:new             #340 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #341 <Method void StringBuilder()>
	//    7   15:ldc2            #1693 <String "Bad id: ">
	//    8   18:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:iload_1         
	//   10   22:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//   11   25:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   12   28:invokespecial   #1501 <Method void IllegalArgumentException(String)>
	//   13   31:athrow          
		} else
		{
			enqueueAction(((OpGenerator) (new PopBackStackState(((String) (null)), i, j))), false);
	//   14   32:aload_0         
	//   15   33:new             #36  <Class FragmentManagerImpl$PopBackStackState>
	//   16   36:dup             
	//   17   37:aload_0         
	//   18   38:aconst_null     
	//   19   39:iload_1         
	//   20   40:iload_2         
	//   21   41:invokespecial   #1688 <Method void FragmentManagerImpl$PopBackStackState(FragmentManagerImpl, String, int, int)>
	//   22   44:iconst_0        
	//   23   45:invokevirtual   #1690 <Method void enqueueAction(FragmentManagerImpl$OpGenerator, boolean)>
			return;
	//   24   48:return          
		}
	}

	public void popBackStack(String s, int i)
	{
		enqueueAction(((OpGenerator) (new PopBackStackState(s, -1, i))), false);
	//    0    0:aload_0         
	//    1    1:new             #36  <Class FragmentManagerImpl$PopBackStackState>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iconst_m1       
	//    6    8:iload_2         
	//    7    9:invokespecial   #1688 <Method void FragmentManagerImpl$PopBackStackState(FragmentManagerImpl, String, int, int)>
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #1690 <Method void enqueueAction(FragmentManagerImpl$OpGenerator, boolean)>
	//   10   16:return          
	}

	public boolean popBackStackImmediate()
	{
		checkStateLoss();
	//    0    0:aload_0         
	//    1    1:invokespecial   #459 <Method void checkStateLoss()>
		return popBackStackImmediate(((String) (null)), -1, 0);
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:iconst_m1       
	//    5    7:iconst_0        
	//    6    8:invokespecial   #1696 <Method boolean popBackStackImmediate(String, int, int)>
	//    7   11:ireturn         
	}

	public boolean popBackStackImmediate(int i, int j)
	{
		checkStateLoss();
	//    0    0:aload_0         
	//    1    1:invokespecial   #459 <Method void checkStateLoss()>
		execPendingActions();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #408 <Method boolean execPendingActions()>
	//    4    8:pop             
		if(i < 0)
	//*   5    9:iload_1         
	//*   6   10:ifge            41
			throw new IllegalArgumentException((new StringBuilder()).append("Bad id: ").append(i).toString());
	//    7   13:new             #1496 <Class IllegalArgumentException>
	//    8   16:dup             
	//    9   17:new             #340 <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #341 <Method void StringBuilder()>
	//   12   24:ldc2            #1693 <String "Bad id: ">
	//   13   27:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:iload_1         
	//   15   31:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//   16   34:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   17   37:invokespecial   #1501 <Method void IllegalArgumentException(String)>
	//   18   40:athrow          
		else
			return popBackStackImmediate(((String) (null)), i, j);
	//   19   41:aload_0         
	//   20   42:aconst_null     
	//   21   43:iload_1         
	//   22   44:iload_2         
	//   23   45:invokespecial   #1696 <Method boolean popBackStackImmediate(String, int, int)>
	//   24   48:ireturn         
	}

	public boolean popBackStackImmediate(String s, int i)
	{
		checkStateLoss();
	//    0    0:aload_0         
	//    1    1:invokespecial   #459 <Method void checkStateLoss()>
		return popBackStackImmediate(s, -1, i);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iconst_m1       
	//    5    7:iload_2         
	//    6    8:invokespecial   #1696 <Method boolean popBackStackImmediate(String, int, int)>
	//    7   11:ireturn         
	}

	boolean popBackStackState(ArrayList arraylist, ArrayList arraylist1, String s, int i, int j)
	{
		if(mBackStack == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #829 <Field ArrayList mBackStack>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(s != null || i >= 0 || (j & 1) != 0) goto _L2; else goto _L1
	//    5    9:aload_3         
	//    6   10:ifnonnull       68
	//    7   13:iload           4
	//    8   15:ifge            68
	//    9   18:iload           5
	//   10   20:iconst_1        
	//   11   21:iand            
	//   12   22:ifne            68
_L1:
		i = mBackStack.size() - 1;
	//   13   25:aload_0         
	//   14   26:getfield        #829 <Field ArrayList mBackStack>
	//   15   29:invokevirtual   #202 <Method int ArrayList.size()>
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:istore          4
		if(i < 0)
	//*  19   36:iload           4
	//*  20   38:ifge            43
			return false;
	//   21   41:iconst_0        
	//   22   42:ireturn         
		arraylist.add(mBackStack.remove(i));
	//   23   43:aload_1         
	//   24   44:aload_0         
	//   25   45:getfield        #829 <Field ArrayList mBackStack>
	//   26   48:iload           4
	//   27   50:invokevirtual   #545 <Method Object ArrayList.remove(int)>
	//   28   53:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//   29   56:pop             
		arraylist1.add(((Object) (Boolean.valueOf(true))));
	//   30   57:aload_2         
	//   31   58:iconst_1        
	//   32   59:invokestatic    #376 <Method Boolean Boolean.valueOf(boolean)>
	//   33   62:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//   34   65:pop             
_L4:
		return true;
	//   35   66:iconst_1        
	//   36   67:ireturn         
_L2:
		int k;
label0:
		{
			k = -1;
	//   37   68:iconst_m1       
	//   38   69:istore          6
			if(s == null && i < 0)
				break label0;
	//   39   71:aload_3         
	//   40   72:ifnonnull       80
	//   41   75:iload           4
	//   42   77:iflt            245
			int l = mBackStack.size() - 1;
	//   43   80:aload_0         
	//   44   81:getfield        #829 <Field ArrayList mBackStack>
	//   45   84:invokevirtual   #202 <Method int ArrayList.size()>
	//   46   87:iconst_1        
	//   47   88:isub            
	//   48   89:istore          7
label1:
			do
			{
				BackStackRecord backstackrecord;
				if(l >= 0)
	//*  49   91:iload           7
	//*  50   93:iflt            126
				{
					backstackrecord = (BackStackRecord)mBackStack.get(l);
	//   51   96:aload_0         
	//   52   97:getfield        #829 <Field ArrayList mBackStack>
	//   53  100:iload           7
	//   54  102:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   55  105:checkcast       #363 <Class BackStackRecord>
	//   56  108:astore          8
					break MISSING_BLOCK_LABEL_110;
				}
				do
	//*  57  110:aload_3         
	//*  58  111:ifnull          133
	//*  59  114:aload_3         
	//*  60  115:aload           8
	//*  61  117:invokevirtual   #1701 <Method String BackStackRecord.getName()>
	//*  62  120:invokevirtual   #667 <Method boolean String.equals(Object)>
	//*  63  123:ifeq            133
				{
					if(l < 0)
	//*  64  126:iload           7
	//*  65  128:ifge            157
						return false;
	//   66  131:iconst_0        
	//   67  132:ireturn         
					break label1;
				} while(s != null && s.equals(((Object) (backstackrecord.getName()))) || i >= 0 && i == backstackrecord.mIndex);
	//   68  133:iload           4
	//   69  135:iflt            148
	//   70  138:iload           4
	//   71  140:aload           8
	//   72  142:getfield        #510 <Field int BackStackRecord.mIndex>
	//   73  145:icmpeq          126
				l--;
	//   74  148:iload           7
	//   75  150:iconst_1        
	//   76  151:isub            
	//   77  152:istore          7
			} while(true);
	//   78  154:goto            91
			k = l;
	//   79  157:iload           7
	//   80  159:istore          6
			if((j & 1) != 0)
	//*  81  161:iload           5
	//*  82  163:iconst_1        
	//*  83  164:iand            
	//*  84  165:ifeq            245
			{
				j = l - 1;
	//   85  168:iload           7
	//   86  170:iconst_1        
	//   87  171:isub            
	//   88  172:istore          5
				do
				{
					k = j;
	//   89  174:iload           5
	//   90  176:istore          6
					if(j < 0)
						break;
	//   91  178:iload           5
	//   92  180:iflt            245
					BackStackRecord backstackrecord1 = (BackStackRecord)mBackStack.get(j);
	//   93  183:aload_0         
	//   94  184:getfield        #829 <Field ArrayList mBackStack>
	//   95  187:iload           5
	//   96  189:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   97  192:checkcast       #363 <Class BackStackRecord>
	//   98  195:astore          8
					if(s == null || !s.equals(((Object) (backstackrecord1.getName()))))
	//*  99  197:aload_3         
	//* 100  198:ifnull          213
	//* 101  201:aload_3         
	//* 102  202:aload           8
	//* 103  204:invokevirtual   #1701 <Method String BackStackRecord.getName()>
	//* 104  207:invokevirtual   #667 <Method boolean String.equals(Object)>
	//* 105  210:ifne            236
					{
						k = j;
	//  106  213:iload           5
	//  107  215:istore          6
						if(i < 0)
							break;
	//  108  217:iload           4
	//  109  219:iflt            245
						k = j;
	//  110  222:iload           5
	//  111  224:istore          6
						if(i != backstackrecord1.mIndex)
							break;
	//  112  226:iload           4
	//  113  228:aload           8
	//  114  230:getfield        #510 <Field int BackStackRecord.mIndex>
	//  115  233:icmpne          245
					}
					j--;
	//  116  236:iload           5
	//  117  238:iconst_1        
	//  118  239:isub            
	//  119  240:istore          5
				} while(true);
	//  120  242:goto            174
			}
		}
		if(k == mBackStack.size() - 1)
	//* 121  245:iload           6
	//* 122  247:aload_0         
	//* 123  248:getfield        #829 <Field ArrayList mBackStack>
	//* 124  251:invokevirtual   #202 <Method int ArrayList.size()>
	//* 125  254:iconst_1        
	//* 126  255:isub            
	//* 127  256:icmpne          261
			return false;
	//  128  259:iconst_0        
	//  129  260:ireturn         
		i = mBackStack.size() - 1;
	//  130  261:aload_0         
	//  131  262:getfield        #829 <Field ArrayList mBackStack>
	//  132  265:invokevirtual   #202 <Method int ArrayList.size()>
	//  133  268:iconst_1        
	//  134  269:isub            
	//  135  270:istore          4
		while(i > k) 
	//* 136  272:iload           4
	//* 137  274:iload           6
	//* 138  276:icmple          66
		{
			arraylist.add(mBackStack.remove(i));
	//  139  279:aload_1         
	//  140  280:aload_0         
	//  141  281:getfield        #829 <Field ArrayList mBackStack>
	//  142  284:iload           4
	//  143  286:invokevirtual   #545 <Method Object ArrayList.remove(int)>
	//  144  289:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//  145  292:pop             
			arraylist1.add(((Object) (Boolean.valueOf(true))));
	//  146  293:aload_2         
	//  147  294:iconst_1        
	//  148  295:invokestatic    #376 <Method Boolean Boolean.valueOf(boolean)>
	//  149  298:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//  150  301:pop             
			i--;
	//  151  302:iload           4
	//  152  304:iconst_1        
	//  153  305:isub            
	//  154  306:istore          4
		}
		if(true) goto _L4; else goto _L3
	//  155  308:goto            272
_L3:
	}

	public void putFragment(Bundle bundle, String s, Fragment fragment)
	{
		if(fragment.mIndex < 0)
	//*   0    0:aload_3         
	//*   1    1:getfield        #1350 <Field int Fragment.mIndex>
	//*   2    4:ifge            44
			throwException(((RuntimeException) (new IllegalStateException((new StringBuilder()).append("Fragment ").append(((Object) (fragment))).append(" is not currently in the FragmentManager").toString()))));
	//    3    7:aload_0         
	//    4    8:new             #331 <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:new             #340 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #341 <Method void StringBuilder()>
	//    9   19:ldc2            #1460 <String "Fragment ">
	//   10   22:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_3         
	//   12   26:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:ldc2            #1706 <String " is not currently in the FragmentManager">
	//   14   32:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   16   38:invokespecial   #336 <Method void IllegalStateException(String)>
	//   17   41:invokespecial   #1276 <Method void throwException(RuntimeException)>
		bundle.putInt(s, fragment.mIndex);
	//   18   44:aload_1         
	//   19   45:aload_2         
	//   20   46:aload_3         
	//   21   47:getfield        #1350 <Field int Fragment.mIndex>
	//   22   50:invokevirtual   #1709 <Method void Bundle.putInt(String, int)>
	//   23   53:return          
	}

	public void registerFragmentLifecycleCallbacks(FragmentManager.FragmentLifecycleCallbacks fragmentlifecyclecallbacks, boolean flag)
	{
		mLifecycleCallbacks.add(((Object) (new Pair(((Object) (fragmentlifecyclecallbacks)), ((Object) (Boolean.valueOf(flag)))))));
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//    2    4:new             #988 <Class Pair>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokestatic    #376 <Method Boolean Boolean.valueOf(boolean)>
	//    7   13:invokespecial   #1714 <Method void Pair(Object, Object)>
	//    8   16:invokevirtual   #1715 <Method boolean CopyOnWriteArrayList.add(Object)>
	//    9   19:pop             
	//   10   20:return          
	}

	public void removeFragment(Fragment fragment)
	{
		if(DEBUG)
	//*   0    0:getstatic       #133 <Field boolean DEBUG>
	//*   1    3:ifeq            45
			Log.v("FragmentManager", (new StringBuilder()).append("remove: ").append(((Object) (fragment))).append(" nesting=").append(fragment.mBackStackNesting).toString());
	//    2    6:ldc1            #67  <String "FragmentManager">
	//    3    8:new             #340 <Class StringBuilder>
	//    4   11:dup             
	//    5   12:invokespecial   #341 <Method void StringBuilder()>
	//    6   15:ldc2            #1718 <String "remove: ">
	//    7   18:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//    8   21:aload_1         
	//    9   22:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   10   25:ldc2            #1720 <String " nesting=">
	//   11   28:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   12   31:aload_1         
	//   13   32:getfield        #1723 <Field int Fragment.mBackStackNesting>
	//   14   35:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//   15   38:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   16   41:invokestatic    #839 <Method int Log.v(String, String)>
	//   17   44:pop             
		boolean flag;
		if(!fragment.isInBackStack())
	//*  18   45:aload_1         
	//*  19   46:invokevirtual   #1376 <Method boolean Fragment.isInBackStack()>
	//*  20   49:ifne            113
			flag = true;
	//   21   52:iconst_1        
	//   22   53:istore_2        
		else
	//*  23   54:aload_1         
	//*  24   55:getfield        #846 <Field boolean Fragment.mDetached>
	//*  25   58:ifeq            65
	//*  26   61:iload_2         
	//*  27   62:ifeq            112
	//*  28   65:aload_0         
	//*  29   66:getfield        #164 <Field ArrayList mAdded>
	//*  30   69:astore_3        
	//*  31   70:aload_3         
	//*  32   71:monitorenter    
	//*  33   72:aload_0         
	//*  34   73:getfield        #164 <Field ArrayList mAdded>
	//*  35   76:aload_1         
	//*  36   77:invokevirtual   #942 <Method boolean ArrayList.remove(Object)>
	//*  37   80:pop             
	//*  38   81:aload_3         
	//*  39   82:monitorexit     
	//*  40   83:aload_1         
	//*  41   84:getfield        #860 <Field boolean Fragment.mHasMenu>
	//*  42   87:ifeq            102
	//*  43   90:aload_1         
	//*  44   91:getfield        #863 <Field boolean Fragment.mMenuVisible>
	//*  45   94:ifeq            102
	//*  46   97:aload_0         
	//*  47   98:iconst_1        
	//*  48   99:putfield        #865 <Field boolean mNeedMenuInvalidate>
	//*  49  102:aload_1         
	//*  50  103:iconst_0        
	//*  51  104:putfield        #640 <Field boolean Fragment.mAdded>
	//*  52  107:aload_1         
	//*  53  108:iconst_1        
	//*  54  109:putfield        #854 <Field boolean Fragment.mRemoving>
	//*  55  112:return          
			flag = false;
	//   56  113:iconst_0        
	//   57  114:istore_2        
		if(!fragment.mDetached || flag)
		{
			synchronized(mAdded)
			{
				mAdded.remove(((Object) (fragment)));
			}
			if(fragment.mHasMenu && fragment.mMenuVisible)
				mNeedMenuInvalidate = true;
			fragment.mAdded = false;
			fragment.mRemoving = true;
		}
		return;
	//*  58  115:goto            54
		fragment;
	//   59  118:astore_1        
		arraylist;
	//   60  119:aload_3         
		JVM INSTR monitorexit ;
	//   61  120:monitorexit     
		throw fragment;
	//   62  121:aload_1         
	//   63  122:athrow          
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
	//*   8   14:invokevirtual   #202 <Method int ArrayList.size()>
	//*   9   17:icmpge          43
				((FragmentManager.OnBackStackChangedListener)mBackStackChangeListeners.get(i)).onBackStackChanged();
	//   10   20:aload_0         
	//   11   21:getfield        #871 <Field ArrayList mBackStackChangeListeners>
	//   12   24:iload_1         
	//   13   25:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   14   28:checkcast       #1726 <Class FragmentManager$OnBackStackChangedListener>
	//   15   31:invokeinterface #1729 <Method void FragmentManager$OnBackStackChangedListener.onBackStackChanged()>

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
		while(parcelable == null || (fragmentmanagerstate = (FragmentManagerState)parcelable).mActive == null) 
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
	//    3    5:aload_1         
	//    4    6:checkcast       #1733 <Class FragmentManagerState>
	//    5    9:astore          7
	//    6   11:aload           7
	//    7   13:getfield        #1736 <Field FragmentState[] FragmentManagerState.mActive>
	//    8   16:ifnull          4
		int j;
		if(fragmentmanagernonconfig != null)
	//*   9   19:aload_2         
	//*  10   20:ifnull          988
		{
			List list = fragmentmanagernonconfig.getFragments();
	//   11   23:aload_2         
	//   12   24:invokevirtual   #753 <Method List FragmentManagerNonConfig.getFragments()>
	//   13   27:astore          6
			parcelable = ((Parcelable) (fragmentmanagernonconfig.getChildNonConfigs()));
	//   14   29:aload_2         
	//   15   30:invokevirtual   #772 <Method List FragmentManagerNonConfig.getChildNonConfigs()>
	//   16   33:astore_1        
			int i;
			int k;
			if(list != null)
	//*  17   34:aload           6
	//*  18   36:ifnull          145
				i = list.size();
	//   19   39:aload           6
	//   20   41:invokeinterface #676 <Method int List.size()>
	//   21   46:istore_3        
			else
	//*  22   47:iconst_0        
	//*  23   48:istore          4
	//*  24   50:iload           4
	//*  25   52:iload_3         
	//*  26   53:icmpge          303
	//*  27   56:aload           6
	//*  28   58:iload           4
	//*  29   60:invokeinterface #677 <Method Object List.get(int)>
	//*  30   65:checkcast       #208 <Class Fragment>
	//*  31   68:astore          8
	//*  32   70:getstatic       #133 <Field boolean DEBUG>
	//*  33   73:ifeq            103
	//*  34   76:ldc1            #67  <String "FragmentManager">
	//*  35   78:new             #340 <Class StringBuilder>
	//*  36   81:dup             
	//*  37   82:invokespecial   #341 <Method void StringBuilder()>
	//*  38   85:ldc2            #1738 <String "restoreAllState: re-attaching retained ">
	//*  39   88:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//*  40   91:aload           8
	//*  41   93:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//*  42   96:invokevirtual   #351 <Method String StringBuilder.toString()>
	//*  43   99:invokestatic    #839 <Method int Log.v(String, String)>
	//*  44  102:pop             
	//*  45  103:iconst_0        
	//*  46  104:istore          5
	//*  47  106:iload           5
	//*  48  108:aload           7
	//*  49  110:getfield        #1736 <Field FragmentState[] FragmentManagerState.mActive>
	//*  50  113:arraylength     
	//*  51  114:icmpge          150
	//*  52  117:aload           7
	//*  53  119:getfield        #1736 <Field FragmentState[] FragmentManagerState.mActive>
	//*  54  122:iload           5
	//*  55  124:aaload          
	//*  56  125:getfield        #1741 <Field int FragmentState.mIndex>
	//*  57  128:aload           8
	//*  58  130:getfield        #1350 <Field int Fragment.mIndex>
	//*  59  133:icmpeq          150
	//*  60  136:iload           5
	//*  61  138:iconst_1        
	//*  62  139:iadd            
	//*  63  140:istore          5
	//*  64  142:goto            106
				i = 0;
	//   65  145:iconst_0        
	//   66  146:istore_3        
			for(k = 0; k < i; k++)
			{
				Fragment fragment = (Fragment)list.get(k);
				if(DEBUG)
					Log.v("FragmentManager", (new StringBuilder()).append("restoreAllState: re-attaching retained ").append(((Object) (fragment))).toString());
				int i1;
				for(i1 = 0; i1 < fragmentmanagerstate.mActive.length && fragmentmanagerstate.mActive[i1].mIndex != fragment.mIndex; i1++);
	//*  67  147:goto            47
				if(i1 == fragmentmanagerstate.mActive.length)
	//*  68  150:iload           5
	//*  69  152:aload           7
	//*  70  154:getfield        #1736 <Field FragmentState[] FragmentManagerState.mActive>
	//*  71  157:arraylength     
	//*  72  158:icmpne          196
					throwException(((RuntimeException) (new IllegalStateException((new StringBuilder()).append("Could not find active fragment with index ").append(fragment.mIndex).toString()))));
	//   73  161:aload_0         
	//   74  162:new             #331 <Class IllegalStateException>
	//   75  165:dup             
	//   76  166:new             #340 <Class StringBuilder>
	//   77  169:dup             
	//   78  170:invokespecial   #341 <Method void StringBuilder()>
	//   79  173:ldc2            #1743 <String "Could not find active fragment with index ">
	//   80  176:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   81  179:aload           8
	//   82  181:getfield        #1350 <Field int Fragment.mIndex>
	//   83  184:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//   84  187:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   85  190:invokespecial   #336 <Method void IllegalStateException(String)>
	//   86  193:invokespecial   #1276 <Method void throwException(RuntimeException)>
				FragmentState fragmentstate1 = fragmentmanagerstate.mActive[i1];
	//   87  196:aload           7
	//   88  198:getfield        #1736 <Field FragmentState[] FragmentManagerState.mActive>
	//   89  201:iload           5
	//   90  203:aaload          
	//   91  204:astore          9
				fragmentstate1.mInstance = fragment;
	//   92  206:aload           9
	//   93  208:aload           8
	//   94  210:putfield        #1746 <Field Fragment FragmentState.mInstance>
				fragment.mSavedViewState = null;
	//   95  213:aload           8
	//   96  215:aconst_null     
	//   97  216:putfield        #1432 <Field SparseArray Fragment.mSavedViewState>
				fragment.mBackStackNesting = 0;
	//   98  219:aload           8
	//   99  221:iconst_0        
	//  100  222:putfield        #1723 <Field int Fragment.mBackStackNesting>
				fragment.mInLayout = false;
	//  101  225:aload           8
	//  102  227:iconst_0        
	//  103  228:putfield        #1404 <Field boolean Fragment.mInLayout>
				fragment.mAdded = false;
	//  104  231:aload           8
	//  105  233:iconst_0        
	//  106  234:putfield        #640 <Field boolean Fragment.mAdded>
				fragment.mTarget = null;
	//  107  237:aload           8
	//  108  239:aconst_null     
	//  109  240:putfield        #1437 <Field Fragment Fragment.mTarget>
				if(fragmentstate1.mSavedFragmentState != null)
	//* 110  243:aload           9
	//* 111  245:getfield        #1747 <Field Bundle FragmentState.mSavedFragmentState>
	//* 112  248:ifnull          294
				{
					fragmentstate1.mSavedFragmentState.setClassLoader(mHost.getContext().getClassLoader());
	//  113  251:aload           9
	//  114  253:getfield        #1747 <Field Bundle FragmentState.mSavedFragmentState>
	//  115  256:aload_0         
	//  116  257:getfield        #444 <Field FragmentHostCallback mHost>
	//  117  260:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//  118  263:invokevirtual   #1421 <Method ClassLoader Context.getClassLoader()>
	//  119  266:invokevirtual   #1425 <Method void Bundle.setClassLoader(ClassLoader)>
					fragment.mSavedViewState = fragmentstate1.mSavedFragmentState.getSparseParcelableArray("android:view_state");
	//  120  269:aload           8
	//  121  271:aload           9
	//  122  273:getfield        #1747 <Field Bundle FragmentState.mSavedFragmentState>
	//  123  276:ldc1            #79  <String "android:view_state">
	//  124  278:invokevirtual   #1429 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//  125  281:putfield        #1432 <Field SparseArray Fragment.mSavedViewState>
					fragment.mSavedFragmentState = fragmentstate1.mSavedFragmentState;
	//  126  284:aload           8
	//  127  286:aload           9
	//  128  288:getfield        #1747 <Field Bundle FragmentState.mSavedFragmentState>
	//  129  291:putfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
				}
			}

	//  130  294:iload           4
	//  131  296:iconst_1        
	//  132  297:iadd            
	//  133  298:istore          4
		} else
	//* 134  300:goto            50
	//* 135  303:aload_0         
	//* 136  304:new             #315 <Class SparseArray>
	//* 137  307:dup             
	//* 138  308:aload           7
	//* 139  310:getfield        #1736 <Field FragmentState[] FragmentManagerState.mActive>
	//* 140  313:arraylength     
	//* 141  314:invokespecial   #1748 <Method void SparseArray(int)>
	//* 142  317:putfield        #313 <Field SparseArray mActive>
	//* 143  320:iconst_0        
	//* 144  321:istore_3        
	//* 145  322:iload_3         
	//* 146  323:aload           7
	//* 147  325:getfield        #1736 <Field FragmentState[] FragmentManagerState.mActive>
	//* 148  328:arraylength     
	//* 149  329:icmpge          463
	//* 150  332:aload           7
	//* 151  334:getfield        #1736 <Field FragmentState[] FragmentManagerState.mActive>
	//* 152  337:iload_3         
	//* 153  338:aaload          
	//* 154  339:astore          8
	//* 155  341:aload           8
	//* 156  343:ifnull          456
	//* 157  346:aload_1         
	//* 158  347:ifnull          982
	//* 159  350:iload_3         
	//* 160  351:aload_1         
	//* 161  352:invokeinterface #676 <Method int List.size()>
	//* 162  357:icmpge          982
	//* 163  360:aload_1         
	//* 164  361:iload_3         
	//* 165  362:invokeinterface #677 <Method Object List.get(int)>
	//* 166  367:checkcast       #750 <Class FragmentManagerNonConfig>
	//* 167  370:astore          6
	//* 168  372:aload           8
	//* 169  374:aload_0         
	//* 170  375:getfield        #444 <Field FragmentHostCallback mHost>
	//* 171  378:aload_0         
	//* 172  379:getfield        #903 <Field FragmentContainer mContainer>
	//* 173  382:aload_0         
	//* 174  383:getfield        #905 <Field Fragment mParent>
	//* 175  386:aload           6
	//* 176  388:invokevirtual   #1751 <Method Fragment FragmentState.instantiate(FragmentHostCallback, FragmentContainer, Fragment, FragmentManagerNonConfig)>
	//* 177  391:astore          6
	//* 178  393:getstatic       #133 <Field boolean DEBUG>
	//* 179  396:ifeq            436
	//* 180  399:ldc1            #67  <String "FragmentManager">
	//* 181  401:new             #340 <Class StringBuilder>
	//* 182  404:dup             
	//* 183  405:invokespecial   #341 <Method void StringBuilder()>
	//* 184  408:ldc2            #1753 <String "restoreAllState: active #">
	//* 185  411:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 186  414:iload_3         
	//* 187  415:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//* 188  418:ldc2            #1148 <String ": ">
	//* 189  421:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 190  424:aload           6
	//* 191  426:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 192  429:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 193  432:invokestatic    #839 <Method int Log.v(String, String)>
	//* 194  435:pop             
	//* 195  436:aload_0         
	//* 196  437:getfield        #313 <Field SparseArray mActive>
	//* 197  440:aload           6
	//* 198  442:getfield        #1350 <Field int Fragment.mIndex>
	//* 199  445:aload           6
	//* 200  447:invokevirtual   #1358 <Method void SparseArray.put(int, Object)>
	//* 201  450:aload           8
	//* 202  452:aconst_null     
	//* 203  453:putfield        #1746 <Field Fragment FragmentState.mInstance>
	//* 204  456:iload_3         
	//* 205  457:iconst_1        
	//* 206  458:iadd            
	//* 207  459:istore_3        
	//* 208  460:goto            322
	//* 209  463:aload_2         
	//* 210  464:ifnull          589
	//* 211  467:aload_2         
	//* 212  468:invokevirtual   #753 <Method List FragmentManagerNonConfig.getFragments()>
	//* 213  471:astore_1        
	//* 214  472:aload_1         
	//* 215  473:ifnull          584
	//* 216  476:aload_1         
	//* 217  477:invokeinterface #676 <Method int List.size()>
	//* 218  482:istore_3        
	//* 219  483:iconst_0        
	//* 220  484:istore          4
	//* 221  486:iload           4
	//* 222  488:iload_3         
	//* 223  489:icmpge          589
	//* 224  492:aload_1         
	//* 225  493:iload           4
	//* 226  495:invokeinterface #677 <Method Object List.get(int)>
	//* 227  500:checkcast       #208 <Class Fragment>
	//* 228  503:astore_2        
	//* 229  504:aload_2         
	//* 230  505:getfield        #1756 <Field int Fragment.mTargetIndex>
	//* 231  508:iflt            575
	//* 232  511:aload_2         
	//* 233  512:aload_0         
	//* 234  513:getfield        #313 <Field SparseArray mActive>
	//* 235  516:aload_2         
	//* 236  517:getfield        #1756 <Field int Fragment.mTargetIndex>
	//* 237  520:invokevirtual   #1270 <Method Object SparseArray.get(int)>
	//* 238  523:checkcast       #208 <Class Fragment>
	//* 239  526:putfield        #1437 <Field Fragment Fragment.mTarget>
	//* 240  529:aload_2         
	//* 241  530:getfield        #1437 <Field Fragment Fragment.mTarget>
	//* 242  533:ifnonnull       575
	//* 243  536:ldc1            #67  <String "FragmentManager">
	//* 244  538:new             #340 <Class StringBuilder>
	//* 245  541:dup             
	//* 246  542:invokespecial   #341 <Method void StringBuilder()>
	//* 247  545:ldc2            #1758 <String "Re-attaching retained fragment ">
	//* 248  548:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 249  551:aload_2         
	//* 250  552:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 251  555:ldc2            #1760 <String " target no longer exists: ">
	//* 252  558:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 253  561:aload_2         
	//* 254  562:getfield        #1756 <Field int Fragment.mTargetIndex>
	//* 255  565:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//* 256  568:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 257  571:invokestatic    #1415 <Method int Log.w(String, String)>
	//* 258  574:pop             
	//* 259  575:iload           4
	//* 260  577:iconst_1        
	//* 261  578:iadd            
	//* 262  579:istore          4
	//* 263  581:goto            486
	//* 264  584:iconst_0        
	//* 265  585:istore_3        
	//* 266  586:goto            483
	//* 267  589:aload_0         
	//* 268  590:getfield        #164 <Field ArrayList mAdded>
	//* 269  593:invokevirtual   #359 <Method void ArrayList.clear()>
	//* 270  596:aload           7
	//* 271  598:getfield        #1762 <Field int[] FragmentManagerState.mAdded>
	//* 272  601:ifnull          774
	//* 273  604:iconst_0        
	//* 274  605:istore_3        
	//* 275  606:iload_3         
	//* 276  607:aload           7
	//* 277  609:getfield        #1762 <Field int[] FragmentManagerState.mAdded>
	//* 278  612:arraylength     
	//* 279  613:icmpge          774
	//* 280  616:aload_0         
	//* 281  617:getfield        #313 <Field SparseArray mActive>
	//* 282  620:aload           7
	//* 283  622:getfield        #1762 <Field int[] FragmentManagerState.mAdded>
	//* 284  625:iload_3         
	//* 285  626:iaload          
	//* 286  627:invokevirtual   #1270 <Method Object SparseArray.get(int)>
	//* 287  630:checkcast       #208 <Class Fragment>
	//* 288  633:astore_2        
	//* 289  634:aload_2         
	//* 290  635:ifnonnull       675
	//* 291  638:aload_0         
	//* 292  639:new             #331 <Class IllegalStateException>
	//* 293  642:dup             
	//* 294  643:new             #340 <Class StringBuilder>
	//* 295  646:dup             
	//* 296  647:invokespecial   #341 <Method void StringBuilder()>
	//* 297  650:ldc2            #1764 <String "No instantiated fragment for index #">
	//* 298  653:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 299  656:aload           7
	//* 300  658:getfield        #1762 <Field int[] FragmentManagerState.mAdded>
	//* 301  661:iload_3         
	//* 302  662:iaload          
	//* 303  663:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//* 304  666:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 305  669:invokespecial   #336 <Method void IllegalStateException(String)>
	//* 306  672:invokespecial   #1276 <Method void throwException(RuntimeException)>
	//* 307  675:aload_2         
	//* 308  676:iconst_1        
	//* 309  677:putfield        #640 <Field boolean Fragment.mAdded>
	//* 310  680:getstatic       #133 <Field boolean DEBUG>
	//* 311  683:ifeq            722
	//* 312  686:ldc1            #67  <String "FragmentManager">
	//* 313  688:new             #340 <Class StringBuilder>
	//* 314  691:dup             
	//* 315  692:invokespecial   #341 <Method void StringBuilder()>
	//* 316  695:ldc2            #1766 <String "restoreAllState: added #">
	//* 317  698:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 318  701:iload_3         
	//* 319  702:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//* 320  705:ldc2            #1148 <String ": ">
	//* 321  708:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 322  711:aload_2         
	//* 323  712:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 324  715:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 325  718:invokestatic    #839 <Method int Log.v(String, String)>
	//* 326  721:pop             
	//* 327  722:aload_0         
	//* 328  723:getfield        #164 <Field ArrayList mAdded>
	//* 329  726:aload_2         
	//* 330  727:invokevirtual   #849 <Method boolean ArrayList.contains(Object)>
	//* 331  730:ifeq            744
	//* 332  733:new             #331 <Class IllegalStateException>
	//* 333  736:dup             
	//* 334  737:ldc2            #1768 <String "Already added!">
	//* 335  740:invokespecial   #336 <Method void IllegalStateException(String)>
	//* 336  743:athrow          
	//* 337  744:aload_0         
	//* 338  745:getfield        #164 <Field ArrayList mAdded>
	//* 339  748:astore_1        
	//* 340  749:aload_1         
	//* 341  750:monitorenter    
	//* 342  751:aload_0         
	//* 343  752:getfield        #164 <Field ArrayList mAdded>
	//* 344  755:aload_2         
	//* 345  756:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//* 346  759:pop             
	//* 347  760:aload_1         
	//* 348  761:monitorexit     
	//* 349  762:iload_3         
	//* 350  763:iconst_1        
	//* 351  764:iadd            
	//* 352  765:istore_3        
	//* 353  766:goto            606
	//* 354  769:astore_2        
	//* 355  770:aload_1         
	//* 356  771:monitorexit     
	//* 357  772:aload_2         
	//* 358  773:athrow          
	//* 359  774:aload           7
	//* 360  776:getfield        #1771 <Field BackStackState[] FragmentManagerState.mBackStack>
	//* 361  779:ifnull          940
	//* 362  782:aload_0         
	//* 363  783:new             #161 <Class ArrayList>
	//* 364  786:dup             
	//* 365  787:aload           7
	//* 366  789:getfield        #1771 <Field BackStackState[] FragmentManagerState.mBackStack>
	//* 367  792:arraylength     
	//* 368  793:invokespecial   #369 <Method void ArrayList(int)>
	//* 369  796:putfield        #829 <Field ArrayList mBackStack>
	//* 370  799:iconst_0        
	//* 371  800:istore_3        
	//* 372  801:iload_3         
	//* 373  802:aload           7
	//* 374  804:getfield        #1771 <Field BackStackState[] FragmentManagerState.mBackStack>
	//* 375  807:arraylength     
	//* 376  808:icmpge          945
	//* 377  811:aload           7
	//* 378  813:getfield        #1771 <Field BackStackState[] FragmentManagerState.mBackStack>
	//* 379  816:iload_3         
	//* 380  817:aaload          
	//* 381  818:aload_0         
	//* 382  819:invokevirtual   #1776 <Method BackStackRecord BackStackState.instantiate(FragmentManagerImpl)>
	//* 383  822:astore_1        
	//* 384  823:getstatic       #133 <Field boolean DEBUG>
	//* 385  826:ifeq            908
	//* 386  829:ldc1            #67  <String "FragmentManager">
	//* 387  831:new             #340 <Class StringBuilder>
	//* 388  834:dup             
	//* 389  835:invokespecial   #341 <Method void StringBuilder()>
	//* 390  838:ldc2            #1778 <String "restoreAllState: back stack #">
	//* 391  841:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 392  844:iload_3         
	//* 393  845:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//* 394  848:ldc2            #1780 <String " (index ">
	//* 395  851:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 396  854:aload_1         
	//* 397  855:getfield        #510 <Field int BackStackRecord.mIndex>
	//* 398  858:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//* 399  861:ldc2            #1782 <String "): ">
	//* 400  864:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 401  867:aload_1         
	//* 402  868:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 403  871:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 404  874:invokestatic    #839 <Method int Log.v(String, String)>
	//* 405  877:pop             
	//* 406  878:new             #806 <Class PrintWriter>
	//* 407  881:dup             
	//* 408  882:new             #808 <Class LogWriter>
	//* 409  885:dup             
	//* 410  886:ldc1            #67  <String "FragmentManager">
	//* 411  888:invokespecial   #809 <Method void LogWriter(String)>
	//* 412  891:invokespecial   #812 <Method void PrintWriter(java.io.Writer)>
	//* 413  894:astore_2        
	//* 414  895:aload_1         
	//* 415  896:ldc2            #814 <String "  ">
	//* 416  899:aload_2         
	//* 417  900:iconst_0        
	//* 418  901:invokevirtual   #1785 <Method void BackStackRecord.dump(String, PrintWriter, boolean)>
	//* 419  904:aload_2         
	//* 420  905:invokevirtual   #1788 <Method void PrintWriter.close()>
	//* 421  908:aload_0         
	//* 422  909:getfield        #829 <Field ArrayList mBackStack>
	//* 423  912:aload_1         
	//* 424  913:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//* 425  916:pop             
	//* 426  917:aload_1         
	//* 427  918:getfield        #510 <Field int BackStackRecord.mIndex>
	//* 428  921:iflt            933
	//* 429  924:aload_0         
	//* 430  925:aload_1         
	//* 431  926:getfield        #510 <Field int BackStackRecord.mIndex>
	//* 432  929:aload_1         
	//* 433  930:invokevirtual   #1792 <Method void setBackStackIndex(int, BackStackRecord)>
	//* 434  933:iload_3         
	//* 435  934:iconst_1        
	//* 436  935:iadd            
	//* 437  936:istore_3        
	//* 438  937:goto            801
	//* 439  940:aload_0         
	//* 440  941:aconst_null     
	//* 441  942:putfield        #829 <Field ArrayList mBackStack>
	//* 442  945:aload           7
	//* 443  947:getfield        #1795 <Field int FragmentManagerState.mPrimaryNavActiveIndex>
	//* 444  950:iflt            972
	//* 445  953:aload_0         
	//* 446  954:aload_0         
	//* 447  955:getfield        #313 <Field SparseArray mActive>
	//* 448  958:aload           7
	//* 449  960:getfield        #1795 <Field int FragmentManagerState.mPrimaryNavActiveIndex>
	//* 450  963:invokevirtual   #1270 <Method Object SparseArray.get(int)>
	//* 451  966:checkcast       #208 <Class Fragment>
	//* 452  969:putfield        #690 <Field Fragment mPrimaryNav>
	//* 453  972:aload_0         
	//* 454  973:aload           7
	//* 455  975:getfield        #1796 <Field int FragmentManagerState.mNextFragmentIndex>
	//* 456  978:putfield        #159 <Field int mNextFragmentIndex>
	//* 457  981:return          
	//* 458  982:aconst_null     
	//* 459  983:astore          6
	//* 460  985:goto            372
		{
			parcelable = null;
	//  461  988:aconst_null     
	//  462  989:astore_1        
		}
		mActive = new SparseArray(fragmentmanagerstate.mActive.length);
		j = 0;
		while(j < fragmentmanagerstate.mActive.length) 
		{
			FragmentState fragmentstate = fragmentmanagerstate.mActive[j];
			if(fragmentstate == null)
				continue;
			int l;
			Object obj;
			if(parcelable != null && j < ((List) (parcelable)).size())
				obj = ((Object) ((FragmentManagerNonConfig)((List) (parcelable)).get(j)));
			else
				obj = null;
			obj = ((Object) (fragmentstate.instantiate(mHost, mContainer, mParent, ((FragmentManagerNonConfig) (obj)))));
			if(DEBUG)
				Log.v("FragmentManager", (new StringBuilder()).append("restoreAllState: active #").append(j).append(": ").append(obj).toString());
			mActive.put(((Fragment) (obj)).mIndex, obj);
			fragmentstate.mInstance = null;
			j++;
		}
		if(fragmentmanagernonconfig != null)
		{
			parcelable = ((Parcelable) (fragmentmanagernonconfig.getFragments()));
			if(parcelable != null)
				j = ((List) (parcelable)).size();
			else
				j = 0;
			for(l = 0; l < j; l++)
			{
				fragmentmanagernonconfig = ((FragmentManagerNonConfig) ((Fragment)((List) (parcelable)).get(l)));
				if(((Fragment) (fragmentmanagernonconfig)).mTargetIndex < 0)
					continue;
				fragmentmanagernonconfig.mTarget = (Fragment)mActive.get(((Fragment) (fragmentmanagernonconfig)).mTargetIndex);
				if(((Fragment) (fragmentmanagernonconfig)).mTarget == null)
					Log.w("FragmentManager", (new StringBuilder()).append("Re-attaching retained fragment ").append(((Object) (fragmentmanagernonconfig))).append(" target no longer exists: ").append(((Fragment) (fragmentmanagernonconfig)).mTargetIndex).toString());
			}

		}
		mAdded.clear();
		if(fragmentmanagerstate.mAdded != null)
			for(j = 0; j < fragmentmanagerstate.mAdded.length; j++)
			{
				fragmentmanagernonconfig = ((FragmentManagerNonConfig) ((Fragment)mActive.get(fragmentmanagerstate.mAdded[j])));
				if(fragmentmanagernonconfig == null)
					throwException(((RuntimeException) (new IllegalStateException((new StringBuilder()).append("No instantiated fragment for index #").append(fragmentmanagerstate.mAdded[j]).toString()))));
				fragmentmanagernonconfig.mAdded = true;
				if(DEBUG)
					Log.v("FragmentManager", (new StringBuilder()).append("restoreAllState: added #").append(j).append(": ").append(((Object) (fragmentmanagernonconfig))).toString());
				if(mAdded.contains(((Object) (fragmentmanagernonconfig))))
					throw new IllegalStateException("Already added!");
				synchronized(mAdded)
				{
					mAdded.add(((Object) (fragmentmanagernonconfig)));
				}
			}

		break MISSING_BLOCK_LABEL_774;
	//  463  990:goto            303
		fragmentmanagernonconfig;
		parcelable;
		JVM INSTR monitorexit ;
		throw fragmentmanagernonconfig;
		if(fragmentmanagerstate.mBackStack != null)
		{
			mBackStack = new ArrayList(fragmentmanagerstate.mBackStack.length);
			for(j = 0; j < fragmentmanagerstate.mBackStack.length; j++)
			{
				parcelable = ((Parcelable) (fragmentmanagerstate.mBackStack[j].instantiate(this)));
				if(DEBUG)
				{
					Log.v("FragmentManager", (new StringBuilder()).append("restoreAllState: back stack #").append(j).append(" (index ").append(((BackStackRecord) (parcelable)).mIndex).append("): ").append(((Object) (parcelable))).toString());
					fragmentmanagernonconfig = ((FragmentManagerNonConfig) (new PrintWriter(((java.io.Writer) (new LogWriter("FragmentManager"))))));
					((BackStackRecord) (parcelable)).dump("  ", ((PrintWriter) (fragmentmanagernonconfig)), false);
					((PrintWriter) (fragmentmanagernonconfig)).close();
				}
				mBackStack.add(((Object) (parcelable)));
				if(((BackStackRecord) (parcelable)).mIndex >= 0)
					setBackStackIndex(((BackStackRecord) (parcelable)).mIndex, ((BackStackRecord) (parcelable)));
			}

		} else
		{
			mBackStack = null;
		}
		if(fragmentmanagerstate.mPrimaryNavActiveIndex >= 0)
			mPrimaryNav = (Fragment)mActive.get(fragmentmanagerstate.mPrimaryNavActiveIndex);
		mNextFragmentIndex = fragmentmanagerstate.mNextFragmentIndex;
		return;
	}

	FragmentManagerNonConfig retainNonConfig()
	{
		setRetaining(mSavedNonConfig);
	//    0    0:aload_0         
	//    1    1:getfield        #1596 <Field FragmentManagerNonConfig mSavedNonConfig>
	//    2    4:invokestatic    #774 <Method void setRetaining(FragmentManagerNonConfig)>
		return mSavedNonConfig;
	//    3    7:aload_0         
	//    4    8:getfield        #1596 <Field FragmentManagerNonConfig mSavedNonConfig>
	//    5   11:areturn         
	}

	Parcelable saveAllState()
	{
		FragmentManagerState fragmentmanagerstate = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		forcePostponedTransactions();
	//    2    3:aload_0         
	//    3    4:invokespecial   #1235 <Method void forcePostponedTransactions()>
		endAnimatingAwayFragments();
	//    4    7:aload_0         
	//    5    8:invokespecial   #1802 <Method void endAnimatingAwayFragments()>
		execPendingActions();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #408 <Method boolean execPendingActions()>
	//    8   15:pop             
		mStateSaved = true;
	//    9   16:aload_0         
	//   10   17:iconst_1        
	//   11   18:putfield        #329 <Field boolean mStateSaved>
		mSavedNonConfig = null;
	//   12   21:aload_0         
	//   13   22:aconst_null     
	//   14   23:putfield        #1596 <Field FragmentManagerNonConfig mSavedNonConfig>
		if(mActive != null && mActive.size() > 0)
	//*  15   26:aload_0         
	//*  16   27:getfield        #313 <Field SparseArray mActive>
	//*  17   30:ifnull          43
	//*  18   33:aload_0         
	//*  19   34:getfield        #313 <Field SparseArray mActive>
	//*  20   37:invokevirtual   #316 <Method int SparseArray.size()>
	//*  21   40:ifgt            45
	//*  22   43:aconst_null     
	//*  23   44:areturn         
		{
			int j1 = mActive.size();
	//   24   45:aload_0         
	//   25   46:getfield        #313 <Field SparseArray mActive>
	//   26   49:invokevirtual   #316 <Method int SparseArray.size()>
	//   27   52:istore_3        
			FragmentState afragmentstate[] = new FragmentState[j1];
	//   28   53:iload_3         
	//   29   54:anewarray       FragmentState[]
	//   30   57:astore          7
			int k = 0;
	//   31   59:iconst_0        
	//   32   60:istore_2        
			boolean flag = false;
	//   33   61:iconst_0        
	//   34   62:istore_1        
			while(k < j1) 
	//*  35   63:iload_2         
	//*  36   64:iload_3         
	//*  37   65:icmpge          377
			{
				Fragment fragment = (Fragment)mActive.valueAt(k);
	//   38   68:aload_0         
	//   39   69:getfield        #313 <Field SparseArray mActive>
	//   40   72:iload_2         
	//   41   73:invokevirtual   #319 <Method Object SparseArray.valueAt(int)>
	//   42   76:checkcast       #208 <Class Fragment>
	//   43   79:astore          4
				if(fragment == null)
					continue;
	//   44   81:aload           4
	//   45   83:ifnull          748
				if(fragment.mIndex < 0)
	//*  46   86:aload           4
	//*  47   88:getfield        #1350 <Field int Fragment.mIndex>
	//*  48   91:ifge            140
					throwException(((RuntimeException) (new IllegalStateException((new StringBuilder()).append("Failure saving state: active ").append(((Object) (fragment))).append(" has cleared index: ").append(fragment.mIndex).toString()))));
	//   49   94:aload_0         
	//   50   95:new             #331 <Class IllegalStateException>
	//   51   98:dup             
	//   52   99:new             #340 <Class StringBuilder>
	//   53  102:dup             
	//   54  103:invokespecial   #341 <Method void StringBuilder()>
	//   55  106:ldc2            #1804 <String "Failure saving state: active ">
	//   56  109:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   57  112:aload           4
	//   58  114:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   59  117:ldc2            #1806 <String " has cleared index: ">
	//   60  120:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   61  123:aload           4
	//   62  125:getfield        #1350 <Field int Fragment.mIndex>
	//   63  128:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//   64  131:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   65  134:invokespecial   #336 <Method void IllegalStateException(String)>
	//   66  137:invokespecial   #1276 <Method void throwException(RuntimeException)>
				FragmentState fragmentstate = new FragmentState(fragment);
	//   67  140:new             #1740 <Class FragmentState>
	//   68  143:dup             
	//   69  144:aload           4
	//   70  146:invokespecial   #1808 <Method void FragmentState(Fragment)>
	//   71  149:astore          5
				afragmentstate[k] = fragmentstate;
	//   72  151:aload           7
	//   73  153:iload_2         
	//   74  154:aload           5
	//   75  156:aastore         
				if(fragment.mState > 0 && fragmentstate.mSavedFragmentState == null)
	//*  76  157:aload           4
	//*  77  159:getfield        #211 <Field int Fragment.mState>
	//*  78  162:ifle            364
	//*  79  165:aload           5
	//*  80  167:getfield        #1747 <Field Bundle FragmentState.mSavedFragmentState>
	//*  81  170:ifnonnull       364
				{
					fragmentstate.mSavedFragmentState = saveFragmentBasicState(fragment);
	//   82  173:aload           5
	//   83  175:aload_0         
	//   84  176:aload           4
	//   85  178:invokevirtual   #1812 <Method Bundle saveFragmentBasicState(Fragment)>
	//   86  181:putfield        #1747 <Field Bundle FragmentState.mSavedFragmentState>
					if(fragment.mTarget != null)
	//*  87  184:aload           4
	//*  88  186:getfield        #1437 <Field Fragment Fragment.mTarget>
	//*  89  189:ifnull          308
					{
						if(fragment.mTarget.mIndex < 0)
	//*  90  192:aload           4
	//*  91  194:getfield        #1437 <Field Fragment Fragment.mTarget>
	//*  92  197:getfield        #1350 <Field int Fragment.mIndex>
	//*  93  200:ifge            249
							throwException(((RuntimeException) (new IllegalStateException((new StringBuilder()).append("Failure saving state: ").append(((Object) (fragment))).append(" has target not in fragment manager: ").append(((Object) (fragment.mTarget))).toString()))));
	//   94  203:aload_0         
	//   95  204:new             #331 <Class IllegalStateException>
	//   96  207:dup             
	//   97  208:new             #340 <Class StringBuilder>
	//   98  211:dup             
	//   99  212:invokespecial   #341 <Method void StringBuilder()>
	//  100  215:ldc2            #1814 <String "Failure saving state: ">
	//  101  218:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  102  221:aload           4
	//  103  223:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  104  226:ldc2            #1816 <String " has target not in fragment manager: ">
	//  105  229:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  106  232:aload           4
	//  107  234:getfield        #1437 <Field Fragment Fragment.mTarget>
	//  108  237:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  109  240:invokevirtual   #351 <Method String StringBuilder.toString()>
	//  110  243:invokespecial   #336 <Method void IllegalStateException(String)>
	//  111  246:invokespecial   #1276 <Method void throwException(RuntimeException)>
						if(fragmentstate.mSavedFragmentState == null)
	//* 112  249:aload           5
	//* 113  251:getfield        #1747 <Field Bundle FragmentState.mSavedFragmentState>
	//* 114  254:ifnonnull       269
							fragmentstate.mSavedFragmentState = new Bundle();
	//  115  257:aload           5
	//  116  259:new             #1265 <Class Bundle>
	//  117  262:dup             
	//  118  263:invokespecial   #1817 <Method void Bundle()>
	//  119  266:putfield        #1747 <Field Bundle FragmentState.mSavedFragmentState>
						putFragment(fragmentstate.mSavedFragmentState, "android:target_state", fragment.mTarget);
	//  120  269:aload_0         
	//  121  270:aload           5
	//  122  272:getfield        #1747 <Field Bundle FragmentState.mSavedFragmentState>
	//  123  275:ldc1            #73  <String "android:target_state">
	//  124  277:aload           4
	//  125  279:getfield        #1437 <Field Fragment Fragment.mTarget>
	//  126  282:invokevirtual   #1819 <Method void putFragment(Bundle, String, Fragment)>
						if(fragment.mTargetRequestCode != 0)
	//* 127  285:aload           4
	//* 128  287:getfield        #1440 <Field int Fragment.mTargetRequestCode>
	//* 129  290:ifeq            308
							fragmentstate.mSavedFragmentState.putInt("android:target_req_state", fragment.mTargetRequestCode);
	//  130  293:aload           5
	//  131  295:getfield        #1747 <Field Bundle FragmentState.mSavedFragmentState>
	//  132  298:ldc1            #70  <String "android:target_req_state">
	//  133  300:aload           4
	//  134  302:getfield        #1440 <Field int Fragment.mTargetRequestCode>
	//  135  305:invokevirtual   #1709 <Method void Bundle.putInt(String, int)>
					}
				} else
	//* 136  308:getstatic       #133 <Field boolean DEBUG>
	//* 137  311:ifeq            355
	//* 138  314:ldc1            #67  <String "FragmentManager">
	//* 139  316:new             #340 <Class StringBuilder>
	//* 140  319:dup             
	//* 141  320:invokespecial   #341 <Method void StringBuilder()>
	//* 142  323:ldc2            #1821 <String "Saved state of ">
	//* 143  326:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 144  329:aload           4
	//* 145  331:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 146  334:ldc2            #1148 <String ": ">
	//* 147  337:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 148  340:aload           5
	//* 149  342:getfield        #1747 <Field Bundle FragmentState.mSavedFragmentState>
	//* 150  345:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 151  348:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 152  351:invokestatic    #839 <Method int Log.v(String, String)>
	//* 153  354:pop             
	//* 154  355:iconst_1        
	//* 155  356:istore_1        
	//* 156  357:iload_2         
	//* 157  358:iconst_1        
	//* 158  359:iadd            
	//* 159  360:istore_2        
	//* 160  361:goto            63
				{
					fragmentstate.mSavedFragmentState = fragment.mSavedFragmentState;
	//  161  364:aload           5
	//  162  366:aload           4
	//  163  368:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//  164  371:putfield        #1747 <Field Bundle FragmentState.mSavedFragmentState>
				}
				if(DEBUG)
					Log.v("FragmentManager", (new StringBuilder()).append("Saved state of ").append(((Object) (fragment))).append(": ").append(((Object) (fragmentstate.mSavedFragmentState))).toString());
				flag = true;
				k++;
			}
	//* 165  374:goto            308
			if(!flag)
	//* 166  377:iload_1         
	//* 167  378:ifne            398
			{
				if(DEBUG)
	//* 168  381:getstatic       #133 <Field boolean DEBUG>
	//* 169  384:ifeq            43
				{
					Log.v("FragmentManager", "saveAllState: no fragments!");
	//  170  387:ldc1            #67  <String "FragmentManager">
	//  171  389:ldc2            #1823 <String "saveAllState: no fragments!">
	//  172  392:invokestatic    #839 <Method int Log.v(String, String)>
	//  173  395:pop             
					return null;
	//  174  396:aconst_null     
	//  175  397:areturn         
				}
			} else
			{
				int l = mAdded.size();
	//  176  398:aload_0         
	//  177  399:getfield        #164 <Field ArrayList mAdded>
	//  178  402:invokevirtual   #202 <Method int ArrayList.size()>
	//  179  405:istore_2        
				int ai[];
				if(l > 0)
	//* 180  406:iload_2         
	//* 181  407:ifle            558
				{
					int ai1[] = new int[l];
	//  182  410:iload_2         
	//  183  411:newarray        int[]
	//  184  413:astore          5
					int i = 0;
	//  185  415:iconst_0        
	//  186  416:istore_1        
					do
					{
						ai = ai1;
	//  187  417:aload           5
	//  188  419:astore          4
						if(i >= l)
							break;
	//  189  421:iload_1         
	//  190  422:iload_2         
	//  191  423:icmpge          561
						ai1[i] = ((Fragment)mAdded.get(i)).mIndex;
	//  192  426:aload           5
	//  193  428:iload_1         
	//  194  429:aload_0         
	//  195  430:getfield        #164 <Field ArrayList mAdded>
	//  196  433:iload_1         
	//  197  434:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//  198  437:checkcast       #208 <Class Fragment>
	//  199  440:getfield        #1350 <Field int Fragment.mIndex>
	//  200  443:iastore         
						if(ai1[i] < 0)
	//* 201  444:aload           5
	//* 202  446:iload_1         
	//* 203  447:iaload          
	//* 204  448:ifge            502
							throwException(((RuntimeException) (new IllegalStateException((new StringBuilder()).append("Failure saving state: active ").append(mAdded.get(i)).append(" has cleared index: ").append(ai1[i]).toString()))));
	//  205  451:aload_0         
	//  206  452:new             #331 <Class IllegalStateException>
	//  207  455:dup             
	//  208  456:new             #340 <Class StringBuilder>
	//  209  459:dup             
	//  210  460:invokespecial   #341 <Method void StringBuilder()>
	//  211  463:ldc2            #1804 <String "Failure saving state: active ">
	//  212  466:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  213  469:aload_0         
	//  214  470:getfield        #164 <Field ArrayList mAdded>
	//  215  473:iload_1         
	//  216  474:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//  217  477:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  218  480:ldc2            #1806 <String " has cleared index: ">
	//  219  483:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  220  486:aload           5
	//  221  488:iload_1         
	//  222  489:iaload          
	//  223  490:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//  224  493:invokevirtual   #351 <Method String StringBuilder.toString()>
	//  225  496:invokespecial   #336 <Method void IllegalStateException(String)>
	//  226  499:invokespecial   #1276 <Method void throwException(RuntimeException)>
						if(DEBUG)
	//* 227  502:getstatic       #133 <Field boolean DEBUG>
	//* 228  505:ifeq            551
							Log.v("FragmentManager", (new StringBuilder()).append("saveAllState: adding fragment #").append(i).append(": ").append(mAdded.get(i)).toString());
	//  229  508:ldc1            #67  <String "FragmentManager">
	//  230  510:new             #340 <Class StringBuilder>
	//  231  513:dup             
	//  232  514:invokespecial   #341 <Method void StringBuilder()>
	//  233  517:ldc2            #1825 <String "saveAllState: adding fragment #">
	//  234  520:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  235  523:iload_1         
	//  236  524:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//  237  527:ldc2            #1148 <String ": ">
	//  238  530:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  239  533:aload_0         
	//  240  534:getfield        #164 <Field ArrayList mAdded>
	//  241  537:iload_1         
	//  242  538:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//  243  541:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  244  544:invokevirtual   #351 <Method String StringBuilder.toString()>
	//  245  547:invokestatic    #839 <Method int Log.v(String, String)>
	//  246  550:pop             
						i++;
	//  247  551:iload_1         
	//  248  552:iconst_1        
	//  249  553:iadd            
	//  250  554:istore_1        
					} while(true);
	//  251  555:goto            417
				} else
				{
					ai = null;
	//  252  558:aconst_null     
	//  253  559:astore          4
				}
				BackStackState abackstackstate[] = ((BackStackState []) (fragmentmanagerstate));
	//  254  561:aload           6
	//  255  563:astore          5
				if(mBackStack != null)
	//* 256  565:aload_0         
	//* 257  566:getfield        #829 <Field ArrayList mBackStack>
	//* 258  569:ifnull          683
				{
					int i1 = mBackStack.size();
	//  259  572:aload_0         
	//  260  573:getfield        #829 <Field ArrayList mBackStack>
	//  261  576:invokevirtual   #202 <Method int ArrayList.size()>
	//  262  579:istore_2        
					abackstackstate = ((BackStackState []) (fragmentmanagerstate));
	//  263  580:aload           6
	//  264  582:astore          5
					if(i1 > 0)
	//* 265  584:iload_2         
	//* 266  585:ifle            683
					{
						BackStackState abackstackstate1[] = new BackStackState[i1];
	//  267  588:iload_2         
	//  268  589:anewarray       BackStackState[]
	//  269  592:astore          6
						int j = 0;
	//  270  594:iconst_0        
	//  271  595:istore_1        
						do
						{
							abackstackstate = abackstackstate1;
	//  272  596:aload           6
	//  273  598:astore          5
							if(j >= i1)
								break;
	//  274  600:iload_1         
	//  275  601:iload_2         
	//  276  602:icmpge          683
							abackstackstate1[j] = new BackStackState((BackStackRecord)mBackStack.get(j));
	//  277  605:aload           6
	//  278  607:iload_1         
	//  279  608:new             #1773 <Class BackStackState>
	//  280  611:dup             
	//  281  612:aload_0         
	//  282  613:getfield        #829 <Field ArrayList mBackStack>
	//  283  616:iload_1         
	//  284  617:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//  285  620:checkcast       #363 <Class BackStackRecord>
	//  286  623:invokespecial   #1827 <Method void BackStackState(BackStackRecord)>
	//  287  626:aastore         
							if(DEBUG)
	//* 288  627:getstatic       #133 <Field boolean DEBUG>
	//* 289  630:ifeq            676
								Log.v("FragmentManager", (new StringBuilder()).append("saveAllState: adding back stack #").append(j).append(": ").append(mBackStack.get(j)).toString());
	//  290  633:ldc1            #67  <String "FragmentManager">
	//  291  635:new             #340 <Class StringBuilder>
	//  292  638:dup             
	//  293  639:invokespecial   #341 <Method void StringBuilder()>
	//  294  642:ldc2            #1829 <String "saveAllState: adding back stack #">
	//  295  645:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  296  648:iload_1         
	//  297  649:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//  298  652:ldc2            #1148 <String ": ">
	//  299  655:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  300  658:aload_0         
	//  301  659:getfield        #829 <Field ArrayList mBackStack>
	//  302  662:iload_1         
	//  303  663:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//  304  666:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  305  669:invokevirtual   #351 <Method String StringBuilder.toString()>
	//  306  672:invokestatic    #839 <Method int Log.v(String, String)>
	//  307  675:pop             
							j++;
	//  308  676:iload_1         
	//  309  677:iconst_1        
	//  310  678:iadd            
	//  311  679:istore_1        
						} while(true);
	//  312  680:goto            596
					}
				}
				abackstackstate1 = ((BackStackState []) (new FragmentManagerState()));
	//  313  683:new             #1733 <Class FragmentManagerState>
	//  314  686:dup             
	//  315  687:invokespecial   #1830 <Method void FragmentManagerState()>
	//  316  690:astore          6
				abackstackstate1.mActive = afragmentstate;
	//  317  692:aload           6
	//  318  694:aload           7
	//  319  696:putfield        #1736 <Field FragmentState[] FragmentManagerState.mActive>
				abackstackstate1.mAdded = ai;
	//  320  699:aload           6
	//  321  701:aload           4
	//  322  703:putfield        #1762 <Field int[] FragmentManagerState.mAdded>
				abackstackstate1.mBackStack = abackstackstate;
	//  323  706:aload           6
	//  324  708:aload           5
	//  325  710:putfield        #1771 <Field BackStackState[] FragmentManagerState.mBackStack>
				if(mPrimaryNav != null)
	//* 326  713:aload_0         
	//* 327  714:getfield        #690 <Field Fragment mPrimaryNav>
	//* 328  717:ifnull          732
					abackstackstate1.mPrimaryNavActiveIndex = mPrimaryNav.mIndex;
	//  329  720:aload           6
	//  330  722:aload_0         
	//  331  723:getfield        #690 <Field Fragment mPrimaryNav>
	//  332  726:getfield        #1350 <Field int Fragment.mIndex>
	//  333  729:putfield        #1795 <Field int FragmentManagerState.mPrimaryNavActiveIndex>
				abackstackstate1.mNextFragmentIndex = mNextFragmentIndex;
	//  334  732:aload           6
	//  335  734:aload_0         
	//  336  735:getfield        #159 <Field int mNextFragmentIndex>
	//  337  738:putfield        #1796 <Field int FragmentManagerState.mNextFragmentIndex>
				saveNonConfig();
	//  338  741:aload_0         
	//  339  742:invokevirtual   #1833 <Method void saveNonConfig()>
				return ((Parcelable) (abackstackstate1));
	//  340  745:aload           6
	//  341  747:areturn         
			}
		}
		return null;
	//* 342  748:goto            357
	}

	Bundle saveFragmentBasicState(Fragment fragment)
	{
		if(mStateBundle == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #173 <Field Bundle mStateBundle>
	//*   2    4:ifnonnull       18
			mStateBundle = new Bundle();
	//    3    7:aload_0         
	//    4    8:new             #1265 <Class Bundle>
	//    5   11:dup             
	//    6   12:invokespecial   #1817 <Method void Bundle()>
	//    7   15:putfield        #173 <Field Bundle mStateBundle>
		fragment.performSaveInstanceState(mStateBundle);
	//    8   18:aload_1         
	//    9   19:aload_0         
	//   10   20:getfield        #173 <Field Bundle mStateBundle>
	//   11   23:invokevirtual   #1836 <Method void Fragment.performSaveInstanceState(Bundle)>
		dispatchOnFragmentSaveInstanceState(fragment, mStateBundle, false);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #173 <Field Bundle mStateBundle>
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #1055 <Method void dispatchOnFragmentSaveInstanceState(Fragment, Bundle, boolean)>
		Bundle bundle;
		Bundle bundle1;
		if(!mStateBundle.isEmpty())
	//*  18   36:aload_0         
	//*  19   37:getfield        #173 <Field Bundle mStateBundle>
	//*  20   40:invokevirtual   #1837 <Method boolean Bundle.isEmpty()>
	//*  21   43:ifne            136
		{
			bundle1 = mStateBundle;
	//   22   46:aload_0         
	//   23   47:getfield        #173 <Field Bundle mStateBundle>
	//   24   50:astore_3        
			mStateBundle = null;
	//   25   51:aload_0         
	//   26   52:aconst_null     
	//   27   53:putfield        #173 <Field Bundle mStateBundle>
		} else
	//*  28   56:aload_1         
	//*  29   57:getfield        #225 <Field View Fragment.mView>
	//*  30   60:ifnull          68
	//*  31   63:aload_0         
	//*  32   64:aload_1         
	//*  33   65:invokevirtual   #1571 <Method void saveFragmentViewState(Fragment)>
	//*  34   68:aload_3         
	//*  35   69:astore_2        
	//*  36   70:aload_1         
	//*  37   71:getfield        #1432 <Field SparseArray Fragment.mSavedViewState>
	//*  38   74:ifnull          101
	//*  39   77:aload_3         
	//*  40   78:astore_2        
	//*  41   79:aload_3         
	//*  42   80:ifnonnull       91
	//*  43   83:new             #1265 <Class Bundle>
	//*  44   86:dup             
	//*  45   87:invokespecial   #1817 <Method void Bundle()>
	//*  46   90:astore_2        
	//*  47   91:aload_2         
	//*  48   92:ldc1            #79  <String "android:view_state">
	//*  49   94:aload_1         
	//*  50   95:getfield        #1432 <Field SparseArray Fragment.mSavedViewState>
	//*  51   98:invokevirtual   #1841 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
	//*  52  101:aload_2         
	//*  53  102:astore_3        
	//*  54  103:aload_1         
	//*  55  104:getfield        #1447 <Field boolean Fragment.mUserVisibleHint>
	//*  56  107:ifne            134
	//*  57  110:aload_2         
	//*  58  111:astore_3        
	//*  59  112:aload_2         
	//*  60  113:ifnonnull       124
	//*  61  116:new             #1265 <Class Bundle>
	//*  62  119:dup             
	//*  63  120:invokespecial   #1817 <Method void Bundle()>
	//*  64  123:astore_3        
	//*  65  124:aload_3         
	//*  66  125:ldc1            #76  <String "android:user_visible_hint">
	//*  67  127:aload_1         
	//*  68  128:getfield        #1447 <Field boolean Fragment.mUserVisibleHint>
	//*  69  131:invokevirtual   #1845 <Method void Bundle.putBoolean(String, boolean)>
	//*  70  134:aload_3         
	//*  71  135:areturn         
		{
			bundle1 = null;
	//   72  136:aconst_null     
	//   73  137:astore_3        
		}
		if(fragment.mView != null)
			saveFragmentViewState(fragment);
		bundle = bundle1;
		if(fragment.mSavedViewState != null)
		{
			bundle = bundle1;
			if(bundle1 == null)
				bundle = new Bundle();
			bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
		}
		bundle1 = bundle;
		if(!fragment.mUserVisibleHint)
		{
			bundle1 = bundle;
			if(bundle == null)
				bundle1 = new Bundle();
			bundle1.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
		}
		return bundle1;
	//*  74  138:goto            56
	}

	public Fragment.SavedState saveFragmentInstanceState(Fragment fragment)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		if(fragment.mIndex < 0)
	//*   2    2:aload_1         
	//*   3    3:getfield        #1350 <Field int Fragment.mIndex>
	//*   4    6:ifge            46
			throwException(((RuntimeException) (new IllegalStateException((new StringBuilder()).append("Fragment ").append(((Object) (fragment))).append(" is not currently in the FragmentManager").toString()))));
	//    5    9:aload_0         
	//    6   10:new             #331 <Class IllegalStateException>
	//    7   13:dup             
	//    8   14:new             #340 <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #341 <Method void StringBuilder()>
	//   11   21:ldc2            #1460 <String "Fragment ">
	//   12   24:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   15   31:ldc2            #1706 <String " is not currently in the FragmentManager">
	//   16   34:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   18   40:invokespecial   #336 <Method void IllegalStateException(String)>
	//   19   43:invokespecial   #1276 <Method void throwException(RuntimeException)>
		Fragment.SavedState savedstate = ((Fragment.SavedState) (obj));
	//   20   46:aload_3         
	//   21   47:astore_2        
		if(fragment.mState > 0)
	//*  22   48:aload_1         
	//*  23   49:getfield        #211 <Field int Fragment.mState>
	//*  24   52:ifle            76
		{
			fragment = ((Fragment) (saveFragmentBasicState(fragment)));
	//   25   55:aload_0         
	//   26   56:aload_1         
	//   27   57:invokevirtual   #1812 <Method Bundle saveFragmentBasicState(Fragment)>
	//   28   60:astore_1        
			savedstate = ((Fragment.SavedState) (obj));
	//   29   61:aload_3         
	//   30   62:astore_2        
			if(fragment != null)
	//*  31   63:aload_1         
	//*  32   64:ifnull          76
				savedstate = new Fragment.SavedState(((Bundle) (fragment)));
	//   33   67:new             #1849 <Class Fragment$SavedState>
	//   34   70:dup             
	//   35   71:aload_1         
	//   36   72:invokespecial   #1851 <Method void Fragment$SavedState(Bundle)>
	//   37   75:astore_2        
		}
		return savedstate;
	//   38   76:aload_2         
	//   39   77:areturn         
	}

	void saveFragmentViewState(Fragment fragment)
	{
		if(fragment.mInnerView != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1222 <Field View Fragment.mInnerView>
	//*   2    4:ifnonnull       8
	//*   3    7:return          
		{
			if(mStateArray == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #175 <Field SparseArray mStateArray>
	//*   6   12:ifnonnull       61
				mStateArray = new SparseArray();
	//    7   15:aload_0         
	//    8   16:new             #315 <Class SparseArray>
	//    9   19:dup             
	//   10   20:invokespecial   #1355 <Method void SparseArray()>
	//   11   23:putfield        #175 <Field SparseArray mStateArray>
			else
	//*  12   26:aload_1         
	//*  13   27:getfield        #1222 <Field View Fragment.mInnerView>
	//*  14   30:aload_0         
	//*  15   31:getfield        #175 <Field SparseArray mStateArray>
	//*  16   34:invokevirtual   #1855 <Method void View.saveHierarchyState(SparseArray)>
	//*  17   37:aload_0         
	//*  18   38:getfield        #175 <Field SparseArray mStateArray>
	//*  19   41:invokevirtual   #316 <Method int SparseArray.size()>
	//*  20   44:ifle            7
	//*  21   47:aload_1         
	//*  22   48:aload_0         
	//*  23   49:getfield        #175 <Field SparseArray mStateArray>
	//*  24   52:putfield        #1432 <Field SparseArray Fragment.mSavedViewState>
	//*  25   55:aload_0         
	//*  26   56:aconst_null     
	//*  27   57:putfield        #175 <Field SparseArray mStateArray>
	//*  28   60:return          
				mStateArray.clear();
	//   29   61:aload_0         
	//   30   62:getfield        #175 <Field SparseArray mStateArray>
	//   31   65:invokevirtual   #1856 <Method void SparseArray.clear()>
			fragment.mInnerView.saveHierarchyState(mStateArray);
			if(mStateArray.size() > 0)
			{
				fragment.mSavedViewState = mStateArray;
				mStateArray = null;
				return;
			}
		}
	//*  32   68:goto            26
	}

	void saveNonConfig()
	{
		if(mActive == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #313 <Field SparseArray mActive>
	//    2    4:ifnull          278
_L1:
		int i;
		Object obj;
		Object obj1;
		i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
		obj1 = null;
	//    5    9:aconst_null     
	//    6   10:astore          4
		obj = null;
	//    7   12:aconst_null     
	//    8   13:astore_3        
_L5:
		Object obj2;
		Object obj4;
		obj4 = obj1;
	//    9   14:aload           4
	//   10   16:astore          6
		obj2 = obj;
	//   11   18:aload_3         
	//   12   19:astore          5
		if(i >= mActive.size()) goto _L4; else goto _L3
	//   13   21:iload_1         
	//   14   22:aload_0         
	//   15   23:getfield        #313 <Field SparseArray mActive>
	//   16   26:invokevirtual   #316 <Method int SparseArray.size()>
	//   17   29:icmpge          284
_L3:
		Fragment fragment = (Fragment)mActive.valueAt(i);
	//   18   32:aload_0         
	//   19   33:getfield        #313 <Field SparseArray mActive>
	//   20   36:iload_1         
	//   21   37:invokevirtual   #319 <Method Object SparseArray.valueAt(int)>
	//   22   40:checkcast       #208 <Class Fragment>
	//   23   43:astore          7
		if(fragment != null)
	//*  24   45:aload           7
	//*  25   47:ifnull          316
		{
			obj2 = obj;
	//   26   50:aload_3         
	//   27   51:astore          5
			if(fragment.mRetainInstance)
	//*  28   53:aload           7
	//*  29   55:getfield        #1859 <Field boolean Fragment.mRetainInstance>
	//*  30   58:ifeq            149
			{
				obj4 = obj;
	//   31   61:aload_3         
	//   32   62:astore          6
				if(obj == null)
	//*  33   64:aload_3         
	//*  34   65:ifnonnull       77
					obj4 = ((Object) (new ArrayList()));
	//   35   68:new             #161 <Class ArrayList>
	//   36   71:dup             
	//   37   72:invokespecial   #162 <Method void ArrayList()>
	//   38   75:astore          6
				((ArrayList) (obj4)).add(((Object) (fragment)));
	//   39   77:aload           6
	//   40   79:aload           7
	//   41   81:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//   42   84:pop             
				int j;
				if(fragment.mTarget != null)
	//*  43   85:aload           7
	//*  44   87:getfield        #1437 <Field Fragment Fragment.mTarget>
	//*  45   90:ifnull          231
					j = fragment.mTarget.mIndex;
	//   46   93:aload           7
	//   47   95:getfield        #1437 <Field Fragment Fragment.mTarget>
	//   48   98:getfield        #1350 <Field int Fragment.mIndex>
	//   49  101:istore_2        
				else
	//*  50  102:aload           7
	//*  51  104:iload_2         
	//*  52  105:putfield        #1756 <Field int Fragment.mTargetIndex>
	//*  53  108:aload           6
	//*  54  110:astore          5
	//*  55  112:getstatic       #133 <Field boolean DEBUG>
	//*  56  115:ifeq            149
	//*  57  118:ldc1            #67  <String "FragmentManager">
	//*  58  120:new             #340 <Class StringBuilder>
	//*  59  123:dup             
	//*  60  124:invokespecial   #341 <Method void StringBuilder()>
	//*  61  127:ldc2            #1861 <String "retainNonConfig: keeping retained ">
	//*  62  130:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//*  63  133:aload           7
	//*  64  135:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//*  65  138:invokevirtual   #351 <Method String StringBuilder.toString()>
	//*  66  141:invokestatic    #839 <Method int Log.v(String, String)>
	//*  67  144:pop             
	//*  68  145:aload           6
	//*  69  147:astore          5
	//*  70  149:aload           7
	//*  71  151:getfield        #1455 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
	//*  72  154:ifnull          236
	//*  73  157:aload           7
	//*  74  159:getfield        #1455 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
	//*  75  162:invokevirtual   #1833 <Method void saveNonConfig()>
	//*  76  165:aload           7
	//*  77  167:getfield        #1455 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
	//*  78  170:getfield        #1596 <Field FragmentManagerNonConfig mSavedNonConfig>
	//*  79  173:astore          6
	//*  80  175:aload           4
	//*  81  177:astore_3        
	//*  82  178:aload           4
	//*  83  180:ifnonnull       246
	//*  84  183:aload           4
	//*  85  185:astore_3        
	//*  86  186:aload           6
	//*  87  188:ifnull          246
	//*  88  191:new             #161 <Class ArrayList>
	//*  89  194:dup             
	//*  90  195:aload_0         
	//*  91  196:getfield        #313 <Field SparseArray mActive>
	//*  92  199:invokevirtual   #316 <Method int SparseArray.size()>
	//*  93  202:invokespecial   #369 <Method void ArrayList(int)>
	//*  94  205:astore          4
	//*  95  207:iconst_0        
	//*  96  208:istore_2        
	//*  97  209:aload           4
	//*  98  211:astore_3        
	//*  99  212:iload_2         
	//* 100  213:iload_1         
	//* 101  214:icmpge          246
	//* 102  217:aload           4
	//* 103  219:aconst_null     
	//* 104  220:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//* 105  223:pop             
	//* 106  224:iload_2         
	//* 107  225:iconst_1        
	//* 108  226:iadd            
	//* 109  227:istore_2        
	//* 110  228:goto            209
					j = -1;
	//  111  231:iconst_m1       
	//  112  232:istore_2        
				fragment.mTargetIndex = j;
				obj2 = obj4;
				if(DEBUG)
				{
					Log.v("FragmentManager", (new StringBuilder()).append("retainNonConfig: keeping retained ").append(((Object) (fragment))).toString());
					obj2 = obj4;
				}
			}
			if(fragment.mChildFragmentManager != null)
			{
				fragment.mChildFragmentManager.saveNonConfig();
				obj4 = ((Object) (fragment.mChildFragmentManager.mSavedNonConfig));
			} else
	//* 113  233:goto            102
			{
				obj4 = ((Object) (fragment.mChildNonConfig));
	//  114  236:aload           7
	//  115  238:getfield        #1864 <Field FragmentManagerNonConfig Fragment.mChildNonConfig>
	//  116  241:astore          6
			}
			obj = obj1;
			if(obj1 == null)
			{
				obj = obj1;
				if(obj4 != null)
				{
					obj1 = ((Object) (new ArrayList(mActive.size())));
					j = 0;
					do
					{
						obj = obj1;
						if(j >= i)
							break;
						((ArrayList) (obj1)).add(((Object) (null)));
						j++;
					} while(true);
				}
			}
	//* 117  243:goto            175
			if(obj != null)
	//* 118  246:aload_3         
	//* 119  247:ifnull          257
				((ArrayList) (obj)).add(obj4);
	//  120  250:aload_3         
	//  121  251:aload           6
	//  122  253:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//  123  256:pop             
			obj1 = obj2;
	//  124  257:aload           5
	//  125  259:astore          4
		} else
	//* 126  261:iload_1         
	//* 127  262:iconst_1        
	//* 128  263:iadd            
	//* 129  264:istore_1        
	//* 130  265:aload           4
	//* 131  267:astore          5
	//* 132  269:aload_3         
	//* 133  270:astore          4
	//* 134  272:aload           5
	//* 135  274:astore_3        
	//* 136  275:goto            14
	//* 137  278:aconst_null     
	//* 138  279:astore          6
	//* 139  281:aconst_null     
	//* 140  282:astore          5
	//* 141  284:aload           5
	//* 142  286:ifnonnull       300
	//* 143  289:aload           6
	//* 144  291:ifnonnull       300
	//* 145  294:aload_0         
	//* 146  295:aconst_null     
	//* 147  296:putfield        #1596 <Field FragmentManagerNonConfig mSavedNonConfig>
	//* 148  299:return          
	//* 149  300:aload_0         
	//* 150  301:new             #750 <Class FragmentManagerNonConfig>
	//* 151  304:dup             
	//* 152  305:aload           5
	//* 153  307:aload           6
	//* 154  309:invokespecial   #1867 <Method void FragmentManagerNonConfig(List, List)>
	//* 155  312:putfield        #1596 <Field FragmentManagerNonConfig mSavedNonConfig>
	//* 156  315:return          
		{
			Object obj3 = obj;
	//  157  316:aload_3         
	//  158  317:astore          5
			obj = obj1;
	//  159  319:aload           4
	//  160  321:astore_3        
			obj1 = obj3;
	//  161  322:aload           5
	//  162  324:astore          4
		}
		i++;
		obj2 = obj1;
		obj1 = obj;
		obj = obj2;
		if(true) goto _L5; else goto _L4
	//  163  326:goto            261
_L2:
		obj4 = null;
		obj2 = null;
_L4:
		if(obj2 == null && obj4 == null)
		{
			mSavedNonConfig = null;
			return;
		} else
		{
			mSavedNonConfig = new FragmentManagerNonConfig(((List) (obj2)), ((List) (obj4)));
			return;
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
	//*   3    3:getfield        #877 <Field ArrayList mBackStackIndices>
	//*   4    6:ifnonnull       20
			mBackStackIndices = new ArrayList();
	//    5    9:aload_0         
	//    6   10:new             #161 <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #162 <Method void ArrayList()>
	//    9   17:putfield        #877 <Field ArrayList mBackStackIndices>
		k = mBackStackIndices.size();
	//   10   20:aload_0         
	//   11   21:getfield        #877 <Field ArrayList mBackStackIndices>
	//   12   24:invokevirtual   #202 <Method int ArrayList.size()>
	//   13   27:istore          4
		int j = k;
	//   14   29:iload           4
	//   15   31:istore_3        
		if(i >= k) goto _L2; else goto _L1
	//   16   32:iload_1         
	//   17   33:iload           4
	//   18   35:icmpge          93
_L1:
		if(DEBUG)
	//*  19   38:getstatic       #133 <Field boolean DEBUG>
	//*  20   41:ifeq            80
			Log.v("FragmentManager", (new StringBuilder()).append("Setting back stack index ").append(i).append(" to ").append(((Object) (backstackrecord))).toString());
	//   21   44:ldc1            #67  <String "FragmentManager">
	//   22   46:new             #340 <Class StringBuilder>
	//   23   49:dup             
	//   24   50:invokespecial   #341 <Method void StringBuilder()>
	//   25   53:ldc2            #879 <String "Setting back stack index ">
	//   26   56:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   27   59:iload_1         
	//   28   60:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//   29   63:ldc2            #884 <String " to ">
	//   30   66:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   31   69:aload_2         
	//   32   70:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   33   73:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   34   76:invokestatic    #839 <Method int Log.v(String, String)>
	//   35   79:pop             
		mBackStackIndices.set(i, ((Object) (backstackrecord)));
	//   36   80:aload_0         
	//   37   81:getfield        #877 <Field ArrayList mBackStackIndices>
	//   38   84:iload_1         
	//   39   85:aload_2         
	//   40   86:invokevirtual   #897 <Method Object ArrayList.set(int, Object)>
	//   41   89:pop             
_L4:
		this;
	//   42   90:aload_0         
		JVM INSTR monitorexit ;
	//   43   91:monitorexit     
		return;
	//   44   92:return          
_L2:
		if(j >= i)
			break; /* Loop/switch isn't completed */
	//   45   93:iload_3         
	//   46   94:iload_1         
	//   47   95:icmpge          176
		mBackStackIndices.add(((Object) (null)));
	//   48   98:aload_0         
	//   49   99:getfield        #877 <Field ArrayList mBackStackIndices>
	//   50  102:aconst_null     
	//   51  103:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//   52  106:pop             
		if(mAvailBackStackIndices == null)
	//*  53  107:aload_0         
	//*  54  108:getfield        #875 <Field ArrayList mAvailBackStackIndices>
	//*  55  111:ifnonnull       125
			mAvailBackStackIndices = new ArrayList();
	//   56  114:aload_0         
	//   57  115:new             #161 <Class ArrayList>
	//   58  118:dup             
	//   59  119:invokespecial   #162 <Method void ArrayList()>
	//   60  122:putfield        #875 <Field ArrayList mAvailBackStackIndices>
		if(DEBUG)
	//*  61  125:getstatic       #133 <Field boolean DEBUG>
	//*  62  128:ifeq            157
			Log.v("FragmentManager", (new StringBuilder()).append("Adding available back stack index ").append(j).toString());
	//   63  131:ldc1            #67  <String "FragmentManager">
	//   64  133:new             #340 <Class StringBuilder>
	//   65  136:dup             
	//   66  137:invokespecial   #341 <Method void StringBuilder()>
	//   67  140:ldc2            #1869 <String "Adding available back stack index ">
	//   68  143:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   69  146:iload_3         
	//   70  147:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//   71  150:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   72  153:invokestatic    #839 <Method int Log.v(String, String)>
	//   73  156:pop             
		mAvailBackStackIndices.add(((Object) (Integer.valueOf(j))));
	//   74  157:aload_0         
	//   75  158:getfield        #875 <Field ArrayList mAvailBackStackIndices>
	//   76  161:iload_3         
	//   77  162:invokestatic    #1253 <Method Integer Integer.valueOf(int)>
	//   78  165:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//   79  168:pop             
		j++;
	//   80  169:iload_3         
	//   81  170:iconst_1        
	//   82  171:iadd            
	//   83  172:istore_3        
		if(true) goto _L2; else goto _L3
	//   84  173:goto            93
_L3:
		if(DEBUG)
	//*  85  176:getstatic       #133 <Field boolean DEBUG>
	//*  86  179:ifeq            218
			Log.v("FragmentManager", (new StringBuilder()).append("Adding back stack index ").append(i).append(" with ").append(((Object) (backstackrecord))).toString());
	//   87  182:ldc1            #67  <String "FragmentManager">
	//   88  184:new             #340 <Class StringBuilder>
	//   89  187:dup             
	//   90  188:invokespecial   #341 <Method void StringBuilder()>
	//   91  191:ldc2            #891 <String "Adding back stack index ">
	//   92  194:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   93  197:iload_1         
	//   94  198:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//   95  201:ldc2            #893 <String " with ">
	//   96  204:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   97  207:aload_2         
	//   98  208:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   99  211:invokevirtual   #351 <Method String StringBuilder.toString()>
	//  100  214:invokestatic    #839 <Method int Log.v(String, String)>
	//  101  217:pop             
		mBackStackIndices.add(((Object) (backstackrecord)));
	//  102  218:aload_0         
	//  103  219:getfield        #877 <Field ArrayList mBackStackIndices>
	//  104  222:aload_2         
	//  105  223:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//  106  226:pop             
		  goto _L4
	//* 107  227:goto            90
		backstackrecord;
	//  108  230:astore_2        
		this;
	//  109  231:aload_0         
		JVM INSTR monitorexit ;
	//  110  232:monitorexit     
		throw backstackrecord;
	//  111  233:aload_2         
	//  112  234:athrow          
	}

	public void setPrimaryNavigationFragment(Fragment fragment)
	{
		if(fragment != null && (mActive.get(fragment.mIndex) != fragment || fragment.mHost != null && fragment.getFragmentManager() != this))
	//*   0    0:aload_1         
	//*   1    1:ifnull          72
	//*   2    4:aload_0         
	//*   3    5:getfield        #313 <Field SparseArray mActive>
	//*   4    8:aload_1         
	//*   5    9:getfield        #1350 <Field int Fragment.mIndex>
	//*   6   12:invokevirtual   #1270 <Method Object SparseArray.get(int)>
	//*   7   15:aload_1         
	//*   8   16:if_acmpne       34
	//*   9   19:aload_1         
	//*  10   20:getfield        #1448 <Field FragmentHostCallback Fragment.mHost>
	//*  11   23:ifnull          72
	//*  12   26:aload_1         
	//*  13   27:invokevirtual   #983 <Method FragmentManager Fragment.getFragmentManager()>
	//*  14   30:aload_0         
	//*  15   31:if_acmpeq       72
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Fragment ").append(((Object) (fragment))).append(" is not an active fragment of FragmentManager ").append(((Object) (this))).toString());
	//   16   34:new             #1496 <Class IllegalArgumentException>
	//   17   37:dup             
	//   18   38:new             #340 <Class StringBuilder>
	//   19   41:dup             
	//   20   42:invokespecial   #341 <Method void StringBuilder()>
	//   21   45:ldc2            #1460 <String "Fragment ">
	//   22   48:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   23   51:aload_1         
	//   24   52:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   25   55:ldc2            #1872 <String " is not an active fragment of FragmentManager ">
	//   26   58:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   27   61:aload_0         
	//   28   62:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   29   65:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   30   68:invokespecial   #1501 <Method void IllegalArgumentException(String)>
	//   31   71:athrow          
		} else
		{
			mPrimaryNav = fragment;
	//   32   72:aload_0         
	//   33   73:aload_1         
	//   34   74:putfield        #690 <Field Fragment mPrimaryNav>
			return;
	//   35   77:return          
		}
	}

	public void showFragment(Fragment fragment)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(DEBUG)
	//*   2    2:getstatic       #133 <Field boolean DEBUG>
	//*   3    5:ifeq            34
			Log.v("FragmentManager", (new StringBuilder()).append("show: ").append(((Object) (fragment))).toString());
	//    4    8:ldc1            #67  <String "FragmentManager">
	//    5   10:new             #340 <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #341 <Method void StringBuilder()>
	//    8   17:ldc2            #1875 <String "show: ">
	//    9   20:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   10   23:aload_1         
	//   11   24:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   12   27:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   13   30:invokestatic    #839 <Method int Log.v(String, String)>
	//   14   33:pop             
		if(fragment.mHidden)
	//*  15   34:aload_1         
	//*  16   35:getfield        #228 <Field boolean Fragment.mHidden>
	//*  17   38:ifeq            60
		{
			fragment.mHidden = false;
	//   18   41:aload_1         
	//   19   42:iconst_0        
	//   20   43:putfield        #228 <Field boolean Fragment.mHidden>
			if(!fragment.mHiddenChanged)
	//*  21   46:aload_1         
	//*  22   47:getfield        #857 <Field boolean Fragment.mHiddenChanged>
	//*  23   50:ifne            55
				flag = true;
	//   24   53:iconst_1        
	//   25   54:istore_2        
			fragment.mHiddenChanged = flag;
	//   26   55:aload_1         
	//   27   56:iload_2         
	//   28   57:putfield        #857 <Field boolean Fragment.mHiddenChanged>
		}
	//   29   60:return          
	}

	void startPendingDeferredFragments()
	{
		if(mActive != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field SparseArray mActive>
	//*   2    4:ifnonnull       8
	//*   3    7:return          
		{
			int i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_1        
			while(i < mActive.size()) 
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:getfield        #313 <Field SparseArray mActive>
	//*   9   15:invokevirtual   #316 <Method int SparseArray.size()>
	//*  10   18:icmpge          7
			{
				Fragment fragment = (Fragment)mActive.valueAt(i);
	//   11   21:aload_0         
	//   12   22:getfield        #313 <Field SparseArray mActive>
	//   13   25:iload_1         
	//   14   26:invokevirtual   #319 <Method Object SparseArray.valueAt(int)>
	//   15   29:checkcast       #208 <Class Fragment>
	//   16   32:astore_2        
				if(fragment != null)
	//*  17   33:aload_2         
	//*  18   34:ifnull          42
					performPendingDeferredStart(fragment);
	//   19   37:aload_0         
	//   20   38:aload_2         
	//   21   39:invokevirtual   #1877 <Method void performPendingDeferredStart(Fragment)>
				i++;
	//   22   42:iload_1         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore_1        
			}
		}
	//*  26   46:goto            10
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(128);
	//    0    0:new             #340 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          128
	//    3    7:invokespecial   #1878 <Method void StringBuilder(int)>
	//    4   10:astore_1        
		stringbuilder.append("FragmentManager{");
	//    5   11:aload_1         
	//    6   12:ldc2            #1880 <String "FragmentManager{">
	//    7   15:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:invokestatic    #1133 <Method int System.identityHashCode(Object)>
	//   12   24:invokestatic    #1137 <Method String Integer.toHexString(int)>
	//   13   27:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
		stringbuilder.append(" in ");
	//   15   31:aload_1         
	//   16   32:ldc2            #1882 <String " in ">
	//   17   35:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
		if(mParent != null)
	//*  19   39:aload_0         
	//*  20   40:getfield        #905 <Field Fragment mParent>
	//*  21   43:ifnull          67
			DebugUtils.buildShortClassTag(((Object) (mParent)), stringbuilder);
	//   22   46:aload_0         
	//   23   47:getfield        #905 <Field Fragment mParent>
	//   24   50:aload_1         
	//   25   51:invokestatic    #1888 <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
		else
	//*  26   54:aload_1         
	//*  27   55:ldc2            #1890 <String "}}">
	//*  28   58:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//*  29   61:pop             
	//*  30   62:aload_1         
	//*  31   63:invokevirtual   #351 <Method String StringBuilder.toString()>
	//*  32   66:areturn         
			DebugUtils.buildShortClassTag(((Object) (mHost)), stringbuilder);
	//   33   67:aload_0         
	//   34   68:getfield        #444 <Field FragmentHostCallback mHost>
	//   35   71:aload_1         
	//   36   72:invokestatic    #1888 <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
		stringbuilder.append("}}");
		return stringbuilder.toString();
	//*  37   75:goto            54
	}

	public void unregisterFragmentLifecycleCallbacks(FragmentManager.FragmentLifecycleCallbacks fragmentlifecyclecallbacks)
	{
		CopyOnWriteArrayList copyonwritearraylist = mLifecycleCallbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//    2    4:astore          4
		copyonwritearraylist;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		int j = mLifecycleCallbacks.size();
	//    5    9:aload_0         
	//    6   10:getfield        #169 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//    7   13:invokevirtual   #1893 <Method int CopyOnWriteArrayList.size()>
	//    8   16:istore_3        
		int i = 0;
	//    9   17:iconst_0        
	//   10   18:istore_2        
_L2:
		if(i >= j)
			break MISSING_BLOCK_LABEL_51;
	//   11   19:iload_2         
	//   12   20:iload_3         
	//   13   21:icmpge          51
		if(((Pair)mLifecycleCallbacks.get(i)).first != fragmentlifecyclecallbacks)
			break MISSING_BLOCK_LABEL_61;
	//   14   24:aload_0         
	//   15   25:getfield        #169 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   16   28:iload_2         
	//   17   29:invokevirtual   #1894 <Method Object CopyOnWriteArrayList.get(int)>
	//   18   32:checkcast       #988 <Class Pair>
	//   19   35:getfield        #995 <Field Object Pair.first>
	//   20   38:aload_1         
	//   21   39:if_acmpne       61
		mLifecycleCallbacks.remove(i);
	//   22   42:aload_0         
	//   23   43:getfield        #169 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   24   46:iload_2         
	//   25   47:invokevirtual   #1895 <Method Object CopyOnWriteArrayList.remove(int)>
	//   26   50:pop             
		copyonwritearraylist;
	//   27   51:aload           4
		JVM INSTR monitorexit ;
	//   28   53:monitorexit     
		return;
	//   29   54:return          
		fragmentlifecyclecallbacks;
	//   30   55:astore_1        
		copyonwritearraylist;
	//   31   56:aload           4
		JVM INSTR monitorexit ;
	//   32   58:monitorexit     
		throw fragmentlifecyclecallbacks;
	//   33   59:aload_1         
	//   34   60:athrow          
		i++;
	//   35   61:iload_2         
	//   36   62:iconst_1        
	//   37   63:iadd            
	//   38   64:istore_2        
		if(true) goto _L2; else goto _L1
	//   39   65:goto            19
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
	static Field sAnimationListenerField = null;
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
		DEBUG = false;
	//    0    0:iconst_0        
	//    1    1:putstatic       #133 <Field boolean DEBUG>
	//    2    4:aconst_null     
	//    3    5:putstatic       #135 <Field Field sAnimationListenerField>
	//    4    8:new             #137 <Class DecelerateInterpolator>
	//    5   11:dup             
	//    6   12:ldc1            #138 <Float 2.5F>
	//    7   14:invokespecial   #142 <Method void DecelerateInterpolator(float)>
	//    8   17:putstatic       #144 <Field Interpolator DECELERATE_QUINT>
	//    9   20:new             #137 <Class DecelerateInterpolator>
	//   10   23:dup             
	//   11   24:ldc1            #145 <Float 1.5F>
	//   12   26:invokespecial   #142 <Method void DecelerateInterpolator(float)>
	//   13   29:putstatic       #147 <Field Interpolator DECELERATE_CUBIC>
	//   14   32:new             #149 <Class AccelerateInterpolator>
	//   15   35:dup             
	//   16   36:ldc1            #138 <Float 2.5F>
	//   17   38:invokespecial   #150 <Method void AccelerateInterpolator(float)>
	//   18   41:putstatic       #152 <Field Interpolator ACCELERATE_QUINT>
	//   19   44:new             #149 <Class AccelerateInterpolator>
	//   20   47:dup             
	//   21   48:ldc1            #145 <Float 1.5F>
	//   22   50:invokespecial   #150 <Method void AccelerateInterpolator(float)>
	//   23   53:putstatic       #154 <Field Interpolator ACCELERATE_CUBIC>
	//*  24   56:return          
	}


/*
	static void access$500(FragmentManagerImpl fragmentmanagerimpl)
	{
		fragmentmanagerimpl.scheduleCommit();
	//    0    0:aload_0         
	//    1    1:invokespecial   #184 <Method void scheduleCommit()>
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
	//    5    6:invokespecial   #190 <Method void completeExecute(BackStackRecord, boolean, boolean, boolean)>
		return;
	//    6    9:return          
	}

*/
}
