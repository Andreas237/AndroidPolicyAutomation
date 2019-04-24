// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v13.view;

import android.graphics.Point;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.View;

public class DragStartHelper
{
	public static interface OnDragStartListener
	{

		public abstract boolean onDragStart(View view, DragStartHelper dragstarthelper);
	}


	public DragStartHelper(View view, OnDragStartListener ondragstartlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #6   <Class DragStartHelper$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #32  <Method void DragStartHelper$1(DragStartHelper)>
	//    7   13:putfield        #34  <Field android.view.View$OnLongClickListener mLongClickListener>
	//    8   16:aload_0         
	//    9   17:new             #8   <Class DragStartHelper$2>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #35  <Method void DragStartHelper$2(DragStartHelper)>
	//   13   25:putfield        #37  <Field android.view.View$OnTouchListener mTouchListener>
		mView = view;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:putfield        #39  <Field View mView>
		mListener = ondragstartlistener;
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:putfield        #41  <Field DragStartHelper$OnDragStartListener mListener>
	//   20   38:return          
	}

	public void attach()
	{
		mView.setOnLongClickListener(mLongClickListener);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field View mView>
	//    2    4:aload_0         
	//    3    5:getfield        #34  <Field android.view.View$OnLongClickListener mLongClickListener>
	//    4    8:invokevirtual   #49  <Method void View.setOnLongClickListener(android.view.View$OnLongClickListener)>
		mView.setOnTouchListener(mTouchListener);
	//    5   11:aload_0         
	//    6   12:getfield        #39  <Field View mView>
	//    7   15:aload_0         
	//    8   16:getfield        #37  <Field android.view.View$OnTouchListener mTouchListener>
	//    9   19:invokevirtual   #53  <Method void View.setOnTouchListener(android.view.View$OnTouchListener)>
	//   10   22:return          
	}

