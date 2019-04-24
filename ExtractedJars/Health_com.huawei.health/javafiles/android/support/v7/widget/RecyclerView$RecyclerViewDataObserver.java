// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.view.ViewCompat;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView, AdapterHelper

class RecyclerView$RecyclerViewDataObserver extends RecyclerView.AdapterDataObserver
{

	public void onChanged()
	{
		assertNotInLayoutOrScroll(((String) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field RecyclerView this$0>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #22  <Method void RecyclerView.assertNotInLayoutOrScroll(String)>
		mState.mStructureChanged = true;
	//    4    8:aload_0         
	//    5    9:getfield        #13  <Field RecyclerView this$0>
	//    6   12:getfield        #26  <Field RecyclerView$State RecyclerView.mState>
	//    7   15:iconst_1        
	//    8   16:putfield        #32  <Field boolean RecyclerView$State.mStructureChanged>
		setDataSetChangedAfterLayout();
	//    9   19:aload_0         
	//   10   20:getfield        #13  <Field RecyclerView this$0>
	//   11   23:invokevirtual   #35  <Method void RecyclerView.setDataSetChangedAfterLayout()>
		if(!mAdapterHelper.hasPendingUpdates())
	//*  12   26:aload_0         
	//*  13   27:getfield        #13  <Field RecyclerView this$0>
	//*  14   30:getfield        #39  <Field AdapterHelper RecyclerView.mAdapterHelper>
	//*  15   33:invokevirtual   #45  <Method boolean AdapterHelper.hasPendingUpdates()>
	//*  16   36:ifne            46
			requestLayout();
	//   17   39:aload_0         
	//   18   40:getfield        #13  <Field RecyclerView this$0>
	//   19   43:invokevirtual   #48  <Method void RecyclerView.requestLayout()>
	//   20   46:return          
	}

	public void onItemRangeChanged(int i, int j, Object obj)
	{
		assertNotInLayoutOrScroll(((String) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field RecyclerView this$0>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #22  <Method void RecyclerView.assertNotInLayoutOrScroll(String)>
		if(mAdapterHelper.onItemRangeChanged(i, j, obj))
	//*   4    8:aload_0         
	//*   5    9:getfield        #13  <Field RecyclerView this$0>
	//*   6   12:getfield        #39  <Field AdapterHelper RecyclerView.mAdapterHelper>
	//*   7   15:iload_1         
	//*   8   16:iload_2         
	//*   9   17:aload_3         
	//*  10   18:invokevirtual   #53  <Method boolean AdapterHelper.onItemRangeChanged(int, int, Object)>
	//*  11   21:ifeq            28
			triggerUpdateProcessor();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #56  <Method void triggerUpdateProcessor()>
	//   14   28:return          
	}

	public void onItemRangeInserted(int i, int j)
	{
		assertNotInLayoutOrScroll(((String) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field RecyclerView this$0>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #22  <Method void RecyclerView.assertNotInLayoutOrScroll(String)>
		if(mAdapterHelper.onItemRangeInserted(i, j))
	//*   4    8:aload_0         
	//*   5    9:getfield        #13  <Field RecyclerView this$0>
	//*   6   12:getfield        #39  <Field AdapterHelper RecyclerView.mAdapterHelper>
	//*   7   15:iload_1         
	//*   8   16:iload_2         
	//*   9   17:invokevirtual   #61  <Method boolean AdapterHelper.onItemRangeInserted(int, int)>
	//*  10   20:ifeq            27
			triggerUpdateProcessor();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #56  <Method void triggerUpdateProcessor()>
	//   13   27:return          
	}

	public void onItemRangeMoved(int i, int j, int k)
	{
		assertNotInLayoutOrScroll(((String) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field RecyclerView this$0>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #22  <Method void RecyclerView.assertNotInLayoutOrScroll(String)>
		if(mAdapterHelper.onItemRangeMoved(i, j, k))
	//*   4    8:aload_0         
	//*   5    9:getfield        #13  <Field RecyclerView this$0>
	//*   6   12:getfield        #39  <Field AdapterHelper RecyclerView.mAdapterHelper>
	//*   7   15:iload_1         
	//*   8   16:iload_2         
	//*   9   17:iload_3         
	//*  10   18:invokevirtual   #66  <Method boolean AdapterHelper.onItemRangeMoved(int, int, int)>
	//*  11   21:ifeq            28
			triggerUpdateProcessor();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #56  <Method void triggerUpdateProcessor()>
	//   14   28:return          
	}

	public void onItemRangeRemoved(int i, int j)
	{
		assertNotInLayoutOrScroll(((String) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field RecyclerView this$0>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #22  <Method void RecyclerView.assertNotInLayoutOrScroll(String)>
		if(mAdapterHelper.onItemRangeRemoved(i, j))
	//*   4    8:aload_0         
	//*   5    9:getfield        #13  <Field RecyclerView this$0>
	//*   6   12:getfield        #39  <Field AdapterHelper RecyclerView.mAdapterHelper>
	//*   7   15:iload_1         
	//*   8   16:iload_2         
	//*   9   17:invokevirtual   #69  <Method boolean AdapterHelper.onItemRangeRemoved(int, int)>
	//*  10   20:ifeq            27
			triggerUpdateProcessor();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #56  <Method void triggerUpdateProcessor()>
	//   13   27:return          
	}

	void triggerUpdateProcessor()
	{
		if(RecyclerView.POST_UPDATES_ON_ANIMATION && mHasFixedSize && mIsAttached)
	//*   0    0:getstatic       #72  <Field boolean RecyclerView.POST_UPDATES_ON_ANIMATION>
	//*   1    3:ifeq            41
	//*   2    6:aload_0         
	//*   3    7:getfield        #13  <Field RecyclerView this$0>
	//*   4   10:getfield        #75  <Field boolean RecyclerView.mHasFixedSize>
	//*   5   13:ifeq            41
	//*   6   16:aload_0         
	//*   7   17:getfield        #13  <Field RecyclerView this$0>
	//*   8   20:getfield        #78  <Field boolean RecyclerView.mIsAttached>
	//*   9   23:ifeq            41
		{
			ViewCompat.postOnAnimation(((android.view.View) (RecyclerView.this)), mUpdateChildViewsRunnable);
	//   10   26:aload_0         
	//   11   27:getfield        #13  <Field RecyclerView this$0>
	//   12   30:aload_0         
	//   13   31:getfield        #13  <Field RecyclerView this$0>
	//   14   34:getfield        #82  <Field Runnable RecyclerView.mUpdateChildViewsRunnable>
	//   15   37:invokestatic    #88  <Method void ViewCompat.postOnAnimation(android.view.View, Runnable)>
			return;
	//   16   40:return          
		} else
		{
			mAdapterUpdateDuringMeasure = true;
	//   17   41:aload_0         
	//   18   42:getfield        #13  <Field RecyclerView this$0>
	//   19   45:iconst_1        
	//   20   46:putfield        #91  <Field boolean RecyclerView.mAdapterUpdateDuringMeasure>
			requestLayout();
	//   21   49:aload_0         
	//   22   50:getfield        #13  <Field RecyclerView this$0>
	//   23   53:invokevirtual   #48  <Method void RecyclerView.requestLayout()>
			return;
	//   24   56:return          
		}
	}

	final RecyclerView this$0;

	RecyclerView$RecyclerViewDataObserver()
	{
		this$0 = RecyclerView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field RecyclerView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void RecyclerView$AdapterDataObserver()>
	//    5    9:return          
	}
}
