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
		FragmentManagerImpl.access$600(mRecord.mManager, mRecord, mIsBack, i ^ true, true);
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
