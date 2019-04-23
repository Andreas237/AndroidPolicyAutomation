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
		int i = pdateop.cmd;
	//    0    0:aload_1         
	//    1    1:getfield        #24  <Field int AdapterHelper$UpdateOp.cmd>
	//    2    4:istore_2        
		if(i != 4)
	//*   3    5:iload_2         
	//*   4    6:iconst_4        
	//*   5    7:icmpeq          111
		{
			if(i != 8)
	//*   6   10:iload_2         
	//*   7   11:bipush          8
	//*   8   13:icmpeq          87
			{
				switch(i)
	//*   9   16:iload_2         
				{
	//*  10   17:tableswitch     1 2: default 40
	//	               1 64
	//	               2 41
				default:
					return;
	//   11   40:return          

				case 2: // '\002'
					mLayout.onItemsRemoved(RecyclerView.this, pdateop.positionStart, pdateop.itemCount);
	//   12   41:aload_0         
	//   13   42:getfield        #12  <Field RecyclerView this$0>
	//   14   45:getfield        #30  <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//   15   48:aload_0         
	//   16   49:getfield        #12  <Field RecyclerView this$0>
	//   17   52:aload_1         
	//   18   53:getfield        #33  <Field int AdapterHelper$UpdateOp.positionStart>
	//   19   56:aload_1         
	//   20   57:getfield        #36  <Field int AdapterHelper$UpdateOp.itemCount>
	//   21   60:invokevirtual   #42  <Method void RecyclerView$LayoutManager.onItemsRemoved(RecyclerView, int, int)>
					return;
	//   22   63:return          

				case 1: // '\001'
					mLayout.onItemsAdded(RecyclerView.this, pdateop.positionStart, pdateop.itemCount);
	//   23   64:aload_0         
	//   24   65:getfield        #12  <Field RecyclerView this$0>
	//   25   68:getfield        #30  <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//   26   71:aload_0         
	//   27   72:getfield        #12  <Field RecyclerView this$0>
	//   28   75:aload_1         
	//   29   76:getfield        #33  <Field int AdapterHelper$UpdateOp.positionStart>
	//   30   79:aload_1         
	//   31   80:getfield        #36  <Field int AdapterHelper$UpdateOp.itemCount>
	//   32   83:invokevirtual   #45  <Method void RecyclerView$LayoutManager.onItemsAdded(RecyclerView, int, int)>
					return;
	//   33   86:return          
				}
			} else
			{
				mLayout.onItemsMoved(RecyclerView.this, pdateop.positionStart, pdateop.itemCount, 1);
	//   34   87:aload_0         
	//   35   88:getfield        #12  <Field RecyclerView this$0>
	//   36   91:getfield        #30  <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//   37   94:aload_0         
	//   38   95:getfield        #12  <Field RecyclerView this$0>
	//   39   98:aload_1         
	//   40   99:getfield        #33  <Field int AdapterHelper$UpdateOp.positionStart>
	//   41  102:aload_1         
	//   42  103:getfield        #36  <Field int AdapterHelper$UpdateOp.itemCount>
	//   43  106:iconst_1        
	//   44  107:invokevirtual   #49  <Method void RecyclerView$LayoutManager.onItemsMoved(RecyclerView, int, int, int)>
				return;
	//   45  110:return          
			}
		} else
		{
			mLayout.onItemsUpdated(RecyclerView.this, pdateop.positionStart, pdateop.itemCount, pdateop.payload);
	//   46  111:aload_0         
	//   47  112:getfield        #12  <Field RecyclerView this$0>
	//   48  115:getfield        #30  <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//   49  118:aload_0         
	//   50  119:getfield        #12  <Field RecyclerView this$0>
	//   51  122:aload_1         
	//   52  123:getfield        #33  <Field int AdapterHelper$UpdateOp.positionStart>
	//   53  126:aload_1         
	//   54  127:getfield        #36  <Field int AdapterHelper$UpdateOp.itemCount>
	//   55  130:aload_1         
	//   56  131:getfield        #53  <Field Object AdapterHelper$UpdateOp.payload>
	//   57  134:invokevirtual   #57  <Method void RecyclerView$LayoutManager.onItemsUpdated(RecyclerView, int, int, Object)>
			return;
	//   58  137:return          
		}
	}

	public ewHolder findViewHolder(int i)
	{
		ewHolder ewholder = findViewHolderForPosition(i, true);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field RecyclerView this$0>
	//    2    4:iload_1         
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #63  <Method RecyclerView$ViewHolder RecyclerView.findViewHolderForPosition(int, boolean)>
	//    5    9:astore_2        
		if(ewholder == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       16
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
		if(mChildHelper.isHidden(ewholder.itemView))
	//*  10   16:aload_0         
	//*  11   17:getfield        #12  <Field RecyclerView this$0>
	//*  12   20:getfield        #67  <Field ChildHelper RecyclerView.mChildHelper>
	//*  13   23:aload_2         
	//*  14   24:getfield        #73  <Field android.view.View RecyclerView$ViewHolder.itemView>
	//*  15   27:invokevirtual   #79  <Method boolean ChildHelper.isHidden(android.view.View)>
	//*  16   30:ifeq            35
			return null;
	//   17   33:aconst_null     
	//   18   34:areturn         
		else
			return ewholder;
	//   19   35:aload_2         
	//   20   36:areturn         
	}

	public void markViewHoldersUpdated(int i, int j, Object obj)
	{
		viewRangeUpdate(i, j, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field RecyclerView this$0>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #84  <Method void RecyclerView.viewRangeUpdate(int, int, Object)>
		mItemsChanged = true;
	//    6   10:aload_0         
	//    7   11:getfield        #12  <Field RecyclerView this$0>
	//    8   14:iconst_1        
	//    9   15:putfield        #88  <Field boolean RecyclerView.mItemsChanged>
	//   10   18:return          
	}

	public void offsetPositionsForAdd(int i, int j)
	{
		offsetPositionRecordsForInsert(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field RecyclerView this$0>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #93  <Method void RecyclerView.offsetPositionRecordsForInsert(int, int)>
		mItemsAddedOrRemoved = true;
	//    5    9:aload_0         
	//    6   10:getfield        #12  <Field RecyclerView this$0>
	//    7   13:iconst_1        
	//    8   14:putfield        #96  <Field boolean RecyclerView.mItemsAddedOrRemoved>
	//    9   17:return          
	}

	public void offsetPositionsForMove(int i, int j)
	{
		offsetPositionRecordsForMove(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field RecyclerView this$0>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #100 <Method void RecyclerView.offsetPositionRecordsForMove(int, int)>
		mItemsAddedOrRemoved = true;
	//    5    9:aload_0         
	//    6   10:getfield        #12  <Field RecyclerView this$0>
	//    7   13:iconst_1        
	//    8   14:putfield        #96  <Field boolean RecyclerView.mItemsAddedOrRemoved>
	//    9   17:return          
	}

	public void offsetPositionsForRemovingInvisible(int i, int j)
	{
		offsetPositionRecordsForRemove(i, j, true);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field RecyclerView this$0>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #105 <Method void RecyclerView.offsetPositionRecordsForRemove(int, int, boolean)>
		Object obj = ((Object) (RecyclerView.this));
	//    6   10:aload_0         
	//    7   11:getfield        #12  <Field RecyclerView this$0>
	//    8   14:astore_3        
		obj.mItemsAddedOrRemoved = true;
	//    9   15:aload_3         
	//   10   16:iconst_1        
	//   11   17:putfield        #96  <Field boolean RecyclerView.mItemsAddedOrRemoved>
		obj = ((Object) (((RecyclerView) (obj)).mState));
	//   12   20:aload_3         
	//   13   21:getfield        #109 <Field RecyclerView$State RecyclerView.mState>
	//   14   24:astore_3        
		obj.mDeletedInvisibleItemCountSincePreviousLayout = ((ate) (obj)).mDeletedInvisibleItemCountSincePreviousLayout + j;
	//   15   25:aload_3         
	//   16   26:aload_3         
	//   17   27:getfield        #114 <Field int RecyclerView$State.mDeletedInvisibleItemCountSincePreviousLayout>
	//   18   30:iload_2         
	//   19   31:iadd            
	//   20   32:putfield        #114 <Field int RecyclerView$State.mDeletedInvisibleItemCountSincePreviousLayout>
	//   21   35:return          
	}

	public void offsetPositionsForRemovingLaidOutOrNewView(int i, int j)
	{
		offsetPositionRecordsForRemove(i, j, false);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field RecyclerView this$0>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #105 <Method void RecyclerView.offsetPositionRecordsForRemove(int, int, boolean)>
		mItemsAddedOrRemoved = true;
	//    6   10:aload_0         
	//    7   11:getfield        #12  <Field RecyclerView this$0>
	//    8   14:iconst_1        
	//    9   15:putfield        #96  <Field boolean RecyclerView.mItemsAddedOrRemoved>
	//   10   18:return          
	}

	public void onDispatchFirstPass(pdateOp pdateop)
	{
		dispatchUpdate(pdateop);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #118 <Method void dispatchUpdate(AdapterHelper$UpdateOp)>
	//    3    5:return          
	}

	public void onDispatchSecondPass(pdateOp pdateop)
	{
		dispatchUpdate(pdateop);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #118 <Method void dispatchUpdate(AdapterHelper$UpdateOp)>
	//    3    5:return          
	}

	final RecyclerView this$0;

	RecyclerView$6()
	{
		this$0 = RecyclerView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field RecyclerView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
