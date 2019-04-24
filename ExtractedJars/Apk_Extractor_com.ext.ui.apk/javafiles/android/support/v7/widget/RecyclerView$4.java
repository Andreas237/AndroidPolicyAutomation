// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			RecyclerView

class RecyclerView$4
	implements rocessCallback
{

	public void processAppeared(ewHolder ewholder, emAnimator.ItemHolderInfo itemholderinfo, emAnimator.ItemHolderInfo itemholderinfo1)
	{
		animateAppearance(ewholder, itemholderinfo, itemholderinfo1);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field RecyclerView this$0>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #23  <Method void RecyclerView.animateAppearance(RecyclerView$ViewHolder, RecyclerView$ItemAnimator$ItemHolderInfo, RecyclerView$ItemAnimator$ItemHolderInfo)>
	//    6   10:return          
	}

	public void processDisappeared(ewHolder ewholder, emAnimator.ItemHolderInfo itemholderinfo, emAnimator.ItemHolderInfo itemholderinfo1)
	{
		mRecycler.unscrapView(ewholder);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field RecyclerView this$0>
	//    2    4:getfield        #30  <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #36  <Method void RecyclerView$Recycler.unscrapView(RecyclerView$ViewHolder)>
		animateDisappearance(ewholder, itemholderinfo, itemholderinfo1);
	//    5   11:aload_0         
	//    6   12:getfield        #14  <Field RecyclerView this$0>
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:aload_3         
	//   10   18:invokevirtual   #39  <Method void RecyclerView.animateDisappearance(RecyclerView$ViewHolder, RecyclerView$ItemAnimator$ItemHolderInfo, RecyclerView$ItemAnimator$ItemHolderInfo)>
	//   11   21:return          
	}

	public void processPersistent(ewHolder ewholder, emAnimator.ItemHolderInfo itemholderinfo, emAnimator.ItemHolderInfo itemholderinfo1)
	{
		ewholder.setIsRecyclable(false);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #47  <Method void RecyclerView$ViewHolder.setIsRecyclable(boolean)>
		if(mDataSetHasChangedAfterLayout)
	//*   3    5:aload_0         
	//*   4    6:getfield        #14  <Field RecyclerView this$0>
	//*   5    9:getfield        #51  <Field boolean RecyclerView.mDataSetHasChangedAfterLayout>
	//*   6   12:ifeq            40
		{
			if(mItemAnimator.animateChange(ewholder, ewholder, itemholderinfo, itemholderinfo1))
	//*   7   15:aload_0         
	//*   8   16:getfield        #14  <Field RecyclerView this$0>
	//*   9   19:getfield        #55  <Field RecyclerView$ItemAnimator RecyclerView.mItemAnimator>
	//*  10   22:aload_1         
	//*  11   23:aload_1         
	//*  12   24:aload_2         
	//*  13   25:aload_3         
	//*  14   26:invokevirtual   #61  <Method boolean RecyclerView$ItemAnimator.animateChange(RecyclerView$ViewHolder, RecyclerView$ViewHolder, RecyclerView$ItemAnimator$ItemHolderInfo, RecyclerView$ItemAnimator$ItemHolderInfo)>
	//*  15   29:ifeq            39
				postAnimationRunner();
	//   16   32:aload_0         
	//   17   33:getfield        #14  <Field RecyclerView this$0>
	//   18   36:invokevirtual   #64  <Method void RecyclerView.postAnimationRunner()>
		} else
	//*  19   39:return          
		if(mItemAnimator.animatePersistence(ewholder, itemholderinfo, itemholderinfo1))
	//*  20   40:aload_0         
	//*  21   41:getfield        #14  <Field RecyclerView this$0>
	//*  22   44:getfield        #55  <Field RecyclerView$ItemAnimator RecyclerView.mItemAnimator>
	//*  23   47:aload_1         
	//*  24   48:aload_2         
	//*  25   49:aload_3         
	//*  26   50:invokevirtual   #68  <Method boolean RecyclerView$ItemAnimator.animatePersistence(RecyclerView$ViewHolder, RecyclerView$ItemAnimator$ItemHolderInfo, RecyclerView$ItemAnimator$ItemHolderInfo)>
	//*  27   53:ifeq            39
		{
			postAnimationRunner();
	//   28   56:aload_0         
	//   29   57:getfield        #14  <Field RecyclerView this$0>
	//   30   60:invokevirtual   #64  <Method void RecyclerView.postAnimationRunner()>
			return;
	//   31   63:return          
		}
	}

	public void unused(ewHolder ewholder)
	{
		mLayout.removeAndRecycleView(ewholder.itemView, mRecycler);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field RecyclerView this$0>
	//    2    4:getfield        #73  <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//    3    7:aload_1         
	//    4    8:getfield        #77  <Field android.view.View RecyclerView$ViewHolder.itemView>
	//    5   11:aload_0         
	//    6   12:getfield        #14  <Field RecyclerView this$0>
	//    7   15:getfield        #30  <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//    8   18:invokevirtual   #83  <Method void RecyclerView$LayoutManager.removeAndRecycleView(android.view.View, RecyclerView$Recycler)>
	//    9   21:return          
	}

	final RecyclerView this$0;

	RecyclerView$4()
	{
		this$0 = RecyclerView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field RecyclerView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
