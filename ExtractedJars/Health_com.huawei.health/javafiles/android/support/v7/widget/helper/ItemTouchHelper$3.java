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
		if(mOverridden)
	//*   3    5:aload_0         
	//*   4    6:getfield        #35  <Field boolean mOverridden>
	//*   5    9:ifeq            13
			return;
	//    6   12:return          
		if(val$swipeDir <= 0)
	//*   7   13:aload_0         
	//*   8   14:getfield        #21  <Field int val$swipeDir>
	//*   9   17:ifgt            44
		{
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
		} else
	//*  19   41:goto            88
		{
			mPendingCleanup.add(((Object) (val$prevSelected.itemView)));
	//   20   44:aload_0         
	//   21   45:getfield        #19  <Field ItemTouchHelper this$0>
	//   22   48:getfield        #53  <Field List ItemTouchHelper.mPendingCleanup>
	//   23   51:aload_0         
	//   24   52:getfield        #23  <Field android.support.v7.widget.RecyclerView$ViewHolder val$prevSelected>
	//   25   55:getfield        #59  <Field android.view.View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   26   58:invokeinterface #65  <Method boolean List.add(Object)>
	//   27   63:pop             
			mIsPendingCleanup = true;
	//   28   64:aload_0         
	//   29   65:iconst_1        
	//   30   66:putfield        #68  <Field boolean mIsPendingCleanup>
			if(val$swipeDir > 0)
	//*  31   69:aload_0         
	//*  32   70:getfield        #21  <Field int val$swipeDir>
	//*  33   73:ifle            88
				postDispatchSwipe(((coverAnimation) (this)), val$swipeDir);
	//   34   76:aload_0         
	//   35   77:getfield        #19  <Field ItemTouchHelper this$0>
	//   36   80:aload_0         
	//   37   81:aload_0         
	//   38   82:getfield        #21  <Field int val$swipeDir>
	//   39   85:invokevirtual   #72  <Method void ItemTouchHelper.postDispatchSwipe(ItemTouchHelper$RecoverAnimation, int)>
		}
		if(mOverdrawChild == val$prevSelected.itemView)
	//*  40   88:aload_0         
	//*  41   89:getfield        #19  <Field ItemTouchHelper this$0>
	//*  42   92:getfield        #75  <Field android.view.View ItemTouchHelper.mOverdrawChild>
	//*  43   95:aload_0         
	//*  44   96:getfield        #23  <Field android.support.v7.widget.RecyclerView$ViewHolder val$prevSelected>
	//*  45   99:getfield        #59  <Field android.view.View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  46  102:if_acmpne       119
			removeChildDrawingOrderCallbackIfNecessary(val$prevSelected.itemView);
	//   47  105:aload_0         
	//   48  106:getfield        #19  <Field ItemTouchHelper this$0>
	//   49  109:aload_0         
	//   50  110:getfield        #23  <Field android.support.v7.widget.RecyclerView$ViewHolder val$prevSelected>
	//   51  113:getfield        #59  <Field android.view.View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   52  116:invokevirtual   #79  <Method void ItemTouchHelper.removeChildDrawingOrderCallbackIfNecessary(android.view.View)>
	//   53  119:return          
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
		super(final_itemtouchhelper, final_older, I.this, j, f, f1, f2, f3);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:iload_3         
	//   13   21:iload           4
	//   14   23:fload           5
	//   15   25:fload           6
	//   16   27:fload           7
	//   17   29:fload           8
	//   18   31:invokespecial   #26  <Method void ItemTouchHelper$RecoverAnimation(ItemTouchHelper, android.support.v7.widget.RecyclerView$ViewHolder, int, int, float, float, float, float)>
	//   19   34:return          
	}
}
