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

	public boolean onDown(MotionEvent motionevent)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void onLongPress(MotionEvent motionevent)
	{
		Object obj = ((Object) (findChildView(motionevent)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field ItemTouchHelper this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #25  <Method android.view.View ItemTouchHelper.findChildView(MotionEvent)>
	//    4    8:astore          5
		if(obj != null)
	//*   5   10:aload           5
	//*   6   12:ifnull          156
		{
			obj = ((Object) (mRecyclerView.getChildViewHolder(((android.view.View) (obj)))));
	//    7   15:aload_0         
	//    8   16:getfield        #13  <Field ItemTouchHelper this$0>
	//    9   19:getfield        #29  <Field RecyclerView ItemTouchHelper.mRecyclerView>
	//   10   22:aload           5
	//   11   24:invokevirtual   #35  <Method android.support.v7.widget.RecyclerView$ViewHolder RecyclerView.getChildViewHolder(android.view.View)>
	//   12   27:astore          5
			if(obj != null)
	//*  13   29:aload           5
	//*  14   31:ifnull          156
			{
				if(!mCallback.hasDragFlag(mRecyclerView, ((android.support.v7.widget.RecyclerView.ViewHolder) (obj))))
	//*  15   34:aload_0         
	//*  16   35:getfield        #13  <Field ItemTouchHelper this$0>
	//*  17   38:getfield        #39  <Field ItemTouchHelper$Callback ItemTouchHelper.mCallback>
	//*  18   41:aload_0         
	//*  19   42:getfield        #13  <Field ItemTouchHelper this$0>
	//*  20   45:getfield        #29  <Field RecyclerView ItemTouchHelper.mRecyclerView>
	//*  21   48:aload           5
	//*  22   50:invokevirtual   #45  <Method boolean ItemTouchHelper$Callback.hasDragFlag(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//*  23   53:ifne            57
					return;
	//   24   56:return          
				if(motionevent.getPointerId(0) == mActivePointerId)
	//*  25   57:aload_1         
	//*  26   58:iconst_0        
	//*  27   59:invokevirtual   #51  <Method int MotionEvent.getPointerId(int)>
	//*  28   62:aload_0         
	//*  29   63:getfield        #13  <Field ItemTouchHelper this$0>
	//*  30   66:getfield        #55  <Field int ItemTouchHelper.mActivePointerId>
	//*  31   69:icmpne          156
				{
					int i = motionevent.findPointerIndex(mActivePointerId);
	//   32   72:aload_1         
	//   33   73:aload_0         
	//   34   74:getfield        #13  <Field ItemTouchHelper this$0>
	//   35   77:getfield        #55  <Field int ItemTouchHelper.mActivePointerId>
	//   36   80:invokevirtual   #58  <Method int MotionEvent.findPointerIndex(int)>
	//   37   83:istore          4
					float f = motionevent.getX(i);
	//   38   85:aload_1         
	//   39   86:iload           4
	//   40   88:invokevirtual   #62  <Method float MotionEvent.getX(int)>
	//   41   91:fstore_2        
					float f1 = motionevent.getY(i);
	//   42   92:aload_1         
	//   43   93:iload           4
	//   44   95:invokevirtual   #65  <Method float MotionEvent.getY(int)>
	//   45   98:fstore_3        
					mInitialTouchX = f;
	//   46   99:aload_0         
	//   47  100:getfield        #13  <Field ItemTouchHelper this$0>
	//   48  103:fload_2         
	//   49  104:putfield        #69  <Field float ItemTouchHelper.mInitialTouchX>
					mInitialTouchY = f1;
	//   50  107:aload_0         
	//   51  108:getfield        #13  <Field ItemTouchHelper this$0>
	//   52  111:fload_3         
	//   53  112:putfield        #72  <Field float ItemTouchHelper.mInitialTouchY>
					motionevent = ((MotionEvent) (ItemTouchHelper.this));
	//   54  115:aload_0         
	//   55  116:getfield        #13  <Field ItemTouchHelper this$0>
	//   56  119:astore_1        
					mDy = 0.0F;
	//   57  120:aload_0         
	//   58  121:getfield        #13  <Field ItemTouchHelper this$0>
	//   59  124:fconst_0        
	//   60  125:putfield        #75  <Field float ItemTouchHelper.mDy>
					motionevent.mDx = 0.0F;
	//   61  128:aload_1         
	//   62  129:fconst_0        
	//   63  130:putfield        #78  <Field float ItemTouchHelper.mDx>
					if(mCallback.isLongPressDragEnabled())
	//*  64  133:aload_0         
	//*  65  134:getfield        #13  <Field ItemTouchHelper this$0>
	//*  66  137:getfield        #39  <Field ItemTouchHelper$Callback ItemTouchHelper.mCallback>
	//*  67  140:invokevirtual   #82  <Method boolean ItemTouchHelper$Callback.isLongPressDragEnabled()>
	//*  68  143:ifeq            156
						select(((android.support.v7.widget.RecyclerView.ViewHolder) (obj)), 2);
	//   69  146:aload_0         
	//   70  147:getfield        #13  <Field ItemTouchHelper this$0>
	//   71  150:aload           5
	//   72  152:iconst_2        
	//   73  153:invokevirtual   #86  <Method void ItemTouchHelper.select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
				}
			}
		}
	//   74  156:return          
	}

	final ItemTouchHelper this$0;

	ItemTouchHelper$ItemTouchHelperGestureListener()
	{
		this$0 = ItemTouchHelper.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field ItemTouchHelper this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void android.view.GestureDetector$SimpleOnGestureListener()>
	//    5    9:return          
	}
}
