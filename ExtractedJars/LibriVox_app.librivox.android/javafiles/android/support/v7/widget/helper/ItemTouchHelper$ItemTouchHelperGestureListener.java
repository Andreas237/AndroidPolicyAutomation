// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget.helper;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

// Referenced classes of package android.support.v7.widget.helper:
//			ItemTouchHelper

class ItemTouchHelper$ItemTouchHelperGestureListener extends android.view.GestureDetector.SimpleOnGestureListener
{

	void doNotReactToLongPress()
	{
		mShouldReactToLongPress = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #17  <Field boolean mShouldReactToLongPress>
	//    3    5:return          
	}

	public boolean onDown(MotionEvent motionevent)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void onLongPress(MotionEvent motionevent)
	{
		if(!mShouldReactToLongPress)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field boolean mShouldReactToLongPress>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		Object obj = ((Object) (findChildView(motionevent)));
	//    4    8:aload_0         
	//    5    9:getfield        #12  <Field ItemTouchHelper this$0>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #29  <Method android.view.View ItemTouchHelper.findChildView(MotionEvent)>
	//    8   16:astore          5
		if(obj != null)
	//*   9   18:aload           5
	//*  10   20:ifnull          152
		{
			obj = ((Object) (mRecyclerView.getChildViewHolder(((android.view.View) (obj)))));
	//   11   23:aload_0         
	//   12   24:getfield        #12  <Field ItemTouchHelper this$0>
	//   13   27:getfield        #33  <Field RecyclerView ItemTouchHelper.mRecyclerView>
	//   14   30:aload           5
	//   15   32:invokevirtual   #39  <Method android.support.v7.widget.RecyclerView$ViewHolder RecyclerView.getChildViewHolder(android.view.View)>
	//   16   35:astore          5
			if(obj != null)
	//*  17   37:aload           5
	//*  18   39:ifnull          152
			{
				if(!mCallback.hasDragFlag(mRecyclerView, ((android.support.v7.widget.RecyclerView.ViewHolder) (obj))))
	//*  19   42:aload_0         
	//*  20   43:getfield        #12  <Field ItemTouchHelper this$0>
	//*  21   46:getfield        #43  <Field ItemTouchHelper$Callback ItemTouchHelper.mCallback>
	//*  22   49:aload_0         
	//*  23   50:getfield        #12  <Field ItemTouchHelper this$0>
	//*  24   53:getfield        #33  <Field RecyclerView ItemTouchHelper.mRecyclerView>
	//*  25   56:aload           5
	//*  26   58:invokevirtual   #49  <Method boolean ItemTouchHelper$Callback.hasDragFlag(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//*  27   61:ifne            65
					return;
	//   28   64:return          
				if(motionevent.getPointerId(0) == mActivePointerId)
	//*  29   65:aload_1         
	//*  30   66:iconst_0        
	//*  31   67:invokevirtual   #55  <Method int MotionEvent.getPointerId(int)>
	//*  32   70:aload_0         
	//*  33   71:getfield        #12  <Field ItemTouchHelper this$0>
	//*  34   74:getfield        #59  <Field int ItemTouchHelper.mActivePointerId>
	//*  35   77:icmpne          152
				{
					int i = motionevent.findPointerIndex(mActivePointerId);
	//   36   80:aload_1         
	//   37   81:aload_0         
	//   38   82:getfield        #12  <Field ItemTouchHelper this$0>
	//   39   85:getfield        #59  <Field int ItemTouchHelper.mActivePointerId>
	//   40   88:invokevirtual   #62  <Method int MotionEvent.findPointerIndex(int)>
	//   41   91:istore          4
					float f = motionevent.getX(i);
	//   42   93:aload_1         
	//   43   94:iload           4
	//   44   96:invokevirtual   #66  <Method float MotionEvent.getX(int)>
	//   45   99:fstore_2        
					float f1 = motionevent.getY(i);
	//   46  100:aload_1         
	//   47  101:iload           4
	//   48  103:invokevirtual   #69  <Method float MotionEvent.getY(int)>
	//   49  106:fstore_3        
					motionevent = ((MotionEvent) (ItemTouchHelper.this));
	//   50  107:aload_0         
	//   51  108:getfield        #12  <Field ItemTouchHelper this$0>
	//   52  111:astore_1        
					motionevent.mInitialTouchX = f;
	//   53  112:aload_1         
	//   54  113:fload_2         
	//   55  114:putfield        #73  <Field float ItemTouchHelper.mInitialTouchX>
					motionevent.mInitialTouchY = f1;
	//   56  117:aload_1         
	//   57  118:fload_3         
	//   58  119:putfield        #76  <Field float ItemTouchHelper.mInitialTouchY>
					motionevent.mDy = 0.0F;
	//   59  122:aload_1         
	//   60  123:fconst_0        
	//   61  124:putfield        #79  <Field float ItemTouchHelper.mDy>
					motionevent.mDx = 0.0F;
	//   62  127:aload_1         
	//   63  128:fconst_0        
	//   64  129:putfield        #82  <Field float ItemTouchHelper.mDx>
					if(((ItemTouchHelper) (motionevent)).mCallback.isLongPressDragEnabled())
	//*  65  132:aload_1         
	//*  66  133:getfield        #43  <Field ItemTouchHelper$Callback ItemTouchHelper.mCallback>
	//*  67  136:invokevirtual   #86  <Method boolean ItemTouchHelper$Callback.isLongPressDragEnabled()>
	//*  68  139:ifeq            152
						select(((android.support.v7.widget.RecyclerView.ViewHolder) (obj)), 2);
	//   69  142:aload_0         
	//   70  143:getfield        #12  <Field ItemTouchHelper this$0>
	//   71  146:aload           5
	//   72  148:iconst_2        
	//   73  149:invokevirtual   #90  <Method void ItemTouchHelper.select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
				}
			}
		}
	//   74  152:return          
	}

	private boolean mShouldReactToLongPress;
	final ItemTouchHelper this$0;

	ItemTouchHelper$ItemTouchHelperGestureListener()
	{
		this$0 = ItemTouchHelper.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ItemTouchHelper this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void android.view.GestureDetector$SimpleOnGestureListener()>
		mShouldReactToLongPress = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #17  <Field boolean mShouldReactToLongPress>
	//    8   14:return          
	}
}
