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
	//*  14   27:goto            36
			i = itemholderinfo1.left;
	//   15   30:aload_3         
	//   16   31:getfield        #31  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.left>
	//   17   34:istore          4
		int j;
		if(itemholderinfo1 == null)
	//*  18   36:aload_3         
	//*  19   37:ifnonnull       49
			j = ((View) (itemholderinfo)).getTop();
	//   20   40:aload_2         
	//   21   41:invokevirtual   #66  <Method int View.getTop()>
	//   22   44:istore          5
		else
	//*  23   46:goto            55
			j = itemholderinfo1.top;
	//   24   49:aload_3         
	//   25   50:getfield        #34  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.top>
	//   26   53:istore          5
		if(!viewholder.isRemoved() && (k != i || l != j))
	//*  27   55:aload_1         
	//*  28   56:invokevirtual   #69  <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*  29   59:ifne            112
	//*  30   62:iload           6
	//*  31   64:iload           4
	//*  32   66:icmpne          76
	//*  33   69:iload           7
	//*  34   71:iload           5
	//*  35   73:icmpeq          112
		{
			((View) (itemholderinfo)).layout(i, j, ((View) (itemholderinfo)).getWidth() + i, ((View) (itemholderinfo)).getHeight() + j);
	//   36   76:aload_2         
	//   37   77:iload           4
	//   38   79:iload           5
	//   39   81:aload_2         
	//   40   82:invokevirtual   #72  <Method int View.getWidth()>
	//   41   85:iload           4
	//   42   87:iadd            
	//   43   88:aload_2         
	//   44   89:invokevirtual   #75  <Method int View.getHeight()>
	//   45   92:iload           5
	//   46   94:iadd            
	//   47   95:invokevirtual   #79  <Method void View.layout(int, int, int, int)>
			return animateMove(viewholder, k, l, i, j);
	//   48   98:aload_0         
	//   49   99:aload_1         
	//   50  100:iload           6
	//   51  102:iload           7
	//   52  104:iload           4
	//   53  106:iload           5
	//   54  108:invokevirtual   #38  <Method boolean animateMove(RecyclerView$ViewHolder, int, int, int, int)>
	//   55  111:ireturn         
		} else
		{
			return animateRemove(viewholder);
	//   56  112:aload_0         
	//   57  113:aload_1         
	//   58  114:invokevirtual   #82  <Method boolean animateRemove(RecyclerView$ViewHolder)>
	//   59  117:ireturn         
		}
	}

	public abstract boolean animateMove(RecyclerView.ViewHolder viewholder, int i, int j, int k, int l);

	public boolean animatePersistence(RecyclerView.ViewHolder viewholder, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo1)
	{
		if(itemholderinfo.left != itemholderinfo1.left || itemholderinfo.top != itemholderinfo1.top)
	//*   0    0:aload_2         
	//*   1    1:getfield        #31  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.left>
	//*   2    4:aload_3         
	//*   3    5:getfield        #31  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.left>
	//*   4    8:icmpne          22
	//*   5   11:aload_2         
	//*   6   12:getfield        #34  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.top>
	//*   7   15:aload_3         
	//*   8   16:getfield        #34  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.top>
	//*   9   19:icmpeq          44
		{
			return animateMove(viewholder, itemholderinfo.left, itemholderinfo.top, itemholderinfo1.left, itemholderinfo1.top);
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:getfield        #31  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.left>
	//   14   28:aload_2         
	//   15   29:getfield        #34  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.top>
	//   16   32:aload_3         
	//   17   33:getfield        #31  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.left>
	//   18   36:aload_3         
	//   19   37:getfield        #34  <Field int RecyclerView$ItemAnimator$ItemHolderInfo.top>
	//   20   40:invokevirtual   #38  <Method boolean animateMove(RecyclerView$ViewHolder, int, int, int, int)>
	//   21   43:ireturn         
		} else
		{
			dispatchMoveFinished(viewholder);
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #87  <Method void dispatchMoveFinished(RecyclerView$ViewHolder)>
			return false;
	//   25   49:iconst_0        
	//   26   50:ireturn         
		}
	}

	public abstract boolean animateRemove(RecyclerView.ViewHolder viewholder);

	public boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewholder)
	{
		return !mSupportsChangeAnimations || viewholder.isInvalid();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field boolean mSupportsChangeAnimations>
	//    2    4:ifeq            14
	//    3    7:aload_1         
	//    4    8:invokevirtual   #91  <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
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
