// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.Context;
import android.content.res.*;
import android.os.*;
import android.support.v4.os.BuildCompat;
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
//			FragmentManager, Fragment, FragmentTransition, BackStackRecord, 
//			FragmentHostCallback, LoaderManagerImpl, SuperNotCalledException, FragmentContainer, 
//			FragmentManagerState, FragmentManagerNonConfig, FragmentState, BackStackState, 
//			FragmentTransaction

final class FragmentManagerImpl extends FragmentManager
	implements android.view.LayoutInflater.Factory2
{
	static class AnimateOnHWLayerIfNeededListener
		implements android.view.animation.Animation.AnimationListener
	{

		public void onAnimationEnd(Animation animation)
		{
			if(mView != null && mShouldRunOnHWLayer)
		//*   0    0:aload_0         
		//*   1    1:getfield        #24  <Field View mView>
		//*   2    4:ifnull          58
		//*   3    7:aload_0         
		//*   4    8:getfield        #30  <Field boolean mShouldRunOnHWLayer>
		//*   5   11:ifeq            58
				if(ViewCompat.isAttachedToWindow(mView) || BuildCompat.isAtLeastN())
		//*   6   14:aload_0         
		//*   7   15:getfield        #24  <Field View mView>
		//*   8   18:invokestatic    #39  <Method boolean ViewCompat.isAttachedToWindow(View)>
		//*   9   21:ifne            30
		//*  10   24:invokestatic    #45  <Method boolean BuildCompat.isAtLeastN()>
		//*  11   27:ifeq            49
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
		//   12   30:aload_0         
		//   13   31:getfield        #24  <Field View mView>
		//   14   34:new             #11  <Class FragmentManagerImpl$AnimateOnHWLayerIfNeededListener$1>
		//   15   37:dup             
		//   16   38:aload_0         
		//   17   39:invokespecial   #48  <Method void FragmentManagerImpl$AnimateOnHWLayerIfNeededListener$1(FragmentManagerImpl$AnimateOnHWLayerIfNeededListener)>
		//   18   42:invokevirtual   #54  <Method boolean View.post(Runnable)>
		//   19   45:pop             
				else
		//*  20   46:goto            58
					mView.setLayerType(0, ((android.graphics.Paint) (null)));
		//   21   49:aload_0         
		//   22   50:getfield        #24  <Field View mView>
		//   23   53:iconst_0        
		//   24   54:aconst_null     
		//   25   55:invokevirtual   #58  <Method void View.setLayerType(int, android.graphics.Paint)>
			if(mOriginalListener != null)
		//*  26   58:aload_0         
		//*  27   59:getfield        #28  <Field android.view.animation.Animation$AnimationListener mOriginalListener>
		//*  28   62:ifnull          75
				mOriginalListener.onAnimationEnd(animation);
		//   29   65:aload_0         
		//   30   66:getfield        #28  <Field android.view.animation.Animation$AnimationListener mOriginalListener>
		//   31   69:aload_1         
		//   32   70:invokeinterface #60  <Method void android.view.animation.Animation$AnimationListener.onAnimationEnd(Animation)>
		//   33   75:return          
		}

		public void onAnimationRepeat(Animation animation)
		{
			if(mOriginalListener != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field android.view.animation.Animation$AnimationListener mOriginalListener>
		//*   2    4:ifnull          17
				mOriginalListener.onAnimationRepeat(animation);
		//    3    7:aload_0         
		//    4    8:getfield        #28  <Field android.view.animation.Animation$AnimationListener mOriginalListener>
		//    5   11:aload_1         
		//    6   12:invokeinterface #64  <Method void android.view.animation.Animation$AnimationListener.onAnimationRepeat(Animation)>
		//    7   17:return          
		}

		public void onAnimationStart(Animation animation)
		{
			if(mOriginalListener != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field android.view.animation.Animation$AnimationListener mOriginalListener>
		//*   2    4:ifnull          17
				mOriginalListener.onAnimationStart(animation);
		//    3    7:aload_0         
		//    4    8:getfield        #28  <Field android.view.animation.Animation$AnimationListener mOriginalListener>
		//    5   11:aload_1         
		//    6   12:invokeinterface #67  <Method void android.view.animation.Animation$AnimationListener.onAnimationStart(Animation)>
		//    7   17:return          
		}

		private android.view.animation.Animation.AnimationListener mOriginalListener;
		private boolean mShouldRunOnHWLayer;
		View mView;

		public AnimateOnHWLayerIfNeededListener(View view, Animation animation)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			if(view == null || animation == null)
		//*   2    4:aload_1         
		//*   3    5:ifnull          12
		//*   4    8:aload_2         
		//*   5    9:ifnonnull       13
			{
				return;
		//    6   12:return          
			} else
			{
				mView = view;
		//    7   13:aload_0         
		//    8   14:aload_1         
		//    9   15:putfield        #24  <Field View mView>
				return;
		//   10   18:return          
			}
		}

		public AnimateOnHWLayerIfNeededListener(View view, Animation animation, android.view.animation.Animation.AnimationListener animationlistener)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			if(view == null || animation == null)
		//*   2    4:aload_1         
		//*   3    5:ifnull          12
		//*   4    8:aload_2         
		//*   5    9:ifnonnull       13
			{
				return;
		//    6   12:return          
			} else
			{
				mOriginalListener = animationlistener;
		//    7   13:aload_0         
		//    8   14:aload_3         
		//    9   15:putfield        #28  <Field android.view.animation.Animation$AnimationListener mOriginalListener>
				mView = view;
		//   10   18:aload_0         
		//   11   19:aload_1         
		//   12   20:putfield        #24  <Field View mView>
				mShouldRunOnHWLayer = true;
		//   13   23:aload_0         
		//   14   24:iconst_1        
		//   15   25:putfield        #30  <Field boolean mShouldRunOnHWLayer>
				return;
		//   16   28:return          
			}
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

	class PopBackStackState
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
		//    9   17:invokestatic    #40  <Method void FragmentManagerImpl.access$300(FragmentManagerImpl, BackStackRecord, boolean, boolean, boolean)>
		//   10   20:return          
		}

		public void completeTransaction()
		{
			boolean flag;
			if(mNumPostponed > 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #43  <Field int mNumPostponed>
		//*   2    4:ifle            12
				flag = true;
		//    3    7:iconst_1        
		//    4    8:istore_1        
			else
		//*   5    9:goto            14
				flag = false;
		//    6   12:iconst_0        
		//    7   13:istore_1        
			FragmentManagerImpl fragmentmanagerimpl = mRecord.mManager;
		//    8   14:aload_0         
		//    9   15:getfield        #24  <Field BackStackRecord mRecord>
		//   10   18:getfield        #36  <Field FragmentManagerImpl BackStackRecord.mManager>
		//   11   21:astore          6
			int j = fragmentmanagerimpl.mAdded.size();
		//   12   23:aload           6
		//   13   25:getfield        #47  <Field ArrayList FragmentManagerImpl.mAdded>
		//   14   28:invokevirtual   #53  <Method int ArrayList.size()>
		//   15   31:istore_3        
			for(int i = 0; i < j; i++)
		//*  16   32:iconst_0        
		//*  17   33:istore_2        
		//*  18   34:iload_2         
		//*  19   35:iload_3         
		//*  20   36:icmpge          83
			{
				Fragment fragment = (Fragment)fragmentmanagerimpl.mAdded.get(i);
		//   21   39:aload           6
		//   22   41:getfield        #47  <Field ArrayList FragmentManagerImpl.mAdded>
		//   23   44:iload_2         
		//   24   45:invokevirtual   #57  <Method Object ArrayList.get(int)>
		//   25   48:checkcast       #59  <Class Fragment>
		//   26   51:astore          7
				fragment.setOnStartEnterTransitionListener(((Fragment.OnStartEnterTransitionListener) (null)));
		//   27   53:aload           7
		//   28   55:aconst_null     
		//   29   56:invokevirtual   #63  <Method void Fragment.setOnStartEnterTransitionListener(Fragment$OnStartEnterTransitionListener)>
				if(flag && fragment.isPostponed())
		//*  30   59:iload_1         
		//*  31   60:ifeq            76
		//*  32   63:aload           7
		//*  33   65:invokevirtual   #67  <Method boolean Fragment.isPostponed()>
		//*  34   68:ifeq            76
					fragment.startPostponedEnterTransition();
		//   35   71:aload           7
		//   36   73:invokevirtual   #70  <Method void Fragment.startPostponedEnterTransition()>
			}

		//   37   76:iload_2         
		//   38   77:iconst_1        
		//   39   78:iadd            
		//   40   79:istore_2        
		//*  41   80:goto            34
			fragmentmanagerimpl = mRecord.mManager;
		//   42   83:aload_0         
		//   43   84:getfield        #24  <Field BackStackRecord mRecord>
		//   44   87:getfield        #36  <Field FragmentManagerImpl BackStackRecord.mManager>
		//   45   90:astore          6
			BackStackRecord backstackrecord = mRecord;
		//   46   92:aload_0         
		//   47   93:getfield        #24  <Field BackStackRecord mRecord>
		//   48   96:astore          7
			boolean flag2 = mIsBack;
		//   49   98:aload_0         
		//   50   99:getfield        #22  <Field boolean mIsBack>
		//   51  102:istore          5
			boolean flag1;
			if(!flag)
		//*  52  104:iload_1         
		//*  53  105:ifne            114
				flag1 = true;
		//   54  108:iconst_1        
		//   55  109:istore          4
			else
		//*  56  111:goto            117
				flag1 = false;
		//   57  114:iconst_0        
		//   58  115:istore          4
			fragmentmanagerimpl.completeExecute(backstackrecord, flag2, flag1, true);
		//   59  117:aload           6
		//   60  119:aload           7
		//   61  121:iload           5
		//   62  123:iload           4
		//   63  125:iconst_1        
		//   64  126:invokestatic    #40  <Method void FragmentManagerImpl.access$300(FragmentManagerImpl, BackStackRecord, boolean, boolean, boolean)>
		//   65  129:return          
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
		//   13   25:invokestatic    #76  <Method void FragmentManagerImpl.access$200(FragmentManagerImpl)>
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
		static boolean access$000(StartEnterTransitionListener startentertransitionlistener)
		{
			return startentertransitionlistener.mIsBack;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field boolean mIsBack>
		//    2    4:ireturn         
		}

*/


/*
		static BackStackRecord access$100(StartEnterTransitionListener startentertransitionlistener)
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
	//    1    1:invokespecial   #151 <Method void FragmentManager()>
		mCurState = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #153 <Field int mCurState>
		mStateBundle = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #155 <Field Bundle mStateBundle>
		mStateArray = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #157 <Field SparseArray mStateArray>
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
	//   11   19:aload_0         
	//   12   20:new             #8   <Class FragmentManagerImpl$1>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:invokespecial   #160 <Method void FragmentManagerImpl$1(FragmentManagerImpl)>
	//   16   28:putfield        #162 <Field Runnable mExecCommit>
	//   17   31:return          
	}

	private void addAddedFragments(ArraySet arrayset)
	{
		if(mCurState < 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field int mCurState>
	//*   2    4:iconst_1        
	//*   3    5:icmpge          9
			return;
	//    4    8:return          
		int k = Math.min(mCurState, 4);
	//    5    9:aload_0         
	//    6   10:getfield        #153 <Field int mCurState>
	//    7   13:iconst_4        
	//    8   14:invokestatic    #180 <Method int Math.min(int, int)>
	//    9   17:istore          4
		int i;
		if(mAdded == null)
	//*  10   19:aload_0         
	//*  11   20:getfield        #182 <Field ArrayList mAdded>
	//*  12   23:ifnonnull       31
			i = 0;
	//   13   26:iconst_0        
	//   14   27:istore_2        
		else
	//*  15   28:goto            39
			i = mAdded.size();
	//   16   31:aload_0         
	//   17   32:getfield        #182 <Field ArrayList mAdded>
	//   18   35:invokevirtual   #188 <Method int ArrayList.size()>
	//   19   38:istore_2        
		for(int j = 0; j < i; j++)
	//*  20   39:iconst_0        
	//*  21   40:istore_3        
	//*  22   41:iload_3         
	//*  23   42:iload_2         
	//*  24   43:icmpge          126
		{
			Fragment fragment = (Fragment)mAdded.get(j);
	//   25   46:aload_0         
	//   26   47:getfield        #182 <Field ArrayList mAdded>
	//   27   50:iload_3         
	//   28   51:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   29   54:checkcast       #194 <Class Fragment>
	//   30   57:astore          5
			if(fragment.mState >= k)
				continue;
	//   31   59:aload           5
	//   32   61:getfield        #197 <Field int Fragment.mState>
	//   33   64:iload           4
	//   34   66:icmpge          119
			moveToState(fragment, k, fragment.getNextAnim(), fragment.getNextTransition(), false);
	//   35   69:aload_0         
	//   36   70:aload           5
	//   37   72:iload           4
	//   38   74:aload           5
	//   39   76:invokevirtual   #200 <Method int Fragment.getNextAnim()>
	//   40   79:aload           5
	//   41   81:invokevirtual   #203 <Method int Fragment.getNextTransition()>
	//   42   84:iconst_0        
	//   43   85:invokevirtual   #207 <Method void moveToState(Fragment, int, int, int, boolean)>
			if(fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded)
	//*  44   88:aload           5
	//*  45   90:getfield        #211 <Field View Fragment.mView>
	//*  46   93:ifnull          119
	//*  47   96:aload           5
	//*  48   98:getfield        #214 <Field boolean Fragment.mHidden>
	//*  49  101:ifne            119
	//*  50  104:aload           5
	//*  51  106:getfield        #217 <Field boolean Fragment.mIsNewlyAdded>
	//*  52  109:ifeq            119
				arrayset.add(((Object) (fragment)));
	//   53  112:aload_1         
	//   54  113:aload           5
	//   55  115:invokevirtual   #223 <Method boolean ArraySet.add(Object)>
	//   56  118:pop             
		}

	//   57  119:iload_3         
	//   58  120:iconst_1        
	//   59  121:iadd            
	//   60  122:istore_3        
	//*  61  123:goto            41
	//   62  126:return          
	}

	private void checkStateLoss()
	{
		if(mStateSaved)
	//*   0    0:aload_0         
	//*   1    1:getfield        #228 <Field boolean mStateSaved>
	//*   2    4:ifeq            17
			throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
	//    3    7:new             #230 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #232 <String "Can not perform this action after onSaveInstanceState">
	//    6   13:invokespecial   #235 <Method void IllegalStateException(String)>
	//    7   16:athrow          
		if(mNoTransactionsBecause != null)
	//*   8   17:aload_0         
	//*   9   18:getfield        #237 <Field String mNoTransactionsBecause>
	//*  10   21:ifnull          54
			throw new IllegalStateException((new StringBuilder()).append("Can not perform this action inside of ").append(mNoTransactionsBecause).toString());
	//   11   24:new             #230 <Class IllegalStateException>
	//   12   27:dup             
	//   13   28:new             #239 <Class StringBuilder>
	//   14   31:dup             
	//   15   32:invokespecial   #240 <Method void StringBuilder()>
	//   16   35:ldc1            #242 <String "Can not perform this action inside of ">
	//   17   37:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   18   40:aload_0         
	//   19   41:getfield        #237 <Field String mNoTransactionsBecause>
	//   20   44:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   21   47:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   22   50:invokespecial   #235 <Method void IllegalStateException(String)>
	//   23   53:athrow          
		else
			return;
	//   24   54:return          
	}

	private void cleanupExec()
	{
		mExecutingActions = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #253 <Field boolean mExecutingActions>
		mTmpIsPop.clear();
	//    3    5:aload_0         
	//    4    6:getfield        #255 <Field ArrayList mTmpIsPop>
	//    5    9:invokevirtual   #258 <Method void ArrayList.clear()>
		mTmpRecords.clear();
	//    6   12:aload_0         
	//    7   13:getfield        #260 <Field ArrayList mTmpRecords>
	//    8   16:invokevirtual   #258 <Method void ArrayList.clear()>
	//    9   19:return          
	}

	private void completeExecute(BackStackRecord backstackrecord, boolean flag, boolean flag1, boolean flag2)
	{
		ArrayList arraylist = new ArrayList(1);
	//    0    0:new             #184 <Class ArrayList>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #263 <Method void ArrayList(int)>
	//    4    8:astore          7
		ArrayList arraylist1 = new ArrayList(1);
	//    5   10:new             #184 <Class ArrayList>
	//    6   13:dup             
	//    7   14:iconst_1        
	//    8   15:invokespecial   #263 <Method void ArrayList(int)>
	//    9   18:astore          8
		arraylist.add(((Object) (backstackrecord)));
	//   10   20:aload           7
	//   11   22:aload_1         
	//   12   23:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
	//   13   26:pop             
		arraylist1.add(((Object) (Boolean.valueOf(flag))));
	//   14   27:aload           8
	//   15   29:iload_2         
	//   16   30:invokestatic    #270 <Method Boolean Boolean.valueOf(boolean)>
	//   17   33:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
	//   18   36:pop             
		executeOps(arraylist, arraylist1, 0, 1);
	//   19   37:aload           7
	//   20   39:aload           8
	//   21   41:iconst_0        
	//   22   42:iconst_1        
	//   23   43:invokestatic    #274 <Method void executeOps(ArrayList, ArrayList, int, int)>
		if(flag1)
	//*  24   46:iload_3         
	//*  25   47:ifeq            61
			FragmentTransition.startTransitions(this, arraylist, arraylist1, 0, 1, true);
	//   26   50:aload_0         
	//   27   51:aload           7
	//   28   53:aload           8
	//   29   55:iconst_0        
	//   30   56:iconst_1        
	//   31   57:iconst_1        
	//   32   58:invokestatic    #280 <Method void FragmentTransition.startTransitions(FragmentManagerImpl, ArrayList, ArrayList, int, int, boolean)>
		if(flag2)
	//*  33   61:iload           4
	//*  34   63:ifeq            75
			moveToState(mCurState, true);
	//   35   66:aload_0         
	//   36   67:aload_0         
	//   37   68:getfield        #153 <Field int mCurState>
	//   38   71:iconst_1        
	//   39   72:invokevirtual   #283 <Method void moveToState(int, boolean)>
		if(mActive != null)
	//*  40   75:aload_0         
	//*  41   76:getfield        #285 <Field ArrayList mActive>
	//*  42   79:ifnull          216
		{
			int j = mActive.size();
	//   43   82:aload_0         
	//   44   83:getfield        #285 <Field ArrayList mActive>
	//   45   86:invokevirtual   #188 <Method int ArrayList.size()>
	//   46   89:istore          6
			for(int i = 0; i < j; i++)
	//*  47   91:iconst_0        
	//*  48   92:istore          5
	//*  49   94:iload           5
	//*  50   96:iload           6
	//*  51   98:icmpge          216
			{
				Fragment fragment = (Fragment)mActive.get(i);
	//   52  101:aload_0         
	//   53  102:getfield        #285 <Field ArrayList mActive>
	//   54  105:iload           5
	//   55  107:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   56  110:checkcast       #194 <Class Fragment>
	//   57  113:astore          7
				if(fragment == null || fragment.mView == null || !fragment.mIsNewlyAdded || !backstackrecord.interactsWith(fragment.mContainerId))
					continue;
	//   58  115:aload           7
	//   59  117:ifnull          207
	//   60  120:aload           7
	//   61  122:getfield        #211 <Field View Fragment.mView>
	//   62  125:ifnull          207
	//   63  128:aload           7
	//   64  130:getfield        #217 <Field boolean Fragment.mIsNewlyAdded>
	//   65  133:ifeq            207
	//   66  136:aload_1         
	//   67  137:aload           7
	//   68  139:getfield        #288 <Field int Fragment.mContainerId>
	//   69  142:invokevirtual   #294 <Method boolean BackStackRecord.interactsWith(int)>
	//   70  145:ifeq            207
				if(android.os.Build.VERSION.SDK_INT >= 11 && fragment.mPostponedAlpha > 0.0F)
	//*  71  148:getstatic       #125 <Field int android.os.Build$VERSION.SDK_INT>
	//*  72  151:bipush          11
	//*  73  153:icmplt          179
	//*  74  156:aload           7
	//*  75  158:getfield        #298 <Field float Fragment.mPostponedAlpha>
	//*  76  161:fconst_0        
	//*  77  162:fcmpl           
	//*  78  163:ifle            179
					fragment.mView.setAlpha(fragment.mPostponedAlpha);
	//   79  166:aload           7
	//   80  168:getfield        #211 <Field View Fragment.mView>
	//   81  171:aload           7
	//   82  173:getfield        #298 <Field float Fragment.mPostponedAlpha>
	//   83  176:invokevirtual   #303 <Method void View.setAlpha(float)>
				if(flag2)
	//*  84  179:iload           4
	//*  85  181:ifeq            193
				{
					fragment.mPostponedAlpha = 0.0F;
	//   86  184:aload           7
	//   87  186:fconst_0        
	//   88  187:putfield        #298 <Field float Fragment.mPostponedAlpha>
				} else
	//*  89  190:goto            207
				{
					fragment.mPostponedAlpha = -1F;
	//   90  193:aload           7
	//   91  195:ldc2            #304 <Float -1F>
	//   92  198:putfield        #298 <Field float Fragment.mPostponedAlpha>
					fragment.mIsNewlyAdded = false;
	//   93  201:aload           7
	//   94  203:iconst_0        
	//   95  204:putfield        #217 <Field boolean Fragment.mIsNewlyAdded>
				}
			}

	//   96  207:iload           5
	//   97  209:iconst_1        
	//   98  210:iadd            
	//   99  211:istore          5
		}
	//* 100  213:goto            94
	//  101  216:return          
	}

	private void endAnimatingAwayFragments()
	{
		int i;
		if(mActive == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #285 <Field ArrayList mActive>
	//*   2    4:ifnonnull       12
			i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
		else
	//*   5    9:goto            20
			i = mActive.size();
	//    6   12:aload_0         
	//    7   13:getfield        #285 <Field ArrayList mActive>
	//    8   16:invokevirtual   #188 <Method int ArrayList.size()>
	//    9   19:istore_1        
		for(int j = 0; j < i; j++)
	//*  10   20:iconst_0        
	//*  11   21:istore_2        
	//*  12   22:iload_2         
	//*  13   23:iload_1         
	//*  14   24:icmpge          106
		{
			Fragment fragment = (Fragment)mActive.get(j);
	//   15   27:aload_0         
	//   16   28:getfield        #285 <Field ArrayList mActive>
	//   17   31:iload_2         
	//   18   32:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   19   35:checkcast       #194 <Class Fragment>
	//   20   38:astore          4
			if(fragment == null || fragment.getAnimatingAway() == null)
				continue;
	//   21   40:aload           4
	//   22   42:ifnull          99
	//   23   45:aload           4
	//   24   47:invokevirtual   #309 <Method View Fragment.getAnimatingAway()>
	//   25   50:ifnull          99
			int k = fragment.getStateAfterAnimating();
	//   26   53:aload           4
	//   27   55:invokevirtual   #312 <Method int Fragment.getStateAfterAnimating()>
	//   28   58:istore_3        
			Object obj = ((Object) (fragment.getAnimatingAway()));
	//   29   59:aload           4
	//   30   61:invokevirtual   #309 <Method View Fragment.getAnimatingAway()>
	//   31   64:astore          5
			fragment.setAnimatingAway(((View) (null)));
	//   32   66:aload           4
	//   33   68:aconst_null     
	//   34   69:invokevirtual   #316 <Method void Fragment.setAnimatingAway(View)>
			obj = ((Object) (((View) (obj)).getAnimation()));
	//   35   72:aload           5
	//   36   74:invokevirtual   #320 <Method Animation View.getAnimation()>
	//   37   77:astore          5
			if(obj != null)
	//*  38   79:aload           5
	//*  39   81:ifnull          89
				((Animation) (obj)).cancel();
	//   40   84:aload           5
	//   41   86:invokevirtual   #325 <Method void Animation.cancel()>
			moveToState(fragment, k, 0, 0, false);
	//   42   89:aload_0         
	//   43   90:aload           4
	//   44   92:iload_3         
	//   45   93:iconst_0        
	//   46   94:iconst_0        
	//   47   95:iconst_0        
	//   48   96:invokevirtual   #207 <Method void moveToState(Fragment, int, int, int, boolean)>
		}

	//   49   99:iload_2         
	//   50  100:iconst_1        
	//   51  101:iadd            
	//   52  102:istore_2        
	//*  53  103:goto            22
	//   54  106:return          
	}

	private void ensureExecReady(boolean flag)
	{
		if(mExecutingActions)
	//*   0    0:aload_0         
	//*   1    1:getfield        #253 <Field boolean mExecutingActions>
	//*   2    4:ifeq            18
			throw new IllegalStateException("FragmentManager is already executing transactions");
	//    3    7:new             #230 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #329 <String "FragmentManager is already executing transactions">
	//    6   14:invokespecial   #235 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		if(Looper.myLooper() != mHost.getHandler().getLooper())
	//*   8   18:invokestatic    #335 <Method Looper Looper.myLooper()>
	//*   9   21:aload_0         
	//*  10   22:getfield        #337 <Field FragmentHostCallback mHost>
	//*  11   25:invokevirtual   #343 <Method Handler FragmentHostCallback.getHandler()>
	//*  12   28:invokevirtual   #348 <Method Looper Handler.getLooper()>
	//*  13   31:if_acmpeq       45
			throw new IllegalStateException("Must be called from main thread of fragment host");
	//   14   34:new             #230 <Class IllegalStateException>
	//   15   37:dup             
	//   16   38:ldc2            #350 <String "Must be called from main thread of fragment host">
	//   17   41:invokespecial   #235 <Method void IllegalStateException(String)>
	//   18   44:athrow          
		if(!flag)
	//*  19   45:iload_1         
	//*  20   46:ifne            53
			checkStateLoss();
	//   21   49:aload_0         
	//   22   50:invokespecial   #352 <Method void checkStateLoss()>
		if(mTmpRecords == null)
	//*  23   53:aload_0         
	//*  24   54:getfield        #260 <Field ArrayList mTmpRecords>
	//*  25   57:ifnonnull       82
		{
			mTmpRecords = new ArrayList();
	//   26   60:aload_0         
	//   27   61:new             #184 <Class ArrayList>
	//   28   64:dup             
	//   29   65:invokespecial   #353 <Method void ArrayList()>
	//   30   68:putfield        #260 <Field ArrayList mTmpRecords>
			mTmpIsPop = new ArrayList();
	//   31   71:aload_0         
	//   32   72:new             #184 <Class ArrayList>
	//   33   75:dup             
	//   34   76:invokespecial   #353 <Method void ArrayList()>
	//   35   79:putfield        #255 <Field ArrayList mTmpIsPop>
		}
		mExecutingActions = true;
	//   36   82:aload_0         
	//   37   83:iconst_1        
	//   38   84:putfield        #253 <Field boolean mExecutingActions>
		executePostponedTransaction(((ArrayList) (null)), ((ArrayList) (null)));
	//   39   87:aload_0         
	//   40   88:aconst_null     
	//   41   89:aconst_null     
	//   42   90:invokespecial   #357 <Method void executePostponedTransaction(ArrayList, ArrayList)>
		mExecutingActions = false;
	//   43   93:aload_0         
	//   44   94:iconst_0        
	//   45   95:putfield        #253 <Field boolean mExecutingActions>
		return;
	//   46   98:return          
		Exception exception;
		exception;
	//   47   99:astore_2        
		mExecutingActions = false;
	//   48  100:aload_0         
	//   49  101:iconst_0        
	//   50  102:putfield        #253 <Field boolean mExecutingActions>
		throw exception;
	//   51  105:aload_2         
	//   52  106:athrow          
	}

	private static void executeOps(ArrayList arraylist, ArrayList arraylist1, int i, int j)
	{
		for(; i < j; i++)
	//*   0    0:iload_2         
	//*   1    1:iload_3         
	//*   2    2:icmpge          79
		{
			BackStackRecord backstackrecord = (BackStackRecord)arraylist.get(i);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//    6   10:checkcast       #290 <Class BackStackRecord>
	//    7   13:astore          5
			if(((Boolean)arraylist1.get(i)).booleanValue())
	//*   8   15:aload_1         
	//*   9   16:iload_2         
	//*  10   17:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//*  11   20:checkcast       #266 <Class Boolean>
	//*  12   23:invokevirtual   #361 <Method boolean Boolean.booleanValue()>
	//*  13   26:ifeq            61
			{
				backstackrecord.bumpBackStackNesting(-1);
	//   14   29:aload           5
	//   15   31:iconst_m1       
	//   16   32:invokevirtual   #364 <Method void BackStackRecord.bumpBackStackNesting(int)>
				boolean flag;
				if(i == j - 1)
	//*  17   35:iload_2         
	//*  18   36:iload_3         
	//*  19   37:iconst_1        
	//*  20   38:isub            
	//*  21   39:icmpne          48
					flag = true;
	//   22   42:iconst_1        
	//   23   43:istore          4
				else
	//*  24   45:goto            51
					flag = false;
	//   25   48:iconst_0        
	//   26   49:istore          4
				backstackrecord.executePopOps(flag);
	//   27   51:aload           5
	//   28   53:iload           4
	//   29   55:invokevirtual   #367 <Method void BackStackRecord.executePopOps(boolean)>
			} else
	//*  30   58:goto            72
			{
				backstackrecord.bumpBackStackNesting(1);
	//   31   61:aload           5
	//   32   63:iconst_1        
	//   33   64:invokevirtual   #364 <Method void BackStackRecord.bumpBackStackNesting(int)>
				backstackrecord.executeOps();
	//   34   67:aload           5
	//   35   69:invokevirtual   #369 <Method void BackStackRecord.executeOps()>
			}
		}

	//   36   72:iload_2         
	//   37   73:iconst_1        
	//   38   74:iadd            
	//   39   75:istore_2        
	//*  40   76:goto            0
	//   41   79:return          
	}

	private void executeOpsTogether(ArrayList arraylist, ArrayList arraylist1, int i, int j)
	{
		boolean flag1 = ((BackStackRecord)arraylist.get(i)).mAllowOptimization;
	//    0    0:aload_1         
	//    1    1:iload_3         
	//    2    2:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//    3    5:checkcast       #290 <Class BackStackRecord>
	//    4    8:getfield        #374 <Field boolean BackStackRecord.mAllowOptimization>
	//    5   11:istore          7
		boolean flag = false;
	//    6   13:iconst_0        
	//    7   14:istore          5
		if(mTmpAddedFragments == null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #376 <Field ArrayList mTmpAddedFragments>
	//*  10   20:ifnonnull       37
			mTmpAddedFragments = new ArrayList();
	//   11   23:aload_0         
	//   12   24:new             #184 <Class ArrayList>
	//   13   27:dup             
	//   14   28:invokespecial   #353 <Method void ArrayList()>
	//   15   31:putfield        #376 <Field ArrayList mTmpAddedFragments>
		else
	//*  16   34:goto            44
			mTmpAddedFragments.clear();
	//   17   37:aload_0         
	//   18   38:getfield        #376 <Field ArrayList mTmpAddedFragments>
	//   19   41:invokevirtual   #258 <Method void ArrayList.clear()>
		if(mAdded != null)
	//*  20   44:aload_0         
	//*  21   45:getfield        #182 <Field ArrayList mAdded>
	//*  22   48:ifnull          63
			mTmpAddedFragments.addAll(((java.util.Collection) (mAdded)));
	//   23   51:aload_0         
	//   24   52:getfield        #376 <Field ArrayList mTmpAddedFragments>
	//   25   55:aload_0         
	//   26   56:getfield        #182 <Field ArrayList mAdded>
	//   27   59:invokevirtual   #380 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   28   62:pop             
		Fragment fragment = getPrimaryNavigationFragment();
	//   29   63:aload_0         
	//   30   64:invokevirtual   #384 <Method Fragment getPrimaryNavigationFragment()>
	//   31   67:astore          8
		for(int k = i; k < j; k++)
	//*  32   69:iload_3         
	//*  33   70:istore          6
	//*  34   72:iload           6
	//*  35   74:iload           4
	//*  36   76:icmpge          165
		{
			BackStackRecord backstackrecord1 = (BackStackRecord)arraylist.get(k);
	//   37   79:aload_1         
	//   38   80:iload           6
	//   39   82:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   40   85:checkcast       #290 <Class BackStackRecord>
	//   41   88:astore          9
			if(!((Boolean)arraylist1.get(k)).booleanValue())
	//*  42   90:aload_2         
	//*  43   91:iload           6
	//*  44   93:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//*  45   96:checkcast       #266 <Class Boolean>
	//*  46   99:invokevirtual   #361 <Method boolean Boolean.booleanValue()>
	//*  47  102:ifne            121
				fragment = backstackrecord1.expandOps(mTmpAddedFragments, fragment);
	//   48  105:aload           9
	//   49  107:aload_0         
	//   50  108:getfield        #376 <Field ArrayList mTmpAddedFragments>
	//   51  111:aload           8
	//   52  113:invokevirtual   #388 <Method Fragment BackStackRecord.expandOps(ArrayList, Fragment)>
	//   53  116:astore          8
			else
	//*  54  118:goto            134
				fragment = backstackrecord1.trackAddedFragmentsInPop(mTmpAddedFragments, fragment);
	//   55  121:aload           9
	//   56  123:aload_0         
	//   57  124:getfield        #376 <Field ArrayList mTmpAddedFragments>
	//   58  127:aload           8
	//   59  129:invokevirtual   #391 <Method Fragment BackStackRecord.trackAddedFragmentsInPop(ArrayList, Fragment)>
	//   60  132:astore          8
			if(flag || backstackrecord1.mAddToBackStack)
	//*  61  134:iload           5
	//*  62  136:ifne            147
	//*  63  139:aload           9
	//*  64  141:getfield        #394 <Field boolean BackStackRecord.mAddToBackStack>
	//*  65  144:ifeq            153
				flag = true;
	//   66  147:iconst_1        
	//   67  148:istore          5
			else
	//*  68  150:goto            156
				flag = false;
	//   69  153:iconst_0        
	//   70  154:istore          5
		}

	//   71  156:iload           6
	//   72  158:iconst_1        
	//   73  159:iadd            
	//   74  160:istore          6
	//*  75  162:goto            72
		mTmpAddedFragments.clear();
	//   76  165:aload_0         
	//   77  166:getfield        #376 <Field ArrayList mTmpAddedFragments>
	//   78  169:invokevirtual   #258 <Method void ArrayList.clear()>
		if(!flag1)
	//*  79  172:iload           7
	//*  80  174:ifne            187
			FragmentTransition.startTransitions(this, arraylist, arraylist1, i, j, false);
	//   81  177:aload_0         
	//   82  178:aload_1         
	//   83  179:aload_2         
	//   84  180:iload_3         
	//   85  181:iload           4
	//   86  183:iconst_0        
	//   87  184:invokestatic    #280 <Method void FragmentTransition.startTransitions(FragmentManagerImpl, ArrayList, ArrayList, int, int, boolean)>
		executeOps(arraylist, arraylist1, i, j);
	//   88  187:aload_1         
	//   89  188:aload_2         
	//   90  189:iload_3         
	//   91  190:iload           4
	//   92  192:invokestatic    #274 <Method void executeOps(ArrayList, ArrayList, int, int)>
		int l = j;
	//   93  195:iload           4
	//   94  197:istore          6
		if(flag1)
	//*  95  199:iload           7
	//*  96  201:ifeq            238
		{
			ArraySet arrayset = new ArraySet();
	//   97  204:new             #219 <Class ArraySet>
	//   98  207:dup             
	//   99  208:invokespecial   #395 <Method void ArraySet()>
	//  100  211:astore          8
			addAddedFragments(arrayset);
	//  101  213:aload_0         
	//  102  214:aload           8
	//  103  216:invokespecial   #397 <Method void addAddedFragments(ArraySet)>
			l = postponePostponableTransactions(arraylist, arraylist1, i, j, arrayset);
	//  104  219:aload_0         
	//  105  220:aload_1         
	//  106  221:aload_2         
	//  107  222:iload_3         
	//  108  223:iload           4
	//  109  225:aload           8
	//  110  227:invokespecial   #401 <Method int postponePostponableTransactions(ArrayList, ArrayList, int, int, ArraySet)>
	//  111  230:istore          6
			makeRemovedFragmentsInvisible(arrayset);
	//  112  232:aload_0         
	//  113  233:aload           8
	//  114  235:invokespecial   #404 <Method void makeRemovedFragmentsInvisible(ArraySet)>
		}
		if(l != i && flag1)
	//* 115  238:iload           6
	//* 116  240:iload_3         
	//* 117  241:icmpeq          268
	//* 118  244:iload           7
	//* 119  246:ifeq            268
		{
			FragmentTransition.startTransitions(this, arraylist, arraylist1, i, l, true);
	//  120  249:aload_0         
	//  121  250:aload_1         
	//  122  251:aload_2         
	//  123  252:iload_3         
	//  124  253:iload           6
	//  125  255:iconst_1        
	//  126  256:invokestatic    #280 <Method void FragmentTransition.startTransitions(FragmentManagerImpl, ArrayList, ArrayList, int, int, boolean)>
			moveToState(mCurState, true);
	//  127  259:aload_0         
	//  128  260:aload_0         
	//  129  261:getfield        #153 <Field int mCurState>
	//  130  264:iconst_1        
	//  131  265:invokevirtual   #283 <Method void moveToState(int, boolean)>
		}
		for(; i < j; i++)
	//* 132  268:iload_3         
	//* 133  269:iload           4
	//* 134  271:icmpge          333
		{
			BackStackRecord backstackrecord = (BackStackRecord)arraylist.get(i);
	//  135  274:aload_1         
	//  136  275:iload_3         
	//  137  276:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//  138  279:checkcast       #290 <Class BackStackRecord>
	//  139  282:astore          8
			if(((Boolean)arraylist1.get(i)).booleanValue() && backstackrecord.mIndex >= 0)
	//* 140  284:aload_2         
	//* 141  285:iload_3         
	//* 142  286:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//* 143  289:checkcast       #266 <Class Boolean>
	//* 144  292:invokevirtual   #361 <Method boolean Boolean.booleanValue()>
	//* 145  295:ifeq            321
	//* 146  298:aload           8
	//* 147  300:getfield        #407 <Field int BackStackRecord.mIndex>
	//* 148  303:iflt            321
			{
				freeBackStackIndex(backstackrecord.mIndex);
	//  149  306:aload_0         
	//  150  307:aload           8
	//  151  309:getfield        #407 <Field int BackStackRecord.mIndex>
	//  152  312:invokevirtual   #410 <Method void freeBackStackIndex(int)>
				backstackrecord.mIndex = -1;
	//  153  315:aload           8
	//  154  317:iconst_m1       
	//  155  318:putfield        #407 <Field int BackStackRecord.mIndex>
			}
			backstackrecord.runOnCommitRunnables();
	//  156  321:aload           8
	//  157  323:invokevirtual   #413 <Method void BackStackRecord.runOnCommitRunnables()>
		}

	//  158  326:iload_3         
	//  159  327:iconst_1        
	//  160  328:iadd            
	//  161  329:istore_3        
	//* 162  330:goto            268
		if(flag)
	//* 163  333:iload           5
	//* 164  335:ifeq            342
			reportBackStackChanged();
	//  165  338:aload_0         
	//  166  339:invokevirtual   #416 <Method void reportBackStackChanged()>
	//  167  342:return          
	}

	private void executePostponedTransaction(ArrayList arraylist, ArrayList arraylist1)
	{
		int j;
		if(mPostponedTransactions == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #418 <Field ArrayList mPostponedTransactions>
	//*   2    4:ifnonnull       13
			j = 0;
	//    3    7:iconst_0        
	//    4    8:istore          4
		else
	//*   5   10:goto            22
			j = mPostponedTransactions.size();
	//    6   13:aload_0         
	//    7   14:getfield        #418 <Field ArrayList mPostponedTransactions>
	//    8   17:invokevirtual   #188 <Method int ArrayList.size()>
	//    9   20:istore          4
		int k;
		for(int i = 0; i < j; j = k)
	//*  10   22:iconst_0        
	//*  11   23:istore_3        
	//*  12   24:iload_3         
	//*  13   25:iload           4
	//*  14   27:icmpge          231
		{
			int l;
label0:
			{
				StartEnterTransitionListener startentertransitionlistener = (StartEnterTransitionListener)mPostponedTransactions.get(i);
	//   15   30:aload_0         
	//   16   31:getfield        #418 <Field ArrayList mPostponedTransactions>
	//   17   34:iload_3         
	//   18   35:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   19   38:checkcast       #26  <Class FragmentManagerImpl$StartEnterTransitionListener>
	//   20   41:astore          7
				if(arraylist != null && !startentertransitionlistener.mIsBack)
	//*  21   43:aload_1         
	//*  22   44:ifnull          102
	//*  23   47:aload           7
	//*  24   49:invokestatic    #422 <Method boolean FragmentManagerImpl$StartEnterTransitionListener.access$000(FragmentManagerImpl$StartEnterTransitionListener)>
	//*  25   52:ifne            102
				{
					k = arraylist.indexOf(((Object) (startentertransitionlistener.mRecord)));
	//   26   55:aload_1         
	//   27   56:aload           7
	//   28   58:invokestatic    #426 <Method BackStackRecord FragmentManagerImpl$StartEnterTransitionListener.access$100(FragmentManagerImpl$StartEnterTransitionListener)>
	//   29   61:invokevirtual   #430 <Method int ArrayList.indexOf(Object)>
	//   30   64:istore          5
					if(k != -1 && ((Boolean)arraylist1.get(k)).booleanValue())
	//*  31   66:iload           5
	//*  32   68:iconst_m1       
	//*  33   69:icmpeq          102
	//*  34   72:aload_2         
	//*  35   73:iload           5
	//*  36   75:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//*  37   78:checkcast       #266 <Class Boolean>
	//*  38   81:invokevirtual   #361 <Method boolean Boolean.booleanValue()>
	//*  39   84:ifeq            102
					{
						startentertransitionlistener.cancelTransaction();
	//   40   87:aload           7
	//   41   89:invokevirtual   #433 <Method void FragmentManagerImpl$StartEnterTransitionListener.cancelTransaction()>
						k = j;
	//   42   92:iload           4
	//   43   94:istore          5
						l = i;
	//   44   96:iload_3         
	//   45   97:istore          6
						break label0;
	//   46   99:goto            219
					}
				}
				if(!startentertransitionlistener.isReady())
	//*  47  102:aload           7
	//*  48  104:invokevirtual   #436 <Method boolean FragmentManagerImpl$StartEnterTransitionListener.isReady()>
	//*  49  107:ifne            145
				{
					k = j;
	//   50  110:iload           4
	//   51  112:istore          5
					l = i;
	//   52  114:iload_3         
	//   53  115:istore          6
					if(arraylist == null)
						break label0;
	//   54  117:aload_1         
	//   55  118:ifnull          219
					k = j;
	//   56  121:iload           4
	//   57  123:istore          5
					l = i;
	//   58  125:iload_3         
	//   59  126:istore          6
					if(!startentertransitionlistener.mRecord.interactsWith(arraylist, 0, arraylist.size()))
						break label0;
	//   60  128:aload           7
	//   61  130:invokestatic    #426 <Method BackStackRecord FragmentManagerImpl$StartEnterTransitionListener.access$100(FragmentManagerImpl$StartEnterTransitionListener)>
	//   62  133:aload_1         
	//   63  134:iconst_0        
	//   64  135:aload_1         
	//   65  136:invokevirtual   #188 <Method int ArrayList.size()>
	//   66  139:invokevirtual   #439 <Method boolean BackStackRecord.interactsWith(ArrayList, int, int)>
	//   67  142:ifeq            219
				}
				mPostponedTransactions.remove(i);
	//   68  145:aload_0         
	//   69  146:getfield        #418 <Field ArrayList mPostponedTransactions>
	//   70  149:iload_3         
	//   71  150:invokevirtual   #442 <Method Object ArrayList.remove(int)>
	//   72  153:pop             
				l = i - 1;
	//   73  154:iload_3         
	//   74  155:iconst_1        
	//   75  156:isub            
	//   76  157:istore          6
				k = j - 1;
	//   77  159:iload           4
	//   78  161:iconst_1        
	//   79  162:isub            
	//   80  163:istore          5
				if(arraylist != null && !startentertransitionlistener.mIsBack)
	//*  81  165:aload_1         
	//*  82  166:ifnull          214
	//*  83  169:aload           7
	//*  84  171:invokestatic    #422 <Method boolean FragmentManagerImpl$StartEnterTransitionListener.access$000(FragmentManagerImpl$StartEnterTransitionListener)>
	//*  85  174:ifne            214
				{
					i = arraylist.indexOf(((Object) (startentertransitionlistener.mRecord)));
	//   86  177:aload_1         
	//   87  178:aload           7
	//   88  180:invokestatic    #426 <Method BackStackRecord FragmentManagerImpl$StartEnterTransitionListener.access$100(FragmentManagerImpl$StartEnterTransitionListener)>
	//   89  183:invokevirtual   #430 <Method int ArrayList.indexOf(Object)>
	//   90  186:istore_3        
					if(i != -1 && ((Boolean)arraylist1.get(i)).booleanValue())
	//*  91  187:iload_3         
	//*  92  188:iconst_m1       
	//*  93  189:icmpeq          214
	//*  94  192:aload_2         
	//*  95  193:iload_3         
	//*  96  194:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//*  97  197:checkcast       #266 <Class Boolean>
	//*  98  200:invokevirtual   #361 <Method boolean Boolean.booleanValue()>
	//*  99  203:ifeq            214
					{
						startentertransitionlistener.cancelTransaction();
	//  100  206:aload           7
	//  101  208:invokevirtual   #433 <Method void FragmentManagerImpl$StartEnterTransitionListener.cancelTransaction()>
						break label0;
	//  102  211:goto            219
					}
				}
				startentertransitionlistener.completeTransaction();
	//  103  214:aload           7
	//  104  216:invokevirtual   #445 <Method void FragmentManagerImpl$StartEnterTransitionListener.completeTransaction()>
			}
			i = l + 1;
	//  105  219:iload           6
	//  106  221:iconst_1        
	//  107  222:iadd            
	//  108  223:istore_3        
		}

	//  109  224:iload           5
	//  110  226:istore          4
	//* 111  228:goto            24
	//  112  231:return          
	}

	private Fragment findFragmentUnder(Fragment fragment)
	{
		ViewGroup viewgroup = fragment.mContainer;
	//    0    0:aload_1         
	//    1    1:getfield        #451 <Field ViewGroup Fragment.mContainer>
	//    2    4:astore_3        
		View view = fragment.mView;
	//    3    5:aload_1         
	//    4    6:getfield        #211 <Field View Fragment.mView>
	//    5    9:astore          4
		if(viewgroup == null || view == null)
	//*   6   11:aload_3         
	//*   7   12:ifnull          20
	//*   8   15:aload           4
	//*   9   17:ifnonnull       22
			return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
		for(int i = mAdded.indexOf(((Object) (fragment))) - 1; i >= 0; i--)
	//*  12   22:aload_0         
	//*  13   23:getfield        #182 <Field ArrayList mAdded>
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #430 <Method int ArrayList.indexOf(Object)>
	//*  16   30:iconst_1        
	//*  17   31:isub            
	//*  18   32:istore_2        
	//*  19   33:iload_2         
	//*  20   34:iflt            73
		{
			fragment = (Fragment)mAdded.get(i);
	//   21   37:aload_0         
	//   22   38:getfield        #182 <Field ArrayList mAdded>
	//   23   41:iload_2         
	//   24   42:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   25   45:checkcast       #194 <Class Fragment>
	//   26   48:astore_1        
			if(fragment.mContainer == viewgroup && fragment.mView != null)
	//*  27   49:aload_1         
	//*  28   50:getfield        #451 <Field ViewGroup Fragment.mContainer>
	//*  29   53:aload_3         
	//*  30   54:if_acmpne       66
	//*  31   57:aload_1         
	//*  32   58:getfield        #211 <Field View Fragment.mView>
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
	}

	private void forcePostponedTransactions()
	{
		if(mPostponedTransactions != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #418 <Field ArrayList mPostponedTransactions>
	//*   2    4:ifnull          34
			for(; !mPostponedTransactions.isEmpty(); ((StartEnterTransitionListener)mPostponedTransactions.remove(0)).completeTransaction());
	//    3    7:aload_0         
	//    4    8:getfield        #418 <Field ArrayList mPostponedTransactions>
	//    5   11:invokevirtual   #455 <Method boolean ArrayList.isEmpty()>
	//    6   14:ifne            34
	//    7   17:aload_0         
	//    8   18:getfield        #418 <Field ArrayList mPostponedTransactions>
	//    9   21:iconst_0        
	//   10   22:invokevirtual   #442 <Method Object ArrayList.remove(int)>
	//   11   25:checkcast       #26  <Class FragmentManagerImpl$StartEnterTransitionListener>
	//   12   28:invokevirtual   #445 <Method void FragmentManagerImpl$StartEnterTransitionListener.completeTransaction()>
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
		int i;
		if(mPendingActions == null)
			break MISSING_BLOCK_LABEL_24;
	//    4    5:aload_0         
	//    5    6:getfield        #459 <Field ArrayList mPendingActions>
	//    6    9:ifnull          24
		i = mPendingActions.size();
	//    7   12:aload_0         
	//    8   13:getfield        #459 <Field ArrayList mPendingActions>
	//    9   16:invokevirtual   #188 <Method int ArrayList.size()>
	//   10   19:istore_3        
		if(i != 0)
			break MISSING_BLOCK_LABEL_28;
	//   11   20:iload_3         
	//   12   21:ifne            28
		this;
	//   13   24:aload_0         
		JVM INSTR monitorexit ;
	//   14   25:monitorexit     
		return false;
	//   15   26:iconst_0        
	//   16   27:ireturn         
		int j = mPendingActions.size();
	//   17   28:aload_0         
	//   18   29:getfield        #459 <Field ArrayList mPendingActions>
	//   19   32:invokevirtual   #188 <Method int ArrayList.size()>
	//   20   35:istore          4
		i = 0;
	//   21   37:iconst_0        
	//   22   38:istore_3        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   23   39:iload_3         
	//   24   40:iload           4
	//   25   42:icmpge          75
		flag |= ((OpGenerator)mPendingActions.get(i)).generateOps(arraylist, arraylist1);
	//   26   45:iload           5
	//   27   47:aload_0         
	//   28   48:getfield        #459 <Field ArrayList mPendingActions>
	//   29   51:iload_3         
	//   30   52:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   31   55:checkcast       #20  <Class FragmentManagerImpl$OpGenerator>
	//   32   58:aload_1         
	//   33   59:aload_2         
	//   34   60:invokeinterface #462 <Method boolean FragmentManagerImpl$OpGenerator.generateOps(ArrayList, ArrayList)>
	//   35   65:ior             
	//   36   66:istore          5
		i++;
	//   37   68:iload_3         
	//   38   69:iconst_1        
	//   39   70:iadd            
	//   40   71:istore_3        
		if(true) goto _L2; else goto _L1
	//   41   72:goto            39
_L1:
		mPendingActions.clear();
	//   42   75:aload_0         
	//   43   76:getfield        #459 <Field ArrayList mPendingActions>
	//   44   79:invokevirtual   #258 <Method void ArrayList.clear()>
		mHost.getHandler().removeCallbacks(mExecCommit);
	//   45   82:aload_0         
	//   46   83:getfield        #337 <Field FragmentHostCallback mHost>
	//   47   86:invokevirtual   #343 <Method Handler FragmentHostCallback.getHandler()>
	//   48   89:aload_0         
	//   49   90:getfield        #162 <Field Runnable mExecCommit>
	//   50   93:invokevirtual   #466 <Method void Handler.removeCallbacks(Runnable)>
		this;
	//   51   96:aload_0         
		JVM INSTR monitorexit ;
	//   52   97:monitorexit     
		return flag;
	//   53   98:iload           5
	//   54  100:ireturn         
		arraylist;
	//   55  101:astore_1        
	//*  56  102:aload_0         
		throw arraylist;
	//   57  103:monitorexit     
	//   58  104:aload_1         
	//   59  105:athrow          
	}

	static Animation makeFadeAnimation(Context context, float f, float f1)
	{
		context = ((Context) (new AlphaAnimation(f, f1)));
	//    0    0:new             #471 <Class AlphaAnimation>
	//    1    3:dup             
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokespecial   #474 <Method void AlphaAnimation(float, float)>
	//    5    9:astore_0        
		((AlphaAnimation) (context)).setInterpolator(DECELERATE_CUBIC);
	//    6   10:aload_0         
	//    7   11:getstatic       #141 <Field Interpolator DECELERATE_CUBIC>
	//    8   14:invokevirtual   #478 <Method void AlphaAnimation.setInterpolator(Interpolator)>
		((AlphaAnimation) (context)).setDuration(220L);
	//    9   17:aload_0         
	//   10   18:ldc2w           #479 <Long 220L>
	//   11   21:invokevirtual   #484 <Method void AlphaAnimation.setDuration(long)>
		return ((Animation) (context));
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	static Animation makeOpenCloseAnimation(Context context, float f, float f1, float f2, float f3)
	{
		context = ((Context) (new AnimationSet(false)));
	//    0    0:new             #488 <Class AnimationSet>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #490 <Method void AnimationSet(boolean)>
	//    4    8:astore_0        
		Object obj = ((Object) (new ScaleAnimation(f, f1, f, f1, 1, 0.5F, 1, 0.5F)));
	//    5    9:new             #492 <Class ScaleAnimation>
	//    6   12:dup             
	//    7   13:fload_1         
	//    8   14:fload_2         
	//    9   15:fload_1         
	//   10   16:fload_2         
	//   11   17:iconst_1        
	//   12   18:ldc2            #493 <Float 0.5F>
	//   13   21:iconst_1        
	//   14   22:ldc2            #493 <Float 0.5F>
	//   15   25:invokespecial   #496 <Method void ScaleAnimation(float, float, float, float, int, float, int, float)>
	//   16   28:astore          5
		((ScaleAnimation) (obj)).setInterpolator(DECELERATE_QUINT);
	//   17   30:aload           5
	//   18   32:getstatic       #138 <Field Interpolator DECELERATE_QUINT>
	//   19   35:invokevirtual   #497 <Method void ScaleAnimation.setInterpolator(Interpolator)>
		((ScaleAnimation) (obj)).setDuration(220L);
	//   20   38:aload           5
	//   21   40:ldc2w           #479 <Long 220L>
	//   22   43:invokevirtual   #498 <Method void ScaleAnimation.setDuration(long)>
		((AnimationSet) (context)).addAnimation(((Animation) (obj)));
	//   23   46:aload_0         
	//   24   47:aload           5
	//   25   49:invokevirtual   #502 <Method void AnimationSet.addAnimation(Animation)>
		obj = ((Object) (new AlphaAnimation(f2, f3)));
	//   26   52:new             #471 <Class AlphaAnimation>
	//   27   55:dup             
	//   28   56:fload_3         
	//   29   57:fload           4
	//   30   59:invokespecial   #474 <Method void AlphaAnimation(float, float)>
	//   31   62:astore          5
		((AlphaAnimation) (obj)).setInterpolator(DECELERATE_CUBIC);
	//   32   64:aload           5
	//   33   66:getstatic       #141 <Field Interpolator DECELERATE_CUBIC>
	//   34   69:invokevirtual   #478 <Method void AlphaAnimation.setInterpolator(Interpolator)>
		((AlphaAnimation) (obj)).setDuration(220L);
	//   35   72:aload           5
	//   36   74:ldc2w           #479 <Long 220L>
	//   37   77:invokevirtual   #484 <Method void AlphaAnimation.setDuration(long)>
		((AnimationSet) (context)).addAnimation(((Animation) (obj)));
	//   38   80:aload_0         
	//   39   81:aload           5
	//   40   83:invokevirtual   #502 <Method void AnimationSet.addAnimation(Animation)>
		return ((Animation) (context));
	//   41   86:aload_0         
	//   42   87:areturn         
	}

	private void makeRemovedFragmentsInvisible(ArraySet arrayset)
	{
		int j = arrayset.size();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #503 <Method int ArraySet.size()>
	//    2    4:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          80
		{
			Fragment fragment = (Fragment)arrayset.valueAt(i);
	//    8   12:aload_1         
	//    9   13:iload_2         
	//   10   14:invokevirtual   #506 <Method Object ArraySet.valueAt(int)>
	//   11   17:checkcast       #194 <Class Fragment>
	//   12   20:astore          4
			if(fragment.mAdded)
				continue;
	//   13   22:aload           4
	//   14   24:getfield        #508 <Field boolean Fragment.mAdded>
	//   15   27:ifne            73
			View view = fragment.getView();
	//   16   30:aload           4
	//   17   32:invokevirtual   #511 <Method View Fragment.getView()>
	//   18   35:astore          5
			if(android.os.Build.VERSION.SDK_INT < 11)
	//*  19   37:getstatic       #125 <Field int android.os.Build$VERSION.SDK_INT>
	//*  20   40:bipush          11
	//*  21   42:icmpge          57
			{
				fragment.getView().setVisibility(4);
	//   22   45:aload           4
	//   23   47:invokevirtual   #511 <Method View Fragment.getView()>
	//   24   50:iconst_4        
	//   25   51:invokevirtual   #514 <Method void View.setVisibility(int)>
			} else
	//*  26   54:goto            73
			{
				fragment.mPostponedAlpha = view.getAlpha();
	//   27   57:aload           4
	//   28   59:aload           5
	//   29   61:invokevirtual   #518 <Method float View.getAlpha()>
	//   30   64:putfield        #298 <Field float Fragment.mPostponedAlpha>
				view.setAlpha(0.0F);
	//   31   67:aload           5
	//   32   69:fconst_0        
	//   33   70:invokevirtual   #303 <Method void View.setAlpha(float)>
			}
		}

	//   34   73:iload_2         
	//   35   74:iconst_1        
	//   36   75:iadd            
	//   37   76:istore_2        
	//*  38   77:goto            7
	//   39   80:return          
	}

	static boolean modifiesAlpha(Animation animation)
	{
		if(animation instanceof AlphaAnimation)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #471 <Class AlphaAnimation>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(animation instanceof AnimationSet)
	//*   5    9:aload_0         
	//*   6   10:instanceof      #488 <Class AnimationSet>
	//*   7   13:ifeq            58
		{
			animation = ((Animation) (((AnimationSet)animation).getAnimations()));
	//    8   16:aload_0         
	//    9   17:checkcast       #488 <Class AnimationSet>
	//   10   20:invokevirtual   #524 <Method List AnimationSet.getAnimations()>
	//   11   23:astore_0        
			for(int i = 0; i < ((List) (animation)).size(); i++)
	//*  12   24:iconst_0        
	//*  13   25:istore_1        
	//*  14   26:iload_1         
	//*  15   27:aload_0         
	//*  16   28:invokeinterface #527 <Method int List.size()>
	//*  17   33:icmpge          58
				if(((List) (animation)).get(i) instanceof AlphaAnimation)
	//*  18   36:aload_0         
	//*  19   37:iload_1         
	//*  20   38:invokeinterface #528 <Method Object List.get(int)>
	//*  21   43:instanceof      #471 <Class AlphaAnimation>
	//*  22   46:ifeq            51
					return true;
	//   23   49:iconst_1        
	//   24   50:ireturn         

	//   25   51:iload_1         
	//   26   52:iconst_1        
	//   27   53:iadd            
	//   28   54:istore_1        
		}
	//*  29   55:goto            26
		return false;
	//   30   58:iconst_0        
	//   31   59:ireturn         
	}

	private void optimizeAndExecuteOps(ArrayList arraylist, ArrayList arraylist1)
	{
		if(arraylist == null || arraylist.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #455 <Method boolean ArrayList.isEmpty()>
	//*   4    8:ifeq            12
			return;
	//    5   11:return          
		if(arraylist1 == null || arraylist.size() != arraylist1.size())
	//*   6   12:aload_2         
	//*   7   13:ifnull          27
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #188 <Method int ArrayList.size()>
	//*  10   20:aload_2         
	//*  11   21:invokevirtual   #188 <Method int ArrayList.size()>
	//*  12   24:icmpeq          38
			throw new IllegalStateException("Internal error with the back stack records");
	//   13   27:new             #230 <Class IllegalStateException>
	//   14   30:dup             
	//   15   31:ldc2            #531 <String "Internal error with the back stack records">
	//   16   34:invokespecial   #235 <Method void IllegalStateException(String)>
	//   17   37:athrow          
		executePostponedTransaction(arraylist, arraylist1);
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:aload_2         
	//   21   41:invokespecial   #357 <Method void executePostponedTransaction(ArrayList, ArrayList)>
		int i1 = arraylist.size();
	//   22   44:aload_1         
	//   23   45:invokevirtual   #188 <Method int ArrayList.size()>
	//   24   48:istore          7
		int j = 0;
	//   25   50:iconst_0        
	//   26   51:istore          4
		for(int i = 0; i < i1;)
	//*  27   53:iconst_0        
	//*  28   54:istore_3        
	//*  29   55:iload_3         
	//*  30   56:iload           7
	//*  31   58:icmpge          209
		{
			int k = j;
	//   32   61:iload           4
	//   33   63:istore          5
			int l = i;
	//   34   65:iload_3         
	//   35   66:istore          6
			if(!((BackStackRecord)arraylist.get(i)).mAllowOptimization)
	//*  36   68:aload_1         
	//*  37   69:iload_3         
	//*  38   70:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//*  39   73:checkcast       #290 <Class BackStackRecord>
	//*  40   76:getfield        #374 <Field boolean BackStackRecord.mAllowOptimization>
	//*  41   79:ifne            197
			{
				if(j != i)
	//*  42   82:iload           4
	//*  43   84:iload_3         
	//*  44   85:icmpeq          97
					executeOpsTogether(arraylist, arraylist1, j, i);
	//   45   88:aload_0         
	//   46   89:aload_1         
	//   47   90:aload_2         
	//   48   91:iload           4
	//   49   93:iload_3         
	//   50   94:invokespecial   #533 <Method void executeOpsTogether(ArrayList, ArrayList, int, int)>
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
	//*  59  108:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//*  60  111:checkcast       #266 <Class Boolean>
	//*  61  114:invokevirtual   #361 <Method boolean Boolean.booleanValue()>
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
	//   72  138:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   73  141:checkcast       #266 <Class Boolean>
	//   74  144:invokevirtual   #361 <Method boolean Boolean.booleanValue()>
	//   75  147:ifeq            178
						j = k;
	//   76  150:iload           5
	//   77  152:istore          4
						if(((BackStackRecord)arraylist.get(k)).mAllowOptimization)
							break;
	//   78  154:aload_1         
	//   79  155:iload           5
	//   80  157:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   81  160:checkcast       #290 <Class BackStackRecord>
	//   82  163:getfield        #374 <Field boolean BackStackRecord.mAllowOptimization>
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
	//   94  184:invokespecial   #533 <Method void executeOpsTogether(ArrayList, ArrayList, int, int)>
				k = j;
	//   95  187:iload           4
	//   96  189:istore          5
				l = j - 1;
	//   97  191:iload           4
	//   98  193:iconst_1        
	//   99  194:isub            
	//  100  195:istore          6
			}
			i = l + 1;
	//  101  197:iload           6
	//  102  199:iconst_1        
	//  103  200:iadd            
	//  104  201:istore_3        
			j = k;
	//  105  202:iload           5
	//  106  204:istore          4
		}

	//* 107  206:goto            55
		if(j != i1)
	//* 108  209:iload           4
	//* 109  211:iload           7
	//* 110  213:icmpeq          226
			executeOpsTogether(arraylist, arraylist1, j, i1);
	//  111  216:aload_0         
	//  112  217:aload_1         
	//  113  218:aload_2         
	//  114  219:iload           4
	//  115  221:iload           7
	//  116  223:invokespecial   #533 <Method void executeOpsTogether(ArrayList, ArrayList, int, int)>
	//  117  226:return          
	}

	private boolean popBackStackImmediate(String s, int i, int j)
	{
		boolean flag;
		execPendingActions();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #538 <Method boolean execPendingActions()>
	//    2    4:pop             
		ensureExecReady(true);
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokespecial   #540 <Method void ensureExecReady(boolean)>
		if(mPrimaryNav != null && i < 0 && s == null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #542 <Field Fragment mPrimaryNav>
	//*   8   14:ifnull          49
	//*   9   17:iload_2         
	//*  10   18:ifge            49
	//*  11   21:aload_1         
	//*  12   22:ifnonnull       49
		{
			FragmentManager fragmentmanager = mPrimaryNav.peekChildFragmentManager();
	//   13   25:aload_0         
	//   14   26:getfield        #542 <Field Fragment mPrimaryNav>
	//   15   29:invokevirtual   #546 <Method FragmentManager Fragment.peekChildFragmentManager()>
	//   16   32:astore          5
			if(fragmentmanager != null && fragmentmanager.popBackStackImmediate())
	//*  17   34:aload           5
	//*  18   36:ifnull          49
	//*  19   39:aload           5
	//*  20   41:invokevirtual   #548 <Method boolean FragmentManager.popBackStackImmediate()>
	//*  21   44:ifeq            49
				return true;
	//   22   47:iconst_1        
	//   23   48:ireturn         
		}
		flag = popBackStackState(mTmpRecords, mTmpIsPop, s, i, j);
	//   24   49:aload_0         
	//   25   50:aload_0         
	//   26   51:getfield        #260 <Field ArrayList mTmpRecords>
	//   27   54:aload_0         
	//   28   55:getfield        #255 <Field ArrayList mTmpIsPop>
	//   29   58:aload_1         
	//   30   59:iload_2         
	//   31   60:iload_3         
	//   32   61:invokevirtual   #552 <Method boolean popBackStackState(ArrayList, ArrayList, String, int, int)>
	//   33   64:istore          4
		if(!flag)
			break MISSING_BLOCK_LABEL_102;
	//   34   66:iload           4
	//   35   68:ifeq            102
		mExecutingActions = true;
	//   36   71:aload_0         
	//   37   72:iconst_1        
	//   38   73:putfield        #253 <Field boolean mExecutingActions>
		optimizeAndExecuteOps(mTmpRecords, mTmpIsPop);
	//   39   76:aload_0         
	//   40   77:aload_0         
	//   41   78:getfield        #260 <Field ArrayList mTmpRecords>
	//   42   81:aload_0         
	//   43   82:getfield        #255 <Field ArrayList mTmpIsPop>
	//   44   85:invokespecial   #554 <Method void optimizeAndExecuteOps(ArrayList, ArrayList)>
		cleanupExec();
	//   45   88:aload_0         
	//   46   89:invokespecial   #556 <Method void cleanupExec()>
		break MISSING_BLOCK_LABEL_102;
	//   47   92:goto            102
		s;
	//   48   95:astore_1        
		cleanupExec();
	//   49   96:aload_0         
	//   50   97:invokespecial   #556 <Method void cleanupExec()>
		throw s;
	//   51  100:aload_1         
	//   52  101:athrow          
		doPendingDeferredStart();
	//   53  102:aload_0         
	//   54  103:invokevirtual   #559 <Method void doPendingDeferredStart()>
		return flag;
	//   55  106:iload           4
	//   56  108:ireturn         
	}

	private int postponePostponableTransactions(ArrayList arraylist, ArrayList arraylist1, int i, int j, ArraySet arrayset)
	{
		int l = j;
	//    0    0:iload           4
	//    1    2:istore          7
		for(int k = j - 1; k >= i;)
	//*   2    4:iload           4
	//*   3    6:iconst_1        
	//*   4    7:isub            
	//*   5    8:istore          6
	//*   6   10:iload           6
	//*   7   12:iload_3         
	//*   8   13:icmplt          196
		{
			BackStackRecord backstackrecord = (BackStackRecord)arraylist.get(k);
	//    9   16:aload_1         
	//   10   17:iload           6
	//   11   19:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #290 <Class BackStackRecord>
	//   13   25:astore          11
			boolean flag1 = ((Boolean)arraylist1.get(k)).booleanValue();
	//   14   27:aload_2         
	//   15   28:iload           6
	//   16   30:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   17   33:checkcast       #266 <Class Boolean>
	//   18   36:invokevirtual   #361 <Method boolean Boolean.booleanValue()>
	//   19   39:istore          10
			boolean flag;
			if(backstackrecord.isPostponed() && !backstackrecord.interactsWith(arraylist, k + 1, j))
	//*  20   41:aload           11
	//*  21   43:invokevirtual   #562 <Method boolean BackStackRecord.isPostponed()>
	//*  22   46:ifeq            70
	//*  23   49:aload           11
	//*  24   51:aload_1         
	//*  25   52:iload           6
	//*  26   54:iconst_1        
	//*  27   55:iadd            
	//*  28   56:iload           4
	//*  29   58:invokevirtual   #439 <Method boolean BackStackRecord.interactsWith(ArrayList, int, int)>
	//*  30   61:ifne            70
				flag = true;
	//   31   64:iconst_1        
	//   32   65:istore          9
			else
	//*  33   67:goto            73
				flag = false;
	//   34   70:iconst_0        
	//   35   71:istore          9
			int i1 = l;
	//   36   73:iload           7
	//   37   75:istore          8
			if(flag)
	//*  38   77:iload           9
	//*  39   79:ifeq            183
			{
				if(mPostponedTransactions == null)
	//*  40   82:aload_0         
	//*  41   83:getfield        #418 <Field ArrayList mPostponedTransactions>
	//*  42   86:ifnonnull       100
					mPostponedTransactions = new ArrayList();
	//   43   89:aload_0         
	//   44   90:new             #184 <Class ArrayList>
	//   45   93:dup             
	//   46   94:invokespecial   #353 <Method void ArrayList()>
	//   47   97:putfield        #418 <Field ArrayList mPostponedTransactions>
				StartEnterTransitionListener startentertransitionlistener = new StartEnterTransitionListener(backstackrecord, flag1);
	//   48  100:new             #26  <Class FragmentManagerImpl$StartEnterTransitionListener>
	//   49  103:dup             
	//   50  104:aload           11
	//   51  106:iload           10
	//   52  108:invokespecial   #565 <Method void FragmentManagerImpl$StartEnterTransitionListener(BackStackRecord, boolean)>
	//   53  111:astore          12
				mPostponedTransactions.add(((Object) (startentertransitionlistener)));
	//   54  113:aload_0         
	//   55  114:getfield        #418 <Field ArrayList mPostponedTransactions>
	//   56  117:aload           12
	//   57  119:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
	//   58  122:pop             
				backstackrecord.setOnStartPostponedListener(((Fragment.OnStartEnterTransitionListener) (startentertransitionlistener)));
	//   59  123:aload           11
	//   60  125:aload           12
	//   61  127:invokevirtual   #569 <Method void BackStackRecord.setOnStartPostponedListener(Fragment$OnStartEnterTransitionListener)>
				if(flag1)
	//*  62  130:iload           10
	//*  63  132:ifeq            143
					backstackrecord.executeOps();
	//   64  135:aload           11
	//   65  137:invokevirtual   #369 <Method void BackStackRecord.executeOps()>
				else
	//*  66  140:goto            149
					backstackrecord.executePopOps(false);
	//   67  143:aload           11
	//   68  145:iconst_0        
	//   69  146:invokevirtual   #367 <Method void BackStackRecord.executePopOps(boolean)>
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
	//   79  165:invokevirtual   #442 <Method Object ArrayList.remove(int)>
	//   80  168:pop             
					arraylist.add(i1, ((Object) (backstackrecord)));
	//   81  169:aload_1         
	//   82  170:iload           8
	//   83  172:aload           11
	//   84  174:invokevirtual   #572 <Method void ArrayList.add(int, Object)>
				}
				addAddedFragments(arrayset);
	//   85  177:aload_0         
	//   86  178:aload           5
	//   87  180:invokespecial   #397 <Method void addAddedFragments(ArraySet)>
			}
			k--;
	//   88  183:iload           6
	//   89  185:iconst_1        
	//   90  186:isub            
	//   91  187:istore          6
			l = i1;
	//   92  189:iload           8
	//   93  191:istore          7
		}

	//*  94  193:goto            10
		return l;
	//   95  196:iload           7
	//   96  198:ireturn         
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
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag;
		boolean flag1;
		Exception exception;
		if(mPostponedTransactions != null && !mPostponedTransactions.isEmpty())
	//*   2    2:aload_0         
	//*   3    3:getfield        #418 <Field ArrayList mPostponedTransactions>
	//*   4    6:ifnull          84
	//*   5    9:aload_0         
	//*   6   10:getfield        #418 <Field ArrayList mPostponedTransactions>
	//*   7   13:invokevirtual   #455 <Method boolean ArrayList.isEmpty()>
	//*   8   16:ifne            84
			flag = true;
	//    9   19:iconst_1        
	//   10   20:istore_1        
		else
	//*  11   21:goto            24
	//*  12   24:aload_0         
	//*  13   25:getfield        #459 <Field ArrayList mPendingActions>
	//*  14   28:ifnull          89
	//*  15   31:aload_0         
	//*  16   32:getfield        #459 <Field ArrayList mPendingActions>
	//*  17   35:invokevirtual   #188 <Method int ArrayList.size()>
	//*  18   38:iconst_1        
	//*  19   39:icmpne          89
	//*  20   42:iconst_1        
	//*  21   43:istore_2        
	//*  22   44:goto            91
	//*  23   47:aload_0         
	//*  24   48:getfield        #337 <Field FragmentHostCallback mHost>
	//*  25   51:invokevirtual   #343 <Method Handler FragmentHostCallback.getHandler()>
	//*  26   54:aload_0         
	//*  27   55:getfield        #162 <Field Runnable mExecCommit>
	//*  28   58:invokevirtual   #466 <Method void Handler.removeCallbacks(Runnable)>
	//*  29   61:aload_0         
	//*  30   62:getfield        #337 <Field FragmentHostCallback mHost>
	//*  31   65:invokevirtual   #343 <Method Handler FragmentHostCallback.getHandler()>
	//*  32   68:aload_0         
	//*  33   69:getfield        #162 <Field Runnable mExecCommit>
	//*  34   72:invokevirtual   #579 <Method boolean Handler.post(Runnable)>
	//*  35   75:pop             
	//*  36   76:aload_0         
	//*  37   77:monitorexit     
	//*  38   78:return          
	//*  39   79:astore_3        
	//*  40   80:aload_0         
	//*  41   81:monitorexit     
	//*  42   82:aload_3         
	//*  43   83:athrow          
			flag = false;
	//   44   84:iconst_0        
	//   45   85:istore_1        
		if(mPendingActions != null && mPendingActions.size() == 1)
			flag1 = true;
		else
	//*  46   86:goto            24
			flag1 = false;
	//   47   89:iconst_0        
	//   48   90:istore_2        
		  goto _L1
_L2:
		mHost.getHandler().removeCallbacks(mExecCommit);
		mHost.getHandler().post(mExecCommit);
_L3:
		this;
		JVM INSTR monitorexit ;
		return;
		exception;
		throw exception;
_L1:
		if(!flag && !flag1) goto _L3; else goto _L2
	//   49   91:iload_1         
	//   50   92:ifne            47
	//   51   95:iload_2         
	//   52   96:ifeq            76
	//*  53   99:goto            47
	}

	private void setHWLayerAnimListenerIfAlpha(View view, Animation animation)
	{
		android.view.animation.Animation.AnimationListener animationlistener;
		if(view == null || animation == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          8
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       9
			return;
	//    4    8:return          
		if(!shouldRunOnHWLayer(view, animation))
			break MISSING_BLOCK_LABEL_111;
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokestatic    #589 <Method boolean shouldRunOnHWLayer(View, Animation)>
	//    8   14:ifeq            111
		animationlistener = null;
	//    9   17:aconst_null     
	//   10   18:astore_3        
		android.view.animation.Animation.AnimationListener animationlistener1;
		if(sAnimationListenerField == null)
	//*  11   19:getstatic       #129 <Field Field sAnimationListenerField>
	//*  12   22:ifnonnull       44
		{
			sAnimationListenerField = ((Class) (android/view/animation/Animation)).getDeclaredField("mListener");
	//   13   25:ldc2            #322 <Class Animation>
	//   14   28:ldc2            #591 <String "mListener">
	//   15   31:invokevirtual   #597 <Method Field Class.getDeclaredField(String)>
	//   16   34:putstatic       #129 <Field Field sAnimationListenerField>
			sAnimationListenerField.setAccessible(true);
	//   17   37:getstatic       #129 <Field Field sAnimationListenerField>
	//   18   40:iconst_1        
	//   19   41:invokevirtual   #602 <Method void Field.setAccessible(boolean)>
		}
		animationlistener1 = (android.view.animation.Animation.AnimationListener)sAnimationListenerField.get(((Object) (animation)));
	//   20   44:getstatic       #129 <Field Field sAnimationListenerField>
	//   21   47:aload_2         
	//   22   48:invokevirtual   #605 <Method Object Field.get(Object)>
	//   23   51:checkcast       #607 <Class android.view.animation.Animation$AnimationListener>
	//   24   54:astore          4
		animationlistener = animationlistener1;
	//   25   56:aload           4
	//   26   58:astore_3        
		break MISSING_BLOCK_LABEL_91;
	//   27   59:goto            91
		Object obj;
		obj;
	//   28   62:astore          4
		Log.e("FragmentManager", "No field with the name mListener is found in Animation class", ((Throwable) (obj)));
	//   29   64:ldc1            #55  <String "FragmentManager">
	//   30   66:ldc2            #609 <String "No field with the name mListener is found in Animation class">
	//   31   69:aload           4
	//   32   71:invokestatic    #615 <Method int Log.e(String, String, Throwable)>
	//   33   74:pop             
		break MISSING_BLOCK_LABEL_91;
	//   34   75:goto            91
		obj;
	//   35   78:astore          4
		Log.e("FragmentManager", "Cannot access Animation's mListener field", ((Throwable) (obj)));
	//   36   80:ldc1            #55  <String "FragmentManager">
	//   37   82:ldc2            #617 <String "Cannot access Animation's mListener field">
	//   38   85:aload           4
	//   39   87:invokestatic    #615 <Method int Log.e(String, String, Throwable)>
	//   40   90:pop             
		view.setLayerType(2, ((android.graphics.Paint) (null)));
	//   41   91:aload_1         
	//   42   92:iconst_2        
	//   43   93:aconst_null     
	//   44   94:invokevirtual   #621 <Method void View.setLayerType(int, android.graphics.Paint)>
		animation.setAnimationListener(((android.view.animation.Animation.AnimationListener) (new AnimateOnHWLayerIfNeededListener(view, animation, animationlistener))));
	//   45   97:aload_2         
	//   46   98:new             #12  <Class FragmentManagerImpl$AnimateOnHWLayerIfNeededListener>
	//   47  101:dup             
	//   48  102:aload_1         
	//   49  103:aload_2         
	//   50  104:aload_3         
	//   51  105:invokespecial   #624 <Method void FragmentManagerImpl$AnimateOnHWLayerIfNeededListener(View, Animation, android.view.animation.Animation$AnimationListener)>
	//   52  108:invokevirtual   #628 <Method void Animation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
	//   53  111:return          
	}

	static boolean shouldRunOnHWLayer(View view, Animation animation)
	{
		return android.os.Build.VERSION.SDK_INT >= 19 && view.getLayerType() == 0 && ViewCompat.hasOverlappingRendering(view) && modifiesAlpha(animation);
	//    0    0:getstatic       #125 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          19
	//    2    5:icmplt          31
	//    3    8:aload_0         
	//    4    9:invokevirtual   #631 <Method int View.getLayerType()>
	//    5   12:ifne            31
	//    6   15:aload_0         
	//    7   16:invokestatic    #637 <Method boolean ViewCompat.hasOverlappingRendering(View)>
	//    8   19:ifeq            31
	//    9   22:aload_1         
	//   10   23:invokestatic    #639 <Method boolean modifiesAlpha(Animation)>
	//   11   26:ifeq            31
	//   12   29:iconst_1        
	//   13   30:ireturn         
	//   14   31:iconst_0        
	//   15   32:ireturn         
	}

	private void throwException(RuntimeException runtimeexception)
	{
		Log.e("FragmentManager", runtimeexception.getMessage());
	//    0    0:ldc1            #55  <String "FragmentManager">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #648 <Method String RuntimeException.getMessage()>
	//    3    6:invokestatic    #651 <Method int Log.e(String, String)>
	//    4    9:pop             
		Log.e("FragmentManager", "Activity state:");
	//    5   10:ldc1            #55  <String "FragmentManager">
	//    6   12:ldc2            #653 <String "Activity state:">
	//    7   15:invokestatic    #651 <Method int Log.e(String, String)>
	//    8   18:pop             
		Object obj = ((Object) (new PrintWriter(((java.io.Writer) (new LogWriter("FragmentManager"))))));
	//    9   19:new             #655 <Class PrintWriter>
	//   10   22:dup             
	//   11   23:new             #657 <Class LogWriter>
	//   12   26:dup             
	//   13   27:ldc1            #55  <String "FragmentManager">
	//   14   29:invokespecial   #658 <Method void LogWriter(String)>
	//   15   32:invokespecial   #661 <Method void PrintWriter(java.io.Writer)>
	//   16   35:astore_2        
		if(mHost != null)
	//*  17   36:aload_0         
	//*  18   37:getfield        #337 <Field FragmentHostCallback mHost>
	//*  19   40:ifnull          76
			try
			{
				mHost.onDump("  ", ((FileDescriptor) (null)), ((PrintWriter) (obj)), new String[0]);
	//   20   43:aload_0         
	//   21   44:getfield        #337 <Field FragmentHostCallback mHost>
	//   22   47:ldc2            #663 <String "  ">
	//   23   50:aconst_null     
	//   24   51:aload_2         
	//   25   52:iconst_0        
	//   26   53:anewarray       String[]
	//   27   56:invokevirtual   #669 <Method void FragmentHostCallback.onDump(String, FileDescriptor, PrintWriter, String[])>
			}
	//*  28   59:goto            103
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  29   62:astore_2        
			{
				Log.e("FragmentManager", "Failed dumping state", ((Throwable) (obj)));
	//   30   63:ldc1            #55  <String "FragmentManager">
	//   31   65:ldc2            #671 <String "Failed dumping state">
	//   32   68:aload_2         
	//   33   69:invokestatic    #615 <Method int Log.e(String, String, Throwable)>
	//   34   72:pop             
			}
		else
	//*  35   73:goto            103
			try
			{
				dump("  ", ((FileDescriptor) (null)), ((PrintWriter) (obj)), new String[0]);
	//   36   76:aload_0         
	//   37   77:ldc2            #663 <String "  ">
	//   38   80:aconst_null     
	//   39   81:aload_2         
	//   40   82:iconst_0        
	//   41   83:anewarray       String[]
	//   42   86:invokevirtual   #674 <Method void dump(String, FileDescriptor, PrintWriter, String[])>
			}
	//*  43   89:goto            103
			catch(Exception exception)
	//*  44   92:astore_2        
			{
				Log.e("FragmentManager", "Failed dumping state", ((Throwable) (exception)));
	//   45   93:ldc1            #55  <String "FragmentManager">
	//   46   95:ldc2            #671 <String "Failed dumping state">
	//   47   98:aload_2         
	//   48   99:invokestatic    #615 <Method int Log.e(String, String, Throwable)>
	//   49  102:pop             
			}
		throw runtimeexception;
	//   50  103:aload_1         
	//   51  104:athrow          
	}

	public static int transitToStyleIndex(int i, boolean flag)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:lookupswitch    3: default 36
	//	               4097: 38
	//	               4099: 64
	//	               8194: 51
		default:
			return -1;
	//    2   36:iconst_m1       
	//    3   37:ireturn         

		case 4097: 
			if(flag)
	//*   4   38:iload_1         
	//*   5   39:ifeq            47
				i = 1;
	//    6   42:iconst_1        
	//    7   43:istore_0        
			else
	//*   8   44:goto            49
				i = 2;
	//    9   47:iconst_2        
	//   10   48:istore_0        
			return i;
	//   11   49:iload_0         
	//   12   50:ireturn         

		case 8194: 
			if(flag)
	//*  13   51:iload_1         
	//*  14   52:ifeq            60
				i = 3;
	//   15   55:iconst_3        
	//   16   56:istore_0        
			else
	//*  17   57:goto            62
				i = 4;
	//   18   60:iconst_4        
	//   19   61:istore_0        
			return i;
	//   20   62:iload_0         
	//   21   63:ireturn         

		case 4099: 
			break;
		}
		return !flag ? 6 : 5;
	//   22   64:iload_1         
	//   23   65:ifeq            70
	//   24   68:iconst_5        
	//   25   69:ireturn         
	//   26   70:bipush          6
	//   27   72:ireturn         
	}

	void addBackStackState(BackStackRecord backstackrecord)
	{
		if(mBackStack == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #680 <Field ArrayList mBackStack>
	//*   2    4:ifnonnull       18
			mBackStack = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #184 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #353 <Method void ArrayList()>
	//    7   15:putfield        #680 <Field ArrayList mBackStack>
		mBackStack.add(((Object) (backstackrecord)));
	//    8   18:aload_0         
	//    9   19:getfield        #680 <Field ArrayList mBackStack>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
	//   12   26:pop             
		reportBackStackChanged();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #416 <Method void reportBackStackChanged()>
	//   15   31:return          
	}

	public void addFragment(Fragment fragment, boolean flag)
	{
		if(mAdded == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #182 <Field ArrayList mAdded>
	//*   2    4:ifnonnull       18
			mAdded = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #184 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #353 <Method void ArrayList()>
	//    7   15:putfield        #182 <Field ArrayList mAdded>
		if(DEBUG)
	//*   8   18:getstatic       #120 <Field boolean DEBUG>
	//*   9   21:ifeq            50
			Log.v("FragmentManager", (new StringBuilder()).append("add: ").append(((Object) (fragment))).toString());
	//   10   24:ldc1            #55  <String "FragmentManager">
	//   11   26:new             #239 <Class StringBuilder>
	//   12   29:dup             
	//   13   30:invokespecial   #240 <Method void StringBuilder()>
	//   14   33:ldc2            #684 <String "add: ">
	//   15   36:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   16   39:aload_1         
	//   17   40:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//   18   43:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   19   46:invokestatic    #690 <Method int Log.v(String, String)>
	//   20   49:pop             
		makeActive(fragment);
	//   21   50:aload_0         
	//   22   51:aload_1         
	//   23   52:invokevirtual   #694 <Method void makeActive(Fragment)>
		if(!fragment.mDetached)
	//*  24   55:aload_1         
	//*  25   56:getfield        #697 <Field boolean Fragment.mDetached>
	//*  26   59:ifne            160
		{
			if(mAdded.contains(((Object) (fragment))))
	//*  27   62:aload_0         
	//*  28   63:getfield        #182 <Field ArrayList mAdded>
	//*  29   66:aload_1         
	//*  30   67:invokevirtual   #700 <Method boolean ArrayList.contains(Object)>
	//*  31   70:ifeq            101
				throw new IllegalStateException((new StringBuilder()).append("Fragment already added: ").append(((Object) (fragment))).toString());
	//   32   73:new             #230 <Class IllegalStateException>
	//   33   76:dup             
	//   34   77:new             #239 <Class StringBuilder>
	//   35   80:dup             
	//   36   81:invokespecial   #240 <Method void StringBuilder()>
	//   37   84:ldc2            #702 <String "Fragment already added: ">
	//   38   87:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   39   90:aload_1         
	//   40   91:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//   41   94:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   42   97:invokespecial   #235 <Method void IllegalStateException(String)>
	//   43  100:athrow          
			mAdded.add(((Object) (fragment)));
	//   44  101:aload_0         
	//   45  102:getfield        #182 <Field ArrayList mAdded>
	//   46  105:aload_1         
	//   47  106:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
	//   48  109:pop             
			fragment.mAdded = true;
	//   49  110:aload_1         
	//   50  111:iconst_1        
	//   51  112:putfield        #508 <Field boolean Fragment.mAdded>
			fragment.mRemoving = false;
	//   52  115:aload_1         
	//   53  116:iconst_0        
	//   54  117:putfield        #705 <Field boolean Fragment.mRemoving>
			if(fragment.mView == null)
	//*  55  120:aload_1         
	//*  56  121:getfield        #211 <Field View Fragment.mView>
	//*  57  124:ifnonnull       132
				fragment.mHiddenChanged = false;
	//   58  127:aload_1         
	//   59  128:iconst_0        
	//   60  129:putfield        #708 <Field boolean Fragment.mHiddenChanged>
			if(fragment.mHasMenu && fragment.mMenuVisible)
	//*  61  132:aload_1         
	//*  62  133:getfield        #711 <Field boolean Fragment.mHasMenu>
	//*  63  136:ifeq            151
	//*  64  139:aload_1         
	//*  65  140:getfield        #714 <Field boolean Fragment.mMenuVisible>
	//*  66  143:ifeq            151
				mNeedMenuInvalidate = true;
	//   67  146:aload_0         
	//   68  147:iconst_1        
	//   69  148:putfield        #716 <Field boolean mNeedMenuInvalidate>
			if(flag)
	//*  70  151:iload_2         
	//*  71  152:ifeq            160
				moveToState(fragment);
	//   72  155:aload_0         
	//   73  156:aload_1         
	//   74  157:invokevirtual   #718 <Method void moveToState(Fragment)>
		}
	//   75  160:return          
	}

	public void addOnBackStackChangedListener(FragmentManager.OnBackStackChangedListener onbackstackchangedlistener)
	{
		if(mBackStackChangeListeners == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #722 <Field ArrayList mBackStackChangeListeners>
	//*   2    4:ifnonnull       18
			mBackStackChangeListeners = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #184 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #353 <Method void ArrayList()>
	//    7   15:putfield        #722 <Field ArrayList mBackStackChangeListeners>
		mBackStackChangeListeners.add(((Object) (onbackstackchangedlistener)));
	//    8   18:aload_0         
	//    9   19:getfield        #722 <Field ArrayList mBackStackChangeListeners>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
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
	//    3    3:getfield        #726 <Field ArrayList mAvailBackStackIndices>
	//    4    6:ifnull          19
	//    5    9:aload_0         
	//    6   10:getfield        #726 <Field ArrayList mAvailBackStackIndices>
	//    7   13:invokevirtual   #188 <Method int ArrayList.size()>
	//    8   16:ifgt            100
		if(mBackStackIndices == null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #728 <Field ArrayList mBackStackIndices>
	//*  11   23:ifnonnull       37
			mBackStackIndices = new ArrayList();
	//   12   26:aload_0         
	//   13   27:new             #184 <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #353 <Method void ArrayList()>
	//   16   34:putfield        #728 <Field ArrayList mBackStackIndices>
		i = mBackStackIndices.size();
	//   17   37:aload_0         
	//   18   38:getfield        #728 <Field ArrayList mBackStackIndices>
	//   19   41:invokevirtual   #188 <Method int ArrayList.size()>
	//   20   44:istore_2        
		if(DEBUG)
	//*  21   45:getstatic       #120 <Field boolean DEBUG>
	//*  22   48:ifeq            87
			Log.v("FragmentManager", (new StringBuilder()).append("Setting back stack index ").append(i).append(" to ").append(((Object) (backstackrecord))).toString());
	//   23   51:ldc1            #55  <String "FragmentManager">
	//   24   53:new             #239 <Class StringBuilder>
	//   25   56:dup             
	//   26   57:invokespecial   #240 <Method void StringBuilder()>
	//   27   60:ldc2            #730 <String "Setting back stack index ">
	//   28   63:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   29   66:iload_2         
	//   30   67:invokevirtual   #733 <Method StringBuilder StringBuilder.append(int)>
	//   31   70:ldc2            #735 <String " to ">
	//   32   73:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   33   76:aload_1         
	//   34   77:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//   35   80:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   36   83:invokestatic    #690 <Method int Log.v(String, String)>
	//   37   86:pop             
		mBackStackIndices.add(((Object) (backstackrecord)));
	//   38   87:aload_0         
	//   39   88:getfield        #728 <Field ArrayList mBackStackIndices>
	//   40   91:aload_1         
	//   41   92:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
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
	//   48  101:getfield        #726 <Field ArrayList mAvailBackStackIndices>
	//   49  104:aload_0         
	//   50  105:getfield        #726 <Field ArrayList mAvailBackStackIndices>
	//   51  108:invokevirtual   #188 <Method int ArrayList.size()>
	//   52  111:iconst_1        
	//   53  112:isub            
	//   54  113:invokevirtual   #442 <Method Object ArrayList.remove(int)>
	//   55  116:checkcast       #737 <Class Integer>
	//   56  119:invokevirtual   #740 <Method int Integer.intValue()>
	//   57  122:istore_2        
		if(DEBUG)
	//*  58  123:getstatic       #120 <Field boolean DEBUG>
	//*  59  126:ifeq            165
			Log.v("FragmentManager", (new StringBuilder()).append("Adding back stack index ").append(i).append(" with ").append(((Object) (backstackrecord))).toString());
	//   60  129:ldc1            #55  <String "FragmentManager">
	//   61  131:new             #239 <Class StringBuilder>
	//   62  134:dup             
	//   63  135:invokespecial   #240 <Method void StringBuilder()>
	//   64  138:ldc2            #742 <String "Adding back stack index ">
	//   65  141:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   66  144:iload_2         
	//   67  145:invokevirtual   #733 <Method StringBuilder StringBuilder.append(int)>
	//   68  148:ldc2            #744 <String " with ">
	//   69  151:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   70  154:aload_1         
	//   71  155:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//   72  158:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   73  161:invokestatic    #690 <Method int Log.v(String, String)>
	//   74  164:pop             
		mBackStackIndices.set(i, ((Object) (backstackrecord)));
	//   75  165:aload_0         
	//   76  166:getfield        #728 <Field ArrayList mBackStackIndices>
	//   77  169:iload_2         
	//   78  170:aload_1         
	//   79  171:invokevirtual   #748 <Method Object ArrayList.set(int, Object)>
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
	//*  86  180:aload_0         
		throw backstackrecord;
	//   87  181:monitorexit     
	//   88  182:aload_1         
	//   89  183:athrow          
	}

	public void attachController(FragmentHostCallback fragmenthostcallback, FragmentContainer fragmentcontainer, Fragment fragment)
	{
		if(mHost != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #337 <Field FragmentHostCallback mHost>
	//*   2    4:ifnull          18
		{
			throw new IllegalStateException("Already attached");
	//    3    7:new             #230 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #752 <String "Already attached">
	//    6   14:invokespecial   #235 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			mHost = fragmenthostcallback;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #337 <Field FragmentHostCallback mHost>
			mContainer = fragmentcontainer;
	//   11   23:aload_0         
	//   12   24:aload_2         
	//   13   25:putfield        #754 <Field FragmentContainer mContainer>
			mParent = fragment;
	//   14   28:aload_0         
	//   15   29:aload_3         
	//   16   30:putfield        #756 <Field Fragment mParent>
			return;
	//   17   33:return          
		}
	}

	public void attachFragment(Fragment fragment)
	{
		if(DEBUG)
	//*   0    0:getstatic       #120 <Field boolean DEBUG>
	//*   1    3:ifeq            32
			Log.v("FragmentManager", (new StringBuilder()).append("attach: ").append(((Object) (fragment))).toString());
	//    2    6:ldc1            #55  <String "FragmentManager">
	//    3    8:new             #239 <Class StringBuilder>
	//    4   11:dup             
	//    5   12:invokespecial   #240 <Method void StringBuilder()>
	//    6   15:ldc2            #759 <String "attach: ">
	//    7   18:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//    8   21:aload_1         
	//    9   22:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//   10   25:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   11   28:invokestatic    #690 <Method int Log.v(String, String)>
	//   12   31:pop             
		if(fragment.mDetached)
	//*  13   32:aload_1         
	//*  14   33:getfield        #697 <Field boolean Fragment.mDetached>
	//*  15   36:ifeq            173
		{
			fragment.mDetached = false;
	//   16   39:aload_1         
	//   17   40:iconst_0        
	//   18   41:putfield        #697 <Field boolean Fragment.mDetached>
			if(!fragment.mAdded)
	//*  19   44:aload_1         
	//*  20   45:getfield        #508 <Field boolean Fragment.mAdded>
	//*  21   48:ifne            173
			{
				if(mAdded == null)
	//*  22   51:aload_0         
	//*  23   52:getfield        #182 <Field ArrayList mAdded>
	//*  24   55:ifnonnull       69
					mAdded = new ArrayList();
	//   25   58:aload_0         
	//   26   59:new             #184 <Class ArrayList>
	//   27   62:dup             
	//   28   63:invokespecial   #353 <Method void ArrayList()>
	//   29   66:putfield        #182 <Field ArrayList mAdded>
				if(mAdded.contains(((Object) (fragment))))
	//*  30   69:aload_0         
	//*  31   70:getfield        #182 <Field ArrayList mAdded>
	//*  32   73:aload_1         
	//*  33   74:invokevirtual   #700 <Method boolean ArrayList.contains(Object)>
	//*  34   77:ifeq            108
					throw new IllegalStateException((new StringBuilder()).append("Fragment already added: ").append(((Object) (fragment))).toString());
	//   35   80:new             #230 <Class IllegalStateException>
	//   36   83:dup             
	//   37   84:new             #239 <Class StringBuilder>
	//   38   87:dup             
	//   39   88:invokespecial   #240 <Method void StringBuilder()>
	//   40   91:ldc2            #702 <String "Fragment already added: ">
	//   41   94:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   42   97:aload_1         
	//   43   98:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//   44  101:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   45  104:invokespecial   #235 <Method void IllegalStateException(String)>
	//   46  107:athrow          
				if(DEBUG)
	//*  47  108:getstatic       #120 <Field boolean DEBUG>
	//*  48  111:ifeq            140
					Log.v("FragmentManager", (new StringBuilder()).append("add from attach: ").append(((Object) (fragment))).toString());
	//   49  114:ldc1            #55  <String "FragmentManager">
	//   50  116:new             #239 <Class StringBuilder>
	//   51  119:dup             
	//   52  120:invokespecial   #240 <Method void StringBuilder()>
	//   53  123:ldc2            #761 <String "add from attach: ">
	//   54  126:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   55  129:aload_1         
	//   56  130:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//   57  133:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   58  136:invokestatic    #690 <Method int Log.v(String, String)>
	//   59  139:pop             
				mAdded.add(((Object) (fragment)));
	//   60  140:aload_0         
	//   61  141:getfield        #182 <Field ArrayList mAdded>
	//   62  144:aload_1         
	//   63  145:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
	//   64  148:pop             
				fragment.mAdded = true;
	//   65  149:aload_1         
	//   66  150:iconst_1        
	//   67  151:putfield        #508 <Field boolean Fragment.mAdded>
				if(fragment.mHasMenu && fragment.mMenuVisible)
	//*  68  154:aload_1         
	//*  69  155:getfield        #711 <Field boolean Fragment.mHasMenu>
	//*  70  158:ifeq            173
	//*  71  161:aload_1         
	//*  72  162:getfield        #714 <Field boolean Fragment.mMenuVisible>
	//*  73  165:ifeq            173
					mNeedMenuInvalidate = true;
	//   74  168:aload_0         
	//   75  169:iconst_1        
	//   76  170:putfield        #716 <Field boolean mNeedMenuInvalidate>
			}
		}
	//   77  173:return          
	}

	public FragmentTransaction beginTransaction()
	{
		return ((FragmentTransaction) (new BackStackRecord(this)));
	//    0    0:new             #290 <Class BackStackRecord>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #764 <Method void BackStackRecord(FragmentManagerImpl)>
	//    4    8:areturn         
	}

	void completeShowHideFragment(Fragment fragment)
	{
		if(fragment.mView != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #211 <Field View Fragment.mView>
	//*   2    4:ifnull          120
		{
			int i = fragment.getNextTransition();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #203 <Method int Fragment.getNextTransition()>
	//    5   11:istore_2        
			boolean flag;
			if(!fragment.mHidden)
	//*   6   12:aload_1         
	//*   7   13:getfield        #214 <Field boolean Fragment.mHidden>
	//*   8   16:ifne            24
				flag = true;
	//    9   19:iconst_1        
	//   10   20:istore_3        
			else
	//*  11   21:goto            26
				flag = false;
	//   12   24:iconst_0        
	//   13   25:istore_3        
			Animation animation = loadAnimation(fragment, i, flag, fragment.getNextTransitionStyle());
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:iload_2         
	//   17   29:iload_3         
	//   18   30:aload_1         
	//   19   31:invokevirtual   #768 <Method int Fragment.getNextTransitionStyle()>
	//   20   34:invokevirtual   #772 <Method Animation loadAnimation(Fragment, int, boolean, int)>
	//   21   37:astore          4
			if(animation != null)
	//*  22   39:aload           4
	//*  23   41:ifnull          78
			{
				setHWLayerAnimListenerIfAlpha(fragment.mView, animation);
	//   24   44:aload_0         
	//   25   45:aload_1         
	//   26   46:getfield        #211 <Field View Fragment.mView>
	//   27   49:aload           4
	//   28   51:invokespecial   #774 <Method void setHWLayerAnimListenerIfAlpha(View, Animation)>
				fragment.mView.startAnimation(animation);
	//   29   54:aload_1         
	//   30   55:getfield        #211 <Field View Fragment.mView>
	//   31   58:aload           4
	//   32   60:invokevirtual   #777 <Method void View.startAnimation(Animation)>
				setHWLayerAnimListenerIfAlpha(fragment.mView, animation);
	//   33   63:aload_0         
	//   34   64:aload_1         
	//   35   65:getfield        #211 <Field View Fragment.mView>
	//   36   68:aload           4
	//   37   70:invokespecial   #774 <Method void setHWLayerAnimListenerIfAlpha(View, Animation)>
				animation.start();
	//   38   73:aload           4
	//   39   75:invokevirtual   #780 <Method void Animation.start()>
			}
			if(fragment.mHidden && !fragment.isHideReplaced())
	//*  40   78:aload_1         
	//*  41   79:getfield        #214 <Field boolean Fragment.mHidden>
	//*  42   82:ifeq            98
	//*  43   85:aload_1         
	//*  44   86:invokevirtual   #783 <Method boolean Fragment.isHideReplaced()>
	//*  45   89:ifne            98
				i = 8;
	//   46   92:bipush          8
	//   47   94:istore_2        
			else
	//*  48   95:goto            100
				i = 0;
	//   49   98:iconst_0        
	//   50   99:istore_2        
			fragment.mView.setVisibility(i);
	//   51  100:aload_1         
	//   52  101:getfield        #211 <Field View Fragment.mView>
	//   53  104:iload_2         
	//   54  105:invokevirtual   #514 <Method void View.setVisibility(int)>
			if(fragment.isHideReplaced())
	//*  55  108:aload_1         
	//*  56  109:invokevirtual   #783 <Method boolean Fragment.isHideReplaced()>
	//*  57  112:ifeq            120
				fragment.setHideReplaced(false);
	//   58  115:aload_1         
	//   59  116:iconst_0        
	//   60  117:invokevirtual   #786 <Method void Fragment.setHideReplaced(boolean)>
		}
		if(fragment.mAdded && fragment.mHasMenu && fragment.mMenuVisible)
	//*  61  120:aload_1         
	//*  62  121:getfield        #508 <Field boolean Fragment.mAdded>
	//*  63  124:ifeq            146
	//*  64  127:aload_1         
	//*  65  128:getfield        #711 <Field boolean Fragment.mHasMenu>
	//*  66  131:ifeq            146
	//*  67  134:aload_1         
	//*  68  135:getfield        #714 <Field boolean Fragment.mMenuVisible>
	//*  69  138:ifeq            146
			mNeedMenuInvalidate = true;
	//   70  141:aload_0         
	//   71  142:iconst_1        
	//   72  143:putfield        #716 <Field boolean mNeedMenuInvalidate>
		fragment.mHiddenChanged = false;
	//   73  146:aload_1         
	//   74  147:iconst_0        
	//   75  148:putfield        #708 <Field boolean Fragment.mHiddenChanged>
		fragment.onHiddenChanged(fragment.mHidden);
	//   76  151:aload_1         
	//   77  152:aload_1         
	//   78  153:getfield        #214 <Field boolean Fragment.mHidden>
	//   79  156:invokevirtual   #789 <Method void Fragment.onHiddenChanged(boolean)>
	//   80  159:return          
	}

	public void detachFragment(Fragment fragment)
	{
		if(DEBUG)
	//*   0    0:getstatic       #120 <Field boolean DEBUG>
	//*   1    3:ifeq            32
			Log.v("FragmentManager", (new StringBuilder()).append("detach: ").append(((Object) (fragment))).toString());
	//    2    6:ldc1            #55  <String "FragmentManager">
	//    3    8:new             #239 <Class StringBuilder>
	//    4   11:dup             
	//    5   12:invokespecial   #240 <Method void StringBuilder()>
	//    6   15:ldc2            #792 <String "detach: ">
	//    7   18:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//    8   21:aload_1         
	//    9   22:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//   10   25:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   11   28:invokestatic    #690 <Method int Log.v(String, String)>
	//   12   31:pop             
		if(!fragment.mDetached)
	//*  13   32:aload_1         
	//*  14   33:getfield        #697 <Field boolean Fragment.mDetached>
	//*  15   36:ifne            123
		{
			fragment.mDetached = true;
	//   16   39:aload_1         
	//   17   40:iconst_1        
	//   18   41:putfield        #697 <Field boolean Fragment.mDetached>
			if(fragment.mAdded)
	//*  19   44:aload_1         
	//*  20   45:getfield        #508 <Field boolean Fragment.mAdded>
	//*  21   48:ifeq            123
			{
				if(mAdded != null)
	//*  22   51:aload_0         
	//*  23   52:getfield        #182 <Field ArrayList mAdded>
	//*  24   55:ifnull          99
				{
					if(DEBUG)
	//*  25   58:getstatic       #120 <Field boolean DEBUG>
	//*  26   61:ifeq            90
						Log.v("FragmentManager", (new StringBuilder()).append("remove from detach: ").append(((Object) (fragment))).toString());
	//   27   64:ldc1            #55  <String "FragmentManager">
	//   28   66:new             #239 <Class StringBuilder>
	//   29   69:dup             
	//   30   70:invokespecial   #240 <Method void StringBuilder()>
	//   31   73:ldc2            #794 <String "remove from detach: ">
	//   32   76:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   33   79:aload_1         
	//   34   80:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//   35   83:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   36   86:invokestatic    #690 <Method int Log.v(String, String)>
	//   37   89:pop             
					mAdded.remove(((Object) (fragment)));
	//   38   90:aload_0         
	//   39   91:getfield        #182 <Field ArrayList mAdded>
	//   40   94:aload_1         
	//   41   95:invokevirtual   #796 <Method boolean ArrayList.remove(Object)>
	//   42   98:pop             
				}
				if(fragment.mHasMenu && fragment.mMenuVisible)
	//*  43   99:aload_1         
	//*  44  100:getfield        #711 <Field boolean Fragment.mHasMenu>
	//*  45  103:ifeq            118
	//*  46  106:aload_1         
	//*  47  107:getfield        #714 <Field boolean Fragment.mMenuVisible>
	//*  48  110:ifeq            118
					mNeedMenuInvalidate = true;
	//   49  113:aload_0         
	//   50  114:iconst_1        
	//   51  115:putfield        #716 <Field boolean mNeedMenuInvalidate>
				fragment.mAdded = false;
	//   52  118:aload_1         
	//   53  119:iconst_0        
	//   54  120:putfield        #508 <Field boolean Fragment.mAdded>
			}
		}
	//   55  123:return          
	}

	public void dispatchActivityCreated()
	{
		mStateSaved = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #228 <Field boolean mStateSaved>
		mExecutingActions = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #253 <Field boolean mExecutingActions>
		moveToState(2, false);
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #283 <Method void moveToState(int, boolean)>
		mExecutingActions = false;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #253 <Field boolean mExecutingActions>
	//   13   21:return          
	}

	public void dispatchConfigurationChanged(Configuration configuration)
	{
		if(mAdded != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #182 <Field ArrayList mAdded>
	//*   2    4:ifnull          48
		{
			for(int i = 0; i < mAdded.size(); i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_2        
	//*   5    9:iload_2         
	//*   6   10:aload_0         
	//*   7   11:getfield        #182 <Field ArrayList mAdded>
	//*   8   14:invokevirtual   #188 <Method int ArrayList.size()>
	//*   9   17:icmpge          48
			{
				Fragment fragment = (Fragment)mAdded.get(i);
	//   10   20:aload_0         
	//   11   21:getfield        #182 <Field ArrayList mAdded>
	//   12   24:iload_2         
	//   13   25:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   14   28:checkcast       #194 <Class Fragment>
	//   15   31:astore_3        
				if(fragment != null)
	//*  16   32:aload_3         
	//*  17   33:ifnull          41
					fragment.performConfigurationChanged(configuration);
	//   18   36:aload_3         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #802 <Method void Fragment.performConfigurationChanged(Configuration)>
			}

	//   21   41:iload_2         
	//   22   42:iconst_1        
	//   23   43:iadd            
	//   24   44:istore_2        
		}
	//*  25   45:goto            9
	//   26   48:return          
	}

	public boolean dispatchContextItemSelected(MenuItem menuitem)
	{
		if(mAdded != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #182 <Field ArrayList mAdded>
	//*   2    4:ifnull          53
		{
			for(int i = 0; i < mAdded.size(); i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_2        
	//*   5    9:iload_2         
	//*   6   10:aload_0         
	//*   7   11:getfield        #182 <Field ArrayList mAdded>
	//*   8   14:invokevirtual   #188 <Method int ArrayList.size()>
	//*   9   17:icmpge          53
			{
				Fragment fragment = (Fragment)mAdded.get(i);
	//   10   20:aload_0         
	//   11   21:getfield        #182 <Field ArrayList mAdded>
	//   12   24:iload_2         
	//   13   25:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   14   28:checkcast       #194 <Class Fragment>
	//   15   31:astore_3        
				if(fragment != null && fragment.performContextItemSelected(menuitem))
	//*  16   32:aload_3         
	//*  17   33:ifnull          46
	//*  18   36:aload_3         
	//*  19   37:aload_1         
	//*  20   38:invokevirtual   #807 <Method boolean Fragment.performContextItemSelected(MenuItem)>
	//*  21   41:ifeq            46
					return true;
	//   22   44:iconst_1        
	//   23   45:ireturn         
			}

	//   24   46:iload_2         
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore_2        
		}
	//*  28   50:goto            9
		return false;
	//   29   53:iconst_0        
	//   30   54:ireturn         
	}

	public void dispatchCreate()
	{
		mStateSaved = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #228 <Field boolean mStateSaved>
		mExecutingActions = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #253 <Field boolean mExecutingActions>
		moveToState(1, false);
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #283 <Method void moveToState(int, boolean)>
		mExecutingActions = false;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #253 <Field boolean mExecutingActions>
	//   13   21:return          
	}

	public boolean dispatchCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		boolean flag = false;
	//    2    3:iconst_0        
	//    3    4:istore          4
		ArrayList arraylist1 = null;
	//    4    6:aconst_null     
	//    5    7:astore          7
		ArrayList arraylist = null;
	//    6    9:aconst_null     
	//    7   10:astore          6
		if(mAdded != null)
	//*   8   12:aload_0         
	//*   9   13:getfield        #182 <Field ArrayList mAdded>
	//*  10   16:ifnull          128
		{
			int i = 0;
	//   11   19:iconst_0        
	//   12   20:istore_3        
			do
			{
				flag1 = flag;
	//   13   21:iload           4
	//   14   23:istore          5
				arraylist1 = arraylist;
	//   15   25:aload           6
	//   16   27:astore          7
				if(i >= mAdded.size())
					break;
	//   17   29:iload_3         
	//   18   30:aload_0         
	//   19   31:getfield        #182 <Field ArrayList mAdded>
	//   20   34:invokevirtual   #188 <Method int ArrayList.size()>
	//   21   37:icmpge          128
				Fragment fragment = (Fragment)mAdded.get(i);
	//   22   40:aload_0         
	//   23   41:getfield        #182 <Field ArrayList mAdded>
	//   24   44:iload_3         
	//   25   45:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   26   48:checkcast       #194 <Class Fragment>
	//   27   51:astore          8
				flag1 = flag;
	//   28   53:iload           4
	//   29   55:istore          5
				arraylist1 = arraylist;
	//   30   57:aload           6
	//   31   59:astore          7
				if(fragment != null)
	//*  32   61:aload           8
	//*  33   63:ifnull          113
				{
					flag1 = flag;
	//   34   66:iload           4
	//   35   68:istore          5
					arraylist1 = arraylist;
	//   36   70:aload           6
	//   37   72:astore          7
					if(fragment.performCreateOptionsMenu(menu, menuinflater))
	//*  38   74:aload           8
	//*  39   76:aload_1         
	//*  40   77:aload_2         
	//*  41   78:invokevirtual   #813 <Method boolean Fragment.performCreateOptionsMenu(Menu, MenuInflater)>
	//*  42   81:ifeq            113
					{
						flag1 = true;
	//   43   84:iconst_1        
	//   44   85:istore          5
						arraylist1 = arraylist;
	//   45   87:aload           6
	//   46   89:astore          7
						if(arraylist == null)
	//*  47   91:aload           6
	//*  48   93:ifnonnull       105
							arraylist1 = new ArrayList();
	//   49   96:new             #184 <Class ArrayList>
	//   50   99:dup             
	//   51  100:invokespecial   #353 <Method void ArrayList()>
	//   52  103:astore          7
						arraylist1.add(((Object) (fragment)));
	//   53  105:aload           7
	//   54  107:aload           8
	//   55  109:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
	//   56  112:pop             
					}
				}
				i++;
	//   57  113:iload_3         
	//   58  114:iconst_1        
	//   59  115:iadd            
	//   60  116:istore_3        
				flag = flag1;
	//   61  117:iload           5
	//   62  119:istore          4
				arraylist = arraylist1;
	//   63  121:aload           7
	//   64  123:astore          6
			} while(true);
	//   65  125:goto            21
		}
		if(mCreatedMenus != null)
	//*  66  128:aload_0         
	//*  67  129:getfield        #815 <Field ArrayList mCreatedMenus>
	//*  68  132:ifnull          185
		{
			for(int j = 0; j < mCreatedMenus.size(); j++)
	//*  69  135:iconst_0        
	//*  70  136:istore_3        
	//*  71  137:iload_3         
	//*  72  138:aload_0         
	//*  73  139:getfield        #815 <Field ArrayList mCreatedMenus>
	//*  74  142:invokevirtual   #188 <Method int ArrayList.size()>
	//*  75  145:icmpge          185
			{
				menu = ((Menu) ((Fragment)mCreatedMenus.get(j)));
	//   76  148:aload_0         
	//   77  149:getfield        #815 <Field ArrayList mCreatedMenus>
	//   78  152:iload_3         
	//   79  153:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   80  156:checkcast       #194 <Class Fragment>
	//   81  159:astore_1        
				if(arraylist1 == null || !arraylist1.contains(((Object) (menu))))
	//*  82  160:aload           7
	//*  83  162:ifnull          174
	//*  84  165:aload           7
	//*  85  167:aload_1         
	//*  86  168:invokevirtual   #700 <Method boolean ArrayList.contains(Object)>
	//*  87  171:ifne            178
					((Fragment) (menu)).onDestroyOptionsMenu();
	//   88  174:aload_1         
	//   89  175:invokevirtual   #818 <Method void Fragment.onDestroyOptionsMenu()>
			}

	//   90  178:iload_3         
	//   91  179:iconst_1        
	//   92  180:iadd            
	//   93  181:istore_3        
		}
	//*  94  182:goto            137
		mCreatedMenus = arraylist1;
	//   95  185:aload_0         
	//   96  186:aload           7
	//   97  188:putfield        #815 <Field ArrayList mCreatedMenus>
		return flag1;
	//   98  191:iload           5
	//   99  193:ireturn         
	}

	public void dispatchDestroy()
	{
		mDestroyed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #821 <Field boolean mDestroyed>
		execPendingActions();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #538 <Method boolean execPendingActions()>
	//    5    9:pop             
		mExecutingActions = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #253 <Field boolean mExecutingActions>
		moveToState(0, false);
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:iconst_0        
	//   12   18:invokevirtual   #283 <Method void moveToState(int, boolean)>
		mExecutingActions = false;
	//   13   21:aload_0         
	//   14   22:iconst_0        
	//   15   23:putfield        #253 <Field boolean mExecutingActions>
		mHost = null;
	//   16   26:aload_0         
	//   17   27:aconst_null     
	//   18   28:putfield        #337 <Field FragmentHostCallback mHost>
		mContainer = null;
	//   19   31:aload_0         
	//   20   32:aconst_null     
	//   21   33:putfield        #754 <Field FragmentContainer mContainer>
		mParent = null;
	//   22   36:aload_0         
	//   23   37:aconst_null     
	//   24   38:putfield        #756 <Field Fragment mParent>
	//   25   41:return          
	}

	public void dispatchDestroyView()
	{
		mExecutingActions = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #253 <Field boolean mExecutingActions>
		moveToState(1, false);
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #283 <Method void moveToState(int, boolean)>
		mExecutingActions = false;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #253 <Field boolean mExecutingActions>
	//   10   16:return          
	}

	public void dispatchLowMemory()
	{
		if(mAdded != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #182 <Field ArrayList mAdded>
	//*   2    4:ifnull          47
		{
			for(int i = 0; i < mAdded.size(); i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_1        
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #182 <Field ArrayList mAdded>
	//*   8   14:invokevirtual   #188 <Method int ArrayList.size()>
	//*   9   17:icmpge          47
			{
				Fragment fragment = (Fragment)mAdded.get(i);
	//   10   20:aload_0         
	//   11   21:getfield        #182 <Field ArrayList mAdded>
	//   12   24:iload_1         
	//   13   25:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   14   28:checkcast       #194 <Class Fragment>
	//   15   31:astore_2        
				if(fragment != null)
	//*  16   32:aload_2         
	//*  17   33:ifnull          40
					fragment.performLowMemory();
	//   18   36:aload_2         
	//   19   37:invokevirtual   #826 <Method void Fragment.performLowMemory()>
			}

	//   20   40:iload_1         
	//   21   41:iconst_1        
	//   22   42:iadd            
	//   23   43:istore_1        
		}
	//*  24   44:goto            9
	//   25   47:return          
	}

	public void dispatchMultiWindowModeChanged(boolean flag)
	{
		if(mAdded == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #182 <Field ArrayList mAdded>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		for(int i = mAdded.size() - 1; i >= 0; i--)
	//*   4    8:aload_0         
	//*   5    9:getfield        #182 <Field ArrayList mAdded>
	//*   6   12:invokevirtual   #188 <Method int ArrayList.size()>
	//*   7   15:iconst_1        
	//*   8   16:isub            
	//*   9   17:istore_2        
	//*  10   18:iload_2         
	//*  11   19:iflt            50
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//   12   22:aload_0         
	//   13   23:getfield        #182 <Field ArrayList mAdded>
	//   14   26:iload_2         
	//   15   27:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   16   30:checkcast       #194 <Class Fragment>
	//   17   33:astore_3        
			if(fragment != null)
	//*  18   34:aload_3         
	//*  19   35:ifnull          43
				fragment.performMultiWindowModeChanged(flag);
	//   20   38:aload_3         
	//   21   39:iload_1         
	//   22   40:invokevirtual   #830 <Method void Fragment.performMultiWindowModeChanged(boolean)>
		}

	//   23   43:iload_2         
	//   24   44:iconst_1        
	//   25   45:isub            
	//   26   46:istore_2        
	//*  27   47:goto            18
	//   28   50:return          
	}

	void dispatchOnFragmentActivityCreated(Fragment fragment, Bundle bundle, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #756 <Field Fragment mParent>
	//*   2    4:ifnull          35
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #756 <Field Fragment mParent>
	//    5   11:invokevirtual   #835 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   15   32:invokevirtual   #837 <Method void dispatchOnFragmentActivityCreated(Fragment, Bundle, boolean)>
		}
		if(mLifecycleCallbacks == null)
	//*  16   35:aload_0         
	//*  17   36:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//*  18   39:ifnonnull       43
			return;
	//   19   42:return          
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   20   43:aload_0         
	//   21   44:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   22   47:invokevirtual   #845 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   23   50:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   24   52:aload           4
	//   25   54:invokeinterface #850 <Method boolean Iterator.hasNext()>
	//   26   59:ifeq            109
			Pair pair = (Pair)iterator.next();
	//   27   62:aload           4
	//   28   64:invokeinterface #854 <Method Object Iterator.next()>
	//   29   69:checkcast       #856 <Class Pair>
	//   30   72:astore          5
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  31   74:iload_3         
	//*  32   75:ifeq            92
	//*  33   78:aload           5
	//*  34   80:getfield        #860 <Field Object Pair.second>
	//*  35   83:checkcast       #266 <Class Boolean>
	//*  36   86:invokevirtual   #361 <Method boolean Boolean.booleanValue()>
	//*  37   89:ifeq            106
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentActivityCreated(((FragmentManager) (this)), fragment, bundle);
	//   38   92:aload           5
	//   39   94:getfield        #863 <Field Object Pair.first>
	//   40   97:checkcast       #865 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   41  100:aload_0         
	//   42  101:aload_1         
	//   43  102:aload_2         
	//   44  103:invokevirtual   #869 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentActivityCreated(FragmentManager, Fragment, Bundle)>
		} while(true);
	//   45  106:goto            52
	//   46  109:return          
	}

	void dispatchOnFragmentAttached(Fragment fragment, Context context, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #756 <Field Fragment mParent>
	//*   2    4:ifnull          35
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #756 <Field Fragment mParent>
	//    5   11:invokevirtual   #835 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   15   32:invokevirtual   #873 <Method void dispatchOnFragmentAttached(Fragment, Context, boolean)>
		}
		if(mLifecycleCallbacks == null)
	//*  16   35:aload_0         
	//*  17   36:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//*  18   39:ifnonnull       43
			return;
	//   19   42:return          
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   20   43:aload_0         
	//   21   44:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   22   47:invokevirtual   #845 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   23   50:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   24   52:aload           4
	//   25   54:invokeinterface #850 <Method boolean Iterator.hasNext()>
	//   26   59:ifeq            109
			Pair pair = (Pair)iterator.next();
	//   27   62:aload           4
	//   28   64:invokeinterface #854 <Method Object Iterator.next()>
	//   29   69:checkcast       #856 <Class Pair>
	//   30   72:astore          5
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  31   74:iload_3         
	//*  32   75:ifeq            92
	//*  33   78:aload           5
	//*  34   80:getfield        #860 <Field Object Pair.second>
	//*  35   83:checkcast       #266 <Class Boolean>
	//*  36   86:invokevirtual   #361 <Method boolean Boolean.booleanValue()>
	//*  37   89:ifeq            106
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentAttached(((FragmentManager) (this)), fragment, context);
	//   38   92:aload           5
	//   39   94:getfield        #863 <Field Object Pair.first>
	//   40   97:checkcast       #865 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   41  100:aload_0         
	//   42  101:aload_1         
	//   43  102:aload_2         
	//   44  103:invokevirtual   #877 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentAttached(FragmentManager, Fragment, Context)>
		} while(true);
	//   45  106:goto            52
	//   46  109:return          
	}

	void dispatchOnFragmentCreated(Fragment fragment, Bundle bundle, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #756 <Field Fragment mParent>
	//*   2    4:ifnull          35
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #756 <Field Fragment mParent>
	//    5   11:invokevirtual   #835 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   15   32:invokevirtual   #880 <Method void dispatchOnFragmentCreated(Fragment, Bundle, boolean)>
		}
		if(mLifecycleCallbacks == null)
	//*  16   35:aload_0         
	//*  17   36:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//*  18   39:ifnonnull       43
			return;
	//   19   42:return          
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   20   43:aload_0         
	//   21   44:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   22   47:invokevirtual   #845 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   23   50:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   24   52:aload           4
	//   25   54:invokeinterface #850 <Method boolean Iterator.hasNext()>
	//   26   59:ifeq            109
			Pair pair = (Pair)iterator.next();
	//   27   62:aload           4
	//   28   64:invokeinterface #854 <Method Object Iterator.next()>
	//   29   69:checkcast       #856 <Class Pair>
	//   30   72:astore          5
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  31   74:iload_3         
	//*  32   75:ifeq            92
	//*  33   78:aload           5
	//*  34   80:getfield        #860 <Field Object Pair.second>
	//*  35   83:checkcast       #266 <Class Boolean>
	//*  36   86:invokevirtual   #361 <Method boolean Boolean.booleanValue()>
	//*  37   89:ifeq            106
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentCreated(((FragmentManager) (this)), fragment, bundle);
	//   38   92:aload           5
	//   39   94:getfield        #863 <Field Object Pair.first>
	//   40   97:checkcast       #865 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   41  100:aload_0         
	//   42  101:aload_1         
	//   43  102:aload_2         
	//   44  103:invokevirtual   #883 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentCreated(FragmentManager, Fragment, Bundle)>
		} while(true);
	//   45  106:goto            52
	//   46  109:return          
	}

	void dispatchOnFragmentDestroyed(Fragment fragment, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #756 <Field Fragment mParent>
	//*   2    4:ifnull          31
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #756 <Field Fragment mParent>
	//    5   11:invokevirtual   #835 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   14   28:invokevirtual   #886 <Method void dispatchOnFragmentDestroyed(Fragment, boolean)>
		}
		if(mLifecycleCallbacks == null)
	//*  15   31:aload_0         
	//*  16   32:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//*  17   35:ifnonnull       39
			return;
	//   18   38:return          
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   19   39:aload_0         
	//   20   40:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   21   43:invokevirtual   #845 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   22   46:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   23   47:aload_3         
	//   24   48:invokeinterface #850 <Method boolean Iterator.hasNext()>
	//   25   53:ifeq            101
			Pair pair = (Pair)iterator.next();
	//   26   56:aload_3         
	//   27   57:invokeinterface #854 <Method Object Iterator.next()>
	//   28   62:checkcast       #856 <Class Pair>
	//   29   65:astore          4
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  30   67:iload_2         
	//*  31   68:ifeq            85
	//*  32   71:aload           4
	//*  33   73:getfield        #860 <Field Object Pair.second>
	//*  34   76:checkcast       #266 <Class Boolean>
	//*  35   79:invokevirtual   #361 <Method boolean Boolean.booleanValue()>
	//*  36   82:ifeq            98
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentDestroyed(((FragmentManager) (this)), fragment);
	//   37   85:aload           4
	//   38   87:getfield        #863 <Field Object Pair.first>
	//   39   90:checkcast       #865 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   40   93:aload_0         
	//   41   94:aload_1         
	//   42   95:invokevirtual   #890 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentDestroyed(FragmentManager, Fragment)>
		} while(true);
	//   43   98:goto            47
	//   44  101:return          
	}

	void dispatchOnFragmentDetached(Fragment fragment, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #756 <Field Fragment mParent>
	//*   2    4:ifnull          31
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #756 <Field Fragment mParent>
	//    5   11:invokevirtual   #835 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   14   28:invokevirtual   #893 <Method void dispatchOnFragmentDetached(Fragment, boolean)>
		}
		if(mLifecycleCallbacks == null)
	//*  15   31:aload_0         
	//*  16   32:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//*  17   35:ifnonnull       39
			return;
	//   18   38:return          
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   19   39:aload_0         
	//   20   40:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   21   43:invokevirtual   #845 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   22   46:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   23   47:aload_3         
	//   24   48:invokeinterface #850 <Method boolean Iterator.hasNext()>
	//   25   53:ifeq            101
			Pair pair = (Pair)iterator.next();
	//   26   56:aload_3         
	//   27   57:invokeinterface #854 <Method Object Iterator.next()>
	//   28   62:checkcast       #856 <Class Pair>
	//   29   65:astore          4
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  30   67:iload_2         
	//*  31   68:ifeq            85
	//*  32   71:aload           4
	//*  33   73:getfield        #860 <Field Object Pair.second>
	//*  34   76:checkcast       #266 <Class Boolean>
	//*  35   79:invokevirtual   #361 <Method boolean Boolean.booleanValue()>
	//*  36   82:ifeq            98
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentDetached(((FragmentManager) (this)), fragment);
	//   37   85:aload           4
	//   38   87:getfield        #863 <Field Object Pair.first>
	//   39   90:checkcast       #865 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   40   93:aload_0         
	//   41   94:aload_1         
	//   42   95:invokevirtual   #896 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentDetached(FragmentManager, Fragment)>
		} while(true);
	//   43   98:goto            47
	//   44  101:return          
	}

	void dispatchOnFragmentPaused(Fragment fragment, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #756 <Field Fragment mParent>
	//*   2    4:ifnull          31
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #756 <Field Fragment mParent>
	//    5   11:invokevirtual   #835 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   14   28:invokevirtual   #899 <Method void dispatchOnFragmentPaused(Fragment, boolean)>
		}
		if(mLifecycleCallbacks == null)
	//*  15   31:aload_0         
	//*  16   32:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//*  17   35:ifnonnull       39
			return;
	//   18   38:return          
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   19   39:aload_0         
	//   20   40:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   21   43:invokevirtual   #845 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   22   46:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   23   47:aload_3         
	//   24   48:invokeinterface #850 <Method boolean Iterator.hasNext()>
	//   25   53:ifeq            101
			Pair pair = (Pair)iterator.next();
	//   26   56:aload_3         
	//   27   57:invokeinterface #854 <Method Object Iterator.next()>
	//   28   62:checkcast       #856 <Class Pair>
	//   29   65:astore          4
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  30   67:iload_2         
	//*  31   68:ifeq            85
	//*  32   71:aload           4
	//*  33   73:getfield        #860 <Field Object Pair.second>
	//*  34   76:checkcast       #266 <Class Boolean>
	//*  35   79:invokevirtual   #361 <Method boolean Boolean.booleanValue()>
	//*  36   82:ifeq            98
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentPaused(((FragmentManager) (this)), fragment);
	//   37   85:aload           4
	//   38   87:getfield        #863 <Field Object Pair.first>
	//   39   90:checkcast       #865 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   40   93:aload_0         
	//   41   94:aload_1         
	//   42   95:invokevirtual   #902 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentPaused(FragmentManager, Fragment)>
		} while(true);
	//   43   98:goto            47
	//   44  101:return          
	}

	void dispatchOnFragmentPreAttached(Fragment fragment, Context context, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #756 <Field Fragment mParent>
	//*   2    4:ifnull          35
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #756 <Field Fragment mParent>
	//    5   11:invokevirtual   #835 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   15   32:invokevirtual   #905 <Method void dispatchOnFragmentPreAttached(Fragment, Context, boolean)>
		}
		if(mLifecycleCallbacks == null)
	//*  16   35:aload_0         
	//*  17   36:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//*  18   39:ifnonnull       43
			return;
	//   19   42:return          
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   20   43:aload_0         
	//   21   44:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   22   47:invokevirtual   #845 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   23   50:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   24   52:aload           4
	//   25   54:invokeinterface #850 <Method boolean Iterator.hasNext()>
	//   26   59:ifeq            109
			Pair pair = (Pair)iterator.next();
	//   27   62:aload           4
	//   28   64:invokeinterface #854 <Method Object Iterator.next()>
	//   29   69:checkcast       #856 <Class Pair>
	//   30   72:astore          5
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  31   74:iload_3         
	//*  32   75:ifeq            92
	//*  33   78:aload           5
	//*  34   80:getfield        #860 <Field Object Pair.second>
	//*  35   83:checkcast       #266 <Class Boolean>
	//*  36   86:invokevirtual   #361 <Method boolean Boolean.booleanValue()>
	//*  37   89:ifeq            106
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentPreAttached(((FragmentManager) (this)), fragment, context);
	//   38   92:aload           5
	//   39   94:getfield        #863 <Field Object Pair.first>
	//   40   97:checkcast       #865 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   41  100:aload_0         
	//   42  101:aload_1         
	//   43  102:aload_2         
	//   44  103:invokevirtual   #908 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentPreAttached(FragmentManager, Fragment, Context)>
		} while(true);
	//   45  106:goto            52
	//   46  109:return          
	}

	void dispatchOnFragmentResumed(Fragment fragment, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #756 <Field Fragment mParent>
	//*   2    4:ifnull          31
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #756 <Field Fragment mParent>
	//    5   11:invokevirtual   #835 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   14   28:invokevirtual   #911 <Method void dispatchOnFragmentResumed(Fragment, boolean)>
		}
		if(mLifecycleCallbacks == null)
	//*  15   31:aload_0         
	//*  16   32:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//*  17   35:ifnonnull       39
			return;
	//   18   38:return          
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   19   39:aload_0         
	//   20   40:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   21   43:invokevirtual   #845 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   22   46:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   23   47:aload_3         
	//   24   48:invokeinterface #850 <Method boolean Iterator.hasNext()>
	//   25   53:ifeq            101
			Pair pair = (Pair)iterator.next();
	//   26   56:aload_3         
	//   27   57:invokeinterface #854 <Method Object Iterator.next()>
	//   28   62:checkcast       #856 <Class Pair>
	//   29   65:astore          4
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  30   67:iload_2         
	//*  31   68:ifeq            85
	//*  32   71:aload           4
	//*  33   73:getfield        #860 <Field Object Pair.second>
	//*  34   76:checkcast       #266 <Class Boolean>
	//*  35   79:invokevirtual   #361 <Method boolean Boolean.booleanValue()>
	//*  36   82:ifeq            98
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentResumed(((FragmentManager) (this)), fragment);
	//   37   85:aload           4
	//   38   87:getfield        #863 <Field Object Pair.first>
	//   39   90:checkcast       #865 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   40   93:aload_0         
	//   41   94:aload_1         
	//   42   95:invokevirtual   #914 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentResumed(FragmentManager, Fragment)>
		} while(true);
	//   43   98:goto            47
	//   44  101:return          
	}

	void dispatchOnFragmentSaveInstanceState(Fragment fragment, Bundle bundle, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #756 <Field Fragment mParent>
	//*   2    4:ifnull          35
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #756 <Field Fragment mParent>
	//    5   11:invokevirtual   #835 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   15   32:invokevirtual   #917 <Method void dispatchOnFragmentSaveInstanceState(Fragment, Bundle, boolean)>
		}
		if(mLifecycleCallbacks == null)
	//*  16   35:aload_0         
	//*  17   36:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//*  18   39:ifnonnull       43
			return;
	//   19   42:return          
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   20   43:aload_0         
	//   21   44:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   22   47:invokevirtual   #845 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   23   50:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   24   52:aload           4
	//   25   54:invokeinterface #850 <Method boolean Iterator.hasNext()>
	//   26   59:ifeq            109
			Pair pair = (Pair)iterator.next();
	//   27   62:aload           4
	//   28   64:invokeinterface #854 <Method Object Iterator.next()>
	//   29   69:checkcast       #856 <Class Pair>
	//   30   72:astore          5
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  31   74:iload_3         
	//*  32   75:ifeq            92
	//*  33   78:aload           5
	//*  34   80:getfield        #860 <Field Object Pair.second>
	//*  35   83:checkcast       #266 <Class Boolean>
	//*  36   86:invokevirtual   #361 <Method boolean Boolean.booleanValue()>
	//*  37   89:ifeq            106
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentSaveInstanceState(((FragmentManager) (this)), fragment, bundle);
	//   38   92:aload           5
	//   39   94:getfield        #863 <Field Object Pair.first>
	//   40   97:checkcast       #865 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   41  100:aload_0         
	//   42  101:aload_1         
	//   43  102:aload_2         
	//   44  103:invokevirtual   #920 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentSaveInstanceState(FragmentManager, Fragment, Bundle)>
		} while(true);
	//   45  106:goto            52
	//   46  109:return          
	}

	void dispatchOnFragmentStarted(Fragment fragment, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #756 <Field Fragment mParent>
	//*   2    4:ifnull          31
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #756 <Field Fragment mParent>
	//    5   11:invokevirtual   #835 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   14   28:invokevirtual   #923 <Method void dispatchOnFragmentStarted(Fragment, boolean)>
		}
		if(mLifecycleCallbacks == null)
	//*  15   31:aload_0         
	//*  16   32:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//*  17   35:ifnonnull       39
			return;
	//   18   38:return          
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   19   39:aload_0         
	//   20   40:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   21   43:invokevirtual   #845 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   22   46:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   23   47:aload_3         
	//   24   48:invokeinterface #850 <Method boolean Iterator.hasNext()>
	//   25   53:ifeq            101
			Pair pair = (Pair)iterator.next();
	//   26   56:aload_3         
	//   27   57:invokeinterface #854 <Method Object Iterator.next()>
	//   28   62:checkcast       #856 <Class Pair>
	//   29   65:astore          4
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  30   67:iload_2         
	//*  31   68:ifeq            85
	//*  32   71:aload           4
	//*  33   73:getfield        #860 <Field Object Pair.second>
	//*  34   76:checkcast       #266 <Class Boolean>
	//*  35   79:invokevirtual   #361 <Method boolean Boolean.booleanValue()>
	//*  36   82:ifeq            98
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentStarted(((FragmentManager) (this)), fragment);
	//   37   85:aload           4
	//   38   87:getfield        #863 <Field Object Pair.first>
	//   39   90:checkcast       #865 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   40   93:aload_0         
	//   41   94:aload_1         
	//   42   95:invokevirtual   #926 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentStarted(FragmentManager, Fragment)>
		} while(true);
	//   43   98:goto            47
	//   44  101:return          
	}

	void dispatchOnFragmentStopped(Fragment fragment, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #756 <Field Fragment mParent>
	//*   2    4:ifnull          31
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #756 <Field Fragment mParent>
	//    5   11:invokevirtual   #835 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   14   28:invokevirtual   #929 <Method void dispatchOnFragmentStopped(Fragment, boolean)>
		}
		if(mLifecycleCallbacks == null)
	//*  15   31:aload_0         
	//*  16   32:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//*  17   35:ifnonnull       39
			return;
	//   18   38:return          
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   19   39:aload_0         
	//   20   40:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   21   43:invokevirtual   #845 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   22   46:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   23   47:aload_3         
	//   24   48:invokeinterface #850 <Method boolean Iterator.hasNext()>
	//   25   53:ifeq            101
			Pair pair = (Pair)iterator.next();
	//   26   56:aload_3         
	//   27   57:invokeinterface #854 <Method Object Iterator.next()>
	//   28   62:checkcast       #856 <Class Pair>
	//   29   65:astore          4
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  30   67:iload_2         
	//*  31   68:ifeq            85
	//*  32   71:aload           4
	//*  33   73:getfield        #860 <Field Object Pair.second>
	//*  34   76:checkcast       #266 <Class Boolean>
	//*  35   79:invokevirtual   #361 <Method boolean Boolean.booleanValue()>
	//*  36   82:ifeq            98
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentStopped(((FragmentManager) (this)), fragment);
	//   37   85:aload           4
	//   38   87:getfield        #863 <Field Object Pair.first>
	//   39   90:checkcast       #865 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   40   93:aload_0         
	//   41   94:aload_1         
	//   42   95:invokevirtual   #932 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentStopped(FragmentManager, Fragment)>
		} while(true);
	//   43   98:goto            47
	//   44  101:return          
	}

	void dispatchOnFragmentViewCreated(Fragment fragment, View view, Bundle bundle, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #756 <Field Fragment mParent>
	//*   2    4:ifnull          36
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #756 <Field Fragment mParent>
	//    5   11:invokevirtual   #835 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   16   33:invokevirtual   #936 <Method void dispatchOnFragmentViewCreated(Fragment, View, Bundle, boolean)>
		}
		if(mLifecycleCallbacks == null)
	//*  17   36:aload_0         
	//*  18   37:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//*  19   40:ifnonnull       44
			return;
	//   20   43:return          
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   21   44:aload_0         
	//   22   45:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   23   48:invokevirtual   #845 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   24   51:astore          5
		do
		{
			if(!iterator.hasNext())
				break;
	//   25   53:aload           5
	//   26   55:invokeinterface #850 <Method boolean Iterator.hasNext()>
	//   27   60:ifeq            112
			Pair pair = (Pair)iterator.next();
	//   28   63:aload           5
	//   29   65:invokeinterface #854 <Method Object Iterator.next()>
	//   30   70:checkcast       #856 <Class Pair>
	//   31   73:astore          6
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  32   75:iload           4
	//*  33   77:ifeq            94
	//*  34   80:aload           6
	//*  35   82:getfield        #860 <Field Object Pair.second>
	//*  36   85:checkcast       #266 <Class Boolean>
	//*  37   88:invokevirtual   #361 <Method boolean Boolean.booleanValue()>
	//*  38   91:ifeq            109
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentViewCreated(((FragmentManager) (this)), fragment, view, bundle);
	//   39   94:aload           6
	//   40   96:getfield        #863 <Field Object Pair.first>
	//   41   99:checkcast       #865 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   42  102:aload_0         
	//   43  103:aload_1         
	//   44  104:aload_2         
	//   45  105:aload_3         
	//   46  106:invokevirtual   #940 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentViewCreated(FragmentManager, Fragment, View, Bundle)>
		} while(true);
	//   47  109:goto            53
	//   48  112:return          
	}

	void dispatchOnFragmentViewDestroyed(Fragment fragment, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #756 <Field Fragment mParent>
	//*   2    4:ifnull          31
		{
			FragmentManager fragmentmanager = mParent.getFragmentManager();
	//    3    7:aload_0         
	//    4    8:getfield        #756 <Field Fragment mParent>
	//    5   11:invokevirtual   #835 <Method FragmentManager Fragment.getFragmentManager()>
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
	//   14   28:invokevirtual   #943 <Method void dispatchOnFragmentViewDestroyed(Fragment, boolean)>
		}
		if(mLifecycleCallbacks == null)
	//*  15   31:aload_0         
	//*  16   32:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//*  17   35:ifnonnull       39
			return;
	//   18   38:return          
		Iterator iterator = mLifecycleCallbacks.iterator();
	//   19   39:aload_0         
	//   20   40:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   21   43:invokevirtual   #845 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   22   46:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   23   47:aload_3         
	//   24   48:invokeinterface #850 <Method boolean Iterator.hasNext()>
	//   25   53:ifeq            101
			Pair pair = (Pair)iterator.next();
	//   26   56:aload_3         
	//   27   57:invokeinterface #854 <Method Object Iterator.next()>
	//   28   62:checkcast       #856 <Class Pair>
	//   29   65:astore          4
			if(!flag || ((Boolean)pair.second).booleanValue())
	//*  30   67:iload_2         
	//*  31   68:ifeq            85
	//*  32   71:aload           4
	//*  33   73:getfield        #860 <Field Object Pair.second>
	//*  34   76:checkcast       #266 <Class Boolean>
	//*  35   79:invokevirtual   #361 <Method boolean Boolean.booleanValue()>
	//*  36   82:ifeq            98
				((FragmentManager.FragmentLifecycleCallbacks)pair.first).onFragmentViewDestroyed(((FragmentManager) (this)), fragment);
	//   37   85:aload           4
	//   38   87:getfield        #863 <Field Object Pair.first>
	//   39   90:checkcast       #865 <Class FragmentManager$FragmentLifecycleCallbacks>
	//   40   93:aload_0         
	//   41   94:aload_1         
	//   42   95:invokevirtual   #946 <Method void FragmentManager$FragmentLifecycleCallbacks.onFragmentViewDestroyed(FragmentManager, Fragment)>
		} while(true);
	//   43   98:goto            47
	//   44  101:return          
	}

	public boolean dispatchOptionsItemSelected(MenuItem menuitem)
	{
		if(mAdded != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #182 <Field ArrayList mAdded>
	//*   2    4:ifnull          53
		{
			for(int i = 0; i < mAdded.size(); i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_2        
	//*   5    9:iload_2         
	//*   6   10:aload_0         
	//*   7   11:getfield        #182 <Field ArrayList mAdded>
	//*   8   14:invokevirtual   #188 <Method int ArrayList.size()>
	//*   9   17:icmpge          53
			{
				Fragment fragment = (Fragment)mAdded.get(i);
	//   10   20:aload_0         
	//   11   21:getfield        #182 <Field ArrayList mAdded>
	//   12   24:iload_2         
	//   13   25:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   14   28:checkcast       #194 <Class Fragment>
	//   15   31:astore_3        
				if(fragment != null && fragment.performOptionsItemSelected(menuitem))
	//*  16   32:aload_3         
	//*  17   33:ifnull          46
	//*  18   36:aload_3         
	//*  19   37:aload_1         
	//*  20   38:invokevirtual   #950 <Method boolean Fragment.performOptionsItemSelected(MenuItem)>
	//*  21   41:ifeq            46
					return true;
	//   22   44:iconst_1        
	//   23   45:ireturn         
			}

	//   24   46:iload_2         
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore_2        
		}
	//*  28   50:goto            9
		return false;
	//   29   53:iconst_0        
	//   30   54:ireturn         
	}

	public void dispatchOptionsMenuClosed(Menu menu)
	{
		if(mAdded != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #182 <Field ArrayList mAdded>
	//*   2    4:ifnull          48
		{
			for(int i = 0; i < mAdded.size(); i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_2        
	//*   5    9:iload_2         
	//*   6   10:aload_0         
	//*   7   11:getfield        #182 <Field ArrayList mAdded>
	//*   8   14:invokevirtual   #188 <Method int ArrayList.size()>
	//*   9   17:icmpge          48
			{
				Fragment fragment = (Fragment)mAdded.get(i);
	//   10   20:aload_0         
	//   11   21:getfield        #182 <Field ArrayList mAdded>
	//   12   24:iload_2         
	//   13   25:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   14   28:checkcast       #194 <Class Fragment>
	//   15   31:astore_3        
				if(fragment != null)
	//*  16   32:aload_3         
	//*  17   33:ifnull          41
					fragment.performOptionsMenuClosed(menu);
	//   18   36:aload_3         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #955 <Method void Fragment.performOptionsMenuClosed(Menu)>
			}

	//   21   41:iload_2         
	//   22   42:iconst_1        
	//   23   43:iadd            
	//   24   44:istore_2        
		}
	//*  25   45:goto            9
	//   26   48:return          
	}

	public void dispatchPause()
	{
		mExecutingActions = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #253 <Field boolean mExecutingActions>
		moveToState(4, false);
	//    3    5:aload_0         
	//    4    6:iconst_4        
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #283 <Method void moveToState(int, boolean)>
		mExecutingActions = false;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #253 <Field boolean mExecutingActions>
	//   10   16:return          
	}

	public void dispatchPictureInPictureModeChanged(boolean flag)
	{
		if(mAdded == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #182 <Field ArrayList mAdded>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		for(int i = mAdded.size() - 1; i >= 0; i--)
	//*   4    8:aload_0         
	//*   5    9:getfield        #182 <Field ArrayList mAdded>
	//*   6   12:invokevirtual   #188 <Method int ArrayList.size()>
	//*   7   15:iconst_1        
	//*   8   16:isub            
	//*   9   17:istore_2        
	//*  10   18:iload_2         
	//*  11   19:iflt            50
		{
			Fragment fragment = (Fragment)mAdded.get(i);
	//   12   22:aload_0         
	//   13   23:getfield        #182 <Field ArrayList mAdded>
	//   14   26:iload_2         
	//   15   27:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   16   30:checkcast       #194 <Class Fragment>
	//   17   33:astore_3        
			if(fragment != null)
	//*  18   34:aload_3         
	//*  19   35:ifnull          43
				fragment.performPictureInPictureModeChanged(flag);
	//   20   38:aload_3         
	//   21   39:iload_1         
	//   22   40:invokevirtual   #960 <Method void Fragment.performPictureInPictureModeChanged(boolean)>
		}

	//   23   43:iload_2         
	//   24   44:iconst_1        
	//   25   45:isub            
	//   26   46:istore_2        
	//*  27   47:goto            18
	//   28   50:return          
	}

	public boolean dispatchPrepareOptionsMenu(Menu menu)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		boolean flag = false;
	//    2    3:iconst_0        
	//    3    4:istore_3        
		if(mAdded != null)
	//*   4    5:aload_0         
	//*   5    6:getfield        #182 <Field ArrayList mAdded>
	//*   6    9:ifnull          74
		{
			int i = 0;
	//    7   12:iconst_0        
	//    8   13:istore_2        
			do
			{
				flag1 = flag;
	//    9   14:iload_3         
	//   10   15:istore          4
				if(i >= mAdded.size())
					break;
	//   11   17:iload_2         
	//   12   18:aload_0         
	//   13   19:getfield        #182 <Field ArrayList mAdded>
	//   14   22:invokevirtual   #188 <Method int ArrayList.size()>
	//   15   25:icmpge          74
				Fragment fragment = (Fragment)mAdded.get(i);
	//   16   28:aload_0         
	//   17   29:getfield        #182 <Field ArrayList mAdded>
	//   18   32:iload_2         
	//   19   33:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   20   36:checkcast       #194 <Class Fragment>
	//   21   39:astore          5
				flag1 = flag;
	//   22   41:iload_3         
	//   23   42:istore          4
				if(fragment != null)
	//*  24   44:aload           5
	//*  25   46:ifnull          64
				{
					flag1 = flag;
	//   26   49:iload_3         
	//   27   50:istore          4
					if(fragment.performPrepareOptionsMenu(menu))
	//*  28   52:aload           5
	//*  29   54:aload_1         
	//*  30   55:invokevirtual   #965 <Method boolean Fragment.performPrepareOptionsMenu(Menu)>
	//*  31   58:ifeq            64
						flag1 = true;
	//   32   61:iconst_1        
	//   33   62:istore          4
				}
				i++;
	//   34   64:iload_2         
	//   35   65:iconst_1        
	//   36   66:iadd            
	//   37   67:istore_2        
				flag = flag1;
	//   38   68:iload           4
	//   39   70:istore_3        
			} while(true);
	//   40   71:goto            14
		}
		return flag1;
	//   41   74:iload           4
	//   42   76:ireturn         
	}

	public void dispatchReallyStop()
	{
		mExecutingActions = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #253 <Field boolean mExecutingActions>
		moveToState(2, false);
	//    3    5:aload_0         
	//    4    6:iconst_2        
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #283 <Method void moveToState(int, boolean)>
		mExecutingActions = false;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #253 <Field boolean mExecutingActions>
	//   10   16:return          
	}

	public void dispatchResume()
	{
		mStateSaved = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #228 <Field boolean mStateSaved>
		mExecutingActions = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #253 <Field boolean mExecutingActions>
		moveToState(5, false);
	//    6   10:aload_0         
	//    7   11:iconst_5        
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #283 <Method void moveToState(int, boolean)>
		mExecutingActions = false;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #253 <Field boolean mExecutingActions>
	//   13   21:return          
	}

	public void dispatchStart()
	{
		mStateSaved = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #228 <Field boolean mStateSaved>
		mExecutingActions = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #253 <Field boolean mExecutingActions>
		moveToState(4, false);
	//    6   10:aload_0         
	//    7   11:iconst_4        
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #283 <Method void moveToState(int, boolean)>
		mExecutingActions = false;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #253 <Field boolean mExecutingActions>
	//   13   21:return          
	}

	public void dispatchStop()
	{
		mStateSaved = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #228 <Field boolean mStateSaved>
		mExecutingActions = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #253 <Field boolean mExecutingActions>
		moveToState(3, false);
	//    6   10:aload_0         
	//    7   11:iconst_3        
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #283 <Method void moveToState(int, boolean)>
		mExecutingActions = false;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #253 <Field boolean mExecutingActions>
	//   13   21:return          
	}

	void doPendingDeferredStart()
	{
		if(mHavePendingDeferredStart)
	//*   0    0:aload_0         
	//*   1    1:getfield        #971 <Field boolean mHavePendingDeferredStart>
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
	//*   9   13:getfield        #285 <Field ArrayList mActive>
	//*  10   16:invokevirtual   #188 <Method int ArrayList.size()>
	//*  11   19:icmpge          72
			{
				Fragment fragment = (Fragment)mActive.get(i);
	//   12   22:aload_0         
	//   13   23:getfield        #285 <Field ArrayList mActive>
	//   14   26:iload_1         
	//   15   27:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   16   30:checkcast       #194 <Class Fragment>
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
	//*  25   46:getfield        #975 <Field LoaderManagerImpl Fragment.mLoaderManager>
	//*  26   49:ifnull          63
						flag1 = flag | fragment.mLoaderManager.hasRunningLoaders();
	//   27   52:iload_2         
	//   28   53:aload           4
	//   29   55:getfield        #975 <Field LoaderManagerImpl Fragment.mLoaderManager>
	//   30   58:invokevirtual   #980 <Method boolean LoaderManagerImpl.hasRunningLoaders()>
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
	//   44   78:putfield        #971 <Field boolean mHavePendingDeferredStart>
				startPendingDeferredFragments();
	//   45   81:aload_0         
	//   46   82:invokevirtual   #983 <Method void startPendingDeferredFragments()>
			}
		}
	//   47   85:return          
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		String s1 = (new StringBuilder()).append(s).append("    ").toString();
	//    0    0:new             #239 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #240 <Method void StringBuilder()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//    5   11:ldc2            #985 <String "    ">
	//    6   14:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:invokevirtual   #250 <Method String StringBuilder.toString()>
	//    8   20:astore          7
		if(mActive != null)
	//*   9   22:aload_0         
	//*  10   23:getfield        #285 <Field ArrayList mActive>
	//*  11   26:ifnull          153
		{
			int k1 = mActive.size();
	//   12   29:aload_0         
	//   13   30:getfield        #285 <Field ArrayList mActive>
	//   14   33:invokevirtual   #188 <Method int ArrayList.size()>
	//   15   36:istore          6
			if(k1 > 0)
	//*  16   38:iload           6
	//*  17   40:ifle            153
			{
				printwriter.print(s);
	//   18   43:aload_3         
	//   19   44:aload_1         
	//   20   45:invokevirtual   #988 <Method void PrintWriter.print(String)>
				printwriter.print("Active Fragments in ");
	//   21   48:aload_3         
	//   22   49:ldc2            #990 <String "Active Fragments in ">
	//   23   52:invokevirtual   #988 <Method void PrintWriter.print(String)>
				printwriter.print(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//   24   55:aload_3         
	//   25   56:aload_0         
	//   26   57:invokestatic    #995 <Method int System.identityHashCode(Object)>
	//   27   60:invokestatic    #999 <Method String Integer.toHexString(int)>
	//   28   63:invokevirtual   #988 <Method void PrintWriter.print(String)>
				printwriter.println(":");
	//   29   66:aload_3         
	//   30   67:ldc2            #1001 <String ":">
	//   31   70:invokevirtual   #1004 <Method void PrintWriter.println(String)>
				for(int i = 0; i < k1; i++)
	//*  32   73:iconst_0        
	//*  33   74:istore          5
	//*  34   76:iload           5
	//*  35   78:iload           6
	//*  36   80:icmpge          153
				{
					Fragment fragment = (Fragment)mActive.get(i);
	//   37   83:aload_0         
	//   38   84:getfield        #285 <Field ArrayList mActive>
	//   39   87:iload           5
	//   40   89:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   41   92:checkcast       #194 <Class Fragment>
	//   42   95:astore          8
					printwriter.print(s);
	//   43   97:aload_3         
	//   44   98:aload_1         
	//   45   99:invokevirtual   #988 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//   46  102:aload_3         
	//   47  103:ldc2            #1006 <String "  #">
	//   48  106:invokevirtual   #988 <Method void PrintWriter.print(String)>
					printwriter.print(i);
	//   49  109:aload_3         
	//   50  110:iload           5
	//   51  112:invokevirtual   #1008 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//   52  115:aload_3         
	//   53  116:ldc2            #1010 <String ": ">
	//   54  119:invokevirtual   #988 <Method void PrintWriter.print(String)>
					printwriter.println(((Object) (fragment)));
	//   55  122:aload_3         
	//   56  123:aload           8
	//   57  125:invokevirtual   #1013 <Method void PrintWriter.println(Object)>
					if(fragment != null)
	//*  58  128:aload           8
	//*  59  130:ifnull          144
						fragment.dump(s1, filedescriptor, printwriter, as);
	//   60  133:aload           8
	//   61  135:aload           7
	//   62  137:aload_2         
	//   63  138:aload_3         
	//   64  139:aload           4
	//   65  141:invokevirtual   #1014 <Method void Fragment.dump(String, FileDescriptor, PrintWriter, String[])>
				}

	//   66  144:iload           5
	//   67  146:iconst_1        
	//   68  147:iadd            
	//   69  148:istore          5
			}
		}
	//*  70  150:goto            76
		if(mAdded != null)
	//*  71  153:aload_0         
	//*  72  154:getfield        #182 <Field ArrayList mAdded>
	//*  73  157:ifnull          253
		{
			int l1 = mAdded.size();
	//   74  160:aload_0         
	//   75  161:getfield        #182 <Field ArrayList mAdded>
	//   76  164:invokevirtual   #188 <Method int ArrayList.size()>
	//   77  167:istore          6
			if(l1 > 0)
	//*  78  169:iload           6
	//*  79  171:ifle            253
			{
				printwriter.print(s);
	//   80  174:aload_3         
	//   81  175:aload_1         
	//   82  176:invokevirtual   #988 <Method void PrintWriter.print(String)>
				printwriter.println("Added Fragments:");
	//   83  179:aload_3         
	//   84  180:ldc2            #1016 <String "Added Fragments:">
	//   85  183:invokevirtual   #1004 <Method void PrintWriter.println(String)>
				for(int j = 0; j < l1; j++)
	//*  86  186:iconst_0        
	//*  87  187:istore          5
	//*  88  189:iload           5
	//*  89  191:iload           6
	//*  90  193:icmpge          253
				{
					Fragment fragment1 = (Fragment)mAdded.get(j);
	//   91  196:aload_0         
	//   92  197:getfield        #182 <Field ArrayList mAdded>
	//   93  200:iload           5
	//   94  202:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   95  205:checkcast       #194 <Class Fragment>
	//   96  208:astore          8
					printwriter.print(s);
	//   97  210:aload_3         
	//   98  211:aload_1         
	//   99  212:invokevirtual   #988 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//  100  215:aload_3         
	//  101  216:ldc2            #1006 <String "  #">
	//  102  219:invokevirtual   #988 <Method void PrintWriter.print(String)>
					printwriter.print(j);
	//  103  222:aload_3         
	//  104  223:iload           5
	//  105  225:invokevirtual   #1008 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//  106  228:aload_3         
	//  107  229:ldc2            #1010 <String ": ">
	//  108  232:invokevirtual   #988 <Method void PrintWriter.print(String)>
					printwriter.println(fragment1.toString());
	//  109  235:aload_3         
	//  110  236:aload           8
	//  111  238:invokevirtual   #1017 <Method String Fragment.toString()>
	//  112  241:invokevirtual   #1004 <Method void PrintWriter.println(String)>
				}

	//  113  244:iload           5
	//  114  246:iconst_1        
	//  115  247:iadd            
	//  116  248:istore          5
			}
		}
	//* 117  250:goto            189
		if(mCreatedMenus != null)
	//* 118  253:aload_0         
	//* 119  254:getfield        #815 <Field ArrayList mCreatedMenus>
	//* 120  257:ifnull          353
		{
			int i2 = mCreatedMenus.size();
	//  121  260:aload_0         
	//  122  261:getfield        #815 <Field ArrayList mCreatedMenus>
	//  123  264:invokevirtual   #188 <Method int ArrayList.size()>
	//  124  267:istore          6
			if(i2 > 0)
	//* 125  269:iload           6
	//* 126  271:ifle            353
			{
				printwriter.print(s);
	//  127  274:aload_3         
	//  128  275:aload_1         
	//  129  276:invokevirtual   #988 <Method void PrintWriter.print(String)>
				printwriter.println("Fragments Created Menus:");
	//  130  279:aload_3         
	//  131  280:ldc2            #1019 <String "Fragments Created Menus:">
	//  132  283:invokevirtual   #1004 <Method void PrintWriter.println(String)>
				for(int k = 0; k < i2; k++)
	//* 133  286:iconst_0        
	//* 134  287:istore          5
	//* 135  289:iload           5
	//* 136  291:iload           6
	//* 137  293:icmpge          353
				{
					Fragment fragment2 = (Fragment)mCreatedMenus.get(k);
	//  138  296:aload_0         
	//  139  297:getfield        #815 <Field ArrayList mCreatedMenus>
	//  140  300:iload           5
	//  141  302:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//  142  305:checkcast       #194 <Class Fragment>
	//  143  308:astore          8
					printwriter.print(s);
	//  144  310:aload_3         
	//  145  311:aload_1         
	//  146  312:invokevirtual   #988 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//  147  315:aload_3         
	//  148  316:ldc2            #1006 <String "  #">
	//  149  319:invokevirtual   #988 <Method void PrintWriter.print(String)>
					printwriter.print(k);
	//  150  322:aload_3         
	//  151  323:iload           5
	//  152  325:invokevirtual   #1008 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//  153  328:aload_3         
	//  154  329:ldc2            #1010 <String ": ">
	//  155  332:invokevirtual   #988 <Method void PrintWriter.print(String)>
					printwriter.println(fragment2.toString());
	//  156  335:aload_3         
	//  157  336:aload           8
	//  158  338:invokevirtual   #1017 <Method String Fragment.toString()>
	//  159  341:invokevirtual   #1004 <Method void PrintWriter.println(String)>
				}

	//  160  344:iload           5
	//  161  346:iconst_1        
	//  162  347:iadd            
	//  163  348:istore          5
			}
		}
	//* 164  350:goto            289
		if(mBackStack != null)
	//* 165  353:aload_0         
	//* 166  354:getfield        #680 <Field ArrayList mBackStack>
	//* 167  357:ifnull          464
		{
			int j2 = mBackStack.size();
	//  168  360:aload_0         
	//  169  361:getfield        #680 <Field ArrayList mBackStack>
	//  170  364:invokevirtual   #188 <Method int ArrayList.size()>
	//  171  367:istore          6
			if(j2 > 0)
	//* 172  369:iload           6
	//* 173  371:ifle            464
			{
				printwriter.print(s);
	//  174  374:aload_3         
	//  175  375:aload_1         
	//  176  376:invokevirtual   #988 <Method void PrintWriter.print(String)>
				printwriter.println("Back Stack:");
	//  177  379:aload_3         
	//  178  380:ldc2            #1021 <String "Back Stack:">
	//  179  383:invokevirtual   #1004 <Method void PrintWriter.println(String)>
				for(int l = 0; l < j2; l++)
	//* 180  386:iconst_0        
	//* 181  387:istore          5
	//* 182  389:iload           5
	//* 183  391:iload           6
	//* 184  393:icmpge          464
				{
					BackStackRecord backstackrecord = (BackStackRecord)mBackStack.get(l);
	//  185  396:aload_0         
	//  186  397:getfield        #680 <Field ArrayList mBackStack>
	//  187  400:iload           5
	//  188  402:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//  189  405:checkcast       #290 <Class BackStackRecord>
	//  190  408:astore          8
					printwriter.print(s);
	//  191  410:aload_3         
	//  192  411:aload_1         
	//  193  412:invokevirtual   #988 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//  194  415:aload_3         
	//  195  416:ldc2            #1006 <String "  #">
	//  196  419:invokevirtual   #988 <Method void PrintWriter.print(String)>
					printwriter.print(l);
	//  197  422:aload_3         
	//  198  423:iload           5
	//  199  425:invokevirtual   #1008 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//  200  428:aload_3         
	//  201  429:ldc2            #1010 <String ": ">
	//  202  432:invokevirtual   #988 <Method void PrintWriter.print(String)>
					printwriter.println(backstackrecord.toString());
	//  203  435:aload_3         
	//  204  436:aload           8
	//  205  438:invokevirtual   #1022 <Method String BackStackRecord.toString()>
	//  206  441:invokevirtual   #1004 <Method void PrintWriter.println(String)>
					backstackrecord.dump(s1, filedescriptor, printwriter, as);
	//  207  444:aload           8
	//  208  446:aload           7
	//  209  448:aload_2         
	//  210  449:aload_3         
	//  211  450:aload           4
	//  212  452:invokevirtual   #1023 <Method void BackStackRecord.dump(String, FileDescriptor, PrintWriter, String[])>
				}

	//  213  455:iload           5
	//  214  457:iconst_1        
	//  215  458:iadd            
	//  216  459:istore          5
			}
		}
	//* 217  461:goto            389
		this;
	//  218  464:aload_0         
		JVM INSTR monitorenter ;
	//  219  465:monitorenter    
		if(mBackStackIndices == null) goto _L2; else goto _L1
	//  220  466:aload_0         
	//  221  467:getfield        #728 <Field ArrayList mBackStackIndices>
	//  222  470:ifnull          561
_L1:
		int k2 = mBackStackIndices.size();
	//  223  473:aload_0         
	//  224  474:getfield        #728 <Field ArrayList mBackStackIndices>
	//  225  477:invokevirtual   #188 <Method int ArrayList.size()>
	//  226  480:istore          6
		if(k2 <= 0) goto _L2; else goto _L3
	//  227  482:iload           6
	//  228  484:ifle            561
_L3:
		printwriter.print(s);
	//  229  487:aload_3         
	//  230  488:aload_1         
	//  231  489:invokevirtual   #988 <Method void PrintWriter.print(String)>
		printwriter.println("Back Stack Indices:");
	//  232  492:aload_3         
	//  233  493:ldc2            #1025 <String "Back Stack Indices:">
	//  234  496:invokevirtual   #1004 <Method void PrintWriter.println(String)>
		int i1 = 0;
	//  235  499:iconst_0        
	//  236  500:istore          5
_L4:
		if(i1 >= k2)
			break; /* Loop/switch isn't completed */
	//  237  502:iload           5
	//  238  504:iload           6
	//  239  506:icmpge          561
		filedescriptor = ((FileDescriptor) ((BackStackRecord)mBackStackIndices.get(i1)));
	//  240  509:aload_0         
	//  241  510:getfield        #728 <Field ArrayList mBackStackIndices>
	//  242  513:iload           5
	//  243  515:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//  244  518:checkcast       #290 <Class BackStackRecord>
	//  245  521:astore_2        
		printwriter.print(s);
	//  246  522:aload_3         
	//  247  523:aload_1         
	//  248  524:invokevirtual   #988 <Method void PrintWriter.print(String)>
		printwriter.print("  #");
	//  249  527:aload_3         
	//  250  528:ldc2            #1006 <String "  #">
	//  251  531:invokevirtual   #988 <Method void PrintWriter.print(String)>
		printwriter.print(i1);
	//  252  534:aload_3         
	//  253  535:iload           5
	//  254  537:invokevirtual   #1008 <Method void PrintWriter.print(int)>
		printwriter.print(": ");
	//  255  540:aload_3         
	//  256  541:ldc2            #1010 <String ": ">
	//  257  544:invokevirtual   #988 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (filedescriptor)));
	//  258  547:aload_3         
	//  259  548:aload_2         
	//  260  549:invokevirtual   #1013 <Method void PrintWriter.println(Object)>
		i1++;
	//  261  552:iload           5
	//  262  554:iconst_1        
	//  263  555:iadd            
	//  264  556:istore          5
		if(true) goto _L4; else goto _L2
	//  265  558:goto            502
_L2:
		if(mAvailBackStackIndices != null && mAvailBackStackIndices.size() > 0)
	//* 266  561:aload_0         
	//* 267  562:getfield        #726 <Field ArrayList mAvailBackStackIndices>
	//* 268  565:ifnull          604
	//* 269  568:aload_0         
	//* 270  569:getfield        #726 <Field ArrayList mAvailBackStackIndices>
	//* 271  572:invokevirtual   #188 <Method int ArrayList.size()>
	//* 272  575:ifle            604
		{
			printwriter.print(s);
	//  273  578:aload_3         
	//  274  579:aload_1         
	//  275  580:invokevirtual   #988 <Method void PrintWriter.print(String)>
			printwriter.print("mAvailBackStackIndices: ");
	//  276  583:aload_3         
	//  277  584:ldc2            #1027 <String "mAvailBackStackIndices: ">
	//  278  587:invokevirtual   #988 <Method void PrintWriter.print(String)>
			printwriter.println(Arrays.toString(mAvailBackStackIndices.toArray()));
	//  279  590:aload_3         
	//  280  591:aload_0         
	//  281  592:getfield        #726 <Field ArrayList mAvailBackStackIndices>
	//  282  595:invokevirtual   #1031 <Method Object[] ArrayList.toArray()>
	//  283  598:invokestatic    #1036 <Method String Arrays.toString(Object[])>
	//  284  601:invokevirtual   #1004 <Method void PrintWriter.println(String)>
		}
		this;
	//  285  604:aload_0         
		JVM INSTR monitorexit ;
	//  286  605:monitorexit     
		  goto _L5
	//* 287  606:goto            614
		s;
	//  288  609:astore_1        
	//* 289  610:aload_0         
		throw s;
	//  290  611:monitorexit     
	//  291  612:aload_1         
	//  292  613:athrow          
_L5:
		if(mPendingActions != null)
	//* 293  614:aload_0         
	//* 294  615:getfield        #459 <Field ArrayList mPendingActions>
	//* 295  618:ifnull          709
		{
			int l2 = mPendingActions.size();
	//  296  621:aload_0         
	//  297  622:getfield        #459 <Field ArrayList mPendingActions>
	//  298  625:invokevirtual   #188 <Method int ArrayList.size()>
	//  299  628:istore          6
			if(l2 > 0)
	//* 300  630:iload           6
	//* 301  632:ifle            709
			{
				printwriter.print(s);
	//  302  635:aload_3         
	//  303  636:aload_1         
	//  304  637:invokevirtual   #988 <Method void PrintWriter.print(String)>
				printwriter.println("Pending Actions:");
	//  305  640:aload_3         
	//  306  641:ldc2            #1038 <String "Pending Actions:">
	//  307  644:invokevirtual   #1004 <Method void PrintWriter.println(String)>
				for(int j1 = 0; j1 < l2; j1++)
	//* 308  647:iconst_0        
	//* 309  648:istore          5
	//* 310  650:iload           5
	//* 311  652:iload           6
	//* 312  654:icmpge          709
				{
					filedescriptor = ((FileDescriptor) ((OpGenerator)mPendingActions.get(j1)));
	//  313  657:aload_0         
	//  314  658:getfield        #459 <Field ArrayList mPendingActions>
	//  315  661:iload           5
	//  316  663:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//  317  666:checkcast       #20  <Class FragmentManagerImpl$OpGenerator>
	//  318  669:astore_2        
					printwriter.print(s);
	//  319  670:aload_3         
	//  320  671:aload_1         
	//  321  672:invokevirtual   #988 <Method void PrintWriter.print(String)>
					printwriter.print("  #");
	//  322  675:aload_3         
	//  323  676:ldc2            #1006 <String "  #">
	//  324  679:invokevirtual   #988 <Method void PrintWriter.print(String)>
					printwriter.print(j1);
	//  325  682:aload_3         
	//  326  683:iload           5
	//  327  685:invokevirtual   #1008 <Method void PrintWriter.print(int)>
					printwriter.print(": ");
	//  328  688:aload_3         
	//  329  689:ldc2            #1010 <String ": ">
	//  330  692:invokevirtual   #988 <Method void PrintWriter.print(String)>
					printwriter.println(((Object) (filedescriptor)));
	//  331  695:aload_3         
	//  332  696:aload_2         
	//  333  697:invokevirtual   #1013 <Method void PrintWriter.println(Object)>
				}

	//  334  700:iload           5
	//  335  702:iconst_1        
	//  336  703:iadd            
	//  337  704:istore          5
			}
		}
	//* 338  706:goto            650
		printwriter.print(s);
	//  339  709:aload_3         
	//  340  710:aload_1         
	//  341  711:invokevirtual   #988 <Method void PrintWriter.print(String)>
		printwriter.println("FragmentManager misc state:");
	//  342  714:aload_3         
	//  343  715:ldc2            #1040 <String "FragmentManager misc state:">
	//  344  718:invokevirtual   #1004 <Method void PrintWriter.println(String)>
		printwriter.print(s);
	//  345  721:aload_3         
	//  346  722:aload_1         
	//  347  723:invokevirtual   #988 <Method void PrintWriter.print(String)>
		printwriter.print("  mHost=");
	//  348  726:aload_3         
	//  349  727:ldc2            #1042 <String "  mHost=">
	//  350  730:invokevirtual   #988 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (mHost)));
	//  351  733:aload_3         
	//  352  734:aload_0         
	//  353  735:getfield        #337 <Field FragmentHostCallback mHost>
	//  354  738:invokevirtual   #1013 <Method void PrintWriter.println(Object)>
		printwriter.print(s);
	//  355  741:aload_3         
	//  356  742:aload_1         
	//  357  743:invokevirtual   #988 <Method void PrintWriter.print(String)>
		printwriter.print("  mContainer=");
	//  358  746:aload_3         
	//  359  747:ldc2            #1044 <String "  mContainer=">
	//  360  750:invokevirtual   #988 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (mContainer)));
	//  361  753:aload_3         
	//  362  754:aload_0         
	//  363  755:getfield        #754 <Field FragmentContainer mContainer>
	//  364  758:invokevirtual   #1013 <Method void PrintWriter.println(Object)>
		if(mParent != null)
	//* 365  761:aload_0         
	//* 366  762:getfield        #756 <Field Fragment mParent>
	//* 367  765:ifnull          788
		{
			printwriter.print(s);
	//  368  768:aload_3         
	//  369  769:aload_1         
	//  370  770:invokevirtual   #988 <Method void PrintWriter.print(String)>
			printwriter.print("  mParent=");
	//  371  773:aload_3         
	//  372  774:ldc2            #1046 <String "  mParent=">
	//  373  777:invokevirtual   #988 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mParent)));
	//  374  780:aload_3         
	//  375  781:aload_0         
	//  376  782:getfield        #756 <Field Fragment mParent>
	//  377  785:invokevirtual   #1013 <Method void PrintWriter.println(Object)>
		}
		printwriter.print(s);
	//  378  788:aload_3         
	//  379  789:aload_1         
	//  380  790:invokevirtual   #988 <Method void PrintWriter.print(String)>
		printwriter.print("  mCurState=");
	//  381  793:aload_3         
	//  382  794:ldc2            #1048 <String "  mCurState=">
	//  383  797:invokevirtual   #988 <Method void PrintWriter.print(String)>
		printwriter.print(mCurState);
	//  384  800:aload_3         
	//  385  801:aload_0         
	//  386  802:getfield        #153 <Field int mCurState>
	//  387  805:invokevirtual   #1008 <Method void PrintWriter.print(int)>
		printwriter.print(" mStateSaved=");
	//  388  808:aload_3         
	//  389  809:ldc2            #1050 <String " mStateSaved=">
	//  390  812:invokevirtual   #988 <Method void PrintWriter.print(String)>
		printwriter.print(mStateSaved);
	//  391  815:aload_3         
	//  392  816:aload_0         
	//  393  817:getfield        #228 <Field boolean mStateSaved>
	//  394  820:invokevirtual   #1052 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mDestroyed=");
	//  395  823:aload_3         
	//  396  824:ldc2            #1054 <String " mDestroyed=">
	//  397  827:invokevirtual   #988 <Method void PrintWriter.print(String)>
		printwriter.println(mDestroyed);
	//  398  830:aload_3         
	//  399  831:aload_0         
	//  400  832:getfield        #821 <Field boolean mDestroyed>
	//  401  835:invokevirtual   #1056 <Method void PrintWriter.println(boolean)>
		if(mNeedMenuInvalidate)
	//* 402  838:aload_0         
	//* 403  839:getfield        #716 <Field boolean mNeedMenuInvalidate>
	//* 404  842:ifeq            865
		{
			printwriter.print(s);
	//  405  845:aload_3         
	//  406  846:aload_1         
	//  407  847:invokevirtual   #988 <Method void PrintWriter.print(String)>
			printwriter.print("  mNeedMenuInvalidate=");
	//  408  850:aload_3         
	//  409  851:ldc2            #1058 <String "  mNeedMenuInvalidate=">
	//  410  854:invokevirtual   #988 <Method void PrintWriter.print(String)>
			printwriter.println(mNeedMenuInvalidate);
	//  411  857:aload_3         
	//  412  858:aload_0         
	//  413  859:getfield        #716 <Field boolean mNeedMenuInvalidate>
	//  414  862:invokevirtual   #1056 <Method void PrintWriter.println(boolean)>
		}
		if(mNoTransactionsBecause != null)
	//* 415  865:aload_0         
	//* 416  866:getfield        #237 <Field String mNoTransactionsBecause>
	//* 417  869:ifnull          892
		{
			printwriter.print(s);
	//  418  872:aload_3         
	//  419  873:aload_1         
	//  420  874:invokevirtual   #988 <Method void PrintWriter.print(String)>
			printwriter.print("  mNoTransactionsBecause=");
	//  421  877:aload_3         
	//  422  878:ldc2            #1060 <String "  mNoTransactionsBecause=">
	//  423  881:invokevirtual   #988 <Method void PrintWriter.print(String)>
			printwriter.println(mNoTransactionsBecause);
	//  424  884:aload_3         
	//  425  885:aload_0         
	//  426  886:getfield        #237 <Field String mNoTransactionsBecause>
	//  427  889:invokevirtual   #1004 <Method void PrintWriter.println(String)>
		}
		if(mAvailIndices != null && mAvailIndices.size() > 0)
	//* 428  892:aload_0         
	//* 429  893:getfield        #1062 <Field ArrayList mAvailIndices>
	//* 430  896:ifnull          935
	//* 431  899:aload_0         
	//* 432  900:getfield        #1062 <Field ArrayList mAvailIndices>
	//* 433  903:invokevirtual   #188 <Method int ArrayList.size()>
	//* 434  906:ifle            935
		{
			printwriter.print(s);
	//  435  909:aload_3         
	//  436  910:aload_1         
	//  437  911:invokevirtual   #988 <Method void PrintWriter.print(String)>
			printwriter.print("  mAvailIndices: ");
	//  438  914:aload_3         
	//  439  915:ldc2            #1064 <String "  mAvailIndices: ">
	//  440  918:invokevirtual   #988 <Method void PrintWriter.print(String)>
			printwriter.println(Arrays.toString(mAvailIndices.toArray()));
	//  441  921:aload_3         
	//  442  922:aload_0         
	//  443  923:getfield        #1062 <Field ArrayList mAvailIndices>
	//  444  926:invokevirtual   #1031 <Method Object[] ArrayList.toArray()>
	//  445  929:invokestatic    #1036 <Method String Arrays.toString(Object[])>
	//  446  932:invokevirtual   #1004 <Method void PrintWriter.println(String)>
		}
		return;
	//  447  935:return          
	}

	public void enqueueAction(OpGenerator opgenerator, boolean flag)
	{
		if(!flag)
	//*   0    0:iload_2         
	//*   1    1:ifne            8
			checkStateLoss();
	//    2    4:aload_0         
	//    3    5:invokespecial   #352 <Method void checkStateLoss()>
		this;
	//    4    8:aload_0         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		if(mDestroyed || mHost == null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #821 <Field boolean mDestroyed>
	//*   8   14:ifne            24
	//*   9   17:aload_0         
	//*  10   18:getfield        #337 <Field FragmentHostCallback mHost>
	//*  11   21:ifnonnull       35
			throw new IllegalStateException("Activity has been destroyed");
	//   12   24:new             #230 <Class IllegalStateException>
	//   13   27:dup             
	//   14   28:ldc2            #1068 <String "Activity has been destroyed">
	//   15   31:invokespecial   #235 <Method void IllegalStateException(String)>
	//   16   34:athrow          
		if(mPendingActions == null)
	//*  17   35:aload_0         
	//*  18   36:getfield        #459 <Field ArrayList mPendingActions>
	//*  19   39:ifnonnull       53
			mPendingActions = new ArrayList();
	//   20   42:aload_0         
	//   21   43:new             #184 <Class ArrayList>
	//   22   46:dup             
	//   23   47:invokespecial   #353 <Method void ArrayList()>
	//   24   50:putfield        #459 <Field ArrayList mPendingActions>
		mPendingActions.add(((Object) (opgenerator)));
	//   25   53:aload_0         
	//   26   54:getfield        #459 <Field ArrayList mPendingActions>
	//   27   57:aload_1         
	//   28   58:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
	//   29   61:pop             
		scheduleCommit();
	//   30   62:aload_0         
	//   31   63:invokespecial   #166 <Method void scheduleCommit()>
		this;
	//   32   66:aload_0         
		JVM INSTR monitorexit ;
	//   33   67:monitorexit     
		return;
	//   34   68:return          
		opgenerator;
	//   35   69:astore_1        
	//*  36   70:aload_0         
		throw opgenerator;
	//   37   71:monitorexit     
	//   38   72:aload_1         
	//   39   73:athrow          
	}

	void ensureInflatedFragmentView(Fragment fragment)
	{
		if(fragment.mFromLayout && !fragment.mPerformedCreateView)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1072 <Field boolean Fragment.mFromLayout>
	//*   2    4:ifeq            106
	//*   3    7:aload_1         
	//*   4    8:getfield        #1075 <Field boolean Fragment.mPerformedCreateView>
	//*   5   11:ifne            106
		{
			fragment.mView = fragment.performCreateView(fragment.getLayoutInflater(fragment.mSavedFragmentState), ((ViewGroup) (null)), fragment.mSavedFragmentState);
	//    6   14:aload_1         
	//    7   15:aload_1         
	//    8   16:aload_1         
	//    9   17:aload_1         
	//   10   18:getfield        #1078 <Field Bundle Fragment.mSavedFragmentState>
	//   11   21:invokevirtual   #1082 <Method android.view.LayoutInflater Fragment.getLayoutInflater(Bundle)>
	//   12   24:aconst_null     
	//   13   25:aload_1         
	//   14   26:getfield        #1078 <Field Bundle Fragment.mSavedFragmentState>
	//   15   29:invokevirtual   #1086 <Method View Fragment.performCreateView(android.view.LayoutInflater, ViewGroup, Bundle)>
	//   16   32:putfield        #211 <Field View Fragment.mView>
			if(fragment.mView != null)
	//*  17   35:aload_1         
	//*  18   36:getfield        #211 <Field View Fragment.mView>
	//*  19   39:ifnull          101
			{
				fragment.mInnerView = fragment.mView;
	//   20   42:aload_1         
	//   21   43:aload_1         
	//   22   44:getfield        #211 <Field View Fragment.mView>
	//   23   47:putfield        #1089 <Field View Fragment.mInnerView>
				fragment.mView.setSaveFromParentEnabled(false);
	//   24   50:aload_1         
	//   25   51:getfield        #211 <Field View Fragment.mView>
	//   26   54:iconst_0        
	//   27   55:invokevirtual   #1092 <Method void View.setSaveFromParentEnabled(boolean)>
				if(fragment.mHidden)
	//*  28   58:aload_1         
	//*  29   59:getfield        #214 <Field boolean Fragment.mHidden>
	//*  30   62:ifeq            74
					fragment.mView.setVisibility(8);
	//   31   65:aload_1         
	//   32   66:getfield        #211 <Field View Fragment.mView>
	//   33   69:bipush          8
	//   34   71:invokevirtual   #514 <Method void View.setVisibility(int)>
				fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
	//   35   74:aload_1         
	//   36   75:aload_1         
	//   37   76:getfield        #211 <Field View Fragment.mView>
	//   38   79:aload_1         
	//   39   80:getfield        #1078 <Field Bundle Fragment.mSavedFragmentState>
	//   40   83:invokevirtual   #1096 <Method void Fragment.onViewCreated(View, Bundle)>
				dispatchOnFragmentViewCreated(fragment, fragment.mView, fragment.mSavedFragmentState, false);
	//   41   86:aload_0         
	//   42   87:aload_1         
	//   43   88:aload_1         
	//   44   89:getfield        #211 <Field View Fragment.mView>
	//   45   92:aload_1         
	//   46   93:getfield        #1078 <Field Bundle Fragment.mSavedFragmentState>
	//   47   96:iconst_0        
	//   48   97:invokevirtual   #936 <Method void dispatchOnFragmentViewCreated(Fragment, View, Bundle, boolean)>
				return;
	//   49  100:return          
			}
			fragment.mInnerView = null;
	//   50  101:aload_1         
	//   51  102:aconst_null     
	//   52  103:putfield        #1089 <Field View Fragment.mInnerView>
		}
	//   53  106:return          
	}

	public boolean execPendingActions()
	{
		boolean flag;
		ensureExecReady(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #540 <Method void ensureExecReady(boolean)>
		flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_1        
_L2:
		if(!generateOpsForPendingActions(mTmpRecords, mTmpIsPop))
			break; /* Loop/switch isn't completed */
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #260 <Field ArrayList mTmpRecords>
	//    8   12:aload_0         
	//    9   13:getfield        #255 <Field ArrayList mTmpIsPop>
	//   10   16:invokespecial   #1098 <Method boolean generateOpsForPendingActions(ArrayList, ArrayList)>
	//   11   19:ifeq            58
		mExecutingActions = true;
	//   12   22:aload_0         
	//   13   23:iconst_1        
	//   14   24:putfield        #253 <Field boolean mExecutingActions>
		optimizeAndExecuteOps(mTmpRecords, mTmpIsPop);
	//   15   27:aload_0         
	//   16   28:aload_0         
	//   17   29:getfield        #260 <Field ArrayList mTmpRecords>
	//   18   32:aload_0         
	//   19   33:getfield        #255 <Field ArrayList mTmpIsPop>
	//   20   36:invokespecial   #554 <Method void optimizeAndExecuteOps(ArrayList, ArrayList)>
		cleanupExec();
	//   21   39:aload_0         
	//   22   40:invokespecial   #556 <Method void cleanupExec()>
		break MISSING_BLOCK_LABEL_53;
	//   23   43:goto            53
		Exception exception;
		exception;
	//   24   46:astore_2        
		cleanupExec();
	//   25   47:aload_0         
	//   26   48:invokespecial   #556 <Method void cleanupExec()>
		throw exception;
	//   27   51:aload_2         
	//   28   52:athrow          
		flag = true;
	//   29   53:iconst_1        
	//   30   54:istore_1        
		if(true) goto _L2; else goto _L1
	//   31   55:goto            7
_L1:
		doPendingDeferredStart();
	//   32   58:aload_0         
	//   33   59:invokevirtual   #559 <Method void doPendingDeferredStart()>
		return flag;
	//   34   62:iload_1         
	//   35   63:ireturn         
	}

	public void execSingleAction(OpGenerator opgenerator, boolean flag)
	{
		ensureExecReady(flag);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokespecial   #540 <Method void ensureExecReady(boolean)>
		if(!opgenerator.generateOps(mTmpRecords, mTmpIsPop))
			break MISSING_BLOCK_LABEL_53;
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #260 <Field ArrayList mTmpRecords>
	//    6   10:aload_0         
	//    7   11:getfield        #255 <Field ArrayList mTmpIsPop>
	//    8   14:invokeinterface #462 <Method boolean FragmentManagerImpl$OpGenerator.generateOps(ArrayList, ArrayList)>
	//    9   19:ifeq            53
		mExecutingActions = true;
	//   10   22:aload_0         
	//   11   23:iconst_1        
	//   12   24:putfield        #253 <Field boolean mExecutingActions>
		optimizeAndExecuteOps(mTmpRecords, mTmpIsPop);
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #260 <Field ArrayList mTmpRecords>
	//   16   32:aload_0         
	//   17   33:getfield        #255 <Field ArrayList mTmpIsPop>
	//   18   36:invokespecial   #554 <Method void optimizeAndExecuteOps(ArrayList, ArrayList)>
		cleanupExec();
	//   19   39:aload_0         
	//   20   40:invokespecial   #556 <Method void cleanupExec()>
		break MISSING_BLOCK_LABEL_53;
	//   21   43:goto            53
		opgenerator;
	//   22   46:astore_1        
		cleanupExec();
	//   23   47:aload_0         
	//   24   48:invokespecial   #556 <Method void cleanupExec()>
		throw opgenerator;
	//   25   51:aload_1         
	//   26   52:athrow          
		doPendingDeferredStart();
	//   27   53:aload_0         
	//   28   54:invokevirtual   #559 <Method void doPendingDeferredStart()>
		return;
	//   29   57:return          
	}

	public boolean executePendingTransactions()
	{
		boolean flag = execPendingActions();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #538 <Method boolean execPendingActions()>
	//    2    4:istore_1        
		forcePostponedTransactions();
	//    3    5:aload_0         
	//    4    6:invokespecial   #1102 <Method void forcePostponedTransactions()>
		return flag;
	//    5    9:iload_1         
	//    6   10:ireturn         
	}

	public Fragment findFragmentById(int i)
	{
		if(mAdded != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #182 <Field ArrayList mAdded>
	//*   2    4:ifnull          54
		{
			for(int j = mAdded.size() - 1; j >= 0; j--)
	//*   3    7:aload_0         
	//*   4    8:getfield        #182 <Field ArrayList mAdded>
	//*   5   11:invokevirtual   #188 <Method int ArrayList.size()>
	//*   6   14:iconst_1        
	//*   7   15:isub            
	//*   8   16:istore_2        
	//*   9   17:iload_2         
	//*  10   18:iflt            54
			{
				Fragment fragment = (Fragment)mAdded.get(j);
	//   11   21:aload_0         
	//   12   22:getfield        #182 <Field ArrayList mAdded>
	//   13   25:iload_2         
	//   14   26:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   15   29:checkcast       #194 <Class Fragment>
	//   16   32:astore_3        
				if(fragment != null && fragment.mFragmentId == i)
	//*  17   33:aload_3         
	//*  18   34:ifnull          47
	//*  19   37:aload_3         
	//*  20   38:getfield        #1107 <Field int Fragment.mFragmentId>
	//*  21   41:iload_1         
	//*  22   42:icmpne          47
					return fragment;
	//   23   45:aload_3         
	//   24   46:areturn         
			}

	//   25   47:iload_2         
	//   26   48:iconst_1        
	//   27   49:isub            
	//   28   50:istore_2        
		}
	//*  29   51:goto            17
		if(mActive != null)
	//*  30   54:aload_0         
	//*  31   55:getfield        #285 <Field ArrayList mActive>
	//*  32   58:ifnull          108
		{
			for(int k = mActive.size() - 1; k >= 0; k--)
	//*  33   61:aload_0         
	//*  34   62:getfield        #285 <Field ArrayList mActive>
	//*  35   65:invokevirtual   #188 <Method int ArrayList.size()>
	//*  36   68:iconst_1        
	//*  37   69:isub            
	//*  38   70:istore_2        
	//*  39   71:iload_2         
	//*  40   72:iflt            108
			{
				Fragment fragment1 = (Fragment)mActive.get(k);
	//   41   75:aload_0         
	//   42   76:getfield        #285 <Field ArrayList mActive>
	//   43   79:iload_2         
	//   44   80:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   45   83:checkcast       #194 <Class Fragment>
	//   46   86:astore_3        
				if(fragment1 != null && fragment1.mFragmentId == i)
	//*  47   87:aload_3         
	//*  48   88:ifnull          101
	//*  49   91:aload_3         
	//*  50   92:getfield        #1107 <Field int Fragment.mFragmentId>
	//*  51   95:iload_1         
	//*  52   96:icmpne          101
					return fragment1;
	//   53   99:aload_3         
	//   54  100:areturn         
			}

	//   55  101:iload_2         
	//   56  102:iconst_1        
	//   57  103:isub            
	//   58  104:istore_2        
		}
	//*  59  105:goto            71
		return null;
	//   60  108:aconst_null     
	//   61  109:areturn         
	}

	public Fragment findFragmentByTag(String s)
	{
		if(mAdded != null && s != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #182 <Field ArrayList mAdded>
	//*   2    4:ifnull          61
	//*   3    7:aload_1         
	//*   4    8:ifnull          61
		{
			for(int i = mAdded.size() - 1; i >= 0; i--)
	//*   5   11:aload_0         
	//*   6   12:getfield        #182 <Field ArrayList mAdded>
	//*   7   15:invokevirtual   #188 <Method int ArrayList.size()>
	//*   8   18:iconst_1        
	//*   9   19:isub            
	//*  10   20:istore_2        
	//*  11   21:iload_2         
	//*  12   22:iflt            61
			{
				Fragment fragment = (Fragment)mAdded.get(i);
	//   13   25:aload_0         
	//   14   26:getfield        #182 <Field ArrayList mAdded>
	//   15   29:iload_2         
	//   16   30:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   17   33:checkcast       #194 <Class Fragment>
	//   18   36:astore_3        
				if(fragment != null && s.equals(((Object) (fragment.mTag))))
	//*  19   37:aload_3         
	//*  20   38:ifnull          54
	//*  21   41:aload_1         
	//*  22   42:aload_3         
	//*  23   43:getfield        #1112 <Field String Fragment.mTag>
	//*  24   46:invokevirtual   #1115 <Method boolean String.equals(Object)>
	//*  25   49:ifeq            54
					return fragment;
	//   26   52:aload_3         
	//   27   53:areturn         
			}

	//   28   54:iload_2         
	//   29   55:iconst_1        
	//   30   56:isub            
	//   31   57:istore_2        
		}
	//*  32   58:goto            21
		if(mActive != null && s != null)
	//*  33   61:aload_0         
	//*  34   62:getfield        #285 <Field ArrayList mActive>
	//*  35   65:ifnull          122
	//*  36   68:aload_1         
	//*  37   69:ifnull          122
		{
			for(int j = mActive.size() - 1; j >= 0; j--)
	//*  38   72:aload_0         
	//*  39   73:getfield        #285 <Field ArrayList mActive>
	//*  40   76:invokevirtual   #188 <Method int ArrayList.size()>
	//*  41   79:iconst_1        
	//*  42   80:isub            
	//*  43   81:istore_2        
	//*  44   82:iload_2         
	//*  45   83:iflt            122
			{
				Fragment fragment1 = (Fragment)mActive.get(j);
	//   46   86:aload_0         
	//   47   87:getfield        #285 <Field ArrayList mActive>
	//   48   90:iload_2         
	//   49   91:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   50   94:checkcast       #194 <Class Fragment>
	//   51   97:astore_3        
				if(fragment1 != null && s.equals(((Object) (fragment1.mTag))))
	//*  52   98:aload_3         
	//*  53   99:ifnull          115
	//*  54  102:aload_1         
	//*  55  103:aload_3         
	//*  56  104:getfield        #1112 <Field String Fragment.mTag>
	//*  57  107:invokevirtual   #1115 <Method boolean String.equals(Object)>
	//*  58  110:ifeq            115
					return fragment1;
	//   59  113:aload_3         
	//   60  114:areturn         
			}

	//   61  115:iload_2         
	//   62  116:iconst_1        
	//   63  117:isub            
	//   64  118:istore_2        
		}
	//*  65  119:goto            82
		return null;
	//   66  122:aconst_null     
	//   67  123:areturn         
	}

	public Fragment findFragmentByWho(String s)
	{
		if(mActive != null && s != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #285 <Field ArrayList mActive>
	//*   2    4:ifnull          60
	//*   3    7:aload_1         
	//*   4    8:ifnull          60
		{
			for(int i = mActive.size() - 1; i >= 0; i--)
	//*   5   11:aload_0         
	//*   6   12:getfield        #285 <Field ArrayList mActive>
	//*   7   15:invokevirtual   #188 <Method int ArrayList.size()>
	//*   8   18:iconst_1        
	//*   9   19:isub            
	//*  10   20:istore_2        
	//*  11   21:iload_2         
	//*  12   22:iflt            60
			{
				Fragment fragment = (Fragment)mActive.get(i);
	//   13   25:aload_0         
	//   14   26:getfield        #285 <Field ArrayList mActive>
	//   15   29:iload_2         
	//   16   30:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   17   33:checkcast       #194 <Class Fragment>
	//   18   36:astore_3        
				if(fragment == null)
					continue;
	//   19   37:aload_3         
	//   20   38:ifnull          53
				fragment = fragment.findFragmentByWho(s);
	//   21   41:aload_3         
	//   22   42:aload_1         
	//   23   43:invokevirtual   #1118 <Method Fragment Fragment.findFragmentByWho(String)>
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
	//    3    3:getfield        #728 <Field ArrayList mBackStackIndices>
	//    4    6:iload_1         
	//    5    7:aconst_null     
	//    6    8:invokevirtual   #748 <Method Object ArrayList.set(int, Object)>
	//    7   11:pop             
		if(mAvailBackStackIndices == null)
	//*   8   12:aload_0         
	//*   9   13:getfield        #726 <Field ArrayList mAvailBackStackIndices>
	//*  10   16:ifnonnull       30
			mAvailBackStackIndices = new ArrayList();
	//   11   19:aload_0         
	//   12   20:new             #184 <Class ArrayList>
	//   13   23:dup             
	//   14   24:invokespecial   #353 <Method void ArrayList()>
	//   15   27:putfield        #726 <Field ArrayList mAvailBackStackIndices>
		if(DEBUG)
	//*  16   30:getstatic       #120 <Field boolean DEBUG>
	//*  17   33:ifeq            62
			Log.v("FragmentManager", (new StringBuilder()).append("Freeing back stack index ").append(i).toString());
	//   18   36:ldc1            #55  <String "FragmentManager">
	//   19   38:new             #239 <Class StringBuilder>
	//   20   41:dup             
	//   21   42:invokespecial   #240 <Method void StringBuilder()>
	//   22   45:ldc2            #1120 <String "Freeing back stack index ">
	//   23   48:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   24   51:iload_1         
	//   25   52:invokevirtual   #733 <Method StringBuilder StringBuilder.append(int)>
	//   26   55:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   27   58:invokestatic    #690 <Method int Log.v(String, String)>
	//   28   61:pop             
		mAvailBackStackIndices.add(((Object) (Integer.valueOf(i))));
	//   29   62:aload_0         
	//   30   63:getfield        #726 <Field ArrayList mAvailBackStackIndices>
	//   31   66:iload_1         
	//   32   67:invokestatic    #1123 <Method Integer Integer.valueOf(int)>
	//   33   70:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
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
	//*  39   78:aload_0         
		throw exception;
	//   40   79:monitorexit     
	//   41   80:aload_2         
	//   42   81:athrow          
	}

	public FragmentManager.BackStackEntry getBackStackEntryAt(int i)
	{
		return (FragmentManager.BackStackEntry)mBackStack.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #680 <Field ArrayList mBackStack>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #1127 <Class FragmentManager$BackStackEntry>
	//    5   11:areturn         
	}

	public int getBackStackEntryCount()
	{
		if(mBackStack != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #680 <Field ArrayList mBackStack>
	//*   2    4:ifnull          15
			return mBackStack.size();
	//    3    7:aload_0         
	//    4    8:getfield        #680 <Field ArrayList mBackStack>
	//    5   11:invokevirtual   #188 <Method int ArrayList.size()>
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
	//    3    3:invokevirtual   #1136 <Method int Bundle.getInt(String, int)>
	//    4    6:istore_3        
		if(i == -1)
	//*   5    7:iload_3         
	//*   6    8:iconst_m1       
	//*   7    9:icmpne          14
			return null;
	//    8   12:aconst_null     
	//    9   13:areturn         
		if(i >= mActive.size())
	//*  10   14:iload_3         
	//*  11   15:aload_0         
	//*  12   16:getfield        #285 <Field ArrayList mActive>
	//*  13   19:invokevirtual   #188 <Method int ArrayList.size()>
	//*  14   22:icmplt          66
			throwException(((RuntimeException) (new IllegalStateException((new StringBuilder()).append("Fragment no longer exists for key ").append(s).append(": index ").append(i).toString()))));
	//   15   25:aload_0         
	//   16   26:new             #230 <Class IllegalStateException>
	//   17   29:dup             
	//   18   30:new             #239 <Class StringBuilder>
	//   19   33:dup             
	//   20   34:invokespecial   #240 <Method void StringBuilder()>
	//   21   37:ldc2            #1138 <String "Fragment no longer exists for key ">
	//   22   40:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   23   43:aload_2         
	//   24   44:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   25   47:ldc2            #1140 <String ": index ">
	//   26   50:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   27   53:iload_3         
	//   28   54:invokevirtual   #733 <Method StringBuilder StringBuilder.append(int)>
	//   29   57:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   30   60:invokespecial   #235 <Method void IllegalStateException(String)>
	//   31   63:invokespecial   #1142 <Method void throwException(RuntimeException)>
		bundle = ((Bundle) ((Fragment)mActive.get(i)));
	//   32   66:aload_0         
	//   33   67:getfield        #285 <Field ArrayList mActive>
	//   34   70:iload_3         
	//   35   71:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   36   74:checkcast       #194 <Class Fragment>
	//   37   77:astore_1        
		if(bundle == null)
	//*  38   78:aload_1         
	//*  39   79:ifnonnull       123
			throwException(((RuntimeException) (new IllegalStateException((new StringBuilder()).append("Fragment no longer exists for key ").append(s).append(": index ").append(i).toString()))));
	//   40   82:aload_0         
	//   41   83:new             #230 <Class IllegalStateException>
	//   42   86:dup             
	//   43   87:new             #239 <Class StringBuilder>
	//   44   90:dup             
	//   45   91:invokespecial   #240 <Method void StringBuilder()>
	//   46   94:ldc2            #1138 <String "Fragment no longer exists for key ">
	//   47   97:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   48  100:aload_2         
	//   49  101:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   50  104:ldc2            #1140 <String ": index ">
	//   51  107:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   52  110:iload_3         
	//   53  111:invokevirtual   #733 <Method StringBuilder StringBuilder.append(int)>
	//   54  114:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   55  117:invokespecial   #235 <Method void IllegalStateException(String)>
	//   56  120:invokespecial   #1142 <Method void throwException(RuntimeException)>
		return ((Fragment) (bundle));
	//   57  123:aload_1         
	//   58  124:areturn         
	}

	public List getFragments()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #184 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #353 <Method void ArrayList()>
	//    3    7:astore_1        
		if(mActive != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #285 <Field ArrayList mActive>
	//*   6   12:ifnull          26
			((List) (arraylist)).addAll(((java.util.Collection) (mActive)));
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #285 <Field ArrayList mActive>
	//   10   20:invokeinterface #1144 <Method boolean List.addAll(java.util.Collection)>
	//   11   25:pop             
		return ((List) (arraylist));
	//   12   26:aload_1         
	//   13   27:areturn         
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
	//    1    1:getfield        #542 <Field Fragment mPrimaryNav>
	//    2    4:areturn         
	}

	public void hideFragment(Fragment fragment)
	{
		if(DEBUG)
	//*   0    0:getstatic       #120 <Field boolean DEBUG>
	//*   1    3:ifeq            32
			Log.v("FragmentManager", (new StringBuilder()).append("hide: ").append(((Object) (fragment))).toString());
	//    2    6:ldc1            #55  <String "FragmentManager">
	//    3    8:new             #239 <Class StringBuilder>
	//    4   11:dup             
	//    5   12:invokespecial   #240 <Method void StringBuilder()>
	//    6   15:ldc2            #1150 <String "hide: ">
	//    7   18:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//    8   21:aload_1         
	//    9   22:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//   10   25:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   11   28:invokestatic    #690 <Method int Log.v(String, String)>
	//   12   31:pop             
		if(!fragment.mHidden)
	//*  13   32:aload_1         
	//*  14   33:getfield        #214 <Field boolean Fragment.mHidden>
	//*  15   36:ifne            63
		{
			fragment.mHidden = true;
	//   16   39:aload_1         
	//   17   40:iconst_1        
	//   18   41:putfield        #214 <Field boolean Fragment.mHidden>
			boolean flag;
			if(!fragment.mHiddenChanged)
	//*  19   44:aload_1         
	//*  20   45:getfield        #708 <Field boolean Fragment.mHiddenChanged>
	//*  21   48:ifne            56
				flag = true;
	//   22   51:iconst_1        
	//   23   52:istore_2        
			else
	//*  24   53:goto            58
				flag = false;
	//   25   56:iconst_0        
	//   26   57:istore_2        
			fragment.mHiddenChanged = flag;
	//   27   58:aload_1         
	//   28   59:iload_2         
	//   29   60:putfield        #708 <Field boolean Fragment.mHiddenChanged>
		}
	//   30   63:return          
	}

	public boolean isDestroyed()
	{
		return mDestroyed;
	//    0    0:aload_0         
	//    1    1:getfield        #821 <Field boolean mDestroyed>
	//    2    4:ireturn         
	}

	boolean isStateAtLeast(int i)
	{
		return mCurState >= i;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field int mCurState>
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
	//    1    1:getfield        #228 <Field boolean mStateSaved>
	//    2    4:ireturn         
	}

	Animation loadAnimation(Fragment fragment, int i, boolean flag, int j)
	{
		Animation animation = fragment.onCreateAnimation(i, flag, fragment.getNextAnim());
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #200 <Method int Fragment.getNextAnim()>
	//    5    7:invokevirtual   #1157 <Method Animation Fragment.onCreateAnimation(int, boolean, int)>
	//    6   10:astore          5
		if(animation != null)
	//*   7   12:aload           5
	//*   8   14:ifnull          20
			return animation;
	//    9   17:aload           5
	//   10   19:areturn         
		if(fragment.getNextAnim() != 0)
	//*  11   20:aload_1         
	//*  12   21:invokevirtual   #200 <Method int Fragment.getNextAnim()>
	//*  13   24:ifeq            48
		{
			fragment = ((Fragment) (AnimationUtils.loadAnimation(mHost.getContext(), fragment.getNextAnim())));
	//   14   27:aload_0         
	//   15   28:getfield        #337 <Field FragmentHostCallback mHost>
	//   16   31:invokevirtual   #1161 <Method Context FragmentHostCallback.getContext()>
	//   17   34:aload_1         
	//   18   35:invokevirtual   #200 <Method int Fragment.getNextAnim()>
	//   19   38:invokestatic    #1166 <Method Animation AnimationUtils.loadAnimation(Context, int)>
	//   20   41:astore_1        
			if(fragment != null)
	//*  21   42:aload_1         
	//*  22   43:ifnull          48
				return ((Animation) (fragment));
	//   23   46:aload_1         
	//   24   47:areturn         
		}
		if(i == 0)
	//*  25   48:iload_2         
	//*  26   49:ifne            54
			return null;
	//   27   52:aconst_null     
	//   28   53:areturn         
		i = transitToStyleIndex(i, flag);
	//   29   54:iload_2         
	//   30   55:iload_3         
	//   31   56:invokestatic    #1168 <Method int transitToStyleIndex(int, boolean)>
	//   32   59:istore_2        
		if(i < 0)
	//*  33   60:iload_2         
	//*  34   61:ifge            66
			return null;
	//   35   64:aconst_null     
	//   36   65:areturn         
		switch(i)
	//*  37   66:iload_2         
		{
	//*  38   67:tableswitch     1 6: default 104
	//	               1 107
	//	               2 124
	//	               3 141
	//	               4 158
	//	               5 175
	//	               6 188
	//*  39  104:goto            201
		case 1: // '\001'
			return makeOpenCloseAnimation(mHost.getContext(), 1.125F, 1.0F, 0.0F, 1.0F);
	//   40  107:aload_0         
	//   41  108:getfield        #337 <Field FragmentHostCallback mHost>
	//   42  111:invokevirtual   #1161 <Method Context FragmentHostCallback.getContext()>
	//   43  114:ldc2            #1169 <Float 1.125F>
	//   44  117:fconst_1        
	//   45  118:fconst_0        
	//   46  119:fconst_1        
	//   47  120:invokestatic    #1171 <Method Animation makeOpenCloseAnimation(Context, float, float, float, float)>
	//   48  123:areturn         

		case 2: // '\002'
			return makeOpenCloseAnimation(mHost.getContext(), 1.0F, 0.975F, 1.0F, 0.0F);
	//   49  124:aload_0         
	//   50  125:getfield        #337 <Field FragmentHostCallback mHost>
	//   51  128:invokevirtual   #1161 <Method Context FragmentHostCallback.getContext()>
	//   52  131:fconst_1        
	//   53  132:ldc2            #1172 <Float 0.975F>
	//   54  135:fconst_1        
	//   55  136:fconst_0        
	//   56  137:invokestatic    #1171 <Method Animation makeOpenCloseAnimation(Context, float, float, float, float)>
	//   57  140:areturn         

		case 3: // '\003'
			return makeOpenCloseAnimation(mHost.getContext(), 0.975F, 1.0F, 0.0F, 1.0F);
	//   58  141:aload_0         
	//   59  142:getfield        #337 <Field FragmentHostCallback mHost>
	//   60  145:invokevirtual   #1161 <Method Context FragmentHostCallback.getContext()>
	//   61  148:ldc2            #1172 <Float 0.975F>
	//   62  151:fconst_1        
	//   63  152:fconst_0        
	//   64  153:fconst_1        
	//   65  154:invokestatic    #1171 <Method Animation makeOpenCloseAnimation(Context, float, float, float, float)>
	//   66  157:areturn         

		case 4: // '\004'
			return makeOpenCloseAnimation(mHost.getContext(), 1.0F, 1.075F, 1.0F, 0.0F);
	//   67  158:aload_0         
	//   68  159:getfield        #337 <Field FragmentHostCallback mHost>
	//   69  162:invokevirtual   #1161 <Method Context FragmentHostCallback.getContext()>
	//   70  165:fconst_1        
	//   71  166:ldc2            #1173 <Float 1.075F>
	//   72  169:fconst_1        
	//   73  170:fconst_0        
	//   74  171:invokestatic    #1171 <Method Animation makeOpenCloseAnimation(Context, float, float, float, float)>
	//   75  174:areturn         

		case 5: // '\005'
			return makeFadeAnimation(mHost.getContext(), 0.0F, 1.0F);
	//   76  175:aload_0         
	//   77  176:getfield        #337 <Field FragmentHostCallback mHost>
	//   78  179:invokevirtual   #1161 <Method Context FragmentHostCallback.getContext()>
	//   79  182:fconst_0        
	//   80  183:fconst_1        
	//   81  184:invokestatic    #1175 <Method Animation makeFadeAnimation(Context, float, float)>
	//   82  187:areturn         

		case 6: // '\006'
			return makeFadeAnimation(mHost.getContext(), 1.0F, 0.0F);
	//   83  188:aload_0         
	//   84  189:getfield        #337 <Field FragmentHostCallback mHost>
	//   85  192:invokevirtual   #1161 <Method Context FragmentHostCallback.getContext()>
	//   86  195:fconst_1        
	//   87  196:fconst_0        
	//   88  197:invokestatic    #1175 <Method Animation makeFadeAnimation(Context, float, float)>
	//   89  200:areturn         
		}
		i = j;
	//   90  201:iload           4
	//   91  203:istore_2        
		if(j == 0)
	//*  92  204:iload           4
	//*  93  206:ifne            230
		{
			i = j;
	//   94  209:iload           4
	//   95  211:istore_2        
			if(mHost.onHasWindowAnimations())
	//*  96  212:aload_0         
	//*  97  213:getfield        #337 <Field FragmentHostCallback mHost>
	//*  98  216:invokevirtual   #1178 <Method boolean FragmentHostCallback.onHasWindowAnimations()>
	//*  99  219:ifeq            230
				i = mHost.onGetWindowAnimations();
	//  100  222:aload_0         
	//  101  223:getfield        #337 <Field FragmentHostCallback mHost>
	//  102  226:invokevirtual   #1181 <Method int FragmentHostCallback.onGetWindowAnimations()>
	//  103  229:istore_2        
		}
		if(i == 0)
	//* 104  230:iload_2         
	//* 105  231:ifne            236
			return null;
	//  106  234:aconst_null     
	//  107  235:areturn         
		else
			return null;
	//  108  236:aconst_null     
	//  109  237:areturn         
	}

	void makeActive(Fragment fragment)
	{
		if(fragment.mIndex >= 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1182 <Field int Fragment.mIndex>
	//*   2    4:iflt            8
			return;
	//    3    7:return          
		if(mAvailIndices == null || mAvailIndices.size() <= 0)
	//*   4    8:aload_0         
	//*   5    9:getfield        #1062 <Field ArrayList mAvailIndices>
	//*   6   12:ifnull          25
	//*   7   15:aload_0         
	//*   8   16:getfield        #1062 <Field ArrayList mAvailIndices>
	//*   9   19:invokevirtual   #188 <Method int ArrayList.size()>
	//*  10   22:ifgt            70
		{
			if(mActive == null)
	//*  11   25:aload_0         
	//*  12   26:getfield        #285 <Field ArrayList mActive>
	//*  13   29:ifnonnull       43
				mActive = new ArrayList();
	//   14   32:aload_0         
	//   15   33:new             #184 <Class ArrayList>
	//   16   36:dup             
	//   17   37:invokespecial   #353 <Method void ArrayList()>
	//   18   40:putfield        #285 <Field ArrayList mActive>
			fragment.setIndex(mActive.size(), mParent);
	//   19   43:aload_1         
	//   20   44:aload_0         
	//   21   45:getfield        #285 <Field ArrayList mActive>
	//   22   48:invokevirtual   #188 <Method int ArrayList.size()>
	//   23   51:aload_0         
	//   24   52:getfield        #756 <Field Fragment mParent>
	//   25   55:invokevirtual   #1186 <Method void Fragment.setIndex(int, Fragment)>
			mActive.add(((Object) (fragment)));
	//   26   58:aload_0         
	//   27   59:getfield        #285 <Field ArrayList mActive>
	//   28   62:aload_1         
	//   29   63:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
	//   30   66:pop             
		} else
	//*  31   67:goto            113
		{
			fragment.setIndex(((Integer)mAvailIndices.remove(mAvailIndices.size() - 1)).intValue(), mParent);
	//   32   70:aload_1         
	//   33   71:aload_0         
	//   34   72:getfield        #1062 <Field ArrayList mAvailIndices>
	//   35   75:aload_0         
	//   36   76:getfield        #1062 <Field ArrayList mAvailIndices>
	//   37   79:invokevirtual   #188 <Method int ArrayList.size()>
	//   38   82:iconst_1        
	//   39   83:isub            
	//   40   84:invokevirtual   #442 <Method Object ArrayList.remove(int)>
	//   41   87:checkcast       #737 <Class Integer>
	//   42   90:invokevirtual   #740 <Method int Integer.intValue()>
	//   43   93:aload_0         
	//   44   94:getfield        #756 <Field Fragment mParent>
	//   45   97:invokevirtual   #1186 <Method void Fragment.setIndex(int, Fragment)>
			mActive.set(fragment.mIndex, ((Object) (fragment)));
	//   46  100:aload_0         
	//   47  101:getfield        #285 <Field ArrayList mActive>
	//   48  104:aload_1         
	//   49  105:getfield        #1182 <Field int Fragment.mIndex>
	//   50  108:aload_1         
	//   51  109:invokevirtual   #748 <Method Object ArrayList.set(int, Object)>
	//   52  112:pop             
		}
		if(DEBUG)
	//*  53  113:getstatic       #120 <Field boolean DEBUG>
	//*  54  116:ifeq            145
			Log.v("FragmentManager", (new StringBuilder()).append("Allocated fragment index ").append(((Object) (fragment))).toString());
	//   55  119:ldc1            #55  <String "FragmentManager">
	//   56  121:new             #239 <Class StringBuilder>
	//   57  124:dup             
	//   58  125:invokespecial   #240 <Method void StringBuilder()>
	//   59  128:ldc2            #1188 <String "Allocated fragment index ">
	//   60  131:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   61  134:aload_1         
	//   62  135:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//   63  138:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   64  141:invokestatic    #690 <Method int Log.v(String, String)>
	//   65  144:pop             
	//   66  145:return          
	}

	void makeInactive(Fragment fragment)
	{
		if(fragment.mIndex < 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1182 <Field int Fragment.mIndex>
	//*   2    4:ifge            8
			return;
	//    3    7:return          
		if(DEBUG)
	//*   4    8:getstatic       #120 <Field boolean DEBUG>
	//*   5   11:ifeq            40
			Log.v("FragmentManager", (new StringBuilder()).append("Freeing fragment index ").append(((Object) (fragment))).toString());
	//    6   14:ldc1            #55  <String "FragmentManager">
	//    7   16:new             #239 <Class StringBuilder>
	//    8   19:dup             
	//    9   20:invokespecial   #240 <Method void StringBuilder()>
	//   10   23:ldc2            #1191 <String "Freeing fragment index ">
	//   11   26:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   12   29:aload_1         
	//   13   30:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//   14   33:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   15   36:invokestatic    #690 <Method int Log.v(String, String)>
	//   16   39:pop             
		mActive.set(fragment.mIndex, ((Object) (null)));
	//   17   40:aload_0         
	//   18   41:getfield        #285 <Field ArrayList mActive>
	//   19   44:aload_1         
	//   20   45:getfield        #1182 <Field int Fragment.mIndex>
	//   21   48:aconst_null     
	//   22   49:invokevirtual   #748 <Method Object ArrayList.set(int, Object)>
	//   23   52:pop             
		if(mAvailIndices == null)
	//*  24   53:aload_0         
	//*  25   54:getfield        #1062 <Field ArrayList mAvailIndices>
	//*  26   57:ifnonnull       71
			mAvailIndices = new ArrayList();
	//   27   60:aload_0         
	//   28   61:new             #184 <Class ArrayList>
	//   29   64:dup             
	//   30   65:invokespecial   #353 <Method void ArrayList()>
	//   31   68:putfield        #1062 <Field ArrayList mAvailIndices>
		mAvailIndices.add(((Object) (Integer.valueOf(fragment.mIndex))));
	//   32   71:aload_0         
	//   33   72:getfield        #1062 <Field ArrayList mAvailIndices>
	//   34   75:aload_1         
	//   35   76:getfield        #1182 <Field int Fragment.mIndex>
	//   36   79:invokestatic    #1123 <Method Integer Integer.valueOf(int)>
	//   37   82:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
	//   38   85:pop             
		mHost.inactivateFragment(fragment.mWho);
	//   39   86:aload_0         
	//   40   87:getfield        #337 <Field FragmentHostCallback mHost>
	//   41   90:aload_1         
	//   42   91:getfield        #1194 <Field String Fragment.mWho>
	//   43   94:invokevirtual   #1197 <Method void FragmentHostCallback.inactivateFragment(String)>
		fragment.initState();
	//   44   97:aload_1         
	//   45   98:invokevirtual   #1200 <Method void Fragment.initState()>
	//   46  101:return          
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
	//    4    6:getfield        #153 <Field int mCurState>
	//    5    9:istore_3        
		int i = k;
	//    6   10:iload_3         
	//    7   11:istore_2        
		if(fragment.mRemoving)
	//*   8   12:aload_1         
	//*   9   13:getfield        #705 <Field boolean Fragment.mRemoving>
	//*  10   16:ifeq            41
			if(fragment.isInBackStack())
	//*  11   19:aload_1         
	//*  12   20:invokevirtual   #1204 <Method boolean Fragment.isInBackStack()>
	//*  13   23:ifeq            35
				i = Math.min(k, 1);
	//   14   26:iload_3         
	//   15   27:iconst_1        
	//   16   28:invokestatic    #180 <Method int Math.min(int, int)>
	//   17   31:istore_2        
			else
	//*  18   32:goto            41
				i = Math.min(k, 0);
	//   19   35:iload_3         
	//   20   36:iconst_0        
	//   21   37:invokestatic    #180 <Method int Math.min(int, int)>
	//   22   40:istore_2        
		moveToState(fragment, i, fragment.getNextTransition(), fragment.getNextTransitionStyle(), false);
	//   23   41:aload_0         
	//   24   42:aload_1         
	//   25   43:iload_2         
	//   26   44:aload_1         
	//   27   45:invokevirtual   #203 <Method int Fragment.getNextTransition()>
	//   28   48:aload_1         
	//   29   49:invokevirtual   #768 <Method int Fragment.getNextTransitionStyle()>
	//   30   52:iconst_0        
	//   31   53:invokevirtual   #207 <Method void moveToState(Fragment, int, int, int, boolean)>
		if(fragment.mView != null)
	//*  32   56:aload_1         
	//*  33   57:getfield        #211 <Field View Fragment.mView>
	//*  34   60:ifnull          230
		{
			Object obj = ((Object) (findFragmentUnder(fragment)));
	//   35   63:aload_0         
	//   36   64:aload_1         
	//   37   65:invokespecial   #1206 <Method Fragment findFragmentUnder(Fragment)>
	//   38   68:astore          4
			if(obj != null)
	//*  39   70:aload           4
	//*  40   72:ifnull          127
			{
				obj = ((Object) (((Fragment) (obj)).mView));
	//   41   75:aload           4
	//   42   77:getfield        #211 <Field View Fragment.mView>
	//   43   80:astore          4
				ViewGroup viewgroup = fragment.mContainer;
	//   44   82:aload_1         
	//   45   83:getfield        #451 <Field ViewGroup Fragment.mContainer>
	//   46   86:astore          5
				int j = viewgroup.indexOfChild(((View) (obj)));
	//   47   88:aload           5
	//   48   90:aload           4
	//   49   92:invokevirtual   #1212 <Method int ViewGroup.indexOfChild(View)>
	//   50   95:istore_2        
				int l = viewgroup.indexOfChild(fragment.mView);
	//   51   96:aload           5
	//   52   98:aload_1         
	//   53   99:getfield        #211 <Field View Fragment.mView>
	//   54  102:invokevirtual   #1212 <Method int ViewGroup.indexOfChild(View)>
	//   55  105:istore_3        
				if(l < j)
	//*  56  106:iload_3         
	//*  57  107:iload_2         
	//*  58  108:icmpge          127
				{
					viewgroup.removeViewAt(l);
	//   59  111:aload           5
	//   60  113:iload_3         
	//   61  114:invokevirtual   #1215 <Method void ViewGroup.removeViewAt(int)>
					viewgroup.addView(fragment.mView, j);
	//   62  117:aload           5
	//   63  119:aload_1         
	//   64  120:getfield        #211 <Field View Fragment.mView>
	//   65  123:iload_2         
	//   66  124:invokevirtual   #1219 <Method void ViewGroup.addView(View, int)>
				}
			}
			if(fragment.mIsNewlyAdded && fragment.mContainer != null)
	//*  67  127:aload_1         
	//*  68  128:getfield        #217 <Field boolean Fragment.mIsNewlyAdded>
	//*  69  131:ifeq            230
	//*  70  134:aload_1         
	//*  71  135:getfield        #451 <Field ViewGroup Fragment.mContainer>
	//*  72  138:ifnull          230
			{
				if(android.os.Build.VERSION.SDK_INT < 11)
	//*  73  141:getstatic       #125 <Field int android.os.Build$VERSION.SDK_INT>
	//*  74  144:bipush          11
	//*  75  146:icmpge          160
					fragment.mView.setVisibility(0);
	//   76  149:aload_1         
	//   77  150:getfield        #211 <Field View Fragment.mView>
	//   78  153:iconst_0        
	//   79  154:invokevirtual   #514 <Method void View.setVisibility(int)>
				else
	//*  80  157:goto            180
				if(fragment.mPostponedAlpha > 0.0F)
	//*  81  160:aload_1         
	//*  82  161:getfield        #298 <Field float Fragment.mPostponedAlpha>
	//*  83  164:fconst_0        
	//*  84  165:fcmpl           
	//*  85  166:ifle            180
					fragment.mView.setAlpha(fragment.mPostponedAlpha);
	//   86  169:aload_1         
	//   87  170:getfield        #211 <Field View Fragment.mView>
	//   88  173:aload_1         
	//   89  174:getfield        #298 <Field float Fragment.mPostponedAlpha>
	//   90  177:invokevirtual   #303 <Method void View.setAlpha(float)>
				fragment.mPostponedAlpha = 0.0F;
	//   91  180:aload_1         
	//   92  181:fconst_0        
	//   93  182:putfield        #298 <Field float Fragment.mPostponedAlpha>
				fragment.mIsNewlyAdded = false;
	//   94  185:aload_1         
	//   95  186:iconst_0        
	//   96  187:putfield        #217 <Field boolean Fragment.mIsNewlyAdded>
				Animation animation = loadAnimation(fragment, fragment.getNextTransition(), true, fragment.getNextTransitionStyle());
	//   97  190:aload_0         
	//   98  191:aload_1         
	//   99  192:aload_1         
	//  100  193:invokevirtual   #203 <Method int Fragment.getNextTransition()>
	//  101  196:iconst_1        
	//  102  197:aload_1         
	//  103  198:invokevirtual   #768 <Method int Fragment.getNextTransitionStyle()>
	//  104  201:invokevirtual   #772 <Method Animation loadAnimation(Fragment, int, boolean, int)>
	//  105  204:astore          4
				if(animation != null)
	//* 106  206:aload           4
	//* 107  208:ifnull          230
				{
					setHWLayerAnimListenerIfAlpha(fragment.mView, animation);
	//  108  211:aload_0         
	//  109  212:aload_1         
	//  110  213:getfield        #211 <Field View Fragment.mView>
	//  111  216:aload           4
	//  112  218:invokespecial   #774 <Method void setHWLayerAnimListenerIfAlpha(View, Animation)>
					fragment.mView.startAnimation(animation);
	//  113  221:aload_1         
	//  114  222:getfield        #211 <Field View Fragment.mView>
	//  115  225:aload           4
	//  116  227:invokevirtual   #777 <Method void View.startAnimation(Animation)>
				}
			}
		}
		if(fragment.mHiddenChanged)
	//* 117  230:aload_1         
	//* 118  231:getfield        #708 <Field boolean Fragment.mHiddenChanged>
	//* 119  234:ifeq            242
			completeShowHideFragment(fragment);
	//  120  237:aload_0         
	//  121  238:aload_1         
	//  122  239:invokevirtual   #1221 <Method void completeShowHideFragment(Fragment)>
	//  123  242:return          
	}

	void moveToState(int i, boolean flag)
	{
label0:
		{
			if(mHost == null && i != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #337 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       22
	//*   3    7:iload_1         
	//*   4    8:ifeq            22
				throw new IllegalStateException("No activity");
	//    5   11:new             #230 <Class IllegalStateException>
	//    6   14:dup             
	//    7   15:ldc2            #1223 <String "No activity">
	//    8   18:invokespecial   #235 <Method void IllegalStateException(String)>
	//    9   21:athrow          
			if(!flag && i == mCurState)
	//*  10   22:iload_2         
	//*  11   23:ifne            35
	//*  12   26:iload_1         
	//*  13   27:aload_0         
	//*  14   28:getfield        #153 <Field int mCurState>
	//*  15   31:icmpne          35
				return;
	//   16   34:return          
			mCurState = i;
	//   17   35:aload_0         
	//   18   36:iload_1         
	//   19   37:putfield        #153 <Field int mCurState>
			if(mActive == null)
				break label0;
	//   20   40:aload_0         
	//   21   41:getfield        #285 <Field ArrayList mActive>
	//   22   44:ifnull          280
			i = 0;
	//   23   47:iconst_0        
	//   24   48:istore_1        
			int j = 0;
	//   25   49:iconst_0        
	//   26   50:istore_3        
			if(mAdded != null)
	//*  27   51:aload_0         
	//*  28   52:getfield        #182 <Field ArrayList mAdded>
	//*  29   55:ifnull          131
			{
				int j1 = mAdded.size();
	//   30   58:aload_0         
	//   31   59:getfield        #182 <Field ArrayList mAdded>
	//   32   62:invokevirtual   #188 <Method int ArrayList.size()>
	//   33   65:istore          5
				int l = 0;
	//   34   67:iconst_0        
	//   35   68:istore          4
				do
				{
					i = j;
	//   36   70:iload_3         
	//   37   71:istore_1        
					if(l >= j1)
						break;
	//   38   72:iload           4
	//   39   74:iload           5
	//   40   76:icmpge          131
					Fragment fragment = (Fragment)mAdded.get(l);
	//   41   79:aload_0         
	//   42   80:getfield        #182 <Field ArrayList mAdded>
	//   43   83:iload           4
	//   44   85:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   45   88:checkcast       #194 <Class Fragment>
	//   46   91:astore          6
					moveFragmentToExpectedState(fragment);
	//   47   93:aload_0         
	//   48   94:aload           6
	//   49   96:invokevirtual   #1225 <Method void moveFragmentToExpectedState(Fragment)>
					i = j;
	//   50   99:iload_3         
	//   51  100:istore_1        
					if(fragment.mLoaderManager != null)
	//*  52  101:aload           6
	//*  53  103:getfield        #975 <Field LoaderManagerImpl Fragment.mLoaderManager>
	//*  54  106:ifnull          120
						i = ((int) (j | fragment.mLoaderManager.hasRunningLoaders()));
	//   55  109:iload_3         
	//   56  110:aload           6
	//   57  112:getfield        #975 <Field LoaderManagerImpl Fragment.mLoaderManager>
	//   58  115:invokevirtual   #980 <Method boolean LoaderManagerImpl.hasRunningLoaders()>
	//   59  118:ior             
	//   60  119:istore_1        
					l++;
	//   61  120:iload           4
	//   62  122:iconst_1        
	//   63  123:iadd            
	//   64  124:istore          4
					j = i;
	//   65  126:iload_1         
	//   66  127:istore_3        
				} while(true);
	//   67  128:goto            70
			}
			int k1 = mActive.size();
	//   68  131:aload_0         
	//   69  132:getfield        #285 <Field ArrayList mActive>
	//   70  135:invokevirtual   #188 <Method int ArrayList.size()>
	//   71  138:istore          5
			for(int k = 0; k < k1;)
	//*  72  140:iconst_0        
	//*  73  141:istore_3        
	//*  74  142:iload_3         
	//*  75  143:iload           5
	//*  76  145:icmpge          238
			{
				int i1;
label1:
				{
					Fragment fragment1 = (Fragment)mActive.get(k);
	//   77  148:aload_0         
	//   78  149:getfield        #285 <Field ArrayList mActive>
	//   79  152:iload_3         
	//   80  153:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   81  156:checkcast       #194 <Class Fragment>
	//   82  159:astore          6
					i1 = i;
	//   83  161:iload_1         
	//   84  162:istore          4
					if(fragment1 == null)
						break label1;
	//   85  164:aload           6
	//   86  166:ifnull          228
					if(!fragment1.mRemoving)
	//*  87  169:aload           6
	//*  88  171:getfield        #705 <Field boolean Fragment.mRemoving>
	//*  89  174:ifne            188
					{
						i1 = i;
	//   90  177:iload_1         
	//   91  178:istore          4
						if(!fragment1.mDetached)
							break label1;
	//   92  180:aload           6
	//   93  182:getfield        #697 <Field boolean Fragment.mDetached>
	//   94  185:ifeq            228
					}
					i1 = i;
	//   95  188:iload_1         
	//   96  189:istore          4
					if(!fragment1.mIsNewlyAdded)
	//*  97  191:aload           6
	//*  98  193:getfield        #217 <Field boolean Fragment.mIsNewlyAdded>
	//*  99  196:ifne            228
					{
						moveFragmentToExpectedState(fragment1);
	//  100  199:aload_0         
	//  101  200:aload           6
	//  102  202:invokevirtual   #1225 <Method void moveFragmentToExpectedState(Fragment)>
						i1 = i;
	//  103  205:iload_1         
	//  104  206:istore          4
						if(fragment1.mLoaderManager != null)
	//* 105  208:aload           6
	//* 106  210:getfield        #975 <Field LoaderManagerImpl Fragment.mLoaderManager>
	//* 107  213:ifnull          228
							i1 = i | fragment1.mLoaderManager.hasRunningLoaders();
	//  108  216:iload_1         
	//  109  217:aload           6
	//  110  219:getfield        #975 <Field LoaderManagerImpl Fragment.mLoaderManager>
	//  111  222:invokevirtual   #980 <Method boolean LoaderManagerImpl.hasRunningLoaders()>
	//  112  225:ior             
	//  113  226:istore          4
					}
				}
				k++;
	//  114  228:iload_3         
	//  115  229:iconst_1        
	//  116  230:iadd            
	//  117  231:istore_3        
				i = i1;
	//  118  232:iload           4
	//  119  234:istore_1        
			}

	//* 120  235:goto            142
			if(i == 0)
	//* 121  238:iload_1         
	//* 122  239:ifne            246
				startPendingDeferredFragments();
	//  123  242:aload_0         
	//  124  243:invokevirtual   #983 <Method void startPendingDeferredFragments()>
			if(mNeedMenuInvalidate && mHost != null && mCurState == 5)
	//* 125  246:aload_0         
	//* 126  247:getfield        #716 <Field boolean mNeedMenuInvalidate>
	//* 127  250:ifeq            280
	//* 128  253:aload_0         
	//* 129  254:getfield        #337 <Field FragmentHostCallback mHost>
	//* 130  257:ifnull          280
	//* 131  260:aload_0         
	//* 132  261:getfield        #153 <Field int mCurState>
	//* 133  264:iconst_5        
	//* 134  265:icmpne          280
			{
				mHost.onSupportInvalidateOptionsMenu();
	//  135  268:aload_0         
	//  136  269:getfield        #337 <Field FragmentHostCallback mHost>
	//  137  272:invokevirtual   #1228 <Method void FragmentHostCallback.onSupportInvalidateOptionsMenu()>
				mNeedMenuInvalidate = false;
	//  138  275:aload_0         
	//  139  276:iconst_0        
	//  140  277:putfield        #716 <Field boolean mNeedMenuInvalidate>
			}
		}
	//  141  280:return          
	}

	void moveToState(Fragment fragment)
	{
		moveToState(fragment, mCurState, 0, 0, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #153 <Field int mCurState>
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #207 <Method void moveToState(Fragment, int, int, int, boolean)>
	//    8   12:return          
	}

	void moveToState(Fragment fragment, int i, int j, int k, boolean flag)
	{
		int l;
label0:
		{
			if(fragment.mAdded)
	//*   0    0:aload_1         
	//*   1    1:getfield        #508 <Field boolean Fragment.mAdded>
	//*   2    4:ifeq            17
			{
				l = i;
	//    3    7:iload_2         
	//    4    8:istore          6
				if(!fragment.mDetached)
					break label0;
	//    5   10:aload_1         
	//    6   11:getfield        #697 <Field boolean Fragment.mDetached>
	//    7   14:ifeq            28
			}
			l = i;
	//    8   17:iload_2         
	//    9   18:istore          6
			if(i > 1)
	//*  10   20:iload_2         
	//*  11   21:iconst_1        
	//*  12   22:icmple          28
				l = 1;
	//   13   25:iconst_1        
	//   14   26:istore          6
		}
		int i1 = l;
	//   15   28:iload           6
	//   16   30:istore          7
		if(fragment.mRemoving)
	//*  17   32:aload_1         
	//*  18   33:getfield        #705 <Field boolean Fragment.mRemoving>
	//*  19   36:ifeq            58
		{
			i1 = l;
	//   20   39:iload           6
	//   21   41:istore          7
			if(l > fragment.mState)
	//*  22   43:iload           6
	//*  23   45:aload_1         
	//*  24   46:getfield        #197 <Field int Fragment.mState>
	//*  25   49:icmple          58
				i1 = fragment.mState;
	//   26   52:aload_1         
	//   27   53:getfield        #197 <Field int Fragment.mState>
	//   28   56:istore          7
		}
		i = i1;
	//   29   58:iload           7
	//   30   60:istore_2        
		if(fragment.mDeferStart)
	//*  31   61:aload_1         
	//*  32   62:getfield        #1233 <Field boolean Fragment.mDeferStart>
	//*  33   65:ifeq            90
		{
			i = i1;
	//   34   68:iload           7
	//   35   70:istore_2        
			if(fragment.mState < 4)
	//*  36   71:aload_1         
	//*  37   72:getfield        #197 <Field int Fragment.mState>
	//*  38   75:iconst_4        
	//*  39   76:icmpge          90
			{
				i = i1;
	//   40   79:iload           7
	//   41   81:istore_2        
				if(i1 > 3)
	//*  42   82:iload           7
	//*  43   84:iconst_3        
	//*  44   85:icmple          90
					i = 3;
	//   45   88:iconst_3        
	//   46   89:istore_2        
			}
		}
		if(fragment.mState <= i)
	//*  47   90:aload_1         
	//*  48   91:getfield        #197 <Field int Fragment.mState>
	//*  49   94:iload_2         
	//*  50   95:icmpgt          1200
		{
			if(fragment.mFromLayout && !fragment.mInLayout)
	//*  51   98:aload_1         
	//*  52   99:getfield        #1072 <Field boolean Fragment.mFromLayout>
	//*  53  102:ifeq            113
	//*  54  105:aload_1         
	//*  55  106:getfield        #1236 <Field boolean Fragment.mInLayout>
	//*  56  109:ifne            113
				return;
	//   57  112:return          
			if(fragment.getAnimatingAway() != null)
	//*  58  113:aload_1         
	//*  59  114:invokevirtual   #309 <Method View Fragment.getAnimatingAway()>
	//*  60  117:ifnull          137
			{
				fragment.setAnimatingAway(((View) (null)));
	//   61  120:aload_1         
	//   62  121:aconst_null     
	//   63  122:invokevirtual   #316 <Method void Fragment.setAnimatingAway(View)>
				moveToState(fragment, fragment.getStateAfterAnimating(), 0, 0, true);
	//   64  125:aload_0         
	//   65  126:aload_1         
	//   66  127:aload_1         
	//   67  128:invokevirtual   #312 <Method int Fragment.getStateAfterAnimating()>
	//   68  131:iconst_0        
	//   69  132:iconst_0        
	//   70  133:iconst_1        
	//   71  134:invokevirtual   #207 <Method void moveToState(Fragment, int, int, int, boolean)>
			}
			k = i;
	//   72  137:iload_2         
	//   73  138:istore          4
			l = i;
	//   74  140:iload_2         
	//   75  141:istore          6
			int j1 = i;
	//   76  143:iload_2         
	//   77  144:istore          7
			j = i;
	//   78  146:iload_2         
	//   79  147:istore_3        
			switch(fragment.mState)
	//*  80  148:aload_1         
	//*  81  149:getfield        #197 <Field int Fragment.mState>
			{
	//*  82  152:tableswitch     0 4: default 188
	//	               0 191
	//	               1 641
	//	               2 1060
	//	               3 1079
	//	               4 1133
	//*  83  188:goto            1194
			case 0: // '\0'
				k = i;
	//   84  191:iload_2         
	//   85  192:istore          4
				if(i > 0)
	//*  86  194:iload_2         
	//*  87  195:ifle            641
				{
					if(DEBUG)
	//*  88  198:getstatic       #120 <Field boolean DEBUG>
	//*  89  201:ifeq            230
						Log.v("FragmentManager", (new StringBuilder()).append("moveto CREATED: ").append(((Object) (fragment))).toString());
	//   90  204:ldc1            #55  <String "FragmentManager">
	//   91  206:new             #239 <Class StringBuilder>
	//   92  209:dup             
	//   93  210:invokespecial   #240 <Method void StringBuilder()>
	//   94  213:ldc2            #1238 <String "moveto CREATED: ">
	//   95  216:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   96  219:aload_1         
	//   97  220:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//   98  223:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   99  226:invokestatic    #690 <Method int Log.v(String, String)>
	//  100  229:pop             
					k = i;
	//  101  230:iload_2         
	//  102  231:istore          4
					if(fragment.mSavedFragmentState != null)
	//* 103  233:aload_1         
	//* 104  234:getfield        #1078 <Field Bundle Fragment.mSavedFragmentState>
	//* 105  237:ifnull          345
					{
						fragment.mSavedFragmentState.setClassLoader(mHost.getContext().getClassLoader());
	//  106  240:aload_1         
	//  107  241:getfield        #1078 <Field Bundle Fragment.mSavedFragmentState>
	//  108  244:aload_0         
	//  109  245:getfield        #337 <Field FragmentHostCallback mHost>
	//  110  248:invokevirtual   #1161 <Method Context FragmentHostCallback.getContext()>
	//  111  251:invokevirtual   #1244 <Method ClassLoader Context.getClassLoader()>
	//  112  254:invokevirtual   #1248 <Method void Bundle.setClassLoader(ClassLoader)>
						fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
	//  113  257:aload_1         
	//  114  258:aload_1         
	//  115  259:getfield        #1078 <Field Bundle Fragment.mSavedFragmentState>
	//  116  262:ldc1            #67  <String "android:view_state">
	//  117  264:invokevirtual   #1252 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//  118  267:putfield        #1255 <Field SparseArray Fragment.mSavedViewState>
						fragment.mTarget = getFragment(fragment.mSavedFragmentState, "android:target_state");
	//  119  270:aload_1         
	//  120  271:aload_0         
	//  121  272:aload_1         
	//  122  273:getfield        #1078 <Field Bundle Fragment.mSavedFragmentState>
	//  123  276:ldc1            #61  <String "android:target_state">
	//  124  278:invokevirtual   #1257 <Method Fragment getFragment(Bundle, String)>
	//  125  281:putfield        #1260 <Field Fragment Fragment.mTarget>
						if(fragment.mTarget != null)
	//* 126  284:aload_1         
	//* 127  285:getfield        #1260 <Field Fragment Fragment.mTarget>
	//* 128  288:ifnull          305
							fragment.mTargetRequestCode = fragment.mSavedFragmentState.getInt("android:target_req_state", 0);
	//  129  291:aload_1         
	//  130  292:aload_1         
	//  131  293:getfield        #1078 <Field Bundle Fragment.mSavedFragmentState>
	//  132  296:ldc1            #58  <String "android:target_req_state">
	//  133  298:iconst_0        
	//  134  299:invokevirtual   #1136 <Method int Bundle.getInt(String, int)>
	//  135  302:putfield        #1263 <Field int Fragment.mTargetRequestCode>
						fragment.mUserVisibleHint = fragment.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
	//  136  305:aload_1         
	//  137  306:aload_1         
	//  138  307:getfield        #1078 <Field Bundle Fragment.mSavedFragmentState>
	//  139  310:ldc1            #64  <String "android:user_visible_hint">
	//  140  312:iconst_1        
	//  141  313:invokevirtual   #1267 <Method boolean Bundle.getBoolean(String, boolean)>
	//  142  316:putfield        #1270 <Field boolean Fragment.mUserVisibleHint>
						k = i;
	//  143  319:iload_2         
	//  144  320:istore          4
						if(!fragment.mUserVisibleHint)
	//* 145  322:aload_1         
	//* 146  323:getfield        #1270 <Field boolean Fragment.mUserVisibleHint>
	//* 147  326:ifne            345
						{
							fragment.mDeferStart = true;
	//  148  329:aload_1         
	//  149  330:iconst_1        
	//  150  331:putfield        #1233 <Field boolean Fragment.mDeferStart>
							k = i;
	//  151  334:iload_2         
	//  152  335:istore          4
							if(i > 3)
	//* 153  337:iload_2         
	//* 154  338:iconst_3        
	//* 155  339:icmple          345
								k = 3;
	//  156  342:iconst_3        
	//  157  343:istore          4
						}
					}
					fragment.mHost = mHost;
	//  158  345:aload_1         
	//  159  346:aload_0         
	//  160  347:getfield        #337 <Field FragmentHostCallback mHost>
	//  161  350:putfield        #1271 <Field FragmentHostCallback Fragment.mHost>
					fragment.mParentFragment = mParent;
	//  162  353:aload_1         
	//  163  354:aload_0         
	//  164  355:getfield        #756 <Field Fragment mParent>
	//  165  358:putfield        #1274 <Field Fragment Fragment.mParentFragment>
					FragmentManagerImpl fragmentmanagerimpl;
					if(mParent != null)
	//* 166  361:aload_0         
	//* 167  362:getfield        #756 <Field Fragment mParent>
	//* 168  365:ifnull          380
						fragmentmanagerimpl = mParent.mChildFragmentManager;
	//  169  368:aload_0         
	//  170  369:getfield        #756 <Field Fragment mParent>
	//  171  372:getfield        #1278 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
	//  172  375:astore          8
					else
	//* 173  377:goto            389
						fragmentmanagerimpl = mHost.getFragmentManagerImpl();
	//  174  380:aload_0         
	//  175  381:getfield        #337 <Field FragmentHostCallback mHost>
	//  176  384:invokevirtual   #1282 <Method FragmentManagerImpl FragmentHostCallback.getFragmentManagerImpl()>
	//  177  387:astore          8
					fragment.mFragmentManager = fragmentmanagerimpl;
	//  178  389:aload_1         
	//  179  390:aload           8
	//  180  392:putfield        #1285 <Field FragmentManagerImpl Fragment.mFragmentManager>
					if(fragment.mTarget != null)
	//* 181  395:aload_1         
	//* 182  396:getfield        #1260 <Field Fragment Fragment.mTarget>
	//* 183  399:ifnull          486
					{
						if(!mActive.contains(((Object) (fragment.mTarget))))
	//* 184  402:aload_0         
	//* 185  403:getfield        #285 <Field ArrayList mActive>
	//* 186  406:aload_1         
	//* 187  407:getfield        #1260 <Field Fragment Fragment.mTarget>
	//* 188  410:invokevirtual   #700 <Method boolean ArrayList.contains(Object)>
	//* 189  413:ifne            463
							throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(((Object) (fragment))).append(" declared target fragment ").append(((Object) (fragment.mTarget))).append(" that does not belong to this FragmentManager!").toString());
	//  190  416:new             #230 <Class IllegalStateException>
	//  191  419:dup             
	//  192  420:new             #239 <Class StringBuilder>
	//  193  423:dup             
	//  194  424:invokespecial   #240 <Method void StringBuilder()>
	//  195  427:ldc2            #1287 <String "Fragment ">
	//  196  430:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  197  433:aload_1         
	//  198  434:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//  199  437:ldc2            #1289 <String " declared target fragment ">
	//  200  440:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  201  443:aload_1         
	//  202  444:getfield        #1260 <Field Fragment Fragment.mTarget>
	//  203  447:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//  204  450:ldc2            #1291 <String " that does not belong to this FragmentManager!">
	//  205  453:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  206  456:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  207  459:invokespecial   #235 <Method void IllegalStateException(String)>
	//  208  462:athrow          
						if(fragment.mTarget.mState < 1)
	//* 209  463:aload_1         
	//* 210  464:getfield        #1260 <Field Fragment Fragment.mTarget>
	//* 211  467:getfield        #197 <Field int Fragment.mState>
	//* 212  470:iconst_1        
	//* 213  471:icmpge          486
							moveToState(fragment.mTarget, 1, 0, 0, true);
	//  214  474:aload_0         
	//  215  475:aload_1         
	//  216  476:getfield        #1260 <Field Fragment Fragment.mTarget>
	//  217  479:iconst_1        
	//  218  480:iconst_0        
	//  219  481:iconst_0        
	//  220  482:iconst_1        
	//  221  483:invokevirtual   #207 <Method void moveToState(Fragment, int, int, int, boolean)>
					}
					dispatchOnFragmentPreAttached(fragment, mHost.getContext(), false);
	//  222  486:aload_0         
	//  223  487:aload_1         
	//  224  488:aload_0         
	//  225  489:getfield        #337 <Field FragmentHostCallback mHost>
	//  226  492:invokevirtual   #1161 <Method Context FragmentHostCallback.getContext()>
	//  227  495:iconst_0        
	//  228  496:invokevirtual   #905 <Method void dispatchOnFragmentPreAttached(Fragment, Context, boolean)>
					fragment.mCalled = false;
	//  229  499:aload_1         
	//  230  500:iconst_0        
	//  231  501:putfield        #1294 <Field boolean Fragment.mCalled>
					fragment.onAttach(mHost.getContext());
	//  232  504:aload_1         
	//  233  505:aload_0         
	//  234  506:getfield        #337 <Field FragmentHostCallback mHost>
	//  235  509:invokevirtual   #1161 <Method Context FragmentHostCallback.getContext()>
	//  236  512:invokevirtual   #1298 <Method void Fragment.onAttach(Context)>
					if(!fragment.mCalled)
	//* 237  515:aload_1         
	//* 238  516:getfield        #1294 <Field boolean Fragment.mCalled>
	//* 239  519:ifne            556
						throw new SuperNotCalledException((new StringBuilder()).append("Fragment ").append(((Object) (fragment))).append(" did not call through to super.onAttach()").toString());
	//  240  522:new             #1300 <Class SuperNotCalledException>
	//  241  525:dup             
	//  242  526:new             #239 <Class StringBuilder>
	//  243  529:dup             
	//  244  530:invokespecial   #240 <Method void StringBuilder()>
	//  245  533:ldc2            #1287 <String "Fragment ">
	//  246  536:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  247  539:aload_1         
	//  248  540:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//  249  543:ldc2            #1302 <String " did not call through to super.onAttach()">
	//  250  546:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  251  549:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  252  552:invokespecial   #1303 <Method void SuperNotCalledException(String)>
	//  253  555:athrow          
					if(fragment.mParentFragment == null)
	//* 254  556:aload_1         
	//* 255  557:getfield        #1274 <Field Fragment Fragment.mParentFragment>
	//* 256  560:ifnonnull       574
						mHost.onAttachFragment(fragment);
	//  257  563:aload_0         
	//  258  564:getfield        #337 <Field FragmentHostCallback mHost>
	//  259  567:aload_1         
	//  260  568:invokevirtual   #1306 <Method void FragmentHostCallback.onAttachFragment(Fragment)>
					else
	//* 261  571:goto            582
						fragment.mParentFragment.onAttachFragment(fragment);
	//  262  574:aload_1         
	//  263  575:getfield        #1274 <Field Fragment Fragment.mParentFragment>
	//  264  578:aload_1         
	//  265  579:invokevirtual   #1307 <Method void Fragment.onAttachFragment(Fragment)>
					dispatchOnFragmentAttached(fragment, mHost.getContext(), false);
	//  266  582:aload_0         
	//  267  583:aload_1         
	//  268  584:aload_0         
	//  269  585:getfield        #337 <Field FragmentHostCallback mHost>
	//  270  588:invokevirtual   #1161 <Method Context FragmentHostCallback.getContext()>
	//  271  591:iconst_0        
	//  272  592:invokevirtual   #873 <Method void dispatchOnFragmentAttached(Fragment, Context, boolean)>
					if(!fragment.mRetaining)
	//* 273  595:aload_1         
	//* 274  596:getfield        #1310 <Field boolean Fragment.mRetaining>
	//* 275  599:ifne            623
					{
						fragment.performCreate(fragment.mSavedFragmentState);
	//  276  602:aload_1         
	//  277  603:aload_1         
	//  278  604:getfield        #1078 <Field Bundle Fragment.mSavedFragmentState>
	//  279  607:invokevirtual   #1314 <Method void Fragment.performCreate(Bundle)>
						dispatchOnFragmentCreated(fragment, fragment.mSavedFragmentState, false);
	//  280  610:aload_0         
	//  281  611:aload_1         
	//  282  612:aload_1         
	//  283  613:getfield        #1078 <Field Bundle Fragment.mSavedFragmentState>
	//  284  616:iconst_0        
	//  285  617:invokevirtual   #880 <Method void dispatchOnFragmentCreated(Fragment, Bundle, boolean)>
					} else
	//* 286  620:goto            636
					{
						fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
	//  287  623:aload_1         
	//  288  624:aload_1         
	//  289  625:getfield        #1078 <Field Bundle Fragment.mSavedFragmentState>
	//  290  628:invokevirtual   #1317 <Method void Fragment.restoreChildFragmentState(Bundle)>
						fragment.mState = 1;
	//  291  631:aload_1         
	//  292  632:iconst_1        
	//  293  633:putfield        #197 <Field int Fragment.mState>
					}
					fragment.mRetaining = false;
	//  294  636:aload_1         
	//  295  637:iconst_0        
	//  296  638:putfield        #1310 <Field boolean Fragment.mRetaining>
				}
				// fall through

			case 1: // '\001'
				ensureInflatedFragmentView(fragment);
	//  297  641:aload_0         
	//  298  642:aload_1         
	//  299  643:invokevirtual   #1319 <Method void ensureInflatedFragmentView(Fragment)>
				l = k;
	//  300  646:iload           4
	//  301  648:istore          6
				if(k > 1)
	//* 302  650:iload           4
	//* 303  652:iconst_1        
	//* 304  653:icmple          1060
				{
					if(DEBUG)
	//* 305  656:getstatic       #120 <Field boolean DEBUG>
	//* 306  659:ifeq            688
						Log.v("FragmentManager", (new StringBuilder()).append("moveto ACTIVITY_CREATED: ").append(((Object) (fragment))).toString());
	//  307  662:ldc1            #55  <String "FragmentManager">
	//  308  664:new             #239 <Class StringBuilder>
	//  309  667:dup             
	//  310  668:invokespecial   #240 <Method void StringBuilder()>
	//  311  671:ldc2            #1321 <String "moveto ACTIVITY_CREATED: ">
	//  312  674:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  313  677:aload_1         
	//  314  678:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//  315  681:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  316  684:invokestatic    #690 <Method int Log.v(String, String)>
	//  317  687:pop             
					if(!fragment.mFromLayout)
	//* 318  688:aload_1         
	//* 319  689:getfield        #1072 <Field boolean Fragment.mFromLayout>
	//* 320  692:ifne            1018
					{
						Object obj = null;
	//  321  695:aconst_null     
	//  322  696:astore          8
						if(fragment.mContainerId != 0)
	//* 323  698:aload_1         
	//* 324  699:getfield        #288 <Field int Fragment.mContainerId>
	//* 325  702:ifeq            871
						{
							if(fragment.mContainerId == -1)
	//* 326  705:aload_1         
	//* 327  706:getfield        #288 <Field int Fragment.mContainerId>
	//* 328  709:iconst_m1       
	//* 329  710:icmpne          750
								throwException(((RuntimeException) (new IllegalArgumentException((new StringBuilder()).append("Cannot create fragment ").append(((Object) (fragment))).append(" for a container view with no id").toString()))));
	//  330  713:aload_0         
	//  331  714:new             #1323 <Class IllegalArgumentException>
	//  332  717:dup             
	//  333  718:new             #239 <Class StringBuilder>
	//  334  721:dup             
	//  335  722:invokespecial   #240 <Method void StringBuilder()>
	//  336  725:ldc2            #1325 <String "Cannot create fragment ">
	//  337  728:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  338  731:aload_1         
	//  339  732:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//  340  735:ldc2            #1327 <String " for a container view with no id">
	//  341  738:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  342  741:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  343  744:invokespecial   #1328 <Method void IllegalArgumentException(String)>
	//  344  747:invokespecial   #1142 <Method void throwException(RuntimeException)>
							ViewGroup viewgroup = (ViewGroup)mContainer.onFindViewById(fragment.mContainerId);
	//  345  750:aload_0         
	//  346  751:getfield        #754 <Field FragmentContainer mContainer>
	//  347  754:aload_1         
	//  348  755:getfield        #288 <Field int Fragment.mContainerId>
	//  349  758:invokevirtual   #1334 <Method View FragmentContainer.onFindViewById(int)>
	//  350  761:checkcast       #1208 <Class ViewGroup>
	//  351  764:astore          9
							obj = ((Object) (viewgroup));
	//  352  766:aload           9
	//  353  768:astore          8
							if(viewgroup == null)
	//* 354  770:aload           9
	//* 355  772:ifnonnull       871
							{
								obj = ((Object) (viewgroup));
	//  356  775:aload           9
	//  357  777:astore          8
								if(!fragment.mRestored)
	//* 358  779:aload_1         
	//* 359  780:getfield        #1337 <Field boolean Fragment.mRestored>
	//* 360  783:ifne            871
								{
									try
									{
										obj = ((Object) (fragment.getResources().getResourceName(fragment.mContainerId)));
	//  361  786:aload_1         
	//  362  787:invokevirtual   #1341 <Method Resources Fragment.getResources()>
	//  363  790:aload_1         
	//  364  791:getfield        #288 <Field int Fragment.mContainerId>
	//  365  794:invokevirtual   #1346 <Method String Resources.getResourceName(int)>
	//  366  797:astore          8
									}
	//* 367  799:goto            809
									// Misplaced declaration of an exception variable
									catch(Object obj)
	//* 368  802:astore          8
									{
										obj = "unknown";
	//  369  804:ldc2            #1348 <String "unknown">
	//  370  807:astore          8
									}
									throwException(((RuntimeException) (new IllegalArgumentException((new StringBuilder()).append("No view found for id 0x").append(Integer.toHexString(fragment.mContainerId)).append(" (").append(((String) (obj))).append(") for fragment ").append(((Object) (fragment))).toString()))));
	//  371  809:aload_0         
	//  372  810:new             #1323 <Class IllegalArgumentException>
	//  373  813:dup             
	//  374  814:new             #239 <Class StringBuilder>
	//  375  817:dup             
	//  376  818:invokespecial   #240 <Method void StringBuilder()>
	//  377  821:ldc2            #1350 <String "No view found for id 0x">
	//  378  824:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  379  827:aload_1         
	//  380  828:getfield        #288 <Field int Fragment.mContainerId>
	//  381  831:invokestatic    #999 <Method String Integer.toHexString(int)>
	//  382  834:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  383  837:ldc2            #1352 <String " (">
	//  384  840:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  385  843:aload           8
	//  386  845:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  387  848:ldc2            #1354 <String ") for fragment ">
	//  388  851:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  389  854:aload_1         
	//  390  855:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//  391  858:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  392  861:invokespecial   #1328 <Method void IllegalArgumentException(String)>
	//  393  864:invokespecial   #1142 <Method void throwException(RuntimeException)>
									obj = ((Object) (viewgroup));
	//  394  867:aload           9
	//  395  869:astore          8
								}
							}
						}
						fragment.mContainer = ((ViewGroup) (obj));
	//  396  871:aload_1         
	//  397  872:aload           8
	//  398  874:putfield        #451 <Field ViewGroup Fragment.mContainer>
						fragment.mView = fragment.performCreateView(fragment.getLayoutInflater(fragment.mSavedFragmentState), ((ViewGroup) (obj)), fragment.mSavedFragmentState);
	//  399  877:aload_1         
	//  400  878:aload_1         
	//  401  879:aload_1         
	//  402  880:aload_1         
	//  403  881:getfield        #1078 <Field Bundle Fragment.mSavedFragmentState>
	//  404  884:invokevirtual   #1082 <Method android.view.LayoutInflater Fragment.getLayoutInflater(Bundle)>
	//  405  887:aload           8
	//  406  889:aload_1         
	//  407  890:getfield        #1078 <Field Bundle Fragment.mSavedFragmentState>
	//  408  893:invokevirtual   #1086 <Method View Fragment.performCreateView(android.view.LayoutInflater, ViewGroup, Bundle)>
	//  409  896:putfield        #211 <Field View Fragment.mView>
						if(fragment.mView != null)
	//* 410  899:aload_1         
	//* 411  900:getfield        #211 <Field View Fragment.mView>
	//* 412  903:ifnull          1013
						{
							fragment.mInnerView = fragment.mView;
	//  413  906:aload_1         
	//  414  907:aload_1         
	//  415  908:getfield        #211 <Field View Fragment.mView>
	//  416  911:putfield        #1089 <Field View Fragment.mInnerView>
							fragment.mView.setSaveFromParentEnabled(false);
	//  417  914:aload_1         
	//  418  915:getfield        #211 <Field View Fragment.mView>
	//  419  918:iconst_0        
	//  420  919:invokevirtual   #1092 <Method void View.setSaveFromParentEnabled(boolean)>
							if(obj != null)
	//* 421  922:aload           8
	//* 422  924:ifnull          936
								((ViewGroup) (obj)).addView(fragment.mView);
	//  423  927:aload           8
	//  424  929:aload_1         
	//  425  930:getfield        #211 <Field View Fragment.mView>
	//  426  933:invokevirtual   #1356 <Method void ViewGroup.addView(View)>
							if(fragment.mHidden)
	//* 427  936:aload_1         
	//* 428  937:getfield        #214 <Field boolean Fragment.mHidden>
	//* 429  940:ifeq            952
								fragment.mView.setVisibility(8);
	//  430  943:aload_1         
	//  431  944:getfield        #211 <Field View Fragment.mView>
	//  432  947:bipush          8
	//  433  949:invokevirtual   #514 <Method void View.setVisibility(int)>
							fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
	//  434  952:aload_1         
	//  435  953:aload_1         
	//  436  954:getfield        #211 <Field View Fragment.mView>
	//  437  957:aload_1         
	//  438  958:getfield        #1078 <Field Bundle Fragment.mSavedFragmentState>
	//  439  961:invokevirtual   #1096 <Method void Fragment.onViewCreated(View, Bundle)>
							dispatchOnFragmentViewCreated(fragment, fragment.mView, fragment.mSavedFragmentState, false);
	//  440  964:aload_0         
	//  441  965:aload_1         
	//  442  966:aload_1         
	//  443  967:getfield        #211 <Field View Fragment.mView>
	//  444  970:aload_1         
	//  445  971:getfield        #1078 <Field Bundle Fragment.mSavedFragmentState>
	//  446  974:iconst_0        
	//  447  975:invokevirtual   #936 <Method void dispatchOnFragmentViewCreated(Fragment, View, Bundle, boolean)>
							if(fragment.mView.getVisibility() == 0 && fragment.mContainer != null)
	//* 448  978:aload_1         
	//* 449  979:getfield        #211 <Field View Fragment.mView>
	//* 450  982:invokevirtual   #1359 <Method int View.getVisibility()>
	//* 451  985:ifne            1001
	//* 452  988:aload_1         
	//* 453  989:getfield        #451 <Field ViewGroup Fragment.mContainer>
	//* 454  992:ifnull          1001
								flag = true;
	//  455  995:iconst_1        
	//  456  996:istore          5
							else
	//* 457  998:goto            1004
								flag = false;
	//  458 1001:iconst_0        
	//  459 1002:istore          5
							fragment.mIsNewlyAdded = flag;
	//  460 1004:aload_1         
	//  461 1005:iload           5
	//  462 1007:putfield        #217 <Field boolean Fragment.mIsNewlyAdded>
						} else
	//* 463 1010:goto            1018
						{
							fragment.mInnerView = null;
	//  464 1013:aload_1         
	//  465 1014:aconst_null     
	//  466 1015:putfield        #1089 <Field View Fragment.mInnerView>
						}
					}
					fragment.performActivityCreated(fragment.mSavedFragmentState);
	//  467 1018:aload_1         
	//  468 1019:aload_1         
	//  469 1020:getfield        #1078 <Field Bundle Fragment.mSavedFragmentState>
	//  470 1023:invokevirtual   #1362 <Method void Fragment.performActivityCreated(Bundle)>
					dispatchOnFragmentActivityCreated(fragment, fragment.mSavedFragmentState, false);
	//  471 1026:aload_0         
	//  472 1027:aload_1         
	//  473 1028:aload_1         
	//  474 1029:getfield        #1078 <Field Bundle Fragment.mSavedFragmentState>
	//  475 1032:iconst_0        
	//  476 1033:invokevirtual   #837 <Method void dispatchOnFragmentActivityCreated(Fragment, Bundle, boolean)>
					if(fragment.mView != null)
	//* 477 1036:aload_1         
	//* 478 1037:getfield        #211 <Field View Fragment.mView>
	//* 479 1040:ifnull          1051
						fragment.restoreViewState(fragment.mSavedFragmentState);
	//  480 1043:aload_1         
	//  481 1044:aload_1         
	//  482 1045:getfield        #1078 <Field Bundle Fragment.mSavedFragmentState>
	//  483 1048:invokevirtual   #1365 <Method void Fragment.restoreViewState(Bundle)>
					fragment.mSavedFragmentState = null;
	//  484 1051:aload_1         
	//  485 1052:aconst_null     
	//  486 1053:putfield        #1078 <Field Bundle Fragment.mSavedFragmentState>
					l = k;
	//  487 1056:iload           4
	//  488 1058:istore          6
				}
				// fall through

			case 2: // '\002'
				j1 = l;
	//  489 1060:iload           6
	//  490 1062:istore          7
				if(l > 2)
	//* 491 1064:iload           6
	//* 492 1066:iconst_2        
	//* 493 1067:icmple          1079
				{
					fragment.mState = 3;
	//  494 1070:aload_1         
	//  495 1071:iconst_3        
	//  496 1072:putfield        #197 <Field int Fragment.mState>
					j1 = l;
	//  497 1075:iload           6
	//  498 1077:istore          7
				}
				// fall through

			case 3: // '\003'
				j = j1;
	//  499 1079:iload           7
	//  500 1081:istore_3        
				if(j1 > 3)
	//* 501 1082:iload           7
	//* 502 1084:iconst_3        
	//* 503 1085:icmple          1133
				{
					if(DEBUG)
	//* 504 1088:getstatic       #120 <Field boolean DEBUG>
	//* 505 1091:ifeq            1120
						Log.v("FragmentManager", (new StringBuilder()).append("moveto STARTED: ").append(((Object) (fragment))).toString());
	//  506 1094:ldc1            #55  <String "FragmentManager">
	//  507 1096:new             #239 <Class StringBuilder>
	//  508 1099:dup             
	//  509 1100:invokespecial   #240 <Method void StringBuilder()>
	//  510 1103:ldc2            #1367 <String "moveto STARTED: ">
	//  511 1106:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  512 1109:aload_1         
	//  513 1110:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//  514 1113:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  515 1116:invokestatic    #690 <Method int Log.v(String, String)>
	//  516 1119:pop             
					fragment.performStart();
	//  517 1120:aload_1         
	//  518 1121:invokevirtual   #1370 <Method void Fragment.performStart()>
					dispatchOnFragmentStarted(fragment, false);
	//  519 1124:aload_0         
	//  520 1125:aload_1         
	//  521 1126:iconst_0        
	//  522 1127:invokevirtual   #923 <Method void dispatchOnFragmentStarted(Fragment, boolean)>
					j = j1;
	//  523 1130:iload           7
	//  524 1132:istore_3        
				}
				// fall through

			case 4: // '\004'
				i = j;
	//  525 1133:iload_3         
	//  526 1134:istore_2        
				if(j > 4)
	//* 527 1135:iload_3         
	//* 528 1136:iconst_4        
	//* 529 1137:icmple          1194
				{
					if(DEBUG)
	//* 530 1140:getstatic       #120 <Field boolean DEBUG>
	//* 531 1143:ifeq            1172
						Log.v("FragmentManager", (new StringBuilder()).append("moveto RESUMED: ").append(((Object) (fragment))).toString());
	//  532 1146:ldc1            #55  <String "FragmentManager">
	//  533 1148:new             #239 <Class StringBuilder>
	//  534 1151:dup             
	//  535 1152:invokespecial   #240 <Method void StringBuilder()>
	//  536 1155:ldc2            #1372 <String "moveto RESUMED: ">
	//  537 1158:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  538 1161:aload_1         
	//  539 1162:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//  540 1165:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  541 1168:invokestatic    #690 <Method int Log.v(String, String)>
	//  542 1171:pop             
					fragment.performResume();
	//  543 1172:aload_1         
	//  544 1173:invokevirtual   #1375 <Method void Fragment.performResume()>
					dispatchOnFragmentResumed(fragment, false);
	//  545 1176:aload_0         
	//  546 1177:aload_1         
	//  547 1178:iconst_0        
	//  548 1179:invokevirtual   #911 <Method void dispatchOnFragmentResumed(Fragment, boolean)>
					fragment.mSavedFragmentState = null;
	//  549 1182:aload_1         
	//  550 1183:aconst_null     
	//  551 1184:putfield        #1078 <Field Bundle Fragment.mSavedFragmentState>
					fragment.mSavedViewState = null;
	//  552 1187:aload_1         
	//  553 1188:aconst_null     
	//  554 1189:putfield        #1255 <Field SparseArray Fragment.mSavedViewState>
					i = j;
	//  555 1192:iload_3         
	//  556 1193:istore_2        
				}
				// fall through

			default:
				l = i;
	//  557 1194:iload_2         
	//  558 1195:istore          6
				break;
			}
		} else
	//* 559 1197:goto            1793
		{
			l = i;
	//  560 1200:iload_2         
	//  561 1201:istore          6
			if(fragment.mState > i)
	//* 562 1203:aload_1         
	//* 563 1204:getfield        #197 <Field int Fragment.mState>
	//* 564 1207:iload_2         
	//* 565 1208:icmple          1793
				switch(fragment.mState)
	//* 566 1211:aload_1         
	//* 567 1212:getfield        #197 <Field int Fragment.mState>
				{
	//* 568 1215:tableswitch     1 5: default 1248
	//	               1 1626
	//	               2 1389
	//	               3 1348
	//	               4 1301
	//	               5 1254
				default:
					l = i;
	//  569 1248:iload_2         
	//  570 1249:istore          6
					break;
	//  571 1251:goto            1793

				case 5: // '\005'
					if(i < 5)
	//* 572 1254:iload_2         
	//* 573 1255:iconst_5        
	//* 574 1256:icmpge          1301
					{
						if(DEBUG)
	//* 575 1259:getstatic       #120 <Field boolean DEBUG>
	//* 576 1262:ifeq            1291
							Log.v("FragmentManager", (new StringBuilder()).append("movefrom RESUMED: ").append(((Object) (fragment))).toString());
	//  577 1265:ldc1            #55  <String "FragmentManager">
	//  578 1267:new             #239 <Class StringBuilder>
	//  579 1270:dup             
	//  580 1271:invokespecial   #240 <Method void StringBuilder()>
	//  581 1274:ldc2            #1377 <String "movefrom RESUMED: ">
	//  582 1277:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  583 1280:aload_1         
	//  584 1281:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//  585 1284:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  586 1287:invokestatic    #690 <Method int Log.v(String, String)>
	//  587 1290:pop             
						fragment.performPause();
	//  588 1291:aload_1         
	//  589 1292:invokevirtual   #1380 <Method void Fragment.performPause()>
						dispatchOnFragmentPaused(fragment, false);
	//  590 1295:aload_0         
	//  591 1296:aload_1         
	//  592 1297:iconst_0        
	//  593 1298:invokevirtual   #899 <Method void dispatchOnFragmentPaused(Fragment, boolean)>
					}
					// fall through

				case 4: // '\004'
					if(i < 4)
	//* 594 1301:iload_2         
	//* 595 1302:iconst_4        
	//* 596 1303:icmpge          1348
					{
						if(DEBUG)
	//* 597 1306:getstatic       #120 <Field boolean DEBUG>
	//* 598 1309:ifeq            1338
							Log.v("FragmentManager", (new StringBuilder()).append("movefrom STARTED: ").append(((Object) (fragment))).toString());
	//  599 1312:ldc1            #55  <String "FragmentManager">
	//  600 1314:new             #239 <Class StringBuilder>
	//  601 1317:dup             
	//  602 1318:invokespecial   #240 <Method void StringBuilder()>
	//  603 1321:ldc2            #1382 <String "movefrom STARTED: ">
	//  604 1324:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  605 1327:aload_1         
	//  606 1328:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//  607 1331:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  608 1334:invokestatic    #690 <Method int Log.v(String, String)>
	//  609 1337:pop             
						fragment.performStop();
	//  610 1338:aload_1         
	//  611 1339:invokevirtual   #1385 <Method void Fragment.performStop()>
						dispatchOnFragmentStopped(fragment, false);
	//  612 1342:aload_0         
	//  613 1343:aload_1         
	//  614 1344:iconst_0        
	//  615 1345:invokevirtual   #929 <Method void dispatchOnFragmentStopped(Fragment, boolean)>
					}
					// fall through

				case 3: // '\003'
					if(i < 3)
	//* 616 1348:iload_2         
	//* 617 1349:iconst_3        
	//* 618 1350:icmpge          1389
					{
						if(DEBUG)
	//* 619 1353:getstatic       #120 <Field boolean DEBUG>
	//* 620 1356:ifeq            1385
							Log.v("FragmentManager", (new StringBuilder()).append("movefrom STOPPED: ").append(((Object) (fragment))).toString());
	//  621 1359:ldc1            #55  <String "FragmentManager">
	//  622 1361:new             #239 <Class StringBuilder>
	//  623 1364:dup             
	//  624 1365:invokespecial   #240 <Method void StringBuilder()>
	//  625 1368:ldc2            #1387 <String "movefrom STOPPED: ">
	//  626 1371:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  627 1374:aload_1         
	//  628 1375:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//  629 1378:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  630 1381:invokestatic    #690 <Method int Log.v(String, String)>
	//  631 1384:pop             
						fragment.performReallyStop();
	//  632 1385:aload_1         
	//  633 1386:invokevirtual   #1390 <Method void Fragment.performReallyStop()>
					}
					// fall through

				case 2: // '\002'
					if(i < 2)
	//* 634 1389:iload_2         
	//* 635 1390:iconst_2        
	//* 636 1391:icmpge          1626
					{
						if(DEBUG)
	//* 637 1394:getstatic       #120 <Field boolean DEBUG>
	//* 638 1397:ifeq            1426
							Log.v("FragmentManager", (new StringBuilder()).append("movefrom ACTIVITY_CREATED: ").append(((Object) (fragment))).toString());
	//  639 1400:ldc1            #55  <String "FragmentManager">
	//  640 1402:new             #239 <Class StringBuilder>
	//  641 1405:dup             
	//  642 1406:invokespecial   #240 <Method void StringBuilder()>
	//  643 1409:ldc2            #1392 <String "movefrom ACTIVITY_CREATED: ">
	//  644 1412:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  645 1415:aload_1         
	//  646 1416:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//  647 1419:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  648 1422:invokestatic    #690 <Method int Log.v(String, String)>
	//  649 1425:pop             
						if(fragment.mView != null && mHost.onShouldSaveFragmentState(fragment) && fragment.mSavedViewState == null)
	//* 650 1426:aload_1         
	//* 651 1427:getfield        #211 <Field View Fragment.mView>
	//* 652 1430:ifnull          1456
	//* 653 1433:aload_0         
	//* 654 1434:getfield        #337 <Field FragmentHostCallback mHost>
	//* 655 1437:aload_1         
	//* 656 1438:invokevirtual   #1396 <Method boolean FragmentHostCallback.onShouldSaveFragmentState(Fragment)>
	//* 657 1441:ifeq            1456
	//* 658 1444:aload_1         
	//* 659 1445:getfield        #1255 <Field SparseArray Fragment.mSavedViewState>
	//* 660 1448:ifnonnull       1456
							saveFragmentViewState(fragment);
	//  661 1451:aload_0         
	//  662 1452:aload_1         
	//  663 1453:invokevirtual   #1399 <Method void saveFragmentViewState(Fragment)>
						fragment.performDestroyView();
	//  664 1456:aload_1         
	//  665 1457:invokevirtual   #1402 <Method void Fragment.performDestroyView()>
						dispatchOnFragmentViewDestroyed(fragment, false);
	//  666 1460:aload_0         
	//  667 1461:aload_1         
	//  668 1462:iconst_0        
	//  669 1463:invokevirtual   #943 <Method void dispatchOnFragmentViewDestroyed(Fragment, boolean)>
						if(fragment.mView != null && fragment.mContainer != null)
	//* 670 1466:aload_1         
	//* 671 1467:getfield        #211 <Field View Fragment.mView>
	//* 672 1470:ifnull          1606
	//* 673 1473:aload_1         
	//* 674 1474:getfield        #451 <Field ViewGroup Fragment.mContainer>
	//* 675 1477:ifnull          1606
						{
							Object obj1 = null;
	//  676 1480:aconst_null     
	//  677 1481:astore          9
							Animation animation = ((Animation) (obj1));
	//  678 1483:aload           9
	//  679 1485:astore          8
							if(mCurState > 0)
	//* 680 1487:aload_0         
	//* 681 1488:getfield        #153 <Field int mCurState>
	//* 682 1491:ifle            1543
							{
								animation = ((Animation) (obj1));
	//  683 1494:aload           9
	//  684 1496:astore          8
								if(!mDestroyed)
	//* 685 1498:aload_0         
	//* 686 1499:getfield        #821 <Field boolean mDestroyed>
	//* 687 1502:ifne            1543
								{
									animation = ((Animation) (obj1));
	//  688 1505:aload           9
	//  689 1507:astore          8
									if(fragment.mView.getVisibility() == 0)
	//* 690 1509:aload_1         
	//* 691 1510:getfield        #211 <Field View Fragment.mView>
	//* 692 1513:invokevirtual   #1359 <Method int View.getVisibility()>
	//* 693 1516:ifne            1543
									{
										animation = ((Animation) (obj1));
	//  694 1519:aload           9
	//  695 1521:astore          8
										if(fragment.mPostponedAlpha >= 0.0F)
	//* 696 1523:aload_1         
	//* 697 1524:getfield        #298 <Field float Fragment.mPostponedAlpha>
	//* 698 1527:fconst_0        
	//* 699 1528:fcmpl           
	//* 700 1529:iflt            1543
											animation = loadAnimation(fragment, j, false, k);
	//  701 1532:aload_0         
	//  702 1533:aload_1         
	//  703 1534:iload_3         
	//  704 1535:iconst_0        
	//  705 1536:iload           4
	//  706 1538:invokevirtual   #772 <Method Animation loadAnimation(Fragment, int, boolean, int)>
	//  707 1541:astore          8
									}
								}
							}
							fragment.mPostponedAlpha = 0.0F;
	//  708 1543:aload_1         
	//  709 1544:fconst_0        
	//  710 1545:putfield        #298 <Field float Fragment.mPostponedAlpha>
							if(animation != null)
	//* 711 1548:aload           8
	//* 712 1550:ifnull          1595
							{
								fragment.setAnimatingAway(fragment.mView);
	//  713 1553:aload_1         
	//  714 1554:aload_1         
	//  715 1555:getfield        #211 <Field View Fragment.mView>
	//  716 1558:invokevirtual   #316 <Method void Fragment.setAnimatingAway(View)>
								fragment.setStateAfterAnimating(i);
	//  717 1561:aload_1         
	//  718 1562:iload_2         
	//  719 1563:invokevirtual   #1405 <Method void Fragment.setStateAfterAnimating(int)>
								animation.setAnimationListener(((android.view.animation.Animation.AnimationListener) (new AnimateOnHWLayerIfNeededListener(animation, fragment) {

									public void onAnimationEnd(Animation animation1)
									{
										super.onAnimationEnd(animation1);
									//    0    0:aload_0         
									//    1    1:aload_1         
									//    2    2:invokespecial   #27  <Method void FragmentManagerImpl$AnimateOnHWLayerIfNeededListener.onAnimationEnd(Animation)>
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
									//   21   41:invokevirtual   #42  <Method void FragmentManagerImpl.moveToState(Fragment, int, int, int, boolean)>
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
			//    4    6:aload           4
			//    5    8:putfield        #19  <Field Fragment val$fragment>
				super(final_view, animation);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:aload_3         
			//    9   14:invokespecial   #22  <Method void FragmentManagerImpl$AnimateOnHWLayerIfNeededListener(View, Animation)>
			//   10   17:return          
			}
								}
)));
	//  720 1566:aload           8
	//  721 1568:new             #10  <Class FragmentManagerImpl$2>
	//  722 1571:dup             
	//  723 1572:aload_0         
	//  724 1573:aload_1         
	//  725 1574:getfield        #211 <Field View Fragment.mView>
	//  726 1577:aload           8
	//  727 1579:aload_1         
	//  728 1580:invokespecial   #1408 <Method void FragmentManagerImpl$2(FragmentManagerImpl, View, Animation, Fragment)>
	//  729 1583:invokevirtual   #628 <Method void Animation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
								fragment.mView.startAnimation(animation);
	//  730 1586:aload_1         
	//  731 1587:getfield        #211 <Field View Fragment.mView>
	//  732 1590:aload           8
	//  733 1592:invokevirtual   #777 <Method void View.startAnimation(Animation)>
							}
							fragment.mContainer.removeView(fragment.mView);
	//  734 1595:aload_1         
	//  735 1596:getfield        #451 <Field ViewGroup Fragment.mContainer>
	//  736 1599:aload_1         
	//  737 1600:getfield        #211 <Field View Fragment.mView>
	//  738 1603:invokevirtual   #1411 <Method void ViewGroup.removeView(View)>
						}
						fragment.mContainer = null;
	//  739 1606:aload_1         
	//  740 1607:aconst_null     
	//  741 1608:putfield        #451 <Field ViewGroup Fragment.mContainer>
						fragment.mView = null;
	//  742 1611:aload_1         
	//  743 1612:aconst_null     
	//  744 1613:putfield        #211 <Field View Fragment.mView>
						fragment.mInnerView = null;
	//  745 1616:aload_1         
	//  746 1617:aconst_null     
	//  747 1618:putfield        #1089 <Field View Fragment.mInnerView>
						fragment.mInLayout = false;
	//  748 1621:aload_1         
	//  749 1622:iconst_0        
	//  750 1623:putfield        #1236 <Field boolean Fragment.mInLayout>
					}
					// fall through

				case 1: // '\001'
					l = i;
	//  751 1626:iload_2         
	//  752 1627:istore          6
					if(i >= 1)
						break;
	//  753 1629:iload_2         
	//  754 1630:iconst_1        
	//  755 1631:icmpge          1793
					if(mDestroyed && fragment.getAnimatingAway() != null)
	//* 756 1634:aload_0         
	//* 757 1635:getfield        #821 <Field boolean mDestroyed>
	//* 758 1638:ifeq            1664
	//* 759 1641:aload_1         
	//* 760 1642:invokevirtual   #309 <Method View Fragment.getAnimatingAway()>
	//* 761 1645:ifnull          1664
					{
						View view = fragment.getAnimatingAway();
	//  762 1648:aload_1         
	//  763 1649:invokevirtual   #309 <Method View Fragment.getAnimatingAway()>
	//  764 1652:astore          8
						fragment.setAnimatingAway(((View) (null)));
	//  765 1654:aload_1         
	//  766 1655:aconst_null     
	//  767 1656:invokevirtual   #316 <Method void Fragment.setAnimatingAway(View)>
						view.clearAnimation();
	//  768 1659:aload           8
	//  769 1661:invokevirtual   #1414 <Method void View.clearAnimation()>
					}
					if(fragment.getAnimatingAway() != null)
	//* 770 1664:aload_1         
	//* 771 1665:invokevirtual   #309 <Method View Fragment.getAnimatingAway()>
	//* 772 1668:ifnull          1682
					{
						fragment.setStateAfterAnimating(i);
	//  773 1671:aload_1         
	//  774 1672:iload_2         
	//  775 1673:invokevirtual   #1405 <Method void Fragment.setStateAfterAnimating(int)>
						l = 1;
	//  776 1676:iconst_1        
	//  777 1677:istore          6
						break;
	//  778 1679:goto            1793
					}
					if(DEBUG)
	//* 779 1682:getstatic       #120 <Field boolean DEBUG>
	//* 780 1685:ifeq            1714
						Log.v("FragmentManager", (new StringBuilder()).append("movefrom CREATED: ").append(((Object) (fragment))).toString());
	//  781 1688:ldc1            #55  <String "FragmentManager">
	//  782 1690:new             #239 <Class StringBuilder>
	//  783 1693:dup             
	//  784 1694:invokespecial   #240 <Method void StringBuilder()>
	//  785 1697:ldc2            #1416 <String "movefrom CREATED: ">
	//  786 1700:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  787 1703:aload_1         
	//  788 1704:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//  789 1707:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  790 1710:invokestatic    #690 <Method int Log.v(String, String)>
	//  791 1713:pop             
					if(!fragment.mRetaining)
	//* 792 1714:aload_1         
	//* 793 1715:getfield        #1310 <Field boolean Fragment.mRetaining>
	//* 794 1718:ifne            1734
					{
						fragment.performDestroy();
	//  795 1721:aload_1         
	//  796 1722:invokevirtual   #1419 <Method void Fragment.performDestroy()>
						dispatchOnFragmentDestroyed(fragment, false);
	//  797 1725:aload_0         
	//  798 1726:aload_1         
	//  799 1727:iconst_0        
	//  800 1728:invokevirtual   #886 <Method void dispatchOnFragmentDestroyed(Fragment, boolean)>
					} else
	//* 801 1731:goto            1739
					{
						fragment.mState = 0;
	//  802 1734:aload_1         
	//  803 1735:iconst_0        
	//  804 1736:putfield        #197 <Field int Fragment.mState>
					}
					fragment.performDetach();
	//  805 1739:aload_1         
	//  806 1740:invokevirtual   #1422 <Method void Fragment.performDetach()>
					dispatchOnFragmentDetached(fragment, false);
	//  807 1743:aload_0         
	//  808 1744:aload_1         
	//  809 1745:iconst_0        
	//  810 1746:invokevirtual   #893 <Method void dispatchOnFragmentDetached(Fragment, boolean)>
					l = i;
	//  811 1749:iload_2         
	//  812 1750:istore          6
					if(flag)
						break;
	//  813 1752:iload           5
	//  814 1754:ifne            1793
					if(!fragment.mRetaining)
	//* 815 1757:aload_1         
	//* 816 1758:getfield        #1310 <Field boolean Fragment.mRetaining>
	//* 817 1761:ifne            1775
					{
						makeInactive(fragment);
	//  818 1764:aload_0         
	//  819 1765:aload_1         
	//  820 1766:invokevirtual   #1424 <Method void makeInactive(Fragment)>
						l = i;
	//  821 1769:iload_2         
	//  822 1770:istore          6
					} else
	//* 823 1772:goto            1793
					{
						fragment.mHost = null;
	//  824 1775:aload_1         
	//  825 1776:aconst_null     
	//  826 1777:putfield        #1271 <Field FragmentHostCallback Fragment.mHost>
						fragment.mParentFragment = null;
	//  827 1780:aload_1         
	//  828 1781:aconst_null     
	//  829 1782:putfield        #1274 <Field Fragment Fragment.mParentFragment>
						fragment.mFragmentManager = null;
	//  830 1785:aload_1         
	//  831 1786:aconst_null     
	//  832 1787:putfield        #1285 <Field FragmentManagerImpl Fragment.mFragmentManager>
						l = i;
	//  833 1790:iload_2         
	//  834 1791:istore          6
					}
					break;
				}
		}
		if(fragment.mState != l)
	//* 835 1793:aload_1         
	//* 836 1794:getfield        #197 <Field int Fragment.mState>
	//* 837 1797:iload           6
	//* 838 1799:icmpeq          1864
		{
			Log.w("FragmentManager", (new StringBuilder()).append("moveToState: Fragment state for ").append(((Object) (fragment))).append(" not updated inline; ").append("expected state ").append(l).append(" found ").append(fragment.mState).toString());
	//  839 1802:ldc1            #55  <String "FragmentManager">
	//  840 1804:new             #239 <Class StringBuilder>
	//  841 1807:dup             
	//  842 1808:invokespecial   #240 <Method void StringBuilder()>
	//  843 1811:ldc2            #1426 <String "moveToState: Fragment state for ">
	//  844 1814:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  845 1817:aload_1         
	//  846 1818:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//  847 1821:ldc2            #1428 <String " not updated inline; ">
	//  848 1824:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  849 1827:ldc2            #1430 <String "expected state ">
	//  850 1830:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  851 1833:iload           6
	//  852 1835:invokevirtual   #733 <Method StringBuilder StringBuilder.append(int)>
	//  853 1838:ldc2            #1432 <String " found ">
	//  854 1841:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  855 1844:aload_1         
	//  856 1845:getfield        #197 <Field int Fragment.mState>
	//  857 1848:invokevirtual   #733 <Method StringBuilder StringBuilder.append(int)>
	//  858 1851:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  859 1854:invokestatic    #1435 <Method int Log.w(String, String)>
	//  860 1857:pop             
			fragment.mState = l;
	//  861 1858:aload_1         
	//  862 1859:iload           6
	//  863 1861:putfield        #197 <Field int Fragment.mState>
		}
	//  864 1864:return          
	}

	public void noteStateNotSaved()
	{
		mStateSaved = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #228 <Field boolean mStateSaved>
	//    3    5:return          
	}

	public View onCreateView(View view, String s, Context context, AttributeSet attributeset)
	{
		if(!"fragment".equals(((Object) (s))))
	//*   0    0:ldc2            #1440 <String "fragment">
	//*   1    3:aload_2         
	//*   2    4:invokevirtual   #1115 <Method boolean String.equals(Object)>
	//*   3    7:ifne            12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		s = attributeset.getAttributeValue(((String) (null)), "class");
	//    6   12:aload           4
	//    7   14:aconst_null     
	//    8   15:ldc2            #1442 <String "class">
	//    9   18:invokeinterface #1448 <Method String AttributeSet.getAttributeValue(String, String)>
	//   10   23:astore_2        
		TypedArray typedarray = context.obtainStyledAttributes(attributeset, FragmentTag.Fragment);
	//   11   24:aload_3         
	//   12   25:aload           4
	//   13   27:getstatic       #1452 <Field int[] FragmentManagerImpl$FragmentTag.Fragment>
	//   14   30:invokevirtual   #1456 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
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
	//   22   45:invokevirtual   #1461 <Method String TypedArray.getString(int)>
	//   23   48:astore          8
		int k = typedarray.getResourceId(1, -1);
	//   24   50:aload           10
	//   25   52:iconst_1        
	//   26   53:iconst_m1       
	//   27   54:invokevirtual   #1464 <Method int TypedArray.getResourceId(int, int)>
	//   28   57:istore          7
		String s2 = typedarray.getString(2);
	//   29   59:aload           10
	//   30   61:iconst_2        
	//   31   62:invokevirtual   #1461 <Method String TypedArray.getString(int)>
	//   32   65:astore          9
		typedarray.recycle();
	//   33   67:aload           10
	//   34   69:invokevirtual   #1467 <Method void TypedArray.recycle()>
		if(!Fragment.isSupportFragmentClass(mHost.getContext(), s1))
	//*  35   72:aload_0         
	//*  36   73:getfield        #337 <Field FragmentHostCallback mHost>
	//*  37   76:invokevirtual   #1161 <Method Context FragmentHostCallback.getContext()>
	//*  38   79:aload           8
	//*  39   81:invokestatic    #1471 <Method boolean Fragment.isSupportFragmentClass(Context, String)>
	//*  40   84:ifne            89
			return null;
	//   41   87:aconst_null     
	//   42   88:areturn         
		int i;
		if(view != null)
	//*  43   89:aload_1         
	//*  44   90:ifnull          102
			i = view.getId();
	//   45   93:aload_1         
	//   46   94:invokevirtual   #1474 <Method int View.getId()>
	//   47   97:istore          5
		else
	//*  48   99:goto            105
			i = 0;
	//   49  102:iconst_0        
	//   50  103:istore          5
		if(i == -1 && k == -1 && s2 == null)
	//*  51  105:iload           5
	//*  52  107:iconst_m1       
	//*  53  108:icmpne          161
	//*  54  111:iload           7
	//*  55  113:iconst_m1       
	//*  56  114:icmpne          161
	//*  57  117:aload           9
	//*  58  119:ifnonnull       161
			throw new IllegalArgumentException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Must specify unique android:id, android:tag, or have a parent with an id for ").append(s1).toString());
	//   59  122:new             #1323 <Class IllegalArgumentException>
	//   60  125:dup             
	//   61  126:new             #239 <Class StringBuilder>
	//   62  129:dup             
	//   63  130:invokespecial   #240 <Method void StringBuilder()>
	//   64  133:aload           4
	//   65  135:invokeinterface #1477 <Method String AttributeSet.getPositionDescription()>
	//   66  140:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   67  143:ldc2            #1479 <String ": Must specify unique android:id, android:tag, or have a parent with an id for ">
	//   68  146:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   69  149:aload           8
	//   70  151:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   71  154:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   72  157:invokespecial   #1328 <Method void IllegalArgumentException(String)>
	//   73  160:athrow          
		if(k != -1)
	//*  74  161:iload           7
	//*  75  163:iconst_m1       
	//*  76  164:icmpeq          177
			s = ((String) (findFragmentById(k)));
	//   77  167:aload_0         
	//   78  168:iload           7
	//   79  170:invokevirtual   #1481 <Method Fragment findFragmentById(int)>
	//   80  173:astore_2        
		else
	//*  81  174:goto            179
			s = null;
	//   82  177:aconst_null     
	//   83  178:astore_2        
		view = ((View) (s));
	//   84  179:aload_2         
	//   85  180:astore_1        
		if(s == null)
	//*  86  181:aload_2         
	//*  87  182:ifnonnull       199
		{
			view = ((View) (s));
	//   88  185:aload_2         
	//   89  186:astore_1        
			if(s2 != null)
	//*  90  187:aload           9
	//*  91  189:ifnull          199
				view = ((View) (findFragmentByTag(s2)));
	//   92  192:aload_0         
	//   93  193:aload           9
	//   94  195:invokevirtual   #1483 <Method Fragment findFragmentByTag(String)>
	//   95  198:astore_1        
		}
		s = ((String) (view));
	//   96  199:aload_1         
	//   97  200:astore_2        
		if(view == null)
	//*  98  201:aload_1         
	//*  99  202:ifnonnull       220
		{
			s = ((String) (view));
	//  100  205:aload_1         
	//  101  206:astore_2        
			if(i != -1)
	//* 102  207:iload           5
	//* 103  209:iconst_m1       
	//* 104  210:icmpeq          220
				s = ((String) (findFragmentById(i)));
	//  105  213:aload_0         
	//  106  214:iload           5
	//  107  216:invokevirtual   #1481 <Method Fragment findFragmentById(int)>
	//  108  219:astore_2        
		}
		if(DEBUG)
	//* 109  220:getstatic       #120 <Field boolean DEBUG>
	//* 110  223:ifeq            277
			Log.v("FragmentManager", (new StringBuilder()).append("onCreateView: id=0x").append(Integer.toHexString(k)).append(" fname=").append(s1).append(" existing=").append(((Object) (s))).toString());
	//  111  226:ldc1            #55  <String "FragmentManager">
	//  112  228:new             #239 <Class StringBuilder>
	//  113  231:dup             
	//  114  232:invokespecial   #240 <Method void StringBuilder()>
	//  115  235:ldc2            #1485 <String "onCreateView: id=0x">
	//  116  238:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  117  241:iload           7
	//  118  243:invokestatic    #999 <Method String Integer.toHexString(int)>
	//  119  246:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  120  249:ldc2            #1487 <String " fname=">
	//  121  252:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  122  255:aload           8
	//  123  257:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  124  260:ldc2            #1489 <String " existing=">
	//  125  263:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  126  266:aload_2         
	//  127  267:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//  128  270:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  129  273:invokestatic    #690 <Method int Log.v(String, String)>
	//  130  276:pop             
		if(s == null)
	//* 131  277:aload_2         
	//* 132  278:ifnonnull       376
		{
			view = ((View) (mContainer.instantiate(context, s1, ((Bundle) (null)))));
	//  133  281:aload_0         
	//  134  282:getfield        #754 <Field FragmentContainer mContainer>
	//  135  285:aload_3         
	//  136  286:aload           8
	//  137  288:aconst_null     
	//  138  289:invokevirtual   #1493 <Method Fragment FragmentContainer.instantiate(Context, String, Bundle)>
	//  139  292:astore_1        
			view.mFromLayout = true;
	//  140  293:aload_1         
	//  141  294:iconst_1        
	//  142  295:putfield        #1072 <Field boolean Fragment.mFromLayout>
			int j;
			if(k != 0)
	//* 143  298:iload           7
	//* 144  300:ifeq            310
				j = k;
	//  145  303:iload           7
	//  146  305:istore          6
			else
	//* 147  307:goto            314
				j = i;
	//  148  310:iload           5
	//  149  312:istore          6
			view.mFragmentId = j;
	//  150  314:aload_1         
	//  151  315:iload           6
	//  152  317:putfield        #1107 <Field int Fragment.mFragmentId>
			view.mContainerId = i;
	//  153  320:aload_1         
	//  154  321:iload           5
	//  155  323:putfield        #288 <Field int Fragment.mContainerId>
			view.mTag = s2;
	//  156  326:aload_1         
	//  157  327:aload           9
	//  158  329:putfield        #1112 <Field String Fragment.mTag>
			view.mInLayout = true;
	//  159  332:aload_1         
	//  160  333:iconst_1        
	//  161  334:putfield        #1236 <Field boolean Fragment.mInLayout>
			view.mFragmentManager = this;
	//  162  337:aload_1         
	//  163  338:aload_0         
	//  164  339:putfield        #1285 <Field FragmentManagerImpl Fragment.mFragmentManager>
			view.mHost = mHost;
	//  165  342:aload_1         
	//  166  343:aload_0         
	//  167  344:getfield        #337 <Field FragmentHostCallback mHost>
	//  168  347:putfield        #1271 <Field FragmentHostCallback Fragment.mHost>
			((Fragment) (view)).onInflate(mHost.getContext(), attributeset, ((Fragment) (view)).mSavedFragmentState);
	//  169  350:aload_1         
	//  170  351:aload_0         
	//  171  352:getfield        #337 <Field FragmentHostCallback mHost>
	//  172  355:invokevirtual   #1161 <Method Context FragmentHostCallback.getContext()>
	//  173  358:aload           4
	//  174  360:aload_1         
	//  175  361:getfield        #1078 <Field Bundle Fragment.mSavedFragmentState>
	//  176  364:invokevirtual   #1497 <Method void Fragment.onInflate(Context, AttributeSet, Bundle)>
			addFragment(((Fragment) (view)), true);
	//  177  367:aload_0         
	//  178  368:aload_1         
	//  179  369:iconst_1        
	//  180  370:invokevirtual   #1499 <Method void addFragment(Fragment, boolean)>
		} else
	//* 181  373:goto            502
		{
			if(((Fragment) (s)).mInLayout)
	//* 182  376:aload_2         
	//* 183  377:getfield        #1236 <Field boolean Fragment.mInLayout>
	//* 184  380:ifeq            461
				throw new IllegalArgumentException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Duplicate id 0x").append(Integer.toHexString(k)).append(", tag ").append(s2).append(", or parent id 0x").append(Integer.toHexString(i)).append(" with another fragment for ").append(s1).toString());
	//  185  383:new             #1323 <Class IllegalArgumentException>
	//  186  386:dup             
	//  187  387:new             #239 <Class StringBuilder>
	//  188  390:dup             
	//  189  391:invokespecial   #240 <Method void StringBuilder()>
	//  190  394:aload           4
	//  191  396:invokeinterface #1477 <Method String AttributeSet.getPositionDescription()>
	//  192  401:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  193  404:ldc2            #1501 <String ": Duplicate id 0x">
	//  194  407:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  195  410:iload           7
	//  196  412:invokestatic    #999 <Method String Integer.toHexString(int)>
	//  197  415:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  198  418:ldc2            #1503 <String ", tag ">
	//  199  421:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  200  424:aload           9
	//  201  426:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  202  429:ldc2            #1505 <String ", or parent id 0x">
	//  203  432:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  204  435:iload           5
	//  205  437:invokestatic    #999 <Method String Integer.toHexString(int)>
	//  206  440:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  207  443:ldc2            #1507 <String " with another fragment for ">
	//  208  446:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  209  449:aload           8
	//  210  451:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  211  454:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  212  457:invokespecial   #1328 <Method void IllegalArgumentException(String)>
	//  213  460:athrow          
			s.mInLayout = true;
	//  214  461:aload_2         
	//  215  462:iconst_1        
	//  216  463:putfield        #1236 <Field boolean Fragment.mInLayout>
			s.mHost = mHost;
	//  217  466:aload_2         
	//  218  467:aload_0         
	//  219  468:getfield        #337 <Field FragmentHostCallback mHost>
	//  220  471:putfield        #1271 <Field FragmentHostCallback Fragment.mHost>
			view = ((View) (s));
	//  221  474:aload_2         
	//  222  475:astore_1        
			if(!((Fragment) (s)).mRetaining)
	//* 223  476:aload_2         
	//* 224  477:getfield        #1310 <Field boolean Fragment.mRetaining>
	//* 225  480:ifne            502
			{
				((Fragment) (s)).onInflate(mHost.getContext(), attributeset, ((Fragment) (s)).mSavedFragmentState);
	//  226  483:aload_2         
	//  227  484:aload_0         
	//  228  485:getfield        #337 <Field FragmentHostCallback mHost>
	//  229  488:invokevirtual   #1161 <Method Context FragmentHostCallback.getContext()>
	//  230  491:aload           4
	//  231  493:aload_2         
	//  232  494:getfield        #1078 <Field Bundle Fragment.mSavedFragmentState>
	//  233  497:invokevirtual   #1497 <Method void Fragment.onInflate(Context, AttributeSet, Bundle)>
				view = ((View) (s));
	//  234  500:aload_2         
	//  235  501:astore_1        
			}
		}
		if(mCurState < 1 && ((Fragment) (view)).mFromLayout)
	//* 236  502:aload_0         
	//* 237  503:getfield        #153 <Field int mCurState>
	//* 238  506:iconst_1        
	//* 239  507:icmpge          529
	//* 240  510:aload_1         
	//* 241  511:getfield        #1072 <Field boolean Fragment.mFromLayout>
	//* 242  514:ifeq            529
			moveToState(((Fragment) (view)), 1, 0, 0, false);
	//  243  517:aload_0         
	//  244  518:aload_1         
	//  245  519:iconst_1        
	//  246  520:iconst_0        
	//  247  521:iconst_0        
	//  248  522:iconst_0        
	//  249  523:invokevirtual   #207 <Method void moveToState(Fragment, int, int, int, boolean)>
		else
	//* 250  526:goto            534
			moveToState(((Fragment) (view)));
	//  251  529:aload_0         
	//  252  530:aload_1         
	//  253  531:invokevirtual   #718 <Method void moveToState(Fragment)>
		if(((Fragment) (view)).mView == null)
	//* 254  534:aload_1         
	//* 255  535:getfield        #211 <Field View Fragment.mView>
	//* 256  538:ifnonnull       576
			throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(s1).append(" did not create a view.").toString());
	//  257  541:new             #230 <Class IllegalStateException>
	//  258  544:dup             
	//  259  545:new             #239 <Class StringBuilder>
	//  260  548:dup             
	//  261  549:invokespecial   #240 <Method void StringBuilder()>
	//  262  552:ldc2            #1287 <String "Fragment ">
	//  263  555:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  264  558:aload           8
	//  265  560:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  266  563:ldc2            #1509 <String " did not create a view.">
	//  267  566:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  268  569:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  269  572:invokespecial   #235 <Method void IllegalStateException(String)>
	//  270  575:athrow          
		if(k != 0)
	//* 271  576:iload           7
	//* 272  578:ifeq            590
			((Fragment) (view)).mView.setId(k);
	//  273  581:aload_1         
	//  274  582:getfield        #211 <Field View Fragment.mView>
	//  275  585:iload           7
	//  276  587:invokevirtual   #1512 <Method void View.setId(int)>
		if(((Fragment) (view)).mView.getTag() == null)
	//* 277  590:aload_1         
	//* 278  591:getfield        #211 <Field View Fragment.mView>
	//* 279  594:invokevirtual   #1515 <Method Object View.getTag()>
	//* 280  597:ifnonnull       609
			((Fragment) (view)).mView.setTag(((Object) (s2)));
	//  281  600:aload_1         
	//  282  601:getfield        #211 <Field View Fragment.mView>
	//  283  604:aload           9
	//  284  606:invokevirtual   #1518 <Method void View.setTag(Object)>
		return ((Fragment) (view)).mView;
	//  285  609:aload_1         
	//  286  610:getfield        #211 <Field View Fragment.mView>
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
	//    5    5:invokevirtual   #1521 <Method View onCreateView(View, String, Context, AttributeSet)>
	//    6    8:areturn         
	}

	public void performPendingDeferredStart(Fragment fragment)
	{
		if(fragment.mDeferStart)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1233 <Field boolean Fragment.mDeferStart>
	//*   2    4:ifeq            37
		{
			if(mExecutingActions)
	//*   3    7:aload_0         
	//*   4    8:getfield        #253 <Field boolean mExecutingActions>
	//*   5   11:ifeq            20
			{
				mHavePendingDeferredStart = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #971 <Field boolean mHavePendingDeferredStart>
				return;
	//    9   19:return          
			}
			fragment.mDeferStart = false;
	//   10   20:aload_1         
	//   11   21:iconst_0        
	//   12   22:putfield        #1233 <Field boolean Fragment.mDeferStart>
			moveToState(fragment, mCurState, 0, 0, false);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #153 <Field int mCurState>
	//   17   31:iconst_0        
	//   18   32:iconst_0        
	//   19   33:iconst_0        
	//   20   34:invokevirtual   #207 <Method void moveToState(Fragment, int, int, int, boolean)>
		}
	//   21   37:return          
	}

	public void popBackStack()
	{
		enqueueAction(((OpGenerator) (new PopBackStackState(((String) (null)), -1, 0))), false);
	//    0    0:aload_0         
	//    1    1:new             #23  <Class FragmentManagerImpl$PopBackStackState>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:iconst_m1       
	//    6    8:iconst_0        
	//    7    9:invokespecial   #1526 <Method void FragmentManagerImpl$PopBackStackState(FragmentManagerImpl, String, int, int)>
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #1528 <Method void enqueueAction(FragmentManagerImpl$OpGenerator, boolean)>
	//   10   16:return          
	}

	public void popBackStack(int i, int j)
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            32
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Bad id: ").append(i).toString());
	//    2    4:new             #1323 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:new             #239 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #240 <Method void StringBuilder()>
	//    7   15:ldc2            #1531 <String "Bad id: ">
	//    8   18:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:iload_1         
	//   10   22:invokevirtual   #733 <Method StringBuilder StringBuilder.append(int)>
	//   11   25:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   12   28:invokespecial   #1328 <Method void IllegalArgumentException(String)>
	//   13   31:athrow          
		} else
		{
			enqueueAction(((OpGenerator) (new PopBackStackState(((String) (null)), i, j))), false);
	//   14   32:aload_0         
	//   15   33:new             #23  <Class FragmentManagerImpl$PopBackStackState>
	//   16   36:dup             
	//   17   37:aload_0         
	//   18   38:aconst_null     
	//   19   39:iload_1         
	//   20   40:iload_2         
	//   21   41:invokespecial   #1526 <Method void FragmentManagerImpl$PopBackStackState(FragmentManagerImpl, String, int, int)>
	//   22   44:iconst_0        
	//   23   45:invokevirtual   #1528 <Method void enqueueAction(FragmentManagerImpl$OpGenerator, boolean)>
			return;
	//   24   48:return          
		}
	}

	public void popBackStack(String s, int i)
	{
		enqueueAction(((OpGenerator) (new PopBackStackState(s, -1, i))), false);
	//    0    0:aload_0         
	//    1    1:new             #23  <Class FragmentManagerImpl$PopBackStackState>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iconst_m1       
	//    6    8:iload_2         
	//    7    9:invokespecial   #1526 <Method void FragmentManagerImpl$PopBackStackState(FragmentManagerImpl, String, int, int)>
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #1528 <Method void enqueueAction(FragmentManagerImpl$OpGenerator, boolean)>
	//   10   16:return          
	}

	public boolean popBackStackImmediate()
	{
		checkStateLoss();
	//    0    0:aload_0         
	//    1    1:invokespecial   #352 <Method void checkStateLoss()>
		return popBackStackImmediate(((String) (null)), -1, 0);
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:iconst_m1       
	//    5    7:iconst_0        
	//    6    8:invokespecial   #1534 <Method boolean popBackStackImmediate(String, int, int)>
	//    7   11:ireturn         
	}

	public boolean popBackStackImmediate(int i, int j)
	{
		checkStateLoss();
	//    0    0:aload_0         
	//    1    1:invokespecial   #352 <Method void checkStateLoss()>
		execPendingActions();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #538 <Method boolean execPendingActions()>
	//    4    8:pop             
		if(i < 0)
	//*   5    9:iload_1         
	//*   6   10:ifge            41
			throw new IllegalArgumentException((new StringBuilder()).append("Bad id: ").append(i).toString());
	//    7   13:new             #1323 <Class IllegalArgumentException>
	//    8   16:dup             
	//    9   17:new             #239 <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #240 <Method void StringBuilder()>
	//   12   24:ldc2            #1531 <String "Bad id: ">
	//   13   27:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:iload_1         
	//   15   31:invokevirtual   #733 <Method StringBuilder StringBuilder.append(int)>
	//   16   34:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   17   37:invokespecial   #1328 <Method void IllegalArgumentException(String)>
	//   18   40:athrow          
		else
			return popBackStackImmediate(((String) (null)), i, j);
	//   19   41:aload_0         
	//   20   42:aconst_null     
	//   21   43:iload_1         
	//   22   44:iload_2         
	//   23   45:invokespecial   #1534 <Method boolean popBackStackImmediate(String, int, int)>
	//   24   48:ireturn         
	}

	public boolean popBackStackImmediate(String s, int i)
	{
		checkStateLoss();
	//    0    0:aload_0         
	//    1    1:invokespecial   #352 <Method void checkStateLoss()>
		return popBackStackImmediate(s, -1, i);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iconst_m1       
	//    5    7:iload_2         
	//    6    8:invokespecial   #1534 <Method boolean popBackStackImmediate(String, int, int)>
	//    7   11:ireturn         
	}

	boolean popBackStackState(ArrayList arraylist, ArrayList arraylist1, String s, int i, int j)
	{
		if(mBackStack == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #680 <Field ArrayList mBackStack>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(s == null && i < 0 && (j & 1) == 0)
	//*   5    9:aload_3         
	//*   6   10:ifnonnull       69
	//*   7   13:iload           4
	//*   8   15:ifge            69
	//*   9   18:iload           5
	//*  10   20:iconst_1        
	//*  11   21:iand            
	//*  12   22:ifne            69
		{
			i = mBackStack.size() - 1;
	//   13   25:aload_0         
	//   14   26:getfield        #680 <Field ArrayList mBackStack>
	//   15   29:invokevirtual   #188 <Method int ArrayList.size()>
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
	//   25   45:getfield        #680 <Field ArrayList mBackStack>
	//   26   48:iload           4
	//   27   50:invokevirtual   #442 <Method Object ArrayList.remove(int)>
	//   28   53:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
	//   29   56:pop             
			arraylist1.add(((Object) (Boolean.valueOf(true))));
	//   30   57:aload_2         
	//   31   58:iconst_1        
	//   32   59:invokestatic    #270 <Method Boolean Boolean.valueOf(boolean)>
	//   33   62:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
	//   34   65:pop             
		} else
	//*  35   66:goto            318
		{
			int k = -1;
	//   36   69:iconst_m1       
	//   37   70:istore          6
			if(s != null || i >= 0)
	//*  38   72:aload_3         
	//*  39   73:ifnonnull       81
	//*  40   76:iload           4
	//*  41   78:iflt            252
			{
				int l = mBackStack.size() - 1;
	//   42   81:aload_0         
	//   43   82:getfield        #680 <Field ArrayList mBackStack>
	//   44   85:invokevirtual   #188 <Method int ArrayList.size()>
	//   45   88:iconst_1        
	//   46   89:isub            
	//   47   90:istore          7
				do
				{
					if(l < 0)
						break;
	//   48   92:iload           7
	//   49   94:iflt            157
					BackStackRecord backstackrecord = (BackStackRecord)mBackStack.get(l);
	//   50   97:aload_0         
	//   51   98:getfield        #680 <Field ArrayList mBackStack>
	//   52  101:iload           7
	//   53  103:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   54  106:checkcast       #290 <Class BackStackRecord>
	//   55  109:astore          8
					if(s != null && s.equals(((Object) (backstackrecord.getName()))) || i >= 0 && i == backstackrecord.mIndex)
	//*  56  111:aload_3         
	//*  57  112:ifnull          130
	//*  58  115:aload_3         
	//*  59  116:aload           8
	//*  60  118:invokevirtual   #1539 <Method String BackStackRecord.getName()>
	//*  61  121:invokevirtual   #1115 <Method boolean String.equals(Object)>
	//*  62  124:ifeq            130
	//*  63  127:goto            157
	//*  64  130:iload           4
	//*  65  132:iflt            148
	//*  66  135:iload           4
	//*  67  137:aload           8
	//*  68  139:getfield        #407 <Field int BackStackRecord.mIndex>
	//*  69  142:icmpne          148
						break;
	//   70  145:goto            157
					l--;
	//   71  148:iload           7
	//   72  150:iconst_1        
	//   73  151:isub            
	//   74  152:istore          7
				} while(true);
	//   75  154:goto            92
				if(l < 0)
	//*  76  157:iload           7
	//*  77  159:ifge            164
					return false;
	//   78  162:iconst_0        
	//   79  163:ireturn         
				k = l;
	//   80  164:iload           7
	//   81  166:istore          6
				if((j & 1) != 0)
	//*  82  168:iload           5
	//*  83  170:iconst_1        
	//*  84  171:iand            
	//*  85  172:ifeq            252
				{
					j = l - 1;
	//   86  175:iload           7
	//   87  177:iconst_1        
	//   88  178:isub            
	//   89  179:istore          5
					do
					{
						k = j;
	//   90  181:iload           5
	//   91  183:istore          6
						if(j < 0)
							break;
	//   92  185:iload           5
	//   93  187:iflt            252
						BackStackRecord backstackrecord1 = (BackStackRecord)mBackStack.get(j);
	//   94  190:aload_0         
	//   95  191:getfield        #680 <Field ArrayList mBackStack>
	//   96  194:iload           5
	//   97  196:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   98  199:checkcast       #290 <Class BackStackRecord>
	//   99  202:astore          8
						if(s == null || !s.equals(((Object) (backstackrecord1.getName()))))
	//* 100  204:aload_3         
	//* 101  205:ifnull          220
	//* 102  208:aload_3         
	//* 103  209:aload           8
	//* 104  211:invokevirtual   #1539 <Method String BackStackRecord.getName()>
	//* 105  214:invokevirtual   #1115 <Method boolean String.equals(Object)>
	//* 106  217:ifne            243
						{
							k = j;
	//  107  220:iload           5
	//  108  222:istore          6
							if(i < 0)
								break;
	//  109  224:iload           4
	//  110  226:iflt            252
							k = j;
	//  111  229:iload           5
	//  112  231:istore          6
							if(i != backstackrecord1.mIndex)
								break;
	//  113  233:iload           4
	//  114  235:aload           8
	//  115  237:getfield        #407 <Field int BackStackRecord.mIndex>
	//  116  240:icmpne          252
						}
						j--;
	//  117  243:iload           5
	//  118  245:iconst_1        
	//  119  246:isub            
	//  120  247:istore          5
					} while(true);
	//  121  249:goto            181
				}
			}
			if(k == mBackStack.size() - 1)
	//* 122  252:iload           6
	//* 123  254:aload_0         
	//* 124  255:getfield        #680 <Field ArrayList mBackStack>
	//* 125  258:invokevirtual   #188 <Method int ArrayList.size()>
	//* 126  261:iconst_1        
	//* 127  262:isub            
	//* 128  263:icmpne          268
				return false;
	//  129  266:iconst_0        
	//  130  267:ireturn         
			for(i = mBackStack.size() - 1; i > k; i--)
	//* 131  268:aload_0         
	//* 132  269:getfield        #680 <Field ArrayList mBackStack>
	//* 133  272:invokevirtual   #188 <Method int ArrayList.size()>
	//* 134  275:iconst_1        
	//* 135  276:isub            
	//* 136  277:istore          4
	//* 137  279:iload           4
	//* 138  281:iload           6
	//* 139  283:icmple          318
			{
				arraylist.add(mBackStack.remove(i));
	//  140  286:aload_1         
	//  141  287:aload_0         
	//  142  288:getfield        #680 <Field ArrayList mBackStack>
	//  143  291:iload           4
	//  144  293:invokevirtual   #442 <Method Object ArrayList.remove(int)>
	//  145  296:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
	//  146  299:pop             
				arraylist1.add(((Object) (Boolean.valueOf(true))));
	//  147  300:aload_2         
	//  148  301:iconst_1        
	//  149  302:invokestatic    #270 <Method Boolean Boolean.valueOf(boolean)>
	//  150  305:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
	//  151  308:pop             
			}

	//  152  309:iload           4
	//  153  311:iconst_1        
	//  154  312:isub            
	//  155  313:istore          4
		}
	//* 156  315:goto            279
		return true;
	//  157  318:iconst_1        
	//  158  319:ireturn         
	}

	public void putFragment(Bundle bundle, String s, Fragment fragment)
	{
		if(fragment.mIndex < 0)
	//*   0    0:aload_3         
	//*   1    1:getfield        #1182 <Field int Fragment.mIndex>
	//*   2    4:ifge            44
			throwException(((RuntimeException) (new IllegalStateException((new StringBuilder()).append("Fragment ").append(((Object) (fragment))).append(" is not currently in the FragmentManager").toString()))));
	//    3    7:aload_0         
	//    4    8:new             #230 <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:new             #239 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #240 <Method void StringBuilder()>
	//    9   19:ldc2            #1287 <String "Fragment ">
	//   10   22:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_3         
	//   12   26:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:ldc2            #1544 <String " is not currently in the FragmentManager">
	//   14   32:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   16   38:invokespecial   #235 <Method void IllegalStateException(String)>
	//   17   41:invokespecial   #1142 <Method void throwException(RuntimeException)>
		bundle.putInt(s, fragment.mIndex);
	//   18   44:aload_1         
	//   19   45:aload_2         
	//   20   46:aload_3         
	//   21   47:getfield        #1182 <Field int Fragment.mIndex>
	//   22   50:invokevirtual   #1547 <Method void Bundle.putInt(String, int)>
	//   23   53:return          
	}

	public void registerFragmentLifecycleCallbacks(FragmentManager.FragmentLifecycleCallbacks fragmentlifecyclecallbacks, boolean flag)
	{
		if(mLifecycleCallbacks == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//*   2    4:ifnonnull       18
			mLifecycleCallbacks = new CopyOnWriteArrayList();
	//    3    7:aload_0         
	//    4    8:new             #841 <Class CopyOnWriteArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #1550 <Method void CopyOnWriteArrayList()>
	//    7   15:putfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
		mLifecycleCallbacks.add(((Object) (new Pair(((Object) (fragmentlifecyclecallbacks)), ((Object) (Boolean.valueOf(flag)))))));
	//    8   18:aload_0         
	//    9   19:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   10   22:new             #856 <Class Pair>
	//   11   25:dup             
	//   12   26:aload_1         
	//   13   27:iload_2         
	//   14   28:invokestatic    #270 <Method Boolean Boolean.valueOf(boolean)>
	//   15   31:invokespecial   #1553 <Method void Pair(Object, Object)>
	//   16   34:invokevirtual   #1554 <Method boolean CopyOnWriteArrayList.add(Object)>
	//   17   37:pop             
	//   18   38:return          
	}

	public void removeFragment(Fragment fragment)
	{
		if(DEBUG)
	//*   0    0:getstatic       #120 <Field boolean DEBUG>
	//*   1    3:ifeq            45
			Log.v("FragmentManager", (new StringBuilder()).append("remove: ").append(((Object) (fragment))).append(" nesting=").append(fragment.mBackStackNesting).toString());
	//    2    6:ldc1            #55  <String "FragmentManager">
	//    3    8:new             #239 <Class StringBuilder>
	//    4   11:dup             
	//    5   12:invokespecial   #240 <Method void StringBuilder()>
	//    6   15:ldc2            #1557 <String "remove: ">
	//    7   18:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//    8   21:aload_1         
	//    9   22:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//   10   25:ldc2            #1559 <String " nesting=">
	//   11   28:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   12   31:aload_1         
	//   13   32:getfield        #1562 <Field int Fragment.mBackStackNesting>
	//   14   35:invokevirtual   #733 <Method StringBuilder StringBuilder.append(int)>
	//   15   38:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   16   41:invokestatic    #690 <Method int Log.v(String, String)>
	//   17   44:pop             
		boolean flag;
		if(!fragment.isInBackStack())
	//*  18   45:aload_1         
	//*  19   46:invokevirtual   #1204 <Method boolean Fragment.isInBackStack()>
	//*  20   49:ifne            57
			flag = true;
	//   21   52:iconst_1        
	//   22   53:istore_2        
		else
	//*  23   54:goto            59
			flag = false;
	//   24   57:iconst_0        
	//   25   58:istore_2        
		if(!fragment.mDetached || flag)
	//*  26   59:aload_1         
	//*  27   60:getfield        #697 <Field boolean Fragment.mDetached>
	//*  28   63:ifeq            70
	//*  29   66:iload_2         
	//*  30   67:ifeq            115
		{
			if(mAdded != null)
	//*  31   70:aload_0         
	//*  32   71:getfield        #182 <Field ArrayList mAdded>
	//*  33   74:ifnull          86
				mAdded.remove(((Object) (fragment)));
	//   34   77:aload_0         
	//   35   78:getfield        #182 <Field ArrayList mAdded>
	//   36   81:aload_1         
	//   37   82:invokevirtual   #796 <Method boolean ArrayList.remove(Object)>
	//   38   85:pop             
			if(fragment.mHasMenu && fragment.mMenuVisible)
	//*  39   86:aload_1         
	//*  40   87:getfield        #711 <Field boolean Fragment.mHasMenu>
	//*  41   90:ifeq            105
	//*  42   93:aload_1         
	//*  43   94:getfield        #714 <Field boolean Fragment.mMenuVisible>
	//*  44   97:ifeq            105
				mNeedMenuInvalidate = true;
	//   45  100:aload_0         
	//   46  101:iconst_1        
	//   47  102:putfield        #716 <Field boolean mNeedMenuInvalidate>
			fragment.mAdded = false;
	//   48  105:aload_1         
	//   49  106:iconst_0        
	//   50  107:putfield        #508 <Field boolean Fragment.mAdded>
			fragment.mRemoving = true;
	//   51  110:aload_1         
	//   52  111:iconst_1        
	//   53  112:putfield        #705 <Field boolean Fragment.mRemoving>
		}
	//   54  115:return          
	}

	public void removeOnBackStackChangedListener(FragmentManager.OnBackStackChangedListener onbackstackchangedlistener)
	{
		if(mBackStackChangeListeners != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #722 <Field ArrayList mBackStackChangeListeners>
	//*   2    4:ifnull          16
			mBackStackChangeListeners.remove(((Object) (onbackstackchangedlistener)));
	//    3    7:aload_0         
	//    4    8:getfield        #722 <Field ArrayList mBackStackChangeListeners>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #796 <Method boolean ArrayList.remove(Object)>
	//    7   15:pop             
	//    8   16:return          
	}

	void reportBackStackChanged()
	{
		if(mBackStackChangeListeners != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #722 <Field ArrayList mBackStackChangeListeners>
	//*   2    4:ifnull          43
		{
			for(int i = 0; i < mBackStackChangeListeners.size(); i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_1        
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #722 <Field ArrayList mBackStackChangeListeners>
	//*   8   14:invokevirtual   #188 <Method int ArrayList.size()>
	//*   9   17:icmpge          43
				((FragmentManager.OnBackStackChangedListener)mBackStackChangeListeners.get(i)).onBackStackChanged();
	//   10   20:aload_0         
	//   11   21:getfield        #722 <Field ArrayList mBackStackChangeListeners>
	//   12   24:iload_1         
	//   13   25:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   14   28:checkcast       #1565 <Class FragmentManager$OnBackStackChangedListener>
	//   15   31:invokeinterface #1568 <Method void FragmentManager$OnBackStackChangedListener.onBackStackChanged()>

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
		if(parcelable == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		FragmentManagerState fragmentmanagerstate = (FragmentManagerState)parcelable;
	//    3    5:aload_1         
	//    4    6:checkcast       #1572 <Class FragmentManagerState>
	//    5    9:astore          7
		if(fragmentmanagerstate.mActive == null)
	//*   6   11:aload           7
	//*   7   13:getfield        #1575 <Field FragmentState[] FragmentManagerState.mActive>
	//*   8   16:ifnonnull       20
			return;
	//    9   19:return          
		parcelable = null;
	//   10   20:aconst_null     
	//   11   21:astore_1        
		if(fragmentmanagernonconfig != null)
	//*  12   22:aload_2         
	//*  13   23:ifnull          214
		{
			List list1 = fragmentmanagernonconfig.getFragments();
	//   14   26:aload_2         
	//   15   27:invokevirtual   #1579 <Method List FragmentManagerNonConfig.getFragments()>
	//   16   30:astore          6
			List list = fragmentmanagernonconfig.getChildNonConfigs();
	//   17   32:aload_2         
	//   18   33:invokevirtual   #1582 <Method List FragmentManagerNonConfig.getChildNonConfigs()>
	//   19   36:astore          5
			int i;
			if(list1 != null)
	//*  20   38:aload           6
	//*  21   40:ifnull          54
				i = list1.size();
	//   22   43:aload           6
	//   23   45:invokeinterface #527 <Method int List.size()>
	//   24   50:istore_3        
			else
	//*  25   51:goto            56
				i = 0;
	//   26   54:iconst_0        
	//   27   55:istore_3        
			int j1 = 0;
	//   28   56:iconst_0        
	//   29   57:istore          4
			do
			{
				parcelable = ((Parcelable) (list));
	//   30   59:aload           5
	//   31   61:astore_1        
				if(j1 >= i)
					break;
	//   32   62:iload           4
	//   33   64:iload_3         
	//   34   65:icmpge          214
				parcelable = ((Parcelable) ((Fragment)list1.get(j1)));
	//   35   68:aload           6
	//   36   70:iload           4
	//   37   72:invokeinterface #528 <Method Object List.get(int)>
	//   38   77:checkcast       #194 <Class Fragment>
	//   39   80:astore_1        
				if(DEBUG)
	//*  40   81:getstatic       #120 <Field boolean DEBUG>
	//*  41   84:ifeq            113
					Log.v("FragmentManager", (new StringBuilder()).append("restoreAllState: re-attaching retained ").append(((Object) (parcelable))).toString());
	//   42   87:ldc1            #55  <String "FragmentManager">
	//   43   89:new             #239 <Class StringBuilder>
	//   44   92:dup             
	//   45   93:invokespecial   #240 <Method void StringBuilder()>
	//   46   96:ldc2            #1584 <String "restoreAllState: re-attaching retained ">
	//   47   99:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   48  102:aload_1         
	//   49  103:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//   50  106:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   51  109:invokestatic    #690 <Method int Log.v(String, String)>
	//   52  112:pop             
				FragmentState fragmentstate = fragmentmanagerstate.mActive[((Fragment) (parcelable)).mIndex];
	//   53  113:aload           7
	//   54  115:getfield        #1575 <Field FragmentState[] FragmentManagerState.mActive>
	//   55  118:aload_1         
	//   56  119:getfield        #1182 <Field int Fragment.mIndex>
	//   57  122:aaload          
	//   58  123:astore          8
				fragmentstate.mInstance = ((Fragment) (parcelable));
	//   59  125:aload           8
	//   60  127:aload_1         
	//   61  128:putfield        #1589 <Field Fragment FragmentState.mInstance>
				parcelable.mSavedViewState = null;
	//   62  131:aload_1         
	//   63  132:aconst_null     
	//   64  133:putfield        #1255 <Field SparseArray Fragment.mSavedViewState>
				parcelable.mBackStackNesting = 0;
	//   65  136:aload_1         
	//   66  137:iconst_0        
	//   67  138:putfield        #1562 <Field int Fragment.mBackStackNesting>
				parcelable.mInLayout = false;
	//   68  141:aload_1         
	//   69  142:iconst_0        
	//   70  143:putfield        #1236 <Field boolean Fragment.mInLayout>
				parcelable.mAdded = false;
	//   71  146:aload_1         
	//   72  147:iconst_0        
	//   73  148:putfield        #508 <Field boolean Fragment.mAdded>
				parcelable.mTarget = null;
	//   74  151:aload_1         
	//   75  152:aconst_null     
	//   76  153:putfield        #1260 <Field Fragment Fragment.mTarget>
				if(fragmentstate.mSavedFragmentState != null)
	//*  77  156:aload           8
	//*  78  158:getfield        #1590 <Field Bundle FragmentState.mSavedFragmentState>
	//*  79  161:ifnull          205
				{
					fragmentstate.mSavedFragmentState.setClassLoader(mHost.getContext().getClassLoader());
	//   80  164:aload           8
	//   81  166:getfield        #1590 <Field Bundle FragmentState.mSavedFragmentState>
	//   82  169:aload_0         
	//   83  170:getfield        #337 <Field FragmentHostCallback mHost>
	//   84  173:invokevirtual   #1161 <Method Context FragmentHostCallback.getContext()>
	//   85  176:invokevirtual   #1244 <Method ClassLoader Context.getClassLoader()>
	//   86  179:invokevirtual   #1248 <Method void Bundle.setClassLoader(ClassLoader)>
					parcelable.mSavedViewState = fragmentstate.mSavedFragmentState.getSparseParcelableArray("android:view_state");
	//   87  182:aload_1         
	//   88  183:aload           8
	//   89  185:getfield        #1590 <Field Bundle FragmentState.mSavedFragmentState>
	//   90  188:ldc1            #67  <String "android:view_state">
	//   91  190:invokevirtual   #1252 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//   92  193:putfield        #1255 <Field SparseArray Fragment.mSavedViewState>
					parcelable.mSavedFragmentState = fragmentstate.mSavedFragmentState;
	//   93  196:aload_1         
	//   94  197:aload           8
	//   95  199:getfield        #1590 <Field Bundle FragmentState.mSavedFragmentState>
	//   96  202:putfield        #1078 <Field Bundle Fragment.mSavedFragmentState>
				}
				j1++;
	//   97  205:iload           4
	//   98  207:iconst_1        
	//   99  208:iadd            
	//  100  209:istore          4
			} while(true);
	//  101  211:goto            59
		}
		mActive = new ArrayList(fragmentmanagerstate.mActive.length);
	//  102  214:aload_0         
	//  103  215:new             #184 <Class ArrayList>
	//  104  218:dup             
	//  105  219:aload           7
	//  106  221:getfield        #1575 <Field FragmentState[] FragmentManagerState.mActive>
	//  107  224:arraylength     
	//  108  225:invokespecial   #263 <Method void ArrayList(int)>
	//  109  228:putfield        #285 <Field ArrayList mActive>
		if(mAvailIndices != null)
	//* 110  231:aload_0         
	//* 111  232:getfield        #1062 <Field ArrayList mAvailIndices>
	//* 112  235:ifnull          245
			mAvailIndices.clear();
	//  113  238:aload_0         
	//  114  239:getfield        #1062 <Field ArrayList mAvailIndices>
	//  115  242:invokevirtual   #258 <Method void ArrayList.clear()>
		for(int j = 0; j < fragmentmanagerstate.mActive.length; j++)
	//* 116  245:iconst_0        
	//* 117  246:istore_3        
	//* 118  247:iload_3         
	//* 119  248:aload           7
	//* 120  250:getfield        #1575 <Field FragmentState[] FragmentManagerState.mActive>
	//* 121  253:arraylength     
	//* 122  254:icmpge          469
		{
			FragmentState fragmentstate1 = fragmentmanagerstate.mActive[j];
	//  123  257:aload           7
	//  124  259:getfield        #1575 <Field FragmentState[] FragmentManagerState.mActive>
	//  125  262:iload_3         
	//  126  263:aaload          
	//  127  264:astore          8
			if(fragmentstate1 != null)
	//* 128  266:aload           8
	//* 129  268:ifnull          391
			{
				Object obj1 = null;
	//  130  271:aconst_null     
	//  131  272:astore          6
				Object obj = ((Object) (obj1));
	//  132  274:aload           6
	//  133  276:astore          5
				if(parcelable != null)
	//* 134  278:aload_1         
	//* 135  279:ifnull          308
				{
					obj = ((Object) (obj1));
	//  136  282:aload           6
	//  137  284:astore          5
					if(j < ((List) (parcelable)).size())
	//* 138  286:iload_3         
	//* 139  287:aload_1         
	//* 140  288:invokeinterface #527 <Method int List.size()>
	//* 141  293:icmpge          308
						obj = ((Object) ((FragmentManagerNonConfig)((List) (parcelable)).get(j)));
	//  142  296:aload_1         
	//  143  297:iload_3         
	//  144  298:invokeinterface #528 <Method Object List.get(int)>
	//  145  303:checkcast       #1577 <Class FragmentManagerNonConfig>
	//  146  306:astore          5
				}
				obj = ((Object) (fragmentstate1.instantiate(mHost, mContainer, mParent, ((FragmentManagerNonConfig) (obj)))));
	//  147  308:aload           8
	//  148  310:aload_0         
	//  149  311:getfield        #337 <Field FragmentHostCallback mHost>
	//  150  314:aload_0         
	//  151  315:getfield        #754 <Field FragmentContainer mContainer>
	//  152  318:aload_0         
	//  153  319:getfield        #756 <Field Fragment mParent>
	//  154  322:aload           5
	//  155  324:invokevirtual   #1593 <Method Fragment FragmentState.instantiate(FragmentHostCallback, FragmentContainer, Fragment, FragmentManagerNonConfig)>
	//  156  327:astore          5
				if(DEBUG)
	//* 157  329:getstatic       #120 <Field boolean DEBUG>
	//* 158  332:ifeq            372
					Log.v("FragmentManager", (new StringBuilder()).append("restoreAllState: active #").append(j).append(": ").append(obj).toString());
	//  159  335:ldc1            #55  <String "FragmentManager">
	//  160  337:new             #239 <Class StringBuilder>
	//  161  340:dup             
	//  162  341:invokespecial   #240 <Method void StringBuilder()>
	//  163  344:ldc2            #1595 <String "restoreAllState: active #">
	//  164  347:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  165  350:iload_3         
	//  166  351:invokevirtual   #733 <Method StringBuilder StringBuilder.append(int)>
	//  167  354:ldc2            #1010 <String ": ">
	//  168  357:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  169  360:aload           5
	//  170  362:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//  171  365:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  172  368:invokestatic    #690 <Method int Log.v(String, String)>
	//  173  371:pop             
				mActive.add(obj);
	//  174  372:aload_0         
	//  175  373:getfield        #285 <Field ArrayList mActive>
	//  176  376:aload           5
	//  177  378:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
	//  178  381:pop             
				fragmentstate1.mInstance = null;
	//  179  382:aload           8
	//  180  384:aconst_null     
	//  181  385:putfield        #1589 <Field Fragment FragmentState.mInstance>
				continue;
	//  182  388:goto            462
			}
			mActive.add(((Object) (null)));
	//  183  391:aload_0         
	//  184  392:getfield        #285 <Field ArrayList mActive>
	//  185  395:aconst_null     
	//  186  396:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
	//  187  399:pop             
			if(mAvailIndices == null)
	//* 188  400:aload_0         
	//* 189  401:getfield        #1062 <Field ArrayList mAvailIndices>
	//* 190  404:ifnonnull       418
				mAvailIndices = new ArrayList();
	//  191  407:aload_0         
	//  192  408:new             #184 <Class ArrayList>
	//  193  411:dup             
	//  194  412:invokespecial   #353 <Method void ArrayList()>
	//  195  415:putfield        #1062 <Field ArrayList mAvailIndices>
			if(DEBUG)
	//* 196  418:getstatic       #120 <Field boolean DEBUG>
	//* 197  421:ifeq            450
				Log.v("FragmentManager", (new StringBuilder()).append("restoreAllState: avail #").append(j).toString());
	//  198  424:ldc1            #55  <String "FragmentManager">
	//  199  426:new             #239 <Class StringBuilder>
	//  200  429:dup             
	//  201  430:invokespecial   #240 <Method void StringBuilder()>
	//  202  433:ldc2            #1597 <String "restoreAllState: avail #">
	//  203  436:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  204  439:iload_3         
	//  205  440:invokevirtual   #733 <Method StringBuilder StringBuilder.append(int)>
	//  206  443:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  207  446:invokestatic    #690 <Method int Log.v(String, String)>
	//  208  449:pop             
			mAvailIndices.add(((Object) (Integer.valueOf(j))));
	//  209  450:aload_0         
	//  210  451:getfield        #1062 <Field ArrayList mAvailIndices>
	//  211  454:iload_3         
	//  212  455:invokestatic    #1123 <Method Integer Integer.valueOf(int)>
	//  213  458:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
	//  214  461:pop             
		}

	//  215  462:iload_3         
	//  216  463:iconst_1        
	//  217  464:iadd            
	//  218  465:istore_3        
	//* 219  466:goto            247
		if(fragmentmanagernonconfig != null)
	//* 220  469:aload_2         
	//* 221  470:ifnull          610
		{
			parcelable = ((Parcelable) (fragmentmanagernonconfig.getFragments()));
	//  222  473:aload_2         
	//  223  474:invokevirtual   #1579 <Method List FragmentManagerNonConfig.getFragments()>
	//  224  477:astore_1        
			int k;
			if(parcelable != null)
	//* 225  478:aload_1         
	//* 226  479:ifnull          492
				k = ((List) (parcelable)).size();
	//  227  482:aload_1         
	//  228  483:invokeinterface #527 <Method int List.size()>
	//  229  488:istore_3        
			else
	//* 230  489:goto            494
				k = 0;
	//  231  492:iconst_0        
	//  232  493:istore_3        
			for(int k1 = 0; k1 < k; k1++)
	//* 233  494:iconst_0        
	//* 234  495:istore          4
	//* 235  497:iload           4
	//* 236  499:iload_3         
	//* 237  500:icmpge          610
			{
				fragmentmanagernonconfig = ((FragmentManagerNonConfig) ((Fragment)((List) (parcelable)).get(k1)));
	//  238  503:aload_1         
	//  239  504:iload           4
	//  240  506:invokeinterface #528 <Method Object List.get(int)>
	//  241  511:checkcast       #194 <Class Fragment>
	//  242  514:astore_2        
				if(((Fragment) (fragmentmanagernonconfig)).mTargetIndex < 0)
					continue;
	//  243  515:aload_2         
	//  244  516:getfield        #1600 <Field int Fragment.mTargetIndex>
	//  245  519:iflt            601
				if(((Fragment) (fragmentmanagernonconfig)).mTargetIndex < mActive.size())
	//* 246  522:aload_2         
	//* 247  523:getfield        #1600 <Field int Fragment.mTargetIndex>
	//* 248  526:aload_0         
	//* 249  527:getfield        #285 <Field ArrayList mActive>
	//* 250  530:invokevirtual   #188 <Method int ArrayList.size()>
	//* 251  533:icmpge          557
				{
					fragmentmanagernonconfig.mTarget = (Fragment)mActive.get(((Fragment) (fragmentmanagernonconfig)).mTargetIndex);
	//  252  536:aload_2         
	//  253  537:aload_0         
	//  254  538:getfield        #285 <Field ArrayList mActive>
	//  255  541:aload_2         
	//  256  542:getfield        #1600 <Field int Fragment.mTargetIndex>
	//  257  545:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//  258  548:checkcast       #194 <Class Fragment>
	//  259  551:putfield        #1260 <Field Fragment Fragment.mTarget>
				} else
	//* 260  554:goto            601
				{
					Log.w("FragmentManager", (new StringBuilder()).append("Re-attaching retained fragment ").append(((Object) (fragmentmanagernonconfig))).append(" target no longer exists: ").append(((Fragment) (fragmentmanagernonconfig)).mTargetIndex).toString());
	//  261  557:ldc1            #55  <String "FragmentManager">
	//  262  559:new             #239 <Class StringBuilder>
	//  263  562:dup             
	//  264  563:invokespecial   #240 <Method void StringBuilder()>
	//  265  566:ldc2            #1602 <String "Re-attaching retained fragment ">
	//  266  569:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  267  572:aload_2         
	//  268  573:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//  269  576:ldc2            #1604 <String " target no longer exists: ">
	//  270  579:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  271  582:aload_2         
	//  272  583:getfield        #1600 <Field int Fragment.mTargetIndex>
	//  273  586:invokevirtual   #733 <Method StringBuilder StringBuilder.append(int)>
	//  274  589:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  275  592:invokestatic    #1435 <Method int Log.w(String, String)>
	//  276  595:pop             
					fragmentmanagernonconfig.mTarget = null;
	//  277  596:aload_2         
	//  278  597:aconst_null     
	//  279  598:putfield        #1260 <Field Fragment Fragment.mTarget>
				}
			}

	//  280  601:iload           4
	//  281  603:iconst_1        
	//  282  604:iadd            
	//  283  605:istore          4
		}
	//* 284  607:goto            497
		if(fragmentmanagerstate.mAdded != null)
	//* 285  610:aload           7
	//* 286  612:getfield        #1606 <Field int[] FragmentManagerState.mAdded>
	//* 287  615:ifnull          794
		{
			mAdded = new ArrayList(fragmentmanagerstate.mAdded.length);
	//  288  618:aload_0         
	//  289  619:new             #184 <Class ArrayList>
	//  290  622:dup             
	//  291  623:aload           7
	//  292  625:getfield        #1606 <Field int[] FragmentManagerState.mAdded>
	//  293  628:arraylength     
	//  294  629:invokespecial   #263 <Method void ArrayList(int)>
	//  295  632:putfield        #182 <Field ArrayList mAdded>
			for(int l = 0; l < fragmentmanagerstate.mAdded.length; l++)
	//* 296  635:iconst_0        
	//* 297  636:istore_3        
	//* 298  637:iload_3         
	//* 299  638:aload           7
	//* 300  640:getfield        #1606 <Field int[] FragmentManagerState.mAdded>
	//* 301  643:arraylength     
	//* 302  644:icmpge          791
			{
				parcelable = ((Parcelable) ((Fragment)mActive.get(fragmentmanagerstate.mAdded[l])));
	//  303  647:aload_0         
	//  304  648:getfield        #285 <Field ArrayList mActive>
	//  305  651:aload           7
	//  306  653:getfield        #1606 <Field int[] FragmentManagerState.mAdded>
	//  307  656:iload_3         
	//  308  657:iaload          
	//  309  658:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//  310  661:checkcast       #194 <Class Fragment>
	//  311  664:astore_1        
				if(parcelable == null)
	//* 312  665:aload_1         
	//* 313  666:ifnonnull       706
					throwException(((RuntimeException) (new IllegalStateException((new StringBuilder()).append("No instantiated fragment for index #").append(fragmentmanagerstate.mAdded[l]).toString()))));
	//  314  669:aload_0         
	//  315  670:new             #230 <Class IllegalStateException>
	//  316  673:dup             
	//  317  674:new             #239 <Class StringBuilder>
	//  318  677:dup             
	//  319  678:invokespecial   #240 <Method void StringBuilder()>
	//  320  681:ldc2            #1608 <String "No instantiated fragment for index #">
	//  321  684:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  322  687:aload           7
	//  323  689:getfield        #1606 <Field int[] FragmentManagerState.mAdded>
	//  324  692:iload_3         
	//  325  693:iaload          
	//  326  694:invokevirtual   #733 <Method StringBuilder StringBuilder.append(int)>
	//  327  697:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  328  700:invokespecial   #235 <Method void IllegalStateException(String)>
	//  329  703:invokespecial   #1142 <Method void throwException(RuntimeException)>
				parcelable.mAdded = true;
	//  330  706:aload_1         
	//  331  707:iconst_1        
	//  332  708:putfield        #508 <Field boolean Fragment.mAdded>
				if(DEBUG)
	//* 333  711:getstatic       #120 <Field boolean DEBUG>
	//* 334  714:ifeq            753
					Log.v("FragmentManager", (new StringBuilder()).append("restoreAllState: added #").append(l).append(": ").append(((Object) (parcelable))).toString());
	//  335  717:ldc1            #55  <String "FragmentManager">
	//  336  719:new             #239 <Class StringBuilder>
	//  337  722:dup             
	//  338  723:invokespecial   #240 <Method void StringBuilder()>
	//  339  726:ldc2            #1610 <String "restoreAllState: added #">
	//  340  729:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  341  732:iload_3         
	//  342  733:invokevirtual   #733 <Method StringBuilder StringBuilder.append(int)>
	//  343  736:ldc2            #1010 <String ": ">
	//  344  739:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  345  742:aload_1         
	//  346  743:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//  347  746:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  348  749:invokestatic    #690 <Method int Log.v(String, String)>
	//  349  752:pop             
				if(mAdded.contains(((Object) (parcelable))))
	//* 350  753:aload_0         
	//* 351  754:getfield        #182 <Field ArrayList mAdded>
	//* 352  757:aload_1         
	//* 353  758:invokevirtual   #700 <Method boolean ArrayList.contains(Object)>
	//* 354  761:ifeq            775
					throw new IllegalStateException("Already added!");
	//  355  764:new             #230 <Class IllegalStateException>
	//  356  767:dup             
	//  357  768:ldc2            #1612 <String "Already added!">
	//  358  771:invokespecial   #235 <Method void IllegalStateException(String)>
	//  359  774:athrow          
				mAdded.add(((Object) (parcelable)));
	//  360  775:aload_0         
	//  361  776:getfield        #182 <Field ArrayList mAdded>
	//  362  779:aload_1         
	//  363  780:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
	//  364  783:pop             
			}

	//  365  784:iload_3         
	//  366  785:iconst_1        
	//  367  786:iadd            
	//  368  787:istore_3        
		} else
	//* 369  788:goto            637
	//* 370  791:goto            799
		{
			mAdded = null;
	//  371  794:aload_0         
	//  372  795:aconst_null     
	//  373  796:putfield        #182 <Field ArrayList mAdded>
		}
		if(fragmentmanagerstate.mBackStack != null)
	//* 374  799:aload           7
	//* 375  801:getfield        #1615 <Field BackStackState[] FragmentManagerState.mBackStack>
	//* 376  804:ifnull          968
		{
			mBackStack = new ArrayList(fragmentmanagerstate.mBackStack.length);
	//  377  807:aload_0         
	//  378  808:new             #184 <Class ArrayList>
	//  379  811:dup             
	//  380  812:aload           7
	//  381  814:getfield        #1615 <Field BackStackState[] FragmentManagerState.mBackStack>
	//  382  817:arraylength     
	//  383  818:invokespecial   #263 <Method void ArrayList(int)>
	//  384  821:putfield        #680 <Field ArrayList mBackStack>
			for(int i1 = 0; i1 < fragmentmanagerstate.mBackStack.length; i1++)
	//* 385  824:iconst_0        
	//* 386  825:istore_3        
	//* 387  826:iload_3         
	//* 388  827:aload           7
	//* 389  829:getfield        #1615 <Field BackStackState[] FragmentManagerState.mBackStack>
	//* 390  832:arraylength     
	//* 391  833:icmpge          965
			{
				parcelable = ((Parcelable) (fragmentmanagerstate.mBackStack[i1].instantiate(this)));
	//  392  836:aload           7
	//  393  838:getfield        #1615 <Field BackStackState[] FragmentManagerState.mBackStack>
	//  394  841:iload_3         
	//  395  842:aaload          
	//  396  843:aload_0         
	//  397  844:invokevirtual   #1620 <Method BackStackRecord BackStackState.instantiate(FragmentManagerImpl)>
	//  398  847:astore_1        
				if(DEBUG)
	//* 399  848:getstatic       #120 <Field boolean DEBUG>
	//* 400  851:ifeq            933
				{
					Log.v("FragmentManager", (new StringBuilder()).append("restoreAllState: back stack #").append(i1).append(" (index ").append(((BackStackRecord) (parcelable)).mIndex).append("): ").append(((Object) (parcelable))).toString());
	//  401  854:ldc1            #55  <String "FragmentManager">
	//  402  856:new             #239 <Class StringBuilder>
	//  403  859:dup             
	//  404  860:invokespecial   #240 <Method void StringBuilder()>
	//  405  863:ldc2            #1622 <String "restoreAllState: back stack #">
	//  406  866:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  407  869:iload_3         
	//  408  870:invokevirtual   #733 <Method StringBuilder StringBuilder.append(int)>
	//  409  873:ldc2            #1624 <String " (index ">
	//  410  876:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  411  879:aload_1         
	//  412  880:getfield        #407 <Field int BackStackRecord.mIndex>
	//  413  883:invokevirtual   #733 <Method StringBuilder StringBuilder.append(int)>
	//  414  886:ldc2            #1626 <String "): ">
	//  415  889:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  416  892:aload_1         
	//  417  893:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//  418  896:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  419  899:invokestatic    #690 <Method int Log.v(String, String)>
	//  420  902:pop             
					fragmentmanagernonconfig = ((FragmentManagerNonConfig) (new PrintWriter(((java.io.Writer) (new LogWriter("FragmentManager"))))));
	//  421  903:new             #655 <Class PrintWriter>
	//  422  906:dup             
	//  423  907:new             #657 <Class LogWriter>
	//  424  910:dup             
	//  425  911:ldc1            #55  <String "FragmentManager">
	//  426  913:invokespecial   #658 <Method void LogWriter(String)>
	//  427  916:invokespecial   #661 <Method void PrintWriter(java.io.Writer)>
	//  428  919:astore_2        
					((BackStackRecord) (parcelable)).dump("  ", ((PrintWriter) (fragmentmanagernonconfig)), false);
	//  429  920:aload_1         
	//  430  921:ldc2            #663 <String "  ">
	//  431  924:aload_2         
	//  432  925:iconst_0        
	//  433  926:invokevirtual   #1629 <Method void BackStackRecord.dump(String, PrintWriter, boolean)>
					((PrintWriter) (fragmentmanagernonconfig)).close();
	//  434  929:aload_2         
	//  435  930:invokevirtual   #1632 <Method void PrintWriter.close()>
				}
				mBackStack.add(((Object) (parcelable)));
	//  436  933:aload_0         
	//  437  934:getfield        #680 <Field ArrayList mBackStack>
	//  438  937:aload_1         
	//  439  938:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
	//  440  941:pop             
				if(((BackStackRecord) (parcelable)).mIndex >= 0)
	//* 441  942:aload_1         
	//* 442  943:getfield        #407 <Field int BackStackRecord.mIndex>
	//* 443  946:iflt            958
					setBackStackIndex(((BackStackRecord) (parcelable)).mIndex, ((BackStackRecord) (parcelable)));
	//  444  949:aload_0         
	//  445  950:aload_1         
	//  446  951:getfield        #407 <Field int BackStackRecord.mIndex>
	//  447  954:aload_1         
	//  448  955:invokevirtual   #1636 <Method void setBackStackIndex(int, BackStackRecord)>
			}

	//  449  958:iload_3         
	//  450  959:iconst_1        
	//  451  960:iadd            
	//  452  961:istore_3        
		} else
	//* 453  962:goto            826
	//* 454  965:goto            973
		{
			mBackStack = null;
	//  455  968:aload_0         
	//  456  969:aconst_null     
	//  457  970:putfield        #680 <Field ArrayList mBackStack>
		}
		if(fragmentmanagerstate.mPrimaryNavActiveIndex >= 0)
	//* 458  973:aload           7
	//* 459  975:getfield        #1639 <Field int FragmentManagerState.mPrimaryNavActiveIndex>
	//* 460  978:iflt            1000
			mPrimaryNav = (Fragment)mActive.get(fragmentmanagerstate.mPrimaryNavActiveIndex);
	//  461  981:aload_0         
	//  462  982:aload_0         
	//  463  983:getfield        #285 <Field ArrayList mActive>
	//  464  986:aload           7
	//  465  988:getfield        #1639 <Field int FragmentManagerState.mPrimaryNavActiveIndex>
	//  466  991:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//  467  994:checkcast       #194 <Class Fragment>
	//  468  997:putfield        #542 <Field Fragment mPrimaryNav>
	//  469 1000:return          
	}

	FragmentManagerNonConfig retainNonConfig()
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		Object obj = null;
	//    2    3:aconst_null     
	//    3    4:astore          5
		Object obj2 = null;
	//    4    6:aconst_null     
	//    5    7:astore          7
		ArrayList arraylist = null;
	//    6    9:aconst_null     
	//    7   10:astore          4
		if(mActive != null)
	//*   8   12:aload_0         
	//*   9   13:getfield        #285 <Field ArrayList mActive>
	//*  10   16:ifnull          324
		{
			int i = 0;
	//   11   19:iconst_0        
	//   12   20:istore_1        
			do
			{
				obj1 = obj;
	//   13   21:aload           5
	//   14   23:astore          6
				obj2 = ((Object) (arraylist));
	//   15   25:aload           4
	//   16   27:astore          7
				if(i >= mActive.size())
					break;
	//   17   29:iload_1         
	//   18   30:aload_0         
	//   19   31:getfield        #285 <Field ArrayList mActive>
	//   20   34:invokevirtual   #188 <Method int ArrayList.size()>
	//   21   37:icmpge          324
				Fragment fragment = (Fragment)mActive.get(i);
	//   22   40:aload_0         
	//   23   41:getfield        #285 <Field ArrayList mActive>
	//   24   44:iload_1         
	//   25   45:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   26   48:checkcast       #194 <Class Fragment>
	//   27   51:astore          9
				obj2 = obj;
	//   28   53:aload           5
	//   29   55:astore          7
				ArrayList arraylist1 = arraylist;
	//   30   57:aload           4
	//   31   59:astore          8
				if(fragment != null)
	//*  32   61:aload           9
	//*  33   63:ifnull          309
				{
					obj1 = obj;
	//   34   66:aload           5
	//   35   68:astore          6
					if(fragment.mRetainInstance)
	//*  36   70:aload           9
	//*  37   72:getfield        #1644 <Field boolean Fragment.mRetainInstance>
	//*  38   75:ifeq            179
					{
						obj2 = obj;
	//   39   78:aload           5
	//   40   80:astore          7
						if(obj == null)
	//*  41   82:aload           5
	//*  42   84:ifnonnull       96
							obj2 = ((Object) (new ArrayList()));
	//   43   87:new             #184 <Class ArrayList>
	//   44   90:dup             
	//   45   91:invokespecial   #353 <Method void ArrayList()>
	//   46   94:astore          7
						((ArrayList) (obj2)).add(((Object) (fragment)));
	//   47   96:aload           7
	//   48   98:aload           9
	//   49  100:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
	//   50  103:pop             
						fragment.mRetaining = true;
	//   51  104:aload           9
	//   52  106:iconst_1        
	//   53  107:putfield        #1310 <Field boolean Fragment.mRetaining>
						int j;
						if(fragment.mTarget != null)
	//*  54  110:aload           9
	//*  55  112:getfield        #1260 <Field Fragment Fragment.mTarget>
	//*  56  115:ifnull          130
							j = fragment.mTarget.mIndex;
	//   57  118:aload           9
	//   58  120:getfield        #1260 <Field Fragment Fragment.mTarget>
	//   59  123:getfield        #1182 <Field int Fragment.mIndex>
	//   60  126:istore_2        
						else
	//*  61  127:goto            132
							j = -1;
	//   62  130:iconst_m1       
	//   63  131:istore_2        
						fragment.mTargetIndex = j;
	//   64  132:aload           9
	//   65  134:iload_2         
	//   66  135:putfield        #1600 <Field int Fragment.mTargetIndex>
						obj1 = obj2;
	//   67  138:aload           7
	//   68  140:astore          6
						if(DEBUG)
	//*  69  142:getstatic       #120 <Field boolean DEBUG>
	//*  70  145:ifeq            179
						{
							Log.v("FragmentManager", (new StringBuilder()).append("retainNonConfig: keeping retained ").append(((Object) (fragment))).toString());
	//   71  148:ldc1            #55  <String "FragmentManager">
	//   72  150:new             #239 <Class StringBuilder>
	//   73  153:dup             
	//   74  154:invokespecial   #240 <Method void StringBuilder()>
	//   75  157:ldc2            #1646 <String "retainNonConfig: keeping retained ">
	//   76  160:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   77  163:aload           9
	//   78  165:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//   79  168:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   80  171:invokestatic    #690 <Method int Log.v(String, String)>
	//   81  174:pop             
							obj1 = obj2;
	//   82  175:aload           7
	//   83  177:astore          6
						}
					}
					boolean flag = false;
	//   84  179:iconst_0        
	//   85  180:istore_3        
					obj = ((Object) (arraylist));
	//   86  181:aload           4
	//   87  183:astore          5
					int k = ((int) (flag));
	//   88  185:iload_3         
	//   89  186:istore_2        
					if(fragment.mChildFragmentManager != null)
	//*  90  187:aload           9
	//*  91  189:getfield        #1278 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
	//*  92  192:ifnull          269
					{
						obj2 = ((Object) (fragment.mChildFragmentManager.retainNonConfig()));
	//   93  195:aload           9
	//   94  197:getfield        #1278 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
	//   95  200:invokevirtual   #1648 <Method FragmentManagerNonConfig retainNonConfig()>
	//   96  203:astore          7
						obj = ((Object) (arraylist));
	//   97  205:aload           4
	//   98  207:astore          5
						k = ((int) (flag));
	//   99  209:iload_3         
	//  100  210:istore_2        
						if(obj2 != null)
	//* 101  211:aload           7
	//* 102  213:ifnull          269
						{
							obj = ((Object) (arraylist));
	//  103  216:aload           4
	//  104  218:astore          5
							if(arraylist == null)
	//* 105  220:aload           4
	//* 106  222:ifnonnull       259
							{
								arraylist = new ArrayList();
	//  107  225:new             #184 <Class ArrayList>
	//  108  228:dup             
	//  109  229:invokespecial   #353 <Method void ArrayList()>
	//  110  232:astore          4
								k = 0;
	//  111  234:iconst_0        
	//  112  235:istore_2        
								do
								{
									obj = ((Object) (arraylist));
	//  113  236:aload           4
	//  114  238:astore          5
									if(k >= i)
										break;
	//  115  240:iload_2         
	//  116  241:iload_1         
	//  117  242:icmpge          259
									arraylist.add(((Object) (null)));
	//  118  245:aload           4
	//  119  247:aconst_null     
	//  120  248:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
	//  121  251:pop             
									k++;
	//  122  252:iload_2         
	//  123  253:iconst_1        
	//  124  254:iadd            
	//  125  255:istore_2        
								} while(true);
	//  126  256:goto            236
							}
							((ArrayList) (obj)).add(obj2);
	//  127  259:aload           5
	//  128  261:aload           7
	//  129  263:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
	//  130  266:pop             
							k = 1;
	//  131  267:iconst_1        
	//  132  268:istore_2        
						}
					}
					obj2 = obj1;
	//  133  269:aload           6
	//  134  271:astore          7
					arraylist1 = ((ArrayList) (obj));
	//  135  273:aload           5
	//  136  275:astore          8
					if(obj != null)
	//* 137  277:aload           5
	//* 138  279:ifnull          309
					{
						obj2 = obj1;
	//  139  282:aload           6
	//  140  284:astore          7
						arraylist1 = ((ArrayList) (obj));
	//  141  286:aload           5
	//  142  288:astore          8
						if(k == 0)
	//* 143  290:iload_2         
	//* 144  291:ifne            309
						{
							((ArrayList) (obj)).add(((Object) (null)));
	//  145  294:aload           5
	//  146  296:aconst_null     
	//  147  297:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
	//  148  300:pop             
							arraylist1 = ((ArrayList) (obj));
	//  149  301:aload           5
	//  150  303:astore          8
							obj2 = obj1;
	//  151  305:aload           6
	//  152  307:astore          7
						}
					}
				}
				i++;
	//  153  309:iload_1         
	//  154  310:iconst_1        
	//  155  311:iadd            
	//  156  312:istore_1        
				obj = obj2;
	//  157  313:aload           7
	//  158  315:astore          5
				arraylist = arraylist1;
	//  159  317:aload           8
	//  160  319:astore          4
			} while(true);
	//  161  321:goto            21
		}
		if(obj1 == null && obj2 == null)
	//* 162  324:aload           6
	//* 163  326:ifnonnull       336
	//* 164  329:aload           7
	//* 165  331:ifnonnull       336
			return null;
	//  166  334:aconst_null     
	//  167  335:areturn         
		else
			return new FragmentManagerNonConfig(((List) (obj1)), ((List) (obj2)));
	//  168  336:new             #1577 <Class FragmentManagerNonConfig>
	//  169  339:dup             
	//  170  340:aload           6
	//  171  342:aload           7
	//  172  344:invokespecial   #1651 <Method void FragmentManagerNonConfig(List, List)>
	//  173  347:areturn         
	}

	Parcelable saveAllState()
	{
		forcePostponedTransactions();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1102 <Method void forcePostponedTransactions()>
		endAnimatingAwayFragments();
	//    2    4:aload_0         
	//    3    5:invokespecial   #1655 <Method void endAnimatingAwayFragments()>
		execPendingActions();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #538 <Method boolean execPendingActions()>
	//    6   12:pop             
		if(HONEYCOMB)
	//*   7   13:getstatic       #127 <Field boolean HONEYCOMB>
	//*   8   16:ifeq            24
			mStateSaved = true;
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:putfield        #228 <Field boolean mStateSaved>
		if(mActive == null || mActive.size() <= 0)
	//*  12   24:aload_0         
	//*  13   25:getfield        #285 <Field ArrayList mActive>
	//*  14   28:ifnull          41
	//*  15   31:aload_0         
	//*  16   32:getfield        #285 <Field ArrayList mActive>
	//*  17   35:invokevirtual   #188 <Method int ArrayList.size()>
	//*  18   38:ifgt            43
			return null;
	//   19   41:aconst_null     
	//   20   42:areturn         
		int j1 = mActive.size();
	//   21   43:aload_0         
	//   22   44:getfield        #285 <Field ArrayList mActive>
	//   23   47:invokevirtual   #188 <Method int ArrayList.size()>
	//   24   50:istore          4
		FragmentState afragmentstate[] = new FragmentState[j1];
	//   25   52:iload           4
	//   26   54:anewarray       FragmentState[]
	//   27   57:astore          8
		boolean flag = false;
	//   28   59:iconst_0        
	//   29   60:istore_2        
		for(int i = 0; i < j1; i++)
	//*  30   61:iconst_0        
	//*  31   62:istore_1        
	//*  32   63:iload_1         
	//*  33   64:iload           4
	//*  34   66:icmpge          382
		{
			Fragment fragment = (Fragment)mActive.get(i);
	//   35   69:aload_0         
	//   36   70:getfield        #285 <Field ArrayList mActive>
	//   37   73:iload_1         
	//   38   74:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   39   77:checkcast       #194 <Class Fragment>
	//   40   80:astore          5
			if(fragment == null)
				continue;
	//   41   82:aload           5
	//   42   84:ifnull          375
			if(fragment.mIndex < 0)
	//*  43   87:aload           5
	//*  44   89:getfield        #1182 <Field int Fragment.mIndex>
	//*  45   92:ifge            141
				throwException(((RuntimeException) (new IllegalStateException((new StringBuilder()).append("Failure saving state: active ").append(((Object) (fragment))).append(" has cleared index: ").append(fragment.mIndex).toString()))));
	//   46   95:aload_0         
	//   47   96:new             #230 <Class IllegalStateException>
	//   48   99:dup             
	//   49  100:new             #239 <Class StringBuilder>
	//   50  103:dup             
	//   51  104:invokespecial   #240 <Method void StringBuilder()>
	//   52  107:ldc2            #1657 <String "Failure saving state: active ">
	//   53  110:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   54  113:aload           5
	//   55  115:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//   56  118:ldc2            #1659 <String " has cleared index: ">
	//   57  121:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   58  124:aload           5
	//   59  126:getfield        #1182 <Field int Fragment.mIndex>
	//   60  129:invokevirtual   #733 <Method StringBuilder StringBuilder.append(int)>
	//   61  132:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   62  135:invokespecial   #235 <Method void IllegalStateException(String)>
	//   63  138:invokespecial   #1142 <Method void throwException(RuntimeException)>
			boolean flag1 = true;
	//   64  141:iconst_1        
	//   65  142:istore_3        
			FragmentState fragmentstate = new FragmentState(fragment);
	//   66  143:new             #1586 <Class FragmentState>
	//   67  146:dup             
	//   68  147:aload           5
	//   69  149:invokespecial   #1661 <Method void FragmentState(Fragment)>
	//   70  152:astore          6
			afragmentstate[i] = fragmentstate;
	//   71  154:aload           8
	//   72  156:iload_1         
	//   73  157:aload           6
	//   74  159:aastore         
			if(fragment.mState > 0 && fragmentstate.mSavedFragmentState == null)
	//*  75  160:aload           5
	//*  76  162:getfield        #197 <Field int Fragment.mState>
	//*  77  165:ifle            314
	//*  78  168:aload           6
	//*  79  170:getfield        #1590 <Field Bundle FragmentState.mSavedFragmentState>
	//*  80  173:ifnonnull       314
			{
				fragmentstate.mSavedFragmentState = saveFragmentBasicState(fragment);
	//   81  176:aload           6
	//   82  178:aload_0         
	//   83  179:aload           5
	//   84  181:invokevirtual   #1665 <Method Bundle saveFragmentBasicState(Fragment)>
	//   85  184:putfield        #1590 <Field Bundle FragmentState.mSavedFragmentState>
				if(fragment.mTarget != null)
	//*  86  187:aload           5
	//*  87  189:getfield        #1260 <Field Fragment Fragment.mTarget>
	//*  88  192:ifnull          324
				{
					if(fragment.mTarget.mIndex < 0)
	//*  89  195:aload           5
	//*  90  197:getfield        #1260 <Field Fragment Fragment.mTarget>
	//*  91  200:getfield        #1182 <Field int Fragment.mIndex>
	//*  92  203:ifge            252
						throwException(((RuntimeException) (new IllegalStateException((new StringBuilder()).append("Failure saving state: ").append(((Object) (fragment))).append(" has target not in fragment manager: ").append(((Object) (fragment.mTarget))).toString()))));
	//   93  206:aload_0         
	//   94  207:new             #230 <Class IllegalStateException>
	//   95  210:dup             
	//   96  211:new             #239 <Class StringBuilder>
	//   97  214:dup             
	//   98  215:invokespecial   #240 <Method void StringBuilder()>
	//   99  218:ldc2            #1667 <String "Failure saving state: ">
	//  100  221:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  101  224:aload           5
	//  102  226:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//  103  229:ldc2            #1669 <String " has target not in fragment manager: ">
	//  104  232:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  105  235:aload           5
	//  106  237:getfield        #1260 <Field Fragment Fragment.mTarget>
	//  107  240:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//  108  243:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  109  246:invokespecial   #235 <Method void IllegalStateException(String)>
	//  110  249:invokespecial   #1142 <Method void throwException(RuntimeException)>
					if(fragmentstate.mSavedFragmentState == null)
	//* 111  252:aload           6
	//* 112  254:getfield        #1590 <Field Bundle FragmentState.mSavedFragmentState>
	//* 113  257:ifnonnull       272
						fragmentstate.mSavedFragmentState = new Bundle();
	//  114  260:aload           6
	//  115  262:new             #1132 <Class Bundle>
	//  116  265:dup             
	//  117  266:invokespecial   #1670 <Method void Bundle()>
	//  118  269:putfield        #1590 <Field Bundle FragmentState.mSavedFragmentState>
					putFragment(fragmentstate.mSavedFragmentState, "android:target_state", fragment.mTarget);
	//  119  272:aload_0         
	//  120  273:aload           6
	//  121  275:getfield        #1590 <Field Bundle FragmentState.mSavedFragmentState>
	//  122  278:ldc1            #61  <String "android:target_state">
	//  123  280:aload           5
	//  124  282:getfield        #1260 <Field Fragment Fragment.mTarget>
	//  125  285:invokevirtual   #1672 <Method void putFragment(Bundle, String, Fragment)>
					if(fragment.mTargetRequestCode != 0)
	//* 126  288:aload           5
	//* 127  290:getfield        #1263 <Field int Fragment.mTargetRequestCode>
	//* 128  293:ifeq            324
						fragmentstate.mSavedFragmentState.putInt("android:target_req_state", fragment.mTargetRequestCode);
	//  129  296:aload           6
	//  130  298:getfield        #1590 <Field Bundle FragmentState.mSavedFragmentState>
	//  131  301:ldc1            #58  <String "android:target_req_state">
	//  132  303:aload           5
	//  133  305:getfield        #1263 <Field int Fragment.mTargetRequestCode>
	//  134  308:invokevirtual   #1547 <Method void Bundle.putInt(String, int)>
				}
			} else
	//* 135  311:goto            324
			{
				fragmentstate.mSavedFragmentState = fragment.mSavedFragmentState;
	//  136  314:aload           6
	//  137  316:aload           5
	//  138  318:getfield        #1078 <Field Bundle Fragment.mSavedFragmentState>
	//  139  321:putfield        #1590 <Field Bundle FragmentState.mSavedFragmentState>
			}
			flag = flag1;
	//  140  324:iload_3         
	//  141  325:istore_2        
			if(DEBUG)
	//* 142  326:getstatic       #120 <Field boolean DEBUG>
	//* 143  329:ifeq            375
			{
				Log.v("FragmentManager", (new StringBuilder()).append("Saved state of ").append(((Object) (fragment))).append(": ").append(((Object) (fragmentstate.mSavedFragmentState))).toString());
	//  144  332:ldc1            #55  <String "FragmentManager">
	//  145  334:new             #239 <Class StringBuilder>
	//  146  337:dup             
	//  147  338:invokespecial   #240 <Method void StringBuilder()>
	//  148  341:ldc2            #1674 <String "Saved state of ">
	//  149  344:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  150  347:aload           5
	//  151  349:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//  152  352:ldc2            #1010 <String ": ">
	//  153  355:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  154  358:aload           6
	//  155  360:getfield        #1590 <Field Bundle FragmentState.mSavedFragmentState>
	//  156  363:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//  157  366:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  158  369:invokestatic    #690 <Method int Log.v(String, String)>
	//  159  372:pop             
				flag = flag1;
	//  160  373:iload_3         
	//  161  374:istore_2        
			}
		}

	//  162  375:iload_1         
	//  163  376:iconst_1        
	//  164  377:iadd            
	//  165  378:istore_1        
	//* 166  379:goto            63
		if(!flag)
	//* 167  382:iload_2         
	//* 168  383:ifne            403
		{
			if(DEBUG)
	//* 169  386:getstatic       #120 <Field boolean DEBUG>
	//* 170  389:ifeq            401
				Log.v("FragmentManager", "saveAllState: no fragments!");
	//  171  392:ldc1            #55  <String "FragmentManager">
	//  172  394:ldc2            #1676 <String "saveAllState: no fragments!">
	//  173  397:invokestatic    #690 <Method int Log.v(String, String)>
	//  174  400:pop             
			return null;
	//  175  401:aconst_null     
	//  176  402:areturn         
		}
		Object aobj[] = null;
	//  177  403:aconst_null     
	//  178  404:astore          6
		FragmentManagerState fragmentmanagerstate = null;
	//  179  406:aconst_null     
	//  180  407:astore          7
		int ai[] = ((int []) (aobj));
	//  181  409:aload           6
	//  182  411:astore          5
		if(mAdded != null)
	//* 183  413:aload_0         
	//* 184  414:getfield        #182 <Field ArrayList mAdded>
	//* 185  417:ifnull          584
		{
			int l = mAdded.size();
	//  186  420:aload_0         
	//  187  421:getfield        #182 <Field ArrayList mAdded>
	//  188  424:invokevirtual   #188 <Method int ArrayList.size()>
	//  189  427:istore_2        
			ai = ((int []) (aobj));
	//  190  428:aload           6
	//  191  430:astore          5
			if(l > 0)
	//* 192  432:iload_2         
	//* 193  433:ifle            584
			{
				aobj = ((Object []) (new int[l]));
	//  194  436:iload_2         
	//  195  437:newarray        int[]
	//  196  439:astore          6
				int j = 0;
	//  197  441:iconst_0        
	//  198  442:istore_1        
				do
				{
					ai = ((int []) (aobj));
	//  199  443:aload           6
	//  200  445:astore          5
					if(j >= l)
						break;
	//  201  447:iload_1         
	//  202  448:iload_2         
	//  203  449:icmpge          584
					aobj[j] = ((Fragment)mAdded.get(j)).mIndex;
	//  204  452:aload           6
	//  205  454:iload_1         
	//  206  455:aload_0         
	//  207  456:getfield        #182 <Field ArrayList mAdded>
	//  208  459:iload_1         
	//  209  460:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//  210  463:checkcast       #194 <Class Fragment>
	//  211  466:getfield        #1182 <Field int Fragment.mIndex>
	//  212  469:iastore         
					if(aobj[j] < 0)
	//* 213  470:aload           6
	//* 214  472:iload_1         
	//* 215  473:iaload          
	//* 216  474:ifge            528
						throwException(((RuntimeException) (new IllegalStateException((new StringBuilder()).append("Failure saving state: active ").append(mAdded.get(j)).append(" has cleared index: ").append(aobj[j]).toString()))));
	//  217  477:aload_0         
	//  218  478:new             #230 <Class IllegalStateException>
	//  219  481:dup             
	//  220  482:new             #239 <Class StringBuilder>
	//  221  485:dup             
	//  222  486:invokespecial   #240 <Method void StringBuilder()>
	//  223  489:ldc2            #1657 <String "Failure saving state: active ">
	//  224  492:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  225  495:aload_0         
	//  226  496:getfield        #182 <Field ArrayList mAdded>
	//  227  499:iload_1         
	//  228  500:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//  229  503:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//  230  506:ldc2            #1659 <String " has cleared index: ">
	//  231  509:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  232  512:aload           6
	//  233  514:iload_1         
	//  234  515:iaload          
	//  235  516:invokevirtual   #733 <Method StringBuilder StringBuilder.append(int)>
	//  236  519:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  237  522:invokespecial   #235 <Method void IllegalStateException(String)>
	//  238  525:invokespecial   #1142 <Method void throwException(RuntimeException)>
					if(DEBUG)
	//* 239  528:getstatic       #120 <Field boolean DEBUG>
	//* 240  531:ifeq            577
						Log.v("FragmentManager", (new StringBuilder()).append("saveAllState: adding fragment #").append(j).append(": ").append(mAdded.get(j)).toString());
	//  241  534:ldc1            #55  <String "FragmentManager">
	//  242  536:new             #239 <Class StringBuilder>
	//  243  539:dup             
	//  244  540:invokespecial   #240 <Method void StringBuilder()>
	//  245  543:ldc2            #1678 <String "saveAllState: adding fragment #">
	//  246  546:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  247  549:iload_1         
	//  248  550:invokevirtual   #733 <Method StringBuilder StringBuilder.append(int)>
	//  249  553:ldc2            #1010 <String ": ">
	//  250  556:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  251  559:aload_0         
	//  252  560:getfield        #182 <Field ArrayList mAdded>
	//  253  563:iload_1         
	//  254  564:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//  255  567:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//  256  570:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  257  573:invokestatic    #690 <Method int Log.v(String, String)>
	//  258  576:pop             
					j++;
	//  259  577:iload_1         
	//  260  578:iconst_1        
	//  261  579:iadd            
	//  262  580:istore_1        
				} while(true);
	//  263  581:goto            443
			}
		}
		aobj = ((Object []) (fragmentmanagerstate));
	//  264  584:aload           7
	//  265  586:astore          6
		if(mBackStack != null)
	//* 266  588:aload_0         
	//* 267  589:getfield        #680 <Field ArrayList mBackStack>
	//* 268  592:ifnull          706
		{
			int i1 = mBackStack.size();
	//  269  595:aload_0         
	//  270  596:getfield        #680 <Field ArrayList mBackStack>
	//  271  599:invokevirtual   #188 <Method int ArrayList.size()>
	//  272  602:istore_2        
			aobj = ((Object []) (fragmentmanagerstate));
	//  273  603:aload           7
	//  274  605:astore          6
			if(i1 > 0)
	//* 275  607:iload_2         
	//* 276  608:ifle            706
			{
				BackStackState abackstackstate[] = new BackStackState[i1];
	//  277  611:iload_2         
	//  278  612:anewarray       BackStackState[]
	//  279  615:astore          7
				int k = 0;
	//  280  617:iconst_0        
	//  281  618:istore_1        
				do
				{
					aobj = ((Object []) (abackstackstate));
	//  282  619:aload           7
	//  283  621:astore          6
					if(k >= i1)
						break;
	//  284  623:iload_1         
	//  285  624:iload_2         
	//  286  625:icmpge          706
					abackstackstate[k] = new BackStackState((BackStackRecord)mBackStack.get(k));
	//  287  628:aload           7
	//  288  630:iload_1         
	//  289  631:new             #1617 <Class BackStackState>
	//  290  634:dup             
	//  291  635:aload_0         
	//  292  636:getfield        #680 <Field ArrayList mBackStack>
	//  293  639:iload_1         
	//  294  640:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//  295  643:checkcast       #290 <Class BackStackRecord>
	//  296  646:invokespecial   #1680 <Method void BackStackState(BackStackRecord)>
	//  297  649:aastore         
					if(DEBUG)
	//* 298  650:getstatic       #120 <Field boolean DEBUG>
	//* 299  653:ifeq            699
						Log.v("FragmentManager", (new StringBuilder()).append("saveAllState: adding back stack #").append(k).append(": ").append(mBackStack.get(k)).toString());
	//  300  656:ldc1            #55  <String "FragmentManager">
	//  301  658:new             #239 <Class StringBuilder>
	//  302  661:dup             
	//  303  662:invokespecial   #240 <Method void StringBuilder()>
	//  304  665:ldc2            #1682 <String "saveAllState: adding back stack #">
	//  305  668:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  306  671:iload_1         
	//  307  672:invokevirtual   #733 <Method StringBuilder StringBuilder.append(int)>
	//  308  675:ldc2            #1010 <String ": ">
	//  309  678:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//  310  681:aload_0         
	//  311  682:getfield        #680 <Field ArrayList mBackStack>
	//  312  685:iload_1         
	//  313  686:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//  314  689:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//  315  692:invokevirtual   #250 <Method String StringBuilder.toString()>
	//  316  695:invokestatic    #690 <Method int Log.v(String, String)>
	//  317  698:pop             
					k++;
	//  318  699:iload_1         
	//  319  700:iconst_1        
	//  320  701:iadd            
	//  321  702:istore_1        
				} while(true);
	//  322  703:goto            619
			}
		}
		abackstackstate = ((BackStackState []) (new FragmentManagerState()));
	//  323  706:new             #1572 <Class FragmentManagerState>
	//  324  709:dup             
	//  325  710:invokespecial   #1683 <Method void FragmentManagerState()>
	//  326  713:astore          7
		abackstackstate.mActive = afragmentstate;
	//  327  715:aload           7
	//  328  717:aload           8
	//  329  719:putfield        #1575 <Field FragmentState[] FragmentManagerState.mActive>
		abackstackstate.mAdded = ai;
	//  330  722:aload           7
	//  331  724:aload           5
	//  332  726:putfield        #1606 <Field int[] FragmentManagerState.mAdded>
		abackstackstate.mBackStack = ((BackStackState []) (aobj));
	//  333  729:aload           7
	//  334  731:aload           6
	//  335  733:putfield        #1615 <Field BackStackState[] FragmentManagerState.mBackStack>
		if(mPrimaryNav != null)
	//* 336  736:aload_0         
	//* 337  737:getfield        #542 <Field Fragment mPrimaryNav>
	//* 338  740:ifnull          755
			abackstackstate.mPrimaryNavActiveIndex = mPrimaryNav.mIndex;
	//  339  743:aload           7
	//  340  745:aload_0         
	//  341  746:getfield        #542 <Field Fragment mPrimaryNav>
	//  342  749:getfield        #1182 <Field int Fragment.mIndex>
	//  343  752:putfield        #1639 <Field int FragmentManagerState.mPrimaryNavActiveIndex>
		return ((Parcelable) (abackstackstate));
	//  344  755:aload           7
	//  345  757:areturn         
	}

	Bundle saveFragmentBasicState(Fragment fragment)
	{
		Bundle bundle1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		if(mStateBundle == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #155 <Field Bundle mStateBundle>
	//*   4    6:ifnonnull       20
			mStateBundle = new Bundle();
	//    5    9:aload_0         
	//    6   10:new             #1132 <Class Bundle>
	//    7   13:dup             
	//    8   14:invokespecial   #1670 <Method void Bundle()>
	//    9   17:putfield        #155 <Field Bundle mStateBundle>
		fragment.performSaveInstanceState(mStateBundle);
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #155 <Field Bundle mStateBundle>
	//   13   25:invokevirtual   #1686 <Method void Fragment.performSaveInstanceState(Bundle)>
		dispatchOnFragmentSaveInstanceState(fragment, mStateBundle, false);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:getfield        #155 <Field Bundle mStateBundle>
	//   18   34:iconst_0        
	//   19   35:invokevirtual   #917 <Method void dispatchOnFragmentSaveInstanceState(Fragment, Bundle, boolean)>
		if(!mStateBundle.isEmpty())
	//*  20   38:aload_0         
	//*  21   39:getfield        #155 <Field Bundle mStateBundle>
	//*  22   42:invokevirtual   #1687 <Method boolean Bundle.isEmpty()>
	//*  23   45:ifne            58
		{
			bundle1 = mStateBundle;
	//   24   48:aload_0         
	//   25   49:getfield        #155 <Field Bundle mStateBundle>
	//   26   52:astore_3        
			mStateBundle = null;
	//   27   53:aload_0         
	//   28   54:aconst_null     
	//   29   55:putfield        #155 <Field Bundle mStateBundle>
		}
		if(fragment.mView != null)
	//*  30   58:aload_1         
	//*  31   59:getfield        #211 <Field View Fragment.mView>
	//*  32   62:ifnull          70
			saveFragmentViewState(fragment);
	//   33   65:aload_0         
	//   34   66:aload_1         
	//   35   67:invokevirtual   #1399 <Method void saveFragmentViewState(Fragment)>
		Bundle bundle = bundle1;
	//   36   70:aload_3         
	//   37   71:astore_2        
		if(fragment.mSavedViewState != null)
	//*  38   72:aload_1         
	//*  39   73:getfield        #1255 <Field SparseArray Fragment.mSavedViewState>
	//*  40   76:ifnull          103
		{
			bundle = bundle1;
	//   41   79:aload_3         
	//   42   80:astore_2        
			if(bundle1 == null)
	//*  43   81:aload_3         
	//*  44   82:ifnonnull       93
				bundle = new Bundle();
	//   45   85:new             #1132 <Class Bundle>
	//   46   88:dup             
	//   47   89:invokespecial   #1670 <Method void Bundle()>
	//   48   92:astore_2        
			bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
	//   49   93:aload_2         
	//   50   94:ldc1            #67  <String "android:view_state">
	//   51   96:aload_1         
	//   52   97:getfield        #1255 <Field SparseArray Fragment.mSavedViewState>
	//   53  100:invokevirtual   #1691 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
		}
		bundle1 = bundle;
	//   54  103:aload_2         
	//   55  104:astore_3        
		if(!fragment.mUserVisibleHint)
	//*  56  105:aload_1         
	//*  57  106:getfield        #1270 <Field boolean Fragment.mUserVisibleHint>
	//*  58  109:ifne            136
		{
			bundle1 = bundle;
	//   59  112:aload_2         
	//   60  113:astore_3        
			if(bundle == null)
	//*  61  114:aload_2         
	//*  62  115:ifnonnull       126
				bundle1 = new Bundle();
	//   63  118:new             #1132 <Class Bundle>
	//   64  121:dup             
	//   65  122:invokespecial   #1670 <Method void Bundle()>
	//   66  125:astore_3        
			bundle1.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
	//   67  126:aload_3         
	//   68  127:ldc1            #64  <String "android:user_visible_hint">
	//   69  129:aload_1         
	//   70  130:getfield        #1270 <Field boolean Fragment.mUserVisibleHint>
	//   71  133:invokevirtual   #1695 <Method void Bundle.putBoolean(String, boolean)>
		}
		return bundle1;
	//   72  136:aload_3         
	//   73  137:areturn         
	}

	public Fragment.SavedState saveFragmentInstanceState(Fragment fragment)
	{
		if(fragment.mIndex < 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1182 <Field int Fragment.mIndex>
	//*   2    4:ifge            44
			throwException(((RuntimeException) (new IllegalStateException((new StringBuilder()).append("Fragment ").append(((Object) (fragment))).append(" is not currently in the FragmentManager").toString()))));
	//    3    7:aload_0         
	//    4    8:new             #230 <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:new             #239 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #240 <Method void StringBuilder()>
	//    9   19:ldc2            #1287 <String "Fragment ">
	//   10   22:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:ldc2            #1544 <String " is not currently in the FragmentManager">
	//   14   32:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   16   38:invokespecial   #235 <Method void IllegalStateException(String)>
	//   17   41:invokespecial   #1142 <Method void throwException(RuntimeException)>
		if(fragment.mState > 0)
	//*  18   44:aload_1         
	//*  19   45:getfield        #197 <Field int Fragment.mState>
	//*  20   48:ifle            72
		{
			fragment = ((Fragment) (saveFragmentBasicState(fragment)));
	//   21   51:aload_0         
	//   22   52:aload_1         
	//   23   53:invokevirtual   #1665 <Method Bundle saveFragmentBasicState(Fragment)>
	//   24   56:astore_1        
			if(fragment != null)
	//*  25   57:aload_1         
	//*  26   58:ifnull          70
				return new Fragment.SavedState(((Bundle) (fragment)));
	//   27   61:new             #1699 <Class Fragment$SavedState>
	//   28   64:dup             
	//   29   65:aload_1         
	//   30   66:invokespecial   #1701 <Method void Fragment$SavedState(Bundle)>
	//   31   69:areturn         
			else
				return null;
	//   32   70:aconst_null     
	//   33   71:areturn         
		} else
		{
			return null;
	//   34   72:aconst_null     
	//   35   73:areturn         
		}
	}

	void saveFragmentViewState(Fragment fragment)
	{
		if(fragment.mInnerView == null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #1089 <Field View Fragment.mInnerView>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(mStateArray == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #157 <Field SparseArray mStateArray>
	//*   6   12:ifnonnull       29
			mStateArray = new SparseArray();
	//    7   15:aload_0         
	//    8   16:new             #1703 <Class SparseArray>
	//    9   19:dup             
	//   10   20:invokespecial   #1704 <Method void SparseArray()>
	//   11   23:putfield        #157 <Field SparseArray mStateArray>
		else
	//*  12   26:goto            36
			mStateArray.clear();
	//   13   29:aload_0         
	//   14   30:getfield        #157 <Field SparseArray mStateArray>
	//   15   33:invokevirtual   #1705 <Method void SparseArray.clear()>
		fragment.mInnerView.saveHierarchyState(mStateArray);
	//   16   36:aload_1         
	//   17   37:getfield        #1089 <Field View Fragment.mInnerView>
	//   18   40:aload_0         
	//   19   41:getfield        #157 <Field SparseArray mStateArray>
	//   20   44:invokevirtual   #1709 <Method void View.saveHierarchyState(SparseArray)>
		if(mStateArray.size() > 0)
	//*  21   47:aload_0         
	//*  22   48:getfield        #157 <Field SparseArray mStateArray>
	//*  23   51:invokevirtual   #1710 <Method int SparseArray.size()>
	//*  24   54:ifle            70
		{
			fragment.mSavedViewState = mStateArray;
	//   25   57:aload_1         
	//   26   58:aload_0         
	//   27   59:getfield        #157 <Field SparseArray mStateArray>
	//   28   62:putfield        #1255 <Field SparseArray Fragment.mSavedViewState>
			mStateArray = null;
	//   29   65:aload_0         
	//   30   66:aconst_null     
	//   31   67:putfield        #157 <Field SparseArray mStateArray>
		}
	//   32   70:return          
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
	//*   3    3:getfield        #728 <Field ArrayList mBackStackIndices>
	//*   4    6:ifnonnull       20
			mBackStackIndices = new ArrayList();
	//    5    9:aload_0         
	//    6   10:new             #184 <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #353 <Method void ArrayList()>
	//    9   17:putfield        #728 <Field ArrayList mBackStackIndices>
		k = mBackStackIndices.size();
	//   10   20:aload_0         
	//   11   21:getfield        #728 <Field ArrayList mBackStackIndices>
	//   12   24:invokevirtual   #188 <Method int ArrayList.size()>
	//   13   27:istore          4
		int j;
		j = k;
	//   14   29:iload           4
	//   15   31:istore_3        
		if(i >= k)
			break MISSING_BLOCK_LABEL_93;
	//   16   32:iload_1         
	//   17   33:iload           4
	//   18   35:icmpge          93
		if(DEBUG)
	//*  19   38:getstatic       #120 <Field boolean DEBUG>
	//*  20   41:ifeq            80
			Log.v("FragmentManager", (new StringBuilder()).append("Setting back stack index ").append(i).append(" to ").append(((Object) (backstackrecord))).toString());
	//   21   44:ldc1            #55  <String "FragmentManager">
	//   22   46:new             #239 <Class StringBuilder>
	//   23   49:dup             
	//   24   50:invokespecial   #240 <Method void StringBuilder()>
	//   25   53:ldc2            #730 <String "Setting back stack index ">
	//   26   56:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   27   59:iload_1         
	//   28   60:invokevirtual   #733 <Method StringBuilder StringBuilder.append(int)>
	//   29   63:ldc2            #735 <String " to ">
	//   30   66:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   31   69:aload_2         
	//   32   70:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//   33   73:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   34   76:invokestatic    #690 <Method int Log.v(String, String)>
	//   35   79:pop             
		mBackStackIndices.set(i, ((Object) (backstackrecord)));
	//   36   80:aload_0         
	//   37   81:getfield        #728 <Field ArrayList mBackStackIndices>
	//   38   84:iload_1         
	//   39   85:aload_2         
	//   40   86:invokevirtual   #748 <Method Object ArrayList.set(int, Object)>
	//   41   89:pop             
		break MISSING_BLOCK_LABEL_227;
	//   42   90:goto            227
_L2:
		if(j >= i)
			break; /* Loop/switch isn't completed */
	//   43   93:iload_3         
	//   44   94:iload_1         
	//   45   95:icmpge          176
		mBackStackIndices.add(((Object) (null)));
	//   46   98:aload_0         
	//   47   99:getfield        #728 <Field ArrayList mBackStackIndices>
	//   48  102:aconst_null     
	//   49  103:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
	//   50  106:pop             
		if(mAvailBackStackIndices == null)
	//*  51  107:aload_0         
	//*  52  108:getfield        #726 <Field ArrayList mAvailBackStackIndices>
	//*  53  111:ifnonnull       125
			mAvailBackStackIndices = new ArrayList();
	//   54  114:aload_0         
	//   55  115:new             #184 <Class ArrayList>
	//   56  118:dup             
	//   57  119:invokespecial   #353 <Method void ArrayList()>
	//   58  122:putfield        #726 <Field ArrayList mAvailBackStackIndices>
		if(DEBUG)
	//*  59  125:getstatic       #120 <Field boolean DEBUG>
	//*  60  128:ifeq            157
			Log.v("FragmentManager", (new StringBuilder()).append("Adding available back stack index ").append(j).toString());
	//   61  131:ldc1            #55  <String "FragmentManager">
	//   62  133:new             #239 <Class StringBuilder>
	//   63  136:dup             
	//   64  137:invokespecial   #240 <Method void StringBuilder()>
	//   65  140:ldc2            #1712 <String "Adding available back stack index ">
	//   66  143:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   67  146:iload_3         
	//   68  147:invokevirtual   #733 <Method StringBuilder StringBuilder.append(int)>
	//   69  150:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   70  153:invokestatic    #690 <Method int Log.v(String, String)>
	//   71  156:pop             
		mAvailBackStackIndices.add(((Object) (Integer.valueOf(j))));
	//   72  157:aload_0         
	//   73  158:getfield        #726 <Field ArrayList mAvailBackStackIndices>
	//   74  161:iload_3         
	//   75  162:invokestatic    #1123 <Method Integer Integer.valueOf(int)>
	//   76  165:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
	//   77  168:pop             
		j++;
	//   78  169:iload_3         
	//   79  170:iconst_1        
	//   80  171:iadd            
	//   81  172:istore_3        
		if(true) goto _L2; else goto _L1
	//   82  173:goto            93
_L1:
		if(DEBUG)
	//*  83  176:getstatic       #120 <Field boolean DEBUG>
	//*  84  179:ifeq            218
			Log.v("FragmentManager", (new StringBuilder()).append("Adding back stack index ").append(i).append(" with ").append(((Object) (backstackrecord))).toString());
	//   85  182:ldc1            #55  <String "FragmentManager">
	//   86  184:new             #239 <Class StringBuilder>
	//   87  187:dup             
	//   88  188:invokespecial   #240 <Method void StringBuilder()>
	//   89  191:ldc2            #742 <String "Adding back stack index ">
	//   90  194:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   91  197:iload_1         
	//   92  198:invokevirtual   #733 <Method StringBuilder StringBuilder.append(int)>
	//   93  201:ldc2            #744 <String " with ">
	//   94  204:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   95  207:aload_2         
	//   96  208:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//   97  211:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   98  214:invokestatic    #690 <Method int Log.v(String, String)>
	//   99  217:pop             
		mBackStackIndices.add(((Object) (backstackrecord)));
	//  100  218:aload_0         
	//  101  219:getfield        #728 <Field ArrayList mBackStackIndices>
	//  102  222:aload_2         
	//  103  223:invokevirtual   #264 <Method boolean ArrayList.add(Object)>
	//  104  226:pop             
		this;
	//  105  227:aload_0         
		JVM INSTR monitorexit ;
	//  106  228:monitorexit     
		return;
	//  107  229:return          
		backstackrecord;
	//  108  230:astore_2        
	//* 109  231:aload_0         
		throw backstackrecord;
	//  110  232:monitorexit     
	//  111  233:aload_2         
	//  112  234:athrow          
	}

	public void setPrimaryNavigationFragment(Fragment fragment)
	{
		if(fragment != null && (fragment.getFragmentManager() != this || fragment.mIndex >= mActive.size() || mActive.get(fragment.mIndex) != fragment))
	//*   0    0:aload_1         
	//*   1    1:ifnull          79
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #835 <Method FragmentManager Fragment.getFragmentManager()>
	//*   4    8:aload_0         
	//*   5    9:if_acmpne       41
	//*   6   12:aload_1         
	//*   7   13:getfield        #1182 <Field int Fragment.mIndex>
	//*   8   16:aload_0         
	//*   9   17:getfield        #285 <Field ArrayList mActive>
	//*  10   20:invokevirtual   #188 <Method int ArrayList.size()>
	//*  11   23:icmpge          41
	//*  12   26:aload_0         
	//*  13   27:getfield        #285 <Field ArrayList mActive>
	//*  14   30:aload_1         
	//*  15   31:getfield        #1182 <Field int Fragment.mIndex>
	//*  16   34:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//*  17   37:aload_1         
	//*  18   38:if_acmpeq       79
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Fragment ").append(((Object) (fragment))).append(" is not an active fragment of FragmentManager ").append(((Object) (this))).toString());
	//   19   41:new             #1323 <Class IllegalArgumentException>
	//   20   44:dup             
	//   21   45:new             #239 <Class StringBuilder>
	//   22   48:dup             
	//   23   49:invokespecial   #240 <Method void StringBuilder()>
	//   24   52:ldc2            #1287 <String "Fragment ">
	//   25   55:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   26   58:aload_1         
	//   27   59:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//   28   62:ldc2            #1715 <String " is not an active fragment of FragmentManager ">
	//   29   65:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   30   68:aload_0         
	//   31   69:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//   32   72:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   33   75:invokespecial   #1328 <Method void IllegalArgumentException(String)>
	//   34   78:athrow          
		} else
		{
			mPrimaryNav = fragment;
	//   35   79:aload_0         
	//   36   80:aload_1         
	//   37   81:putfield        #542 <Field Fragment mPrimaryNav>
			return;
	//   38   84:return          
		}
	}

	public void showFragment(Fragment fragment)
	{
		if(DEBUG)
	//*   0    0:getstatic       #120 <Field boolean DEBUG>
	//*   1    3:ifeq            32
			Log.v("FragmentManager", (new StringBuilder()).append("show: ").append(((Object) (fragment))).toString());
	//    2    6:ldc1            #55  <String "FragmentManager">
	//    3    8:new             #239 <Class StringBuilder>
	//    4   11:dup             
	//    5   12:invokespecial   #240 <Method void StringBuilder()>
	//    6   15:ldc2            #1718 <String "show: ">
	//    7   18:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//    8   21:aload_1         
	//    9   22:invokevirtual   #687 <Method StringBuilder StringBuilder.append(Object)>
	//   10   25:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   11   28:invokestatic    #690 <Method int Log.v(String, String)>
	//   12   31:pop             
		if(fragment.mHidden)
	//*  13   32:aload_1         
	//*  14   33:getfield        #214 <Field boolean Fragment.mHidden>
	//*  15   36:ifeq            63
		{
			fragment.mHidden = false;
	//   16   39:aload_1         
	//   17   40:iconst_0        
	//   18   41:putfield        #214 <Field boolean Fragment.mHidden>
			boolean flag;
			if(!fragment.mHiddenChanged)
	//*  19   44:aload_1         
	//*  20   45:getfield        #708 <Field boolean Fragment.mHiddenChanged>
	//*  21   48:ifne            56
				flag = true;
	//   22   51:iconst_1        
	//   23   52:istore_2        
			else
	//*  24   53:goto            58
				flag = false;
	//   25   56:iconst_0        
	//   26   57:istore_2        
			fragment.mHiddenChanged = flag;
	//   27   58:aload_1         
	//   28   59:iload_2         
	//   29   60:putfield        #708 <Field boolean Fragment.mHiddenChanged>
		}
	//   30   63:return          
	}

	void startPendingDeferredFragments()
	{
		if(mActive == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #285 <Field ArrayList mActive>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		for(int i = 0; i < mActive.size(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:getfield        #285 <Field ArrayList mActive>
	//*   9   15:invokevirtual   #188 <Method int ArrayList.size()>
	//*  10   18:icmpge          49
		{
			Fragment fragment = (Fragment)mActive.get(i);
	//   11   21:aload_0         
	//   12   22:getfield        #285 <Field ArrayList mActive>
	//   13   25:iload_1         
	//   14   26:invokevirtual   #192 <Method Object ArrayList.get(int)>
	//   15   29:checkcast       #194 <Class Fragment>
	//   16   32:astore_2        
			if(fragment != null)
	//*  17   33:aload_2         
	//*  18   34:ifnull          42
				performPendingDeferredStart(fragment);
	//   19   37:aload_0         
	//   20   38:aload_2         
	//   21   39:invokevirtual   #1720 <Method void performPendingDeferredStart(Fragment)>
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
	//    0    0:new             #239 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          128
	//    3    7:invokespecial   #1721 <Method void StringBuilder(int)>
	//    4   10:astore_1        
		stringbuilder.append("FragmentManager{");
	//    5   11:aload_1         
	//    6   12:ldc2            #1723 <String "FragmentManager{">
	//    7   15:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:invokestatic    #995 <Method int System.identityHashCode(Object)>
	//   12   24:invokestatic    #999 <Method String Integer.toHexString(int)>
	//   13   27:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
		stringbuilder.append(" in ");
	//   15   31:aload_1         
	//   16   32:ldc2            #1725 <String " in ">
	//   17   35:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
		if(mParent != null)
	//*  19   39:aload_0         
	//*  20   40:getfield        #756 <Field Fragment mParent>
	//*  21   43:ifnull          57
			DebugUtils.buildShortClassTag(((Object) (mParent)), stringbuilder);
	//   22   46:aload_0         
	//   23   47:getfield        #756 <Field Fragment mParent>
	//   24   50:aload_1         
	//   25   51:invokestatic    #1731 <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
		else
	//*  26   54:goto            65
			DebugUtils.buildShortClassTag(((Object) (mHost)), stringbuilder);
	//   27   57:aload_0         
	//   28   58:getfield        #337 <Field FragmentHostCallback mHost>
	//   29   61:aload_1         
	//   30   62:invokestatic    #1731 <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
		stringbuilder.append("}}");
	//   31   65:aload_1         
	//   32   66:ldc2            #1733 <String "}}">
	//   33   69:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   34   72:pop             
		return stringbuilder.toString();
	//   35   73:aload_1         
	//   36   74:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   37   77:areturn         
	}

	public void unregisterFragmentLifecycleCallbacks(FragmentManager.FragmentLifecycleCallbacks fragmentlifecyclecallbacks)
	{
		if(mLifecycleCallbacks == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		CopyOnWriteArrayList copyonwritearraylist = mLifecycleCallbacks;
	//    4    8:aload_0         
	//    5    9:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//    6   12:astore          4
		copyonwritearraylist;
	//    7   14:aload           4
		JVM INSTR monitorenter ;
	//    8   16:monitorenter    
		int i = 0;
	//    9   17:iconst_0        
	//   10   18:istore_2        
		int j = mLifecycleCallbacks.size();
	//   11   19:aload_0         
	//   12   20:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   13   23:invokevirtual   #1736 <Method int CopyOnWriteArrayList.size()>
	//   14   26:istore_3        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   15   27:iload_2         
	//   16   28:iload_3         
	//   17   29:icmpge          69
		if(((Pair)mLifecycleCallbacks.get(i)).first == fragmentlifecyclecallbacks)
	//*  18   32:aload_0         
	//*  19   33:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//*  20   36:iload_2         
	//*  21   37:invokevirtual   #1737 <Method Object CopyOnWriteArrayList.get(int)>
	//*  22   40:checkcast       #856 <Class Pair>
	//*  23   43:getfield        #863 <Field Object Pair.first>
	//*  24   46:aload_1         
	//*  25   47:if_acmpne       62
		{
			mLifecycleCallbacks.remove(i);
	//   26   50:aload_0         
	//   27   51:getfield        #839 <Field CopyOnWriteArrayList mLifecycleCallbacks>
	//   28   54:iload_2         
	//   29   55:invokevirtual   #1738 <Method Object CopyOnWriteArrayList.remove(int)>
	//   30   58:pop             
			break; /* Loop/switch isn't completed */
	//   31   59:goto            69
		}
		i++;
	//   32   62:iload_2         
	//   33   63:iconst_1        
	//   34   64:iadd            
	//   35   65:istore_2        
		if(true) goto _L2; else goto _L1
	//   36   66:goto            27
	//*  37   69:aload           4
_L1:
		return;
	//   38   71:monitorexit     
	//   39   72:return          
		fragmentlifecyclecallbacks;
	//   40   73:astore_1        
	//*  41   74:aload           4
		throw fragmentlifecyclecallbacks;
	//   42   76:monitorexit     
	//   43   77:aload_1         
	//   44   78:athrow          
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
	static final boolean HONEYCOMB;
	static final String TAG = "FragmentManager";
	static final String TARGET_REQUEST_CODE_STATE_TAG = "android:target_req_state";
	static final String TARGET_STATE_TAG = "android:target_state";
	static final String USER_VISIBLE_HINT_TAG = "android:user_visible_hint";
	static final String VIEW_STATE_TAG = "android:view_state";
	static Field sAnimationListenerField = null;
	ArrayList mActive;
	ArrayList mAdded;
	ArrayList mAvailBackStackIndices;
	ArrayList mAvailIndices;
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
	private CopyOnWriteArrayList mLifecycleCallbacks;
	boolean mNeedMenuInvalidate;
	String mNoTransactionsBecause;
	Fragment mParent;
	ArrayList mPendingActions;
	ArrayList mPostponedTransactions;
	Fragment mPrimaryNav;
	SparseArray mStateArray;
	Bundle mStateBundle;
	boolean mStateSaved;
	Runnable mTmpActions[];
	ArrayList mTmpAddedFragments;
	ArrayList mTmpIsPop;
	ArrayList mTmpRecords;

	static 
	{
		DEBUG = false;
	//    0    0:iconst_0        
	//    1    1:putstatic       #120 <Field boolean DEBUG>
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*   2    4:getstatic       #125 <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          11
	//*   4    9:icmplt          17
			flag = true;
	//    5   12:iconst_1        
	//    6   13:istore_0        
		else
	//*   7   14:goto            19
			flag = false;
	//    8   17:iconst_0        
	//    9   18:istore_0        
		HONEYCOMB = flag;
	//   10   19:iload_0         
	//   11   20:putstatic       #127 <Field boolean HONEYCOMB>
	//   12   23:aconst_null     
	//   13   24:putstatic       #129 <Field Field sAnimationListenerField>
	//   14   27:new             #131 <Class DecelerateInterpolator>
	//   15   30:dup             
	//   16   31:ldc1            #132 <Float 2.5F>
	//   17   33:invokespecial   #136 <Method void DecelerateInterpolator(float)>
	//   18   36:putstatic       #138 <Field Interpolator DECELERATE_QUINT>
	//   19   39:new             #131 <Class DecelerateInterpolator>
	//   20   42:dup             
	//   21   43:ldc1            #139 <Float 1.5F>
	//   22   45:invokespecial   #136 <Method void DecelerateInterpolator(float)>
	//   23   48:putstatic       #141 <Field Interpolator DECELERATE_CUBIC>
	//   24   51:new             #143 <Class AccelerateInterpolator>
	//   25   54:dup             
	//   26   55:ldc1            #132 <Float 2.5F>
	//   27   57:invokespecial   #144 <Method void AccelerateInterpolator(float)>
	//   28   60:putstatic       #146 <Field Interpolator ACCELERATE_QUINT>
	//   29   63:new             #143 <Class AccelerateInterpolator>
	//   30   66:dup             
	//   31   67:ldc1            #139 <Float 1.5F>
	//   32   69:invokespecial   #144 <Method void AccelerateInterpolator(float)>
	//   33   72:putstatic       #148 <Field Interpolator ACCELERATE_CUBIC>
	//*  34   75:return          
	}


/*
	static void access$200(FragmentManagerImpl fragmentmanagerimpl)
	{
		fragmentmanagerimpl.scheduleCommit();
	//    0    0:aload_0         
	//    1    1:invokespecial   #166 <Method void scheduleCommit()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$300(FragmentManagerImpl fragmentmanagerimpl, BackStackRecord backstackrecord, boolean flag, boolean flag1, boolean flag2)
	{
		fragmentmanagerimpl.completeExecute(backstackrecord, flag, flag1, flag2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #172 <Method void completeExecute(BackStackRecord, boolean, boolean, boolean)>
		return;
	//    6    9:return          
	}

*/
}
