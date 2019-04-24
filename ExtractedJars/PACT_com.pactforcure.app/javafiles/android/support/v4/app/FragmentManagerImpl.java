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
	//    5   11:istore          7
		boolean flag = false;
	//    6   13:iconst_0        
	//    7   14:istore          5
		int k;
		Fragment fragment;
		if(mTmpAddedFragments == null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #477 <Field ArrayList mTmpAddedFragments>
	//*  10   20:ifnonnull       126
			mTmpAddedFragments = new ArrayList();
	//   11   23:aload_0         
	//   12   24:new             #161 <Class ArrayList>
	//   13   27:dup             
	//   14   28:invokespecial   #162 <Method void ArrayList()>
	//   15   31:putfield        #477 <Field ArrayList mTmpAddedFragments>
		else
	//*  16   34:aload_0         
	//*  17   35:getfield        #477 <Field ArrayList mTmpAddedFragments>
	//*  18   38:aload_0         
	//*  19   39:getfield        #164 <Field ArrayList mAdded>
	//*  20   42:invokevirtual   #481 <Method boolean ArrayList.addAll(java.util.Collection)>
	//*  21   45:pop             
	//*  22   46:aload_0         
	//*  23   47:invokevirtual   #485 <Method Fragment getPrimaryNavigationFragment()>
	//*  24   50:astore          8
	//*  25   52:iload_3         
	//*  26   53:istore          6
	//*  27   55:iload           6
	//*  28   57:iload           4
	//*  29   59:icmpge          158
	//*  30   62:aload_1         
	//*  31   63:iload           6
	//*  32   65:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//*  33   68:checkcast       #363 <Class BackStackRecord>
	//*  34   71:astore          9
	//*  35   73:aload_2         
	//*  36   74:iload           6
	//*  37   76:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//*  38   79:checkcast       #372 <Class Boolean>
	//*  39   82:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//*  40   85:ifne            136
	//*  41   88:aload           9
	//*  42   90:aload_0         
	//*  43   91:getfield        #477 <Field ArrayList mTmpAddedFragments>
	//*  44   94:aload           8
	//*  45   96:invokevirtual   #489 <Method Fragment BackStackRecord.expandOps(ArrayList, Fragment)>
	//*  46   99:astore          8
	//*  47  101:iload           5
	//*  48  103:ifne            114
	//*  49  106:aload           9
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
		while(k < j) 
		{
			BackStackRecord backstackrecord1 = (BackStackRecord)arraylist.get(k);
			if(!((Boolean)arraylist1.get(k)).booleanValue())
				fragment = backstackrecord1.expandOps(mTmpAddedFragments, fragment);
			else
	//*  62  133:goto            34
				fragment = backstackrecord1.trackAddedFragmentsInPop(mTmpAddedFragments, fragment);
	//   63  136:aload           9
	//   64  138:aload_0         
	//   65  139:getfield        #477 <Field ArrayList mTmpAddedFragments>
	//   66  142:aload           8
	//   67  144:invokevirtual   #495 <Method Fragment BackStackRecord.trackAddedFragmentsInPop(ArrayList, Fragment)>
	//   68  147:astore          8
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
	//*  76  165:iload           7
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
		k = j;
	//   90  188:iload           4
	//   91  190:istore          6
		if(flag1)
	//*  92  192:iload           7
	//*  93  194:ifeq            231
		{
			ArraySet arrayset = new ArraySet();
	//   94  197:new             #233 <Class ArraySet>
	//   95  200:dup             
	//   96  201:invokespecial   #498 <Method void ArraySet()>
	//   97  204:astore          8
			addAddedFragments(arrayset);
	//   98  206:aload_0         
	//   99  207:aload           8
	//  100  209:invokespecial   #500 <Method void addAddedFragments(ArraySet)>
			k = postponePostponableTransactions(arraylist, arraylist1, i, j, arrayset);
	//  101  212:aload_0         
	//  102  213:aload_1         
	//  103  214:aload_2         
	//  104  215:iload_3         
	//  105  216:iload           4
	//  106  218:aload           8
	//  107  220:invokespecial   #504 <Method int postponePostponableTransactions(ArrayList, ArrayList, int, int, ArraySet)>
	//  108  223:istore          6
			makeRemovedFragmentsInvisible(arrayset);
	//  109  225:aload_0         
	//  110  226:aload           8
	//  111  228:invokespecial   #507 <Method void makeRemovedFragmentsInvisible(ArraySet)>
		}
		if(k != i && flag1)
	//* 112  231:iload           6
	//* 113  233:iload_3         
	//* 114  234:icmpeq          261
	//* 115  237:iload           7
	//* 116  239:ifeq            261
		{
			FragmentTransition.startTransitions(this, arraylist, arraylist1, i, k, true);
	//  117  242:aload_0         
	//  118  243:aload_1         
	//  119  244:aload_2         
	//  120  245:iload_3         
	//  121  246:iload           6
	//  122  248:iconst_1        
	//  123  249:invokestatic    #382 <Method void FragmentTransition.startTransitions(FragmentManagerImpl, ArrayList, ArrayList, int, int, boolean)>
			moveToState(mCurState, true);
	//  124  252:aload_0         
	//  125  253:aload_0         
	//  126  254:getfield        #171 <Field int mCurState>
	//  127  257:iconst_1        
	//  128  258:invokevirtual   #385 <Method void moveToState(int, boolean)>
		}
		for(; i < j; i++)
	//* 129  261:iload_3         
	//* 130  262:iload           4
	//* 131  264:icmpge          326
		{
			BackStackRecord backstackrecord = (BackStackRecord)arraylist.get(i);
	//  132  267:aload_1         
	//  133  268:iload_3         
	//  134  269:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//  135  272:checkcast       #363 <Class BackStackRecord>
	//  136  275:astore          8
			if(((Boolean)arraylist1.get(i)).booleanValue() && backstackrecord.mIndex >= 0)
	//* 137  277:aload_2         
	//* 138  278:iload_3         
	//* 139  279:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//* 140  282:checkcast       #372 <Class Boolean>
	//* 141  285:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//* 142  288:ifeq            314
	//* 143  291:aload           8
	//* 144  293:getfield        #510 <Field int BackStackRecord.mIndex>
	//* 145  296:iflt            314
			{
				freeBackStackIndex(backstackrecord.mIndex);
	//  146  299:aload_0         
	//  147  300:aload           8
	//  148  302:getfield        #510 <Field int BackStackRecord.mIndex>
	//  149  305:invokevirtual   #513 <Method void freeBackStackIndex(int)>
				backstackrecord.mIndex = -1;
	//  150  308:aload           8
	//  151  310:iconst_m1       
	//  152  311:putfield        #510 <Field int BackStackRecord.mIndex>
			}
			backstackrecord.runOnCommitRunnables();
	//  153  314:aload           8
	//  154  316:invokevirtual   #516 <Method void BackStackRecord.runOnCommitRunnables()>
		}

	//  155  319:iload_3         
	//  156  320:iconst_1        
	//  157  321:iadd            
	//  158  322:istore_3        
	//* 159  323:goto            261
		if(flag)
	//* 160  326:iload           5
	//* 161  328:ifeq            335
			reportBackStackChanged();
	//  162  331:aload_0         
	//  163  332:invokevirtual   #519 <Method void reportBackStackChanged()>
	//  164  335:return          
	}

	private void executePostponedTransaction(ArrayList arraylist, ArrayList arraylist1)
	{
		int i;
		int j;
		int k;
		int l;
		StartEnterTransitionListener startentertransitionlistener;
		if(mPostponedTransactions == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #521 <Field ArrayList mPostponedTransactions>
	//*   2    4:ifnonnull       105
			i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_3        
		else
	//*   5    9:iconst_0        
	//*   6   10:istore          5
	//*   7   12:iload_3         
	//*   8   13:istore          4
	//*   9   15:iload           5
	//*  10   17:istore_3        
	//*  11   18:iload_3         
	//*  12   19:iload           4
	//*  13   21:icmpge          236
	//*  14   24:aload_0         
	//*  15   25:getfield        #521 <Field ArrayList mPostponedTransactions>
	//*  16   28:iload_3         
	//*  17   29:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//*  18   32:checkcast       #39  <Class FragmentManagerImpl$StartEnterTransitionListener>
	//*  19   35:astore          7
	//*  20   37:aload_1         
	//*  21   38:ifnull          116
	//*  22   41:aload           7
	//*  23   43:invokestatic    #525 <Method boolean FragmentManagerImpl$StartEnterTransitionListener.access$300(FragmentManagerImpl$StartEnterTransitionListener)>
	//*  24   46:ifne            116
	//*  25   49:aload_1         
	//*  26   50:aload           7
	//*  27   52:invokestatic    #529 <Method BackStackRecord FragmentManagerImpl$StartEnterTransitionListener.access$400(FragmentManagerImpl$StartEnterTransitionListener)>
	//*  28   55:invokevirtual   #533 <Method int ArrayList.indexOf(Object)>
	//*  29   58:istore          5
	//*  30   60:iload           5
	//*  31   62:iconst_m1       
	//*  32   63:icmpeq          116
	//*  33   66:aload_2         
	//*  34   67:iload           5
	//*  35   69:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//*  36   72:checkcast       #372 <Class Boolean>
	//*  37   75:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//*  38   78:ifeq            116
	//*  39   81:aload           7
	//*  40   83:invokevirtual   #536 <Method void FragmentManagerImpl$StartEnterTransitionListener.cancelTransaction()>
	//*  41   86:iload           4
	//*  42   88:istore          6
	//*  43   90:iload_3         
	//*  44   91:istore          5
	//*  45   93:iload           5
	//*  46   95:iconst_1        
	//*  47   96:iadd            
	//*  48   97:istore_3        
	//*  49   98:iload           6
	//*  50  100:istore          4
	//*  51  102:goto            18
			i = mPostponedTransactions.size();
	//   52  105:aload_0         
	//   53  106:getfield        #521 <Field ArrayList mPostponedTransactions>
	//   54  109:invokevirtual   #202 <Method int ArrayList.size()>
	//   55  112:istore_3        
		k = 0;
		j = i;
		i = k;
		if(i >= j)
			break MISSING_BLOCK_LABEL_236;
		startentertransitionlistener = (StartEnterTransitionListener)mPostponedTransactions.get(i);
		if(arraylist == null || startentertransitionlistener.mIsBack)
			break; /* Loop/switch isn't completed */
		k = arraylist.indexOf(((Object) (startentertransitionlistener.mRecord)));
		if(k == -1 || !((Boolean)arraylist1.get(k)).booleanValue())
			break; /* Loop/switch isn't completed */
		startentertransitionlistener.cancelTransaction();
		l = j;
		k = i;
_L4:
		i = k + 1;
		j = l;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_18;
	//*  56  113:goto            9
_L1:
		if(!startentertransitionlistener.isReady())
	//*  57  116:aload           7
	//*  58  118:invokevirtual   #539 <Method boolean FragmentManagerImpl$StartEnterTransitionListener.isReady()>
	//*  59  121:ifne            159
		{
			k = i;
	//   60  124:iload_3         
	//   61  125:istore          5
			l = j;
	//   62  127:iload           4
	//   63  129:istore          6
			if(arraylist == null)
				continue; /* Loop/switch isn't completed */
	//   64  131:aload_1         
	//   65  132:ifnull          93
			k = i;
	//   66  135:iload_3         
	//   67  136:istore          5
			l = j;
	//   68  138:iload           4
	//   69  140:istore          6
			if(!startentertransitionlistener.mRecord.interactsWith(arraylist, 0, arraylist.size()))
				continue; /* Loop/switch isn't completed */
	//   70  142:aload           7
	//   71  144:invokestatic    #529 <Method BackStackRecord FragmentManagerImpl$StartEnterTransitionListener.access$400(FragmentManagerImpl$StartEnterTransitionListener)>
	//   72  147:aload_1         
	//   73  148:iconst_0        
	//   74  149:aload_1         
	//   75  150:invokevirtual   #202 <Method int ArrayList.size()>
	//   76  153:invokevirtual   #542 <Method boolean BackStackRecord.interactsWith(ArrayList, int, int)>
	//   77  156:ifeq            93
		}
label0:
		{
			mPostponedTransactions.remove(i);
	//   78  159:aload_0         
	//   79  160:getfield        #521 <Field ArrayList mPostponedTransactions>
	//   80  163:iload_3         
	//   81  164:invokevirtual   #545 <Method Object ArrayList.remove(int)>
	//   82  167:pop             
			k = i - 1;
	//   83  168:iload_3         
	//   84  169:iconst_1        
	//   85  170:isub            
	//   86  171:istore          5
			l = j - 1;
	//   87  173:iload           4
	//   88  175:iconst_1        
	//   89  176:isub            
	//   90  177:istore          6
			if(arraylist == null || startentertransitionlistener.mIsBack)
				break label0;
	//   91  179:aload_1         
	//   92  180:ifnull          228
	//   93  183:aload           7
	//   94  185:invokestatic    #525 <Method boolean FragmentManagerImpl$StartEnterTransitionListener.access$300(FragmentManagerImpl$StartEnterTransitionListener)>
	//   95  188:ifne            228
			i = arraylist.indexOf(((Object) (startentertransitionlistener.mRecord)));
	//   96  191:aload_1         
	//   97  192:aload           7
	//   98  194:invokestatic    #529 <Method BackStackRecord FragmentManagerImpl$StartEnterTransitionListener.access$400(FragmentManagerImpl$StartEnterTransitionListener)>
	//   99  197:invokevirtual   #533 <Method int ArrayList.indexOf(Object)>
	//  100  200:istore_3        
			if(i == -1 || !((Boolean)arraylist1.get(i)).booleanValue())
				break label0;
	//  101  201:iload_3         
	//  102  202:iconst_m1       
	//  103  203:icmpeq          228
	//  104  206:aload_2         
	//  105  207:iload_3         
	//  106  208:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//  107  211:checkcast       #372 <Class Boolean>
	//  108  214:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//  109  217:ifeq            228
			startentertransitionlistener.cancelTransaction();
	//  110  220:aload           7
	//  111  222:invokevirtual   #536 <Method void FragmentManagerImpl$StartEnterTransitionListener.cancelTransaction()>
		}
		continue; /* Loop/switch isn't completed */
	//  112  225:goto            93
		startentertransitionlistener.completeTransaction();
	//  113  228:aload           7
	//  114  230:invokevirtual   #548 <Method void FragmentManagerImpl$StartEnterTransitionListener.completeTransaction()>
		if(true) goto _L4; else goto _L3
	//  115  233:goto            93
_L3:
	//  116  236:return          
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
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		this;
	//    2    3:aload_0         
		JVM INSTR monitorenter ;
	//    3    4:monitorenter    
		if(mPendingActions != null && mPendingActions.size() != 0)
			break MISSING_BLOCK_LABEL_26;
	//    4    5:aload_0         
	//    5    6:getfield        #559 <Field ArrayList mPendingActions>
	//    6    9:ifnull          22
	//    7   12:aload_0         
	//    8   13:getfield        #559 <Field ArrayList mPendingActions>
	//    9   16:invokevirtual   #202 <Method int ArrayList.size()>
	//   10   19:ifne            26
		this;
	//   11   22:aload_0         
		JVM INSTR monitorexit ;
	//   12   23:monitorexit     
		return false;
	//   13   24:iconst_0        
	//   14   25:ireturn         
		int j = mPendingActions.size();
	//   15   26:aload_0         
	//   16   27:getfield        #559 <Field ArrayList mPendingActions>
	//   17   30:invokevirtual   #202 <Method int ArrayList.size()>
	//   18   33:istore          4
		int i = 0;
	//   19   35:iconst_0        
	//   20   36:istore_3        
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
		if(animator == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(animator instanceof ValueAnimator)
	//*   4    6:aload_0         
	//*   5    7:instanceof      #651 <Class ValueAnimator>
	//*   6   10:ifeq            53
		{
			animator = ((Animator) (((ValueAnimator)animator).getValues()));
	//    7   13:aload_0         
	//    8   14:checkcast       #651 <Class ValueAnimator>
	//    9   17:invokevirtual   #655 <Method PropertyValuesHolder[] ValueAnimator.getValues()>
	//   10   20:astore_0        
			for(int i = 0; i < animator.length; i++)
	//*  11   21:iconst_0        
	//*  12   22:istore_1        
	//*  13   23:iload_1         
	//*  14   24:aload_0         
	//*  15   25:arraylength     
	//*  16   26:icmpge          105
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

	//   26   46:iload_1         
	//   27   47:iconst_1        
	//   28   48:iadd            
	//   29   49:istore_1        
		} else
	//*  30   50:goto            23
		if(animator instanceof AnimatorSet)
	//*  31   53:aload_0         
	//*  32   54:instanceof      #669 <Class AnimatorSet>
	//*  33   57:ifeq            105
		{
			animator = ((Animator) (((AnimatorSet)animator).getChildAnimations()));
	//   34   60:aload_0         
	//   35   61:checkcast       #669 <Class AnimatorSet>
	//   36   64:invokevirtual   #673 <Method ArrayList AnimatorSet.getChildAnimations()>
	//   37   67:astore_0        
			for(int j = 0; j < ((List) (animator)).size(); j++)
	//*  38   68:iconst_0        
	//*  39   69:istore_1        
	//*  40   70:iload_1         
	//*  41   71:aload_0         
	//*  42   72:invokeinterface #676 <Method int List.size()>
	//*  43   77:icmpge          105
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
	//*   1    1:getfield        #250 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//*   2    4:instanceof      #603 <Class AlphaAnimation>
	//*   3    7:ifeq            12
			return true;
	//    4   10:iconst_1        
	//    5   11:ireturn         
		if(animationoranimator.animation instanceof AnimationSet)
	//*   6   12:aload_0         
	//*   7   13:getfield        #250 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//*   8   16:instanceof      #623 <Class AnimationSet>
	//*   9   19:ifeq            69
		{
			animationoranimator = ((AnimationOrAnimator) (((AnimationSet)animationoranimator.animation).getAnimations()));
	//   10   22:aload_0         
	//   11   23:getfield        #250 <Field Animation FragmentManagerImpl$AnimationOrAnimator.animation>
	//   12   26:checkcast       #623 <Class AnimationSet>
	//   13   29:invokevirtual   #684 <Method List AnimationSet.getAnimations()>
	//   14   32:astore_0        
			for(int i = 0; i < ((List) (animationoranimator)).size(); i++)
	//*  15   33:iconst_0        
	//*  16   34:istore_1        
	//*  17   35:iload_1         
	//*  18   36:aload_0         
	//*  19   37:invokeinterface #676 <Method int List.size()>
	//*  20   42:icmpge          67
				if(((List) (animationoranimator)).get(i) instanceof AlphaAnimation)
	//*  21   45:aload_0         
	//*  22   46:iload_1         
	//*  23   47:invokeinterface #677 <Method Object List.get(int)>
	//*  24   52:instanceof      #603 <Class AlphaAnimation>
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
	//   36   70:getfield        #281 <Field Animator FragmentManagerImpl$AnimationOrAnimator.animator>
	//   37   73:invokestatic    #679 <Method boolean modifiesAlpha(Animator)>
	//   38   76:ireturn         
		}
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
		int l = j;
	//    0    0:iload           4
	//    1    2:istore          7
		int k = j - 1;
	//    2    4:iload           4
	//    3    6:iconst_1        
	//    4    7:isub            
	//    5    8:istore          6
		while(k >= i) 
	//*   6   10:iload           6
	//*   7   12:iload_3         
	//*   8   13:icmplt          196
		{
			BackStackRecord backstackrecord = (BackStackRecord)arraylist.get(k);
	//    9   16:aload_1         
	//   10   17:iload           6
	//   11   19:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #363 <Class BackStackRecord>
	//   13   25:astore          11
			boolean flag1 = ((Boolean)arraylist1.get(k)).booleanValue();
	//   14   27:aload_2         
	//   15   28:iload           6
	//   16   30:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   17   33:checkcast       #372 <Class Boolean>
	//   18   36:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//   19   39:istore          10
			int i1;
			boolean flag;
			if(backstackrecord.isPostponed() && !backstackrecord.interactsWith(arraylist, k + 1, j))
	//*  20   41:aload           11
	//*  21   43:invokevirtual   #713 <Method boolean BackStackRecord.isPostponed()>
	//*  22   46:ifeq            181
	//*  23   49:aload           11
	//*  24   51:aload_1         
	//*  25   52:iload           6
	//*  26   54:iconst_1        
	//*  27   55:iadd            
	//*  28   56:iload           4
	//*  29   58:invokevirtual   #542 <Method boolean BackStackRecord.interactsWith(ArrayList, int, int)>
	//*  30   61:ifne            181
				flag = true;
	//   31   64:iconst_1        
	//   32   65:istore          9
			else
	//*  33   67:iload           7
	//*  34   69:istore          8
	//*  35   71:iload           9
	//*  36   73:ifeq            168
	//*  37   76:aload_0         
	//*  38   77:getfield        #521 <Field ArrayList mPostponedTransactions>
	//*  39   80:ifnonnull       94
	//*  40   83:aload_0         
	//*  41   84:new             #161 <Class ArrayList>
	//*  42   87:dup             
	//*  43   88:invokespecial   #162 <Method void ArrayList()>
	//*  44   91:putfield        #521 <Field ArrayList mPostponedTransactions>
	//*  45   94:new             #39  <Class FragmentManagerImpl$StartEnterTransitionListener>
	//*  46   97:dup             
	//*  47   98:aload           11
	//*  48  100:iload           10
	//*  49  102:invokespecial   #716 <Method void FragmentManagerImpl$StartEnterTransitionListener(BackStackRecord, boolean)>
	//*  50  105:astore          12
	//*  51  107:aload_0         
	//*  52  108:getfield        #521 <Field ArrayList mPostponedTransactions>
	//*  53  111:aload           12
	//*  54  113:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//*  55  116:pop             
	//*  56  117:aload           11
	//*  57  119:aload           12
	//*  58  121:invokevirtual   #720 <Method void BackStackRecord.setOnStartPostponedListener(Fragment$OnStartEnterTransitionListener)>
	//*  59  124:iload           10
	//*  60  126:ifeq            187
	//*  61  129:aload           11
	//*  62  131:invokevirtual   #402 <Method void BackStackRecord.executeOps()>
	//*  63  134:iload           7
	//*  64  136:iconst_1        
	//*  65  137:isub            
	//*  66  138:istore          8
	//*  67  140:iload           6
	//*  68  142:iload           8
	//*  69  144:icmpeq          162
	//*  70  147:aload_1         
	//*  71  148:iload           6
	//*  72  150:invokevirtual   #545 <Method Object ArrayList.remove(int)>
	//*  73  153:pop             
	//*  74  154:aload_1         
	//*  75  155:iload           8
	//*  76  157:aload           11
	//*  77  159:invokevirtual   #723 <Method void ArrayList.add(int, Object)>
	//*  78  162:aload_0         
	//*  79  163:aload           5
	//*  80  165:invokespecial   #500 <Method void addAddedFragments(ArraySet)>
	//*  81  168:iload           6
	//*  82  170:iconst_1        
	//*  83  171:isub            
	//*  84  172:istore          6
	//*  85  174:iload           8
	//*  86  176:istore          7
	//*  87  178:goto            10
				flag = false;
	//   88  181:iconst_0        
	//   89  182:istore          9
			i1 = l;
			if(flag)
			{
				if(mPostponedTransactions == null)
					mPostponedTransactions = new ArrayList();
				StartEnterTransitionListener startentertransitionlistener = new StartEnterTransitionListener(backstackrecord, flag1);
				mPostponedTransactions.add(((Object) (startentertransitionlistener)));
				backstackrecord.setOnStartPostponedListener(((Fragment.OnStartEnterTransitionListener) (startentertransitionlistener)));
				if(flag1)
					backstackrecord.executeOps();
				else
	//*  90  184:goto            67
					backstackrecord.executePopOps(false);
	//   91  187:aload           11
	//   92  189:iconst_0        
	//   93  190:invokevirtual   #367 <Method void BackStackRecord.executePopOps(boolean)>
				i1 = l - 1;
				if(k != i1)
				{
					arraylist.remove(k);
					arraylist.add(i1, ((Object) (backstackrecord)));
				}
				addAddedFragments(arrayset);
			}
			k--;
			l = i1;
		}
	//*  94  193:goto            134
		return l;
	//   95  196:iload           7
	//   96  198:ireturn         
	}

	private void removeRedundantOperationsAndExecute(ArrayList arraylist, ArrayList arraylist1)
	{
		if(arraylist != null && !arraylist.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #555 <Method boolean ArrayList.isEmpty()>
	//*   4    8:ifeq            12
	//*   5   11:return          
		{
			if(arraylist1 == null || arraylist.size() != arraylist1.size())
	//*   6   12:aload_2         
	//*   7   13:ifnull          27
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #202 <Method int ArrayList.size()>
	//*  10   20:aload_2         
	//*  11   21:invokevirtual   #202 <Method int ArrayList.size()>
	//*  12   24:icmpeq          38
				throw new IllegalStateException("Internal error with the back stack records");
	//   13   27:new             #331 <Class IllegalStateException>
	//   14   30:dup             
	//   15   31:ldc2            #726 <String "Internal error with the back stack records">
	//   16   34:invokespecial   #336 <Method void IllegalStateException(String)>
	//   17   37:athrow          
			executePostponedTransaction(arraylist, arraylist1);
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:aload_2         
	//   21   41:invokespecial   #463 <Method void executePostponedTransaction(ArrayList, ArrayList)>
			int i1 = arraylist.size();
	//   22   44:aload_1         
	//   23   45:invokevirtual   #202 <Method int ArrayList.size()>
	//   24   48:istore          7
			int k = 0;
	//   25   50:iconst_0        
	//   26   51:istore          5
			for(int i = 0; i < i1;)
	//*  27   53:iconst_0        
	//*  28   54:istore_3        
	//*  29   55:iload_3         
	//*  30   56:iload           7
	//*  31   58:icmpge          211
			{
				int l = i;
	//   32   61:iload_3         
	//   33   62:istore          6
				int j = k;
	//   34   64:iload           5
	//   35   66:istore          4
				if(!((BackStackRecord)arraylist.get(i)).mReorderingAllowed)
	//*  36   68:aload_1         
	//*  37   69:iload_3         
	//*  38   70:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//*  39   73:checkcast       #363 <Class BackStackRecord>
	//*  40   76:getfield        #475 <Field boolean BackStackRecord.mReorderingAllowed>
	//*  41   79:ifne            199
				{
					if(k != i)
	//*  42   82:iload           5
	//*  43   84:iload_3         
	//*  44   85:icmpeq          97
						executeOpsTogether(arraylist, arraylist1, k, i);
	//   45   88:aload_0         
	//   46   89:aload_1         
	//   47   90:aload_2         
	//   48   91:iload           5
	//   49   93:iload_3         
	//   50   94:invokespecial   #728 <Method void executeOpsTogether(ArrayList, ArrayList, int, int)>
					k = i + 1;
	//   51   97:iload_3         
	//   52   98:iconst_1        
	//   53   99:iadd            
	//   54  100:istore          5
					j = k;
	//   55  102:iload           5
	//   56  104:istore          4
					if(((Boolean)arraylist1.get(i)).booleanValue())
	//*  57  106:aload_2         
	//*  58  107:iload_3         
	//*  59  108:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//*  60  111:checkcast       #372 <Class Boolean>
	//*  61  114:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//*  62  117:ifeq            178
						do
						{
							j = k;
	//   63  120:iload           5
	//   64  122:istore          4
							if(k >= i1)
								break;
	//   65  124:iload           5
	//   66  126:iload           7
	//   67  128:icmpge          178
							j = k;
	//   68  131:iload           5
	//   69  133:istore          4
							if(!((Boolean)arraylist1.get(k)).booleanValue())
								break;
	//   70  135:aload_2         
	//   71  136:iload           5
	//   72  138:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   73  141:checkcast       #372 <Class Boolean>
	//   74  144:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//   75  147:ifeq            178
							j = k;
	//   76  150:iload           5
	//   77  152:istore          4
							if(((BackStackRecord)arraylist.get(k)).mReorderingAllowed)
								break;
	//   78  154:aload_1         
	//   79  155:iload           5
	//   80  157:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   81  160:checkcast       #363 <Class BackStackRecord>
	//   82  163:getfield        #475 <Field boolean BackStackRecord.mReorderingAllowed>
	//   83  166:ifne            178
							k++;
	//   84  169:iload           5
	//   85  171:iconst_1        
	//   86  172:iadd            
	//   87  173:istore          5
						} while(true);
	//   88  175:goto            120
					executeOpsTogether(arraylist, arraylist1, i, j);
	//   89  178:aload_0         
	//   90  179:aload_1         
	//   91  180:aload_2         
	//   92  181:iload_3         
	//   93  182:iload           4
	//   94  184:invokespecial   #728 <Method void executeOpsTogether(ArrayList, ArrayList, int, int)>
					i = j;
	//   95  187:iload           4
	//   96  189:istore_3        
					l = j - 1;
	//   97  190:iload           4
	//   98  192:iconst_1        
	//   99  193:isub            
	//  100  194:istore          6
					j = i;
	//  101  196:iload_3         
	//  102  197:istore          4
				}
				i = l + 1;
	//  103  199:iload           6
	//  104  201:iconst_1        
	//  105  202:iadd            
	//  106  203:istore_3        
				k = j;
	//  107  204:iload           4
	//  108  206:istore          5
			}

	//* 109  208:goto            55
			if(k != i1)
	//* 110  211:iload           5
	//* 111  213:iload           7
	//* 112  215:icmpeq          11
			{
				executeOpsTogether(arraylist, arraylist1, k, i1);
	//  113  218:aload_0         
	//  114  219:aload_1         
	//  115  220:aload_2         
	//  116  221:iload           5
	//  117  223:iload           7
	//  118  225:invokespecial   #728 <Method void executeOpsTogether(ArrayList, ArrayList, int, int)>
				return;
	//  119  228:return          
			}
		}
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
		for(int i = 0; i < mAdded.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #164 <Field ArrayList mAdded>
	//*   5    7:invokevirtual   #202 <Method int ArrayList.size()>
	//*   6   10:icmpge          46
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #164 <Field ArrayList mAdded>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #208 <Class Fragment>
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
	//    3    4:astore          6
		for(int i = 0; i < mAdded.size();)
	//*   4    6:iconst_0        
	//*   5    7:istore_3        
	//*   6    8:iload_3         
	//*   7    9:aload_0         
	//*   8   10:getfield        #164 <Field ArrayList mAdded>
	//*   9   13:invokevirtual   #202 <Method int ArrayList.size()>
	//*  10   16:icmpge          107
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//   11   19:aload_0         
	//   12   20:getfield        #164 <Field ArrayList mAdded>
	//   13   23:iload_3         
	//   14   24:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   15   27:checkcast       #208 <Class Fragment>
	//   16   30:astore          8
			ArrayList arraylist1 = arraylist;
	//   17   32:aload           6
	//   18   34:astore          7
			boolean flag1 = flag;
	//   19   36:iload           4
	//   20   38:istore          5
			if(fragment != null)
	//*  21   40:aload           8
	//*  22   42:ifnull          92
			{
				arraylist1 = arraylist;
	//   23   45:aload           6
	//   24   47:astore          7
				flag1 = flag;
	//   25   49:iload           4
	//   26   51:istore          5
				if(fragment.performCreateOptionsMenu(menu, menuinflater))
	//*  27   53:aload           8
	//*  28   55:aload_1         
	//*  29   56:aload_2         
	//*  30   57:invokevirtual   #961 <Method boolean Fragment.performCreateOptionsMenu(Menu, MenuInflater)>
	//*  31   60:ifeq            92
				{
					flag1 = true;
	//   32   63:iconst_1        
	//   33   64:istore          5
					arraylist1 = arraylist;
	//   34   66:aload           6
	//   35   68:astore          7
					if(arraylist == null)
	//*  36   70:aload           6
	//*  37   72:ifnonnull       84
						arraylist1 = new ArrayList();
	//   38   75:new             #161 <Class ArrayList>
	//   39   78:dup             
	//   40   79:invokespecial   #162 <Method void ArrayList()>
	//   41   82:astore          7
					arraylist1.add(((Object) (fragment)));
	//   42   84:aload           7
	//   43   86:aload           8
	//   44   88:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//   45   91:pop             
				}
			}
			i++;
	//   46   92:iload_3         
	//   47   93:iconst_1        
	//   48   94:iadd            
	//   49   95:istore_3        
			arraylist = arraylist1;
	//   50   96:aload           7
	//   51   98:astore          6
			flag = flag1;
	//   52  100:iload           5
	//   53  102:istore          4
		}

	//*  54  104:goto            8
		if(mCreatedMenus != null)
	//*  55  107:aload_0         
	//*  56  108:getfield        #963 <Field ArrayList mCreatedMenus>
	//*  57  111:ifnull          164
		{
			for(int j = 0; j < mCreatedMenus.size(); j++)
	//*  58  114:iconst_0        
	//*  59  115:istore_3        
	//*  60  116:iload_3         
	//*  61  117:aload_0         
	//*  62  118:getfield        #963 <Field ArrayList mCreatedMenus>
	//*  63  121:invokevirtual   #202 <Method int ArrayList.size()>
	//*  64  124:icmpge          164
			{
				menu = ((Menu) ((Fragment)mCreatedMenus.get(j)));
	//   65  127:aload_0         
	//   66  128:getfield        #963 <Field ArrayList mCreatedMenus>
	//   67  131:iload_3         
	//   68  132:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   69  135:checkcast       #208 <Class Fragment>
	//   70  138:astore_1        
				if(arraylist == null || !arraylist.contains(((Object) (menu))))
	//*  71  139:aload           6
	//*  72  141:ifnull          153
	//*  73  144:aload           6
	//*  74  146:aload_1         
	//*  75  147:invokevirtual   #849 <Method boolean ArrayList.contains(Object)>
	//*  76  150:ifne            157
					((Fragment) (menu)).onDestroyOptionsMenu();
	//   77  153:aload_1         
	//   78  154:invokevirtual   #966 <Method void Fragment.onDestroyOptionsMenu()>
			}

	//   79  157:iload_3         
	//   80  158:iconst_1        
	//   81  159:iadd            
	//   82  160:istore_3        
		}
	//*  83  161:goto            116
		mCreatedMenus = arraylist;
	//   84  164:aload_0         
	//   85  165:aload           6
	//   86  167:putfield        #963 <Field ArrayList mCreatedMenus>
		return flag;
	//   87  170:iload           4
	//   88  172:ireturn         
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
		for(int i = 0; i < mAdded.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #164 <Field ArrayList mAdded>
	//*   5    7:invokevirtual   #202 <Method int ArrayList.size()>
	//*   6   10:icmpge          46
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #164 <Field ArrayList mAdded>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #208 <Class Fragment>
	//   12   24:astore_3        
			if(fragment != null && fragment.performOptionsItemSelected(menuitem))
	//*  13   25:aload_3         
	//*  14   26:ifnull          39
	//*  15   29:aload_3         
	//*  16   30:aload_1         
	//*  17   31:invokevirtual   #1088 <Method boolean Fragment.performOptionsItemSelected(MenuItem)>
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
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		for(int i = 0; i < mAdded.size();)
	//*   2    2:iconst_0        
	//*   3    3:istore_2        
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
			boolean flag1 = flag;
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
			flag = flag1;
	//   31   55:iload           4
	//   32   57:istore_3        
		}

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
			boolean flag = false;
	//    3    7:iconst_0        
	//    4    8:istore_2        
			for(int i = 0; i < mActive.size();)
	//*   5    9:iconst_0        
	//*   6   10:istore_1        
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
				boolean flag1 = flag;
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
				flag = flag1;
	//   37   67:iload_3         
	//   38   68:istore_2        
			}

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
		String s1 = (new StringBuilder()).append(s).append("    ").toString();
	//    0    0:new             #340 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #341 <Method void StringBuilder()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//    5   11:ldc2            #1123 <String "    ">
	//    6   14:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:invokevirtual   #351 <Method String StringBuilder.toString()>
	//    8   20:astore          7
		if(mActive != null)
	//*   9   22:aload_0         
	//*  10   23:getfield        #313 <Field SparseArray mActive>
	//*  11   26:ifnull          153
		{
			int k1 = mActive.size();
	//   12   29:aload_0         
	//   13   30:getfield        #313 <Field SparseArray mActive>
	//   14   33:invokevirtual   #316 <Method int SparseArray.size()>
	//   15   36:istore          6
			if(k1 > 0)
	//*  16   38:iload           6
	//*  17   40:ifle            153
			{
				printwriter.print(s);
	//   18   43:aload_3         
	//   19   44:aload_1         
	//   20   45:invokevirtual   #1126 <Method void PrintWriter.print(String)>
				printwriter.print("Active Fragments in ");
	//   21   48:aload_3         
	//   22   49:ldc2            #1128 <String "Active Fragments in ">
	//   23   52:invokevirtual   #1126 <Method void PrintWriter.print(String)>
				printwriter.print(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//   24   55:aload_3         
	//   25   56:aload_0         
	//   26   57:invokestatic    #1133 <Method int System.identityHashCode(Object)>
	//   27   60:invokestatic    #1137 <Method String Integer.toHexString(int)>
	//   28   63:invokevirtual   #1126 <Method void PrintWriter.print(String)>
				printwriter.println(":");
	//   29   66:aload_3         
	//   30   67:ldc2            #1139 <String ":">
	//   31   70:invokevirtual   #1142 <Method void PrintWriter.println(String)>
				for(int i = 0; i < k1; i++)
	//*  32   73:iconst_0        
	//*  33   74:istore          5
	//*  34   76:iload           5
	//*  35   78:iload           6
	//*  36   80:icmpge          153
				{
					Fragment fragment = (Fragment)mActive.valueAt(i);
	//   37   83:aload_0         
	//   38   84:getfield        #313 <Field SparseArray mActive>
	//   39   87:iload           5
	//   40   89:invokevirtual   #319 <Method Object SparseArray.valueAt(int)>
	//   41   92:checkcast       #208 <Class Fragment>
	//   42   95:astore          8
					printwriter.print(s);
	//   43   97:aload_3         
	//   44   98:aload_1         
	//   45   99:invokevirtual   #1126 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//   46  102:aload_3         
	//   47  103:ldc2            #1144 <String "  #">
	//   48  106:invokevirtual   #1126 <Method void PrintWriter.print(String)>
					printwriter.print(i);
	//   49  109:aload_3         
	//   50  110:iload           5
	//   51  112:invokevirtual   #1146 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//   52  115:aload_3         
	//   53  116:ldc2            #1148 <String ": ">
	//   54  119:invokevirtual   #1126 <Method void PrintWriter.print(String)>
					printwriter.println(((Object) (fragment)));
	//   55  122:aload_3         
	//   56  123:aload           8
	//   57  125:invokevirtual   #1150 <Method void PrintWriter.println(Object)>
					if(fragment != null)
	//*  58  128:aload           8
	//*  59  130:ifnull          144
						fragment.dump(s1, filedescriptor, printwriter, as);
	//   60  133:aload           8
	//   61  135:aload           7
	//   62  137:aload_2         
	//   63  138:aload_3         
	//   64  139:aload           4
	//   65  141:invokevirtual   #1151 <Method void Fragment.dump(String, FileDescriptor, PrintWriter, String[])>
				}

	//   66  144:iload           5
	//   67  146:iconst_1        
	//   68  147:iadd            
	//   69  148:istore          5
			}
		}
	//*  70  150:goto            76
		int l1 = mAdded.size();
	//   71  153:aload_0         
	//   72  154:getfield        #164 <Field ArrayList mAdded>
	//   73  157:invokevirtual   #202 <Method int ArrayList.size()>
	//   74  160:istore          6
		if(l1 > 0)
	//*  75  162:iload           6
	//*  76  164:ifle            246
		{
			printwriter.print(s);
	//   77  167:aload_3         
	//   78  168:aload_1         
	//   79  169:invokevirtual   #1126 <Method void PrintWriter.print(String)>
			printwriter.println("Added Fragments:");
	//   80  172:aload_3         
	//   81  173:ldc2            #1153 <String "Added Fragments:">
	//   82  176:invokevirtual   #1142 <Method void PrintWriter.println(String)>
			for(int j = 0; j < l1; j++)
	//*  83  179:iconst_0        
	//*  84  180:istore          5
	//*  85  182:iload           5
	//*  86  184:iload           6
	//*  87  186:icmpge          246
			{
				Fragment fragment1 = (Fragment)mAdded.get(j);
	//   88  189:aload_0         
	//   89  190:getfield        #164 <Field ArrayList mAdded>
	//   90  193:iload           5
	//   91  195:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   92  198:checkcast       #208 <Class Fragment>
	//   93  201:astore          8
				printwriter.print(s);
	//   94  203:aload_3         
	//   95  204:aload_1         
	//   96  205:invokevirtual   #1126 <Method void PrintWriter.print(String)>
				printwriter.print("  #");
	//   97  208:aload_3         
	//   98  209:ldc2            #1144 <String "  #">
	//   99  212:invokevirtual   #1126 <Method void PrintWriter.print(String)>
				printwriter.print(j);
	//  100  215:aload_3         
	//  101  216:iload           5
	//  102  218:invokevirtual   #1146 <Method void PrintWriter.print(int)>
				printwriter.print(": ");
	//  103  221:aload_3         
	//  104  222:ldc2            #1148 <String ": ">
	//  105  225:invokevirtual   #1126 <Method void PrintWriter.print(String)>
				printwriter.println(fragment1.toString());
	//  106  228:aload_3         
	//  107  229:aload           8
	//  108  231:invokevirtual   #1154 <Method String Fragment.toString()>
	//  109  234:invokevirtual   #1142 <Method void PrintWriter.println(String)>
			}

	//  110  237:iload           5
	//  111  239:iconst_1        
	//  112  240:iadd            
	//  113  241:istore          5
		}
	//* 114  243:goto            182
		if(mCreatedMenus != null)
	//* 115  246:aload_0         
	//* 116  247:getfield        #963 <Field ArrayList mCreatedMenus>
	//* 117  250:ifnull          346
		{
			int i2 = mCreatedMenus.size();
	//  118  253:aload_0         
	//  119  254:getfield        #963 <Field ArrayList mCreatedMenus>
	//  120  257:invokevirtual   #202 <Method int ArrayList.size()>
	//  121  260:istore          6
			if(i2 > 0)
	//* 122  262:iload           6
	//* 123  264:ifle            346
			{
				printwriter.print(s);
	//  124  267:aload_3         
	//  125  268:aload_1         
	//  126  269:invokevirtual   #1126 <Method void PrintWriter.print(String)>
				printwriter.println("Fragments Created Menus:");
	//  127  272:aload_3         
	//  128  273:ldc2            #1156 <String "Fragments Created Menus:">
	//  129  276:invokevirtual   #1142 <Method void PrintWriter.println(String)>
				for(int k = 0; k < i2; k++)
	//* 130  279:iconst_0        
	//* 131  280:istore          5
	//* 132  282:iload           5
	//* 133  284:iload           6
	//* 134  286:icmpge          346
				{
					Fragment fragment2 = (Fragment)mCreatedMenus.get(k);
	//  135  289:aload_0         
	//  136  290:getfield        #963 <Field ArrayList mCreatedMenus>
	//  137  293:iload           5
	//  138  295:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//  139  298:checkcast       #208 <Class Fragment>
	//  140  301:astore          8
					printwriter.print(s);
	//  141  303:aload_3         
	//  142  304:aload_1         
	//  143  305:invokevirtual   #1126 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//  144  308:aload_3         
	//  145  309:ldc2            #1144 <String "  #">
	//  146  312:invokevirtual   #1126 <Method void PrintWriter.print(String)>
					printwriter.print(k);
	//  147  315:aload_3         
	//  148  316:iload           5
	//  149  318:invokevirtual   #1146 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//  150  321:aload_3         
	//  151  322:ldc2            #1148 <String ": ">
	//  152  325:invokevirtual   #1126 <Method void PrintWriter.print(String)>
					printwriter.println(fragment2.toString());
	//  153  328:aload_3         
	//  154  329:aload           8
	//  155  331:invokevirtual   #1154 <Method String Fragment.toString()>
	//  156  334:invokevirtual   #1142 <Method void PrintWriter.println(String)>
				}

	//  157  337:iload           5
	//  158  339:iconst_1        
	//  159  340:iadd            
	//  160  341:istore          5
			}
		}
	//* 161  343:goto            282
		if(mBackStack != null)
	//* 162  346:aload_0         
	//* 163  347:getfield        #829 <Field ArrayList mBackStack>
	//* 164  350:ifnull          457
		{
			int j2 = mBackStack.size();
	//  165  353:aload_0         
	//  166  354:getfield        #829 <Field ArrayList mBackStack>
	//  167  357:invokevirtual   #202 <Method int ArrayList.size()>
	//  168  360:istore          6
			if(j2 > 0)
	//* 169  362:iload           6
	//* 170  364:ifle            457
			{
				printwriter.print(s);
	//  171  367:aload_3         
	//  172  368:aload_1         
	//  173  369:invokevirtual   #1126 <Method void PrintWriter.print(String)>
				printwriter.println("Back Stack:");
	//  174  372:aload_3         
	//  175  373:ldc2            #1158 <String "Back Stack:">
	//  176  376:invokevirtual   #1142 <Method void PrintWriter.println(String)>
				for(int l = 0; l < j2; l++)
	//* 177  379:iconst_0        
	//* 178  380:istore          5
	//* 179  382:iload           5
	//* 180  384:iload           6
	//* 181  386:icmpge          457
				{
					BackStackRecord backstackrecord = (BackStackRecord)mBackStack.get(l);
	//  182  389:aload_0         
	//  183  390:getfield        #829 <Field ArrayList mBackStack>
	//  184  393:iload           5
	//  185  395:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//  186  398:checkcast       #363 <Class BackStackRecord>
	//  187  401:astore          8
					printwriter.print(s);
	//  188  403:aload_3         
	//  189  404:aload_1         
	//  190  405:invokevirtual   #1126 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//  191  408:aload_3         
	//  192  409:ldc2            #1144 <String "  #">
	//  193  412:invokevirtual   #1126 <Method void PrintWriter.print(String)>
					printwriter.print(l);
	//  194  415:aload_3         
	//  195  416:iload           5
	//  196  418:invokevirtual   #1146 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//  197  421:aload_3         
	//  198  422:ldc2            #1148 <String ": ">
	//  199  425:invokevirtual   #1126 <Method void PrintWriter.print(String)>
					printwriter.println(backstackrecord.toString());
	//  200  428:aload_3         
	//  201  429:aload           8
	//  202  431:invokevirtual   #1159 <Method String BackStackRecord.toString()>
	//  203  434:invokevirtual   #1142 <Method void PrintWriter.println(String)>
					backstackrecord.dump(s1, filedescriptor, printwriter, as);
	//  204  437:aload           8
	//  205  439:aload           7
	//  206  441:aload_2         
	//  207  442:aload_3         
	//  208  443:aload           4
	//  209  445:invokevirtual   #1160 <Method void BackStackRecord.dump(String, FileDescriptor, PrintWriter, String[])>
				}

	//  210  448:iload           5
	//  211  450:iconst_1        
	//  212  451:iadd            
	//  213  452:istore          5
			}
		}
	//* 214  454:goto            382
		this;
	//  215  457:aload_0         
		JVM INSTR monitorenter ;
	//  216  458:monitorenter    
		if(mBackStackIndices == null) goto _L2; else goto _L1
	//  217  459:aload_0         
	//  218  460:getfield        #877 <Field ArrayList mBackStackIndices>
	//  219  463:ifnull          554
_L1:
		int k2 = mBackStackIndices.size();
	//  220  466:aload_0         
	//  221  467:getfield        #877 <Field ArrayList mBackStackIndices>
	//  222  470:invokevirtual   #202 <Method int ArrayList.size()>
	//  223  473:istore          6
		if(k2 <= 0) goto _L2; else goto _L3
	//  224  475:iload           6
	//  225  477:ifle            554
_L3:
		printwriter.print(s);
	//  226  480:aload_3         
	//  227  481:aload_1         
	//  228  482:invokevirtual   #1126 <Method void PrintWriter.print(String)>
		printwriter.println("Back Stack Indices:");
	//  229  485:aload_3         
	//  230  486:ldc2            #1162 <String "Back Stack Indices:">
	//  231  489:invokevirtual   #1142 <Method void PrintWriter.println(String)>
		int i1 = 0;
	//  232  492:iconst_0        
	//  233  493:istore          5
_L4:
		if(i1 >= k2)
			break; /* Loop/switch isn't completed */
	//  234  495:iload           5
	//  235  497:iload           6
	//  236  499:icmpge          554
		filedescriptor = ((FileDescriptor) ((BackStackRecord)mBackStackIndices.get(i1)));
	//  237  502:aload_0         
	//  238  503:getfield        #877 <Field ArrayList mBackStackIndices>
	//  239  506:iload           5
	//  240  508:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//  241  511:checkcast       #363 <Class BackStackRecord>
	//  242  514:astore_2        
		printwriter.print(s);
	//  243  515:aload_3         
	//  244  516:aload_1         
	//  245  517:invokevirtual   #1126 <Method void PrintWriter.print(String)>
		printwriter.print("  #");
	//  246  520:aload_3         
	//  247  521:ldc2            #1144 <String "  #">
	//  248  524:invokevirtual   #1126 <Method void PrintWriter.print(String)>
		printwriter.print(i1);
	//  249  527:aload_3         
	//  250  528:iload           5
	//  251  530:invokevirtual   #1146 <Method void PrintWriter.print(int)>
		printwriter.print(": ");
	//  252  533:aload_3         
	//  253  534:ldc2            #1148 <String ": ">
	//  254  537:invokevirtual   #1126 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (filedescriptor)));
	//  255  540:aload_3         
	//  256  541:aload_2         
	//  257  542:invokevirtual   #1150 <Method void PrintWriter.println(Object)>
		i1++;
	//  258  545:iload           5
	//  259  547:iconst_1        
	//  260  548:iadd            
	//  261  549:istore          5
		if(true) goto _L4; else goto _L2
	//  262  551:goto            495
_L2:
		if(mAvailBackStackIndices != null && mAvailBackStackIndices.size() > 0)
	//* 263  554:aload_0         
	//* 264  555:getfield        #875 <Field ArrayList mAvailBackStackIndices>
	//* 265  558:ifnull          597
	//* 266  561:aload_0         
	//* 267  562:getfield        #875 <Field ArrayList mAvailBackStackIndices>
	//* 268  565:invokevirtual   #202 <Method int ArrayList.size()>
	//* 269  568:ifle            597
		{
			printwriter.print(s);
	//  270  571:aload_3         
	//  271  572:aload_1         
	//  272  573:invokevirtual   #1126 <Method void PrintWriter.print(String)>
			printwriter.print("mAvailBackStackIndices: ");
	//  273  576:aload_3         
	//  274  577:ldc2            #1164 <String "mAvailBackStackIndices: ">
	//  275  580:invokevirtual   #1126 <Method void PrintWriter.print(String)>
			printwriter.println(Arrays.toString(mAvailBackStackIndices.toArray()));
	//  276  583:aload_3         
	//  277  584:aload_0         
	//  278  585:getfield        #875 <Field ArrayList mAvailBackStackIndices>
	//  279  588:invokevirtual   #1168 <Method Object[] ArrayList.toArray()>
	//  280  591:invokestatic    #1173 <Method String Arrays.toString(Object[])>
	//  281  594:invokevirtual   #1142 <Method void PrintWriter.println(String)>
		}
		this;
	//  282  597:aload_0         
		JVM INSTR monitorexit ;
	//  283  598:monitorexit     
		if(mPendingActions != null)
	//* 284  599:aload_0         
	//* 285  600:getfield        #559 <Field ArrayList mPendingActions>
	//* 286  603:ifnull          699
		{
			int l2 = mPendingActions.size();
	//  287  606:aload_0         
	//  288  607:getfield        #559 <Field ArrayList mPendingActions>
	//  289  610:invokevirtual   #202 <Method int ArrayList.size()>
	//  290  613:istore          6
			if(l2 > 0)
	//* 291  615:iload           6
	//* 292  617:ifle            699
			{
				printwriter.print(s);
	//  293  620:aload_3         
	//  294  621:aload_1         
	//  295  622:invokevirtual   #1126 <Method void PrintWriter.print(String)>
				printwriter.println("Pending Actions:");
	//  296  625:aload_3         
	//  297  626:ldc2            #1175 <String "Pending Actions:">
	//  298  629:invokevirtual   #1142 <Method void PrintWriter.println(String)>
				for(int j1 = 0; j1 < l2; j1++)
	//* 299  632:iconst_0        
	//* 300  633:istore          5
	//* 301  635:iload           5
	//* 302  637:iload           6
	//* 303  639:icmpge          699
				{
					filedescriptor = ((FileDescriptor) ((OpGenerator)mPendingActions.get(j1)));
	//  304  642:aload_0         
	//  305  643:getfield        #559 <Field ArrayList mPendingActions>
	//  306  646:iload           5
	//  307  648:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//  308  651:checkcast       #33  <Class FragmentManagerImpl$OpGenerator>
	//  309  654:astore_2        
					printwriter.print(s);
	//  310  655:aload_3         
	//  311  656:aload_1         
	//  312  657:invokevirtual   #1126 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//  313  660:aload_3         
	//  314  661:ldc2            #1144 <String "  #">
	//  315  664:invokevirtual   #1126 <Method void PrintWriter.print(String)>
					printwriter.print(j1);
	//  316  667:aload_3         
	//  317  668:iload           5
	//  318  670:invokevirtual   #1146 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//  319  673:aload_3         
	//  320  674:ldc2            #1148 <String ": ">
	//  321  677:invokevirtual   #1126 <Method void PrintWriter.print(String)>
					printwriter.println(((Object) (filedescriptor)));
	//  322  680:aload_3         
	//  323  681:aload_2         
	//  324  682:invokevirtual   #1150 <Method void PrintWriter.println(Object)>
				}

	//  325  685:iload           5
	//  326  687:iconst_1        
	//  327  688:iadd            
	//  328  689:istore          5
			}
		}
		break MISSING_BLOCK_LABEL_699;
	//  329  691:goto            635
		s;
	//  330  694:astore_1        
		this;
	//  331  695:aload_0         
		JVM INSTR monitorexit ;
	//  332  696:monitorexit     
		throw s;
	//  333  697:aload_1         
	//  334  698:athrow          
		printwriter.print(s);
	//  335  699:aload_3         
	//  336  700:aload_1         
	//  337  701:invokevirtual   #1126 <Method void PrintWriter.print(String)>
		printwriter.println("FragmentManager misc state:");
	//  338  704:aload_3         
	//  339  705:ldc2            #1177 <String "FragmentManager misc state:">
	//  340  708:invokevirtual   #1142 <Method void PrintWriter.println(String)>
		printwriter.print(s);
	//  341  711:aload_3         
	//  342  712:aload_1         
	//  343  713:invokevirtual   #1126 <Method void PrintWriter.print(String)>
		printwriter.print("  mHost=");
	//  344  716:aload_3         
	//  345  717:ldc2            #1179 <String "  mHost=">
	//  346  720:invokevirtual   #1126 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (mHost)));
	//  347  723:aload_3         
	//  348  724:aload_0         
	//  349  725:getfield        #444 <Field FragmentHostCallback mHost>
	//  350  728:invokevirtual   #1150 <Method void PrintWriter.println(Object)>
		printwriter.print(s);
	//  351  731:aload_3         
	//  352  732:aload_1         
	//  353  733:invokevirtual   #1126 <Method void PrintWriter.print(String)>
		printwriter.print("  mContainer=");
	//  354  736:aload_3         
	//  355  737:ldc2            #1181 <String "  mContainer=">
	//  356  740:invokevirtual   #1126 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (mContainer)));
	//  357  743:aload_3         
	//  358  744:aload_0         
	//  359  745:getfield        #903 <Field FragmentContainer mContainer>
	//  360  748:invokevirtual   #1150 <Method void PrintWriter.println(Object)>
		if(mParent != null)
	//* 361  751:aload_0         
	//* 362  752:getfield        #905 <Field Fragment mParent>
	//* 363  755:ifnull          778
		{
			printwriter.print(s);
	//  364  758:aload_3         
	//  365  759:aload_1         
	//  366  760:invokevirtual   #1126 <Method void PrintWriter.print(String)>
			printwriter.print("  mParent=");
	//  367  763:aload_3         
	//  368  764:ldc2            #1183 <String "  mParent=">
	//  369  767:invokevirtual   #1126 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mParent)));
	//  370  770:aload_3         
	//  371  771:aload_0         
	//  372  772:getfield        #905 <Field Fragment mParent>
	//  373  775:invokevirtual   #1150 <Method void PrintWriter.println(Object)>
		}
		printwriter.print(s);
	//  374  778:aload_3         
	//  375  779:aload_1         
	//  376  780:invokevirtual   #1126 <Method void PrintWriter.print(String)>
		printwriter.print("  mCurState=");
	//  377  783:aload_3         
	//  378  784:ldc2            #1185 <String "  mCurState=">
	//  379  787:invokevirtual   #1126 <Method void PrintWriter.print(String)>
		printwriter.print(mCurState);
	//  380  790:aload_3         
	//  381  791:aload_0         
	//  382  792:getfield        #171 <Field int mCurState>
	//  383  795:invokevirtual   #1146 <Method void PrintWriter.print(int)>
		printwriter.print(" mStateSaved=");
	//  384  798:aload_3         
	//  385  799:ldc2            #1187 <String " mStateSaved=">
	//  386  802:invokevirtual   #1126 <Method void PrintWriter.print(String)>
		printwriter.print(mStateSaved);
	//  387  805:aload_3         
	//  388  806:aload_0         
	//  389  807:getfield        #329 <Field boolean mStateSaved>
	//  390  810:invokevirtual   #1189 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mDestroyed=");
	//  391  813:aload_3         
	//  392  814:ldc2            #1191 <String " mDestroyed=">
	//  393  817:invokevirtual   #1126 <Method void PrintWriter.print(String)>
		printwriter.println(mDestroyed);
	//  394  820:aload_3         
	//  395  821:aload_0         
	//  396  822:getfield        #969 <Field boolean mDestroyed>
	//  397  825:invokevirtual   #1193 <Method void PrintWriter.println(boolean)>
		if(mNeedMenuInvalidate)
	//* 398  828:aload_0         
	//* 399  829:getfield        #865 <Field boolean mNeedMenuInvalidate>
	//* 400  832:ifeq            855
		{
			printwriter.print(s);
	//  401  835:aload_3         
	//  402  836:aload_1         
	//  403  837:invokevirtual   #1126 <Method void PrintWriter.print(String)>
			printwriter.print("  mNeedMenuInvalidate=");
	//  404  840:aload_3         
	//  405  841:ldc2            #1195 <String "  mNeedMenuInvalidate=">
	//  406  844:invokevirtual   #1126 <Method void PrintWriter.print(String)>
			printwriter.println(mNeedMenuInvalidate);
	//  407  847:aload_3         
	//  408  848:aload_0         
	//  409  849:getfield        #865 <Field boolean mNeedMenuInvalidate>
	//  410  852:invokevirtual   #1193 <Method void PrintWriter.println(boolean)>
		}
		if(mNoTransactionsBecause != null)
	//* 411  855:aload_0         
	//* 412  856:getfield        #338 <Field String mNoTransactionsBecause>
	//* 413  859:ifnull          882
		{
			printwriter.print(s);
	//  414  862:aload_3         
	//  415  863:aload_1         
	//  416  864:invokevirtual   #1126 <Method void PrintWriter.print(String)>
			printwriter.print("  mNoTransactionsBecause=");
	//  417  867:aload_3         
	//  418  868:ldc2            #1197 <String "  mNoTransactionsBecause=">
	//  419  871:invokevirtual   #1126 <Method void PrintWriter.print(String)>
			printwriter.println(mNoTransactionsBecause);
	//  420  874:aload_3         
	//  421  875:aload_0         
	//  422  876:getfield        #338 <Field String mNoTransactionsBecause>
	//  423  879:invokevirtual   #1142 <Method void PrintWriter.println(String)>
		}
		return;
	//  424  882:return          
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
	//    2    4:istore          7
		Animation animation = fragment.onCreateAnimation(i, flag, k);
	//    3    6:aload_1         
	//    4    7:iload_2         
	//    5    8:iload_3         
	//    6    9:iload           7
	//    7   11:invokevirtual   #1299 <Method Animation Fragment.onCreateAnimation(int, boolean, int)>
	//    8   14:astore          9
		if(animation != null)
	//*   9   16:aload           9
	//*  10   18:ifnull          32
			return new AnimationOrAnimator(animation);
	//   11   21:new             #24  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   12   24:dup             
	//   13   25:aload           9
	//   14   27:aconst_null     
	//   15   28:invokespecial   #619 <Method void FragmentManagerImpl$AnimationOrAnimator(Animation, FragmentManagerImpl$1)>
	//   16   31:areturn         
		fragment = ((Fragment) (fragment.onCreateAnimator(i, flag, k)));
	//   17   32:aload_1         
	//   18   33:iload_2         
	//   19   34:iload_3         
	//   20   35:iload           7
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
	//   31   55:iload           7
	//   32   57:ifeq            199
_L1:
		boolean flag1;
		boolean flag2;
		boolean flag3;
		flag3 = "anim".equals(((Object) (mHost.getContext().getResources().getResourceTypeName(k))));
	//   33   60:ldc2            #1308 <String "anim">
	//   34   63:aload_0         
	//   35   64:getfield        #444 <Field FragmentHostCallback mHost>
	//   36   67:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//   37   70:invokevirtual   #1318 <Method Resources Context.getResources()>
	//   38   73:iload           7
	//   39   75:invokevirtual   #1323 <Method String Resources.getResourceTypeName(int)>
	//   40   78:invokevirtual   #667 <Method boolean String.equals(Object)>
	//   41   81:istore          8
		flag2 = false;
	//   42   83:iconst_0        
	//   43   84:istore          6
		flag1 = flag2;
	//   44   86:iload           6
	//   45   88:istore          5
		if(!flag3)
			break MISSING_BLOCK_LABEL_130;
	//   46   90:iload           8
	//   47   92:ifeq            130
		fragment = ((Fragment) (AnimationUtils.loadAnimation(mHost.getContext(), k)));
	//   48   95:aload_0         
	//   49   96:getfield        #444 <Field FragmentHostCallback mHost>
	//   50   99:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//   51  102:iload           7
	//   52  104:invokestatic    #1328 <Method Animation AnimationUtils.loadAnimation(Context, int)>
	//   53  107:astore_1        
		if(fragment == null)
			break MISSING_BLOCK_LABEL_127;
	//   54  108:aload_1         
	//   55  109:ifnull          127
		fragment = ((Fragment) (new AnimationOrAnimator(((Animation) (fragment)))));
	//   56  112:new             #24  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   57  115:dup             
	//   58  116:aload_1         
	//   59  117:aconst_null     
	//   60  118:invokespecial   #619 <Method void FragmentManagerImpl$AnimationOrAnimator(Animation, FragmentManagerImpl$1)>
	//   61  121:astore_1        
		return ((AnimationOrAnimator) (fragment));
	//   62  122:aload_1         
	//   63  123:areturn         
		fragment;
	//   64  124:astore_1        
		throw fragment;
	//   65  125:aload_1         
	//   66  126:athrow          
		flag1 = true;
	//   67  127:iconst_1        
	//   68  128:istore          5
_L6:
		if(flag1) goto _L2; else goto _L3
	//   69  130:iload           5
	//   70  132:ifne            199
_L3:
		fragment = ((Fragment) (AnimatorInflater.loadAnimator(mHost.getContext(), k)));
	//   71  135:aload_0         
	//   72  136:getfield        #444 <Field FragmentHostCallback mHost>
	//   73  139:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//   74  142:iload           7
	//   75  144:invokestatic    #1334 <Method Animator AnimatorInflater.loadAnimator(Context, int)>
	//   76  147:astore_1        
		if(fragment == null) goto _L2; else goto _L4
	//   77  148:aload_1         
	//   78  149:ifnull          199
_L4:
		fragment = ((Fragment) (new AnimationOrAnimator(((Animator) (fragment)))));
	//   79  152:new             #24  <Class FragmentManagerImpl$AnimationOrAnimator>
	//   80  155:dup             
	//   81  156:aload_1         
	//   82  157:aconst_null     
	//   83  158:invokespecial   #1306 <Method void FragmentManagerImpl$AnimationOrAnimator(Animator, FragmentManagerImpl$1)>
	//   84  161:astore_1        
		return ((AnimationOrAnimator) (fragment));
	//   85  162:aload_1         
	//   86  163:areturn         
		fragment;
	//   87  164:astore_1        
		if(flag3)
	//*  88  165:iload           8
	//*  89  167:ifeq            172
			throw fragment;
	//   90  170:aload_1         
	//   91  171:athrow          
		fragment = ((Fragment) (AnimationUtils.loadAnimation(mHost.getContext(), k)));
	//   92  172:aload_0         
	//   93  173:getfield        #444 <Field FragmentHostCallback mHost>
	//   94  176:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//   95  179:iload           7
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
		fragment;
	//  190  387:astore_1        
		flag1 = flag2;
	//  191  388:iload           6
	//  192  390:istore          5
		if(true) goto _L6; else goto _L5
	//  193  392:goto            130
_L5:
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
		if(flag || i != mCurState) goto _L2; else goto _L1
	//   10   22:iload_2         
	//   11   23:ifne            35
	//   12   26:iload_1         
	//   13   27:aload_0         
	//   14   28:getfield        #171 <Field int mCurState>
	//   15   31:icmpne          35
_L1:
		return;
	//   16   34:return          
_L2:
		mCurState = i;
	//   17   35:aload_0         
	//   18   36:iload_1         
	//   19   37:putfield        #171 <Field int mCurState>
		if(mActive == null)
			continue; /* Loop/switch isn't completed */
	//   20   40:aload_0         
	//   21   41:getfield        #313 <Field SparseArray mActive>
	//   22   44:ifnull          34
		i = 0;
	//   23   47:iconst_0        
	//   24   48:istore_1        
		int j1 = mAdded.size();
	//   25   49:aload_0         
	//   26   50:getfield        #164 <Field ArrayList mAdded>
	//   27   53:invokevirtual   #202 <Method int ArrayList.size()>
	//   28   56:istore          5
		for(int j = 0; j < j1;)
	//*  29   58:iconst_0        
	//*  30   59:istore_3        
	//*  31   60:iload_3         
	//*  32   61:iload           5
	//*  33   63:icmpge          118
		{
			Fragment fragment = (Fragment)mAdded.get(j);
	//   34   66:aload_0         
	//   35   67:getfield        #164 <Field ArrayList mAdded>
	//   36   70:iload_3         
	//   37   71:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   38   74:checkcast       #208 <Class Fragment>
	//   39   77:astore          6
			moveFragmentToExpectedState(fragment);
	//   40   79:aload_0         
	//   41   80:aload           6
	//   42   82:invokevirtual   #1395 <Method void moveFragmentToExpectedState(Fragment)>
			int l = i;
	//   43   85:iload_1         
	//   44   86:istore          4
			if(fragment.mLoaderManager != null)
	//*  45   88:aload           6
	//*  46   90:getfield        #1113 <Field LoaderManagerImpl Fragment.mLoaderManager>
	//*  47   93:ifnull          108
				l = i | fragment.mLoaderManager.hasRunningLoaders();
	//   48   96:iload_1         
	//   49   97:aload           6
	//   50   99:getfield        #1113 <Field LoaderManagerImpl Fragment.mLoaderManager>
	//   51  102:invokevirtual   #1118 <Method boolean LoaderManagerImpl.hasRunningLoaders()>
	//   52  105:ior             
	//   53  106:istore          4
			j++;
	//   54  108:iload_3         
	//   55  109:iconst_1        
	//   56  110:iadd            
	//   57  111:istore_3        
			i = l;
	//   58  112:iload           4
	//   59  114:istore_1        
		}

	//*  60  115:goto            60
		j1 = mActive.size();
	//   61  118:aload_0         
	//   62  119:getfield        #313 <Field SparseArray mActive>
	//   63  122:invokevirtual   #316 <Method int SparseArray.size()>
	//   64  125:istore          5
		boolean flag1 = false;
	//   65  127:iconst_0        
	//   66  128:istore          4
		int k = i;
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
label0:
			{
				Fragment fragment1 = (Fragment)mActive.valueAt(i);
	//   74  141:aload_0         
	//   75  142:getfield        #313 <Field SparseArray mActive>
	//   76  145:iload_1         
	//   77  146:invokevirtual   #319 <Method Object SparseArray.valueAt(int)>
	//   78  149:checkcast       #208 <Class Fragment>
	//   79  152:astore          6
				i1 = k;
	//   80  154:iload_3         
	//   81  155:istore          4
				if(fragment1 == null)
					break label0;
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
						break label0;
	//   89  173:aload           6
	//   90  175:getfield        #846 <Field boolean Fragment.mDetached>
	//   91  178:ifeq            221
				}
				i1 = k;
	//   92  181:iload_3         
	//   93  182:istore          4
				if(!fragment1.mIsNewlyAdded)
	//*  94  184:aload           6
	//*  95  186:getfield        #231 <Field boolean Fragment.mIsNewlyAdded>
	//*  96  189:ifne            221
				{
					moveFragmentToExpectedState(fragment1);
	//   97  192:aload_0         
	//   98  193:aload           6
	//   99  195:invokevirtual   #1395 <Method void moveFragmentToExpectedState(Fragment)>
					i1 = k;
	//  100  198:iload_3         
	//  101  199:istore          4
					if(fragment1.mLoaderManager != null)
	//* 102  201:aload           6
	//* 103  203:getfield        #1113 <Field LoaderManagerImpl Fragment.mLoaderManager>
	//* 104  206:ifnull          221
						i1 = k | fragment1.mLoaderManager.hasRunningLoaders();
	//  105  209:iload_3         
	//  106  210:aload           6
	//  107  212:getfield        #1113 <Field LoaderManagerImpl Fragment.mLoaderManager>
	//  108  215:invokevirtual   #1118 <Method boolean LoaderManagerImpl.hasRunningLoaders()>
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
	//  121  236:invokevirtual   #1121 <Method void startPendingDeferredFragments()>
		if(mNeedMenuInvalidate && mHost != null && mCurState == 5)
	//* 122  239:aload_0         
	//* 123  240:getfield        #865 <Field boolean mNeedMenuInvalidate>
	//* 124  243:ifeq            34
	//* 125  246:aload_0         
	//* 126  247:getfield        #444 <Field FragmentHostCallback mHost>
	//* 127  250:ifnull          34
	//* 128  253:aload_0         
	//* 129  254:getfield        #171 <Field int mCurState>
	//* 130  257:iconst_5        
	//* 131  258:icmpne          34
		{
			mHost.onSupportInvalidateOptionsMenu();
	//  132  261:aload_0         
	//  133  262:getfield        #444 <Field FragmentHostCallback mHost>
	//  134  265:invokevirtual   #1398 <Method void FragmentHostCallback.onSupportInvalidateOptionsMenu()>
			mNeedMenuInvalidate = false;
	//  135  268:aload_0         
	//  136  269:iconst_0        
	//  137  270:putfield        #865 <Field boolean mNeedMenuInvalidate>
			return;
	//  138  273:return          
		}
		if(true) goto _L1; else goto _L3
_L3:
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
		int j1;
label0:
		{
			if(fragment.mAdded)
	//*   0    0:aload_1         
	//*   1    1:getfield        #640 <Field boolean Fragment.mAdded>
	//*   2    4:ifeq            17
			{
				j1 = i;
	//    3    7:iload_2         
	//    4    8:istore          7
				if(!fragment.mDetached)
					break label0;
	//    5   10:aload_1         
	//    6   11:getfield        #846 <Field boolean Fragment.mDetached>
	//    7   14:ifeq            28
			}
			j1 = i;
	//    8   17:iload_2         
	//    9   18:istore          7
			if(i > 1)
	//*  10   20:iload_2         
	//*  11   21:iconst_1        
	//*  12   22:icmple          28
				j1 = 1;
	//   13   25:iconst_1        
	//   14   26:istore          7
		}
		int l = j1;
	//   15   28:iload           7
	//   16   30:istore          6
		if(fragment.mRemoving)
	//*  17   32:aload_1         
	//*  18   33:getfield        #854 <Field boolean Fragment.mRemoving>
	//*  19   36:ifeq            69
		{
			l = j1;
	//   20   39:iload           7
	//   21   41:istore          6
			if(j1 > fragment.mState)
	//*  22   43:iload           7
	//*  23   45:aload_1         
	//*  24   46:getfield        #211 <Field int Fragment.mState>
	//*  25   49:icmple          69
				if(fragment.mState == 0 && fragment.isInBackStack())
	//*  26   52:aload_1         
	//*  27   53:getfield        #211 <Field int Fragment.mState>
	//*  28   56:ifne            124
	//*  29   59:aload_1         
	//*  30   60:invokevirtual   #1376 <Method boolean Fragment.isInBackStack()>
	//*  31   63:ifeq            124
					l = 1;
	//   32   66:iconst_1        
	//   33   67:istore          6
				else
	//*  34   69:iload           6
	//*  35   71:istore_2        
	//*  36   72:aload_1         
	//*  37   73:getfield        #1401 <Field boolean Fragment.mDeferStart>
	//*  38   76:ifeq            101
	//*  39   79:iload           6
	//*  40   81:istore_2        
	//*  41   82:aload_1         
	//*  42   83:getfield        #211 <Field int Fragment.mState>
	//*  43   86:iconst_4        
	//*  44   87:icmpge          101
	//*  45   90:iload           6
	//*  46   92:istore_2        
	//*  47   93:iload           6
	//*  48   95:iconst_3        
	//*  49   96:icmple          101
	//*  50   99:iconst_3        
	//*  51  100:istore_2        
	//*  52  101:aload_1         
	//*  53  102:getfield        #211 <Field int Fragment.mState>
	//*  54  105:iload_2         
	//*  55  106:icmpgt          1320
	//*  56  109:aload_1         
	//*  57  110:getfield        #1205 <Field boolean Fragment.mFromLayout>
	//*  58  113:ifeq            133
	//*  59  116:aload_1         
	//*  60  117:getfield        #1404 <Field boolean Fragment.mInLayout>
	//*  61  120:ifne            133
	//*  62  123:return          
					l = fragment.mState;
	//   63  124:aload_1         
	//   64  125:getfield        #211 <Field int Fragment.mState>
	//   65  128:istore          6
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
	//*  66  130:goto            69
_L4:
		int i1;
		int k1;
		if(fragment.getAnimatingAway() != null || fragment.getAnimator() != null)
	//*  67  133:aload_1         
	//*  68  134:invokevirtual   #413 <Method View Fragment.getAnimatingAway()>
	//*  69  137:ifnonnull       147
	//*  70  140:aload_1         
	//*  71  141:invokevirtual   #430 <Method Animator Fragment.getAnimator()>
	//*  72  144:ifnull          169
		{
			fragment.setAnimatingAway(((View) (null)));
	//   73  147:aload_1         
	//   74  148:aconst_null     
	//   75  149:invokevirtual   #254 <Method void Fragment.setAnimatingAway(View)>
			fragment.setAnimator(((Animator) (null)));
	//   76  152:aload_1         
	//   77  153:aconst_null     
	//   78  154:invokevirtual   #285 <Method void Fragment.setAnimator(Animator)>
			moveToState(fragment, fragment.getStateAfterAnimating(), 0, 0, true);
	//   79  157:aload_0         
	//   80  158:aload_1         
	//   81  159:aload_1         
	//   82  160:invokevirtual   #416 <Method int Fragment.getStateAfterAnimating()>
	//   83  163:iconst_0        
	//   84  164:iconst_0        
	//   85  165:iconst_1        
	//   86  166:invokevirtual   #221 <Method void moveToState(Fragment, int, int, int, boolean)>
		}
		k = i;
	//   87  169:iload_2         
	//   88  170:istore          4
		i1 = i;
	//   89  172:iload_2         
	//   90  173:istore          6
		k1 = i;
	//   91  175:iload_2         
	//   92  176:istore          7
		j = i;
	//   93  178:iload_2         
	//   94  179:istore_3        
		fragment.mState;
	//   95  180:aload_1         
	//   96  181:getfield        #211 <Field int Fragment.mState>
		JVM INSTR tableswitch 0 4: default 220
	//	               0 295
	//	               1 735
	//	               2 1130
	//	               3 1149
	//	               4 1203;
	//   97  184:tableswitch     0 4: default 220
	//	               0 295
	//	               1 735
	//	               2 1130
	//	               3 1149
	//	               4 1203
		   goto _L5 _L6 _L7 _L8 _L9 _L10
_L6:
		break; /* Loop/switch isn't completed */
_L5:
		i1 = i;
	//   98  220:iload_2         
	//   99  221:istore          6
_L12:
		if(fragment.mState != i1)
	//* 100  223:aload_1         
	//* 101  224:getfield        #211 <Field int Fragment.mState>
	//* 102  227:iload           6
	//* 103  229:icmpeq          123
		{
			Log.w("FragmentManager", (new StringBuilder()).append("moveToState: Fragment state for ").append(((Object) (fragment))).append(" not updated inline; ").append("expected state ").append(i1).append(" found ").append(fragment.mState).toString());
	//  104  232:ldc1            #67  <String "FragmentManager">
	//  105  234:new             #340 <Class StringBuilder>
	//  106  237:dup             
	//  107  238:invokespecial   #341 <Method void StringBuilder()>
	//  108  241:ldc2            #1406 <String "moveToState: Fragment state for ">
	//  109  244:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  110  247:aload_1         
	//  111  248:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  112  251:ldc2            #1408 <String " not updated inline; ">
	//  113  254:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  114  257:ldc2            #1410 <String "expected state ">
	//  115  260:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  116  263:iload           6
	//  117  265:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//  118  268:ldc2            #1412 <String " found ">
	//  119  271:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  120  274:aload_1         
	//  121  275:getfield        #211 <Field int Fragment.mState>
	//  122  278:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//  123  281:invokevirtual   #351 <Method String StringBuilder.toString()>
	//  124  284:invokestatic    #1415 <Method int Log.w(String, String)>
	//  125  287:pop             
			fragment.mState = i1;
	//  126  288:aload_1         
	//  127  289:iload           6
	//  128  291:putfield        #211 <Field int Fragment.mState>
			return;
	//  129  294:return          
		}
		if(true) goto _L3; else goto _L11
_L11:
		k = i;
	//  130  295:iload_2         
	//  131  296:istore          4
		if(i > 0)
	//* 132  298:iload_2         
	//* 133  299:ifle            735
		{
			if(DEBUG)
	//* 134  302:getstatic       #133 <Field boolean DEBUG>
	//* 135  305:ifeq            334
				Log.v("FragmentManager", (new StringBuilder()).append("moveto CREATED: ").append(((Object) (fragment))).toString());
	//  136  308:ldc1            #67  <String "FragmentManager">
	//  137  310:new             #340 <Class StringBuilder>
	//  138  313:dup             
	//  139  314:invokespecial   #341 <Method void StringBuilder()>
	//  140  317:ldc2            #1417 <String "moveto CREATED: ">
	//  141  320:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  142  323:aload_1         
	//  143  324:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  144  327:invokevirtual   #351 <Method String StringBuilder.toString()>
	//  145  330:invokestatic    #839 <Method int Log.v(String, String)>
	//  146  333:pop             
			k = i;
	//  147  334:iload_2         
	//  148  335:istore          4
			if(fragment.mSavedFragmentState != null)
	//* 149  337:aload_1         
	//* 150  338:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 151  341:ifnull          449
			{
				fragment.mSavedFragmentState.setClassLoader(mHost.getContext().getClassLoader());
	//  152  344:aload_1         
	//  153  345:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//  154  348:aload_0         
	//  155  349:getfield        #444 <Field FragmentHostCallback mHost>
	//  156  352:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//  157  355:invokevirtual   #1421 <Method ClassLoader Context.getClassLoader()>
	//  158  358:invokevirtual   #1425 <Method void Bundle.setClassLoader(ClassLoader)>
				fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
	//  159  361:aload_1         
	//  160  362:aload_1         
	//  161  363:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//  162  366:ldc1            #79  <String "android:view_state">
	//  163  368:invokevirtual   #1429 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//  164  371:putfield        #1432 <Field SparseArray Fragment.mSavedViewState>
				fragment.mTarget = getFragment(fragment.mSavedFragmentState, "android:target_state");
	//  165  374:aload_1         
	//  166  375:aload_0         
	//  167  376:aload_1         
	//  168  377:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//  169  380:ldc1            #73  <String "android:target_state">
	//  170  382:invokevirtual   #1434 <Method Fragment getFragment(Bundle, String)>
	//  171  385:putfield        #1437 <Field Fragment Fragment.mTarget>
				if(fragment.mTarget != null)
	//* 172  388:aload_1         
	//* 173  389:getfield        #1437 <Field Fragment Fragment.mTarget>
	//* 174  392:ifnull          409
					fragment.mTargetRequestCode = fragment.mSavedFragmentState.getInt("android:target_req_state", 0);
	//  175  395:aload_1         
	//  176  396:aload_1         
	//  177  397:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//  178  400:ldc1            #70  <String "android:target_req_state">
	//  179  402:iconst_0        
	//  180  403:invokevirtual   #1269 <Method int Bundle.getInt(String, int)>
	//  181  406:putfield        #1440 <Field int Fragment.mTargetRequestCode>
				fragment.mUserVisibleHint = fragment.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
	//  182  409:aload_1         
	//  183  410:aload_1         
	//  184  411:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//  185  414:ldc1            #76  <String "android:user_visible_hint">
	//  186  416:iconst_1        
	//  187  417:invokevirtual   #1444 <Method boolean Bundle.getBoolean(String, boolean)>
	//  188  420:putfield        #1447 <Field boolean Fragment.mUserVisibleHint>
				k = i;
	//  189  423:iload_2         
	//  190  424:istore          4
				if(!fragment.mUserVisibleHint)
	//* 191  426:aload_1         
	//* 192  427:getfield        #1447 <Field boolean Fragment.mUserVisibleHint>
	//* 193  430:ifne            449
				{
					fragment.mDeferStart = true;
	//  194  433:aload_1         
	//  195  434:iconst_1        
	//  196  435:putfield        #1401 <Field boolean Fragment.mDeferStart>
					k = i;
	//  197  438:iload_2         
	//  198  439:istore          4
					if(i > 3)
	//* 199  441:iload_2         
	//* 200  442:iconst_3        
	//* 201  443:icmple          449
						k = 3;
	//  202  446:iconst_3        
	//  203  447:istore          4
				}
			}
			fragment.mHost = mHost;
	//  204  449:aload_1         
	//  205  450:aload_0         
	//  206  451:getfield        #444 <Field FragmentHostCallback mHost>
	//  207  454:putfield        #1448 <Field FragmentHostCallback Fragment.mHost>
			fragment.mParentFragment = mParent;
	//  208  457:aload_1         
	//  209  458:aload_0         
	//  210  459:getfield        #905 <Field Fragment mParent>
	//  211  462:putfield        #1451 <Field Fragment Fragment.mParentFragment>
			FragmentManagerImpl fragmentmanagerimpl;
			if(mParent != null)
	//* 212  465:aload_0         
	//* 213  466:getfield        #905 <Field Fragment mParent>
	//* 214  469:ifnull          562
				fragmentmanagerimpl = mParent.mChildFragmentManager;
	//  215  472:aload_0         
	//  216  473:getfield        #905 <Field Fragment mParent>
	//  217  476:getfield        #1455 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
	//  218  479:astore          8
			else
	//* 219  481:aload_1         
	//* 220  482:aload           8
	//* 221  484:putfield        #1458 <Field FragmentManagerImpl Fragment.mFragmentManager>
	//* 222  487:aload_1         
	//* 223  488:getfield        #1437 <Field Fragment Fragment.mTarget>
	//* 224  491:ifnull          597
	//* 225  494:aload_0         
	//* 226  495:getfield        #313 <Field SparseArray mActive>
	//* 227  498:aload_1         
	//* 228  499:getfield        #1437 <Field Fragment Fragment.mTarget>
	//* 229  502:getfield        #1350 <Field int Fragment.mIndex>
	//* 230  505:invokevirtual   #1270 <Method Object SparseArray.get(int)>
	//* 231  508:aload_1         
	//* 232  509:getfield        #1437 <Field Fragment Fragment.mTarget>
	//* 233  512:if_acmpeq       574
	//* 234  515:new             #331 <Class IllegalStateException>
	//* 235  518:dup             
	//* 236  519:new             #340 <Class StringBuilder>
	//* 237  522:dup             
	//* 238  523:invokespecial   #341 <Method void StringBuilder()>
	//* 239  526:ldc2            #1460 <String "Fragment ">
	//* 240  529:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 241  532:aload_1         
	//* 242  533:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 243  536:ldc2            #1462 <String " declared target fragment ">
	//* 244  539:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 245  542:aload_1         
	//* 246  543:getfield        #1437 <Field Fragment Fragment.mTarget>
	//* 247  546:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 248  549:ldc2            #1464 <String " that does not belong to this FragmentManager!">
	//* 249  552:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 250  555:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 251  558:invokespecial   #336 <Method void IllegalStateException(String)>
	//* 252  561:athrow          
				fragmentmanagerimpl = mHost.getFragmentManagerImpl();
	//  253  562:aload_0         
	//  254  563:getfield        #444 <Field FragmentHostCallback mHost>
	//  255  566:invokevirtual   #1468 <Method FragmentManagerImpl FragmentHostCallback.getFragmentManagerImpl()>
	//  256  569:astore          8
			fragment.mFragmentManager = fragmentmanagerimpl;
			if(fragment.mTarget != null)
			{
				if(mActive.get(fragment.mTarget.mIndex) != fragment.mTarget)
					throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(((Object) (fragment))).append(" declared target fragment ").append(((Object) (fragment.mTarget))).append(" that does not belong to this FragmentManager!").toString());
	//* 257  571:goto            481
				if(fragment.mTarget.mState < 1)
	//* 258  574:aload_1         
	//* 259  575:getfield        #1437 <Field Fragment Fragment.mTarget>
	//* 260  578:getfield        #211 <Field int Fragment.mState>
	//* 261  581:iconst_1        
	//* 262  582:icmpge          597
					moveToState(fragment.mTarget, 1, 0, 0, true);
	//  263  585:aload_0         
	//  264  586:aload_1         
	//  265  587:getfield        #1437 <Field Fragment Fragment.mTarget>
	//  266  590:iconst_1        
	//  267  591:iconst_0        
	//  268  592:iconst_0        
	//  269  593:iconst_1        
	//  270  594:invokevirtual   #221 <Method void moveToState(Fragment, int, int, int, boolean)>
			}
			dispatchOnFragmentPreAttached(fragment, mHost.getContext(), false);
	//  271  597:aload_0         
	//  272  598:aload_1         
	//  273  599:aload_0         
	//  274  600:getfield        #444 <Field FragmentHostCallback mHost>
	//  275  603:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//  276  606:iconst_0        
	//  277  607:invokevirtual   #1037 <Method void dispatchOnFragmentPreAttached(Fragment, Context, boolean)>
			fragment.mCalled = false;
	//  278  610:aload_1         
	//  279  611:iconst_0        
	//  280  612:putfield        #1471 <Field boolean Fragment.mCalled>
			fragment.onAttach(mHost.getContext());
	//  281  615:aload_1         
	//  282  616:aload_0         
	//  283  617:getfield        #444 <Field FragmentHostCallback mHost>
	//  284  620:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//  285  623:invokevirtual   #1475 <Method void Fragment.onAttach(Context)>
			if(!fragment.mCalled)
	//* 286  626:aload_1         
	//* 287  627:getfield        #1471 <Field boolean Fragment.mCalled>
	//* 288  630:ifne            667
				throw new SuperNotCalledException((new StringBuilder()).append("Fragment ").append(((Object) (fragment))).append(" did not call through to super.onAttach()").toString());
	//  289  633:new             #1477 <Class SuperNotCalledException>
	//  290  636:dup             
	//  291  637:new             #340 <Class StringBuilder>
	//  292  640:dup             
	//  293  641:invokespecial   #341 <Method void StringBuilder()>
	//  294  644:ldc2            #1460 <String "Fragment ">
	//  295  647:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  296  650:aload_1         
	//  297  651:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  298  654:ldc2            #1479 <String " did not call through to super.onAttach()">
	//  299  657:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  300  660:invokevirtual   #351 <Method String StringBuilder.toString()>
	//  301  663:invokespecial   #1480 <Method void SuperNotCalledException(String)>
	//  302  666:athrow          
			ViewGroup viewgroup;
			if(fragment.mParentFragment == null)
	//* 303  667:aload_1         
	//* 304  668:getfield        #1451 <Field Fragment Fragment.mParentFragment>
	//* 305  671:ifnonnull       1269
				mHost.onAttachFragment(fragment);
	//  306  674:aload_0         
	//  307  675:getfield        #444 <Field FragmentHostCallback mHost>
	//  308  678:aload_1         
	//  309  679:invokevirtual   #1483 <Method void FragmentHostCallback.onAttachFragment(Fragment)>
			else
	//* 310  682:aload_0         
	//* 311  683:aload_1         
	//* 312  684:aload_0         
	//* 313  685:getfield        #444 <Field FragmentHostCallback mHost>
	//* 314  688:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//* 315  691:iconst_0        
	//* 316  692:invokevirtual   #1005 <Method void dispatchOnFragmentAttached(Fragment, Context, boolean)>
	//* 317  695:aload_1         
	//* 318  696:getfield        #1486 <Field boolean Fragment.mIsCreated>
	//* 319  699:ifne            1280
	//* 320  702:aload_0         
	//* 321  703:aload_1         
	//* 322  704:aload_1         
	//* 323  705:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 324  708:iconst_0        
	//* 325  709:invokevirtual   #1043 <Method void dispatchOnFragmentPreCreated(Fragment, Bundle, boolean)>
	//* 326  712:aload_1         
	//* 327  713:aload_1         
	//* 328  714:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 329  717:invokevirtual   #1490 <Method void Fragment.performCreate(Bundle)>
	//* 330  720:aload_0         
	//* 331  721:aload_1         
	//* 332  722:aload_1         
	//* 333  723:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 334  726:iconst_0        
	//* 335  727:invokevirtual   #1012 <Method void dispatchOnFragmentCreated(Fragment, Bundle, boolean)>
	//* 336  730:aload_1         
	//* 337  731:iconst_0        
	//* 338  732:putfield        #769 <Field boolean Fragment.mRetaining>
	//* 339  735:aload_0         
	//* 340  736:aload_1         
	//* 341  737:invokevirtual   #1492 <Method void ensureInflatedFragmentView(Fragment)>
	//* 342  740:iload           4
	//* 343  742:istore          6
	//* 344  744:iload           4
	//* 345  746:iconst_1        
	//* 346  747:icmple          1130
	//* 347  750:getstatic       #133 <Field boolean DEBUG>
	//* 348  753:ifeq            782
	//* 349  756:ldc1            #67  <String "FragmentManager">
	//* 350  758:new             #340 <Class StringBuilder>
	//* 351  761:dup             
	//* 352  762:invokespecial   #341 <Method void StringBuilder()>
	//* 353  765:ldc2            #1494 <String "moveto ACTIVITY_CREATED: ">
	//* 354  768:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 355  771:aload_1         
	//* 356  772:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 357  775:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 358  778:invokestatic    #839 <Method int Log.v(String, String)>
	//* 359  781:pop             
	//* 360  782:aload_1         
	//* 361  783:getfield        #1205 <Field boolean Fragment.mFromLayout>
	//* 362  786:ifne            1088
	//* 363  789:aconst_null     
	//* 364  790:astore          8
	//* 365  792:aload_1         
	//* 366  793:getfield        #388 <Field int Fragment.mContainerId>
	//* 367  796:ifeq            955
	//* 368  799:aload_1         
	//* 369  800:getfield        #388 <Field int Fragment.mContainerId>
	//* 370  803:iconst_m1       
	//* 371  804:icmpne          844
	//* 372  807:aload_0         
	//* 373  808:new             #1496 <Class IllegalArgumentException>
	//* 374  811:dup             
	//* 375  812:new             #340 <Class StringBuilder>
	//* 376  815:dup             
	//* 377  816:invokespecial   #341 <Method void StringBuilder()>
	//* 378  819:ldc2            #1498 <String "Cannot create fragment ">
	//* 379  822:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 380  825:aload_1         
	//* 381  826:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 382  829:ldc2            #1500 <String " for a container view with no id">
	//* 383  832:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 384  835:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 385  838:invokespecial   #1501 <Method void IllegalArgumentException(String)>
	//* 386  841:invokespecial   #1276 <Method void throwException(RuntimeException)>
	//* 387  844:aload_0         
	//* 388  845:getfield        #903 <Field FragmentContainer mContainer>
	//* 389  848:aload_1         
	//* 390  849:getfield        #388 <Field int Fragment.mContainerId>
	//* 391  852:invokevirtual   #1507 <Method View FragmentContainer.onFindViewById(int)>
	//* 392  855:checkcast       #290 <Class ViewGroup>
	//* 393  858:astore          9
	//* 394  860:aload           9
	//* 395  862:astore          8
	//* 396  864:aload           9
	//* 397  866:ifnonnull       955
	//* 398  869:aload           9
	//* 399  871:astore          8
	//* 400  873:aload_1         
	//* 401  874:getfield        #1510 <Field boolean Fragment.mRestored>
	//* 402  877:ifne            955
	//* 403  880:aload_1         
	//* 404  881:invokevirtual   #1511 <Method Resources Fragment.getResources()>
	//* 405  884:aload_1         
	//* 406  885:getfield        #388 <Field int Fragment.mContainerId>
	//* 407  888:invokevirtual   #1514 <Method String Resources.getResourceName(int)>
	//* 408  891:astore          8
	//* 409  893:aload_0         
	//* 410  894:new             #1496 <Class IllegalArgumentException>
	//* 411  897:dup             
	//* 412  898:new             #340 <Class StringBuilder>
	//* 413  901:dup             
	//* 414  902:invokespecial   #341 <Method void StringBuilder()>
	//* 415  905:ldc2            #1516 <String "No view found for id 0x">
	//* 416  908:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 417  911:aload_1         
	//* 418  912:getfield        #388 <Field int Fragment.mContainerId>
	//* 419  915:invokestatic    #1137 <Method String Integer.toHexString(int)>
	//* 420  918:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 421  921:ldc2            #1518 <String " (">
	//* 422  924:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 423  927:aload           8
	//* 424  929:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 425  932:ldc2            #1520 <String ") for fragment ">
	//* 426  935:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 427  938:aload_1         
	//* 428  939:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 429  942:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 430  945:invokespecial   #1501 <Method void IllegalArgumentException(String)>
	//* 431  948:invokespecial   #1276 <Method void throwException(RuntimeException)>
	//* 432  951:aload           9
	//* 433  953:astore          8
	//* 434  955:aload_1         
	//* 435  956:aload           8
	//* 436  958:putfield        #288 <Field ViewGroup Fragment.mContainer>
	//* 437  961:aload_1         
	//* 438  962:aload_1         
	//* 439  963:aload_1         
	//* 440  964:aload_1         
	//* 441  965:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 442  968:invokevirtual   #1215 <Method android.view.LayoutInflater Fragment.performGetLayoutInflater(Bundle)>
	//* 443  971:aload           8
	//* 444  973:aload_1         
	//* 445  974:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 446  977:invokevirtual   #1219 <Method View Fragment.performCreateView(android.view.LayoutInflater, ViewGroup, Bundle)>
	//* 447  980:putfield        #225 <Field View Fragment.mView>
	//* 448  983:aload_1         
	//* 449  984:getfield        #225 <Field View Fragment.mView>
	//* 450  987:ifnull          1312
	//* 451  990:aload_1         
	//* 452  991:aload_1         
	//* 453  992:getfield        #225 <Field View Fragment.mView>
	//* 454  995:putfield        #1222 <Field View Fragment.mInnerView>
	//* 455  998:aload_1         
	//* 456  999:getfield        #225 <Field View Fragment.mView>
	//* 457 1002:iconst_0        
	//* 458 1003:invokevirtual   #1225 <Method void View.setSaveFromParentEnabled(boolean)>
	//* 459 1006:aload           8
	//* 460 1008:ifnull          1020
	//* 461 1011:aload           8
	//* 462 1013:aload_1         
	//* 463 1014:getfield        #225 <Field View Fragment.mView>
	//* 464 1017:invokevirtual   #1522 <Method void ViewGroup.addView(View)>
	//* 465 1020:aload_1         
	//* 466 1021:getfield        #228 <Field boolean Fragment.mHidden>
	//* 467 1024:ifeq            1036
	//* 468 1027:aload_1         
	//* 469 1028:getfield        #225 <Field View Fragment.mView>
	//* 470 1031:bipush          8
	//* 471 1033:invokevirtual   #934 <Method void View.setVisibility(int)>
	//* 472 1036:aload_1         
	//* 473 1037:aload_1         
	//* 474 1038:getfield        #225 <Field View Fragment.mView>
	//* 475 1041:aload_1         
	//* 476 1042:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 477 1045:invokevirtual   #1229 <Method void Fragment.onViewCreated(View, Bundle)>
	//* 478 1048:aload_0         
	//* 479 1049:aload_1         
	//* 480 1050:aload_1         
	//* 481 1051:getfield        #225 <Field View Fragment.mView>
	//* 482 1054:aload_1         
	//* 483 1055:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 484 1058:iconst_0        
	//* 485 1059:invokevirtual   #1074 <Method void dispatchOnFragmentViewCreated(Fragment, View, Bundle, boolean)>
	//* 486 1062:aload_1         
	//* 487 1063:getfield        #225 <Field View Fragment.mView>
	//* 488 1066:invokevirtual   #1525 <Method int View.getVisibility()>
	//* 489 1069:ifne            1306
	//* 490 1072:aload_1         
	//* 491 1073:getfield        #288 <Field ViewGroup Fragment.mContainer>
	//* 492 1076:ifnull          1306
	//* 493 1079:iconst_1        
	//* 494 1080:istore          5
	//* 495 1082:aload_1         
	//* 496 1083:iload           5
	//* 497 1085:putfield        #231 <Field boolean Fragment.mIsNewlyAdded>
	//* 498 1088:aload_1         
	//* 499 1089:aload_1         
	//* 500 1090:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 501 1093:invokevirtual   #1528 <Method void Fragment.performActivityCreated(Bundle)>
	//* 502 1096:aload_0         
	//* 503 1097:aload_1         
	//* 504 1098:aload_1         
	//* 505 1099:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 506 1102:iconst_0        
	//* 507 1103:invokevirtual   #985 <Method void dispatchOnFragmentActivityCreated(Fragment, Bundle, boolean)>
	//* 508 1106:aload_1         
	//* 509 1107:getfield        #225 <Field View Fragment.mView>
	//* 510 1110:ifnull          1121
	//* 511 1113:aload_1         
	//* 512 1114:aload_1         
	//* 513 1115:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 514 1118:invokevirtual   #1531 <Method void Fragment.restoreViewState(Bundle)>
	//* 515 1121:aload_1         
	//* 516 1122:aconst_null     
	//* 517 1123:putfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 518 1126:iload           4
	//* 519 1128:istore          6
	//* 520 1130:iload           6
	//* 521 1132:istore          7
	//* 522 1134:iload           6
	//* 523 1136:iconst_2        
	//* 524 1137:icmple          1149
	//* 525 1140:aload_1         
	//* 526 1141:iconst_3        
	//* 527 1142:putfield        #211 <Field int Fragment.mState>
	//* 528 1145:iload           6
	//* 529 1147:istore          7
	//* 530 1149:iload           7
	//* 531 1151:istore_3        
	//* 532 1152:iload           7
	//* 533 1154:iconst_3        
	//* 534 1155:icmple          1203
	//* 535 1158:getstatic       #133 <Field boolean DEBUG>
	//* 536 1161:ifeq            1190
	//* 537 1164:ldc1            #67  <String "FragmentManager">
	//* 538 1166:new             #340 <Class StringBuilder>
	//* 539 1169:dup             
	//* 540 1170:invokespecial   #341 <Method void StringBuilder()>
	//* 541 1173:ldc2            #1533 <String "moveto STARTED: ">
	//* 542 1176:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 543 1179:aload_1         
	//* 544 1180:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 545 1183:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 546 1186:invokestatic    #839 <Method int Log.v(String, String)>
	//* 547 1189:pop             
	//* 548 1190:aload_1         
	//* 549 1191:invokevirtual   #1536 <Method void Fragment.performStart()>
	//* 550 1194:aload_0         
	//* 551 1195:aload_1         
	//* 552 1196:iconst_0        
	//* 553 1197:invokevirtual   #1061 <Method void dispatchOnFragmentStarted(Fragment, boolean)>
	//* 554 1200:iload           7
	//* 555 1202:istore_3        
	//* 556 1203:iload_3         
	//* 557 1204:istore          6
	//* 558 1206:iload_3         
	//* 559 1207:iconst_4        
	//* 560 1208:icmple          223
	//* 561 1211:getstatic       #133 <Field boolean DEBUG>
	//* 562 1214:ifeq            1243
	//* 563 1217:ldc1            #67  <String "FragmentManager">
	//* 564 1219:new             #340 <Class StringBuilder>
	//* 565 1222:dup             
	//* 566 1223:invokespecial   #341 <Method void StringBuilder()>
	//* 567 1226:ldc2            #1538 <String "moveto RESUMED: ">
	//* 568 1229:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 569 1232:aload_1         
	//* 570 1233:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 571 1236:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 572 1239:invokestatic    #839 <Method int Log.v(String, String)>
	//* 573 1242:pop             
	//* 574 1243:aload_1         
	//* 575 1244:invokevirtual   #1541 <Method void Fragment.performResume()>
	//* 576 1247:aload_0         
	//* 577 1248:aload_1         
	//* 578 1249:iconst_0        
	//* 579 1250:invokevirtual   #1049 <Method void dispatchOnFragmentResumed(Fragment, boolean)>
	//* 580 1253:aload_1         
	//* 581 1254:aconst_null     
	//* 582 1255:putfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 583 1258:aload_1         
	//* 584 1259:aconst_null     
	//* 585 1260:putfield        #1432 <Field SparseArray Fragment.mSavedViewState>
	//* 586 1263:iload_3         
	//* 587 1264:istore          6
	//* 588 1266:goto            223
				fragment.mParentFragment.onAttachFragment(fragment);
	//  589 1269:aload_1         
	//  590 1270:getfield        #1451 <Field Fragment Fragment.mParentFragment>
	//  591 1273:aload_1         
	//  592 1274:invokevirtual   #1542 <Method void Fragment.onAttachFragment(Fragment)>
			dispatchOnFragmentAttached(fragment, mHost.getContext(), false);
			if(!fragment.mIsCreated)
			{
				dispatchOnFragmentPreCreated(fragment, fragment.mSavedFragmentState, false);
				fragment.performCreate(fragment.mSavedFragmentState);
				dispatchOnFragmentCreated(fragment, fragment.mSavedFragmentState, false);
			} else
	//* 593 1277:goto            682
			{
				fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
	//  594 1280:aload_1         
	//  595 1281:aload_1         
	//  596 1282:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//  597 1285:invokevirtual   #1545 <Method void Fragment.restoreChildFragmentState(Bundle)>
				fragment.mState = 1;
	//  598 1288:aload_1         
	//  599 1289:iconst_1        
	//  600 1290:putfield        #211 <Field int Fragment.mState>
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
				Object obj = null;
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
	//* 601 1293:goto            730
							catch(android.content.res.Resources.NotFoundException notfoundexception)
	//* 602 1296:astore          8
							{
								notfoundexception = "unknown";
	//  603 1298:ldc2            #1547 <String "unknown">
	//  604 1301:astore          8
							}
							throwException(((RuntimeException) (new IllegalArgumentException((new StringBuilder()).append("No view found for id 0x").append(Integer.toHexString(fragment.mContainerId)).append(" (").append(((String) (obj))).append(") for fragment ").append(((Object) (fragment))).toString()))));
							obj = ((Object) (viewgroup));
						}
					}
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
						flag = true;
					else
	//* 605 1303:goto            893
						flag = false;
	//  606 1306:iconst_0        
	//  607 1307:istore          5
					fragment.mIsNewlyAdded = flag;
				} else
	//* 608 1309:goto            1082
				{
					fragment.mInnerView = null;
	//  609 1312:aload_1         
	//  610 1313:aconst_null     
	//  611 1314:putfield        #1222 <Field View Fragment.mInnerView>
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
	//* 612 1317:goto            1088
_L2:
		i1 = i;
	//  613 1320:iload_2         
	//  614 1321:istore          6
		if(fragment.mState <= i) goto _L12; else goto _L13
	//  615 1323:aload_1         
	//  616 1324:getfield        #211 <Field int Fragment.mState>
	//  617 1327:iload_2         
	//  618 1328:icmple          223
_L13:
		View view;
		switch(fragment.mState)
	//* 619 1331:aload_1         
	//* 620 1332:getfield        #211 <Field int Fragment.mState>
		{
	//* 621 1335:tableswitch     1 5: default 1368
	//	               1 1374
	//	               2 1572
	//	               3 1531
	//	               4 1484
	//	               5 1437
		default:
			i1 = i;
	//  622 1368:iload_2         
	//  623 1369:istore          6
			continue; /* Loop/switch isn't completed */
	//  624 1371:goto            223

		case 1: // '\001'
			break MISSING_BLOCK_LABEL_1374;

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
	//* 635 1393:ifnull          1796
	//* 636 1396:aload_1         
	//* 637 1397:invokevirtual   #413 <Method View Fragment.getAnimatingAway()>
	//* 638 1400:astore          8
	//* 639 1402:aload_1         
	//* 640 1403:aconst_null     
	//* 641 1404:invokevirtual   #254 <Method void Fragment.setAnimatingAway(View)>
	//* 642 1407:aload           8
	//* 643 1409:invokevirtual   #426 <Method void View.clearAnimation()>
	//* 644 1412:aload_1         
	//* 645 1413:invokevirtual   #413 <Method View Fragment.getAnimatingAway()>
	//* 646 1416:ifnonnull       1426
	//* 647 1419:aload_1         
	//* 648 1420:invokevirtual   #430 <Method Animator Fragment.getAnimator()>
	//* 649 1423:ifnull          1822
	//* 650 1426:aload_1         
	//* 651 1427:iload_2         
	//* 652 1428:invokevirtual   #246 <Method void Fragment.setStateAfterAnimating(int)>
	//* 653 1431:iconst_1        
	//* 654 1432:istore          6
	//* 655 1434:goto            223
		case 5: // '\005'
			if(i < 5)
	//* 656 1437:iload_2         
	//* 657 1438:iconst_5        
	//* 658 1439:icmpge          1484
			{
				if(DEBUG)
	//* 659 1442:getstatic       #133 <Field boolean DEBUG>
	//* 660 1445:ifeq            1474
					Log.v("FragmentManager", (new StringBuilder()).append("movefrom RESUMED: ").append(((Object) (fragment))).toString());
	//  661 1448:ldc1            #67  <String "FragmentManager">
	//  662 1450:new             #340 <Class StringBuilder>
	//  663 1453:dup             
	//  664 1454:invokespecial   #341 <Method void StringBuilder()>
	//  665 1457:ldc2            #1549 <String "movefrom RESUMED: ">
	//  666 1460:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  667 1463:aload_1         
	//  668 1464:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  669 1467:invokevirtual   #351 <Method String StringBuilder.toString()>
	//  670 1470:invokestatic    #839 <Method int Log.v(String, String)>
	//  671 1473:pop             
				fragment.performPause();
	//  672 1474:aload_1         
	//  673 1475:invokevirtual   #1552 <Method void Fragment.performPause()>
				dispatchOnFragmentPaused(fragment, false);
	//  674 1478:aload_0         
	//  675 1479:aload_1         
	//  676 1480:iconst_0        
	//  677 1481:invokevirtual   #1031 <Method void dispatchOnFragmentPaused(Fragment, boolean)>
			}
			// fall through

		case 4: // '\004'
			if(i < 4)
	//* 678 1484:iload_2         
	//* 679 1485:iconst_4        
	//* 680 1486:icmpge          1531
			{
				if(DEBUG)
	//* 681 1489:getstatic       #133 <Field boolean DEBUG>
	//* 682 1492:ifeq            1521
					Log.v("FragmentManager", (new StringBuilder()).append("movefrom STARTED: ").append(((Object) (fragment))).toString());
	//  683 1495:ldc1            #67  <String "FragmentManager">
	//  684 1497:new             #340 <Class StringBuilder>
	//  685 1500:dup             
	//  686 1501:invokespecial   #341 <Method void StringBuilder()>
	//  687 1504:ldc2            #1554 <String "movefrom STARTED: ">
	//  688 1507:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  689 1510:aload_1         
	//  690 1511:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  691 1514:invokevirtual   #351 <Method String StringBuilder.toString()>
	//  692 1517:invokestatic    #839 <Method int Log.v(String, String)>
	//  693 1520:pop             
				fragment.performStop();
	//  694 1521:aload_1         
	//  695 1522:invokevirtual   #1557 <Method void Fragment.performStop()>
				dispatchOnFragmentStopped(fragment, false);
	//  696 1525:aload_0         
	//  697 1526:aload_1         
	//  698 1527:iconst_0        
	//  699 1528:invokevirtual   #1067 <Method void dispatchOnFragmentStopped(Fragment, boolean)>
			}
			// fall through

		case 3: // '\003'
			if(i < 3)
	//* 700 1531:iload_2         
	//* 701 1532:iconst_3        
	//* 702 1533:icmpge          1572
			{
				if(DEBUG)
	//* 703 1536:getstatic       #133 <Field boolean DEBUG>
	//* 704 1539:ifeq            1568
					Log.v("FragmentManager", (new StringBuilder()).append("movefrom STOPPED: ").append(((Object) (fragment))).toString());
	//  705 1542:ldc1            #67  <String "FragmentManager">
	//  706 1544:new             #340 <Class StringBuilder>
	//  707 1547:dup             
	//  708 1548:invokespecial   #341 <Method void StringBuilder()>
	//  709 1551:ldc2            #1559 <String "movefrom STOPPED: ">
	//  710 1554:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  711 1557:aload_1         
	//  712 1558:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  713 1561:invokevirtual   #351 <Method String StringBuilder.toString()>
	//  714 1564:invokestatic    #839 <Method int Log.v(String, String)>
	//  715 1567:pop             
				fragment.performReallyStop();
	//  716 1568:aload_1         
	//  717 1569:invokevirtual   #1562 <Method void Fragment.performReallyStop()>
			}
			break;

		case 2: // '\002'
			break;
		}
		break MISSING_BLOCK_LABEL_1572;
_L14:
		i1 = i;
		if(i < 1)
		{
			AnimationOrAnimator animationoranimator;
			Object obj1;
			if(mDestroyed)
				if(fragment.getAnimatingAway() != null)
				{
					view = fragment.getAnimatingAway();
					fragment.setAnimatingAway(((View) (null)));
					view.clearAnimation();
				} else
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
	//* 756 1653:ifnull          1773
	//* 757 1656:aload_1         
	//* 758 1657:getfield        #288 <Field ViewGroup Fragment.mContainer>
	//* 759 1660:ifnull          1773
	//* 760 1663:aload_1         
	//* 761 1664:getfield        #225 <Field View Fragment.mView>
	//* 762 1667:invokevirtual   #426 <Method void View.clearAnimation()>
	//* 763 1670:aload_1         
	//* 764 1671:getfield        #288 <Field ViewGroup Fragment.mContainer>
	//* 765 1674:aload_1         
	//* 766 1675:getfield        #225 <Field View Fragment.mView>
	//* 767 1678:invokevirtual   #1577 <Method void ViewGroup.endViewTransition(View)>
	//* 768 1681:aconst_null     
	//* 769 1682:astore          9
	//* 770 1684:aload           9
	//* 771 1686:astore          8
	//* 772 1688:aload_0         
	//* 773 1689:getfield        #171 <Field int mCurState>
	//* 774 1692:ifle            1744
	//* 775 1695:aload           9
	//* 776 1697:astore          8
	//* 777 1699:aload_0         
	//* 778 1700:getfield        #969 <Field boolean mDestroyed>
	//* 779 1703:ifne            1744
	//* 780 1706:aload           9
	//* 781 1708:astore          8
	//* 782 1710:aload_1         
	//* 783 1711:getfield        #225 <Field View Fragment.mView>
	//* 784 1714:invokevirtual   #1525 <Method int View.getVisibility()>
	//* 785 1717:ifne            1744
	//* 786 1720:aload           9
	//* 787 1722:astore          8
	//* 788 1724:aload_1         
	//* 789 1725:getfield        #396 <Field float Fragment.mPostponedAlpha>
	//* 790 1728:fconst_0        
	//* 791 1729:fcmpl           
	//* 792 1730:iflt            1744
	//* 793 1733:aload_0         
	//* 794 1734:aload_1         
	//* 795 1735:iload_3         
	//* 796 1736:iconst_0        
	//* 797 1737:iload           4
	//* 798 1739:invokevirtual   #921 <Method FragmentManagerImpl$AnimationOrAnimator loadAnimation(Fragment, int, boolean, int)>
	//* 799 1742:astore          8
	//* 800 1744:aload_1         
	//* 801 1745:fconst_0        
	//* 802 1746:putfield        #396 <Field float Fragment.mPostponedAlpha>
	//* 803 1749:aload           8
	//* 804 1751:ifnull          1762
	//* 805 1754:aload_0         
	//* 806 1755:aload_1         
	//* 807 1756:aload           8
	//* 808 1758:iload_2         
	//* 809 1759:invokespecial   #1579 <Method void animateRemoveFragment(Fragment, FragmentManagerImpl$AnimationOrAnimator, int)>
	//* 810 1762:aload_1         
	//* 811 1763:getfield        #288 <Field ViewGroup Fragment.mContainer>
	//* 812 1766:aload_1         
	//* 813 1767:getfield        #225 <Field View Fragment.mView>
	//* 814 1770:invokevirtual   #1582 <Method void ViewGroup.removeView(View)>
	//* 815 1773:aload_1         
	//* 816 1774:aconst_null     
	//* 817 1775:putfield        #288 <Field ViewGroup Fragment.mContainer>
	//* 818 1778:aload_1         
	//* 819 1779:aconst_null     
	//* 820 1780:putfield        #225 <Field View Fragment.mView>
	//* 821 1783:aload_1         
	//* 822 1784:aconst_null     
	//* 823 1785:putfield        #1222 <Field View Fragment.mInnerView>
	//* 824 1788:aload_1         
	//* 825 1789:iconst_0        
	//* 826 1790:putfield        #1404 <Field boolean Fragment.mInLayout>
	//* 827 1793:goto            1374
				if(fragment.getAnimator() != null)
	//* 828 1796:aload_1         
	//* 829 1797:invokevirtual   #430 <Method Animator Fragment.getAnimator()>
	//* 830 1800:ifnull          1412
				{
					Animator animator = fragment.getAnimator();
	//  831 1803:aload_1         
	//  832 1804:invokevirtual   #430 <Method Animator Fragment.getAnimator()>
	//  833 1807:astore          8
					fragment.setAnimator(((Animator) (null)));
	//  834 1809:aload_1         
	//  835 1810:aconst_null     
	//  836 1811:invokevirtual   #285 <Method void Fragment.setAnimator(Animator)>
					animator.cancel();
	//  837 1814:aload           8
	//  838 1816:invokevirtual   #1583 <Method void Animator.cancel()>
				}
			if(fragment.getAnimatingAway() != null || fragment.getAnimator() != null)
			{
				fragment.setStateAfterAnimating(i);
				i1 = 1;
			} else
	//* 839 1819:goto            1412
			{
				if(DEBUG)
	//* 840 1822:getstatic       #133 <Field boolean DEBUG>
	//* 841 1825:ifeq            1854
					Log.v("FragmentManager", (new StringBuilder()).append("movefrom CREATED: ").append(((Object) (fragment))).toString());
	//  842 1828:ldc1            #67  <String "FragmentManager">
	//  843 1830:new             #340 <Class StringBuilder>
	//  844 1833:dup             
	//  845 1834:invokespecial   #341 <Method void StringBuilder()>
	//  846 1837:ldc2            #1585 <String "movefrom CREATED: ">
	//  847 1840:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  848 1843:aload_1         
	//  849 1844:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  850 1847:invokevirtual   #351 <Method String StringBuilder.toString()>
	//  851 1850:invokestatic    #839 <Method int Log.v(String, String)>
	//  852 1853:pop             
				if(!fragment.mRetaining)
	//* 853 1854:aload_1         
	//* 854 1855:getfield        #769 <Field boolean Fragment.mRetaining>
	//* 855 1858:ifne            1907
				{
					fragment.performDestroy();
	//  856 1861:aload_1         
	//  857 1862:invokevirtual   #1588 <Method void Fragment.performDestroy()>
					dispatchOnFragmentDestroyed(fragment, false);
	//  858 1865:aload_0         
	//  859 1866:aload_1         
	//  860 1867:iconst_0        
	//  861 1868:invokevirtual   #1018 <Method void dispatchOnFragmentDestroyed(Fragment, boolean)>
				} else
	//* 862 1871:aload_1         
	//* 863 1872:invokevirtual   #1591 <Method void Fragment.performDetach()>
	//* 864 1875:aload_0         
	//* 865 1876:aload_1         
	//* 866 1877:iconst_0        
	//* 867 1878:invokevirtual   #1025 <Method void dispatchOnFragmentDetached(Fragment, boolean)>
	//* 868 1881:iload_2         
	//* 869 1882:istore          6
	//* 870 1884:iload           5
	//* 871 1886:ifne            223
	//* 872 1889:aload_1         
	//* 873 1890:getfield        #769 <Field boolean Fragment.mRetaining>
	//* 874 1893:ifne            1915
	//* 875 1896:aload_0         
	//* 876 1897:aload_1         
	//* 877 1898:invokevirtual   #1593 <Method void makeInactive(Fragment)>
	//* 878 1901:iload_2         
	//* 879 1902:istore          6
	//* 880 1904:goto            223
				{
					fragment.mState = 0;
	//  881 1907:aload_1         
	//  882 1908:iconst_0        
	//  883 1909:putfield        #211 <Field int Fragment.mState>
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
	//* 884 1912:goto            1871
					{
						fragment.mHost = null;
	//  885 1915:aload_1         
	//  886 1916:aconst_null     
	//  887 1917:putfield        #1448 <Field FragmentHostCallback Fragment.mHost>
						fragment.mParentFragment = null;
	//  888 1920:aload_1         
	//  889 1921:aconst_null     
	//  890 1922:putfield        #1451 <Field Fragment Fragment.mParentFragment>
						fragment.mFragmentManager = null;
	//  891 1925:aload_1         
	//  892 1926:aconst_null     
	//  893 1927:putfield        #1458 <Field FragmentManagerImpl Fragment.mFragmentManager>
						i1 = i;
	//  894 1930:iload_2         
	//  895 1931:istore          6
					}
			}
		}
		continue; /* Loop/switch isn't completed */
	//  896 1933:goto            223
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
				obj1 = null;
				animationoranimator = ((AnimationOrAnimator) (obj1));
				if(mCurState > 0)
				{
					animationoranimator = ((AnimationOrAnimator) (obj1));
					if(!mDestroyed)
					{
						animationoranimator = ((AnimationOrAnimator) (obj1));
						if(fragment.mView.getVisibility() == 0)
						{
							animationoranimator = ((AnimationOrAnimator) (obj1));
							if(fragment.mPostponedAlpha >= 0.0F)
								animationoranimator = loadAnimation(fragment, j, false, k);
						}
					}
				}
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
		  goto _L14
		if(true) goto _L12; else goto _L15
_L15:
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
		s = attributeset.getAttributeValue(((String) (null)), "class");
	//    6   12:aload           4
	//    7   14:aconst_null     
	//    8   15:ldc2            #1604 <String "class">
	//    9   18:invokeinterface #1610 <Method String AttributeSet.getAttributeValue(String, String)>
	//   10   23:astore_2        
		TypedArray typedarray = context.obtainStyledAttributes(attributeset, FragmentTag.Fragment);
	//   11   24:aload_3         
	//   12   25:aload           4
	//   13   27:getstatic       #1614 <Field int[] FragmentManagerImpl$FragmentTag.Fragment>
	//   14   30:invokevirtual   #1618 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   15   33:astore          10
		String s1 = s;
	//   16   35:aload_2         
	//   17   36:astore          8
		if(s == null)
	//*  18   38:aload_2         
	//*  19   39:ifnonnull       50
			s1 = typedarray.getString(0);
	//   20   42:aload           10
	//   21   44:iconst_0        
	//   22   45:invokevirtual   #1623 <Method String TypedArray.getString(int)>
	//   23   48:astore          8
		int k = typedarray.getResourceId(1, -1);
	//   24   50:aload           10
	//   25   52:iconst_1        
	//   26   53:iconst_m1       
	//   27   54:invokevirtual   #1626 <Method int TypedArray.getResourceId(int, int)>
	//   28   57:istore          7
		String s2 = typedarray.getString(2);
	//   29   59:aload           10
	//   30   61:iconst_2        
	//   31   62:invokevirtual   #1623 <Method String TypedArray.getString(int)>
	//   32   65:astore          9
		typedarray.recycle();
	//   33   67:aload           10
	//   34   69:invokevirtual   #1629 <Method void TypedArray.recycle()>
		if(!Fragment.isSupportFragmentClass(mHost.getContext(), s1))
	//*  35   72:aload_0         
	//*  36   73:getfield        #444 <Field FragmentHostCallback mHost>
	//*  37   76:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//*  38   79:aload           8
	//*  39   81:invokestatic    #1633 <Method boolean Fragment.isSupportFragmentClass(Context, String)>
	//*  40   84:ifne            89
			return null;
	//   41   87:aconst_null     
	//   42   88:areturn         
		int i;
		if(view != null)
	//*  43   89:aload_1         
	//*  44   90:ifnull          155
			i = view.getId();
	//   45   93:aload_1         
	//   46   94:invokevirtual   #1636 <Method int View.getId()>
	//   47   97:istore          5
		else
	//*  48   99:iload           5
	//*  49  101:iconst_m1       
	//*  50  102:icmpne          161
	//*  51  105:iload           7
	//*  52  107:iconst_m1       
	//*  53  108:icmpne          161
	//*  54  111:aload           9
	//*  55  113:ifnonnull       161
	//*  56  116:new             #1496 <Class IllegalArgumentException>
	//*  57  119:dup             
	//*  58  120:new             #340 <Class StringBuilder>
	//*  59  123:dup             
	//*  60  124:invokespecial   #341 <Method void StringBuilder()>
	//*  61  127:aload           4
	//*  62  129:invokeinterface #1639 <Method String AttributeSet.getPositionDescription()>
	//*  63  134:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//*  64  137:ldc2            #1641 <String ": Must specify unique android:id, android:tag, or have a parent with an id for ">
	//*  65  140:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//*  66  143:aload           8
	//*  67  145:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//*  68  148:invokevirtual   #351 <Method String StringBuilder.toString()>
	//*  69  151:invokespecial   #1501 <Method void IllegalArgumentException(String)>
	//*  70  154:athrow          
			i = 0;
	//   71  155:iconst_0        
	//   72  156:istore          5
		if(i == -1 && k == -1 && s2 == null)
			throw new IllegalArgumentException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Must specify unique android:id, android:tag, or have a parent with an id for ").append(s1).toString());
	//*  73  158:goto            99
		if(k != -1)
	//*  74  161:iload           7
	//*  75  163:iconst_m1       
	//*  76  164:icmpeq          427
			s = ((String) (findFragmentById(k)));
	//   77  167:aload_0         
	//   78  168:iload           7
	//   79  170:invokevirtual   #1643 <Method Fragment findFragmentById(int)>
	//   80  173:astore_2        
		else
	//*  81  174:aload_2         
	//*  82  175:astore_1        
	//*  83  176:aload_2         
	//*  84  177:ifnonnull       194
	//*  85  180:aload_2         
	//*  86  181:astore_1        
	//*  87  182:aload           9
	//*  88  184:ifnull          194
	//*  89  187:aload_0         
	//*  90  188:aload           9
	//*  91  190:invokevirtual   #1645 <Method Fragment findFragmentByTag(String)>
	//*  92  193:astore_1        
	//*  93  194:aload_1         
	//*  94  195:astore_2        
	//*  95  196:aload_1         
	//*  96  197:ifnonnull       215
	//*  97  200:aload_1         
	//*  98  201:astore_2        
	//*  99  202:iload           5
	//* 100  204:iconst_m1       
	//* 101  205:icmpeq          215
	//* 102  208:aload_0         
	//* 103  209:iload           5
	//* 104  211:invokevirtual   #1643 <Method Fragment findFragmentById(int)>
	//* 105  214:astore_2        
	//* 106  215:getstatic       #133 <Field boolean DEBUG>
	//* 107  218:ifeq            272
	//* 108  221:ldc1            #67  <String "FragmentManager">
	//* 109  223:new             #340 <Class StringBuilder>
	//* 110  226:dup             
	//* 111  227:invokespecial   #341 <Method void StringBuilder()>
	//* 112  230:ldc2            #1647 <String "onCreateView: id=0x">
	//* 113  233:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 114  236:iload           7
	//* 115  238:invokestatic    #1137 <Method String Integer.toHexString(int)>
	//* 116  241:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 117  244:ldc2            #1649 <String " fname=">
	//* 118  247:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 119  250:aload           8
	//* 120  252:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 121  255:ldc2            #1651 <String " existing=">
	//* 122  258:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 123  261:aload_2         
	//* 124  262:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 125  265:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 126  268:invokestatic    #839 <Method int Log.v(String, String)>
	//* 127  271:pop             
	//* 128  272:aload_2         
	//* 129  273:ifnonnull       439
	//* 130  276:aload_0         
	//* 131  277:getfield        #903 <Field FragmentContainer mContainer>
	//* 132  280:aload_3         
	//* 133  281:aload           8
	//* 134  283:aconst_null     
	//* 135  284:invokevirtual   #1655 <Method Fragment FragmentContainer.instantiate(Context, String, Bundle)>
	//* 136  287:astore_1        
	//* 137  288:aload_1         
	//* 138  289:iconst_1        
	//* 139  290:putfield        #1205 <Field boolean Fragment.mFromLayout>
	//* 140  293:iload           7
	//* 141  295:ifeq            432
	//* 142  298:iload           7
	//* 143  300:istore          6
	//* 144  302:aload_1         
	//* 145  303:iload           6
	//* 146  305:putfield        #1240 <Field int Fragment.mFragmentId>
	//* 147  308:aload_1         
	//* 148  309:iload           5
	//* 149  311:putfield        #388 <Field int Fragment.mContainerId>
	//* 150  314:aload_1         
	//* 151  315:aload           9
	//* 152  317:putfield        #1245 <Field String Fragment.mTag>
	//* 153  320:aload_1         
	//* 154  321:iconst_1        
	//* 155  322:putfield        #1404 <Field boolean Fragment.mInLayout>
	//* 156  325:aload_1         
	//* 157  326:aload_0         
	//* 158  327:putfield        #1458 <Field FragmentManagerImpl Fragment.mFragmentManager>
	//* 159  330:aload_1         
	//* 160  331:aload_0         
	//* 161  332:getfield        #444 <Field FragmentHostCallback mHost>
	//* 162  335:putfield        #1448 <Field FragmentHostCallback Fragment.mHost>
	//* 163  338:aload_1         
	//* 164  339:aload_0         
	//* 165  340:getfield        #444 <Field FragmentHostCallback mHost>
	//* 166  343:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//* 167  346:aload           4
	//* 168  348:aload_1         
	//* 169  349:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//* 170  352:invokevirtual   #1659 <Method void Fragment.onInflate(Context, AttributeSet, Bundle)>
	//* 171  355:aload_0         
	//* 172  356:aload_1         
	//* 173  357:iconst_1        
	//* 174  358:invokevirtual   #1661 <Method void addFragment(Fragment, boolean)>
	//* 175  361:aload_0         
	//* 176  362:getfield        #171 <Field int mCurState>
	//* 177  365:iconst_1        
	//* 178  366:icmpge          568
	//* 179  369:aload_1         
	//* 180  370:getfield        #1205 <Field boolean Fragment.mFromLayout>
	//* 181  373:ifeq            568
	//* 182  376:aload_0         
	//* 183  377:aload_1         
	//* 184  378:iconst_1        
	//* 185  379:iconst_0        
	//* 186  380:iconst_0        
	//* 187  381:iconst_0        
	//* 188  382:invokevirtual   #221 <Method void moveToState(Fragment, int, int, int, boolean)>
	//* 189  385:aload_1         
	//* 190  386:getfield        #225 <Field View Fragment.mView>
	//* 191  389:ifnonnull       576
	//* 192  392:new             #331 <Class IllegalStateException>
	//* 193  395:dup             
	//* 194  396:new             #340 <Class StringBuilder>
	//* 195  399:dup             
	//* 196  400:invokespecial   #341 <Method void StringBuilder()>
	//* 197  403:ldc2            #1460 <String "Fragment ">
	//* 198  406:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 199  409:aload           8
	//* 200  411:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 201  414:ldc2            #1663 <String " did not create a view.">
	//* 202  417:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 203  420:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 204  423:invokespecial   #336 <Method void IllegalStateException(String)>
	//* 205  426:athrow          
			s = null;
	//  206  427:aconst_null     
	//  207  428:astore_2        
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
	//* 208  429:goto            174
				j = i;
	//  209  432:iload           5
	//  210  434:istore          6
			view.mFragmentId = j;
			view.mContainerId = i;
			view.mTag = s2;
			view.mInLayout = true;
			view.mFragmentManager = this;
			view.mHost = mHost;
			((Fragment) (view)).onInflate(mHost.getContext(), attributeset, ((Fragment) (view)).mSavedFragmentState);
			addFragment(((Fragment) (view)), true);
		} else
	//* 211  436:goto            302
		{
			if(((Fragment) (s)).mInLayout)
	//* 212  439:aload_2         
	//* 213  440:getfield        #1404 <Field boolean Fragment.mInLayout>
	//* 214  443:ifeq            524
				throw new IllegalArgumentException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Duplicate id 0x").append(Integer.toHexString(k)).append(", tag ").append(s2).append(", or parent id 0x").append(Integer.toHexString(i)).append(" with another fragment for ").append(s1).toString());
	//  215  446:new             #1496 <Class IllegalArgumentException>
	//  216  449:dup             
	//  217  450:new             #340 <Class StringBuilder>
	//  218  453:dup             
	//  219  454:invokespecial   #341 <Method void StringBuilder()>
	//  220  457:aload           4
	//  221  459:invokeinterface #1639 <Method String AttributeSet.getPositionDescription()>
	//  222  464:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  223  467:ldc2            #1665 <String ": Duplicate id 0x">
	//  224  470:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  225  473:iload           7
	//  226  475:invokestatic    #1137 <Method String Integer.toHexString(int)>
	//  227  478:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  228  481:ldc2            #1667 <String ", tag ">
	//  229  484:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  230  487:aload           9
	//  231  489:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  232  492:ldc2            #1669 <String ", or parent id 0x">
	//  233  495:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  234  498:iload           5
	//  235  500:invokestatic    #1137 <Method String Integer.toHexString(int)>
	//  236  503:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  237  506:ldc2            #1671 <String " with another fragment for ">
	//  238  509:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  239  512:aload           8
	//  240  514:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  241  517:invokevirtual   #351 <Method String StringBuilder.toString()>
	//  242  520:invokespecial   #1501 <Method void IllegalArgumentException(String)>
	//  243  523:athrow          
			s.mInLayout = true;
	//  244  524:aload_2         
	//  245  525:iconst_1        
	//  246  526:putfield        #1404 <Field boolean Fragment.mInLayout>
			s.mHost = mHost;
	//  247  529:aload_2         
	//  248  530:aload_0         
	//  249  531:getfield        #444 <Field FragmentHostCallback mHost>
	//  250  534:putfield        #1448 <Field FragmentHostCallback Fragment.mHost>
			view = ((View) (s));
	//  251  537:aload_2         
	//  252  538:astore_1        
			if(!((Fragment) (s)).mRetaining)
	//* 253  539:aload_2         
	//* 254  540:getfield        #769 <Field boolean Fragment.mRetaining>
	//* 255  543:ifne            361
			{
				((Fragment) (s)).onInflate(mHost.getContext(), attributeset, ((Fragment) (s)).mSavedFragmentState);
	//  256  546:aload_2         
	//  257  547:aload_0         
	//  258  548:getfield        #444 <Field FragmentHostCallback mHost>
	//  259  551:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//  260  554:aload           4
	//  261  556:aload_2         
	//  262  557:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//  263  560:invokevirtual   #1659 <Method void Fragment.onInflate(Context, AttributeSet, Bundle)>
				view = ((View) (s));
	//  264  563:aload_2         
	//  265  564:astore_1        
			}
		}
		if(mCurState < 1 && ((Fragment) (view)).mFromLayout)
			moveToState(((Fragment) (view)), 1, 0, 0, false);
		else
	//* 266  565:goto            361
			moveToState(((Fragment) (view)));
	//  267  568:aload_0         
	//  268  569:aload_1         
	//  269  570:invokevirtual   #867 <Method void moveToState(Fragment)>
		if(((Fragment) (view)).mView == null)
			throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(s1).append(" did not create a view.").toString());
	//* 270  573:goto            385
		if(k != 0)
	//* 271  576:iload           7
	//* 272  578:ifeq            590
			((Fragment) (view)).mView.setId(k);
	//  273  581:aload_1         
	//  274  582:getfield        #225 <Field View Fragment.mView>
	//  275  585:iload           7
	//  276  587:invokevirtual   #1674 <Method void View.setId(int)>
		if(((Fragment) (view)).mView.getTag() == null)
	//* 277  590:aload_1         
	//* 278  591:getfield        #225 <Field View Fragment.mView>
	//* 279  594:invokevirtual   #1677 <Method Object View.getTag()>
	//* 280  597:ifnonnull       609
			((Fragment) (view)).mView.setTag(((Object) (s2)));
	//  281  600:aload_1         
	//  282  601:getfield        #225 <Field View Fragment.mView>
	//  283  604:aload           9
	//  284  606:invokevirtual   #1680 <Method void View.setTag(Object)>
		return ((Fragment) (view)).mView;
	//  285  609:aload_1         
	//  286  610:getfield        #225 <Field View Fragment.mView>
	//  287  613:areturn         
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
		if(mBackStack != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #829 <Field ArrayList mBackStack>
	//    2    4:ifnonnull       9
_L1:
		return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
_L2:
		if(s != null || i >= 0 || (j & 1) != 0) goto _L4; else goto _L3
	//    5    9:aload_3         
	//    6   10:ifnonnull       66
	//    7   13:iload           4
	//    8   15:ifge            66
	//    9   18:iload           5
	//   10   20:iconst_1        
	//   11   21:iand            
	//   12   22:ifne            66
	//*  13   25:aload_0         
	//*  14   26:getfield        #829 <Field ArrayList mBackStack>
	//*  15   29:invokevirtual   #202 <Method int ArrayList.size()>
	//*  16   32:iconst_1        
	//*  17   33:isub            
	//*  18   34:istore          4
_L3:
		if((i = mBackStack.size() - 1) < 0) goto _L1; else goto _L5
	//   19   36:iload           4
	//   20   38:iflt            7
_L5:
		arraylist.add(mBackStack.remove(i));
	//   21   41:aload_1         
	//   22   42:aload_0         
	//   23   43:getfield        #829 <Field ArrayList mBackStack>
	//   24   46:iload           4
	//   25   48:invokevirtual   #545 <Method Object ArrayList.remove(int)>
	//   26   51:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//   27   54:pop             
		arraylist1.add(((Object) (Boolean.valueOf(true))));
	//   28   55:aload_2         
	//   29   56:iconst_1        
	//   30   57:invokestatic    #376 <Method Boolean Boolean.valueOf(boolean)>
	//   31   60:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//   32   63:pop             
_L8:
		return true;
	//   33   64:iconst_1        
	//   34   65:ireturn         
_L4:
		int k;
		int l;
		k = -1;
	//   35   66:iconst_m1       
	//   36   67:istore          6
		if(s == null && i < 0)
			continue; /* Loop/switch isn't completed */
	//   37   69:aload_3         
	//   38   70:ifnonnull       78
	//   39   73:iload           4
	//   40   75:iflt            241
		l = mBackStack.size() - 1;
	//   41   78:aload_0         
	//   42   79:getfield        #829 <Field ArrayList mBackStack>
	//   43   82:invokevirtual   #202 <Method int ArrayList.size()>
	//   44   85:iconst_1        
	//   45   86:isub            
	//   46   87:istore          7
		break MISSING_BLOCK_LABEL_89;
	//*  47   89:iload           7
	//*  48   91:iflt            124
	//*  49   94:aload_0         
	//*  50   95:getfield        #829 <Field ArrayList mBackStack>
	//*  51   98:iload           7
	//*  52  100:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//*  53  103:checkcast       #363 <Class BackStackRecord>
	//*  54  106:astore          8
	//*  55  108:aload_3         
	//*  56  109:ifnull          217
	//*  57  112:aload_3         
	//*  58  113:aload           8
	//*  59  115:invokevirtual   #1701 <Method String BackStackRecord.getName()>
	//*  60  118:invokevirtual   #667 <Method boolean String.equals(Object)>
	//*  61  121:ifeq            217
		if(l < 0) goto _L1; else goto _L6
	//   62  124:iload           7
	//   63  126:iflt            7
_L6:
		k = l;
	//   64  129:iload           7
	//   65  131:istore          6
		if((j & 1) == 0)
			continue; /* Loop/switch isn't completed */
	//   66  133:iload           5
	//   67  135:iconst_1        
	//   68  136:iand            
	//   69  137:ifeq            241
		j = l - 1;
	//   70  140:iload           7
	//   71  142:iconst_1        
	//   72  143:isub            
	//   73  144:istore          5
		do
		{
			k = j;
	//   74  146:iload           5
	//   75  148:istore          6
			if(j < 0)
				continue; /* Loop/switch isn't completed */
	//   76  150:iload           5
	//   77  152:iflt            241
			backstackrecord = (BackStackRecord)mBackStack.get(j);
	//   78  155:aload_0         
	//   79  156:getfield        #829 <Field ArrayList mBackStack>
	//   80  159:iload           5
	//   81  161:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   82  164:checkcast       #363 <Class BackStackRecord>
	//   83  167:astore          8
			if(s == null || !s.equals(((Object) (backstackrecord.getName()))))
	//*  84  169:aload_3         
	//*  85  170:ifnull          185
	//*  86  173:aload_3         
	//*  87  174:aload           8
	//*  88  176:invokevirtual   #1701 <Method String BackStackRecord.getName()>
	//*  89  179:invokevirtual   #667 <Method boolean String.equals(Object)>
	//*  90  182:ifne            208
			{
				k = j;
	//   91  185:iload           5
	//   92  187:istore          6
				if(i < 0)
					continue; /* Loop/switch isn't completed */
	//   93  189:iload           4
	//   94  191:iflt            241
				k = j;
	//   95  194:iload           5
	//   96  196:istore          6
				if(i != backstackrecord.mIndex)
					continue; /* Loop/switch isn't completed */
	//   97  198:iload           4
	//   98  200:aload           8
	//   99  202:getfield        #510 <Field int BackStackRecord.mIndex>
	//  100  205:icmpne          241
			}
			j--;
	//  101  208:iload           5
	//  102  210:iconst_1        
	//  103  211:isub            
	//  104  212:istore          5
		} while(true);
	//  105  214:goto            146
		do
		{
			if(l < 0)
				continue; /* Loop/switch isn't completed */
			BackStackRecord backstackrecord = (BackStackRecord)mBackStack.get(l);
			if(s != null && s.equals(((Object) (backstackrecord.getName()))) || i >= 0 && i == backstackrecord.mIndex)
				continue; /* Loop/switch isn't completed */
	//  106  217:iload           4
	//  107  219:iflt            232
	//  108  222:iload           4
	//  109  224:aload           8
	//  110  226:getfield        #510 <Field int BackStackRecord.mIndex>
	//  111  229:icmpeq          124
			l--;
	//  112  232:iload           7
	//  113  234:iconst_1        
	//  114  235:isub            
	//  115  236:istore          7
		} while(true);
	//  116  238:goto            89
		if(k == mBackStack.size() - 1) goto _L1; else goto _L7
	//  117  241:iload           6
	//  118  243:aload_0         
	//  119  244:getfield        #829 <Field ArrayList mBackStack>
	//  120  247:invokevirtual   #202 <Method int ArrayList.size()>
	//  121  250:iconst_1        
	//  122  251:isub            
	//  123  252:icmpeq          7
_L7:
		i = mBackStack.size() - 1;
	//  124  255:aload_0         
	//  125  256:getfield        #829 <Field ArrayList mBackStack>
	//  126  259:invokevirtual   #202 <Method int ArrayList.size()>
	//  127  262:iconst_1        
	//  128  263:isub            
	//  129  264:istore          4
		while(i > k) 
	//* 130  266:iload           4
	//* 131  268:iload           6
	//* 132  270:icmple          64
		{
			arraylist.add(mBackStack.remove(i));
	//  133  273:aload_1         
	//  134  274:aload_0         
	//  135  275:getfield        #829 <Field ArrayList mBackStack>
	//  136  278:iload           4
	//  137  280:invokevirtual   #545 <Method Object ArrayList.remove(int)>
	//  138  283:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//  139  286:pop             
			arraylist1.add(((Object) (Boolean.valueOf(true))));
	//  140  287:aload_2         
	//  141  288:iconst_1        
	//  142  289:invokestatic    #376 <Method Boolean Boolean.valueOf(boolean)>
	//  143  292:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//  144  295:pop             
			i--;
	//  145  296:iload           4
	//  146  298:iconst_1        
	//  147  299:isub            
	//  148  300:istore          4
		}
		  goto _L8
	//* 149  302:goto            266
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
	//    5    9:astore          8
	//    6   11:aload           8
	//    7   13:getfield        #1736 <Field FragmentState[] FragmentManagerState.mActive>
	//    8   16:ifnull          4
		parcelable = null;
	//    9   19:aconst_null     
	//   10   20:astore_1        
		if(fragmentmanagernonconfig != null)
	//*  11   21:aload_2         
	//*  12   22:ifnull          297
		{
			List list1 = fragmentmanagernonconfig.getFragments();
	//   13   25:aload_2         
	//   14   26:invokevirtual   #753 <Method List FragmentManagerNonConfig.getFragments()>
	//   15   29:astore          7
			List list = fragmentmanagernonconfig.getChildNonConfigs();
	//   16   31:aload_2         
	//   17   32:invokevirtual   #772 <Method List FragmentManagerNonConfig.getChildNonConfigs()>
	//   18   35:astore          6
			int i;
			int j1;
			if(list1 != null)
	//*  19   37:aload           7
	//*  20   39:ifnull          148
				i = list1.size();
	//   21   42:aload           7
	//   22   44:invokeinterface #676 <Method int List.size()>
	//   23   49:istore_3        
			else
	//*  24   50:iconst_0        
	//*  25   51:istore          4
	//*  26   53:aload           6
	//*  27   55:astore_1        
	//*  28   56:iload           4
	//*  29   58:iload_3         
	//*  30   59:icmpge          297
	//*  31   62:aload           7
	//*  32   64:iload           4
	//*  33   66:invokeinterface #677 <Method Object List.get(int)>
	//*  34   71:checkcast       #208 <Class Fragment>
	//*  35   74:astore_1        
	//*  36   75:getstatic       #133 <Field boolean DEBUG>
	//*  37   78:ifeq            107
	//*  38   81:ldc1            #67  <String "FragmentManager">
	//*  39   83:new             #340 <Class StringBuilder>
	//*  40   86:dup             
	//*  41   87:invokespecial   #341 <Method void StringBuilder()>
	//*  42   90:ldc2            #1738 <String "restoreAllState: re-attaching retained ">
	//*  43   93:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//*  44   96:aload_1         
	//*  45   97:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//*  46  100:invokevirtual   #351 <Method String StringBuilder.toString()>
	//*  47  103:invokestatic    #839 <Method int Log.v(String, String)>
	//*  48  106:pop             
	//*  49  107:iconst_0        
	//*  50  108:istore          5
	//*  51  110:iload           5
	//*  52  112:aload           8
	//*  53  114:getfield        #1736 <Field FragmentState[] FragmentManagerState.mActive>
	//*  54  117:arraylength     
	//*  55  118:icmpge          153
	//*  56  121:aload           8
	//*  57  123:getfield        #1736 <Field FragmentState[] FragmentManagerState.mActive>
	//*  58  126:iload           5
	//*  59  128:aaload          
	//*  60  129:getfield        #1741 <Field int FragmentState.mIndex>
	//*  61  132:aload_1         
	//*  62  133:getfield        #1350 <Field int Fragment.mIndex>
	//*  63  136:icmpeq          153
	//*  64  139:iload           5
	//*  65  141:iconst_1        
	//*  66  142:iadd            
	//*  67  143:istore          5
	//*  68  145:goto            110
				i = 0;
	//   69  148:iconst_0        
	//   70  149:istore_3        
			j1 = 0;
			do
			{
				parcelable = ((Parcelable) (list));
				if(j1 >= i)
					break;
				parcelable = ((Parcelable) ((Fragment)list1.get(j1)));
				if(DEBUG)
					Log.v("FragmentManager", (new StringBuilder()).append("restoreAllState: re-attaching retained ").append(((Object) (parcelable))).toString());
				int l1;
				for(l1 = 0; l1 < fragmentmanagerstate.mActive.length && fragmentmanagerstate.mActive[l1].mIndex != ((Fragment) (parcelable)).mIndex; l1++);
	//*  71  150:goto            50
				if(l1 == fragmentmanagerstate.mActive.length)
	//*  72  153:iload           5
	//*  73  155:aload           8
	//*  74  157:getfield        #1736 <Field FragmentState[] FragmentManagerState.mActive>
	//*  75  160:arraylength     
	//*  76  161:icmpne          198
					throwException(((RuntimeException) (new IllegalStateException((new StringBuilder()).append("Could not find active fragment with index ").append(((Fragment) (parcelable)).mIndex).toString()))));
	//   77  164:aload_0         
	//   78  165:new             #331 <Class IllegalStateException>
	//   79  168:dup             
	//   80  169:new             #340 <Class StringBuilder>
	//   81  172:dup             
	//   82  173:invokespecial   #341 <Method void StringBuilder()>
	//   83  176:ldc2            #1743 <String "Could not find active fragment with index ">
	//   84  179:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   85  182:aload_1         
	//   86  183:getfield        #1350 <Field int Fragment.mIndex>
	//   87  186:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//   88  189:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   89  192:invokespecial   #336 <Method void IllegalStateException(String)>
	//   90  195:invokespecial   #1276 <Method void throwException(RuntimeException)>
				FragmentState fragmentstate = fragmentmanagerstate.mActive[l1];
	//   91  198:aload           8
	//   92  200:getfield        #1736 <Field FragmentState[] FragmentManagerState.mActive>
	//   93  203:iload           5
	//   94  205:aaload          
	//   95  206:astore          9
				fragmentstate.mInstance = ((Fragment) (parcelable));
	//   96  208:aload           9
	//   97  210:aload_1         
	//   98  211:putfield        #1746 <Field Fragment FragmentState.mInstance>
				parcelable.mSavedViewState = null;
	//   99  214:aload_1         
	//  100  215:aconst_null     
	//  101  216:putfield        #1432 <Field SparseArray Fragment.mSavedViewState>
				parcelable.mBackStackNesting = 0;
	//  102  219:aload_1         
	//  103  220:iconst_0        
	//  104  221:putfield        #1723 <Field int Fragment.mBackStackNesting>
				parcelable.mInLayout = false;
	//  105  224:aload_1         
	//  106  225:iconst_0        
	//  107  226:putfield        #1404 <Field boolean Fragment.mInLayout>
				parcelable.mAdded = false;
	//  108  229:aload_1         
	//  109  230:iconst_0        
	//  110  231:putfield        #640 <Field boolean Fragment.mAdded>
				parcelable.mTarget = null;
	//  111  234:aload_1         
	//  112  235:aconst_null     
	//  113  236:putfield        #1437 <Field Fragment Fragment.mTarget>
				if(fragmentstate.mSavedFragmentState != null)
	//* 114  239:aload           9
	//* 115  241:getfield        #1747 <Field Bundle FragmentState.mSavedFragmentState>
	//* 116  244:ifnull          288
				{
					fragmentstate.mSavedFragmentState.setClassLoader(mHost.getContext().getClassLoader());
	//  117  247:aload           9
	//  118  249:getfield        #1747 <Field Bundle FragmentState.mSavedFragmentState>
	//  119  252:aload_0         
	//  120  253:getfield        #444 <Field FragmentHostCallback mHost>
	//  121  256:invokevirtual   #1312 <Method Context FragmentHostCallback.getContext()>
	//  122  259:invokevirtual   #1421 <Method ClassLoader Context.getClassLoader()>
	//  123  262:invokevirtual   #1425 <Method void Bundle.setClassLoader(ClassLoader)>
					parcelable.mSavedViewState = fragmentstate.mSavedFragmentState.getSparseParcelableArray("android:view_state");
	//  124  265:aload_1         
	//  125  266:aload           9
	//  126  268:getfield        #1747 <Field Bundle FragmentState.mSavedFragmentState>
	//  127  271:ldc1            #79  <String "android:view_state">
	//  128  273:invokevirtual   #1429 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//  129  276:putfield        #1432 <Field SparseArray Fragment.mSavedViewState>
					parcelable.mSavedFragmentState = fragmentstate.mSavedFragmentState;
	//  130  279:aload_1         
	//  131  280:aload           9
	//  132  282:getfield        #1747 <Field Bundle FragmentState.mSavedFragmentState>
	//  133  285:putfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
				}
				j1++;
	//  134  288:iload           4
	//  135  290:iconst_1        
	//  136  291:iadd            
	//  137  292:istore          4
			} while(true);
	//  138  294:goto            53
		}
		mActive = new SparseArray(fragmentmanagerstate.mActive.length);
	//  139  297:aload_0         
	//  140  298:new             #315 <Class SparseArray>
	//  141  301:dup             
	//  142  302:aload           8
	//  143  304:getfield        #1736 <Field FragmentState[] FragmentManagerState.mActive>
	//  144  307:arraylength     
	//  145  308:invokespecial   #1748 <Method void SparseArray(int)>
	//  146  311:putfield        #313 <Field SparseArray mActive>
		for(int j = 0; j < fragmentmanagerstate.mActive.length; j++)
	//* 147  314:iconst_0        
	//* 148  315:istore_3        
	//* 149  316:iload_3         
	//* 150  317:aload           8
	//* 151  319:getfield        #1736 <Field FragmentState[] FragmentManagerState.mActive>
	//* 152  322:arraylength     
	//* 153  323:icmpge          468
		{
			FragmentState fragmentstate1 = fragmentmanagerstate.mActive[j];
	//  154  326:aload           8
	//  155  328:getfield        #1736 <Field FragmentState[] FragmentManagerState.mActive>
	//  156  331:iload_3         
	//  157  332:aaload          
	//  158  333:astore          9
			if(fragmentstate1 == null)
				continue;
	//  159  335:aload           9
	//  160  337:ifnull          461
			Object obj1 = null;
	//  161  340:aconst_null     
	//  162  341:astore          7
			Object obj = ((Object) (obj1));
	//  163  343:aload           7
	//  164  345:astore          6
			if(parcelable != null)
	//* 165  347:aload_1         
	//* 166  348:ifnull          377
			{
				obj = ((Object) (obj1));
	//  167  351:aload           7
	//  168  353:astore          6
				if(j < ((List) (parcelable)).size())
	//* 169  355:iload_3         
	//* 170  356:aload_1         
	//* 171  357:invokeinterface #676 <Method int List.size()>
	//* 172  362:icmpge          377
					obj = ((Object) ((FragmentManagerNonConfig)((List) (parcelable)).get(j)));
	//  173  365:aload_1         
	//  174  366:iload_3         
	//  175  367:invokeinterface #677 <Method Object List.get(int)>
	//  176  372:checkcast       #750 <Class FragmentManagerNonConfig>
	//  177  375:astore          6
			}
			obj = ((Object) (fragmentstate1.instantiate(mHost, mContainer, mParent, ((FragmentManagerNonConfig) (obj)))));
	//  178  377:aload           9
	//  179  379:aload_0         
	//  180  380:getfield        #444 <Field FragmentHostCallback mHost>
	//  181  383:aload_0         
	//  182  384:getfield        #903 <Field FragmentContainer mContainer>
	//  183  387:aload_0         
	//  184  388:getfield        #905 <Field Fragment mParent>
	//  185  391:aload           6
	//  186  393:invokevirtual   #1751 <Method Fragment FragmentState.instantiate(FragmentHostCallback, FragmentContainer, Fragment, FragmentManagerNonConfig)>
	//  187  396:astore          6
			if(DEBUG)
	//* 188  398:getstatic       #133 <Field boolean DEBUG>
	//* 189  401:ifeq            441
				Log.v("FragmentManager", (new StringBuilder()).append("restoreAllState: active #").append(j).append(": ").append(obj).toString());
	//  190  404:ldc1            #67  <String "FragmentManager">
	//  191  406:new             #340 <Class StringBuilder>
	//  192  409:dup             
	//  193  410:invokespecial   #341 <Method void StringBuilder()>
	//  194  413:ldc2            #1753 <String "restoreAllState: active #">
	//  195  416:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  196  419:iload_3         
	//  197  420:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//  198  423:ldc2            #1148 <String ": ">
	//  199  426:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  200  429:aload           6
	//  201  431:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  202  434:invokevirtual   #351 <Method String StringBuilder.toString()>
	//  203  437:invokestatic    #839 <Method int Log.v(String, String)>
	//  204  440:pop             
			mActive.put(((Fragment) (obj)).mIndex, obj);
	//  205  441:aload_0         
	//  206  442:getfield        #313 <Field SparseArray mActive>
	//  207  445:aload           6
	//  208  447:getfield        #1350 <Field int Fragment.mIndex>
	//  209  450:aload           6
	//  210  452:invokevirtual   #1358 <Method void SparseArray.put(int, Object)>
			fragmentstate1.mInstance = null;
	//  211  455:aload           9
	//  212  457:aconst_null     
	//  213  458:putfield        #1746 <Field Fragment FragmentState.mInstance>
		}

	//  214  461:iload_3         
	//  215  462:iconst_1        
	//  216  463:iadd            
	//  217  464:istore_3        
	//* 218  465:goto            316
		if(fragmentmanagernonconfig != null)
	//* 219  468:aload_2         
	//* 220  469:ifnull          594
		{
			parcelable = ((Parcelable) (fragmentmanagernonconfig.getFragments()));
	//  221  472:aload_2         
	//  222  473:invokevirtual   #753 <Method List FragmentManagerNonConfig.getFragments()>
	//  223  476:astore_1        
			int k;
			int k1;
			if(parcelable != null)
	//* 224  477:aload_1         
	//* 225  478:ifnull          589
				k = ((List) (parcelable)).size();
	//  226  481:aload_1         
	//  227  482:invokeinterface #676 <Method int List.size()>
	//  228  487:istore_3        
			else
	//* 229  488:iconst_0        
	//* 230  489:istore          4
	//* 231  491:iload           4
	//* 232  493:iload_3         
	//* 233  494:icmpge          594
	//* 234  497:aload_1         
	//* 235  498:iload           4
	//* 236  500:invokeinterface #677 <Method Object List.get(int)>
	//* 237  505:checkcast       #208 <Class Fragment>
	//* 238  508:astore_2        
	//* 239  509:aload_2         
	//* 240  510:getfield        #1756 <Field int Fragment.mTargetIndex>
	//* 241  513:iflt            580
	//* 242  516:aload_2         
	//* 243  517:aload_0         
	//* 244  518:getfield        #313 <Field SparseArray mActive>
	//* 245  521:aload_2         
	//* 246  522:getfield        #1756 <Field int Fragment.mTargetIndex>
	//* 247  525:invokevirtual   #1270 <Method Object SparseArray.get(int)>
	//* 248  528:checkcast       #208 <Class Fragment>
	//* 249  531:putfield        #1437 <Field Fragment Fragment.mTarget>
	//* 250  534:aload_2         
	//* 251  535:getfield        #1437 <Field Fragment Fragment.mTarget>
	//* 252  538:ifnonnull       580
	//* 253  541:ldc1            #67  <String "FragmentManager">
	//* 254  543:new             #340 <Class StringBuilder>
	//* 255  546:dup             
	//* 256  547:invokespecial   #341 <Method void StringBuilder()>
	//* 257  550:ldc2            #1758 <String "Re-attaching retained fragment ">
	//* 258  553:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 259  556:aload_2         
	//* 260  557:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 261  560:ldc2            #1760 <String " target no longer exists: ">
	//* 262  563:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 263  566:aload_2         
	//* 264  567:getfield        #1756 <Field int Fragment.mTargetIndex>
	//* 265  570:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//* 266  573:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 267  576:invokestatic    #1415 <Method int Log.w(String, String)>
	//* 268  579:pop             
	//* 269  580:iload           4
	//* 270  582:iconst_1        
	//* 271  583:iadd            
	//* 272  584:istore          4
	//* 273  586:goto            491
				k = 0;
	//  274  589:iconst_0        
	//  275  590:istore_3        
			for(k1 = 0; k1 < k; k1++)
			{
				fragmentmanagernonconfig = ((FragmentManagerNonConfig) ((Fragment)((List) (parcelable)).get(k1)));
				if(((Fragment) (fragmentmanagernonconfig)).mTargetIndex < 0)
					continue;
				fragmentmanagernonconfig.mTarget = (Fragment)mActive.get(((Fragment) (fragmentmanagernonconfig)).mTargetIndex);
				if(((Fragment) (fragmentmanagernonconfig)).mTarget == null)
					Log.w("FragmentManager", (new StringBuilder()).append("Re-attaching retained fragment ").append(((Object) (fragmentmanagernonconfig))).append(" target no longer exists: ").append(((Fragment) (fragmentmanagernonconfig)).mTargetIndex).toString());
			}

		}
	//* 276  591:goto            488
		mAdded.clear();
	//  277  594:aload_0         
	//  278  595:getfield        #164 <Field ArrayList mAdded>
	//  279  598:invokevirtual   #359 <Method void ArrayList.clear()>
		if(fragmentmanagerstate.mAdded != null)
	//* 280  601:aload           8
	//* 281  603:getfield        #1762 <Field int[] FragmentManagerState.mAdded>
	//* 282  606:ifnull          779
		{
			for(int l = 0; l < fragmentmanagerstate.mAdded.length; l++)
	//* 283  609:iconst_0        
	//* 284  610:istore_3        
	//* 285  611:iload_3         
	//* 286  612:aload           8
	//* 287  614:getfield        #1762 <Field int[] FragmentManagerState.mAdded>
	//* 288  617:arraylength     
	//* 289  618:icmpge          779
			{
				fragmentmanagernonconfig = ((FragmentManagerNonConfig) ((Fragment)mActive.get(fragmentmanagerstate.mAdded[l])));
	//  290  621:aload_0         
	//  291  622:getfield        #313 <Field SparseArray mActive>
	//  292  625:aload           8
	//  293  627:getfield        #1762 <Field int[] FragmentManagerState.mAdded>
	//  294  630:iload_3         
	//  295  631:iaload          
	//  296  632:invokevirtual   #1270 <Method Object SparseArray.get(int)>
	//  297  635:checkcast       #208 <Class Fragment>
	//  298  638:astore_2        
				if(fragmentmanagernonconfig == null)
	//* 299  639:aload_2         
	//* 300  640:ifnonnull       680
					throwException(((RuntimeException) (new IllegalStateException((new StringBuilder()).append("No instantiated fragment for index #").append(fragmentmanagerstate.mAdded[l]).toString()))));
	//  301  643:aload_0         
	//  302  644:new             #331 <Class IllegalStateException>
	//  303  647:dup             
	//  304  648:new             #340 <Class StringBuilder>
	//  305  651:dup             
	//  306  652:invokespecial   #341 <Method void StringBuilder()>
	//  307  655:ldc2            #1764 <String "No instantiated fragment for index #">
	//  308  658:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  309  661:aload           8
	//  310  663:getfield        #1762 <Field int[] FragmentManagerState.mAdded>
	//  311  666:iload_3         
	//  312  667:iaload          
	//  313  668:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//  314  671:invokevirtual   #351 <Method String StringBuilder.toString()>
	//  315  674:invokespecial   #336 <Method void IllegalStateException(String)>
	//  316  677:invokespecial   #1276 <Method void throwException(RuntimeException)>
				fragmentmanagernonconfig.mAdded = true;
	//  317  680:aload_2         
	//  318  681:iconst_1        
	//  319  682:putfield        #640 <Field boolean Fragment.mAdded>
				if(DEBUG)
	//* 320  685:getstatic       #133 <Field boolean DEBUG>
	//* 321  688:ifeq            727
					Log.v("FragmentManager", (new StringBuilder()).append("restoreAllState: added #").append(l).append(": ").append(((Object) (fragmentmanagernonconfig))).toString());
	//  322  691:ldc1            #67  <String "FragmentManager">
	//  323  693:new             #340 <Class StringBuilder>
	//  324  696:dup             
	//  325  697:invokespecial   #341 <Method void StringBuilder()>
	//  326  700:ldc2            #1766 <String "restoreAllState: added #">
	//  327  703:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  328  706:iload_3         
	//  329  707:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//  330  710:ldc2            #1148 <String ": ">
	//  331  713:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  332  716:aload_2         
	//  333  717:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  334  720:invokevirtual   #351 <Method String StringBuilder.toString()>
	//  335  723:invokestatic    #839 <Method int Log.v(String, String)>
	//  336  726:pop             
				if(mAdded.contains(((Object) (fragmentmanagernonconfig))))
	//* 337  727:aload_0         
	//* 338  728:getfield        #164 <Field ArrayList mAdded>
	//* 339  731:aload_2         
	//* 340  732:invokevirtual   #849 <Method boolean ArrayList.contains(Object)>
	//* 341  735:ifeq            749
					throw new IllegalStateException("Already added!");
	//  342  738:new             #331 <Class IllegalStateException>
	//  343  741:dup             
	//  344  742:ldc2            #1768 <String "Already added!">
	//  345  745:invokespecial   #336 <Method void IllegalStateException(String)>
	//  346  748:athrow          
				synchronized(mAdded)
	//* 347  749:aload_0         
	//* 348  750:getfield        #164 <Field ArrayList mAdded>
	//* 349  753:astore_1        
	//* 350  754:aload_1         
	//* 351  755:monitorenter    
				{
					mAdded.add(((Object) (fragmentmanagernonconfig)));
	//  352  756:aload_0         
	//  353  757:getfield        #164 <Field ArrayList mAdded>
	//  354  760:aload_2         
	//  355  761:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//  356  764:pop             
				}
	//  357  765:aload_1         
	//  358  766:monitorexit     
			}

	//  359  767:iload_3         
	//  360  768:iconst_1        
	//  361  769:iadd            
	//  362  770:istore_3        
		}
		break MISSING_BLOCK_LABEL_779;
	//  363  771:goto            611
		fragmentmanagernonconfig;
	//  364  774:astore_2        
		parcelable;
	//  365  775:aload_1         
		JVM INSTR monitorexit ;
	//  366  776:monitorexit     
		throw fragmentmanagernonconfig;
	//  367  777:aload_2         
	//  368  778:athrow          
		if(fragmentmanagerstate.mBackStack != null)
	//* 369  779:aload           8
	//* 370  781:getfield        #1771 <Field BackStackState[] FragmentManagerState.mBackStack>
	//* 371  784:ifnull          945
		{
			mBackStack = new ArrayList(fragmentmanagerstate.mBackStack.length);
	//  372  787:aload_0         
	//  373  788:new             #161 <Class ArrayList>
	//  374  791:dup             
	//  375  792:aload           8
	//  376  794:getfield        #1771 <Field BackStackState[] FragmentManagerState.mBackStack>
	//  377  797:arraylength     
	//  378  798:invokespecial   #369 <Method void ArrayList(int)>
	//  379  801:putfield        #829 <Field ArrayList mBackStack>
			for(int i1 = 0; i1 < fragmentmanagerstate.mBackStack.length; i1++)
	//* 380  804:iconst_0        
	//* 381  805:istore_3        
	//* 382  806:iload_3         
	//* 383  807:aload           8
	//* 384  809:getfield        #1771 <Field BackStackState[] FragmentManagerState.mBackStack>
	//* 385  812:arraylength     
	//* 386  813:icmpge          950
			{
				parcelable = ((Parcelable) (fragmentmanagerstate.mBackStack[i1].instantiate(this)));
	//  387  816:aload           8
	//  388  818:getfield        #1771 <Field BackStackState[] FragmentManagerState.mBackStack>
	//  389  821:iload_3         
	//  390  822:aaload          
	//  391  823:aload_0         
	//  392  824:invokevirtual   #1776 <Method BackStackRecord BackStackState.instantiate(FragmentManagerImpl)>
	//  393  827:astore_1        
				if(DEBUG)
	//* 394  828:getstatic       #133 <Field boolean DEBUG>
	//* 395  831:ifeq            913
				{
					Log.v("FragmentManager", (new StringBuilder()).append("restoreAllState: back stack #").append(i1).append(" (index ").append(((BackStackRecord) (parcelable)).mIndex).append("): ").append(((Object) (parcelable))).toString());
	//  396  834:ldc1            #67  <String "FragmentManager">
	//  397  836:new             #340 <Class StringBuilder>
	//  398  839:dup             
	//  399  840:invokespecial   #341 <Method void StringBuilder()>
	//  400  843:ldc2            #1778 <String "restoreAllState: back stack #">
	//  401  846:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  402  849:iload_3         
	//  403  850:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//  404  853:ldc2            #1780 <String " (index ">
	//  405  856:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  406  859:aload_1         
	//  407  860:getfield        #510 <Field int BackStackRecord.mIndex>
	//  408  863:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//  409  866:ldc2            #1782 <String "): ">
	//  410  869:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  411  872:aload_1         
	//  412  873:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  413  876:invokevirtual   #351 <Method String StringBuilder.toString()>
	//  414  879:invokestatic    #839 <Method int Log.v(String, String)>
	//  415  882:pop             
					fragmentmanagernonconfig = ((FragmentManagerNonConfig) (new PrintWriter(((java.io.Writer) (new LogWriter("FragmentManager"))))));
	//  416  883:new             #806 <Class PrintWriter>
	//  417  886:dup             
	//  418  887:new             #808 <Class LogWriter>
	//  419  890:dup             
	//  420  891:ldc1            #67  <String "FragmentManager">
	//  421  893:invokespecial   #809 <Method void LogWriter(String)>
	//  422  896:invokespecial   #812 <Method void PrintWriter(java.io.Writer)>
	//  423  899:astore_2        
					((BackStackRecord) (parcelable)).dump("  ", ((PrintWriter) (fragmentmanagernonconfig)), false);
	//  424  900:aload_1         
	//  425  901:ldc2            #814 <String "  ">
	//  426  904:aload_2         
	//  427  905:iconst_0        
	//  428  906:invokevirtual   #1785 <Method void BackStackRecord.dump(String, PrintWriter, boolean)>
					((PrintWriter) (fragmentmanagernonconfig)).close();
	//  429  909:aload_2         
	//  430  910:invokevirtual   #1788 <Method void PrintWriter.close()>
				}
				mBackStack.add(((Object) (parcelable)));
	//  431  913:aload_0         
	//  432  914:getfield        #829 <Field ArrayList mBackStack>
	//  433  917:aload_1         
	//  434  918:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//  435  921:pop             
				if(((BackStackRecord) (parcelable)).mIndex >= 0)
	//* 436  922:aload_1         
	//* 437  923:getfield        #510 <Field int BackStackRecord.mIndex>
	//* 438  926:iflt            938
					setBackStackIndex(((BackStackRecord) (parcelable)).mIndex, ((BackStackRecord) (parcelable)));
	//  439  929:aload_0         
	//  440  930:aload_1         
	//  441  931:getfield        #510 <Field int BackStackRecord.mIndex>
	//  442  934:aload_1         
	//  443  935:invokevirtual   #1792 <Method void setBackStackIndex(int, BackStackRecord)>
			}

	//  444  938:iload_3         
	//  445  939:iconst_1        
	//  446  940:iadd            
	//  447  941:istore_3        
		} else
	//* 448  942:goto            806
		{
			mBackStack = null;
	//  449  945:aload_0         
	//  450  946:aconst_null     
	//  451  947:putfield        #829 <Field ArrayList mBackStack>
		}
		if(fragmentmanagerstate.mPrimaryNavActiveIndex >= 0)
	//* 452  950:aload           8
	//* 453  952:getfield        #1795 <Field int FragmentManagerState.mPrimaryNavActiveIndex>
	//* 454  955:iflt            977
			mPrimaryNav = (Fragment)mActive.get(fragmentmanagerstate.mPrimaryNavActiveIndex);
	//  455  958:aload_0         
	//  456  959:aload_0         
	//  457  960:getfield        #313 <Field SparseArray mActive>
	//  458  963:aload           8
	//  459  965:getfield        #1795 <Field int FragmentManagerState.mPrimaryNavActiveIndex>
	//  460  968:invokevirtual   #1270 <Method Object SparseArray.get(int)>
	//  461  971:checkcast       #208 <Class Fragment>
	//  462  974:putfield        #690 <Field Fragment mPrimaryNav>
		mNextFragmentIndex = fragmentmanagerstate.mNextFragmentIndex;
	//  463  977:aload_0         
	//  464  978:aload           8
	//  465  980:getfield        #1796 <Field int FragmentManagerState.mNextFragmentIndex>
	//  466  983:putfield        #159 <Field int mNextFragmentIndex>
		return;
	//  467  986:return          
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
		forcePostponedTransactions();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1235 <Method void forcePostponedTransactions()>
		endAnimatingAwayFragments();
	//    2    4:aload_0         
	//    3    5:invokespecial   #1802 <Method void endAnimatingAwayFragments()>
		execPendingActions();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #408 <Method boolean execPendingActions()>
	//    6   12:pop             
		mStateSaved = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #329 <Field boolean mStateSaved>
		mSavedNonConfig = null;
	//   10   18:aload_0         
	//   11   19:aconst_null     
	//   12   20:putfield        #1596 <Field FragmentManagerNonConfig mSavedNonConfig>
		if(mActive != null && mActive.size() > 0)
	//*  13   23:aload_0         
	//*  14   24:getfield        #313 <Field SparseArray mActive>
	//*  15   27:ifnull          40
	//*  16   30:aload_0         
	//*  17   31:getfield        #313 <Field SparseArray mActive>
	//*  18   34:invokevirtual   #316 <Method int SparseArray.size()>
	//*  19   37:ifgt            42
	//*  20   40:aconst_null     
	//*  21   41:areturn         
		{
			int j1 = mActive.size();
	//   22   42:aload_0         
	//   23   43:getfield        #313 <Field SparseArray mActive>
	//   24   46:invokevirtual   #316 <Method int SparseArray.size()>
	//   25   49:istore          4
			FragmentState afragmentstate[] = new FragmentState[j1];
	//   26   51:iload           4
	//   27   53:anewarray       FragmentState[]
	//   28   56:astore          8
			boolean flag = false;
	//   29   58:iconst_0        
	//   30   59:istore_2        
			int i = 0;
	//   31   60:iconst_0        
	//   32   61:istore_1        
			while(i < j1) 
	//*  33   62:iload_1         
	//*  34   63:iload           4
	//*  35   65:icmpge          381
			{
				Fragment fragment = (Fragment)mActive.valueAt(i);
	//   36   68:aload_0         
	//   37   69:getfield        #313 <Field SparseArray mActive>
	//   38   72:iload_1         
	//   39   73:invokevirtual   #319 <Method Object SparseArray.valueAt(int)>
	//   40   76:checkcast       #208 <Class Fragment>
	//   41   79:astore          5
				if(fragment == null)
					continue;
	//   42   81:aload           5
	//   43   83:ifnull          361
				if(fragment.mIndex < 0)
	//*  44   86:aload           5
	//*  45   88:getfield        #1350 <Field int Fragment.mIndex>
	//*  46   91:ifge            140
					throwException(((RuntimeException) (new IllegalStateException((new StringBuilder()).append("Failure saving state: active ").append(((Object) (fragment))).append(" has cleared index: ").append(fragment.mIndex).toString()))));
	//   47   94:aload_0         
	//   48   95:new             #331 <Class IllegalStateException>
	//   49   98:dup             
	//   50   99:new             #340 <Class StringBuilder>
	//   51  102:dup             
	//   52  103:invokespecial   #341 <Method void StringBuilder()>
	//   53  106:ldc2            #1804 <String "Failure saving state: active ">
	//   54  109:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   55  112:aload           5
	//   56  114:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//   57  117:ldc2            #1806 <String " has cleared index: ">
	//   58  120:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   59  123:aload           5
	//   60  125:getfield        #1350 <Field int Fragment.mIndex>
	//   61  128:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//   62  131:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   63  134:invokespecial   #336 <Method void IllegalStateException(String)>
	//   64  137:invokespecial   #1276 <Method void throwException(RuntimeException)>
				boolean flag1 = true;
	//   65  140:iconst_1        
	//   66  141:istore_3        
				FragmentState fragmentstate = new FragmentState(fragment);
	//   67  142:new             #1740 <Class FragmentState>
	//   68  145:dup             
	//   69  146:aload           5
	//   70  148:invokespecial   #1808 <Method void FragmentState(Fragment)>
	//   71  151:astore          6
				afragmentstate[i] = fragmentstate;
	//   72  153:aload           8
	//   73  155:iload_1         
	//   74  156:aload           6
	//   75  158:aastore         
				if(fragment.mState > 0 && fragmentstate.mSavedFragmentState == null)
	//*  76  159:aload           5
	//*  77  161:getfield        #211 <Field int Fragment.mState>
	//*  78  164:ifle            368
	//*  79  167:aload           6
	//*  80  169:getfield        #1747 <Field Bundle FragmentState.mSavedFragmentState>
	//*  81  172:ifnonnull       368
				{
					fragmentstate.mSavedFragmentState = saveFragmentBasicState(fragment);
	//   82  175:aload           6
	//   83  177:aload_0         
	//   84  178:aload           5
	//   85  180:invokevirtual   #1812 <Method Bundle saveFragmentBasicState(Fragment)>
	//   86  183:putfield        #1747 <Field Bundle FragmentState.mSavedFragmentState>
					if(fragment.mTarget != null)
	//*  87  186:aload           5
	//*  88  188:getfield        #1437 <Field Fragment Fragment.mTarget>
	//*  89  191:ifnull          310
					{
						if(fragment.mTarget.mIndex < 0)
	//*  90  194:aload           5
	//*  91  196:getfield        #1437 <Field Fragment Fragment.mTarget>
	//*  92  199:getfield        #1350 <Field int Fragment.mIndex>
	//*  93  202:ifge            251
							throwException(((RuntimeException) (new IllegalStateException((new StringBuilder()).append("Failure saving state: ").append(((Object) (fragment))).append(" has target not in fragment manager: ").append(((Object) (fragment.mTarget))).toString()))));
	//   94  205:aload_0         
	//   95  206:new             #331 <Class IllegalStateException>
	//   96  209:dup             
	//   97  210:new             #340 <Class StringBuilder>
	//   98  213:dup             
	//   99  214:invokespecial   #341 <Method void StringBuilder()>
	//  100  217:ldc2            #1814 <String "Failure saving state: ">
	//  101  220:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  102  223:aload           5
	//  103  225:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  104  228:ldc2            #1816 <String " has target not in fragment manager: ">
	//  105  231:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  106  234:aload           5
	//  107  236:getfield        #1437 <Field Fragment Fragment.mTarget>
	//  108  239:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  109  242:invokevirtual   #351 <Method String StringBuilder.toString()>
	//  110  245:invokespecial   #336 <Method void IllegalStateException(String)>
	//  111  248:invokespecial   #1276 <Method void throwException(RuntimeException)>
						if(fragmentstate.mSavedFragmentState == null)
	//* 112  251:aload           6
	//* 113  253:getfield        #1747 <Field Bundle FragmentState.mSavedFragmentState>
	//* 114  256:ifnonnull       271
							fragmentstate.mSavedFragmentState = new Bundle();
	//  115  259:aload           6
	//  116  261:new             #1265 <Class Bundle>
	//  117  264:dup             
	//  118  265:invokespecial   #1817 <Method void Bundle()>
	//  119  268:putfield        #1747 <Field Bundle FragmentState.mSavedFragmentState>
						putFragment(fragmentstate.mSavedFragmentState, "android:target_state", fragment.mTarget);
	//  120  271:aload_0         
	//  121  272:aload           6
	//  122  274:getfield        #1747 <Field Bundle FragmentState.mSavedFragmentState>
	//  123  277:ldc1            #73  <String "android:target_state">
	//  124  279:aload           5
	//  125  281:getfield        #1437 <Field Fragment Fragment.mTarget>
	//  126  284:invokevirtual   #1819 <Method void putFragment(Bundle, String, Fragment)>
						if(fragment.mTargetRequestCode != 0)
	//* 127  287:aload           5
	//* 128  289:getfield        #1440 <Field int Fragment.mTargetRequestCode>
	//* 129  292:ifeq            310
							fragmentstate.mSavedFragmentState.putInt("android:target_req_state", fragment.mTargetRequestCode);
	//  130  295:aload           6
	//  131  297:getfield        #1747 <Field Bundle FragmentState.mSavedFragmentState>
	//  132  300:ldc1            #70  <String "android:target_req_state">
	//  133  302:aload           5
	//  134  304:getfield        #1440 <Field int Fragment.mTargetRequestCode>
	//  135  307:invokevirtual   #1709 <Method void Bundle.putInt(String, int)>
					}
				} else
	//* 136  310:iload_3         
	//* 137  311:istore_2        
	//* 138  312:getstatic       #133 <Field boolean DEBUG>
	//* 139  315:ifeq            361
	//* 140  318:ldc1            #67  <String "FragmentManager">
	//* 141  320:new             #340 <Class StringBuilder>
	//* 142  323:dup             
	//* 143  324:invokespecial   #341 <Method void StringBuilder()>
	//* 144  327:ldc2            #1821 <String "Saved state of ">
	//* 145  330:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 146  333:aload           5
	//* 147  335:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 148  338:ldc2            #1148 <String ": ">
	//* 149  341:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//* 150  344:aload           6
	//* 151  346:getfield        #1747 <Field Bundle FragmentState.mSavedFragmentState>
	//* 152  349:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//* 153  352:invokevirtual   #351 <Method String StringBuilder.toString()>
	//* 154  355:invokestatic    #839 <Method int Log.v(String, String)>
	//* 155  358:pop             
	//* 156  359:iload_3         
	//* 157  360:istore_2        
	//* 158  361:iload_1         
	//* 159  362:iconst_1        
	//* 160  363:iadd            
	//* 161  364:istore_1        
	//* 162  365:goto            62
				{
					fragmentstate.mSavedFragmentState = fragment.mSavedFragmentState;
	//  163  368:aload           6
	//  164  370:aload           5
	//  165  372:getfield        #1211 <Field Bundle Fragment.mSavedFragmentState>
	//  166  375:putfield        #1747 <Field Bundle FragmentState.mSavedFragmentState>
				}
				flag = flag1;
				if(DEBUG)
				{
					Log.v("FragmentManager", (new StringBuilder()).append("Saved state of ").append(((Object) (fragment))).append(": ").append(((Object) (fragmentstate.mSavedFragmentState))).toString());
					flag = flag1;
				}
				i++;
			}
	//* 167  378:goto            310
			if(!flag)
	//* 168  381:iload_2         
	//* 169  382:ifne            402
			{
				if(DEBUG)
	//* 170  385:getstatic       #133 <Field boolean DEBUG>
	//* 171  388:ifeq            40
				{
					Log.v("FragmentManager", "saveAllState: no fragments!");
	//  172  391:ldc1            #67  <String "FragmentManager">
	//  173  393:ldc2            #1823 <String "saveAllState: no fragments!">
	//  174  396:invokestatic    #839 <Method int Log.v(String, String)>
	//  175  399:pop             
					return null;
	//  176  400:aconst_null     
	//  177  401:areturn         
				}
			} else
			{
				int ai[] = null;
	//  178  402:aconst_null     
	//  179  403:astore          5
				FragmentManagerState fragmentmanagerstate = null;
	//  180  405:aconst_null     
	//  181  406:astore          7
				int l = mAdded.size();
	//  182  408:aload_0         
	//  183  409:getfield        #164 <Field ArrayList mAdded>
	//  184  412:invokevirtual   #202 <Method int ArrayList.size()>
	//  185  415:istore_2        
				if(l > 0)
	//* 186  416:iload_2         
	//* 187  417:ifle            568
				{
					int ai1[] = new int[l];
	//  188  420:iload_2         
	//  189  421:newarray        int[]
	//  190  423:astore          6
					int j = 0;
	//  191  425:iconst_0        
	//  192  426:istore_1        
					do
					{
						ai = ai1;
	//  193  427:aload           6
	//  194  429:astore          5
						if(j >= l)
							break;
	//  195  431:iload_1         
	//  196  432:iload_2         
	//  197  433:icmpge          568
						ai1[j] = ((Fragment)mAdded.get(j)).mIndex;
	//  198  436:aload           6
	//  199  438:iload_1         
	//  200  439:aload_0         
	//  201  440:getfield        #164 <Field ArrayList mAdded>
	//  202  443:iload_1         
	//  203  444:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//  204  447:checkcast       #208 <Class Fragment>
	//  205  450:getfield        #1350 <Field int Fragment.mIndex>
	//  206  453:iastore         
						if(ai1[j] < 0)
	//* 207  454:aload           6
	//* 208  456:iload_1         
	//* 209  457:iaload          
	//* 210  458:ifge            512
							throwException(((RuntimeException) (new IllegalStateException((new StringBuilder()).append("Failure saving state: active ").append(mAdded.get(j)).append(" has cleared index: ").append(ai1[j]).toString()))));
	//  211  461:aload_0         
	//  212  462:new             #331 <Class IllegalStateException>
	//  213  465:dup             
	//  214  466:new             #340 <Class StringBuilder>
	//  215  469:dup             
	//  216  470:invokespecial   #341 <Method void StringBuilder()>
	//  217  473:ldc2            #1804 <String "Failure saving state: active ">
	//  218  476:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  219  479:aload_0         
	//  220  480:getfield        #164 <Field ArrayList mAdded>
	//  221  483:iload_1         
	//  222  484:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//  223  487:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  224  490:ldc2            #1806 <String " has cleared index: ">
	//  225  493:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  226  496:aload           6
	//  227  498:iload_1         
	//  228  499:iaload          
	//  229  500:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//  230  503:invokevirtual   #351 <Method String StringBuilder.toString()>
	//  231  506:invokespecial   #336 <Method void IllegalStateException(String)>
	//  232  509:invokespecial   #1276 <Method void throwException(RuntimeException)>
						if(DEBUG)
	//* 233  512:getstatic       #133 <Field boolean DEBUG>
	//* 234  515:ifeq            561
							Log.v("FragmentManager", (new StringBuilder()).append("saveAllState: adding fragment #").append(j).append(": ").append(mAdded.get(j)).toString());
	//  235  518:ldc1            #67  <String "FragmentManager">
	//  236  520:new             #340 <Class StringBuilder>
	//  237  523:dup             
	//  238  524:invokespecial   #341 <Method void StringBuilder()>
	//  239  527:ldc2            #1825 <String "saveAllState: adding fragment #">
	//  240  530:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  241  533:iload_1         
	//  242  534:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//  243  537:ldc2            #1148 <String ": ">
	//  244  540:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  245  543:aload_0         
	//  246  544:getfield        #164 <Field ArrayList mAdded>
	//  247  547:iload_1         
	//  248  548:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//  249  551:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  250  554:invokevirtual   #351 <Method String StringBuilder.toString()>
	//  251  557:invokestatic    #839 <Method int Log.v(String, String)>
	//  252  560:pop             
						j++;
	//  253  561:iload_1         
	//  254  562:iconst_1        
	//  255  563:iadd            
	//  256  564:istore_1        
					} while(true);
	//  257  565:goto            427
				}
				BackStackState abackstackstate[] = ((BackStackState []) (fragmentmanagerstate));
	//  258  568:aload           7
	//  259  570:astore          6
				if(mBackStack != null)
	//* 260  572:aload_0         
	//* 261  573:getfield        #829 <Field ArrayList mBackStack>
	//* 262  576:ifnull          690
				{
					int i1 = mBackStack.size();
	//  263  579:aload_0         
	//  264  580:getfield        #829 <Field ArrayList mBackStack>
	//  265  583:invokevirtual   #202 <Method int ArrayList.size()>
	//  266  586:istore_2        
					abackstackstate = ((BackStackState []) (fragmentmanagerstate));
	//  267  587:aload           7
	//  268  589:astore          6
					if(i1 > 0)
	//* 269  591:iload_2         
	//* 270  592:ifle            690
					{
						BackStackState abackstackstate1[] = new BackStackState[i1];
	//  271  595:iload_2         
	//  272  596:anewarray       BackStackState[]
	//  273  599:astore          7
						int k = 0;
	//  274  601:iconst_0        
	//  275  602:istore_1        
						do
						{
							abackstackstate = abackstackstate1;
	//  276  603:aload           7
	//  277  605:astore          6
							if(k >= i1)
								break;
	//  278  607:iload_1         
	//  279  608:iload_2         
	//  280  609:icmpge          690
							abackstackstate1[k] = new BackStackState((BackStackRecord)mBackStack.get(k));
	//  281  612:aload           7
	//  282  614:iload_1         
	//  283  615:new             #1773 <Class BackStackState>
	//  284  618:dup             
	//  285  619:aload_0         
	//  286  620:getfield        #829 <Field ArrayList mBackStack>
	//  287  623:iload_1         
	//  288  624:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//  289  627:checkcast       #363 <Class BackStackRecord>
	//  290  630:invokespecial   #1827 <Method void BackStackState(BackStackRecord)>
	//  291  633:aastore         
							if(DEBUG)
	//* 292  634:getstatic       #133 <Field boolean DEBUG>
	//* 293  637:ifeq            683
								Log.v("FragmentManager", (new StringBuilder()).append("saveAllState: adding back stack #").append(k).append(": ").append(mBackStack.get(k)).toString());
	//  294  640:ldc1            #67  <String "FragmentManager">
	//  295  642:new             #340 <Class StringBuilder>
	//  296  645:dup             
	//  297  646:invokespecial   #341 <Method void StringBuilder()>
	//  298  649:ldc2            #1829 <String "saveAllState: adding back stack #">
	//  299  652:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  300  655:iload_1         
	//  301  656:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//  302  659:ldc2            #1148 <String ": ">
	//  303  662:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//  304  665:aload_0         
	//  305  666:getfield        #829 <Field ArrayList mBackStack>
	//  306  669:iload_1         
	//  307  670:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//  308  673:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//  309  676:invokevirtual   #351 <Method String StringBuilder.toString()>
	//  310  679:invokestatic    #839 <Method int Log.v(String, String)>
	//  311  682:pop             
							k++;
	//  312  683:iload_1         
	//  313  684:iconst_1        
	//  314  685:iadd            
	//  315  686:istore_1        
						} while(true);
	//  316  687:goto            603
					}
				}
				abackstackstate1 = ((BackStackState []) (new FragmentManagerState()));
	//  317  690:new             #1733 <Class FragmentManagerState>
	//  318  693:dup             
	//  319  694:invokespecial   #1830 <Method void FragmentManagerState()>
	//  320  697:astore          7
				abackstackstate1.mActive = afragmentstate;
	//  321  699:aload           7
	//  322  701:aload           8
	//  323  703:putfield        #1736 <Field FragmentState[] FragmentManagerState.mActive>
				abackstackstate1.mAdded = ai;
	//  324  706:aload           7
	//  325  708:aload           5
	//  326  710:putfield        #1762 <Field int[] FragmentManagerState.mAdded>
				abackstackstate1.mBackStack = abackstackstate;
	//  327  713:aload           7
	//  328  715:aload           6
	//  329  717:putfield        #1771 <Field BackStackState[] FragmentManagerState.mBackStack>
				if(mPrimaryNav != null)
	//* 330  720:aload_0         
	//* 331  721:getfield        #690 <Field Fragment mPrimaryNav>
	//* 332  724:ifnull          739
					abackstackstate1.mPrimaryNavActiveIndex = mPrimaryNav.mIndex;
	//  333  727:aload           7
	//  334  729:aload_0         
	//  335  730:getfield        #690 <Field Fragment mPrimaryNav>
	//  336  733:getfield        #1350 <Field int Fragment.mIndex>
	//  337  736:putfield        #1795 <Field int FragmentManagerState.mPrimaryNavActiveIndex>
				abackstackstate1.mNextFragmentIndex = mNextFragmentIndex;
	//  338  739:aload           7
	//  339  741:aload_0         
	//  340  742:getfield        #159 <Field int mNextFragmentIndex>
	//  341  745:putfield        #1796 <Field int FragmentManagerState.mNextFragmentIndex>
				saveNonConfig();
	//  342  748:aload_0         
	//  343  749:invokevirtual   #1833 <Method void saveNonConfig()>
				return ((Parcelable) (abackstackstate1));
	//  344  752:aload           7
	//  345  754:areturn         
			}
		}
		return null;
	}

	Bundle saveFragmentBasicState(Fragment fragment)
	{
		Bundle bundle1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		if(mStateBundle == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #173 <Field Bundle mStateBundle>
	//*   4    6:ifnonnull       20
			mStateBundle = new Bundle();
	//    5    9:aload_0         
	//    6   10:new             #1265 <Class Bundle>
	//    7   13:dup             
	//    8   14:invokespecial   #1817 <Method void Bundle()>
	//    9   17:putfield        #173 <Field Bundle mStateBundle>
		fragment.performSaveInstanceState(mStateBundle);
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #173 <Field Bundle mStateBundle>
	//   13   25:invokevirtual   #1836 <Method void Fragment.performSaveInstanceState(Bundle)>
		dispatchOnFragmentSaveInstanceState(fragment, mStateBundle, false);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:getfield        #173 <Field Bundle mStateBundle>
	//   18   34:iconst_0        
	//   19   35:invokevirtual   #1055 <Method void dispatchOnFragmentSaveInstanceState(Fragment, Bundle, boolean)>
		if(!mStateBundle.isEmpty())
	//*  20   38:aload_0         
	//*  21   39:getfield        #173 <Field Bundle mStateBundle>
	//*  22   42:invokevirtual   #1837 <Method boolean Bundle.isEmpty()>
	//*  23   45:ifne            58
		{
			bundle1 = mStateBundle;
	//   24   48:aload_0         
	//   25   49:getfield        #173 <Field Bundle mStateBundle>
	//   26   52:astore_3        
			mStateBundle = null;
	//   27   53:aload_0         
	//   28   54:aconst_null     
	//   29   55:putfield        #173 <Field Bundle mStateBundle>
		}
		if(fragment.mView != null)
	//*  30   58:aload_1         
	//*  31   59:getfield        #225 <Field View Fragment.mView>
	//*  32   62:ifnull          70
			saveFragmentViewState(fragment);
	//   33   65:aload_0         
	//   34   66:aload_1         
	//   35   67:invokevirtual   #1571 <Method void saveFragmentViewState(Fragment)>
		Bundle bundle = bundle1;
	//   36   70:aload_3         
	//   37   71:astore_2        
		if(fragment.mSavedViewState != null)
	//*  38   72:aload_1         
	//*  39   73:getfield        #1432 <Field SparseArray Fragment.mSavedViewState>
	//*  40   76:ifnull          103
		{
			bundle = bundle1;
	//   41   79:aload_3         
	//   42   80:astore_2        
			if(bundle1 == null)
	//*  43   81:aload_3         
	//*  44   82:ifnonnull       93
				bundle = new Bundle();
	//   45   85:new             #1265 <Class Bundle>
	//   46   88:dup             
	//   47   89:invokespecial   #1817 <Method void Bundle()>
	//   48   92:astore_2        
			bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
	//   49   93:aload_2         
	//   50   94:ldc1            #79  <String "android:view_state">
	//   51   96:aload_1         
	//   52   97:getfield        #1432 <Field SparseArray Fragment.mSavedViewState>
	//   53  100:invokevirtual   #1841 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
		}
		bundle1 = bundle;
	//   54  103:aload_2         
	//   55  104:astore_3        
		if(!fragment.mUserVisibleHint)
	//*  56  105:aload_1         
	//*  57  106:getfield        #1447 <Field boolean Fragment.mUserVisibleHint>
	//*  58  109:ifne            136
		{
			bundle1 = bundle;
	//   59  112:aload_2         
	//   60  113:astore_3        
			if(bundle == null)
	//*  61  114:aload_2         
	//*  62  115:ifnonnull       126
				bundle1 = new Bundle();
	//   63  118:new             #1265 <Class Bundle>
	//   64  121:dup             
	//   65  122:invokespecial   #1817 <Method void Bundle()>
	//   66  125:astore_3        
			bundle1.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
	//   67  126:aload_3         
	//   68  127:ldc1            #76  <String "android:user_visible_hint">
	//   69  129:aload_1         
	//   70  130:getfield        #1447 <Field boolean Fragment.mUserVisibleHint>
	//   71  133:invokevirtual   #1845 <Method void Bundle.putBoolean(String, boolean)>
		}
		return bundle1;
	//   72  136:aload_3         
	//   73  137:areturn         
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
		ArrayList arraylist3 = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		ArrayList arraylist = null;
	//    2    3:aconst_null     
	//    3    4:astore_3        
		ArrayList arraylist2 = null;
	//    4    5:aconst_null     
	//    5    6:astore          5
		ArrayList arraylist1 = null;
	//    6    8:aconst_null     
	//    7    9:astore          4
		if(mActive != null)
	//*   8   11:aload_0         
	//*   9   12:getfield        #313 <Field SparseArray mActive>
	//*  10   15:ifnull          298
		{
			int i = 0;
	//   11   18:iconst_0        
	//   12   19:istore_1        
			do
			{
				arraylist2 = arraylist1;
	//   13   20:aload           4
	//   14   22:astore          5
				arraylist3 = arraylist;
	//   15   24:aload_3         
	//   16   25:astore          6
				if(i >= mActive.size())
					break;
	//   17   27:iload_1         
	//   18   28:aload_0         
	//   19   29:getfield        #313 <Field SparseArray mActive>
	//   20   32:invokevirtual   #316 <Method int SparseArray.size()>
	//   21   35:icmpge          298
				Object obj = ((Object) ((Fragment)mActive.valueAt(i)));
	//   22   38:aload_0         
	//   23   39:getfield        #313 <Field SparseArray mActive>
	//   24   42:iload_1         
	//   25   43:invokevirtual   #319 <Method Object SparseArray.valueAt(int)>
	//   26   46:checkcast       #208 <Class Fragment>
	//   27   49:astore          8
				arraylist3 = arraylist1;
	//   28   51:aload           4
	//   29   53:astore          6
				ArrayList arraylist4 = arraylist;
	//   30   55:aload_3         
	//   31   56:astore          7
				if(obj != null)
	//*  32   58:aload           8
	//*  33   60:ifnull          284
				{
					arraylist2 = arraylist;
	//   34   63:aload_3         
	//   35   64:astore          5
					if(((Fragment) (obj)).mRetainInstance)
	//*  36   66:aload           8
	//*  37   68:getfield        #1859 <Field boolean Fragment.mRetainInstance>
	//*  38   71:ifeq            162
					{
						arraylist3 = arraylist;
	//   39   74:aload_3         
	//   40   75:astore          6
						if(arraylist == null)
	//*  41   77:aload_3         
	//*  42   78:ifnonnull       90
							arraylist3 = new ArrayList();
	//   43   81:new             #161 <Class ArrayList>
	//   44   84:dup             
	//   45   85:invokespecial   #162 <Method void ArrayList()>
	//   46   88:astore          6
						arraylist3.add(obj);
	//   47   90:aload           6
	//   48   92:aload           8
	//   49   94:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//   50   97:pop             
						int j;
						if(((Fragment) (obj)).mTarget != null)
	//*  51   98:aload           8
	//*  52  100:getfield        #1437 <Field Fragment Fragment.mTarget>
	//*  53  103:ifnull          244
							j = ((Fragment) (obj)).mTarget.mIndex;
	//   54  106:aload           8
	//   55  108:getfield        #1437 <Field Fragment Fragment.mTarget>
	//   56  111:getfield        #1350 <Field int Fragment.mIndex>
	//   57  114:istore_2        
						else
	//*  58  115:aload           8
	//*  59  117:iload_2         
	//*  60  118:putfield        #1756 <Field int Fragment.mTargetIndex>
	//*  61  121:aload           6
	//*  62  123:astore          5
	//*  63  125:getstatic       #133 <Field boolean DEBUG>
	//*  64  128:ifeq            162
	//*  65  131:ldc1            #67  <String "FragmentManager">
	//*  66  133:new             #340 <Class StringBuilder>
	//*  67  136:dup             
	//*  68  137:invokespecial   #341 <Method void StringBuilder()>
	//*  69  140:ldc2            #1861 <String "retainNonConfig: keeping retained ">
	//*  70  143:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//*  71  146:aload           8
	//*  72  148:invokevirtual   #836 <Method StringBuilder StringBuilder.append(Object)>
	//*  73  151:invokevirtual   #351 <Method String StringBuilder.toString()>
	//*  74  154:invokestatic    #839 <Method int Log.v(String, String)>
	//*  75  157:pop             
	//*  76  158:aload           6
	//*  77  160:astore          5
	//*  78  162:aload           8
	//*  79  164:getfield        #1455 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
	//*  80  167:ifnull          249
	//*  81  170:aload           8
	//*  82  172:getfield        #1455 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
	//*  83  175:invokevirtual   #1833 <Method void saveNonConfig()>
	//*  84  178:aload           8
	//*  85  180:getfield        #1455 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
	//*  86  183:getfield        #1596 <Field FragmentManagerNonConfig mSavedNonConfig>
	//*  87  186:astore          8
	//*  88  188:aload           4
	//*  89  190:astore_3        
	//*  90  191:aload           4
	//*  91  193:ifnonnull       259
	//*  92  196:aload           4
	//*  93  198:astore_3        
	//*  94  199:aload           8
	//*  95  201:ifnull          259
	//*  96  204:new             #161 <Class ArrayList>
	//*  97  207:dup             
	//*  98  208:aload_0         
	//*  99  209:getfield        #313 <Field SparseArray mActive>
	//* 100  212:invokevirtual   #316 <Method int SparseArray.size()>
	//* 101  215:invokespecial   #369 <Method void ArrayList(int)>
	//* 102  218:astore          4
	//* 103  220:iconst_0        
	//* 104  221:istore_2        
	//* 105  222:aload           4
	//* 106  224:astore_3        
	//* 107  225:iload_2         
	//* 108  226:iload_1         
	//* 109  227:icmpge          259
	//* 110  230:aload           4
	//* 111  232:aconst_null     
	//* 112  233:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//* 113  236:pop             
	//* 114  237:iload_2         
	//* 115  238:iconst_1        
	//* 116  239:iadd            
	//* 117  240:istore_2        
	//* 118  241:goto            222
							j = -1;
	//  119  244:iconst_m1       
	//  120  245:istore_2        
						obj.mTargetIndex = j;
						arraylist2 = arraylist3;
						if(DEBUG)
						{
							Log.v("FragmentManager", (new StringBuilder()).append("retainNonConfig: keeping retained ").append(obj).toString());
							arraylist2 = arraylist3;
						}
					}
					if(((Fragment) (obj)).mChildFragmentManager != null)
					{
						((Fragment) (obj)).mChildFragmentManager.saveNonConfig();
						obj = ((Object) (((Fragment) (obj)).mChildFragmentManager.mSavedNonConfig));
					} else
	//* 121  246:goto            115
					{
						obj = ((Object) (((Fragment) (obj)).mChildNonConfig));
	//  122  249:aload           8
	//  123  251:getfield        #1864 <Field FragmentManagerNonConfig Fragment.mChildNonConfig>
	//  124  254:astore          8
					}
					arraylist = arraylist1;
					if(arraylist1 == null)
					{
						arraylist = arraylist1;
						if(obj != null)
						{
							arraylist1 = new ArrayList(mActive.size());
							j = 0;
							do
							{
								arraylist = arraylist1;
								if(j >= i)
									break;
								arraylist1.add(((Object) (null)));
								j++;
							} while(true);
						}
					}
	//* 125  256:goto            188
					arraylist3 = arraylist;
	//  126  259:aload_3         
	//  127  260:astore          6
					arraylist4 = arraylist2;
	//  128  262:aload           5
	//  129  264:astore          7
					if(arraylist != null)
	//* 130  266:aload_3         
	//* 131  267:ifnull          284
					{
						arraylist.add(obj);
	//  132  270:aload_3         
	//  133  271:aload           8
	//  134  273:invokevirtual   #370 <Method boolean ArrayList.add(Object)>
	//  135  276:pop             
						arraylist4 = arraylist2;
	//  136  277:aload           5
	//  137  279:astore          7
						arraylist3 = arraylist;
	//  138  281:aload_3         
	//  139  282:astore          6
					}
				}
				i++;
	//  140  284:iload_1         
	//  141  285:iconst_1        
	//  142  286:iadd            
	//  143  287:istore_1        
				arraylist1 = arraylist3;
	//  144  288:aload           6
	//  145  290:astore          4
				arraylist = arraylist4;
	//  146  292:aload           7
	//  147  294:astore_3        
			} while(true);
	//  148  295:goto            20
		}
		if(arraylist3 == null && arraylist2 == null)
	//* 149  298:aload           6
	//* 150  300:ifnonnull       314
	//* 151  303:aload           5
	//* 152  305:ifnonnull       314
		{
			mSavedNonConfig = null;
	//  153  308:aload_0         
	//  154  309:aconst_null     
	//  155  310:putfield        #1596 <Field FragmentManagerNonConfig mSavedNonConfig>
			return;
	//  156  313:return          
		} else
		{
			mSavedNonConfig = new FragmentManagerNonConfig(((List) (arraylist3)), ((List) (arraylist2)));
	//  157  314:aload_0         
	//  158  315:new             #750 <Class FragmentManagerNonConfig>
	//  159  318:dup             
	//  160  319:aload           6
	//  161  321:aload           5
	//  162  323:invokespecial   #1867 <Method void FragmentManagerNonConfig(List, List)>
	//  163  326:putfield        #1596 <Field FragmentManagerNonConfig mSavedNonConfig>
			return;
	//  164  329:return          
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
		int i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		int j = mLifecycleCallbacks.size();
	//    7   11:aload_0         
	//    8   12:getfield        #169 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//    9   15:invokevirtual   #1893 <Method int CopyOnWriteArrayList.size()>
	//   10   18:istore_3        
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
