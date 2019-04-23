// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget.helper;

import android.support.v7.widget.RecyclerView;

// Referenced classes of package android.support.v7.widget.helper:
//			ItemTouchHelper

class ItemTouchHelper$4
	implements Runnable
{

	public void run()
	{
		if(mRecyclerView != null && mRecyclerView.isAttachedToWindow() && !val$anim.mOverridden && val$anim.mViewHolder.getAdapterPosition() != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field ItemTouchHelper this$0>
	//*   2    4:getfield        #34  <Field RecyclerView ItemTouchHelper.mRecyclerView>
	//*   3    7:ifnull          114
	//*   4   10:aload_0         
	//*   5   11:getfield        #21  <Field ItemTouchHelper this$0>
	//*   6   14:getfield        #34  <Field RecyclerView ItemTouchHelper.mRecyclerView>
	//*   7   17:invokevirtual   #40  <Method boolean RecyclerView.isAttachedToWindow()>
	//*   8   20:ifeq            114
	//*   9   23:aload_0         
	//*  10   24:getfield        #23  <Field ItemTouchHelper$RecoverAnimation val$anim>
	//*  11   27:getfield        #46  <Field boolean ItemTouchHelper$RecoverAnimation.mOverridden>
	//*  12   30:ifne            114
	//*  13   33:aload_0         
	//*  14   34:getfield        #23  <Field ItemTouchHelper$RecoverAnimation val$anim>
	//*  15   37:getfield        #50  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
	//*  16   40:invokevirtual   #56  <Method int android.support.v7.widget.RecyclerView$ViewHolder.getAdapterPosition()>
	//*  17   43:iconst_m1       
	//*  18   44:icmpeq          114
		{
			android.support.v7.widget.nimator nimator = mRecyclerView.getItemAnimator();
	//   19   47:aload_0         
	//   20   48:getfield        #21  <Field ItemTouchHelper this$0>
	//   21   51:getfield        #34  <Field RecyclerView ItemTouchHelper.mRecyclerView>
	//   22   54:invokevirtual   #60  <Method android.support.v7.widget.RecyclerView$ItemAnimator RecyclerView.getItemAnimator()>
	//   23   57:astore_1        
			if((nimator == null || !nimator.isRunning(((android.support.v7.widget.nimator.ItemAnimatorFinishedListener) (null)))) && !hasRunningRecoverAnim())
	//*  24   58:aload_1         
	//*  25   59:ifnull          70
	//*  26   62:aload_1         
	//*  27   63:aconst_null     
	//*  28   64:invokevirtual   #66  <Method boolean android.support.v7.widget.RecyclerView$ItemAnimator.isRunning(android.support.v7.widget.RecyclerView$ItemAnimator$ItemAnimatorFinishedListener)>
	//*  29   67:ifne            102
	//*  30   70:aload_0         
	//*  31   71:getfield        #21  <Field ItemTouchHelper this$0>
	//*  32   74:invokevirtual   #69  <Method boolean ItemTouchHelper.hasRunningRecoverAnim()>
	//*  33   77:ifne            102
			{
				mCallback.onSwiped(val$anim.mViewHolder, val$swipeDir);
	//   34   80:aload_0         
	//   35   81:getfield        #21  <Field ItemTouchHelper this$0>
	//   36   84:getfield        #73  <Field ItemTouchHelper$Callback ItemTouchHelper.mCallback>
	//   37   87:aload_0         
	//   38   88:getfield        #23  <Field ItemTouchHelper$RecoverAnimation val$anim>
	//   39   91:getfield        #50  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
	//   40   94:aload_0         
	//   41   95:getfield        #25  <Field int val$swipeDir>
	//   42   98:invokevirtual   #79  <Method void ItemTouchHelper$Callback.onSwiped(android.support.v7.widget.RecyclerView$ViewHolder, int)>
				return;
	//   43  101:return          
			}
			mRecyclerView.post(((Runnable) (this)));
	//   44  102:aload_0         
	//   45  103:getfield        #21  <Field ItemTouchHelper this$0>
	//   46  106:getfield        #34  <Field RecyclerView ItemTouchHelper.mRecyclerView>
	//   47  109:aload_0         
	//   48  110:invokevirtual   #83  <Method boolean RecyclerView.post(Runnable)>
	//   49  113:pop             
		}
	//   50  114:return          
	}

	final ItemTouchHelper this$0;
	final coverAnimation val$anim;
	final int val$swipeDir;

	ItemTouchHelper$4()
	{
		this$0 = final_itemtouchhelper;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field ItemTouchHelper this$0>
		val$anim = coveranimation;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field ItemTouchHelper$RecoverAnimation val$anim>
		val$swipeDir = I.this;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #25  <Field int val$swipeDir>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