	public void detach()
	{
		mView.setOnLongClickListener(((android.view.View.OnLongClickListener) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field View mView>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #49  <Method void View.setOnLongClickListener(android.view.View$OnLongClickListener)>
		mView.setOnTouchListener(((android.view.View.OnTouchListener) (null)));
	//    4    8:aload_0         
	//    5    9:getfield        #39  <Field View mView>
	//    6   12:aconst_null     
	//    7   13:invokevirtual   #53  <Method void View.setOnTouchListener(android.view.View$OnTouchListener)>
	//    8   16:return          
	}

	public void getTouchPosition(Point point)
	{
		point.set(mLastTouchX, mLastTouchY);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #58  <Field int mLastTouchX>
	//    3    5:aload_0         
	//    4    6:getfield        #60  <Field int mLastTouchY>
	//    5    9:invokevirtual   #66  <Method void Point.set(int, int)>
	//    6   12:return          
	}

	public boolean onLongClick(View view)
	{
		return mListener.onDragStart(view, this);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field DragStartHelper$OnDragStartListener mListener>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokeinterface #72  <Method boolean DragStartHelper$OnDragStartListener.onDragStart(View, DragStartHelper)>
	//    5   11:ireturn         
	}

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		int i = (int)motionevent.getX();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #80  <Method float MotionEvent.getX()>
	//    2    4:f2i             
	//    3    5:istore_3        
		int j = (int)motionevent.getY();
	//    4    6:aload_2         
	//    5    7:invokevirtual   #83  <Method float MotionEvent.getY()>
	//    6   10:f2i             
	//    7   11:istore          4
		switch(motionevent.getAction())
	//*   8   13:aload_2         
	//*   9   14:invokevirtual   #87  <Method int MotionEvent.getAction()>
		{
	//*  10   17:tableswitch     0 3: default 48
	//	               0 137
	//	               1 130
	//	               2 50
	//	               3 130
		default:
			return false;
	//   11   48:iconst_0        
	//   12   49:ireturn         

		case 2: // '\002'
			if(MotionEventCompat.isFromSource(motionevent, 8194))
	//*  13   50:aload_2         
	//*  14   51:sipush          8194
	//*  15   54:invokestatic    #93  <Method boolean MotionEventCompat.isFromSource(MotionEvent, int)>
	//*  16   57:ifeq            148
			{
				if((motionevent.getButtonState() & 1) == 0)
	//*  17   60:aload_2         
	//*  18   61:invokevirtual   #96  <Method int MotionEvent.getButtonState()>
	//*  19   64:iconst_1        
	//*  20   65:iand            
	//*  21   66:ifne            71
					return false;
	//   22   69:iconst_0        
	//   23   70:ireturn         
				if(mDragging)
	//*  24   71:aload_0         
	//*  25   72:getfield        #98  <Field boolean mDragging>
	//*  26   75:ifeq            80
					return false;
	//   27   78:iconst_0        
	//   28   79:ireturn         
				if(mLastTouchX == i && mLastTouchY == j)
	//*  29   80:aload_0         
	//*  30   81:getfield        #58  <Field int mLastTouchX>
	//*  31   84:iload_3         
	//*  32   85:icmpne          99
	//*  33   88:aload_0         
	//*  34   89:getfield        #60  <Field int mLastTouchY>
	//*  35   92:iload           4
	//*  36   94:icmpne          99
				{
					return false;
	//   37   97:iconst_0        
	//   38   98:ireturn         
				} else
				{
					mLastTouchX = i;
	//   39   99:aload_0         
	//   40  100:iload_3         
	//   41  101:putfield        #58  <Field int mLastTouchX>
					mLastTouchY = j;
	//   42  104:aload_0         
	//   43  105:iload           4
	//   44  107:putfield        #60  <Field int mLastTouchY>
					mDragging = mListener.onDragStart(view, this);
	//   45  110:aload_0         
	//   46  111:aload_0         
	//   47  112:getfield        #41  <Field DragStartHelper$OnDragStartListener mListener>
	//   48  115:aload_1         
	//   49  116:aload_0         
	//   50  117:invokeinterface #72  <Method boolean DragStartHelper$OnDragStartListener.onDragStart(View, DragStartHelper)>
	//   51  122:putfield        #98  <Field boolean mDragging>
					return mDragging;
	//   52  125:aload_0         
	//   53  126:getfield        #98  <Field boolean mDragging>
	//   54  129:ireturn         
				}
			}
			break;

		case 1: // '\001'
		case 3: // '\003'
			mDragging = false;
	//   55  130:aload_0         
	//   56  131:iconst_0        
	//   57  132:putfield        #98  <Field boolean mDragging>
			return false;
	//   58  135:iconst_0        
	//   59  136:ireturn         

		case 0: // '\0'
			mLastTouchX = i;
	//   60  137:aload_0         
	//   61  138:iload_3         
	//   62  139:putfield        #58  <Field int mLastTouchX>
			mLastTouchY = j;
	//   63  142:aload_0         
	//   64  143:iload           4
	//   65  145:putfield        #60  <Field int mLastTouchY>
			break;
		}
		return false;
	//   66  148:iconst_0        
	//   67  149:ireturn         
	}

	private boolean mDragging;
	private int mLastTouchX;
	private int mLastTouchY;
	private final OnDragStartListener mListener;
	private final android.view.View.OnLongClickListener mLongClickListener = new android.view.View.OnLongClickListener() {

		public boolean onLongClick(View view1)
		{
			return DragStartHelper.this.onLongClick(view1);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field DragStartHelper this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #22  <Method boolean DragStartHelper.onLongClick(View)>
		//    4    8:ireturn         
		}

		final DragStartHelper this$0;

			
			{
				this$0 = DragStartHelper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field DragStartHelper this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private final android.view.View.OnTouchListener mTouchListener = new android.view.View.OnTouchListener() {

		public boolean onTouch(View view1, MotionEvent motionevent)
		{
			return DragStartHelper.this.onTouch(view1, motionevent);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field DragStartHelper this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #22  <Method boolean DragStartHelper.onTouch(View, MotionEvent)>
		//    5    9:ireturn         
		}

		final DragStartHelper this$0;

			
			{
				this$0 = DragStartHelper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field DragStartHelper this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private final View mView;
}
