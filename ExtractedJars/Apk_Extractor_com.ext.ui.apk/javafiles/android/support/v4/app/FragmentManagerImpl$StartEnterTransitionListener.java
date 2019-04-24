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
		FragmentManagerImpl.access$600(mRecord.mManager, mRecord, mIsBack, false, false);
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
		FragmentManagerImpl.access$600(fragmentmanagerimpl, backstackrecord, flag2, flag1, true);
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
			FragmentManagerImpl.access$500(mRecord.mManager);
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
	static boolean access$300(FragmentManagerImpl$StartEnterTransitionListener fragmentmanagerimpl$startentertransitionlistener)
	{
		return fragmentmanagerimpl$startentertransitionlistener.mIsBack;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field boolean mIsBack>
	//    2    4:ireturn         
	}

*/


/*
	static BackStackRecord access$400(FragmentManagerImpl$StartEnterTransitionListener fragmentmanagerimpl$startentertransitionlistener)
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
