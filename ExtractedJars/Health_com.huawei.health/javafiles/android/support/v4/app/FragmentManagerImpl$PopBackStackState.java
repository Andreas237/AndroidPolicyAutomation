// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			FragmentManagerImpl, Fragment, FragmentManager

class FragmentManagerImpl$PopBackStackState
	implements FragmentManagerImpl.OpGenerator
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

	FragmentManagerImpl$PopBackStackState(String s, int i, int j)
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
