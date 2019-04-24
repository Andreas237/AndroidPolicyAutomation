// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget.helper;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

// Referenced classes of package android.support.v7.widget.helper:
//			ItemTouchHelper

private class ItemTouchHelper$ItemTouchHelperGestureListener extends android.view.GestureDetector.SimpleOnGestureListener
{

	void doNotReactToLongPress()
	{
		mShouldReactToLongPress = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #20  <Field boolean mShouldReactToLongPress>
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
	//*   1    1:getfield        #20  <Field boolean mShouldReactToLongPress>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		Object obj = ((Object) (findChildView(motionevent)));
	//    4    8:aload_0         
	//    5    9:getfield        #15  <Field ItemTouchHelper this$0>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #30  <Method android.view.View ItemTouchHelper.findChildView(MotionEvent)>
	//    8   16:astore          5
		if(obj != null)
	//*   9   18:aload           5
	//*  10   20:ifnull          164
		{
			obj = ((Object) (mRecyclerView.getChildViewHolder(((android.view.View) (obj)))));
	//   11   23:aload_0         
	//   12   24:getfield        #15  <Field ItemTouchHelper this$0>
	//   13   27:getfield        #34  <Field RecyclerView ItemTouchHelper.mRecyclerView>
	//   14   30:aload           5
	//   15   32:invokevirtual   #40  <Method android.support.v7.widget.RecyclerView$ViewHolder RecyclerView.getChildViewHolder(android.view.View)>
	//   16   35:astore          5
			if(obj != null)
	//*  17   37:aload           5
	//*  18   39:ifnull          164
			{
				if(!mCallback.hasDragFlag(mRecyclerView, ((android.support.v7.widget.RecyclerView.ViewHolder) (obj))))
	//*  19   42:aload_0         
	//*  20   43:getfield        #15  <Field ItemTouchHelper this$0>
	//*  21   46:getfield        #44  <Field ItemTouchHelper$Callback ItemTouchHelper.mCallback>
	//*  22   49:aload_0         
	//*  23   50:getfield        #15  <Field ItemTouchHelper this$0>
	//*  24   53:getfield        #34  <Field RecyclerView ItemTouchHelper.mRecyclerView>
	//*  25   56:aload           5
	//*  26   58:invokevirtual   #50  <Method boolean ItemTouchHelper$Callback.hasDragFlag(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//*  27   61:ifne            65
					return;
	//   28   64:return          
				if(motionevent.getPointerId(0) == mActivePointerId)
	//*  29   65:aload_1         
	//*  30   66:iconst_0        
	//*  31   67:invokevirtual   #56  <Method int MotionEvent.getPointerId(int)>
	//*  32   70:aload_0         
	//*  33   71:getfield        #15  <Field ItemTouchHelper this$0>
	//*  34   74:getfield        #60  <Field int ItemTouchHelper.mActivePointerId>
	//*  35   77:icmpne          164
				{
					int i = motionevent.findPointerIndex(mActivePointerId);
	//   36   80:aload_1         
	//   37   81:aload_0         
	//   38   82:getfield        #15  <Field ItemTouchHelper this$0>
	//   39   85:getfield        #60  <Field int ItemTouchHelper.mActivePointerId>
	//   40   88:invokevirtual   #63  <Method int MotionEvent.findPointerIndex(int)>
	//   41   91:istore          4
					float f = motionevent.getX(i);
	//   42   93:aload_1         
	//   43   94:iload           4
	//   44   96:invokevirtual   #67  <Method float MotionEvent.getX(int)>
	//   45   99:fstore_2        
					float f1 = motionevent.getY(i);
	//   46  100:aload_1         
	//   47  101:iload           4
	//   48  103:invokevirtual   #70  <Method float MotionEvent.getY(int)>
	//   49  106:fstore_3        
					mInitialTouchX = f;
	//   50  107:aload_0         
	//   51  108:getfield        #15  <Field ItemTouchHelper this$0>
	//   52  111:fload_2         
	//   53  112:putfield        #74  <Field float ItemTouchHelper.mInitialTouchX>
					mInitialTouchY = f1;
	//   54  115:aload_0         
	//   55  116:getfield        #15  <Field ItemTouchHelper this$0>
	//   56  119:fload_3         
	//   57  120:putfield        #77  <Field float ItemTouchHelper.mInitialTouchY>
					motionevent = ((MotionEvent) (ItemTouchHelper.this));
	//   58  123:aload_0         
	//   59  124:getfield        #15  <Field ItemTouchHelper this$0>
	//   60  127:astore_1        
					mDy = 0.0F;
	//   61  128:aload_0         
	//   62  129:getfield        #15  <Field ItemTouchHelper this$0>
	//   63  132:fconst_0        
	//   64  133:putfield        #80  <Field float ItemTouchHelper.mDy>
					motionevent.mDx = 0.0F;
	//   65  136:aload_1         
	//   66  137:fconst_0        
	//   67  138:putfield        #83  <Field float ItemTouchHelper.mDx>
					if(mCallback.isLongPressDragEnabled())
	//*  68  141:aload_0         
	//*  69  142:getfield        #15  <Field ItemTouchHelper this$0>
	//*  70  145:getfield        #44  <Field ItemTouchHelper$Callback ItemTouchHelper.mCallback>
	//*  71  148:invokevirtual   #87  <Method boolean ItemTouchHelper$Callback.isLongPressDragEnabled()>
	//*  72  151:ifeq            164
						select(((android.support.v7.widget.RecyclerView.ViewHolder) (obj)), 2);
	//   73  154:aload_0         
	//   74  155:getfield        #15  <Field ItemTouchHelper this$0>
	//   75  158:aload           5
	//   76  160:iconst_2        
	//   77  161:invokevirtual   #91  <Method void ItemTouchHelper.select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
				}
			}
		}
	//   78  164:return          
	}

	private boolean mShouldReactToLongPress;
	final ItemTouchHelper this$0;

	ItemTouchHelper$ItemTouchHelperGestureListener()
	{
		this$0 = ItemTouchHelper.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ItemTouchHelper this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void android.view.GestureDetector$SimpleOnGestureListener()>
		mShouldReactToLongPress = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #20  <Field boolean mShouldReactToLongPress>
	//    8   14:return          
	}
}
