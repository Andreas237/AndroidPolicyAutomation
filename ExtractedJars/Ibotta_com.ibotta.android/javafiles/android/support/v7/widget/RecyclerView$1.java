// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			RecyclerView

class RecyclerView$1
	implements Runnable
{

	public void run()
	{
		if(mFirstLayoutComplete)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field RecyclerView this$0>
	//*   2    4:getfield        #23  <Field boolean RecyclerView.mFirstLayoutComplete>
	//*   3    7:ifeq            66
		{
			if(isLayoutRequested())
	//*   4   10:aload_0         
	//*   5   11:getfield        #14  <Field RecyclerView this$0>
	//*   6   14:invokevirtual   #27  <Method boolean RecyclerView.isLayoutRequested()>
	//*   7   17:ifeq            21
				return;
	//    8   20:return          
			if(!mIsAttached)
	//*   9   21:aload_0         
	//*  10   22:getfield        #14  <Field RecyclerView this$0>
	//*  11   25:getfield        #30  <Field boolean RecyclerView.mIsAttached>
	//*  12   28:ifne            39
			{
				requestLayout();
	//   13   31:aload_0         
	//   14   32:getfield        #14  <Field RecyclerView this$0>
	//   15   35:invokevirtual   #33  <Method void RecyclerView.requestLayout()>
				return;
	//   16   38:return          
			}
			if(mLayoutFrozen)
	//*  17   39:aload_0         
	//*  18   40:getfield        #14  <Field RecyclerView this$0>
	//*  19   43:getfield        #36  <Field boolean RecyclerView.mLayoutFrozen>
	//*  20   46:ifeq            58
			{
				mLayoutWasDefered = true;
	//   21   49:aload_0         
	//   22   50:getfield        #14  <Field RecyclerView this$0>
	//   23   53:iconst_1        
	//   24   54:putfield        #39  <Field boolean RecyclerView.mLayoutWasDefered>
				return;
	//   25   57:return          
			} else
			{
				consumePendingUpdateOperations();
	//   26   58:aload_0         
	//   27   59:getfield        #14  <Field RecyclerView this$0>
	//   28   62:invokevirtual   #42  <Method void RecyclerView.consumePendingUpdateOperations()>
				return;
	//   29   65:return          
			}
		} else
		{
			return;
	//   30   66:return          
		}
	}

	final RecyclerView this$0;

	RecyclerView$1()
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
