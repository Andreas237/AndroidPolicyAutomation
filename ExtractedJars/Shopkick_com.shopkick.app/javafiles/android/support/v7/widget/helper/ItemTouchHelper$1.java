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
	//*   3    7:ifnull          72
	//*   4   10:aload_0         
	//*   5   11:getfield        #14  <Field ItemTouchHelper this$0>
	//*   6   14:invokevirtual   #27  <Method boolean ItemTouchHelper.scrollIfNecessary()>
	//*   7   17:ifeq            72
		{
			if(mSelected != null)
	//*   8   20:aload_0         
	//*   9   21:getfield        #14  <Field ItemTouchHelper this$0>
	//*  10   24:getfield        #23  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
	//*  11   27:ifnull          43
			{
				ItemTouchHelper itemtouchhelper = ItemTouchHelper.this;
	//   12   30:aload_0         
	//   13   31:getfield        #14  <Field ItemTouchHelper this$0>
	//   14   34:astore_1        
				itemtouchhelper.moveIfNecessary(itemtouchhelper.mSelected);
	//   15   35:aload_1         
	//   16   36:aload_1         
	//   17   37:getfield        #23  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
	//   18   40:invokevirtual   #31  <Method void ItemTouchHelper.moveIfNecessary(android.support.v7.widget.RecyclerView$ViewHolder)>
			}
			mRecyclerView.removeCallbacks(mScrollRunnable);
	//   19   43:aload_0         
	//   20   44:getfield        #14  <Field ItemTouchHelper this$0>
	//   21   47:getfield        #35  <Field RecyclerView ItemTouchHelper.mRecyclerView>
	//   22   50:aload_0         
	//   23   51:getfield        #14  <Field ItemTouchHelper this$0>
	//   24   54:getfield        #39  <Field Runnable ItemTouchHelper.mScrollRunnable>
	//   25   57:invokevirtual   #45  <Method boolean RecyclerView.removeCallbacks(Runnable)>
	//   26   60:pop             
			ViewCompat.postOnAnimation(((android.view.View) (mRecyclerView)), ((Runnable) (this)));
	//   27   61:aload_0         
	//   28   62:getfield        #14  <Field ItemTouchHelper this$0>
	//   29   65:getfield        #35  <Field RecyclerView ItemTouchHelper.mRecyclerView>
	//   30   68:aload_0         
	//   31   69:invokestatic    #51  <Method void ViewCompat.postOnAnimation(android.view.View, Runnable)>
		}
	//   32   72:return          
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
