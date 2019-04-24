// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget.helper;

import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;

// Referenced classes of package android.support.v7.widget.helper:
//			ItemTouchHelper

class ItemTouchHelper$1
	implements Runnable
{

	public void run()
	{
		if(mSelected != null && scrollIfNecessary())
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field ItemTouchHelper this$0>
	//*   2    4:getfield        #23  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
	//*   3    7:ifnull          73
	//*   4   10:aload_0         
	//*   5   11:getfield        #14  <Field ItemTouchHelper this$0>
	//*   6   14:invokevirtual   #27  <Method boolean ItemTouchHelper.scrollIfNecessary()>
	//*   7   17:ifeq            73
		{
			if(mSelected != null)
	//*   8   20:aload_0         
	//*   9   21:getfield        #14  <Field ItemTouchHelper this$0>
	//*  10   24:getfield        #23  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
	//*  11   27:ifnull          44
				moveIfNecessary(mSelected);
	//   12   30:aload_0         
	//   13   31:getfield        #14  <Field ItemTouchHelper this$0>
	//   14   34:aload_0         
	//   15   35:getfield        #14  <Field ItemTouchHelper this$0>
	//   16   38:getfield        #23  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
	//   17   41:invokevirtual   #31  <Method void ItemTouchHelper.moveIfNecessary(android.support.v7.widget.RecyclerView$ViewHolder)>
			mRecyclerView.removeCallbacks(mScrollRunnable);
	//   18   44:aload_0         
	//   19   45:getfield        #14  <Field ItemTouchHelper this$0>
	//   20   48:getfield        #35  <Field RecyclerView ItemTouchHelper.mRecyclerView>
	//   21   51:aload_0         
	//   22   52:getfield        #14  <Field ItemTouchHelper this$0>
	//   23   55:getfield        #39  <Field Runnable ItemTouchHelper.mScrollRunnable>
	//   24   58:invokevirtual   #45  <Method boolean RecyclerView.removeCallbacks(Runnable)>
	//   25   61:pop             
			ViewCompat.postOnAnimation(((android.view.View) (mRecyclerView)), ((Runnable) (this)));
	//   26   62:aload_0         
	//   27   63:getfield        #14  <Field ItemTouchHelper this$0>
	//   28   66:getfield        #35  <Field RecyclerView ItemTouchHelper.mRecyclerView>
	//   29   69:aload_0         
	//   30   70:invokestatic    #51  <Method void ViewCompat.postOnAnimation(android.view.View, Runnable)>
		}
	//   31   73:return          
	}

	final ItemTouchHelper this$0;

	ItemTouchHelper$1()
	{
		this$0 = ItemTouchHelper.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ItemTouchHelper this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
