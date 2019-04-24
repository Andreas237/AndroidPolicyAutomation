// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			FragmentManagerImpl, BackStackRecord, Fragment

static class FragmentManagerImpl$StartEnterTransitionListener
	implements Fragment.OnStartEnterTransitionListener
{

	public void cancelTransaction()
	{
		FragmentManagerImpl.access$300(mRecord.mManager, mRecord, mIsBack, false, false);
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
		FragmentManagerImpl.access$300(fragmentmanagerimpl, backstackrecord, flag2, flag1, true);
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
			FragmentManagerImpl.access$200(mRecord.mManager);
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
	static boolean access$000(FragmentManagerImpl$StartEnterTransitionListener fragmentmanagerimpl$startentertransitionlistener)
	{
		return fragmentmanagerimpl$startentertransitionlistener.mIsBack;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field boolean mIsBack>
	//    2    4:ireturn         
	}

*/


/*
	static BackStackRecord access$100(FragmentManagerImpl$StartEnterTransitionListener fragmentmanagerimpl$startentertransitionlistener)
	{
		return fragmentmanagerimpl$startentertransitionlistener.mRecord;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field BackStackRecord mRecord>
	//    2    4:areturn         
	}

*/

	FragmentManagerImpl$StartEnterTransitionListener(BackStackRecord backstackrecord, boolean flag)
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
