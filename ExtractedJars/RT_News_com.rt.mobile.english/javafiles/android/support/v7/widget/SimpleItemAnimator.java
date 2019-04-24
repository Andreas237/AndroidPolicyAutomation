// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

public abstract class SimpleItemAnimator extends RecyclerView.ItemAnimator
{

	public SimpleItemAnimator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void RecyclerView$ItemAnimator()>
		mSupportsChangeAnimations = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #18  <Field boolean mSupportsChangeAnimations>
	//    5    9:return          
	}

	public abstract boolean animateAdd(RecyclerView.ViewHolder viewholder);

	public boolean animateAppearance(RecyclerView.ViewHolder viewholder, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo1)
	{
		if(itemholderinfo != null && (itemholderinfo.left != itemholderinfo1.left || itemholderinfo.top != itemholderinfo1.top))
	//*   0    0:aload_2         
	//*   1    1:ifnull          48
	//*   2    4:aload_2         
	//*   3    5:getfield        #31  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.left>
	//*   4    8:aload_3         
	//*   5    9:getfield        #31  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.left>
	//*   6   12:icmpne          26
	//*   7   15:aload_2         
	//*   8   16:getfield        #34  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.top>
	//*   9   19:aload_3         
	//*  10   20:getfield        #34  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.top>
	//*  11   23:icmpeq          48
			return animateMove(viewholder, itemholderinfo.left, itemholderinfo.top, itemholderinfo1.left, itemholderinfo1.top);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:aload_2         
	//   15   29:getfield        #31  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.left>
	//   16   32:aload_2         
	//   17   33:getfield        #34  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.top>
	//   18   36:aload_3         
	//   19   37:getfield        #31  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.left>
	//   20   40:aload_3         
	//   21   41:getfield        #34  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.top>
	//   22   44:invokevirtual   #38  <Method boolean animateMove(RecyclerView$ViewHolder, int, int, int, int)>
	//   23   47:ireturn         
		else
			return animateAdd(viewholder);
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:invokevirtual   #40  <Method boolean animateAdd(RecyclerView$ViewHolder)>
	//   27   53:ireturn         
	}

	public abstract boolean animateChange(RecyclerView.ViewHolder viewholder, RecyclerView.ViewHolder viewholder1, int i, int j, int k, int l);

	public boolean animateChange(RecyclerView.ViewHolder viewholder, RecyclerView.ViewHolder viewholder1, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo1)
	{
		int k = itemholderinfo.left;
	//    0    0:aload_3         
	//    1    1:getfield        #31  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.left>
	//    2    4:istore          7
		int l = itemholderinfo.top;
	//    3    6:aload_3         
	//    4    7:getfield        #34  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.top>
	//    5   10:istore          8
		int i;
		int j;
		if(viewholder1.shouldIgnore())
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #50  <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//*   8   16:ifeq            34
		{
			i = itemholderinfo.left;
	//    9   19:aload_3         
	//   10   20:getfield        #31  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.left>
	//   11   23:istore          5
			j = itemholderinfo.top;
	//   12   25:aload_3         
	//   13   26:getfield        #34  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.top>
	//   14   29:istore          6
		} else
	//*  15   31:goto            48
		{
			i = itemholderinfo1.left;
	//   16   34:aload           4
	//   17   36:getfield        #31  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.left>
	//   18   39:istore          5
			j = itemholderinfo1.top;
	//   19   41:aload           4
	//   20   43:getfield        #34  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.top>
	//   21   46:istore          6
		}
		return animateChange(viewholder, viewholder1, k, l, i, j);
	//   22   48:aload_0         
	//   23   49:aload_1         
	//   24   50:aload_2         
	//   25   51:iload           7
	//   26   53:iload           8
	//   27   55:iload           5
	//   28   57:iload           6
	//   29   59:invokevirtual   #52  <Method boolean animateChange(RecyclerView$ViewHolder, RecyclerView$ViewHolder, int, int, int, int)>
	//   30   62:ireturn         
	}

	public boolean animateDisappearance(RecyclerView.ViewHolder viewholder, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo1)
	{
		int k = itemholderinfo.left;
	//    0    0:aload_2         
	//    1    1:getfield        #31  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.left>
	//    2    4:istore          6
		int l = itemholderinfo.top;
	//    3    6:aload_2         
	//    4    7:getfield        #34  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.top>
	//    5   10:istore          7
		itemholderinfo = ((RecyclerView.ItemAnimator.ItemHolderInfo) (viewholder.itemView));
	//    6   12:aload_1         
	//    7   13:getfield        #57  <Field View RecyclerView$ViewHolder.itemView>
	//    8   16:astore_2        
		int i;
		if(itemholderinfo1 == null)
	//*   9   17:aload_3         
	//*  10   18:ifnonnull       30
			i = ((View) (itemholderinfo)).getLeft();
	//   11   21:aload_2         
	//   12   22:invokevirtual   #63  <Method int View.getLeft()>
	//   13   25:istore          4
		else
	//*  14   27:goto            39
			i = itemholderinfo1.left;
	//   15   30:aload_3         
	//   16   31:getfield        #31  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.left>
	//   17   34:istore          4
	//*  18   36:goto            27
		int j;
		if(itemholderinfo1 == null)
	//*  19   39:aload_3         
	//*  20   40:ifnonnull       52
			j = ((View) (itemholderinfo)).getTop();
	//   21   43:aload_2         
	//   22   44:invokevirtual   #66  <Method int View.getTop()>
	//   23   47:istore          5
		else
	//*  24   49:goto            61
			j = itemholderinfo1.top;
	//   25   52:aload_3         
	//   26   53:getfield        #34  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.top>
	//   27   56:istore          5
	//*  28   58:goto            49
		if(!viewholder.isRemoved() && (k != i || l != j))
	//*  29   61:aload_1         
	//*  30   62:invokevirtual   #69  <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*  31   65:ifne            118
	//*  32   68:iload           6
	//*  33   70:iload           4
	//*  34   72:icmpne          82
	//*  35   75:iload           7
	//*  36   77:iload           5
	//*  37   79:icmpeq          118
		{
			((View) (itemholderinfo)).layout(i, j, ((View) (itemholderinfo)).getWidth() + i, ((View) (itemholderinfo)).getHeight() + j);
	//   38   82:aload_2         
	//   39   83:iload           4
	//   40   85:iload           5
	//   41   87:aload_2         
	//   42   88:invokevirtual   #72  <Method int View.getWidth()>
	//   43   91:iload           4
	//   44   93:iadd            
	//   45   94:aload_2         
	//   46   95:invokevirtual   #75  <Method int View.getHeight()>
	//   47   98:iload           5
	//   48  100:iadd            
	//   49  101:invokevirtual   #79  <Method void View.layout(int, int, int, int)>
			return animateMove(viewholder, k, l, i, j);
	//   50  104:aload_0         
	//   51  105:aload_1         
	//   52  106:iload           6
	//   53  108:iload           7
	//   54  110:iload           4
	//   55  112:iload           5
	//   56  114:invokevirtual   #38  <Method boolean animateMove(RecyclerView$ViewHolder, int, int, int, int)>
	//   57  117:ireturn         
		} else
		{
			return animateRemove(viewholder);
	//   58  118:aload_0         
	//   59  119:aload_1         
	//   60  120:invokevirtual   #82  <Method boolean animateRemove(RecyclerView$ViewHolder)>
	//   61  123:ireturn         
		}
	}

	public abstract boolean animateMove(RecyclerView.ViewHolder viewholder, int i, int j, int k, int l);

	public boolean animatePersistence(RecyclerView.ViewHolder viewholder, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo1)
	{
		if(itemholderinfo.left == itemholderinfo1.left && itemholderinfo.top == itemholderinfo1.top)
	//*   0    0:aload_2         
	//*   1    1:getfield        #31  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.left>
	//*   2    4:aload_3         
	//*   3    5:getfield        #31  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.left>
	//*   4    8:icmpne          32
	//*   5   11:aload_2         
	//*   6   12:getfield        #34  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.top>
	//*   7   15:aload_3         
	//*   8   16:getfield        #34  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.top>
	//*   9   19:icmpeq          25
	//*  10   22:goto            32
		{
			dispatchMoveFinished(viewholder);
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:invokevirtual   #87  <Method void dispatchMoveFinished(RecyclerView$ViewHolder)>
			return false;
	//   14   30:iconst_0        
	//   15   31:ireturn         
		} else
		{
			return animateMove(viewholder, itemholderinfo.left, itemholderinfo.top, itemholderinfo1.left, itemholderinfo1.top);
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:aload_2         
	//   19   35:getfield        #31  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.left>
	//   20   38:aload_2         
	//   21   39:getfield        #34  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.top>
	//   22   42:aload_3         
	//   23   43:getfield        #31  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.left>
	//   24   46:aload_3         
	//   25   47:getfield        #34  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.top>
	//   26   50:invokevirtual   #38  <Method boolean animateMove(RecyclerView$ViewHolder, int, int, int, int)>
	//   27   53:ireturn         
		}
	}

	public abstract boolean animateRemove(RecyclerView.ViewHolder viewholder);

	public boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewholder)
	{
		return !mSupportsChangeAnimations || viewholder.isInvalid();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field boolean mSupportsChangeAnimations>
	//    2    4:ifeq            19
	//    3    7:aload_1         
	//    4    8:invokevirtual   #91  <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public final void dispatchAddFinished(RecyclerView.ViewHolder viewholder)
	{
		onAddFinished(viewholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #95  <Method void onAddFinished(RecyclerView$ViewHolder)>
		dispatchAnimationFinished(viewholder);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #98  <Method void dispatchAnimationFinished(RecyclerView$ViewHolder)>
	//    6   10:return          
	}

	public final void dispatchAddStarting(RecyclerView.ViewHolder viewholder)
	{
		onAddStarting(viewholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #102 <Method void onAddStarting(RecyclerView$ViewHolder)>
	//    3    5:return          
	}

	public final void dispatchChangeFinished(RecyclerView.ViewHolder viewholder, boolean flag)
	{
		onChangeFinished(viewholder, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #107 <Method void onChangeFinished(RecyclerView$ViewHolder, boolean)>
		dispatchAnimationFinished(viewholder);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #98  <Method void dispatchAnimationFinished(RecyclerView$ViewHolder)>
	//    7   11:return          
	}

	public final void dispatchChangeStarting(RecyclerView.ViewHolder viewholder, boolean flag)
	{
		onChangeStarting(viewholder, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #111 <Method void onChangeStarting(RecyclerView$ViewHolder, boolean)>
	//    4    6:return          
	}

	public final void dispatchMoveFinished(RecyclerView.ViewHolder viewholder)
	{
		onMoveFinished(viewholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #114 <Method void onMoveFinished(RecyclerView$ViewHolder)>
		dispatchAnimationFinished(viewholder);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #98  <Method void dispatchAnimationFinished(RecyclerView$ViewHolder)>
	//    6   10:return          
	}

	public final void dispatchMoveStarting(RecyclerView.ViewHolder viewholder)
	{
		onMoveStarting(viewholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #118 <Method void onMoveStarting(RecyclerView$ViewHolder)>
	//    3    5:return          
	}

	public final void dispatchRemoveFinished(RecyclerView.ViewHolder viewholder)
	{
		onRemoveFinished(viewholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #122 <Method void onRemoveFinished(RecyclerView$ViewHolder)>
		dispatchAnimationFinished(viewholder);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #98  <Method void dispatchAnimationFinished(RecyclerView$ViewHolder)>
	//    6   10:return          
	}

	public final void dispatchRemoveStarting(RecyclerView.ViewHolder viewholder)
	{
		onRemoveStarting(viewholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #126 <Method void onRemoveStarting(RecyclerView$ViewHolder)>
	//    3    5:return          
	}

	public boolean getSupportsChangeAnimations()
	{
		return mSupportsChangeAnimations;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field boolean mSupportsChangeAnimations>
	//    2    4:ireturn         
	}

	public void onAddFinished(RecyclerView.ViewHolder viewholder)
	{
	//    0    0:return          
	}

	public void onAddStarting(RecyclerView.ViewHolder viewholder)
	{
	//    0    0:return          
	}

	public void onChangeFinished(RecyclerView.ViewHolder viewholder, boolean flag)
	{
	//    0    0:return          
	}

	public void onChangeStarting(RecyclerView.ViewHolder viewholder, boolean flag)
	{
	//    0    0:return          
	}

	public void onMoveFinished(RecyclerView.ViewHolder viewholder)
	{
	//    0    0:return          
	}

	public void onMoveStarting(RecyclerView.ViewHolder viewholder)
	{
	//    0    0:return          
	}

	public void onRemoveFinished(RecyclerView.ViewHolder viewholder)
	{
	//    0    0:return          
	}

	public void onRemoveStarting(RecyclerView.ViewHolder viewholder)
	{
	//    0    0:return          
	}

	public void setSupportsChangeAnimations(boolean flag)
	{
		mSupportsChangeAnimations = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #18  <Field boolean mSupportsChangeAnimations>
	//    3    5:return          
	}

	private static final boolean DEBUG = false;
	private static final String TAG = "SimpleItemAnimator";
	boolean mSupportsChangeAnimations;
}
