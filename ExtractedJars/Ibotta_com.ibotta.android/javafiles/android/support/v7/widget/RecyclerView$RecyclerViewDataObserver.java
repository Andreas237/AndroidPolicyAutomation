// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.view.ViewCompat;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView, AdapterHelper

private class RecyclerView$RecyclerViewDataObserver extends RecyclerView.AdapterDataObserver
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
		processDataSetCompletelyChanged(true);
	//    9   19:aload_0         
	//   10   20:getfield        #13  <Field RecyclerView this$0>
	//   11   23:iconst_1        
	//   12   24:invokevirtual   #36  <Method void RecyclerView.processDataSetCompletelyChanged(boolean)>
		if(!mAdapterHelper.hasPendingUpdates())
	//*  13   27:aload_0         
	//*  14   28:getfield        #13  <Field RecyclerView this$0>
	//*  15   31:getfield        #40  <Field AdapterHelper RecyclerView.mAdapterHelper>
	//*  16   34:invokevirtual   #46  <Method boolean AdapterHelper.hasPendingUpdates()>
	//*  17   37:ifne            47
			requestLayout();
	//   18   40:aload_0         
	//   19   41:getfield        #13  <Field RecyclerView this$0>
	//   20   44:invokevirtual   #49  <Method void RecyclerView.requestLayout()>
	//   21   47:return          
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
	//*   6   12:getfield        #40  <Field AdapterHelper RecyclerView.mAdapterHelper>
	//*   7   15:iload_1         
	//*   8   16:iload_2         
	//*   9   17:aload_3         
	//*  10   18:invokevirtual   #54  <Method boolean AdapterHelper.onItemRangeChanged(int, int, Object)>
	//*  11   21:ifeq            28
			triggerUpdateProcessor();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #57  <Method void triggerUpdateProcessor()>
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
	//*   6   12:getfield        #40  <Field AdapterHelper RecyclerView.mAdapterHelper>
	//*   7   15:iload_1         
	//*   8   16:iload_2         
	//*   9   17:invokevirtual   #62  <Method boolean AdapterHelper.onItemRangeInserted(int, int)>
	//*  10   20:ifeq            27
			triggerUpdateProcessor();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #57  <Method void triggerUpdateProcessor()>
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
	//*   6   12:getfield        #40  <Field AdapterHelper RecyclerView.mAdapterHelper>
	//*   7   15:iload_1         
	//*   8   16:iload_2         
	//*   9   17:iload_3         
	//*  10   18:invokevirtual   #67  <Method boolean AdapterHelper.onItemRangeMoved(int, int, int)>
	//*  11   21:ifeq            28
			triggerUpdateProcessor();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #57  <Method void triggerUpdateProcessor()>
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
	//*   6   12:getfield        #40  <Field AdapterHelper RecyclerView.mAdapterHelper>
	//*   7   15:iload_1         
	//*   8   16:iload_2         
	//*   9   17:invokevirtual   #70  <Method boolean AdapterHelper.onItemRangeRemoved(int, int)>
	//*  10   20:ifeq            27
			triggerUpdateProcessor();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #57  <Method void triggerUpdateProcessor()>
	//   13   27:return          
	}

	void triggerUpdateProcessor()
	{
		if(RecyclerView.POST_UPDATES_ON_ANIMATION && mHasFixedSize && mIsAttached)
	//*   0    0:getstatic       #73  <Field boolean RecyclerView.POST_UPDATES_ON_ANIMATION>
	//*   1    3:ifeq            40
	//*   2    6:aload_0         
	//*   3    7:getfield        #13  <Field RecyclerView this$0>
	//*   4   10:getfield        #76  <Field boolean RecyclerView.mHasFixedSize>
	//*   5   13:ifeq            40
	//*   6   16:aload_0         
	//*   7   17:getfield        #13  <Field RecyclerView this$0>
	//*   8   20:getfield        #79  <Field boolean RecyclerView.mIsAttached>
	//*   9   23:ifeq            40
		{
			RecyclerView recyclerview = RecyclerView.this;
	//   10   26:aload_0         
	//   11   27:getfield        #13  <Field RecyclerView this$0>
	//   12   30:astore_1        
			ViewCompat.postOnAnimation(((android.view.View) (recyclerview)), recyclerview.mUpdateChildViewsRunnable);
	//   13   31:aload_1         
	//   14   32:aload_1         
	//   15   33:getfield        #83  <Field Runnable RecyclerView.mUpdateChildViewsRunnable>
	//   16   36:invokestatic    #89  <Method void ViewCompat.postOnAnimation(android.view.View, Runnable)>
			return;
	//   17   39:return          
		} else
		{
			RecyclerView recyclerview1 = RecyclerView.this;
	//   18   40:aload_0         
	//   19   41:getfield        #13  <Field RecyclerView this$0>
	//   20   44:astore_1        
			recyclerview1.mAdapterUpdateDuringMeasure = true;
	//   21   45:aload_1         
	//   22   46:iconst_1        
	//   23   47:putfield        #92  <Field boolean RecyclerView.mAdapterUpdateDuringMeasure>
			recyclerview1.requestLayout();
	//   24   50:aload_1         
	//   25   51:invokevirtual   #49  <Method void RecyclerView.requestLayout()>
			return;
	//   26   54:return          
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
