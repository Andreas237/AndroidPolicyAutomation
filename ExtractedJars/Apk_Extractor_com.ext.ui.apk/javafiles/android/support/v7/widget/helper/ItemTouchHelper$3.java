// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget.helper;

import android.animation.Animator;
import java.util.List;

// Referenced classes of package android.support.v7.widget.helper:
//			ItemTouchHelper

class ItemTouchHelper$3 extends coverAnimation
{

	public void onAnimationEnd(Animator animator)
	{
		super.onAnimationEnd(animator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #31  <Method void ItemTouchHelper$RecoverAnimation.onAnimationEnd(Animator)>
		if(!mOverridden) goto _L2; else goto _L1
	//    3    5:aload_0         
	//    4    6:getfield        #35  <Field boolean mOverridden>
	//    5    9:ifeq            13
_L1:
		return;
	//    6   12:return          
_L2:
		if(val$swipeDir > 0)
			break; /* Loop/switch isn't completed */
	//    7   13:aload_0         
	//    8   14:getfield        #21  <Field int val$swipeDir>
	//    9   17:ifgt            73
		mCallback.clearView(mRecyclerView, val$prevSelected);
	//   10   20:aload_0         
	//   11   21:getfield        #19  <Field ItemTouchHelper this$0>
	//   12   24:getfield        #39  <Field ItemTouchHelper$Callback ItemTouchHelper.mCallback>
	//   13   27:aload_0         
	//   14   28:getfield        #19  <Field ItemTouchHelper this$0>
	//   15   31:getfield        #43  <Field android.support.v7.widget.RecyclerView ItemTouchHelper.mRecyclerView>
	//   16   34:aload_0         
	//   17   35:getfield        #23  <Field android.support.v7.widget.RecyclerView$ViewHolder val$prevSelected>
	//   18   38:invokevirtual   #49  <Method void ItemTouchHelper$Callback.clearView(android.support.v7.widget.RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
_L4:
		if(mOverdrawChild == val$prevSelected.itemView)
	//*  19   41:aload_0         
	//*  20   42:getfield        #19  <Field ItemTouchHelper this$0>
	//*  21   45:getfield        #53  <Field android.view.View ItemTouchHelper.mOverdrawChild>
	//*  22   48:aload_0         
	//*  23   49:getfield        #23  <Field android.support.v7.widget.RecyclerView$ViewHolder val$prevSelected>
	//*  24   52:getfield        #58  <Field android.view.View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  25   55:if_acmpne       12
		{
			removeChildDrawingOrderCallbackIfNecessary(val$prevSelected.itemView);
	//   26   58:aload_0         
	//   27   59:getfield        #19  <Field ItemTouchHelper this$0>
	//   28   62:aload_0         
	//   29   63:getfield        #23  <Field android.support.v7.widget.RecyclerView$ViewHolder val$prevSelected>
	//   30   66:getfield        #58  <Field android.view.View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   31   69:invokevirtual   #62  <Method void ItemTouchHelper.removeChildDrawingOrderCallbackIfNecessary(android.view.View)>
			return;
	//   32   72:return          
		}
		if(true) goto _L1; else goto _L3
_L3:
		mPendingCleanup.add(((Object) (val$prevSelected.itemView)));
	//   33   73:aload_0         
	//   34   74:getfield        #19  <Field ItemTouchHelper this$0>
	//   35   77:getfield        #66  <Field List ItemTouchHelper.mPendingCleanup>
	//   36   80:aload_0         
	//   37   81:getfield        #23  <Field android.support.v7.widget.RecyclerView$ViewHolder val$prevSelected>
	//   38   84:getfield        #58  <Field android.view.View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   39   87:invokeinterface #72  <Method boolean List.add(Object)>
	//   40   92:pop             
		mIsPendingCleanup = true;
	//   41   93:aload_0         
	//   42   94:iconst_1        
	//   43   95:putfield        #75  <Field boolean mIsPendingCleanup>
		if(val$swipeDir > 0)
	//*  44   98:aload_0         
	//*  45   99:getfield        #21  <Field int val$swipeDir>
	//*  46  102:ifle            41
			postDispatchSwipe(((coverAnimation) (this)), val$swipeDir);
	//   47  105:aload_0         
	//   48  106:getfield        #19  <Field ItemTouchHelper this$0>
	//   49  109:aload_0         
	//   50  110:aload_0         
	//   51  111:getfield        #21  <Field int val$swipeDir>
	//   52  114:invokevirtual   #79  <Method void ItemTouchHelper.postDispatchSwipe(ItemTouchHelper$RecoverAnimation, int)>
		  goto _L4
		if(true) goto _L1; else goto _L5
_L5:
	//*  53  117:goto            41
	}

	final ItemTouchHelper this$0;
	final android.support.v7.widget.older val$prevSelected;
	final int val$swipeDir;

	ItemTouchHelper$3(int j, float f, float f1, float f2, 
			float f3, int k, android.support.v7.widget.older older1)
	{
		this$0 = final_itemtouchhelper;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ItemTouchHelper this$0>
		val$swipeDir = k;
	//    3    5:aload_0         
	//    4    6:iload           9
	//    5    8:putfield        #21  <Field int val$swipeDir>
		val$prevSelected = older1;
	//    6   11:aload_0         
	//    7   12:aload           10
	//    8   14:putfield        #23  <Field android.support.v7.widget.RecyclerView$ViewHolder val$prevSelected>
		super(final_older, I.this, j, f, f1, f2, f3);
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:iload_3         
	//   12   20:iload           4
	//   13   22:fload           5
	//   14   24:fload           6
	//   15   26:fload           7
	//   16   28:fload           8
	//   17   30:invokespecial   #26  <Method void ItemTouchHelper$RecoverAnimation(android.support.v7.widget.RecyclerView$ViewHolder, int, int, float, float, float, float)>
	//   18   33:return          
	}
}
