// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			RecyclerView, ChildHelper

class RecyclerView$6
	implements allback
{

	void dispatchUpdate(pdateOp pdateop)
	{
		switch(pdateop.cmd)
	//*   0    0:aload_1         
	//*   1    1:getfield        #28  <Field int AdapterHelper$UpdateOp.cmd>
		{
	//*   2    4:tableswitch     1 8: default 52
	//	               1 53
	//	               2 76
	//	               3 52
	//	               4 99
	//	               5 52
	//	               6 52
	//	               7 52
	//	               8 126
		case 3: // '\003'
		case 5: // '\005'
		case 6: // '\006'
		case 7: // '\007'
		default:
			return;
	//    3   52:return          

		case 1: // '\001'
			mLayout.onItemsAdded(RecyclerView.this, pdateop.positionStart, pdateop.itemCount);
	//    4   53:aload_0         
	//    5   54:getfield        #17  <Field RecyclerView this$0>
	//    6   57:getfield        #32  <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//    7   60:aload_0         
	//    8   61:getfield        #17  <Field RecyclerView this$0>
	//    9   64:aload_1         
	//   10   65:getfield        #35  <Field int AdapterHelper$UpdateOp.positionStart>
	//   11   68:aload_1         
	//   12   69:getfield        #38  <Field int AdapterHelper$UpdateOp.itemCount>
	//   13   72:invokevirtual   #44  <Method void RecyclerView$LayoutManager.onItemsAdded(RecyclerView, int, int)>
			return;
	//   14   75:return          

		case 2: // '\002'
			mLayout.onItemsRemoved(RecyclerView.this, pdateop.positionStart, pdateop.itemCount);
	//   15   76:aload_0         
	//   16   77:getfield        #17  <Field RecyclerView this$0>
	//   17   80:getfield        #32  <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//   18   83:aload_0         
	//   19   84:getfield        #17  <Field RecyclerView this$0>
	//   20   87:aload_1         
	//   21   88:getfield        #35  <Field int AdapterHelper$UpdateOp.positionStart>
	//   22   91:aload_1         
	//   23   92:getfield        #38  <Field int AdapterHelper$UpdateOp.itemCount>
	//   24   95:invokevirtual   #47  <Method void RecyclerView$LayoutManager.onItemsRemoved(RecyclerView, int, int)>
			return;
	//   25   98:return          

		case 4: // '\004'
			mLayout.onItemsUpdated(RecyclerView.this, pdateop.positionStart, pdateop.itemCount, pdateop.payload);
	//   26   99:aload_0         
	//   27  100:getfield        #17  <Field RecyclerView this$0>
	//   28  103:getfield        #32  <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//   29  106:aload_0         
	//   30  107:getfield        #17  <Field RecyclerView this$0>
	//   31  110:aload_1         
	//   32  111:getfield        #35  <Field int AdapterHelper$UpdateOp.positionStart>
	//   33  114:aload_1         
	//   34  115:getfield        #38  <Field int AdapterHelper$UpdateOp.itemCount>
	//   35  118:aload_1         
	//   36  119:getfield        #51  <Field Object AdapterHelper$UpdateOp.payload>
	//   37  122:invokevirtual   #55  <Method void RecyclerView$LayoutManager.onItemsUpdated(RecyclerView, int, int, Object)>
			return;
	//   38  125:return          

		case 8: // '\b'
			mLayout.onItemsMoved(RecyclerView.this, pdateop.positionStart, pdateop.itemCount, 1);
	//   39  126:aload_0         
	//   40  127:getfield        #17  <Field RecyclerView this$0>
	//   41  130:getfield        #32  <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//   42  133:aload_0         
	//   43  134:getfield        #17  <Field RecyclerView this$0>
	//   44  137:aload_1         
	//   45  138:getfield        #35  <Field int AdapterHelper$UpdateOp.positionStart>
	//   46  141:aload_1         
	//   47  142:getfield        #38  <Field int AdapterHelper$UpdateOp.itemCount>
	//   48  145:iconst_1        
	//   49  146:invokevirtual   #59  <Method void RecyclerView$LayoutManager.onItemsMoved(RecyclerView, int, int, int)>
			break;
		}
	//   50  149:return          
	}

	public ewHolder findViewHolder(int i)
	{
		ewHolder ewholder1 = findViewHolderForPosition(i, true);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView this$0>
	//    2    4:iload_1         
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #65  <Method RecyclerView$ViewHolder RecyclerView.findViewHolderForPosition(int, boolean)>
	//    5    9:astore_3        
		ewHolder ewholder;
		if(ewholder1 == null)
	//*   6   10:aload_3         
	//*   7   11:ifnonnull       18
		{
			ewholder = null;
	//    8   14:aconst_null     
	//    9   15:astore_2        
		} else
	//*  10   16:aload_2         
	//*  11   17:areturn         
		{
			ewholder = ewholder1;
	//   12   18:aload_3         
	//   13   19:astore_2        
			if(mChildHelper.isHidden(ewholder1.itemView))
	//*  14   20:aload_0         
	//*  15   21:getfield        #17  <Field RecyclerView this$0>
	//*  16   24:getfield        #69  <Field ChildHelper RecyclerView.mChildHelper>
	//*  17   27:aload_3         
	//*  18   28:getfield        #75  <Field android.view.View RecyclerView$ViewHolder.itemView>
	//*  19   31:invokevirtual   #81  <Method boolean ChildHelper.isHidden(android.view.View)>
	//*  20   34:ifeq            16
				return null;
	//   21   37:aconst_null     
	//   22   38:areturn         
		}
		return ewholder;
	}

	public void markViewHoldersUpdated(int i, int j, Object obj)
	{
		viewRangeUpdate(i, j, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView this$0>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #86  <Method void RecyclerView.viewRangeUpdate(int, int, Object)>
		mItemsChanged = true;
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field RecyclerView this$0>
	//    8   14:iconst_1        
	//    9   15:putfield        #90  <Field boolean RecyclerView.mItemsChanged>
	//   10   18:return          
	}

	public void offsetPositionsForAdd(int i, int j)
	{
		offsetPositionRecordsForInsert(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView this$0>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #95  <Method void RecyclerView.offsetPositionRecordsForInsert(int, int)>
		mItemsAddedOrRemoved = true;
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field RecyclerView this$0>
	//    7   13:iconst_1        
	//    8   14:putfield        #98  <Field boolean RecyclerView.mItemsAddedOrRemoved>
	//    9   17:return          
	}

	public void offsetPositionsForMove(int i, int j)
	{
		offsetPositionRecordsForMove(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView this$0>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #102 <Method void RecyclerView.offsetPositionRecordsForMove(int, int)>
		mItemsAddedOrRemoved = true;
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field RecyclerView this$0>
	//    7   13:iconst_1        
	//    8   14:putfield        #98  <Field boolean RecyclerView.mItemsAddedOrRemoved>
	//    9   17:return          
	}

	public void offsetPositionsForRemovingInvisible(int i, int j)
	{
		offsetPositionRecordsForRemove(i, j, true);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView this$0>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #107 <Method void RecyclerView.offsetPositionRecordsForRemove(int, int, boolean)>
		mItemsAddedOrRemoved = true;
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field RecyclerView this$0>
	//    8   14:iconst_1        
	//    9   15:putfield        #98  <Field boolean RecyclerView.mItemsAddedOrRemoved>
		ate ate = mState;
	//   10   18:aload_0         
	//   11   19:getfield        #17  <Field RecyclerView this$0>
	//   12   22:getfield        #111 <Field RecyclerView$State RecyclerView.mState>
	//   13   25:astore_3        
		ate.mDeletedInvisibleItemCountSincePreviousLayout = ate.mDeletedInvisibleItemCountSincePreviousLayout + j;
	//   14   26:aload_3         
	//   15   27:aload_3         
	//   16   28:getfield        #116 <Field int RecyclerView$State.mDeletedInvisibleItemCountSincePreviousLayout>
	//   17   31:iload_2         
	//   18   32:iadd            
	//   19   33:putfield        #116 <Field int RecyclerView$State.mDeletedInvisibleItemCountSincePreviousLayout>
	//   20   36:return          
	}

	public void offsetPositionsForRemovingLaidOutOrNewView(int i, int j)
	{
		offsetPositionRecordsForRemove(i, j, false);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView this$0>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #107 <Method void RecyclerView.offsetPositionRecordsForRemove(int, int, boolean)>
		mItemsAddedOrRemoved = true;
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field RecyclerView this$0>
	//    8   14:iconst_1        
	//    9   15:putfield        #98  <Field boolean RecyclerView.mItemsAddedOrRemoved>
	//   10   18:return          
	}

	public void onDispatchFirstPass(pdateOp pdateop)
	{
		dispatchUpdate(pdateop);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #120 <Method void dispatchUpdate(AdapterHelper$UpdateOp)>
	//    3    5:return          
	}

	public void onDispatchSecondPass(pdateOp pdateop)
	{
		dispatchUpdate(pdateop);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #120 <Method void dispatchUpdate(AdapterHelper$UpdateOp)>
	//    3    5:return          
	}

	final RecyclerView this$0;

	RecyclerView$6()
	{
		this$0 = RecyclerView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field RecyclerView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
